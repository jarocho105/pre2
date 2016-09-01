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
import com.bydan.erp.cartera.util.ClienteCoaConstantesFunciones;

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
public class ClienteCoaJInternalFrame extends ClienteCoaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarClienteCoa;
	
	protected JMenuBar jmenuBarClienteCoa;
	
	protected JMenu jmenuClienteCoa;
	protected JMenu jmenuDatosClienteCoa;
	protected JMenu jmenuArchivoClienteCoa;
	protected JMenu jmenuAccionesClienteCoa;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosClienteCoa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutClienteCoa;	
	protected GridBagConstraints gridBagConstraintsClienteCoa;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ClienteCoaDetalleFormJInternalFrame jInternalFrameDetalleFormClienteCoa;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoClienteCoa;	
	protected ImportacionJInternalFrame jInternalFrameImportacionClienteCoa;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_usuario="";
	
	public ClienteCoaSessionBean clientecoaSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public UsuarioSessionBean usuarioSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ClienteCoa> clientecoas;		
	public List<ClienteCoa> clientecoasEliminados;	
	public List<ClienteCoa> clientecoasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByClienteCoa;		
	protected JButton jButtonAbrirOrderByClienteCoa;
	
	
	//protected JPanel jPanelOrderByClienteCoa;
	//public JScrollPane jScrollPanelOrderByClienteCoa;	
	//protected JButton jButtonCerrarOrderByClienteCoa;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ClienteCoaLogic clientecoaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosClienteCoa;
	public JScrollPane jScrollPanelDatosEdicionClienteCoa;
	public JScrollPane jScrollPanelDatosGeneralClienteCoa;
    
	
	
	//public JScrollPane jScrollPanelDatosClienteCoaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoClienteCoa;
	//public JScrollPane jScrollPanelImportacionClienteCoa;
	
	
	
	protected JPanel jPanelAccionesClienteCoa;
	
    protected JPanel jPanelPaginacionClienteCoa;
    protected JPanel jPanelParametrosReportesClienteCoa;
	protected JPanel jPanelParametrosReportesAccionesClienteCoa;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ClienteCoa;
	protected JPanel jPanelParametrosAuxiliar2ClienteCoa;
	protected JPanel jPanelParametrosAuxiliar3ClienteCoa;
	protected JPanel jPanelParametrosAuxiliar4ClienteCoa;
	//protected JPanel jPanelParametrosAuxiliar5ClienteCoa;
	
	
	
	//protected JPanel jPanelReporteDinamicoClienteCoa;
	//protected JPanel jPanelImportacionClienteCoa;
	
	
	public JTable jTableDatosClienteCoa;
	
	
	
	//public JTable jTableDatosClienteCoaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoClienteCoa;
	protected JButton jButtonDuplicarClienteCoa;
	protected JButton jButtonCopiarClienteCoa;
	protected JButton jButtonVerFormClienteCoa;
	protected JButton jButtonNuevoRelacionesClienteCoa;
	protected JButton jButtonModificarClienteCoa;
	
    protected JButton jButtonGuardarCambiosTablaClienteCoa;
	protected JButton jButtonCerrarClienteCoa;
	
	
	protected JButton jButtonRecargarInformacionClienteCoa;
	protected JButton jButtonProcesarInformacionClienteCoa;
	
	
	protected JButton jButtonAnterioresClienteCoa;
	protected JButton jButtonSiguientesClienteCoa;
	protected JButton jButtonNuevoGuardarCambiosClienteCoa;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoClienteCoa;
	//protected JButton jButtonCerrarReporteDinamicoClienteCoa;
	//protected JButton jButtonGenerarExcelReporteDinamicoClienteCoa;	
	
	
	
	//protected JButton jButtonAbrirImportacionClienteCoa;
	//protected JButton jButtonGenerarImportacionClienteCoa;
	//protected JButton jButtonCerrarImportacionClienteCoa;
	//protected JFileChooser jFileChooserImportacionClienteCoa;
	//protected File fileImportacionClienteCoa;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarClienteCoa;
	protected JButton jButtonDuplicarToolBarClienteCoa;
	protected JButton jButtonNuevoRelacionesToolBarClienteCoa;
	
	
	public JButton jButtonGuardarCambiosToolBarClienteCoa;
	protected JButton jButtonCopiarToolBarClienteCoa;
	protected JButton jButtonVerFormToolBarClienteCoa;
	public JButton jButtonGuardarCambiosTablaToolBarClienteCoa;
	protected JButton jButtonMostrarOcultarTablaToolBarClienteCoa;
	protected JButton jButtonCerrarToolBarClienteCoa;
	
	protected JButton jButtonRecargarInformacionToolBarClienteCoa;
	protected JButton jButtonProcesarInformacionToolBarClienteCoa;
	protected JButton jButtonAnterioresToolBarClienteCoa;
	protected JButton jButtonSiguientesToolBarClienteCoa;
	protected JButton jButtonNuevoGuardarCambiosToolBarClienteCoa;
	protected JButton jButtonAbrirOrderByToolBarClienteCoa;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoClienteCoa;
	protected JMenuItem jMenuItemDuplicarClienteCoa;
	protected JMenuItem jMenuItemNuevoRelacionesClienteCoa;
	
	
	protected JMenuItem jMenuItemGuardarCambiosClienteCoa;
	protected JMenuItem jMenuItemCopiarClienteCoa;
	protected JMenuItem jMenuItemVerFormClienteCoa;
	protected JMenuItem jMenuItemGuardarCambiosTablaClienteCoa;
	protected JMenuItem jMenuItemCerrarClienteCoa;
	protected JMenuItem jMenuItemDetalleCerrarClienteCoa;
	protected JMenuItem jMenuItemDetalleAbrirOrderByClienteCoa;
	protected JMenuItem jMenuItemDetalleMostarOcultarClienteCoa;
	
	protected JMenuItem jMenuItemRecargarInformacionClienteCoa;
	protected JMenuItem jMenuItemProcesarInformacionClienteCoa;
	protected JMenuItem jMenuItemAnterioresClienteCoa;
	protected JMenuItem jMenuItemSiguientesClienteCoa;
	protected JMenuItem jMenuItemNuevoGuardarCambiosClienteCoa;
	protected JMenuItem jMenuItemAbrirOrderByClienteCoa;
	protected JMenuItem jMenuItemMostrarOcultarClienteCoa;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesClienteCoa;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosClienteCoa;
	protected JCheckBox jCheckBoxSeleccionadosClienteCoa;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaClienteCoa;
	protected JCheckBox jCheckBoxConGraficoReporteClienteCoa;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesClienteCoa;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesClienteCoa;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoClienteCoa;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoClienteCoa;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesClienteCoa;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionClienteCoa;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesClienteCoa;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesClienteCoa;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarClienteCoa;
	protected JTextField jTextFieldValorCampoGeneralClienteCoa;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteClienteCoa;
	//public JList<Reporte> jListColumnasSelectReporteClienteCoa;
	//public JScrollPane jScrollColumnasSelectReporteClienteCoa;
	
	//public JLabel jLabelRelacionesSelectReporteClienteCoa;
	//public JList<Reporte> jListRelacionesSelectReporteClienteCoa;
	//public JScrollPane jScrollRelacionesSelectReporteClienteCoa;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoClienteCoa;
	//protected JCheckBox jCheckBoxConGraficoDinamicoClienteCoa;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoClienteCoa;
	//public JLabel jLabelTiposArchivoReporteDinamicoClienteCoa;
	
		
	//public JLabel jLabelArchivoImportacionClienteCoa;	
	//public JLabel jLabelPathArchivoImportacionClienteCoa;
	//protected JTextField jTextFieldPathArchivoImportacionClienteCoa;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoClienteCoa;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoClienteCoa;
	
	//public JLabel jLabelColumnaCategoriaValorClienteCoa;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorClienteCoa;
	
	//public JLabel jLabelColumnasValoresGraficoClienteCoa;
	//public JList<Reporte> jListColumnasValoresGraficoClienteCoa;
	//public JScrollPane jScrollColumnasValoresGraficoClienteCoa;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoClienteCoa;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoClienteCoa;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasClienteCoa;
	public JPanel jPanelFK_IdClienteClienteCoa;
	public JButton jButtonFK_IdClienteClienteCoa;
	
	public JPanel jPanelid_clienteFK_IdClienteClienteCoa;
	public JLabel jLabelid_clienteFK_IdClienteClienteCoa;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteFK_IdClienteClienteCoa;
	public JButton jButtonid_clienteFK_IdClienteClienteCoa= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteClienteCoaUpdate= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteClienteCoaBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdClienteid_clienteClienteCoa;
	
	
	
	
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
	//public int iHeightFormulario=902;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public ClienteCoaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ClienteCoa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ClienteCoaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ClienteCoa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ClienteCoaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ClienteCoa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ClienteCoaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ClienteCoa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionClienteCoa)	{
		this.jButtonRecargarInformacionClienteCoa = jButtonRecargarInformacionClienteCoa;
	}
	
	public JButton getjButtonProcesarInformacionClienteCoa() {
		return this.jButtonProcesarInformacionClienteCoa;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionClienteCoa)	{
		this.jButtonProcesarInformacionClienteCoa = jButtonProcesarInformacionClienteCoa;
	}
	
	
	public JButton getjButtonRecargarInformacionClienteCoa() {
		return this.jButtonRecargarInformacionClienteCoa;
	}
	
	
	public List<ClienteCoa> getclientecoas() {
		return this.clientecoas;
	}

	public void setclientecoas(List<ClienteCoa> clientecoas) {
		this.clientecoas = clientecoas;
	}
	
	public List<ClienteCoa> getclientecoasAux() {
		return this.clientecoasAux;
	}

	public void setclientecoasAux(List<ClienteCoa> clientecoasAux) {
		this.clientecoasAux = clientecoasAux;
	}
	
	public List<ClienteCoa> getclientecoasEliminados() {
		return this.clientecoasEliminados;
	}

	public void setClienteCoasEliminados(List<ClienteCoa> clientecoasEliminados) {
		this.clientecoasEliminados = clientecoasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarClienteCoa() {
		return jComboBoxTiposSeleccionarClienteCoa;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarClienteCoa(
			JComboBox jComboBoxTiposSeleccionarClienteCoa) {
		this.jComboBoxTiposSeleccionarClienteCoa = jComboBoxTiposSeleccionarClienteCoa;
	}
	
	public void setBorderResaltarTiposSeleccionarClienteCoa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarClienteCoa.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarClienteCoa .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralClienteCoa() {
		return jTextFieldValorCampoGeneralClienteCoa;
	}

	public void setjTextFieldValorCampoGeneralClienteCoa(
			JTextField jTextFieldValorCampoGeneralClienteCoa) {
		this.jTextFieldValorCampoGeneralClienteCoa = jTextFieldValorCampoGeneralClienteCoa;
	}

	public void setBorderResaltarValorCampoGeneralClienteCoa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarClienteCoa.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralClienteCoa .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosClienteCoa() {
		return this.jCheckBoxSeleccionarTodosClienteCoa;
	}

	public void setjCheckBoxSeleccionarTodosClienteCoa(
			JCheckBox jCheckBoxSeleccionarTodosClienteCoa) {
		this.jCheckBoxSeleccionarTodosClienteCoa = jCheckBoxSeleccionarTodosClienteCoa;
	}

	public void setBorderResaltarSeleccionarTodosClienteCoa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarClienteCoa.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosClienteCoa .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosClienteCoa() {
		return this.jCheckBoxSeleccionadosClienteCoa;
	}

	public void setjCheckBoxSeleccionadosClienteCoa(
			JCheckBox jCheckBoxSeleccionadosClienteCoa) {
		this.jCheckBoxSeleccionadosClienteCoa = jCheckBoxSeleccionadosClienteCoa;
	}
	
	public void setBorderResaltarSeleccionadosClienteCoa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarClienteCoa.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosClienteCoa .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesClienteCoa() {
		return this.jComboBoxTiposArchivosReportesClienteCoa;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesClienteCoa(
			JComboBox jComboBoxTiposArchivosReportesClienteCoa) {
		this.jComboBoxTiposArchivosReportesClienteCoa = jComboBoxTiposArchivosReportesClienteCoa;
	}

	public void setBorderResaltarTiposArchivosReportesClienteCoa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarClienteCoa.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesClienteCoa .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesClienteCoa() {
		return this.jComboBoxTiposReportesClienteCoa;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesClienteCoa(
			JComboBox jComboBoxTiposReportesClienteCoa) {
		this.jComboBoxTiposReportesClienteCoa = jComboBoxTiposReportesClienteCoa;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoClienteCoa() {
	//	return jComboBoxTiposReportesDinamicoClienteCoa;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoClienteCoa(
	//		JComboBox jComboBoxTiposReportesDinamicoClienteCoa) {
	//	this.jComboBoxTiposReportesDinamicoClienteCoa = jComboBoxTiposReportesDinamicoClienteCoa;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoClienteCoa() {
	//	return jComboBoxTiposArchivosReportesDinamicoClienteCoa;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoClienteCoa(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoClienteCoa) {
	//	this.jComboBoxTiposArchivosReportesDinamicoClienteCoa = jComboBoxTiposArchivosReportesDinamicoClienteCoa;
	//}
	
	public void setBorderResaltarTiposReportesClienteCoa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarClienteCoa.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesClienteCoa .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesClienteCoa() {
		return this.jComboBoxTiposGraficosReportesClienteCoa;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesClienteCoa(
			JComboBox jComboBoxTiposGraficosReportesClienteCoa) {
		this.jComboBoxTiposGraficosReportesClienteCoa = jComboBoxTiposGraficosReportesClienteCoa;
	}
	
	public void setBorderResaltarTiposGraficosReportesClienteCoa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarClienteCoa.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesClienteCoa .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionClienteCoa() {
		return this.jComboBoxTiposPaginacionClienteCoa;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionClienteCoa(
			JComboBox jComboBoxTiposPaginacionClienteCoa) {
		this.jComboBoxTiposPaginacionClienteCoa = jComboBoxTiposPaginacionClienteCoa;
	}
	
	public void setBorderResaltarTiposPaginacionClienteCoa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarClienteCoa.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionClienteCoa .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesClienteCoa() {
		return this.jComboBoxTiposRelacionesClienteCoa;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesClienteCoa() {
		return this.jComboBoxTiposAccionesClienteCoa;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesClienteCoa(
			JComboBox jComboBoxTiposRelacionesClienteCoa) {
		this.jComboBoxTiposRelacionesClienteCoa = jComboBoxTiposRelacionesClienteCoa;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesClienteCoa(
			JComboBox jComboBoxTiposAccionesClienteCoa) {
		this.jComboBoxTiposAccionesClienteCoa = jComboBoxTiposAccionesClienteCoa;
	}
	
	public void setBorderResaltarTiposRelacionesClienteCoa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarClienteCoa.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesClienteCoa .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesClienteCoa() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarClienteCoa.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesClienteCoa .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoClienteCoa() {
	//	return jCheckBoxConGraficoDinamicoClienteCoa;
	//}

	//public void setjCheckBoxConGraficoDinamicoClienteCoa(
	//		JCheckBox jCheckBoxConGraficoDinamicoClienteCoa) {
	//	this.jCheckBoxConGraficoDinamicoClienteCoa = jCheckBoxConGraficoDinamicoClienteCoa;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoClienteCoa() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarClienteCoa.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoClienteCoa .setBorder(borderResaltar);		
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
		this.clientecoaSessionBean=new ClienteCoaSessionBean();
		
		this.clientecoaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.clientecoaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.clientecoaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ClienteCoaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ClienteCoaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ClienteCoaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ClienteCoaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ClienteCoaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Coa MANTENIMIENTO"));
		
		
		if(iWidth > 950) {
			iWidth=950;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.clientecoaSessionBean.getEsGuardarRelacionado()) {
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
		
		ClienteCoaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ClienteCoa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarClienteCoa= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarClienteCoa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarClienteCoa,this.jTtoolBarClienteCoa,
							"nuevo","nuevo","Nuevo"+" "+ClienteCoaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarClienteCoa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarClienteCoa,this.jTtoolBarClienteCoa,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarClienteCoa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarClienteCoa,this.jTtoolBarClienteCoa,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ClienteCoaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarClienteCoa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarClienteCoa,this.jTtoolBarClienteCoa,
							"duplicar","duplicar","Duplicar"+" "+ClienteCoaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarClienteCoa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarClienteCoa,this.jTtoolBarClienteCoa,
							"copiar","copiar","Copiar"+" "+ClienteCoaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarClienteCoa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarClienteCoa,this.jTtoolBarClienteCoa,
							"ver_form","ver_form","Ver"+" "+ClienteCoaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarClienteCoa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarClienteCoa,this.jTtoolBarClienteCoa,
							"recargar","recargar","Recargar"+" "+ClienteCoaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarClienteCoa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarClienteCoa,this.jTtoolBarClienteCoa,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarClienteCoa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarClienteCoa,this.jTtoolBarClienteCoa,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarClienteCoa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarClienteCoa,this.jTtoolBarClienteCoa,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarClienteCoa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarClienteCoa,this.jTtoolBarClienteCoa,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarClienteCoa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarClienteCoa,this.jTtoolBarClienteCoa,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ClienteCoaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarClienteCoa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarClienteCoa,this.jTtoolBarClienteCoa,
							"cerrar","cerrar","Salir"+" "+ClienteCoaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarClienteCoa=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarClienteCoa;
			
				this.jButtonProcesarInformacionToolBarClienteCoa=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarClienteCoa;
				
		//protected JButton jButtonModificarToolBarClienteCoa;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarClienteCoa=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuClienteCoa=new JMenuMe("General");
		this.jmenuArchivoClienteCoa=new JMenuMe("Archivo");
		this.jmenuAccionesClienteCoa=new JMenuMe("Acciones");
		this.jmenuDatosClienteCoa=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoClienteCoa= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoClienteCoa.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoClienteCoa,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoClienteCoa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarClienteCoa= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarClienteCoa.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarClienteCoa,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarClienteCoa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesClienteCoa= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesClienteCoa.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesClienteCoa,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesClienteCoa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosClienteCoa= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosClienteCoa.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosClienteCoa,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosClienteCoa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarClienteCoa= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarClienteCoa.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarClienteCoa,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarClienteCoa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormClienteCoa= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormClienteCoa.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormClienteCoa,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormClienteCoa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaClienteCoa= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaClienteCoa.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaClienteCoa,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaClienteCoa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarClienteCoa= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarClienteCoa.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarClienteCoa,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarClienteCoa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionClienteCoa= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionClienteCoa.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionClienteCoa,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionClienteCoa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionClienteCoa= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionClienteCoa.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionClienteCoa,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresClienteCoa= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresClienteCoa.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresClienteCoa,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresClienteCoa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesClienteCoa= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesClienteCoa.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesClienteCoa,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesClienteCoa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByClienteCoa= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByClienteCoa.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByClienteCoa,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByClienteCoa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarClienteCoa= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarClienteCoa.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarClienteCoa,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarClienteCoa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByClienteCoa= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByClienteCoa.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByClienteCoa,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByClienteCoa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarClienteCoa= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarClienteCoa.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarClienteCoa,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarClienteCoa, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosClienteCoa= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosClienteCoa.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosClienteCoa,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosClienteCoa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoClienteCoa.add(this.jMenuItemCerrarClienteCoa);
			
			this.jmenuAccionesClienteCoa.add(this.jMenuItemNuevoClienteCoa);
			this.jmenuAccionesClienteCoa.add(this.jMenuItemNuevoGuardarCambiosClienteCoa);
			this.jmenuAccionesClienteCoa.add(this.jMenuItemNuevoRelacionesClienteCoa);
			this.jmenuAccionesClienteCoa.add(this.jMenuItemGuardarCambiosTablaClienteCoa);		
			this.jmenuAccionesClienteCoa.add(this.jMenuItemDuplicarClienteCoa);		
			this.jmenuAccionesClienteCoa.add(this.jMenuItemCopiarClienteCoa);		
			this.jmenuAccionesClienteCoa.add(this.jMenuItemVerFormClienteCoa);		
			
			this.jmenuDatosClienteCoa.add(this.jMenuItemRecargarInformacionClienteCoa);				
			this.jmenuDatosClienteCoa.add(this.jMenuItemAnterioresClienteCoa);				
			this.jmenuDatosClienteCoa.add(this.jMenuItemSiguientesClienteCoa);				
			this.jmenuDatosClienteCoa.add(this.jMenuItemAbrirOrderByClienteCoa);				
			this.jmenuDatosClienteCoa.add(this.jMenuItemMostrarOcultarClienteCoa);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesClienteCoa.add(this.jMenuItemGuardarCambiosClienteCoa);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoClienteCoa, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesClienteCoa, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosClienteCoa, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarClienteCoa.add(this.jmenuArchivoClienteCoa);		
			this.jmenuBarClienteCoa.add(this.jmenuAccionesClienteCoa);		
			this.jmenuBarClienteCoa.add(this.jmenuDatosClienteCoa);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarClienteCoa);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasClienteCoa() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdClienteClienteCoa=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdClienteClienteCoa.setToolTipText("Buscar Por Cliente ");
		this.jButtonFK_IdClienteClienteCoa= new JButtonMe();
		this.jButtonFK_IdClienteClienteCoa.setText("Buscar");
		this.jButtonFK_IdClienteClienteCoa.setToolTipText("Buscar Por Cliente ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdClienteClienteCoa,"buscar_button","Buscar Por Cliente ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdClienteClienteCoa, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_clienteFK_IdClienteClienteCoa = new JLabelMe();
		jLabelid_clienteFK_IdClienteClienteCoa.setText("Cliente :");
		jLabelid_clienteFK_IdClienteClienteCoa.setToolTipText("Cliente");
		jLabelid_clienteFK_IdClienteClienteCoa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteClienteCoa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteClienteCoa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_clienteFK_IdClienteClienteCoa,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_clienteFK_IdClienteClienteCoa= new JComboBoxMe();
		jComboBoxid_clienteFK_IdClienteClienteCoa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteClienteCoa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteClienteCoa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteFK_IdClienteClienteCoa,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdClienteid_clienteClienteCoa= new JButtonMe();
		this.jButtonBuscarFK_IdClienteid_clienteClienteCoa.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteClienteCoa.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteClienteCoa.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdClienteid_clienteClienteCoa.setText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteClienteCoa.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteClienteCoa.setFocusable(false);


		this.jTabbedPaneBusquedasClienteCoa=new JTabbedPane();


		this.jTabbedPaneBusquedasClienteCoa.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasClienteCoa.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));
		this.jTabbedPaneBusquedasClienteCoa.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,0)));

		//this.jTabbedPaneBusquedasClienteCoa.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasClienteCoa.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasClienteCoa,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleClienteCoa = new ClienteCoaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Coa DATOS");
			this.jInternalFrameDetalleFormClienteCoa = new ClienteCoaDetalleFormJInternalFrame(jDesktopPane,this.clientecoaSessionBean.getConGuardarRelaciones(),this.clientecoaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormClienteCoa = null;//new ClienteCoaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutClienteCoa= new GridBagLayout();
		
		
		this.jTableDatosClienteCoa = new JTableMe();      
		
		String sToolTipClienteCoa="";
		sToolTipClienteCoa=ClienteCoaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipClienteCoa+="(Cartera.ClienteCoa)";
		}
		
		if(!this.clientecoaSessionBean.getEsGuardarRelacionado()) {
			sToolTipClienteCoa+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosClienteCoa.setToolTipText(sToolTipClienteCoa);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosClienteCoa);
		this.jTableDatosClienteCoa.setAutoCreateRowSorter(true);
		this.jTableDatosClienteCoa.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosClienteCoa.setRowSelectionAllowed(true);
		this.jTableDatosClienteCoa.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosClienteCoa,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoClienteCoa = new JButtonMe();
		this.jButtonDuplicarClienteCoa = new JButtonMe();
		this.jButtonCopiarClienteCoa = new JButtonMe();
		this.jButtonVerFormClienteCoa = new JButtonMe();
		this.jButtonNuevoRelacionesClienteCoa = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaClienteCoa = new JButtonMe();
		this.jButtonCerrarClienteCoa = new JButtonMe();
		
		this.jScrollPanelDatosClienteCoa = new JScrollPane();   
        this.jScrollPanelDatosGeneralClienteCoa = new JScrollPane();
		
				
		
		
		this.jPanelAccionesClienteCoa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Coa";
		
		if(!this.clientecoaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosClienteCoa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Coas" + this.sPath));
		} else {
			this.jScrollPanelDatosClienteCoa.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralClienteCoa.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesClienteCoa.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesClienteCoa.setToolTipText("Acciones");
        this.jPanelAccionesClienteCoa.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralClienteCoa, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosClienteCoa, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoClienteCoa=new ReporteDinamicoJInternalFrame(ClienteCoaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoClienteCoa();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionClienteCoa=new ImportacionJInternalFrame(ClienteCoaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionClienteCoa();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByClienteCoa = new JButtonMe();
		
		this.jButtonAbrirOrderByClienteCoa.setText("Orden");
		this.jButtonAbrirOrderByClienteCoa.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByClienteCoa,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByClienteCoa, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByClienteCoa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByClienteCoa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByClienteCoa=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByClienteCoa,false,this);
			
			//this.cargarOrderByClienteCoa(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByClienteCoa=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByClienteCoa,true,this);
			
			//this.cargarOrderByClienteCoa(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosClienteCoa.setMinimumSize(new Dimension(400,50));//930
		this.jTableDatosClienteCoa.setMaximumSize(new Dimension(400,50));//930
		this.jTableDatosClienteCoa.setPreferredSize(new Dimension(400,50));//930
		
		this.jScrollPanelDatosClienteCoa.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosClienteCoa.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosClienteCoa.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoClienteCoa.setText("Nuevo");
		this.jButtonDuplicarClienteCoa.setText("Duplicar");
		this.jButtonCopiarClienteCoa.setText("Copiar");
		this.jButtonVerFormClienteCoa.setText("Ver");
		this.jButtonNuevoRelacionesClienteCoa.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaClienteCoa.setText("Guardar");
		this.jButtonCerrarClienteCoa.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoClienteCoa,"nuevo_button","Nuevo",this.clientecoaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarClienteCoa,"duplicar_button","Duplicar",this.clientecoaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarClienteCoa,"copiar_button","Copiar",this.clientecoaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormClienteCoa,"ver_form","Ver",this.clientecoaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesClienteCoa,"nuevorelaciones_button","Nuevo Rel",this.clientecoaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaClienteCoa,"guardarcambiostabla_button","Guardar",this.clientecoaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarClienteCoa,"cerrar_button","Salir",this.clientecoaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoClienteCoa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarClienteCoa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarClienteCoa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormClienteCoa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesClienteCoa, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaClienteCoa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarClienteCoa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoClienteCoa.setToolTipText("Nuevo"+" "+ClienteCoaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarClienteCoa.setToolTipText("Duplicar"+" "+ClienteCoaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarClienteCoa.setToolTipText("Copiar"+" "+ClienteCoaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormClienteCoa.setToolTipText("Ver"+" "+ClienteCoaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesClienteCoa.setToolTipText("Nuevo Rel"+" "+ClienteCoaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaClienteCoa.setToolTipText("Guardar"+" "+ClienteCoaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarClienteCoa.setToolTipText("Salir"+" "+ClienteCoaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoClienteCoa";
		inputMap = this.jButtonNuevoClienteCoa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoClienteCoa.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoClienteCoa"));
		
		//DUPLICAR
		sMapKey = "DuplicarClienteCoa";
		inputMap = this.jButtonDuplicarClienteCoa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarClienteCoa.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarClienteCoa"));
		
		//COPIAR
		sMapKey = "CopiarClienteCoa";
		inputMap = this.jButtonCopiarClienteCoa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarClienteCoa.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarClienteCoa"));
		
		//VEr FORM
		sMapKey = "VerFormClienteCoa";
		inputMap = this.jButtonVerFormClienteCoa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormClienteCoa.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormClienteCoa"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesClienteCoa";
		inputMap = this.jButtonNuevoRelacionesClienteCoa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesClienteCoa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesClienteCoa"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarClienteCoa";
		inputMap = this.jButtonModificarClienteCoa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarClienteCoa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarClienteCoa"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarClienteCoa";
		inputMap = this.jButtonCerrarClienteCoa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarClienteCoa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarClienteCoa"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaClienteCoa";
		inputMap = this.jButtonGuardarCambiosTablaClienteCoa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaClienteCoa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaClienteCoa"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesClienteCoa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesClienteCoa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionClienteCoa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ClienteCoa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ClienteCoa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ClienteCoa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ClienteCoa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ClienteCoa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesClienteCoa.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesClienteCoa.setName("jPanelParametrosReportesClienteCoa"); 
		
		this.jPanelParametrosReportesAccionesClienteCoa.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesClienteCoa.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesClienteCoa.setName("jPanelParametrosReportesAccionesClienteCoa"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesClienteCoa, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesClienteCoa, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionClienteCoa = new JButtonMe();
		this.jButtonRecargarInformacionClienteCoa.setText("Recargar");
		this.jButtonRecargarInformacionClienteCoa.setToolTipText("Recargar"+" "+ClienteCoaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionClienteCoa,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionClienteCoa = new JButtonMe();
		this.jButtonProcesarInformacionClienteCoa.setText("Procesar");
		this.jButtonProcesarInformacionClienteCoa.setToolTipText("Procesar"+" "+ClienteCoaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionClienteCoa.setVisible(false);
			
		this.jButtonProcesarInformacionClienteCoa.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionClienteCoa.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionClienteCoa.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesClienteCoa = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesClienteCoa.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesClienteCoa.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesClienteCoa = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesClienteCoa.setText("TIPO");       
		this.jComboBoxTiposReportesClienteCoa.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesClienteCoa = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesClienteCoa.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesClienteCoa.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionClienteCoa = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionClienteCoa.setText("Paginacion");
		this.jComboBoxTiposPaginacionClienteCoa.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesClienteCoa = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesClienteCoa.setText("Accion");
		this.jComboBoxTiposRelacionesClienteCoa.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesClienteCoa = new JComboBoxMe();
		//this.jComboBoxTiposAccionesClienteCoa.setText("Accion");
		this.jComboBoxTiposAccionesClienteCoa.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarClienteCoa = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarClienteCoa.setText("Accion");
		this.jComboBoxTiposSeleccionarClienteCoa.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralClienteCoa=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralClienteCoa.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralClienteCoa.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralClienteCoa.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesClienteCoa = new JLabelMe();
		
		this.jLabelAccionesClienteCoa.setText("Acciones");		
		this.jLabelAccionesClienteCoa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesClienteCoa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesClienteCoa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosClienteCoa = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosClienteCoa.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosClienteCoa.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosClienteCoa = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosClienteCoa.setText("Seleccionados");
		this.jCheckBoxSeleccionadosClienteCoa.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaClienteCoa = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaClienteCoa.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaClienteCoa.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteClienteCoa = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteClienteCoa.setText("Graf.");
		this.jCheckBoxConGraficoReporteClienteCoa.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresClienteCoa = new JButtonMe();
		//this.jButtonAnterioresClienteCoa.setText("<<");
        this.jButtonAnterioresClienteCoa.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresClienteCoa,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresClienteCoa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesClienteCoa = new JButtonMe();
		//this.jButtonSiguientesClienteCoa.setText(">>");
        this.jButtonSiguientesClienteCoa.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesClienteCoa,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesClienteCoa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosClienteCoa = new JButtonMe();
		this.jButtonNuevoGuardarCambiosClienteCoa.setText("Nue");
        this.jButtonNuevoGuardarCambiosClienteCoa.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosClienteCoa,"nuevoguardarcambios_button","Nue",this.clientecoaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosClienteCoa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosClienteCoa";
		inputMap = this.jButtonNuevoGuardarCambiosClienteCoa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosClienteCoa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosClienteCoa"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionClienteCoa";
		inputMap = this.jButtonRecargarInformacionClienteCoa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionClienteCoa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionClienteCoa"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesClienteCoa";
		inputMap = this.jButtonSiguientesClienteCoa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesClienteCoa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesClienteCoa"));
		
		//ANTERIORES		
		sMapKey = "AnterioresClienteCoa";
		inputMap = this.jButtonAnterioresClienteCoa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresClienteCoa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresClienteCoa"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasClienteCoa();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesClienteCoa.setMinimumSize(new Dimension(this.getWidth(),ClienteCoaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ClienteCoaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesClienteCoa.setMaximumSize(new Dimension(this.getWidth(),ClienteCoaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ClienteCoaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesClienteCoa.setPreferredSize(new Dimension(this.getWidth(),ClienteCoaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ClienteCoaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionClienteCoa = new GridBagLayout();

			this.jPanelPaginacionClienteCoa.setLayout(gridaBagLayoutPaginacionClienteCoa);						
			
			this.gridBagConstraintsClienteCoa = new GridBagConstraints();
			this.gridBagConstraintsClienteCoa.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsClienteCoa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClienteCoa.gridy = 0;
			this.gridBagConstraintsClienteCoa.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionClienteCoa.add(this.jButtonAnterioresClienteCoa, this.gridBagConstraintsClienteCoa);
					
						
			this.gridBagConstraintsClienteCoa = new GridBagConstraints();
			this.gridBagConstraintsClienteCoa.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsClienteCoa.gridy = 0;
			
			this.jPanelPaginacionClienteCoa.add(this.jButtonNuevoGuardarCambiosClienteCoa, this.gridBagConstraintsClienteCoa);
						
			
			this.gridBagConstraintsClienteCoa = new GridBagConstraints();
			this.gridBagConstraintsClienteCoa.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsClienteCoa.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsClienteCoa.gridy = 0;
			this.jPanelPaginacionClienteCoa.add(this.jButtonSiguientesClienteCoa, this.gridBagConstraintsClienteCoa);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsClienteCoa = new GridBagConstraints();
			this.gridBagConstraintsClienteCoa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClienteCoa.gridy = 1;
			this.gridBagConstraintsClienteCoa.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionClienteCoa.add(this.jButtonNuevoClienteCoa, this.gridBagConstraintsClienteCoa);
						
			
			
			if(!this.clientecoaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsClienteCoa = new GridBagConstraints();
				this.gridBagConstraintsClienteCoa.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsClienteCoa.gridy = 1;
				this.gridBagConstraintsClienteCoa.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionClienteCoa.add(this.jButtonGuardarCambiosTablaClienteCoa, this.gridBagConstraintsClienteCoa);
			}
			
			
			
			this.gridBagConstraintsClienteCoa = new GridBagConstraints();
			this.gridBagConstraintsClienteCoa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClienteCoa.gridy = 1;
			this.gridBagConstraintsClienteCoa.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionClienteCoa.add(this.jButtonDuplicarClienteCoa, this.gridBagConstraintsClienteCoa);
			
			this.gridBagConstraintsClienteCoa = new GridBagConstraints();
			this.gridBagConstraintsClienteCoa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClienteCoa.gridy = 1;
			this.gridBagConstraintsClienteCoa.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionClienteCoa.add(this.jButtonCopiarClienteCoa, this.gridBagConstraintsClienteCoa);
		
			this.gridBagConstraintsClienteCoa = new GridBagConstraints();
			this.gridBagConstraintsClienteCoa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClienteCoa.gridy = 1;
			this.gridBagConstraintsClienteCoa.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionClienteCoa.add(this.jButtonVerFormClienteCoa, this.gridBagConstraintsClienteCoa);
		
			this.gridBagConstraintsClienteCoa = new GridBagConstraints();
			this.gridBagConstraintsClienteCoa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClienteCoa.gridy = 1;
			this.gridBagConstraintsClienteCoa.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionClienteCoa.add(this.jButtonCerrarClienteCoa, this.gridBagConstraintsClienteCoa);
		
		
		
		this.jButtonRecargarInformacionClienteCoa.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionClienteCoa.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionClienteCoa.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionClienteCoa, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesClienteCoa.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesClienteCoa.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesClienteCoa.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesClienteCoa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesClienteCoa.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesClienteCoa.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesClienteCoa.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesClienteCoa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesClienteCoa.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesClienteCoa.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesClienteCoa.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesClienteCoa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionClienteCoa.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionClienteCoa.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionClienteCoa.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionClienteCoa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesClienteCoa.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesClienteCoa.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesClienteCoa.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesClienteCoa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesClienteCoa.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesClienteCoa.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesClienteCoa.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesClienteCoa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarClienteCoa.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarClienteCoa.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarClienteCoa.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarClienteCoa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaClienteCoa.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaClienteCoa.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaClienteCoa.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaClienteCoa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteClienteCoa.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteClienteCoa.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteClienteCoa.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteClienteCoa, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosClienteCoa.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosClienteCoa.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosClienteCoa.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosClienteCoa, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosClienteCoa.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosClienteCoa.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosClienteCoa.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosClienteCoa, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesClienteCoa = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesClienteCoa = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ClienteCoa = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ClienteCoa = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ClienteCoa = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ClienteCoa = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesClienteCoa.setLayout(gridaBagParametrosReportesClienteCoa);
			this.jPanelParametrosReportesAccionesClienteCoa.setLayout(gridaBagParametrosReportesAccionesClienteCoa);
			
			
			this.jPanelParametrosAuxiliar1ClienteCoa.setLayout(gridaBagParametrosAuxiliar1ClienteCoa);
			this.jPanelParametrosAuxiliar2ClienteCoa.setLayout(gridaBagParametrosAuxiliar2ClienteCoa);
			this.jPanelParametrosAuxiliar3ClienteCoa.setLayout(gridaBagParametrosAuxiliar3ClienteCoa);
			this.jPanelParametrosAuxiliar4ClienteCoa.setLayout(gridaBagParametrosAuxiliar4ClienteCoa);
			//this.jPanelParametrosAuxiliar5ClienteCoa.setLayout(gridaBagParametrosAuxiliar2ClienteCoa);			
			
			
			
			
			this.gridBagConstraintsClienteCoa = new GridBagConstraints();
			this.gridBagConstraintsClienteCoa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClienteCoa.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsClienteCoa.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesClienteCoa.add(this.jButtonRecargarInformacionClienteCoa, this.gridBagConstraintsClienteCoa);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsClienteCoa = new GridBagConstraints();
			this.gridBagConstraintsClienteCoa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsClienteCoa.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsClienteCoa.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ClienteCoa.add(this.jComboBoxTiposPaginacionClienteCoa, this.gridBagConstraintsClienteCoa);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsClienteCoa = new GridBagConstraints();
			this.gridBagConstraintsClienteCoa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsClienteCoa.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsClienteCoa.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ClienteCoa.add(this.jCheckBoxConAltoMaximoTablaClienteCoa, this.gridBagConstraintsClienteCoa);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsClienteCoa = new GridBagConstraints();
			this.gridBagConstraintsClienteCoa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsClienteCoa.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsClienteCoa.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ClienteCoa.add(this.jComboBoxTiposArchivosReportesClienteCoa, this.gridBagConstraintsClienteCoa);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsClienteCoa = new GridBagConstraints();
			this.gridBagConstraintsClienteCoa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsClienteCoa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsClienteCoa.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesClienteCoa.add(this.jPanelParametrosAuxiliar1ClienteCoa, this.gridBagConstraintsClienteCoa);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsClienteCoa = new GridBagConstraints();
			this.gridBagConstraintsClienteCoa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsClienteCoa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClienteCoa.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsClienteCoa.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ClienteCoa.add(this.jComboBoxTiposReportesClienteCoa, this.gridBagConstraintsClienteCoa);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsClienteCoa = new GridBagConstraints();
			this.gridBagConstraintsClienteCoa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsClienteCoa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsClienteCoa.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesClienteCoa.add(this.jPanelParametrosAuxiliar4ClienteCoa, this.gridBagConstraintsClienteCoa);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsClienteCoa = new GridBagConstraints();
			this.gridBagConstraintsClienteCoa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsClienteCoa.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsClienteCoa.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesClienteCoa.add(this.jComboBoxTiposReportesClienteCoa, this.gridBagConstraintsClienteCoa);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsClienteCoa = new GridBagConstraints();
			this.gridBagConstraintsClienteCoa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsClienteCoa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsClienteCoa.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesClienteCoa.add(this.jCheckBoxGenerarReporteClienteCoa, this.gridBagConstraintsClienteCoa);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsClienteCoa = new GridBagConstraints();
			this.gridBagConstraintsClienteCoa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsClienteCoa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsClienteCoa.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesClienteCoa.add(this.jPanelParametrosAuxiliar2ClienteCoa, this.gridBagConstraintsClienteCoa);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsClienteCoa = new GridBagConstraints();
			this.gridBagConstraintsClienteCoa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClienteCoa.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsClienteCoa.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesClienteCoa.add(this.jLabelAccionesClienteCoa, this.gridBagConstraintsClienteCoa);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsClienteCoa = new GridBagConstraints();
				this.gridBagConstraintsClienteCoa.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsClienteCoa.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsClienteCoa.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesClienteCoa.add(this.jButtonAbrirOrderByClienteCoa, this.gridBagConstraintsClienteCoa);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsClienteCoa = new GridBagConstraints();
			this.gridBagConstraintsClienteCoa.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsClienteCoa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsClienteCoa.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesClienteCoa.add(this.jComboBoxTiposSeleccionarClienteCoa, this.gridBagConstraintsClienteCoa);			
			
			
			/*
			this.gridBagConstraintsClienteCoa = new GridBagConstraints();
			this.gridBagConstraintsClienteCoa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClienteCoa.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsClienteCoa.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesClienteCoa.add(this.jCheckBoxSeleccionarTodosClienteCoa, this.gridBagConstraintsClienteCoa);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsClienteCoa = new GridBagConstraints();
			this.gridBagConstraintsClienteCoa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsClienteCoa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClienteCoa.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsClienteCoa.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ClienteCoa.add(this.jCheckBoxSeleccionarTodosClienteCoa, this.gridBagConstraintsClienteCoa);															
				
			this.gridBagConstraintsClienteCoa = new GridBagConstraints();
			this.gridBagConstraintsClienteCoa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsClienteCoa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClienteCoa.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsClienteCoa.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ClienteCoa.add(this.jCheckBoxSeleccionadosClienteCoa, this.gridBagConstraintsClienteCoa);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsClienteCoa = new GridBagConstraints();
			this.gridBagConstraintsClienteCoa.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsClienteCoa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsClienteCoa.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesClienteCoa.add(this.jPanelParametrosAuxiliar3ClienteCoa, this.gridBagConstraintsClienteCoa);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsClienteCoa = new GridBagConstraints();
			this.gridBagConstraintsClienteCoa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsClienteCoa.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesClienteCoa.add(this.jComboBoxTiposAccionesClienteCoa, this.gridBagConstraintsClienteCoa);
	
				
			this.gridBagConstraintsClienteCoa = new GridBagConstraints();
			this.gridBagConstraintsClienteCoa.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsClienteCoa.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesClienteCoa.add(this.jTextFieldValorCampoGeneralClienteCoa, this.gridBagConstraintsClienteCoa);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosClienteCoa = new GridBagLayout();

			this.jScrollPanelDatosClienteCoa.setLayout(gridaBagLayoutDatosClienteCoa);
			
			this.gridBagConstraintsClienteCoa = new GridBagConstraints();
			this.gridBagConstraintsClienteCoa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClienteCoa.gridy = 0;
			this.gridBagConstraintsClienteCoa.gridx = 0;
			
			this.jScrollPanelDatosClienteCoa.add(this.jTableDatosClienteCoa, this.gridBagConstraintsClienteCoa);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosClienteCoa.setViewportView(this.jTableDatosClienteCoa);
		this.jTableDatosClienteCoa.setFillsViewportHeight(true);
		this.jTableDatosClienteCoa.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesClienteCoa= new GridBagLayout();
		this.jPanelAccionesClienteCoa.setLayout(gridaBagLayoutAccionesClienteCoa);
		
		
		/*	
		this.gridBagConstraintsClienteCoa = new GridBagConstraints();
		this.gridBagConstraintsClienteCoa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsClienteCoa.gridy = 0;
		this.gridBagConstraintsClienteCoa.gridx = 0;
			
		this.jPanelAccionesClienteCoa.add(this.jButtonNuevoClienteCoa, this.gridBagConstraintsClienteCoa);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdClienteClienteCoa= new GridBagLayout();
		gridaBagLayoutFK_IdClienteClienteCoa.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdClienteClienteCoa.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdClienteClienteCoa.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdClienteClienteCoa.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdClienteClienteCoa.setLayout(gridaBagLayoutFK_IdClienteClienteCoa);

		gridBagConstraintsClienteCoa = new GridBagConstraints();
		gridBagConstraintsClienteCoa.anchor = GridBagConstraints.WEST;
		gridBagConstraintsClienteCoa.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsClienteCoa.gridy = 0;
		gridBagConstraintsClienteCoa.gridx = 0;
		jPanelFK_IdClienteClienteCoa.add(jLabelid_clienteFK_IdClienteClienteCoa, gridBagConstraintsClienteCoa);

		gridBagConstraintsClienteCoa = new GridBagConstraints();
		gridBagConstraintsClienteCoa.anchor = GridBagConstraints.WEST;
		gridBagConstraintsClienteCoa.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsClienteCoa.gridy = 0;
		gridBagConstraintsClienteCoa.gridx = 1;
		jPanelFK_IdClienteClienteCoa.add(jComboBoxid_clienteFK_IdClienteClienteCoa, gridBagConstraintsClienteCoa);


		gridBagConstraintsClienteCoa = new GridBagConstraints();
		gridBagConstraintsClienteCoa.anchor = GridBagConstraints.EAST;
		gridBagConstraintsClienteCoa.fill = GridBagConstraints.NONE;
		gridBagConstraintsClienteCoa.gridy = 0;
		gridBagConstraintsClienteCoa.gridx = 0;
		jPanelFK_IdClienteClienteCoa.add(this.jButtonBuscarFK_IdClienteid_clienteClienteCoa, gridBagConstraintsClienteCoa);

		gridBagConstraintsClienteCoa = new GridBagConstraints();
		gridBagConstraintsClienteCoa.anchor = GridBagConstraints.WEST;
		gridBagConstraintsClienteCoa.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsClienteCoa.gridy = 1;
		gridBagConstraintsClienteCoa.gridx =1;
		jPanelFK_IdClienteClienteCoa.add(jButtonFK_IdClienteClienteCoa, gridBagConstraintsClienteCoa);

		jTabbedPaneBusquedasClienteCoa.addTab("1.-Por Cliente ", jPanelFK_IdClienteClienteCoa);
		jTabbedPaneBusquedasClienteCoa.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutClienteCoa = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutClienteCoa);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.clientecoaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsClienteCoa = new GridBagConstraints();						
			this.gridBagConstraintsClienteCoa.gridy = iGridyPrincipal++;
			this.gridBagConstraintsClienteCoa.gridx = 0;		
			//this.gridBagConstraintsClienteCoa.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClienteCoa.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsClienteCoa.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarClienteCoa, this.gridBagConstraintsClienteCoa);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsClienteCoa = new GridBagConstraints();
		this.gridBagConstraintsClienteCoa.gridy = iGridyPrincipal++;
		this.gridBagConstraintsClienteCoa.gridx = 0;		
		//this.gridBagConstraintsClienteCoa.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsClienteCoa.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsClienteCoa.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsClienteCoa);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsClienteCoa = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsClienteCoa.gridy = iGridyPrincipal++;
			this.gridBagConstraintsClienteCoa.gridx = 0;		
			this.gridBagConstraintsClienteCoa.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClienteCoa.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsClienteCoa.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasClienteCoa, this.gridBagConstraintsClienteCoa);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsClienteCoa = new GridBagConstraints();
		this.gridBagConstraintsClienteCoa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsClienteCoa.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesClienteCoa, this.gridBagConstraintsClienteCoa);								
		
		
		/*
		this.gridBagConstraintsClienteCoa = new GridBagConstraints();
		this.gridBagConstraintsClienteCoa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsClienteCoa.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesClienteCoa, this.gridBagConstraintsClienteCoa);
		*/		
		
		this.gridBagConstraintsClienteCoa = new GridBagConstraints();
		this.gridBagConstraintsClienteCoa.gridy =iGridyPrincipal++;
		this.gridBagConstraintsClienteCoa.gridx =0;
		this.gridBagConstraintsClienteCoa.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsClienteCoa.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosClienteCoa, this.gridBagConstraintsClienteCoa);
				
		
		this.gridBagConstraintsClienteCoa = new GridBagConstraints();
		this.gridBagConstraintsClienteCoa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsClienteCoa.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionClienteCoa, this.gridBagConstraintsClienteCoa);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(ClienteCoaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosClienteCoa= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosClienteCoa = new GridBagLayout();
			this.jPanelBusquedasParametrosClienteCoa.setLayout(gridaBagLayoutBusquedasParametrosClienteCoa);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralClienteCoa=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralClienteCoa.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralClienteCoa.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralClienteCoa.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsClienteCoa = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsClienteCoa = new GridBagConstraints();
		this.gridBagConstraintsClienteCoa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsClienteCoa.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposClienteCoa, this.gridBagConstraintsClienteCoa);
			
			
		this.gridBagConstraintsClienteCoa = new GridBagConstraints();
		this.gridBagConstraintsClienteCoa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsClienteCoa.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosClienteCoa, this.gridBagConstraintsClienteCoa);
		
			
		this.gridBagConstraintsClienteCoa = new GridBagConstraints();
		this.gridBagConstraintsClienteCoa.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsClienteCoa.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesClienteCoa, this.gridBagConstraintsClienteCoa);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralClienteCoa;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoClienteCoa() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoClienteCoa = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoClienteCoa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoClienteCoa.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoClienteCoa.setName("jPanelReporteDinamicoClienteCoa"); 
		
		this.jPanelReporteDinamicoClienteCoa.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoClienteCoa.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoClienteCoa.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoClienteCoa.setLayout(gridaBagLayoutReporteDinamicoClienteCoa);
		
		
		this.jInternalFrameReporteDinamicoClienteCoa= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoClienteCoa = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteClienteCoa= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoClienteCoa.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoClienteCoa.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoClienteCoa.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoClienteCoa.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoClienteCoa.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoClienteCoa.setResizable(true);
	    this.jInternalFrameReporteDinamicoClienteCoa.setClosable(true);
	    this.jInternalFrameReporteDinamicoClienteCoa.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoClienteCoa.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoClienteCoa.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoClienteCoa.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoClienteCoa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Coas"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteClienteCoa = new JLabelMe();

		this.jLabelColumnasSelectReporteClienteCoa.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteClienteCoa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteClienteCoa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteClienteCoa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsClienteCoa = new GridBagConstraints();
		this.gridBagConstraintsClienteCoa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteCoa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsClienteCoa.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoClienteCoa.add(this.jLabelColumnasSelectReporteClienteCoa, this.gridBagConstraintsClienteCoa);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteClienteCoa = new JList<Reporte>();
		this.jListColumnasSelectReporteClienteCoa.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteClienteCoa.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteClienteCoa.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteClienteCoa.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteClienteCoa.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteClienteCoa=new JScrollPane(this.jListColumnasSelectReporteClienteCoa);
			
			this.jScrollColumnasSelectReporteClienteCoa.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteClienteCoa.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteClienteCoa.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteClienteCoa.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsClienteCoa = new GridBagConstraints();
		this.gridBagConstraintsClienteCoa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteCoa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsClienteCoa.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoClienteCoa.add(this.jListColumnasSelectReporteClienteCoa, this.gridBagConstraintsClienteCoa);
		this.jPanelReporteDinamicoClienteCoa.add(this.jScrollColumnasSelectReporteClienteCoa, this.gridBagConstraintsClienteCoa);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteClienteCoa = new JLabelMe();

		this.jLabelRelacionesSelectReporteClienteCoa.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteClienteCoa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteClienteCoa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteClienteCoa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteClienteCoa = new JList<Reporte>();
		this.jListRelacionesSelectReporteClienteCoa.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteClienteCoa.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteClienteCoa.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteClienteCoa.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteClienteCoa.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteClienteCoa=new JScrollPane(this.jListRelacionesSelectReporteClienteCoa);
			
			this.jScrollRelacionesSelectReporteClienteCoa.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteClienteCoa.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteClienteCoa.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteClienteCoa.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoClienteCoa = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoClienteCoa = new JComboBoxMe();
		this.jListColumnasValoresGraficoClienteCoa = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoClienteCoa = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoClienteCoa.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoClienteCoa.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoClienteCoa.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoClienteCoa.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoClienteCoa, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoClienteCoa = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoClienteCoa.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoClienteCoa.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoClienteCoa.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoClienteCoa.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoClienteCoa, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoClienteCoa = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoClienteCoa.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoClienteCoa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoClienteCoa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoClienteCoa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsClienteCoa = new GridBagConstraints();
		this.gridBagConstraintsClienteCoa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteCoa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsClienteCoa.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoClienteCoa.add(this.jLabelGenerarExcelReporteDinamicoClienteCoa, this.gridBagConstraintsClienteCoa);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoClienteCoa = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoClienteCoa.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoClienteCoa,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoClienteCoa.setToolTipText("Generar EXCEL"+" "+ClienteCoaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsClienteCoa = new GridBagConstraints();
		//this.gridBagConstraintsClienteCoa.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsClienteCoa.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsClienteCoa.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoClienteCoa.add(this.jButtonGenerarExcelReporteDinamicoClienteCoa, this.gridBagConstraintsClienteCoa);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsClienteCoa = new GridBagConstraints();
		this.gridBagConstraintsClienteCoa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsClienteCoa.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsClienteCoa.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoClienteCoa.add(this.jComboBoxTiposReportesDinamicoClienteCoa, this.gridBagConstraintsClienteCoa);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoClienteCoa = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoClienteCoa.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoClienteCoa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoClienteCoa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoClienteCoa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsClienteCoa = new GridBagConstraints();
		this.gridBagConstraintsClienteCoa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteCoa.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsClienteCoa.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoClienteCoa.add(this.jLabelTiposArchivoReporteDinamicoClienteCoa, this.gridBagConstraintsClienteCoa);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsClienteCoa = new GridBagConstraints();
		this.gridBagConstraintsClienteCoa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsClienteCoa.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsClienteCoa.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoClienteCoa.add(this.jComboBoxTiposArchivosReportesDinamicoClienteCoa, this.gridBagConstraintsClienteCoa);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoClienteCoa = new JButtonMe();
		this.jButtonGenerarReporteDinamicoClienteCoa.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoClienteCoa,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoClienteCoa.setToolTipText("Generar"+" "+ClienteCoaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsClienteCoa = new GridBagConstraints();
		this.gridBagConstraintsClienteCoa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsClienteCoa.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsClienteCoa.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoClienteCoa.add(this.jButtonGenerarReporteDinamicoClienteCoa, this.gridBagConstraintsClienteCoa);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoClienteCoa = new JButtonMe();
		this.jButtonCerrarReporteDinamicoClienteCoa.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoClienteCoa,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoClienteCoa.setToolTipText("Cancelar"+" "+ClienteCoaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsClienteCoa = new GridBagConstraints();
		this.gridBagConstraintsClienteCoa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsClienteCoa.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsClienteCoa.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoClienteCoa.add(this.jButtonCerrarReporteDinamicoClienteCoa, this.gridBagConstraintsClienteCoa);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalClienteCoa = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoClienteCoa= new JScrollPane(jPanelReporteDinamicoClienteCoa,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoClienteCoa.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoClienteCoa.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoClienteCoa.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoClienteCoa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Coas"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsClienteCoa = new GridBagConstraints();
		this.gridBagConstraintsClienteCoa.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsClienteCoa.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsClienteCoa.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoClienteCoa.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoClienteCoa.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalClienteCoa);
		this.jInternalFrameReporteDinamicoClienteCoa.getContentPane().add(this.jScrollPanelReporteDinamicoClienteCoa, this.gridBagConstraintsClienteCoa);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionClienteCoa() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionClienteCoa = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionClienteCoa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionClienteCoa.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionClienteCoa.setName("jPanelImportacionClienteCoa"); 
		
		this.jPanelImportacionClienteCoa.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionClienteCoa.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionClienteCoa.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionClienteCoa.setLayout(gridaBagLayoutImportacionClienteCoa);
		
		
		this.jInternalFrameImportacionClienteCoa= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionClienteCoa= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionClienteCoa = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteClienteCoa= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionClienteCoa.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionClienteCoa.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionClienteCoa.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionClienteCoa.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionClienteCoa.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionClienteCoa.setResizable(true);
	    this.jInternalFrameImportacionClienteCoa.setClosable(true);
	    this.jInternalFrameImportacionClienteCoa.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionClienteCoa.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionClienteCoa.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionClienteCoa.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionClienteCoa.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionClienteCoa.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionClienteCoa.setResizable(true);
	    this.jInternalFrameImportacionClienteCoa.setClosable(true);
	    this.jInternalFrameImportacionClienteCoa.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionClienteCoa.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionClienteCoa.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionClienteCoa.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionClienteCoa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Coas"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionClienteCoa = new JLabelMe();

		this.jLabelArchivoImportacionClienteCoa.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionClienteCoa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionClienteCoa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionClienteCoa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsClienteCoa = new GridBagConstraints();
		this.gridBagConstraintsClienteCoa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteCoa.gridy = iPosYImportacion;		
		this.gridBagConstraintsClienteCoa.gridx = iPosXImportacion++;
			
		this.jPanelImportacionClienteCoa.add(this.jLabelArchivoImportacionClienteCoa, this.gridBagConstraintsClienteCoa);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionClienteCoa = new JFileChooser();		
		this.jFileChooserImportacionClienteCoa.setToolTipText("ESCOGER ARCHIVO"+" "+ClienteCoaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionClienteCoa = new JButtonMe();
		this.jButtonAbrirImportacionClienteCoa.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionClienteCoa,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionClienteCoa.setToolTipText("Generar"+" "+ClienteCoaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsClienteCoa = new GridBagConstraints();
		this.gridBagConstraintsClienteCoa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsClienteCoa.gridy = iPosYImportacion;
		this.gridBagConstraintsClienteCoa.gridx = iPosXImportacion++;
							
		this.jPanelImportacionClienteCoa.add(this.jButtonAbrirImportacionClienteCoa, this.gridBagConstraintsClienteCoa);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionClienteCoa = new JLabelMe();

		this.jLabelPathArchivoImportacionClienteCoa.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionClienteCoa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionClienteCoa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionClienteCoa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsClienteCoa = new GridBagConstraints();
		this.gridBagConstraintsClienteCoa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteCoa.gridy = iPosYImportacion;		
		this.gridBagConstraintsClienteCoa.gridx = iPosXImportacion++;
			
		this.jPanelImportacionClienteCoa.add(this.jLabelPathArchivoImportacionClienteCoa, this.gridBagConstraintsClienteCoa);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionClienteCoa=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionClienteCoa.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionClienteCoa.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionClienteCoa.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsClienteCoa = new GridBagConstraints();
		this.gridBagConstraintsClienteCoa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsClienteCoa.gridy = iPosYImportacion;
		this.gridBagConstraintsClienteCoa.gridx = iPosXImportacion++;
							
		this.jPanelImportacionClienteCoa.add(this.jTextFieldPathArchivoImportacionClienteCoa, this.gridBagConstraintsClienteCoa);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionClienteCoa = new JButtonMe();
		this.jButtonGenerarImportacionClienteCoa.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionClienteCoa,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionClienteCoa.setToolTipText("Generar"+" "+ClienteCoaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsClienteCoa = new GridBagConstraints();
		this.gridBagConstraintsClienteCoa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsClienteCoa.gridy = iPosYImportacion;
		this.gridBagConstraintsClienteCoa.gridx = iPosXImportacion++;
							
		this.jPanelImportacionClienteCoa.add(this.jButtonGenerarImportacionClienteCoa, this.gridBagConstraintsClienteCoa);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionClienteCoa = new JButtonMe();
		this.jButtonCerrarImportacionClienteCoa.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionClienteCoa,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionClienteCoa.setToolTipText("Cancelar"+" "+ClienteCoaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsClienteCoa = new GridBagConstraints();
		this.gridBagConstraintsClienteCoa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsClienteCoa.gridy = iPosYImportacion;
		this.gridBagConstraintsClienteCoa.gridx = iPosXImportacion++;
							
		this.jPanelImportacionClienteCoa.add(this.jButtonCerrarImportacionClienteCoa, this.gridBagConstraintsClienteCoa);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalClienteCoa = new GridBagLayout();
		
		this.jScrollPanelImportacionClienteCoa= new JScrollPane(jPanelImportacionClienteCoa,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsClienteCoa = new GridBagConstraints();
		this.gridBagConstraintsClienteCoa.gridy =iPosYImportacion;
		this.gridBagConstraintsClienteCoa.gridx =iPosXImportacion;
		this.gridBagConstraintsClienteCoa.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionClienteCoa.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionClienteCoa.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalClienteCoa);
		this.jInternalFrameImportacionClienteCoa.getContentPane().add(this.jScrollPanelImportacionClienteCoa, this.gridBagConstraintsClienteCoa);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByClienteCoa(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByClienteCoa = new JButtonMe();
			this.jButtonAbrirOrderByClienteCoa.setText("Orden");
			this.jButtonAbrirOrderByClienteCoa.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByClienteCoa,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByClienteCoa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByClienteCoa";
			inputMap = this.jButtonAbrirOrderByClienteCoa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByClienteCoa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByClienteCoa"));
		
		
			GridBagLayout gridaBagLayoutOrderByClienteCoa = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByClienteCoa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByClienteCoa.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByClienteCoa.setName("jPanelOrderByClienteCoa"); 
			
			this.jPanelOrderByClienteCoa.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByClienteCoa.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByClienteCoa.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByClienteCoa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByClienteCoa.setLayout(gridaBagLayoutOrderByClienteCoa);
			
			
			this.jTableDatosClienteCoaOrderBy = new JTableMe();        
			this.jTableDatosClienteCoaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosClienteCoaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosClienteCoaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosClienteCoaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosClienteCoaOrderBy.setViewportView(this.jTableDatosClienteCoaOrderBy);
			this.jTableDatosClienteCoaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosClienteCoaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByClienteCoa= new OrderByJInternalFrame();
			this.jInternalFrameOrderByClienteCoa= new OrderByJInternalFrame();
			this.jScrollPanelOrderByClienteCoa = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteClienteCoa= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByClienteCoa.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByClienteCoa.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByClienteCoa.setTitle("Orden");
			this.jInternalFrameOrderByClienteCoa.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByClienteCoa.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByClienteCoa.setResizable(true);
			this.jInternalFrameOrderByClienteCoa.setClosable(true);
			this.jInternalFrameOrderByClienteCoa.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByClienteCoa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByClienteCoa.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByClienteCoa.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByClienteCoa.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByClienteCoa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByClienteCoa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Coas"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsClienteCoa = new GridBagConstraints();
			this.gridBagConstraintsClienteCoa.gridy =iPosYOrderBy++;
			this.gridBagConstraintsClienteCoa.gridx =iPosXOrderBy;
			this.gridBagConstraintsClienteCoa.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsClienteCoa.ipady =150;
				
			this.jPanelOrderByClienteCoa.add(jScrollPanelDatosClienteCoaOrderBy, this.gridBagConstraintsClienteCoa);//this.jTableDatosClienteCoaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByClienteCoa = new JButtonMe();
			this.jButtonCerrarOrderByClienteCoa.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByClienteCoa,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByClienteCoa.setToolTipText("Cancelar"+" "+ClienteCoaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByClienteCoa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsClienteCoa = new GridBagConstraints();
			this.gridBagConstraintsClienteCoa.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClienteCoa.gridy = iPosYOrderBy++;
			this.gridBagConstraintsClienteCoa.gridx = iPosXOrderBy;
									
			this.jPanelOrderByClienteCoa.add(this.jButtonCerrarOrderByClienteCoa, this.gridBagConstraintsClienteCoa);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalClienteCoa = new GridBagLayout();
			
			this.jScrollPanelOrderByClienteCoa= new JScrollPane(jPanelOrderByClienteCoa,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsClienteCoa = new GridBagConstraints();
			this.gridBagConstraintsClienteCoa.gridy =iPosYOrderBy;
			this.gridBagConstraintsClienteCoa.gridx =iPosXOrderBy;
			this.gridBagConstraintsClienteCoa.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByClienteCoa.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByClienteCoa.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalClienteCoa);
			
			this.jInternalFrameOrderByClienteCoa.getContentPane().add(this.jScrollPanelOrderByClienteCoa, this.gridBagConstraintsClienteCoa);			
		
		} else {
			this.jButtonAbrirOrderByClienteCoa = new JButtonMe();
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
		int iWidthTableCalculado=0;//1930
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=930;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=1000;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.clientecoaSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosClienteCoa.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosClienteCoa.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosClienteCoa.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosClienteCoa.getRowHeight();//ClienteCoaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.clientecoaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ClienteCoaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaClienteCoa.isSelected()) {
					iHeightTable=ClienteCoaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ClienteCoaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ClienteCoaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ClienteCoaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaClienteCoa.isSelected()) {
					iHeightTable=ClienteCoaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ClienteCoaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ClienteCoaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosClienteCoa.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosClienteCoa.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosClienteCoa.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosClienteCoa.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosClienteCoa.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosClienteCoa.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByClienteCoa!=null && this.jInternalFrameOrderByClienteCoa.getjTableDatosOrderBy()!=null) {
			//if(!this.clientecoaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByClienteCoa.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByClienteCoa.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByClienteCoa.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByClienteCoa.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByClienteCoa.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByClienteCoa.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByClienteCoa.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosClienteCoa.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosClienteCoa.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosClienteCoa.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=clientecoaLogic.getClienteCoas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=clientecoas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ClienteCoa> TraerClienteCoaBeans(List<ClienteCoa> clientecoas,ArrayList<Classe> classes)throws Exception {
		try {
			for(ClienteCoa clientecoa:clientecoas) {
					
				if(!(ClienteCoaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ClienteCoaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					clientecoa.setsDetalleGeneralEntityReporte(ClienteCoaConstantesFunciones.getClienteCoaDescripcion(clientecoa));
										
						
					
						
					
				} else  {
							
					//clientecoa.setsDetalleGeneralEntityReporte(clientecoa.getsDetalleGeneralEntityReporte());
										
				}
				
				//clientecoabeans.add(clientecoabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return clientecoas;
    }
	//PARA REPORTES FIN
}
