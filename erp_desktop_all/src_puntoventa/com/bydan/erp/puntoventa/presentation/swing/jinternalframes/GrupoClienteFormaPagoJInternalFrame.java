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
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;

//import com.bydan.erp.puntoventa.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.puntoventa.util.GrupoClienteFormaPagoConstantesFunciones;

import com.bydan.erp.puntoventa.business.logic.*;
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
public class GrupoClienteFormaPagoJInternalFrame extends GrupoClienteFormaPagoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarGrupoClienteFormaPago;
	
	protected JMenuBar jmenuBarGrupoClienteFormaPago;
	
	protected JMenu jmenuGrupoClienteFormaPago;
	protected JMenu jmenuDatosGrupoClienteFormaPago;
	protected JMenu jmenuArchivoGrupoClienteFormaPago;
	protected JMenu jmenuAccionesGrupoClienteFormaPago;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosGrupoClienteFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutGrupoClienteFormaPago;	
	protected GridBagConstraints gridBagConstraintsGrupoClienteFormaPago;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public GrupoClienteFormaPagoDetalleFormJInternalFrame jInternalFrameDetalleFormGrupoClienteFormaPago;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoGrupoClienteFormaPago;	
	protected ImportacionJInternalFrame jInternalFrameImportacionGrupoClienteFormaPago;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected GrupoClienteBeanSwingJInternalFrame grupoclienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_grupocliente="";

	protected TipoFormaPagoBeanSwingJInternalFrame tipoformapagoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoformapago="";
	
	public GrupoClienteFormaPagoSessionBean grupoclienteformapagoSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public GrupoClienteSessionBean grupoclienteSessionBean;
	public TipoFormaPagoSessionBean tipoformapagoSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<GrupoClienteFormaPago> grupoclienteformapagos;		
	public List<GrupoClienteFormaPago> grupoclienteformapagosEliminados;	
	public List<GrupoClienteFormaPago> grupoclienteformapagosAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByGrupoClienteFormaPago;		
	protected JButton jButtonAbrirOrderByGrupoClienteFormaPago;
	
	
	//protected JPanel jPanelOrderByGrupoClienteFormaPago;
	//public JScrollPane jScrollPanelOrderByGrupoClienteFormaPago;	
	//protected JButton jButtonCerrarOrderByGrupoClienteFormaPago;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public GrupoClienteFormaPagoLogic grupoclienteformapagoLogic;
	
	
	
	public JScrollPane jScrollPanelDatosGrupoClienteFormaPago;
	public JScrollPane jScrollPanelDatosEdicionGrupoClienteFormaPago;
	public JScrollPane jScrollPanelDatosGeneralGrupoClienteFormaPago;
    
	
	
	//public JScrollPane jScrollPanelDatosGrupoClienteFormaPagoOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoGrupoClienteFormaPago;
	//public JScrollPane jScrollPanelImportacionGrupoClienteFormaPago;
	
	
	
	protected JPanel jPanelAccionesGrupoClienteFormaPago;
	
    protected JPanel jPanelPaginacionGrupoClienteFormaPago;
    protected JPanel jPanelParametrosReportesGrupoClienteFormaPago;
	protected JPanel jPanelParametrosReportesAccionesGrupoClienteFormaPago;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1GrupoClienteFormaPago;
	protected JPanel jPanelParametrosAuxiliar2GrupoClienteFormaPago;
	protected JPanel jPanelParametrosAuxiliar3GrupoClienteFormaPago;
	protected JPanel jPanelParametrosAuxiliar4GrupoClienteFormaPago;
	//protected JPanel jPanelParametrosAuxiliar5GrupoClienteFormaPago;
	
	
	
	//protected JPanel jPanelReporteDinamicoGrupoClienteFormaPago;
	//protected JPanel jPanelImportacionGrupoClienteFormaPago;
	
	
	public JTable jTableDatosGrupoClienteFormaPago;
	
	
	
	//public JTable jTableDatosGrupoClienteFormaPagoOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoGrupoClienteFormaPago;
	protected JButton jButtonDuplicarGrupoClienteFormaPago;
	protected JButton jButtonCopiarGrupoClienteFormaPago;
	protected JButton jButtonVerFormGrupoClienteFormaPago;
	protected JButton jButtonNuevoRelacionesGrupoClienteFormaPago;
	protected JButton jButtonModificarGrupoClienteFormaPago;
	
    protected JButton jButtonGuardarCambiosTablaGrupoClienteFormaPago;
	protected JButton jButtonCerrarGrupoClienteFormaPago;
	
	
	protected JButton jButtonRecargarInformacionGrupoClienteFormaPago;
	protected JButton jButtonProcesarInformacionGrupoClienteFormaPago;
	
	
	protected JButton jButtonAnterioresGrupoClienteFormaPago;
	protected JButton jButtonSiguientesGrupoClienteFormaPago;
	protected JButton jButtonNuevoGuardarCambiosGrupoClienteFormaPago;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoGrupoClienteFormaPago;
	//protected JButton jButtonCerrarReporteDinamicoGrupoClienteFormaPago;
	//protected JButton jButtonGenerarExcelReporteDinamicoGrupoClienteFormaPago;	
	
	
	
	//protected JButton jButtonAbrirImportacionGrupoClienteFormaPago;
	//protected JButton jButtonGenerarImportacionGrupoClienteFormaPago;
	//protected JButton jButtonCerrarImportacionGrupoClienteFormaPago;
	//protected JFileChooser jFileChooserImportacionGrupoClienteFormaPago;
	//protected File fileImportacionGrupoClienteFormaPago;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarGrupoClienteFormaPago;
	protected JButton jButtonDuplicarToolBarGrupoClienteFormaPago;
	protected JButton jButtonNuevoRelacionesToolBarGrupoClienteFormaPago;
	
	
	public JButton jButtonGuardarCambiosToolBarGrupoClienteFormaPago;
	protected JButton jButtonCopiarToolBarGrupoClienteFormaPago;
	protected JButton jButtonVerFormToolBarGrupoClienteFormaPago;
	public JButton jButtonGuardarCambiosTablaToolBarGrupoClienteFormaPago;
	protected JButton jButtonMostrarOcultarTablaToolBarGrupoClienteFormaPago;
	protected JButton jButtonCerrarToolBarGrupoClienteFormaPago;
	
	protected JButton jButtonRecargarInformacionToolBarGrupoClienteFormaPago;
	protected JButton jButtonProcesarInformacionToolBarGrupoClienteFormaPago;
	protected JButton jButtonAnterioresToolBarGrupoClienteFormaPago;
	protected JButton jButtonSiguientesToolBarGrupoClienteFormaPago;
	protected JButton jButtonNuevoGuardarCambiosToolBarGrupoClienteFormaPago;
	protected JButton jButtonAbrirOrderByToolBarGrupoClienteFormaPago;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoGrupoClienteFormaPago;
	protected JMenuItem jMenuItemDuplicarGrupoClienteFormaPago;
	protected JMenuItem jMenuItemNuevoRelacionesGrupoClienteFormaPago;
	
	
	protected JMenuItem jMenuItemGuardarCambiosGrupoClienteFormaPago;
	protected JMenuItem jMenuItemCopiarGrupoClienteFormaPago;
	protected JMenuItem jMenuItemVerFormGrupoClienteFormaPago;
	protected JMenuItem jMenuItemGuardarCambiosTablaGrupoClienteFormaPago;
	protected JMenuItem jMenuItemCerrarGrupoClienteFormaPago;
	protected JMenuItem jMenuItemDetalleCerrarGrupoClienteFormaPago;
	protected JMenuItem jMenuItemDetalleAbrirOrderByGrupoClienteFormaPago;
	protected JMenuItem jMenuItemDetalleMostarOcultarGrupoClienteFormaPago;
	
	protected JMenuItem jMenuItemRecargarInformacionGrupoClienteFormaPago;
	protected JMenuItem jMenuItemProcesarInformacionGrupoClienteFormaPago;
	protected JMenuItem jMenuItemAnterioresGrupoClienteFormaPago;
	protected JMenuItem jMenuItemSiguientesGrupoClienteFormaPago;
	protected JMenuItem jMenuItemNuevoGuardarCambiosGrupoClienteFormaPago;
	protected JMenuItem jMenuItemAbrirOrderByGrupoClienteFormaPago;
	protected JMenuItem jMenuItemMostrarOcultarGrupoClienteFormaPago;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesGrupoClienteFormaPago;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosGrupoClienteFormaPago;
	protected JCheckBox jCheckBoxSeleccionadosGrupoClienteFormaPago;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaGrupoClienteFormaPago;
	protected JCheckBox jCheckBoxConGraficoReporteGrupoClienteFormaPago;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesGrupoClienteFormaPago;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesGrupoClienteFormaPago;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoGrupoClienteFormaPago;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoGrupoClienteFormaPago;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesGrupoClienteFormaPago;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionGrupoClienteFormaPago;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesGrupoClienteFormaPago;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesGrupoClienteFormaPago;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarGrupoClienteFormaPago;
	protected JTextField jTextFieldValorCampoGeneralGrupoClienteFormaPago;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteGrupoClienteFormaPago;
	//public JList<Reporte> jListColumnasSelectReporteGrupoClienteFormaPago;
	//public JScrollPane jScrollColumnasSelectReporteGrupoClienteFormaPago;
	
	//public JLabel jLabelRelacionesSelectReporteGrupoClienteFormaPago;
	//public JList<Reporte> jListRelacionesSelectReporteGrupoClienteFormaPago;
	//public JScrollPane jScrollRelacionesSelectReporteGrupoClienteFormaPago;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoGrupoClienteFormaPago;
	//protected JCheckBox jCheckBoxConGraficoDinamicoGrupoClienteFormaPago;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoGrupoClienteFormaPago;
	//public JLabel jLabelTiposArchivoReporteDinamicoGrupoClienteFormaPago;
	
		
	//public JLabel jLabelArchivoImportacionGrupoClienteFormaPago;	
	//public JLabel jLabelPathArchivoImportacionGrupoClienteFormaPago;
	//protected JTextField jTextFieldPathArchivoImportacionGrupoClienteFormaPago;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoGrupoClienteFormaPago;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoGrupoClienteFormaPago;
	
	//public JLabel jLabelColumnaCategoriaValorGrupoClienteFormaPago;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorGrupoClienteFormaPago;
	
	//public JLabel jLabelColumnasValoresGraficoGrupoClienteFormaPago;
	//public JList<Reporte> jListColumnasValoresGraficoGrupoClienteFormaPago;
	//public JScrollPane jScrollColumnasValoresGraficoGrupoClienteFormaPago;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoGrupoClienteFormaPago;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoGrupoClienteFormaPago;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasGrupoClienteFormaPago;
	public JPanel jPanelFK_IdGrupoClienteGrupoClienteFormaPago;
	public JButton jButtonFK_IdGrupoClienteGrupoClienteFormaPago;
	public JPanel jPanelFK_IdTipoFormaPagoGrupoClienteFormaPago;
	public JButton jButtonFK_IdTipoFormaPagoGrupoClienteFormaPago;
	
	public JPanel jPanelid_grupo_clienteFK_IdGrupoClienteGrupoClienteFormaPago;
	public JLabel jLabelid_grupo_clienteFK_IdGrupoClienteGrupoClienteFormaPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_grupo_clienteFK_IdGrupoClienteGrupoClienteFormaPago;
	public JButton jButtonid_grupo_clienteFK_IdGrupoClienteGrupoClienteFormaPago= new JButtonMe();
	public JButton jButtonid_grupo_clienteFK_IdGrupoClienteGrupoClienteFormaPagoUpdate= new JButtonMe();
	public JButton jButtonid_grupo_clienteFK_IdGrupoClienteGrupoClienteFormaPagoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_forma_pagoFK_IdTipoFormaPagoGrupoClienteFormaPago;
	public JLabel jLabelid_tipo_forma_pagoFK_IdTipoFormaPagoGrupoClienteFormaPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoGrupoClienteFormaPago;
	public JButton jButtonid_tipo_forma_pagoFK_IdTipoFormaPagoGrupoClienteFormaPago= new JButtonMe();
	public JButton jButtonid_tipo_forma_pagoFK_IdTipoFormaPagoGrupoClienteFormaPagoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_forma_pagoFK_IdTipoFormaPagoGrupoClienteFormaPagoBusqueda= new JButtonMe();

	
	
	
	
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
	public GrupoClienteFormaPagoJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("GrupoClienteFormaPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public GrupoClienteFormaPagoJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("GrupoClienteFormaPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public GrupoClienteFormaPagoJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("GrupoClienteFormaPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public GrupoClienteFormaPagoJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("GrupoClienteFormaPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionGrupoClienteFormaPago)	{
		this.jButtonRecargarInformacionGrupoClienteFormaPago = jButtonRecargarInformacionGrupoClienteFormaPago;
	}
	
	public JButton getjButtonProcesarInformacionGrupoClienteFormaPago() {
		return this.jButtonProcesarInformacionGrupoClienteFormaPago;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionGrupoClienteFormaPago)	{
		this.jButtonProcesarInformacionGrupoClienteFormaPago = jButtonProcesarInformacionGrupoClienteFormaPago;
	}
	
	
	public JButton getjButtonRecargarInformacionGrupoClienteFormaPago() {
		return this.jButtonRecargarInformacionGrupoClienteFormaPago;
	}
	
	
	public List<GrupoClienteFormaPago> getgrupoclienteformapagos() {
		return this.grupoclienteformapagos;
	}

	public void setgrupoclienteformapagos(List<GrupoClienteFormaPago> grupoclienteformapagos) {
		this.grupoclienteformapagos = grupoclienteformapagos;
	}
	
	public List<GrupoClienteFormaPago> getgrupoclienteformapagosAux() {
		return this.grupoclienteformapagosAux;
	}

	public void setgrupoclienteformapagosAux(List<GrupoClienteFormaPago> grupoclienteformapagosAux) {
		this.grupoclienteformapagosAux = grupoclienteformapagosAux;
	}
	
	public List<GrupoClienteFormaPago> getgrupoclienteformapagosEliminados() {
		return this.grupoclienteformapagosEliminados;
	}

	public void setGrupoClienteFormaPagosEliminados(List<GrupoClienteFormaPago> grupoclienteformapagosEliminados) {
		this.grupoclienteformapagosEliminados = grupoclienteformapagosEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarGrupoClienteFormaPago() {
		return jComboBoxTiposSeleccionarGrupoClienteFormaPago;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarGrupoClienteFormaPago(
			JComboBox jComboBoxTiposSeleccionarGrupoClienteFormaPago) {
		this.jComboBoxTiposSeleccionarGrupoClienteFormaPago = jComboBoxTiposSeleccionarGrupoClienteFormaPago;
	}
	
	public void setBorderResaltarTiposSeleccionarGrupoClienteFormaPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarGrupoClienteFormaPago.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarGrupoClienteFormaPago .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralGrupoClienteFormaPago() {
		return jTextFieldValorCampoGeneralGrupoClienteFormaPago;
	}

	public void setjTextFieldValorCampoGeneralGrupoClienteFormaPago(
			JTextField jTextFieldValorCampoGeneralGrupoClienteFormaPago) {
		this.jTextFieldValorCampoGeneralGrupoClienteFormaPago = jTextFieldValorCampoGeneralGrupoClienteFormaPago;
	}

	public void setBorderResaltarValorCampoGeneralGrupoClienteFormaPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGrupoClienteFormaPago.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralGrupoClienteFormaPago .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosGrupoClienteFormaPago() {
		return this.jCheckBoxSeleccionarTodosGrupoClienteFormaPago;
	}

	public void setjCheckBoxSeleccionarTodosGrupoClienteFormaPago(
			JCheckBox jCheckBoxSeleccionarTodosGrupoClienteFormaPago) {
		this.jCheckBoxSeleccionarTodosGrupoClienteFormaPago = jCheckBoxSeleccionarTodosGrupoClienteFormaPago;
	}

	public void setBorderResaltarSeleccionarTodosGrupoClienteFormaPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGrupoClienteFormaPago.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosGrupoClienteFormaPago .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosGrupoClienteFormaPago() {
		return this.jCheckBoxSeleccionadosGrupoClienteFormaPago;
	}

	public void setjCheckBoxSeleccionadosGrupoClienteFormaPago(
			JCheckBox jCheckBoxSeleccionadosGrupoClienteFormaPago) {
		this.jCheckBoxSeleccionadosGrupoClienteFormaPago = jCheckBoxSeleccionadosGrupoClienteFormaPago;
	}
	
	public void setBorderResaltarSeleccionadosGrupoClienteFormaPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGrupoClienteFormaPago.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosGrupoClienteFormaPago .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesGrupoClienteFormaPago() {
		return this.jComboBoxTiposArchivosReportesGrupoClienteFormaPago;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesGrupoClienteFormaPago(
			JComboBox jComboBoxTiposArchivosReportesGrupoClienteFormaPago) {
		this.jComboBoxTiposArchivosReportesGrupoClienteFormaPago = jComboBoxTiposArchivosReportesGrupoClienteFormaPago;
	}

	public void setBorderResaltarTiposArchivosReportesGrupoClienteFormaPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGrupoClienteFormaPago.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesGrupoClienteFormaPago .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesGrupoClienteFormaPago() {
		return this.jComboBoxTiposReportesGrupoClienteFormaPago;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesGrupoClienteFormaPago(
			JComboBox jComboBoxTiposReportesGrupoClienteFormaPago) {
		this.jComboBoxTiposReportesGrupoClienteFormaPago = jComboBoxTiposReportesGrupoClienteFormaPago;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoGrupoClienteFormaPago() {
	//	return jComboBoxTiposReportesDinamicoGrupoClienteFormaPago;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoGrupoClienteFormaPago(
	//		JComboBox jComboBoxTiposReportesDinamicoGrupoClienteFormaPago) {
	//	this.jComboBoxTiposReportesDinamicoGrupoClienteFormaPago = jComboBoxTiposReportesDinamicoGrupoClienteFormaPago;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoGrupoClienteFormaPago() {
	//	return jComboBoxTiposArchivosReportesDinamicoGrupoClienteFormaPago;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoGrupoClienteFormaPago(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoGrupoClienteFormaPago) {
	//	this.jComboBoxTiposArchivosReportesDinamicoGrupoClienteFormaPago = jComboBoxTiposArchivosReportesDinamicoGrupoClienteFormaPago;
	//}
	
	public void setBorderResaltarTiposReportesGrupoClienteFormaPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGrupoClienteFormaPago.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesGrupoClienteFormaPago .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesGrupoClienteFormaPago() {
		return this.jComboBoxTiposGraficosReportesGrupoClienteFormaPago;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesGrupoClienteFormaPago(
			JComboBox jComboBoxTiposGraficosReportesGrupoClienteFormaPago) {
		this.jComboBoxTiposGraficosReportesGrupoClienteFormaPago = jComboBoxTiposGraficosReportesGrupoClienteFormaPago;
	}
	
	public void setBorderResaltarTiposGraficosReportesGrupoClienteFormaPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGrupoClienteFormaPago.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesGrupoClienteFormaPago .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionGrupoClienteFormaPago() {
		return this.jComboBoxTiposPaginacionGrupoClienteFormaPago;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionGrupoClienteFormaPago(
			JComboBox jComboBoxTiposPaginacionGrupoClienteFormaPago) {
		this.jComboBoxTiposPaginacionGrupoClienteFormaPago = jComboBoxTiposPaginacionGrupoClienteFormaPago;
	}
	
	public void setBorderResaltarTiposPaginacionGrupoClienteFormaPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGrupoClienteFormaPago.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionGrupoClienteFormaPago .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesGrupoClienteFormaPago() {
		return this.jComboBoxTiposRelacionesGrupoClienteFormaPago;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesGrupoClienteFormaPago() {
		return this.jComboBoxTiposAccionesGrupoClienteFormaPago;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesGrupoClienteFormaPago(
			JComboBox jComboBoxTiposRelacionesGrupoClienteFormaPago) {
		this.jComboBoxTiposRelacionesGrupoClienteFormaPago = jComboBoxTiposRelacionesGrupoClienteFormaPago;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesGrupoClienteFormaPago(
			JComboBox jComboBoxTiposAccionesGrupoClienteFormaPago) {
		this.jComboBoxTiposAccionesGrupoClienteFormaPago = jComboBoxTiposAccionesGrupoClienteFormaPago;
	}
	
	public void setBorderResaltarTiposRelacionesGrupoClienteFormaPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGrupoClienteFormaPago.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesGrupoClienteFormaPago .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesGrupoClienteFormaPago() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarGrupoClienteFormaPago.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesGrupoClienteFormaPago .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoGrupoClienteFormaPago() {
	//	return jCheckBoxConGraficoDinamicoGrupoClienteFormaPago;
	//}

	//public void setjCheckBoxConGraficoDinamicoGrupoClienteFormaPago(
	//		JCheckBox jCheckBoxConGraficoDinamicoGrupoClienteFormaPago) {
	//	this.jCheckBoxConGraficoDinamicoGrupoClienteFormaPago = jCheckBoxConGraficoDinamicoGrupoClienteFormaPago;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoGrupoClienteFormaPago() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarGrupoClienteFormaPago.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoGrupoClienteFormaPago .setBorder(borderResaltar);		
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
		this.grupoclienteformapagoSessionBean=new GrupoClienteFormaPagoSessionBean();
		
		this.grupoclienteformapagoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.grupoclienteformapagoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.grupoclienteformapagoSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=GrupoClienteFormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=GrupoClienteFormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		GrupoClienteFormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		GrupoClienteFormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		GrupoClienteFormaPagoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Grupo Cliente Forma Pago MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.grupoclienteformapagoSessionBean.getEsGuardarRelacionado()) {
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
		
		GrupoClienteFormaPagoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("GrupoClienteFormaPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarGrupoClienteFormaPago= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarGrupoClienteFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarGrupoClienteFormaPago,this.jTtoolBarGrupoClienteFormaPago,
							"nuevo","nuevo","Nuevo"+" "+GrupoClienteFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarGrupoClienteFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarGrupoClienteFormaPago,this.jTtoolBarGrupoClienteFormaPago,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarGrupoClienteFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarGrupoClienteFormaPago,this.jTtoolBarGrupoClienteFormaPago,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+GrupoClienteFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarGrupoClienteFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarGrupoClienteFormaPago,this.jTtoolBarGrupoClienteFormaPago,
							"duplicar","duplicar","Duplicar"+" "+GrupoClienteFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarGrupoClienteFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarGrupoClienteFormaPago,this.jTtoolBarGrupoClienteFormaPago,
							"copiar","copiar","Copiar"+" "+GrupoClienteFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarGrupoClienteFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarGrupoClienteFormaPago,this.jTtoolBarGrupoClienteFormaPago,
							"ver_form","ver_form","Ver"+" "+GrupoClienteFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarGrupoClienteFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarGrupoClienteFormaPago,this.jTtoolBarGrupoClienteFormaPago,
							"recargar","recargar","Recargar"+" "+GrupoClienteFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarGrupoClienteFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarGrupoClienteFormaPago,this.jTtoolBarGrupoClienteFormaPago,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarGrupoClienteFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarGrupoClienteFormaPago,this.jTtoolBarGrupoClienteFormaPago,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarGrupoClienteFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarGrupoClienteFormaPago,this.jTtoolBarGrupoClienteFormaPago,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarGrupoClienteFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarGrupoClienteFormaPago,this.jTtoolBarGrupoClienteFormaPago,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarGrupoClienteFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarGrupoClienteFormaPago,this.jTtoolBarGrupoClienteFormaPago,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+GrupoClienteFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarGrupoClienteFormaPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarGrupoClienteFormaPago,this.jTtoolBarGrupoClienteFormaPago,
							"cerrar","cerrar","Salir"+" "+GrupoClienteFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarGrupoClienteFormaPago=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarGrupoClienteFormaPago;
			
				this.jButtonProcesarInformacionToolBarGrupoClienteFormaPago=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarGrupoClienteFormaPago;
				
		//protected JButton jButtonModificarToolBarGrupoClienteFormaPago;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarGrupoClienteFormaPago=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuGrupoClienteFormaPago=new JMenuMe("General");
		this.jmenuArchivoGrupoClienteFormaPago=new JMenuMe("Archivo");
		this.jmenuAccionesGrupoClienteFormaPago=new JMenuMe("Acciones");
		this.jmenuDatosGrupoClienteFormaPago=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoGrupoClienteFormaPago= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoGrupoClienteFormaPago.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGrupoClienteFormaPago,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGrupoClienteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarGrupoClienteFormaPago= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarGrupoClienteFormaPago.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarGrupoClienteFormaPago,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarGrupoClienteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesGrupoClienteFormaPago= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesGrupoClienteFormaPago.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesGrupoClienteFormaPago,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesGrupoClienteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosGrupoClienteFormaPago= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosGrupoClienteFormaPago.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosGrupoClienteFormaPago,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosGrupoClienteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarGrupoClienteFormaPago= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarGrupoClienteFormaPago.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarGrupoClienteFormaPago,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarGrupoClienteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormGrupoClienteFormaPago= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormGrupoClienteFormaPago.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormGrupoClienteFormaPago,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormGrupoClienteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaGrupoClienteFormaPago= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaGrupoClienteFormaPago.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaGrupoClienteFormaPago,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaGrupoClienteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarGrupoClienteFormaPago= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarGrupoClienteFormaPago.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarGrupoClienteFormaPago,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarGrupoClienteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionGrupoClienteFormaPago= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionGrupoClienteFormaPago.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionGrupoClienteFormaPago,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionGrupoClienteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionGrupoClienteFormaPago= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionGrupoClienteFormaPago.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionGrupoClienteFormaPago,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresGrupoClienteFormaPago= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresGrupoClienteFormaPago.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresGrupoClienteFormaPago,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresGrupoClienteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesGrupoClienteFormaPago= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesGrupoClienteFormaPago.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesGrupoClienteFormaPago,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesGrupoClienteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByGrupoClienteFormaPago= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByGrupoClienteFormaPago.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByGrupoClienteFormaPago,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByGrupoClienteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarGrupoClienteFormaPago= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarGrupoClienteFormaPago.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarGrupoClienteFormaPago,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarGrupoClienteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByGrupoClienteFormaPago= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByGrupoClienteFormaPago.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByGrupoClienteFormaPago,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByGrupoClienteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarGrupoClienteFormaPago= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarGrupoClienteFormaPago.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarGrupoClienteFormaPago,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarGrupoClienteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosGrupoClienteFormaPago= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosGrupoClienteFormaPago.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosGrupoClienteFormaPago,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosGrupoClienteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoGrupoClienteFormaPago.add(this.jMenuItemCerrarGrupoClienteFormaPago);
			
			this.jmenuAccionesGrupoClienteFormaPago.add(this.jMenuItemNuevoGrupoClienteFormaPago);
			this.jmenuAccionesGrupoClienteFormaPago.add(this.jMenuItemNuevoGuardarCambiosGrupoClienteFormaPago);
			this.jmenuAccionesGrupoClienteFormaPago.add(this.jMenuItemNuevoRelacionesGrupoClienteFormaPago);
			this.jmenuAccionesGrupoClienteFormaPago.add(this.jMenuItemGuardarCambiosTablaGrupoClienteFormaPago);		
			this.jmenuAccionesGrupoClienteFormaPago.add(this.jMenuItemDuplicarGrupoClienteFormaPago);		
			this.jmenuAccionesGrupoClienteFormaPago.add(this.jMenuItemCopiarGrupoClienteFormaPago);		
			this.jmenuAccionesGrupoClienteFormaPago.add(this.jMenuItemVerFormGrupoClienteFormaPago);		
			
			this.jmenuDatosGrupoClienteFormaPago.add(this.jMenuItemRecargarInformacionGrupoClienteFormaPago);				
			this.jmenuDatosGrupoClienteFormaPago.add(this.jMenuItemAnterioresGrupoClienteFormaPago);				
			this.jmenuDatosGrupoClienteFormaPago.add(this.jMenuItemSiguientesGrupoClienteFormaPago);				
			this.jmenuDatosGrupoClienteFormaPago.add(this.jMenuItemAbrirOrderByGrupoClienteFormaPago);				
			this.jmenuDatosGrupoClienteFormaPago.add(this.jMenuItemMostrarOcultarGrupoClienteFormaPago);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesGrupoClienteFormaPago.add(this.jMenuItemGuardarCambiosGrupoClienteFormaPago);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoGrupoClienteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesGrupoClienteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosGrupoClienteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarGrupoClienteFormaPago.add(this.jmenuArchivoGrupoClienteFormaPago);		
			this.jmenuBarGrupoClienteFormaPago.add(this.jmenuAccionesGrupoClienteFormaPago);		
			this.jmenuBarGrupoClienteFormaPago.add(this.jmenuDatosGrupoClienteFormaPago);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarGrupoClienteFormaPago);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasGrupoClienteFormaPago() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdGrupoClienteGrupoClienteFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdGrupoClienteGrupoClienteFormaPago.setToolTipText("Buscar Por Grupo Cliente ");
		this.jButtonFK_IdGrupoClienteGrupoClienteFormaPago= new JButtonMe();
		this.jButtonFK_IdGrupoClienteGrupoClienteFormaPago.setText("Buscar");
		this.jButtonFK_IdGrupoClienteGrupoClienteFormaPago.setToolTipText("Buscar Por Grupo Cliente ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdGrupoClienteGrupoClienteFormaPago,"buscar_button","Buscar Por Grupo Cliente ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdGrupoClienteGrupoClienteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_grupo_clienteFK_IdGrupoClienteGrupoClienteFormaPago = new JLabelMe();
		jLabelid_grupo_clienteFK_IdGrupoClienteGrupoClienteFormaPago.setText("Grupo Cliente :");
		jLabelid_grupo_clienteFK_IdGrupoClienteGrupoClienteFormaPago.setToolTipText("Grupo Cliente");
		jLabelid_grupo_clienteFK_IdGrupoClienteGrupoClienteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_grupo_clienteFK_IdGrupoClienteGrupoClienteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_grupo_clienteFK_IdGrupoClienteGrupoClienteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_grupo_clienteFK_IdGrupoClienteGrupoClienteFormaPago,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_grupo_clienteFK_IdGrupoClienteGrupoClienteFormaPago= new JComboBoxMe();
		jComboBoxid_grupo_clienteFK_IdGrupoClienteGrupoClienteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_grupo_clienteFK_IdGrupoClienteGrupoClienteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_grupo_clienteFK_IdGrupoClienteGrupoClienteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_grupo_clienteFK_IdGrupoClienteGrupoClienteFormaPago,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelFK_IdTipoFormaPagoGrupoClienteFormaPago=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoFormaPagoGrupoClienteFormaPago.setToolTipText("Buscar Por T. Forma Pago ");
		this.jButtonFK_IdTipoFormaPagoGrupoClienteFormaPago= new JButtonMe();
		this.jButtonFK_IdTipoFormaPagoGrupoClienteFormaPago.setText("Buscar");
		this.jButtonFK_IdTipoFormaPagoGrupoClienteFormaPago.setToolTipText("Buscar Por T. Forma Pago ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoFormaPagoGrupoClienteFormaPago,"buscar_button","Buscar Por T. Forma Pago ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoFormaPagoGrupoClienteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_forma_pagoFK_IdTipoFormaPagoGrupoClienteFormaPago = new JLabelMe();
		jLabelid_tipo_forma_pagoFK_IdTipoFormaPagoGrupoClienteFormaPago.setText("T. Forma Pago :");
		jLabelid_tipo_forma_pagoFK_IdTipoFormaPagoGrupoClienteFormaPago.setToolTipText("T. Forma Pago");
		jLabelid_tipo_forma_pagoFK_IdTipoFormaPagoGrupoClienteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_forma_pagoFK_IdTipoFormaPagoGrupoClienteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_forma_pagoFK_IdTipoFormaPagoGrupoClienteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_forma_pagoFK_IdTipoFormaPagoGrupoClienteFormaPago,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoGrupoClienteFormaPago= new JComboBoxMe();
		jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoGrupoClienteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoGrupoClienteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoGrupoClienteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoGrupoClienteFormaPago,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasGrupoClienteFormaPago=new JTabbedPane();


		this.jTabbedPaneBusquedasGrupoClienteFormaPago.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasGrupoClienteFormaPago.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasGrupoClienteFormaPago.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasGrupoClienteFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasGrupoClienteFormaPago.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasGrupoClienteFormaPago,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleGrupoClienteFormaPago = new GrupoClienteFormaPagoDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Grupo Cliente Forma Pago DATOS");
			this.jInternalFrameDetalleFormGrupoClienteFormaPago = new GrupoClienteFormaPagoDetalleFormJInternalFrame(jDesktopPane,this.grupoclienteformapagoSessionBean.getConGuardarRelaciones(),this.grupoclienteformapagoSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormGrupoClienteFormaPago = null;//new GrupoClienteFormaPagoDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutGrupoClienteFormaPago= new GridBagLayout();
		
		
		this.jTableDatosGrupoClienteFormaPago = new JTableMe();      
		
		String sToolTipGrupoClienteFormaPago="";
		sToolTipGrupoClienteFormaPago=GrupoClienteFormaPagoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipGrupoClienteFormaPago+="(PuntoVenta.GrupoClienteFormaPago)";
		}
		
		if(!this.grupoclienteformapagoSessionBean.getEsGuardarRelacionado()) {
			sToolTipGrupoClienteFormaPago+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosGrupoClienteFormaPago.setToolTipText(sToolTipGrupoClienteFormaPago);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosGrupoClienteFormaPago);
		this.jTableDatosGrupoClienteFormaPago.setAutoCreateRowSorter(true);
		this.jTableDatosGrupoClienteFormaPago.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosGrupoClienteFormaPago.setRowSelectionAllowed(true);
		this.jTableDatosGrupoClienteFormaPago.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosGrupoClienteFormaPago,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoGrupoClienteFormaPago = new JButtonMe();
		this.jButtonDuplicarGrupoClienteFormaPago = new JButtonMe();
		this.jButtonCopiarGrupoClienteFormaPago = new JButtonMe();
		this.jButtonVerFormGrupoClienteFormaPago = new JButtonMe();
		this.jButtonNuevoRelacionesGrupoClienteFormaPago = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaGrupoClienteFormaPago = new JButtonMe();
		this.jButtonCerrarGrupoClienteFormaPago = new JButtonMe();
		
		this.jScrollPanelDatosGrupoClienteFormaPago = new JScrollPane();   
        this.jScrollPanelDatosGeneralGrupoClienteFormaPago = new JScrollPane();
		
				
		
		
		this.jPanelAccionesGrupoClienteFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Grupo Cliente Forma Pago";
		
		if(!this.grupoclienteformapagoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosGrupoClienteFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Grupo Cliente Forma Pagos" + this.sPath));
		} else {
			this.jScrollPanelDatosGrupoClienteFormaPago.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralGrupoClienteFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesGrupoClienteFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesGrupoClienteFormaPago.setToolTipText("Acciones");
        this.jPanelAccionesGrupoClienteFormaPago.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralGrupoClienteFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGrupoClienteFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoGrupoClienteFormaPago=new ReporteDinamicoJInternalFrame(GrupoClienteFormaPagoConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoGrupoClienteFormaPago();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionGrupoClienteFormaPago=new ImportacionJInternalFrame(GrupoClienteFormaPagoConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionGrupoClienteFormaPago();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByGrupoClienteFormaPago = new JButtonMe();
		
		this.jButtonAbrirOrderByGrupoClienteFormaPago.setText("Orden");
		this.jButtonAbrirOrderByGrupoClienteFormaPago.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByGrupoClienteFormaPago,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByGrupoClienteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByGrupoClienteFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByGrupoClienteFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByGrupoClienteFormaPago=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByGrupoClienteFormaPago,false,this);
			
			//this.cargarOrderByGrupoClienteFormaPago(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByGrupoClienteFormaPago=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByGrupoClienteFormaPago,true,this);
			
			//this.cargarOrderByGrupoClienteFormaPago(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosGrupoClienteFormaPago.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosGrupoClienteFormaPago.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosGrupoClienteFormaPago.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosGrupoClienteFormaPago.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosGrupoClienteFormaPago.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosGrupoClienteFormaPago.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoGrupoClienteFormaPago.setText("Nuevo");
		this.jButtonDuplicarGrupoClienteFormaPago.setText("Duplicar");
		this.jButtonCopiarGrupoClienteFormaPago.setText("Copiar");
		this.jButtonVerFormGrupoClienteFormaPago.setText("Ver");
		this.jButtonNuevoRelacionesGrupoClienteFormaPago.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaGrupoClienteFormaPago.setText("Guardar");
		this.jButtonCerrarGrupoClienteFormaPago.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGrupoClienteFormaPago,"nuevo_button","Nuevo",this.grupoclienteformapagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarGrupoClienteFormaPago,"duplicar_button","Duplicar",this.grupoclienteformapagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarGrupoClienteFormaPago,"copiar_button","Copiar",this.grupoclienteformapagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormGrupoClienteFormaPago,"ver_form","Ver",this.grupoclienteformapagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesGrupoClienteFormaPago,"nuevorelaciones_button","Nuevo Rel",this.grupoclienteformapagoSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaGrupoClienteFormaPago,"guardarcambiostabla_button","Guardar",this.grupoclienteformapagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarGrupoClienteFormaPago,"cerrar_button","Salir",this.grupoclienteformapagoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoGrupoClienteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarGrupoClienteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarGrupoClienteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormGrupoClienteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesGrupoClienteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaGrupoClienteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarGrupoClienteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoGrupoClienteFormaPago.setToolTipText("Nuevo"+" "+GrupoClienteFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarGrupoClienteFormaPago.setToolTipText("Duplicar"+" "+GrupoClienteFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarGrupoClienteFormaPago.setToolTipText("Copiar"+" "+GrupoClienteFormaPagoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormGrupoClienteFormaPago.setToolTipText("Ver"+" "+GrupoClienteFormaPagoConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesGrupoClienteFormaPago.setToolTipText("Nuevo Rel"+" "+GrupoClienteFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaGrupoClienteFormaPago.setToolTipText("Guardar"+" "+GrupoClienteFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarGrupoClienteFormaPago.setToolTipText("Salir"+" "+GrupoClienteFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoGrupoClienteFormaPago";
		inputMap = this.jButtonNuevoGrupoClienteFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoGrupoClienteFormaPago.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoGrupoClienteFormaPago"));
		
		//DUPLICAR
		sMapKey = "DuplicarGrupoClienteFormaPago";
		inputMap = this.jButtonDuplicarGrupoClienteFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarGrupoClienteFormaPago.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarGrupoClienteFormaPago"));
		
		//COPIAR
		sMapKey = "CopiarGrupoClienteFormaPago";
		inputMap = this.jButtonCopiarGrupoClienteFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarGrupoClienteFormaPago.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarGrupoClienteFormaPago"));
		
		//VEr FORM
		sMapKey = "VerFormGrupoClienteFormaPago";
		inputMap = this.jButtonVerFormGrupoClienteFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormGrupoClienteFormaPago.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormGrupoClienteFormaPago"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesGrupoClienteFormaPago";
		inputMap = this.jButtonNuevoRelacionesGrupoClienteFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesGrupoClienteFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesGrupoClienteFormaPago"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarGrupoClienteFormaPago";
		inputMap = this.jButtonModificarGrupoClienteFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarGrupoClienteFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarGrupoClienteFormaPago"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarGrupoClienteFormaPago";
		inputMap = this.jButtonCerrarGrupoClienteFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarGrupoClienteFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarGrupoClienteFormaPago"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaGrupoClienteFormaPago";
		inputMap = this.jButtonGuardarCambiosTablaGrupoClienteFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaGrupoClienteFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaGrupoClienteFormaPago"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesGrupoClienteFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesGrupoClienteFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionGrupoClienteFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1GrupoClienteFormaPago= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2GrupoClienteFormaPago= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3GrupoClienteFormaPago= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4GrupoClienteFormaPago= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5GrupoClienteFormaPago= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesGrupoClienteFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesGrupoClienteFormaPago.setName("jPanelParametrosReportesGrupoClienteFormaPago"); 
		
		this.jPanelParametrosReportesAccionesGrupoClienteFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesGrupoClienteFormaPago.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesGrupoClienteFormaPago.setName("jPanelParametrosReportesAccionesGrupoClienteFormaPago"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesGrupoClienteFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesGrupoClienteFormaPago, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionGrupoClienteFormaPago = new JButtonMe();
		this.jButtonRecargarInformacionGrupoClienteFormaPago.setText("Recargar");
		this.jButtonRecargarInformacionGrupoClienteFormaPago.setToolTipText("Recargar"+" "+GrupoClienteFormaPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionGrupoClienteFormaPago,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionGrupoClienteFormaPago = new JButtonMe();
		this.jButtonProcesarInformacionGrupoClienteFormaPago.setText("Procesar");
		this.jButtonProcesarInformacionGrupoClienteFormaPago.setToolTipText("Procesar"+" "+GrupoClienteFormaPagoConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionGrupoClienteFormaPago.setVisible(false);
			
		this.jButtonProcesarInformacionGrupoClienteFormaPago.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionGrupoClienteFormaPago.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionGrupoClienteFormaPago.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesGrupoClienteFormaPago = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesGrupoClienteFormaPago.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesGrupoClienteFormaPago.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesGrupoClienteFormaPago = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesGrupoClienteFormaPago.setText("TIPO");       
		this.jComboBoxTiposReportesGrupoClienteFormaPago.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesGrupoClienteFormaPago = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesGrupoClienteFormaPago.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesGrupoClienteFormaPago.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionGrupoClienteFormaPago = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionGrupoClienteFormaPago.setText("Paginacion");
		this.jComboBoxTiposPaginacionGrupoClienteFormaPago.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesGrupoClienteFormaPago = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesGrupoClienteFormaPago.setText("Accion");
		this.jComboBoxTiposRelacionesGrupoClienteFormaPago.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesGrupoClienteFormaPago = new JComboBoxMe();
		//this.jComboBoxTiposAccionesGrupoClienteFormaPago.setText("Accion");
		this.jComboBoxTiposAccionesGrupoClienteFormaPago.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarGrupoClienteFormaPago = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarGrupoClienteFormaPago.setText("Accion");
		this.jComboBoxTiposSeleccionarGrupoClienteFormaPago.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralGrupoClienteFormaPago=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralGrupoClienteFormaPago.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralGrupoClienteFormaPago.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralGrupoClienteFormaPago.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesGrupoClienteFormaPago = new JLabelMe();
		
		this.jLabelAccionesGrupoClienteFormaPago.setText("Acciones");		
		this.jLabelAccionesGrupoClienteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesGrupoClienteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesGrupoClienteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosGrupoClienteFormaPago = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosGrupoClienteFormaPago.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosGrupoClienteFormaPago.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosGrupoClienteFormaPago = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosGrupoClienteFormaPago.setText("Seleccionados");
		this.jCheckBoxSeleccionadosGrupoClienteFormaPago.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaGrupoClienteFormaPago = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaGrupoClienteFormaPago.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaGrupoClienteFormaPago.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteGrupoClienteFormaPago = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteGrupoClienteFormaPago.setText("Graf.");
		this.jCheckBoxConGraficoReporteGrupoClienteFormaPago.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresGrupoClienteFormaPago = new JButtonMe();
		//this.jButtonAnterioresGrupoClienteFormaPago.setText("<<");
        this.jButtonAnterioresGrupoClienteFormaPago.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresGrupoClienteFormaPago,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresGrupoClienteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesGrupoClienteFormaPago = new JButtonMe();
		//this.jButtonSiguientesGrupoClienteFormaPago.setText(">>");
        this.jButtonSiguientesGrupoClienteFormaPago.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesGrupoClienteFormaPago,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesGrupoClienteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosGrupoClienteFormaPago = new JButtonMe();
		this.jButtonNuevoGuardarCambiosGrupoClienteFormaPago.setText("Nue");
        this.jButtonNuevoGuardarCambiosGrupoClienteFormaPago.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosGrupoClienteFormaPago,"nuevoguardarcambios_button","Nue",this.grupoclienteformapagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosGrupoClienteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosGrupoClienteFormaPago";
		inputMap = this.jButtonNuevoGuardarCambiosGrupoClienteFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosGrupoClienteFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosGrupoClienteFormaPago"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionGrupoClienteFormaPago";
		inputMap = this.jButtonRecargarInformacionGrupoClienteFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionGrupoClienteFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionGrupoClienteFormaPago"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesGrupoClienteFormaPago";
		inputMap = this.jButtonSiguientesGrupoClienteFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesGrupoClienteFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesGrupoClienteFormaPago"));
		
		//ANTERIORES		
		sMapKey = "AnterioresGrupoClienteFormaPago";
		inputMap = this.jButtonAnterioresGrupoClienteFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresGrupoClienteFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresGrupoClienteFormaPago"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasGrupoClienteFormaPago();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesGrupoClienteFormaPago.setMinimumSize(new Dimension(this.getWidth(),GrupoClienteFormaPagoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(GrupoClienteFormaPagoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesGrupoClienteFormaPago.setMaximumSize(new Dimension(this.getWidth(),GrupoClienteFormaPagoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(GrupoClienteFormaPagoBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesGrupoClienteFormaPago.setPreferredSize(new Dimension(this.getWidth(),GrupoClienteFormaPagoBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(GrupoClienteFormaPagoBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionGrupoClienteFormaPago = new GridBagLayout();

			this.jPanelPaginacionGrupoClienteFormaPago.setLayout(gridaBagLayoutPaginacionGrupoClienteFormaPago);						
			
			this.gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
			this.gridBagConstraintsGrupoClienteFormaPago.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsGrupoClienteFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGrupoClienteFormaPago.gridy = 0;
			this.gridBagConstraintsGrupoClienteFormaPago.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionGrupoClienteFormaPago.add(this.jButtonAnterioresGrupoClienteFormaPago, this.gridBagConstraintsGrupoClienteFormaPago);
					
						
			this.gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
			this.gridBagConstraintsGrupoClienteFormaPago.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsGrupoClienteFormaPago.gridy = 0;
			
			this.jPanelPaginacionGrupoClienteFormaPago.add(this.jButtonNuevoGuardarCambiosGrupoClienteFormaPago, this.gridBagConstraintsGrupoClienteFormaPago);
						
			
			this.gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
			this.gridBagConstraintsGrupoClienteFormaPago.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsGrupoClienteFormaPago.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsGrupoClienteFormaPago.gridy = 0;
			this.jPanelPaginacionGrupoClienteFormaPago.add(this.jButtonSiguientesGrupoClienteFormaPago, this.gridBagConstraintsGrupoClienteFormaPago);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
			this.gridBagConstraintsGrupoClienteFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGrupoClienteFormaPago.gridy = 1;
			this.gridBagConstraintsGrupoClienteFormaPago.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionGrupoClienteFormaPago.add(this.jButtonNuevoGrupoClienteFormaPago, this.gridBagConstraintsGrupoClienteFormaPago);
						
			
			
			if(!this.grupoclienteformapagoSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
				this.gridBagConstraintsGrupoClienteFormaPago.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsGrupoClienteFormaPago.gridy = 1;
				this.gridBagConstraintsGrupoClienteFormaPago.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionGrupoClienteFormaPago.add(this.jButtonGuardarCambiosTablaGrupoClienteFormaPago, this.gridBagConstraintsGrupoClienteFormaPago);
			}
			
			
			
			this.gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
			this.gridBagConstraintsGrupoClienteFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGrupoClienteFormaPago.gridy = 1;
			this.gridBagConstraintsGrupoClienteFormaPago.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionGrupoClienteFormaPago.add(this.jButtonDuplicarGrupoClienteFormaPago, this.gridBagConstraintsGrupoClienteFormaPago);
			
			this.gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
			this.gridBagConstraintsGrupoClienteFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGrupoClienteFormaPago.gridy = 1;
			this.gridBagConstraintsGrupoClienteFormaPago.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionGrupoClienteFormaPago.add(this.jButtonCopiarGrupoClienteFormaPago, this.gridBagConstraintsGrupoClienteFormaPago);
		
			this.gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
			this.gridBagConstraintsGrupoClienteFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGrupoClienteFormaPago.gridy = 1;
			this.gridBagConstraintsGrupoClienteFormaPago.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionGrupoClienteFormaPago.add(this.jButtonVerFormGrupoClienteFormaPago, this.gridBagConstraintsGrupoClienteFormaPago);
		
			this.gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
			this.gridBagConstraintsGrupoClienteFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGrupoClienteFormaPago.gridy = 1;
			this.gridBagConstraintsGrupoClienteFormaPago.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionGrupoClienteFormaPago.add(this.jButtonCerrarGrupoClienteFormaPago, this.gridBagConstraintsGrupoClienteFormaPago);
		
		
		
		this.jButtonRecargarInformacionGrupoClienteFormaPago.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionGrupoClienteFormaPago.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionGrupoClienteFormaPago.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionGrupoClienteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesGrupoClienteFormaPago.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesGrupoClienteFormaPago.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesGrupoClienteFormaPago.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesGrupoClienteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesGrupoClienteFormaPago.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesGrupoClienteFormaPago.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesGrupoClienteFormaPago.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesGrupoClienteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesGrupoClienteFormaPago.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesGrupoClienteFormaPago.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesGrupoClienteFormaPago.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesGrupoClienteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionGrupoClienteFormaPago.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionGrupoClienteFormaPago.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionGrupoClienteFormaPago.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionGrupoClienteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesGrupoClienteFormaPago.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesGrupoClienteFormaPago.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesGrupoClienteFormaPago.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesGrupoClienteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesGrupoClienteFormaPago.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesGrupoClienteFormaPago.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesGrupoClienteFormaPago.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesGrupoClienteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarGrupoClienteFormaPago.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarGrupoClienteFormaPago.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarGrupoClienteFormaPago.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarGrupoClienteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaGrupoClienteFormaPago.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaGrupoClienteFormaPago.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaGrupoClienteFormaPago.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaGrupoClienteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteGrupoClienteFormaPago.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteGrupoClienteFormaPago.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteGrupoClienteFormaPago.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteGrupoClienteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosGrupoClienteFormaPago.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosGrupoClienteFormaPago.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosGrupoClienteFormaPago.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosGrupoClienteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosGrupoClienteFormaPago.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosGrupoClienteFormaPago.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosGrupoClienteFormaPago.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosGrupoClienteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesGrupoClienteFormaPago = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesGrupoClienteFormaPago = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1GrupoClienteFormaPago = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2GrupoClienteFormaPago = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3GrupoClienteFormaPago = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4GrupoClienteFormaPago = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesGrupoClienteFormaPago.setLayout(gridaBagParametrosReportesGrupoClienteFormaPago);
			this.jPanelParametrosReportesAccionesGrupoClienteFormaPago.setLayout(gridaBagParametrosReportesAccionesGrupoClienteFormaPago);
			
			
			this.jPanelParametrosAuxiliar1GrupoClienteFormaPago.setLayout(gridaBagParametrosAuxiliar1GrupoClienteFormaPago);
			this.jPanelParametrosAuxiliar2GrupoClienteFormaPago.setLayout(gridaBagParametrosAuxiliar2GrupoClienteFormaPago);
			this.jPanelParametrosAuxiliar3GrupoClienteFormaPago.setLayout(gridaBagParametrosAuxiliar3GrupoClienteFormaPago);
			this.jPanelParametrosAuxiliar4GrupoClienteFormaPago.setLayout(gridaBagParametrosAuxiliar4GrupoClienteFormaPago);
			//this.jPanelParametrosAuxiliar5GrupoClienteFormaPago.setLayout(gridaBagParametrosAuxiliar2GrupoClienteFormaPago);			
			
			
			
			
			this.gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
			this.gridBagConstraintsGrupoClienteFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGrupoClienteFormaPago.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsGrupoClienteFormaPago.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesGrupoClienteFormaPago.add(this.jButtonRecargarInformacionGrupoClienteFormaPago, this.gridBagConstraintsGrupoClienteFormaPago);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
			this.gridBagConstraintsGrupoClienteFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGrupoClienteFormaPago.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsGrupoClienteFormaPago.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1GrupoClienteFormaPago.add(this.jComboBoxTiposPaginacionGrupoClienteFormaPago, this.gridBagConstraintsGrupoClienteFormaPago);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
			this.gridBagConstraintsGrupoClienteFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGrupoClienteFormaPago.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsGrupoClienteFormaPago.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1GrupoClienteFormaPago.add(this.jCheckBoxConAltoMaximoTablaGrupoClienteFormaPago, this.gridBagConstraintsGrupoClienteFormaPago);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
			this.gridBagConstraintsGrupoClienteFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGrupoClienteFormaPago.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsGrupoClienteFormaPago.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1GrupoClienteFormaPago.add(this.jComboBoxTiposArchivosReportesGrupoClienteFormaPago, this.gridBagConstraintsGrupoClienteFormaPago);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
			this.gridBagConstraintsGrupoClienteFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGrupoClienteFormaPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGrupoClienteFormaPago.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesGrupoClienteFormaPago.add(this.jPanelParametrosAuxiliar1GrupoClienteFormaPago, this.gridBagConstraintsGrupoClienteFormaPago);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
			this.gridBagConstraintsGrupoClienteFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGrupoClienteFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGrupoClienteFormaPago.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsGrupoClienteFormaPago.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4GrupoClienteFormaPago.add(this.jComboBoxTiposReportesGrupoClienteFormaPago, this.gridBagConstraintsGrupoClienteFormaPago);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
			this.gridBagConstraintsGrupoClienteFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGrupoClienteFormaPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGrupoClienteFormaPago.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesGrupoClienteFormaPago.add(this.jPanelParametrosAuxiliar4GrupoClienteFormaPago, this.gridBagConstraintsGrupoClienteFormaPago);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
			this.gridBagConstraintsGrupoClienteFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGrupoClienteFormaPago.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsGrupoClienteFormaPago.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesGrupoClienteFormaPago.add(this.jComboBoxTiposReportesGrupoClienteFormaPago, this.gridBagConstraintsGrupoClienteFormaPago);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
			this.gridBagConstraintsGrupoClienteFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGrupoClienteFormaPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGrupoClienteFormaPago.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesGrupoClienteFormaPago.add(this.jCheckBoxGenerarReporteGrupoClienteFormaPago, this.gridBagConstraintsGrupoClienteFormaPago);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
			this.gridBagConstraintsGrupoClienteFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGrupoClienteFormaPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGrupoClienteFormaPago.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesGrupoClienteFormaPago.add(this.jPanelParametrosAuxiliar2GrupoClienteFormaPago, this.gridBagConstraintsGrupoClienteFormaPago);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
			this.gridBagConstraintsGrupoClienteFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGrupoClienteFormaPago.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsGrupoClienteFormaPago.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesGrupoClienteFormaPago.add(this.jLabelAccionesGrupoClienteFormaPago, this.gridBagConstraintsGrupoClienteFormaPago);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
				this.gridBagConstraintsGrupoClienteFormaPago.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsGrupoClienteFormaPago.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsGrupoClienteFormaPago.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesGrupoClienteFormaPago.add(this.jButtonAbrirOrderByGrupoClienteFormaPago, this.gridBagConstraintsGrupoClienteFormaPago);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
			this.gridBagConstraintsGrupoClienteFormaPago.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsGrupoClienteFormaPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGrupoClienteFormaPago.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesGrupoClienteFormaPago.add(this.jComboBoxTiposSeleccionarGrupoClienteFormaPago, this.gridBagConstraintsGrupoClienteFormaPago);			
			
			
			/*
			this.gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
			this.gridBagConstraintsGrupoClienteFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGrupoClienteFormaPago.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsGrupoClienteFormaPago.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesGrupoClienteFormaPago.add(this.jCheckBoxSeleccionarTodosGrupoClienteFormaPago, this.gridBagConstraintsGrupoClienteFormaPago);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
			this.gridBagConstraintsGrupoClienteFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGrupoClienteFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGrupoClienteFormaPago.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsGrupoClienteFormaPago.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3GrupoClienteFormaPago.add(this.jCheckBoxSeleccionarTodosGrupoClienteFormaPago, this.gridBagConstraintsGrupoClienteFormaPago);															
				
			this.gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
			this.gridBagConstraintsGrupoClienteFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGrupoClienteFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGrupoClienteFormaPago.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsGrupoClienteFormaPago.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3GrupoClienteFormaPago.add(this.jCheckBoxSeleccionadosGrupoClienteFormaPago, this.gridBagConstraintsGrupoClienteFormaPago);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
			this.gridBagConstraintsGrupoClienteFormaPago.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsGrupoClienteFormaPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGrupoClienteFormaPago.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesGrupoClienteFormaPago.add(this.jPanelParametrosAuxiliar3GrupoClienteFormaPago, this.gridBagConstraintsGrupoClienteFormaPago);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
			this.gridBagConstraintsGrupoClienteFormaPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGrupoClienteFormaPago.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesGrupoClienteFormaPago.add(this.jComboBoxTiposAccionesGrupoClienteFormaPago, this.gridBagConstraintsGrupoClienteFormaPago);
	
				
			this.gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
			this.gridBagConstraintsGrupoClienteFormaPago.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsGrupoClienteFormaPago.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesGrupoClienteFormaPago.add(this.jTextFieldValorCampoGeneralGrupoClienteFormaPago, this.gridBagConstraintsGrupoClienteFormaPago);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosGrupoClienteFormaPago = new GridBagLayout();

			this.jScrollPanelDatosGrupoClienteFormaPago.setLayout(gridaBagLayoutDatosGrupoClienteFormaPago);
			
			this.gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
			this.gridBagConstraintsGrupoClienteFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGrupoClienteFormaPago.gridy = 0;
			this.gridBagConstraintsGrupoClienteFormaPago.gridx = 0;
			
			this.jScrollPanelDatosGrupoClienteFormaPago.add(this.jTableDatosGrupoClienteFormaPago, this.gridBagConstraintsGrupoClienteFormaPago);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosGrupoClienteFormaPago.setViewportView(this.jTableDatosGrupoClienteFormaPago);
		this.jTableDatosGrupoClienteFormaPago.setFillsViewportHeight(true);
		this.jTableDatosGrupoClienteFormaPago.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesGrupoClienteFormaPago= new GridBagLayout();
		this.jPanelAccionesGrupoClienteFormaPago.setLayout(gridaBagLayoutAccionesGrupoClienteFormaPago);
		
		
		/*	
		this.gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
		this.gridBagConstraintsGrupoClienteFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGrupoClienteFormaPago.gridy = 0;
		this.gridBagConstraintsGrupoClienteFormaPago.gridx = 0;
			
		this.jPanelAccionesGrupoClienteFormaPago.add(this.jButtonNuevoGrupoClienteFormaPago, this.gridBagConstraintsGrupoClienteFormaPago);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdGrupoClienteGrupoClienteFormaPago= new GridBagLayout();
		gridaBagLayoutFK_IdGrupoClienteGrupoClienteFormaPago.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdGrupoClienteGrupoClienteFormaPago.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdGrupoClienteGrupoClienteFormaPago.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdGrupoClienteGrupoClienteFormaPago.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdGrupoClienteGrupoClienteFormaPago.setLayout(gridaBagLayoutFK_IdGrupoClienteGrupoClienteFormaPago);

		gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
		gridBagConstraintsGrupoClienteFormaPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGrupoClienteFormaPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGrupoClienteFormaPago.gridy = 0;
		gridBagConstraintsGrupoClienteFormaPago.gridx = 0;
		jPanelFK_IdGrupoClienteGrupoClienteFormaPago.add(jLabelid_grupo_clienteFK_IdGrupoClienteGrupoClienteFormaPago, gridBagConstraintsGrupoClienteFormaPago);

		gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
		gridBagConstraintsGrupoClienteFormaPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGrupoClienteFormaPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGrupoClienteFormaPago.gridy = 0;
		gridBagConstraintsGrupoClienteFormaPago.gridx = 1;
		jPanelFK_IdGrupoClienteGrupoClienteFormaPago.add(jComboBoxid_grupo_clienteFK_IdGrupoClienteGrupoClienteFormaPago, gridBagConstraintsGrupoClienteFormaPago);

		gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
		gridBagConstraintsGrupoClienteFormaPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGrupoClienteFormaPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGrupoClienteFormaPago.gridy = 1;
		gridBagConstraintsGrupoClienteFormaPago.gridx =1;
		jPanelFK_IdGrupoClienteGrupoClienteFormaPago.add(jButtonFK_IdGrupoClienteGrupoClienteFormaPago, gridBagConstraintsGrupoClienteFormaPago);

		jTabbedPaneBusquedasGrupoClienteFormaPago.addTab("1.-Por Grupo Cliente ", jPanelFK_IdGrupoClienteGrupoClienteFormaPago);
		jTabbedPaneBusquedasGrupoClienteFormaPago.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutFK_IdTipoFormaPagoGrupoClienteFormaPago= new GridBagLayout();
		gridaBagLayoutFK_IdTipoFormaPagoGrupoClienteFormaPago.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoFormaPagoGrupoClienteFormaPago.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoFormaPagoGrupoClienteFormaPago.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoFormaPagoGrupoClienteFormaPago.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoFormaPagoGrupoClienteFormaPago.setLayout(gridaBagLayoutFK_IdTipoFormaPagoGrupoClienteFormaPago);

		gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
		gridBagConstraintsGrupoClienteFormaPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGrupoClienteFormaPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGrupoClienteFormaPago.gridy = 0;
		gridBagConstraintsGrupoClienteFormaPago.gridx = 0;
		jPanelFK_IdTipoFormaPagoGrupoClienteFormaPago.add(jLabelid_tipo_forma_pagoFK_IdTipoFormaPagoGrupoClienteFormaPago, gridBagConstraintsGrupoClienteFormaPago);

		gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
		gridBagConstraintsGrupoClienteFormaPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGrupoClienteFormaPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGrupoClienteFormaPago.gridy = 0;
		gridBagConstraintsGrupoClienteFormaPago.gridx = 1;
		jPanelFK_IdTipoFormaPagoGrupoClienteFormaPago.add(jComboBoxid_tipo_forma_pagoFK_IdTipoFormaPagoGrupoClienteFormaPago, gridBagConstraintsGrupoClienteFormaPago);

		gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
		gridBagConstraintsGrupoClienteFormaPago.anchor = GridBagConstraints.WEST;
		gridBagConstraintsGrupoClienteFormaPago.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsGrupoClienteFormaPago.gridy = 1;
		gridBagConstraintsGrupoClienteFormaPago.gridx =1;
		jPanelFK_IdTipoFormaPagoGrupoClienteFormaPago.add(jButtonFK_IdTipoFormaPagoGrupoClienteFormaPago, gridBagConstraintsGrupoClienteFormaPago);

		jTabbedPaneBusquedasGrupoClienteFormaPago.addTab("2.-Por T. Forma Pago ", jPanelFK_IdTipoFormaPagoGrupoClienteFormaPago);
		jTabbedPaneBusquedasGrupoClienteFormaPago.setMnemonicAt(1, KeyEvent.VK_2);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutGrupoClienteFormaPago = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutGrupoClienteFormaPago);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.grupoclienteformapagoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();						
			this.gridBagConstraintsGrupoClienteFormaPago.gridy = iGridyPrincipal++;
			this.gridBagConstraintsGrupoClienteFormaPago.gridx = 0;		
			//this.gridBagConstraintsGrupoClienteFormaPago.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGrupoClienteFormaPago.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsGrupoClienteFormaPago.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarGrupoClienteFormaPago, this.gridBagConstraintsGrupoClienteFormaPago);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
		this.gridBagConstraintsGrupoClienteFormaPago.gridy = iGridyPrincipal++;
		this.gridBagConstraintsGrupoClienteFormaPago.gridx = 0;		
		//this.gridBagConstraintsGrupoClienteFormaPago.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGrupoClienteFormaPago.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsGrupoClienteFormaPago.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsGrupoClienteFormaPago);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsGrupoClienteFormaPago.gridy = iGridyPrincipal++;
			this.gridBagConstraintsGrupoClienteFormaPago.gridx = 0;		
			this.gridBagConstraintsGrupoClienteFormaPago.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGrupoClienteFormaPago.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsGrupoClienteFormaPago.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasGrupoClienteFormaPago, this.gridBagConstraintsGrupoClienteFormaPago);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
		this.gridBagConstraintsGrupoClienteFormaPago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsGrupoClienteFormaPago.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesGrupoClienteFormaPago, this.gridBagConstraintsGrupoClienteFormaPago);								
		
		
		/*
		this.gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
		this.gridBagConstraintsGrupoClienteFormaPago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsGrupoClienteFormaPago.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesGrupoClienteFormaPago, this.gridBagConstraintsGrupoClienteFormaPago);
		*/		
		
		this.gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
		this.gridBagConstraintsGrupoClienteFormaPago.gridy =iGridyPrincipal++;
		this.gridBagConstraintsGrupoClienteFormaPago.gridx =0;
		this.gridBagConstraintsGrupoClienteFormaPago.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsGrupoClienteFormaPago.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosGrupoClienteFormaPago, this.gridBagConstraintsGrupoClienteFormaPago);
				
		
		this.gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
		this.gridBagConstraintsGrupoClienteFormaPago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsGrupoClienteFormaPago.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionGrupoClienteFormaPago, this.gridBagConstraintsGrupoClienteFormaPago);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(GrupoClienteFormaPagoJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosGrupoClienteFormaPago= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosGrupoClienteFormaPago = new GridBagLayout();
			this.jPanelBusquedasParametrosGrupoClienteFormaPago.setLayout(gridaBagLayoutBusquedasParametrosGrupoClienteFormaPago);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralGrupoClienteFormaPago=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralGrupoClienteFormaPago.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralGrupoClienteFormaPago.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralGrupoClienteFormaPago.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
		this.gridBagConstraintsGrupoClienteFormaPago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsGrupoClienteFormaPago.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposGrupoClienteFormaPago, this.gridBagConstraintsGrupoClienteFormaPago);
			
			
		this.gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
		this.gridBagConstraintsGrupoClienteFormaPago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsGrupoClienteFormaPago.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosGrupoClienteFormaPago, this.gridBagConstraintsGrupoClienteFormaPago);
		
			
		this.gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
		this.gridBagConstraintsGrupoClienteFormaPago.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsGrupoClienteFormaPago.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesGrupoClienteFormaPago, this.gridBagConstraintsGrupoClienteFormaPago);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralGrupoClienteFormaPago;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoGrupoClienteFormaPago() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoGrupoClienteFormaPago = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoGrupoClienteFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoGrupoClienteFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoGrupoClienteFormaPago.setName("jPanelReporteDinamicoGrupoClienteFormaPago"); 
		
		this.jPanelReporteDinamicoGrupoClienteFormaPago.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoGrupoClienteFormaPago.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoGrupoClienteFormaPago.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoGrupoClienteFormaPago.setLayout(gridaBagLayoutReporteDinamicoGrupoClienteFormaPago);
		
		
		this.jInternalFrameReporteDinamicoGrupoClienteFormaPago= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoGrupoClienteFormaPago = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteGrupoClienteFormaPago= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoGrupoClienteFormaPago.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoGrupoClienteFormaPago.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoGrupoClienteFormaPago.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoGrupoClienteFormaPago.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoGrupoClienteFormaPago.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoGrupoClienteFormaPago.setResizable(true);
	    this.jInternalFrameReporteDinamicoGrupoClienteFormaPago.setClosable(true);
	    this.jInternalFrameReporteDinamicoGrupoClienteFormaPago.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoGrupoClienteFormaPago.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoGrupoClienteFormaPago.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoGrupoClienteFormaPago.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoGrupoClienteFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Grupo Cliente Forma Pagos"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteGrupoClienteFormaPago = new JLabelMe();

		this.jLabelColumnasSelectReporteGrupoClienteFormaPago.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteGrupoClienteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteGrupoClienteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteGrupoClienteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
		this.gridBagConstraintsGrupoClienteFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoClienteFormaPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGrupoClienteFormaPago.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoGrupoClienteFormaPago.add(this.jLabelColumnasSelectReporteGrupoClienteFormaPago, this.gridBagConstraintsGrupoClienteFormaPago);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteGrupoClienteFormaPago = new JList<Reporte>();
		this.jListColumnasSelectReporteGrupoClienteFormaPago.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteGrupoClienteFormaPago.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteGrupoClienteFormaPago.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteGrupoClienteFormaPago.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteGrupoClienteFormaPago.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteGrupoClienteFormaPago=new JScrollPane(this.jListColumnasSelectReporteGrupoClienteFormaPago);
			
			this.jScrollColumnasSelectReporteGrupoClienteFormaPago.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteGrupoClienteFormaPago.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteGrupoClienteFormaPago.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteGrupoClienteFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
		this.gridBagConstraintsGrupoClienteFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoClienteFormaPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGrupoClienteFormaPago.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoGrupoClienteFormaPago.add(this.jListColumnasSelectReporteGrupoClienteFormaPago, this.gridBagConstraintsGrupoClienteFormaPago);
		this.jPanelReporteDinamicoGrupoClienteFormaPago.add(this.jScrollColumnasSelectReporteGrupoClienteFormaPago, this.gridBagConstraintsGrupoClienteFormaPago);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteGrupoClienteFormaPago = new JLabelMe();

		this.jLabelRelacionesSelectReporteGrupoClienteFormaPago.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteGrupoClienteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteGrupoClienteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteGrupoClienteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteGrupoClienteFormaPago = new JList<Reporte>();
		this.jListRelacionesSelectReporteGrupoClienteFormaPago.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteGrupoClienteFormaPago.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteGrupoClienteFormaPago.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteGrupoClienteFormaPago.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteGrupoClienteFormaPago.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteGrupoClienteFormaPago=new JScrollPane(this.jListRelacionesSelectReporteGrupoClienteFormaPago);
			
			this.jScrollRelacionesSelectReporteGrupoClienteFormaPago.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteGrupoClienteFormaPago.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteGrupoClienteFormaPago.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteGrupoClienteFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoGrupoClienteFormaPago = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoGrupoClienteFormaPago = new JComboBoxMe();
		this.jListColumnasValoresGraficoGrupoClienteFormaPago = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoGrupoClienteFormaPago = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoGrupoClienteFormaPago.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoGrupoClienteFormaPago.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoGrupoClienteFormaPago.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoGrupoClienteFormaPago.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoGrupoClienteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoGrupoClienteFormaPago = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoGrupoClienteFormaPago.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoGrupoClienteFormaPago.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoGrupoClienteFormaPago.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoGrupoClienteFormaPago.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoGrupoClienteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoGrupoClienteFormaPago = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoGrupoClienteFormaPago.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoGrupoClienteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoGrupoClienteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoGrupoClienteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
		this.gridBagConstraintsGrupoClienteFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoClienteFormaPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGrupoClienteFormaPago.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoGrupoClienteFormaPago.add(this.jLabelGenerarExcelReporteDinamicoGrupoClienteFormaPago, this.gridBagConstraintsGrupoClienteFormaPago);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoGrupoClienteFormaPago = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoGrupoClienteFormaPago.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoGrupoClienteFormaPago,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoGrupoClienteFormaPago.setToolTipText("Generar EXCEL"+" "+GrupoClienteFormaPagoConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
		//this.gridBagConstraintsGrupoClienteFormaPago.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsGrupoClienteFormaPago.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsGrupoClienteFormaPago.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoGrupoClienteFormaPago.add(this.jButtonGenerarExcelReporteDinamicoGrupoClienteFormaPago, this.gridBagConstraintsGrupoClienteFormaPago);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
		this.gridBagConstraintsGrupoClienteFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGrupoClienteFormaPago.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsGrupoClienteFormaPago.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoGrupoClienteFormaPago.add(this.jComboBoxTiposReportesDinamicoGrupoClienteFormaPago, this.gridBagConstraintsGrupoClienteFormaPago);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoGrupoClienteFormaPago = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoGrupoClienteFormaPago.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoGrupoClienteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoGrupoClienteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoGrupoClienteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
		this.gridBagConstraintsGrupoClienteFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoClienteFormaPago.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsGrupoClienteFormaPago.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoGrupoClienteFormaPago.add(this.jLabelTiposArchivoReporteDinamicoGrupoClienteFormaPago, this.gridBagConstraintsGrupoClienteFormaPago);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
		this.gridBagConstraintsGrupoClienteFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGrupoClienteFormaPago.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsGrupoClienteFormaPago.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoGrupoClienteFormaPago.add(this.jComboBoxTiposArchivosReportesDinamicoGrupoClienteFormaPago, this.gridBagConstraintsGrupoClienteFormaPago);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoGrupoClienteFormaPago = new JButtonMe();
		this.jButtonGenerarReporteDinamicoGrupoClienteFormaPago.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoGrupoClienteFormaPago,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoGrupoClienteFormaPago.setToolTipText("Generar"+" "+GrupoClienteFormaPagoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
		this.gridBagConstraintsGrupoClienteFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGrupoClienteFormaPago.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsGrupoClienteFormaPago.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoGrupoClienteFormaPago.add(this.jButtonGenerarReporteDinamicoGrupoClienteFormaPago, this.gridBagConstraintsGrupoClienteFormaPago);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoGrupoClienteFormaPago = new JButtonMe();
		this.jButtonCerrarReporteDinamicoGrupoClienteFormaPago.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoGrupoClienteFormaPago,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoGrupoClienteFormaPago.setToolTipText("Cancelar"+" "+GrupoClienteFormaPagoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
		this.gridBagConstraintsGrupoClienteFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGrupoClienteFormaPago.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsGrupoClienteFormaPago.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoGrupoClienteFormaPago.add(this.jButtonCerrarReporteDinamicoGrupoClienteFormaPago, this.gridBagConstraintsGrupoClienteFormaPago);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalGrupoClienteFormaPago = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoGrupoClienteFormaPago= new JScrollPane(jPanelReporteDinamicoGrupoClienteFormaPago,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoGrupoClienteFormaPago.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoGrupoClienteFormaPago.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoGrupoClienteFormaPago.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoGrupoClienteFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Grupo Cliente Forma Pagos"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
		this.gridBagConstraintsGrupoClienteFormaPago.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsGrupoClienteFormaPago.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsGrupoClienteFormaPago.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoGrupoClienteFormaPago.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoGrupoClienteFormaPago.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalGrupoClienteFormaPago);
		this.jInternalFrameReporteDinamicoGrupoClienteFormaPago.getContentPane().add(this.jScrollPanelReporteDinamicoGrupoClienteFormaPago, this.gridBagConstraintsGrupoClienteFormaPago);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionGrupoClienteFormaPago() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionGrupoClienteFormaPago = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionGrupoClienteFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionGrupoClienteFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionGrupoClienteFormaPago.setName("jPanelImportacionGrupoClienteFormaPago"); 
		
		this.jPanelImportacionGrupoClienteFormaPago.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionGrupoClienteFormaPago.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionGrupoClienteFormaPago.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionGrupoClienteFormaPago.setLayout(gridaBagLayoutImportacionGrupoClienteFormaPago);
		
		
		this.jInternalFrameImportacionGrupoClienteFormaPago= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionGrupoClienteFormaPago= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionGrupoClienteFormaPago = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteGrupoClienteFormaPago= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionGrupoClienteFormaPago.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionGrupoClienteFormaPago.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionGrupoClienteFormaPago.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionGrupoClienteFormaPago.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionGrupoClienteFormaPago.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionGrupoClienteFormaPago.setResizable(true);
	    this.jInternalFrameImportacionGrupoClienteFormaPago.setClosable(true);
	    this.jInternalFrameImportacionGrupoClienteFormaPago.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionGrupoClienteFormaPago.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionGrupoClienteFormaPago.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionGrupoClienteFormaPago.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionGrupoClienteFormaPago.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionGrupoClienteFormaPago.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionGrupoClienteFormaPago.setResizable(true);
	    this.jInternalFrameImportacionGrupoClienteFormaPago.setClosable(true);
	    this.jInternalFrameImportacionGrupoClienteFormaPago.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionGrupoClienteFormaPago.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionGrupoClienteFormaPago.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionGrupoClienteFormaPago.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionGrupoClienteFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Grupo Cliente Forma Pagos"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionGrupoClienteFormaPago = new JLabelMe();

		this.jLabelArchivoImportacionGrupoClienteFormaPago.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionGrupoClienteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionGrupoClienteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionGrupoClienteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
		this.gridBagConstraintsGrupoClienteFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoClienteFormaPago.gridy = iPosYImportacion;		
		this.gridBagConstraintsGrupoClienteFormaPago.gridx = iPosXImportacion++;
			
		this.jPanelImportacionGrupoClienteFormaPago.add(this.jLabelArchivoImportacionGrupoClienteFormaPago, this.gridBagConstraintsGrupoClienteFormaPago);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionGrupoClienteFormaPago = new JFileChooser();		
		this.jFileChooserImportacionGrupoClienteFormaPago.setToolTipText("ESCOGER ARCHIVO"+" "+GrupoClienteFormaPagoConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionGrupoClienteFormaPago = new JButtonMe();
		this.jButtonAbrirImportacionGrupoClienteFormaPago.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionGrupoClienteFormaPago,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionGrupoClienteFormaPago.setToolTipText("Generar"+" "+GrupoClienteFormaPagoConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
		this.gridBagConstraintsGrupoClienteFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGrupoClienteFormaPago.gridy = iPosYImportacion;
		this.gridBagConstraintsGrupoClienteFormaPago.gridx = iPosXImportacion++;
							
		this.jPanelImportacionGrupoClienteFormaPago.add(this.jButtonAbrirImportacionGrupoClienteFormaPago, this.gridBagConstraintsGrupoClienteFormaPago);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionGrupoClienteFormaPago = new JLabelMe();

		this.jLabelPathArchivoImportacionGrupoClienteFormaPago.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionGrupoClienteFormaPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionGrupoClienteFormaPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionGrupoClienteFormaPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
		this.gridBagConstraintsGrupoClienteFormaPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsGrupoClienteFormaPago.gridy = iPosYImportacion;		
		this.gridBagConstraintsGrupoClienteFormaPago.gridx = iPosXImportacion++;
			
		this.jPanelImportacionGrupoClienteFormaPago.add(this.jLabelPathArchivoImportacionGrupoClienteFormaPago, this.gridBagConstraintsGrupoClienteFormaPago);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionGrupoClienteFormaPago=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionGrupoClienteFormaPago.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionGrupoClienteFormaPago.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionGrupoClienteFormaPago.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
		this.gridBagConstraintsGrupoClienteFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGrupoClienteFormaPago.gridy = iPosYImportacion;
		this.gridBagConstraintsGrupoClienteFormaPago.gridx = iPosXImportacion++;
							
		this.jPanelImportacionGrupoClienteFormaPago.add(this.jTextFieldPathArchivoImportacionGrupoClienteFormaPago, this.gridBagConstraintsGrupoClienteFormaPago);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionGrupoClienteFormaPago = new JButtonMe();
		this.jButtonGenerarImportacionGrupoClienteFormaPago.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionGrupoClienteFormaPago,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionGrupoClienteFormaPago.setToolTipText("Generar"+" "+GrupoClienteFormaPagoConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
		this.gridBagConstraintsGrupoClienteFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGrupoClienteFormaPago.gridy = iPosYImportacion;
		this.gridBagConstraintsGrupoClienteFormaPago.gridx = iPosXImportacion++;
							
		this.jPanelImportacionGrupoClienteFormaPago.add(this.jButtonGenerarImportacionGrupoClienteFormaPago, this.gridBagConstraintsGrupoClienteFormaPago);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionGrupoClienteFormaPago = new JButtonMe();
		this.jButtonCerrarImportacionGrupoClienteFormaPago.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionGrupoClienteFormaPago,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionGrupoClienteFormaPago.setToolTipText("Cancelar"+" "+GrupoClienteFormaPagoConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
		this.gridBagConstraintsGrupoClienteFormaPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsGrupoClienteFormaPago.gridy = iPosYImportacion;
		this.gridBagConstraintsGrupoClienteFormaPago.gridx = iPosXImportacion++;
							
		this.jPanelImportacionGrupoClienteFormaPago.add(this.jButtonCerrarImportacionGrupoClienteFormaPago, this.gridBagConstraintsGrupoClienteFormaPago);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalGrupoClienteFormaPago = new GridBagLayout();
		
		this.jScrollPanelImportacionGrupoClienteFormaPago= new JScrollPane(jPanelImportacionGrupoClienteFormaPago,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
		this.gridBagConstraintsGrupoClienteFormaPago.gridy =iPosYImportacion;
		this.gridBagConstraintsGrupoClienteFormaPago.gridx =iPosXImportacion;
		this.gridBagConstraintsGrupoClienteFormaPago.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionGrupoClienteFormaPago.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionGrupoClienteFormaPago.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalGrupoClienteFormaPago);
		this.jInternalFrameImportacionGrupoClienteFormaPago.getContentPane().add(this.jScrollPanelImportacionGrupoClienteFormaPago, this.gridBagConstraintsGrupoClienteFormaPago);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByGrupoClienteFormaPago(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByGrupoClienteFormaPago = new JButtonMe();
			this.jButtonAbrirOrderByGrupoClienteFormaPago.setText("Orden");
			this.jButtonAbrirOrderByGrupoClienteFormaPago.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByGrupoClienteFormaPago,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByGrupoClienteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByGrupoClienteFormaPago";
			inputMap = this.jButtonAbrirOrderByGrupoClienteFormaPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByGrupoClienteFormaPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByGrupoClienteFormaPago"));
		
		
			GridBagLayout gridaBagLayoutOrderByGrupoClienteFormaPago = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByGrupoClienteFormaPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByGrupoClienteFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByGrupoClienteFormaPago.setName("jPanelOrderByGrupoClienteFormaPago"); 
			
			this.jPanelOrderByGrupoClienteFormaPago.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByGrupoClienteFormaPago.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByGrupoClienteFormaPago.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByGrupoClienteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByGrupoClienteFormaPago.setLayout(gridaBagLayoutOrderByGrupoClienteFormaPago);
			
			
			this.jTableDatosGrupoClienteFormaPagoOrderBy = new JTableMe();        
			this.jTableDatosGrupoClienteFormaPagoOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosGrupoClienteFormaPagoOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosGrupoClienteFormaPagoOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosGrupoClienteFormaPagoOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosGrupoClienteFormaPagoOrderBy.setViewportView(this.jTableDatosGrupoClienteFormaPagoOrderBy);
			this.jTableDatosGrupoClienteFormaPagoOrderBy.setFillsViewportHeight(true);
			this.jTableDatosGrupoClienteFormaPagoOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByGrupoClienteFormaPago= new OrderByJInternalFrame();
			this.jInternalFrameOrderByGrupoClienteFormaPago= new OrderByJInternalFrame();
			this.jScrollPanelOrderByGrupoClienteFormaPago = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteGrupoClienteFormaPago= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByGrupoClienteFormaPago.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByGrupoClienteFormaPago.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByGrupoClienteFormaPago.setTitle("Orden");
			this.jInternalFrameOrderByGrupoClienteFormaPago.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByGrupoClienteFormaPago.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByGrupoClienteFormaPago.setResizable(true);
			this.jInternalFrameOrderByGrupoClienteFormaPago.setClosable(true);
			this.jInternalFrameOrderByGrupoClienteFormaPago.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByGrupoClienteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByGrupoClienteFormaPago.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByGrupoClienteFormaPago.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByGrupoClienteFormaPago.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByGrupoClienteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByGrupoClienteFormaPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Grupo Cliente Forma Pagos"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
			this.gridBagConstraintsGrupoClienteFormaPago.gridy =iPosYOrderBy++;
			this.gridBagConstraintsGrupoClienteFormaPago.gridx =iPosXOrderBy;
			this.gridBagConstraintsGrupoClienteFormaPago.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsGrupoClienteFormaPago.ipady =150;
				
			this.jPanelOrderByGrupoClienteFormaPago.add(jScrollPanelDatosGrupoClienteFormaPagoOrderBy, this.gridBagConstraintsGrupoClienteFormaPago);//this.jTableDatosGrupoClienteFormaPagoTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByGrupoClienteFormaPago = new JButtonMe();
			this.jButtonCerrarOrderByGrupoClienteFormaPago.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByGrupoClienteFormaPago,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByGrupoClienteFormaPago.setToolTipText("Cancelar"+" "+GrupoClienteFormaPagoConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByGrupoClienteFormaPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
			this.gridBagConstraintsGrupoClienteFormaPago.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsGrupoClienteFormaPago.gridy = iPosYOrderBy++;
			this.gridBagConstraintsGrupoClienteFormaPago.gridx = iPosXOrderBy;
									
			this.jPanelOrderByGrupoClienteFormaPago.add(this.jButtonCerrarOrderByGrupoClienteFormaPago, this.gridBagConstraintsGrupoClienteFormaPago);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalGrupoClienteFormaPago = new GridBagLayout();
			
			this.jScrollPanelOrderByGrupoClienteFormaPago= new JScrollPane(jPanelOrderByGrupoClienteFormaPago,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsGrupoClienteFormaPago = new GridBagConstraints();
			this.gridBagConstraintsGrupoClienteFormaPago.gridy =iPosYOrderBy;
			this.gridBagConstraintsGrupoClienteFormaPago.gridx =iPosXOrderBy;
			this.gridBagConstraintsGrupoClienteFormaPago.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByGrupoClienteFormaPago.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByGrupoClienteFormaPago.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalGrupoClienteFormaPago);
			
			this.jInternalFrameOrderByGrupoClienteFormaPago.getContentPane().add(this.jScrollPanelOrderByGrupoClienteFormaPago, this.gridBagConstraintsGrupoClienteFormaPago);			
		
		} else {
			this.jButtonAbrirOrderByGrupoClienteFormaPago = new JButtonMe();
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
			&& this.grupoclienteformapagoSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosGrupoClienteFormaPago.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosGrupoClienteFormaPago.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosGrupoClienteFormaPago.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosGrupoClienteFormaPago.getRowHeight();//GrupoClienteFormaPagoConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.grupoclienteformapagoSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > GrupoClienteFormaPagoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaGrupoClienteFormaPago.isSelected()) {
					iHeightTable=GrupoClienteFormaPagoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < GrupoClienteFormaPagoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=GrupoClienteFormaPagoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > GrupoClienteFormaPagoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaGrupoClienteFormaPago.isSelected()) {
					iHeightTable=GrupoClienteFormaPagoConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < GrupoClienteFormaPagoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=GrupoClienteFormaPagoConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosGrupoClienteFormaPago.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosGrupoClienteFormaPago.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosGrupoClienteFormaPago.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosGrupoClienteFormaPago.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosGrupoClienteFormaPago.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosGrupoClienteFormaPago.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByGrupoClienteFormaPago!=null && this.jInternalFrameOrderByGrupoClienteFormaPago.getjTableDatosOrderBy()!=null) {
			//if(!this.grupoclienteformapagoSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByGrupoClienteFormaPago.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByGrupoClienteFormaPago.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByGrupoClienteFormaPago.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByGrupoClienteFormaPago.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByGrupoClienteFormaPago.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByGrupoClienteFormaPago.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByGrupoClienteFormaPago.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosGrupoClienteFormaPago.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosGrupoClienteFormaPago.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosGrupoClienteFormaPago.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=grupoclienteformapagoLogic.getGrupoClienteFormaPagos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=grupoclienteformapagos.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<GrupoClienteFormaPago> TraerGrupoClienteFormaPagoBeans(List<GrupoClienteFormaPago> grupoclienteformapagos,ArrayList<Classe> classes)throws Exception {
		try {
			for(GrupoClienteFormaPago grupoclienteformapago:grupoclienteformapagos) {
					
				if(!(GrupoClienteFormaPagoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || GrupoClienteFormaPagoConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					grupoclienteformapago.setsDetalleGeneralEntityReporte(GrupoClienteFormaPagoConstantesFunciones.getGrupoClienteFormaPagoDescripcion(grupoclienteformapago));
										
						
					
						
					
				} else  {
							
					//grupoclienteformapago.setsDetalleGeneralEntityReporte(grupoclienteformapago.getsDetalleGeneralEntityReporte());
										
				}
				
				//grupoclienteformapagobeans.add(grupoclienteformapagobean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return grupoclienteformapagos;
    }
	//PARA REPORTES FIN
}
