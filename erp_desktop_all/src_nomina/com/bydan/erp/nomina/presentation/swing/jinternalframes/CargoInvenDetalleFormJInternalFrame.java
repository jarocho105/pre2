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
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.nomina.util.CargoInvenConstantesFunciones;

import com.bydan.erp.nomina.business.logic.*;
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
public class CargoInvenDetalleFormJInternalFrame extends CargoInvenBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleCargoInven;
	
	protected JMenuBar jmenuBarDetalleCargoInven;
	
	protected JMenu jmenuDetalleCargoInven;
	protected JMenu jmenuDetalleArchivoCargoInven;
	protected JMenu jmenuDetalleAccionesCargoInven;
	protected JMenu jmenuDetalleDatosCargoInven;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleCargoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCargoInven;	
	protected GridBagConstraints gridBagConstraintsCargoInven;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected CargoInvenBeanSwingJInternalFrameAdditional jInternalFrameDetalleCargoInven;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontable="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablecreditoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablecredito="";
	
	public CargoInvenSessionBean cargoinvenSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public CuentaContableSessionBean cuentacontableSessionBean;
	public CuentaContableSessionBean cuentacontablecreditoSessionBean;	
	
	public CargoInvenLogic cargoinvenLogic;
	
	public JScrollPane jScrollPanelDatosCargoInven;
	public JScrollPane jScrollPanelDatosEdicionCargoInven;
	public JScrollPane jScrollPanelDatosGeneralCargoInven;
	
	protected JPanel jPanelCamposCargoInven;    
	protected JPanel jPanelCamposOcultosCargoInven;    	
	protected JPanel jPanelAccionesCargoInven;
	protected JPanel jPanelAccionesFormularioCargoInven;
    
	
	
	protected Integer iXPanelCamposCargoInven=0;
	protected Integer iYPanelCamposCargoInven=0;
	
	protected Integer iXPanelCamposOcultosCargoInven=0;
	protected Integer iYPanelCamposOcultosCargoInven=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoCargoInven;
	public JButton jButtonModificarCargoInven;
	public JButton jButtonActualizarCargoInven;
    public JButton jButtonEliminarCargoInven;
	public JButton jButtonCancelarCargoInven;
    public JButton jButtonGuardarCambiosCargoInven;
	public JButton jButtonGuardarCambiosTablaCargoInven;
	protected JButton jButtonCerrarCargoInven;
	
	
	protected JButton jButtonProcesarInformacionCargoInven;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoCargoInven;
	protected JCheckBox jCheckBoxPostAccionSinCerrarCargoInven;
	protected JCheckBox jCheckBoxPostAccionSinMensajeCargoInven;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCargoInven;
	protected JButton jButtonModificarToolBarCargoInven;
	protected JButton jButtonActualizarToolBarCargoInven;
    protected JButton jButtonEliminarToolBarCargoInven;
	protected JButton jButtonCancelarToolBarCargoInven;
    protected JButton jButtonGuardarCambiosToolBarCargoInven;
	protected JButton jButtonGuardarCambiosTablaToolBarCargoInven;
	protected JButton jButtonMostrarOcultarTablaToolBarCargoInven;
	protected JButton jButtonCerrarToolBarCargoInven;
	
	protected JButton jButtonProcesarInformacionToolBarCargoInven;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCargoInven;
	protected JMenuItem jMenuItemModificarCargoInven;
	protected JMenuItem jMenuItemActualizarCargoInven;
    protected JMenuItem jMenuItemEliminarCargoInven;
	protected JMenuItem jMenuItemCancelarCargoInven;
    protected JMenuItem jMenuItemGuardarCambiosCargoInven;
	protected JMenuItem jMenuItemGuardarCambiosTablaCargoInven;
	protected JMenuItem jMenuItemCerrarCargoInven;
	protected JMenuItem jMenuItemDetalleCerrarCargoInven;
	protected JMenuItem jMenuItemDetalleMostarOcultarCargoInven;
	
	protected JMenuItem jMenuItemProcesarInformacionCargoInven;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCargoInven;
	protected JMenuItem jMenuItemMostrarOcultarCargoInven;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCargoInven;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCargoInven;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCargoInven;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioCargoInven;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidCargoInven;
	public JLabel jLabelIdCargoInven;
	public JLabel jLabelidCargoInven;
	public JButton jButtonidCargoInvenBusqueda= new JButtonMe();

	public JPanel jPanelcon_sriCargoInven;
	public JLabel jLabelcon_sriCargoInven;
	public JCheckBox jCheckBoxcon_sriCargoInven;
	public JButton jButtoncon_sriCargoInvenBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionCargoInven;
	public JLabel jLabeldescripcionCargoInven;
	public JTextField jTextFielddescripcionCargoInven;
	public JButton jButtondescripcionCargoInvenBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaCargoInven;
	public JLabel jLabelid_empresaCargoInven;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaCargoInven;
	public JButton jButtonid_empresaCargoInven= new JButtonMe();
	public JButton jButtonid_empresaCargoInvenUpdate= new JButtonMe();
	public JButton jButtonid_empresaCargoInvenBusqueda= new JButtonMe();

	public JPanel jPanelid_cuenta_contableCargoInven;
	public JLabel jLabelid_cuenta_contableCargoInven;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contableCargoInven;
	public JButton jButtonid_cuenta_contableCargoInven= new JButtonMe();
	public JButton jButtonid_cuenta_contableCargoInvenUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contableCargoInvenBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contableCargoInvenArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_creditoCargoInven;
	public JLabel jLabelid_cuenta_contable_creditoCargoInven;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_creditoCargoInven;
	public JButton jButtonid_cuenta_contable_creditoCargoInven= new JButtonMe();
	public JButton jButtonid_cuenta_contable_creditoCargoInvenUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_creditoCargoInvenBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_creditoCargoInvenArbol= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesCargoInven;
	
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
		
	public int iWidthFormulario=580;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightFormulario=418;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public CargoInvenDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposCargoInven=new JPanel();
				this.jPanelAccionesFormularioCargoInven=new JPanel();
				this.jmenuBarDetalleCargoInven=new JMenuBar();
				this.jTtoolBarDetalleCargoInven=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CargoInvenDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("CargoInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public CargoInvenDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("CargoInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CargoInvenDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CargoInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CargoInvenDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("CargoInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CargoInvenDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("CargoInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarCargoInven() {
		return this.jButtonActualizarToolBarCargoInven;
	}
	
	public JButton getjButtonEliminarToolBarCargoInven() {
		return this.jButtonEliminarToolBarCargoInven;
	}
	
	public JButton getjButtonCancelarToolBarCargoInven() {
		return this.jButtonCancelarToolBarCargoInven;
	}		
	
	public JButton getjButtonProcesarInformacionCargoInven() {
		return this.jButtonProcesarInformacionCargoInven;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCargoInven)	{
		this.jButtonProcesarInformacionCargoInven = jButtonProcesarInformacionCargoInven;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCargoInven() {
		return this.jComboBoxTiposAccionesCargoInven;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCargoInven(
			JComboBox jComboBoxTiposRelacionesCargoInven) {
		this.jComboBoxTiposRelacionesCargoInven = jComboBoxTiposRelacionesCargoInven;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCargoInven(
			JComboBox jComboBoxTiposAccionesCargoInven) {
		this.jComboBoxTiposAccionesCargoInven = jComboBoxTiposAccionesCargoInven;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioCargoInven() {
		return this.jComboBoxTiposAccionesFormularioCargoInven;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioCargoInven(
			JComboBox jComboBoxTiposAccionesFormularioCargoInven) {
		this.jComboBoxTiposAccionesFormularioCargoInven = jComboBoxTiposAccionesFormularioCargoInven;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.cargoinvenSessionBean=new CargoInvenSessionBean();
		
		this.cargoinvenSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cargoinvenSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.cargoinvenSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CargoInvenJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CargoInvenJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CargoInvenJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Cargo Inventario MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.cargoinvenSessionBean.getEsGuardarRelacionado()) {
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
	
		CargoInvenJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleCargoInven= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarCargoInven=new JButtonMe();
				this.jButtonModificarToolBarCargoInven=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarCargoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarCargoInven,this.jTtoolBarDetalleCargoInven,
							"actualizar","actualizar","Actualizar"+" "+CargoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarCargoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarCargoInven,this.jTtoolBarDetalleCargoInven,
							"eliminar","eliminar","Eliminar"+" "+CargoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarCargoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarCargoInven,this.jTtoolBarDetalleCargoInven,
							"cancelar","cancelar","Cancelar"+" "+CargoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarCargoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarCargoInven,this.jTtoolBarDetalleCargoInven,
							"guardarcambios","guardarcambios","Guardar"+" "+CargoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarCargoInven,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarCargoInven,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarCargoInven,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleCargoInven=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleCargoInven=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoCargoInven=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesCargoInven=new JMenuMe("Acciones");
		this.jmenuDetalleDatosCargoInven=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCargoInven= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCargoInven.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCargoInven,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCargoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarCargoInven= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarCargoInven.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarCargoInven,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarCargoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarCargoInven= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarCargoInven.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarCargoInven,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarCargoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarCargoInven= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarCargoInven.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarCargoInven,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarCargoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarCargoInven= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarCargoInven.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarCargoInven,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarCargoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosCargoInven= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCargoInven.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCargoInven,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCargoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCargoInven= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCargoInven.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCargoInven,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCargoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarCargoInven= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarCargoInven.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarCargoInven,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarCargoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCargoInven= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCargoInven.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCargoInven,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCargoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCargoInven= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCargoInven.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCargoInven,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCargoInven, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoCargoInven.add(this.jMenuItemDetalleCerrarCargoInven);
		
		this.jmenuDetalleAccionesCargoInven.add(this.jMenuItemActualizarCargoInven);
		this.jmenuDetalleAccionesCargoInven.add(this.jMenuItemEliminarCargoInven);
		this.jmenuDetalleAccionesCargoInven.add(this.jMenuItemCancelarCargoInven);		
		
		//this.jmenuDetalleDatosCargoInven.add(this.jMenuItemDetalleAbrirOrderByCargoInven);				
		this.jmenuDetalleDatosCargoInven.add(this.jMenuItemDetalleMostarOcultarCargoInven);				
				
		//this.jmenuDetalleAccionesCargoInven.add(this.jMenuItemGuardarCambiosCargoInven);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoCargoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesCargoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosCargoInven, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleCargoInven.add(this.jmenuDetalleArchivoCargoInven);		
		this.jmenuBarDetalleCargoInven.add(this.jmenuDetalleAccionesCargoInven);		
		this.jmenuBarDetalleCargoInven.add(this.jmenuDetalleDatosCargoInven);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleCargoInven);				
	}
	
	
	public void inicializarElementosCamposCargoInven() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdCargoInven = new JLabelMe();
		jLabelIdCargoInven.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdCargoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCargoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCargoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdCargoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidCargoInven = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidCargoInven.setToolTipText(CargoInvenConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutCargoInven= new GridBagLayout();

		this.jPanelidCargoInven.setLayout(this.gridaBagLayoutCargoInven);

		jLabelidCargoInven = new JLabel();
		jLabelidCargoInven.setText("Id");

		jLabelidCargoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCargoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCargoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcon_sriCargoInven = new JLabelMe();
		this.jLabelcon_sriCargoInven.setText(""+CargoInvenConstantesFunciones.LABEL_CONSRI+" : *");
		this.jLabelcon_sriCargoInven.setToolTipText("Con Sri");
		this.jLabelcon_sriCargoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_sriCargoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_sriCargoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_sriCargoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_sriCargoInven=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_sriCargoInven.setToolTipText(CargoInvenConstantesFunciones.LABEL_CONSRI);
		this.gridaBagLayoutCargoInven = new GridBagLayout();
		this.jPanelcon_sriCargoInven.setLayout(this.gridaBagLayoutCargoInven);


		jCheckBoxcon_sriCargoInven= new JCheckBoxMe();
		jCheckBoxcon_sriCargoInven.setEnabled(false);

		jCheckBoxcon_sriCargoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_sriCargoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_sriCargoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_sriCargoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_sriCargoInvenBusqueda= new JButtonMe();
		this.jButtoncon_sriCargoInvenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_sriCargoInvenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_sriCargoInvenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_sriCargoInvenBusqueda.setText("U");
		this.jButtoncon_sriCargoInvenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_sriCargoInvenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_sriCargoInvenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_sriCargoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_sriCargoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_sriCargoInvenBusqueda"));

		if(this.cargoinvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_sriCargoInvenBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionCargoInven = new JLabelMe();
		this.jLabeldescripcionCargoInven.setText(""+CargoInvenConstantesFunciones.LABEL_DESCRIPCION+" :");
		this.jLabeldescripcionCargoInven.setToolTipText("Descripcion");
		this.jLabeldescripcionCargoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionCargoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionCargoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionCargoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionCargoInven=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionCargoInven.setToolTipText(CargoInvenConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutCargoInven = new GridBagLayout();
		this.jPaneldescripcionCargoInven.setLayout(this.gridaBagLayoutCargoInven);


		jTextFielddescripcionCargoInven= new JTextFieldMe();

		jTextFielddescripcionCargoInven.setEnabled(false);
		jTextFielddescripcionCargoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescripcionCargoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescripcionCargoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddescripcionCargoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtondescripcionCargoInvenBusqueda= new JButtonMe();
		this.jButtondescripcionCargoInvenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionCargoInvenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionCargoInvenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionCargoInvenBusqueda.setText("U");
		this.jButtondescripcionCargoInvenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionCargoInvenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionCargoInvenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddescripcionCargoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddescripcionCargoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionCargoInvenBusqueda"));

		if(this.cargoinvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionCargoInvenBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysCargoInven() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaCargoInven = new JLabelMe();
		this.jLabelid_empresaCargoInven.setText(""+CargoInvenConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaCargoInven.setToolTipText("Empresa");
		this.jLabelid_empresaCargoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCargoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCargoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaCargoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaCargoInven=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaCargoInven.setToolTipText(CargoInvenConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutCargoInven = new GridBagLayout();
		this.jPanelid_empresaCargoInven.setLayout(this.gridaBagLayoutCargoInven);


		jComboBoxid_empresaCargoInven= new JComboBoxMe();
		jComboBoxid_empresaCargoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCargoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCargoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaCargoInven,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaCargoInven.setEnabled(false);

		this.jButtonid_empresaCargoInven= new JButtonMe();
		this.jButtonid_empresaCargoInven.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCargoInven.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCargoInven.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCargoInven.setText("Buscar");
		this.jButtonid_empresaCargoInven.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaCargoInven.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCargoInven,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaCargoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCargoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCargoInven"));

		this.jButtonid_empresaCargoInvenBusqueda= new JButtonMe();
		this.jButtonid_empresaCargoInvenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCargoInvenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCargoInvenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCargoInvenBusqueda.setText("U");
		this.jButtonid_empresaCargoInvenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaCargoInvenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCargoInvenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaCargoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCargoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCargoInvenBusqueda"));

		if(this.cargoinvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaCargoInvenBusqueda.setVisible(false);		}

		this.jButtonid_empresaCargoInvenUpdate= new JButtonMe();
		this.jButtonid_empresaCargoInvenUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCargoInvenUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCargoInvenUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCargoInvenUpdate.setText("U");
		this.jButtonid_empresaCargoInvenUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaCargoInvenUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCargoInvenUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaCargoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCargoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCargoInvenUpdate"));



					
		this.jLabelid_cuenta_contableCargoInven = new JLabelMe();
		this.jLabelid_cuenta_contableCargoInven.setText(""+CargoInvenConstantesFunciones.LABEL_IDCUENTACONTABLE+" : *");
		this.jLabelid_cuenta_contableCargoInven.setToolTipText("Cuenta C. Debito");
		this.jLabelid_cuenta_contableCargoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contableCargoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contableCargoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contableCargoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contableCargoInven=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contableCargoInven.setToolTipText(CargoInvenConstantesFunciones.LABEL_IDCUENTACONTABLE);
		this.gridaBagLayoutCargoInven = new GridBagLayout();
		this.jPanelid_cuenta_contableCargoInven.setLayout(this.gridaBagLayoutCargoInven);


		jComboBoxid_cuenta_contableCargoInven= new JComboBoxMe();
		jComboBoxid_cuenta_contableCargoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableCargoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contableCargoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contableCargoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contableCargoInven= new JButtonMe();
		this.jButtonid_cuenta_contableCargoInven.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableCargoInven.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableCargoInven.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contableCargoInven.setText("Buscar");
		this.jButtonid_cuenta_contableCargoInven.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contableCargoInven.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableCargoInven,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contableCargoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableCargoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableCargoInven"));

		this.jButtonid_cuenta_contableCargoInvenBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contableCargoInvenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableCargoInvenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableCargoInvenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contableCargoInvenBusqueda.setText("U");
		this.jButtonid_cuenta_contableCargoInvenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contableCargoInvenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableCargoInvenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contableCargoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableCargoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableCargoInvenBusqueda"));

		if(this.cargoinvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contableCargoInvenBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contableCargoInvenUpdate= new JButtonMe();
		this.jButtonid_cuenta_contableCargoInvenUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableCargoInvenUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contableCargoInvenUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contableCargoInvenUpdate.setText("U");
		this.jButtonid_cuenta_contableCargoInvenUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contableCargoInvenUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableCargoInvenUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contableCargoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableCargoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableCargoInvenUpdate"));


		jButtonid_cuenta_contableCargoInvenArbol= new JButtonMe();
		jButtonid_cuenta_contableCargoInvenArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableCargoInvenArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableCargoInvenArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contableCargoInvenArbol.setText("Arbol");
		jButtonid_cuenta_contableCargoInvenArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contableCargoInvenArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contableCargoInvenArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contableCargoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contableCargoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contableCargoInvenArbol"));



					
		this.jLabelid_cuenta_contable_creditoCargoInven = new JLabelMe();
		this.jLabelid_cuenta_contable_creditoCargoInven.setText(""+CargoInvenConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO+" : *");
		this.jLabelid_cuenta_contable_creditoCargoInven.setToolTipText("Cuenta C. Credito");
		this.jLabelid_cuenta_contable_creditoCargoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_creditoCargoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_cuenta_contable_creditoCargoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_creditoCargoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_creditoCargoInven=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_creditoCargoInven.setToolTipText(CargoInvenConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO);
		this.gridaBagLayoutCargoInven = new GridBagLayout();
		this.jPanelid_cuenta_contable_creditoCargoInven.setLayout(this.gridaBagLayoutCargoInven);


		jComboBoxid_cuenta_contable_creditoCargoInven= new JComboBoxMe();
		jComboBoxid_cuenta_contable_creditoCargoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_creditoCargoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_creditoCargoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_creditoCargoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_creditoCargoInven= new JButtonMe();
		this.jButtonid_cuenta_contable_creditoCargoInven.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_creditoCargoInven.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_creditoCargoInven.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_creditoCargoInven.setText("Buscar");
		this.jButtonid_cuenta_contable_creditoCargoInven.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_creditoCargoInven.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_creditoCargoInven,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_creditoCargoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_creditoCargoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_creditoCargoInven"));

		this.jButtonid_cuenta_contable_creditoCargoInvenBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_creditoCargoInvenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_creditoCargoInvenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_creditoCargoInvenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_creditoCargoInvenBusqueda.setText("U");
		this.jButtonid_cuenta_contable_creditoCargoInvenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_creditoCargoInvenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_creditoCargoInvenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_creditoCargoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_creditoCargoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_creditoCargoInvenBusqueda"));

		if(this.cargoinvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_creditoCargoInvenBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_creditoCargoInvenUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_creditoCargoInvenUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_creditoCargoInvenUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_creditoCargoInvenUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_creditoCargoInvenUpdate.setText("U");
		this.jButtonid_cuenta_contable_creditoCargoInvenUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_creditoCargoInvenUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_creditoCargoInvenUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_creditoCargoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_creditoCargoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_creditoCargoInvenUpdate"));


		jButtonid_cuenta_contable_creditoCargoInvenArbol= new JButtonMe();
		jButtonid_cuenta_contable_creditoCargoInvenArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_creditoCargoInvenArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_creditoCargoInvenArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_creditoCargoInvenArbol.setText("Arbol");
		jButtonid_cuenta_contable_creditoCargoInvenArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_creditoCargoInvenArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_creditoCargoInvenArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_creditoCargoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_creditoCargoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_creditoCargoInvenArbol"));



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
		//this.jInternalFrameDetalleCargoInven = new CargoInvenBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Cargo Inventario DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCargoInven= new GridBagLayout();
		

		
		String sToolTipCargoInven="";
		sToolTipCargoInven=CargoInvenConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCargoInven+="(Nomina.CargoInven)";
		}
		
		if(!this.cargoinvenSessionBean.getEsGuardarRelacionado()) {
			sToolTipCargoInven+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoCargoInven = new JButtonMe();
		this.jButtonModificarCargoInven = new JButtonMe();
        this.jButtonActualizarCargoInven = new JButtonMe();
        this.jButtonEliminarCargoInven = new JButtonMe();
        this.jButtonCancelarCargoInven = new JButtonMe();
        this.jButtonGuardarCambiosCargoInven = new JButtonMe();
		this.jButtonGuardarCambiosTablaCargoInven = new JButtonMe();
		this.jButtonCerrarCargoInven = new JButtonMe();
		
		this.jScrollPanelDatosCargoInven = new JScrollPane();   
        this.jScrollPanelDatosEdicionCargoInven = new JScrollPane();
		this.jScrollPanelDatosGeneralCargoInven = new JScrollPane();
				
		
		
		this.jPanelCamposCargoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosCargoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesCargoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioCargoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Cargo Inventario";
		
		if(!this.cargoinvenSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCargoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Cargo Inventarioes" + this.sPath));
		} else {
			this.jScrollPanelDatosCargoInven.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionCargoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralCargoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposCargoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposCargoInven.setName("jPanelCamposCargoInven"); 

		this.jPanelCamposOcultosCargoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosCargoInven.setName("jPanelCamposOcultosCargoInven"); 

        this.jPanelAccionesCargoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCargoInven.setToolTipText("Acciones");
        this.jPanelAccionesCargoInven.setName("Acciones"); 

		this.jPanelAccionesFormularioCargoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioCargoInven.setToolTipText("Acciones");
        this.jPanelAccionesFormularioCargoInven.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionCargoInven, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCargoInven, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCargoInven, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposCargoInven, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosCargoInven, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioCargoInven, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoCargoInven.setText("Nuevo");
		this.jButtonModificarCargoInven.setText("Editar");
        this.jButtonActualizarCargoInven.setText("Actualizar");
        this.jButtonEliminarCargoInven.setText("Eliminar");
        this.jButtonCancelarCargoInven.setText("Cancelar");
        this.jButtonGuardarCambiosCargoInven.setText("Guardar");
		this.jButtonGuardarCambiosTablaCargoInven.setText("Guardar");
		this.jButtonCerrarCargoInven.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCargoInven,"nuevo_button","Nuevo",this.cargoinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarCargoInven,"modificar_button","Editar",this.cargoinvenSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarCargoInven,"actualizar_button","Actualizar",this.cargoinvenSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarCargoInven,"eliminar_button","Eliminar",this.cargoinvenSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarCargoInven,"cancelar_button","Cancelar",this.cargoinvenSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosCargoInven,"guardarcambios_button","Guardar",this.cargoinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCargoInven,"guardarcambiostabla_button","Guardar",this.cargoinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCargoInven,"cerrar_button","Salir",this.cargoinvenSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCargoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarCargoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosCargoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCargoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCargoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarCargoInven, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarCargoInven, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarCargoInven, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoCargoInven.setToolTipText("Nuevo"+" "+CargoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarCargoInven.setToolTipText("Editar"+" "+CargoInvenConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarCargoInven.setToolTipText("Actualizar"+" "+CargoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarCargoInven.setToolTipText("Eliminar)"+" "+CargoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarCargoInven.setToolTipText("Cancelar"+" "+CargoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosCargoInven.setToolTipText("Guardar"+" "+CargoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaCargoInven.setToolTipText("Guardar"+" "+CargoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCargoInven.setToolTipText("Salir"+" "+CargoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCargoInven";
		inputMap = this.jButtonNuevoCargoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCargoInven.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCargoInven"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarCargoInven";
		inputMap = this.jButtonActualizarCargoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarCargoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarCargoInven"));
		
		//ELIMINAR
		sMapKey = "EliminarCargoInven";
		inputMap = this.jButtonEliminarCargoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarCargoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarCargoInven"));
		
		//CANCELAR	
		sMapKey = "CancelarCargoInven";
		inputMap = this.jButtonCancelarCargoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarCargoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarCargoInven"));
		
		//CERRAR		
		sMapKey = "CerrarCargoInven";
		inputMap = this.jButtonCerrarCargoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCargoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCargoInven"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCargoInven";
		inputMap = this.jButtonGuardarCambiosTablaCargoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCargoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCargoInven"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoCargoInven = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoCargoInven.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoCargoInven.setToolTipText("Nuevo CargoInven");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoCargoInven, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarCargoInven = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarCargoInven.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarCargoInven.setToolTipText("Sin Cerrar Ventana CargoInven");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarCargoInven, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeCargoInven = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeCargoInven.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeCargoInven.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeCargoInven, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesCargoInven = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCargoInven.setText("Accion");
		this.jComboBoxTiposAccionesCargoInven.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioCargoInven = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioCargoInven.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioCargoInven.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesCargoInven = new JLabelMe();
		
		this.jLabelAccionesCargoInven.setText("Acciones");		
		this.jLabelAccionesCargoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCargoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCargoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposCargoInven();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysCargoInven();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesCargoInven=new JTabbedPane();
		this.jTabbedPaneRelacionesCargoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesCargoInven,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesCargoInven.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCargoInven.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCargoInven.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCargoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioCargoInven.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCargoInven.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCargoInven.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioCargoInven, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposCargoInven = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosCargoInven = new GridBagLayout();
		
		this.jPanelCamposCargoInven.setLayout(gridaBagLayoutCamposCargoInven);
		this.jPanelCamposOcultosCargoInven.setLayout(gridaBagLayoutCamposOcultosCargoInven);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsCargoInven = new GridBagConstraints();
	this.gridBagConstraintsCargoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargoInven.gridy = 0;
	this.gridBagConstraintsCargoInven.gridx = 0;
	this.gridBagConstraintsCargoInven.ipadx = 0;
	this.gridBagConstraintsCargoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidCargoInven.add(jLabelIdCargoInven, this.gridBagConstraintsCargoInven);



	this.gridBagConstraintsCargoInven = new GridBagConstraints();
	this.gridBagConstraintsCargoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargoInven.gridy = 0;
	this.gridBagConstraintsCargoInven.gridx = 1;
	this.gridBagConstraintsCargoInven.ipadx = 0;
	this.gridBagConstraintsCargoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidCargoInven.add(jLabelidCargoInven, this.gridBagConstraintsCargoInven);


	this.gridBagConstraintsCargoInven = new GridBagConstraints();
	this.gridBagConstraintsCargoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargoInven.gridy = 0;
	this.gridBagConstraintsCargoInven.gridx = 0;
	this.gridBagConstraintsCargoInven.ipadx = 0;
	this.gridBagConstraintsCargoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaCargoInven.add(jLabelid_empresaCargoInven, this.gridBagConstraintsCargoInven);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCargoInven = new GridBagConstraints();
		//this.gridBagConstraintsCargoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargoInven.gridy = 0;
		this.gridBagConstraintsCargoInven.gridx = 2;
		this.gridBagConstraintsCargoInven.ipadx = 0;
		this.gridBagConstraintsCargoInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCargoInven.add(jButtonid_empresaCargoInvenBusqueda, this.gridBagConstraintsCargoInven);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCargoInven = new GridBagConstraints();
		//this.gridBagConstraintsCargoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargoInven.gridy = 0;
		this.gridBagConstraintsCargoInven.gridx = 3;
		this.gridBagConstraintsCargoInven.ipadx = 0;
		this.gridBagConstraintsCargoInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCargoInven.add(jButtonid_empresaCargoInvenUpdate, this.gridBagConstraintsCargoInven);
	}

	this.gridBagConstraintsCargoInven = new GridBagConstraints();
	this.gridBagConstraintsCargoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargoInven.gridy = 0;
	this.gridBagConstraintsCargoInven.gridx = 1;
	this.gridBagConstraintsCargoInven.ipadx = 0;
	this.gridBagConstraintsCargoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaCargoInven.add(jComboBoxid_empresaCargoInven, this.gridBagConstraintsCargoInven);


	this.gridBagConstraintsCargoInven = new GridBagConstraints();
	this.gridBagConstraintsCargoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargoInven.gridy = 0;
	this.gridBagConstraintsCargoInven.gridx = 0;
	this.gridBagConstraintsCargoInven.ipadx = 0;
	this.gridBagConstraintsCargoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contableCargoInven.add(jLabelid_cuenta_contableCargoInven, this.gridBagConstraintsCargoInven);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsCargoInven = new GridBagConstraints();
	//this.gridBagConstraintsCargoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargoInven.gridy = 0;
	this.gridBagConstraintsCargoInven.gridx = 2;
	this.gridBagConstraintsCargoInven.ipadx = 0;
	this.gridBagConstraintsCargoInven.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contableCargoInven.add(jButtonid_cuenta_contableCargoInven, this.gridBagConstraintsCargoInven);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsCargoInven = new GridBagConstraints();
	//this.gridBagConstraintsCargoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargoInven.gridy = 0;
	this.gridBagConstraintsCargoInven.gridx = 3;
	this.gridBagConstraintsCargoInven.ipadx = 0;
	this.gridBagConstraintsCargoInven.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contableCargoInven.add(jButtonid_cuenta_contableCargoInvenArbol, this.gridBagConstraintsCargoInven);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCargoInven = new GridBagConstraints();
		//this.gridBagConstraintsCargoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargoInven.gridy = 0;
		this.gridBagConstraintsCargoInven.gridx = 4;
		this.gridBagConstraintsCargoInven.ipadx = 0;
		this.gridBagConstraintsCargoInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contableCargoInven.add(jButtonid_cuenta_contableCargoInvenBusqueda, this.gridBagConstraintsCargoInven);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCargoInven = new GridBagConstraints();
		//this.gridBagConstraintsCargoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargoInven.gridy = 0;
		this.gridBagConstraintsCargoInven.gridx = 5;
		this.gridBagConstraintsCargoInven.ipadx = 0;
		this.gridBagConstraintsCargoInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contableCargoInven.add(jButtonid_cuenta_contableCargoInvenUpdate, this.gridBagConstraintsCargoInven);
	}

	this.gridBagConstraintsCargoInven = new GridBagConstraints();
	this.gridBagConstraintsCargoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargoInven.gridy = 0;
	this.gridBagConstraintsCargoInven.gridx = 1;
	this.gridBagConstraintsCargoInven.ipadx = 0;
	this.gridBagConstraintsCargoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contableCargoInven.add(jComboBoxid_cuenta_contableCargoInven, this.gridBagConstraintsCargoInven);


	this.gridBagConstraintsCargoInven = new GridBagConstraints();
	this.gridBagConstraintsCargoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargoInven.gridy = 0;
	this.gridBagConstraintsCargoInven.gridx = 0;
	this.gridBagConstraintsCargoInven.ipadx = 0;
	this.gridBagConstraintsCargoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cuenta_contable_creditoCargoInven.add(jLabelid_cuenta_contable_creditoCargoInven, this.gridBagConstraintsCargoInven);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsCargoInven = new GridBagConstraints();
	//this.gridBagConstraintsCargoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargoInven.gridy = 0;
	this.gridBagConstraintsCargoInven.gridx = 2;
	this.gridBagConstraintsCargoInven.ipadx = 0;
	this.gridBagConstraintsCargoInven.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_creditoCargoInven.add(jButtonid_cuenta_contable_creditoCargoInven, this.gridBagConstraintsCargoInven);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsCargoInven = new GridBagConstraints();
	//this.gridBagConstraintsCargoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargoInven.gridy = 0;
	this.gridBagConstraintsCargoInven.gridx = 3;
	this.gridBagConstraintsCargoInven.ipadx = 0;
	this.gridBagConstraintsCargoInven.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_creditoCargoInven.add(jButtonid_cuenta_contable_creditoCargoInvenArbol, this.gridBagConstraintsCargoInven);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCargoInven = new GridBagConstraints();
		//this.gridBagConstraintsCargoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargoInven.gridy = 0;
		this.gridBagConstraintsCargoInven.gridx = 4;
		this.gridBagConstraintsCargoInven.ipadx = 0;
		this.gridBagConstraintsCargoInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_creditoCargoInven.add(jButtonid_cuenta_contable_creditoCargoInvenBusqueda, this.gridBagConstraintsCargoInven);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCargoInven = new GridBagConstraints();
		//this.gridBagConstraintsCargoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargoInven.gridy = 0;
		this.gridBagConstraintsCargoInven.gridx = 5;
		this.gridBagConstraintsCargoInven.ipadx = 0;
		this.gridBagConstraintsCargoInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_creditoCargoInven.add(jButtonid_cuenta_contable_creditoCargoInvenUpdate, this.gridBagConstraintsCargoInven);
	}

	this.gridBagConstraintsCargoInven = new GridBagConstraints();
	this.gridBagConstraintsCargoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargoInven.gridy = 0;
	this.gridBagConstraintsCargoInven.gridx = 1;
	this.gridBagConstraintsCargoInven.ipadx = 0;
	this.gridBagConstraintsCargoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cuenta_contable_creditoCargoInven.add(jComboBoxid_cuenta_contable_creditoCargoInven, this.gridBagConstraintsCargoInven);


	this.gridBagConstraintsCargoInven = new GridBagConstraints();
	this.gridBagConstraintsCargoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargoInven.gridy = 0;
	this.gridBagConstraintsCargoInven.gridx = 0;
	this.gridBagConstraintsCargoInven.ipadx = 0;
	this.gridBagConstraintsCargoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_sriCargoInven.add(jLabelcon_sriCargoInven, this.gridBagConstraintsCargoInven);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCargoInven = new GridBagConstraints();
		//this.gridBagConstraintsCargoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargoInven.gridy = 0;
		this.gridBagConstraintsCargoInven.gridx = 2;
		this.gridBagConstraintsCargoInven.ipadx = 0;
		this.gridBagConstraintsCargoInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_sriCargoInven.add(jButtoncon_sriCargoInvenBusqueda, this.gridBagConstraintsCargoInven);
	}

	this.gridBagConstraintsCargoInven = new GridBagConstraints();
	this.gridBagConstraintsCargoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargoInven.gridy = 0;
	this.gridBagConstraintsCargoInven.gridx = 1;
	this.gridBagConstraintsCargoInven.ipadx = 0;
	this.gridBagConstraintsCargoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_sriCargoInven.add(jCheckBoxcon_sriCargoInven, this.gridBagConstraintsCargoInven);


	this.gridBagConstraintsCargoInven = new GridBagConstraints();
	this.gridBagConstraintsCargoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargoInven.gridy = 0;
	this.gridBagConstraintsCargoInven.gridx = 0;
	this.gridBagConstraintsCargoInven.ipadx = 0;
	this.gridBagConstraintsCargoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionCargoInven.add(jLabeldescripcionCargoInven, this.gridBagConstraintsCargoInven);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCargoInven = new GridBagConstraints();
		//this.gridBagConstraintsCargoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCargoInven.gridy = 0;
		this.gridBagConstraintsCargoInven.gridx = 2;
		this.gridBagConstraintsCargoInven.ipadx = 0;
		this.gridBagConstraintsCargoInven.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionCargoInven.add(jButtondescripcionCargoInvenBusqueda, this.gridBagConstraintsCargoInven);
	}

	this.gridBagConstraintsCargoInven = new GridBagConstraints();
	this.gridBagConstraintsCargoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCargoInven.gridy = 0;
	this.gridBagConstraintsCargoInven.gridx = 1;
	this.gridBagConstraintsCargoInven.ipadx = 0;
	this.gridBagConstraintsCargoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionCargoInven.add(jTextFielddescripcionCargoInven, this.gridBagConstraintsCargoInven);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsCargoInven = new GridBagConstraints();
	this.gridBagConstraintsCargoInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCargoInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCargoInven.gridy = iYPanelCamposCargoInven;
	this.gridBagConstraintsCargoInven.gridx = iXPanelCamposCargoInven++;
	this.gridBagConstraintsCargoInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCargoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCargoInven.add(this.jPanelidCargoInven, this.gridBagConstraintsCargoInven);



	if(iXPanelCamposCargoInven % 1==0) {
		iXPanelCamposCargoInven=0;
		iYPanelCamposCargoInven++;
	}
	this.gridBagConstraintsCargoInven = new GridBagConstraints();
	this.gridBagConstraintsCargoInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCargoInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCargoInven.gridy = iYPanelCamposCargoInven;
	this.gridBagConstraintsCargoInven.gridx = iXPanelCamposCargoInven++;
	this.gridBagConstraintsCargoInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCargoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCargoInven.add(this.jPanelid_cuenta_contableCargoInven, this.gridBagConstraintsCargoInven);



	if(iXPanelCamposCargoInven % 1==0) {
		iXPanelCamposCargoInven=0;
		iYPanelCamposCargoInven++;
	}
	this.gridBagConstraintsCargoInven = new GridBagConstraints();
	this.gridBagConstraintsCargoInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCargoInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCargoInven.gridy = iYPanelCamposCargoInven;
	this.gridBagConstraintsCargoInven.gridx = iXPanelCamposCargoInven++;
	this.gridBagConstraintsCargoInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCargoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCargoInven.add(this.jPanelid_cuenta_contable_creditoCargoInven, this.gridBagConstraintsCargoInven);



	if(iXPanelCamposCargoInven % 1==0) {
		iXPanelCamposCargoInven=0;
		iYPanelCamposCargoInven++;
	}
	this.gridBagConstraintsCargoInven = new GridBagConstraints();
	this.gridBagConstraintsCargoInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCargoInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCargoInven.gridy = iYPanelCamposCargoInven;
	this.gridBagConstraintsCargoInven.gridx = iXPanelCamposCargoInven++;
	this.gridBagConstraintsCargoInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCargoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCargoInven.add(this.jPanelcon_sriCargoInven, this.gridBagConstraintsCargoInven);



	if(iXPanelCamposCargoInven % 1==0) {
		iXPanelCamposCargoInven=0;
		iYPanelCamposCargoInven++;
	}
	this.gridBagConstraintsCargoInven = new GridBagConstraints();
	this.gridBagConstraintsCargoInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCargoInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCargoInven.gridy = iYPanelCamposCargoInven;
	this.gridBagConstraintsCargoInven.gridx = iXPanelCamposCargoInven++;
	this.gridBagConstraintsCargoInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCargoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposCargoInven.add(this.jPaneldescripcionCargoInven, this.gridBagConstraintsCargoInven);



	if(iXPanelCamposCargoInven % 1==0) {
		iXPanelCamposCargoInven=0;
		iYPanelCamposCargoInven++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsCargoInven = new GridBagConstraints();
	this.gridBagConstraintsCargoInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCargoInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCargoInven.gridy = iYPanelCamposOcultosCargoInven;
	this.gridBagConstraintsCargoInven.gridx = iXPanelCamposOcultosCargoInven++;
	this.gridBagConstraintsCargoInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCargoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosCargoInven.add(this.jPanelid_empresaCargoInven, this.gridBagConstraintsCargoInven);



	if(iXPanelCamposOcultosCargoInven % 1==0) {
		iXPanelCamposOcultosCargoInven=0;
		iYPanelCamposOcultosCargoInven++;
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
			
		GridBagLayout gridaBagLayoutAccionesCargoInven= new GridBagLayout();
		this.jPanelAccionesCargoInven.setLayout(gridaBagLayoutAccionesCargoInven);
		
		GridBagLayout gridaBagLayoutAccionesFormularioCargoInven= new GridBagLayout();
		this.jPanelAccionesFormularioCargoInven.setLayout(gridaBagLayoutAccionesFormularioCargoInven);
		
		this.gridBagConstraintsCargoInven = new GridBagConstraints();
		this.gridBagConstraintsCargoInven.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCargoInven.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCargoInven.add(this.jComboBoxTiposAccionesFormularioCargoInven, this.gridBagConstraintsCargoInven);

		this.gridBagConstraintsCargoInven = new GridBagConstraints();
		this.gridBagConstraintsCargoInven.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCargoInven.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCargoInven.add(this.jCheckBoxPostAccionNuevoCargoInven, this.gridBagConstraintsCargoInven);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.cargoinvenSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsCargoInven = new GridBagConstraints();
			this.gridBagConstraintsCargoInven.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsCargoInven.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioCargoInven.add(this.jCheckBoxPostAccionSinCerrarCargoInven, this.gridBagConstraintsCargoInven);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.cargoinvenSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.cargoinvenSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsCargoInven = new GridBagConstraints();
			this.gridBagConstraintsCargoInven.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsCargoInven.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioCargoInven.add(this.jCheckBoxPostAccionSinMensajeCargoInven, this.gridBagConstraintsCargoInven);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsCargoInven = new GridBagConstraints();
		this.gridBagConstraintsCargoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCargoInven.gridy = 0;
		this.gridBagConstraintsCargoInven.gridx = iPosXAccion++;
			
		this.jPanelAccionesCargoInven.add(this.jButtonModificarCargoInven, this.gridBagConstraintsCargoInven);							

		this.gridBagConstraintsCargoInven = new GridBagConstraints();
		this.gridBagConstraintsCargoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCargoInven.gridy = 0;
		this.gridBagConstraintsCargoInven.gridx =iPosXAccion++;
			
		this.jPanelAccionesCargoInven.add(this.jButtonEliminarCargoInven, this.gridBagConstraintsCargoInven);
		
			
		this.gridBagConstraintsCargoInven = new GridBagConstraints();
		this.gridBagConstraintsCargoInven.gridy = 0;		
		this.gridBagConstraintsCargoInven.gridx = iPosXAccion++;
		
		this.jPanelAccionesCargoInven.add(this.jButtonActualizarCargoInven, this.gridBagConstraintsCargoInven);


		this.gridBagConstraintsCargoInven = new GridBagConstraints();
		this.gridBagConstraintsCargoInven.gridy = 0;		
		this.gridBagConstraintsCargoInven.gridx = iPosXAccion++;
		
		this.jPanelAccionesCargoInven.add(this.jButtonGuardarCambiosCargoInven, this.gridBagConstraintsCargoInven);	
		
		this.gridBagConstraintsCargoInven = new GridBagConstraints();
		this.gridBagConstraintsCargoInven.gridy = 0;		
		this.gridBagConstraintsCargoInven.gridx =iPosXAccion++;
		
		this.jPanelAccionesCargoInven.add(this.jButtonCancelarCargoInven, this.gridBagConstraintsCargoInven);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCargoInven = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCargoInven);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.cargoinvenSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCargoInven = new GridBagConstraints();						
			this.gridBagConstraintsCargoInven.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCargoInven.gridx = 0;		
			//this.gridBagConstraintsCargoInven.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCargoInven.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCargoInven.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsCargoInven = new GridBagConstraints();
		this.gridBagConstraintsCargoInven.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCargoInven.gridx =0;
		this.gridBagConstraintsCargoInven.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCargoInven.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCargoInven, this.gridBagConstraintsCargoInven);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(CargoInvenJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleCargoInven = new CargoInvenBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Cargo Inventario DATOS");
			
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
			
	        //this.setTitle("[FOR] - Cargo Inventario DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Cargo Inventario Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			CargoInvenModel cargoinvenModel=new CargoInvenModel(this);
			
			//SI USARA CLASE INTERNA
			//CargoInvenModel.CargoInvenFocusTraversalPolicy cargoinvenFocusTraversalPolicy = cargoinvenModel.new CargoInvenFocusTraversalPolicy(this);
			
			//cargoinvenFocusTraversalPolicy.setcargoinvenJInternalFrame(this);
			
			this.setFocusTraversalPolicy(cargoinvenModel);
			
			
			this.jContentPaneDetalleCargoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleCargoInven = new GridBagLayout();	
			this.jContentPaneDetalleCargoInven.setLayout(gridaBagLayoutDetalleCargoInven);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCargoInven = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsCargoInven = new GridBagConstraints();
				this.gridBagConstraintsCargoInven.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsCargoInven.gridx = 0;
					
				
				this.jContentPaneDetalleCargoInven.add(jTtoolBarDetalleCargoInven, gridBagConstraintsCargoInven);								
				
}
			
			this.jScrollPanelDatosEdicionCargoInven=   new JScrollPane(jContentPaneDetalleCargoInven,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCargoInven.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCargoInven.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCargoInven.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralCargoInven=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCargoInven.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCargoInven.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCargoInven.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCargoInven = new GridBagConstraints();
			
			
	        this.gridBagConstraintsCargoInven.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsCargoInven.gridx = 0;
	        
			this.jContentPaneDetalleCargoInven.add(jPanelCamposCargoInven, gridBagConstraintsCargoInven);
			
			
			
			
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
						&& cargoinvenSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.cargoinvenSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsCargoInven= new GridBagConstraints();
						this.gridBagConstraintsCargoInven.gridy = iGridyRelaciones++;
						this.gridBagConstraintsCargoInven.gridx = 0;
						this.jContentPaneDetalleCargoInven.add(this.jTabbedPaneRelacionesCargoInven, this.gridBagConstraintsCargoInven);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesCargoInven.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosCargoInven.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsCargoInven = new GridBagConstraints();
					this.gridBagConstraintsCargoInven.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsCargoInven.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsCargoInven.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsCargoInven.gridx = 0;
					
				
					this.jContentPaneDetalleCargoInven.add(jPanelCamposOcultosCargoInven, gridBagConstraintsCargoInven);
				
					this.jPanelCamposOcultosCargoInven.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsCargoInven = new GridBagConstraints();
			this.gridBagConstraintsCargoInven.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsCargoInven.gridx = 0;
	        this.gridBagConstraintsCargoInven.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleCargoInven.add(this.jPanelAccionesFormularioCargoInven, this.gridBagConstraintsCargoInven);							
			
			
			
			this.gridBagConstraintsCargoInven = new GridBagConstraints();
	        this.gridBagConstraintsCargoInven.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsCargoInven.gridx = 0;
	        
			
			this.jContentPaneDetalleCargoInven.add(this.jPanelAccionesCargoInven, this.gridBagConstraintsCargoInven);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionCargoInven);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionCargoInven=   new JScrollPane(this.jPanelCamposCargoInven,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCargoInven.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCargoInven.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCargoInven.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsCargoInven = new GridBagConstraints();
			this.gridBagConstraintsCargoInven.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsCargoInven.gridx = 0;
			this.gridBagConstraintsCargoInven.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsCargoInven.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsCargoInven.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionCargoInven, this.gridBagConstraintsCargoInven);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsCargoInven = new GridBagConstraints();
			this.gridBagConstraintsCargoInven.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCargoInven.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioCargoInven, this.gridBagConstraintsCargoInven);			
			
			this.gridBagConstraintsCargoInven = new GridBagConstraints();
			this.gridBagConstraintsCargoInven.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCargoInven.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesCargoInven, this.gridBagConstraintsCargoInven);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsCargoInven = new GridBagConstraints();
		this.gridBagConstraintsCargoInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCargoInven.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCargoInven, this.gridBagConstraintsCargoInven);
			
			
		this.gridBagConstraintsCargoInven = new GridBagConstraints();
		this.gridBagConstraintsCargoInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCargoInven.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCargoInven, this.gridBagConstraintsCargoInven);
		
			
		this.gridBagConstraintsCargoInven = new GridBagConstraints();
		this.gridBagConstraintsCargoInven.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCargoInven.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCargoInven, this.gridBagConstraintsCargoInven);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralCargoInven;//jContentPane;
		
		return jScrollPanelDatosEdicionCargoInven;
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
