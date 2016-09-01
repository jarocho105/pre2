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



import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;



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
import com.bydan.erp.contabilidad.util.NivelCuentaConstantesFunciones;

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
public class NivelCuentaDetalleFormJInternalFrame extends NivelCuentaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleNivelCuenta;
	
	protected JMenuBar jmenuBarDetalleNivelCuenta;
	
	protected JMenu jmenuDetalleNivelCuenta;
	protected JMenu jmenuDetalleArchivoNivelCuenta;
	protected JMenu jmenuDetalleAccionesNivelCuenta;
	protected JMenu jmenuDetalleDatosNivelCuenta;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleNivelCuenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutNivelCuenta;	
	protected GridBagConstraints gridBagConstraintsNivelCuenta;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected NivelCuentaBeanSwingJInternalFrameAdditional jInternalFrameDetalleNivelCuenta;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public NivelCuentaSessionBean nivelcuentaSessionBean;
	
	

	public CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame=null;
	public CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteCuentaContable=false;
	public CuentaContableSessionBean cuentacontableSessionBean;
	
		
	
	public NivelCuentaLogic nivelcuentaLogic;
	
	public JScrollPane jScrollPanelDatosNivelCuenta;
	public JScrollPane jScrollPanelDatosEdicionNivelCuenta;
	public JScrollPane jScrollPanelDatosGeneralNivelCuenta;
	
	protected JPanel jPanelCamposNivelCuenta;    
	protected JPanel jPanelCamposOcultosNivelCuenta;    	
	protected JPanel jPanelAccionesNivelCuenta;
	protected JPanel jPanelAccionesFormularioNivelCuenta;
    
	
	
	protected Integer iXPanelCamposNivelCuenta=0;
	protected Integer iYPanelCamposNivelCuenta=0;
	
	protected Integer iXPanelCamposOcultosNivelCuenta=0;
	protected Integer iYPanelCamposOcultosNivelCuenta=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoNivelCuenta;
	public JButton jButtonModificarNivelCuenta;
	public JButton jButtonActualizarNivelCuenta;
    public JButton jButtonEliminarNivelCuenta;
	public JButton jButtonCancelarNivelCuenta;
    public JButton jButtonGuardarCambiosNivelCuenta;
	public JButton jButtonGuardarCambiosTablaNivelCuenta;
	protected JButton jButtonCerrarNivelCuenta;
	
	
	protected JButton jButtonProcesarInformacionNivelCuenta;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoNivelCuenta;
	protected JCheckBox jCheckBoxPostAccionSinCerrarNivelCuenta;
	protected JCheckBox jCheckBoxPostAccionSinMensajeNivelCuenta;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarNivelCuenta;
	protected JButton jButtonModificarToolBarNivelCuenta;
	protected JButton jButtonActualizarToolBarNivelCuenta;
    protected JButton jButtonEliminarToolBarNivelCuenta;
	protected JButton jButtonCancelarToolBarNivelCuenta;
    protected JButton jButtonGuardarCambiosToolBarNivelCuenta;
	protected JButton jButtonGuardarCambiosTablaToolBarNivelCuenta;
	protected JButton jButtonMostrarOcultarTablaToolBarNivelCuenta;
	protected JButton jButtonCerrarToolBarNivelCuenta;
	
	protected JButton jButtonProcesarInformacionToolBarNivelCuenta;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoNivelCuenta;
	protected JMenuItem jMenuItemModificarNivelCuenta;
	protected JMenuItem jMenuItemActualizarNivelCuenta;
    protected JMenuItem jMenuItemEliminarNivelCuenta;
	protected JMenuItem jMenuItemCancelarNivelCuenta;
    protected JMenuItem jMenuItemGuardarCambiosNivelCuenta;
	protected JMenuItem jMenuItemGuardarCambiosTablaNivelCuenta;
	protected JMenuItem jMenuItemCerrarNivelCuenta;
	protected JMenuItem jMenuItemDetalleCerrarNivelCuenta;
	protected JMenuItem jMenuItemDetalleMostarOcultarNivelCuenta;
	
	protected JMenuItem jMenuItemProcesarInformacionNivelCuenta;
	protected JMenuItem jMenuItemNuevoGuardarCambiosNivelCuenta;
	protected JMenuItem jMenuItemMostrarOcultarNivelCuenta;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesNivelCuenta;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesNivelCuenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesNivelCuenta;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioNivelCuenta;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidNivelCuenta;
	public JLabel jLabelIdNivelCuenta;
	public JTextFieldMe jTextFieldidNivelCuenta;
	public JButton jButtonidNivelCuentaBusqueda= new JButtonMe();

	public JPanel jPanelnombreNivelCuenta;
	public JLabel jLabelnombreNivelCuenta;
	public JTextArea jTextAreanombreNivelCuenta;
	public JScrollPane jscrollPanenombreNivelCuenta;
	public JButton jButtonnombreNivelCuentaBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesNivelCuenta;
	
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
	
	public NivelCuentaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposNivelCuenta=new JPanel();
				this.jPanelAccionesFormularioNivelCuenta=new JPanel();
				this.jmenuBarDetalleNivelCuenta=new JMenuBar();
				this.jTtoolBarDetalleNivelCuenta=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NivelCuentaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("NivelCuenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public NivelCuentaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("NivelCuenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NivelCuentaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("NivelCuenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NivelCuentaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("NivelCuenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NivelCuentaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("NivelCuenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarNivelCuenta() {
		return this.jButtonActualizarToolBarNivelCuenta;
	}
	
	public JButton getjButtonEliminarToolBarNivelCuenta() {
		return this.jButtonEliminarToolBarNivelCuenta;
	}
	
	public JButton getjButtonCancelarToolBarNivelCuenta() {
		return this.jButtonCancelarToolBarNivelCuenta;
	}		
	
	public JButton getjButtonProcesarInformacionNivelCuenta() {
		return this.jButtonProcesarInformacionNivelCuenta;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionNivelCuenta)	{
		this.jButtonProcesarInformacionNivelCuenta = jButtonProcesarInformacionNivelCuenta;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesNivelCuenta() {
		return this.jComboBoxTiposAccionesNivelCuenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesNivelCuenta(
			JComboBox jComboBoxTiposRelacionesNivelCuenta) {
		this.jComboBoxTiposRelacionesNivelCuenta = jComboBoxTiposRelacionesNivelCuenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesNivelCuenta(
			JComboBox jComboBoxTiposAccionesNivelCuenta) {
		this.jComboBoxTiposAccionesNivelCuenta = jComboBoxTiposAccionesNivelCuenta;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioNivelCuenta() {
		return this.jComboBoxTiposAccionesFormularioNivelCuenta;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioNivelCuenta(
			JComboBox jComboBoxTiposAccionesFormularioNivelCuenta) {
		this.jComboBoxTiposAccionesFormularioNivelCuenta = jComboBoxTiposAccionesFormularioNivelCuenta;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.nivelcuentaSessionBean=new NivelCuentaSessionBean();
		
		this.nivelcuentaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.nivelcuentaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.nivelcuentaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.cuentacontableSessionBean=new CuentaContableSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		NivelCuentaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		NivelCuentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		NivelCuentaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Nivel Cuenta MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.nivelcuentaSessionBean.getEsGuardarRelacionado()) {
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
	
		NivelCuentaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleNivelCuenta= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarNivelCuenta=new JButtonMe();
				this.jButtonModificarToolBarNivelCuenta=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarNivelCuenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarNivelCuenta,this.jTtoolBarDetalleNivelCuenta,
							"actualizar","actualizar","Actualizar"+" "+NivelCuentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarNivelCuenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarNivelCuenta,this.jTtoolBarDetalleNivelCuenta,
							"eliminar","eliminar","Eliminar"+" "+NivelCuentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarNivelCuenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarNivelCuenta,this.jTtoolBarDetalleNivelCuenta,
							"cancelar","cancelar","Cancelar"+" "+NivelCuentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarNivelCuenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarNivelCuenta,this.jTtoolBarDetalleNivelCuenta,
							"guardarcambios","guardarcambios","Guardar"+" "+NivelCuentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarNivelCuenta,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarNivelCuenta,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarNivelCuenta,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleNivelCuenta=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleNivelCuenta=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoNivelCuenta=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesNivelCuenta=new JMenuMe("Acciones");
		this.jmenuDetalleDatosNivelCuenta=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoNivelCuenta= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoNivelCuenta.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoNivelCuenta,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoNivelCuenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarNivelCuenta= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarNivelCuenta.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarNivelCuenta,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarNivelCuenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarNivelCuenta= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarNivelCuenta.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarNivelCuenta,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarNivelCuenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarNivelCuenta= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarNivelCuenta.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarNivelCuenta,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarNivelCuenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarNivelCuenta= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarNivelCuenta.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarNivelCuenta,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarNivelCuenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosNivelCuenta= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosNivelCuenta.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosNivelCuenta,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosNivelCuenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarNivelCuenta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarNivelCuenta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarNivelCuenta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarNivelCuenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarNivelCuenta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarNivelCuenta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarNivelCuenta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarNivelCuenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarNivelCuenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarNivelCuenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarNivelCuenta,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarNivelCuenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarNivelCuenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarNivelCuenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarNivelCuenta,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarNivelCuenta, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoNivelCuenta.add(this.jMenuItemDetalleCerrarNivelCuenta);
		
		this.jmenuDetalleAccionesNivelCuenta.add(this.jMenuItemActualizarNivelCuenta);
		this.jmenuDetalleAccionesNivelCuenta.add(this.jMenuItemEliminarNivelCuenta);
		this.jmenuDetalleAccionesNivelCuenta.add(this.jMenuItemCancelarNivelCuenta);		
		
		//this.jmenuDetalleDatosNivelCuenta.add(this.jMenuItemDetalleAbrirOrderByNivelCuenta);				
		this.jmenuDetalleDatosNivelCuenta.add(this.jMenuItemDetalleMostarOcultarNivelCuenta);				
				
		//this.jmenuDetalleAccionesNivelCuenta.add(this.jMenuItemGuardarCambiosNivelCuenta);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoNivelCuenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesNivelCuenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosNivelCuenta, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleNivelCuenta.add(this.jmenuDetalleArchivoNivelCuenta);		
		this.jmenuBarDetalleNivelCuenta.add(this.jmenuDetalleAccionesNivelCuenta);		
		this.jmenuBarDetalleNivelCuenta.add(this.jmenuDetalleDatosNivelCuenta);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleNivelCuenta, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleNivelCuenta.add(this.jmenuDetalleNivelCuenta);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleNivelCuenta);				
	}
	
	
	public void inicializarElementosCamposNivelCuenta() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdNivelCuenta = new JLabelMe();
		jLabelIdNivelCuenta.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdNivelCuenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdNivelCuenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdNivelCuenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdNivelCuenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidNivelCuenta = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidNivelCuenta.setToolTipText(NivelCuentaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutNivelCuenta= new GridBagLayout();

		this.jPanelidNivelCuenta.setLayout(this.gridaBagLayoutNivelCuenta);

		jTextFieldidNivelCuenta = new JTextFieldMe();
		jTextFieldidNivelCuenta.setText("Id");

		jTextFieldidNivelCuenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidNivelCuenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidNivelCuenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreNivelCuenta = new JLabelMe();
		this.jLabelnombreNivelCuenta.setText(""+NivelCuentaConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreNivelCuenta.setToolTipText("Nombre");
		this.jLabelnombreNivelCuenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreNivelCuenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreNivelCuenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreNivelCuenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreNivelCuenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreNivelCuenta.setToolTipText(NivelCuentaConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutNivelCuenta = new GridBagLayout();
		this.jPanelnombreNivelCuenta.setLayout(this.gridaBagLayoutNivelCuenta);


		jTextAreanombreNivelCuenta= new JTextAreaMe();
		jTextAreanombreNivelCuenta.setEnabled(false);
		jTextAreanombreNivelCuenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreNivelCuenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreNivelCuenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreNivelCuenta.setLineWrap(true);
		jTextAreanombreNivelCuenta.setWrapStyleWord(true);
		jTextAreanombreNivelCuenta.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreNivelCuenta.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreNivelCuenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreNivelCuenta = new JScrollPane(jTextAreanombreNivelCuenta);
		jscrollPanenombreNivelCuenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreNivelCuenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreNivelCuenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreNivelCuentaBusqueda= new JButtonMe();
		this.jButtonnombreNivelCuentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreNivelCuentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreNivelCuentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreNivelCuentaBusqueda.setText("U");
		this.jButtonnombreNivelCuentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreNivelCuentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreNivelCuentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreNivelCuenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreNivelCuenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreNivelCuentaBusqueda"));

		if(this.nivelcuentaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreNivelCuentaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysNivelCuenta() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
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
		//this.jInternalFrameDetalleNivelCuenta = new NivelCuentaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Nivel Cuenta DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutNivelCuenta= new GridBagLayout();
		

		
		String sToolTipNivelCuenta="";
		sToolTipNivelCuenta=NivelCuentaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipNivelCuenta+="(Contabilidad.NivelCuenta)";
		}
		
		if(!this.nivelcuentaSessionBean.getEsGuardarRelacionado()) {
			sToolTipNivelCuenta+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoNivelCuenta = new JButtonMe();
		this.jButtonModificarNivelCuenta = new JButtonMe();
        this.jButtonActualizarNivelCuenta = new JButtonMe();
        this.jButtonEliminarNivelCuenta = new JButtonMe();
        this.jButtonCancelarNivelCuenta = new JButtonMe();
        this.jButtonGuardarCambiosNivelCuenta = new JButtonMe();
		this.jButtonGuardarCambiosTablaNivelCuenta = new JButtonMe();
		this.jButtonCerrarNivelCuenta = new JButtonMe();
		
		this.jScrollPanelDatosNivelCuenta = new JScrollPane();   
        this.jScrollPanelDatosEdicionNivelCuenta = new JScrollPane();
		this.jScrollPanelDatosGeneralNivelCuenta = new JScrollPane();
				
		
		
		this.jPanelCamposNivelCuenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosNivelCuenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesNivelCuenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioNivelCuenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Nivel Cuenta";
		
		if(!this.nivelcuentaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosNivelCuenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Nivel Cuentas" + this.sPath));
		} else {
			this.jScrollPanelDatosNivelCuenta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionNivelCuenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralNivelCuenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposNivelCuenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposNivelCuenta.setName("jPanelCamposNivelCuenta"); 

		this.jPanelCamposOcultosNivelCuenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosNivelCuenta.setName("jPanelCamposOcultosNivelCuenta"); 

        this.jPanelAccionesNivelCuenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesNivelCuenta.setToolTipText("Acciones");
        this.jPanelAccionesNivelCuenta.setName("Acciones"); 

		this.jPanelAccionesFormularioNivelCuenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioNivelCuenta.setToolTipText("Acciones");
        this.jPanelAccionesFormularioNivelCuenta.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionNivelCuenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralNivelCuenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosNivelCuenta, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposNivelCuenta, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosNivelCuenta, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioNivelCuenta, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoNivelCuenta.setText("Nuevo");
		this.jButtonModificarNivelCuenta.setText("Editar");
        this.jButtonActualizarNivelCuenta.setText("Actualizar");
        this.jButtonEliminarNivelCuenta.setText("Eliminar");
        this.jButtonCancelarNivelCuenta.setText("Cancelar");
        this.jButtonGuardarCambiosNivelCuenta.setText("Guardar");
		this.jButtonGuardarCambiosTablaNivelCuenta.setText("Guardar");
		this.jButtonCerrarNivelCuenta.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoNivelCuenta,"nuevo_button","Nuevo",this.nivelcuentaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarNivelCuenta,"modificar_button","Editar",this.nivelcuentaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarNivelCuenta,"actualizar_button","Actualizar",this.nivelcuentaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarNivelCuenta,"eliminar_button","Eliminar",this.nivelcuentaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarNivelCuenta,"cancelar_button","Cancelar",this.nivelcuentaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosNivelCuenta,"guardarcambios_button","Guardar",this.nivelcuentaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaNivelCuenta,"guardarcambiostabla_button","Guardar",this.nivelcuentaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarNivelCuenta,"cerrar_button","Salir",this.nivelcuentaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoNivelCuenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarNivelCuenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosNivelCuenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaNivelCuenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarNivelCuenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarNivelCuenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarNivelCuenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarNivelCuenta, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoNivelCuenta.setToolTipText("Nuevo"+" "+NivelCuentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarNivelCuenta.setToolTipText("Editar"+" "+NivelCuentaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarNivelCuenta.setToolTipText("Actualizar"+" "+NivelCuentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarNivelCuenta.setToolTipText("Eliminar)"+" "+NivelCuentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarNivelCuenta.setToolTipText("Cancelar"+" "+NivelCuentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosNivelCuenta.setToolTipText("Guardar"+" "+NivelCuentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaNivelCuenta.setToolTipText("Guardar"+" "+NivelCuentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarNivelCuenta.setToolTipText("Salir"+" "+NivelCuentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoNivelCuenta";
		inputMap = this.jButtonNuevoNivelCuenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoNivelCuenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoNivelCuenta"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarNivelCuenta";
		inputMap = this.jButtonActualizarNivelCuenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarNivelCuenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarNivelCuenta"));
		
		//ELIMINAR
		sMapKey = "EliminarNivelCuenta";
		inputMap = this.jButtonEliminarNivelCuenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarNivelCuenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarNivelCuenta"));
		
		//CANCELAR	
		sMapKey = "CancelarNivelCuenta";
		inputMap = this.jButtonCancelarNivelCuenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarNivelCuenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarNivelCuenta"));
		
		//CERRAR		
		sMapKey = "CerrarNivelCuenta";
		inputMap = this.jButtonCerrarNivelCuenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarNivelCuenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarNivelCuenta"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaNivelCuenta";
		inputMap = this.jButtonGuardarCambiosTablaNivelCuenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaNivelCuenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaNivelCuenta"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoNivelCuenta = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoNivelCuenta.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoNivelCuenta.setToolTipText("Nuevo NivelCuenta");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoNivelCuenta, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarNivelCuenta = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarNivelCuenta.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarNivelCuenta.setToolTipText("Sin Cerrar Ventana NivelCuenta");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarNivelCuenta, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeNivelCuenta = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeNivelCuenta.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeNivelCuenta.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeNivelCuenta, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesNivelCuenta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesNivelCuenta.setText("Accion");
		this.jComboBoxTiposAccionesNivelCuenta.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioNivelCuenta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioNivelCuenta.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioNivelCuenta.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesNivelCuenta = new JLabelMe();
		
		this.jLabelAccionesNivelCuenta.setText("Acciones");		
		this.jLabelAccionesNivelCuenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesNivelCuenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesNivelCuenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposNivelCuenta();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysNivelCuenta();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesNivelCuenta=new JTabbedPane();
		this.jTabbedPaneRelacionesNivelCuenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesNivelCuenta,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesNivelCuenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesNivelCuenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesNivelCuenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesNivelCuenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioNivelCuenta.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioNivelCuenta.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioNivelCuenta.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioNivelCuenta, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposNivelCuenta = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosNivelCuenta = new GridBagLayout();
		
		this.jPanelCamposNivelCuenta.setLayout(gridaBagLayoutCamposNivelCuenta);
		this.jPanelCamposOcultosNivelCuenta.setLayout(gridaBagLayoutCamposOcultosNivelCuenta);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsNivelCuenta = new GridBagConstraints();
	this.gridBagConstraintsNivelCuenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNivelCuenta.gridy = 0;
	this.gridBagConstraintsNivelCuenta.gridx = 0;
	this.gridBagConstraintsNivelCuenta.ipadx = 0;
	this.gridBagConstraintsNivelCuenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidNivelCuenta.add(jLabelIdNivelCuenta, this.gridBagConstraintsNivelCuenta);



	this.gridBagConstraintsNivelCuenta = new GridBagConstraints();
	this.gridBagConstraintsNivelCuenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNivelCuenta.gridy = 0;
	this.gridBagConstraintsNivelCuenta.gridx = 1;
	this.gridBagConstraintsNivelCuenta.ipadx = 0;
	this.gridBagConstraintsNivelCuenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidNivelCuenta.add(jTextFieldidNivelCuenta, this.gridBagConstraintsNivelCuenta);


	this.gridBagConstraintsNivelCuenta = new GridBagConstraints();
	this.gridBagConstraintsNivelCuenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNivelCuenta.gridy = 0;
	this.gridBagConstraintsNivelCuenta.gridx = 0;
	this.gridBagConstraintsNivelCuenta.ipadx = 0;
	this.gridBagConstraintsNivelCuenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreNivelCuenta.add(jLabelnombreNivelCuenta, this.gridBagConstraintsNivelCuenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNivelCuenta = new GridBagConstraints();
		//this.gridBagConstraintsNivelCuenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNivelCuenta.gridy = 0;
		this.gridBagConstraintsNivelCuenta.gridx = 2;
		this.gridBagConstraintsNivelCuenta.ipadx = 0;
		this.gridBagConstraintsNivelCuenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreNivelCuenta.add(jButtonnombreNivelCuentaBusqueda, this.gridBagConstraintsNivelCuenta);
	}

	this.gridBagConstraintsNivelCuenta = new GridBagConstraints();
	this.gridBagConstraintsNivelCuenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNivelCuenta.gridy = 0;
	this.gridBagConstraintsNivelCuenta.gridx = 1;
	this.gridBagConstraintsNivelCuenta.ipadx = 0;
	this.gridBagConstraintsNivelCuenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreNivelCuenta.add(jscrollPanenombreNivelCuenta, this.gridBagConstraintsNivelCuenta);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsNivelCuenta = new GridBagConstraints();
	this.gridBagConstraintsNivelCuenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNivelCuenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNivelCuenta.gridy = iYPanelCamposNivelCuenta;
	this.gridBagConstraintsNivelCuenta.gridx = iXPanelCamposNivelCuenta++;
	this.gridBagConstraintsNivelCuenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNivelCuenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNivelCuenta.add(this.jPanelidNivelCuenta, this.gridBagConstraintsNivelCuenta);



	if(iXPanelCamposNivelCuenta % 1==0) {
		iXPanelCamposNivelCuenta=0;
		iYPanelCamposNivelCuenta++;
	}
	this.gridBagConstraintsNivelCuenta = new GridBagConstraints();
	this.gridBagConstraintsNivelCuenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNivelCuenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNivelCuenta.gridy = iYPanelCamposNivelCuenta;
	this.gridBagConstraintsNivelCuenta.gridx = iXPanelCamposNivelCuenta++;
	this.gridBagConstraintsNivelCuenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNivelCuenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNivelCuenta.add(this.jPanelnombreNivelCuenta, this.gridBagConstraintsNivelCuenta);



	if(iXPanelCamposNivelCuenta % 1==0) {
		iXPanelCamposNivelCuenta=0;
		iYPanelCamposNivelCuenta++;
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
			
		GridBagLayout gridaBagLayoutAccionesNivelCuenta= new GridBagLayout();
		this.jPanelAccionesNivelCuenta.setLayout(gridaBagLayoutAccionesNivelCuenta);
		
		GridBagLayout gridaBagLayoutAccionesFormularioNivelCuenta= new GridBagLayout();
		this.jPanelAccionesFormularioNivelCuenta.setLayout(gridaBagLayoutAccionesFormularioNivelCuenta);
		
		this.gridBagConstraintsNivelCuenta = new GridBagConstraints();
		this.gridBagConstraintsNivelCuenta.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsNivelCuenta.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioNivelCuenta.add(this.jComboBoxTiposAccionesFormularioNivelCuenta, this.gridBagConstraintsNivelCuenta);

		this.gridBagConstraintsNivelCuenta = new GridBagConstraints();
		this.gridBagConstraintsNivelCuenta.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsNivelCuenta.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioNivelCuenta.add(this.jCheckBoxPostAccionNuevoNivelCuenta, this.gridBagConstraintsNivelCuenta);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.nivelcuentaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsNivelCuenta = new GridBagConstraints();
			this.gridBagConstraintsNivelCuenta.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsNivelCuenta.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioNivelCuenta.add(this.jCheckBoxPostAccionSinCerrarNivelCuenta, this.gridBagConstraintsNivelCuenta);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.nivelcuentaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.nivelcuentaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsNivelCuenta = new GridBagConstraints();
			this.gridBagConstraintsNivelCuenta.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsNivelCuenta.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioNivelCuenta.add(this.jCheckBoxPostAccionSinMensajeNivelCuenta, this.gridBagConstraintsNivelCuenta);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsNivelCuenta = new GridBagConstraints();
		this.gridBagConstraintsNivelCuenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNivelCuenta.gridy = 0;
		this.gridBagConstraintsNivelCuenta.gridx = iPosXAccion++;
			
		this.jPanelAccionesNivelCuenta.add(this.jButtonModificarNivelCuenta, this.gridBagConstraintsNivelCuenta);							

		this.gridBagConstraintsNivelCuenta = new GridBagConstraints();
		this.gridBagConstraintsNivelCuenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNivelCuenta.gridy = 0;
		this.gridBagConstraintsNivelCuenta.gridx =iPosXAccion++;
			
		this.jPanelAccionesNivelCuenta.add(this.jButtonEliminarNivelCuenta, this.gridBagConstraintsNivelCuenta);
		
			
		this.gridBagConstraintsNivelCuenta = new GridBagConstraints();
		this.gridBagConstraintsNivelCuenta.gridy = 0;		
		this.gridBagConstraintsNivelCuenta.gridx = iPosXAccion++;
		
		this.jPanelAccionesNivelCuenta.add(this.jButtonActualizarNivelCuenta, this.gridBagConstraintsNivelCuenta);


		this.gridBagConstraintsNivelCuenta = new GridBagConstraints();
		this.gridBagConstraintsNivelCuenta.gridy = 0;		
		this.gridBagConstraintsNivelCuenta.gridx = iPosXAccion++;
		
		this.jPanelAccionesNivelCuenta.add(this.jButtonGuardarCambiosNivelCuenta, this.gridBagConstraintsNivelCuenta);	
		
		this.gridBagConstraintsNivelCuenta = new GridBagConstraints();
		this.gridBagConstraintsNivelCuenta.gridy = 0;		
		this.gridBagConstraintsNivelCuenta.gridx =iPosXAccion++;
		
		this.jPanelAccionesNivelCuenta.add(this.jButtonCancelarNivelCuenta, this.gridBagConstraintsNivelCuenta);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutNivelCuenta = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutNivelCuenta);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.nivelcuentaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsNivelCuenta = new GridBagConstraints();						
			this.gridBagConstraintsNivelCuenta.gridy = iGridyPrincipal++;
			this.gridBagConstraintsNivelCuenta.gridx = 0;		
			//this.gridBagConstraintsNivelCuenta.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNivelCuenta.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsNivelCuenta.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsNivelCuenta = new GridBagConstraints();
		this.gridBagConstraintsNivelCuenta.gridy =iGridyPrincipal++;
		this.gridBagConstraintsNivelCuenta.gridx =0;
		this.gridBagConstraintsNivelCuenta.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsNivelCuenta.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosNivelCuenta, this.gridBagConstraintsNivelCuenta);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(NivelCuentaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleNivelCuenta = new NivelCuentaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Nivel Cuenta DATOS");
			
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
			
	        //this.setTitle("[FOR] - Nivel Cuenta DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Nivel Cuenta Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			NivelCuentaModel nivelcuentaModel=new NivelCuentaModel(this);
			
			//SI USARA CLASE INTERNA
			//NivelCuentaModel.NivelCuentaFocusTraversalPolicy nivelcuentaFocusTraversalPolicy = nivelcuentaModel.new NivelCuentaFocusTraversalPolicy(this);
			
			//nivelcuentaFocusTraversalPolicy.setnivelcuentaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(nivelcuentaModel);
			
			
			this.jContentPaneDetalleNivelCuenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleNivelCuenta = new GridBagLayout();	
			this.jContentPaneDetalleNivelCuenta.setLayout(gridaBagLayoutDetalleNivelCuenta);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosNivelCuenta = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsNivelCuenta = new GridBagConstraints();
				this.gridBagConstraintsNivelCuenta.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsNivelCuenta.gridx = 0;
					
				
				this.jContentPaneDetalleNivelCuenta.add(jTtoolBarDetalleNivelCuenta, gridBagConstraintsNivelCuenta);								
				
}
			
			this.jScrollPanelDatosEdicionNivelCuenta=   new JScrollPane(jContentPaneDetalleNivelCuenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionNivelCuenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionNivelCuenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionNivelCuenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralNivelCuenta=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralNivelCuenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralNivelCuenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralNivelCuenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsNivelCuenta = new GridBagConstraints();
			
			
	        this.gridBagConstraintsNivelCuenta.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsNivelCuenta.gridx = 0;
	        
			this.jContentPaneDetalleNivelCuenta.add(jPanelCamposNivelCuenta, gridBagConstraintsNivelCuenta);
			
			
			
			
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
						&& nivelcuentaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameCuentaContable(this.puedeCargarPorParteCuentaContable,false,-1);
					
					if(this.nivelcuentaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsNivelCuenta= new GridBagConstraints();
						this.gridBagConstraintsNivelCuenta.gridy = iGridyRelaciones++;
						this.gridBagConstraintsNivelCuenta.gridx = 0;
						this.jContentPaneDetalleNivelCuenta.add(this.jTabbedPaneRelacionesNivelCuenta, this.gridBagConstraintsNivelCuenta);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesNivelCuenta.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameCuentaContable(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosNivelCuenta.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsNivelCuenta = new GridBagConstraints();
					this.gridBagConstraintsNivelCuenta.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsNivelCuenta.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsNivelCuenta.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsNivelCuenta.gridx = 0;
					
				
					this.jContentPaneDetalleNivelCuenta.add(jPanelCamposOcultosNivelCuenta, gridBagConstraintsNivelCuenta);
				
					this.jPanelCamposOcultosNivelCuenta.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsNivelCuenta = new GridBagConstraints();
			this.gridBagConstraintsNivelCuenta.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsNivelCuenta.gridx = 0;
	        this.gridBagConstraintsNivelCuenta.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleNivelCuenta.add(this.jPanelAccionesFormularioNivelCuenta, this.gridBagConstraintsNivelCuenta);							
			
			
			
			this.gridBagConstraintsNivelCuenta = new GridBagConstraints();
	        this.gridBagConstraintsNivelCuenta.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsNivelCuenta.gridx = 0;
	        
			
			this.jContentPaneDetalleNivelCuenta.add(this.jPanelAccionesNivelCuenta, this.gridBagConstraintsNivelCuenta);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionNivelCuenta);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionNivelCuenta=   new JScrollPane(this.jPanelCamposNivelCuenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionNivelCuenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionNivelCuenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionNivelCuenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsNivelCuenta = new GridBagConstraints();
			this.gridBagConstraintsNivelCuenta.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsNivelCuenta.gridx = 0;
			this.gridBagConstraintsNivelCuenta.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsNivelCuenta.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsNivelCuenta.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionNivelCuenta, this.gridBagConstraintsNivelCuenta);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsNivelCuenta = new GridBagConstraints();
			this.gridBagConstraintsNivelCuenta.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsNivelCuenta.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioNivelCuenta, this.gridBagConstraintsNivelCuenta);			
			
			this.gridBagConstraintsNivelCuenta = new GridBagConstraints();
			this.gridBagConstraintsNivelCuenta.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsNivelCuenta.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesNivelCuenta, this.gridBagConstraintsNivelCuenta);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsNivelCuenta = new GridBagConstraints();
		this.gridBagConstraintsNivelCuenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNivelCuenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposNivelCuenta, this.gridBagConstraintsNivelCuenta);
			
			
		this.gridBagConstraintsNivelCuenta = new GridBagConstraints();
		this.gridBagConstraintsNivelCuenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNivelCuenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosNivelCuenta, this.gridBagConstraintsNivelCuenta);
		
			
		this.gridBagConstraintsNivelCuenta = new GridBagConstraints();
		this.gridBagConstraintsNivelCuenta.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsNivelCuenta.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesNivelCuenta, this.gridBagConstraintsNivelCuenta);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralNivelCuenta;//jContentPane;
		
		return jScrollPanelDatosEdicionNivelCuenta;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameCuentaContable(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.cuentacontableSessionBean=new CuentaContableSessionBean();
		this.cuentacontableSessionBean.setConGuardarRelaciones(false);
		this.cuentacontableSessionBean.setEsGuardarRelacionado(true);

		this.cuentacontableBeanSwingJInternalFrame=null;//new CuentaContableBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.cuentacontableBeanSwingJInternalFramePopup=new CuentaContableBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.cuentacontableBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.cuentacontableSessionBean.getEsGuardarRelacionado()) {

				CuentaContableJInternalFrame.STIPO_TAMANIO_GENERAL=NivelCuentaJInternalFrame.STIPO_TAMANIO_GENERAL;
				CuentaContableJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=NivelCuentaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.cuentacontableSessionBean.setEsGuardarRelacionado(true);

				this.cuentacontableBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.cuentacontableBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.cuentacontableBeanSwingJInternalFrame.setcuentacontableSessionBean(this.cuentacontableSessionBean);

				//this.gridBagConstraintsNivelCuenta = new GridBagConstraints();
				//this.gridBagConstraintsNivelCuenta.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsNivelCuenta.gridx = 0;
				//this.jContentPaneDetalleNivelCuenta.add(this.cuentacontableBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsNivelCuenta);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesNivelCuenta.add("Cuenta Contables",this.cuentacontableBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesNivelCuenta.setComponentAt(iIndexTab,this.cuentacontableBeanSwingJInternalFrame.getContentPane());
				}

				//CuentaContableJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.cuentacontableSessionBean.setEsGuardarRelacionado(false);
				this.cuentacontableBeanSwingJInternalFrame=null;//new CuentaContableBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.cuentacontableSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteCuentaContable) {
					this.jTabbedPaneRelacionesNivelCuenta.add("Cuenta Contables",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarCuentaContableBeanSwingJInternalFrame(List<NivelCuenta> nivelcuentas,NivelCuenta nivelcuenta,CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//cuentacontableBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					cuentacontableBeanSwingJInternalFrame.getCuentaContableLogic().setConnexion(this.nivelcuentaLogic.getConnexion());

					cuentacontableBeanSwingJInternalFrame.setnivelcuentasForeignKey(nivelcuentas);
					cuentacontableBeanSwingJInternalFrame.setnivelcuentaForeignKey(nivelcuenta);
					cuentacontableBeanSwingJInternalFrame.cuentacontableSessionBean.setisBusquedaDesdeForeignKeySesionNivelCuenta(true);
					cuentacontableBeanSwingJInternalFrame.cuentacontableSessionBean.setlidNivelCuentaActual(nivelcuenta.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					cuentacontableBeanSwingJInternalFrame.cargarCombosForeignKeyCuentaContable(cuentacontableBeanSwingJInternalFrame.isCargarCombosDependencia);
					cuentacontableBeanSwingJInternalFrame.setVisibilidadBusquedasParaNivelCuenta(true);
					cuentacontableBeanSwingJInternalFrame.setid_nivel_cuentaFK_IdNivelCuenta(nivelcuenta.getId());

					if(!this.conCargarFormDetalle) {
						cuentacontableBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					cuentacontableBeanSwingJInternalFrame.setSelectedItemCombosFrameNivelCuentaForeignKey(nivelcuenta,1,false,true,true);
					cuentacontableBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					cuentacontableBeanSwingJInternalFrame.procesarBusqueda("FK_IdNivelCuenta");
					cuentacontableBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdNivelCuenta");
					cuentacontableBeanSwingJInternalFrame.inicializarActualizarBindingTablaCuentaContable(true);
					cuentacontableBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesCuentaContable("n",cuentacontableBeanSwingJInternalFrame.isGuardarCambiosEnLote, cuentacontableBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					cuentacontableBeanSwingJInternalFrame.setAutoscrolls(true);
					cuentacontableBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						cuentacontableBeanSwingJInternalFrame.actualizarEstadoPanelsCuentaContable("relacionado");
					} else {
						cuentacontableBeanSwingJInternalFrame.actualizarEstadoPanelsCuentaContable("no_relacionado");
					}

					cuentacontableBeanSwingJInternalFrame.getjButtonRecargarInformacionCuentaContable().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
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
