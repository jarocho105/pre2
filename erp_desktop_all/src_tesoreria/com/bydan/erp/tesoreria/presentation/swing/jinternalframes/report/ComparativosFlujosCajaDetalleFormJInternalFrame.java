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
package com.bydan.erp.tesoreria.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.tesoreria.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.tesoreria.business.entity.report.*;
import com.bydan.erp.tesoreria.util.report.ComparativosFlujosCajaConstantesFunciones;

import com.bydan.erp.tesoreria.business.logic.report.*;
import com.bydan.framework.erp.business.entity.DatoGeneral;
import com.bydan.framework.erp.business.entity.OrderBy;
import com.bydan.framework.erp.business.entity.Mensajes;
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
public class ComparativosFlujosCajaDetalleFormJInternalFrame extends ComparativosFlujosCajaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleComparativosFlujosCaja;
	
	protected JMenuBar jmenuBarDetalleComparativosFlujosCaja;
	
	protected JMenu jmenuDetalleComparativosFlujosCaja;
	protected JMenu jmenuDetalleArchivoComparativosFlujosCaja;
	protected JMenu jmenuDetalleAccionesComparativosFlujosCaja;
	protected JMenu jmenuDetalleDatosComparativosFlujosCaja;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleComparativosFlujosCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutComparativosFlujosCaja;	
	protected GridBagConstraints gridBagConstraintsComparativosFlujosCaja;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ComparativosFlujosCajaBeanSwingJInternalFrameAdditional jInternalFrameDetalleComparativosFlujosCaja;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";
	
	public ComparativosFlujosCajaSessionBean comparativosflujoscajaSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;	
	
	public ComparativosFlujosCajaLogic comparativosflujoscajaLogic;
	
	public JScrollPane jScrollPanelDatosComparativosFlujosCaja;
	public JScrollPane jScrollPanelDatosEdicionComparativosFlujosCaja;
	public JScrollPane jScrollPanelDatosGeneralComparativosFlujosCaja;
	
	protected JPanel jPanelCamposComparativosFlujosCaja;    
	protected JPanel jPanelCamposOcultosComparativosFlujosCaja;    	
	protected JPanel jPanelAccionesComparativosFlujosCaja;
	protected JPanel jPanelAccionesFormularioComparativosFlujosCaja;
    
	
	
	protected Integer iXPanelCamposComparativosFlujosCaja=0;
	protected Integer iYPanelCamposComparativosFlujosCaja=0;
	
	protected Integer iXPanelCamposOcultosComparativosFlujosCaja=0;
	protected Integer iYPanelCamposOcultosComparativosFlujosCaja=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoComparativosFlujosCaja;
	public JButton jButtonModificarComparativosFlujosCaja;
	public JButton jButtonActualizarComparativosFlujosCaja;
    public JButton jButtonEliminarComparativosFlujosCaja;
	public JButton jButtonCancelarComparativosFlujosCaja;
    public JButton jButtonGuardarCambiosComparativosFlujosCaja;
	public JButton jButtonGuardarCambiosTablaComparativosFlujosCaja;
	protected JButton jButtonCerrarComparativosFlujosCaja;
	
	
	protected JButton jButtonProcesarInformacionComparativosFlujosCaja;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoComparativosFlujosCaja;
	protected JCheckBox jCheckBoxPostAccionSinCerrarComparativosFlujosCaja;
	protected JCheckBox jCheckBoxPostAccionSinMensajeComparativosFlujosCaja;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarComparativosFlujosCaja;
	protected JButton jButtonModificarToolBarComparativosFlujosCaja;
	protected JButton jButtonActualizarToolBarComparativosFlujosCaja;
    protected JButton jButtonEliminarToolBarComparativosFlujosCaja;
	protected JButton jButtonCancelarToolBarComparativosFlujosCaja;
    protected JButton jButtonGuardarCambiosToolBarComparativosFlujosCaja;
	protected JButton jButtonGuardarCambiosTablaToolBarComparativosFlujosCaja;
	protected JButton jButtonMostrarOcultarTablaToolBarComparativosFlujosCaja;
	protected JButton jButtonCerrarToolBarComparativosFlujosCaja;
	
	protected JButton jButtonProcesarInformacionToolBarComparativosFlujosCaja;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoComparativosFlujosCaja;
	protected JMenuItem jMenuItemModificarComparativosFlujosCaja;
	protected JMenuItem jMenuItemActualizarComparativosFlujosCaja;
    protected JMenuItem jMenuItemEliminarComparativosFlujosCaja;
	protected JMenuItem jMenuItemCancelarComparativosFlujosCaja;
    protected JMenuItem jMenuItemGuardarCambiosComparativosFlujosCaja;
	protected JMenuItem jMenuItemGuardarCambiosTablaComparativosFlujosCaja;
	protected JMenuItem jMenuItemCerrarComparativosFlujosCaja;
	protected JMenuItem jMenuItemDetalleCerrarComparativosFlujosCaja;
	protected JMenuItem jMenuItemDetalleMostarOcultarComparativosFlujosCaja;
	
	protected JMenuItem jMenuItemProcesarInformacionComparativosFlujosCaja;
	protected JMenuItem jMenuItemNuevoGuardarCambiosComparativosFlujosCaja;
	protected JMenuItem jMenuItemMostrarOcultarComparativosFlujosCaja;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesComparativosFlujosCaja;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesComparativosFlujosCaja;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesComparativosFlujosCaja;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioComparativosFlujosCaja;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidComparativosFlujosCaja;
	public JLabel jLabelIdComparativosFlujosCaja;
	public JLabel jLabelidComparativosFlujosCaja;
	public JButton jButtonidComparativosFlujosCajaBusqueda= new JButtonMe();

	public JPanel jPanelnombre_centro_actividadComparativosFlujosCaja;
	public JLabel jLabelnombre_centro_actividadComparativosFlujosCaja;
	public JTextArea jTextAreanombre_centro_actividadComparativosFlujosCaja;
	public JScrollPane jscrollPanenombre_centro_actividadComparativosFlujosCaja;
	public JButton jButtonnombre_centro_actividadComparativosFlujosCajaBusqueda= new JButtonMe();

	public JPanel jPaneltipo_movimientoComparativosFlujosCaja;
	public JLabel jLabeltipo_movimientoComparativosFlujosCaja;
	public JTextArea jTextAreatipo_movimientoComparativosFlujosCaja;
	public JScrollPane jscrollPanetipo_movimientoComparativosFlujosCaja;
	public JButton jButtontipo_movimientoComparativosFlujosCajaBusqueda= new JButtonMe();

	public JPanel jPanelsaldo_actualComparativosFlujosCaja;
	public JLabel jLabelsaldo_actualComparativosFlujosCaja;
	public JTextField jTextFieldsaldo_actualComparativosFlujosCaja;
	public JButton jButtonsaldo_actualComparativosFlujosCajaBusqueda= new JButtonMe();

	public JPanel jPanelsaldo_acumuladoComparativosFlujosCaja;
	public JLabel jLabelsaldo_acumuladoComparativosFlujosCaja;
	public JTextField jTextFieldsaldo_acumuladoComparativosFlujosCaja;
	public JButton jButtonsaldo_acumuladoComparativosFlujosCajaBusqueda= new JButtonMe();

	public JPanel jPanelsaldo_pres_actualComparativosFlujosCaja;
	public JLabel jLabelsaldo_pres_actualComparativosFlujosCaja;
	public JTextField jTextFieldsaldo_pres_actualComparativosFlujosCaja;
	public JButton jButtonsaldo_pres_actualComparativosFlujosCajaBusqueda= new JButtonMe();

	public JPanel jPanelsaldo_pres_acumuladoComparativosFlujosCaja;
	public JLabel jLabelsaldo_pres_acumuladoComparativosFlujosCaja;
	public JTextField jTextFieldsaldo_pres_acumuladoComparativosFlujosCaja;
	public JButton jButtonsaldo_pres_acumuladoComparativosFlujosCajaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaComparativosFlujosCaja;
	public JLabel jLabelid_empresaComparativosFlujosCaja;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaComparativosFlujosCaja;
	public JButton jButtonid_empresaComparativosFlujosCaja= new JButtonMe();
	public JButton jButtonid_empresaComparativosFlujosCajaUpdate= new JButtonMe();
	public JButton jButtonid_empresaComparativosFlujosCajaBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioComparativosFlujosCaja;
	public JLabel jLabelid_ejercicioComparativosFlujosCaja;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioComparativosFlujosCaja;
	public JButton jButtonid_ejercicioComparativosFlujosCaja= new JButtonMe();
	public JButton jButtonid_ejercicioComparativosFlujosCajaUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioComparativosFlujosCajaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesComparativosFlujosCaja;
	
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	//LOS DATOS DE NUEVO Y EDICION ACTUAL APARECEN EN OTRA VENTANA(true) O NO(false)
	public static Boolean CON_DATOS_FRAME=true;
	
	public static Boolean ISBINDING_MANUAL=true;
	public static Boolean ISLOAD_FKLOTE=false;
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
		
	public int iWidthFormulario=450;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightFormulario=594;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ComparativosFlujosCajaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposComparativosFlujosCaja=new JPanel();
				this.jPanelAccionesFormularioComparativosFlujosCaja=new JPanel();
				this.jmenuBarDetalleComparativosFlujosCaja=new JMenuBar();
				this.jTtoolBarDetalleComparativosFlujosCaja=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ComparativosFlujosCajaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ComparativosFlujosCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ComparativosFlujosCajaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ComparativosFlujosCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ComparativosFlujosCajaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ComparativosFlujosCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ComparativosFlujosCajaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ComparativosFlujosCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ComparativosFlujosCajaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ComparativosFlujosCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			
			long start_time=0;
			long end_time=0;
			
			if(Constantes2.ISDEVELOPING2) {
				start_time = System.currentTimeMillis();
			}

			this.initialize(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
			
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
	
	
	public JButton getjButtonActualizarToolBarComparativosFlujosCaja() {
		return this.jButtonActualizarToolBarComparativosFlujosCaja;
	}
	
	public JButton getjButtonEliminarToolBarComparativosFlujosCaja() {
		return this.jButtonEliminarToolBarComparativosFlujosCaja;
	}
	
	public JButton getjButtonCancelarToolBarComparativosFlujosCaja() {
		return this.jButtonCancelarToolBarComparativosFlujosCaja;
	}		
	
	public JButton getjButtonProcesarInformacionComparativosFlujosCaja() {
		return this.jButtonProcesarInformacionComparativosFlujosCaja;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionComparativosFlujosCaja)	{
		this.jButtonProcesarInformacionComparativosFlujosCaja = jButtonProcesarInformacionComparativosFlujosCaja;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesComparativosFlujosCaja() {
		return this.jComboBoxTiposAccionesComparativosFlujosCaja;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesComparativosFlujosCaja(
			JComboBox jComboBoxTiposRelacionesComparativosFlujosCaja) {
		this.jComboBoxTiposRelacionesComparativosFlujosCaja = jComboBoxTiposRelacionesComparativosFlujosCaja;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesComparativosFlujosCaja(
			JComboBox jComboBoxTiposAccionesComparativosFlujosCaja) {
		this.jComboBoxTiposAccionesComparativosFlujosCaja = jComboBoxTiposAccionesComparativosFlujosCaja;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioComparativosFlujosCaja() {
		return this.jComboBoxTiposAccionesFormularioComparativosFlujosCaja;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioComparativosFlujosCaja(
			JComboBox jComboBoxTiposAccionesFormularioComparativosFlujosCaja) {
		this.jComboBoxTiposAccionesFormularioComparativosFlujosCaja = jComboBoxTiposAccionesFormularioComparativosFlujosCaja;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.comparativosflujoscajaSessionBean=new ComparativosFlujosCajaSessionBean();
		
		this.comparativosflujoscajaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.comparativosflujoscajaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.comparativosflujoscajaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ComparativosFlujosCajaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ComparativosFlujosCajaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ComparativosFlujosCajaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Comparativos Flujos Caja MANTENIMIENTO"));
		
		
		if(iWidth > 850) {
			iWidth=850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.comparativosflujoscajaSessionBean.getEsGuardarRelacionado()) {
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
	
		ComparativosFlujosCajaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleComparativosFlujosCaja= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarComparativosFlujosCaja=new JButtonMe();
				this.jButtonModificarToolBarComparativosFlujosCaja=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarComparativosFlujosCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarComparativosFlujosCaja,this.jTtoolBarDetalleComparativosFlujosCaja,
							"actualizar","actualizar","Actualizar"+" "+ComparativosFlujosCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarComparativosFlujosCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarComparativosFlujosCaja,this.jTtoolBarDetalleComparativosFlujosCaja,
							"eliminar","eliminar","Eliminar"+" "+ComparativosFlujosCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarComparativosFlujosCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarComparativosFlujosCaja,this.jTtoolBarDetalleComparativosFlujosCaja,
							"cancelar","cancelar","Cancelar"+" "+ComparativosFlujosCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarComparativosFlujosCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarComparativosFlujosCaja,this.jTtoolBarDetalleComparativosFlujosCaja,
							"guardarcambios","guardarcambios","Guardar"+" "+ComparativosFlujosCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarComparativosFlujosCaja,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarComparativosFlujosCaja,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarComparativosFlujosCaja,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleComparativosFlujosCaja=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleComparativosFlujosCaja=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoComparativosFlujosCaja=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesComparativosFlujosCaja=new JMenuMe("Acciones");
		this.jmenuDetalleDatosComparativosFlujosCaja=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoComparativosFlujosCaja= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoComparativosFlujosCaja.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoComparativosFlujosCaja,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoComparativosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarComparativosFlujosCaja= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarComparativosFlujosCaja.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarComparativosFlujosCaja,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarComparativosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarComparativosFlujosCaja= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarComparativosFlujosCaja.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarComparativosFlujosCaja,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarComparativosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarComparativosFlujosCaja= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarComparativosFlujosCaja.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarComparativosFlujosCaja,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarComparativosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarComparativosFlujosCaja= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarComparativosFlujosCaja.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarComparativosFlujosCaja,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarComparativosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosComparativosFlujosCaja= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosComparativosFlujosCaja.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosComparativosFlujosCaja,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosComparativosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarComparativosFlujosCaja= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarComparativosFlujosCaja.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarComparativosFlujosCaja,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarComparativosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarComparativosFlujosCaja= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarComparativosFlujosCaja.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarComparativosFlujosCaja,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarComparativosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarComparativosFlujosCaja= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarComparativosFlujosCaja.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarComparativosFlujosCaja,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarComparativosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarComparativosFlujosCaja= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarComparativosFlujosCaja.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarComparativosFlujosCaja,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarComparativosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoComparativosFlujosCaja.add(this.jMenuItemDetalleCerrarComparativosFlujosCaja);
		
		this.jmenuDetalleAccionesComparativosFlujosCaja.add(this.jMenuItemActualizarComparativosFlujosCaja);
		this.jmenuDetalleAccionesComparativosFlujosCaja.add(this.jMenuItemEliminarComparativosFlujosCaja);
		this.jmenuDetalleAccionesComparativosFlujosCaja.add(this.jMenuItemCancelarComparativosFlujosCaja);		
		
		//this.jmenuDetalleDatosComparativosFlujosCaja.add(this.jMenuItemDetalleAbrirOrderByComparativosFlujosCaja);				
		this.jmenuDetalleDatosComparativosFlujosCaja.add(this.jMenuItemDetalleMostarOcultarComparativosFlujosCaja);				
				
		//this.jmenuDetalleAccionesComparativosFlujosCaja.add(this.jMenuItemGuardarCambiosComparativosFlujosCaja);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoComparativosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesComparativosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosComparativosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleComparativosFlujosCaja.add(this.jmenuDetalleArchivoComparativosFlujosCaja);		
		this.jmenuBarDetalleComparativosFlujosCaja.add(this.jmenuDetalleAccionesComparativosFlujosCaja);		
		this.jmenuBarDetalleComparativosFlujosCaja.add(this.jmenuDetalleDatosComparativosFlujosCaja);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleComparativosFlujosCaja);				
	}
	
	
	public void inicializarElementosCamposComparativosFlujosCaja() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdComparativosFlujosCaja = new JLabelMe();
		jLabelIdComparativosFlujosCaja.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdComparativosFlujosCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdComparativosFlujosCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdComparativosFlujosCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdComparativosFlujosCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidComparativosFlujosCaja = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidComparativosFlujosCaja.setToolTipText(ComparativosFlujosCajaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutComparativosFlujosCaja= new GridBagLayout();

		this.jPanelidComparativosFlujosCaja.setLayout(this.gridaBagLayoutComparativosFlujosCaja);

		jLabelidComparativosFlujosCaja = new JLabel();
		jLabelidComparativosFlujosCaja.setText("Id");

		jLabelidComparativosFlujosCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidComparativosFlujosCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidComparativosFlujosCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombre_centro_actividadComparativosFlujosCaja = new JLabelMe();
		this.jLabelnombre_centro_actividadComparativosFlujosCaja.setText(""+ComparativosFlujosCajaConstantesFunciones.LABEL_NOMBRECENTROACTIVIDAD+" : *");
		this.jLabelnombre_centro_actividadComparativosFlujosCaja.setToolTipText("Nombre Centro Activad");
		this.jLabelnombre_centro_actividadComparativosFlujosCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_centro_actividadComparativosFlujosCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_centro_actividadComparativosFlujosCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_centro_actividadComparativosFlujosCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_centro_actividadComparativosFlujosCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_centro_actividadComparativosFlujosCaja.setToolTipText(ComparativosFlujosCajaConstantesFunciones.LABEL_NOMBRECENTROACTIVIDAD);
		this.gridaBagLayoutComparativosFlujosCaja = new GridBagLayout();
		this.jPanelnombre_centro_actividadComparativosFlujosCaja.setLayout(this.gridaBagLayoutComparativosFlujosCaja);


		jTextAreanombre_centro_actividadComparativosFlujosCaja= new JTextAreaMe();
		jTextAreanombre_centro_actividadComparativosFlujosCaja.setEnabled(false);
		jTextAreanombre_centro_actividadComparativosFlujosCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_centro_actividadComparativosFlujosCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_centro_actividadComparativosFlujosCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_centro_actividadComparativosFlujosCaja.setLineWrap(true);
		jTextAreanombre_centro_actividadComparativosFlujosCaja.setWrapStyleWord(true);
		jTextAreanombre_centro_actividadComparativosFlujosCaja.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_centro_actividadComparativosFlujosCaja.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_centro_actividadComparativosFlujosCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_centro_actividadComparativosFlujosCaja = new JScrollPane(jTextAreanombre_centro_actividadComparativosFlujosCaja);
		jscrollPanenombre_centro_actividadComparativosFlujosCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_centro_actividadComparativosFlujosCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_centro_actividadComparativosFlujosCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_centro_actividadComparativosFlujosCajaBusqueda= new JButtonMe();
		this.jButtonnombre_centro_actividadComparativosFlujosCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_centro_actividadComparativosFlujosCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_centro_actividadComparativosFlujosCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_centro_actividadComparativosFlujosCajaBusqueda.setText("U");
		this.jButtonnombre_centro_actividadComparativosFlujosCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_centro_actividadComparativosFlujosCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_centro_actividadComparativosFlujosCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_centro_actividadComparativosFlujosCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_centro_actividadComparativosFlujosCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_centro_actividadComparativosFlujosCajaBusqueda"));

		if(this.comparativosflujoscajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_centro_actividadComparativosFlujosCajaBusqueda.setVisible(false);		}


					
		this.jLabeltipo_movimientoComparativosFlujosCaja = new JLabelMe();
		this.jLabeltipo_movimientoComparativosFlujosCaja.setText(""+ComparativosFlujosCajaConstantesFunciones.LABEL_TIPOMOVIMIENTO+" : *");
		this.jLabeltipo_movimientoComparativosFlujosCaja.setToolTipText("Tipo Movimiento");
		this.jLabeltipo_movimientoComparativosFlujosCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltipo_movimientoComparativosFlujosCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltipo_movimientoComparativosFlujosCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeltipo_movimientoComparativosFlujosCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltipo_movimientoComparativosFlujosCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltipo_movimientoComparativosFlujosCaja.setToolTipText(ComparativosFlujosCajaConstantesFunciones.LABEL_TIPOMOVIMIENTO);
		this.gridaBagLayoutComparativosFlujosCaja = new GridBagLayout();
		this.jPaneltipo_movimientoComparativosFlujosCaja.setLayout(this.gridaBagLayoutComparativosFlujosCaja);


		jTextAreatipo_movimientoComparativosFlujosCaja= new JTextAreaMe();
		jTextAreatipo_movimientoComparativosFlujosCaja.setEnabled(false);
		jTextAreatipo_movimientoComparativosFlujosCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatipo_movimientoComparativosFlujosCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatipo_movimientoComparativosFlujosCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatipo_movimientoComparativosFlujosCaja.setLineWrap(true);
		jTextAreatipo_movimientoComparativosFlujosCaja.setWrapStyleWord(true);
		jTextAreatipo_movimientoComparativosFlujosCaja.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreatipo_movimientoComparativosFlujosCaja.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreatipo_movimientoComparativosFlujosCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanetipo_movimientoComparativosFlujosCaja = new JScrollPane(jTextAreatipo_movimientoComparativosFlujosCaja);
		jscrollPanetipo_movimientoComparativosFlujosCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanetipo_movimientoComparativosFlujosCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanetipo_movimientoComparativosFlujosCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtontipo_movimientoComparativosFlujosCajaBusqueda= new JButtonMe();
		this.jButtontipo_movimientoComparativosFlujosCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontipo_movimientoComparativosFlujosCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontipo_movimientoComparativosFlujosCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontipo_movimientoComparativosFlujosCajaBusqueda.setText("U");
		this.jButtontipo_movimientoComparativosFlujosCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontipo_movimientoComparativosFlujosCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontipo_movimientoComparativosFlujosCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreatipo_movimientoComparativosFlujosCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreatipo_movimientoComparativosFlujosCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"tipo_movimientoComparativosFlujosCajaBusqueda"));

		if(this.comparativosflujoscajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontipo_movimientoComparativosFlujosCajaBusqueda.setVisible(false);		}


					
		this.jLabelsaldo_actualComparativosFlujosCaja = new JLabelMe();
		this.jLabelsaldo_actualComparativosFlujosCaja.setText(""+ComparativosFlujosCajaConstantesFunciones.LABEL_SALDOACTUAL+" : *");
		this.jLabelsaldo_actualComparativosFlujosCaja.setToolTipText("Saldo Actual");
		this.jLabelsaldo_actualComparativosFlujosCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsaldo_actualComparativosFlujosCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsaldo_actualComparativosFlujosCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsaldo_actualComparativosFlujosCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsaldo_actualComparativosFlujosCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsaldo_actualComparativosFlujosCaja.setToolTipText(ComparativosFlujosCajaConstantesFunciones.LABEL_SALDOACTUAL);
		this.gridaBagLayoutComparativosFlujosCaja = new GridBagLayout();
		this.jPanelsaldo_actualComparativosFlujosCaja.setLayout(this.gridaBagLayoutComparativosFlujosCaja);


		jTextFieldsaldo_actualComparativosFlujosCaja= new JTextFieldMe();
		jTextFieldsaldo_actualComparativosFlujosCaja.setEnabled(false);
		jTextFieldsaldo_actualComparativosFlujosCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsaldo_actualComparativosFlujosCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsaldo_actualComparativosFlujosCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsaldo_actualComparativosFlujosCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldsaldo_actualComparativosFlujosCaja.setText("0.0");

		this.jButtonsaldo_actualComparativosFlujosCajaBusqueda= new JButtonMe();
		this.jButtonsaldo_actualComparativosFlujosCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsaldo_actualComparativosFlujosCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsaldo_actualComparativosFlujosCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsaldo_actualComparativosFlujosCajaBusqueda.setText("U");
		this.jButtonsaldo_actualComparativosFlujosCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsaldo_actualComparativosFlujosCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsaldo_actualComparativosFlujosCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsaldo_actualComparativosFlujosCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsaldo_actualComparativosFlujosCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"saldo_actualComparativosFlujosCajaBusqueda"));

		if(this.comparativosflujoscajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsaldo_actualComparativosFlujosCajaBusqueda.setVisible(false);		}


					
		this.jLabelsaldo_acumuladoComparativosFlujosCaja = new JLabelMe();
		this.jLabelsaldo_acumuladoComparativosFlujosCaja.setText(""+ComparativosFlujosCajaConstantesFunciones.LABEL_SALDOACUMULADO+" : *");
		this.jLabelsaldo_acumuladoComparativosFlujosCaja.setToolTipText("Saldo Acumulado");
		this.jLabelsaldo_acumuladoComparativosFlujosCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelsaldo_acumuladoComparativosFlujosCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelsaldo_acumuladoComparativosFlujosCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelsaldo_acumuladoComparativosFlujosCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsaldo_acumuladoComparativosFlujosCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsaldo_acumuladoComparativosFlujosCaja.setToolTipText(ComparativosFlujosCajaConstantesFunciones.LABEL_SALDOACUMULADO);
		this.gridaBagLayoutComparativosFlujosCaja = new GridBagLayout();
		this.jPanelsaldo_acumuladoComparativosFlujosCaja.setLayout(this.gridaBagLayoutComparativosFlujosCaja);


		jTextFieldsaldo_acumuladoComparativosFlujosCaja= new JTextFieldMe();
		jTextFieldsaldo_acumuladoComparativosFlujosCaja.setEnabled(false);
		jTextFieldsaldo_acumuladoComparativosFlujosCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsaldo_acumuladoComparativosFlujosCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsaldo_acumuladoComparativosFlujosCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsaldo_acumuladoComparativosFlujosCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldsaldo_acumuladoComparativosFlujosCaja.setText("0.0");

		this.jButtonsaldo_acumuladoComparativosFlujosCajaBusqueda= new JButtonMe();
		this.jButtonsaldo_acumuladoComparativosFlujosCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsaldo_acumuladoComparativosFlujosCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsaldo_acumuladoComparativosFlujosCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsaldo_acumuladoComparativosFlujosCajaBusqueda.setText("U");
		this.jButtonsaldo_acumuladoComparativosFlujosCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsaldo_acumuladoComparativosFlujosCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsaldo_acumuladoComparativosFlujosCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsaldo_acumuladoComparativosFlujosCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsaldo_acumuladoComparativosFlujosCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"saldo_acumuladoComparativosFlujosCajaBusqueda"));

		if(this.comparativosflujoscajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsaldo_acumuladoComparativosFlujosCajaBusqueda.setVisible(false);		}


					
		this.jLabelsaldo_pres_actualComparativosFlujosCaja = new JLabelMe();
		this.jLabelsaldo_pres_actualComparativosFlujosCaja.setText(""+ComparativosFlujosCajaConstantesFunciones.LABEL_SALDOPRESACTUAL+" : *");
		this.jLabelsaldo_pres_actualComparativosFlujosCaja.setToolTipText("Saldo Pres Actual");
		this.jLabelsaldo_pres_actualComparativosFlujosCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelsaldo_pres_actualComparativosFlujosCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelsaldo_pres_actualComparativosFlujosCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelsaldo_pres_actualComparativosFlujosCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsaldo_pres_actualComparativosFlujosCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsaldo_pres_actualComparativosFlujosCaja.setToolTipText(ComparativosFlujosCajaConstantesFunciones.LABEL_SALDOPRESACTUAL);
		this.gridaBagLayoutComparativosFlujosCaja = new GridBagLayout();
		this.jPanelsaldo_pres_actualComparativosFlujosCaja.setLayout(this.gridaBagLayoutComparativosFlujosCaja);


		jTextFieldsaldo_pres_actualComparativosFlujosCaja= new JTextFieldMe();
		jTextFieldsaldo_pres_actualComparativosFlujosCaja.setEnabled(false);
		jTextFieldsaldo_pres_actualComparativosFlujosCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsaldo_pres_actualComparativosFlujosCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsaldo_pres_actualComparativosFlujosCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsaldo_pres_actualComparativosFlujosCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldsaldo_pres_actualComparativosFlujosCaja.setText("0.0");

		this.jButtonsaldo_pres_actualComparativosFlujosCajaBusqueda= new JButtonMe();
		this.jButtonsaldo_pres_actualComparativosFlujosCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsaldo_pres_actualComparativosFlujosCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsaldo_pres_actualComparativosFlujosCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsaldo_pres_actualComparativosFlujosCajaBusqueda.setText("U");
		this.jButtonsaldo_pres_actualComparativosFlujosCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsaldo_pres_actualComparativosFlujosCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsaldo_pres_actualComparativosFlujosCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsaldo_pres_actualComparativosFlujosCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsaldo_pres_actualComparativosFlujosCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"saldo_pres_actualComparativosFlujosCajaBusqueda"));

		if(this.comparativosflujoscajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsaldo_pres_actualComparativosFlujosCajaBusqueda.setVisible(false);		}


					
		this.jLabelsaldo_pres_acumuladoComparativosFlujosCaja = new JLabelMe();
		this.jLabelsaldo_pres_acumuladoComparativosFlujosCaja.setText(""+ComparativosFlujosCajaConstantesFunciones.LABEL_SALDOPRESACUMULADO+" : *");
		this.jLabelsaldo_pres_acumuladoComparativosFlujosCaja.setToolTipText("Saldo Pres Acumulado");
		this.jLabelsaldo_pres_acumuladoComparativosFlujosCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelsaldo_pres_acumuladoComparativosFlujosCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelsaldo_pres_acumuladoComparativosFlujosCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelsaldo_pres_acumuladoComparativosFlujosCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsaldo_pres_acumuladoComparativosFlujosCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsaldo_pres_acumuladoComparativosFlujosCaja.setToolTipText(ComparativosFlujosCajaConstantesFunciones.LABEL_SALDOPRESACUMULADO);
		this.gridaBagLayoutComparativosFlujosCaja = new GridBagLayout();
		this.jPanelsaldo_pres_acumuladoComparativosFlujosCaja.setLayout(this.gridaBagLayoutComparativosFlujosCaja);


		jTextFieldsaldo_pres_acumuladoComparativosFlujosCaja= new JTextFieldMe();
		jTextFieldsaldo_pres_acumuladoComparativosFlujosCaja.setEnabled(false);
		jTextFieldsaldo_pres_acumuladoComparativosFlujosCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsaldo_pres_acumuladoComparativosFlujosCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsaldo_pres_acumuladoComparativosFlujosCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsaldo_pres_acumuladoComparativosFlujosCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldsaldo_pres_acumuladoComparativosFlujosCaja.setText("0.0");

		this.jButtonsaldo_pres_acumuladoComparativosFlujosCajaBusqueda= new JButtonMe();
		this.jButtonsaldo_pres_acumuladoComparativosFlujosCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsaldo_pres_acumuladoComparativosFlujosCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsaldo_pres_acumuladoComparativosFlujosCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsaldo_pres_acumuladoComparativosFlujosCajaBusqueda.setText("U");
		this.jButtonsaldo_pres_acumuladoComparativosFlujosCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsaldo_pres_acumuladoComparativosFlujosCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsaldo_pres_acumuladoComparativosFlujosCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsaldo_pres_acumuladoComparativosFlujosCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsaldo_pres_acumuladoComparativosFlujosCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"saldo_pres_acumuladoComparativosFlujosCajaBusqueda"));

		if(this.comparativosflujoscajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsaldo_pres_acumuladoComparativosFlujosCajaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysComparativosFlujosCaja() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaComparativosFlujosCaja = new JLabelMe();
		this.jLabelid_empresaComparativosFlujosCaja.setText(""+ComparativosFlujosCajaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaComparativosFlujosCaja.setToolTipText("Empresa");
		this.jLabelid_empresaComparativosFlujosCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaComparativosFlujosCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaComparativosFlujosCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaComparativosFlujosCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaComparativosFlujosCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaComparativosFlujosCaja.setToolTipText(ComparativosFlujosCajaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutComparativosFlujosCaja = new GridBagLayout();
		this.jPanelid_empresaComparativosFlujosCaja.setLayout(this.gridaBagLayoutComparativosFlujosCaja);


		jComboBoxid_empresaComparativosFlujosCaja= new JComboBoxMe();
		jComboBoxid_empresaComparativosFlujosCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaComparativosFlujosCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaComparativosFlujosCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaComparativosFlujosCaja,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaComparativosFlujosCaja.setEnabled(false);

		this.jButtonid_empresaComparativosFlujosCaja= new JButtonMe();
		this.jButtonid_empresaComparativosFlujosCaja.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaComparativosFlujosCaja.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaComparativosFlujosCaja.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaComparativosFlujosCaja.setText("Buscar");
		this.jButtonid_empresaComparativosFlujosCaja.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaComparativosFlujosCaja.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaComparativosFlujosCaja,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaComparativosFlujosCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaComparativosFlujosCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaComparativosFlujosCaja"));

		this.jButtonid_empresaComparativosFlujosCajaBusqueda= new JButtonMe();
		this.jButtonid_empresaComparativosFlujosCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaComparativosFlujosCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaComparativosFlujosCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaComparativosFlujosCajaBusqueda.setText("U");
		this.jButtonid_empresaComparativosFlujosCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaComparativosFlujosCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaComparativosFlujosCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaComparativosFlujosCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaComparativosFlujosCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaComparativosFlujosCajaBusqueda"));

		if(this.comparativosflujoscajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaComparativosFlujosCajaBusqueda.setVisible(false);		}

		this.jButtonid_empresaComparativosFlujosCajaUpdate= new JButtonMe();
		this.jButtonid_empresaComparativosFlujosCajaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaComparativosFlujosCajaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaComparativosFlujosCajaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaComparativosFlujosCajaUpdate.setText("U");
		this.jButtonid_empresaComparativosFlujosCajaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaComparativosFlujosCajaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaComparativosFlujosCajaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaComparativosFlujosCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaComparativosFlujosCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaComparativosFlujosCajaUpdate"));



					
		this.jLabelid_ejercicioComparativosFlujosCaja = new JLabelMe();
		this.jLabelid_ejercicioComparativosFlujosCaja.setText(""+ComparativosFlujosCajaConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioComparativosFlujosCaja.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioComparativosFlujosCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioComparativosFlujosCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioComparativosFlujosCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioComparativosFlujosCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioComparativosFlujosCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioComparativosFlujosCaja.setToolTipText(ComparativosFlujosCajaConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutComparativosFlujosCaja = new GridBagLayout();
		this.jPanelid_ejercicioComparativosFlujosCaja.setLayout(this.gridaBagLayoutComparativosFlujosCaja);


		jComboBoxid_ejercicioComparativosFlujosCaja= new JComboBoxMe();
		jComboBoxid_ejercicioComparativosFlujosCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioComparativosFlujosCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioComparativosFlujosCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioComparativosFlujosCaja,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioComparativosFlujosCaja.setEnabled(false);

		this.jButtonid_ejercicioComparativosFlujosCaja= new JButtonMe();
		this.jButtonid_ejercicioComparativosFlujosCaja.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioComparativosFlujosCaja.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioComparativosFlujosCaja.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioComparativosFlujosCaja.setText("Buscar");
		this.jButtonid_ejercicioComparativosFlujosCaja.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioComparativosFlujosCaja.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioComparativosFlujosCaja,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioComparativosFlujosCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioComparativosFlujosCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioComparativosFlujosCaja"));

		this.jButtonid_ejercicioComparativosFlujosCajaBusqueda= new JButtonMe();
		this.jButtonid_ejercicioComparativosFlujosCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioComparativosFlujosCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioComparativosFlujosCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioComparativosFlujosCajaBusqueda.setText("U");
		this.jButtonid_ejercicioComparativosFlujosCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioComparativosFlujosCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioComparativosFlujosCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioComparativosFlujosCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioComparativosFlujosCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioComparativosFlujosCajaBusqueda"));

		if(this.comparativosflujoscajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioComparativosFlujosCajaBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioComparativosFlujosCajaUpdate= new JButtonMe();
		this.jButtonid_ejercicioComparativosFlujosCajaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioComparativosFlujosCajaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioComparativosFlujosCajaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioComparativosFlujosCajaUpdate.setText("U");
		this.jButtonid_ejercicioComparativosFlujosCajaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioComparativosFlujosCajaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioComparativosFlujosCajaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioComparativosFlujosCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioComparativosFlujosCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioComparativosFlujosCajaUpdate"));



	}
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) {
		//System.out.println("TRANSFIERE EL MANEJO AL PADRE O FORM PRINCIPAL");
		
		jInternalFrameParent.jButtonActionPerformedTecladoGeneral(sTipo,evt);
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
		//this.jInternalFrameDetalleComparativosFlujosCaja = new ComparativosFlujosCajaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Comparativos Flujos Caja DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutComparativosFlujosCaja= new GridBagLayout();
		

		
		String sToolTipComparativosFlujosCaja="";
		sToolTipComparativosFlujosCaja=ComparativosFlujosCajaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipComparativosFlujosCaja+="(Tesoreria.ComparativosFlujosCaja)";
		}
		
		if(!this.comparativosflujoscajaSessionBean.getEsGuardarRelacionado()) {
			sToolTipComparativosFlujosCaja+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoComparativosFlujosCaja = new JButtonMe();
		this.jButtonModificarComparativosFlujosCaja = new JButtonMe();
        this.jButtonActualizarComparativosFlujosCaja = new JButtonMe();
        this.jButtonEliminarComparativosFlujosCaja = new JButtonMe();
        this.jButtonCancelarComparativosFlujosCaja = new JButtonMe();
        this.jButtonGuardarCambiosComparativosFlujosCaja = new JButtonMe();
		this.jButtonGuardarCambiosTablaComparativosFlujosCaja = new JButtonMe();
		this.jButtonCerrarComparativosFlujosCaja = new JButtonMe();
		
		this.jScrollPanelDatosComparativosFlujosCaja = new JScrollPane();   
        this.jScrollPanelDatosEdicionComparativosFlujosCaja = new JScrollPane();
		this.jScrollPanelDatosGeneralComparativosFlujosCaja = new JScrollPane();
				
		
		
		this.jPanelCamposComparativosFlujosCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosComparativosFlujosCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesComparativosFlujosCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioComparativosFlujosCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Comparativos Flujos Caja";
		
		if(!this.comparativosflujoscajaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosComparativosFlujosCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Comparativos Flujos Cajas" + this.sPath));
		} else {
			this.jScrollPanelDatosComparativosFlujosCaja.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionComparativosFlujosCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralComparativosFlujosCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposComparativosFlujosCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposComparativosFlujosCaja.setName("jPanelCamposComparativosFlujosCaja"); 

		this.jPanelCamposOcultosComparativosFlujosCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosComparativosFlujosCaja.setName("jPanelCamposOcultosComparativosFlujosCaja"); 

        this.jPanelAccionesComparativosFlujosCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesComparativosFlujosCaja.setToolTipText("Acciones");
        this.jPanelAccionesComparativosFlujosCaja.setName("Acciones"); 

		this.jPanelAccionesFormularioComparativosFlujosCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioComparativosFlujosCaja.setToolTipText("Acciones");
        this.jPanelAccionesFormularioComparativosFlujosCaja.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionComparativosFlujosCaja, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralComparativosFlujosCaja, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosComparativosFlujosCaja, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposComparativosFlujosCaja, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosComparativosFlujosCaja, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioComparativosFlujosCaja, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoComparativosFlujosCaja.setText("Nuevo");
		this.jButtonModificarComparativosFlujosCaja.setText("Editar");
        this.jButtonActualizarComparativosFlujosCaja.setText("Actualizar");
        this.jButtonEliminarComparativosFlujosCaja.setText("Eliminar");
        this.jButtonCancelarComparativosFlujosCaja.setText("Cancelar");
        this.jButtonGuardarCambiosComparativosFlujosCaja.setText("Guardar");
		this.jButtonGuardarCambiosTablaComparativosFlujosCaja.setText("Guardar");
		this.jButtonCerrarComparativosFlujosCaja.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoComparativosFlujosCaja,"nuevo_button","Nuevo",this.comparativosflujoscajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarComparativosFlujosCaja,"modificar_button","Editar",this.comparativosflujoscajaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarComparativosFlujosCaja,"actualizar_button","Actualizar",this.comparativosflujoscajaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarComparativosFlujosCaja,"eliminar_button","Eliminar",this.comparativosflujoscajaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarComparativosFlujosCaja,"cancelar_button","Cancelar",this.comparativosflujoscajaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosComparativosFlujosCaja,"guardarcambios_button","Guardar",this.comparativosflujoscajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaComparativosFlujosCaja,"guardarcambiostabla_button","Guardar",this.comparativosflujoscajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarComparativosFlujosCaja,"cerrar_button","Salir",this.comparativosflujoscajaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoComparativosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarComparativosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosComparativosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaComparativosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarComparativosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarComparativosFlujosCaja, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarComparativosFlujosCaja, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarComparativosFlujosCaja, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoComparativosFlujosCaja.setToolTipText("Nuevo"+" "+ComparativosFlujosCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarComparativosFlujosCaja.setToolTipText("Editar"+" "+ComparativosFlujosCajaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarComparativosFlujosCaja.setToolTipText("Actualizar"+" "+ComparativosFlujosCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarComparativosFlujosCaja.setToolTipText("Eliminar)"+" "+ComparativosFlujosCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarComparativosFlujosCaja.setToolTipText("Cancelar"+" "+ComparativosFlujosCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosComparativosFlujosCaja.setToolTipText("Guardar"+" "+ComparativosFlujosCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaComparativosFlujosCaja.setToolTipText("Guardar"+" "+ComparativosFlujosCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarComparativosFlujosCaja.setToolTipText("Salir"+" "+ComparativosFlujosCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		String sMapKey = "";
		InputMap inputMap =null;
		
		//NUEVO
		sMapKey = "NuevoComparativosFlujosCaja";
		inputMap = this.jButtonNuevoComparativosFlujosCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoComparativosFlujosCaja.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoComparativosFlujosCaja"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarComparativosFlujosCaja";
		inputMap = this.jButtonActualizarComparativosFlujosCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarComparativosFlujosCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarComparativosFlujosCaja"));
		
		//ELIMINAR
		sMapKey = "EliminarComparativosFlujosCaja";
		inputMap = this.jButtonEliminarComparativosFlujosCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarComparativosFlujosCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarComparativosFlujosCaja"));
		
		//CANCELAR	
		sMapKey = "CancelarComparativosFlujosCaja";
		inputMap = this.jButtonCancelarComparativosFlujosCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarComparativosFlujosCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarComparativosFlujosCaja"));
		
		//CERRAR		
		sMapKey = "CerrarComparativosFlujosCaja";
		inputMap = this.jButtonCerrarComparativosFlujosCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarComparativosFlujosCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarComparativosFlujosCaja"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaComparativosFlujosCaja";
		inputMap = this.jButtonGuardarCambiosTablaComparativosFlujosCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaComparativosFlujosCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaComparativosFlujosCaja"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoComparativosFlujosCaja = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoComparativosFlujosCaja.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoComparativosFlujosCaja.setToolTipText("Nuevo ComparativosFlujosCaja");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoComparativosFlujosCaja, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarComparativosFlujosCaja = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarComparativosFlujosCaja.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarComparativosFlujosCaja.setToolTipText("Sin Cerrar Ventana ComparativosFlujosCaja");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarComparativosFlujosCaja, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeComparativosFlujosCaja = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeComparativosFlujosCaja.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeComparativosFlujosCaja.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeComparativosFlujosCaja, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesComparativosFlujosCaja = new JComboBoxMe();
		//this.jComboBoxTiposAccionesComparativosFlujosCaja.setText("Accion");
		this.jComboBoxTiposAccionesComparativosFlujosCaja.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioComparativosFlujosCaja = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioComparativosFlujosCaja.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioComparativosFlujosCaja.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesComparativosFlujosCaja = new JLabelMe();
		
		this.jLabelAccionesComparativosFlujosCaja.setText("Acciones");		
		this.jLabelAccionesComparativosFlujosCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesComparativosFlujosCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesComparativosFlujosCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposComparativosFlujosCaja();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysComparativosFlujosCaja();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesComparativosFlujosCaja=new JTabbedPane();
		this.jTabbedPaneRelacionesComparativosFlujosCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesComparativosFlujosCaja,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesComparativosFlujosCaja.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesComparativosFlujosCaja.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesComparativosFlujosCaja.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesComparativosFlujosCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioComparativosFlujosCaja.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioComparativosFlujosCaja.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioComparativosFlujosCaja.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioComparativosFlujosCaja, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposComparativosFlujosCaja = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosComparativosFlujosCaja = new GridBagLayout();
		
		this.jPanelCamposComparativosFlujosCaja.setLayout(gridaBagLayoutCamposComparativosFlujosCaja);
		this.jPanelCamposOcultosComparativosFlujosCaja.setLayout(gridaBagLayoutCamposOcultosComparativosFlujosCaja);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
	this.gridBagConstraintsComparativosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComparativosFlujosCaja.gridy = 0;
	this.gridBagConstraintsComparativosFlujosCaja.gridx = 0;
	this.gridBagConstraintsComparativosFlujosCaja.ipadx = 0;
	this.gridBagConstraintsComparativosFlujosCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidComparativosFlujosCaja.add(jLabelIdComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);



	this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
	this.gridBagConstraintsComparativosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComparativosFlujosCaja.gridy = 0;
	this.gridBagConstraintsComparativosFlujosCaja.gridx = 1;
	this.gridBagConstraintsComparativosFlujosCaja.ipadx = 0;
	this.gridBagConstraintsComparativosFlujosCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidComparativosFlujosCaja.add(jLabelidComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);


	this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
	this.gridBagConstraintsComparativosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComparativosFlujosCaja.gridy = 0;
	this.gridBagConstraintsComparativosFlujosCaja.gridx = 0;
	this.gridBagConstraintsComparativosFlujosCaja.ipadx = 0;
	this.gridBagConstraintsComparativosFlujosCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaComparativosFlujosCaja.add(jLabelid_empresaComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
		//this.gridBagConstraintsComparativosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComparativosFlujosCaja.gridy = 0;
		this.gridBagConstraintsComparativosFlujosCaja.gridx = 2;
		this.gridBagConstraintsComparativosFlujosCaja.ipadx = 0;
		this.gridBagConstraintsComparativosFlujosCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaComparativosFlujosCaja.add(jButtonid_empresaComparativosFlujosCajaBusqueda, this.gridBagConstraintsComparativosFlujosCaja);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
		//this.gridBagConstraintsComparativosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComparativosFlujosCaja.gridy = 0;
		this.gridBagConstraintsComparativosFlujosCaja.gridx = 3;
		this.gridBagConstraintsComparativosFlujosCaja.ipadx = 0;
		this.gridBagConstraintsComparativosFlujosCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaComparativosFlujosCaja.add(jButtonid_empresaComparativosFlujosCajaUpdate, this.gridBagConstraintsComparativosFlujosCaja);
	}

	this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
	this.gridBagConstraintsComparativosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComparativosFlujosCaja.gridy = 0;
	this.gridBagConstraintsComparativosFlujosCaja.gridx = 1;
	this.gridBagConstraintsComparativosFlujosCaja.ipadx = 0;
	this.gridBagConstraintsComparativosFlujosCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaComparativosFlujosCaja.add(jComboBoxid_empresaComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);


	this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
	this.gridBagConstraintsComparativosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComparativosFlujosCaja.gridy = 0;
	this.gridBagConstraintsComparativosFlujosCaja.gridx = 0;
	this.gridBagConstraintsComparativosFlujosCaja.ipadx = 0;
	this.gridBagConstraintsComparativosFlujosCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioComparativosFlujosCaja.add(jLabelid_ejercicioComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
		//this.gridBagConstraintsComparativosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComparativosFlujosCaja.gridy = 0;
		this.gridBagConstraintsComparativosFlujosCaja.gridx = 2;
		this.gridBagConstraintsComparativosFlujosCaja.ipadx = 0;
		this.gridBagConstraintsComparativosFlujosCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioComparativosFlujosCaja.add(jButtonid_ejercicioComparativosFlujosCajaBusqueda, this.gridBagConstraintsComparativosFlujosCaja);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
		//this.gridBagConstraintsComparativosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComparativosFlujosCaja.gridy = 0;
		this.gridBagConstraintsComparativosFlujosCaja.gridx = 3;
		this.gridBagConstraintsComparativosFlujosCaja.ipadx = 0;
		this.gridBagConstraintsComparativosFlujosCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioComparativosFlujosCaja.add(jButtonid_ejercicioComparativosFlujosCajaUpdate, this.gridBagConstraintsComparativosFlujosCaja);
	}

	this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
	this.gridBagConstraintsComparativosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComparativosFlujosCaja.gridy = 0;
	this.gridBagConstraintsComparativosFlujosCaja.gridx = 1;
	this.gridBagConstraintsComparativosFlujosCaja.ipadx = 0;
	this.gridBagConstraintsComparativosFlujosCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioComparativosFlujosCaja.add(jComboBoxid_ejercicioComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);


	this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
	this.gridBagConstraintsComparativosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComparativosFlujosCaja.gridy = 0;
	this.gridBagConstraintsComparativosFlujosCaja.gridx = 0;
	this.gridBagConstraintsComparativosFlujosCaja.ipadx = 0;
	this.gridBagConstraintsComparativosFlujosCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_centro_actividadComparativosFlujosCaja.add(jLabelnombre_centro_actividadComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
		//this.gridBagConstraintsComparativosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComparativosFlujosCaja.gridy = 0;
		this.gridBagConstraintsComparativosFlujosCaja.gridx = 2;
		this.gridBagConstraintsComparativosFlujosCaja.ipadx = 0;
		this.gridBagConstraintsComparativosFlujosCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_centro_actividadComparativosFlujosCaja.add(jButtonnombre_centro_actividadComparativosFlujosCajaBusqueda, this.gridBagConstraintsComparativosFlujosCaja);
	}

	this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
	this.gridBagConstraintsComparativosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComparativosFlujosCaja.gridy = 0;
	this.gridBagConstraintsComparativosFlujosCaja.gridx = 1;
	this.gridBagConstraintsComparativosFlujosCaja.ipadx = 0;
	this.gridBagConstraintsComparativosFlujosCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_centro_actividadComparativosFlujosCaja.add(jscrollPanenombre_centro_actividadComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);


	this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
	this.gridBagConstraintsComparativosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComparativosFlujosCaja.gridy = 0;
	this.gridBagConstraintsComparativosFlujosCaja.gridx = 0;
	this.gridBagConstraintsComparativosFlujosCaja.ipadx = 0;
	this.gridBagConstraintsComparativosFlujosCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltipo_movimientoComparativosFlujosCaja.add(jLabeltipo_movimientoComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
		//this.gridBagConstraintsComparativosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComparativosFlujosCaja.gridy = 0;
		this.gridBagConstraintsComparativosFlujosCaja.gridx = 2;
		this.gridBagConstraintsComparativosFlujosCaja.ipadx = 0;
		this.gridBagConstraintsComparativosFlujosCaja.insets = new Insets(0, 0, 0, 0);
		this.jPaneltipo_movimientoComparativosFlujosCaja.add(jButtontipo_movimientoComparativosFlujosCajaBusqueda, this.gridBagConstraintsComparativosFlujosCaja);
	}

	this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
	this.gridBagConstraintsComparativosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComparativosFlujosCaja.gridy = 0;
	this.gridBagConstraintsComparativosFlujosCaja.gridx = 1;
	this.gridBagConstraintsComparativosFlujosCaja.ipadx = 0;
	this.gridBagConstraintsComparativosFlujosCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltipo_movimientoComparativosFlujosCaja.add(jscrollPanetipo_movimientoComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);


	this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
	this.gridBagConstraintsComparativosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComparativosFlujosCaja.gridy = 0;
	this.gridBagConstraintsComparativosFlujosCaja.gridx = 0;
	this.gridBagConstraintsComparativosFlujosCaja.ipadx = 0;
	this.gridBagConstraintsComparativosFlujosCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsaldo_actualComparativosFlujosCaja.add(jLabelsaldo_actualComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
		//this.gridBagConstraintsComparativosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComparativosFlujosCaja.gridy = 0;
		this.gridBagConstraintsComparativosFlujosCaja.gridx = 2;
		this.gridBagConstraintsComparativosFlujosCaja.ipadx = 0;
		this.gridBagConstraintsComparativosFlujosCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelsaldo_actualComparativosFlujosCaja.add(jButtonsaldo_actualComparativosFlujosCajaBusqueda, this.gridBagConstraintsComparativosFlujosCaja);
	}

	this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
	this.gridBagConstraintsComparativosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComparativosFlujosCaja.gridy = 0;
	this.gridBagConstraintsComparativosFlujosCaja.gridx = 1;
	this.gridBagConstraintsComparativosFlujosCaja.ipadx = 0;
	this.gridBagConstraintsComparativosFlujosCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsaldo_actualComparativosFlujosCaja.add(jTextFieldsaldo_actualComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);


	this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
	this.gridBagConstraintsComparativosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComparativosFlujosCaja.gridy = 0;
	this.gridBagConstraintsComparativosFlujosCaja.gridx = 0;
	this.gridBagConstraintsComparativosFlujosCaja.ipadx = 0;
	this.gridBagConstraintsComparativosFlujosCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsaldo_acumuladoComparativosFlujosCaja.add(jLabelsaldo_acumuladoComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
		//this.gridBagConstraintsComparativosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComparativosFlujosCaja.gridy = 0;
		this.gridBagConstraintsComparativosFlujosCaja.gridx = 2;
		this.gridBagConstraintsComparativosFlujosCaja.ipadx = 0;
		this.gridBagConstraintsComparativosFlujosCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelsaldo_acumuladoComparativosFlujosCaja.add(jButtonsaldo_acumuladoComparativosFlujosCajaBusqueda, this.gridBagConstraintsComparativosFlujosCaja);
	}

	this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
	this.gridBagConstraintsComparativosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComparativosFlujosCaja.gridy = 0;
	this.gridBagConstraintsComparativosFlujosCaja.gridx = 1;
	this.gridBagConstraintsComparativosFlujosCaja.ipadx = 0;
	this.gridBagConstraintsComparativosFlujosCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsaldo_acumuladoComparativosFlujosCaja.add(jTextFieldsaldo_acumuladoComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);


	this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
	this.gridBagConstraintsComparativosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComparativosFlujosCaja.gridy = 0;
	this.gridBagConstraintsComparativosFlujosCaja.gridx = 0;
	this.gridBagConstraintsComparativosFlujosCaja.ipadx = 0;
	this.gridBagConstraintsComparativosFlujosCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsaldo_pres_actualComparativosFlujosCaja.add(jLabelsaldo_pres_actualComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
		//this.gridBagConstraintsComparativosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComparativosFlujosCaja.gridy = 0;
		this.gridBagConstraintsComparativosFlujosCaja.gridx = 2;
		this.gridBagConstraintsComparativosFlujosCaja.ipadx = 0;
		this.gridBagConstraintsComparativosFlujosCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelsaldo_pres_actualComparativosFlujosCaja.add(jButtonsaldo_pres_actualComparativosFlujosCajaBusqueda, this.gridBagConstraintsComparativosFlujosCaja);
	}

	this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
	this.gridBagConstraintsComparativosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComparativosFlujosCaja.gridy = 0;
	this.gridBagConstraintsComparativosFlujosCaja.gridx = 1;
	this.gridBagConstraintsComparativosFlujosCaja.ipadx = 0;
	this.gridBagConstraintsComparativosFlujosCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsaldo_pres_actualComparativosFlujosCaja.add(jTextFieldsaldo_pres_actualComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);


	this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
	this.gridBagConstraintsComparativosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComparativosFlujosCaja.gridy = 0;
	this.gridBagConstraintsComparativosFlujosCaja.gridx = 0;
	this.gridBagConstraintsComparativosFlujosCaja.ipadx = 0;
	this.gridBagConstraintsComparativosFlujosCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsaldo_pres_acumuladoComparativosFlujosCaja.add(jLabelsaldo_pres_acumuladoComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
		//this.gridBagConstraintsComparativosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsComparativosFlujosCaja.gridy = 0;
		this.gridBagConstraintsComparativosFlujosCaja.gridx = 2;
		this.gridBagConstraintsComparativosFlujosCaja.ipadx = 0;
		this.gridBagConstraintsComparativosFlujosCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelsaldo_pres_acumuladoComparativosFlujosCaja.add(jButtonsaldo_pres_acumuladoComparativosFlujosCajaBusqueda, this.gridBagConstraintsComparativosFlujosCaja);
	}

	this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
	this.gridBagConstraintsComparativosFlujosCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsComparativosFlujosCaja.gridy = 0;
	this.gridBagConstraintsComparativosFlujosCaja.gridx = 1;
	this.gridBagConstraintsComparativosFlujosCaja.ipadx = 0;
	this.gridBagConstraintsComparativosFlujosCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsaldo_pres_acumuladoComparativosFlujosCaja.add(jTextFieldsaldo_pres_acumuladoComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
	this.gridBagConstraintsComparativosFlujosCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComparativosFlujosCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComparativosFlujosCaja.gridy = iYPanelCamposComparativosFlujosCaja;
	this.gridBagConstraintsComparativosFlujosCaja.gridx = iXPanelCamposComparativosFlujosCaja++;
	this.gridBagConstraintsComparativosFlujosCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComparativosFlujosCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComparativosFlujosCaja.add(this.jPanelidComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);



	if(iXPanelCamposComparativosFlujosCaja % 1==0) {
		iXPanelCamposComparativosFlujosCaja=0;
		iYPanelCamposComparativosFlujosCaja++;
	}
	this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
	this.gridBagConstraintsComparativosFlujosCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComparativosFlujosCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComparativosFlujosCaja.gridy = iYPanelCamposComparativosFlujosCaja;
	this.gridBagConstraintsComparativosFlujosCaja.gridx = iXPanelCamposComparativosFlujosCaja++;
	this.gridBagConstraintsComparativosFlujosCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComparativosFlujosCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComparativosFlujosCaja.add(this.jPanelnombre_centro_actividadComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);



	if(iXPanelCamposComparativosFlujosCaja % 1==0) {
		iXPanelCamposComparativosFlujosCaja=0;
		iYPanelCamposComparativosFlujosCaja++;
	}
	this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
	this.gridBagConstraintsComparativosFlujosCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComparativosFlujosCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComparativosFlujosCaja.gridy = iYPanelCamposComparativosFlujosCaja;
	this.gridBagConstraintsComparativosFlujosCaja.gridx = iXPanelCamposComparativosFlujosCaja++;
	this.gridBagConstraintsComparativosFlujosCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComparativosFlujosCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComparativosFlujosCaja.add(this.jPaneltipo_movimientoComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);



	if(iXPanelCamposComparativosFlujosCaja % 1==0) {
		iXPanelCamposComparativosFlujosCaja=0;
		iYPanelCamposComparativosFlujosCaja++;
	}
	this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
	this.gridBagConstraintsComparativosFlujosCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComparativosFlujosCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComparativosFlujosCaja.gridy = iYPanelCamposComparativosFlujosCaja;
	this.gridBagConstraintsComparativosFlujosCaja.gridx = iXPanelCamposComparativosFlujosCaja++;
	this.gridBagConstraintsComparativosFlujosCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComparativosFlujosCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComparativosFlujosCaja.add(this.jPanelsaldo_actualComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);



	if(iXPanelCamposComparativosFlujosCaja % 1==0) {
		iXPanelCamposComparativosFlujosCaja=0;
		iYPanelCamposComparativosFlujosCaja++;
	}
	this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
	this.gridBagConstraintsComparativosFlujosCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComparativosFlujosCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComparativosFlujosCaja.gridy = iYPanelCamposComparativosFlujosCaja;
	this.gridBagConstraintsComparativosFlujosCaja.gridx = iXPanelCamposComparativosFlujosCaja++;
	this.gridBagConstraintsComparativosFlujosCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComparativosFlujosCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComparativosFlujosCaja.add(this.jPanelsaldo_acumuladoComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);



	if(iXPanelCamposComparativosFlujosCaja % 1==0) {
		iXPanelCamposComparativosFlujosCaja=0;
		iYPanelCamposComparativosFlujosCaja++;
	}
	this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
	this.gridBagConstraintsComparativosFlujosCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComparativosFlujosCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComparativosFlujosCaja.gridy = iYPanelCamposComparativosFlujosCaja;
	this.gridBagConstraintsComparativosFlujosCaja.gridx = iXPanelCamposComparativosFlujosCaja++;
	this.gridBagConstraintsComparativosFlujosCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComparativosFlujosCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComparativosFlujosCaja.add(this.jPanelsaldo_pres_actualComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);



	if(iXPanelCamposComparativosFlujosCaja % 1==0) {
		iXPanelCamposComparativosFlujosCaja=0;
		iYPanelCamposComparativosFlujosCaja++;
	}
	this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
	this.gridBagConstraintsComparativosFlujosCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComparativosFlujosCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComparativosFlujosCaja.gridy = iYPanelCamposComparativosFlujosCaja;
	this.gridBagConstraintsComparativosFlujosCaja.gridx = iXPanelCamposComparativosFlujosCaja++;
	this.gridBagConstraintsComparativosFlujosCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComparativosFlujosCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposComparativosFlujosCaja.add(this.jPanelsaldo_pres_acumuladoComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);



	if(iXPanelCamposComparativosFlujosCaja % 1==0) {
		iXPanelCamposComparativosFlujosCaja=0;
		iYPanelCamposComparativosFlujosCaja++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
	this.gridBagConstraintsComparativosFlujosCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComparativosFlujosCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComparativosFlujosCaja.gridy = iYPanelCamposOcultosComparativosFlujosCaja;
	this.gridBagConstraintsComparativosFlujosCaja.gridx = iXPanelCamposOcultosComparativosFlujosCaja++;
	this.gridBagConstraintsComparativosFlujosCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComparativosFlujosCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosComparativosFlujosCaja.add(this.jPanelid_empresaComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);



	if(iXPanelCamposOcultosComparativosFlujosCaja % 1==0) {
		iXPanelCamposOcultosComparativosFlujosCaja=0;
		iYPanelCamposOcultosComparativosFlujosCaja++;
	}
	this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
	this.gridBagConstraintsComparativosFlujosCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsComparativosFlujosCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsComparativosFlujosCaja.gridy = iYPanelCamposOcultosComparativosFlujosCaja;
	this.gridBagConstraintsComparativosFlujosCaja.gridx = iXPanelCamposOcultosComparativosFlujosCaja++;
	this.gridBagConstraintsComparativosFlujosCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsComparativosFlujosCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosComparativosFlujosCaja.add(this.jPanelid_ejercicioComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);



	if(iXPanelCamposOcultosComparativosFlujosCaja % 1==0) {
		iXPanelCamposOcultosComparativosFlujosCaja=0;
		iYPanelCamposOcultosComparativosFlujosCaja++;
	}
		
		//SUBPANELES EN PANEL CAMPOS INICIO				
		
		
		//SUBPANELES EN PANEL CAMPOS FIN				
		
				
		//SUBPANELES EN PANEL
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
			 		
			
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesComparativosFlujosCaja= new GridBagLayout();
		this.jPanelAccionesComparativosFlujosCaja.setLayout(gridaBagLayoutAccionesComparativosFlujosCaja);
		
		GridBagLayout gridaBagLayoutAccionesFormularioComparativosFlujosCaja= new GridBagLayout();
		this.jPanelAccionesFormularioComparativosFlujosCaja.setLayout(gridaBagLayoutAccionesFormularioComparativosFlujosCaja);
		
		this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
		this.gridBagConstraintsComparativosFlujosCaja.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsComparativosFlujosCaja.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioComparativosFlujosCaja.add(this.jComboBoxTiposAccionesFormularioComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
		this.gridBagConstraintsComparativosFlujosCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComparativosFlujosCaja.gridy = 0;
		this.gridBagConstraintsComparativosFlujosCaja.gridx = iPosXAccion++;
			
		this.jPanelAccionesComparativosFlujosCaja.add(this.jButtonModificarComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);							

		this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
		this.gridBagConstraintsComparativosFlujosCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsComparativosFlujosCaja.gridy = 0;
		this.gridBagConstraintsComparativosFlujosCaja.gridx =iPosXAccion++;
			
		this.jPanelAccionesComparativosFlujosCaja.add(this.jButtonEliminarComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);
		
			
		this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
		this.gridBagConstraintsComparativosFlujosCaja.gridy = 0;		
		this.gridBagConstraintsComparativosFlujosCaja.gridx = iPosXAccion++;
		
		this.jPanelAccionesComparativosFlujosCaja.add(this.jButtonActualizarComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);


		this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
		this.gridBagConstraintsComparativosFlujosCaja.gridy = 0;		
		this.gridBagConstraintsComparativosFlujosCaja.gridx = iPosXAccion++;
		
		this.jPanelAccionesComparativosFlujosCaja.add(this.jButtonGuardarCambiosComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);	
		
		this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
		this.gridBagConstraintsComparativosFlujosCaja.gridy = 0;		
		this.gridBagConstraintsComparativosFlujosCaja.gridx =iPosXAccion++;
		
		this.jPanelAccionesComparativosFlujosCaja.add(this.jButtonCancelarComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutComparativosFlujosCaja = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutComparativosFlujosCaja);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.comparativosflujoscajaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();						
			this.gridBagConstraintsComparativosFlujosCaja.gridy = iGridyPrincipal++;
			this.gridBagConstraintsComparativosFlujosCaja.gridx = 0;		
			//this.gridBagConstraintsComparativosFlujosCaja.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsComparativosFlujosCaja.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsComparativosFlujosCaja.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
		this.gridBagConstraintsComparativosFlujosCaja.gridy =iGridyPrincipal++;
		this.gridBagConstraintsComparativosFlujosCaja.gridx =0;
		this.gridBagConstraintsComparativosFlujosCaja.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsComparativosFlujosCaja.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ComparativosFlujosCajaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleComparativosFlujosCaja = new ComparativosFlujosCajaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Comparativos Flujos Caja DATOS");
			
			this.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	        //this.setjInternalFrameParent(this);
	        
			iHeightFormularioMaximo=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	        
	        if(iHeightFormulario>iHeightFormularioMaximo) {
	        	iHeightFormulario=iHeightFormularioMaximo;
	        }
			
			iWidthFormularioMaximo=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
	        
			if(iWidthFormulario>iWidthFormularioMaximo) {
	        	iWidthFormulario=iWidthFormularioMaximo;
	        }
			
	        //this.setTitle("[FOR] - Comparativos Flujos Caja DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Comparativos Flujos Caja Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ComparativosFlujosCajaModel comparativosflujoscajaModel=new ComparativosFlujosCajaModel(this);
			
			//SI USARA CLASE INTERNA
			//ComparativosFlujosCajaModel.ComparativosFlujosCajaFocusTraversalPolicy comparativosflujoscajaFocusTraversalPolicy = comparativosflujoscajaModel.new ComparativosFlujosCajaFocusTraversalPolicy(this);
			
			//comparativosflujoscajaFocusTraversalPolicy.setcomparativosflujoscajaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(comparativosflujoscajaModel);
			
			
			this.jContentPaneDetalleComparativosFlujosCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleComparativosFlujosCaja = new GridBagLayout();	
			this.jContentPaneDetalleComparativosFlujosCaja.setLayout(gridaBagLayoutDetalleComparativosFlujosCaja);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosComparativosFlujosCaja = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
				this.gridBagConstraintsComparativosFlujosCaja.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsComparativosFlujosCaja.gridx = 0;
					
				
				this.jContentPaneDetalleComparativosFlujosCaja.add(jTtoolBarDetalleComparativosFlujosCaja, gridBagConstraintsComparativosFlujosCaja);								
				
}
			
			this.jScrollPanelDatosEdicionComparativosFlujosCaja=   new JScrollPane(jContentPaneDetalleComparativosFlujosCaja,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionComparativosFlujosCaja.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionComparativosFlujosCaja.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionComparativosFlujosCaja.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralComparativosFlujosCaja=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralComparativosFlujosCaja.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralComparativosFlujosCaja.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralComparativosFlujosCaja.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
			
			
	        this.gridBagConstraintsComparativosFlujosCaja.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsComparativosFlujosCaja.gridx = 0;
	        
			this.jContentPaneDetalleComparativosFlujosCaja.add(jPanelCamposComparativosFlujosCaja, gridBagConstraintsComparativosFlujosCaja);
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			
			;
			//}
						
			this.conMaximoRelaciones=true;
			
			if(this.parametroGeneralUsuario.getcon_cargar_por_parte()) {
				
			}									
			
			//CARGA O NO CARGA RELACIONADOS(MAESTRO DETALLE)
									  // ABAJO VIENE DE PARAMETRO GENERAL USUARIO
			if(conMaximoRelaciones) { // && this.conFuncionalidadRelaciones) {
				if(!this.conCargarMinimo) {
					if(cargarRelaciones 
						//&& comparativosflujoscajaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.comparativosflujoscajaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsComparativosFlujosCaja= new GridBagConstraints();
						this.gridBagConstraintsComparativosFlujosCaja.gridy = iGridyRelaciones++;
						this.gridBagConstraintsComparativosFlujosCaja.gridx = 0;
						this.jContentPaneDetalleComparativosFlujosCaja.add(this.jTabbedPaneRelacionesComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesComparativosFlujosCaja.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosComparativosFlujosCaja.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
					this.gridBagConstraintsComparativosFlujosCaja.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsComparativosFlujosCaja.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsComparativosFlujosCaja.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsComparativosFlujosCaja.gridx = 0;
					
				
					this.jContentPaneDetalleComparativosFlujosCaja.add(jPanelCamposOcultosComparativosFlujosCaja, gridBagConstraintsComparativosFlujosCaja);
				
					this.jPanelCamposOcultosComparativosFlujosCaja.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
			this.gridBagConstraintsComparativosFlujosCaja.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsComparativosFlujosCaja.gridx = 0;
	        this.gridBagConstraintsComparativosFlujosCaja.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleComparativosFlujosCaja.add(this.jPanelAccionesFormularioComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);							
			
			
			
			this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
	        this.gridBagConstraintsComparativosFlujosCaja.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsComparativosFlujosCaja.gridx = 0;
	        
			
			this.jContentPaneDetalleComparativosFlujosCaja.add(this.jPanelAccionesComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionComparativosFlujosCaja);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionComparativosFlujosCaja=   new JScrollPane(this.jPanelCamposComparativosFlujosCaja,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionComparativosFlujosCaja.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionComparativosFlujosCaja.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionComparativosFlujosCaja.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
			this.gridBagConstraintsComparativosFlujosCaja.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsComparativosFlujosCaja.gridx = 0;
			this.gridBagConstraintsComparativosFlujosCaja.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsComparativosFlujosCaja.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsComparativosFlujosCaja.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
			this.gridBagConstraintsComparativosFlujosCaja.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsComparativosFlujosCaja.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);			
			
			this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
			this.gridBagConstraintsComparativosFlujosCaja.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsComparativosFlujosCaja.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
		this.gridBagConstraintsComparativosFlujosCaja.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsComparativosFlujosCaja.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);
			
			
		this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
		this.gridBagConstraintsComparativosFlujosCaja.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsComparativosFlujosCaja.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);
		
			
		this.gridBagConstraintsComparativosFlujosCaja = new GridBagConstraints();
		this.gridBagConstraintsComparativosFlujosCaja.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsComparativosFlujosCaja.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesComparativosFlujosCaja, this.gridBagConstraintsComparativosFlujosCaja);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralComparativosFlujosCaja;//jContentPane;
		
		return jScrollPanelDatosEdicionComparativosFlujosCaja;
    } 
	
		
	
	
	
	
	
	
	
	
	/*
	case "CONTROL_BUSQUEDA":
		sKeyName="F3";
	case "CONTROL_BUSCAR":
		sKeyName="F4";
	case "CONTROL_ARBOL":
		sKeyName="F5";
	case "CONTROL_ACTUALIZAR":
		sKeyName="F6";
	sKeyName="N";					
	*/
}
