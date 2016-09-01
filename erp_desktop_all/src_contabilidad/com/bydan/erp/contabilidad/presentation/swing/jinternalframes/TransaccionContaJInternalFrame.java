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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes;


import com.bydan.erp.sris.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.sris.business.entity.*;

//import com.bydan.erp.contabilidad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.contabilidad.util.TransaccionContaConstantesFunciones;

import com.bydan.erp.contabilidad.business.logic.*;
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
public class TransaccionContaJInternalFrame extends TransaccionContaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarTransaccionConta;
	
	protected JMenuBar jmenuBarTransaccionConta;
	
	protected JMenu jmenuTransaccionConta;
	protected JMenu jmenuDatosTransaccionConta;
	protected JMenu jmenuArchivoTransaccionConta;
	protected JMenu jmenuAccionesTransaccionConta;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosTransaccionConta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTransaccionConta;	
	protected GridBagConstraints gridBagConstraintsTransaccionConta;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public TransaccionContaDetalleFormJInternalFrame jInternalFrameDetalleFormTransaccionConta;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoTransaccionConta;	
	protected ImportacionJInternalFrame jInternalFrameImportacionTransaccionConta;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TransaccionContaSessionBean transaccioncontaSessionBean;
		
	
	
	
	//protected JDesktopPane jDesktopPane;
	public List<TransaccionConta> transaccioncontas;		
	public List<TransaccionConta> transaccioncontasEliminados;	
	public List<TransaccionConta> transaccioncontasAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByTransaccionConta;		
	protected JButton jButtonAbrirOrderByTransaccionConta;
	
	
	//protected JPanel jPanelOrderByTransaccionConta;
	//public JScrollPane jScrollPanelOrderByTransaccionConta;	
	//protected JButton jButtonCerrarOrderByTransaccionConta;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public TransaccionContaLogic transaccioncontaLogic;
	
	
	
	public JScrollPane jScrollPanelDatosTransaccionConta;
	public JScrollPane jScrollPanelDatosEdicionTransaccionConta;
	public JScrollPane jScrollPanelDatosGeneralTransaccionConta;
    
	
	
	//public JScrollPane jScrollPanelDatosTransaccionContaOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoTransaccionConta;
	//public JScrollPane jScrollPanelImportacionTransaccionConta;
	
	
	
	protected JPanel jPanelAccionesTransaccionConta;
	
    protected JPanel jPanelPaginacionTransaccionConta;
    protected JPanel jPanelParametrosReportesTransaccionConta;
	protected JPanel jPanelParametrosReportesAccionesTransaccionConta;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1TransaccionConta;
	protected JPanel jPanelParametrosAuxiliar2TransaccionConta;
	protected JPanel jPanelParametrosAuxiliar3TransaccionConta;
	protected JPanel jPanelParametrosAuxiliar4TransaccionConta;
	//protected JPanel jPanelParametrosAuxiliar5TransaccionConta;
	
	
	
	//protected JPanel jPanelReporteDinamicoTransaccionConta;
	//protected JPanel jPanelImportacionTransaccionConta;
	
	
	public JTable jTableDatosTransaccionConta;
	
	
	
	//public JTable jTableDatosTransaccionContaOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoTransaccionConta;
	protected JButton jButtonDuplicarTransaccionConta;
	protected JButton jButtonCopiarTransaccionConta;
	protected JButton jButtonVerFormTransaccionConta;
	protected JButton jButtonNuevoRelacionesTransaccionConta;
	protected JButton jButtonModificarTransaccionConta;
	
    protected JButton jButtonGuardarCambiosTablaTransaccionConta;
	protected JButton jButtonCerrarTransaccionConta;
	
	
	protected JButton jButtonRecargarInformacionTransaccionConta;
	protected JButton jButtonProcesarInformacionTransaccionConta;
	
	
	protected JButton jButtonAnterioresTransaccionConta;
	protected JButton jButtonSiguientesTransaccionConta;
	protected JButton jButtonNuevoGuardarCambiosTransaccionConta;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoTransaccionConta;
	//protected JButton jButtonCerrarReporteDinamicoTransaccionConta;
	//protected JButton jButtonGenerarExcelReporteDinamicoTransaccionConta;	
	
	
	
	//protected JButton jButtonAbrirImportacionTransaccionConta;
	//protected JButton jButtonGenerarImportacionTransaccionConta;
	//protected JButton jButtonCerrarImportacionTransaccionConta;
	//protected JFileChooser jFileChooserImportacionTransaccionConta;
	//protected File fileImportacionTransaccionConta;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTransaccionConta;
	protected JButton jButtonDuplicarToolBarTransaccionConta;
	protected JButton jButtonNuevoRelacionesToolBarTransaccionConta;
	
	
	public JButton jButtonGuardarCambiosToolBarTransaccionConta;
	protected JButton jButtonCopiarToolBarTransaccionConta;
	protected JButton jButtonVerFormToolBarTransaccionConta;
	public JButton jButtonGuardarCambiosTablaToolBarTransaccionConta;
	protected JButton jButtonMostrarOcultarTablaToolBarTransaccionConta;
	protected JButton jButtonCerrarToolBarTransaccionConta;
	
	protected JButton jButtonRecargarInformacionToolBarTransaccionConta;
	protected JButton jButtonProcesarInformacionToolBarTransaccionConta;
	protected JButton jButtonAnterioresToolBarTransaccionConta;
	protected JButton jButtonSiguientesToolBarTransaccionConta;
	protected JButton jButtonNuevoGuardarCambiosToolBarTransaccionConta;
	protected JButton jButtonAbrirOrderByToolBarTransaccionConta;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTransaccionConta;
	protected JMenuItem jMenuItemDuplicarTransaccionConta;
	protected JMenuItem jMenuItemNuevoRelacionesTransaccionConta;
	
	
	protected JMenuItem jMenuItemGuardarCambiosTransaccionConta;
	protected JMenuItem jMenuItemCopiarTransaccionConta;
	protected JMenuItem jMenuItemVerFormTransaccionConta;
	protected JMenuItem jMenuItemGuardarCambiosTablaTransaccionConta;
	protected JMenuItem jMenuItemCerrarTransaccionConta;
	protected JMenuItem jMenuItemDetalleCerrarTransaccionConta;
	protected JMenuItem jMenuItemDetalleAbrirOrderByTransaccionConta;
	protected JMenuItem jMenuItemDetalleMostarOcultarTransaccionConta;
	
	protected JMenuItem jMenuItemRecargarInformacionTransaccionConta;
	protected JMenuItem jMenuItemProcesarInformacionTransaccionConta;
	protected JMenuItem jMenuItemAnterioresTransaccionConta;
	protected JMenuItem jMenuItemSiguientesTransaccionConta;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTransaccionConta;
	protected JMenuItem jMenuItemAbrirOrderByTransaccionConta;
	protected JMenuItem jMenuItemMostrarOcultarTransaccionConta;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTransaccionConta;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosTransaccionConta;
	protected JCheckBox jCheckBoxSeleccionadosTransaccionConta;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaTransaccionConta;
	protected JCheckBox jCheckBoxConGraficoReporteTransaccionConta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesTransaccionConta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesTransaccionConta;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoTransaccionConta;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoTransaccionConta;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesTransaccionConta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionTransaccionConta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTransaccionConta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTransaccionConta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarTransaccionConta;
	protected JTextField jTextFieldValorCampoGeneralTransaccionConta;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteTransaccionConta;
	//public JList<Reporte> jListColumnasSelectReporteTransaccionConta;
	//public JScrollPane jScrollColumnasSelectReporteTransaccionConta;
	
	//public JLabel jLabelRelacionesSelectReporteTransaccionConta;
	//public JList<Reporte> jListRelacionesSelectReporteTransaccionConta;
	//public JScrollPane jScrollRelacionesSelectReporteTransaccionConta;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoTransaccionConta;
	//protected JCheckBox jCheckBoxConGraficoDinamicoTransaccionConta;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoTransaccionConta;
	//public JLabel jLabelTiposArchivoReporteDinamicoTransaccionConta;
	
		
	//public JLabel jLabelArchivoImportacionTransaccionConta;	
	//public JLabel jLabelPathArchivoImportacionTransaccionConta;
	//protected JTextField jTextFieldPathArchivoImportacionTransaccionConta;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoTransaccionConta;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoTransaccionConta;
	
	//public JLabel jLabelColumnaCategoriaValorTransaccionConta;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorTransaccionConta;
	
	//public JLabel jLabelColumnasValoresGraficoTransaccionConta;
	//public JList<Reporte> jListColumnasValoresGraficoTransaccionConta;
	//public JScrollPane jScrollColumnasValoresGraficoTransaccionConta;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoTransaccionConta;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoTransaccionConta;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasTransaccionConta;
	public JPanel jPanelBusquedaPorCodigoTransaccionConta;
	public JButton jButtonBusquedaPorCodigoTransaccionConta;
	public JPanel jPanelBusquedaPorIdTransaccionConta;
	public JButton jButtonBusquedaPorIdTransaccionConta;
	public JPanel jPanelBusquedaPorNombreTransaccionConta;
	public JButton jButtonBusquedaPorNombreTransaccionConta;
	
	public JPanel jPanelcodigoBusquedaPorCodigoTransaccionConta;
	public JLabel jLabelcodigoBusquedaPorCodigoTransaccionConta;
	public JTextField jTextFieldcodigoBusquedaPorCodigoTransaccionConta;
	public JButton jButtoncodigoBusquedaPorCodigoTransaccionContaBusqueda= new JButtonMe();

	
	public JPanel jPanelIdIdBusquedaPorIdTransaccionConta;
	public JLabel jLabelidBusquedaPorIdTransaccionConta;
	public JTextFieldMe jTextFieldidTransaccionContaBusquedaPorId;
	public JButton jButtonidBusquedaPorIdTransaccionContaBusqueda= new JButtonMe();

	
	public JPanel jPanelnombreBusquedaPorNombreTransaccionConta;
	public JLabel jLabelnombreBusquedaPorNombreTransaccionConta;
	public JTextArea jTextAreanombreBusquedaPorNombreTransaccionConta;
	public JButton jButtonnombreBusquedaPorNombreTransaccionContaBusqueda= new JButtonMe();

	
	
	
	
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
	//public int iHeightFormulario=418;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	
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
	public TransaccionContaJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("TransaccionConta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TransaccionContaJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TransaccionConta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TransaccionContaJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TransaccionConta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TransaccionContaJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TransaccionConta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionTransaccionConta)	{
		this.jButtonRecargarInformacionTransaccionConta = jButtonRecargarInformacionTransaccionConta;
	}
	
	public JButton getjButtonProcesarInformacionTransaccionConta() {
		return this.jButtonProcesarInformacionTransaccionConta;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTransaccionConta)	{
		this.jButtonProcesarInformacionTransaccionConta = jButtonProcesarInformacionTransaccionConta;
	}
	
	
	public JButton getjButtonRecargarInformacionTransaccionConta() {
		return this.jButtonRecargarInformacionTransaccionConta;
	}
	
	
	public List<TransaccionConta> gettransaccioncontas() {
		return this.transaccioncontas;
	}

	public void settransaccioncontas(List<TransaccionConta> transaccioncontas) {
		this.transaccioncontas = transaccioncontas;
	}
	
	public List<TransaccionConta> gettransaccioncontasAux() {
		return this.transaccioncontasAux;
	}

	public void settransaccioncontasAux(List<TransaccionConta> transaccioncontasAux) {
		this.transaccioncontasAux = transaccioncontasAux;
	}
	
	public List<TransaccionConta> gettransaccioncontasEliminados() {
		return this.transaccioncontasEliminados;
	}

	public void setTransaccionContasEliminados(List<TransaccionConta> transaccioncontasEliminados) {
		this.transaccioncontasEliminados = transaccioncontasEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarTransaccionConta() {
		return jComboBoxTiposSeleccionarTransaccionConta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarTransaccionConta(
			JComboBox jComboBoxTiposSeleccionarTransaccionConta) {
		this.jComboBoxTiposSeleccionarTransaccionConta = jComboBoxTiposSeleccionarTransaccionConta;
	}
	
	public void setBorderResaltarTiposSeleccionarTransaccionConta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarTransaccionConta.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarTransaccionConta .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralTransaccionConta() {
		return jTextFieldValorCampoGeneralTransaccionConta;
	}

	public void setjTextFieldValorCampoGeneralTransaccionConta(
			JTextField jTextFieldValorCampoGeneralTransaccionConta) {
		this.jTextFieldValorCampoGeneralTransaccionConta = jTextFieldValorCampoGeneralTransaccionConta;
	}

	public void setBorderResaltarValorCampoGeneralTransaccionConta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransaccionConta.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralTransaccionConta .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosTransaccionConta() {
		return this.jCheckBoxSeleccionarTodosTransaccionConta;
	}

	public void setjCheckBoxSeleccionarTodosTransaccionConta(
			JCheckBox jCheckBoxSeleccionarTodosTransaccionConta) {
		this.jCheckBoxSeleccionarTodosTransaccionConta = jCheckBoxSeleccionarTodosTransaccionConta;
	}

	public void setBorderResaltarSeleccionarTodosTransaccionConta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransaccionConta.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosTransaccionConta .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosTransaccionConta() {
		return this.jCheckBoxSeleccionadosTransaccionConta;
	}

	public void setjCheckBoxSeleccionadosTransaccionConta(
			JCheckBox jCheckBoxSeleccionadosTransaccionConta) {
		this.jCheckBoxSeleccionadosTransaccionConta = jCheckBoxSeleccionadosTransaccionConta;
	}
	
	public void setBorderResaltarSeleccionadosTransaccionConta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransaccionConta.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosTransaccionConta .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesTransaccionConta() {
		return this.jComboBoxTiposArchivosReportesTransaccionConta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesTransaccionConta(
			JComboBox jComboBoxTiposArchivosReportesTransaccionConta) {
		this.jComboBoxTiposArchivosReportesTransaccionConta = jComboBoxTiposArchivosReportesTransaccionConta;
	}

	public void setBorderResaltarTiposArchivosReportesTransaccionConta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransaccionConta.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesTransaccionConta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesTransaccionConta() {
		return this.jComboBoxTiposReportesTransaccionConta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesTransaccionConta(
			JComboBox jComboBoxTiposReportesTransaccionConta) {
		this.jComboBoxTiposReportesTransaccionConta = jComboBoxTiposReportesTransaccionConta;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoTransaccionConta() {
	//	return jComboBoxTiposReportesDinamicoTransaccionConta;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoTransaccionConta(
	//		JComboBox jComboBoxTiposReportesDinamicoTransaccionConta) {
	//	this.jComboBoxTiposReportesDinamicoTransaccionConta = jComboBoxTiposReportesDinamicoTransaccionConta;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoTransaccionConta() {
	//	return jComboBoxTiposArchivosReportesDinamicoTransaccionConta;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoTransaccionConta(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoTransaccionConta) {
	//	this.jComboBoxTiposArchivosReportesDinamicoTransaccionConta = jComboBoxTiposArchivosReportesDinamicoTransaccionConta;
	//}
	
	public void setBorderResaltarTiposReportesTransaccionConta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransaccionConta.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesTransaccionConta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesTransaccionConta() {
		return this.jComboBoxTiposGraficosReportesTransaccionConta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesTransaccionConta(
			JComboBox jComboBoxTiposGraficosReportesTransaccionConta) {
		this.jComboBoxTiposGraficosReportesTransaccionConta = jComboBoxTiposGraficosReportesTransaccionConta;
	}
	
	public void setBorderResaltarTiposGraficosReportesTransaccionConta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransaccionConta.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesTransaccionConta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionTransaccionConta() {
		return this.jComboBoxTiposPaginacionTransaccionConta;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionTransaccionConta(
			JComboBox jComboBoxTiposPaginacionTransaccionConta) {
		this.jComboBoxTiposPaginacionTransaccionConta = jComboBoxTiposPaginacionTransaccionConta;
	}
	
	public void setBorderResaltarTiposPaginacionTransaccionConta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransaccionConta.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionTransaccionConta .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesTransaccionConta() {
		return this.jComboBoxTiposRelacionesTransaccionConta;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTransaccionConta() {
		return this.jComboBoxTiposAccionesTransaccionConta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTransaccionConta(
			JComboBox jComboBoxTiposRelacionesTransaccionConta) {
		this.jComboBoxTiposRelacionesTransaccionConta = jComboBoxTiposRelacionesTransaccionConta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTransaccionConta(
			JComboBox jComboBoxTiposAccionesTransaccionConta) {
		this.jComboBoxTiposAccionesTransaccionConta = jComboBoxTiposAccionesTransaccionConta;
	}
	
	public void setBorderResaltarTiposRelacionesTransaccionConta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransaccionConta.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesTransaccionConta .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesTransaccionConta() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarTransaccionConta.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesTransaccionConta .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoTransaccionConta() {
	//	return jCheckBoxConGraficoDinamicoTransaccionConta;
	//}

	//public void setjCheckBoxConGraficoDinamicoTransaccionConta(
	//		JCheckBox jCheckBoxConGraficoDinamicoTransaccionConta) {
	//	this.jCheckBoxConGraficoDinamicoTransaccionConta = jCheckBoxConGraficoDinamicoTransaccionConta;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoTransaccionConta() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarTransaccionConta.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoTransaccionConta .setBorder(borderResaltar);		
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
		this.transaccioncontaSessionBean=new TransaccionContaSessionBean();
		
		this.transaccioncontaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.transaccioncontaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.transaccioncontaSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=TransaccionContaJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=TransaccionContaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TransaccionContaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TransaccionContaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TransaccionContaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Transaccion Contablilidad MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.transaccioncontaSessionBean.getEsGuardarRelacionado()) {
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
		
		TransaccionContaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("TransaccionConta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarTransaccionConta= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarTransaccionConta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarTransaccionConta,this.jTtoolBarTransaccionConta,
							"nuevo","nuevo","Nuevo"+" "+TransaccionContaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarTransaccionConta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarTransaccionConta,this.jTtoolBarTransaccionConta,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarTransaccionConta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarTransaccionConta,this.jTtoolBarTransaccionConta,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+TransaccionContaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarTransaccionConta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarTransaccionConta,this.jTtoolBarTransaccionConta,
							"duplicar","duplicar","Duplicar"+" "+TransaccionContaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarTransaccionConta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarTransaccionConta,this.jTtoolBarTransaccionConta,
							"copiar","copiar","Copiar"+" "+TransaccionContaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarTransaccionConta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarTransaccionConta,this.jTtoolBarTransaccionConta,
							"ver_form","ver_form","Ver"+" "+TransaccionContaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarTransaccionConta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTransaccionConta,this.jTtoolBarTransaccionConta,
							"recargar","recargar","Recargar"+" "+TransaccionContaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarTransaccionConta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTransaccionConta,this.jTtoolBarTransaccionConta,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarTransaccionConta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarTransaccionConta,this.jTtoolBarTransaccionConta,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarTransaccionConta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarTransaccionConta,this.jTtoolBarTransaccionConta,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarTransaccionConta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarTransaccionConta,this.jTtoolBarTransaccionConta,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarTransaccionConta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarTransaccionConta,this.jTtoolBarTransaccionConta,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+TransaccionContaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarTransaccionConta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarTransaccionConta,this.jTtoolBarTransaccionConta,
							"cerrar","cerrar","Salir"+" "+TransaccionContaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarTransaccionConta=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarTransaccionConta;
			
				this.jButtonProcesarInformacionToolBarTransaccionConta=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarTransaccionConta;
				
		//protected JButton jButtonModificarToolBarTransaccionConta;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarTransaccionConta=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuTransaccionConta=new JMenuMe("General");
		this.jmenuArchivoTransaccionConta=new JMenuMe("Archivo");
		this.jmenuAccionesTransaccionConta=new JMenuMe("Acciones");
		this.jmenuDatosTransaccionConta=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTransaccionConta= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTransaccionConta.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTransaccionConta,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTransaccionConta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarTransaccionConta= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarTransaccionConta.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarTransaccionConta,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarTransaccionConta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesTransaccionConta= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesTransaccionConta.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesTransaccionConta,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesTransaccionConta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosTransaccionConta= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTransaccionConta.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTransaccionConta,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTransaccionConta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarTransaccionConta= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarTransaccionConta.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarTransaccionConta,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarTransaccionConta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormTransaccionConta= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormTransaccionConta.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormTransaccionConta,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormTransaccionConta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaTransaccionConta= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaTransaccionConta.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaTransaccionConta,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaTransaccionConta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTransaccionConta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTransaccionConta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTransaccionConta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTransaccionConta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionTransaccionConta= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionTransaccionConta.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionTransaccionConta,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionTransaccionConta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionTransaccionConta= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionTransaccionConta.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionTransaccionConta,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresTransaccionConta= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresTransaccionConta.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresTransaccionConta,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresTransaccionConta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesTransaccionConta= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesTransaccionConta.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesTransaccionConta,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesTransaccionConta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByTransaccionConta= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByTransaccionConta.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByTransaccionConta,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByTransaccionConta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTransaccionConta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTransaccionConta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTransaccionConta,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTransaccionConta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByTransaccionConta= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByTransaccionConta.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByTransaccionConta,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByTransaccionConta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTransaccionConta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTransaccionConta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTransaccionConta,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTransaccionConta, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosTransaccionConta= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosTransaccionConta.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosTransaccionConta,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosTransaccionConta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoTransaccionConta.add(this.jMenuItemCerrarTransaccionConta);
			
			this.jmenuAccionesTransaccionConta.add(this.jMenuItemNuevoTransaccionConta);
			this.jmenuAccionesTransaccionConta.add(this.jMenuItemNuevoGuardarCambiosTransaccionConta);
			this.jmenuAccionesTransaccionConta.add(this.jMenuItemNuevoRelacionesTransaccionConta);
			this.jmenuAccionesTransaccionConta.add(this.jMenuItemGuardarCambiosTablaTransaccionConta);		
			this.jmenuAccionesTransaccionConta.add(this.jMenuItemDuplicarTransaccionConta);		
			this.jmenuAccionesTransaccionConta.add(this.jMenuItemCopiarTransaccionConta);		
			this.jmenuAccionesTransaccionConta.add(this.jMenuItemVerFormTransaccionConta);		
			
			this.jmenuDatosTransaccionConta.add(this.jMenuItemRecargarInformacionTransaccionConta);				
			this.jmenuDatosTransaccionConta.add(this.jMenuItemAnterioresTransaccionConta);				
			this.jmenuDatosTransaccionConta.add(this.jMenuItemSiguientesTransaccionConta);				
			this.jmenuDatosTransaccionConta.add(this.jMenuItemAbrirOrderByTransaccionConta);				
			this.jmenuDatosTransaccionConta.add(this.jMenuItemMostrarOcultarTransaccionConta);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesTransaccionConta.add(this.jMenuItemGuardarCambiosTransaccionConta);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoTransaccionConta, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesTransaccionConta, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosTransaccionConta, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarTransaccionConta.add(this.jmenuArchivoTransaccionConta);		
			this.jmenuBarTransaccionConta.add(this.jmenuAccionesTransaccionConta);		
			this.jmenuBarTransaccionConta.add(this.jmenuDatosTransaccionConta);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarTransaccionConta);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasTransaccionConta() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelBusquedaPorCodigoTransaccionConta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorCodigoTransaccionConta.setToolTipText("Buscar Por Codigo ");
		this.jButtonBusquedaPorCodigoTransaccionConta= new JButtonMe();
		this.jButtonBusquedaPorCodigoTransaccionConta.setText("Buscar");
		this.jButtonBusquedaPorCodigoTransaccionConta.setToolTipText("Buscar Por Codigo ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorCodigoTransaccionConta,"buscar_button","Buscar Por Codigo ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorCodigoTransaccionConta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelcodigoBusquedaPorCodigoTransaccionConta = new JLabelMe();
		jLabelcodigoBusquedaPorCodigoTransaccionConta.setText("Codigo :");
		jLabelcodigoBusquedaPorCodigoTransaccionConta.setToolTipText("Codigo");
		jLabelcodigoBusquedaPorCodigoTransaccionConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoTransaccionConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelcodigoBusquedaPorCodigoTransaccionConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelcodigoBusquedaPorCodigoTransaccionConta,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldcodigoBusquedaPorCodigoTransaccionConta= new JTextFieldMe();
		jTextFieldcodigoBusquedaPorCodigoTransaccionConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoTransaccionConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBusquedaPorCodigoTransaccionConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoBusquedaPorCodigoTransaccionConta,STIPO_TAMANIO_GENERAL,false,true,this);



		this.jPanelBusquedaPorIdTransaccionConta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorIdTransaccionConta.setToolTipText("Buscar Por Id ");
		this.jButtonBusquedaPorIdTransaccionConta= new JButtonMe();
		this.jButtonBusquedaPorIdTransaccionConta.setText("Buscar");
		this.jButtonBusquedaPorIdTransaccionConta.setToolTipText("Buscar Por Id ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorIdTransaccionConta,"buscar_button","Buscar Por Id ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorIdTransaccionConta, STIPO_TAMANIO_GENERAL,false,true,this);;
			jLabelidBusquedaPorIdTransaccionConta = new JLabelMe();
		jLabelidBusquedaPorIdTransaccionConta.setText("Id :");
		jLabelidBusquedaPorIdTransaccionConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-60),Constantes.ISWING_ALTO_CONTROL));
		jLabelidBusquedaPorIdTransaccionConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-60),Constantes.ISWING_ALTO_CONTROL));
		jLabelidBusquedaPorIdTransaccionConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-60),Constantes.ISWING_ALTO_CONTROL));

		FuncionesSwing.setBoldLabel(jLabelidBusquedaPorIdTransaccionConta,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextFieldidTransaccionContaBusquedaPorId= new JTextFieldMe();
		jTextFieldidTransaccionContaBusquedaPorId.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTransaccionContaBusquedaPorId.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTransaccionContaBusquedaPorId.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



		this.jPanelBusquedaPorNombreTransaccionConta=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelBusquedaPorNombreTransaccionConta.setToolTipText("Buscar Por Nombre ");
		this.jButtonBusquedaPorNombreTransaccionConta= new JButtonMe();
		this.jButtonBusquedaPorNombreTransaccionConta.setText("Buscar");
		this.jButtonBusquedaPorNombreTransaccionConta.setToolTipText("Buscar Por Nombre ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonBusquedaPorNombreTransaccionConta,"buscar_button","Buscar Por Nombre ");

		FuncionesSwing.setBoldButton(this.jButtonBusquedaPorNombreTransaccionConta, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelnombreBusquedaPorNombreTransaccionConta = new JLabelMe();
		jLabelnombreBusquedaPorNombreTransaccionConta.setText("Nombre :");
		jLabelnombreBusquedaPorNombreTransaccionConta.setToolTipText("Nombre");
		jLabelnombreBusquedaPorNombreTransaccionConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTransaccionConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelnombreBusquedaPorNombreTransaccionConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelnombreBusquedaPorNombreTransaccionConta,STIPO_TAMANIO_GENERAL,false,true,this);

		jTextAreanombreBusquedaPorNombreTransaccionConta= new JTextAreaMe();
		jTextAreanombreBusquedaPorNombreTransaccionConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTransaccionConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBusquedaPorNombreTransaccionConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextArea(jTextAreanombreBusquedaPorNombreTransaccionConta,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasTransaccionConta=new JTabbedPane();


		this.jTabbedPaneBusquedasTransaccionConta.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTransaccionConta.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasTransaccionConta.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasTransaccionConta.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasTransaccionConta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasTransaccionConta,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleTransaccionConta = new TransaccionContaDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Transaccion Contablilidad DATOS");
			this.jInternalFrameDetalleFormTransaccionConta = new TransaccionContaDetalleFormJInternalFrame(jDesktopPane,this.transaccioncontaSessionBean.getConGuardarRelaciones(),this.transaccioncontaSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormTransaccionConta = null;//new TransaccionContaDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTransaccionConta= new GridBagLayout();
		
		
		this.jTableDatosTransaccionConta = new JTableMe();      
		
		String sToolTipTransaccionConta="";
		sToolTipTransaccionConta=TransaccionContaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTransaccionConta+="(Contabilidad.TransaccionConta)";
		}
		
		if(!this.transaccioncontaSessionBean.getEsGuardarRelacionado()) {
			sToolTipTransaccionConta+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosTransaccionConta.setToolTipText(sToolTipTransaccionConta);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosTransaccionConta);
		this.jTableDatosTransaccionConta.setAutoCreateRowSorter(true);
		this.jTableDatosTransaccionConta.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosTransaccionConta.setRowSelectionAllowed(true);
		this.jTableDatosTransaccionConta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosTransaccionConta,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoTransaccionConta = new JButtonMe();
		this.jButtonDuplicarTransaccionConta = new JButtonMe();
		this.jButtonCopiarTransaccionConta = new JButtonMe();
		this.jButtonVerFormTransaccionConta = new JButtonMe();
		this.jButtonNuevoRelacionesTransaccionConta = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaTransaccionConta = new JButtonMe();
		this.jButtonCerrarTransaccionConta = new JButtonMe();
		
		this.jScrollPanelDatosTransaccionConta = new JScrollPane();   
        this.jScrollPanelDatosGeneralTransaccionConta = new JScrollPane();
		
				
		
		
		this.jPanelAccionesTransaccionConta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Transaccion Contablilidad";
		
		if(!this.transaccioncontaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTransaccionConta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Transaccion Contablilidads" + this.sPath));
		} else {
			this.jScrollPanelDatosTransaccionConta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralTransaccionConta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesTransaccionConta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTransaccionConta.setToolTipText("Acciones");
        this.jPanelAccionesTransaccionConta.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTransaccionConta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTransaccionConta, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoTransaccionConta=new ReporteDinamicoJInternalFrame(TransaccionContaConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoTransaccionConta();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionTransaccionConta=new ImportacionJInternalFrame(TransaccionContaConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionTransaccionConta();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByTransaccionConta = new JButtonMe();
		
		this.jButtonAbrirOrderByTransaccionConta.setText("Orden");
		this.jButtonAbrirOrderByTransaccionConta.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTransaccionConta,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTransaccionConta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByTransaccionConta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByTransaccionConta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTransaccionConta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTransaccionConta,false,this);
			
			//this.cargarOrderByTransaccionConta(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByTransaccionConta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTransaccionConta,true,this);
			
			//this.cargarOrderByTransaccionConta(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosTransaccionConta.setMinimumSize(new Dimension(400,50));//430
		this.jTableDatosTransaccionConta.setMaximumSize(new Dimension(400,50));//430
		this.jTableDatosTransaccionConta.setPreferredSize(new Dimension(400,50));//430
		
		this.jScrollPanelDatosTransaccionConta.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosTransaccionConta.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosTransaccionConta.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoTransaccionConta.setText("Nuevo");
		this.jButtonDuplicarTransaccionConta.setText("Duplicar");
		this.jButtonCopiarTransaccionConta.setText("Copiar");
		this.jButtonVerFormTransaccionConta.setText("Ver");
		this.jButtonNuevoRelacionesTransaccionConta.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaTransaccionConta.setText("Guardar");
		this.jButtonCerrarTransaccionConta.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTransaccionConta,"nuevo_button","Nuevo",this.transaccioncontaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarTransaccionConta,"duplicar_button","Duplicar",this.transaccioncontaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarTransaccionConta,"copiar_button","Copiar",this.transaccioncontaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormTransaccionConta,"ver_form","Ver",this.transaccioncontaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesTransaccionConta,"nuevorelaciones_button","Nuevo Rel",this.transaccioncontaSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTransaccionConta,"guardarcambiostabla_button","Guardar",this.transaccioncontaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTransaccionConta,"cerrar_button","Salir",this.transaccioncontaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTransaccionConta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarTransaccionConta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarTransaccionConta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormTransaccionConta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesTransaccionConta, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTransaccionConta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTransaccionConta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoTransaccionConta.setToolTipText("Nuevo"+" "+TransaccionContaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarTransaccionConta.setToolTipText("Duplicar"+" "+TransaccionContaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarTransaccionConta.setToolTipText("Copiar"+" "+TransaccionContaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormTransaccionConta.setToolTipText("Ver"+" "+TransaccionContaConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesTransaccionConta.setToolTipText("Nuevo Rel"+" "+TransaccionContaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaTransaccionConta.setToolTipText("Guardar"+" "+TransaccionContaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTransaccionConta.setToolTipText("Salir"+" "+TransaccionContaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTransaccionConta";
		inputMap = this.jButtonNuevoTransaccionConta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTransaccionConta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTransaccionConta"));
		
		//DUPLICAR
		sMapKey = "DuplicarTransaccionConta";
		inputMap = this.jButtonDuplicarTransaccionConta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarTransaccionConta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarTransaccionConta"));
		
		//COPIAR
		sMapKey = "CopiarTransaccionConta";
		inputMap = this.jButtonCopiarTransaccionConta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarTransaccionConta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarTransaccionConta"));
		
		//VEr FORM
		sMapKey = "VerFormTransaccionConta";
		inputMap = this.jButtonVerFormTransaccionConta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormTransaccionConta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormTransaccionConta"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesTransaccionConta";
		inputMap = this.jButtonNuevoRelacionesTransaccionConta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesTransaccionConta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesTransaccionConta"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarTransaccionConta";
		inputMap = this.jButtonModificarTransaccionConta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarTransaccionConta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarTransaccionConta"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarTransaccionConta";
		inputMap = this.jButtonCerrarTransaccionConta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTransaccionConta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTransaccionConta"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTransaccionConta";
		inputMap = this.jButtonGuardarCambiosTablaTransaccionConta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTransaccionConta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTransaccionConta"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesTransaccionConta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesTransaccionConta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionTransaccionConta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1TransaccionConta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2TransaccionConta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3TransaccionConta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4TransaccionConta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5TransaccionConta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesTransaccionConta.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesTransaccionConta.setName("jPanelParametrosReportesTransaccionConta"); 
		
		this.jPanelParametrosReportesAccionesTransaccionConta.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesTransaccionConta.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesTransaccionConta.setName("jPanelParametrosReportesAccionesTransaccionConta"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesTransaccionConta, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesTransaccionConta, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionTransaccionConta = new JButtonMe();
		this.jButtonRecargarInformacionTransaccionConta.setText("Recargar");
		this.jButtonRecargarInformacionTransaccionConta.setToolTipText("Recargar"+" "+TransaccionContaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionTransaccionConta,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionTransaccionConta = new JButtonMe();
		this.jButtonProcesarInformacionTransaccionConta.setText("Procesar");
		this.jButtonProcesarInformacionTransaccionConta.setToolTipText("Procesar"+" "+TransaccionContaConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionTransaccionConta.setVisible(false);
			
		this.jButtonProcesarInformacionTransaccionConta.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTransaccionConta.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionTransaccionConta.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesTransaccionConta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTransaccionConta.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesTransaccionConta.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesTransaccionConta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTransaccionConta.setText("TIPO");       
		this.jComboBoxTiposReportesTransaccionConta.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesTransaccionConta = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesTransaccionConta.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesTransaccionConta.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionTransaccionConta = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionTransaccionConta.setText("Paginacion");
		this.jComboBoxTiposPaginacionTransaccionConta.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesTransaccionConta = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesTransaccionConta.setText("Accion");
		this.jComboBoxTiposRelacionesTransaccionConta.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesTransaccionConta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTransaccionConta.setText("Accion");
		this.jComboBoxTiposAccionesTransaccionConta.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarTransaccionConta = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarTransaccionConta.setText("Accion");
		this.jComboBoxTiposSeleccionarTransaccionConta.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralTransaccionConta=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralTransaccionConta.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTransaccionConta.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralTransaccionConta.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesTransaccionConta = new JLabelMe();
		
		this.jLabelAccionesTransaccionConta.setText("Acciones");		
		this.jLabelAccionesTransaccionConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTransaccionConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTransaccionConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosTransaccionConta = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosTransaccionConta.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosTransaccionConta.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosTransaccionConta = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosTransaccionConta.setText("Seleccionados");
		this.jCheckBoxSeleccionadosTransaccionConta.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaTransaccionConta = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaTransaccionConta.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaTransaccionConta.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteTransaccionConta = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteTransaccionConta.setText("Graf.");
		this.jCheckBoxConGraficoReporteTransaccionConta.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresTransaccionConta = new JButtonMe();
		//this.jButtonAnterioresTransaccionConta.setText("<<");
        this.jButtonAnterioresTransaccionConta.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresTransaccionConta,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresTransaccionConta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesTransaccionConta = new JButtonMe();
		//this.jButtonSiguientesTransaccionConta.setText(">>");
        this.jButtonSiguientesTransaccionConta.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesTransaccionConta,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesTransaccionConta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosTransaccionConta = new JButtonMe();
		this.jButtonNuevoGuardarCambiosTransaccionConta.setText("Nue");
        this.jButtonNuevoGuardarCambiosTransaccionConta.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosTransaccionConta,"nuevoguardarcambios_button","Nue",this.transaccioncontaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosTransaccionConta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosTransaccionConta";
		inputMap = this.jButtonNuevoGuardarCambiosTransaccionConta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosTransaccionConta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosTransaccionConta"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionTransaccionConta";
		inputMap = this.jButtonRecargarInformacionTransaccionConta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionTransaccionConta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionTransaccionConta"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesTransaccionConta";
		inputMap = this.jButtonSiguientesTransaccionConta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesTransaccionConta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesTransaccionConta"));
		
		//ANTERIORES		
		sMapKey = "AnterioresTransaccionConta";
		inputMap = this.jButtonAnterioresTransaccionConta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresTransaccionConta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresTransaccionConta"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasTransaccionConta();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesTransaccionConta.setMinimumSize(new Dimension(this.getWidth(),TransaccionContaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TransaccionContaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTransaccionConta.setMaximumSize(new Dimension(this.getWidth(),TransaccionContaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TransaccionContaBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesTransaccionConta.setPreferredSize(new Dimension(this.getWidth(),TransaccionContaBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(TransaccionContaBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionTransaccionConta = new GridBagLayout();

			this.jPanelPaginacionTransaccionConta.setLayout(gridaBagLayoutPaginacionTransaccionConta);						
			
			this.gridBagConstraintsTransaccionConta = new GridBagConstraints();
			this.gridBagConstraintsTransaccionConta.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsTransaccionConta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionConta.gridy = 0;
			this.gridBagConstraintsTransaccionConta.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionTransaccionConta.add(this.jButtonAnterioresTransaccionConta, this.gridBagConstraintsTransaccionConta);
					
						
			this.gridBagConstraintsTransaccionConta = new GridBagConstraints();
			this.gridBagConstraintsTransaccionConta.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTransaccionConta.gridy = 0;
			
			this.jPanelPaginacionTransaccionConta.add(this.jButtonNuevoGuardarCambiosTransaccionConta, this.gridBagConstraintsTransaccionConta);
						
			
			this.gridBagConstraintsTransaccionConta = new GridBagConstraints();
			this.gridBagConstraintsTransaccionConta.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsTransaccionConta.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsTransaccionConta.gridy = 0;
			this.jPanelPaginacionTransaccionConta.add(this.jButtonSiguientesTransaccionConta, this.gridBagConstraintsTransaccionConta);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsTransaccionConta = new GridBagConstraints();
			this.gridBagConstraintsTransaccionConta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionConta.gridy = 1;
			this.gridBagConstraintsTransaccionConta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTransaccionConta.add(this.jButtonNuevoTransaccionConta, this.gridBagConstraintsTransaccionConta);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsTransaccionConta = new GridBagConstraints();
				this.gridBagConstraintsTransaccionConta.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTransaccionConta.gridy = 1;
				this.gridBagConstraintsTransaccionConta.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionTransaccionConta.add(this.jButtonNuevoRelacionesTransaccionConta, this.gridBagConstraintsTransaccionConta);
			}
			
			
			if(!this.transaccioncontaSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsTransaccionConta = new GridBagConstraints();
				this.gridBagConstraintsTransaccionConta.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsTransaccionConta.gridy = 1;
				this.gridBagConstraintsTransaccionConta.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionTransaccionConta.add(this.jButtonGuardarCambiosTablaTransaccionConta, this.gridBagConstraintsTransaccionConta);
			}
			
			
			
			this.gridBagConstraintsTransaccionConta = new GridBagConstraints();
			this.gridBagConstraintsTransaccionConta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionConta.gridy = 1;
			this.gridBagConstraintsTransaccionConta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTransaccionConta.add(this.jButtonDuplicarTransaccionConta, this.gridBagConstraintsTransaccionConta);
			
			this.gridBagConstraintsTransaccionConta = new GridBagConstraints();
			this.gridBagConstraintsTransaccionConta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionConta.gridy = 1;
			this.gridBagConstraintsTransaccionConta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTransaccionConta.add(this.jButtonCopiarTransaccionConta, this.gridBagConstraintsTransaccionConta);
		
			this.gridBagConstraintsTransaccionConta = new GridBagConstraints();
			this.gridBagConstraintsTransaccionConta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionConta.gridy = 1;
			this.gridBagConstraintsTransaccionConta.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionTransaccionConta.add(this.jButtonVerFormTransaccionConta, this.gridBagConstraintsTransaccionConta);
		
			this.gridBagConstraintsTransaccionConta = new GridBagConstraints();
			this.gridBagConstraintsTransaccionConta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionConta.gridy = 1;
			this.gridBagConstraintsTransaccionConta.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionTransaccionConta.add(this.jButtonCerrarTransaccionConta, this.gridBagConstraintsTransaccionConta);
		
		
		
		this.jButtonRecargarInformacionTransaccionConta.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTransaccionConta.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionTransaccionConta.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionTransaccionConta, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesTransaccionConta.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTransaccionConta.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesTransaccionConta.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesTransaccionConta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesTransaccionConta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTransaccionConta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesTransaccionConta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesTransaccionConta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesTransaccionConta.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTransaccionConta.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesTransaccionConta.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesTransaccionConta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionTransaccionConta.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTransaccionConta.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionTransaccionConta.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionTransaccionConta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesTransaccionConta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTransaccionConta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesTransaccionConta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesTransaccionConta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesTransaccionConta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTransaccionConta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTransaccionConta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTransaccionConta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarTransaccionConta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTransaccionConta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarTransaccionConta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarTransaccionConta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaTransaccionConta.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTransaccionConta.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaTransaccionConta.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaTransaccionConta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteTransaccionConta.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTransaccionConta.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteTransaccionConta.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteTransaccionConta, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosTransaccionConta.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTransaccionConta.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosTransaccionConta.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosTransaccionConta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosTransaccionConta.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTransaccionConta.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosTransaccionConta.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosTransaccionConta, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesTransaccionConta = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesTransaccionConta = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1TransaccionConta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2TransaccionConta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3TransaccionConta = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4TransaccionConta = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesTransaccionConta.setLayout(gridaBagParametrosReportesTransaccionConta);
			this.jPanelParametrosReportesAccionesTransaccionConta.setLayout(gridaBagParametrosReportesAccionesTransaccionConta);
			
			
			this.jPanelParametrosAuxiliar1TransaccionConta.setLayout(gridaBagParametrosAuxiliar1TransaccionConta);
			this.jPanelParametrosAuxiliar2TransaccionConta.setLayout(gridaBagParametrosAuxiliar2TransaccionConta);
			this.jPanelParametrosAuxiliar3TransaccionConta.setLayout(gridaBagParametrosAuxiliar3TransaccionConta);
			this.jPanelParametrosAuxiliar4TransaccionConta.setLayout(gridaBagParametrosAuxiliar4TransaccionConta);
			//this.jPanelParametrosAuxiliar5TransaccionConta.setLayout(gridaBagParametrosAuxiliar2TransaccionConta);			
			
			
			
			
			this.gridBagConstraintsTransaccionConta = new GridBagConstraints();
			this.gridBagConstraintsTransaccionConta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionConta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTransaccionConta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTransaccionConta.add(this.jButtonRecargarInformacionTransaccionConta, this.gridBagConstraintsTransaccionConta);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsTransaccionConta = new GridBagConstraints();
			this.gridBagConstraintsTransaccionConta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransaccionConta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTransaccionConta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TransaccionConta.add(this.jComboBoxTiposPaginacionTransaccionConta, this.gridBagConstraintsTransaccionConta);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsTransaccionConta = new GridBagConstraints();
			this.gridBagConstraintsTransaccionConta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransaccionConta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTransaccionConta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TransaccionConta.add(this.jCheckBoxConAltoMaximoTablaTransaccionConta, this.gridBagConstraintsTransaccionConta);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsTransaccionConta = new GridBagConstraints();
			this.gridBagConstraintsTransaccionConta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransaccionConta.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsTransaccionConta.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1TransaccionConta.add(this.jComboBoxTiposArchivosReportesTransaccionConta, this.gridBagConstraintsTransaccionConta);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsTransaccionConta = new GridBagConstraints();
			this.gridBagConstraintsTransaccionConta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransaccionConta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTransaccionConta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTransaccionConta.add(this.jPanelParametrosAuxiliar1TransaccionConta, this.gridBagConstraintsTransaccionConta);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsTransaccionConta = new GridBagConstraints();
			this.gridBagConstraintsTransaccionConta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransaccionConta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionConta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTransaccionConta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4TransaccionConta.add(this.jComboBoxTiposReportesTransaccionConta, this.gridBagConstraintsTransaccionConta);																		
			
			
			
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsTransaccionConta = new GridBagConstraints();
			this.gridBagConstraintsTransaccionConta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransaccionConta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTransaccionConta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTransaccionConta.add(this.jPanelParametrosAuxiliar4TransaccionConta, this.gridBagConstraintsTransaccionConta);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsTransaccionConta = new GridBagConstraints();
			this.gridBagConstraintsTransaccionConta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransaccionConta.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsTransaccionConta.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTransaccionConta.add(this.jComboBoxTiposReportesTransaccionConta, this.gridBagConstraintsTransaccionConta);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsTransaccionConta = new GridBagConstraints();
			this.gridBagConstraintsTransaccionConta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransaccionConta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTransaccionConta.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTransaccionConta.add(this.jCheckBoxGenerarReporteTransaccionConta, this.gridBagConstraintsTransaccionConta);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsTransaccionConta = new GridBagConstraints();
			this.gridBagConstraintsTransaccionConta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransaccionConta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTransaccionConta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTransaccionConta.add(this.jPanelParametrosAuxiliar2TransaccionConta, this.gridBagConstraintsTransaccionConta);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsTransaccionConta = new GridBagConstraints();
			this.gridBagConstraintsTransaccionConta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionConta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTransaccionConta.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTransaccionConta.add(this.jLabelAccionesTransaccionConta, this.gridBagConstraintsTransaccionConta);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsTransaccionConta = new GridBagConstraints();
				this.gridBagConstraintsTransaccionConta.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsTransaccionConta.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsTransaccionConta.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesTransaccionConta.add(this.jButtonAbrirOrderByTransaccionConta, this.gridBagConstraintsTransaccionConta);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsTransaccionConta = new GridBagConstraints();
			this.gridBagConstraintsTransaccionConta.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsTransaccionConta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTransaccionConta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTransaccionConta.add(this.jComboBoxTiposSeleccionarTransaccionConta, this.gridBagConstraintsTransaccionConta);			
			
			
			/*
			this.gridBagConstraintsTransaccionConta = new GridBagConstraints();
			this.gridBagConstraintsTransaccionConta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionConta.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsTransaccionConta.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesTransaccionConta.add(this.jCheckBoxSeleccionarTodosTransaccionConta, this.gridBagConstraintsTransaccionConta);
			
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsTransaccionConta = new GridBagConstraints();
			this.gridBagConstraintsTransaccionConta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransaccionConta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionConta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTransaccionConta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TransaccionConta.add(this.jCheckBoxSeleccionarTodosTransaccionConta, this.gridBagConstraintsTransaccionConta);															
				
			this.gridBagConstraintsTransaccionConta = new GridBagConstraints();
			this.gridBagConstraintsTransaccionConta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransaccionConta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionConta.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsTransaccionConta.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3TransaccionConta.add(this.jCheckBoxSeleccionadosTransaccionConta, this.gridBagConstraintsTransaccionConta);															
			
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsTransaccionConta = new GridBagConstraints();
			this.gridBagConstraintsTransaccionConta.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsTransaccionConta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTransaccionConta.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesTransaccionConta.add(this.jPanelParametrosAuxiliar3TransaccionConta, this.gridBagConstraintsTransaccionConta);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsTransaccionConta = new GridBagConstraints();
			this.gridBagConstraintsTransaccionConta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTransaccionConta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTransaccionConta.add(this.jComboBoxTiposRelacionesTransaccionConta, this.gridBagConstraintsTransaccionConta);
				
			this.gridBagConstraintsTransaccionConta = new GridBagConstraints();
			this.gridBagConstraintsTransaccionConta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTransaccionConta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTransaccionConta.add(this.jComboBoxTiposAccionesTransaccionConta, this.gridBagConstraintsTransaccionConta);
	
				
			this.gridBagConstraintsTransaccionConta = new GridBagConstraints();
			this.gridBagConstraintsTransaccionConta.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsTransaccionConta.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesTransaccionConta.add(this.jTextFieldValorCampoGeneralTransaccionConta, this.gridBagConstraintsTransaccionConta);			
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosTransaccionConta = new GridBagLayout();

			this.jScrollPanelDatosTransaccionConta.setLayout(gridaBagLayoutDatosTransaccionConta);
			
			this.gridBagConstraintsTransaccionConta = new GridBagConstraints();
			this.gridBagConstraintsTransaccionConta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionConta.gridy = 0;
			this.gridBagConstraintsTransaccionConta.gridx = 0;
			
			this.jScrollPanelDatosTransaccionConta.add(this.jTableDatosTransaccionConta, this.gridBagConstraintsTransaccionConta);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosTransaccionConta.setViewportView(this.jTableDatosTransaccionConta);
		this.jTableDatosTransaccionConta.setFillsViewportHeight(true);
		this.jTableDatosTransaccionConta.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTransaccionConta= new GridBagLayout();
		this.jPanelAccionesTransaccionConta.setLayout(gridaBagLayoutAccionesTransaccionConta);
		
		
		/*	
		this.gridBagConstraintsTransaccionConta = new GridBagConstraints();
		this.gridBagConstraintsTransaccionConta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransaccionConta.gridy = 0;
		this.gridBagConstraintsTransaccionConta.gridx = 0;
			
		this.jPanelAccionesTransaccionConta.add(this.jButtonNuevoTransaccionConta, this.gridBagConstraintsTransaccionConta);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutBusquedaPorCodigoTransaccionConta= new GridBagLayout();
		gridaBagLayoutBusquedaPorCodigoTransaccionConta.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoTransaccionConta.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorCodigoTransaccionConta.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorCodigoTransaccionConta.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorCodigoTransaccionConta.setLayout(gridaBagLayoutBusquedaPorCodigoTransaccionConta);

		gridBagConstraintsTransaccionConta = new GridBagConstraints();
		gridBagConstraintsTransaccionConta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransaccionConta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransaccionConta.gridy = 0;
		gridBagConstraintsTransaccionConta.gridx = 0;
		jPanelBusquedaPorCodigoTransaccionConta.add(jLabelcodigoBusquedaPorCodigoTransaccionConta, gridBagConstraintsTransaccionConta);

		gridBagConstraintsTransaccionConta = new GridBagConstraints();
		gridBagConstraintsTransaccionConta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransaccionConta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransaccionConta.gridy = 0;
		gridBagConstraintsTransaccionConta.gridx = 1;
		jPanelBusquedaPorCodigoTransaccionConta.add(jTextFieldcodigoBusquedaPorCodigoTransaccionConta, gridBagConstraintsTransaccionConta);

		gridBagConstraintsTransaccionConta = new GridBagConstraints();
		gridBagConstraintsTransaccionConta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransaccionConta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransaccionConta.gridy = 1;
		gridBagConstraintsTransaccionConta.gridx =1;
		jPanelBusquedaPorCodigoTransaccionConta.add(jButtonBusquedaPorCodigoTransaccionConta, gridBagConstraintsTransaccionConta);

		jTabbedPaneBusquedasTransaccionConta.addTab("1.-Por Codigo ", jPanelBusquedaPorCodigoTransaccionConta);
		jTabbedPaneBusquedasTransaccionConta.setMnemonicAt(0, KeyEvent.VK_1);

		GridBagLayout gridaBagLayoutBusquedaPorIdTransaccionConta= new GridBagLayout();
		gridaBagLayoutBusquedaPorIdTransaccionConta.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorIdTransaccionConta.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorIdTransaccionConta.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorIdTransaccionConta.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorIdTransaccionConta.setLayout(gridaBagLayoutBusquedaPorIdTransaccionConta);

		gridBagConstraintsTransaccionConta = new GridBagConstraints();
		gridBagConstraintsTransaccionConta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransaccionConta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransaccionConta.gridy = 0;
		gridBagConstraintsTransaccionConta.gridx = 0;
		jPanelBusquedaPorIdTransaccionConta.add(jLabelidBusquedaPorIdTransaccionConta, gridBagConstraintsTransaccionConta);

		gridBagConstraintsTransaccionConta = new GridBagConstraints();
		gridBagConstraintsTransaccionConta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransaccionConta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransaccionConta.gridy = 0;
		gridBagConstraintsTransaccionConta.gridx = 1;
		jPanelBusquedaPorIdTransaccionConta.add(jTextFieldidTransaccionContaBusquedaPorId, gridBagConstraintsTransaccionConta);

		gridBagConstraintsTransaccionConta = new GridBagConstraints();
		gridBagConstraintsTransaccionConta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransaccionConta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransaccionConta.gridy = 1;
		gridBagConstraintsTransaccionConta.gridx =1;
		jPanelBusquedaPorIdTransaccionConta.add(jButtonBusquedaPorIdTransaccionConta, gridBagConstraintsTransaccionConta);

		jTabbedPaneBusquedasTransaccionConta.addTab("2.-Por Id ", jPanelBusquedaPorIdTransaccionConta);
		jTabbedPaneBusquedasTransaccionConta.setMnemonicAt(1, KeyEvent.VK_2);

		GridBagLayout gridaBagLayoutBusquedaPorNombreTransaccionConta= new GridBagLayout();
		gridaBagLayoutBusquedaPorNombreTransaccionConta.rowHeights = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTransaccionConta.columnWidths = new int[] {1};
		gridaBagLayoutBusquedaPorNombreTransaccionConta.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutBusquedaPorNombreTransaccionConta.columnWeights = new double[]{0.0, 1.0};
		jPanelBusquedaPorNombreTransaccionConta.setLayout(gridaBagLayoutBusquedaPorNombreTransaccionConta);

		gridBagConstraintsTransaccionConta = new GridBagConstraints();
		gridBagConstraintsTransaccionConta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransaccionConta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransaccionConta.gridy = 0;
		gridBagConstraintsTransaccionConta.gridx = 0;
		jPanelBusquedaPorNombreTransaccionConta.add(jLabelnombreBusquedaPorNombreTransaccionConta, gridBagConstraintsTransaccionConta);

		gridBagConstraintsTransaccionConta = new GridBagConstraints();
		gridBagConstraintsTransaccionConta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransaccionConta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransaccionConta.gridy = 0;
		gridBagConstraintsTransaccionConta.gridx = 1;
		jPanelBusquedaPorNombreTransaccionConta.add(jTextAreanombreBusquedaPorNombreTransaccionConta, gridBagConstraintsTransaccionConta);

		gridBagConstraintsTransaccionConta = new GridBagConstraints();
		gridBagConstraintsTransaccionConta.anchor = GridBagConstraints.WEST;
		gridBagConstraintsTransaccionConta.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsTransaccionConta.gridy = 1;
		gridBagConstraintsTransaccionConta.gridx =1;
		jPanelBusquedaPorNombreTransaccionConta.add(jButtonBusquedaPorNombreTransaccionConta, gridBagConstraintsTransaccionConta);

		jTabbedPaneBusquedasTransaccionConta.addTab("3.-Por Nombre ", jPanelBusquedaPorNombreTransaccionConta);
		jTabbedPaneBusquedasTransaccionConta.setMnemonicAt(2, KeyEvent.VK_3);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTransaccionConta = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTransaccionConta);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.transaccioncontaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTransaccionConta = new GridBagConstraints();						
			this.gridBagConstraintsTransaccionConta.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTransaccionConta.gridx = 0;		
			//this.gridBagConstraintsTransaccionConta.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionConta.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTransaccionConta.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarTransaccionConta, this.gridBagConstraintsTransaccionConta);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsTransaccionConta = new GridBagConstraints();
		this.gridBagConstraintsTransaccionConta.gridy = iGridyPrincipal++;
		this.gridBagConstraintsTransaccionConta.gridx = 0;		
		//this.gridBagConstraintsTransaccionConta.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransaccionConta.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsTransaccionConta.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsTransaccionConta);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsTransaccionConta = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsTransaccionConta.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTransaccionConta.gridx = 0;		
			this.gridBagConstraintsTransaccionConta.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionConta.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsTransaccionConta.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasTransaccionConta, this.gridBagConstraintsTransaccionConta);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsTransaccionConta = new GridBagConstraints();
		this.gridBagConstraintsTransaccionConta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTransaccionConta.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesTransaccionConta, this.gridBagConstraintsTransaccionConta);								
		
		
		/*
		this.gridBagConstraintsTransaccionConta = new GridBagConstraints();
		this.gridBagConstraintsTransaccionConta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTransaccionConta.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesTransaccionConta, this.gridBagConstraintsTransaccionConta);
		*/		
		
		this.gridBagConstraintsTransaccionConta = new GridBagConstraints();
		this.gridBagConstraintsTransaccionConta.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTransaccionConta.gridx =0;
		this.gridBagConstraintsTransaccionConta.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTransaccionConta.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTransaccionConta, this.gridBagConstraintsTransaccionConta);
				
		
		this.gridBagConstraintsTransaccionConta = new GridBagConstraints();
		this.gridBagConstraintsTransaccionConta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTransaccionConta.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionTransaccionConta, this.gridBagConstraintsTransaccionConta);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(TransaccionContaJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosTransaccionConta= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTransaccionConta = new GridBagLayout();
			this.jPanelBusquedasParametrosTransaccionConta.setLayout(gridaBagLayoutBusquedasParametrosTransaccionConta);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralTransaccionConta=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTransaccionConta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTransaccionConta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTransaccionConta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTransaccionConta = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsTransaccionConta = new GridBagConstraints();
		this.gridBagConstraintsTransaccionConta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTransaccionConta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTransaccionConta, this.gridBagConstraintsTransaccionConta);
			
			
		this.gridBagConstraintsTransaccionConta = new GridBagConstraints();
		this.gridBagConstraintsTransaccionConta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTransaccionConta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTransaccionConta, this.gridBagConstraintsTransaccionConta);
		
			
		this.gridBagConstraintsTransaccionConta = new GridBagConstraints();
		this.gridBagConstraintsTransaccionConta.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTransaccionConta.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTransaccionConta, this.gridBagConstraintsTransaccionConta);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralTransaccionConta;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoTransaccionConta() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoTransaccionConta = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoTransaccionConta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoTransaccionConta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoTransaccionConta.setName("jPanelReporteDinamicoTransaccionConta"); 
		
		this.jPanelReporteDinamicoTransaccionConta.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTransaccionConta.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoTransaccionConta.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoTransaccionConta.setLayout(gridaBagLayoutReporteDinamicoTransaccionConta);
		
		
		this.jInternalFrameReporteDinamicoTransaccionConta= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoTransaccionConta = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTransaccionConta= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoTransaccionConta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoTransaccionConta.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoTransaccionConta.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoTransaccionConta.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoTransaccionConta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoTransaccionConta.setResizable(true);
	    this.jInternalFrameReporteDinamicoTransaccionConta.setClosable(true);
	    this.jInternalFrameReporteDinamicoTransaccionConta.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoTransaccionConta.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTransaccionConta.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoTransaccionConta.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoTransaccionConta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Transaccion Contablilidads"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteTransaccionConta = new JLabelMe();

		this.jLabelColumnasSelectReporteTransaccionConta.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteTransaccionConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTransaccionConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteTransaccionConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTransaccionConta = new GridBagConstraints();
		this.gridBagConstraintsTransaccionConta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionConta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransaccionConta.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTransaccionConta.add(this.jLabelColumnasSelectReporteTransaccionConta, this.gridBagConstraintsTransaccionConta);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteTransaccionConta = new JList<Reporte>();
		this.jListColumnasSelectReporteTransaccionConta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteTransaccionConta.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteTransaccionConta.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTransaccionConta.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteTransaccionConta.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteTransaccionConta=new JScrollPane(this.jListColumnasSelectReporteTransaccionConta);
			
			this.jScrollColumnasSelectReporteTransaccionConta.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTransaccionConta.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteTransaccionConta.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteTransaccionConta.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsTransaccionConta = new GridBagConstraints();
		this.gridBagConstraintsTransaccionConta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionConta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransaccionConta.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTransaccionConta.add(this.jListColumnasSelectReporteTransaccionConta, this.gridBagConstraintsTransaccionConta);
		this.jPanelReporteDinamicoTransaccionConta.add(this.jScrollColumnasSelectReporteTransaccionConta, this.gridBagConstraintsTransaccionConta);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteTransaccionConta = new JLabelMe();

		this.jLabelRelacionesSelectReporteTransaccionConta.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteTransaccionConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTransaccionConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteTransaccionConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsTransaccionConta = new GridBagConstraints();
		this.gridBagConstraintsTransaccionConta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionConta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransaccionConta.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoTransaccionConta.add(this.jLabelRelacionesSelectReporteTransaccionConta, this.gridBagConstraintsTransaccionConta);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteTransaccionConta = new JList<Reporte>();
		this.jListRelacionesSelectReporteTransaccionConta.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteTransaccionConta.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteTransaccionConta.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTransaccionConta.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteTransaccionConta.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteTransaccionConta=new JScrollPane(this.jListRelacionesSelectReporteTransaccionConta);
			
			this.jScrollRelacionesSelectReporteTransaccionConta.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTransaccionConta.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteTransaccionConta.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteTransaccionConta.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsTransaccionConta = new GridBagConstraints();
		this.gridBagConstraintsTransaccionConta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionConta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransaccionConta.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoTransaccionConta.add(this.jListRelacionesSelectReporteTransaccionConta, this.gridBagConstraintsTransaccionConta);
		this.jPanelReporteDinamicoTransaccionConta.add(this.jScrollRelacionesSelectReporteTransaccionConta, this.gridBagConstraintsTransaccionConta);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoTransaccionConta = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoTransaccionConta = new JComboBoxMe();
		this.jListColumnasValoresGraficoTransaccionConta = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoTransaccionConta = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoTransaccionConta.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoTransaccionConta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTransaccionConta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoTransaccionConta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoTransaccionConta, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoTransaccionConta = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoTransaccionConta.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoTransaccionConta.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTransaccionConta.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoTransaccionConta.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoTransaccionConta, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoTransaccionConta = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoTransaccionConta.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoTransaccionConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTransaccionConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoTransaccionConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTransaccionConta = new GridBagConstraints();
		this.gridBagConstraintsTransaccionConta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionConta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransaccionConta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTransaccionConta.add(this.jLabelGenerarExcelReporteDinamicoTransaccionConta, this.gridBagConstraintsTransaccionConta);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoTransaccionConta = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoTransaccionConta.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoTransaccionConta,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoTransaccionConta.setToolTipText("Generar EXCEL"+" "+TransaccionContaConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsTransaccionConta = new GridBagConstraints();
		//this.gridBagConstraintsTransaccionConta.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsTransaccionConta.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsTransaccionConta.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoTransaccionConta.add(this.jButtonGenerarExcelReporteDinamicoTransaccionConta, this.gridBagConstraintsTransaccionConta);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsTransaccionConta = new GridBagConstraints();
		this.gridBagConstraintsTransaccionConta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransaccionConta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTransaccionConta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTransaccionConta.add(this.jComboBoxTiposReportesDinamicoTransaccionConta, this.gridBagConstraintsTransaccionConta);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoTransaccionConta = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoTransaccionConta.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoTransaccionConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTransaccionConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoTransaccionConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsTransaccionConta = new GridBagConstraints();
		this.gridBagConstraintsTransaccionConta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionConta.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsTransaccionConta.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoTransaccionConta.add(this.jLabelTiposArchivoReporteDinamicoTransaccionConta, this.gridBagConstraintsTransaccionConta);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsTransaccionConta = new GridBagConstraints();
		this.gridBagConstraintsTransaccionConta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransaccionConta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTransaccionConta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTransaccionConta.add(this.jComboBoxTiposArchivosReportesDinamicoTransaccionConta, this.gridBagConstraintsTransaccionConta);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoTransaccionConta = new JButtonMe();
		this.jButtonGenerarReporteDinamicoTransaccionConta.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoTransaccionConta,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoTransaccionConta.setToolTipText("Generar"+" "+TransaccionContaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsTransaccionConta = new GridBagConstraints();
		this.gridBagConstraintsTransaccionConta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransaccionConta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTransaccionConta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTransaccionConta.add(this.jButtonGenerarReporteDinamicoTransaccionConta, this.gridBagConstraintsTransaccionConta);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoTransaccionConta = new JButtonMe();
		this.jButtonCerrarReporteDinamicoTransaccionConta.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoTransaccionConta,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoTransaccionConta.setToolTipText("Cancelar"+" "+TransaccionContaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTransaccionConta = new GridBagConstraints();
		this.gridBagConstraintsTransaccionConta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransaccionConta.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsTransaccionConta.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoTransaccionConta.add(this.jButtonCerrarReporteDinamicoTransaccionConta, this.gridBagConstraintsTransaccionConta);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalTransaccionConta = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoTransaccionConta= new JScrollPane(jPanelReporteDinamicoTransaccionConta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoTransaccionConta.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTransaccionConta.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoTransaccionConta.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoTransaccionConta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Transaccion Contablilidads"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsTransaccionConta = new GridBagConstraints();
		this.gridBagConstraintsTransaccionConta.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsTransaccionConta.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsTransaccionConta.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoTransaccionConta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoTransaccionConta.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalTransaccionConta);
		this.jInternalFrameReporteDinamicoTransaccionConta.getContentPane().add(this.jScrollPanelReporteDinamicoTransaccionConta, this.gridBagConstraintsTransaccionConta);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionTransaccionConta() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionTransaccionConta = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionTransaccionConta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionTransaccionConta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionTransaccionConta.setName("jPanelImportacionTransaccionConta"); 
		
		this.jPanelImportacionTransaccionConta.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTransaccionConta.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionTransaccionConta.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionTransaccionConta.setLayout(gridaBagLayoutImportacionTransaccionConta);
		
		
		this.jInternalFrameImportacionTransaccionConta= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionTransaccionConta= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionTransaccionConta = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteTransaccionConta= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionTransaccionConta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTransaccionConta.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTransaccionConta.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionTransaccionConta.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTransaccionConta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTransaccionConta.setResizable(true);
	    this.jInternalFrameImportacionTransaccionConta.setClosable(true);
	    this.jInternalFrameImportacionTransaccionConta.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionTransaccionConta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionTransaccionConta.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionTransaccionConta.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionTransaccionConta.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionTransaccionConta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionTransaccionConta.setResizable(true);
	    this.jInternalFrameImportacionTransaccionConta.setClosable(true);
	    this.jInternalFrameImportacionTransaccionConta.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionTransaccionConta.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTransaccionConta.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionTransaccionConta.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionTransaccionConta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Transaccion Contablilidads"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionTransaccionConta = new JLabelMe();

		this.jLabelArchivoImportacionTransaccionConta.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionTransaccionConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTransaccionConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionTransaccionConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTransaccionConta = new GridBagConstraints();
		this.gridBagConstraintsTransaccionConta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionConta.gridy = iPosYImportacion;		
		this.gridBagConstraintsTransaccionConta.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTransaccionConta.add(this.jLabelArchivoImportacionTransaccionConta, this.gridBagConstraintsTransaccionConta);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionTransaccionConta = new JFileChooser();		
		this.jFileChooserImportacionTransaccionConta.setToolTipText("ESCOGER ARCHIVO"+" "+TransaccionContaConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionTransaccionConta = new JButtonMe();
		this.jButtonAbrirImportacionTransaccionConta.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionTransaccionConta,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionTransaccionConta.setToolTipText("Generar"+" "+TransaccionContaConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsTransaccionConta = new GridBagConstraints();
		this.gridBagConstraintsTransaccionConta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransaccionConta.gridy = iPosYImportacion;
		this.gridBagConstraintsTransaccionConta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTransaccionConta.add(this.jButtonAbrirImportacionTransaccionConta, this.gridBagConstraintsTransaccionConta);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionTransaccionConta = new JLabelMe();

		this.jLabelPathArchivoImportacionTransaccionConta.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionTransaccionConta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTransaccionConta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionTransaccionConta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsTransaccionConta = new GridBagConstraints();
		this.gridBagConstraintsTransaccionConta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransaccionConta.gridy = iPosYImportacion;		
		this.gridBagConstraintsTransaccionConta.gridx = iPosXImportacion++;
			
		this.jPanelImportacionTransaccionConta.add(this.jLabelPathArchivoImportacionTransaccionConta, this.gridBagConstraintsTransaccionConta);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionTransaccionConta=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionTransaccionConta.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTransaccionConta.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionTransaccionConta.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsTransaccionConta = new GridBagConstraints();
		this.gridBagConstraintsTransaccionConta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransaccionConta.gridy = iPosYImportacion;
		this.gridBagConstraintsTransaccionConta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTransaccionConta.add(this.jTextFieldPathArchivoImportacionTransaccionConta, this.gridBagConstraintsTransaccionConta);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionTransaccionConta = new JButtonMe();
		this.jButtonGenerarImportacionTransaccionConta.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionTransaccionConta,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionTransaccionConta.setToolTipText("Generar"+" "+TransaccionContaConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsTransaccionConta = new GridBagConstraints();
		this.gridBagConstraintsTransaccionConta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransaccionConta.gridy = iPosYImportacion;
		this.gridBagConstraintsTransaccionConta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTransaccionConta.add(this.jButtonGenerarImportacionTransaccionConta, this.gridBagConstraintsTransaccionConta);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionTransaccionConta = new JButtonMe();
		this.jButtonCerrarImportacionTransaccionConta.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionTransaccionConta,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionTransaccionConta.setToolTipText("Cancelar"+" "+TransaccionContaConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsTransaccionConta = new GridBagConstraints();
		this.gridBagConstraintsTransaccionConta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransaccionConta.gridy = iPosYImportacion;
		this.gridBagConstraintsTransaccionConta.gridx = iPosXImportacion++;
							
		this.jPanelImportacionTransaccionConta.add(this.jButtonCerrarImportacionTransaccionConta, this.gridBagConstraintsTransaccionConta);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalTransaccionConta = new GridBagLayout();
		
		this.jScrollPanelImportacionTransaccionConta= new JScrollPane(jPanelImportacionTransaccionConta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsTransaccionConta = new GridBagConstraints();
		this.gridBagConstraintsTransaccionConta.gridy =iPosYImportacion;
		this.gridBagConstraintsTransaccionConta.gridx =iPosXImportacion;
		this.gridBagConstraintsTransaccionConta.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionTransaccionConta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionTransaccionConta.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalTransaccionConta);
		this.jInternalFrameImportacionTransaccionConta.getContentPane().add(this.jScrollPanelImportacionTransaccionConta, this.gridBagConstraintsTransaccionConta);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByTransaccionConta(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByTransaccionConta = new JButtonMe();
			this.jButtonAbrirOrderByTransaccionConta.setText("Orden");
			this.jButtonAbrirOrderByTransaccionConta.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByTransaccionConta,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByTransaccionConta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByTransaccionConta";
			inputMap = this.jButtonAbrirOrderByTransaccionConta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByTransaccionConta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByTransaccionConta"));
		
		
			GridBagLayout gridaBagLayoutOrderByTransaccionConta = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByTransaccionConta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByTransaccionConta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByTransaccionConta.setName("jPanelOrderByTransaccionConta"); 
			
			this.jPanelOrderByTransaccionConta.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTransaccionConta.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByTransaccionConta.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByTransaccionConta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByTransaccionConta.setLayout(gridaBagLayoutOrderByTransaccionConta);
			
			
			this.jTableDatosTransaccionContaOrderBy = new JTableMe();        
			this.jTableDatosTransaccionContaOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosTransaccionContaOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosTransaccionContaOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosTransaccionContaOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosTransaccionContaOrderBy.setViewportView(this.jTableDatosTransaccionContaOrderBy);
			this.jTableDatosTransaccionContaOrderBy.setFillsViewportHeight(true);
			this.jTableDatosTransaccionContaOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByTransaccionConta= new OrderByJInternalFrame();
			this.jInternalFrameOrderByTransaccionConta= new OrderByJInternalFrame();
			this.jScrollPanelOrderByTransaccionConta = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteTransaccionConta= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByTransaccionConta.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByTransaccionConta.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByTransaccionConta.setTitle("Orden");
			this.jInternalFrameOrderByTransaccionConta.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByTransaccionConta.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByTransaccionConta.setResizable(true);
			this.jInternalFrameOrderByTransaccionConta.setClosable(true);
			this.jInternalFrameOrderByTransaccionConta.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByTransaccionConta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByTransaccionConta.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTransaccionConta.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByTransaccionConta.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByTransaccionConta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByTransaccionConta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Transaccion Contablilidads"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsTransaccionConta = new GridBagConstraints();
			this.gridBagConstraintsTransaccionConta.gridy =iPosYOrderBy++;
			this.gridBagConstraintsTransaccionConta.gridx =iPosXOrderBy;
			this.gridBagConstraintsTransaccionConta.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsTransaccionConta.ipady =150;
				
			this.jPanelOrderByTransaccionConta.add(jScrollPanelDatosTransaccionContaOrderBy, this.gridBagConstraintsTransaccionConta);//this.jTableDatosTransaccionContaTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByTransaccionConta = new JButtonMe();
			this.jButtonCerrarOrderByTransaccionConta.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByTransaccionConta,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByTransaccionConta.setToolTipText("Cancelar"+" "+TransaccionContaConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByTransaccionConta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsTransaccionConta = new GridBagConstraints();
			this.gridBagConstraintsTransaccionConta.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransaccionConta.gridy = iPosYOrderBy++;
			this.gridBagConstraintsTransaccionConta.gridx = iPosXOrderBy;
									
			this.jPanelOrderByTransaccionConta.add(this.jButtonCerrarOrderByTransaccionConta, this.gridBagConstraintsTransaccionConta);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalTransaccionConta = new GridBagLayout();
			
			this.jScrollPanelOrderByTransaccionConta= new JScrollPane(jPanelOrderByTransaccionConta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsTransaccionConta = new GridBagConstraints();
			this.gridBagConstraintsTransaccionConta.gridy =iPosYOrderBy;
			this.gridBagConstraintsTransaccionConta.gridx =iPosXOrderBy;
			this.gridBagConstraintsTransaccionConta.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByTransaccionConta.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByTransaccionConta.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalTransaccionConta);
			
			this.jInternalFrameOrderByTransaccionConta.getContentPane().add(this.jScrollPanelOrderByTransaccionConta, this.gridBagConstraintsTransaccionConta);			
		
		} else {
			this.jButtonAbrirOrderByTransaccionConta = new JButtonMe();
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
			iWidthTableCalculado+=300;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.transaccioncontaSessionBean.getConGuardarRelaciones()
			) {
		if(this.conFuncionalidadRelaciones) {
				iWidthTableCalculado+=Constantes.ISWING_ANCHO_COLUMNA;
		}
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
		int iCountColumns=this.jTableDatosTransaccionConta.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosTransaccionConta.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosTransaccionConta.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosTransaccionConta.getRowHeight();//TransaccionContaConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.transaccioncontaSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > TransaccionContaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTransaccionConta.isSelected()) {
					iHeightTable=TransaccionContaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TransaccionContaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TransaccionContaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > TransaccionContaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaTransaccionConta.isSelected()) {
					iHeightTable=TransaccionContaConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < TransaccionContaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=TransaccionContaConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosTransaccionConta.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTransaccionConta.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosTransaccionConta.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosTransaccionConta.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTransaccionConta.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosTransaccionConta.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByTransaccionConta!=null && this.jInternalFrameOrderByTransaccionConta.getjTableDatosOrderBy()!=null) {
			//if(!this.transaccioncontaSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByTransaccionConta.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByTransaccionConta.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByTransaccionConta.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByTransaccionConta.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByTransaccionConta.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByTransaccionConta.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByTransaccionConta.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosTransaccionConta.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTransaccionConta.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosTransaccionConta.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=transaccioncontaLogic.getTransaccionContas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=transaccioncontas.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<TransaccionConta> TraerTransaccionContaBeans(List<TransaccionConta> transaccioncontas,ArrayList<Classe> classes)throws Exception {
		try {
			for(TransaccionConta transaccionconta:transaccioncontas) {
					
				if(!(TransaccionContaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || TransaccionContaConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					transaccionconta.setsDetalleGeneralEntityReporte(TransaccionContaConstantesFunciones.getTransaccionContaDescripcion(transaccionconta));
										
						
					
					

					if(transaccionconta.getTransaccionLocals()!=null && Funciones.existeClass(classes,TransaccionLocal.class)) {
						try{transaccionconta.settransaccionlocalsDescripcionReporte(new JRBeanCollectionDataSource(TransaccionLocalJInternalFrame.TraerTransaccionLocalBeans(transaccionconta.getTransaccionLocals(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//transaccionconta.setsDetalleGeneralEntityReporte(transaccionconta.getsDetalleGeneralEntityReporte());
										
				}
				
				//transaccioncontabeans.add(transaccioncontabean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return transaccioncontas;
    }
	//PARA REPORTES FIN
}
