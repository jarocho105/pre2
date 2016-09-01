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

import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.puntoventa.util.ProntoPagoConstantesFunciones;

import com.bydan.erp.puntoventa.business.logic.*;
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
public class ProntoPagoDetalleFormJInternalFrame extends ProntoPagoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleProntoPago;
	
	protected JMenuBar jmenuBarDetalleProntoPago;
	
	protected JMenu jmenuDetalleProntoPago;
	protected JMenu jmenuDetalleArchivoProntoPago;
	protected JMenu jmenuDetalleAccionesProntoPago;
	protected JMenu jmenuDetalleDatosProntoPago;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleProntoPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProntoPago;	
	protected GridBagConstraints gridBagConstraintsProntoPago;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ProntoPagoBeanSwingJInternalFrameAdditional jInternalFrameDetalleProntoPago;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public ProntoPagoSessionBean prontopagoSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public ProntoPagoLogic prontopagoLogic;
	
	public JScrollPane jScrollPanelDatosProntoPago;
	public JScrollPane jScrollPanelDatosEdicionProntoPago;
	public JScrollPane jScrollPanelDatosGeneralProntoPago;
	
	protected JPanel jPanelCamposProntoPago;    
	protected JPanel jPanelCamposOcultosProntoPago;    	
	protected JPanel jPanelAccionesProntoPago;
	protected JPanel jPanelAccionesFormularioProntoPago;
    
	
	
	protected Integer iXPanelCamposProntoPago=0;
	protected Integer iYPanelCamposProntoPago=0;
	
	protected Integer iXPanelCamposOcultosProntoPago=0;
	protected Integer iYPanelCamposOcultosProntoPago=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoProntoPago;
	public JButton jButtonModificarProntoPago;
	public JButton jButtonActualizarProntoPago;
    public JButton jButtonEliminarProntoPago;
	public JButton jButtonCancelarProntoPago;
    public JButton jButtonGuardarCambiosProntoPago;
	public JButton jButtonGuardarCambiosTablaProntoPago;
	protected JButton jButtonCerrarProntoPago;
	
	
	protected JButton jButtonProcesarInformacionProntoPago;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoProntoPago;
	protected JCheckBox jCheckBoxPostAccionSinCerrarProntoPago;
	protected JCheckBox jCheckBoxPostAccionSinMensajeProntoPago;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProntoPago;
	protected JButton jButtonModificarToolBarProntoPago;
	protected JButton jButtonActualizarToolBarProntoPago;
    protected JButton jButtonEliminarToolBarProntoPago;
	protected JButton jButtonCancelarToolBarProntoPago;
    protected JButton jButtonGuardarCambiosToolBarProntoPago;
	protected JButton jButtonGuardarCambiosTablaToolBarProntoPago;
	protected JButton jButtonMostrarOcultarTablaToolBarProntoPago;
	protected JButton jButtonCerrarToolBarProntoPago;
	
	protected JButton jButtonProcesarInformacionToolBarProntoPago;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProntoPago;
	protected JMenuItem jMenuItemModificarProntoPago;
	protected JMenuItem jMenuItemActualizarProntoPago;
    protected JMenuItem jMenuItemEliminarProntoPago;
	protected JMenuItem jMenuItemCancelarProntoPago;
    protected JMenuItem jMenuItemGuardarCambiosProntoPago;
	protected JMenuItem jMenuItemGuardarCambiosTablaProntoPago;
	protected JMenuItem jMenuItemCerrarProntoPago;
	protected JMenuItem jMenuItemDetalleCerrarProntoPago;
	protected JMenuItem jMenuItemDetalleMostarOcultarProntoPago;
	
	protected JMenuItem jMenuItemProcesarInformacionProntoPago;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProntoPago;
	protected JMenuItem jMenuItemMostrarOcultarProntoPago;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProntoPago;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProntoPago;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProntoPago;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioProntoPago;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidProntoPago;
	public JLabel jLabelIdProntoPago;
	public JLabel jLabelidProntoPago;
	public JButton jButtonidProntoPagoBusqueda= new JButtonMe();

	public JPanel jPaneldia_inicioProntoPago;
	public JLabel jLabeldia_inicioProntoPago;
	public JTextField jTextFielddia_inicioProntoPago;
	public JButton jButtondia_inicioProntoPagoBusqueda= new JButtonMe();

	public JPanel jPaneldia_finProntoPago;
	public JLabel jLabeldia_finProntoPago;
	public JTextField jTextFielddia_finProntoPago;
	public JButton jButtondia_finProntoPagoBusqueda= new JButtonMe();

	public JPanel jPanelporcentaje_descuentoProntoPago;
	public JLabel jLabelporcentaje_descuentoProntoPago;
	public JTextField jTextFieldporcentaje_descuentoProntoPago;
	public JButton jButtonporcentaje_descuentoProntoPagoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaProntoPago;
	public JLabel jLabelid_empresaProntoPago;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaProntoPago;
	public JButton jButtonid_empresaProntoPago= new JButtonMe();
	public JButton jButtonid_empresaProntoPagoUpdate= new JButtonMe();
	public JButton jButtonid_empresaProntoPagoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesProntoPago;
	
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
		
	public int iWidthFormulario=450;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightFormulario=286;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ProntoPagoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposProntoPago=new JPanel();
				this.jPanelAccionesFormularioProntoPago=new JPanel();
				this.jmenuBarDetalleProntoPago=new JMenuBar();
				this.jTtoolBarDetalleProntoPago=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProntoPagoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ProntoPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ProntoPagoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ProntoPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProntoPagoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProntoPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProntoPagoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ProntoPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProntoPagoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ProntoPago No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarProntoPago() {
		return this.jButtonActualizarToolBarProntoPago;
	}
	
	public JButton getjButtonEliminarToolBarProntoPago() {
		return this.jButtonEliminarToolBarProntoPago;
	}
	
	public JButton getjButtonCancelarToolBarProntoPago() {
		return this.jButtonCancelarToolBarProntoPago;
	}		
	
	public JButton getjButtonProcesarInformacionProntoPago() {
		return this.jButtonProcesarInformacionProntoPago;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProntoPago)	{
		this.jButtonProcesarInformacionProntoPago = jButtonProcesarInformacionProntoPago;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProntoPago() {
		return this.jComboBoxTiposAccionesProntoPago;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProntoPago(
			JComboBox jComboBoxTiposRelacionesProntoPago) {
		this.jComboBoxTiposRelacionesProntoPago = jComboBoxTiposRelacionesProntoPago;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProntoPago(
			JComboBox jComboBoxTiposAccionesProntoPago) {
		this.jComboBoxTiposAccionesProntoPago = jComboBoxTiposAccionesProntoPago;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioProntoPago() {
		return this.jComboBoxTiposAccionesFormularioProntoPago;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioProntoPago(
			JComboBox jComboBoxTiposAccionesFormularioProntoPago) {
		this.jComboBoxTiposAccionesFormularioProntoPago = jComboBoxTiposAccionesFormularioProntoPago;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.prontopagoSessionBean=new ProntoPagoSessionBean();
		
		this.prontopagoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.prontopagoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.prontopagoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProntoPagoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProntoPagoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProntoPagoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Pronto Pago MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.prontopagoSessionBean.getEsGuardarRelacionado()) {
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
	
		ProntoPagoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleProntoPago= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarProntoPago=new JButtonMe();
				this.jButtonModificarToolBarProntoPago=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarProntoPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarProntoPago,this.jTtoolBarDetalleProntoPago,
							"actualizar","actualizar","Actualizar"+" "+ProntoPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarProntoPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarProntoPago,this.jTtoolBarDetalleProntoPago,
							"eliminar","eliminar","Eliminar"+" "+ProntoPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarProntoPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarProntoPago,this.jTtoolBarDetalleProntoPago,
							"cancelar","cancelar","Cancelar"+" "+ProntoPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarProntoPago=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarProntoPago,this.jTtoolBarDetalleProntoPago,
							"guardarcambios","guardarcambios","Guardar"+" "+ProntoPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarProntoPago,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarProntoPago,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarProntoPago,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleProntoPago=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleProntoPago=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoProntoPago=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesProntoPago=new JMenuMe("Acciones");
		this.jmenuDetalleDatosProntoPago=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProntoPago= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProntoPago.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProntoPago,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProntoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarProntoPago= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarProntoPago.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarProntoPago,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarProntoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarProntoPago= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarProntoPago.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarProntoPago,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarProntoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarProntoPago= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarProntoPago.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarProntoPago,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarProntoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarProntoPago= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarProntoPago.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarProntoPago,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarProntoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosProntoPago= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProntoPago.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProntoPago,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProntoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProntoPago= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProntoPago.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProntoPago,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProntoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarProntoPago= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarProntoPago.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarProntoPago,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarProntoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProntoPago= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProntoPago.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProntoPago,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProntoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProntoPago= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProntoPago.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProntoPago,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProntoPago, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoProntoPago.add(this.jMenuItemDetalleCerrarProntoPago);
		
		this.jmenuDetalleAccionesProntoPago.add(this.jMenuItemActualizarProntoPago);
		this.jmenuDetalleAccionesProntoPago.add(this.jMenuItemEliminarProntoPago);
		this.jmenuDetalleAccionesProntoPago.add(this.jMenuItemCancelarProntoPago);		
		
		//this.jmenuDetalleDatosProntoPago.add(this.jMenuItemDetalleAbrirOrderByProntoPago);				
		this.jmenuDetalleDatosProntoPago.add(this.jMenuItemDetalleMostarOcultarProntoPago);				
				
		//this.jmenuDetalleAccionesProntoPago.add(this.jMenuItemGuardarCambiosProntoPago);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoProntoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesProntoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosProntoPago, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleProntoPago.add(this.jmenuDetalleArchivoProntoPago);		
		this.jmenuBarDetalleProntoPago.add(this.jmenuDetalleAccionesProntoPago);		
		this.jmenuBarDetalleProntoPago.add(this.jmenuDetalleDatosProntoPago);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleProntoPago);				
	}
	
	
	public void inicializarElementosCamposProntoPago() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdProntoPago = new JLabelMe();
		jLabelIdProntoPago.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdProntoPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProntoPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProntoPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdProntoPago,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidProntoPago = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidProntoPago.setToolTipText(ProntoPagoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutProntoPago= new GridBagLayout();

		this.jPanelidProntoPago.setLayout(this.gridaBagLayoutProntoPago);

		jLabelidProntoPago = new JLabel();
		jLabelidProntoPago.setText("Id");

		jLabelidProntoPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProntoPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidProntoPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabeldia_inicioProntoPago = new JLabelMe();
		this.jLabeldia_inicioProntoPago.setText(""+ProntoPagoConstantesFunciones.LABEL_DIAINICIO+" : *");
		this.jLabeldia_inicioProntoPago.setToolTipText("Dia Inicio");
		this.jLabeldia_inicioProntoPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldia_inicioProntoPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldia_inicioProntoPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldia_inicioProntoPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldia_inicioProntoPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldia_inicioProntoPago.setToolTipText(ProntoPagoConstantesFunciones.LABEL_DIAINICIO);
		this.gridaBagLayoutProntoPago = new GridBagLayout();
		this.jPaneldia_inicioProntoPago.setLayout(this.gridaBagLayoutProntoPago);


		jTextFielddia_inicioProntoPago= new JTextFieldMe();
		jTextFielddia_inicioProntoPago.setEnabled(false);
		jTextFielddia_inicioProntoPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddia_inicioProntoPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddia_inicioProntoPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddia_inicioProntoPago,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddia_inicioProntoPago.setText("0");

		this.jButtondia_inicioProntoPagoBusqueda= new JButtonMe();
		this.jButtondia_inicioProntoPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondia_inicioProntoPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondia_inicioProntoPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondia_inicioProntoPagoBusqueda.setText("U");
		this.jButtondia_inicioProntoPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondia_inicioProntoPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondia_inicioProntoPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddia_inicioProntoPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddia_inicioProntoPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"dia_inicioProntoPagoBusqueda"));

		if(this.prontopagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondia_inicioProntoPagoBusqueda.setVisible(false);		}


					
		this.jLabeldia_finProntoPago = new JLabelMe();
		this.jLabeldia_finProntoPago.setText(""+ProntoPagoConstantesFunciones.LABEL_DIAFIN+" : *");
		this.jLabeldia_finProntoPago.setToolTipText("Dia Fin");
		this.jLabeldia_finProntoPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldia_finProntoPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldia_finProntoPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldia_finProntoPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldia_finProntoPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldia_finProntoPago.setToolTipText(ProntoPagoConstantesFunciones.LABEL_DIAFIN);
		this.gridaBagLayoutProntoPago = new GridBagLayout();
		this.jPaneldia_finProntoPago.setLayout(this.gridaBagLayoutProntoPago);


		jTextFielddia_finProntoPago= new JTextFieldMe();
		jTextFielddia_finProntoPago.setEnabled(false);
		jTextFielddia_finProntoPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddia_finProntoPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddia_finProntoPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddia_finProntoPago,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddia_finProntoPago.setText("0");

		this.jButtondia_finProntoPagoBusqueda= new JButtonMe();
		this.jButtondia_finProntoPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondia_finProntoPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondia_finProntoPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondia_finProntoPagoBusqueda.setText("U");
		this.jButtondia_finProntoPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondia_finProntoPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondia_finProntoPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddia_finProntoPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddia_finProntoPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"dia_finProntoPagoBusqueda"));

		if(this.prontopagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondia_finProntoPagoBusqueda.setVisible(false);		}


					
		this.jLabelporcentaje_descuentoProntoPago = new JLabelMe();
		this.jLabelporcentaje_descuentoProntoPago.setText(""+ProntoPagoConstantesFunciones.LABEL_PORCENTAJEDESCUENTO+" : *");
		this.jLabelporcentaje_descuentoProntoPago.setToolTipText("Porcentaje Descuento");
		this.jLabelporcentaje_descuentoProntoPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelporcentaje_descuentoProntoPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelporcentaje_descuentoProntoPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelporcentaje_descuentoProntoPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcentaje_descuentoProntoPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcentaje_descuentoProntoPago.setToolTipText(ProntoPagoConstantesFunciones.LABEL_PORCENTAJEDESCUENTO);
		this.gridaBagLayoutProntoPago = new GridBagLayout();
		this.jPanelporcentaje_descuentoProntoPago.setLayout(this.gridaBagLayoutProntoPago);


		jTextFieldporcentaje_descuentoProntoPago= new JTextFieldMe();
		jTextFieldporcentaje_descuentoProntoPago.setEnabled(false);
		jTextFieldporcentaje_descuentoProntoPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentaje_descuentoProntoPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentaje_descuentoProntoPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcentaje_descuentoProntoPago,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcentaje_descuentoProntoPago.setText("0.0");

		this.jButtonporcentaje_descuentoProntoPagoBusqueda= new JButtonMe();
		this.jButtonporcentaje_descuentoProntoPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentaje_descuentoProntoPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentaje_descuentoProntoPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcentaje_descuentoProntoPagoBusqueda.setText("U");
		this.jButtonporcentaje_descuentoProntoPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcentaje_descuentoProntoPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcentaje_descuentoProntoPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcentaje_descuentoProntoPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcentaje_descuentoProntoPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcentaje_descuentoProntoPagoBusqueda"));

		if(this.prontopagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcentaje_descuentoProntoPagoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysProntoPago() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaProntoPago = new JLabelMe();
		this.jLabelid_empresaProntoPago.setText(""+ProntoPagoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaProntoPago.setToolTipText("Empresa");
		this.jLabelid_empresaProntoPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaProntoPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaProntoPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaProntoPago,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaProntoPago=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaProntoPago.setToolTipText(ProntoPagoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutProntoPago = new GridBagLayout();
		this.jPanelid_empresaProntoPago.setLayout(this.gridaBagLayoutProntoPago);


		jComboBoxid_empresaProntoPago= new JComboBoxMe();
		jComboBoxid_empresaProntoPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaProntoPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaProntoPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaProntoPago,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaProntoPago.setEnabled(false);

		this.jButtonid_empresaProntoPago= new JButtonMe();
		this.jButtonid_empresaProntoPago.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProntoPago.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProntoPago.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaProntoPago.setText("Buscar");
		this.jButtonid_empresaProntoPago.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaProntoPago.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProntoPago,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaProntoPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProntoPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProntoPago"));

		this.jButtonid_empresaProntoPagoBusqueda= new JButtonMe();
		this.jButtonid_empresaProntoPagoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProntoPagoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProntoPagoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaProntoPagoBusqueda.setText("U");
		this.jButtonid_empresaProntoPagoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaProntoPagoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProntoPagoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaProntoPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProntoPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProntoPagoBusqueda"));

		if(this.prontopagoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaProntoPagoBusqueda.setVisible(false);		}

		this.jButtonid_empresaProntoPagoUpdate= new JButtonMe();
		this.jButtonid_empresaProntoPagoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProntoPagoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaProntoPagoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaProntoPagoUpdate.setText("U");
		this.jButtonid_empresaProntoPagoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaProntoPagoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaProntoPagoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaProntoPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaProntoPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaProntoPagoUpdate"));



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
		//this.jInternalFrameDetalleProntoPago = new ProntoPagoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Pronto Pago DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProntoPago= new GridBagLayout();
		

		
		String sToolTipProntoPago="";
		sToolTipProntoPago=ProntoPagoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProntoPago+="(PuntoVenta.ProntoPago)";
		}
		
		if(!this.prontopagoSessionBean.getEsGuardarRelacionado()) {
			sToolTipProntoPago+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoProntoPago = new JButtonMe();
		this.jButtonModificarProntoPago = new JButtonMe();
        this.jButtonActualizarProntoPago = new JButtonMe();
        this.jButtonEliminarProntoPago = new JButtonMe();
        this.jButtonCancelarProntoPago = new JButtonMe();
        this.jButtonGuardarCambiosProntoPago = new JButtonMe();
		this.jButtonGuardarCambiosTablaProntoPago = new JButtonMe();
		this.jButtonCerrarProntoPago = new JButtonMe();
		
		this.jScrollPanelDatosProntoPago = new JScrollPane();   
        this.jScrollPanelDatosEdicionProntoPago = new JScrollPane();
		this.jScrollPanelDatosGeneralProntoPago = new JScrollPane();
				
		
		
		this.jPanelCamposProntoPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosProntoPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesProntoPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioProntoPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Pronto Pago";
		
		if(!this.prontopagoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProntoPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pronto Pagos" + this.sPath));
		} else {
			this.jScrollPanelDatosProntoPago.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionProntoPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralProntoPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposProntoPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposProntoPago.setName("jPanelCamposProntoPago"); 

		this.jPanelCamposOcultosProntoPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosProntoPago.setName("jPanelCamposOcultosProntoPago"); 

        this.jPanelAccionesProntoPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProntoPago.setToolTipText("Acciones");
        this.jPanelAccionesProntoPago.setName("Acciones"); 

		this.jPanelAccionesFormularioProntoPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioProntoPago.setToolTipText("Acciones");
        this.jPanelAccionesFormularioProntoPago.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionProntoPago, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProntoPago, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProntoPago, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposProntoPago, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosProntoPago, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioProntoPago, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoProntoPago.setText("Nuevo");
		this.jButtonModificarProntoPago.setText("Editar");
        this.jButtonActualizarProntoPago.setText("Actualizar");
        this.jButtonEliminarProntoPago.setText("Eliminar");
        this.jButtonCancelarProntoPago.setText("Cancelar");
        this.jButtonGuardarCambiosProntoPago.setText("Guardar");
		this.jButtonGuardarCambiosTablaProntoPago.setText("Guardar");
		this.jButtonCerrarProntoPago.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProntoPago,"nuevo_button","Nuevo",this.prontopagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarProntoPago,"modificar_button","Editar",this.prontopagoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarProntoPago,"actualizar_button","Actualizar",this.prontopagoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarProntoPago,"eliminar_button","Eliminar",this.prontopagoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarProntoPago,"cancelar_button","Cancelar",this.prontopagoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosProntoPago,"guardarcambios_button","Guardar",this.prontopagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProntoPago,"guardarcambiostabla_button","Guardar",this.prontopagoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProntoPago,"cerrar_button","Salir",this.prontopagoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProntoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarProntoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosProntoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProntoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProntoPago, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarProntoPago, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarProntoPago, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarProntoPago, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoProntoPago.setToolTipText("Nuevo"+" "+ProntoPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarProntoPago.setToolTipText("Editar"+" "+ProntoPagoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarProntoPago.setToolTipText("Actualizar"+" "+ProntoPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarProntoPago.setToolTipText("Eliminar)"+" "+ProntoPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarProntoPago.setToolTipText("Cancelar"+" "+ProntoPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosProntoPago.setToolTipText("Guardar"+" "+ProntoPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaProntoPago.setToolTipText("Guardar"+" "+ProntoPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProntoPago.setToolTipText("Salir"+" "+ProntoPagoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProntoPago";
		inputMap = this.jButtonNuevoProntoPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProntoPago.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProntoPago"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarProntoPago";
		inputMap = this.jButtonActualizarProntoPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarProntoPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarProntoPago"));
		
		//ELIMINAR
		sMapKey = "EliminarProntoPago";
		inputMap = this.jButtonEliminarProntoPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarProntoPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarProntoPago"));
		
		//CANCELAR	
		sMapKey = "CancelarProntoPago";
		inputMap = this.jButtonCancelarProntoPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarProntoPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarProntoPago"));
		
		//CERRAR		
		sMapKey = "CerrarProntoPago";
		inputMap = this.jButtonCerrarProntoPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProntoPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProntoPago"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProntoPago";
		inputMap = this.jButtonGuardarCambiosTablaProntoPago.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProntoPago.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProntoPago"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoProntoPago = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoProntoPago.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoProntoPago.setToolTipText("Nuevo ProntoPago");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoProntoPago, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarProntoPago = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarProntoPago.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarProntoPago.setToolTipText("Sin Cerrar Ventana ProntoPago");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarProntoPago, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeProntoPago = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeProntoPago.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeProntoPago.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeProntoPago, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesProntoPago = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProntoPago.setText("Accion");
		this.jComboBoxTiposAccionesProntoPago.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioProntoPago = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioProntoPago.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioProntoPago.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesProntoPago = new JLabelMe();
		
		this.jLabelAccionesProntoPago.setText("Acciones");		
		this.jLabelAccionesProntoPago.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProntoPago.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProntoPago.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposProntoPago();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysProntoPago();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesProntoPago=new JTabbedPane();
		this.jTabbedPaneRelacionesProntoPago.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesProntoPago,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesProntoPago.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProntoPago.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProntoPago.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProntoPago, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioProntoPago.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProntoPago.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProntoPago.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioProntoPago, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposProntoPago = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosProntoPago = new GridBagLayout();
		
		this.jPanelCamposProntoPago.setLayout(gridaBagLayoutCamposProntoPago);
		this.jPanelCamposOcultosProntoPago.setLayout(gridaBagLayoutCamposOcultosProntoPago);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsProntoPago = new GridBagConstraints();
	this.gridBagConstraintsProntoPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProntoPago.gridy = 0;
	this.gridBagConstraintsProntoPago.gridx = 0;
	this.gridBagConstraintsProntoPago.ipadx = 0;
	this.gridBagConstraintsProntoPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidProntoPago.add(jLabelIdProntoPago, this.gridBagConstraintsProntoPago);



	this.gridBagConstraintsProntoPago = new GridBagConstraints();
	this.gridBagConstraintsProntoPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProntoPago.gridy = 0;
	this.gridBagConstraintsProntoPago.gridx = 1;
	this.gridBagConstraintsProntoPago.ipadx = 0;
	this.gridBagConstraintsProntoPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidProntoPago.add(jLabelidProntoPago, this.gridBagConstraintsProntoPago);


	this.gridBagConstraintsProntoPago = new GridBagConstraints();
	this.gridBagConstraintsProntoPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProntoPago.gridy = 0;
	this.gridBagConstraintsProntoPago.gridx = 0;
	this.gridBagConstraintsProntoPago.ipadx = 0;
	this.gridBagConstraintsProntoPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaProntoPago.add(jLabelid_empresaProntoPago, this.gridBagConstraintsProntoPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProntoPago = new GridBagConstraints();
		//this.gridBagConstraintsProntoPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProntoPago.gridy = 0;
		this.gridBagConstraintsProntoPago.gridx = 2;
		this.gridBagConstraintsProntoPago.ipadx = 0;
		this.gridBagConstraintsProntoPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaProntoPago.add(jButtonid_empresaProntoPagoBusqueda, this.gridBagConstraintsProntoPago);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProntoPago = new GridBagConstraints();
		//this.gridBagConstraintsProntoPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProntoPago.gridy = 0;
		this.gridBagConstraintsProntoPago.gridx = 3;
		this.gridBagConstraintsProntoPago.ipadx = 0;
		this.gridBagConstraintsProntoPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaProntoPago.add(jButtonid_empresaProntoPagoUpdate, this.gridBagConstraintsProntoPago);
	}

	this.gridBagConstraintsProntoPago = new GridBagConstraints();
	this.gridBagConstraintsProntoPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProntoPago.gridy = 0;
	this.gridBagConstraintsProntoPago.gridx = 1;
	this.gridBagConstraintsProntoPago.ipadx = 0;
	this.gridBagConstraintsProntoPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaProntoPago.add(jComboBoxid_empresaProntoPago, this.gridBagConstraintsProntoPago);


	this.gridBagConstraintsProntoPago = new GridBagConstraints();
	this.gridBagConstraintsProntoPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProntoPago.gridy = 0;
	this.gridBagConstraintsProntoPago.gridx = 0;
	this.gridBagConstraintsProntoPago.ipadx = 0;
	this.gridBagConstraintsProntoPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldia_inicioProntoPago.add(jLabeldia_inicioProntoPago, this.gridBagConstraintsProntoPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProntoPago = new GridBagConstraints();
		//this.gridBagConstraintsProntoPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProntoPago.gridy = 0;
		this.gridBagConstraintsProntoPago.gridx = 2;
		this.gridBagConstraintsProntoPago.ipadx = 0;
		this.gridBagConstraintsProntoPago.insets = new Insets(0, 0, 0, 0);
		this.jPaneldia_inicioProntoPago.add(jButtondia_inicioProntoPagoBusqueda, this.gridBagConstraintsProntoPago);
	}

	this.gridBagConstraintsProntoPago = new GridBagConstraints();
	this.gridBagConstraintsProntoPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProntoPago.gridy = 0;
	this.gridBagConstraintsProntoPago.gridx = 1;
	this.gridBagConstraintsProntoPago.ipadx = 0;
	this.gridBagConstraintsProntoPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldia_inicioProntoPago.add(jTextFielddia_inicioProntoPago, this.gridBagConstraintsProntoPago);


	this.gridBagConstraintsProntoPago = new GridBagConstraints();
	this.gridBagConstraintsProntoPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProntoPago.gridy = 0;
	this.gridBagConstraintsProntoPago.gridx = 0;
	this.gridBagConstraintsProntoPago.ipadx = 0;
	this.gridBagConstraintsProntoPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldia_finProntoPago.add(jLabeldia_finProntoPago, this.gridBagConstraintsProntoPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProntoPago = new GridBagConstraints();
		//this.gridBagConstraintsProntoPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProntoPago.gridy = 0;
		this.gridBagConstraintsProntoPago.gridx = 2;
		this.gridBagConstraintsProntoPago.ipadx = 0;
		this.gridBagConstraintsProntoPago.insets = new Insets(0, 0, 0, 0);
		this.jPaneldia_finProntoPago.add(jButtondia_finProntoPagoBusqueda, this.gridBagConstraintsProntoPago);
	}

	this.gridBagConstraintsProntoPago = new GridBagConstraints();
	this.gridBagConstraintsProntoPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProntoPago.gridy = 0;
	this.gridBagConstraintsProntoPago.gridx = 1;
	this.gridBagConstraintsProntoPago.ipadx = 0;
	this.gridBagConstraintsProntoPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldia_finProntoPago.add(jTextFielddia_finProntoPago, this.gridBagConstraintsProntoPago);


	this.gridBagConstraintsProntoPago = new GridBagConstraints();
	this.gridBagConstraintsProntoPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProntoPago.gridy = 0;
	this.gridBagConstraintsProntoPago.gridx = 0;
	this.gridBagConstraintsProntoPago.ipadx = 0;
	this.gridBagConstraintsProntoPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelporcentaje_descuentoProntoPago.add(jLabelporcentaje_descuentoProntoPago, this.gridBagConstraintsProntoPago);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProntoPago = new GridBagConstraints();
		//this.gridBagConstraintsProntoPago.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProntoPago.gridy = 0;
		this.gridBagConstraintsProntoPago.gridx = 2;
		this.gridBagConstraintsProntoPago.ipadx = 0;
		this.gridBagConstraintsProntoPago.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcentaje_descuentoProntoPago.add(jButtonporcentaje_descuentoProntoPagoBusqueda, this.gridBagConstraintsProntoPago);
	}

	this.gridBagConstraintsProntoPago = new GridBagConstraints();
	this.gridBagConstraintsProntoPago.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProntoPago.gridy = 0;
	this.gridBagConstraintsProntoPago.gridx = 1;
	this.gridBagConstraintsProntoPago.ipadx = 0;
	this.gridBagConstraintsProntoPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelporcentaje_descuentoProntoPago.add(jTextFieldporcentaje_descuentoProntoPago, this.gridBagConstraintsProntoPago);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsProntoPago = new GridBagConstraints();
	this.gridBagConstraintsProntoPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProntoPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProntoPago.gridy = iYPanelCamposProntoPago;
	this.gridBagConstraintsProntoPago.gridx = iXPanelCamposProntoPago++;
	this.gridBagConstraintsProntoPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProntoPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProntoPago.add(this.jPanelidProntoPago, this.gridBagConstraintsProntoPago);



	if(iXPanelCamposProntoPago % 1==0) {
		iXPanelCamposProntoPago=0;
		iYPanelCamposProntoPago++;
	}
	this.gridBagConstraintsProntoPago = new GridBagConstraints();
	this.gridBagConstraintsProntoPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProntoPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProntoPago.gridy = iYPanelCamposProntoPago;
	this.gridBagConstraintsProntoPago.gridx = iXPanelCamposProntoPago++;
	this.gridBagConstraintsProntoPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProntoPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProntoPago.add(this.jPaneldia_inicioProntoPago, this.gridBagConstraintsProntoPago);



	if(iXPanelCamposProntoPago % 1==0) {
		iXPanelCamposProntoPago=0;
		iYPanelCamposProntoPago++;
	}
	this.gridBagConstraintsProntoPago = new GridBagConstraints();
	this.gridBagConstraintsProntoPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProntoPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProntoPago.gridy = iYPanelCamposProntoPago;
	this.gridBagConstraintsProntoPago.gridx = iXPanelCamposProntoPago++;
	this.gridBagConstraintsProntoPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProntoPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProntoPago.add(this.jPaneldia_finProntoPago, this.gridBagConstraintsProntoPago);



	if(iXPanelCamposProntoPago % 1==0) {
		iXPanelCamposProntoPago=0;
		iYPanelCamposProntoPago++;
	}
	this.gridBagConstraintsProntoPago = new GridBagConstraints();
	this.gridBagConstraintsProntoPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProntoPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProntoPago.gridy = iYPanelCamposProntoPago;
	this.gridBagConstraintsProntoPago.gridx = iXPanelCamposProntoPago++;
	this.gridBagConstraintsProntoPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProntoPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProntoPago.add(this.jPanelporcentaje_descuentoProntoPago, this.gridBagConstraintsProntoPago);



	if(iXPanelCamposProntoPago % 1==0) {
		iXPanelCamposProntoPago=0;
		iYPanelCamposProntoPago++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsProntoPago = new GridBagConstraints();
	this.gridBagConstraintsProntoPago.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProntoPago.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProntoPago.gridy = iYPanelCamposOcultosProntoPago;
	this.gridBagConstraintsProntoPago.gridx = iXPanelCamposOcultosProntoPago++;
	this.gridBagConstraintsProntoPago.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProntoPago.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosProntoPago.add(this.jPanelid_empresaProntoPago, this.gridBagConstraintsProntoPago);



	if(iXPanelCamposOcultosProntoPago % 1==0) {
		iXPanelCamposOcultosProntoPago=0;
		iYPanelCamposOcultosProntoPago++;
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
			
		GridBagLayout gridaBagLayoutAccionesProntoPago= new GridBagLayout();
		this.jPanelAccionesProntoPago.setLayout(gridaBagLayoutAccionesProntoPago);
		
		GridBagLayout gridaBagLayoutAccionesFormularioProntoPago= new GridBagLayout();
		this.jPanelAccionesFormularioProntoPago.setLayout(gridaBagLayoutAccionesFormularioProntoPago);
		
		this.gridBagConstraintsProntoPago = new GridBagConstraints();
		this.gridBagConstraintsProntoPago.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProntoPago.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProntoPago.add(this.jComboBoxTiposAccionesFormularioProntoPago, this.gridBagConstraintsProntoPago);

		this.gridBagConstraintsProntoPago = new GridBagConstraints();
		this.gridBagConstraintsProntoPago.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProntoPago.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProntoPago.add(this.jCheckBoxPostAccionNuevoProntoPago, this.gridBagConstraintsProntoPago);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.prontopagoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsProntoPago = new GridBagConstraints();
			this.gridBagConstraintsProntoPago.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsProntoPago.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioProntoPago.add(this.jCheckBoxPostAccionSinCerrarProntoPago, this.gridBagConstraintsProntoPago);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.prontopagoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.prontopagoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsProntoPago = new GridBagConstraints();
			this.gridBagConstraintsProntoPago.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsProntoPago.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioProntoPago.add(this.jCheckBoxPostAccionSinMensajeProntoPago, this.gridBagConstraintsProntoPago);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsProntoPago = new GridBagConstraints();
		this.gridBagConstraintsProntoPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProntoPago.gridy = 0;
		this.gridBagConstraintsProntoPago.gridx = iPosXAccion++;
			
		this.jPanelAccionesProntoPago.add(this.jButtonModificarProntoPago, this.gridBagConstraintsProntoPago);							

		this.gridBagConstraintsProntoPago = new GridBagConstraints();
		this.gridBagConstraintsProntoPago.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProntoPago.gridy = 0;
		this.gridBagConstraintsProntoPago.gridx =iPosXAccion++;
			
		this.jPanelAccionesProntoPago.add(this.jButtonEliminarProntoPago, this.gridBagConstraintsProntoPago);
		
			
		this.gridBagConstraintsProntoPago = new GridBagConstraints();
		this.gridBagConstraintsProntoPago.gridy = 0;		
		this.gridBagConstraintsProntoPago.gridx = iPosXAccion++;
		
		this.jPanelAccionesProntoPago.add(this.jButtonActualizarProntoPago, this.gridBagConstraintsProntoPago);


		this.gridBagConstraintsProntoPago = new GridBagConstraints();
		this.gridBagConstraintsProntoPago.gridy = 0;		
		this.gridBagConstraintsProntoPago.gridx = iPosXAccion++;
		
		this.jPanelAccionesProntoPago.add(this.jButtonGuardarCambiosProntoPago, this.gridBagConstraintsProntoPago);	
		
		this.gridBagConstraintsProntoPago = new GridBagConstraints();
		this.gridBagConstraintsProntoPago.gridy = 0;		
		this.gridBagConstraintsProntoPago.gridx =iPosXAccion++;
		
		this.jPanelAccionesProntoPago.add(this.jButtonCancelarProntoPago, this.gridBagConstraintsProntoPago);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProntoPago = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProntoPago);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.prontopagoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProntoPago = new GridBagConstraints();						
			this.gridBagConstraintsProntoPago.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProntoPago.gridx = 0;		
			//this.gridBagConstraintsProntoPago.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProntoPago.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProntoPago.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsProntoPago = new GridBagConstraints();
		this.gridBagConstraintsProntoPago.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProntoPago.gridx =0;
		this.gridBagConstraintsProntoPago.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProntoPago.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProntoPago, this.gridBagConstraintsProntoPago);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ProntoPagoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleProntoPago = new ProntoPagoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Pronto Pago DATOS");
			
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
			
	        //this.setTitle("[FOR] - Pronto Pago DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Pronto Pago Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ProntoPagoModel prontopagoModel=new ProntoPagoModel(this);
			
			//SI USARA CLASE INTERNA
			//ProntoPagoModel.ProntoPagoFocusTraversalPolicy prontopagoFocusTraversalPolicy = prontopagoModel.new ProntoPagoFocusTraversalPolicy(this);
			
			//prontopagoFocusTraversalPolicy.setprontopagoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(prontopagoModel);
			
			
			this.jContentPaneDetalleProntoPago = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleProntoPago = new GridBagLayout();	
			this.jContentPaneDetalleProntoPago.setLayout(gridaBagLayoutDetalleProntoPago);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProntoPago = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsProntoPago = new GridBagConstraints();
				this.gridBagConstraintsProntoPago.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsProntoPago.gridx = 0;
					
				
				this.jContentPaneDetalleProntoPago.add(jTtoolBarDetalleProntoPago, gridBagConstraintsProntoPago);								
				
}
			
			this.jScrollPanelDatosEdicionProntoPago=   new JScrollPane(jContentPaneDetalleProntoPago,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProntoPago.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProntoPago.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProntoPago.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralProntoPago=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProntoPago.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProntoPago.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProntoPago.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProntoPago = new GridBagConstraints();
			
			
	        this.gridBagConstraintsProntoPago.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsProntoPago.gridx = 0;
	        
			this.jContentPaneDetalleProntoPago.add(jPanelCamposProntoPago, gridBagConstraintsProntoPago);
			
			
			
			
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
						&& prontopagoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.prontopagoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsProntoPago= new GridBagConstraints();
						this.gridBagConstraintsProntoPago.gridy = iGridyRelaciones++;
						this.gridBagConstraintsProntoPago.gridx = 0;
						this.jContentPaneDetalleProntoPago.add(this.jTabbedPaneRelacionesProntoPago, this.gridBagConstraintsProntoPago);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesProntoPago.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosProntoPago.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsProntoPago = new GridBagConstraints();
					this.gridBagConstraintsProntoPago.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsProntoPago.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsProntoPago.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsProntoPago.gridx = 0;
					
				
					this.jContentPaneDetalleProntoPago.add(jPanelCamposOcultosProntoPago, gridBagConstraintsProntoPago);
				
					this.jPanelCamposOcultosProntoPago.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsProntoPago = new GridBagConstraints();
			this.gridBagConstraintsProntoPago.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsProntoPago.gridx = 0;
	        this.gridBagConstraintsProntoPago.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleProntoPago.add(this.jPanelAccionesFormularioProntoPago, this.gridBagConstraintsProntoPago);							
			
			
			
			this.gridBagConstraintsProntoPago = new GridBagConstraints();
	        this.gridBagConstraintsProntoPago.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsProntoPago.gridx = 0;
	        
			
			this.jContentPaneDetalleProntoPago.add(this.jPanelAccionesProntoPago, this.gridBagConstraintsProntoPago);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionProntoPago);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionProntoPago=   new JScrollPane(this.jPanelCamposProntoPago,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProntoPago.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProntoPago.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProntoPago.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsProntoPago = new GridBagConstraints();
			this.gridBagConstraintsProntoPago.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsProntoPago.gridx = 0;
			this.gridBagConstraintsProntoPago.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsProntoPago.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsProntoPago.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionProntoPago, this.gridBagConstraintsProntoPago);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsProntoPago = new GridBagConstraints();
			this.gridBagConstraintsProntoPago.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProntoPago.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioProntoPago, this.gridBagConstraintsProntoPago);			
			
			this.gridBagConstraintsProntoPago = new GridBagConstraints();
			this.gridBagConstraintsProntoPago.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProntoPago.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesProntoPago, this.gridBagConstraintsProntoPago);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsProntoPago = new GridBagConstraints();
		this.gridBagConstraintsProntoPago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProntoPago.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProntoPago, this.gridBagConstraintsProntoPago);
			
			
		this.gridBagConstraintsProntoPago = new GridBagConstraints();
		this.gridBagConstraintsProntoPago.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProntoPago.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProntoPago, this.gridBagConstraintsProntoPago);
		
			
		this.gridBagConstraintsProntoPago = new GridBagConstraints();
		this.gridBagConstraintsProntoPago.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProntoPago.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProntoPago, this.gridBagConstraintsProntoPago);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralProntoPago;//jContentPane;
		
		return jScrollPanelDatosEdicionProntoPago;
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
