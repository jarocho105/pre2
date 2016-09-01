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
import com.bydan.erp.cartera.util.EMailConstantesFunciones;

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
public class EMailJInternalFrame extends EMailBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarEMail;
	
	protected JMenuBar jmenuBarEMail;
	
	protected JMenu jmenuEMail;
	protected JMenu jmenuDatosEMail;
	protected JMenu jmenuArchivoEMail;
	protected JMenu jmenuAccionesEMail;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosEMail = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEMail;	
	protected GridBagConstraints gridBagConstraintsEMail;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public EMailDetalleFormJInternalFrame jInternalFrameDetalleFormEMail;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoEMail;	
	protected ImportacionJInternalFrame jInternalFrameImportacionEMail;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";
	
	public EMailSessionBean emailSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public ClienteSessionBean clienteSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<EMail> emails;		
	public List<EMail> emailsEliminados;	
	public List<EMail> emailsAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByEMail;		
	protected JButton jButtonAbrirOrderByEMail;
	
	
	//protected JPanel jPanelOrderByEMail;
	//public JScrollPane jScrollPanelOrderByEMail;	
	//protected JButton jButtonCerrarOrderByEMail;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public EMailLogic emailLogic;
	
	
	
	public JScrollPane jScrollPanelDatosEMail;
	public JScrollPane jScrollPanelDatosEdicionEMail;
	public JScrollPane jScrollPanelDatosGeneralEMail;
    
	
	
	//public JScrollPane jScrollPanelDatosEMailOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoEMail;
	//public JScrollPane jScrollPanelImportacionEMail;
	
	
	
	protected JPanel jPanelAccionesEMail;
	
    protected JPanel jPanelPaginacionEMail;
    protected JPanel jPanelParametrosReportesEMail;
	protected JPanel jPanelParametrosReportesAccionesEMail;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1EMail;
	protected JPanel jPanelParametrosAuxiliar2EMail;
	protected JPanel jPanelParametrosAuxiliar3EMail;
	protected JPanel jPanelParametrosAuxiliar4EMail;
	//protected JPanel jPanelParametrosAuxiliar5EMail;
	
	
	
	//protected JPanel jPanelReporteDinamicoEMail;
	//protected JPanel jPanelImportacionEMail;
	
	
	public JTable jTableDatosEMail;
	
	
	
	//public JTable jTableDatosEMailOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoEMail;
	protected JButton jButtonDuplicarEMail;
	protected JButton jButtonCopiarEMail;
	protected JButton jButtonVerFormEMail;
	protected JButton jButtonNuevoRelacionesEMail;
	protected JButton jButtonModificarEMail;
	
    protected JButton jButtonGuardarCambiosTablaEMail;
	protected JButton jButtonCerrarEMail;
	
	
	protected JButton jButtonRecargarInformacionEMail;
	protected JButton jButtonProcesarInformacionEMail;
	
	
	protected JButton jButtonAnterioresEMail;
	protected JButton jButtonSiguientesEMail;
	protected JButton jButtonNuevoGuardarCambiosEMail;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoEMail;
	//protected JButton jButtonCerrarReporteDinamicoEMail;
	//protected JButton jButtonGenerarExcelReporteDinamicoEMail;	
	
	
	
	//protected JButton jButtonAbrirImportacionEMail;
	//protected JButton jButtonGenerarImportacionEMail;
	//protected JButton jButtonCerrarImportacionEMail;
	//protected JFileChooser jFileChooserImportacionEMail;
	//protected File fileImportacionEMail;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEMail;
	protected JButton jButtonDuplicarToolBarEMail;
	protected JButton jButtonNuevoRelacionesToolBarEMail;
	
	
	public JButton jButtonGuardarCambiosToolBarEMail;
	protected JButton jButtonCopiarToolBarEMail;
	protected JButton jButtonVerFormToolBarEMail;
	public JButton jButtonGuardarCambiosTablaToolBarEMail;
	protected JButton jButtonMostrarOcultarTablaToolBarEMail;
	protected JButton jButtonCerrarToolBarEMail;
	
	protected JButton jButtonRecargarInformacionToolBarEMail;
	protected JButton jButtonProcesarInformacionToolBarEMail;
	protected JButton jButtonAnterioresToolBarEMail;
	protected JButton jButtonSiguientesToolBarEMail;
	protected JButton jButtonNuevoGuardarCambiosToolBarEMail;
	protected JButton jButtonAbrirOrderByToolBarEMail;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEMail;
	protected JMenuItem jMenuItemDuplicarEMail;
	protected JMenuItem jMenuItemNuevoRelacionesEMail;
	
	
	protected JMenuItem jMenuItemGuardarCambiosEMail;
	protected JMenuItem jMenuItemCopiarEMail;
	protected JMenuItem jMenuItemVerFormEMail;
	protected JMenuItem jMenuItemGuardarCambiosTablaEMail;
	protected JMenuItem jMenuItemCerrarEMail;
	protected JMenuItem jMenuItemDetalleCerrarEMail;
	protected JMenuItem jMenuItemDetalleAbrirOrderByEMail;
	protected JMenuItem jMenuItemDetalleMostarOcultarEMail;
	
	protected JMenuItem jMenuItemRecargarInformacionEMail;
	protected JMenuItem jMenuItemProcesarInformacionEMail;
	protected JMenuItem jMenuItemAnterioresEMail;
	protected JMenuItem jMenuItemSiguientesEMail;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEMail;
	protected JMenuItem jMenuItemAbrirOrderByEMail;
	protected JMenuItem jMenuItemMostrarOcultarEMail;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEMail;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosEMail;
	protected JCheckBox jCheckBoxSeleccionadosEMail;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaEMail;
	protected JCheckBox jCheckBoxConGraficoReporteEMail;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesEMail;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesEMail;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoEMail;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoEMail;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesEMail;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionEMail;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEMail;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEMail;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarEMail;
	protected JTextField jTextFieldValorCampoGeneralEMail;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteEMail;
	//public JList<Reporte> jListColumnasSelectReporteEMail;
	//public JScrollPane jScrollColumnasSelectReporteEMail;
	
	//public JLabel jLabelRelacionesSelectReporteEMail;
	//public JList<Reporte> jListRelacionesSelectReporteEMail;
	//public JScrollPane jScrollRelacionesSelectReporteEMail;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoEMail;
	//protected JCheckBox jCheckBoxConGraficoDinamicoEMail;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoEMail;
	//public JLabel jLabelTiposArchivoReporteDinamicoEMail;
	
		
	//public JLabel jLabelArchivoImportacionEMail;	
	//public JLabel jLabelPathArchivoImportacionEMail;
	//protected JTextField jTextFieldPathArchivoImportacionEMail;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoEMail;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoEMail;
	
	//public JLabel jLabelColumnaCategoriaValorEMail;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorEMail;
	
	//public JLabel jLabelColumnasValoresGraficoEMail;
	//public JList<Reporte> jListColumnasValoresGraficoEMail;
	//public JScrollPane jScrollColumnasValoresGraficoEMail;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoEMail;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoEMail;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasEMail;
	public JPanel jPanelFK_IdClienteEMail;
	public JButton jButtonFK_IdClienteEMail;
	
	public JPanel jPanelid_clienteFK_IdClienteEMail;
	public JLabel jLabelid_clienteFK_IdClienteEMail;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteFK_IdClienteEMail;
	public JButton jButtonid_clienteFK_IdClienteEMail= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteEMailUpdate= new JButtonMe();
	public JButton jButtonid_clienteFK_IdClienteEMailBusqueda= new JButtonMe();

	public JButton jButtonBuscarFK_IdClienteid_clienteEMail;
	
	
	
	
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
	//public int iHeightFormulario=462;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public EMailJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("EMail No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EMailJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EMail No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EMailJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EMail No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EMailJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EMail No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionEMail)	{
		this.jButtonRecargarInformacionEMail = jButtonRecargarInformacionEMail;
	}
	
	public JButton getjButtonProcesarInformacionEMail() {
		return this.jButtonProcesarInformacionEMail;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEMail)	{
		this.jButtonProcesarInformacionEMail = jButtonProcesarInformacionEMail;
	}
	
	
	public JButton getjButtonRecargarInformacionEMail() {
		return this.jButtonRecargarInformacionEMail;
	}
	
	
	public List<EMail> getemails() {
		return this.emails;
	}

	public void setemails(List<EMail> emails) {
		this.emails = emails;
	}
	
	public List<EMail> getemailsAux() {
		return this.emailsAux;
	}

	public void setemailsAux(List<EMail> emailsAux) {
		this.emailsAux = emailsAux;
	}
	
	public List<EMail> getemailsEliminados() {
		return this.emailsEliminados;
	}

	public void setEMailsEliminados(List<EMail> emailsEliminados) {
		this.emailsEliminados = emailsEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarEMail() {
		return jComboBoxTiposSeleccionarEMail;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarEMail(
			JComboBox jComboBoxTiposSeleccionarEMail) {
		this.jComboBoxTiposSeleccionarEMail = jComboBoxTiposSeleccionarEMail;
	}
	
	public void setBorderResaltarTiposSeleccionarEMail() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarEMail.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarEMail .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralEMail() {
		return jTextFieldValorCampoGeneralEMail;
	}

	public void setjTextFieldValorCampoGeneralEMail(
			JTextField jTextFieldValorCampoGeneralEMail) {
		this.jTextFieldValorCampoGeneralEMail = jTextFieldValorCampoGeneralEMail;
	}

	public void setBorderResaltarValorCampoGeneralEMail() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEMail.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralEMail .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosEMail() {
		return this.jCheckBoxSeleccionarTodosEMail;
	}

	public void setjCheckBoxSeleccionarTodosEMail(
			JCheckBox jCheckBoxSeleccionarTodosEMail) {
		this.jCheckBoxSeleccionarTodosEMail = jCheckBoxSeleccionarTodosEMail;
	}

	public void setBorderResaltarSeleccionarTodosEMail() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEMail.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosEMail .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosEMail() {
		return this.jCheckBoxSeleccionadosEMail;
	}

	public void setjCheckBoxSeleccionadosEMail(
			JCheckBox jCheckBoxSeleccionadosEMail) {
		this.jCheckBoxSeleccionadosEMail = jCheckBoxSeleccionadosEMail;
	}
	
	public void setBorderResaltarSeleccionadosEMail() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEMail.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosEMail .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesEMail() {
		return this.jComboBoxTiposArchivosReportesEMail;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesEMail(
			JComboBox jComboBoxTiposArchivosReportesEMail) {
		this.jComboBoxTiposArchivosReportesEMail = jComboBoxTiposArchivosReportesEMail;
	}

	public void setBorderResaltarTiposArchivosReportesEMail() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEMail.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesEMail .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesEMail() {
		return this.jComboBoxTiposReportesEMail;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesEMail(
			JComboBox jComboBoxTiposReportesEMail) {
		this.jComboBoxTiposReportesEMail = jComboBoxTiposReportesEMail;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoEMail() {
	//	return jComboBoxTiposReportesDinamicoEMail;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoEMail(
	//		JComboBox jComboBoxTiposReportesDinamicoEMail) {
	//	this.jComboBoxTiposReportesDinamicoEMail = jComboBoxTiposReportesDinamicoEMail;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoEMail() {
	//	return jComboBoxTiposArchivosReportesDinamicoEMail;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoEMail(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoEMail) {
	//	this.jComboBoxTiposArchivosReportesDinamicoEMail = jComboBoxTiposArchivosReportesDinamicoEMail;
	//}
	
	public void setBorderResaltarTiposReportesEMail() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEMail.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesEMail .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesEMail() {
		return this.jComboBoxTiposGraficosReportesEMail;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesEMail(
			JComboBox jComboBoxTiposGraficosReportesEMail) {
		this.jComboBoxTiposGraficosReportesEMail = jComboBoxTiposGraficosReportesEMail;
	}
	
	public void setBorderResaltarTiposGraficosReportesEMail() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEMail.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesEMail .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionEMail() {
		return this.jComboBoxTiposPaginacionEMail;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionEMail(
			JComboBox jComboBoxTiposPaginacionEMail) {
		this.jComboBoxTiposPaginacionEMail = jComboBoxTiposPaginacionEMail;
	}
	
	public void setBorderResaltarTiposPaginacionEMail() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEMail.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionEMail .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesEMail() {
		return this.jComboBoxTiposRelacionesEMail;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEMail() {
		return this.jComboBoxTiposAccionesEMail;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEMail(
			JComboBox jComboBoxTiposRelacionesEMail) {
		this.jComboBoxTiposRelacionesEMail = jComboBoxTiposRelacionesEMail;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEMail(
			JComboBox jComboBoxTiposAccionesEMail) {
		this.jComboBoxTiposAccionesEMail = jComboBoxTiposAccionesEMail;
	}
	
	public void setBorderResaltarTiposRelacionesEMail() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEMail.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesEMail .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesEMail() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarEMail.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesEMail .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoEMail() {
	//	return jCheckBoxConGraficoDinamicoEMail;
	//}

	//public void setjCheckBoxConGraficoDinamicoEMail(
	//		JCheckBox jCheckBoxConGraficoDinamicoEMail) {
	//	this.jCheckBoxConGraficoDinamicoEMail = jCheckBoxConGraficoDinamicoEMail;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoEMail() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarEMail.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoEMail .setBorder(borderResaltar);		
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
		this.emailSessionBean=new EMailSessionBean();
		
		this.emailSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.emailSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.emailSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=EMailJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=EMailJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EMailJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EMailJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EMailJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"E Mail MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.emailSessionBean.getEsGuardarRelacionado()) {
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
		
		EMailJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("EMail No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarEMail= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarEMail=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarEMail,this.jTtoolBarEMail,
							"nuevo","nuevo","Nuevo"+" "+EMailConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarEMail=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarEMail,this.jTtoolBarEMail,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarEMail=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarEMail,this.jTtoolBarEMail,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+EMailConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarEMail=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarEMail,this.jTtoolBarEMail,
							"duplicar","duplicar","Duplicar"+" "+EMailConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarEMail=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarEMail,this.jTtoolBarEMail,
							"copiar","copiar","Copiar"+" "+EMailConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarEMail=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarEMail,this.jTtoolBarEMail,
							"ver_form","ver_form","Ver"+" "+EMailConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarEMail=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEMail,this.jTtoolBarEMail,
							"recargar","recargar","Recargar"+" "+EMailConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarEMail=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEMail,this.jTtoolBarEMail,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarEMail=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarEMail,this.jTtoolBarEMail,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarEMail=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarEMail,this.jTtoolBarEMail,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarEMail=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarEMail,this.jTtoolBarEMail,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarEMail=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarEMail,this.jTtoolBarEMail,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+EMailConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarEMail=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarEMail,this.jTtoolBarEMail,
							"cerrar","cerrar","Salir"+" "+EMailConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarEMail=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarEMail;
			
				this.jButtonProcesarInformacionToolBarEMail=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarEMail;
				
		//protected JButton jButtonModificarToolBarEMail;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarEMail=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuEMail=new JMenuMe("General");
		this.jmenuArchivoEMail=new JMenuMe("Archivo");
		this.jmenuAccionesEMail=new JMenuMe("Acciones");
		this.jmenuDatosEMail=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEMail= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEMail.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEMail,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEMail, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarEMail= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarEMail.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarEMail,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarEMail, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesEMail= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesEMail.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesEMail,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesEMail, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosEMail= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEMail.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEMail,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEMail, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarEMail= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarEMail.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarEMail,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarEMail, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormEMail= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormEMail.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormEMail,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormEMail, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaEMail= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaEMail.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaEMail,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaEMail, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEMail= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEMail.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEMail,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEMail, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionEMail= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionEMail.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionEMail,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionEMail, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionEMail= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionEMail.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionEMail,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresEMail= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresEMail.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresEMail,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresEMail, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesEMail= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesEMail.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesEMail,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesEMail, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByEMail= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByEMail.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByEMail,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByEMail, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEMail= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEMail.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEMail,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEMail, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByEMail= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByEMail.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByEMail,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByEMail, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEMail= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEMail.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEMail,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEMail, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosEMail= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosEMail.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosEMail,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosEMail, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoEMail.add(this.jMenuItemCerrarEMail);
			
			this.jmenuAccionesEMail.add(this.jMenuItemNuevoEMail);
			this.jmenuAccionesEMail.add(this.jMenuItemNuevoGuardarCambiosEMail);
			this.jmenuAccionesEMail.add(this.jMenuItemNuevoRelacionesEMail);
			this.jmenuAccionesEMail.add(this.jMenuItemGuardarCambiosTablaEMail);		
			this.jmenuAccionesEMail.add(this.jMenuItemDuplicarEMail);		
			this.jmenuAccionesEMail.add(this.jMenuItemCopiarEMail);		
			this.jmenuAccionesEMail.add(this.jMenuItemVerFormEMail);		
			
			this.jmenuDatosEMail.add(this.jMenuItemRecargarInformacionEMail);				
			this.jmenuDatosEMail.add(this.jMenuItemAnterioresEMail);				
			this.jmenuDatosEMail.add(this.jMenuItemSiguientesEMail);				
			this.jmenuDatosEMail.add(this.jMenuItemAbrirOrderByEMail);				
			this.jmenuDatosEMail.add(this.jMenuItemMostrarOcultarEMail);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesEMail.add(this.jMenuItemGuardarCambiosEMail);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoEMail, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesEMail, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosEMail, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarEMail.add(this.jmenuArchivoEMail);		
			this.jmenuBarEMail.add(this.jmenuAccionesEMail);		
			this.jmenuBarEMail.add(this.jmenuDatosEMail);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarEMail);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasEMail() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdClienteEMail=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdClienteEMail.setToolTipText("Buscar Por Cliente ");
		this.jButtonFK_IdClienteEMail= new JButtonMe();
		this.jButtonFK_IdClienteEMail.setText("Buscar");
		this.jButtonFK_IdClienteEMail.setToolTipText("Buscar Por Cliente ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdClienteEMail,"buscar_button","Buscar Por Cliente ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdClienteEMail, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_clienteFK_IdClienteEMail = new JLabelMe();
		jLabelid_clienteFK_IdClienteEMail.setText("Cliente :");
		jLabelid_clienteFK_IdClienteEMail.setToolTipText("Cliente");
		jLabelid_clienteFK_IdClienteEMail.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteEMail.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_clienteFK_IdClienteEMail.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_clienteFK_IdClienteEMail,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_clienteFK_IdClienteEMail= new JComboBoxMe();
		jComboBoxid_clienteFK_IdClienteEMail.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteEMail.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFK_IdClienteEMail.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteFK_IdClienteEMail,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jButtonBuscarFK_IdClienteid_clienteEMail= new JButtonMe();
		this.jButtonBuscarFK_IdClienteid_clienteEMail.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteEMail.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonBuscarFK_IdClienteid_clienteEMail.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));

		this.jButtonBuscarFK_IdClienteid_clienteEMail.setText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteEMail.setToolTipText("Buscar");
		this.jButtonBuscarFK_IdClienteid_clienteEMail.setFocusable(false);


		this.jTabbedPaneBusquedasEMail=new JTabbedPane();


		this.jTabbedPaneBusquedasEMail.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasEMail.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasEMail.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasEMail.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasEMail.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasEMail,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleEMail = new EMailDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("E Mail DATOS");
			this.jInternalFrameDetalleFormEMail = new EMailDetalleFormJInternalFrame(jDesktopPane,this.emailSessionBean.getConGuardarRelaciones(),this.emailSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormEMail = null;//new EMailDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEMail= new GridBagLayout();
		
		
		this.jTableDatosEMail = new JTableMe();      
		
		String sToolTipEMail="";
		sToolTipEMail=EMailConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEMail+="(Cartera.EMail)";
		}
		
		if(!this.emailSessionBean.getEsGuardarRelacionado()) {
			sToolTipEMail+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosEMail.setToolTipText(sToolTipEMail);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosEMail);
		this.jTableDatosEMail.setAutoCreateRowSorter(true);
		this.jTableDatosEMail.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosEMail.setRowSelectionAllowed(true);
		this.jTableDatosEMail.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosEMail,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoEMail = new JButtonMe();
		this.jButtonDuplicarEMail = new JButtonMe();
		this.jButtonCopiarEMail = new JButtonMe();
		this.jButtonVerFormEMail = new JButtonMe();
		this.jButtonNuevoRelacionesEMail = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaEMail = new JButtonMe();
		this.jButtonCerrarEMail = new JButtonMe();
		
		this.jScrollPanelDatosEMail = new JScrollPane();   
        this.jScrollPanelDatosGeneralEMail = new JScrollPane();
		
				
		
		
		this.jPanelAccionesEMail = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: E Mail";
		
		if(!this.emailSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEMail.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos E Mailes" + this.sPath));
		} else {
			this.jScrollPanelDatosEMail.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralEMail.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesEMail.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEMail.setToolTipText("Acciones");
        this.jPanelAccionesEMail.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEMail, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEMail, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoEMail=new ReporteDinamicoJInternalFrame(EMailConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoEMail();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionEMail=new ImportacionJInternalFrame(EMailConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionEMail();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByEMail = new JButtonMe();
		
		this.jButtonAbrirOrderByEMail.setText("Orden");
		this.jButtonAbrirOrderByEMail.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEMail,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEMail, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByEMail.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByEMail.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEMail=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEMail,false,this);
			
			//this.cargarOrderByEMail(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByEMail=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEMail,true,this);
			
			//this.cargarOrderByEMail(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosEMail.setMinimumSize(new Dimension(400,50));//530
		this.jTableDatosEMail.setMaximumSize(new Dimension(400,50));//530
		this.jTableDatosEMail.setPreferredSize(new Dimension(400,50));//530
		
		this.jScrollPanelDatosEMail.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosEMail.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosEMail.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoEMail.setText("Nuevo");
		this.jButtonDuplicarEMail.setText("Duplicar");
		this.jButtonCopiarEMail.setText("Copiar");
		this.jButtonVerFormEMail.setText("Ver");
		this.jButtonNuevoRelacionesEMail.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaEMail.setText("Guardar");
		this.jButtonCerrarEMail.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEMail,"nuevo_button","Nuevo",this.emailSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarEMail,"duplicar_button","Duplicar",this.emailSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarEMail,"copiar_button","Copiar",this.emailSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormEMail,"ver_form","Ver",this.emailSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesEMail,"nuevorelaciones_button","Nuevo Rel",this.emailSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEMail,"guardarcambiostabla_button","Guardar",this.emailSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEMail,"cerrar_button","Salir",this.emailSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEMail, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarEMail, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarEMail, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormEMail, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesEMail, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEMail, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEMail, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoEMail.setToolTipText("Nuevo"+" "+EMailConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarEMail.setToolTipText("Duplicar"+" "+EMailConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarEMail.setToolTipText("Copiar"+" "+EMailConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormEMail.setToolTipText("Ver"+" "+EMailConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesEMail.setToolTipText("Nuevo Rel"+" "+EMailConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaEMail.setToolTipText("Guardar"+" "+EMailConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEMail.setToolTipText("Salir"+" "+EMailConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEMail";
		inputMap = this.jButtonNuevoEMail.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEMail.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEMail"));
		
		//DUPLICAR
		sMapKey = "DuplicarEMail";
		inputMap = this.jButtonDuplicarEMail.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarEMail.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarEMail"));
		
		//COPIAR
		sMapKey = "CopiarEMail";
		inputMap = this.jButtonCopiarEMail.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarEMail.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarEMail"));
		
		//VEr FORM
		sMapKey = "VerFormEMail";
		inputMap = this.jButtonVerFormEMail.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormEMail.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormEMail"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesEMail";
		inputMap = this.jButtonNuevoRelacionesEMail.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesEMail.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesEMail"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarEMail";
		inputMap = this.jButtonModificarEMail.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarEMail.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarEMail"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarEMail";
		inputMap = this.jButtonCerrarEMail.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEMail.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEMail"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEMail";
		inputMap = this.jButtonGuardarCambiosTablaEMail.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEMail.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEMail"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesEMail = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesEMail = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionEMail = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1EMail= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2EMail= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3EMail= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4EMail= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5EMail= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesEMail.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesEMail.setName("jPanelParametrosReportesEMail"); 
		
		this.jPanelParametrosReportesAccionesEMail.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesEMail.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesEMail.setName("jPanelParametrosReportesAccionesEMail"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesEMail, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesEMail, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionEMail = new JButtonMe();
		this.jButtonRecargarInformacionEMail.setText("Recargar");
		this.jButtonRecargarInformacionEMail.setToolTipText("Recargar"+" "+EMailConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionEMail,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionEMail = new JButtonMe();
		this.jButtonProcesarInformacionEMail.setText("Procesar");
		this.jButtonProcesarInformacionEMail.setToolTipText("Procesar"+" "+EMailConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionEMail.setVisible(false);
			
		this.jButtonProcesarInformacionEMail.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEMail.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionEMail.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesEMail = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEMail.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesEMail.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesEMail = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEMail.setText("TIPO");       
		this.jComboBoxTiposReportesEMail.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesEMail = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesEMail.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesEMail.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionEMail = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionEMail.setText("Paginacion");
		this.jComboBoxTiposPaginacionEMail.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesEMail = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesEMail.setText("Accion");
		this.jComboBoxTiposRelacionesEMail.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesEMail = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEMail.setText("Accion");
		this.jComboBoxTiposAccionesEMail.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarEMail = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarEMail.setText("Accion");
		this.jComboBoxTiposSeleccionarEMail.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralEMail=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralEMail.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEMail.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralEMail.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesEMail = new JLabelMe();
		
		this.jLabelAccionesEMail.setText("Acciones");		
		this.jLabelAccionesEMail.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEMail.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEMail.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosEMail = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosEMail.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosEMail.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosEMail = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosEMail.setText("Seleccionados");
		this.jCheckBoxSeleccionadosEMail.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaEMail = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaEMail.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaEMail.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteEMail = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteEMail.setText("Graf.");
		this.jCheckBoxConGraficoReporteEMail.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresEMail = new JButtonMe();
		//this.jButtonAnterioresEMail.setText("<<");
        this.jButtonAnterioresEMail.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresEMail,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresEMail, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesEMail = new JButtonMe();
		//this.jButtonSiguientesEMail.setText(">>");
        this.jButtonSiguientesEMail.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesEMail,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesEMail, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosEMail = new JButtonMe();
		this.jButtonNuevoGuardarCambiosEMail.setText("Nue");
        this.jButtonNuevoGuardarCambiosEMail.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosEMail,"nuevoguardarcambios_button","Nue",this.emailSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosEMail, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosEMail";
		inputMap = this.jButtonNuevoGuardarCambiosEMail.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosEMail.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosEMail"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionEMail";
		inputMap = this.jButtonRecargarInformacionEMail.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionEMail.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionEMail"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesEMail";
		inputMap = this.jButtonSiguientesEMail.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesEMail.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesEMail"));
		
		//ANTERIORES		
		sMapKey = "AnterioresEMail";
		inputMap = this.jButtonAnterioresEMail.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresEMail.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresEMail"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasEMail();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesEMail.setMinimumSize(new Dimension(this.getWidth(),EMailBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EMailBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEMail.setMaximumSize(new Dimension(this.getWidth(),EMailBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EMailBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesEMail.setPreferredSize(new Dimension(this.getWidth(),EMailBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(EMailBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionEMail = new GridBagLayout();

			this.jPanelPaginacionEMail.setLayout(gridaBagLayoutPaginacionEMail);						
			
			this.gridBagConstraintsEMail = new GridBagConstraints();
			this.gridBagConstraintsEMail.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsEMail.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEMail.gridy = 0;
			this.gridBagConstraintsEMail.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionEMail.add(this.jButtonAnterioresEMail, this.gridBagConstraintsEMail);
					
						
			this.gridBagConstraintsEMail = new GridBagConstraints();
			this.gridBagConstraintsEMail.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEMail.gridy = 0;
			
			this.jPanelPaginacionEMail.add(this.jButtonNuevoGuardarCambiosEMail, this.gridBagConstraintsEMail);
						
			
			this.gridBagConstraintsEMail = new GridBagConstraints();
			this.gridBagConstraintsEMail.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsEMail.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsEMail.gridy = 0;
			this.jPanelPaginacionEMail.add(this.jButtonSiguientesEMail, this.gridBagConstraintsEMail);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsEMail = new GridBagConstraints();
			this.gridBagConstraintsEMail.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEMail.gridy = 1;
			this.gridBagConstraintsEMail.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEMail.add(this.jButtonNuevoEMail, this.gridBagConstraintsEMail);
						
			
			
			if(!this.emailSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsEMail = new GridBagConstraints();
				this.gridBagConstraintsEMail.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsEMail.gridy = 1;
				this.gridBagConstraintsEMail.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionEMail.add(this.jButtonGuardarCambiosTablaEMail, this.gridBagConstraintsEMail);
			}
			
			
			
			this.gridBagConstraintsEMail = new GridBagConstraints();
			this.gridBagConstraintsEMail.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEMail.gridy = 1;
			this.gridBagConstraintsEMail.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEMail.add(this.jButtonDuplicarEMail, this.gridBagConstraintsEMail);
			
			this.gridBagConstraintsEMail = new GridBagConstraints();
			this.gridBagConstraintsEMail.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEMail.gridy = 1;
			this.gridBagConstraintsEMail.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEMail.add(this.jButtonCopiarEMail, this.gridBagConstraintsEMail);
		
			this.gridBagConstraintsEMail = new GridBagConstraints();
			this.gridBagConstraintsEMail.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEMail.gridy = 1;
			this.gridBagConstraintsEMail.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionEMail.add(this.jButtonVerFormEMail, this.gridBagConstraintsEMail);
		
			this.gridBagConstraintsEMail = new GridBagConstraints();
			this.gridBagConstraintsEMail.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEMail.gridy = 1;
			this.gridBagConstraintsEMail.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionEMail.add(this.jButtonCerrarEMail, this.gridBagConstraintsEMail);
		
		
		
		this.jButtonRecargarInformacionEMail.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEMail.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionEMail.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionEMail, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesEMail.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEMail.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesEMail.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesEMail, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesEMail.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEMail.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesEMail.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesEMail, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesEMail.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEMail.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesEMail.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesEMail, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionEMail.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEMail.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionEMail.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionEMail, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesEMail.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEMail.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesEMail.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesEMail, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesEMail.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEMail.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEMail.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEMail, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarEMail.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEMail.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarEMail.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarEMail, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaEMail.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEMail.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaEMail.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaEMail, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteEMail.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEMail.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteEMail.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteEMail, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosEMail.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEMail.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosEMail.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosEMail, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosEMail.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEMail.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosEMail.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosEMail, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesEMail = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesEMail = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1EMail = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2EMail = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3EMail = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4EMail = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesEMail.setLayout(gridaBagParametrosReportesEMail);
			this.jPanelParametrosReportesAccionesEMail.setLayout(gridaBagParametrosReportesAccionesEMail);
			
			
			this.jPanelParametrosAuxiliar1EMail.setLayout(gridaBagParametrosAuxiliar1EMail);
			this.jPanelParametrosAuxiliar2EMail.setLayout(gridaBagParametrosAuxiliar2EMail);
			this.jPanelParametrosAuxiliar3EMail.setLayout(gridaBagParametrosAuxiliar3EMail);
			this.jPanelParametrosAuxiliar4EMail.setLayout(gridaBagParametrosAuxiliar4EMail);
			//this.jPanelParametrosAuxiliar5EMail.setLayout(gridaBagParametrosAuxiliar2EMail);			
			
			
			
			
			this.gridBagConstraintsEMail = new GridBagConstraints();
			this.gridBagConstraintsEMail.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEMail.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEMail.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEMail.add(this.jButtonRecargarInformacionEMail, this.gridBagConstraintsEMail);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsEMail = new GridBagConstraints();
			this.gridBagConstraintsEMail.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEMail.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEMail.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EMail.add(this.jComboBoxTiposPaginacionEMail, this.gridBagConstraintsEMail);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsEMail = new GridBagConstraints();
			this.gridBagConstraintsEMail.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEMail.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEMail.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EMail.add(this.jCheckBoxConAltoMaximoTablaEMail, this.gridBagConstraintsEMail);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsEMail = new GridBagConstraints();
			this.gridBagConstraintsEMail.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEMail.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsEMail.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1EMail.add(this.jComboBoxTiposArchivosReportesEMail, this.gridBagConstraintsEMail);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsEMail = new GridBagConstraints();
			this.gridBagConstraintsEMail.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEMail.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEMail.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEMail.add(this.jPanelParametrosAuxiliar1EMail, this.gridBagConstraintsEMail);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsEMail = new GridBagConstraints();
			this.gridBagConstraintsEMail.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEMail.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEMail.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEMail.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4EMail.add(this.jComboBoxTiposReportesEMail, this.gridBagConstraintsEMail);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsEMail = new GridBagConstraints();
			this.gridBagConstraintsEMail.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEMail.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEMail.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEMail.add(this.jPanelParametrosAuxiliar4EMail, this.gridBagConstraintsEMail);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsEMail = new GridBagConstraints();
			this.gridBagConstraintsEMail.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEMail.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsEMail.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEMail.add(this.jComboBoxTiposReportesEMail, this.gridBagConstraintsEMail);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsEMail = new GridBagConstraints();
			this.gridBagConstraintsEMail.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEMail.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEMail.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEMail.add(this.jCheckBoxGenerarReporteEMail, this.gridBagConstraintsEMail);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsEMail = new GridBagConstraints();
			this.gridBagConstraintsEMail.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEMail.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEMail.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEMail.add(this.jPanelParametrosAuxiliar2EMail, this.gridBagConstraintsEMail);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsEMail = new GridBagConstraints();
			this.gridBagConstraintsEMail.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEMail.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEMail.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEMail.add(this.jLabelAccionesEMail, this.gridBagConstraintsEMail);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsEMail = new GridBagConstraints();
				this.gridBagConstraintsEMail.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsEMail.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsEMail.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesEMail.add(this.jButtonAbrirOrderByEMail, this.gridBagConstraintsEMail);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsEMail = new GridBagConstraints();
			this.gridBagConstraintsEMail.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsEMail.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEMail.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEMail.add(this.jComboBoxTiposSeleccionarEMail, this.gridBagConstraintsEMail);			
			
			
			/*
			this.gridBagConstraintsEMail = new GridBagConstraints();
			this.gridBagConstraintsEMail.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEMail.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsEMail.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesEMail.add(this.jCheckBoxSeleccionarTodosEMail, this.gridBagConstraintsEMail);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsEMail = new GridBagConstraints();
			this.gridBagConstraintsEMail.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEMail.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEMail.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEMail.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EMail.add(this.jCheckBoxSeleccionarTodosEMail, this.gridBagConstraintsEMail);															
				
			this.gridBagConstraintsEMail = new GridBagConstraints();
			this.gridBagConstraintsEMail.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEMail.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEMail.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsEMail.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3EMail.add(this.jCheckBoxSeleccionadosEMail, this.gridBagConstraintsEMail);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsEMail = new GridBagConstraints();
			this.gridBagConstraintsEMail.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsEMail.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEMail.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesEMail.add(this.jPanelParametrosAuxiliar3EMail, this.gridBagConstraintsEMail);			
			//USANDO AUXILIAR3 FIN				
				
				
			this.gridBagConstraintsEMail = new GridBagConstraints();
			this.gridBagConstraintsEMail.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEMail.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEMail.add(this.jComboBoxTiposAccionesEMail, this.gridBagConstraintsEMail);
	
				
			this.gridBagConstraintsEMail = new GridBagConstraints();
			this.gridBagConstraintsEMail.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsEMail.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesEMail.add(this.jTextFieldValorCampoGeneralEMail, this.gridBagConstraintsEMail);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosEMail = new GridBagLayout();

			this.jScrollPanelDatosEMail.setLayout(gridaBagLayoutDatosEMail);
			
			this.gridBagConstraintsEMail = new GridBagConstraints();
			this.gridBagConstraintsEMail.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEMail.gridy = 0;
			this.gridBagConstraintsEMail.gridx = 0;
			
			this.jScrollPanelDatosEMail.add(this.jTableDatosEMail, this.gridBagConstraintsEMail);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosEMail.setViewportView(this.jTableDatosEMail);
		this.jTableDatosEMail.setFillsViewportHeight(true);
		this.jTableDatosEMail.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesEMail= new GridBagLayout();
		this.jPanelAccionesEMail.setLayout(gridaBagLayoutAccionesEMail);
		
		
		/*	
		this.gridBagConstraintsEMail = new GridBagConstraints();
		this.gridBagConstraintsEMail.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEMail.gridy = 0;
		this.gridBagConstraintsEMail.gridx = 0;
			
		this.jPanelAccionesEMail.add(this.jButtonNuevoEMail, this.gridBagConstraintsEMail);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdClienteEMail= new GridBagLayout();
		gridaBagLayoutFK_IdClienteEMail.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdClienteEMail.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdClienteEMail.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdClienteEMail.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdClienteEMail.setLayout(gridaBagLayoutFK_IdClienteEMail);

		gridBagConstraintsEMail = new GridBagConstraints();
		gridBagConstraintsEMail.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEMail.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEMail.gridy = 0;
		gridBagConstraintsEMail.gridx = 0;
		jPanelFK_IdClienteEMail.add(jLabelid_clienteFK_IdClienteEMail, gridBagConstraintsEMail);

		gridBagConstraintsEMail = new GridBagConstraints();
		gridBagConstraintsEMail.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEMail.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEMail.gridy = 0;
		gridBagConstraintsEMail.gridx = 1;
		jPanelFK_IdClienteEMail.add(jComboBoxid_clienteFK_IdClienteEMail, gridBagConstraintsEMail);


		gridBagConstraintsEMail = new GridBagConstraints();
		gridBagConstraintsEMail.anchor = GridBagConstraints.EAST;
		gridBagConstraintsEMail.fill = GridBagConstraints.NONE;
		gridBagConstraintsEMail.gridy = 0;
		gridBagConstraintsEMail.gridx = 0;
		jPanelFK_IdClienteEMail.add(this.jButtonBuscarFK_IdClienteid_clienteEMail, gridBagConstraintsEMail);

		gridBagConstraintsEMail = new GridBagConstraints();
		gridBagConstraintsEMail.anchor = GridBagConstraints.WEST;
		gridBagConstraintsEMail.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsEMail.gridy = 1;
		gridBagConstraintsEMail.gridx =1;
		jPanelFK_IdClienteEMail.add(jButtonFK_IdClienteEMail, gridBagConstraintsEMail);

		jTabbedPaneBusquedasEMail.addTab("1.-Por Cliente ", jPanelFK_IdClienteEMail);
		jTabbedPaneBusquedasEMail.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEMail = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEMail);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.emailSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEMail = new GridBagConstraints();						
			this.gridBagConstraintsEMail.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEMail.gridx = 0;		
			//this.gridBagConstraintsEMail.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEMail.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEMail.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarEMail, this.gridBagConstraintsEMail);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsEMail = new GridBagConstraints();
		this.gridBagConstraintsEMail.gridy = iGridyPrincipal++;
		this.gridBagConstraintsEMail.gridx = 0;		
		//this.gridBagConstraintsEMail.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEMail.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsEMail.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsEMail);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsEMail = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsEMail.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEMail.gridx = 0;		
			this.gridBagConstraintsEMail.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEMail.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsEMail.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasEMail, this.gridBagConstraintsEMail);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsEMail = new GridBagConstraints();
		this.gridBagConstraintsEMail.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEMail.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesEMail, this.gridBagConstraintsEMail);								
		
		
		/*
		this.gridBagConstraintsEMail = new GridBagConstraints();
		this.gridBagConstraintsEMail.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEMail.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesEMail, this.gridBagConstraintsEMail);
		*/		
		
		this.gridBagConstraintsEMail = new GridBagConstraints();
		this.gridBagConstraintsEMail.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEMail.gridx =0;
		this.gridBagConstraintsEMail.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEMail.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEMail, this.gridBagConstraintsEMail);
				
		
		this.gridBagConstraintsEMail = new GridBagConstraints();
		this.gridBagConstraintsEMail.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEMail.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionEMail, this.gridBagConstraintsEMail);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		
			
		if(EMailJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosEMail= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEMail = new GridBagLayout();
			this.jPanelBusquedasParametrosEMail.setLayout(gridaBagLayoutBusquedasParametrosEMail);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralEMail=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEMail.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEMail.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEMail.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEMail = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsEMail = new GridBagConstraints();
		this.gridBagConstraintsEMail.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEMail.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEMail, this.gridBagConstraintsEMail);
			
			
		this.gridBagConstraintsEMail = new GridBagConstraints();
		this.gridBagConstraintsEMail.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEMail.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEMail, this.gridBagConstraintsEMail);
		
			
		this.gridBagConstraintsEMail = new GridBagConstraints();
		this.gridBagConstraintsEMail.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEMail.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEMail, this.gridBagConstraintsEMail);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralEMail;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoEMail() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoEMail = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoEMail = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoEMail.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoEMail.setName("jPanelReporteDinamicoEMail"); 
		
		this.jPanelReporteDinamicoEMail.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEMail.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoEMail.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoEMail.setLayout(gridaBagLayoutReporteDinamicoEMail);
		
		
		this.jInternalFrameReporteDinamicoEMail= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoEMail = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEMail= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoEMail.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoEMail.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoEMail.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoEMail.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoEMail.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoEMail.setResizable(true);
	    this.jInternalFrameReporteDinamicoEMail.setClosable(true);
	    this.jInternalFrameReporteDinamicoEMail.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoEMail.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEMail.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoEMail.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoEMail.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos E Mailes"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteEMail = new JLabelMe();

		this.jLabelColumnasSelectReporteEMail.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteEMail.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEMail.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteEMail.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEMail = new GridBagConstraints();
		this.gridBagConstraintsEMail.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEMail.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEMail.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoEMail.add(this.jLabelColumnasSelectReporteEMail, this.gridBagConstraintsEMail);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteEMail = new JList<Reporte>();
		this.jListColumnasSelectReporteEMail.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteEMail.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteEMail.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEMail.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteEMail.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteEMail=new JScrollPane(this.jListColumnasSelectReporteEMail);
			
			this.jScrollColumnasSelectReporteEMail.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEMail.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteEMail.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteEMail.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsEMail = new GridBagConstraints();
		this.gridBagConstraintsEMail.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEMail.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEMail.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoEMail.add(this.jListColumnasSelectReporteEMail, this.gridBagConstraintsEMail);
		this.jPanelReporteDinamicoEMail.add(this.jScrollColumnasSelectReporteEMail, this.gridBagConstraintsEMail);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteEMail = new JLabelMe();

		this.jLabelRelacionesSelectReporteEMail.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteEMail.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEMail.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteEMail.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteEMail = new JList<Reporte>();
		this.jListRelacionesSelectReporteEMail.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteEMail.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteEMail.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEMail.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteEMail.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteEMail=new JScrollPane(this.jListRelacionesSelectReporteEMail);
			
			this.jScrollRelacionesSelectReporteEMail.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEMail.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteEMail.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteEMail.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		
		
		this.jCheckBoxConGraficoDinamicoEMail = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoEMail = new JComboBoxMe();
		this.jListColumnasValoresGraficoEMail = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoEMail = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoEMail.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoEMail.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEMail.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoEMail.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoEMail, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoEMail = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoEMail.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoEMail.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEMail.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoEMail.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoEMail, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoEMail = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoEMail.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoEMail.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEMail.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoEMail.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEMail = new GridBagConstraints();
		this.gridBagConstraintsEMail.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEMail.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEMail.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEMail.add(this.jLabelGenerarExcelReporteDinamicoEMail, this.gridBagConstraintsEMail);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoEMail = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoEMail.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoEMail,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoEMail.setToolTipText("Generar EXCEL"+" "+EMailConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsEMail = new GridBagConstraints();
		//this.gridBagConstraintsEMail.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsEMail.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsEMail.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoEMail.add(this.jButtonGenerarExcelReporteDinamicoEMail, this.gridBagConstraintsEMail);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsEMail = new GridBagConstraints();
		this.gridBagConstraintsEMail.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEMail.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEMail.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEMail.add(this.jComboBoxTiposReportesDinamicoEMail, this.gridBagConstraintsEMail);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoEMail = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoEMail.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoEMail.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEMail.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoEMail.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsEMail = new GridBagConstraints();
		this.gridBagConstraintsEMail.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEMail.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsEMail.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoEMail.add(this.jLabelTiposArchivoReporteDinamicoEMail, this.gridBagConstraintsEMail);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsEMail = new GridBagConstraints();
		this.gridBagConstraintsEMail.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEMail.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEMail.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEMail.add(this.jComboBoxTiposArchivosReportesDinamicoEMail, this.gridBagConstraintsEMail);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoEMail = new JButtonMe();
		this.jButtonGenerarReporteDinamicoEMail.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoEMail,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoEMail.setToolTipText("Generar"+" "+EMailConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsEMail = new GridBagConstraints();
		this.gridBagConstraintsEMail.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEMail.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEMail.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEMail.add(this.jButtonGenerarReporteDinamicoEMail, this.gridBagConstraintsEMail);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoEMail = new JButtonMe();
		this.jButtonCerrarReporteDinamicoEMail.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoEMail,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoEMail.setToolTipText("Cancelar"+" "+EMailConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEMail = new GridBagConstraints();
		this.gridBagConstraintsEMail.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEMail.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsEMail.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoEMail.add(this.jButtonCerrarReporteDinamicoEMail, this.gridBagConstraintsEMail);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalEMail = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoEMail= new JScrollPane(jPanelReporteDinamicoEMail,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoEMail.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEMail.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoEMail.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoEMail.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos E Mailes"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsEMail = new GridBagConstraints();
		this.gridBagConstraintsEMail.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsEMail.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsEMail.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoEMail.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoEMail.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalEMail);
		this.jInternalFrameReporteDinamicoEMail.getContentPane().add(this.jScrollPanelReporteDinamicoEMail, this.gridBagConstraintsEMail);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionEMail() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionEMail = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionEMail = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionEMail.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionEMail.setName("jPanelImportacionEMail"); 
		
		this.jPanelImportacionEMail.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEMail.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionEMail.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionEMail.setLayout(gridaBagLayoutImportacionEMail);
		
		
		this.jInternalFrameImportacionEMail= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionEMail= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionEMail = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteEMail= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionEMail.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEMail.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEMail.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionEMail.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEMail.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEMail.setResizable(true);
	    this.jInternalFrameImportacionEMail.setClosable(true);
	    this.jInternalFrameImportacionEMail.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionEMail.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionEMail.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionEMail.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionEMail.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionEMail.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionEMail.setResizable(true);
	    this.jInternalFrameImportacionEMail.setClosable(true);
	    this.jInternalFrameImportacionEMail.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionEMail.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEMail.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionEMail.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionEMail.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos E Mailes"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionEMail = new JLabelMe();

		this.jLabelArchivoImportacionEMail.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionEMail.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEMail.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionEMail.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEMail = new GridBagConstraints();
		this.gridBagConstraintsEMail.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEMail.gridy = iPosYImportacion;		
		this.gridBagConstraintsEMail.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEMail.add(this.jLabelArchivoImportacionEMail, this.gridBagConstraintsEMail);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionEMail = new JFileChooser();		
		this.jFileChooserImportacionEMail.setToolTipText("ESCOGER ARCHIVO"+" "+EMailConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionEMail = new JButtonMe();
		this.jButtonAbrirImportacionEMail.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionEMail,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionEMail.setToolTipText("Generar"+" "+EMailConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsEMail = new GridBagConstraints();
		this.gridBagConstraintsEMail.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEMail.gridy = iPosYImportacion;
		this.gridBagConstraintsEMail.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEMail.add(this.jButtonAbrirImportacionEMail, this.gridBagConstraintsEMail);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionEMail = new JLabelMe();

		this.jLabelPathArchivoImportacionEMail.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionEMail.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEMail.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionEMail.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsEMail = new GridBagConstraints();
		this.gridBagConstraintsEMail.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEMail.gridy = iPosYImportacion;		
		this.gridBagConstraintsEMail.gridx = iPosXImportacion++;
			
		this.jPanelImportacionEMail.add(this.jLabelPathArchivoImportacionEMail, this.gridBagConstraintsEMail);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionEMail=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionEMail.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEMail.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionEMail.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsEMail = new GridBagConstraints();
		this.gridBagConstraintsEMail.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEMail.gridy = iPosYImportacion;
		this.gridBagConstraintsEMail.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEMail.add(this.jTextFieldPathArchivoImportacionEMail, this.gridBagConstraintsEMail);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionEMail = new JButtonMe();
		this.jButtonGenerarImportacionEMail.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionEMail,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionEMail.setToolTipText("Generar"+" "+EMailConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsEMail = new GridBagConstraints();
		this.gridBagConstraintsEMail.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEMail.gridy = iPosYImportacion;
		this.gridBagConstraintsEMail.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEMail.add(this.jButtonGenerarImportacionEMail, this.gridBagConstraintsEMail);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionEMail = new JButtonMe();
		this.jButtonCerrarImportacionEMail.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionEMail,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionEMail.setToolTipText("Cancelar"+" "+EMailConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsEMail = new GridBagConstraints();
		this.gridBagConstraintsEMail.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEMail.gridy = iPosYImportacion;
		this.gridBagConstraintsEMail.gridx = iPosXImportacion++;
							
		this.jPanelImportacionEMail.add(this.jButtonCerrarImportacionEMail, this.gridBagConstraintsEMail);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalEMail = new GridBagLayout();
		
		this.jScrollPanelImportacionEMail= new JScrollPane(jPanelImportacionEMail,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsEMail = new GridBagConstraints();
		this.gridBagConstraintsEMail.gridy =iPosYImportacion;
		this.gridBagConstraintsEMail.gridx =iPosXImportacion;
		this.gridBagConstraintsEMail.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionEMail.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionEMail.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalEMail);
		this.jInternalFrameImportacionEMail.getContentPane().add(this.jScrollPanelImportacionEMail, this.gridBagConstraintsEMail);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByEMail(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByEMail = new JButtonMe();
			this.jButtonAbrirOrderByEMail.setText("Orden");
			this.jButtonAbrirOrderByEMail.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByEMail,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByEMail, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByEMail";
			inputMap = this.jButtonAbrirOrderByEMail.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByEMail.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByEMail"));
		
		
			GridBagLayout gridaBagLayoutOrderByEMail = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByEMail = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByEMail.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByEMail.setName("jPanelOrderByEMail"); 
			
			this.jPanelOrderByEMail.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEMail.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByEMail.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByEMail, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByEMail.setLayout(gridaBagLayoutOrderByEMail);
			
			
			this.jTableDatosEMailOrderBy = new JTableMe();        
			this.jTableDatosEMailOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosEMailOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosEMailOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosEMailOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosEMailOrderBy.setViewportView(this.jTableDatosEMailOrderBy);
			this.jTableDatosEMailOrderBy.setFillsViewportHeight(true);
			this.jTableDatosEMailOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByEMail= new OrderByJInternalFrame();
			this.jInternalFrameOrderByEMail= new OrderByJInternalFrame();
			this.jScrollPanelOrderByEMail = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteEMail= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByEMail.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByEMail.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByEMail.setTitle("Orden");
			this.jInternalFrameOrderByEMail.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByEMail.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByEMail.setResizable(true);
			this.jInternalFrameOrderByEMail.setClosable(true);
			this.jInternalFrameOrderByEMail.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByEMail, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByEMail.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEMail.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByEMail.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByEMail, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByEMail.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos E Mailes"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsEMail = new GridBagConstraints();
			this.gridBagConstraintsEMail.gridy =iPosYOrderBy++;
			this.gridBagConstraintsEMail.gridx =iPosXOrderBy;
			this.gridBagConstraintsEMail.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsEMail.ipady =150;
				
			this.jPanelOrderByEMail.add(jScrollPanelDatosEMailOrderBy, this.gridBagConstraintsEMail);//this.jTableDatosEMailTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByEMail = new JButtonMe();
			this.jButtonCerrarOrderByEMail.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByEMail,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByEMail.setToolTipText("Cancelar"+" "+EMailConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByEMail, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsEMail = new GridBagConstraints();
			this.gridBagConstraintsEMail.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEMail.gridy = iPosYOrderBy++;
			this.gridBagConstraintsEMail.gridx = iPosXOrderBy;
									
			this.jPanelOrderByEMail.add(this.jButtonCerrarOrderByEMail, this.gridBagConstraintsEMail);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalEMail = new GridBagLayout();
			
			this.jScrollPanelOrderByEMail= new JScrollPane(jPanelOrderByEMail,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsEMail = new GridBagConstraints();
			this.gridBagConstraintsEMail.gridy =iPosYOrderBy;
			this.gridBagConstraintsEMail.gridx =iPosXOrderBy;
			this.gridBagConstraintsEMail.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByEMail.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByEMail.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalEMail);
			
			this.jInternalFrameOrderByEMail.getContentPane().add(this.jScrollPanelOrderByEMail, this.gridBagConstraintsEMail);			
		
		} else {
			this.jButtonAbrirOrderByEMail = new JButtonMe();
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
		int iWidthTableCalculado=0;//1030
		int iHeightTable=0;//screenSize.height/3;
		int iHeightTableTotal=0;
		
		//ANCHO COLUMNAS SIMPLES
		iWidthTableCalculado+=530;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=500;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=0;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.emailSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosEMail.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosEMail.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosEMail.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosEMail.getRowHeight();//EMailConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.emailSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > EMailConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEMail.isSelected()) {
					iHeightTable=EMailConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EMailConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EMailConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > EMailConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaEMail.isSelected()) {
					iHeightTable=EMailConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < EMailConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=EMailConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosEMail.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEMail.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosEMail.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosEMail.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEMail.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosEMail.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByEMail!=null && this.jInternalFrameOrderByEMail.getjTableDatosOrderBy()!=null) {
			//if(!this.emailSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByEMail.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByEMail.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByEMail.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByEMail.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByEMail.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByEMail.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByEMail.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosEMail.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEMail.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosEMail.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=emailLogic.getEMails().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=emails.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<EMail> TraerEMailBeans(List<EMail> emails,ArrayList<Classe> classes)throws Exception {
		try {
			for(EMail email:emails) {
					
				if(!(EMailConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || EMailConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					email.setsDetalleGeneralEntityReporte(EMailConstantesFunciones.getEMailDescripcion(email));
										
						
					
						
					
				} else  {
							
					//email.setsDetalleGeneralEntityReporte(email.getsDetalleGeneralEntityReporte());
										
				}
				
				//emailbeans.add(emailbean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return emails;
    }
	//PARA REPORTES FIN
}
