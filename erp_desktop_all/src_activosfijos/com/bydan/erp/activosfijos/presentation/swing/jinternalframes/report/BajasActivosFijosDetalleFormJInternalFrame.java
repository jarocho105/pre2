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
package com.bydan.erp.activosfijos.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.activosfijos.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.activosfijos.business.entity.report.*;
import com.bydan.erp.activosfijos.util.report.BajasActivosFijosConstantesFunciones;

import com.bydan.erp.activosfijos.business.logic.report.*;
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
public class BajasActivosFijosDetalleFormJInternalFrame extends BajasActivosFijosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleBajasActivosFijos;
	
	protected JMenuBar jmenuBarDetalleBajasActivosFijos;
	
	protected JMenu jmenuDetalleBajasActivosFijos;
	protected JMenu jmenuDetalleArchivoBajasActivosFijos;
	protected JMenu jmenuDetalleAccionesBajasActivosFijos;
	protected JMenu jmenuDetalleDatosBajasActivosFijos;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleBajasActivosFijos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutBajasActivosFijos;	
	protected GridBagConstraints gridBagConstraintsBajasActivosFijos;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected BajasActivosFijosBeanSwingJInternalFrameAdditional jInternalFrameDetalleBajasActivosFijos;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public BajasActivosFijosSessionBean bajasactivosfijosSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public BajasActivosFijosLogic bajasactivosfijosLogic;
	
	public JScrollPane jScrollPanelDatosBajasActivosFijos;
	public JScrollPane jScrollPanelDatosEdicionBajasActivosFijos;
	public JScrollPane jScrollPanelDatosGeneralBajasActivosFijos;
	
	protected JPanel jPanelCamposBajasActivosFijos;    
	protected JPanel jPanelCamposOcultosBajasActivosFijos;    	
	protected JPanel jPanelAccionesBajasActivosFijos;
	protected JPanel jPanelAccionesFormularioBajasActivosFijos;
    
	
	
	protected Integer iXPanelCamposBajasActivosFijos=0;
	protected Integer iYPanelCamposBajasActivosFijos=0;
	
	protected Integer iXPanelCamposOcultosBajasActivosFijos=0;
	protected Integer iYPanelCamposOcultosBajasActivosFijos=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoBajasActivosFijos;
	public JButton jButtonModificarBajasActivosFijos;
	public JButton jButtonActualizarBajasActivosFijos;
    public JButton jButtonEliminarBajasActivosFijos;
	public JButton jButtonCancelarBajasActivosFijos;
    public JButton jButtonGuardarCambiosBajasActivosFijos;
	public JButton jButtonGuardarCambiosTablaBajasActivosFijos;
	protected JButton jButtonCerrarBajasActivosFijos;
	
	
	protected JButton jButtonProcesarInformacionBajasActivosFijos;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoBajasActivosFijos;
	protected JCheckBox jCheckBoxPostAccionSinCerrarBajasActivosFijos;
	protected JCheckBox jCheckBoxPostAccionSinMensajeBajasActivosFijos;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarBajasActivosFijos;
	protected JButton jButtonModificarToolBarBajasActivosFijos;
	protected JButton jButtonActualizarToolBarBajasActivosFijos;
    protected JButton jButtonEliminarToolBarBajasActivosFijos;
	protected JButton jButtonCancelarToolBarBajasActivosFijos;
    protected JButton jButtonGuardarCambiosToolBarBajasActivosFijos;
	protected JButton jButtonGuardarCambiosTablaToolBarBajasActivosFijos;
	protected JButton jButtonMostrarOcultarTablaToolBarBajasActivosFijos;
	protected JButton jButtonCerrarToolBarBajasActivosFijos;
	
	protected JButton jButtonProcesarInformacionToolBarBajasActivosFijos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoBajasActivosFijos;
	protected JMenuItem jMenuItemModificarBajasActivosFijos;
	protected JMenuItem jMenuItemActualizarBajasActivosFijos;
    protected JMenuItem jMenuItemEliminarBajasActivosFijos;
	protected JMenuItem jMenuItemCancelarBajasActivosFijos;
    protected JMenuItem jMenuItemGuardarCambiosBajasActivosFijos;
	protected JMenuItem jMenuItemGuardarCambiosTablaBajasActivosFijos;
	protected JMenuItem jMenuItemCerrarBajasActivosFijos;
	protected JMenuItem jMenuItemDetalleCerrarBajasActivosFijos;
	protected JMenuItem jMenuItemDetalleMostarOcultarBajasActivosFijos;
	
	protected JMenuItem jMenuItemProcesarInformacionBajasActivosFijos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosBajasActivosFijos;
	protected JMenuItem jMenuItemMostrarOcultarBajasActivosFijos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesBajasActivosFijos;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesBajasActivosFijos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesBajasActivosFijos;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioBajasActivosFijos;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidBajasActivosFijos;
	public JLabel jLabelIdBajasActivosFijos;
	public JLabel jLabelidBajasActivosFijos;
	public JButton jButtonidBajasActivosFijosBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_sub_grupoBajasActivosFijos;
	public JLabel jLabelcodigo_sub_grupoBajasActivosFijos;
	public JTextField jTextFieldcodigo_sub_grupoBajasActivosFijos;
	public JButton jButtoncodigo_sub_grupoBajasActivosFijosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_sub_grupoBajasActivosFijos;
	public JLabel jLabelnombre_sub_grupoBajasActivosFijos;
	public JTextArea jTextAreanombre_sub_grupoBajasActivosFijos;
	public JScrollPane jscrollPanenombre_sub_grupoBajasActivosFijos;
	public JButton jButtonnombre_sub_grupoBajasActivosFijosBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_detalle_grupoBajasActivosFijos;
	public JLabel jLabelcodigo_detalle_grupoBajasActivosFijos;
	public JTextField jTextFieldcodigo_detalle_grupoBajasActivosFijos;
	public JButton jButtoncodigo_detalle_grupoBajasActivosFijosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_detalle_grupoBajasActivosFijos;
	public JLabel jLabelnombre_detalle_grupoBajasActivosFijos;
	public JTextArea jTextAreanombre_detalle_grupoBajasActivosFijos;
	public JScrollPane jscrollPanenombre_detalle_grupoBajasActivosFijos;
	public JButton jButtonnombre_detalle_grupoBajasActivosFijosBusqueda= new JButtonMe();

	public JPanel jPanelclaveBajasActivosFijos;
	public JLabel jLabelclaveBajasActivosFijos;
	public JTextField jTextFieldclaveBajasActivosFijos;
	public JButton jButtonclaveBajasActivosFijosBusqueda= new JButtonMe();

	public JPanel jPanelnombreBajasActivosFijos;
	public JLabel jLabelnombreBajasActivosFijos;
	public JTextArea jTextAreanombreBajasActivosFijos;
	public JScrollPane jscrollPanenombreBajasActivosFijos;
	public JButton jButtonnombreBajasActivosFijosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_compraBajasActivosFijos;
	public JLabel jLabelfecha_compraBajasActivosFijos;
	//public JFormattedTextField jDateChooserfecha_compraBajasActivosFijos;

	public JDateChooser jDateChooserfecha_compraBajasActivosFijos;
	public JButton jButtonfecha_compraBajasActivosFijosBusqueda= new JButtonMe();

	public JPanel jPanelvida_utilBajasActivosFijos;
	public JLabel jLabelvida_utilBajasActivosFijos;
	public JTextField jTextFieldvida_utilBajasActivosFijos;
	public JButton jButtonvida_utilBajasActivosFijosBusqueda= new JButtonMe();

	public JPanel jPanelcosto_de_compraBajasActivosFijos;
	public JLabel jLabelcosto_de_compraBajasActivosFijos;
	public JTextField jTextFieldcosto_de_compraBajasActivosFijos;
	public JButton jButtoncosto_de_compraBajasActivosFijosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaBajasActivosFijos;
	public JLabel jLabelid_empresaBajasActivosFijos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaBajasActivosFijos;
	public JButton jButtonid_empresaBajasActivosFijos= new JButtonMe();
	public JButton jButtonid_empresaBajasActivosFijosUpdate= new JButtonMe();
	public JButton jButtonid_empresaBajasActivosFijosBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesBajasActivosFijos;
	
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
	public int iHeightFormulario=1078;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public BajasActivosFijosDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposBajasActivosFijos=new JPanel();
				this.jPanelAccionesFormularioBajasActivosFijos=new JPanel();
				this.jmenuBarDetalleBajasActivosFijos=new JMenuBar();
				this.jTtoolBarDetalleBajasActivosFijos=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public BajasActivosFijosDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("BajasActivosFijos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public BajasActivosFijosDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("BajasActivosFijos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public BajasActivosFijosDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("BajasActivosFijos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public BajasActivosFijosDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("BajasActivosFijos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public BajasActivosFijosDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("BajasActivosFijos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarBajasActivosFijos() {
		return this.jButtonActualizarToolBarBajasActivosFijos;
	}
	
	public JButton getjButtonEliminarToolBarBajasActivosFijos() {
		return this.jButtonEliminarToolBarBajasActivosFijos;
	}
	
	public JButton getjButtonCancelarToolBarBajasActivosFijos() {
		return this.jButtonCancelarToolBarBajasActivosFijos;
	}		
	
	public JButton getjButtonProcesarInformacionBajasActivosFijos() {
		return this.jButtonProcesarInformacionBajasActivosFijos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionBajasActivosFijos)	{
		this.jButtonProcesarInformacionBajasActivosFijos = jButtonProcesarInformacionBajasActivosFijos;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesBajasActivosFijos() {
		return this.jComboBoxTiposAccionesBajasActivosFijos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesBajasActivosFijos(
			JComboBox jComboBoxTiposRelacionesBajasActivosFijos) {
		this.jComboBoxTiposRelacionesBajasActivosFijos = jComboBoxTiposRelacionesBajasActivosFijos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesBajasActivosFijos(
			JComboBox jComboBoxTiposAccionesBajasActivosFijos) {
		this.jComboBoxTiposAccionesBajasActivosFijos = jComboBoxTiposAccionesBajasActivosFijos;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioBajasActivosFijos() {
		return this.jComboBoxTiposAccionesFormularioBajasActivosFijos;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioBajasActivosFijos(
			JComboBox jComboBoxTiposAccionesFormularioBajasActivosFijos) {
		this.jComboBoxTiposAccionesFormularioBajasActivosFijos = jComboBoxTiposAccionesFormularioBajasActivosFijos;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.bajasactivosfijosSessionBean=new BajasActivosFijosSessionBean();
		
		this.bajasactivosfijosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.bajasactivosfijosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.bajasactivosfijosSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		BajasActivosFijosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		BajasActivosFijosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		BajasActivosFijosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Bajas Activos Fijos MANTENIMIENTO"));
		
		
		if(iWidth > 1150) {
			iWidth=1150;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.bajasactivosfijosSessionBean.getEsGuardarRelacionado()) {
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
	
		BajasActivosFijosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleBajasActivosFijos= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarBajasActivosFijos=new JButtonMe();
				this.jButtonModificarToolBarBajasActivosFijos=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarBajasActivosFijos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarBajasActivosFijos,this.jTtoolBarDetalleBajasActivosFijos,
							"actualizar","actualizar","Actualizar"+" "+BajasActivosFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarBajasActivosFijos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarBajasActivosFijos,this.jTtoolBarDetalleBajasActivosFijos,
							"eliminar","eliminar","Eliminar"+" "+BajasActivosFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarBajasActivosFijos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarBajasActivosFijos,this.jTtoolBarDetalleBajasActivosFijos,
							"cancelar","cancelar","Cancelar"+" "+BajasActivosFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarBajasActivosFijos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarBajasActivosFijos,this.jTtoolBarDetalleBajasActivosFijos,
							"guardarcambios","guardarcambios","Guardar"+" "+BajasActivosFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarBajasActivosFijos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarBajasActivosFijos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarBajasActivosFijos,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleBajasActivosFijos=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleBajasActivosFijos=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoBajasActivosFijos=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesBajasActivosFijos=new JMenuMe("Acciones");
		this.jmenuDetalleDatosBajasActivosFijos=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoBajasActivosFijos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoBajasActivosFijos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoBajasActivosFijos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoBajasActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarBajasActivosFijos= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarBajasActivosFijos.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarBajasActivosFijos,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarBajasActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarBajasActivosFijos= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarBajasActivosFijos.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarBajasActivosFijos,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarBajasActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarBajasActivosFijos= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarBajasActivosFijos.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarBajasActivosFijos,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarBajasActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarBajasActivosFijos= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarBajasActivosFijos.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarBajasActivosFijos,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarBajasActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosBajasActivosFijos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosBajasActivosFijos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosBajasActivosFijos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosBajasActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarBajasActivosFijos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarBajasActivosFijos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarBajasActivosFijos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarBajasActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarBajasActivosFijos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarBajasActivosFijos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarBajasActivosFijos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarBajasActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarBajasActivosFijos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarBajasActivosFijos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarBajasActivosFijos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarBajasActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarBajasActivosFijos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarBajasActivosFijos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarBajasActivosFijos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarBajasActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoBajasActivosFijos.add(this.jMenuItemDetalleCerrarBajasActivosFijos);
		
		this.jmenuDetalleAccionesBajasActivosFijos.add(this.jMenuItemActualizarBajasActivosFijos);
		this.jmenuDetalleAccionesBajasActivosFijos.add(this.jMenuItemEliminarBajasActivosFijos);
		this.jmenuDetalleAccionesBajasActivosFijos.add(this.jMenuItemCancelarBajasActivosFijos);		
		
		//this.jmenuDetalleDatosBajasActivosFijos.add(this.jMenuItemDetalleAbrirOrderByBajasActivosFijos);				
		this.jmenuDetalleDatosBajasActivosFijos.add(this.jMenuItemDetalleMostarOcultarBajasActivosFijos);				
				
		//this.jmenuDetalleAccionesBajasActivosFijos.add(this.jMenuItemGuardarCambiosBajasActivosFijos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoBajasActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesBajasActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosBajasActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleBajasActivosFijos.add(this.jmenuDetalleArchivoBajasActivosFijos);		
		this.jmenuBarDetalleBajasActivosFijos.add(this.jmenuDetalleAccionesBajasActivosFijos);		
		this.jmenuBarDetalleBajasActivosFijos.add(this.jmenuDetalleDatosBajasActivosFijos);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleBajasActivosFijos);				
	}
	
	
	public void inicializarElementosCamposBajasActivosFijos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdBajasActivosFijos = new JLabelMe();
		jLabelIdBajasActivosFijos.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdBajasActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdBajasActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdBajasActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdBajasActivosFijos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidBajasActivosFijos = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidBajasActivosFijos.setToolTipText(BajasActivosFijosConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutBajasActivosFijos= new GridBagLayout();

		this.jPanelidBajasActivosFijos.setLayout(this.gridaBagLayoutBajasActivosFijos);

		jLabelidBajasActivosFijos = new JLabel();
		jLabelidBajasActivosFijos.setText("Id");

		jLabelidBajasActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidBajasActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidBajasActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigo_sub_grupoBajasActivosFijos = new JLabelMe();
		this.jLabelcodigo_sub_grupoBajasActivosFijos.setText(""+BajasActivosFijosConstantesFunciones.LABEL_CODIGOSUBGRUPO+" : *");
		this.jLabelcodigo_sub_grupoBajasActivosFijos.setToolTipText("Codigo Sub Grupo");
		this.jLabelcodigo_sub_grupoBajasActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcodigo_sub_grupoBajasActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcodigo_sub_grupoBajasActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_sub_grupoBajasActivosFijos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_sub_grupoBajasActivosFijos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_sub_grupoBajasActivosFijos.setToolTipText(BajasActivosFijosConstantesFunciones.LABEL_CODIGOSUBGRUPO);
		this.gridaBagLayoutBajasActivosFijos = new GridBagLayout();
		this.jPanelcodigo_sub_grupoBajasActivosFijos.setLayout(this.gridaBagLayoutBajasActivosFijos);


		jTextFieldcodigo_sub_grupoBajasActivosFijos= new JTextFieldMe();

		jTextFieldcodigo_sub_grupoBajasActivosFijos.setEnabled(false);
		jTextFieldcodigo_sub_grupoBajasActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_sub_grupoBajasActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_sub_grupoBajasActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_sub_grupoBajasActivosFijos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_sub_grupoBajasActivosFijosBusqueda= new JButtonMe();
		this.jButtoncodigo_sub_grupoBajasActivosFijosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_sub_grupoBajasActivosFijosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_sub_grupoBajasActivosFijosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_sub_grupoBajasActivosFijosBusqueda.setText("U");
		this.jButtoncodigo_sub_grupoBajasActivosFijosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_sub_grupoBajasActivosFijosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_sub_grupoBajasActivosFijosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_sub_grupoBajasActivosFijos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_sub_grupoBajasActivosFijos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_sub_grupoBajasActivosFijosBusqueda"));

		if(this.bajasactivosfijosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_sub_grupoBajasActivosFijosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_sub_grupoBajasActivosFijos = new JLabelMe();
		this.jLabelnombre_sub_grupoBajasActivosFijos.setText(""+BajasActivosFijosConstantesFunciones.LABEL_NOMBRESUBGRUPO+" : *");
		this.jLabelnombre_sub_grupoBajasActivosFijos.setToolTipText("Nombre Sub Grupo");
		this.jLabelnombre_sub_grupoBajasActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_sub_grupoBajasActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_sub_grupoBajasActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_sub_grupoBajasActivosFijos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_sub_grupoBajasActivosFijos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_sub_grupoBajasActivosFijos.setToolTipText(BajasActivosFijosConstantesFunciones.LABEL_NOMBRESUBGRUPO);
		this.gridaBagLayoutBajasActivosFijos = new GridBagLayout();
		this.jPanelnombre_sub_grupoBajasActivosFijos.setLayout(this.gridaBagLayoutBajasActivosFijos);


		jTextAreanombre_sub_grupoBajasActivosFijos= new JTextAreaMe();
		jTextAreanombre_sub_grupoBajasActivosFijos.setEnabled(false);
		jTextAreanombre_sub_grupoBajasActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_sub_grupoBajasActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_sub_grupoBajasActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_sub_grupoBajasActivosFijos.setLineWrap(true);
		jTextAreanombre_sub_grupoBajasActivosFijos.setWrapStyleWord(true);
		jTextAreanombre_sub_grupoBajasActivosFijos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_sub_grupoBajasActivosFijos.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_sub_grupoBajasActivosFijos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_sub_grupoBajasActivosFijos = new JScrollPane(jTextAreanombre_sub_grupoBajasActivosFijos);
		jscrollPanenombre_sub_grupoBajasActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_sub_grupoBajasActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_sub_grupoBajasActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_sub_grupoBajasActivosFijosBusqueda= new JButtonMe();
		this.jButtonnombre_sub_grupoBajasActivosFijosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_sub_grupoBajasActivosFijosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_sub_grupoBajasActivosFijosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_sub_grupoBajasActivosFijosBusqueda.setText("U");
		this.jButtonnombre_sub_grupoBajasActivosFijosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_sub_grupoBajasActivosFijosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_sub_grupoBajasActivosFijosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_sub_grupoBajasActivosFijos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_sub_grupoBajasActivosFijos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_sub_grupoBajasActivosFijosBusqueda"));

		if(this.bajasactivosfijosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_sub_grupoBajasActivosFijosBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_detalle_grupoBajasActivosFijos = new JLabelMe();
		this.jLabelcodigo_detalle_grupoBajasActivosFijos.setText(""+BajasActivosFijosConstantesFunciones.LABEL_CODIGODETALLEGRUPO+" : *");
		this.jLabelcodigo_detalle_grupoBajasActivosFijos.setToolTipText("Codigo Detalle Grupo");
		this.jLabelcodigo_detalle_grupoBajasActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcodigo_detalle_grupoBajasActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcodigo_detalle_grupoBajasActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_detalle_grupoBajasActivosFijos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_detalle_grupoBajasActivosFijos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_detalle_grupoBajasActivosFijos.setToolTipText(BajasActivosFijosConstantesFunciones.LABEL_CODIGODETALLEGRUPO);
		this.gridaBagLayoutBajasActivosFijos = new GridBagLayout();
		this.jPanelcodigo_detalle_grupoBajasActivosFijos.setLayout(this.gridaBagLayoutBajasActivosFijos);


		jTextFieldcodigo_detalle_grupoBajasActivosFijos= new JTextFieldMe();

		jTextFieldcodigo_detalle_grupoBajasActivosFijos.setEnabled(false);
		jTextFieldcodigo_detalle_grupoBajasActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_detalle_grupoBajasActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_detalle_grupoBajasActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_detalle_grupoBajasActivosFijos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_detalle_grupoBajasActivosFijosBusqueda= new JButtonMe();
		this.jButtoncodigo_detalle_grupoBajasActivosFijosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_detalle_grupoBajasActivosFijosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_detalle_grupoBajasActivosFijosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_detalle_grupoBajasActivosFijosBusqueda.setText("U");
		this.jButtoncodigo_detalle_grupoBajasActivosFijosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_detalle_grupoBajasActivosFijosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_detalle_grupoBajasActivosFijosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_detalle_grupoBajasActivosFijos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_detalle_grupoBajasActivosFijos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_detalle_grupoBajasActivosFijosBusqueda"));

		if(this.bajasactivosfijosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_detalle_grupoBajasActivosFijosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_detalle_grupoBajasActivosFijos = new JLabelMe();
		this.jLabelnombre_detalle_grupoBajasActivosFijos.setText(""+BajasActivosFijosConstantesFunciones.LABEL_NOMBREDETALLEGRUPO+" : *");
		this.jLabelnombre_detalle_grupoBajasActivosFijos.setToolTipText("Nombre Detalle Grupo");
		this.jLabelnombre_detalle_grupoBajasActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_detalle_grupoBajasActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_detalle_grupoBajasActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_detalle_grupoBajasActivosFijos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_detalle_grupoBajasActivosFijos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_detalle_grupoBajasActivosFijos.setToolTipText(BajasActivosFijosConstantesFunciones.LABEL_NOMBREDETALLEGRUPO);
		this.gridaBagLayoutBajasActivosFijos = new GridBagLayout();
		this.jPanelnombre_detalle_grupoBajasActivosFijos.setLayout(this.gridaBagLayoutBajasActivosFijos);


		jTextAreanombre_detalle_grupoBajasActivosFijos= new JTextAreaMe();
		jTextAreanombre_detalle_grupoBajasActivosFijos.setEnabled(false);
		jTextAreanombre_detalle_grupoBajasActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_detalle_grupoBajasActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_detalle_grupoBajasActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_detalle_grupoBajasActivosFijos.setLineWrap(true);
		jTextAreanombre_detalle_grupoBajasActivosFijos.setWrapStyleWord(true);
		jTextAreanombre_detalle_grupoBajasActivosFijos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_detalle_grupoBajasActivosFijos.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_detalle_grupoBajasActivosFijos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_detalle_grupoBajasActivosFijos = new JScrollPane(jTextAreanombre_detalle_grupoBajasActivosFijos);
		jscrollPanenombre_detalle_grupoBajasActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_detalle_grupoBajasActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_detalle_grupoBajasActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_detalle_grupoBajasActivosFijosBusqueda= new JButtonMe();
		this.jButtonnombre_detalle_grupoBajasActivosFijosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_detalle_grupoBajasActivosFijosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_detalle_grupoBajasActivosFijosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_detalle_grupoBajasActivosFijosBusqueda.setText("U");
		this.jButtonnombre_detalle_grupoBajasActivosFijosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_detalle_grupoBajasActivosFijosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_detalle_grupoBajasActivosFijosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_detalle_grupoBajasActivosFijos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_detalle_grupoBajasActivosFijos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_detalle_grupoBajasActivosFijosBusqueda"));

		if(this.bajasactivosfijosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_detalle_grupoBajasActivosFijosBusqueda.setVisible(false);		}


					
		this.jLabelclaveBajasActivosFijos = new JLabelMe();
		this.jLabelclaveBajasActivosFijos.setText(""+BajasActivosFijosConstantesFunciones.LABEL_CLAVE+" : *");
		this.jLabelclaveBajasActivosFijos.setToolTipText("Clave");
		this.jLabelclaveBajasActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelclaveBajasActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelclaveBajasActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelclaveBajasActivosFijos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelclaveBajasActivosFijos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelclaveBajasActivosFijos.setToolTipText(BajasActivosFijosConstantesFunciones.LABEL_CLAVE);
		this.gridaBagLayoutBajasActivosFijos = new GridBagLayout();
		this.jPanelclaveBajasActivosFijos.setLayout(this.gridaBagLayoutBajasActivosFijos);


		jTextFieldclaveBajasActivosFijos= new JTextFieldMe();

		jTextFieldclaveBajasActivosFijos.setEnabled(false);
		jTextFieldclaveBajasActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldclaveBajasActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldclaveBajasActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldclaveBajasActivosFijos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonclaveBajasActivosFijosBusqueda= new JButtonMe();
		this.jButtonclaveBajasActivosFijosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonclaveBajasActivosFijosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonclaveBajasActivosFijosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonclaveBajasActivosFijosBusqueda.setText("U");
		this.jButtonclaveBajasActivosFijosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonclaveBajasActivosFijosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonclaveBajasActivosFijosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldclaveBajasActivosFijos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldclaveBajasActivosFijos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"claveBajasActivosFijosBusqueda"));

		if(this.bajasactivosfijosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonclaveBajasActivosFijosBusqueda.setVisible(false);		}


					
		this.jLabelnombreBajasActivosFijos = new JLabelMe();
		this.jLabelnombreBajasActivosFijos.setText(""+BajasActivosFijosConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreBajasActivosFijos.setToolTipText("Nombre");
		this.jLabelnombreBajasActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreBajasActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreBajasActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreBajasActivosFijos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreBajasActivosFijos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreBajasActivosFijos.setToolTipText(BajasActivosFijosConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutBajasActivosFijos = new GridBagLayout();
		this.jPanelnombreBajasActivosFijos.setLayout(this.gridaBagLayoutBajasActivosFijos);


		jTextAreanombreBajasActivosFijos= new JTextAreaMe();
		jTextAreanombreBajasActivosFijos.setEnabled(false);
		jTextAreanombreBajasActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBajasActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBajasActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBajasActivosFijos.setLineWrap(true);
		jTextAreanombreBajasActivosFijos.setWrapStyleWord(true);
		jTextAreanombreBajasActivosFijos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreBajasActivosFijos.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreBajasActivosFijos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreBajasActivosFijos = new JScrollPane(jTextAreanombreBajasActivosFijos);
		jscrollPanenombreBajasActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreBajasActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreBajasActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreBajasActivosFijosBusqueda= new JButtonMe();
		this.jButtonnombreBajasActivosFijosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreBajasActivosFijosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreBajasActivosFijosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreBajasActivosFijosBusqueda.setText("U");
		this.jButtonnombreBajasActivosFijosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreBajasActivosFijosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreBajasActivosFijosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreBajasActivosFijos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreBajasActivosFijos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreBajasActivosFijosBusqueda"));

		if(this.bajasactivosfijosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreBajasActivosFijosBusqueda.setVisible(false);		}


					
		this.jLabelfecha_compraBajasActivosFijos = new JLabelMe();
		this.jLabelfecha_compraBajasActivosFijos.setText(""+BajasActivosFijosConstantesFunciones.LABEL_FECHACOMPRA+" : *");
		this.jLabelfecha_compraBajasActivosFijos.setToolTipText("Fecha Compra");
		this.jLabelfecha_compraBajasActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_compraBajasActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_compraBajasActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_compraBajasActivosFijos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_compraBajasActivosFijos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_compraBajasActivosFijos.setToolTipText(BajasActivosFijosConstantesFunciones.LABEL_FECHACOMPRA);
		this.gridaBagLayoutBajasActivosFijos = new GridBagLayout();
		this.jPanelfecha_compraBajasActivosFijos.setLayout(this.gridaBagLayoutBajasActivosFijos);


		//jFormattedTextFieldfecha_compraBajasActivosFijos= new JFormattedTextFieldMe();

		jDateChooserfecha_compraBajasActivosFijos= new JDateChooser();
		jDateChooserfecha_compraBajasActivosFijos.setEnabled(false);
		jDateChooserfecha_compraBajasActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_compraBajasActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_compraBajasActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_compraBajasActivosFijos,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_compraBajasActivosFijos.setDate(new Date());
		jDateChooserfecha_compraBajasActivosFijos.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_compraBajasActivosFijos.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_compraBajasActivosFijosBusqueda= new JButtonMe();
		this.jButtonfecha_compraBajasActivosFijosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_compraBajasActivosFijosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_compraBajasActivosFijosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_compraBajasActivosFijosBusqueda.setText("U");
		this.jButtonfecha_compraBajasActivosFijosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_compraBajasActivosFijosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_compraBajasActivosFijosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_compraBajasActivosFijos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_compraBajasActivosFijos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_compraBajasActivosFijosBusqueda"));

		if(this.bajasactivosfijosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_compraBajasActivosFijosBusqueda.setVisible(false);		}


					
		this.jLabelvida_utilBajasActivosFijos = new JLabelMe();
		this.jLabelvida_utilBajasActivosFijos.setText(""+BajasActivosFijosConstantesFunciones.LABEL_VIDAUTIL+" : *");
		this.jLabelvida_utilBajasActivosFijos.setToolTipText("Va Util");
		this.jLabelvida_utilBajasActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvida_utilBajasActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvida_utilBajasActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvida_utilBajasActivosFijos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvida_utilBajasActivosFijos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvida_utilBajasActivosFijos.setToolTipText(BajasActivosFijosConstantesFunciones.LABEL_VIDAUTIL);
		this.gridaBagLayoutBajasActivosFijos = new GridBagLayout();
		this.jPanelvida_utilBajasActivosFijos.setLayout(this.gridaBagLayoutBajasActivosFijos);


		jTextFieldvida_utilBajasActivosFijos= new JTextFieldMe();
		jTextFieldvida_utilBajasActivosFijos.setEnabled(false);
		jTextFieldvida_utilBajasActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvida_utilBajasActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvida_utilBajasActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvida_utilBajasActivosFijos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvida_utilBajasActivosFijos.setText("0.0");

		this.jButtonvida_utilBajasActivosFijosBusqueda= new JButtonMe();
		this.jButtonvida_utilBajasActivosFijosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvida_utilBajasActivosFijosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvida_utilBajasActivosFijosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvida_utilBajasActivosFijosBusqueda.setText("U");
		this.jButtonvida_utilBajasActivosFijosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvida_utilBajasActivosFijosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvida_utilBajasActivosFijosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvida_utilBajasActivosFijos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvida_utilBajasActivosFijos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"vida_utilBajasActivosFijosBusqueda"));

		if(this.bajasactivosfijosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvida_utilBajasActivosFijosBusqueda.setVisible(false);		}


					
		this.jLabelcosto_de_compraBajasActivosFijos = new JLabelMe();
		this.jLabelcosto_de_compraBajasActivosFijos.setText(""+BajasActivosFijosConstantesFunciones.LABEL_COSTODECOMPRA+" : *");
		this.jLabelcosto_de_compraBajasActivosFijos.setToolTipText("Costo Compra");
		this.jLabelcosto_de_compraBajasActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_de_compraBajasActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_de_compraBajasActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcosto_de_compraBajasActivosFijos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcosto_de_compraBajasActivosFijos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcosto_de_compraBajasActivosFijos.setToolTipText(BajasActivosFijosConstantesFunciones.LABEL_COSTODECOMPRA);
		this.gridaBagLayoutBajasActivosFijos = new GridBagLayout();
		this.jPanelcosto_de_compraBajasActivosFijos.setLayout(this.gridaBagLayoutBajasActivosFijos);


		jTextFieldcosto_de_compraBajasActivosFijos= new JTextFieldMe();
		jTextFieldcosto_de_compraBajasActivosFijos.setEnabled(false);
		jTextFieldcosto_de_compraBajasActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_de_compraBajasActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_de_compraBajasActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcosto_de_compraBajasActivosFijos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcosto_de_compraBajasActivosFijos.setText("0.0");

		this.jButtoncosto_de_compraBajasActivosFijosBusqueda= new JButtonMe();
		this.jButtoncosto_de_compraBajasActivosFijosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_de_compraBajasActivosFijosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_de_compraBajasActivosFijosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncosto_de_compraBajasActivosFijosBusqueda.setText("U");
		this.jButtoncosto_de_compraBajasActivosFijosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncosto_de_compraBajasActivosFijosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncosto_de_compraBajasActivosFijosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcosto_de_compraBajasActivosFijos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcosto_de_compraBajasActivosFijos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"costo_de_compraBajasActivosFijosBusqueda"));

		if(this.bajasactivosfijosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncosto_de_compraBajasActivosFijosBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysBajasActivosFijos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaBajasActivosFijos = new JLabelMe();
		this.jLabelid_empresaBajasActivosFijos.setText(""+BajasActivosFijosConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaBajasActivosFijos.setToolTipText("Empresa");
		this.jLabelid_empresaBajasActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaBajasActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaBajasActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaBajasActivosFijos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaBajasActivosFijos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaBajasActivosFijos.setToolTipText(BajasActivosFijosConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutBajasActivosFijos = new GridBagLayout();
		this.jPanelid_empresaBajasActivosFijos.setLayout(this.gridaBagLayoutBajasActivosFijos);


		jComboBoxid_empresaBajasActivosFijos= new JComboBoxMe();
		jComboBoxid_empresaBajasActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaBajasActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaBajasActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaBajasActivosFijos,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaBajasActivosFijos.setEnabled(false);

		this.jButtonid_empresaBajasActivosFijos= new JButtonMe();
		this.jButtonid_empresaBajasActivosFijos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaBajasActivosFijos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaBajasActivosFijos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaBajasActivosFijos.setText("Buscar");
		this.jButtonid_empresaBajasActivosFijos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaBajasActivosFijos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaBajasActivosFijos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaBajasActivosFijos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaBajasActivosFijos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaBajasActivosFijos"));

		this.jButtonid_empresaBajasActivosFijosBusqueda= new JButtonMe();
		this.jButtonid_empresaBajasActivosFijosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaBajasActivosFijosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaBajasActivosFijosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaBajasActivosFijosBusqueda.setText("U");
		this.jButtonid_empresaBajasActivosFijosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaBajasActivosFijosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaBajasActivosFijosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaBajasActivosFijos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaBajasActivosFijos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaBajasActivosFijosBusqueda"));

		if(this.bajasactivosfijosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaBajasActivosFijosBusqueda.setVisible(false);		}

		this.jButtonid_empresaBajasActivosFijosUpdate= new JButtonMe();
		this.jButtonid_empresaBajasActivosFijosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaBajasActivosFijosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaBajasActivosFijosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaBajasActivosFijosUpdate.setText("U");
		this.jButtonid_empresaBajasActivosFijosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaBajasActivosFijosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaBajasActivosFijosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaBajasActivosFijos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaBajasActivosFijos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaBajasActivosFijosUpdate"));



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
		//this.jInternalFrameDetalleBajasActivosFijos = new BajasActivosFijosBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Bajas Activos Fijos DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutBajasActivosFijos= new GridBagLayout();
		

		
		String sToolTipBajasActivosFijos="";
		sToolTipBajasActivosFijos=BajasActivosFijosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipBajasActivosFijos+="(ActivosFijos.BajasActivosFijos)";
		}
		
		if(!this.bajasactivosfijosSessionBean.getEsGuardarRelacionado()) {
			sToolTipBajasActivosFijos+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoBajasActivosFijos = new JButtonMe();
		this.jButtonModificarBajasActivosFijos = new JButtonMe();
        this.jButtonActualizarBajasActivosFijos = new JButtonMe();
        this.jButtonEliminarBajasActivosFijos = new JButtonMe();
        this.jButtonCancelarBajasActivosFijos = new JButtonMe();
        this.jButtonGuardarCambiosBajasActivosFijos = new JButtonMe();
		this.jButtonGuardarCambiosTablaBajasActivosFijos = new JButtonMe();
		this.jButtonCerrarBajasActivosFijos = new JButtonMe();
		
		this.jScrollPanelDatosBajasActivosFijos = new JScrollPane();   
        this.jScrollPanelDatosEdicionBajasActivosFijos = new JScrollPane();
		this.jScrollPanelDatosGeneralBajasActivosFijos = new JScrollPane();
				
		
		
		this.jPanelCamposBajasActivosFijos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosBajasActivosFijos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesBajasActivosFijos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioBajasActivosFijos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Bajas Activos Fijos";
		
		if(!this.bajasactivosfijosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosBajasActivosFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Bajas Activos Fijoses" + this.sPath));
		} else {
			this.jScrollPanelDatosBajasActivosFijos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionBajasActivosFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralBajasActivosFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposBajasActivosFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposBajasActivosFijos.setName("jPanelCamposBajasActivosFijos"); 

		this.jPanelCamposOcultosBajasActivosFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosBajasActivosFijos.setName("jPanelCamposOcultosBajasActivosFijos"); 

        this.jPanelAccionesBajasActivosFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesBajasActivosFijos.setToolTipText("Acciones");
        this.jPanelAccionesBajasActivosFijos.setName("Acciones"); 

		this.jPanelAccionesFormularioBajasActivosFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioBajasActivosFijos.setToolTipText("Acciones");
        this.jPanelAccionesFormularioBajasActivosFijos.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionBajasActivosFijos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralBajasActivosFijos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosBajasActivosFijos, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposBajasActivosFijos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosBajasActivosFijos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioBajasActivosFijos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoBajasActivosFijos.setText("Nuevo");
		this.jButtonModificarBajasActivosFijos.setText("Editar");
        this.jButtonActualizarBajasActivosFijos.setText("Actualizar");
        this.jButtonEliminarBajasActivosFijos.setText("Eliminar");
        this.jButtonCancelarBajasActivosFijos.setText("Cancelar");
        this.jButtonGuardarCambiosBajasActivosFijos.setText("Guardar");
		this.jButtonGuardarCambiosTablaBajasActivosFijos.setText("Guardar");
		this.jButtonCerrarBajasActivosFijos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoBajasActivosFijos,"nuevo_button","Nuevo",this.bajasactivosfijosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarBajasActivosFijos,"modificar_button","Editar",this.bajasactivosfijosSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarBajasActivosFijos,"actualizar_button","Actualizar",this.bajasactivosfijosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarBajasActivosFijos,"eliminar_button","Eliminar",this.bajasactivosfijosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarBajasActivosFijos,"cancelar_button","Cancelar",this.bajasactivosfijosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosBajasActivosFijos,"guardarcambios_button","Guardar",this.bajasactivosfijosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaBajasActivosFijos,"guardarcambiostabla_button","Guardar",this.bajasactivosfijosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarBajasActivosFijos,"cerrar_button","Salir",this.bajasactivosfijosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoBajasActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarBajasActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosBajasActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaBajasActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarBajasActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarBajasActivosFijos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarBajasActivosFijos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarBajasActivosFijos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoBajasActivosFijos.setToolTipText("Nuevo"+" "+BajasActivosFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarBajasActivosFijos.setToolTipText("Editar"+" "+BajasActivosFijosConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarBajasActivosFijos.setToolTipText("Actualizar"+" "+BajasActivosFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarBajasActivosFijos.setToolTipText("Eliminar)"+" "+BajasActivosFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarBajasActivosFijos.setToolTipText("Cancelar"+" "+BajasActivosFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosBajasActivosFijos.setToolTipText("Guardar"+" "+BajasActivosFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaBajasActivosFijos.setToolTipText("Guardar"+" "+BajasActivosFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarBajasActivosFijos.setToolTipText("Salir"+" "+BajasActivosFijosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoBajasActivosFijos";
		inputMap = this.jButtonNuevoBajasActivosFijos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoBajasActivosFijos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoBajasActivosFijos"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarBajasActivosFijos";
		inputMap = this.jButtonActualizarBajasActivosFijos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarBajasActivosFijos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarBajasActivosFijos"));
		
		//ELIMINAR
		sMapKey = "EliminarBajasActivosFijos";
		inputMap = this.jButtonEliminarBajasActivosFijos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarBajasActivosFijos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarBajasActivosFijos"));
		
		//CANCELAR	
		sMapKey = "CancelarBajasActivosFijos";
		inputMap = this.jButtonCancelarBajasActivosFijos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarBajasActivosFijos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarBajasActivosFijos"));
		
		//CERRAR		
		sMapKey = "CerrarBajasActivosFijos";
		inputMap = this.jButtonCerrarBajasActivosFijos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarBajasActivosFijos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarBajasActivosFijos"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaBajasActivosFijos";
		inputMap = this.jButtonGuardarCambiosTablaBajasActivosFijos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaBajasActivosFijos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaBajasActivosFijos"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoBajasActivosFijos = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoBajasActivosFijos.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoBajasActivosFijos.setToolTipText("Nuevo BajasActivosFijos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoBajasActivosFijos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarBajasActivosFijos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarBajasActivosFijos.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarBajasActivosFijos.setToolTipText("Sin Cerrar Ventana BajasActivosFijos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarBajasActivosFijos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeBajasActivosFijos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeBajasActivosFijos.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeBajasActivosFijos.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeBajasActivosFijos, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesBajasActivosFijos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesBajasActivosFijos.setText("Accion");
		this.jComboBoxTiposAccionesBajasActivosFijos.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioBajasActivosFijos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioBajasActivosFijos.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioBajasActivosFijos.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesBajasActivosFijos = new JLabelMe();
		
		this.jLabelAccionesBajasActivosFijos.setText("Acciones");		
		this.jLabelAccionesBajasActivosFijos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesBajasActivosFijos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesBajasActivosFijos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposBajasActivosFijos();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysBajasActivosFijos();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesBajasActivosFijos=new JTabbedPane();
		this.jTabbedPaneRelacionesBajasActivosFijos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesBajasActivosFijos,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesBajasActivosFijos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesBajasActivosFijos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesBajasActivosFijos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesBajasActivosFijos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioBajasActivosFijos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioBajasActivosFijos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioBajasActivosFijos.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioBajasActivosFijos, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposBajasActivosFijos = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosBajasActivosFijos = new GridBagLayout();
		
		this.jPanelCamposBajasActivosFijos.setLayout(gridaBagLayoutCamposBajasActivosFijos);
		this.jPanelCamposOcultosBajasActivosFijos.setLayout(gridaBagLayoutCamposOcultosBajasActivosFijos);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsBajasActivosFijos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBajasActivosFijos.gridy = 0;
	this.gridBagConstraintsBajasActivosFijos.gridx = 0;
	this.gridBagConstraintsBajasActivosFijos.ipadx = 0;
	this.gridBagConstraintsBajasActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidBajasActivosFijos.add(jLabelIdBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);



	this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsBajasActivosFijos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBajasActivosFijos.gridy = 0;
	this.gridBagConstraintsBajasActivosFijos.gridx = 1;
	this.gridBagConstraintsBajasActivosFijos.ipadx = 0;
	this.gridBagConstraintsBajasActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidBajasActivosFijos.add(jLabelidBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);


	this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsBajasActivosFijos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBajasActivosFijos.gridy = 0;
	this.gridBagConstraintsBajasActivosFijos.gridx = 0;
	this.gridBagConstraintsBajasActivosFijos.ipadx = 0;
	this.gridBagConstraintsBajasActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaBajasActivosFijos.add(jLabelid_empresaBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
		//this.gridBagConstraintsBajasActivosFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBajasActivosFijos.gridy = 0;
		this.gridBagConstraintsBajasActivosFijos.gridx = 2;
		this.gridBagConstraintsBajasActivosFijos.ipadx = 0;
		this.gridBagConstraintsBajasActivosFijos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaBajasActivosFijos.add(jButtonid_empresaBajasActivosFijosBusqueda, this.gridBagConstraintsBajasActivosFijos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
		//this.gridBagConstraintsBajasActivosFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBajasActivosFijos.gridy = 0;
		this.gridBagConstraintsBajasActivosFijos.gridx = 3;
		this.gridBagConstraintsBajasActivosFijos.ipadx = 0;
		this.gridBagConstraintsBajasActivosFijos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaBajasActivosFijos.add(jButtonid_empresaBajasActivosFijosUpdate, this.gridBagConstraintsBajasActivosFijos);
	}

	this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsBajasActivosFijos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBajasActivosFijos.gridy = 0;
	this.gridBagConstraintsBajasActivosFijos.gridx = 1;
	this.gridBagConstraintsBajasActivosFijos.ipadx = 0;
	this.gridBagConstraintsBajasActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaBajasActivosFijos.add(jComboBoxid_empresaBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);


	this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsBajasActivosFijos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBajasActivosFijos.gridy = 0;
	this.gridBagConstraintsBajasActivosFijos.gridx = 0;
	this.gridBagConstraintsBajasActivosFijos.ipadx = 0;
	this.gridBagConstraintsBajasActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_sub_grupoBajasActivosFijos.add(jLabelcodigo_sub_grupoBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
		//this.gridBagConstraintsBajasActivosFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBajasActivosFijos.gridy = 0;
		this.gridBagConstraintsBajasActivosFijos.gridx = 2;
		this.gridBagConstraintsBajasActivosFijos.ipadx = 0;
		this.gridBagConstraintsBajasActivosFijos.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_sub_grupoBajasActivosFijos.add(jButtoncodigo_sub_grupoBajasActivosFijosBusqueda, this.gridBagConstraintsBajasActivosFijos);
	}

	this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsBajasActivosFijos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBajasActivosFijos.gridy = 0;
	this.gridBagConstraintsBajasActivosFijos.gridx = 1;
	this.gridBagConstraintsBajasActivosFijos.ipadx = 0;
	this.gridBagConstraintsBajasActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_sub_grupoBajasActivosFijos.add(jTextFieldcodigo_sub_grupoBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);


	this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsBajasActivosFijos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBajasActivosFijos.gridy = 0;
	this.gridBagConstraintsBajasActivosFijos.gridx = 0;
	this.gridBagConstraintsBajasActivosFijos.ipadx = 0;
	this.gridBagConstraintsBajasActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_sub_grupoBajasActivosFijos.add(jLabelnombre_sub_grupoBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
		//this.gridBagConstraintsBajasActivosFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBajasActivosFijos.gridy = 0;
		this.gridBagConstraintsBajasActivosFijos.gridx = 2;
		this.gridBagConstraintsBajasActivosFijos.ipadx = 0;
		this.gridBagConstraintsBajasActivosFijos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_sub_grupoBajasActivosFijos.add(jButtonnombre_sub_grupoBajasActivosFijosBusqueda, this.gridBagConstraintsBajasActivosFijos);
	}

	this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsBajasActivosFijos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBajasActivosFijos.gridy = 0;
	this.gridBagConstraintsBajasActivosFijos.gridx = 1;
	this.gridBagConstraintsBajasActivosFijos.ipadx = 0;
	this.gridBagConstraintsBajasActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_sub_grupoBajasActivosFijos.add(jscrollPanenombre_sub_grupoBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);


	this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsBajasActivosFijos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBajasActivosFijos.gridy = 0;
	this.gridBagConstraintsBajasActivosFijos.gridx = 0;
	this.gridBagConstraintsBajasActivosFijos.ipadx = 0;
	this.gridBagConstraintsBajasActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_detalle_grupoBajasActivosFijos.add(jLabelcodigo_detalle_grupoBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
		//this.gridBagConstraintsBajasActivosFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBajasActivosFijos.gridy = 0;
		this.gridBagConstraintsBajasActivosFijos.gridx = 2;
		this.gridBagConstraintsBajasActivosFijos.ipadx = 0;
		this.gridBagConstraintsBajasActivosFijos.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_detalle_grupoBajasActivosFijos.add(jButtoncodigo_detalle_grupoBajasActivosFijosBusqueda, this.gridBagConstraintsBajasActivosFijos);
	}

	this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsBajasActivosFijos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBajasActivosFijos.gridy = 0;
	this.gridBagConstraintsBajasActivosFijos.gridx = 1;
	this.gridBagConstraintsBajasActivosFijos.ipadx = 0;
	this.gridBagConstraintsBajasActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_detalle_grupoBajasActivosFijos.add(jTextFieldcodigo_detalle_grupoBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);


	this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsBajasActivosFijos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBajasActivosFijos.gridy = 0;
	this.gridBagConstraintsBajasActivosFijos.gridx = 0;
	this.gridBagConstraintsBajasActivosFijos.ipadx = 0;
	this.gridBagConstraintsBajasActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_detalle_grupoBajasActivosFijos.add(jLabelnombre_detalle_grupoBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
		//this.gridBagConstraintsBajasActivosFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBajasActivosFijos.gridy = 0;
		this.gridBagConstraintsBajasActivosFijos.gridx = 2;
		this.gridBagConstraintsBajasActivosFijos.ipadx = 0;
		this.gridBagConstraintsBajasActivosFijos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_detalle_grupoBajasActivosFijos.add(jButtonnombre_detalle_grupoBajasActivosFijosBusqueda, this.gridBagConstraintsBajasActivosFijos);
	}

	this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsBajasActivosFijos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBajasActivosFijos.gridy = 0;
	this.gridBagConstraintsBajasActivosFijos.gridx = 1;
	this.gridBagConstraintsBajasActivosFijos.ipadx = 0;
	this.gridBagConstraintsBajasActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_detalle_grupoBajasActivosFijos.add(jscrollPanenombre_detalle_grupoBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);


	this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsBajasActivosFijos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBajasActivosFijos.gridy = 0;
	this.gridBagConstraintsBajasActivosFijos.gridx = 0;
	this.gridBagConstraintsBajasActivosFijos.ipadx = 0;
	this.gridBagConstraintsBajasActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelclaveBajasActivosFijos.add(jLabelclaveBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
		//this.gridBagConstraintsBajasActivosFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBajasActivosFijos.gridy = 0;
		this.gridBagConstraintsBajasActivosFijos.gridx = 2;
		this.gridBagConstraintsBajasActivosFijos.ipadx = 0;
		this.gridBagConstraintsBajasActivosFijos.insets = new Insets(0, 0, 0, 0);
		this.jPanelclaveBajasActivosFijos.add(jButtonclaveBajasActivosFijosBusqueda, this.gridBagConstraintsBajasActivosFijos);
	}

	this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsBajasActivosFijos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBajasActivosFijos.gridy = 0;
	this.gridBagConstraintsBajasActivosFijos.gridx = 1;
	this.gridBagConstraintsBajasActivosFijos.ipadx = 0;
	this.gridBagConstraintsBajasActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelclaveBajasActivosFijos.add(jTextFieldclaveBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);


	this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsBajasActivosFijos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBajasActivosFijos.gridy = 0;
	this.gridBagConstraintsBajasActivosFijos.gridx = 0;
	this.gridBagConstraintsBajasActivosFijos.ipadx = 0;
	this.gridBagConstraintsBajasActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreBajasActivosFijos.add(jLabelnombreBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
		//this.gridBagConstraintsBajasActivosFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBajasActivosFijos.gridy = 0;
		this.gridBagConstraintsBajasActivosFijos.gridx = 2;
		this.gridBagConstraintsBajasActivosFijos.ipadx = 0;
		this.gridBagConstraintsBajasActivosFijos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreBajasActivosFijos.add(jButtonnombreBajasActivosFijosBusqueda, this.gridBagConstraintsBajasActivosFijos);
	}

	this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsBajasActivosFijos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBajasActivosFijos.gridy = 0;
	this.gridBagConstraintsBajasActivosFijos.gridx = 1;
	this.gridBagConstraintsBajasActivosFijos.ipadx = 0;
	this.gridBagConstraintsBajasActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreBajasActivosFijos.add(jscrollPanenombreBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);


	this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsBajasActivosFijos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBajasActivosFijos.gridy = 0;
	this.gridBagConstraintsBajasActivosFijos.gridx = 0;
	this.gridBagConstraintsBajasActivosFijos.ipadx = 0;
	this.gridBagConstraintsBajasActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_compraBajasActivosFijos.add(jLabelfecha_compraBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
		//this.gridBagConstraintsBajasActivosFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBajasActivosFijos.gridy = 0;
		this.gridBagConstraintsBajasActivosFijos.gridx = 2;
		this.gridBagConstraintsBajasActivosFijos.ipadx = 0;
		this.gridBagConstraintsBajasActivosFijos.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_compraBajasActivosFijos.add(jButtonfecha_compraBajasActivosFijosBusqueda, this.gridBagConstraintsBajasActivosFijos);
	}

	this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsBajasActivosFijos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBajasActivosFijos.gridy = 0;
	this.gridBagConstraintsBajasActivosFijos.gridx = 1;
	this.gridBagConstraintsBajasActivosFijos.ipadx = 0;
	this.gridBagConstraintsBajasActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_compraBajasActivosFijos.add(jDateChooserfecha_compraBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);


	this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsBajasActivosFijos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBajasActivosFijos.gridy = 0;
	this.gridBagConstraintsBajasActivosFijos.gridx = 0;
	this.gridBagConstraintsBajasActivosFijos.ipadx = 0;
	this.gridBagConstraintsBajasActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvida_utilBajasActivosFijos.add(jLabelvida_utilBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
		//this.gridBagConstraintsBajasActivosFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBajasActivosFijos.gridy = 0;
		this.gridBagConstraintsBajasActivosFijos.gridx = 2;
		this.gridBagConstraintsBajasActivosFijos.ipadx = 0;
		this.gridBagConstraintsBajasActivosFijos.insets = new Insets(0, 0, 0, 0);
		this.jPanelvida_utilBajasActivosFijos.add(jButtonvida_utilBajasActivosFijosBusqueda, this.gridBagConstraintsBajasActivosFijos);
	}

	this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsBajasActivosFijos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBajasActivosFijos.gridy = 0;
	this.gridBagConstraintsBajasActivosFijos.gridx = 1;
	this.gridBagConstraintsBajasActivosFijos.ipadx = 0;
	this.gridBagConstraintsBajasActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvida_utilBajasActivosFijos.add(jTextFieldvida_utilBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);


	this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsBajasActivosFijos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBajasActivosFijos.gridy = 0;
	this.gridBagConstraintsBajasActivosFijos.gridx = 0;
	this.gridBagConstraintsBajasActivosFijos.ipadx = 0;
	this.gridBagConstraintsBajasActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcosto_de_compraBajasActivosFijos.add(jLabelcosto_de_compraBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
		//this.gridBagConstraintsBajasActivosFijos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBajasActivosFijos.gridy = 0;
		this.gridBagConstraintsBajasActivosFijos.gridx = 2;
		this.gridBagConstraintsBajasActivosFijos.ipadx = 0;
		this.gridBagConstraintsBajasActivosFijos.insets = new Insets(0, 0, 0, 0);
		this.jPanelcosto_de_compraBajasActivosFijos.add(jButtoncosto_de_compraBajasActivosFijosBusqueda, this.gridBagConstraintsBajasActivosFijos);
	}

	this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsBajasActivosFijos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBajasActivosFijos.gridy = 0;
	this.gridBagConstraintsBajasActivosFijos.gridx = 1;
	this.gridBagConstraintsBajasActivosFijos.ipadx = 0;
	this.gridBagConstraintsBajasActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcosto_de_compraBajasActivosFijos.add(jTextFieldcosto_de_compraBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsBajasActivosFijos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBajasActivosFijos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBajasActivosFijos.gridy = iYPanelCamposBajasActivosFijos;
	this.gridBagConstraintsBajasActivosFijos.gridx = iXPanelCamposBajasActivosFijos++;
	this.gridBagConstraintsBajasActivosFijos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBajasActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBajasActivosFijos.add(this.jPanelidBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);



	if(iXPanelCamposBajasActivosFijos % 1==0) {
		iXPanelCamposBajasActivosFijos=0;
		iYPanelCamposBajasActivosFijos++;
	}
	this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsBajasActivosFijos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBajasActivosFijos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBajasActivosFijos.gridy = iYPanelCamposBajasActivosFijos;
	this.gridBagConstraintsBajasActivosFijos.gridx = iXPanelCamposBajasActivosFijos++;
	this.gridBagConstraintsBajasActivosFijos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBajasActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBajasActivosFijos.add(this.jPanelcodigo_sub_grupoBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);



	if(iXPanelCamposBajasActivosFijos % 1==0) {
		iXPanelCamposBajasActivosFijos=0;
		iYPanelCamposBajasActivosFijos++;
	}
	this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsBajasActivosFijos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBajasActivosFijos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBajasActivosFijos.gridy = iYPanelCamposBajasActivosFijos;
	this.gridBagConstraintsBajasActivosFijos.gridx = iXPanelCamposBajasActivosFijos++;
	this.gridBagConstraintsBajasActivosFijos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBajasActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBajasActivosFijos.add(this.jPanelnombre_sub_grupoBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);



	if(iXPanelCamposBajasActivosFijos % 1==0) {
		iXPanelCamposBajasActivosFijos=0;
		iYPanelCamposBajasActivosFijos++;
	}
	this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsBajasActivosFijos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBajasActivosFijos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBajasActivosFijos.gridy = iYPanelCamposBajasActivosFijos;
	this.gridBagConstraintsBajasActivosFijos.gridx = iXPanelCamposBajasActivosFijos++;
	this.gridBagConstraintsBajasActivosFijos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBajasActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBajasActivosFijos.add(this.jPanelcodigo_detalle_grupoBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);



	if(iXPanelCamposBajasActivosFijos % 1==0) {
		iXPanelCamposBajasActivosFijos=0;
		iYPanelCamposBajasActivosFijos++;
	}
	this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsBajasActivosFijos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBajasActivosFijos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBajasActivosFijos.gridy = iYPanelCamposBajasActivosFijos;
	this.gridBagConstraintsBajasActivosFijos.gridx = iXPanelCamposBajasActivosFijos++;
	this.gridBagConstraintsBajasActivosFijos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBajasActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBajasActivosFijos.add(this.jPanelnombre_detalle_grupoBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);



	if(iXPanelCamposBajasActivosFijos % 1==0) {
		iXPanelCamposBajasActivosFijos=0;
		iYPanelCamposBajasActivosFijos++;
	}
	this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsBajasActivosFijos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBajasActivosFijos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBajasActivosFijos.gridy = iYPanelCamposBajasActivosFijos;
	this.gridBagConstraintsBajasActivosFijos.gridx = iXPanelCamposBajasActivosFijos++;
	this.gridBagConstraintsBajasActivosFijos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBajasActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBajasActivosFijos.add(this.jPanelclaveBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);



	if(iXPanelCamposBajasActivosFijos % 1==0) {
		iXPanelCamposBajasActivosFijos=0;
		iYPanelCamposBajasActivosFijos++;
	}
	this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsBajasActivosFijos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBajasActivosFijos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBajasActivosFijos.gridy = iYPanelCamposBajasActivosFijos;
	this.gridBagConstraintsBajasActivosFijos.gridx = iXPanelCamposBajasActivosFijos++;
	this.gridBagConstraintsBajasActivosFijos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBajasActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBajasActivosFijos.add(this.jPanelnombreBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);



	if(iXPanelCamposBajasActivosFijos % 1==0) {
		iXPanelCamposBajasActivosFijos=0;
		iYPanelCamposBajasActivosFijos++;
	}
	this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsBajasActivosFijos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBajasActivosFijos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBajasActivosFijos.gridy = iYPanelCamposBajasActivosFijos;
	this.gridBagConstraintsBajasActivosFijos.gridx = iXPanelCamposBajasActivosFijos++;
	this.gridBagConstraintsBajasActivosFijos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBajasActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBajasActivosFijos.add(this.jPanelfecha_compraBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);



	if(iXPanelCamposBajasActivosFijos % 1==0) {
		iXPanelCamposBajasActivosFijos=0;
		iYPanelCamposBajasActivosFijos++;
	}
	this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsBajasActivosFijos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBajasActivosFijos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBajasActivosFijos.gridy = iYPanelCamposBajasActivosFijos;
	this.gridBagConstraintsBajasActivosFijos.gridx = iXPanelCamposBajasActivosFijos++;
	this.gridBagConstraintsBajasActivosFijos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBajasActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBajasActivosFijos.add(this.jPanelvida_utilBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);



	if(iXPanelCamposBajasActivosFijos % 1==0) {
		iXPanelCamposBajasActivosFijos=0;
		iYPanelCamposBajasActivosFijos++;
	}
	this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsBajasActivosFijos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBajasActivosFijos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBajasActivosFijos.gridy = iYPanelCamposBajasActivosFijos;
	this.gridBagConstraintsBajasActivosFijos.gridx = iXPanelCamposBajasActivosFijos++;
	this.gridBagConstraintsBajasActivosFijos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBajasActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBajasActivosFijos.add(this.jPanelcosto_de_compraBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);



	if(iXPanelCamposBajasActivosFijos % 1==0) {
		iXPanelCamposBajasActivosFijos=0;
		iYPanelCamposBajasActivosFijos++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
	this.gridBagConstraintsBajasActivosFijos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBajasActivosFijos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBajasActivosFijos.gridy = iYPanelCamposOcultosBajasActivosFijos;
	this.gridBagConstraintsBajasActivosFijos.gridx = iXPanelCamposOcultosBajasActivosFijos++;
	this.gridBagConstraintsBajasActivosFijos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBajasActivosFijos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosBajasActivosFijos.add(this.jPanelid_empresaBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);



	if(iXPanelCamposOcultosBajasActivosFijos % 1==0) {
		iXPanelCamposOcultosBajasActivosFijos=0;
		iYPanelCamposOcultosBajasActivosFijos++;
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
			
		GridBagLayout gridaBagLayoutAccionesBajasActivosFijos= new GridBagLayout();
		this.jPanelAccionesBajasActivosFijos.setLayout(gridaBagLayoutAccionesBajasActivosFijos);
		
		GridBagLayout gridaBagLayoutAccionesFormularioBajasActivosFijos= new GridBagLayout();
		this.jPanelAccionesFormularioBajasActivosFijos.setLayout(gridaBagLayoutAccionesFormularioBajasActivosFijos);
		
		this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsBajasActivosFijos.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsBajasActivosFijos.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioBajasActivosFijos.add(this.jComboBoxTiposAccionesFormularioBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsBajasActivosFijos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBajasActivosFijos.gridy = 0;
		this.gridBagConstraintsBajasActivosFijos.gridx = iPosXAccion++;
			
		this.jPanelAccionesBajasActivosFijos.add(this.jButtonModificarBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);							

		this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsBajasActivosFijos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBajasActivosFijos.gridy = 0;
		this.gridBagConstraintsBajasActivosFijos.gridx =iPosXAccion++;
			
		this.jPanelAccionesBajasActivosFijos.add(this.jButtonEliminarBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);
		
			
		this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsBajasActivosFijos.gridy = 0;		
		this.gridBagConstraintsBajasActivosFijos.gridx = iPosXAccion++;
		
		this.jPanelAccionesBajasActivosFijos.add(this.jButtonActualizarBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);


		this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsBajasActivosFijos.gridy = 0;		
		this.gridBagConstraintsBajasActivosFijos.gridx = iPosXAccion++;
		
		this.jPanelAccionesBajasActivosFijos.add(this.jButtonGuardarCambiosBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);	
		
		this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsBajasActivosFijos.gridy = 0;		
		this.gridBagConstraintsBajasActivosFijos.gridx =iPosXAccion++;
		
		this.jPanelAccionesBajasActivosFijos.add(this.jButtonCancelarBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutBajasActivosFijos = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutBajasActivosFijos);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.bajasactivosfijosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();						
			this.gridBagConstraintsBajasActivosFijos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsBajasActivosFijos.gridx = 0;		
			//this.gridBagConstraintsBajasActivosFijos.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBajasActivosFijos.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsBajasActivosFijos.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsBajasActivosFijos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsBajasActivosFijos.gridx =0;
		this.gridBagConstraintsBajasActivosFijos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsBajasActivosFijos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(BajasActivosFijosJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleBajasActivosFijos = new BajasActivosFijosBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Bajas Activos Fijos DATOS");
			
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
			
	        //this.setTitle("[FOR] - Bajas Activos Fijos DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Bajas Activos Fijos Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			BajasActivosFijosModel bajasactivosfijosModel=new BajasActivosFijosModel(this);
			
			//SI USARA CLASE INTERNA
			//BajasActivosFijosModel.BajasActivosFijosFocusTraversalPolicy bajasactivosfijosFocusTraversalPolicy = bajasactivosfijosModel.new BajasActivosFijosFocusTraversalPolicy(this);
			
			//bajasactivosfijosFocusTraversalPolicy.setbajasactivosfijosJInternalFrame(this);
			
			this.setFocusTraversalPolicy(bajasactivosfijosModel);
			
			
			this.jContentPaneDetalleBajasActivosFijos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleBajasActivosFijos = new GridBagLayout();	
			this.jContentPaneDetalleBajasActivosFijos.setLayout(gridaBagLayoutDetalleBajasActivosFijos);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosBajasActivosFijos = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
				this.gridBagConstraintsBajasActivosFijos.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsBajasActivosFijos.gridx = 0;
					
				
				this.jContentPaneDetalleBajasActivosFijos.add(jTtoolBarDetalleBajasActivosFijos, gridBagConstraintsBajasActivosFijos);								
				
}
			
			this.jScrollPanelDatosEdicionBajasActivosFijos=   new JScrollPane(jContentPaneDetalleBajasActivosFijos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionBajasActivosFijos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionBajasActivosFijos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionBajasActivosFijos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralBajasActivosFijos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralBajasActivosFijos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralBajasActivosFijos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralBajasActivosFijos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
			
			
	        this.gridBagConstraintsBajasActivosFijos.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsBajasActivosFijos.gridx = 0;
	        
			this.jContentPaneDetalleBajasActivosFijos.add(jPanelCamposBajasActivosFijos, gridBagConstraintsBajasActivosFijos);
			
			
			
			
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
						//&& bajasactivosfijosSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.bajasactivosfijosSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsBajasActivosFijos= new GridBagConstraints();
						this.gridBagConstraintsBajasActivosFijos.gridy = iGridyRelaciones++;
						this.gridBagConstraintsBajasActivosFijos.gridx = 0;
						this.jContentPaneDetalleBajasActivosFijos.add(this.jTabbedPaneRelacionesBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesBajasActivosFijos.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosBajasActivosFijos.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
					this.gridBagConstraintsBajasActivosFijos.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsBajasActivosFijos.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsBajasActivosFijos.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsBajasActivosFijos.gridx = 0;
					
				
					this.jContentPaneDetalleBajasActivosFijos.add(jPanelCamposOcultosBajasActivosFijos, gridBagConstraintsBajasActivosFijos);
				
					this.jPanelCamposOcultosBajasActivosFijos.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsBajasActivosFijos.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsBajasActivosFijos.gridx = 0;
	        this.gridBagConstraintsBajasActivosFijos.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleBajasActivosFijos.add(this.jPanelAccionesFormularioBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);							
			
			
			
			this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
	        this.gridBagConstraintsBajasActivosFijos.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsBajasActivosFijos.gridx = 0;
	        
			
			this.jContentPaneDetalleBajasActivosFijos.add(this.jPanelAccionesBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionBajasActivosFijos);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionBajasActivosFijos=   new JScrollPane(this.jPanelCamposBajasActivosFijos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionBajasActivosFijos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionBajasActivosFijos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionBajasActivosFijos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsBajasActivosFijos.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsBajasActivosFijos.gridx = 0;
			this.gridBagConstraintsBajasActivosFijos.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsBajasActivosFijos.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsBajasActivosFijos.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsBajasActivosFijos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsBajasActivosFijos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);			
			
			this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
			this.gridBagConstraintsBajasActivosFijos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsBajasActivosFijos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsBajasActivosFijos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsBajasActivosFijos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);
			
			
		this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsBajasActivosFijos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsBajasActivosFijos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);
		
			
		this.gridBagConstraintsBajasActivosFijos = new GridBagConstraints();
		this.gridBagConstraintsBajasActivosFijos.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsBajasActivosFijos.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesBajasActivosFijos, this.gridBagConstraintsBajasActivosFijos);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralBajasActivosFijos;//jContentPane;
		
		return jScrollPanelDatosEdicionBajasActivosFijos;
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
