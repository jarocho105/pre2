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
import com.bydan.erp.cartera.util.NegocioClienteConstantesFunciones;

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
public class NegocioClienteJInternalFrame extends NegocioClienteBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarNegocioCliente;
	
	protected JMenuBar jmenuBarNegocioCliente;
	
	protected JMenu jmenuNegocioCliente;
	protected JMenu jmenuDatosNegocioCliente;
	protected JMenu jmenuArchivoNegocioCliente;
	protected JMenu jmenuAccionesNegocioCliente;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosNegocioCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutNegocioCliente;	
	protected GridBagConstraints gridBagConstraintsNegocioCliente;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public NegocioClienteDetalleFormJInternalFrame jInternalFrameDetalleFormNegocioCliente;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoNegocioCliente;	
	protected ImportacionJInternalFrame jInternalFrameImportacionNegocioCliente;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected TipoUbicacionNegocioBeanSwingJInternalFrame tipoubicacionnegocioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoubicacionnegocio="";
	
	public NegocioClienteSessionBean negocioclienteSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public TipoUbicacionNegocioSessionBean tipoubicacionnegocioSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<NegocioCliente> negocioclientes;		
	public List<NegocioCliente> negocioclientesEliminados;	
	public List<NegocioCliente> negocioclientesAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByNegocioCliente;		
	protected JButton jButtonAbrirOrderByNegocioCliente;
	
	
	//protected JPanel jPanelOrderByNegocioCliente;
	//public JScrollPane jScrollPanelOrderByNegocioCliente;	
	//protected JButton jButtonCerrarOrderByNegocioCliente;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public NegocioClienteLogic negocioclienteLogic;
	
	
	
	public JScrollPane jScrollPanelDatosNegocioCliente;
	public JScrollPane jScrollPanelDatosEdicionNegocioCliente;
	public JScrollPane jScrollPanelDatosGeneralNegocioCliente;
    
	
	
	//public JScrollPane jScrollPanelDatosNegocioClienteOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoNegocioCliente;
	//public JScrollPane jScrollPanelImportacionNegocioCliente;
	
	
	
	protected JPanel jPanelAccionesNegocioCliente;
	
    protected JPanel jPanelPaginacionNegocioCliente;
    protected JPanel jPanelParametrosReportesNegocioCliente;
	protected JPanel jPanelParametrosReportesAccionesNegocioCliente;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1NegocioCliente;
	protected JPanel jPanelParametrosAuxiliar2NegocioCliente;
	protected JPanel jPanelParametrosAuxiliar3NegocioCliente;
	protected JPanel jPanelParametrosAuxiliar4NegocioCliente;
	//protected JPanel jPanelParametrosAuxiliar5NegocioCliente;
	
	
	
	//protected JPanel jPanelReporteDinamicoNegocioCliente;
	//protected JPanel jPanelImportacionNegocioCliente;
	
	
	public JTable jTableDatosNegocioCliente;
	
	
	
	//public JTable jTableDatosNegocioClienteOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoNegocioCliente;
	protected JButton jButtonDuplicarNegocioCliente;
	protected JButton jButtonCopiarNegocioCliente;
	protected JButton jButtonVerFormNegocioCliente;
	protected JButton jButtonNuevoRelacionesNegocioCliente;
	protected JButton jButtonModificarNegocioCliente;
	
    protected JButton jButtonGuardarCambiosTablaNegocioCliente;
	protected JButton jButtonCerrarNegocioCliente;
	
	
	protected JButton jButtonRecargarInformacionNegocioCliente;
	protected JButton jButtonProcesarInformacionNegocioCliente;
	
	
	protected JButton jButtonAnterioresNegocioCliente;
	protected JButton jButtonSiguientesNegocioCliente;
	protected JButton jButtonNuevoGuardarCambiosNegocioCliente;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoNegocioCliente;
	//protected JButton jButtonCerrarReporteDinamicoNegocioCliente;
	//protected JButton jButtonGenerarExcelReporteDinamicoNegocioCliente;	
	
	
	
	//protected JButton jButtonAbrirImportacionNegocioCliente;
	//protected JButton jButtonGenerarImportacionNegocioCliente;
	//protected JButton jButtonCerrarImportacionNegocioCliente;
	//protected JFileChooser jFileChooserImportacionNegocioCliente;
	//protected File fileImportacionNegocioCliente;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarNegocioCliente;
	protected JButton jButtonDuplicarToolBarNegocioCliente;
	protected JButton jButtonNuevoRelacionesToolBarNegocioCliente;
	
	
	public JButton jButtonGuardarCambiosToolBarNegocioCliente;
	protected JButton jButtonCopiarToolBarNegocioCliente;
	protected JButton jButtonVerFormToolBarNegocioCliente;
	public JButton jButtonGuardarCambiosTablaToolBarNegocioCliente;
	protected JButton jButtonMostrarOcultarTablaToolBarNegocioCliente;
	protected JButton jButtonCerrarToolBarNegocioCliente;
	
	protected JButton jButtonRecargarInformacionToolBarNegocioCliente;
	protected JButton jButtonProcesarInformacionToolBarNegocioCliente;
	protected JButton jButtonAnterioresToolBarNegocioCliente;
	protected JButton jButtonSiguientesToolBarNegocioCliente;
	protected JButton jButtonNuevoGuardarCambiosToolBarNegocioCliente;
	protected JButton jButtonAbrirOrderByToolBarNegocioCliente;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoNegocioCliente;
	protected JMenuItem jMenuItemDuplicarNegocioCliente;
	protected JMenuItem jMenuItemNuevoRelacionesNegocioCliente;
	
	
	protected JMenuItem jMenuItemGuardarCambiosNegocioCliente;
	protected JMenuItem jMenuItemCopiarNegocioCliente;
	protected JMenuItem jMenuItemVerFormNegocioCliente;
	protected JMenuItem jMenuItemGuardarCambiosTablaNegocioCliente;
	protected JMenuItem jMenuItemCerrarNegocioCliente;
	protected JMenuItem jMenuItemDetalleCerrarNegocioCliente;
	protected JMenuItem jMenuItemDetalleAbrirOrderByNegocioCliente;
	protected JMenuItem jMenuItemDetalleMostarOcultarNegocioCliente;
	
	protected JMenuItem jMenuItemRecargarInformacionNegocioCliente;
	protected JMenuItem jMenuItemProcesarInformacionNegocioCliente;
	protected JMenuItem jMenuItemAnterioresNegocioCliente;
	protected JMenuItem jMenuItemSiguientesNegocioCliente;
	protected JMenuItem jMenuItemNuevoGuardarCambiosNegocioCliente;
	protected JMenuItem jMenuItemAbrirOrderByNegocioCliente;
	protected JMenuItem jMenuItemMostrarOcultarNegocioCliente;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesNegocioCliente;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosNegocioCliente;
	protected JCheckBox jCheckBoxSeleccionadosNegocioCliente;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaNegocioCliente;
	protected JCheckBox jCheckBoxConGraficoReporteNegocioCliente;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesNegocioCliente;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesNegocioCliente;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoNegocioCliente;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoNegocioCliente;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesNegocioCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionNegocioCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesNegocioCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesNegocioCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarNegocioCliente;
	protected JTextField jTextFieldValorCampoGeneralNegocioCliente;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteNegocioCliente;
	//public JList<Reporte> jListColumnasSelectReporteNegocioCliente;
	//public JScrollPane jScrollColumnasSelectReporteNegocioCliente;
	
	//public JLabel jLabelRelacionesSelectReporteNegocioCliente;
	//public JList<Reporte> jListRelacionesSelectReporteNegocioCliente;
	//public JScrollPane jScrollRelacionesSelectReporteNegocioCliente;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoNegocioCliente;
	//protected JCheckBox jCheckBoxConGraficoDinamicoNegocioCliente;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoNegocioCliente;
	//public JLabel jLabelTiposArchivoReporteDinamicoNegocioCliente;
	
		
	//public JLabel jLabelArchivoImportacionNegocioCliente;	
	//public JLabel jLabelPathArchivoImportacionNegocioCliente;
	//protected JTextField jTextFieldPathArchivoImportacionNegocioCliente;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoNegocioCliente;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoNegocioCliente;
	
	//public JLabel jLabelColumnaCategoriaValorNegocioCliente;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorNegocioCliente;
	
	//public JLabel jLabelColumnasValoresGraficoNegocioCliente;
	//public JList<Reporte> jListColumnasValoresGraficoNegocioCliente;
	//public JScrollPane jScrollColumnasValoresGraficoNegocioCliente;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoNegocioCliente;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoNegocioCliente;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasNegocioCliente;
	public JPanel jPanelFK_IdClienteNegocioCliente;
	public JButton jButtonFK_IdClienteNegocioCliente;
	public JPanel jPanelFK_IdTipoUbicacionNegocioNegocioCliente;
	public JButton jButtonFK_IdTipoUbicacionNegocioNegocioCliente;
	
	public JPanel jPanelid_clienteFK_IdClienteNegocioCliente;
	public JLabel jLabelid_clienteFK_IdClienteNegocioCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteFK_IdClienteNegocioCliente;
	public JButton jButtonid_clienteFK_IdClienteNegocioCliente= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteNegocioClienteUpdate= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteNegocioClienteBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdClienteid_clienteNegocioCliente;
	
	public JPanel jPanelid_tipo_ubicacion_negocioFK_IdTipoUbicacionNegocioNegocioCliente;
	public JLabel jLabelid_tipo_ubicacion_negocioFK_IdTipoUbicacionNegocioNegocioCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_ubicacion_negocioFK_IdTipoUbicacionNegocioNegocioCliente;
	public JButton jButtonid_tipo_ubicacion_negocioFK_IdTipoUbicacionNegocioNegocioCliente= new JButtonMe();
	public JButton jButtonid_tipo_ubicacion_negocioFK_IdTipoUbicacionNegocioNegocioClienteUpdate= new JButtonMe();
	public JButton jButtonid_tipo_ubicacion_negocioFK_IdTipoUbicacionNegocioNegocioClienteBusqueda= new JButtonMe();

	
	
	
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	//public int iWidthFormulario=750;//(screenSize.width-screenSize.width/2)+(250*1);
	//public int iHeightFormulario=1496;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public NegocioClienteJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("NegocioCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NegocioClienteJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("NegocioCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NegocioClienteJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("NegocioCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NegocioClienteJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("NegocioCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionNegocioCliente)	{
		this.jButtonRecargarInformacionNegocioCliente = jButtonRecargarInformacionNegocioCliente;
	}
	
	public JButton getjButtonProcesarInformacionNegocioCliente() {
		return this.jButtonProcesarInformacionNegocioCliente;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionNegocioCliente)	{
		this.jButtonProcesarInformacionNegocioCliente = jButtonProcesarInformacionNegocioCliente;
	}
	
	
	public JButton getjButtonRecargarInformacionNegocioCliente() {
		return this.jButtonRecargarInformacionNegocioCliente;
	}
	
	
	public List<NegocioCliente> getnegocioclientes() {
		return this.negocioclientes;
	}

	public void setnegocioclientes(List<NegocioCliente> negocioclientes) {
		this.negocioclientes = negocioclientes;
	}
	
	public List<NegocioCliente> getnegocioclientesAux() {
		return this.negocioclientesAux;
	}

	public void setnegocioclientesAux(List<NegocioCliente> negocioclientesAux) {
		this.negocioclientesAux = negocioclientesAux;
	}
	
	public List<NegocioCliente> getnegocioclientesEliminados() {
		return this.negocioclientesEliminados;
	}

	public void setNegocioClientesEliminados(List<NegocioCliente> negocioclientesEliminados) {
		this.negocioclientesEliminados = negocioclientesEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarNegocioCliente() {
		return jComboBoxTiposSeleccionarNegocioCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarNegocioCliente(
			JComboBox jComboBoxTiposSeleccionarNegocioCliente) {
		this.jComboBoxTiposSeleccionarNegocioCliente = jComboBoxTiposSeleccionarNegocioCliente;
	}
	
	public void setBorderResaltarTiposSeleccionarNegocioCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarNegocioCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarNegocioCliente .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralNegocioCliente() {
		return jTextFieldValorCampoGeneralNegocioCliente;
	}

	public void setjTextFieldValorCampoGeneralNegocioCliente(
			JTextField jTextFieldValorCampoGeneralNegocioCliente) {
		this.jTextFieldValorCampoGeneralNegocioCliente = jTextFieldValorCampoGeneralNegocioCliente;
	}

	public void setBorderResaltarValorCampoGeneralNegocioCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNegocioCliente.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralNegocioCliente .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosNegocioCliente() {
		return this.jCheckBoxSeleccionarTodosNegocioCliente;
	}

	public void setjCheckBoxSeleccionarTodosNegocioCliente(
			JCheckBox jCheckBoxSeleccionarTodosNegocioCliente) {
		this.jCheckBoxSeleccionarTodosNegocioCliente = jCheckBoxSeleccionarTodosNegocioCliente;
	}

	public void setBorderResaltarSeleccionarTodosNegocioCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNegocioCliente.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosNegocioCliente .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosNegocioCliente() {
		return this.jCheckBoxSeleccionadosNegocioCliente;
	}

	public void setjCheckBoxSeleccionadosNegocioCliente(
			JCheckBox jCheckBoxSeleccionadosNegocioCliente) {
		this.jCheckBoxSeleccionadosNegocioCliente = jCheckBoxSeleccionadosNegocioCliente;
	}
	
	public void setBorderResaltarSeleccionadosNegocioCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNegocioCliente.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosNegocioCliente .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesNegocioCliente() {
		return this.jComboBoxTiposArchivosReportesNegocioCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesNegocioCliente(
			JComboBox jComboBoxTiposArchivosReportesNegocioCliente) {
		this.jComboBoxTiposArchivosReportesNegocioCliente = jComboBoxTiposArchivosReportesNegocioCliente;
	}

	public void setBorderResaltarTiposArchivosReportesNegocioCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNegocioCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesNegocioCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesNegocioCliente() {
		return this.jComboBoxTiposReportesNegocioCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesNegocioCliente(
			JComboBox jComboBoxTiposReportesNegocioCliente) {
		this.jComboBoxTiposReportesNegocioCliente = jComboBoxTiposReportesNegocioCliente;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoNegocioCliente() {
	//	return jComboBoxTiposReportesDinamicoNegocioCliente;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoNegocioCliente(
	//		JComboBox jComboBoxTiposReportesDinamicoNegocioCliente) {
	//	this.jComboBoxTiposReportesDinamicoNegocioCliente = jComboBoxTiposReportesDinamicoNegocioCliente;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoNegocioCliente() {
	//	return jComboBoxTiposArchivosReportesDinamicoNegocioCliente;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoNegocioCliente(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoNegocioCliente) {
	//	this.jComboBoxTiposArchivosReportesDinamicoNegocioCliente = jComboBoxTiposArchivosReportesDinamicoNegocioCliente;
	//}
	
	public void setBorderResaltarTiposReportesNegocioCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNegocioCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesNegocioCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesNegocioCliente() {
		return this.jComboBoxTiposGraficosReportesNegocioCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesNegocioCliente(
			JComboBox jComboBoxTiposGraficosReportesNegocioCliente) {
		this.jComboBoxTiposGraficosReportesNegocioCliente = jComboBoxTiposGraficosReportesNegocioCliente;
	}
	
	public void setBorderResaltarTiposGraficosReportesNegocioCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNegocioCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesNegocioCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionNegocioCliente() {
		return this.jComboBoxTiposPaginacionNegocioCliente;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionNegocioCliente(
			JComboBox jComboBoxTiposPaginacionNegocioCliente) {
		this.jComboBoxTiposPaginacionNegocioCliente = jComboBoxTiposPaginacionNegocioCliente;
	}
	
	public void setBorderResaltarTiposPaginacionNegocioCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNegocioCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionNegocioCliente .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesNegocioCliente() {
		return this.jComboBoxTiposRelacionesNegocioCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesNegocioCliente() {
		return this.jComboBoxTiposAccionesNegocioCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesNegocioCliente(
			JComboBox jComboBoxTiposRelacionesNegocioCliente) {
		this.jComboBoxTiposRelacionesNegocioCliente = jComboBoxTiposRelacionesNegocioCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesNegocioCliente(
			JComboBox jComboBoxTiposAccionesNegocioCliente) {
		this.jComboBoxTiposAccionesNegocioCliente = jComboBoxTiposAccionesNegocioCliente;
	}
	
	public void setBorderResaltarTiposRelacionesNegocioCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNegocioCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesNegocioCliente .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesNegocioCliente() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarNegocioCliente.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesNegocioCliente .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoNegocioCliente() {
	//	return jCheckBoxConGraficoDinamicoNegocioCliente;
	//}

	//public void setjCheckBoxConGraficoDinamicoNegocioCliente(
	//		JCheckBox jCheckBoxConGraficoDinamicoNegocioCliente) {
	//	this.jCheckBoxConGraficoDinamicoNegocioCliente = jCheckBoxConGraficoDinamicoNegocioCliente;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoNegocioCliente() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarNegocioCliente.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoNegocioCliente .setBorder(borderResaltar);		
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
		this.negocioclienteSessionBean=new NegocioClienteSessionBean();
		
		this.negocioclienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.negocioclienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.negocioclienteSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=NegocioClienteJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=NegocioClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		NegocioClienteJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		NegocioClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		NegocioClienteJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Negocio Cliente MANTENIMIENTO"));
		
		
		if(iWidth > 4850) {
			iWidth=4850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.negocioclienteSessionBean.getEsGuardarRelacionado()) {
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
		
		NegocioClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("NegocioCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarNegocioCliente= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarNegocioCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarNegocioCliente,this.jTtoolBarNegocioCliente,
							"nuevo","nuevo","Nuevo"+" "+NegocioClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarNegocioCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarNegocioCliente,this.jTtoolBarNegocioCliente,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarNegocioCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarNegocioCliente,this.jTtoolBarNegocioCliente,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+NegocioClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarNegocioCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarNegocioCliente,this.jTtoolBarNegocioCliente,
							"duplicar","duplicar","Duplicar"+" "+NegocioClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarNegocioCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarNegocioCliente,this.jTtoolBarNegocioCliente,
							"copiar","copiar","Copiar"+" "+NegocioClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarNegocioCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarNegocioCliente,this.jTtoolBarNegocioCliente,
							"ver_form","ver_form","Ver"+" "+NegocioClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarNegocioCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarNegocioCliente,this.jTtoolBarNegocioCliente,
							"recargar","recargar","Recargar"+" "+NegocioClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarNegocioCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarNegocioCliente,this.jTtoolBarNegocioCliente,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarNegocioCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarNegocioCliente,this.jTtoolBarNegocioCliente,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarNegocioCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarNegocioCliente,this.jTtoolBarNegocioCliente,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarNegocioCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarNegocioCliente,this.jTtoolBarNegocioCliente,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarNegocioCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarNegocioCliente,this.jTtoolBarNegocioCliente,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+NegocioClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarNegocioCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarNegocioCliente,this.jTtoolBarNegocioCliente,
							"cerrar","cerrar","Salir"+" "+NegocioClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarNegocioCliente=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarNegocioCliente;
			
				this.jButtonProcesarInformacionToolBarNegocioCliente=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarNegocioCliente;
				
		//protected JButton jButtonModificarToolBarNegocioCliente;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarNegocioCliente=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuNegocioCliente=new JMenuMe("General");
		this.jmenuArchivoNegocioCliente=new JMenuMe("Archivo");
		this.jmenuAccionesNegocioCliente=new JMenuMe("Acciones");
		this.jmenuDatosNegocioCliente=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoNegocioCliente= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoNegocioCliente.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoNegocioCliente,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoNegocioCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarNegocioCliente= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarNegocioCliente.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarNegocioCliente,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarNegocioCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesNegocioCliente= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesNegocioCliente.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesNegocioCliente,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesNegocioCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosNegocioCliente= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosNegocioCliente.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosNegocioCliente,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosNegocioCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarNegocioCliente= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarNegocioCliente.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarNegocioCliente,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarNegocioCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormNegocioCliente= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormNegocioCliente.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormNegocioCliente,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormNegocioCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaNegocioCliente= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaNegocioCliente.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaNegocioCliente,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaNegocioCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarNegocioCliente= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarNegocioCliente.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarNegocioCliente,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarNegocioCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionNegocioCliente= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionNegocioCliente.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionNegocioCliente,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionNegocioCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionNegocioCliente= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionNegocioCliente.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionNegocioCliente,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresNegocioCliente= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresNegocioCliente.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresNegocioCliente,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresNegocioCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesNegocioCliente= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesNegocioCliente.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesNegocioCliente,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesNegocioCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByNegocioCliente= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByNegocioCliente.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByNegocioCliente,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByNegocioCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarNegocioCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarNegocioCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarNegocioCliente,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarNegocioCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByNegocioCliente= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByNegocioCliente.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByNegocioCliente,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByNegocioCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarNegocioCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarNegocioCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarNegocioCliente,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarNegocioCliente, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosNegocioCliente= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosNegocioCliente.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosNegocioCliente,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosNegocioCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoNegocioCliente.add(this.jMenuItemCerrarNegocioCliente);
			
			this.jmenuAccionesNegocioCliente.add(this.jMenuItemNuevoNegocioCliente);
			this.jmenuAccionesNegocioCliente.add(this.jMenuItemNuevoGuardarCambiosNegocioCliente);
			this.jmenuAccionesNegocioCliente.add(this.jMenuItemNuevoRelacionesNegocioCliente);
			this.jmenuAccionesNegocioCliente.add(this.jMenuItemGuardarCambiosTablaNegocioCliente);		
			this.jmenuAccionesNegocioCliente.add(this.jMenuItemDuplicarNegocioCliente);		
			this.jmenuAccionesNegocioCliente.add(this.jMenuItemCopiarNegocioCliente);		
			this.jmenuAccionesNegocioCliente.add(this.jMenuItemVerFormNegocioCliente);		
			
			this.jmenuDatosNegocioCliente.add(this.jMenuItemRecargarInformacionNegocioCliente);				
			this.jmenuDatosNegocioCliente.add(this.jMenuItemAnterioresNegocioCliente);				
			this.jmenuDatosNegocioCliente.add(this.jMenuItemSiguientesNegocioCliente);				
			this.jmenuDatosNegocioCliente.add(this.jMenuItemAbrirOrderByNegocioCliente);				
			this.jmenuDatosNegocioCliente.add(this.jMenuItemMostrarOcultarNegocioCliente);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesNegocioCliente.add(this.jMenuItemGuardarCambiosNegocioCliente);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoNegocioCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesNegocioCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosNegocioCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarNegocioCliente.add(this.jmenuArchivoNegocioCliente);		
			this.jmenuBarNegocioCliente.add(this.jmenuAccionesNegocioCliente);		
			this.jmenuBarNegocioCliente.add(this.jmenuDatosNegocioCliente);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarNegocioCliente);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasNegocioCliente() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdClienteNegocioCliente=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdClienteNegocioCliente.setToolTipText("Buscar Por Cliente ");
		this.jButtonFK_IdClienteNegocioCliente= new JButtonMe();
		this.jButtonFK_IdClienteNegocioCliente.setText("Buscar");
		this.jButtonFK_IdClienteNegocioCliente.setToolTipText("Buscar Por Cliente ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdClienteNegocioCliente,"buscar_button","Buscar Por Cliente ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdClienteNegocioCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_clienteFK_IdClienteNegocioCliente = new JLabelMe();
		jLabelid_clienteFK_IdClienteNegocioCliente.setText("Cliente :");
		jLabelid_clienteFK_IdClienteNegocioCliente.setToolTipText("Cliente");
		jLabelid_clienteFK_IdClienteNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_clienteFK_IdClienteNegocioCliente,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_clienteFK_IdClienteNegocioCliente= new JComboBoxMe();
		jComboBoxid_clienteFK_IdClienteNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteFK_IdClienteNegocioCliente,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdClienteid_clienteNegocioCliente= new JButtonMe();
		this.jButtonBuscarFK_IdClienteid_clienteNegocioCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteNegocioCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteNegocioCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdClienteid_clienteNegocioCliente.setText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteNegocioCliente.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteNegocioCliente.setFocusable(false);

		this.jPanelFK_IdTipoUbicacionNegocioNegocioCliente=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoUbicacionNegocioNegocioCliente.setToolTipText("Buscar Por Tipo Ubicacion Negocio ");
		this.jButtonFK_IdTipoUbicacionNegocioNegocioCliente= new JButtonMe();
		this.jButtonFK_IdTipoUbicacionNegocioNegocioCliente.setText("Buscar");
		this.jButtonFK_IdTipoUbicacionNegocioNegocioCliente.setToolTipText("Buscar Por Tipo Ubicacion Negocio ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoUbicacionNegocioNegocioCliente,"buscar_button","Buscar Por Tipo Ubicacion Negocio ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoUbicacionNegocioNegocioCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_ubicacion_negocioFK_IdTipoUbicacionNegocioNegocioCliente = new JLabelMe();
		jLabelid_tipo_ubicacion_negocioFK_IdTipoUbicacionNegocioNegocioCliente.setText("Tipo Ubicacion Negocio :");
		jLabelid_tipo_ubicacion_negocioFK_IdTipoUbicacionNegocioNegocioCliente.setToolTipText("Tipo Ubicacion Negocio");
		jLabelid_tipo_ubicacion_negocioFK_IdTipoUbicacionNegocioNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_ubicacion_negocioFK_IdTipoUbicacionNegocioNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));
		jLabelid_tipo_ubicacion_negocioFK_IdTipoUbicacionNegocioNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_ubicacion_negocioFK_IdTipoUbicacionNegocioNegocioCliente,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_ubicacion_negocioFK_IdTipoUbicacionNegocioNegocioCliente= new JComboBoxMe();
		jComboBoxid_tipo_ubicacion_negocioFK_IdTipoUbicacionNegocioNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_ubicacion_negocioFK_IdTipoUbicacionNegocioNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_ubicacion_negocioFK_IdTipoUbicacionNegocioNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_ubicacion_negocioFK_IdTipoUbicacionNegocioNegocioCliente,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasNegocioCliente=new JTabbedPane();


		this.jTabbedPaneBusquedasNegocioCliente.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasNegocioCliente.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasNegocioCliente.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasNegocioCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasNegocioCliente.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasNegocioCliente,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleNegocioCliente = new NegocioClienteDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Negocio Cliente DATOS");
			this.jInternalFrameDetalleFormNegocioCliente = new NegocioClienteDetalleFormJInternalFrame(jDesktopPane,this.negocioclienteSessionBean.getConGuardarRelaciones(),this.negocioclienteSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormNegocioCliente = null;//new NegocioClienteDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutNegocioCliente= new GridBagLayout();
		
		
		this.jTableDatosNegocioCliente = new JTableMe();      
		
		String sToolTipNegocioCliente="";
		sToolTipNegocioCliente=NegocioClienteConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipNegocioCliente+="(Cartera.NegocioCliente)";
		}
		
		if(!this.negocioclienteSessionBean.getEsGuardarRelacionado()) {
			sToolTipNegocioCliente+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosNegocioCliente.setToolTipText(sToolTipNegocioCliente);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosNegocioCliente);
		this.jTableDatosNegocioCliente.setAutoCreateRowSorter(true);
		this.jTableDatosNegocioCliente.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosNegocioCliente.setRowSelectionAllowed(true);
		this.jTableDatosNegocioCliente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosNegocioCliente,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoNegocioCliente = new JButtonMe();
		this.jButtonDuplicarNegocioCliente = new JButtonMe();
		this.jButtonCopiarNegocioCliente = new JButtonMe();
		this.jButtonVerFormNegocioCliente = new JButtonMe();
		this.jButtonNuevoRelacionesNegocioCliente = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaNegocioCliente = new JButtonMe();
		this.jButtonCerrarNegocioCliente = new JButtonMe();
		
		this.jScrollPanelDatosNegocioCliente = new JScrollPane();   
        this.jScrollPanelDatosGeneralNegocioCliente = new JScrollPane();
		
				
		
		
		this.jPanelAccionesNegocioCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Negocio Cliente";
		
		if(!this.negocioclienteSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosNegocioCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Negocio Clientes" + this.sPath));
		} else {
			this.jScrollPanelDatosNegocioCliente.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralNegocioCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesNegocioCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesNegocioCliente.setToolTipText("Acciones");
        this.jPanelAccionesNegocioCliente.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralNegocioCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosNegocioCliente, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoNegocioCliente=new ReporteDinamicoJInternalFrame(NegocioClienteConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoNegocioCliente();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionNegocioCliente=new ImportacionJInternalFrame(NegocioClienteConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionNegocioCliente();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByNegocioCliente = new JButtonMe();
		
		this.jButtonAbrirOrderByNegocioCliente.setText("Orden");
		this.jButtonAbrirOrderByNegocioCliente.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByNegocioCliente,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByNegocioCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByNegocioCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByNegocioCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByNegocioCliente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByNegocioCliente,false,this);
			
			//this.cargarOrderByNegocioCliente(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByNegocioCliente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByNegocioCliente,true,this);
			
			//this.cargarOrderByNegocioCliente(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosNegocioCliente.setMinimumSize(new Dimension(400,50));//4830
		this.jTableDatosNegocioCliente.setMaximumSize(new Dimension(400,50));//4830
		this.jTableDatosNegocioCliente.setPreferredSize(new Dimension(400,50));//4830
		
		this.jScrollPanelDatosNegocioCliente.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosNegocioCliente.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosNegocioCliente.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoNegocioCliente.setText("Nuevo");
		this.jButtonDuplicarNegocioCliente.setText("Duplicar");
		this.jButtonCopiarNegocioCliente.setText("Copiar");
		this.jButtonVerFormNegocioCliente.setText("Ver");
		this.jButtonNuevoRelacionesNegocioCliente.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaNegocioCliente.setText("Guardar");
		this.jButtonCerrarNegocioCliente.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoNegocioCliente,"nuevo_button","Nuevo",this.negocioclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarNegocioCliente,"duplicar_button","Duplicar",this.negocioclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarNegocioCliente,"copiar_button","Copiar",this.negocioclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormNegocioCliente,"ver_form","Ver",this.negocioclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesNegocioCliente,"nuevorelaciones_button","Nuevo Rel",this.negocioclienteSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaNegocioCliente,"guardarcambiostabla_button","Guardar",this.negocioclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarNegocioCliente,"cerrar_button","Salir",this.negocioclienteSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoNegocioCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarNegocioCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarNegocioCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormNegocioCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesNegocioCliente, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaNegocioCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarNegocioCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoNegocioCliente.setToolTipText("Nuevo"+" "+NegocioClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarNegocioCliente.setToolTipText("Duplicar"+" "+NegocioClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarNegocioCliente.setToolTipText("Copiar"+" "+NegocioClienteConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormNegocioCliente.setToolTipText("Ver"+" "+NegocioClienteConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesNegocioCliente.setToolTipText("Nuevo Rel"+" "+NegocioClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaNegocioCliente.setToolTipText("Guardar"+" "+NegocioClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarNegocioCliente.setToolTipText("Salir"+" "+NegocioClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoNegocioCliente";
		inputMap = this.jButtonNuevoNegocioCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoNegocioCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoNegocioCliente"));
		
		//DUPLICAR
		sMapKey = "DuplicarNegocioCliente";
		inputMap = this.jButtonDuplicarNegocioCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarNegocioCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarNegocioCliente"));
		
		//COPIAR
		sMapKey = "CopiarNegocioCliente";
		inputMap = this.jButtonCopiarNegocioCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarNegocioCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarNegocioCliente"));
		
		//VEr FORM
		sMapKey = "VerFormNegocioCliente";
		inputMap = this.jButtonVerFormNegocioCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormNegocioCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormNegocioCliente"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesNegocioCliente";
		inputMap = this.jButtonNuevoRelacionesNegocioCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesNegocioCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesNegocioCliente"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarNegocioCliente";
		inputMap = this.jButtonModificarNegocioCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarNegocioCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarNegocioCliente"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarNegocioCliente";
		inputMap = this.jButtonCerrarNegocioCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarNegocioCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarNegocioCliente"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaNegocioCliente";
		inputMap = this.jButtonGuardarCambiosTablaNegocioCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaNegocioCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaNegocioCliente"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesNegocioCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesNegocioCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionNegocioCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1NegocioCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2NegocioCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3NegocioCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4NegocioCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5NegocioCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesNegocioCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesNegocioCliente.setName("jPanelParametrosReportesNegocioCliente"); 
		
		this.jPanelParametrosReportesAccionesNegocioCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesNegocioCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesNegocioCliente.setName("jPanelParametrosReportesAccionesNegocioCliente"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesNegocioCliente, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesNegocioCliente, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionNegocioCliente = new JButtonMe();
		this.jButtonRecargarInformacionNegocioCliente.setText("Recargar");
		this.jButtonRecargarInformacionNegocioCliente.setToolTipText("Recargar"+" "+NegocioClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionNegocioCliente,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionNegocioCliente = new JButtonMe();
		this.jButtonProcesarInformacionNegocioCliente.setText("Procesar");
		this.jButtonProcesarInformacionNegocioCliente.setToolTipText("Procesar"+" "+NegocioClienteConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionNegocioCliente.setVisible(false);
			
		this.jButtonProcesarInformacionNegocioCliente.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionNegocioCliente.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionNegocioCliente.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesNegocioCliente = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesNegocioCliente.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesNegocioCliente.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesNegocioCliente = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesNegocioCliente.setText("TIPO");       
		this.jComboBoxTiposReportesNegocioCliente.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesNegocioCliente = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesNegocioCliente.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesNegocioCliente.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionNegocioCliente = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionNegocioCliente.setText("Paginacion");
		this.jComboBoxTiposPaginacionNegocioCliente.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesNegocioCliente = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesNegocioCliente.setText("Accion");
		this.jComboBoxTiposRelacionesNegocioCliente.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesNegocioCliente = new JComboBoxMe();
		//this.jComboBoxTiposAccionesNegocioCliente.setText("Accion");
		this.jComboBoxTiposAccionesNegocioCliente.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarNegocioCliente = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarNegocioCliente.setText("Accion");
		this.jComboBoxTiposSeleccionarNegocioCliente.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralNegocioCliente=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralNegocioCliente.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralNegocioCliente.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralNegocioCliente.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesNegocioCliente = new JLabelMe();
		
		this.jLabelAccionesNegocioCliente.setText("Acciones");		
		this.jLabelAccionesNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosNegocioCliente = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosNegocioCliente.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosNegocioCliente.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosNegocioCliente = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosNegocioCliente.setText("Seleccionados");
		this.jCheckBoxSeleccionadosNegocioCliente.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaNegocioCliente = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaNegocioCliente.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaNegocioCliente.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteNegocioCliente = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteNegocioCliente.setText("Graf.");
		this.jCheckBoxConGraficoReporteNegocioCliente.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresNegocioCliente = new JButtonMe();
		//this.jButtonAnterioresNegocioCliente.setText("<<");
        this.jButtonAnterioresNegocioCliente.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresNegocioCliente,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresNegocioCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesNegocioCliente = new JButtonMe();
		//this.jButtonSiguientesNegocioCliente.setText(">>");
        this.jButtonSiguientesNegocioCliente.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesNegocioCliente,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesNegocioCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosNegocioCliente = new JButtonMe();
		this.jButtonNuevoGuardarCambiosNegocioCliente.setText("Nue");
        this.jButtonNuevoGuardarCambiosNegocioCliente.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosNegocioCliente,"nuevoguardarcambios_button","Nue",this.negocioclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosNegocioCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosNegocioCliente";
		inputMap = this.jButtonNuevoGuardarCambiosNegocioCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosNegocioCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosNegocioCliente"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionNegocioCliente";
		inputMap = this.jButtonRecargarInformacionNegocioCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionNegocioCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionNegocioCliente"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesNegocioCliente";
		inputMap = this.jButtonSiguientesNegocioCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesNegocioCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesNegocioCliente"));
		
		//ANTERIORES		
		sMapKey = "AnterioresNegocioCliente";
		inputMap = this.jButtonAnterioresNegocioCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresNegocioCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresNegocioCliente"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasNegocioCliente();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesNegocioCliente.setMinimumSize(new Dimension(this.getWidth(),NegocioClienteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(NegocioClienteBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesNegocioCliente.setMaximumSize(new Dimension(this.getWidth(),NegocioClienteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(NegocioClienteBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesNegocioCliente.setPreferredSize(new Dimension(this.getWidth(),NegocioClienteBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(NegocioClienteBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionNegocioCliente = new GridBagLayout();

			this.jPanelPaginacionNegocioCliente.setLayout(gridaBagLayoutPaginacionNegocioCliente);						
			
			this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
			this.gridBagConstraintsNegocioCliente.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNegocioCliente.gridy = 0;
			this.gridBagConstraintsNegocioCliente.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionNegocioCliente.add(this.jButtonAnterioresNegocioCliente, this.gridBagConstraintsNegocioCliente);
					
						
			this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
			this.gridBagConstraintsNegocioCliente.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsNegocioCliente.gridy = 0;
			
			this.jPanelPaginacionNegocioCliente.add(this.jButtonNuevoGuardarCambiosNegocioCliente, this.gridBagConstraintsNegocioCliente);
						
			
			this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
			this.gridBagConstraintsNegocioCliente.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsNegocioCliente.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsNegocioCliente.gridy = 0;
			this.jPanelPaginacionNegocioCliente.add(this.jButtonSiguientesNegocioCliente, this.gridBagConstraintsNegocioCliente);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
			this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNegocioCliente.gridy = 1;
			this.gridBagConstraintsNegocioCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionNegocioCliente.add(this.jButtonNuevoNegocioCliente, this.gridBagConstraintsNegocioCliente);
						
			
			
			if(!this.negocioclienteSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
				this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsNegocioCliente.gridy = 1;
				this.gridBagConstraintsNegocioCliente.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionNegocioCliente.add(this.jButtonGuardarCambiosTablaNegocioCliente, this.gridBagConstraintsNegocioCliente);
			}
			
			
			
			this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
			this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNegocioCliente.gridy = 1;
			this.gridBagConstraintsNegocioCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionNegocioCliente.add(this.jButtonDuplicarNegocioCliente, this.gridBagConstraintsNegocioCliente);
			
			this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
			this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNegocioCliente.gridy = 1;
			this.gridBagConstraintsNegocioCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionNegocioCliente.add(this.jButtonCopiarNegocioCliente, this.gridBagConstraintsNegocioCliente);
		
			this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
			this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNegocioCliente.gridy = 1;
			this.gridBagConstraintsNegocioCliente.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionNegocioCliente.add(this.jButtonVerFormNegocioCliente, this.gridBagConstraintsNegocioCliente);
		
			this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
			this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNegocioCliente.gridy = 1;
			this.gridBagConstraintsNegocioCliente.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionNegocioCliente.add(this.jButtonCerrarNegocioCliente, this.gridBagConstraintsNegocioCliente);
		
		
		
		this.jButtonRecargarInformacionNegocioCliente.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionNegocioCliente.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionNegocioCliente.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionNegocioCliente, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesNegocioCliente.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesNegocioCliente.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesNegocioCliente.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesNegocioCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesNegocioCliente.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesNegocioCliente.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesNegocioCliente.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesNegocioCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesNegocioCliente.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesNegocioCliente.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesNegocioCliente.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesNegocioCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionNegocioCliente.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionNegocioCliente.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionNegocioCliente.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionNegocioCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesNegocioCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesNegocioCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesNegocioCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesNegocioCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesNegocioCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesNegocioCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesNegocioCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesNegocioCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarNegocioCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarNegocioCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarNegocioCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarNegocioCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaNegocioCliente.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaNegocioCliente.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaNegocioCliente.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaNegocioCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteNegocioCliente.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteNegocioCliente.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteNegocioCliente.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteNegocioCliente, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosNegocioCliente.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosNegocioCliente.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosNegocioCliente.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosNegocioCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosNegocioCliente.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosNegocioCliente.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosNegocioCliente.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosNegocioCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesNegocioCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesNegocioCliente = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1NegocioCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2NegocioCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3NegocioCliente = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4NegocioCliente = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesNegocioCliente.setLayout(gridaBagParametrosReportesNegocioCliente);
			this.jPanelParametrosReportesAccionesNegocioCliente.setLayout(gridaBagParametrosReportesAccionesNegocioCliente);
			
			
			this.jPanelParametrosAuxiliar1NegocioCliente.setLayout(gridaBagParametrosAuxiliar1NegocioCliente);
			this.jPanelParametrosAuxiliar2NegocioCliente.setLayout(gridaBagParametrosAuxiliar2NegocioCliente);
			this.jPanelParametrosAuxiliar3NegocioCliente.setLayout(gridaBagParametrosAuxiliar3NegocioCliente);
			this.jPanelParametrosAuxiliar4NegocioCliente.setLayout(gridaBagParametrosAuxiliar4NegocioCliente);
			//this.jPanelParametrosAuxiliar5NegocioCliente.setLayout(gridaBagParametrosAuxiliar2NegocioCliente);			
			
			
			
			
			this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
			this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNegocioCliente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsNegocioCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesNegocioCliente.add(this.jButtonRecargarInformacionNegocioCliente, this.gridBagConstraintsNegocioCliente);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
			this.gridBagConstraintsNegocioCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNegocioCliente.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsNegocioCliente.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1NegocioCliente.add(this.jComboBoxTiposPaginacionNegocioCliente, this.gridBagConstraintsNegocioCliente);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
			this.gridBagConstraintsNegocioCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNegocioCliente.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsNegocioCliente.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1NegocioCliente.add(this.jCheckBoxConAltoMaximoTablaNegocioCliente, this.gridBagConstraintsNegocioCliente);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
			this.gridBagConstraintsNegocioCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNegocioCliente.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsNegocioCliente.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1NegocioCliente.add(this.jComboBoxTiposArchivosReportesNegocioCliente, this.gridBagConstraintsNegocioCliente);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
			this.gridBagConstraintsNegocioCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNegocioCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNegocioCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesNegocioCliente.add(this.jPanelParametrosAuxiliar1NegocioCliente, this.gridBagConstraintsNegocioCliente);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
			this.gridBagConstraintsNegocioCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNegocioCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsNegocioCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4NegocioCliente.add(this.jComboBoxTiposReportesNegocioCliente, this.gridBagConstraintsNegocioCliente);																		
			
			
			
			this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
			this.gridBagConstraintsNegocioCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNegocioCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsNegocioCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4NegocioCliente.add(this.jComboBoxTiposGraficosReportesNegocioCliente, this.gridBagConstraintsNegocioCliente);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
			this.gridBagConstraintsNegocioCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNegocioCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNegocioCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesNegocioCliente.add(this.jPanelParametrosAuxiliar4NegocioCliente, this.gridBagConstraintsNegocioCliente);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
			this.gridBagConstraintsNegocioCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNegocioCliente.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsNegocioCliente.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesNegocioCliente.add(this.jComboBoxTiposReportesNegocioCliente, this.gridBagConstraintsNegocioCliente);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
			this.gridBagConstraintsNegocioCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNegocioCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNegocioCliente.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesNegocioCliente.add(this.jCheckBoxGenerarReporteNegocioCliente, this.gridBagConstraintsNegocioCliente);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
			this.gridBagConstraintsNegocioCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNegocioCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNegocioCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesNegocioCliente.add(this.jPanelParametrosAuxiliar2NegocioCliente, this.gridBagConstraintsNegocioCliente);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
			this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNegocioCliente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsNegocioCliente.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesNegocioCliente.add(this.jLabelAccionesNegocioCliente, this.gridBagConstraintsNegocioCliente);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
				this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsNegocioCliente.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsNegocioCliente.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesNegocioCliente.add(this.jButtonAbrirOrderByNegocioCliente, this.gridBagConstraintsNegocioCliente);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
			this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsNegocioCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNegocioCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesNegocioCliente.add(this.jComboBoxTiposSeleccionarNegocioCliente, this.gridBagConstraintsNegocioCliente);			
			
			
			/*
			this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
			this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNegocioCliente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsNegocioCliente.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesNegocioCliente.add(this.jCheckBoxSeleccionarTodosNegocioCliente, this.gridBagConstraintsNegocioCliente);
			
			this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
			this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNegocioCliente.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsNegocioCliente.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesNegocioCliente.add(this.jCheckBoxConGraficoReporteNegocioCliente, this.gridBagConstraintsNegocioCliente);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
			this.gridBagConstraintsNegocioCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNegocioCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsNegocioCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3NegocioCliente.add(this.jCheckBoxSeleccionarTodosNegocioCliente, this.gridBagConstraintsNegocioCliente);															
				
			this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
			this.gridBagConstraintsNegocioCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNegocioCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsNegocioCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3NegocioCliente.add(this.jCheckBoxSeleccionadosNegocioCliente, this.gridBagConstraintsNegocioCliente);															
			
			this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
			this.gridBagConstraintsNegocioCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNegocioCliente.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsNegocioCliente.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3NegocioCliente.add(this.jCheckBoxConGraficoReporteNegocioCliente, this.gridBagConstraintsNegocioCliente);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
			this.gridBagConstraintsNegocioCliente.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsNegocioCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNegocioCliente.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesNegocioCliente.add(this.jPanelParametrosAuxiliar3NegocioCliente, this.gridBagConstraintsNegocioCliente);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
			this.gridBagConstraintsNegocioCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNegocioCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesNegocioCliente.add(this.jComboBoxTiposAccionesNegocioCliente, this.gridBagConstraintsNegocioCliente);
	
				
			this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
			this.gridBagConstraintsNegocioCliente.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsNegocioCliente.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesNegocioCliente.add(this.jTextFieldValorCampoGeneralNegocioCliente, this.gridBagConstraintsNegocioCliente);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosNegocioCliente = new GridBagLayout();

			this.jScrollPanelDatosNegocioCliente.setLayout(gridaBagLayoutDatosNegocioCliente);
			
			this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
			this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNegocioCliente.gridy = 0;
			this.gridBagConstraintsNegocioCliente.gridx = 0;
			
			this.jScrollPanelDatosNegocioCliente.add(this.jTableDatosNegocioCliente, this.gridBagConstraintsNegocioCliente);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosNegocioCliente.setViewportView(this.jTableDatosNegocioCliente);
		this.jTableDatosNegocioCliente.setFillsViewportHeight(true);
		this.jTableDatosNegocioCliente.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesNegocioCliente= new GridBagLayout();
		this.jPanelAccionesNegocioCliente.setLayout(gridaBagLayoutAccionesNegocioCliente);
		
		
		/*	
		this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
		this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNegocioCliente.gridy = 0;
		this.gridBagConstraintsNegocioCliente.gridx = 0;
			
		this.jPanelAccionesNegocioCliente.add(this.jButtonNuevoNegocioCliente, this.gridBagConstraintsNegocioCliente);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdClienteNegocioCliente= new GridBagLayout();
		gridaBagLayoutFK_IdClienteNegocioCliente.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdClienteNegocioCliente.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdClienteNegocioCliente.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdClienteNegocioCliente.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdClienteNegocioCliente.setLayout(gridaBagLayoutFK_IdClienteNegocioCliente);

		gridBagConstraintsNegocioCliente = new GridBagConstraints();
		gridBagConstraintsNegocioCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNegocioCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNegocioCliente.gridy = 0;
		gridBagConstraintsNegocioCliente.gridx = 0;
		jPanelFK_IdClienteNegocioCliente.add(jLabelid_clienteFK_IdClienteNegocioCliente, gridBagConstraintsNegocioCliente);

		gridBagConstraintsNegocioCliente = new GridBagConstraints();
		gridBagConstraintsNegocioCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNegocioCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNegocioCliente.gridy = 0;
		gridBagConstraintsNegocioCliente.gridx = 1;
		jPanelFK_IdClienteNegocioCliente.add(jComboBoxid_clienteFK_IdClienteNegocioCliente, gridBagConstraintsNegocioCliente);


		gridBagConstraintsNegocioCliente = new GridBagConstraints();
		gridBagConstraintsNegocioCliente.anchor = GridBagConstraints.EAST;
		gridBagConstraintsNegocioCliente.fill = GridBagConstraints.NONE;
		gridBagConstraintsNegocioCliente.gridy = 0;
		gridBagConstraintsNegocioCliente.gridx = 0;
		jPanelFK_IdClienteNegocioCliente.add(this.jButtonBuscarFK_IdClienteid_clienteNegocioCliente, gridBagConstraintsNegocioCliente);

		gridBagConstraintsNegocioCliente = new GridBagConstraints();
		gridBagConstraintsNegocioCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNegocioCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNegocioCliente.gridy = 1;
		gridBagConstraintsNegocioCliente.gridx =1;
		jPanelFK_IdClienteNegocioCliente.add(jButtonFK_IdClienteNegocioCliente, gridBagConstraintsNegocioCliente);

		jTabbedPaneBusquedasNegocioCliente.addTab("1.-Por Cliente ", jPanelFK_IdClienteNegocioCliente);
		jTabbedPaneBusquedasNegocioCliente.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdTipoUbicacionNegocioNegocioCliente= new GridBagLayout();
		gridaBagLayoutFK_IdTipoUbicacionNegocioNegocioCliente.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoUbicacionNegocioNegocioCliente.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoUbicacionNegocioNegocioCliente.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoUbicacionNegocioNegocioCliente.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoUbicacionNegocioNegocioCliente.setLayout(gridaBagLayoutFK_IdTipoUbicacionNegocioNegocioCliente);

		gridBagConstraintsNegocioCliente = new GridBagConstraints();
		gridBagConstraintsNegocioCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNegocioCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNegocioCliente.gridy = 0;
		gridBagConstraintsNegocioCliente.gridx = 0;
		jPanelFK_IdTipoUbicacionNegocioNegocioCliente.add(jLabelid_tipo_ubicacion_negocioFK_IdTipoUbicacionNegocioNegocioCliente, gridBagConstraintsNegocioCliente);

		gridBagConstraintsNegocioCliente = new GridBagConstraints();
		gridBagConstraintsNegocioCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNegocioCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNegocioCliente.gridy = 0;
		gridBagConstraintsNegocioCliente.gridx = 1;
		jPanelFK_IdTipoUbicacionNegocioNegocioCliente.add(jComboBoxid_tipo_ubicacion_negocioFK_IdTipoUbicacionNegocioNegocioCliente, gridBagConstraintsNegocioCliente);

		gridBagConstraintsNegocioCliente = new GridBagConstraints();
		gridBagConstraintsNegocioCliente.anchor = GridBagConstraints.WEST;
		gridBagConstraintsNegocioCliente.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsNegocioCliente.gridy = 1;
		gridBagConstraintsNegocioCliente.gridx =1;
		jPanelFK_IdTipoUbicacionNegocioNegocioCliente.add(jButtonFK_IdTipoUbicacionNegocioNegocioCliente, gridBagConstraintsNegocioCliente);

		jTabbedPaneBusquedasNegocioCliente.addTab("2.-Por Tipo Ubicacion Negocio ", jPanelFK_IdTipoUbicacionNegocioNegocioCliente);
		jTabbedPaneBusquedasNegocioCliente.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutNegocioCliente = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutNegocioCliente);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.negocioclienteSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsNegocioCliente = new GridBagConstraints();						
			this.gridBagConstraintsNegocioCliente.gridy = iGridyPrincipal++;
			this.gridBagConstraintsNegocioCliente.gridx = 0;		
			//this.gridBagConstraintsNegocioCliente.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNegocioCliente.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsNegocioCliente.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarNegocioCliente, this.gridBagConstraintsNegocioCliente);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
		this.gridBagConstraintsNegocioCliente.gridy = iGridyPrincipal++;
		this.gridBagConstraintsNegocioCliente.gridx = 0;		
		//this.gridBagConstraintsNegocioCliente.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNegocioCliente.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsNegocioCliente.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsNegocioCliente);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsNegocioCliente.gridy = iGridyPrincipal++;
			this.gridBagConstraintsNegocioCliente.gridx = 0;		
			this.gridBagConstraintsNegocioCliente.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNegocioCliente.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsNegocioCliente.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasNegocioCliente, this.gridBagConstraintsNegocioCliente);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
		this.gridBagConstraintsNegocioCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNegocioCliente.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesNegocioCliente, this.gridBagConstraintsNegocioCliente);								
		
		
		/*
		this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
		this.gridBagConstraintsNegocioCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNegocioCliente.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesNegocioCliente, this.gridBagConstraintsNegocioCliente);
		*/		
		
		this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
		this.gridBagConstraintsNegocioCliente.gridy =iGridyPrincipal++;
		this.gridBagConstraintsNegocioCliente.gridx =0;
		this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsNegocioCliente.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosNegocioCliente, this.gridBagConstraintsNegocioCliente);
				
		
		this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
		this.gridBagConstraintsNegocioCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNegocioCliente.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionNegocioCliente, this.gridBagConstraintsNegocioCliente);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(NegocioClienteJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosNegocioCliente= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosNegocioCliente = new GridBagLayout();
			this.jPanelBusquedasParametrosNegocioCliente.setLayout(gridaBagLayoutBusquedasParametrosNegocioCliente);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralNegocioCliente=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralNegocioCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralNegocioCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralNegocioCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
		this.gridBagConstraintsNegocioCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNegocioCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposNegocioCliente, this.gridBagConstraintsNegocioCliente);
			
			
		this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
		this.gridBagConstraintsNegocioCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNegocioCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosNegocioCliente, this.gridBagConstraintsNegocioCliente);
		
			
		this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
		this.gridBagConstraintsNegocioCliente.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsNegocioCliente.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesNegocioCliente, this.gridBagConstraintsNegocioCliente);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralNegocioCliente;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoNegocioCliente() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoNegocioCliente = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoNegocioCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoNegocioCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoNegocioCliente.setName("jPanelReporteDinamicoNegocioCliente"); 
		
		this.jPanelReporteDinamicoNegocioCliente.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoNegocioCliente.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoNegocioCliente.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoNegocioCliente.setLayout(gridaBagLayoutReporteDinamicoNegocioCliente);
		
		
		this.jInternalFrameReporteDinamicoNegocioCliente= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoNegocioCliente = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteNegocioCliente= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoNegocioCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoNegocioCliente.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoNegocioCliente.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoNegocioCliente.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoNegocioCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoNegocioCliente.setResizable(true);
	    this.jInternalFrameReporteDinamicoNegocioCliente.setClosable(true);
	    this.jInternalFrameReporteDinamicoNegocioCliente.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoNegocioCliente.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoNegocioCliente.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoNegocioCliente.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoNegocioCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Negocio Clientes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteNegocioCliente = new JLabelMe();

		this.jLabelColumnasSelectReporteNegocioCliente.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
		this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNegocioCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNegocioCliente.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoNegocioCliente.add(this.jLabelColumnasSelectReporteNegocioCliente, this.gridBagConstraintsNegocioCliente);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteNegocioCliente = new JList<Reporte>();
		this.jListColumnasSelectReporteNegocioCliente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteNegocioCliente.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteNegocioCliente.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteNegocioCliente.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteNegocioCliente.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteNegocioCliente=new JScrollPane(this.jListColumnasSelectReporteNegocioCliente);
			
			this.jScrollColumnasSelectReporteNegocioCliente.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteNegocioCliente.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteNegocioCliente.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteNegocioCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
		this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNegocioCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNegocioCliente.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoNegocioCliente.add(this.jListColumnasSelectReporteNegocioCliente, this.gridBagConstraintsNegocioCliente);
		this.jPanelReporteDinamicoNegocioCliente.add(this.jScrollColumnasSelectReporteNegocioCliente, this.gridBagConstraintsNegocioCliente);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteNegocioCliente = new JLabelMe();

		this.jLabelRelacionesSelectReporteNegocioCliente.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteNegocioCliente = new JList<Reporte>();
		this.jListRelacionesSelectReporteNegocioCliente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteNegocioCliente.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteNegocioCliente.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteNegocioCliente.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteNegocioCliente.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteNegocioCliente=new JScrollPane(this.jListRelacionesSelectReporteNegocioCliente);
			
			this.jScrollRelacionesSelectReporteNegocioCliente.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteNegocioCliente.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteNegocioCliente.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteNegocioCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoNegocioCliente = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoNegocioCliente = new JComboBoxMe();
		this.jListColumnasValoresGraficoNegocioCliente = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoNegocioCliente = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoNegocioCliente.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoNegocioCliente.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoNegocioCliente.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoNegocioCliente.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoNegocioCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoNegocioCliente = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoNegocioCliente.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoNegocioCliente.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoNegocioCliente.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoNegocioCliente.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoNegocioCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoNegocioCliente = new JLabelMe();

		this.jLabelConGraficoDinamicoNegocioCliente.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
		this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNegocioCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNegocioCliente.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoNegocioCliente.add(this.jLabelConGraficoDinamicoNegocioCliente, this.gridBagConstraintsNegocioCliente);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoNegocioCliente = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoNegocioCliente.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoNegocioCliente.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoNegocioCliente.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoNegocioCliente.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoNegocioCliente.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
		this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNegocioCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNegocioCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoNegocioCliente.add(this.jCheckBoxConGraficoDinamicoNegocioCliente, this.gridBagConstraintsNegocioCliente);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoNegocioCliente = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoNegocioCliente.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
		this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNegocioCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNegocioCliente.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoNegocioCliente.add(this.jLabelColumnaCategoriaGraficoNegocioCliente, this.gridBagConstraintsNegocioCliente);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoNegocioCliente = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoNegocioCliente.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoNegocioCliente.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoNegocioCliente.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoNegocioCliente.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoNegocioCliente.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
		this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNegocioCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNegocioCliente.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoNegocioCliente.add(this.jComboBoxColumnaCategoriaGraficoNegocioCliente, this.gridBagConstraintsNegocioCliente);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorNegocioCliente = new JLabelMe();

		this.jLabelColumnaCategoriaValorNegocioCliente.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
		this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNegocioCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNegocioCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoNegocioCliente.add(this.jLabelColumnaCategoriaValorNegocioCliente, this.gridBagConstraintsNegocioCliente);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorNegocioCliente = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorNegocioCliente.setText("Accion");
        this.jComboBoxColumnaCategoriaValorNegocioCliente.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorNegocioCliente.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorNegocioCliente.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorNegocioCliente.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
		this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNegocioCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNegocioCliente.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoNegocioCliente.add(this.jComboBoxColumnaCategoriaValorNegocioCliente, this.gridBagConstraintsNegocioCliente);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoNegocioCliente = new JLabelMe();

		this.jLabelColumnasValoresGraficoNegocioCliente.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
		this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNegocioCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNegocioCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoNegocioCliente.add(this.jLabelColumnasValoresGraficoNegocioCliente, this.gridBagConstraintsNegocioCliente);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoNegocioCliente = new JList<Reporte>();
		this.jListColumnasValoresGraficoNegocioCliente.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoNegocioCliente.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoNegocioCliente.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoNegocioCliente.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoNegocioCliente.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoNegocioCliente=new JScrollPane(this.jListColumnasValoresGraficoNegocioCliente);
			
			this.jScrollColumnasValoresGraficoNegocioCliente.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoNegocioCliente.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoNegocioCliente.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoNegocioCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
		this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNegocioCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNegocioCliente.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoNegocioCliente.add(this.jListColumnasSelectReporteNegocioCliente, this.gridBagConstraintsNegocioCliente);
		this.jPanelReporteDinamicoNegocioCliente.add(this.jScrollColumnasValoresGraficoNegocioCliente, this.gridBagConstraintsNegocioCliente);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoNegocioCliente = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoNegocioCliente.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
		this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNegocioCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNegocioCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoNegocioCliente.add(this.jLabelTiposGraficosReportesDinamicoNegocioCliente, this.gridBagConstraintsNegocioCliente);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoNegocioCliente = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoNegocioCliente.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoNegocioCliente.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoNegocioCliente.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoNegocioCliente.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoNegocioCliente.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
		this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNegocioCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNegocioCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoNegocioCliente.add(this.jComboBoxTiposGraficosReportesDinamicoNegocioCliente, this.gridBagConstraintsNegocioCliente);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoNegocioCliente = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoNegocioCliente.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
		this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNegocioCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNegocioCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoNegocioCliente.add(this.jLabelGenerarExcelReporteDinamicoNegocioCliente, this.gridBagConstraintsNegocioCliente);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoNegocioCliente = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoNegocioCliente.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoNegocioCliente,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoNegocioCliente.setToolTipText("Generar EXCEL"+" "+NegocioClienteConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
		//this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsNegocioCliente.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsNegocioCliente.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoNegocioCliente.add(this.jButtonGenerarExcelReporteDinamicoNegocioCliente, this.gridBagConstraintsNegocioCliente);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
		this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNegocioCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsNegocioCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoNegocioCliente.add(this.jComboBoxTiposReportesDinamicoNegocioCliente, this.gridBagConstraintsNegocioCliente);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoNegocioCliente = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoNegocioCliente.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
		this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNegocioCliente.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsNegocioCliente.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoNegocioCliente.add(this.jLabelTiposArchivoReporteDinamicoNegocioCliente, this.gridBagConstraintsNegocioCliente);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
		this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNegocioCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsNegocioCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoNegocioCliente.add(this.jComboBoxTiposArchivosReportesDinamicoNegocioCliente, this.gridBagConstraintsNegocioCliente);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoNegocioCliente = new JButtonMe();
		this.jButtonGenerarReporteDinamicoNegocioCliente.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoNegocioCliente,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoNegocioCliente.setToolTipText("Generar"+" "+NegocioClienteConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
		this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNegocioCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsNegocioCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoNegocioCliente.add(this.jButtonGenerarReporteDinamicoNegocioCliente, this.gridBagConstraintsNegocioCliente);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoNegocioCliente = new JButtonMe();
		this.jButtonCerrarReporteDinamicoNegocioCliente.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoNegocioCliente,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoNegocioCliente.setToolTipText("Cancelar"+" "+NegocioClienteConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
		this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNegocioCliente.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsNegocioCliente.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoNegocioCliente.add(this.jButtonCerrarReporteDinamicoNegocioCliente, this.gridBagConstraintsNegocioCliente);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalNegocioCliente = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoNegocioCliente= new JScrollPane(jPanelReporteDinamicoNegocioCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoNegocioCliente.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoNegocioCliente.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoNegocioCliente.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoNegocioCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Negocio Clientes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
		this.gridBagConstraintsNegocioCliente.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsNegocioCliente.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoNegocioCliente.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoNegocioCliente.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalNegocioCliente);
		this.jInternalFrameReporteDinamicoNegocioCliente.getContentPane().add(this.jScrollPanelReporteDinamicoNegocioCliente, this.gridBagConstraintsNegocioCliente);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionNegocioCliente() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionNegocioCliente = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionNegocioCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionNegocioCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionNegocioCliente.setName("jPanelImportacionNegocioCliente"); 
		
		this.jPanelImportacionNegocioCliente.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionNegocioCliente.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionNegocioCliente.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionNegocioCliente.setLayout(gridaBagLayoutImportacionNegocioCliente);
		
		
		this.jInternalFrameImportacionNegocioCliente= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionNegocioCliente= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionNegocioCliente = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteNegocioCliente= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionNegocioCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionNegocioCliente.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionNegocioCliente.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionNegocioCliente.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionNegocioCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionNegocioCliente.setResizable(true);
	    this.jInternalFrameImportacionNegocioCliente.setClosable(true);
	    this.jInternalFrameImportacionNegocioCliente.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionNegocioCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionNegocioCliente.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionNegocioCliente.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionNegocioCliente.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionNegocioCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionNegocioCliente.setResizable(true);
	    this.jInternalFrameImportacionNegocioCliente.setClosable(true);
	    this.jInternalFrameImportacionNegocioCliente.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionNegocioCliente.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionNegocioCliente.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionNegocioCliente.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionNegocioCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Negocio Clientes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionNegocioCliente = new JLabelMe();

		this.jLabelArchivoImportacionNegocioCliente.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
		this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNegocioCliente.gridy = iPosYImportacion;		
		this.gridBagConstraintsNegocioCliente.gridx = iPosXImportacion++;
			
		this.jPanelImportacionNegocioCliente.add(this.jLabelArchivoImportacionNegocioCliente, this.gridBagConstraintsNegocioCliente);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionNegocioCliente = new JFileChooser();		
		this.jFileChooserImportacionNegocioCliente.setToolTipText("ESCOGER ARCHIVO"+" "+NegocioClienteConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionNegocioCliente = new JButtonMe();
		this.jButtonAbrirImportacionNegocioCliente.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionNegocioCliente,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionNegocioCliente.setToolTipText("Generar"+" "+NegocioClienteConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
		this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNegocioCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsNegocioCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionNegocioCliente.add(this.jButtonAbrirImportacionNegocioCliente, this.gridBagConstraintsNegocioCliente);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionNegocioCliente = new JLabelMe();

		this.jLabelPathArchivoImportacionNegocioCliente.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionNegocioCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionNegocioCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionNegocioCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
		this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNegocioCliente.gridy = iPosYImportacion;		
		this.gridBagConstraintsNegocioCliente.gridx = iPosXImportacion++;
			
		this.jPanelImportacionNegocioCliente.add(this.jLabelPathArchivoImportacionNegocioCliente, this.gridBagConstraintsNegocioCliente);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionNegocioCliente=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionNegocioCliente.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionNegocioCliente.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionNegocioCliente.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
		this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNegocioCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsNegocioCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionNegocioCliente.add(this.jTextFieldPathArchivoImportacionNegocioCliente, this.gridBagConstraintsNegocioCliente);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionNegocioCliente = new JButtonMe();
		this.jButtonGenerarImportacionNegocioCliente.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionNegocioCliente,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionNegocioCliente.setToolTipText("Generar"+" "+NegocioClienteConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
		this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNegocioCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsNegocioCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionNegocioCliente.add(this.jButtonGenerarImportacionNegocioCliente, this.gridBagConstraintsNegocioCliente);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionNegocioCliente = new JButtonMe();
		this.jButtonCerrarImportacionNegocioCliente.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionNegocioCliente,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionNegocioCliente.setToolTipText("Cancelar"+" "+NegocioClienteConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
		this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNegocioCliente.gridy = iPosYImportacion;
		this.gridBagConstraintsNegocioCliente.gridx = iPosXImportacion++;
							
		this.jPanelImportacionNegocioCliente.add(this.jButtonCerrarImportacionNegocioCliente, this.gridBagConstraintsNegocioCliente);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalNegocioCliente = new GridBagLayout();
		
		this.jScrollPanelImportacionNegocioCliente= new JScrollPane(jPanelImportacionNegocioCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
		this.gridBagConstraintsNegocioCliente.gridy =iPosYImportacion;
		this.gridBagConstraintsNegocioCliente.gridx =iPosXImportacion;
		this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionNegocioCliente.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionNegocioCliente.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalNegocioCliente);
		this.jInternalFrameImportacionNegocioCliente.getContentPane().add(this.jScrollPanelImportacionNegocioCliente, this.gridBagConstraintsNegocioCliente);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByNegocioCliente(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByNegocioCliente = new JButtonMe();
			this.jButtonAbrirOrderByNegocioCliente.setText("Orden");
			this.jButtonAbrirOrderByNegocioCliente.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByNegocioCliente,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByNegocioCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByNegocioCliente";
			inputMap = this.jButtonAbrirOrderByNegocioCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByNegocioCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByNegocioCliente"));
		
		
			GridBagLayout gridaBagLayoutOrderByNegocioCliente = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByNegocioCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByNegocioCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByNegocioCliente.setName("jPanelOrderByNegocioCliente"); 
			
			this.jPanelOrderByNegocioCliente.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByNegocioCliente.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByNegocioCliente.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByNegocioCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByNegocioCliente.setLayout(gridaBagLayoutOrderByNegocioCliente);
			
			
			this.jTableDatosNegocioClienteOrderBy = new JTableMe();        
			this.jTableDatosNegocioClienteOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosNegocioClienteOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosNegocioClienteOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosNegocioClienteOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosNegocioClienteOrderBy.setViewportView(this.jTableDatosNegocioClienteOrderBy);
			this.jTableDatosNegocioClienteOrderBy.setFillsViewportHeight(true);
			this.jTableDatosNegocioClienteOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByNegocioCliente= new OrderByJInternalFrame();
			this.jInternalFrameOrderByNegocioCliente= new OrderByJInternalFrame();
			this.jScrollPanelOrderByNegocioCliente = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteNegocioCliente= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByNegocioCliente.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByNegocioCliente.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByNegocioCliente.setTitle("Orden");
			this.jInternalFrameOrderByNegocioCliente.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByNegocioCliente.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByNegocioCliente.setResizable(true);
			this.jInternalFrameOrderByNegocioCliente.setClosable(true);
			this.jInternalFrameOrderByNegocioCliente.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByNegocioCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByNegocioCliente.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByNegocioCliente.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByNegocioCliente.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByNegocioCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByNegocioCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Negocio Clientes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
			this.gridBagConstraintsNegocioCliente.gridy =iPosYOrderBy++;
			this.gridBagConstraintsNegocioCliente.gridx =iPosXOrderBy;
			this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsNegocioCliente.ipady =150;
				
			this.jPanelOrderByNegocioCliente.add(jScrollPanelDatosNegocioClienteOrderBy, this.gridBagConstraintsNegocioCliente);//this.jTableDatosNegocioClienteTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByNegocioCliente = new JButtonMe();
			this.jButtonCerrarOrderByNegocioCliente.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByNegocioCliente,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByNegocioCliente.setToolTipText("Cancelar"+" "+NegocioClienteConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByNegocioCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
			this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNegocioCliente.gridy = iPosYOrderBy++;
			this.gridBagConstraintsNegocioCliente.gridx = iPosXOrderBy;
									
			this.jPanelOrderByNegocioCliente.add(this.jButtonCerrarOrderByNegocioCliente, this.gridBagConstraintsNegocioCliente);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalNegocioCliente = new GridBagLayout();
			
			this.jScrollPanelOrderByNegocioCliente= new JScrollPane(jPanelOrderByNegocioCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsNegocioCliente = new GridBagConstraints();
			this.gridBagConstraintsNegocioCliente.gridy =iPosYOrderBy;
			this.gridBagConstraintsNegocioCliente.gridx =iPosXOrderBy;
			this.gridBagConstraintsNegocioCliente.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByNegocioCliente.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByNegocioCliente.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalNegocioCliente);
			
			this.jInternalFrameOrderByNegocioCliente.getContentPane().add(this.jScrollPanelOrderByNegocioCliente, this.gridBagConstraintsNegocioCliente);			
		
		} else {
			this.jButtonAbrirOrderByNegocioCliente = new JButtonMe();
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
		int iWidthTableCalculado=0;//9630
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=4830;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=4800;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.negocioclienteSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosNegocioCliente.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosNegocioCliente.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosNegocioCliente.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosNegocioCliente.getRowHeight();//NegocioClienteConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.negocioclienteSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > NegocioClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaNegocioCliente.isSelected()) {
					iHeightTable=NegocioClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < NegocioClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=NegocioClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > NegocioClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaNegocioCliente.isSelected()) {
					iHeightTable=NegocioClienteConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < NegocioClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=NegocioClienteConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosNegocioCliente.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosNegocioCliente.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosNegocioCliente.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosNegocioCliente.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosNegocioCliente.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosNegocioCliente.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByNegocioCliente!=null && this.jInternalFrameOrderByNegocioCliente.getjTableDatosOrderBy()!=null) {
			//if(!this.negocioclienteSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByNegocioCliente.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByNegocioCliente.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByNegocioCliente.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByNegocioCliente.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByNegocioCliente.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByNegocioCliente.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByNegocioCliente.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosNegocioCliente.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosNegocioCliente.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosNegocioCliente.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=negocioclienteLogic.getNegocioClientes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=negocioclientes.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<NegocioCliente> TraerNegocioClienteBeans(List<NegocioCliente> negocioclientes,ArrayList<Classe> classes)throws Exception {
		try {
			for(NegocioCliente negociocliente:negocioclientes) {
					
				if(!(NegocioClienteConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || NegocioClienteConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					negociocliente.setsDetalleGeneralEntityReporte(NegocioClienteConstantesFunciones.getNegocioClienteDescripcion(negociocliente));
										
					negociocliente.setes_local_propio_descripcion(NegocioClienteConstantesFunciones.getes_local_propioDescripcion(negociocliente));negociocliente.setes_enero_alto_descripcion(NegocioClienteConstantesFunciones.getes_enero_altoDescripcion(negociocliente));negociocliente.setes_febrero_alto_descripcion(NegocioClienteConstantesFunciones.getes_febrero_altoDescripcion(negociocliente));negociocliente.setes_marzo_alto_descripcion(NegocioClienteConstantesFunciones.getes_marzo_altoDescripcion(negociocliente));negociocliente.setes_abril_alto_descripcion(NegocioClienteConstantesFunciones.getes_abril_altoDescripcion(negociocliente));negociocliente.setes_mayo_alto_descripcion(NegocioClienteConstantesFunciones.getes_mayo_altoDescripcion(negociocliente));negociocliente.setes_junio_alto_descripcion(NegocioClienteConstantesFunciones.getes_junio_altoDescripcion(negociocliente));negociocliente.setes_julio_alto_descripcion(NegocioClienteConstantesFunciones.getes_julio_altoDescripcion(negociocliente));negociocliente.setes_agosto_alto_descripcion(NegocioClienteConstantesFunciones.getes_agosto_altoDescripcion(negociocliente));negociocliente.setes_septiembre_alto_descripcion(NegocioClienteConstantesFunciones.getes_septiembre_altoDescripcion(negociocliente));negociocliente.setes_octubre_alto_descripcion(NegocioClienteConstantesFunciones.getes_octubre_altoDescripcion(negociocliente));negociocliente.setes_noviembre_alto_descripcion(NegocioClienteConstantesFunciones.getes_noviembre_altoDescripcion(negociocliente));negociocliente.setes_diciembre_alto_descripcion(NegocioClienteConstantesFunciones.getes_diciembre_altoDescripcion(negociocliente));negociocliente.setes_enero_bajo_descripcion(NegocioClienteConstantesFunciones.getes_enero_bajoDescripcion(negociocliente));negociocliente.setes_febrero_bajo_descripcion(NegocioClienteConstantesFunciones.getes_febrero_bajoDescripcion(negociocliente));negociocliente.setes_marzo_bajo_descripcion(NegocioClienteConstantesFunciones.getes_marzo_bajoDescripcion(negociocliente));negociocliente.setes_abril_bajo_descripcion(NegocioClienteConstantesFunciones.getes_abril_bajoDescripcion(negociocliente));negociocliente.setes_mayo_bajo_descripcion(NegocioClienteConstantesFunciones.getes_mayo_bajoDescripcion(negociocliente));negociocliente.setes_junio_bajo_descripcion(NegocioClienteConstantesFunciones.getes_junio_bajoDescripcion(negociocliente));negociocliente.setes_julio_bajo_descripcion(NegocioClienteConstantesFunciones.getes_julio_bajoDescripcion(negociocliente));negociocliente.setes_agosto_bajo_descripcion(NegocioClienteConstantesFunciones.getes_agosto_bajoDescripcion(negociocliente));negociocliente.setes_septiembre_bajo_descripcion(NegocioClienteConstantesFunciones.getes_septiembre_bajoDescripcion(negociocliente));negociocliente.setes_octubre_bajo_descripcion(NegocioClienteConstantesFunciones.getes_octubre_bajoDescripcion(negociocliente));negociocliente.setes_noviembre_bajo_descripcion(NegocioClienteConstantesFunciones.getes_noviembre_bajoDescripcion(negociocliente));negociocliente.setes_diciembre_bajo_descripcion(NegocioClienteConstantesFunciones.getes_diciembre_bajoDescripcion(negociocliente));	
					
						
					
				} else  {
							
					//negociocliente.setsDetalleGeneralEntityReporte(negociocliente.getsDetalleGeneralEntityReporte());
										
				}
				
				//negocioclientebeans.add(negocioclientebean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return negocioclientes;
    }
	//PARA REPORTES FIN
}
