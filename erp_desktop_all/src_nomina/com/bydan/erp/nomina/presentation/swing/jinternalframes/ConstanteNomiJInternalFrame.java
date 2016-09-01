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
package com.bydan.erp.nomina.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


import com.bydan.erp.seguridad.business.entity.*;

//import com.bydan.erp.nomina.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.nomina.util.ConstanteNomiConstantesFunciones;

import com.bydan.erp.nomina.business.logic.*;
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
public class ConstanteNomiJInternalFrame extends ConstanteNomiBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	//protected Usuario usuarioActual=null;	
	
	
	public JToolBar jTtoolBarConstanteNomi;
	
	protected JMenuBar jmenuBarConstanteNomi;
	
	protected JMenu jmenuConstanteNomi;
	protected JMenu jmenuDatosConstanteNomi;
	protected JMenu jmenuArchivoConstanteNomi;
	protected JMenu jmenuAccionesConstanteNomi;
	
	
	
	protected JPanel jContentPane = null;
	
	protected JPanel jPanelBusquedasParametrosConstanteNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutConstanteNomi;	
	protected GridBagConstraints gridBagConstraintsConstanteNomi;	
	
	//protected JInternalFrameBase jInternalFrameParent;
	
	public ConstanteNomiDetalleFormJInternalFrame jInternalFrameDetalleFormConstanteNomi;		
	
	
	protected ReporteDinamicoJInternalFrame jInternalFrameReporteDinamicoConstanteNomi;	
	protected ImportacionJInternalFrame jInternalFrameImportacionConstanteNomi;	
	
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected TipoConstanteNomiBeanSwingJInternalFrame tipoconstantenomiBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoconstantenomi="";
	
	public ConstanteNomiSessionBean constantenomiSessionBean;
		
	
	
	public EmpresaSessionBean empresaSessionBean;
	public TipoConstanteNomiSessionBean tipoconstantenomiSessionBean;
	
	//protected JDesktopPane jDesktopPane;
	public List<ConstanteNomi> constantenomis;		
	public List<ConstanteNomi> constantenomisEliminados;	
	public List<ConstanteNomi> constantenomisAux;
	
	
		
	protected OrderByJInternalFrame jInternalFrameOrderByConstanteNomi;		
	protected JButton jButtonAbrirOrderByConstanteNomi;
	
	
	//protected JPanel jPanelOrderByConstanteNomi;
	//public JScrollPane jScrollPanelOrderByConstanteNomi;	
	//protected JButton jButtonCerrarOrderByConstanteNomi;
	
	
	public ArrayList<OrderBy> arrOrderBy= new  ArrayList<OrderBy>();
	
	
	public ConstanteNomiLogic constantenomiLogic;
	
	
	
	public JScrollPane jScrollPanelDatosConstanteNomi;
	public JScrollPane jScrollPanelDatosEdicionConstanteNomi;
	public JScrollPane jScrollPanelDatosGeneralConstanteNomi;
    
	
	
	//public JScrollPane jScrollPanelDatosConstanteNomiOrderBy;		
	//public JScrollPane jScrollPanelReporteDinamicoConstanteNomi;
	//public JScrollPane jScrollPanelImportacionConstanteNomi;
	
	
	
	protected JPanel jPanelAccionesConstanteNomi;
	
    protected JPanel jPanelPaginacionConstanteNomi;
    protected JPanel jPanelParametrosReportesConstanteNomi;
	protected JPanel jPanelParametrosReportesAccionesConstanteNomi;
	
	
	
	
	
	;
	
	
	
	protected JPanel jPanelParametrosAuxiliar1ConstanteNomi;
	protected JPanel jPanelParametrosAuxiliar2ConstanteNomi;
	protected JPanel jPanelParametrosAuxiliar3ConstanteNomi;
	protected JPanel jPanelParametrosAuxiliar4ConstanteNomi;
	//protected JPanel jPanelParametrosAuxiliar5ConstanteNomi;
	
	
	
	//protected JPanel jPanelReporteDinamicoConstanteNomi;
	//protected JPanel jPanelImportacionConstanteNomi;
	
	
	public JTable jTableDatosConstanteNomi;
	
	
	
	//public JTable jTableDatosConstanteNomiOrderBy;
	
	
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JButton jButtonNuevoConstanteNomi;
	protected JButton jButtonDuplicarConstanteNomi;
	protected JButton jButtonCopiarConstanteNomi;
	protected JButton jButtonVerFormConstanteNomi;
	protected JButton jButtonNuevoRelacionesConstanteNomi;
	protected JButton jButtonModificarConstanteNomi;
	
    protected JButton jButtonGuardarCambiosTablaConstanteNomi;
	protected JButton jButtonCerrarConstanteNomi;
	
	
	protected JButton jButtonRecargarInformacionConstanteNomi;
	protected JButton jButtonProcesarInformacionConstanteNomi;
	
	
	protected JButton jButtonAnterioresConstanteNomi;
	protected JButton jButtonSiguientesConstanteNomi;
	protected JButton jButtonNuevoGuardarCambiosConstanteNomi;
	
	
	
	//protected JButton jButtonGenerarReporteDinamicoConstanteNomi;
	//protected JButton jButtonCerrarReporteDinamicoConstanteNomi;
	//protected JButton jButtonGenerarExcelReporteDinamicoConstanteNomi;	
	
	
	
	//protected JButton jButtonAbrirImportacionConstanteNomi;
	//protected JButton jButtonGenerarImportacionConstanteNomi;
	//protected JButton jButtonCerrarImportacionConstanteNomi;
	//protected JFileChooser jFileChooserImportacionConstanteNomi;
	//protected File fileImportacionConstanteNomi;
	
	
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarConstanteNomi;
	protected JButton jButtonDuplicarToolBarConstanteNomi;
	protected JButton jButtonNuevoRelacionesToolBarConstanteNomi;
	
	
	public JButton jButtonGuardarCambiosToolBarConstanteNomi;
	protected JButton jButtonCopiarToolBarConstanteNomi;
	protected JButton jButtonVerFormToolBarConstanteNomi;
	public JButton jButtonGuardarCambiosTablaToolBarConstanteNomi;
	protected JButton jButtonMostrarOcultarTablaToolBarConstanteNomi;
	protected JButton jButtonCerrarToolBarConstanteNomi;
	
	protected JButton jButtonRecargarInformacionToolBarConstanteNomi;
	protected JButton jButtonProcesarInformacionToolBarConstanteNomi;
	protected JButton jButtonAnterioresToolBarConstanteNomi;
	protected JButton jButtonSiguientesToolBarConstanteNomi;
	protected JButton jButtonNuevoGuardarCambiosToolBarConstanteNomi;
	protected JButton jButtonAbrirOrderByToolBarConstanteNomi;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoConstanteNomi;
	protected JMenuItem jMenuItemDuplicarConstanteNomi;
	protected JMenuItem jMenuItemNuevoRelacionesConstanteNomi;
	
	
	protected JMenuItem jMenuItemGuardarCambiosConstanteNomi;
	protected JMenuItem jMenuItemCopiarConstanteNomi;
	protected JMenuItem jMenuItemVerFormConstanteNomi;
	protected JMenuItem jMenuItemGuardarCambiosTablaConstanteNomi;
	protected JMenuItem jMenuItemCerrarConstanteNomi;
	protected JMenuItem jMenuItemDetalleCerrarConstanteNomi;
	protected JMenuItem jMenuItemDetalleAbrirOrderByConstanteNomi;
	protected JMenuItem jMenuItemDetalleMostarOcultarConstanteNomi;
	
	protected JMenuItem jMenuItemRecargarInformacionConstanteNomi;
	protected JMenuItem jMenuItemProcesarInformacionConstanteNomi;
	protected JMenuItem jMenuItemAnterioresConstanteNomi;
	protected JMenuItem jMenuItemSiguientesConstanteNomi;
	protected JMenuItem jMenuItemNuevoGuardarCambiosConstanteNomi;
	protected JMenuItem jMenuItemAbrirOrderByConstanteNomi;
	protected JMenuItem jMenuItemMostrarOcultarConstanteNomi;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesConstanteNomi;	
	
	   
	protected JCheckBox jCheckBoxSeleccionarTodosConstanteNomi;
	protected JCheckBox jCheckBoxSeleccionadosConstanteNomi;
	
	
	protected JCheckBox jCheckBoxConAltoMaximoTablaConstanteNomi;
	protected JCheckBox jCheckBoxConGraficoReporteConstanteNomi;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposArchivosReportesConstanteNomi;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposReportesConstanteNomi;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposArchivosReportesDinamicoConstanteNomi;
	//@SuppressWarnings("rawtypes")
    //protected JComboBox jComboBoxTiposReportesDinamicoConstanteNomi;
	@SuppressWarnings("rawtypes")
    protected JComboBox jComboBoxTiposGraficosReportesConstanteNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposPaginacionConstanteNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesConstanteNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesConstanteNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposSeleccionarConstanteNomi;
	protected JTextField jTextFieldValorCampoGeneralConstanteNomi;
	
	
	
	//REPORTE DINAMICO
	//@SuppressWarnings("rawtypes")
	
	
	//public JLabel jLabelColumnasSelectReporteConstanteNomi;
	//public JList<Reporte> jListColumnasSelectReporteConstanteNomi;
	//public JScrollPane jScrollColumnasSelectReporteConstanteNomi;
	
	//public JLabel jLabelRelacionesSelectReporteConstanteNomi;
	//public JList<Reporte> jListRelacionesSelectReporteConstanteNomi;
	//public JScrollPane jScrollRelacionesSelectReporteConstanteNomi;
	
	
	
	
	//public JLabel jLabelConGraficoDinamicoConstanteNomi;
	//protected JCheckBox jCheckBoxConGraficoDinamicoConstanteNomi;
	
	//public JLabel jLabelGenerarExcelReporteDinamicoConstanteNomi;
	//public JLabel jLabelTiposArchivoReporteDinamicoConstanteNomi;
	
		
	//public JLabel jLabelArchivoImportacionConstanteNomi;	
	//public JLabel jLabelPathArchivoImportacionConstanteNomi;
	//protected JTextField jTextFieldPathArchivoImportacionConstanteNomi;	
	
		
	//public JLabel jLabelColumnaCategoriaGraficoConstanteNomi;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaGraficoConstanteNomi;
	
	//public JLabel jLabelColumnaCategoriaValorConstanteNomi;	
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxColumnaCategoriaValorConstanteNomi;
	
	//public JLabel jLabelColumnasValoresGraficoConstanteNomi;
	//public JList<Reporte> jListColumnasValoresGraficoConstanteNomi;
	//public JScrollPane jScrollColumnasValoresGraficoConstanteNomi;
	
	//public JLabel jLabelTiposGraficosReportesDinamicoConstanteNomi;
	//@SuppressWarnings("rawtypes")
	//protected JComboBox jComboBoxTiposGraficosReportesDinamicoConstanteNomi;	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean cargarRelaciones=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	
	//BYDAN_BUSQUEDAS
	
	
	public JTabbedPane jTabbedPaneBusquedasConstanteNomi;
	public JPanel jPanelFK_IdTipoConstanteConstanteNomi;
	public JButton jButtonFK_IdTipoConstanteConstanteNomi;
	
	public JPanel jPanelid_tipo_constante_nomiFK_IdTipoConstanteConstanteNomi;
	public JLabel jLabelid_tipo_constante_nomiFK_IdTipoConstanteConstanteNomi;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_constante_nomiFK_IdTipoConstanteConstanteNomi;
	public JButton jButtonid_tipo_constante_nomiFK_IdTipoConstanteConstanteNomi= new JButtonMe();
	public JButton jButtonid_tipo_constante_nomiFK_IdTipoConstanteConstanteNomiUpdate= new JButtonMe();
	public JButton jButtonid_tipo_constante_nomiFK_IdTipoConstanteConstanteNomiBusqueda= new JButtonMe();

	
	
	
	
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
	public ConstanteNomiJInternalFrame() throws Exception {
		super(PaginaTipo.PRINCIPAL);
        //super("ConstanteNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			//Boolean cargarRelaciones=false;
			
			initialize(null,false,false,false/*cargarRelaciones*/,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConstanteNomiJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ConstanteNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConstanteNomiJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ConstanteNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConstanteNomiJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ConstanteNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	
	public void setjButtonRecargarInformacion(JButton jButtonRecargarInformacionConstanteNomi)	{
		this.jButtonRecargarInformacionConstanteNomi = jButtonRecargarInformacionConstanteNomi;
	}
	
	public JButton getjButtonProcesarInformacionConstanteNomi() {
		return this.jButtonProcesarInformacionConstanteNomi;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionConstanteNomi)	{
		this.jButtonProcesarInformacionConstanteNomi = jButtonProcesarInformacionConstanteNomi;
	}
	
	
	public JButton getjButtonRecargarInformacionConstanteNomi() {
		return this.jButtonRecargarInformacionConstanteNomi;
	}
	
	
	public List<ConstanteNomi> getconstantenomis() {
		return this.constantenomis;
	}

	public void setconstantenomis(List<ConstanteNomi> constantenomis) {
		this.constantenomis = constantenomis;
	}
	
	public List<ConstanteNomi> getconstantenomisAux() {
		return this.constantenomisAux;
	}

	public void setconstantenomisAux(List<ConstanteNomi> constantenomisAux) {
		this.constantenomisAux = constantenomisAux;
	}
	
	public List<ConstanteNomi> getconstantenomisEliminados() {
		return this.constantenomisEliminados;
	}

	public void setConstanteNomisEliminados(List<ConstanteNomi> constantenomisEliminados) {
		this.constantenomisEliminados = constantenomisEliminados;
	}
	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposSeleccionarConstanteNomi() {
		return jComboBoxTiposSeleccionarConstanteNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposSeleccionarConstanteNomi(
			JComboBox jComboBoxTiposSeleccionarConstanteNomi) {
		this.jComboBoxTiposSeleccionarConstanteNomi = jComboBoxTiposSeleccionarConstanteNomi;
	}
	
	public void setBorderResaltarTiposSeleccionarConstanteNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");		
		
		this.jTtoolBarConstanteNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposSeleccionarConstanteNomi .setBorder(borderResaltar);		
	}
	
	public JTextField getjTextFieldValorCampoGeneralConstanteNomi() {
		return jTextFieldValorCampoGeneralConstanteNomi;
	}

	public void setjTextFieldValorCampoGeneralConstanteNomi(
			JTextField jTextFieldValorCampoGeneralConstanteNomi) {
		this.jTextFieldValorCampoGeneralConstanteNomi = jTextFieldValorCampoGeneralConstanteNomi;
	}

	public void setBorderResaltarValorCampoGeneralConstanteNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConstanteNomi.setBorder(borderResaltar);
		
		this.jTextFieldValorCampoGeneralConstanteNomi .setBorder(borderResaltar);		
	}		
	
	
	
	public JCheckBox getjCheckBoxSeleccionarTodosConstanteNomi() {
		return this.jCheckBoxSeleccionarTodosConstanteNomi;
	}

	public void setjCheckBoxSeleccionarTodosConstanteNomi(
			JCheckBox jCheckBoxSeleccionarTodosConstanteNomi) {
		this.jCheckBoxSeleccionarTodosConstanteNomi = jCheckBoxSeleccionarTodosConstanteNomi;
	}

	public void setBorderResaltarSeleccionarTodosConstanteNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConstanteNomi.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionarTodosConstanteNomi .setBorder(borderResaltar);		
	}
	
	public JCheckBox getjCheckBoxSeleccionadosConstanteNomi() {
		return this.jCheckBoxSeleccionadosConstanteNomi;
	}

	public void setjCheckBoxSeleccionadosConstanteNomi(
			JCheckBox jCheckBoxSeleccionadosConstanteNomi) {
		this.jCheckBoxSeleccionadosConstanteNomi = jCheckBoxSeleccionadosConstanteNomi;
	}
	
	public void setBorderResaltarSeleccionadosConstanteNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConstanteNomi.setBorder(borderResaltar);
		
		this.jCheckBoxSeleccionadosConstanteNomi .setBorder(borderResaltar);		
	}
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposArchivosReportesConstanteNomi() {
		return this.jComboBoxTiposArchivosReportesConstanteNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposArchivosReportesConstanteNomi(
			JComboBox jComboBoxTiposArchivosReportesConstanteNomi) {
		this.jComboBoxTiposArchivosReportesConstanteNomi = jComboBoxTiposArchivosReportesConstanteNomi;
	}

	public void setBorderResaltarTiposArchivosReportesConstanteNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConstanteNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposArchivosReportesConstanteNomi .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposReportesConstanteNomi() {
		return this.jComboBoxTiposReportesConstanteNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposReportesConstanteNomi(
			JComboBox jComboBoxTiposReportesConstanteNomi) {
		this.jComboBoxTiposReportesConstanteNomi = jComboBoxTiposReportesConstanteNomi;
	}
	
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposReportesDinamicoConstanteNomi() {
	//	return jComboBoxTiposReportesDinamicoConstanteNomi;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposReportesDinamicoConstanteNomi(
	//		JComboBox jComboBoxTiposReportesDinamicoConstanteNomi) {
	//	this.jComboBoxTiposReportesDinamicoConstanteNomi = jComboBoxTiposReportesDinamicoConstanteNomi;
	//}
	
	//@SuppressWarnings("rawtypes")
	//public JComboBox getjComboBoxTiposArchivosReportesDinamicoConstanteNomi() {
	//	return jComboBoxTiposArchivosReportesDinamicoConstanteNomi;
	//}

	//@SuppressWarnings("rawtypes")
	//public void setjComboBoxTiposArchivosReportesDinamicoConstanteNomi(
	//		JComboBox jComboBoxTiposArchivosReportesDinamicoConstanteNomi) {
	//	this.jComboBoxTiposArchivosReportesDinamicoConstanteNomi = jComboBoxTiposArchivosReportesDinamicoConstanteNomi;
	//}
	
	public void setBorderResaltarTiposReportesConstanteNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConstanteNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposReportesConstanteNomi .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposGraficosReportesConstanteNomi() {
		return this.jComboBoxTiposGraficosReportesConstanteNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposGraficosReportesConstanteNomi(
			JComboBox jComboBoxTiposGraficosReportesConstanteNomi) {
		this.jComboBoxTiposGraficosReportesConstanteNomi = jComboBoxTiposGraficosReportesConstanteNomi;
	}
	
	public void setBorderResaltarTiposGraficosReportesConstanteNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConstanteNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposGraficosReportesConstanteNomi .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposPaginacionConstanteNomi() {
		return this.jComboBoxTiposPaginacionConstanteNomi;
	}

	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposPaginacionConstanteNomi(
			JComboBox jComboBoxTiposPaginacionConstanteNomi) {
		this.jComboBoxTiposPaginacionConstanteNomi = jComboBoxTiposPaginacionConstanteNomi;
	}
	
	public void setBorderResaltarTiposPaginacionConstanteNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConstanteNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposPaginacionConstanteNomi .setBorder(borderResaltar);		
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposRelacionesConstanteNomi() {
		return this.jComboBoxTiposRelacionesConstanteNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesConstanteNomi() {
		return this.jComboBoxTiposAccionesConstanteNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesConstanteNomi(
			JComboBox jComboBoxTiposRelacionesConstanteNomi) {
		this.jComboBoxTiposRelacionesConstanteNomi = jComboBoxTiposRelacionesConstanteNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesConstanteNomi(
			JComboBox jComboBoxTiposAccionesConstanteNomi) {
		this.jComboBoxTiposAccionesConstanteNomi = jComboBoxTiposAccionesConstanteNomi;
	}
	
	public void setBorderResaltarTiposRelacionesConstanteNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConstanteNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposRelacionesConstanteNomi .setBorder(borderResaltar);		
	}
	
	public void setBorderResaltarTiposAccionesConstanteNomi() {
		Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
		
		this.jTtoolBarConstanteNomi.setBorder(borderResaltar);
		
		this.jComboBoxTiposAccionesConstanteNomi .setBorder(borderResaltar);		
	}
	
	
	
	//public JCheckBox getjCheckBoxConGraficoDinamicoConstanteNomi() {
	//	return jCheckBoxConGraficoDinamicoConstanteNomi;
	//}

	//public void setjCheckBoxConGraficoDinamicoConstanteNomi(
	//		JCheckBox jCheckBoxConGraficoDinamicoConstanteNomi) {
	//	this.jCheckBoxConGraficoDinamicoConstanteNomi = jCheckBoxConGraficoDinamicoConstanteNomi;
	//}	
	
	//public void setBorderResaltarConGraficoDinamicoConstanteNomi() {
	//	Border borderResaltar=Funciones2.getBorderResaltar(this.getParametroGeneralUsuario(),"PARAMETRO");
	//	this.jTtoolBarConstanteNomi.setBorder(borderResaltar);
	//	this.jCheckBoxConGraficoDinamicoConstanteNomi .setBorder(borderResaltar);		
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
		this.constantenomiSessionBean=new ConstanteNomiSessionBean();
		
		this.constantenomiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.constantenomiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.constantenomiSessionBean.getEsGuardarRelacionado();				
		this.cargarRelaciones=cargarRelaciones;
		
		
		if(!this.conCargarMinimo) {
		}
		
		//this.sTipoTamanioGeneral=ConstanteNomiJInternalFrame.STIPO_TAMANIO_GENERAL;
		//this.sTipoTamanioGeneralTabla=ConstanteNomiJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA;
		
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ConstanteNomiJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ConstanteNomiJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ConstanteNomiJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Constante Nomi MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
	
	
		if(!this.constantenomiSessionBean.getEsGuardarRelacionado()) {
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
		
		ConstanteNomiJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
		//super("ConstanteNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  		
        //SwingUtilities.updateComponentTreeUI(this);
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarConstanteNomi= new JToolBar("MENU PRINCIPAL");
		
		//TOOLBAR
		//PRINCIPAL
		this.jButtonNuevoToolBarConstanteNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoToolBarConstanteNomi,this.jTtoolBarConstanteNomi,
							"nuevo","nuevo","Nuevo"+" "+ConstanteNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"),"Nuevo",false);
		
		
		
		this.jButtonNuevoGuardarCambiosToolBarConstanteNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoGuardarCambiosToolBarConstanteNomi,this.jTtoolBarConstanteNomi,
							"nuevoguardarcambios","nuevoguardarcambios","Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"),"Nuevo",false);
		
		
		
		this.jButtonGuardarCambiosTablaToolBarConstanteNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosTablaToolBarConstanteNomi,this.jTtoolBarConstanteNomi,
							"guardarcambiostabla","guardarcambiostabla","Guardar"+" "+ConstanteNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		this.jButtonDuplicarToolBarConstanteNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonDuplicarToolBarConstanteNomi,this.jTtoolBarConstanteNomi,
							"duplicar","duplicar","Duplicar"+" "+ConstanteNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"),"Duplicar",false);
		
		
		
		this.jButtonCopiarToolBarConstanteNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCopiarToolBarConstanteNomi,this.jTtoolBarConstanteNomi,
							"copiar","copiar","Copiar"+" "+ConstanteNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("COPIAR"),"Copiar",false);								
		
		this.jButtonVerFormToolBarConstanteNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonVerFormToolBarConstanteNomi,this.jTtoolBarConstanteNomi,
							"ver_form","ver_form","Ver"+" "+ConstanteNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("VER_FORM"),"Ver",false);								
							
		
		
		this.jButtonRecargarInformacionToolBarConstanteNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarConstanteNomi,this.jTtoolBarConstanteNomi,
							"recargar","recargar","Recargar"+" "+ConstanteNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"),"Recargar",false);
		
		
		
		this.jButtonAnterioresToolBarConstanteNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarConstanteNomi,this.jTtoolBarConstanteNomi,
							"anteriores","anteriores","Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"),"<<",false);
		
		
		
		this.jButtonSiguientesToolBarConstanteNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonRecargarInformacionToolBarConstanteNomi,this.jTtoolBarConstanteNomi,
							"siguientes","siguientes","Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"),">>",false);
		
		
		
		this.jButtonAbrirOrderByToolBarConstanteNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonAbrirOrderByToolBarConstanteNomi,this.jTtoolBarConstanteNomi,
							"orden","orden","Orden" + FuncionesSwing.getKeyMensaje("ORDEN"),"Orden",false);
		
		
		
		this.jButtonNuevoRelacionesToolBarConstanteNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonNuevoRelacionesToolBarConstanteNomi,this.jTtoolBarConstanteNomi,
				"nuevo_relaciones","nuevo_relaciones","NUEVO RELACIONES" + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"),"NUEVO RELACIONES",false);
		
		
		
		this.jButtonMostrarOcultarTablaToolBarConstanteNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonMostrarOcultarTablaToolBarConstanteNomi,this.jTtoolBarConstanteNomi,
							"mostrar_ocultar","mostrar_ocultar","Mostrar Ocultar"+" "+ConstanteNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"),"Mostrar Ocultar",false);
		
		
		
		this.jButtonCerrarToolBarConstanteNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCerrarToolBarConstanteNomi,this.jTtoolBarConstanteNomi,
							"cerrar","cerrar","Salir"+" "+ConstanteNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"),"Salir",false);
		
		
		
		//this.jButtonNuevoRelacionesToolBarConstanteNomi=new JButtonMe();		
		//protected JButton jButtonNuevoRelacionesToolBarConstanteNomi;
			
				this.jButtonProcesarInformacionToolBarConstanteNomi=new JButtonMe();
				//protected JButton jButtonProcesarInformacionToolBarConstanteNomi;
				
		//protected JButton jButtonModificarToolBarConstanteNomi;		
		
		
		//PRINCIPAL
		
		//DETALLE
		//DETALLE_FIN
	}
	
	
	
	public void cargarMenus() {		
		this.jmenuBarConstanteNomi=new JMenuBarMe();
		
		//PRINCIPAL
		this.jmenuConstanteNomi=new JMenuMe("General");
		this.jmenuArchivoConstanteNomi=new JMenuMe("Archivo");
		this.jmenuAccionesConstanteNomi=new JMenuMe("Acciones");
		this.jmenuDatosConstanteNomi=new JMenuMe("Datos");
		//PRINCIPAL_FIN
		
		//DETALLE
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoConstanteNomi= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoConstanteNomi.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoConstanteNomi,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDuplicarConstanteNomi= new JMenuItem("Duplicar" + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jMenuItemDuplicarConstanteNomi.setActionCommand("Duplicar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDuplicarConstanteNomi,"duplicar_button","Duplicar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDuplicarConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemNuevoRelacionesConstanteNomi= new JMenuItem("Nuevo Rel" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoRelacionesConstanteNomi.setActionCommand("Nuevo Rel");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRelacionesConstanteNomi,"nuevorelaciones_button","Nuevo Rel");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRelacionesConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemGuardarCambiosConstanteNomi= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosConstanteNomi.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosConstanteNomi,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCopiarConstanteNomi= new JMenuItem("Copiar" + FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jMenuItemCopiarConstanteNomi.setActionCommand("Copiar");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCopiarConstanteNomi,"copiar_button","Copiar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCopiarConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemVerFormConstanteNomi= new JMenuItem("Ver" + FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jMenuItemVerFormConstanteNomi.setActionCommand("Ver");		
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemVerFormConstanteNomi,"ver_form_button","Ver");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemVerFormConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTablaConstanteNomi= new JMenuItem("Guardar Tabla" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTablaConstanteNomi.setActionCommand("Guardar Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTablaConstanteNomi,"guardarcambiostabla_button","Guardar Tabla");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTablaConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarConstanteNomi= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarConstanteNomi.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarConstanteNomi,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jMenuItemRecargarInformacionConstanteNomi= new JMenuItem("Recargar" + FuncionesSwing.getKeyMensaje("RECARGAR"));
		this.jMenuItemRecargarInformacionConstanteNomi.setActionCommand("Recargar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemRecargarInformacionConstanteNomi,"recargar_button","Recargar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemRecargarInformacionConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemProcesarInformacionConstanteNomi= new JMenuItem("Procesar Informacion");
		this.jMenuItemProcesarInformacionConstanteNomi.setActionCommand("Procesar Informacion");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemProcesarInformacionConstanteNomi,"procesar_button","Procesar Informacion");
		
		this.jMenuItemAnterioresConstanteNomi= new JMenuItem("Anteriores" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		this.jMenuItemAnterioresConstanteNomi.setActionCommand("Anteriores");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAnterioresConstanteNomi,"anteriores_button","Anteriores");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAnterioresConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemSiguientesConstanteNomi= new JMenuItem("Siguientes" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		this.jMenuItemSiguientesConstanteNomi.setActionCommand("Siguientes");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemSiguientesConstanteNomi,"siguientes_button","Siguientes");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemSiguientesConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemAbrirOrderByConstanteNomi= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemAbrirOrderByConstanteNomi.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemAbrirOrderByConstanteNomi,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemAbrirOrderByConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarConstanteNomi= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarConstanteNomi.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarConstanteNomi,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleAbrirOrderByConstanteNomi= new JMenuItem("Orden" + FuncionesSwing.getKeyMensaje("ORDEN"));
		this.jMenuItemDetalleAbrirOrderByConstanteNomi.setActionCommand("Orden");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleAbrirOrderByConstanteNomi,"orden_button","Orden");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleAbrirOrderByConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarConstanteNomi= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarConstanteNomi.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarConstanteNomi,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);
	
		this.jMenuItemNuevoGuardarCambiosConstanteNomi= new JMenuItem("Nuevo Tabla" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));
		this.jMenuItemNuevoGuardarCambiosConstanteNomi.setActionCommand("Nuevo Tabla");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoGuardarCambiosConstanteNomi,"nuevoguardarcambios_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoGuardarCambiosConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			this.jmenuArchivoConstanteNomi.add(this.jMenuItemCerrarConstanteNomi);
			
			this.jmenuAccionesConstanteNomi.add(this.jMenuItemNuevoConstanteNomi);
			this.jmenuAccionesConstanteNomi.add(this.jMenuItemNuevoGuardarCambiosConstanteNomi);
			this.jmenuAccionesConstanteNomi.add(this.jMenuItemNuevoRelacionesConstanteNomi);
			this.jmenuAccionesConstanteNomi.add(this.jMenuItemGuardarCambiosTablaConstanteNomi);		
			this.jmenuAccionesConstanteNomi.add(this.jMenuItemDuplicarConstanteNomi);		
			this.jmenuAccionesConstanteNomi.add(this.jMenuItemCopiarConstanteNomi);		
			this.jmenuAccionesConstanteNomi.add(this.jMenuItemVerFormConstanteNomi);		
			
			this.jmenuDatosConstanteNomi.add(this.jMenuItemRecargarInformacionConstanteNomi);				
			this.jmenuDatosConstanteNomi.add(this.jMenuItemAnterioresConstanteNomi);				
			this.jmenuDatosConstanteNomi.add(this.jMenuItemSiguientesConstanteNomi);				
			this.jmenuDatosConstanteNomi.add(this.jMenuItemAbrirOrderByConstanteNomi);				
			this.jmenuDatosConstanteNomi.add(this.jMenuItemMostrarOcultarConstanteNomi);						
		}
		//PRINCIPAL_FIN
		
		//DETALLE
		//this.jmenuDetalleAccionesConstanteNomi.add(this.jMenuItemGuardarCambiosConstanteNomi);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES
		
		//PRINCIPAL
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuArchivoConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuAccionesConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);
			FuncionesSwing.setBoldMenu(this.jmenuDatosConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarConstanteNomi.add(this.jmenuArchivoConstanteNomi);		
			this.jmenuBarConstanteNomi.add(this.jmenuAccionesConstanteNomi);		
			this.jmenuBarConstanteNomi.add(this.jmenuDatosConstanteNomi);		
		}
		//PRINCIPAL_FIN
		
		//DETALLE		
		//DETALLE_FIN
		
		
		//AGREGA MENU A PANTALLA
		if(!this.conCargarMinimo) {
			this.setJMenuBar(this.jmenuBarConstanteNomi);			
		}
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	
	
	
	public void inicializarElementosBusquedasConstanteNomi() {
		//BYDAN_BUSQUEDAS		
		//INDICES BUSQUEDA
		
		this.jPanelFK_IdTipoConstanteConstanteNomi=new JPanelMe("fondo_formulario",true);//new JPanel();
		this.jPanelFK_IdTipoConstanteConstanteNomi.setToolTipText("Buscar Por Tipo Constante ");
		this.jButtonFK_IdTipoConstanteConstanteNomi= new JButtonMe();
		this.jButtonFK_IdTipoConstanteConstanteNomi.setText("Buscar");
		this.jButtonFK_IdTipoConstanteConstanteNomi.setToolTipText("Buscar Por Tipo Constante ");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonFK_IdTipoConstanteConstanteNomi,"buscar_button","Buscar Por Tipo Constante ");

		FuncionesSwing.setBoldButton(this.jButtonFK_IdTipoConstanteConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
	
		jLabelid_tipo_constante_nomiFK_IdTipoConstanteConstanteNomi = new JLabelMe();
		jLabelid_tipo_constante_nomiFK_IdTipoConstanteConstanteNomi.setText("Tipo Constante :");
		jLabelid_tipo_constante_nomiFK_IdTipoConstanteConstanteNomi.setToolTipText("Tipo Constante");
		jLabelid_tipo_constante_nomiFK_IdTipoConstanteConstanteNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_constante_nomiFK_IdTipoConstanteConstanteNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));
		jLabelid_tipo_constante_nomiFK_IdTipoConstanteConstanteNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_constante_nomiFK_IdTipoConstanteConstanteNomi,STIPO_TAMANIO_GENERAL,false,true,this);

		jComboBoxid_tipo_constante_nomiFK_IdTipoConstanteConstanteNomi= new JComboBoxMe();
		jComboBoxid_tipo_constante_nomiFK_IdTipoConstanteConstanteNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_constante_nomiFK_IdTipoConstanteConstanteNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_constante_nomiFK_IdTipoConstanteConstanteNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_constante_nomiFK_IdTipoConstanteConstanteNomi,STIPO_TAMANIO_GENERAL,false,true,this);




		this.jTabbedPaneBusquedasConstanteNomi=new JTabbedPane();


		this.jTabbedPaneBusquedasConstanteNomi.setMinimumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasConstanteNomi.setMaximumSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));
		this.jTabbedPaneBusquedasConstanteNomi.setPreferredSize(new Dimension(this.getWidth(),Constantes.ISWING_ALTO_TABPANE_BUSQUEDA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_TABPANE_BUSQUEDA,25)));

		//this.jTabbedPaneBusquedasConstanteNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda"));
		this.jTabbedPaneBusquedasConstanteNomi.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneBusquedasConstanteNomi,STIPO_TAMANIO_GENERAL,false,true,this);

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
			//this.jInternalFrameDetalleConstanteNomi = new ConstanteNomiDetalleJInternalFrame(paginaTipo);//JInternalFrameBase("Constante Nomi DATOS");
			this.jInternalFrameDetalleFormConstanteNomi = new ConstanteNomiDetalleFormJInternalFrame(jDesktopPane,this.constantenomiSessionBean.getConGuardarRelaciones(),this.constantenomiSessionBean.getEsGuardarRelacionado(),cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		} else {
			this.jInternalFrameDetalleFormConstanteNomi = null;//new ConstanteNomiDetalleFormJInternalFrame("MINIMO");
		}
		
		
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutConstanteNomi= new GridBagLayout();
		
		
		this.jTableDatosConstanteNomi = new JTableMe();      
		
		String sToolTipConstanteNomi="";
		sToolTipConstanteNomi=ConstanteNomiConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipConstanteNomi+="(Nomina.ConstanteNomi)";
		}
		
		if(!this.constantenomiSessionBean.getEsGuardarRelacionado()) {
			sToolTipConstanteNomi+="_"+this.opcionActual.getId();
		}
		
		this.jTableDatosConstanteNomi.setToolTipText(sToolTipConstanteNomi);
		
		//SE DEFINE EN DETALLE
		//FuncionesSwing.setBoldLabelTable(this.jTableDatosConstanteNomi);
		this.jTableDatosConstanteNomi.setAutoCreateRowSorter(true);
		this.jTableDatosConstanteNomi.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA + Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA);				
		
		//MULTIPLE SELECTION
		this.jTableDatosConstanteNomi.setRowSelectionAllowed(true);
		this.jTableDatosConstanteNomi.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		FuncionesSwing.setBoldTable(jTableDatosConstanteNomi,STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		
		this.jButtonNuevoConstanteNomi = new JButtonMe();
		this.jButtonDuplicarConstanteNomi = new JButtonMe();
		this.jButtonCopiarConstanteNomi = new JButtonMe();
		this.jButtonVerFormConstanteNomi = new JButtonMe();
		this.jButtonNuevoRelacionesConstanteNomi = new JButtonMe();
		
		
		this.jButtonGuardarCambiosTablaConstanteNomi = new JButtonMe();
		this.jButtonCerrarConstanteNomi = new JButtonMe();
		
		this.jScrollPanelDatosConstanteNomi = new JScrollPane();   
        this.jScrollPanelDatosGeneralConstanteNomi = new JScrollPane();
		
				
		
		
		this.jPanelAccionesConstanteNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		//}
		
		this.sPath=" <---> Acceso: Constante Nomi";
		
		if(!this.constantenomiSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosConstanteNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Constante Nomis" + this.sPath));
		} else {
			this.jScrollPanelDatosConstanteNomi.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosGeneralConstanteNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
		
		
        this.jPanelAccionesConstanteNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesConstanteNomi.setToolTipText("Acciones");
        this.jPanelAccionesConstanteNomi.setName("Acciones"); 

		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralConstanteNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosConstanteNomi, STIPO_TAMANIO_GENERAL,false,false,this);		
		
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
			//this.jInternalFrameReporteDinamicoConstanteNomi=new ReporteDinamicoJInternalFrame(ConstanteNomiConstantesFunciones.SCLASSWEBTITULO,this);	
			//this.cargarReporteDinamicoConstanteNomi();
					
			//IMPORTACION
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameImportacionConstanteNomi=new ImportacionJInternalFrame(ConstanteNomiConstantesFunciones.SCLASSWEBTITULO,this);			
			//this.cargarImportacionConstanteNomi();
			
					
		}
		
		
		
		String sMapKey = "";
		InputMap inputMap =null;
		
		
		this.jButtonAbrirOrderByConstanteNomi = new JButtonMe();
		
		this.jButtonAbrirOrderByConstanteNomi.setText("Orden");
		this.jButtonAbrirOrderByConstanteNomi.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByConstanteNomi,"orden_button","Orden");
		
		FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		sMapKey = "AbrirOrderBySistema";
		inputMap = this.jButtonAbrirOrderByConstanteNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
			
		this.jButtonAbrirOrderByConstanteNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderBySistema"));
	
	
		if(!this.conCargarMinimo) {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByConstanteNomi=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByConstanteNomi,false,this);
			
			//this.cargarOrderByConstanteNomi(false);
		} else {
			//NO CARGAR INICIALMENTE, EN BOTON AL ABRIR
			//this.jInternalFrameOrderByConstanteNomi=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByConstanteNomi,true,this);
			
			//this.cargarOrderByConstanteNomi(true);
		}				
		
		
		//VALORES PARA DISENO
		/*
		this.jTableDatosConstanteNomi.setMinimumSize(new Dimension(400,50));//630
		this.jTableDatosConstanteNomi.setMaximumSize(new Dimension(400,50));//630
		this.jTableDatosConstanteNomi.setPreferredSize(new Dimension(400,50));//630
		
		this.jScrollPanelDatosConstanteNomi.setMinimumSize(new Dimension(400,50));
		this.jScrollPanelDatosConstanteNomi.setMaximumSize(new Dimension(400,50));
		this.jScrollPanelDatosConstanteNomi.setPreferredSize(new Dimension(400,50));
		*/
		
        this.jButtonNuevoConstanteNomi.setText("Nuevo");
		this.jButtonDuplicarConstanteNomi.setText("Duplicar");
		this.jButtonCopiarConstanteNomi.setText("Copiar");
		this.jButtonVerFormConstanteNomi.setText("Ver");
		this.jButtonNuevoRelacionesConstanteNomi.setText("Nuevo Rel");
		
		
		this.jButtonGuardarCambiosTablaConstanteNomi.setText("Guardar");
		this.jButtonCerrarConstanteNomi.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoConstanteNomi,"nuevo_button","Nuevo",this.constantenomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonDuplicarConstanteNomi,"duplicar_button","Duplicar",this.constantenomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCopiarConstanteNomi,"copiar_button","Copiar",this.constantenomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonVerFormConstanteNomi,"ver_form","Ver",this.constantenomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRelacionesConstanteNomi,"nuevorelaciones_button","Nuevo Rel",this.constantenomiSessionBean.getEsGuardarRelacionado());
		
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaConstanteNomi,"guardarcambiostabla_button","Guardar",this.constantenomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarConstanteNomi,"cerrar_button","Salir",this.constantenomiSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonDuplicarConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCopiarConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonVerFormConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonNuevoRelacionesConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);		
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		
		this.jButtonNuevoConstanteNomi.setToolTipText("Nuevo"+" "+ConstanteNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonDuplicarConstanteNomi.setToolTipText("Duplicar"+" "+ConstanteNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("DUPLICAR"));
		this.jButtonCopiarConstanteNomi.setToolTipText("Copiar"+" "+ConstanteNomiConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("COPIAR"));
		this.jButtonVerFormConstanteNomi.setToolTipText("Ver"+" "+ConstanteNomiConstantesFunciones.SCLASSWEBTITULO+ FuncionesSwing.getKeyMensaje("VER_FORM"));
		this.jButtonNuevoRelacionesConstanteNomi.setToolTipText("Nuevo Rel"+" "+ConstanteNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO_RELACIONES"));
		
		
		this.jButtonGuardarCambiosTablaConstanteNomi.setToolTipText("Guardar"+" "+ConstanteNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarConstanteNomi.setToolTipText("Salir"+" "+ConstanteNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoConstanteNomi";
		inputMap = this.jButtonNuevoConstanteNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoConstanteNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoConstanteNomi"));
		
		//DUPLICAR
		sMapKey = "DuplicarConstanteNomi";
		inputMap = this.jButtonDuplicarConstanteNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("DUPLICAR") , FuncionesSwing.getMaskKey("DUPLICAR")), sMapKey);
	
		this.jButtonDuplicarConstanteNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"DuplicarConstanteNomi"));
		
		//COPIAR
		sMapKey = "CopiarConstanteNomi";
		inputMap = this.jButtonCopiarConstanteNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("COPIAR") , FuncionesSwing.getMaskKey("COPIAR")), sMapKey);
	
		this.jButtonCopiarConstanteNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"CopiarConstanteNomi"));
		
		//VEr FORM
		sMapKey = "VerFormConstanteNomi";
		inputMap = this.jButtonVerFormConstanteNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("VER_FORM") , FuncionesSwing.getMaskKey("VER_FORM")), sMapKey);
	
		this.jButtonVerFormConstanteNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"VerFormConstanteNomi"));
				
		//NUEVO RELACIONES
		sMapKey = "NuevoRelacionesConstanteNomi";
		inputMap = this.jButtonNuevoRelacionesConstanteNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_RELACIONES") , FuncionesSwing.getMaskKey("NUEVO_RELACIONES")), sMapKey);
		
		this.jButtonNuevoRelacionesConstanteNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoRelacionesConstanteNomi"));
		
		//MODIFICAR
		/*
		sMapKey = "ModificarConstanteNomi";
		inputMap = this.jButtonModificarConstanteNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("MODIFICAR") , FuncionesSwing.getMaskKey("MODIFICAR")), sMapKey);
		
		this.jButtonModificarConstanteNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ModificarConstanteNomi"));
		*/
		
		
		//CERRAR		
		sMapKey = "CerrarConstanteNomi";
		inputMap = this.jButtonCerrarConstanteNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarConstanteNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarConstanteNomi"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaConstanteNomi";
		inputMap = this.jButtonGuardarCambiosTablaConstanteNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaConstanteNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaConstanteNomi"));
		
		//ABRIR ORDER BY	
		if(!this.conCargarMinimo) {			
			
		}
		
		//HOT KEYS
	
	
        this.jPanelParametrosReportesConstanteNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosReportesAccionesConstanteNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelPaginacionConstanteNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		
		
		this.jPanelParametrosAuxiliar1ConstanteNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar2ConstanteNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar3ConstanteNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		this.jPanelParametrosAuxiliar4ConstanteNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
		//this.jPanelParametrosAuxiliar5ConstanteNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();		
		
		
		this.jPanelParametrosReportesConstanteNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Reportes-Acciones"));
        this.jPanelParametrosReportesConstanteNomi.setName("jPanelParametrosReportesConstanteNomi"); 
		
		this.jPanelParametrosReportesAccionesConstanteNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Parametros Acciones"));
		//this.jPanelParametrosReportesAccionesConstanteNomi.setBorder(javax.swing.BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
        this.jPanelParametrosReportesAccionesConstanteNomi.setName("jPanelParametrosReportesAccionesConstanteNomi"); 
		
		
		FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesConstanteNomi, STIPO_TAMANIO_GENERAL,false,false,this);
    	FuncionesSwing.setBoldPanel(this.jPanelParametrosReportesAccionesConstanteNomi, STIPO_TAMANIO_GENERAL,false,false,this);
	
		
		this.jButtonRecargarInformacionConstanteNomi = new JButtonMe();
		this.jButtonRecargarInformacionConstanteNomi.setText("Recargar");
		this.jButtonRecargarInformacionConstanteNomi.setToolTipText("Recargar"+" "+ConstanteNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("RECARGAR"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRecargarInformacionConstanteNomi,"recargar_button","Recargar");		
		
		
		
		
		this.jButtonProcesarInformacionConstanteNomi = new JButtonMe();
		this.jButtonProcesarInformacionConstanteNomi.setText("Procesar");
		this.jButtonProcesarInformacionConstanteNomi.setToolTipText("Procesar"+" "+ConstanteNomiConstantesFunciones.SCLASSWEBTITULO);
		this.jButtonProcesarInformacionConstanteNomi.setVisible(false);
			
		this.jButtonProcesarInformacionConstanteNomi.setMinimumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionConstanteNomi.setMaximumSize(new Dimension(185,25));
		this.jButtonProcesarInformacionConstanteNomi.setPreferredSize(new Dimension(185,25));		
		
		
		
		
		
		
			
		this.jComboBoxTiposArchivosReportesConstanteNomi = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesConstanteNomi.setText("TIPO");       
		this.jComboBoxTiposArchivosReportesConstanteNomi.setToolTipText("Tipos De Archivo");
			
		this.jComboBoxTiposReportesConstanteNomi = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesConstanteNomi.setText("TIPO");       
		this.jComboBoxTiposReportesConstanteNomi.setToolTipText("Tipos De Reporte");
			
		this.jComboBoxTiposGraficosReportesConstanteNomi = new JComboBoxMe();
		//this.jComboBoxTiposArchivosReportesConstanteNomi.setText("TIPO");       
		this.jComboBoxTiposGraficosReportesConstanteNomi.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposPaginacionConstanteNomi = new JComboBoxMe();
		//this.jComboBoxTiposPaginacionConstanteNomi.setText("Paginacion");
		this.jComboBoxTiposPaginacionConstanteNomi.setToolTipText("Tipos De Paginacion");        		
						
		this.jComboBoxTiposRelacionesConstanteNomi = new JComboBoxMe();
		//this.jComboBoxTiposRelacionesConstanteNomi.setText("Accion");
		this.jComboBoxTiposRelacionesConstanteNomi.setToolTipText("Tipos de Relaciones");
			
		this.jComboBoxTiposAccionesConstanteNomi = new JComboBoxMe();
		//this.jComboBoxTiposAccionesConstanteNomi.setText("Accion");
		this.jComboBoxTiposAccionesConstanteNomi.setToolTipText("Tipos de Acciones");
					
		this.jComboBoxTiposSeleccionarConstanteNomi = new JComboBoxMe();
		//this.jComboBoxTiposSeleccionarConstanteNomi.setText("Accion");
		this.jComboBoxTiposSeleccionarConstanteNomi.setToolTipText("Tipos de Seleccion");
		
		this.jTextFieldValorCampoGeneralConstanteNomi=new JTextFieldMe();
		this.jTextFieldValorCampoGeneralConstanteNomi.setMinimumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralConstanteNomi.setMaximumSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldValorCampoGeneralConstanteNomi.setPreferredSize(new Dimension(100,Constantes.ISWING_ALTO_CONTROL));		
		

	
		this.jLabelAccionesConstanteNomi = new JLabelMe();
		
		this.jLabelAccionesConstanteNomi.setText("Acciones");		
		this.jLabelAccionesConstanteNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesConstanteNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesConstanteNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		
		this.jCheckBoxSeleccionarTodosConstanteNomi = new JCheckBoxMe();
		this.jCheckBoxSeleccionarTodosConstanteNomi.setText("Sel. Todos");
		this.jCheckBoxSeleccionarTodosConstanteNomi.setToolTipText("Sel. Todos");				
		
		this.jCheckBoxSeleccionadosConstanteNomi = new JCheckBoxMe();
		//this.jCheckBoxSeleccionadosConstanteNomi.setText("Seleccionados");
		this.jCheckBoxSeleccionadosConstanteNomi.setToolTipText("SELECCIONAR SELECCIONADOS");				
		
		
		this.jCheckBoxConAltoMaximoTablaConstanteNomi = new JCheckBoxMe();
		//this.jCheckBoxConAltoMaximoTablaConstanteNomi.setText("Con Maximo Alto Tabla");
		this.jCheckBoxConAltoMaximoTablaConstanteNomi.setToolTipText("Con Maximo Alto Tabla");				
					
		this.jCheckBoxConGraficoReporteConstanteNomi = new JCheckBoxMe();
		this.jCheckBoxConGraficoReporteConstanteNomi.setText("Graf.");
		this.jCheckBoxConGraficoReporteConstanteNomi.setToolTipText("Con Grafico");						
		
		
        this.jButtonAnterioresConstanteNomi = new JButtonMe();
		//this.jButtonAnterioresConstanteNomi.setText("<<");
        this.jButtonAnterioresConstanteNomi.setToolTipText("Anteriores Datos" + FuncionesSwing.getKeyMensaje("ANTERIORES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAnterioresConstanteNomi,"anteriores_button","<<");
		FuncionesSwing.setBoldButton(this.jButtonAnterioresConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonSiguientesConstanteNomi = new JButtonMe();
		//this.jButtonSiguientesConstanteNomi.setText(">>");
        this.jButtonSiguientesConstanteNomi.setToolTipText("Siguientes Datos" + FuncionesSwing.getKeyMensaje("SIGUIENTES"));
		FuncionesSwing.addImagenButtonGeneral(this.jButtonSiguientesConstanteNomi,"siguientes_button",">>");
		FuncionesSwing.setBoldButton(this.jButtonSiguientesConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jButtonNuevoGuardarCambiosConstanteNomi = new JButtonMe();
		this.jButtonNuevoGuardarCambiosConstanteNomi.setText("Nue");
        this.jButtonNuevoGuardarCambiosConstanteNomi.setToolTipText("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO_TABLA"));						
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoGuardarCambiosConstanteNomi,"nuevoguardarcambios_button","Nue",this.constantenomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.setBoldButton(this.jButtonNuevoGuardarCambiosConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		//HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		sMapKey = "NuevoGuardarCambiosConstanteNomi";
		inputMap = this.jButtonNuevoGuardarCambiosConstanteNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO_TABLA") , FuncionesSwing.getMaskKey("NUEVO_TABLA")), sMapKey);
		
		this.jButtonNuevoGuardarCambiosConstanteNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"NuevoGuardarCambiosConstanteNomi"));
		
		//RECARGAR		
		
		sMapKey = "RecargarInformacionConstanteNomi";
		inputMap = this.jButtonRecargarInformacionConstanteNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("RECARGAR") , FuncionesSwing.getMaskKey("RECARGAR")), sMapKey);
			
		this.jButtonRecargarInformacionConstanteNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"RecargarInformacionConstanteNomi"));		
		
		
		//SIGUIENTES		
		sMapKey = "SiguientesConstanteNomi";
		inputMap = this.jButtonSiguientesConstanteNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("SIGUIENTES") , FuncionesSwing.getMaskKey("SIGUIENTES")), sMapKey);
		
		this.jButtonSiguientesConstanteNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"SiguientesConstanteNomi"));
		
		//ANTERIORES		
		sMapKey = "AnterioresConstanteNomi";
		inputMap = this.jButtonAnterioresConstanteNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ANTERIORES") , FuncionesSwing.getMaskKey("ANTERIORES")), sMapKey);
		
		this.jButtonAnterioresConstanteNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AnterioresConstanteNomi"));
		
		//HOT KEYS2
		
		
		
		//DETALLE

		//TOOLBAR
		
		
		
		//INDICES BUSQUEDA
		//INDICES BUSQUEDA_FIN
		
		
		
		
		//INDICES BUSQUEDA
		if(!this.conCargarMinimo) {
			
			this.inicializarElementosBusquedasConstanteNomi();			
			
		}
		//INDICES BUSQUEDA_FIN
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		//ESTA EN BEAN
		/*
		this.jTabbedPaneRelacionesConstanteNomi.setMinimumSize(new Dimension(this.getWidth(),ConstanteNomiBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ConstanteNomiBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesConstanteNomi.setMaximumSize(new Dimension(this.getWidth(),ConstanteNomiBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ConstanteNomiBean.ALTO_TABPANE_RELACIONES,0)));
		this.jTabbedPaneRelacionesConstanteNomi.setPreferredSize(new Dimension(this.getWidth(),ConstanteNomiBean.ALTO_TABPANE_RELACIONES  + FuncionesSwing.getValorProporcion(ConstanteNomiBean.ALTO_TABPANE_RELACIONES,0)));
		*/
		
		
		int iPosXAccionPaginacion=0;
		
			GridBagLayout gridaBagLayoutPaginacionConstanteNomi = new GridBagLayout();

			this.jPanelPaginacionConstanteNomi.setLayout(gridaBagLayoutPaginacionConstanteNomi);						
			
			this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
			this.gridBagConstraintsConstanteNomi.anchor = GridBagConstraints.EAST;
			this.gridBagConstraintsConstanteNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConstanteNomi.gridy = 0;
			this.gridBagConstraintsConstanteNomi.gridx = iPosXAccionPaginacion++;
			
			this.jPanelPaginacionConstanteNomi.add(this.jButtonAnterioresConstanteNomi, this.gridBagConstraintsConstanteNomi);
					
						
			this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
			this.gridBagConstraintsConstanteNomi.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsConstanteNomi.gridy = 0;
			
			this.jPanelPaginacionConstanteNomi.add(this.jButtonNuevoGuardarCambiosConstanteNomi, this.gridBagConstraintsConstanteNomi);
						
			
			this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
			this.gridBagConstraintsConstanteNomi.anchor = GridBagConstraints.WEST;			
			this.gridBagConstraintsConstanteNomi.gridx = iPosXAccionPaginacion++;
			this.gridBagConstraintsConstanteNomi.gridy = 0;
			this.jPanelPaginacionConstanteNomi.add(this.jButtonSiguientesConstanteNomi, this.gridBagConstraintsConstanteNomi);
			
			
			iPosXAccionPaginacion=0;
			
			this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
			this.gridBagConstraintsConstanteNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConstanteNomi.gridy = 1;
			this.gridBagConstraintsConstanteNomi.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionConstanteNomi.add(this.jButtonNuevoConstanteNomi, this.gridBagConstraintsConstanteNomi);
						
			if(this.conFuncionalidadRelaciones) {
				this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
				this.gridBagConstraintsConstanteNomi.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsConstanteNomi.gridy = 1;
				this.gridBagConstraintsConstanteNomi.gridx = iPosXAccionPaginacion++;
					
				this.jPanelPaginacionConstanteNomi.add(this.jButtonNuevoRelacionesConstanteNomi, this.gridBagConstraintsConstanteNomi);
			}
			
			
			if(!this.constantenomiSessionBean.getEsGuardarRelacionado()
				&& !this.conCargarMinimo) {
					
				this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
				this.gridBagConstraintsConstanteNomi.fill = GridBagConstraints.VERTICAL;
				this.gridBagConstraintsConstanteNomi.gridy = 1;
				this.gridBagConstraintsConstanteNomi.gridx = iPosXAccionPaginacion++;
						
				this.jPanelPaginacionConstanteNomi.add(this.jButtonGuardarCambiosTablaConstanteNomi, this.gridBagConstraintsConstanteNomi);
			}
			
			
			
			this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
			this.gridBagConstraintsConstanteNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConstanteNomi.gridy = 1;
			this.gridBagConstraintsConstanteNomi.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionConstanteNomi.add(this.jButtonDuplicarConstanteNomi, this.gridBagConstraintsConstanteNomi);
			
			this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
			this.gridBagConstraintsConstanteNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConstanteNomi.gridy = 1;
			this.gridBagConstraintsConstanteNomi.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionConstanteNomi.add(this.jButtonCopiarConstanteNomi, this.gridBagConstraintsConstanteNomi);
		
			this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
			this.gridBagConstraintsConstanteNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConstanteNomi.gridy = 1;
			this.gridBagConstraintsConstanteNomi.gridx = iPosXAccionPaginacion++;
					
			this.jPanelPaginacionConstanteNomi.add(this.jButtonVerFormConstanteNomi, this.gridBagConstraintsConstanteNomi);
		
			this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
			this.gridBagConstraintsConstanteNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConstanteNomi.gridy = 1;
			this.gridBagConstraintsConstanteNomi.gridx = iPosXAccionPaginacion++;
				
			this.jPanelPaginacionConstanteNomi.add(this.jButtonCerrarConstanteNomi, this.gridBagConstraintsConstanteNomi);
		
		
		
		this.jButtonRecargarInformacionConstanteNomi.setMinimumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionConstanteNomi.setMaximumSize(new Dimension(95,25));
		this.jButtonRecargarInformacionConstanteNomi.setPreferredSize(new Dimension(95,25));
	
		FuncionesSwing.setBoldButton(this.jButtonRecargarInformacionConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		
				
		
		this.jComboBoxTiposArchivosReportesConstanteNomi.setMinimumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesConstanteNomi.setMaximumSize(new Dimension(105,20));
		this.jComboBoxTiposArchivosReportesConstanteNomi.setPreferredSize(new Dimension(105,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposReportesConstanteNomi.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesConstanteNomi.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesConstanteNomi.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposGraficosReportesConstanteNomi.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesConstanteNomi.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposGraficosReportesConstanteNomi.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposGraficosReportesConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposPaginacionConstanteNomi.setMinimumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionConstanteNomi.setMaximumSize(new Dimension(80,20));
		this.jComboBoxTiposPaginacionConstanteNomi.setPreferredSize(new Dimension(80,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposPaginacionConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposRelacionesConstanteNomi.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesConstanteNomi.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposRelacionesConstanteNomi.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposRelacionesConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposAccionesConstanteNomi.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesConstanteNomi.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesConstanteNomi.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jComboBoxTiposSeleccionarConstanteNomi.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarConstanteNomi.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposSeleccionarConstanteNomi.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposSeleccionarConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			
			
		this.jCheckBoxConAltoMaximoTablaConstanteNomi.setMinimumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaConstanteNomi.setMaximumSize(new Dimension(20,20));
		this.jCheckBoxConAltoMaximoTablaConstanteNomi.setPreferredSize(new Dimension(20,20));		
					
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConAltoMaximoTablaConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		this.jCheckBoxConGraficoReporteConstanteNomi.setMinimumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteConstanteNomi.setMaximumSize(new Dimension(60,20));
		this.jCheckBoxConGraficoReporteConstanteNomi.setPreferredSize(new Dimension(60,20));		
			
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxConGraficoReporteConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);		
		
		
		
		this.jCheckBoxSeleccionarTodosConstanteNomi.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosConstanteNomi.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxSeleccionarTodosConstanteNomi.setPreferredSize(new Dimension(100,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionarTodosConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		this.jCheckBoxSeleccionadosConstanteNomi.setMinimumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosConstanteNomi.setMaximumSize(new Dimension(20,20));
        this.jCheckBoxSeleccionadosConstanteNomi.setPreferredSize(new Dimension(20,20));		
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxSeleccionadosConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		
		
			GridBagLayout gridaBagParametrosReportesConstanteNomi = new GridBagLayout();
			GridBagLayout gridaBagParametrosReportesAccionesConstanteNomi = new GridBagLayout();
			
			GridBagLayout gridaBagParametrosAuxiliar1ConstanteNomi = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar2ConstanteNomi = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar3ConstanteNomi = new GridBagLayout();
			GridBagLayout gridaBagParametrosAuxiliar4ConstanteNomi = new GridBagLayout();
			
			int iGridxParametrosReportes=0;
			int iGridyParametrosReportes=0;
			
			int iGridxParametrosAuxiliar=0;
			int iGridyParametrosAuxiliar=0;
			
			this.jPanelParametrosReportesConstanteNomi.setLayout(gridaBagParametrosReportesConstanteNomi);
			this.jPanelParametrosReportesAccionesConstanteNomi.setLayout(gridaBagParametrosReportesAccionesConstanteNomi);
			
			
			this.jPanelParametrosAuxiliar1ConstanteNomi.setLayout(gridaBagParametrosAuxiliar1ConstanteNomi);
			this.jPanelParametrosAuxiliar2ConstanteNomi.setLayout(gridaBagParametrosAuxiliar2ConstanteNomi);
			this.jPanelParametrosAuxiliar3ConstanteNomi.setLayout(gridaBagParametrosAuxiliar3ConstanteNomi);
			this.jPanelParametrosAuxiliar4ConstanteNomi.setLayout(gridaBagParametrosAuxiliar4ConstanteNomi);
			//this.jPanelParametrosAuxiliar5ConstanteNomi.setLayout(gridaBagParametrosAuxiliar2ConstanteNomi);			
			
			
			
			
			this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
			this.gridBagConstraintsConstanteNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConstanteNomi.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsConstanteNomi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesConstanteNomi.add(this.jButtonRecargarInformacionConstanteNomi, this.gridBagConstraintsConstanteNomi);			
			
			

			
			
			//PAGINACION
			this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
			this.gridBagConstraintsConstanteNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConstanteNomi.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsConstanteNomi.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ConstanteNomi.add(this.jComboBoxTiposPaginacionConstanteNomi, this.gridBagConstraintsConstanteNomi);			
	
			//CON ALTO MAXIMO TABLA
			this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
			this.gridBagConstraintsConstanteNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConstanteNomi.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsConstanteNomi.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ConstanteNomi.add(this.jCheckBoxConAltoMaximoTablaConstanteNomi, this.gridBagConstraintsConstanteNomi);			
	
			//TIPOS ARCHIVOS REPORTES
			this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
			this.gridBagConstraintsConstanteNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConstanteNomi.gridy = iGridyParametrosAuxiliar;//iGridyParametrosReportes;		
			this.gridBagConstraintsConstanteNomi.gridx = iGridxParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar1ConstanteNomi.add(this.jComboBoxTiposArchivosReportesConstanteNomi, this.gridBagConstraintsConstanteNomi);
									
			//USANDO AUXILIAR			
			this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
			this.gridBagConstraintsConstanteNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConstanteNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConstanteNomi.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesConstanteNomi.add(this.jPanelParametrosAuxiliar1ConstanteNomi, this.gridBagConstraintsConstanteNomi);			
			//USANDO AUXILIAR FIN
				
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES	
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
				
			this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
			this.gridBagConstraintsConstanteNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConstanteNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConstanteNomi.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsConstanteNomi.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar4ConstanteNomi.add(this.jComboBoxTiposReportesConstanteNomi, this.gridBagConstraintsConstanteNomi);																		
			
			
			
			this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
			this.gridBagConstraintsConstanteNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConstanteNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConstanteNomi.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsConstanteNomi.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			//POR EL MOMENTO SOLO SE UTILIZA EN REPORTES DINAMICOS SIMPLES
			//this.jPanelParametrosAuxiliar4ConstanteNomi.add(this.jComboBoxTiposGraficosReportesConstanteNomi, this.gridBagConstraintsConstanteNomi);															
			//AUXILIAR4 TIPOS REPORTES Y TIPOS GRAFICOS REPORTES
			
			//USANDO AUXILIAR 4			
			
			this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
			this.gridBagConstraintsConstanteNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConstanteNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConstanteNomi.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesConstanteNomi.add(this.jPanelParametrosAuxiliar4ConstanteNomi, this.gridBagConstraintsConstanteNomi);						
			
			//USANDO AUXILIAR 4 FIN
			
			//TIPOS REPORTES
			/*
			this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
			this.gridBagConstraintsConstanteNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConstanteNomi.gridy = iGridyParametrosReportes;//iGridyParametrosReportes;		
			this.gridBagConstraintsConstanteNomi.gridx = iGridxParametrosReportes++;//iGridxParametrosReportes++;
			
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesConstanteNomi.add(this.jComboBoxTiposReportesConstanteNomi, this.gridBagConstraintsConstanteNomi);
			*/
			
			//GENERAR REPORTE (jCheckBoxExportar)
			/*
			this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
			this.gridBagConstraintsConstanteNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConstanteNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConstanteNomi.gridx = iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesConstanteNomi.add(this.jCheckBoxGenerarReporteConstanteNomi, this.gridBagConstraintsConstanteNomi);
			*/
			
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			//USANDO AUXILIAR
			
			this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
			this.gridBagConstraintsConstanteNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConstanteNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConstanteNomi.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesConstanteNomi.add(this.jPanelParametrosAuxiliar2ConstanteNomi, this.gridBagConstraintsConstanteNomi);						
			
			//USANDO AUXILIAR FIN
			
			
			//PARAMETROS ACCIONES
			//iGridxParametrosReportes=1;
			iGridxParametrosReportes=0;
			iGridyParametrosReportes=1;			
			
			/*
			this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
			this.gridBagConstraintsConstanteNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConstanteNomi.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsConstanteNomi.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesConstanteNomi.add(this.jLabelAccionesConstanteNomi, this.gridBagConstraintsConstanteNomi);
			*/
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			//ORDER BY
			if(!this.conCargarMinimo) {	
				
				this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
				this.gridBagConstraintsConstanteNomi.fill = GridBagConstraints.HORIZONTAL;
				this.gridBagConstraintsConstanteNomi.gridy = iGridyParametrosReportes;
				this.gridBagConstraintsConstanteNomi.gridx = iGridxParametrosReportes++;
					
				this.jPanelParametrosReportesConstanteNomi.add(this.jButtonAbrirOrderByConstanteNomi, this.gridBagConstraintsConstanteNomi);						
								
			}
			
			//PARAMETROS_ACCIONES-PARAMETROS_REPORTES
			
			this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
			this.gridBagConstraintsConstanteNomi.fill = GridBagConstraints.HORIZONTAL;
			this.gridBagConstraintsConstanteNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConstanteNomi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesConstanteNomi.add(this.jComboBoxTiposSeleccionarConstanteNomi, this.gridBagConstraintsConstanteNomi);			
			
			
			/*
			this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
			this.gridBagConstraintsConstanteNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConstanteNomi.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsConstanteNomi.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesConstanteNomi.add(this.jCheckBoxSeleccionarTodosConstanteNomi, this.gridBagConstraintsConstanteNomi);
			
			this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
			this.gridBagConstraintsConstanteNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConstanteNomi.gridy = iGridyParametrosReportes;
			this.gridBagConstraintsConstanteNomi.gridx =iGridxParametrosReportes++;
			
			this.jPanelParametrosReportesConstanteNomi.add(this.jCheckBoxConGraficoReporteConstanteNomi, this.gridBagConstraintsConstanteNomi);
			*/
			
			iGridxParametrosAuxiliar=0;
			iGridyParametrosAuxiliar=0;
			
			
			this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
			this.gridBagConstraintsConstanteNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConstanteNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConstanteNomi.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsConstanteNomi.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ConstanteNomi.add(this.jCheckBoxSeleccionarTodosConstanteNomi, this.gridBagConstraintsConstanteNomi);															
				
			this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
			this.gridBagConstraintsConstanteNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConstanteNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConstanteNomi.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsConstanteNomi.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ConstanteNomi.add(this.jCheckBoxSeleccionadosConstanteNomi, this.gridBagConstraintsConstanteNomi);															
			
			this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
			this.gridBagConstraintsConstanteNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConstanteNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConstanteNomi.gridy =iGridxParametrosAuxiliar;//iGridyParametrosReportes;
			this.gridBagConstraintsConstanteNomi.gridx =iGridyParametrosAuxiliar++;//iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosAuxiliar3ConstanteNomi.add(this.jCheckBoxConGraficoReporteConstanteNomi, this.gridBagConstraintsConstanteNomi);															
			
			//USANDO AUXILIAR3			
			this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
			this.gridBagConstraintsConstanteNomi.anchor = GridBagConstraints.WEST;
			this.gridBagConstraintsConstanteNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConstanteNomi.gridx = iGridxParametrosReportes++;
				
			//this.jPanelParametrosReportes
			this.jPanelParametrosReportesConstanteNomi.add(this.jPanelParametrosAuxiliar3ConstanteNomi, this.gridBagConstraintsConstanteNomi);			
			//USANDO AUXILIAR3 FIN				
				
			this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
			this.gridBagConstraintsConstanteNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConstanteNomi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesConstanteNomi.add(this.jComboBoxTiposRelacionesConstanteNomi, this.gridBagConstraintsConstanteNomi);
				
			this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
			this.gridBagConstraintsConstanteNomi.gridy = iGridyParametrosReportes;		
			this.gridBagConstraintsConstanteNomi.gridx = iGridxParametrosReportes++;
				
			this.jPanelParametrosReportesConstanteNomi.add(this.jComboBoxTiposAccionesConstanteNomi, this.gridBagConstraintsConstanteNomi);
	
			
			
		
		
		;
		
		
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		/*
			GridBagLayout gridaBagLayoutDatosConstanteNomi = new GridBagLayout();

			this.jScrollPanelDatosConstanteNomi.setLayout(gridaBagLayoutDatosConstanteNomi);
			
			this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
			this.gridBagConstraintsConstanteNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConstanteNomi.gridy = 0;
			this.gridBagConstraintsConstanteNomi.gridx = 0;
			
			this.jScrollPanelDatosConstanteNomi.add(this.jTableDatosConstanteNomi, this.gridBagConstraintsConstanteNomi);
		*/
		 
		this.redimensionarTablaDatos(-1);
		
		this.jScrollPanelDatosConstanteNomi.setViewportView(this.jTableDatosConstanteNomi);
		this.jTableDatosConstanteNomi.setFillsViewportHeight(true);
		this.jTableDatosConstanteNomi.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesConstanteNomi= new GridBagLayout();
		this.jPanelAccionesConstanteNomi.setLayout(gridaBagLayoutAccionesConstanteNomi);
		
		
		/*	
		this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
		this.gridBagConstraintsConstanteNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConstanteNomi.gridy = 0;
		this.gridBagConstraintsConstanteNomi.gridx = 0;
			
		this.jPanelAccionesConstanteNomi.add(this.jButtonNuevoConstanteNomi, this.gridBagConstraintsConstanteNomi);
		*/
		int iPosXAccion=0;
		
						
		
		
		if(!this.conCargarMinimo) {
			//BYDAN_BUSQUEDAS
			
			
		GridBagLayout gridaBagLayoutFK_IdTipoConstanteConstanteNomi= new GridBagLayout();
		gridaBagLayoutFK_IdTipoConstanteConstanteNomi.rowHeights = new int[] {1};
		gridaBagLayoutFK_IdTipoConstanteConstanteNomi.columnWidths = new int[] {1};
		gridaBagLayoutFK_IdTipoConstanteConstanteNomi.rowWeights = new double[]{0.0, 0.0, 0.0};
		gridaBagLayoutFK_IdTipoConstanteConstanteNomi.columnWeights = new double[]{0.0, 1.0};
		jPanelFK_IdTipoConstanteConstanteNomi.setLayout(gridaBagLayoutFK_IdTipoConstanteConstanteNomi);

		gridBagConstraintsConstanteNomi = new GridBagConstraints();
		gridBagConstraintsConstanteNomi.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConstanteNomi.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConstanteNomi.gridy = 0;
		gridBagConstraintsConstanteNomi.gridx = 0;
		jPanelFK_IdTipoConstanteConstanteNomi.add(jLabelid_tipo_constante_nomiFK_IdTipoConstanteConstanteNomi, gridBagConstraintsConstanteNomi);

		gridBagConstraintsConstanteNomi = new GridBagConstraints();
		gridBagConstraintsConstanteNomi.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConstanteNomi.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConstanteNomi.gridy = 0;
		gridBagConstraintsConstanteNomi.gridx = 1;
		jPanelFK_IdTipoConstanteConstanteNomi.add(jComboBoxid_tipo_constante_nomiFK_IdTipoConstanteConstanteNomi, gridBagConstraintsConstanteNomi);

		gridBagConstraintsConstanteNomi = new GridBagConstraints();
		gridBagConstraintsConstanteNomi.anchor = GridBagConstraints.WEST;
		gridBagConstraintsConstanteNomi.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsConstanteNomi.gridy = 1;
		gridBagConstraintsConstanteNomi.gridx =1;
		jPanelFK_IdTipoConstanteConstanteNomi.add(jButtonFK_IdTipoConstanteConstanteNomi, gridBagConstraintsConstanteNomi);

		jTabbedPaneBusquedasConstanteNomi.addTab("1.-Por Tipo Constante ", jPanelFK_IdTipoConstanteConstanteNomi);
		jTabbedPaneBusquedasConstanteNomi.setMnemonicAt(0, KeyEvent.VK_1);

					
		}
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutConstanteNomi = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutConstanteNomi);
		
if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.constantenomiSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsConstanteNomi = new GridBagConstraints();						
			this.gridBagConstraintsConstanteNomi.gridy = iGridyPrincipal++;
			this.gridBagConstraintsConstanteNomi.gridx = 0;		
			//this.gridBagConstraintsConstanteNomi.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConstanteNomi.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsConstanteNomi.ipadx = 100;
				
			this.jContentPane.add(this.jTtoolBarConstanteNomi, this.gridBagConstraintsConstanteNomi);												
			
}
		
		//PROCESANDO EN OTRA PANTALLA
		/*
		this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
		this.gridBagConstraintsConstanteNomi.gridy = iGridyPrincipal++;
		this.gridBagConstraintsConstanteNomi.gridx = 0;		
		//this.gridBagConstraintsConstanteNomi.fill =GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConstanteNomi.anchor = GridBagConstraints.CENTER;
		this.gridBagConstraintsConstanteNomi.ipadx = 100;
		
		this.jContentPane.add(this.jPanelProgressProcess, this.gridBagConstraintsConstanteNomi);
		*/
		
		int iGridxBusquedasParametros=0;
		
		
		this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
		
		if(!this.conCargarMinimo) {
			this.gridBagConstraintsConstanteNomi.gridy = iGridyPrincipal++;
			this.gridBagConstraintsConstanteNomi.gridx = 0;		
			this.gridBagConstraintsConstanteNomi.fill =GridBagConstraints.VERTICAL;//GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConstanteNomi.anchor = GridBagConstraints.NORTHWEST;
			this.gridBagConstraintsConstanteNomi.ipadx = 150;
			
			if(!this.conCargarMinimo) {
				
				this.jContentPane.add(this.jTabbedPaneBusquedasConstanteNomi, this.gridBagConstraintsConstanteNomi);				
				
			}
			
		}
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
		this.gridBagConstraintsConstanteNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConstanteNomi.gridx = 0;
		
		
		this.jContentPane.add(this.jPanelParametrosReportesConstanteNomi, this.gridBagConstraintsConstanteNomi);								
		
		
		/*
		this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
		this.gridBagConstraintsConstanteNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConstanteNomi.gridx = 0;
		
		this.jContentPane.add(this.jPanelParametrosReportesAccionesConstanteNomi, this.gridBagConstraintsConstanteNomi);
		*/		
		
		this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
		this.gridBagConstraintsConstanteNomi.gridy =iGridyPrincipal++;
		this.gridBagConstraintsConstanteNomi.gridx =0;
		this.gridBagConstraintsConstanteNomi.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsConstanteNomi.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosConstanteNomi, this.gridBagConstraintsConstanteNomi);
				
		
		this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
		this.gridBagConstraintsConstanteNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConstanteNomi.gridx = 0;
		
		this.jContentPane.add(this.jPanelPaginacionConstanteNomi, this.gridBagConstraintsConstanteNomi);
			  
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);
		
		//iWidthFormulario=iWidthScroll;
		//iHeightFormulario=iHeightScroll;
		
			
		if(ConstanteNomiJInternalFrame.CON_DATOS_FRAME) {				
			
			
			this.jPanelBusquedasParametrosConstanteNomi= new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			
			
			GridBagLayout gridaBagLayoutBusquedasParametrosConstanteNomi = new GridBagLayout();
			this.jPanelBusquedasParametrosConstanteNomi.setLayout(gridaBagLayoutBusquedasParametrosConstanteNomi);
			
			
			if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
			}
			
			
			this.jScrollPanelDatosGeneralConstanteNomi=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralConstanteNomi.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralConstanteNomi.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralConstanteNomi.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
			
			
			
			
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
		this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
		this.gridBagConstraintsConstanteNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConstanteNomi.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposConstanteNomi, this.gridBagConstraintsConstanteNomi);
			
			
		this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
		this.gridBagConstraintsConstanteNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConstanteNomi.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosConstanteNomi, this.gridBagConstraintsConstanteNomi);
		
			
		this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
		this.gridBagConstraintsConstanteNomi.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsConstanteNomi.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesConstanteNomi, this.gridBagConstraintsConstanteNomi);
		*/
		
			
     	//pack();
		
		
		
		return this.jScrollPanelDatosGeneralConstanteNomi;//jContentPane;
    } 
	
	
	
	
	/*
	public void cargarReporteDinamicoConstanteNomi() throws Exception {		
		
		int iWidthReporteDinamico=350;
		int iHeightReporteDinamico=450;//250;400;
		
			iHeightReporteDinamico+=180;
		
		int iPosXReporteDinamico=0;
		int iPosYReporteDinamico=0;
		
		GridBagLayout gridaBagLayoutReporteDinamicoConstanteNomi = new GridBagLayout();
				
		//PANEL
		this.jPanelReporteDinamicoConstanteNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelReporteDinamicoConstanteNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelReporteDinamicoConstanteNomi.setName("jPanelReporteDinamicoConstanteNomi"); 
		
		this.jPanelReporteDinamicoConstanteNomi.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoConstanteNomi.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		this.jPanelReporteDinamicoConstanteNomi.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
	
		this.jPanelReporteDinamicoConstanteNomi.setLayout(gridaBagLayoutReporteDinamicoConstanteNomi);
		
		
		this.jInternalFrameReporteDinamicoConstanteNomi= new ReporteDinamicoJInternalFrame();
		this.jScrollPanelReporteDinamicoConstanteNomi = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteConstanteNomi= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameReporteDinamicoConstanteNomi.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameReporteDinamicoConstanteNomi.setjInternalFrameParent(this);
		
		this.jInternalFrameReporteDinamicoConstanteNomi.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameReporteDinamicoConstanteNomi.setSize(iWidthReporteDinamico+70,iHeightReporteDinamico+100);		
		this.jInternalFrameReporteDinamicoConstanteNomi.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameReporteDinamicoConstanteNomi.setResizable(true);
	    this.jInternalFrameReporteDinamicoConstanteNomi.setClosable(true);
	    this.jInternalFrameReporteDinamicoConstanteNomi.setMaximizable(true);
		
			
		//SCROLL PANEL		
		//this.jScrollPanelReporteDinamicoConstanteNomi.setMinimumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoConstanteNomi.setMaximumSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		//this.jScrollPanelReporteDinamicoConstanteNomi.setPreferredSize(new Dimension(iWidthReporteDinamico,iHeightReporteDinamico));
		
		//this.jScrollPanelReporteDinamicoConstanteNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Constante Nomis"));			
		
			
		//CONTROLES-ELEMENTOS
		//LABEL SELECT COLUMNAS
		this.jLabelColumnasSelectReporteConstanteNomi = new JLabelMe();

		this.jLabelColumnasSelectReporteConstanteNomi.setText("Columnas Seleccion");		
		this.jLabelColumnasSelectReporteConstanteNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteConstanteNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasSelectReporteConstanteNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
		this.gridBagConstraintsConstanteNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConstanteNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConstanteNomi.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoConstanteNomi.add(this.jLabelColumnasSelectReporteConstanteNomi, this.gridBagConstraintsConstanteNomi);
		

		//LISTA SELECT COLUMNAS
		this.jListColumnasSelectReporteConstanteNomi = new JList<Reporte>();
		this.jListColumnasSelectReporteConstanteNomi.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasSelectReporteConstanteNomi.setToolTipText("Tipos de Seleccion");
      		
		this.jListColumnasSelectReporteConstanteNomi.setMinimumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteConstanteNomi.setMaximumSize(new Dimension(145,300));
        this.jListColumnasSelectReporteConstanteNomi.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollColumnasSelectReporteConstanteNomi=new JScrollPane(this.jListColumnasSelectReporteConstanteNomi);
			
			this.jScrollColumnasSelectReporteConstanteNomi.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteConstanteNomi.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasSelectReporteConstanteNomi.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasSelectReporteConstanteNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
		this.gridBagConstraintsConstanteNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConstanteNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConstanteNomi.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoConstanteNomi.add(this.jListColumnasSelectReporteConstanteNomi, this.gridBagConstraintsConstanteNomi);
		this.jPanelReporteDinamicoConstanteNomi.add(this.jScrollColumnasSelectReporteConstanteNomi, this.gridBagConstraintsConstanteNomi);
		
		
		//LABEL SELECT RELACIONES
		this.jLabelRelacionesSelectReporteConstanteNomi = new JLabelMe();

		this.jLabelRelacionesSelectReporteConstanteNomi.setText("Relaciones Seleccion");		
		this.jLabelRelacionesSelectReporteConstanteNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteConstanteNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelRelacionesSelectReporteConstanteNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
		this.gridBagConstraintsConstanteNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConstanteNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConstanteNomi.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoConstanteNomi.add(this.jLabelRelacionesSelectReporteConstanteNomi, this.gridBagConstraintsConstanteNomi);
		//LABEL SELECT RELACIONES_FIN
		
		//LISTA SELECT RELACIONES
		this.jListRelacionesSelectReporteConstanteNomi = new JList<Reporte>();
		this.jListRelacionesSelectReporteConstanteNomi.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListRelacionesSelectReporteConstanteNomi.setToolTipText("Tipos de Seleccion");
      		
		this.jListRelacionesSelectReporteConstanteNomi.setMinimumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteConstanteNomi.setMaximumSize(new Dimension(145,300));
        this.jListRelacionesSelectReporteConstanteNomi.setPreferredSize(new Dimension(145,300));

			//SCROLL_PANEL_CONTROL
			this.jScrollRelacionesSelectReporteConstanteNomi=new JScrollPane(this.jListRelacionesSelectReporteConstanteNomi);
			
			this.jScrollRelacionesSelectReporteConstanteNomi.setMinimumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteConstanteNomi.setMaximumSize(new Dimension(180,120));
			this.jScrollRelacionesSelectReporteConstanteNomi.setPreferredSize(new Dimension(180,120));
			
			this.jScrollRelacionesSelectReporteConstanteNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("RELACIONES"));			
		
		
		this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
		this.gridBagConstraintsConstanteNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConstanteNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConstanteNomi.gridx = iPosXReporteDinamico++;
				
			
		//this.jPanelReporteDinamicoConstanteNomi.add(this.jListRelacionesSelectReporteConstanteNomi, this.gridBagConstraintsConstanteNomi);
		this.jPanelReporteDinamicoConstanteNomi.add(this.jScrollRelacionesSelectReporteConstanteNomi, this.gridBagConstraintsConstanteNomi);
		//LISTA SELECT RELACIONES_FIN
		
		
		this.jCheckBoxConGraficoDinamicoConstanteNomi = new JCheckBoxMe();
		this.jComboBoxColumnaCategoriaGraficoConstanteNomi = new JComboBoxMe();
		this.jListColumnasValoresGraficoConstanteNomi = new JList<Reporte>();
		
		//COMBO TIPOS REPORTES
		this.jComboBoxTiposReportesDinamicoConstanteNomi = new JComboBoxMe();		
		this.jComboBoxTiposReportesDinamicoConstanteNomi.setToolTipText("Tipos De Reporte");
		
		this.jComboBoxTiposReportesDinamicoConstanteNomi.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoConstanteNomi.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposReportesDinamicoConstanteNomi.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposReportesDinamicoConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS REPORTES
		
		
		//COMBO TIPOS ARCHIVOS
		this.jComboBoxTiposArchivosReportesDinamicoConstanteNomi = new JComboBoxMe();		
		this.jComboBoxTiposArchivosReportesDinamicoConstanteNomi.setToolTipText("Tipos Archivos");
		
		this.jComboBoxTiposArchivosReportesDinamicoConstanteNomi.setMinimumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoConstanteNomi.setMaximumSize(new Dimension(100,20));
		this.jComboBoxTiposArchivosReportesDinamicoConstanteNomi.setPreferredSize(new Dimension(100,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposArchivosReportesDinamicoConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
		//COMBO TIPOS ARCHIVOS
		
		
		//LABEL CON GRAFICO DINAMICO
		this.jLabelConGraficoDinamicoConstanteNomi = new JLabelMe();

		this.jLabelConGraficoDinamicoConstanteNomi.setText("Con Grafico");		
		this.jLabelConGraficoDinamicoConstanteNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoConstanteNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelConGraficoDinamicoConstanteNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
		this.gridBagConstraintsConstanteNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConstanteNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConstanteNomi.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoConstanteNomi.add(this.jLabelConGraficoDinamicoConstanteNomi, this.gridBagConstraintsConstanteNomi);
		
		
		//CHECKBOX CON GRAFICO DINAMICO
		this.jCheckBoxConGraficoDinamicoConstanteNomi = new JCheckBoxMe();
		this.jCheckBoxConGraficoDinamicoConstanteNomi.setText("Graf.");
		this.jCheckBoxConGraficoDinamicoConstanteNomi.setToolTipText("Con Grafico");				


		this.jCheckBoxConGraficoDinamicoConstanteNomi.setMinimumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoConstanteNomi.setMaximumSize(new Dimension(100,20));
        this.jCheckBoxConGraficoDinamicoConstanteNomi.setPreferredSize(new Dimension(100,20));		
		
		this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
		this.gridBagConstraintsConstanteNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConstanteNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConstanteNomi.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoConstanteNomi.add(this.jCheckBoxConGraficoDinamicoConstanteNomi, this.gridBagConstraintsConstanteNomi);
		
		
		
		//LABEL COMBO COLUMNA CATEGORIA
		this.jLabelColumnaCategoriaGraficoConstanteNomi = new JLabelMe();

		this.jLabelColumnaCategoriaGraficoConstanteNomi.setText("Categoria Grafico");		
		this.jLabelColumnaCategoriaGraficoConstanteNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoConstanteNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaGraficoConstanteNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;	
		
		this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
		this.gridBagConstraintsConstanteNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConstanteNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConstanteNomi.gridx = iPosXReporteDinamico++;
				
		this.jPanelReporteDinamicoConstanteNomi.add(this.jLabelColumnaCategoriaGraficoConstanteNomi, this.gridBagConstraintsConstanteNomi);
		
		//COMBO COLUMNA CATEGORIA
		this.jComboBoxColumnaCategoriaGraficoConstanteNomi = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoConstanteNomi.setText("Accion");
        this.jComboBoxColumnaCategoriaGraficoConstanteNomi.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaGraficoConstanteNomi.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoConstanteNomi.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaGraficoConstanteNomi.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
		this.gridBagConstraintsConstanteNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConstanteNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConstanteNomi.gridx = iPosXReporteDinamico++;
		
		this.jPanelReporteDinamicoConstanteNomi.add(this.jComboBoxColumnaCategoriaGraficoConstanteNomi, this.gridBagConstraintsConstanteNomi);
				
		
		//LABEL COMBO COLUMNA CATEGORIA VALOR
		this.jLabelColumnaCategoriaValorConstanteNomi = new JLabelMe();

		this.jLabelColumnaCategoriaValorConstanteNomi.setText("Categoria Valor");		
		this.jLabelColumnaCategoriaValorConstanteNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorConstanteNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnaCategoriaValorConstanteNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		
		this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
		this.gridBagConstraintsConstanteNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConstanteNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConstanteNomi.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoConstanteNomi.add(this.jLabelColumnaCategoriaValorConstanteNomi, this.gridBagConstraintsConstanteNomi);
		
		//COMBO COLUMNA CATEGORIA VALOR
		this.jComboBoxColumnaCategoriaValorConstanteNomi = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaValorConstanteNomi.setText("Accion");
        this.jComboBoxColumnaCategoriaValorConstanteNomi.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxColumnaCategoriaValorConstanteNomi.setMinimumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorConstanteNomi.setMaximumSize(new Dimension(145,20));
        this.jComboBoxColumnaCategoriaValorConstanteNomi.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
		this.gridBagConstraintsConstanteNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConstanteNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConstanteNomi.gridx = iPosXReporteDinamico++;
	
		this.jPanelReporteDinamicoConstanteNomi.add(this.jComboBoxColumnaCategoriaValorConstanteNomi, this.gridBagConstraintsConstanteNomi);
		
		
		//LABEL VALORES GRAFICO COLUMNAS
		this.jLabelColumnasValoresGraficoConstanteNomi = new JLabelMe();

		this.jLabelColumnasValoresGraficoConstanteNomi.setText("Columnas Valor Graf.");		
		this.jLabelColumnasValoresGraficoConstanteNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoConstanteNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelColumnasValoresGraficoConstanteNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
		this.gridBagConstraintsConstanteNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConstanteNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConstanteNomi.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoConstanteNomi.add(this.jLabelColumnasValoresGraficoConstanteNomi, this.gridBagConstraintsConstanteNomi);


		//LISTA VALORES GRAFICO COLUMNAS
		this.jListColumnasValoresGraficoConstanteNomi = new JList<Reporte>();
		this.jListColumnasValoresGraficoConstanteNomi.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		this.jListColumnasValoresGraficoConstanteNomi.setToolTipText("VALORES GRAFICO");
      		
		this.jListColumnasValoresGraficoConstanteNomi.setMinimumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoConstanteNomi.setMaximumSize(new Dimension(145,300));
        this.jListColumnasValoresGraficoConstanteNomi.setPreferredSize(new Dimension(145,300));

			//SCROLL_VALORES GRAFICO COLUMNAS
			this.jScrollColumnasValoresGraficoConstanteNomi=new JScrollPane(this.jListColumnasValoresGraficoConstanteNomi);
			
			this.jScrollColumnasValoresGraficoConstanteNomi.setMinimumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoConstanteNomi.setMaximumSize(new Dimension(180,150));
			this.jScrollColumnasValoresGraficoConstanteNomi.setPreferredSize(new Dimension(180,150));
			
			this.jScrollColumnasValoresGraficoConstanteNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("COLUMNAS"));			
			
		this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
		this.gridBagConstraintsConstanteNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConstanteNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConstanteNomi.gridx = iPosXReporteDinamico++;
			
		
		//this.jPanelReporteDinamicoConstanteNomi.add(this.jListColumnasSelectReporteConstanteNomi, this.gridBagConstraintsConstanteNomi);
		this.jPanelReporteDinamicoConstanteNomi.add(this.jScrollColumnasValoresGraficoConstanteNomi, this.gridBagConstraintsConstanteNomi);		
		
		
		//LABEL TIPOS GRAFICO REPORTES
		this.jLabelTiposGraficosReportesDinamicoConstanteNomi = new JLabelMe();

		this.jLabelTiposGraficosReportesDinamicoConstanteNomi.setText("Tipo Grafico");		
		this.jLabelTiposGraficosReportesDinamicoConstanteNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoConstanteNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposGraficosReportesDinamicoConstanteNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		
		this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
		this.gridBagConstraintsConstanteNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConstanteNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConstanteNomi.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoConstanteNomi.add(this.jLabelTiposGraficosReportesDinamicoConstanteNomi, this.gridBagConstraintsConstanteNomi);

		//COMBO TIPO GRAFICO REPORTE
		this.jComboBoxTiposGraficosReportesDinamicoConstanteNomi = new JComboBoxMe();
		//this.jComboBoxColumnaCategoriaGraficoConstanteNomi.setText("Accion");
        this.jComboBoxTiposGraficosReportesDinamicoConstanteNomi.setToolTipText("Tipos de Seleccion");
      
		this.jComboBoxTiposGraficosReportesDinamicoConstanteNomi.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoConstanteNomi.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposGraficosReportesDinamicoConstanteNomi.setPreferredSize(new Dimension(145,20));

		this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
		this.gridBagConstraintsConstanteNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConstanteNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConstanteNomi.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoConstanteNomi.add(this.jComboBoxTiposGraficosReportesDinamicoConstanteNomi, this.gridBagConstraintsConstanteNomi);
		
		
		//LABEL GENERAR EXCEL
		this.jLabelGenerarExcelReporteDinamicoConstanteNomi = new JLabelMe();

		this.jLabelGenerarExcelReporteDinamicoConstanteNomi.setText("Tipos de Reporte");		
		this.jLabelGenerarExcelReporteDinamicoConstanteNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoConstanteNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelGenerarExcelReporteDinamicoConstanteNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
		this.gridBagConstraintsConstanteNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConstanteNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConstanteNomi.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoConstanteNomi.add(this.jLabelGenerarExcelReporteDinamicoConstanteNomi, this.gridBagConstraintsConstanteNomi);

				
		//BOTON GENERAR EXCEL
		
		this.jButtonGenerarExcelReporteDinamicoConstanteNomi = new JButtonMe();
		this.jButtonGenerarExcelReporteDinamicoConstanteNomi.setText("Generar Excel");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarExcelReporteDinamicoConstanteNomi,"generar_excel_reporte_dinamico_button","Generar EXCEL");		
		this.jButtonGenerarExcelReporteDinamicoConstanteNomi.setToolTipText("Generar EXCEL"+" "+ConstanteNomiConstantesFunciones.SCLASSWEBTITULO);
		
				
		//this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
		//this.gridBagConstraintsConstanteNomi.fill = GridBagConstraints.VERTICAL;
		//this.gridBagConstraintsConstanteNomi.gridy = iPosYReporteDinamico;
		//this.gridBagConstraintsConstanteNomi.gridx = iPosXReporteDinamico++;
							
		//this.jPanelReporteDinamicoConstanteNomi.add(this.jButtonGenerarExcelReporteDinamicoConstanteNomi, this.gridBagConstraintsConstanteNomi);
		
		
		//COMBO TIPOS REPORTES
		this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
		this.gridBagConstraintsConstanteNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConstanteNomi.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsConstanteNomi.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoConstanteNomi.add(this.jComboBoxTiposReportesDinamicoConstanteNomi, this.gridBagConstraintsConstanteNomi);
		
				
		//LABEL TIPOS DE ARCHIVO
		this.jLabelTiposArchivoReporteDinamicoConstanteNomi = new JLabelMe();

		this.jLabelTiposArchivoReporteDinamicoConstanteNomi.setText("Tipos de Archivo");		
		this.jLabelTiposArchivoReporteDinamicoConstanteNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoConstanteNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelTiposArchivoReporteDinamicoConstanteNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;		
		this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
		this.gridBagConstraintsConstanteNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConstanteNomi.gridy = iPosYReporteDinamico;		
		this.gridBagConstraintsConstanteNomi.gridx = iPosXReporteDinamico++;
			
		this.jPanelReporteDinamicoConstanteNomi.add(this.jLabelTiposArchivoReporteDinamicoConstanteNomi, this.gridBagConstraintsConstanteNomi);

		//COMBO TIPOS ARCHIVOS
		this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
		this.gridBagConstraintsConstanteNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConstanteNomi.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsConstanteNomi.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoConstanteNomi.add(this.jComboBoxTiposArchivosReportesDinamicoConstanteNomi, this.gridBagConstraintsConstanteNomi);
		
		
		//BOTON GENERAR
		this.jButtonGenerarReporteDinamicoConstanteNomi = new JButtonMe();
		this.jButtonGenerarReporteDinamicoConstanteNomi.setText("Generar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarReporteDinamicoConstanteNomi,"generar_reporte_dinamico_button","Generar");
		
		this.jButtonGenerarReporteDinamicoConstanteNomi.setToolTipText("Generar"+" "+ConstanteNomiConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXReporteDinamico=0;
		iPosYReporteDinamico++;
		this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
		this.gridBagConstraintsConstanteNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConstanteNomi.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsConstanteNomi.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoConstanteNomi.add(this.jButtonGenerarReporteDinamicoConstanteNomi, this.gridBagConstraintsConstanteNomi);
					
		//BOTON CERRAR
		this.jButtonCerrarReporteDinamicoConstanteNomi = new JButtonMe();
		this.jButtonCerrarReporteDinamicoConstanteNomi.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReporteDinamicoConstanteNomi,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarReporteDinamicoConstanteNomi.setToolTipText("Cancelar"+" "+ConstanteNomiConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
		this.gridBagConstraintsConstanteNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConstanteNomi.gridy = iPosYReporteDinamico;
		this.gridBagConstraintsConstanteNomi.gridx = iPosXReporteDinamico++;
							
		this.jPanelReporteDinamicoConstanteNomi.add(this.jButtonCerrarReporteDinamicoConstanteNomi, this.gridBagConstraintsConstanteNomi);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutReporteDinamicoPrincipalConstanteNomi = new GridBagLayout();
		
		this.jScrollPanelReporteDinamicoConstanteNomi= new JScrollPane(jPanelReporteDinamicoConstanteNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		this.jScrollPanelReporteDinamicoConstanteNomi.setMinimumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoConstanteNomi.setMaximumSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		this.jScrollPanelReporteDinamicoConstanteNomi.setPreferredSize(new Dimension(iWidthReporteDinamico+90,iHeightReporteDinamico+90));
		
		this.jScrollPanelReporteDinamicoConstanteNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Constante Nomis"));			
	
		iPosXReporteDinamico=0;
		iPosYReporteDinamico=0;
		
		this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
		this.gridBagConstraintsConstanteNomi.gridy =iPosYReporteDinamico;
		this.gridBagConstraintsConstanteNomi.gridx =iPosXReporteDinamico;
		this.gridBagConstraintsConstanteNomi.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameReporteDinamicoConstanteNomi.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameReporteDinamicoConstanteNomi.getContentPane().setLayout(gridaBagLayoutReporteDinamicoPrincipalConstanteNomi);
		this.jInternalFrameReporteDinamicoConstanteNomi.getContentPane().add(this.jScrollPanelReporteDinamicoConstanteNomi, this.gridBagConstraintsConstanteNomi);				
	}
	*/
	
	
	
	/*
	public void cargarImportacionConstanteNomi() throws Exception {		
		
		int iWidthImportacion=350;
		int iHeightImportacion=250;//400;
				
		int iPosXImportacion=0;
		int iPosYImportacion=0;
		
		GridBagLayout gridaBagLayoutImportacionConstanteNomi = new GridBagLayout();
				
		//PANEL
		this.jPanelImportacionConstanteNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelImportacionConstanteNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
		this.jPanelImportacionConstanteNomi.setName("jPanelImportacionConstanteNomi"); 
		
		this.jPanelImportacionConstanteNomi.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionConstanteNomi.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jPanelImportacionConstanteNomi.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
	
		this.jPanelImportacionConstanteNomi.setLayout(gridaBagLayoutImportacionConstanteNomi);
		
		
		this.jInternalFrameImportacionConstanteNomi= new ImportacionJInternalFrame();
		//this.jInternalFrameImportacionConstanteNomi= new ImportacionJInternalFrame();
		
		this.jScrollPanelImportacionConstanteNomi = new JScrollPane();
			//PANEL_CONTROLES
			//this.jScrollColumnasSelectReporteConstanteNomi= new JScrollPane();
		
		//JINTERNAL FRAME
		this.jInternalFrameImportacionConstanteNomi.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionConstanteNomi.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionConstanteNomi.setTitle("REPORTE DINAMICO");
	    this.jInternalFrameImportacionConstanteNomi.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionConstanteNomi.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionConstanteNomi.setResizable(true);
	    this.jInternalFrameImportacionConstanteNomi.setClosable(true);
	    this.jInternalFrameImportacionConstanteNomi.setMaximizable(true);
		
		//JINTERNAL FRAME IMPORTACION
		this.jInternalFrameImportacionConstanteNomi.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	    this.jInternalFrameImportacionConstanteNomi.setjInternalFrameParent(this);
		
		this.jInternalFrameImportacionConstanteNomi.setTitle("IMPORTACION");
	    this.jInternalFrameImportacionConstanteNomi.setSize(iWidthImportacion+70,iHeightImportacion+100);		
		this.jInternalFrameImportacionConstanteNomi.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	    this.jInternalFrameImportacionConstanteNomi.setResizable(true);
	    this.jInternalFrameImportacionConstanteNomi.setClosable(true);
	    this.jInternalFrameImportacionConstanteNomi.setMaximizable(true);
		
		//SCROLL PANEL		
		this.jScrollPanelImportacionConstanteNomi.setMinimumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionConstanteNomi.setMaximumSize(new Dimension(iWidthImportacion,iHeightImportacion));
		this.jScrollPanelImportacionConstanteNomi.setPreferredSize(new Dimension(iWidthImportacion,iHeightImportacion));
		
		this.jScrollPanelImportacionConstanteNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Constante Nomis"));			
		
			
		
		//LABEL ARCHIVO IMPORTACION
		this.jLabelArchivoImportacionConstanteNomi = new JLabelMe();

		this.jLabelArchivoImportacionConstanteNomi.setText("ARCHIVO IMPORTACION");		
		this.jLabelArchivoImportacionConstanteNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionConstanteNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelArchivoImportacionConstanteNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
		this.gridBagConstraintsConstanteNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConstanteNomi.gridy = iPosYImportacion;		
		this.gridBagConstraintsConstanteNomi.gridx = iPosXImportacion++;
			
		this.jPanelImportacionConstanteNomi.add(this.jLabelArchivoImportacionConstanteNomi, this.gridBagConstraintsConstanteNomi);

		
		//BOTON ABRIR IMPORTACION
		this.jFileChooserImportacionConstanteNomi = new JFileChooser();		
		this.jFileChooserImportacionConstanteNomi.setToolTipText("ESCOGER ARCHIVO"+" "+ConstanteNomiConstantesFunciones.SCLASSWEBTITULO);
		
		this.jButtonAbrirImportacionConstanteNomi = new JButtonMe();
		this.jButtonAbrirImportacionConstanteNomi.setText("ESCOGER");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirImportacionConstanteNomi,"generar_importacion_button","ESCOGER");
		
		this.jButtonAbrirImportacionConstanteNomi.setToolTipText("Generar"+" "+ConstanteNomiConstantesFunciones.SCLASSWEBTITULO);
	
		this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
		this.gridBagConstraintsConstanteNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConstanteNomi.gridy = iPosYImportacion;
		this.gridBagConstraintsConstanteNomi.gridx = iPosXImportacion++;
							
		this.jPanelImportacionConstanteNomi.add(this.jButtonAbrirImportacionConstanteNomi, this.gridBagConstraintsConstanteNomi);
	
	
		//LABEL PATH IMPORTACION
		this.jLabelPathArchivoImportacionConstanteNomi = new JLabelMe();

		this.jLabelPathArchivoImportacionConstanteNomi.setText("PATH ARCHIVO");		
		this.jLabelPathArchivoImportacionConstanteNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionConstanteNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelPathArchivoImportacionConstanteNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));

		iPosXImportacion=0;
		iPosYImportacion++;		
		this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
		this.gridBagConstraintsConstanteNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConstanteNomi.gridy = iPosYImportacion;		
		this.gridBagConstraintsConstanteNomi.gridx = iPosXImportacion++;
			
		this.jPanelImportacionConstanteNomi.add(this.jLabelPathArchivoImportacionConstanteNomi, this.gridBagConstraintsConstanteNomi);

		//PATH IMPORTACION
		this.jTextFieldPathArchivoImportacionConstanteNomi=new JTextFieldMe();
		this.jTextFieldPathArchivoImportacionConstanteNomi.setMinimumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionConstanteNomi.setMaximumSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));
		this.jTextFieldPathArchivoImportacionConstanteNomi.setPreferredSize(new Dimension(150,Constantes.ISWING_ALTO_CONTROL));

		this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
		this.gridBagConstraintsConstanteNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConstanteNomi.gridy = iPosYImportacion;
		this.gridBagConstraintsConstanteNomi.gridx = iPosXImportacion++;
							
		this.jPanelImportacionConstanteNomi.add(this.jTextFieldPathArchivoImportacionConstanteNomi, this.gridBagConstraintsConstanteNomi);
		

		//BOTON IMPORTACION
		this.jButtonGenerarImportacionConstanteNomi = new JButtonMe();
		this.jButtonGenerarImportacionConstanteNomi.setText("IMPORTAR");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGenerarImportacionConstanteNomi,"generar_importacion_button","IMPORTAR");
		
		this.jButtonGenerarImportacionConstanteNomi.setToolTipText("Generar"+" "+ConstanteNomiConstantesFunciones.SCLASSWEBTITULO);
		
		iPosXImportacion=0;
		iPosYImportacion++;
		this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
		this.gridBagConstraintsConstanteNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConstanteNomi.gridy = iPosYImportacion;
		this.gridBagConstraintsConstanteNomi.gridx = iPosXImportacion++;
							
		this.jPanelImportacionConstanteNomi.add(this.jButtonGenerarImportacionConstanteNomi, this.gridBagConstraintsConstanteNomi);
					
		//BOTON CERRAR
		this.jButtonCerrarImportacionConstanteNomi = new JButtonMe();
		this.jButtonCerrarImportacionConstanteNomi.setText("Cancelar");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarImportacionConstanteNomi,"cerrar_reporte_dinamico_button","Cancelar");
		
		this.jButtonCerrarImportacionConstanteNomi.setToolTipText("Cancelar"+" "+ConstanteNomiConstantesFunciones.SCLASSWEBTITULO);
		
		this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
		this.gridBagConstraintsConstanteNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConstanteNomi.gridy = iPosYImportacion;
		this.gridBagConstraintsConstanteNomi.gridx = iPosXImportacion++;
							
		this.jPanelImportacionConstanteNomi.add(this.jButtonCerrarImportacionConstanteNomi, this.gridBagConstraintsConstanteNomi);
					
					
		//GLOBAL AGREGAR PANELES			
		GridBagLayout gridaBagLayoutImportacionPrincipalConstanteNomi = new GridBagLayout();
		
		this.jScrollPanelImportacionConstanteNomi= new JScrollPane(jPanelImportacionConstanteNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
				
		iPosXImportacion=0;
		iPosYImportacion=0;
		
		this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
		this.gridBagConstraintsConstanteNomi.gridy =iPosYImportacion;
		this.gridBagConstraintsConstanteNomi.gridx =iPosXImportacion;
		this.gridBagConstraintsConstanteNomi.fill = GridBagConstraints.BOTH;		
		
		this.jInternalFrameImportacionConstanteNomi.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
		this.jInternalFrameImportacionConstanteNomi.getContentPane().setLayout(gridaBagLayoutImportacionPrincipalConstanteNomi);
		this.jInternalFrameImportacionConstanteNomi.getContentPane().add(this.jScrollPanelImportacionConstanteNomi, this.gridBagConstraintsConstanteNomi);						
	}
	*/
	
	
	
	
	
	
	/*
	public void cargarOrderByConstanteNomi(Boolean cargaMinima) throws Exception {		
		String sMapKey = "";
		InputMap inputMap =null;
		
		int iWidthOrderBy=350;
		int iHeightOrderBy=300;//400;
				
		int iPosXOrderBy=0;
		int iPosYOrderBy=0;
		
		if(!cargaMinima) {
			this.jButtonAbrirOrderByConstanteNomi = new JButtonMe();
			this.jButtonAbrirOrderByConstanteNomi.setText("Orden");
			this.jButtonAbrirOrderByConstanteNomi.setToolTipText("Orden"+FuncionesSwing.getKeyMensaje("ORDEN"));
			
			FuncionesSwing.addImagenButtonGeneral(this.jButtonAbrirOrderByConstanteNomi,"orden_button","Orden");
			
			FuncionesSwing.setBoldButton(this.jButtonAbrirOrderByConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			sMapKey = "AbrirOrderByConstanteNomi";
			inputMap = this.jButtonAbrirOrderByConstanteNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
			inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ORDEN") , FuncionesSwing.getMaskKey("ORDEN")), sMapKey);
				
			this.jButtonAbrirOrderByConstanteNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"AbrirOrderByConstanteNomi"));
		
		
			GridBagLayout gridaBagLayoutOrderByConstanteNomi = new GridBagLayout();
					
			//PANEL
			this.jPanelOrderByConstanteNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
			this.jPanelOrderByConstanteNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
			this.jPanelOrderByConstanteNomi.setName("jPanelOrderByConstanteNomi"); 
			
			this.jPanelOrderByConstanteNomi.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByConstanteNomi.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jPanelOrderByConstanteNomi.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldPanel(this.jPanelOrderByConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jPanelOrderByConstanteNomi.setLayout(gridaBagLayoutOrderByConstanteNomi);
			
			
			this.jTableDatosConstanteNomiOrderBy = new JTableMe();        
			this.jTableDatosConstanteNomiOrderBy.setAutoCreateRowSorter(true);		
			
			FuncionesSwing.setBoldTable(jTableDatosConstanteNomiOrderBy,STIPO_TAMANIO_GENERAL,false,true,this);
		
			
			this.jScrollPanelDatosConstanteNomiOrderBy = new JScrollPane();
		
			this.jScrollPanelDatosConstanteNomiOrderBy.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden"));		
		
			this.jScrollPanelDatosConstanteNomiOrderBy.setViewportView(this.jTableDatosConstanteNomiOrderBy);
			this.jTableDatosConstanteNomiOrderBy.setFillsViewportHeight(true);
			this.jTableDatosConstanteNomiOrderBy.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
			this.jInternalFrameOrderByConstanteNomi= new OrderByJInternalFrame();
			this.jInternalFrameOrderByConstanteNomi= new OrderByJInternalFrame();
			this.jScrollPanelOrderByConstanteNomi = new JScrollPane();
				//PANEL_CONTROLES
				//this.jScrollColumnasSelectReporteConstanteNomi= new JScrollPane();
			
			//JINTERNAL FRAME OrderBy
			this.jInternalFrameOrderByConstanteNomi.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			this.jInternalFrameOrderByConstanteNomi.setjInternalFrameParent(this);
			
			this.jInternalFrameOrderByConstanteNomi.setTitle("Orden");
			this.jInternalFrameOrderByConstanteNomi.setSize(iWidthOrderBy+70,iHeightOrderBy+100);		
			this.jInternalFrameOrderByConstanteNomi.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
				
			this.jInternalFrameOrderByConstanteNomi.setResizable(true);
			this.jInternalFrameOrderByConstanteNomi.setClosable(true);
			this.jInternalFrameOrderByConstanteNomi.setMaximizable(true);
			
			//FuncionesSwing.setBoldPanel(this.jInternalFrameOrderByConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			//SCROLL PANEL		
			this.jScrollPanelOrderByConstanteNomi.setMinimumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByConstanteNomi.setMaximumSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			this.jScrollPanelOrderByConstanteNomi.setPreferredSize(new Dimension(iWidthOrderBy,iHeightOrderBy));
			
			FuncionesSwing.setBoldScrollPanel(this.jScrollPanelOrderByConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.jScrollPanelOrderByConstanteNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Constante Nomis"));			
						
			//DATOS TOTALES
			
			this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
			this.gridBagConstraintsConstanteNomi.gridy =iPosYOrderBy++;
			this.gridBagConstraintsConstanteNomi.gridx =iPosXOrderBy;
			this.gridBagConstraintsConstanteNomi.fill = GridBagConstraints.BOTH;		
						//this.gridBagConstraintsConstanteNomi.ipady =150;
				
			this.jPanelOrderByConstanteNomi.add(jScrollPanelDatosConstanteNomiOrderBy, this.gridBagConstraintsConstanteNomi);//this.jTableDatosConstanteNomiTotales			
			
			//BOTON CERRAR
			this.jButtonCerrarOrderByConstanteNomi = new JButtonMe();
			this.jButtonCerrarOrderByConstanteNomi.setText("Salir");
			FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarOrderByConstanteNomi,"cerrar","Salir");//cerrar_reporte_dinamico_button
			
			this.jButtonCerrarOrderByConstanteNomi.setToolTipText("Cancelar"+" "+ConstanteNomiConstantesFunciones.SCLASSWEBTITULO);
			
			FuncionesSwing.setBoldButton(this.jButtonCerrarOrderByConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
			this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
			this.gridBagConstraintsConstanteNomi.fill = GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConstanteNomi.gridy = iPosYOrderBy++;
			this.gridBagConstraintsConstanteNomi.gridx = iPosXOrderBy;
									
			this.jPanelOrderByConstanteNomi.add(this.jButtonCerrarOrderByConstanteNomi, this.gridBagConstraintsConstanteNomi);
						
						
			//GLOBAL AGREGAR PANELES			
			GridBagLayout gridaBagLayoutOrderByPrincipalConstanteNomi = new GridBagLayout();
			
			this.jScrollPanelOrderByConstanteNomi= new JScrollPane(jPanelOrderByConstanteNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
					
			iPosXOrderBy=0;
			iPosYOrderBy=0;
			
			this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
			this.gridBagConstraintsConstanteNomi.gridy =iPosYOrderBy;
			this.gridBagConstraintsConstanteNomi.gridx =iPosXOrderBy;
			this.gridBagConstraintsConstanteNomi.fill = GridBagConstraints.BOTH;		
			
			this.jInternalFrameOrderByConstanteNomi.setContentPane(new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true));
			this.jInternalFrameOrderByConstanteNomi.getContentPane().setLayout(gridaBagLayoutOrderByPrincipalConstanteNomi);
			
			this.jInternalFrameOrderByConstanteNomi.getContentPane().add(this.jScrollPanelOrderByConstanteNomi, this.gridBagConstraintsConstanteNomi);			
		
		} else {
			this.jButtonAbrirOrderByConstanteNomi = new JButtonMe();
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
		iWidthTableCalculado+=630;
		
		//ANCHO COLUMNAS OCULTAS
		if(Constantes.ISDEVELOPING) {
			iWidthTableCalculado+=600;
		}
		
		//ANCHO COLUMNAS RELACIONES
		iWidthTableCalculado+=100;
		
		//ESPACION PARA SELECT RELACIONES
		if(this.conMaximoRelaciones 
			&& this.constantenomiSessionBean.getConGuardarRelaciones()
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
		int iCountColumns=this.jTableDatosConstanteNomi.getColumnModel().getColumnCount();
		
		if(iCountColumns>0) {
			for(int i = 0; i < this.jTableDatosConstanteNomi.getColumnModel().getColumnCount(); i++) { 
				TableColumn column = this.jTableDatosConstanteNomi.getColumnModel().getColumn(i); 						
				iWidthColumn=column.getWidth();
				
				iTotalWidth+=iWidthColumn;
			}
			
			//iWidthTableCalculado=iTotalWidth;
		}
		*/
		
		if(iTamanioFilaTabla<=0) {
			iTamanioFilaTabla=this.jTableDatosConstanteNomi.getRowHeight();//ConstanteNomiConstantesFunciones.ITAMANIOFILATABLA;
		}
		
		if(iNumFilas>0) {
			iHeightTable=(iNumFilas * iTamanioFilaTabla);
		} else {
			iHeightTable=iTamanioFilaTabla;
		}
		
		iHeightTableTotal=iHeightTable;
		
		if(!this.constantenomiSessionBean.getEsGuardarRelacionado()) {			
			if(iHeightTable > ConstanteNomiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaConstanteNomi.isSelected()) {
					iHeightTable=ConstanteNomiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ConstanteNomiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ConstanteNomiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOS; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
			
		} else {
			if(iHeightTable > ConstanteNomiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL) { //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS) {
				//SI SE SELECCIONA MAXIMO TABLA SE AMPLIA A ALTO MAXIMO DE SCROLL, PARA QUE SCROLL NO SEA TAN PEQUE?O
				
				if(!this.jCheckBoxConAltoMaximoTablaConstanteNomi.isSelected()) {
					iHeightTable=ConstanteNomiConstantesFunciones.TAMANIO_ALTO_MAXIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMAXIMO_TABLADATOS;
				} else {
				
					iHeightTable=iHeightTableTotal + FuncionesSwing.getValorProporcion(iHeightTableTotal,30);
				}
			} else {
				if(iHeightTable < ConstanteNomiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL) {//Constantes.ISWING_TAMANIOMINIMO_TABLADATOS) {
					iHeightTable=ConstanteNomiConstantesFunciones.TAMANIO_ALTO_MINIMO_TABLADATOSREL; //Constantes.ISWING_TAMANIOMINIMO_TABLADATOS;
				}
			}
		}
		
		//OJO:SE DESHABILITA CALCULADO
		//NO SE UTILIZA CALCULADO SI POR DEFINICION
		if(iWidthTableDefinicion>0) {
			iWidthTableCalculado=iWidthTableDefinicion;
		}
		
		this.jTableDatosConstanteNomi.setMinimumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosConstanteNomi.setMaximumSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));
		this.jTableDatosConstanteNomi.setPreferredSize(new Dimension(iWidthTableCalculado,iHeightTableTotal));//iWidthTable
		
		this.jScrollPanelDatosConstanteNomi.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosConstanteNomi.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		this.jScrollPanelDatosConstanteNomi.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
			
		
		
		//ORDER BY
		//OrderBy
		
										
		int iHeightTableOrderBy=0;		
		int iNumFilasOrderBy=this.arrOrderBy.size();
		
		int iTamanioFilaTablaOrderBy=0;
				
		if(this.jInternalFrameOrderByConstanteNomi!=null && this.jInternalFrameOrderByConstanteNomi.getjTableDatosOrderBy()!=null) {
			//if(!this.constantenomiSessionBean.getEsGuardarRelacionado()) {					
			
			iTamanioFilaTablaOrderBy=this.jInternalFrameOrderByConstanteNomi.getjTableDatosOrderBy().getRowHeight();
			
			
			if(iNumFilasOrderBy>0) {			
				iHeightTableOrderBy=iNumFilasOrderBy * iTamanioFilaTablaOrderBy;
			} else {
				iHeightTableOrderBy=iTamanioFilaTablaOrderBy;
			}
			
			this.jInternalFrameOrderByConstanteNomi.getjTableDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTableCalculado/4
			this.jInternalFrameOrderByConstanteNomi.getjTableDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));
			this.jInternalFrameOrderByConstanteNomi.getjTableDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY,iHeightTableOrderBy));//iWidthTable
				
			this.jInternalFrameOrderByConstanteNomi.getjScrollPanelDatosOrderBy().setMinimumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));//iHeightTableOrderBy,iWidthTableScroll
			this.jInternalFrameOrderByConstanteNomi.getjScrollPanelDatosOrderBy().setMaximumSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
			this.jInternalFrameOrderByConstanteNomi.getjScrollPanelDatosOrderBy().setPreferredSize(new Dimension(Constantes2.ISWING_TAMANIO_ANCHO_TABLADATOS_ORDERBY+30,Constantes2.ISWING_TAMANIO_ALTO_TABLADATOS_ORDERBY));
		}		
		

		//ORDER BY
		
		//this.jScrollPanelDatosConstanteNomi.setMinimumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosConstanteNomi.setMaximumSize(new Dimension(iWidthTableScroll,iHeightTable));
		//this.jScrollPanelDatosConstanteNomi.setPreferredSize(new Dimension(iWidthTableScroll,iHeightTable));
				
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
			iSizeTabla=constantenomiLogic.getConstanteNomis().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=constantenomis.size();
		}
		//ARCHITECTURE
												
		this.redimensionarTablaDatos(iSizeTabla,iTamanioFilaTabla);
	}
	
	
	
	
	
	//PARA REPORTES
	public static List<ConstanteNomi> TraerConstanteNomiBeans(List<ConstanteNomi> constantenomis,ArrayList<Classe> classes)throws Exception {
		try {
			for(ConstanteNomi constantenomi:constantenomis) {
					
				if(!(ConstanteNomiConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO)
						  || ConstanteNomiConstantesFunciones.S_TIPOREPORTE_EXTRA.equals(Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO)) 
				   ) {
					
					constantenomi.setsDetalleGeneralEntityReporte(ConstanteNomiConstantesFunciones.getConstanteNomiDescripcion(constantenomi));
										
					constantenomi.setes_para_pregunta_descripcion(ConstanteNomiConstantesFunciones.getes_para_preguntaDescripcion(constantenomi));	
					
					

					if(constantenomi.getEmpleadoConstantes()!=null && Funciones.existeClass(classes,EmpleadoConstante.class)) {
						try{constantenomi.setempleadoconstantesDescripcionReporte(new JRBeanCollectionDataSource(EmpleadoConstanteJInternalFrame.TraerEmpleadoConstanteBeans(constantenomi.getEmpleadoConstantes(),classes)));}catch(Exception e){e.printStackTrace();}
					}	
					
				} else  {
							
					//constantenomi.setsDetalleGeneralEntityReporte(constantenomi.getsDetalleGeneralEntityReporte());
										
				}
				
				//constantenomibeans.add(constantenomibean);
			}
		} catch(Exception ex) {
			throw ex;
		}
		
		return constantenomis;
    }
	//PARA REPORTES FIN
}
