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


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.contabilidad.util.DetalleCuentaFlujoCajaConstantesFunciones;

import com.bydan.erp.contabilidad.business.logic.*;
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
public class DetalleCuentaFlujoCajaDetalleFormJInternalFrame extends DetalleCuentaFlujoCajaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleDetalleCuentaFlujoCaja;
	
	protected JMenuBar jmenuBarDetalleDetalleCuentaFlujoCaja;
	
	protected JMenu jmenuDetalleDetalleCuentaFlujoCaja;
	protected JMenu jmenuDetalleArchivoDetalleCuentaFlujoCaja;
	protected JMenu jmenuDetalleAccionesDetalleCuentaFlujoCaja;
	protected JMenu jmenuDetalleDatosDetalleCuentaFlujoCaja;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleDetalleCuentaFlujoCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetalleCuentaFlujoCaja;	
	protected GridBagConstraints gridBagConstraintsDetalleCuentaFlujoCaja;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected DetalleCuentaFlujoCajaBeanSwingJInternalFrameAdditional jInternalFrameDetalleDetalleCuentaFlujoCaja;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected TipoOperacionBeanSwingJInternalFrame tipooperacionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipooperacion="";

	protected CuentaFlujoCajaBeanSwingJInternalFrame cuentaflujocajaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentaflujocaja="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontable="";
	
	public DetalleCuentaFlujoCajaSessionBean detallecuentaflujocajaSessionBean;
	
	
	
	
	public TipoOperacionSessionBean tipooperacionSessionBean;
	public CuentaFlujoCajaSessionBean cuentaflujocajaSessionBean;
	public CuentaContableSessionBean cuentacontableSessionBean;	
	
	public DetalleCuentaFlujoCajaLogic detallecuentaflujocajaLogic;
	
	public JScrollPane jScrollPanelDatosDetalleCuentaFlujoCaja;
	public JScrollPane jScrollPanelDatosEdicionDetalleCuentaFlujoCaja;
	public JScrollPane jScrollPanelDatosGeneralDetalleCuentaFlujoCaja;
	
	protected JPanel jPanelCamposDetalleCuentaFlujoCaja;    
	protected JPanel jPanelCamposOcultosDetalleCuentaFlujoCaja;    	
	protected JPanel jPanelAccionesDetalleCuentaFlujoCaja;
	protected JPanel jPanelAccionesFormularioDetalleCuentaFlujoCaja;
    
	
	
	protected Integer iXPanelCamposDetalleCuentaFlujoCaja=0;
	protected Integer iYPanelCamposDetalleCuentaFlujoCaja=0;
	
	protected Integer iXPanelCamposOcultosDetalleCuentaFlujoCaja=0;
	protected Integer iYPanelCamposOcultosDetalleCuentaFlujoCaja=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoDetalleCuentaFlujoCaja;
	public JButton jButtonModificarDetalleCuentaFlujoCaja;
	public JButton jButtonActualizarDetalleCuentaFlujoCaja;
    public JButton jButtonEliminarDetalleCuentaFlujoCaja;
	public JButton jButtonCancelarDetalleCuentaFlujoCaja;
    public JButton jButtonGuardarCambiosDetalleCuentaFlujoCaja;
	public JButton jButtonGuardarCambiosTablaDetalleCuentaFlujoCaja;
	protected JButton jButtonCerrarDetalleCuentaFlujoCaja;
	
	
	protected JButton jButtonProcesarInformacionDetalleCuentaFlujoCaja;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoDetalleCuentaFlujoCaja;
	protected JCheckBox jCheckBoxPostAccionSinCerrarDetalleCuentaFlujoCaja;
	protected JCheckBox jCheckBoxPostAccionSinMensajeDetalleCuentaFlujoCaja;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDetalleCuentaFlujoCaja;
	protected JButton jButtonModificarToolBarDetalleCuentaFlujoCaja;
	protected JButton jButtonActualizarToolBarDetalleCuentaFlujoCaja;
    protected JButton jButtonEliminarToolBarDetalleCuentaFlujoCaja;
	protected JButton jButtonCancelarToolBarDetalleCuentaFlujoCaja;
    protected JButton jButtonGuardarCambiosToolBarDetalleCuentaFlujoCaja;
	protected JButton jButtonGuardarCambiosTablaToolBarDetalleCuentaFlujoCaja;
	protected JButton jButtonMostrarOcultarTablaToolBarDetalleCuentaFlujoCaja;
	protected JButton jButtonCerrarToolBarDetalleCuentaFlujoCaja;
	
	protected JButton jButtonProcesarInformacionToolBarDetalleCuentaFlujoCaja;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDetalleCuentaFlujoCaja;
	protected JMenuItem jMenuItemModificarDetalleCuentaFlujoCaja;
	protected JMenuItem jMenuItemActualizarDetalleCuentaFlujoCaja;
    protected JMenuItem jMenuItemEliminarDetalleCuentaFlujoCaja;
	protected JMenuItem jMenuItemCancelarDetalleCuentaFlujoCaja;
    protected JMenuItem jMenuItemGuardarCambiosDetalleCuentaFlujoCaja;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetalleCuentaFlujoCaja;
	protected JMenuItem jMenuItemCerrarDetalleCuentaFlujoCaja;
	protected JMenuItem jMenuItemDetalleCerrarDetalleCuentaFlujoCaja;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetalleCuentaFlujoCaja;
	
	protected JMenuItem jMenuItemProcesarInformacionDetalleCuentaFlujoCaja;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetalleCuentaFlujoCaja;
	protected JMenuItem jMenuItemMostrarOcultarDetalleCuentaFlujoCaja;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDetalleCuentaFlujoCaja;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetalleCuentaFlujoCaja;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetalleCuentaFlujoCaja;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioDetalleCuentaFlujoCaja;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidDetalleCuentaFlujoCaja;
	public JLabel jLabelIdDetalleCuentaFlujoCaja;
	public JLabel jLabelidDetalleCuentaFlujoCaja;
	public JButton jButtonidDetalleCuentaFlujoCajaBusqueda= new JButtonMe();

	public JPanel jPanelesta_activoDetalleCuentaFlujoCaja;
	public JLabel jLabelesta_activoDetalleCuentaFlujoCaja;
	public JCheckBox jCheckBoxesta_activoDetalleCuentaFlujoCaja;
	public JButton jButtonesta_activoDetalleCuentaFlujoCajaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_operacionDetalleCuentaFlujoCaja;
	public JLabel jLabelid_tipo_operacionDetalleCuentaFlujoCaja;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_operacionDetalleCuentaFlujoCaja;
	public JButton jButtonid_tipo_operacionDetalleCuentaFlujoCaja= new JButtonMe();
	public JButton jButtonid_tipo_operacionDetalleCuentaFlujoCajaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_operacionDetalleCuentaFlujoCajaBusqueda= new JButtonMe();

	public JPanel jPanelid_cuenta_flujo_cajaDetalleCuentaFlujoCaja;
	public JLabel jLabelid_cuenta_flujo_cajaDetalleCuentaFlujoCaja;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_flujo_cajaDetalleCuentaFlujoCaja;
	public JButton jButtonid_cuenta_flujo_cajaDetalleCuentaFlujoCaja= new JButtonMe();
	public JButton jButtonid_cuenta_flujo_cajaDetalleCuentaFlujoCajaUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_flujo_cajaDetalleCuentaFlujoCajaBusqueda= new JButtonMe();

	public JPanel jPanelid_cuenta_contableDetalleCuentaFlujoCaja;
	public JLabel jLabelid_cuenta_contableDetalleCuentaFlujoCaja;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contableDetalleCuentaFlujoCaja;
	public JButton jButtonid_cuenta_contableDetalleCuentaFlujoCaja= new JButtonMe();
	public JButton jButtonid_cuenta_contableDetalleCuentaFlujoCajaUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contableDetalleCuentaFlujoCajaBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contableDetalleCuentaFlujoCajaArbol= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesDetalleCuentaFlujoCaja;
	
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
		
	public int iWidthFormulario=515;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightFormulario=330;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public DetalleCuentaFlujoCajaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposDetalleCuentaFlujoCaja=new JPanel();
				this.jPanelAccionesFormularioDetalleCuentaFlujoCaja=new JPanel();
				this.jmenuBarDetalleDetalleCuentaFlujoCaja=new JMenuBar();
				this.jTtoolBarDetalleDetalleCuentaFlujoCaja=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleCuentaFlujoCajaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("DetalleCuentaFlujoCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public DetalleCuentaFlujoCajaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("DetalleCuentaFlujoCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleCuentaFlujoCajaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleCuentaFlujoCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleCuentaFlujoCajaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleCuentaFlujoCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleCuentaFlujoCajaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetalleCuentaFlujoCaja No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarDetalleCuentaFlujoCaja() {
		return this.jButtonActualizarToolBarDetalleCuentaFlujoCaja;
	}
	
	public JButton getjButtonEliminarToolBarDetalleCuentaFlujoCaja() {
		return this.jButtonEliminarToolBarDetalleCuentaFlujoCaja;
	}
	
	public JButton getjButtonCancelarToolBarDetalleCuentaFlujoCaja() {
		return this.jButtonCancelarToolBarDetalleCuentaFlujoCaja;
	}		
	
	public JButton getjButtonProcesarInformacionDetalleCuentaFlujoCaja() {
		return this.jButtonProcesarInformacionDetalleCuentaFlujoCaja;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetalleCuentaFlujoCaja)	{
		this.jButtonProcesarInformacionDetalleCuentaFlujoCaja = jButtonProcesarInformacionDetalleCuentaFlujoCaja;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetalleCuentaFlujoCaja() {
		return this.jComboBoxTiposAccionesDetalleCuentaFlujoCaja;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetalleCuentaFlujoCaja(
			JComboBox jComboBoxTiposRelacionesDetalleCuentaFlujoCaja) {
		this.jComboBoxTiposRelacionesDetalleCuentaFlujoCaja = jComboBoxTiposRelacionesDetalleCuentaFlujoCaja;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetalleCuentaFlujoCaja(
			JComboBox jComboBoxTiposAccionesDetalleCuentaFlujoCaja) {
		this.jComboBoxTiposAccionesDetalleCuentaFlujoCaja = jComboBoxTiposAccionesDetalleCuentaFlujoCaja;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioDetalleCuentaFlujoCaja() {
		return this.jComboBoxTiposAccionesFormularioDetalleCuentaFlujoCaja;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioDetalleCuentaFlujoCaja(
			JComboBox jComboBoxTiposAccionesFormularioDetalleCuentaFlujoCaja) {
		this.jComboBoxTiposAccionesFormularioDetalleCuentaFlujoCaja = jComboBoxTiposAccionesFormularioDetalleCuentaFlujoCaja;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.detallecuentaflujocajaSessionBean=new DetalleCuentaFlujoCajaSessionBean();
		
		this.detallecuentaflujocajaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detallecuentaflujocajaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detallecuentaflujocajaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetalleCuentaFlujoCajaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetalleCuentaFlujoCajaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetalleCuentaFlujoCajaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalle Cuenta Flujo Caja MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.detallecuentaflujocajaSessionBean.getEsGuardarRelacionado()) {
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
	
		DetalleCuentaFlujoCajaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleDetalleCuentaFlujoCaja= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarDetalleCuentaFlujoCaja=new JButtonMe();
				this.jButtonModificarToolBarDetalleCuentaFlujoCaja=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarDetalleCuentaFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarDetalleCuentaFlujoCaja,this.jTtoolBarDetalleDetalleCuentaFlujoCaja,
							"actualizar","actualizar","Actualizar"+" "+DetalleCuentaFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarDetalleCuentaFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarDetalleCuentaFlujoCaja,this.jTtoolBarDetalleDetalleCuentaFlujoCaja,
							"eliminar","eliminar","Eliminar"+" "+DetalleCuentaFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarDetalleCuentaFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarDetalleCuentaFlujoCaja,this.jTtoolBarDetalleDetalleCuentaFlujoCaja,
							"cancelar","cancelar","Cancelar"+" "+DetalleCuentaFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarDetalleCuentaFlujoCaja=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarDetalleCuentaFlujoCaja,this.jTtoolBarDetalleDetalleCuentaFlujoCaja,
							"guardarcambios","guardarcambios","Guardar"+" "+DetalleCuentaFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarDetalleCuentaFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarDetalleCuentaFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarDetalleCuentaFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleDetalleCuentaFlujoCaja=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleDetalleCuentaFlujoCaja=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoDetalleCuentaFlujoCaja=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesDetalleCuentaFlujoCaja=new JMenuMe("Acciones");
		this.jmenuDetalleDatosDetalleCuentaFlujoCaja=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetalleCuentaFlujoCaja= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetalleCuentaFlujoCaja.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetalleCuentaFlujoCaja,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetalleCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarDetalleCuentaFlujoCaja= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarDetalleCuentaFlujoCaja.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarDetalleCuentaFlujoCaja,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarDetalleCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarDetalleCuentaFlujoCaja= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarDetalleCuentaFlujoCaja.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarDetalleCuentaFlujoCaja,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarDetalleCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarDetalleCuentaFlujoCaja= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarDetalleCuentaFlujoCaja.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarDetalleCuentaFlujoCaja,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarDetalleCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarDetalleCuentaFlujoCaja= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarDetalleCuentaFlujoCaja.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarDetalleCuentaFlujoCaja,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarDetalleCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosDetalleCuentaFlujoCaja= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetalleCuentaFlujoCaja.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetalleCuentaFlujoCaja,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetalleCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetalleCuentaFlujoCaja= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetalleCuentaFlujoCaja.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetalleCuentaFlujoCaja,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetalleCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarDetalleCuentaFlujoCaja= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarDetalleCuentaFlujoCaja.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarDetalleCuentaFlujoCaja,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarDetalleCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetalleCuentaFlujoCaja= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetalleCuentaFlujoCaja.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetalleCuentaFlujoCaja,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetalleCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetalleCuentaFlujoCaja= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetalleCuentaFlujoCaja.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetalleCuentaFlujoCaja,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetalleCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoDetalleCuentaFlujoCaja.add(this.jMenuItemDetalleCerrarDetalleCuentaFlujoCaja);
		
		this.jmenuDetalleAccionesDetalleCuentaFlujoCaja.add(this.jMenuItemActualizarDetalleCuentaFlujoCaja);
		this.jmenuDetalleAccionesDetalleCuentaFlujoCaja.add(this.jMenuItemEliminarDetalleCuentaFlujoCaja);
		this.jmenuDetalleAccionesDetalleCuentaFlujoCaja.add(this.jMenuItemCancelarDetalleCuentaFlujoCaja);		
		
		//this.jmenuDetalleDatosDetalleCuentaFlujoCaja.add(this.jMenuItemDetalleAbrirOrderByDetalleCuentaFlujoCaja);				
		this.jmenuDetalleDatosDetalleCuentaFlujoCaja.add(this.jMenuItemDetalleMostarOcultarDetalleCuentaFlujoCaja);				
				
		//this.jmenuDetalleAccionesDetalleCuentaFlujoCaja.add(this.jMenuItemGuardarCambiosDetalleCuentaFlujoCaja);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoDetalleCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesDetalleCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosDetalleCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleDetalleCuentaFlujoCaja.add(this.jmenuDetalleArchivoDetalleCuentaFlujoCaja);		
		this.jmenuBarDetalleDetalleCuentaFlujoCaja.add(this.jmenuDetalleAccionesDetalleCuentaFlujoCaja);		
		this.jmenuBarDetalleDetalleCuentaFlujoCaja.add(this.jmenuDetalleDatosDetalleCuentaFlujoCaja);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleDetalleCuentaFlujoCaja);				
	}
	
	
	public void inicializarElementosCamposDetalleCuentaFlujoCaja() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdDetalleCuentaFlujoCaja = new JLabelMe();
		jLabelIdDetalleCuentaFlujoCaja.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdDetalleCuentaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetalleCuentaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetalleCuentaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdDetalleCuentaFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidDetalleCuentaFlujoCaja = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidDetalleCuentaFlujoCaja.setToolTipText(DetalleCuentaFlujoCajaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutDetalleCuentaFlujoCaja= new GridBagLayout();

		this.jPanelidDetalleCuentaFlujoCaja.setLayout(this.gridaBagLayoutDetalleCuentaFlujoCaja);

		jLabelidDetalleCuentaFlujoCaja = new JLabel();
		jLabelidDetalleCuentaFlujoCaja.setText("Id");

		jLabelidDetalleCuentaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetalleCuentaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetalleCuentaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelesta_activoDetalleCuentaFlujoCaja = new JLabelMe();
		this.jLabelesta_activoDetalleCuentaFlujoCaja.setText(""+DetalleCuentaFlujoCajaConstantesFunciones.LABEL_ESTAACTIVO+" : *");
		this.jLabelesta_activoDetalleCuentaFlujoCaja.setToolTipText("Esta Activo");
		this.jLabelesta_activoDetalleCuentaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelesta_activoDetalleCuentaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelesta_activoDetalleCuentaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelesta_activoDetalleCuentaFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelesta_activoDetalleCuentaFlujoCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelesta_activoDetalleCuentaFlujoCaja.setToolTipText(DetalleCuentaFlujoCajaConstantesFunciones.LABEL_ESTAACTIVO);
		this.gridaBagLayoutDetalleCuentaFlujoCaja = new GridBagLayout();
		this.jPanelesta_activoDetalleCuentaFlujoCaja.setLayout(this.gridaBagLayoutDetalleCuentaFlujoCaja);


		jCheckBoxesta_activoDetalleCuentaFlujoCaja= new JCheckBoxMe();
		jCheckBoxesta_activoDetalleCuentaFlujoCaja.setEnabled(false);

		jCheckBoxesta_activoDetalleCuentaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesta_activoDetalleCuentaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesta_activoDetalleCuentaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxesta_activoDetalleCuentaFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonesta_activoDetalleCuentaFlujoCajaBusqueda= new JButtonMe();
		this.jButtonesta_activoDetalleCuentaFlujoCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesta_activoDetalleCuentaFlujoCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesta_activoDetalleCuentaFlujoCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonesta_activoDetalleCuentaFlujoCajaBusqueda.setText("U");
		this.jButtonesta_activoDetalleCuentaFlujoCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonesta_activoDetalleCuentaFlujoCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonesta_activoDetalleCuentaFlujoCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxesta_activoDetalleCuentaFlujoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxesta_activoDetalleCuentaFlujoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"esta_activoDetalleCuentaFlujoCajaBusqueda"));

		if(this.detallecuentaflujocajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonesta_activoDetalleCuentaFlujoCajaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysDetalleCuentaFlujoCaja() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_tipo_operacionDetalleCuentaFlujoCaja = new JLabelMe();
		this.jLabelid_tipo_operacionDetalleCuentaFlujoCaja.setText(""+DetalleCuentaFlujoCajaConstantesFunciones.LABEL_IDTIPOOPERACION+" : *");
		this.jLabelid_tipo_operacionDetalleCuentaFlujoCaja.setToolTipText("Tipo Operacion");
		this.jLabelid_tipo_operacionDetalleCuentaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_operacionDetalleCuentaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_operacionDetalleCuentaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_operacionDetalleCuentaFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_operacionDetalleCuentaFlujoCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_operacionDetalleCuentaFlujoCaja.setToolTipText(DetalleCuentaFlujoCajaConstantesFunciones.LABEL_IDTIPOOPERACION);
		this.gridaBagLayoutDetalleCuentaFlujoCaja = new GridBagLayout();
		this.jPanelid_tipo_operacionDetalleCuentaFlujoCaja.setLayout(this.gridaBagLayoutDetalleCuentaFlujoCaja);


		jComboBoxid_tipo_operacionDetalleCuentaFlujoCaja= new JComboBoxMe();
		jComboBoxid_tipo_operacionDetalleCuentaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_operacionDetalleCuentaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_operacionDetalleCuentaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_operacionDetalleCuentaFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_operacionDetalleCuentaFlujoCaja= new JButtonMe();
		this.jButtonid_tipo_operacionDetalleCuentaFlujoCaja.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_operacionDetalleCuentaFlujoCaja.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_operacionDetalleCuentaFlujoCaja.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_operacionDetalleCuentaFlujoCaja.setText("Buscar");
		this.jButtonid_tipo_operacionDetalleCuentaFlujoCaja.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_operacionDetalleCuentaFlujoCaja.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_operacionDetalleCuentaFlujoCaja,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_operacionDetalleCuentaFlujoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_operacionDetalleCuentaFlujoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_operacionDetalleCuentaFlujoCaja"));

		this.jButtonid_tipo_operacionDetalleCuentaFlujoCajaBusqueda= new JButtonMe();
		this.jButtonid_tipo_operacionDetalleCuentaFlujoCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_operacionDetalleCuentaFlujoCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_operacionDetalleCuentaFlujoCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_operacionDetalleCuentaFlujoCajaBusqueda.setText("U");
		this.jButtonid_tipo_operacionDetalleCuentaFlujoCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_operacionDetalleCuentaFlujoCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_operacionDetalleCuentaFlujoCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_operacionDetalleCuentaFlujoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_operacionDetalleCuentaFlujoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_operacionDetalleCuentaFlujoCajaBusqueda"));

		if(this.detallecuentaflujocajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_operacionDetalleCuentaFlujoCajaBusqueda.setVisible(false);		}

		this.jButtonid_tipo_operacionDetalleCuentaFlujoCajaUpdate= new JButtonMe();
		this.jButtonid_tipo_operacionDetalleCuentaFlujoCajaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_operacionDetalleCuentaFlujoCajaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_operacionDetalleCuentaFlujoCajaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_operacionDetalleCuentaFlujoCajaUpdate.setText("U");
		this.jButtonid_tipo_operacionDetalleCuentaFlujoCajaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_operacionDetalleCuentaFlujoCajaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_operacionDetalleCuentaFlujoCajaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_operacionDetalleCuentaFlujoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_operacionDetalleCuentaFlujoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_operacionDetalleCuentaFlujoCajaUpdate"));



					
		this.jLabelid_cuenta_flujo_cajaDetalleCuentaFlujoCaja = new JLabelMe();
		this.jLabelid_cuenta_flujo_cajaDetalleCuentaFlujoCaja.setText(""+DetalleCuentaFlujoCajaConstantesFunciones.LABEL_IDCUENTAFLUJOCAJA+" : *");
		this.jLabelid_cuenta_flujo_cajaDetalleCuentaFlujoCaja.setToolTipText("Cuenta Flujo Caja");
		this.jLabelid_cuenta_flujo_cajaDetalleCuentaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_flujo_cajaDetalleCuentaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_flujo_cajaDetalleCuentaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_flujo_cajaDetalleCuentaFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_flujo_cajaDetalleCuentaFlujoCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_flujo_cajaDetalleCuentaFlujoCaja.setToolTipText(DetalleCuentaFlujoCajaConstantesFunciones.LABEL_IDCUENTAFLUJOCAJA);
		this.gridaBagLayoutDetalleCuentaFlujoCaja = new GridBagLayout();
		this.jPanelid_cuenta_flujo_cajaDetalleCuentaFlujoCaja.setLayout(this.gridaBagLayoutDetalleCuentaFlujoCaja);


		jComboBoxid_cuenta_flujo_cajaDetalleCuentaFlujoCaja= new JComboBoxMe();
		jComboBoxid_cuenta_flujo_cajaDetalleCuentaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_flujo_cajaDetalleCuentaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_flujo_cajaDetalleCuentaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_flujo_cajaDetalleCuentaFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_flujo_cajaDetalleCuentaFlujoCaja= new JButtonMe();
		this.jButtonid_cuenta_flujo_cajaDetalleCuentaFlujoCaja.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_flujo_cajaDetalleCuentaFlujoCaja.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_flujo_cajaDetalleCuentaFlujoCaja.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_flujo_cajaDetalleCuentaFlujoCaja.setText("Buscar");
		this.jButtonid_cuenta_flujo_cajaDetalleCuentaFlujoCaja.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_flujo_cajaDetalleCuentaFlujoCaja.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_flujo_cajaDetalleCuentaFlujoCaja,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_flujo_cajaDetalleCuentaFlujoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_flujo_cajaDetalleCuentaFlujoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_flujo_cajaDetalleCuentaFlujoCaja"));

		this.jButtonid_cuenta_flujo_cajaDetalleCuentaFlujoCajaBusqueda= new JButtonMe();
		this.jButtonid_cuenta_flujo_cajaDetalleCuentaFlujoCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_flujo_cajaDetalleCuentaFlujoCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_flujo_cajaDetalleCuentaFlujoCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_flujo_cajaDetalleCuentaFlujoCajaBusqueda.setText("U");
		this.jButtonid_cuenta_flujo_cajaDetalleCuentaFlujoCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_flujo_cajaDetalleCuentaFlujoCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_flujo_cajaDetalleCuentaFlujoCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_flujo_cajaDetalleCuentaFlujoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_flujo_cajaDetalleCuentaFlujoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_flujo_cajaDetalleCuentaFlujoCajaBusqueda"));

		if(this.detallecuentaflujocajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_flujo_cajaDetalleCuentaFlujoCajaBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_flujo_cajaDetalleCuentaFlujoCajaUpdate= new JButtonMe();
		this.jButtonid_cuenta_flujo_cajaDetalleCuentaFlujoCajaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_flujo_cajaDetalleCuentaFlujoCajaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_flujo_cajaDetalleCuentaFlujoCajaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_flujo_cajaDetalleCuentaFlujoCajaUpdate.setText("U");
		this.jButtonid_cuenta_flujo_cajaDetalleCuentaFlujoCajaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_flujo_cajaDetalleCuentaFlujoCajaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_flujo_cajaDetalleCuentaFlujoCajaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_flujo_cajaDetalleCuentaFlujoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_flujo_cajaDetalleCuentaFlujoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_flujo_cajaDetalleCuentaFlujoCajaUpdate"));



					
		this.jLabelid_cuenta_contableDetalleCuentaFlujoCaja = new JLabelMe();
		this.jLabelid_cuenta_contableDetalleCuentaFlujoCaja.setText(""+DetalleCuentaFlujoCajaConstantesFunciones.LABEL_IDCUENTACONTABLE+" : *");
		this.jLabelid_cuenta_contableDetalleCuentaFlujoCaja.setToolTipText("Cuenta Contable");
		this.jLabelid_cuenta_contableDetalleCuentaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contableDetalleCuentaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contableDetalleCuentaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contableDetalleCuentaFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contableDetalleCuentaFlujoCaja=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contableDetalleCuentaFlujoCaja.setToolTipText(DetalleCuentaFlujoCajaConstantesFunciones.LABEL_IDCUENTACONTABLE);
		this.gridaBagLayoutDetalleCuentaFlujoCaja = new GridBagLayout();
		this.jPanelid_cuenta_contableDetalleCuentaFlujoCaja.setLayout(this.gridaBagLayoutDetalleCuentaFlujoCaja);


		jComboBoxid_cuenta_contableDetalleCuentaFlujoCaja= new JComboBoxMe();
		jComboBoxid_cuenta_contableDetalleCuentaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableDetalleCuentaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableDetalleCuentaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contableDetalleCuentaFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contableDetalleCuentaFlujoCaja= new JButtonMe();
		this.jButtonid_cuenta_contableDetalleCuentaFlujoCaja.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableDetalleCuentaFlujoCaja.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableDetalleCuentaFlujoCaja.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableDetalleCuentaFlujoCaja.setText("Buscar");
		this.jButtonid_cuenta_contableDetalleCuentaFlujoCaja.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contableDetalleCuentaFlujoCaja.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableDetalleCuentaFlujoCaja,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contableDetalleCuentaFlujoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableDetalleCuentaFlujoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableDetalleCuentaFlujoCaja"));

		this.jButtonid_cuenta_contableDetalleCuentaFlujoCajaBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contableDetalleCuentaFlujoCajaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableDetalleCuentaFlujoCajaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableDetalleCuentaFlujoCajaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contableDetalleCuentaFlujoCajaBusqueda.setText("U");
		this.jButtonid_cuenta_contableDetalleCuentaFlujoCajaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contableDetalleCuentaFlujoCajaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableDetalleCuentaFlujoCajaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contableDetalleCuentaFlujoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableDetalleCuentaFlujoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableDetalleCuentaFlujoCajaBusqueda"));

		if(this.detallecuentaflujocajaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contableDetalleCuentaFlujoCajaBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contableDetalleCuentaFlujoCajaUpdate= new JButtonMe();
		this.jButtonid_cuenta_contableDetalleCuentaFlujoCajaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableDetalleCuentaFlujoCajaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableDetalleCuentaFlujoCajaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contableDetalleCuentaFlujoCajaUpdate.setText("U");
		this.jButtonid_cuenta_contableDetalleCuentaFlujoCajaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contableDetalleCuentaFlujoCajaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableDetalleCuentaFlujoCajaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contableDetalleCuentaFlujoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableDetalleCuentaFlujoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableDetalleCuentaFlujoCajaUpdate"));


		jButtonid_cuenta_contableDetalleCuentaFlujoCajaArbol= new JButtonMe();
		jButtonid_cuenta_contableDetalleCuentaFlujoCajaArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableDetalleCuentaFlujoCajaArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableDetalleCuentaFlujoCajaArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableDetalleCuentaFlujoCajaArbol.setText("Arbol");
		jButtonid_cuenta_contableDetalleCuentaFlujoCajaArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contableDetalleCuentaFlujoCajaArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableDetalleCuentaFlujoCajaArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contableDetalleCuentaFlujoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableDetalleCuentaFlujoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableDetalleCuentaFlujoCajaArbol"));



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
		//this.jInternalFrameDetalleDetalleCuentaFlujoCaja = new DetalleCuentaFlujoCajaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Detalle Cuenta Flujo Caja DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDetalleCuentaFlujoCaja= new GridBagLayout();
		

		
		String sToolTipDetalleCuentaFlujoCaja="";
		sToolTipDetalleCuentaFlujoCaja=DetalleCuentaFlujoCajaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetalleCuentaFlujoCaja+="(Contabilidad.DetalleCuentaFlujoCaja)";
		}
		
		if(!this.detallecuentaflujocajaSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetalleCuentaFlujoCaja+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoDetalleCuentaFlujoCaja = new JButtonMe();
		this.jButtonModificarDetalleCuentaFlujoCaja = new JButtonMe();
        this.jButtonActualizarDetalleCuentaFlujoCaja = new JButtonMe();
        this.jButtonEliminarDetalleCuentaFlujoCaja = new JButtonMe();
        this.jButtonCancelarDetalleCuentaFlujoCaja = new JButtonMe();
        this.jButtonGuardarCambiosDetalleCuentaFlujoCaja = new JButtonMe();
		this.jButtonGuardarCambiosTablaDetalleCuentaFlujoCaja = new JButtonMe();
		this.jButtonCerrarDetalleCuentaFlujoCaja = new JButtonMe();
		
		this.jScrollPanelDatosDetalleCuentaFlujoCaja = new JScrollPane();   
        this.jScrollPanelDatosEdicionDetalleCuentaFlujoCaja = new JScrollPane();
		this.jScrollPanelDatosGeneralDetalleCuentaFlujoCaja = new JScrollPane();
				
		
		
		this.jPanelCamposDetalleCuentaFlujoCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosDetalleCuentaFlujoCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesDetalleCuentaFlujoCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioDetalleCuentaFlujoCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Detalle Cuenta Flujo Caja";
		
		if(!this.detallecuentaflujocajaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetalleCuentaFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Cuenta Flujo Cajas" + this.sPath));
		} else {
			this.jScrollPanelDatosDetalleCuentaFlujoCaja.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionDetalleCuentaFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralDetalleCuentaFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposDetalleCuentaFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposDetalleCuentaFlujoCaja.setName("jPanelCamposDetalleCuentaFlujoCaja"); 

		this.jPanelCamposOcultosDetalleCuentaFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosDetalleCuentaFlujoCaja.setName("jPanelCamposOcultosDetalleCuentaFlujoCaja"); 

        this.jPanelAccionesDetalleCuentaFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetalleCuentaFlujoCaja.setToolTipText("Acciones");
        this.jPanelAccionesDetalleCuentaFlujoCaja.setName("Acciones"); 

		this.jPanelAccionesFormularioDetalleCuentaFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioDetalleCuentaFlujoCaja.setToolTipText("Acciones");
        this.jPanelAccionesFormularioDetalleCuentaFlujoCaja.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionDetalleCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetalleCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetalleCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposDetalleCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosDetalleCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioDetalleCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoDetalleCuentaFlujoCaja.setText("Nuevo");
		this.jButtonModificarDetalleCuentaFlujoCaja.setText("Editar");
        this.jButtonActualizarDetalleCuentaFlujoCaja.setText("Actualizar");
        this.jButtonEliminarDetalleCuentaFlujoCaja.setText("Eliminar");
        this.jButtonCancelarDetalleCuentaFlujoCaja.setText("Cancelar");
        this.jButtonGuardarCambiosDetalleCuentaFlujoCaja.setText("Guardar");
		this.jButtonGuardarCambiosTablaDetalleCuentaFlujoCaja.setText("Guardar");
		this.jButtonCerrarDetalleCuentaFlujoCaja.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetalleCuentaFlujoCaja,"nuevo_button","Nuevo",this.detallecuentaflujocajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarDetalleCuentaFlujoCaja,"modificar_button","Editar",this.detallecuentaflujocajaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarDetalleCuentaFlujoCaja,"actualizar_button","Actualizar",this.detallecuentaflujocajaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarDetalleCuentaFlujoCaja,"eliminar_button","Eliminar",this.detallecuentaflujocajaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarDetalleCuentaFlujoCaja,"cancelar_button","Cancelar",this.detallecuentaflujocajaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosDetalleCuentaFlujoCaja,"guardarcambios_button","Guardar",this.detallecuentaflujocajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetalleCuentaFlujoCaja,"guardarcambiostabla_button","Guardar",this.detallecuentaflujocajaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetalleCuentaFlujoCaja,"cerrar_button","Salir",this.detallecuentaflujocajaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetalleCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarDetalleCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosDetalleCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetalleCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetalleCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarDetalleCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarDetalleCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarDetalleCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoDetalleCuentaFlujoCaja.setToolTipText("Nuevo"+" "+DetalleCuentaFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarDetalleCuentaFlujoCaja.setToolTipText("Editar"+" "+DetalleCuentaFlujoCajaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarDetalleCuentaFlujoCaja.setToolTipText("Actualizar"+" "+DetalleCuentaFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarDetalleCuentaFlujoCaja.setToolTipText("Eliminar)"+" "+DetalleCuentaFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarDetalleCuentaFlujoCaja.setToolTipText("Cancelar"+" "+DetalleCuentaFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosDetalleCuentaFlujoCaja.setToolTipText("Guardar"+" "+DetalleCuentaFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaDetalleCuentaFlujoCaja.setToolTipText("Guardar"+" "+DetalleCuentaFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetalleCuentaFlujoCaja.setToolTipText("Salir"+" "+DetalleCuentaFlujoCajaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetalleCuentaFlujoCaja";
		inputMap = this.jButtonNuevoDetalleCuentaFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetalleCuentaFlujoCaja.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetalleCuentaFlujoCaja"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarDetalleCuentaFlujoCaja";
		inputMap = this.jButtonActualizarDetalleCuentaFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarDetalleCuentaFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarDetalleCuentaFlujoCaja"));
		
		//ELIMINAR
		sMapKey = "EliminarDetalleCuentaFlujoCaja";
		inputMap = this.jButtonEliminarDetalleCuentaFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarDetalleCuentaFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarDetalleCuentaFlujoCaja"));
		
		//CANCELAR	
		sMapKey = "CancelarDetalleCuentaFlujoCaja";
		inputMap = this.jButtonCancelarDetalleCuentaFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarDetalleCuentaFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarDetalleCuentaFlujoCaja"));
		
		//CERRAR		
		sMapKey = "CerrarDetalleCuentaFlujoCaja";
		inputMap = this.jButtonCerrarDetalleCuentaFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetalleCuentaFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetalleCuentaFlujoCaja"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetalleCuentaFlujoCaja";
		inputMap = this.jButtonGuardarCambiosTablaDetalleCuentaFlujoCaja.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetalleCuentaFlujoCaja.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetalleCuentaFlujoCaja"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoDetalleCuentaFlujoCaja = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoDetalleCuentaFlujoCaja.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoDetalleCuentaFlujoCaja.setToolTipText("Nuevo DetalleCuentaFlujoCaja");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoDetalleCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarDetalleCuentaFlujoCaja = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarDetalleCuentaFlujoCaja.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarDetalleCuentaFlujoCaja.setToolTipText("Sin Cerrar Ventana DetalleCuentaFlujoCaja");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarDetalleCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeDetalleCuentaFlujoCaja = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeDetalleCuentaFlujoCaja.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeDetalleCuentaFlujoCaja.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeDetalleCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesDetalleCuentaFlujoCaja = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetalleCuentaFlujoCaja.setText("Accion");
		this.jComboBoxTiposAccionesDetalleCuentaFlujoCaja.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioDetalleCuentaFlujoCaja = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioDetalleCuentaFlujoCaja.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioDetalleCuentaFlujoCaja.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesDetalleCuentaFlujoCaja = new JLabelMe();
		
		this.jLabelAccionesDetalleCuentaFlujoCaja.setText("Acciones");		
		this.jLabelAccionesDetalleCuentaFlujoCaja.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleCuentaFlujoCaja.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleCuentaFlujoCaja.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposDetalleCuentaFlujoCaja();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysDetalleCuentaFlujoCaja();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesDetalleCuentaFlujoCaja=new JTabbedPane();
		this.jTabbedPaneRelacionesDetalleCuentaFlujoCaja.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesDetalleCuentaFlujoCaja,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesDetalleCuentaFlujoCaja.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleCuentaFlujoCaja.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleCuentaFlujoCaja.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetalleCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioDetalleCuentaFlujoCaja.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetalleCuentaFlujoCaja.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetalleCuentaFlujoCaja.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioDetalleCuentaFlujoCaja, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposDetalleCuentaFlujoCaja = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosDetalleCuentaFlujoCaja = new GridBagLayout();
		
		this.jPanelCamposDetalleCuentaFlujoCaja.setLayout(gridaBagLayoutCamposDetalleCuentaFlujoCaja);
		this.jPanelCamposOcultosDetalleCuentaFlujoCaja.setLayout(gridaBagLayoutCamposOcultosDetalleCuentaFlujoCaja);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsDetalleCuentaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy = 0;
	this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx = 0;
	this.gridBagConstraintsDetalleCuentaFlujoCaja.ipadx = 0;
	this.gridBagConstraintsDetalleCuentaFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidDetalleCuentaFlujoCaja.add(jLabelIdDetalleCuentaFlujoCaja, this.gridBagConstraintsDetalleCuentaFlujoCaja);



	this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsDetalleCuentaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy = 0;
	this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx = 1;
	this.gridBagConstraintsDetalleCuentaFlujoCaja.ipadx = 0;
	this.gridBagConstraintsDetalleCuentaFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidDetalleCuentaFlujoCaja.add(jLabelidDetalleCuentaFlujoCaja, this.gridBagConstraintsDetalleCuentaFlujoCaja);


	this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsDetalleCuentaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy = 0;
	this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx = 0;
	this.gridBagConstraintsDetalleCuentaFlujoCaja.ipadx = 0;
	this.gridBagConstraintsDetalleCuentaFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_operacionDetalleCuentaFlujoCaja.add(jLabelid_tipo_operacionDetalleCuentaFlujoCaja, this.gridBagConstraintsDetalleCuentaFlujoCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCuentaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy = 0;
		this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx = 2;
		this.gridBagConstraintsDetalleCuentaFlujoCaja.ipadx = 0;
		this.gridBagConstraintsDetalleCuentaFlujoCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_operacionDetalleCuentaFlujoCaja.add(jButtonid_tipo_operacionDetalleCuentaFlujoCajaBusqueda, this.gridBagConstraintsDetalleCuentaFlujoCaja);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCuentaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy = 0;
		this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx = 3;
		this.gridBagConstraintsDetalleCuentaFlujoCaja.ipadx = 0;
		this.gridBagConstraintsDetalleCuentaFlujoCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_operacionDetalleCuentaFlujoCaja.add(jButtonid_tipo_operacionDetalleCuentaFlujoCajaUpdate, this.gridBagConstraintsDetalleCuentaFlujoCaja);
	}

	this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsDetalleCuentaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy = 0;
	this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx = 1;
	this.gridBagConstraintsDetalleCuentaFlujoCaja.ipadx = 0;
	this.gridBagConstraintsDetalleCuentaFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_operacionDetalleCuentaFlujoCaja.add(jComboBoxid_tipo_operacionDetalleCuentaFlujoCaja, this.gridBagConstraintsDetalleCuentaFlujoCaja);


	this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsDetalleCuentaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy = 0;
	this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx = 0;
	this.gridBagConstraintsDetalleCuentaFlujoCaja.ipadx = 0;
	this.gridBagConstraintsDetalleCuentaFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_flujo_cajaDetalleCuentaFlujoCaja.add(jLabelid_cuenta_flujo_cajaDetalleCuentaFlujoCaja, this.gridBagConstraintsDetalleCuentaFlujoCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCuentaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy = 0;
		this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx = 2;
		this.gridBagConstraintsDetalleCuentaFlujoCaja.ipadx = 0;
		this.gridBagConstraintsDetalleCuentaFlujoCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_flujo_cajaDetalleCuentaFlujoCaja.add(jButtonid_cuenta_flujo_cajaDetalleCuentaFlujoCajaBusqueda, this.gridBagConstraintsDetalleCuentaFlujoCaja);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCuentaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy = 0;
		this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx = 3;
		this.gridBagConstraintsDetalleCuentaFlujoCaja.ipadx = 0;
		this.gridBagConstraintsDetalleCuentaFlujoCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_flujo_cajaDetalleCuentaFlujoCaja.add(jButtonid_cuenta_flujo_cajaDetalleCuentaFlujoCajaUpdate, this.gridBagConstraintsDetalleCuentaFlujoCaja);
	}

	this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsDetalleCuentaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy = 0;
	this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx = 1;
	this.gridBagConstraintsDetalleCuentaFlujoCaja.ipadx = 0;
	this.gridBagConstraintsDetalleCuentaFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_flujo_cajaDetalleCuentaFlujoCaja.add(jComboBoxid_cuenta_flujo_cajaDetalleCuentaFlujoCaja, this.gridBagConstraintsDetalleCuentaFlujoCaja);


	this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsDetalleCuentaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy = 0;
	this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx = 0;
	this.gridBagConstraintsDetalleCuentaFlujoCaja.ipadx = 0;
	this.gridBagConstraintsDetalleCuentaFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contableDetalleCuentaFlujoCaja.add(jLabelid_cuenta_contableDetalleCuentaFlujoCaja, this.gridBagConstraintsDetalleCuentaFlujoCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCuentaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy = 0;
		this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx = 2;
		this.gridBagConstraintsDetalleCuentaFlujoCaja.ipadx = 0;
		this.gridBagConstraintsDetalleCuentaFlujoCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contableDetalleCuentaFlujoCaja.add(jButtonid_cuenta_contableDetalleCuentaFlujoCajaBusqueda, this.gridBagConstraintsDetalleCuentaFlujoCaja);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCuentaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy = 0;
		this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx = 3;
		this.gridBagConstraintsDetalleCuentaFlujoCaja.ipadx = 0;
		this.gridBagConstraintsDetalleCuentaFlujoCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contableDetalleCuentaFlujoCaja.add(jButtonid_cuenta_contableDetalleCuentaFlujoCajaUpdate, this.gridBagConstraintsDetalleCuentaFlujoCaja);
	}

	this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsDetalleCuentaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy = 0;
	this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx = 1;
	this.gridBagConstraintsDetalleCuentaFlujoCaja.ipadx = 0;
	this.gridBagConstraintsDetalleCuentaFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contableDetalleCuentaFlujoCaja.add(jComboBoxid_cuenta_contableDetalleCuentaFlujoCaja, this.gridBagConstraintsDetalleCuentaFlujoCaja);


	this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsDetalleCuentaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy = 0;
	this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx = 0;
	this.gridBagConstraintsDetalleCuentaFlujoCaja.ipadx = 0;
	this.gridBagConstraintsDetalleCuentaFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelesta_activoDetalleCuentaFlujoCaja.add(jLabelesta_activoDetalleCuentaFlujoCaja, this.gridBagConstraintsDetalleCuentaFlujoCaja);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
		//this.gridBagConstraintsDetalleCuentaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy = 0;
		this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx = 2;
		this.gridBagConstraintsDetalleCuentaFlujoCaja.ipadx = 0;
		this.gridBagConstraintsDetalleCuentaFlujoCaja.insets = new Insets(0, 0, 0, 0);
		this.jPanelesta_activoDetalleCuentaFlujoCaja.add(jButtonesta_activoDetalleCuentaFlujoCajaBusqueda, this.gridBagConstraintsDetalleCuentaFlujoCaja);
	}

	this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsDetalleCuentaFlujoCaja.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy = 0;
	this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx = 1;
	this.gridBagConstraintsDetalleCuentaFlujoCaja.ipadx = 0;
	this.gridBagConstraintsDetalleCuentaFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelesta_activoDetalleCuentaFlujoCaja.add(jCheckBoxesta_activoDetalleCuentaFlujoCaja, this.gridBagConstraintsDetalleCuentaFlujoCaja);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsDetalleCuentaFlujoCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleCuentaFlujoCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy = iYPanelCamposDetalleCuentaFlujoCaja;
	this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx = iXPanelCamposDetalleCuentaFlujoCaja++;
	this.gridBagConstraintsDetalleCuentaFlujoCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleCuentaFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleCuentaFlujoCaja.add(this.jPanelidDetalleCuentaFlujoCaja, this.gridBagConstraintsDetalleCuentaFlujoCaja);



	if(iXPanelCamposDetalleCuentaFlujoCaja % 1==0) {
		iXPanelCamposDetalleCuentaFlujoCaja=0;
		iYPanelCamposDetalleCuentaFlujoCaja++;
	}
	this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsDetalleCuentaFlujoCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleCuentaFlujoCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy = iYPanelCamposDetalleCuentaFlujoCaja;
	this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx = iXPanelCamposDetalleCuentaFlujoCaja++;
	this.gridBagConstraintsDetalleCuentaFlujoCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleCuentaFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleCuentaFlujoCaja.add(this.jPanelid_tipo_operacionDetalleCuentaFlujoCaja, this.gridBagConstraintsDetalleCuentaFlujoCaja);



	if(iXPanelCamposDetalleCuentaFlujoCaja % 1==0) {
		iXPanelCamposDetalleCuentaFlujoCaja=0;
		iYPanelCamposDetalleCuentaFlujoCaja++;
	}
	this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsDetalleCuentaFlujoCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleCuentaFlujoCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy = iYPanelCamposDetalleCuentaFlujoCaja;
	this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx = iXPanelCamposDetalleCuentaFlujoCaja++;
	this.gridBagConstraintsDetalleCuentaFlujoCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleCuentaFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleCuentaFlujoCaja.add(this.jPanelid_cuenta_flujo_cajaDetalleCuentaFlujoCaja, this.gridBagConstraintsDetalleCuentaFlujoCaja);



	if(iXPanelCamposDetalleCuentaFlujoCaja % 1==0) {
		iXPanelCamposDetalleCuentaFlujoCaja=0;
		iYPanelCamposDetalleCuentaFlujoCaja++;
	}
	this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsDetalleCuentaFlujoCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleCuentaFlujoCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy = iYPanelCamposDetalleCuentaFlujoCaja;
	this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx = iXPanelCamposDetalleCuentaFlujoCaja++;
	this.gridBagConstraintsDetalleCuentaFlujoCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleCuentaFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleCuentaFlujoCaja.add(this.jPanelid_cuenta_contableDetalleCuentaFlujoCaja, this.gridBagConstraintsDetalleCuentaFlujoCaja);



	if(iXPanelCamposDetalleCuentaFlujoCaja % 1==0) {
		iXPanelCamposDetalleCuentaFlujoCaja=0;
		iYPanelCamposDetalleCuentaFlujoCaja++;
	}
	this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
	this.gridBagConstraintsDetalleCuentaFlujoCaja.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleCuentaFlujoCaja.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy = iYPanelCamposDetalleCuentaFlujoCaja;
	this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx = iXPanelCamposDetalleCuentaFlujoCaja++;
	this.gridBagConstraintsDetalleCuentaFlujoCaja.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleCuentaFlujoCaja.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleCuentaFlujoCaja.add(this.jPanelesta_activoDetalleCuentaFlujoCaja, this.gridBagConstraintsDetalleCuentaFlujoCaja);



	if(iXPanelCamposDetalleCuentaFlujoCaja % 1==0) {
		iXPanelCamposDetalleCuentaFlujoCaja=0;
		iYPanelCamposDetalleCuentaFlujoCaja++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
		
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
			
		GridBagLayout gridaBagLayoutAccionesDetalleCuentaFlujoCaja= new GridBagLayout();
		this.jPanelAccionesDetalleCuentaFlujoCaja.setLayout(gridaBagLayoutAccionesDetalleCuentaFlujoCaja);
		
		GridBagLayout gridaBagLayoutAccionesFormularioDetalleCuentaFlujoCaja= new GridBagLayout();
		this.jPanelAccionesFormularioDetalleCuentaFlujoCaja.setLayout(gridaBagLayoutAccionesFormularioDetalleCuentaFlujoCaja);
		
		this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetalleCuentaFlujoCaja.add(this.jComboBoxTiposAccionesFormularioDetalleCuentaFlujoCaja, this.gridBagConstraintsDetalleCuentaFlujoCaja);

		this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetalleCuentaFlujoCaja.add(this.jCheckBoxPostAccionNuevoDetalleCuentaFlujoCaja, this.gridBagConstraintsDetalleCuentaFlujoCaja);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.detallecuentaflujocajaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetalleCuentaFlujoCaja.add(this.jCheckBoxPostAccionSinCerrarDetalleCuentaFlujoCaja, this.gridBagConstraintsDetalleCuentaFlujoCaja);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.detallecuentaflujocajaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.detallecuentaflujocajaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetalleCuentaFlujoCaja.add(this.jCheckBoxPostAccionSinMensajeDetalleCuentaFlujoCaja, this.gridBagConstraintsDetalleCuentaFlujoCaja);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsDetalleCuentaFlujoCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy = 0;
		this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx = iPosXAccion++;
			
		this.jPanelAccionesDetalleCuentaFlujoCaja.add(this.jButtonModificarDetalleCuentaFlujoCaja, this.gridBagConstraintsDetalleCuentaFlujoCaja);							

		this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsDetalleCuentaFlujoCaja.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy = 0;
		this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx =iPosXAccion++;
			
		this.jPanelAccionesDetalleCuentaFlujoCaja.add(this.jButtonEliminarDetalleCuentaFlujoCaja, this.gridBagConstraintsDetalleCuentaFlujoCaja);
		
			
		this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy = 0;		
		this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetalleCuentaFlujoCaja.add(this.jButtonActualizarDetalleCuentaFlujoCaja, this.gridBagConstraintsDetalleCuentaFlujoCaja);


		this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy = 0;		
		this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetalleCuentaFlujoCaja.add(this.jButtonGuardarCambiosDetalleCuentaFlujoCaja, this.gridBagConstraintsDetalleCuentaFlujoCaja);	
		
		this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy = 0;		
		this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx =iPosXAccion++;
		
		this.jPanelAccionesDetalleCuentaFlujoCaja.add(this.jButtonCancelarDetalleCuentaFlujoCaja, this.gridBagConstraintsDetalleCuentaFlujoCaja);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetalleCuentaFlujoCaja = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetalleCuentaFlujoCaja);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detallecuentaflujocajaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();						
			this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx = 0;		
			//this.gridBagConstraintsDetalleCuentaFlujoCaja.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleCuentaFlujoCaja.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetalleCuentaFlujoCaja.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx =0;
		this.gridBagConstraintsDetalleCuentaFlujoCaja.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetalleCuentaFlujoCaja.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetalleCuentaFlujoCaja, this.gridBagConstraintsDetalleCuentaFlujoCaja);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(DetalleCuentaFlujoCajaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleDetalleCuentaFlujoCaja = new DetalleCuentaFlujoCajaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Detalle Cuenta Flujo Caja DATOS");
			
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
			
	        //this.setTitle("[FOR] - Detalle Cuenta Flujo Caja DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Detalle Cuenta Flujo Caja Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			DetalleCuentaFlujoCajaModel detallecuentaflujocajaModel=new DetalleCuentaFlujoCajaModel(this);
			
			//SI USARA CLASE INTERNA
			//DetalleCuentaFlujoCajaModel.DetalleCuentaFlujoCajaFocusTraversalPolicy detallecuentaflujocajaFocusTraversalPolicy = detallecuentaflujocajaModel.new DetalleCuentaFlujoCajaFocusTraversalPolicy(this);
			
			//detallecuentaflujocajaFocusTraversalPolicy.setdetallecuentaflujocajaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(detallecuentaflujocajaModel);
			
			
			this.jContentPaneDetalleDetalleCuentaFlujoCaja = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleDetalleCuentaFlujoCaja = new GridBagLayout();	
			this.jContentPaneDetalleDetalleCuentaFlujoCaja.setLayout(gridaBagLayoutDetalleDetalleCuentaFlujoCaja);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetalleCuentaFlujoCaja = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
				this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx = 0;
					
				
				this.jContentPaneDetalleDetalleCuentaFlujoCaja.add(jTtoolBarDetalleDetalleCuentaFlujoCaja, gridBagConstraintsDetalleCuentaFlujoCaja);								
				
}
			
			this.jScrollPanelDatosEdicionDetalleCuentaFlujoCaja=   new JScrollPane(jContentPaneDetalleDetalleCuentaFlujoCaja,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetalleCuentaFlujoCaja.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleCuentaFlujoCaja.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleCuentaFlujoCaja.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralDetalleCuentaFlujoCaja=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetalleCuentaFlujoCaja.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleCuentaFlujoCaja.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleCuentaFlujoCaja.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
			
			
	        this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx = 0;
	        
			this.jContentPaneDetalleDetalleCuentaFlujoCaja.add(jPanelCamposDetalleCuentaFlujoCaja, gridBagConstraintsDetalleCuentaFlujoCaja);
			
			
			
			
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
						&& detallecuentaflujocajaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.detallecuentaflujocajaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsDetalleCuentaFlujoCaja= new GridBagConstraints();
						this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy = iGridyRelaciones++;
						this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx = 0;
						this.jContentPaneDetalleDetalleCuentaFlujoCaja.add(this.jTabbedPaneRelacionesDetalleCuentaFlujoCaja, this.gridBagConstraintsDetalleCuentaFlujoCaja);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesDetalleCuentaFlujoCaja.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosDetalleCuentaFlujoCaja.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
					this.gridBagConstraintsDetalleCuentaFlujoCaja.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsDetalleCuentaFlujoCaja.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx = 0;
					
				
					this.jContentPaneDetalleDetalleCuentaFlujoCaja.add(jPanelCamposOcultosDetalleCuentaFlujoCaja, gridBagConstraintsDetalleCuentaFlujoCaja);
				
					this.jPanelCamposOcultosDetalleCuentaFlujoCaja.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx = 0;
	        this.gridBagConstraintsDetalleCuentaFlujoCaja.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleDetalleCuentaFlujoCaja.add(this.jPanelAccionesFormularioDetalleCuentaFlujoCaja, this.gridBagConstraintsDetalleCuentaFlujoCaja);							
			
			
			
			this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
	        this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx = 0;
	        
			
			this.jContentPaneDetalleDetalleCuentaFlujoCaja.add(this.jPanelAccionesDetalleCuentaFlujoCaja, this.gridBagConstraintsDetalleCuentaFlujoCaja);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionDetalleCuentaFlujoCaja);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionDetalleCuentaFlujoCaja=   new JScrollPane(this.jPanelCamposDetalleCuentaFlujoCaja,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetalleCuentaFlujoCaja.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleCuentaFlujoCaja.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleCuentaFlujoCaja.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx = 0;
			this.gridBagConstraintsDetalleCuentaFlujoCaja.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsDetalleCuentaFlujoCaja.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsDetalleCuentaFlujoCaja.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionDetalleCuentaFlujoCaja, this.gridBagConstraintsDetalleCuentaFlujoCaja);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioDetalleCuentaFlujoCaja, this.gridBagConstraintsDetalleCuentaFlujoCaja);			
			
			this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
			this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesDetalleCuentaFlujoCaja, this.gridBagConstraintsDetalleCuentaFlujoCaja);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetalleCuentaFlujoCaja, this.gridBagConstraintsDetalleCuentaFlujoCaja);
			
			
		this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetalleCuentaFlujoCaja, this.gridBagConstraintsDetalleCuentaFlujoCaja);
		
			
		this.gridBagConstraintsDetalleCuentaFlujoCaja = new GridBagConstraints();
		this.gridBagConstraintsDetalleCuentaFlujoCaja.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetalleCuentaFlujoCaja.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetalleCuentaFlujoCaja, this.gridBagConstraintsDetalleCuentaFlujoCaja);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralDetalleCuentaFlujoCaja;//jContentPane;
		
		return jScrollPanelDatosEdicionDetalleCuentaFlujoCaja;
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
