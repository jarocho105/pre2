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
import com.bydan.erp.puntoventa.util.NumeroRecapConstantesFunciones;

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
public class NumeroRecapDetalleFormJInternalFrame extends NumeroRecapBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleNumeroRecap;
	
	protected JMenuBar jmenuBarDetalleNumeroRecap;
	
	protected JMenu jmenuDetalleNumeroRecap;
	protected JMenu jmenuDetalleArchivoNumeroRecap;
	protected JMenu jmenuDetalleAccionesNumeroRecap;
	protected JMenu jmenuDetalleDatosNumeroRecap;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleNumeroRecap = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutNumeroRecap;	
	protected GridBagConstraints gridBagConstraintsNumeroRecap;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected NumeroRecapBeanSwingJInternalFrameAdditional jInternalFrameDetalleNumeroRecap;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected ConexionBeanSwingJInternalFrame conexionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_conexion="";
	
	public NumeroRecapSessionBean numerorecapSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public ConexionSessionBean conexionSessionBean;	
	
	public NumeroRecapLogic numerorecapLogic;
	
	public JScrollPane jScrollPanelDatosNumeroRecap;
	public JScrollPane jScrollPanelDatosEdicionNumeroRecap;
	public JScrollPane jScrollPanelDatosGeneralNumeroRecap;
	
	protected JPanel jPanelCamposNumeroRecap;    
	protected JPanel jPanelCamposOcultosNumeroRecap;    	
	protected JPanel jPanelAccionesNumeroRecap;
	protected JPanel jPanelAccionesFormularioNumeroRecap;
    
	
	
	protected Integer iXPanelCamposNumeroRecap=0;
	protected Integer iYPanelCamposNumeroRecap=0;
	
	protected Integer iXPanelCamposOcultosNumeroRecap=0;
	protected Integer iYPanelCamposOcultosNumeroRecap=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoNumeroRecap;
	public JButton jButtonModificarNumeroRecap;
	public JButton jButtonActualizarNumeroRecap;
    public JButton jButtonEliminarNumeroRecap;
	public JButton jButtonCancelarNumeroRecap;
    public JButton jButtonGuardarCambiosNumeroRecap;
	public JButton jButtonGuardarCambiosTablaNumeroRecap;
	protected JButton jButtonCerrarNumeroRecap;
	
	
	protected JButton jButtonProcesarInformacionNumeroRecap;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoNumeroRecap;
	protected JCheckBox jCheckBoxPostAccionSinCerrarNumeroRecap;
	protected JCheckBox jCheckBoxPostAccionSinMensajeNumeroRecap;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarNumeroRecap;
	protected JButton jButtonModificarToolBarNumeroRecap;
	protected JButton jButtonActualizarToolBarNumeroRecap;
    protected JButton jButtonEliminarToolBarNumeroRecap;
	protected JButton jButtonCancelarToolBarNumeroRecap;
    protected JButton jButtonGuardarCambiosToolBarNumeroRecap;
	protected JButton jButtonGuardarCambiosTablaToolBarNumeroRecap;
	protected JButton jButtonMostrarOcultarTablaToolBarNumeroRecap;
	protected JButton jButtonCerrarToolBarNumeroRecap;
	
	protected JButton jButtonProcesarInformacionToolBarNumeroRecap;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoNumeroRecap;
	protected JMenuItem jMenuItemModificarNumeroRecap;
	protected JMenuItem jMenuItemActualizarNumeroRecap;
    protected JMenuItem jMenuItemEliminarNumeroRecap;
	protected JMenuItem jMenuItemCancelarNumeroRecap;
    protected JMenuItem jMenuItemGuardarCambiosNumeroRecap;
	protected JMenuItem jMenuItemGuardarCambiosTablaNumeroRecap;
	protected JMenuItem jMenuItemCerrarNumeroRecap;
	protected JMenuItem jMenuItemDetalleCerrarNumeroRecap;
	protected JMenuItem jMenuItemDetalleMostarOcultarNumeroRecap;
	
	protected JMenuItem jMenuItemProcesarInformacionNumeroRecap;
	protected JMenuItem jMenuItemNuevoGuardarCambiosNumeroRecap;
	protected JMenuItem jMenuItemMostrarOcultarNumeroRecap;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesNumeroRecap;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesNumeroRecap;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesNumeroRecap;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioNumeroRecap;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidNumeroRecap;
	public JLabel jLabelIdNumeroRecap;
	public JLabel jLabelidNumeroRecap;
	public JButton jButtonidNumeroRecapBusqueda= new JButtonMe();

	public JPanel jPanelnumero_recapNumeroRecap;
	public JLabel jLabelnumero_recapNumeroRecap;
	public JTextField jTextFieldnumero_recapNumeroRecap;
	public JButton jButtonnumero_recapNumeroRecapBusqueda= new JButtonMe();

	public JPanel jPanelfechaNumeroRecap;
	public JLabel jLabelfechaNumeroRecap;
	//public JFormattedTextField jDateChooserfechaNumeroRecap;

	public JDateChooser jDateChooserfechaNumeroRecap;
	public JButton jButtonfechaNumeroRecapBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaNumeroRecap;
	public JLabel jLabelid_empresaNumeroRecap;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaNumeroRecap;
	public JButton jButtonid_empresaNumeroRecap= new JButtonMe();
	public JButton jButtonid_empresaNumeroRecapUpdate= new JButtonMe();
	public JButton jButtonid_empresaNumeroRecapBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalNumeroRecap;
	public JLabel jLabelid_sucursalNumeroRecap;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalNumeroRecap;
	public JButton jButtonid_sucursalNumeroRecap= new JButtonMe();
	public JButton jButtonid_sucursalNumeroRecapUpdate= new JButtonMe();
	public JButton jButtonid_sucursalNumeroRecapBusqueda= new JButtonMe();

	public JPanel jPanelid_conexionNumeroRecap;
	public JLabel jLabelid_conexionNumeroRecap;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_conexionNumeroRecap;
	public JButton jButtonid_conexionNumeroRecap= new JButtonMe();
	public JButton jButtonid_conexionNumeroRecapUpdate= new JButtonMe();
	public JButton jButtonid_conexionNumeroRecapBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesNumeroRecap;
	
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
	public int iHeightFormulario=374;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public NumeroRecapDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposNumeroRecap=new JPanel();
				this.jPanelAccionesFormularioNumeroRecap=new JPanel();
				this.jmenuBarDetalleNumeroRecap=new JMenuBar();
				this.jTtoolBarDetalleNumeroRecap=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NumeroRecapDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("NumeroRecap No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public NumeroRecapDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("NumeroRecap No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NumeroRecapDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("NumeroRecap No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NumeroRecapDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("NumeroRecap No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NumeroRecapDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("NumeroRecap No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarNumeroRecap() {
		return this.jButtonActualizarToolBarNumeroRecap;
	}
	
	public JButton getjButtonEliminarToolBarNumeroRecap() {
		return this.jButtonEliminarToolBarNumeroRecap;
	}
	
	public JButton getjButtonCancelarToolBarNumeroRecap() {
		return this.jButtonCancelarToolBarNumeroRecap;
	}		
	
	public JButton getjButtonProcesarInformacionNumeroRecap() {
		return this.jButtonProcesarInformacionNumeroRecap;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionNumeroRecap)	{
		this.jButtonProcesarInformacionNumeroRecap = jButtonProcesarInformacionNumeroRecap;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesNumeroRecap() {
		return this.jComboBoxTiposAccionesNumeroRecap;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesNumeroRecap(
			JComboBox jComboBoxTiposRelacionesNumeroRecap) {
		this.jComboBoxTiposRelacionesNumeroRecap = jComboBoxTiposRelacionesNumeroRecap;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesNumeroRecap(
			JComboBox jComboBoxTiposAccionesNumeroRecap) {
		this.jComboBoxTiposAccionesNumeroRecap = jComboBoxTiposAccionesNumeroRecap;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioNumeroRecap() {
		return this.jComboBoxTiposAccionesFormularioNumeroRecap;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioNumeroRecap(
			JComboBox jComboBoxTiposAccionesFormularioNumeroRecap) {
		this.jComboBoxTiposAccionesFormularioNumeroRecap = jComboBoxTiposAccionesFormularioNumeroRecap;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.numerorecapSessionBean=new NumeroRecapSessionBean();
		
		this.numerorecapSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.numerorecapSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.numerorecapSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		NumeroRecapJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		NumeroRecapJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		NumeroRecapJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Numero Recap MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.numerorecapSessionBean.getEsGuardarRelacionado()) {
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
	
		NumeroRecapJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleNumeroRecap= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarNumeroRecap=new JButtonMe();
				this.jButtonModificarToolBarNumeroRecap=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarNumeroRecap=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarNumeroRecap,this.jTtoolBarDetalleNumeroRecap,
							"actualizar","actualizar","Actualizar"+" "+NumeroRecapConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarNumeroRecap=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarNumeroRecap,this.jTtoolBarDetalleNumeroRecap,
							"eliminar","eliminar","Eliminar"+" "+NumeroRecapConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarNumeroRecap=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarNumeroRecap,this.jTtoolBarDetalleNumeroRecap,
							"cancelar","cancelar","Cancelar"+" "+NumeroRecapConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarNumeroRecap=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarNumeroRecap,this.jTtoolBarDetalleNumeroRecap,
							"guardarcambios","guardarcambios","Guardar"+" "+NumeroRecapConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarNumeroRecap,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarNumeroRecap,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarNumeroRecap,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleNumeroRecap=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleNumeroRecap=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoNumeroRecap=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesNumeroRecap=new JMenuMe("Acciones");
		this.jmenuDetalleDatosNumeroRecap=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoNumeroRecap= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoNumeroRecap.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoNumeroRecap,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoNumeroRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarNumeroRecap= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarNumeroRecap.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarNumeroRecap,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarNumeroRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarNumeroRecap= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarNumeroRecap.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarNumeroRecap,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarNumeroRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarNumeroRecap= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarNumeroRecap.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarNumeroRecap,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarNumeroRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarNumeroRecap= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarNumeroRecap.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarNumeroRecap,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarNumeroRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosNumeroRecap= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosNumeroRecap.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosNumeroRecap,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosNumeroRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarNumeroRecap= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarNumeroRecap.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarNumeroRecap,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarNumeroRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarNumeroRecap= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarNumeroRecap.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarNumeroRecap,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarNumeroRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarNumeroRecap= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarNumeroRecap.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarNumeroRecap,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarNumeroRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarNumeroRecap= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarNumeroRecap.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarNumeroRecap,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarNumeroRecap, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoNumeroRecap.add(this.jMenuItemDetalleCerrarNumeroRecap);
		
		this.jmenuDetalleAccionesNumeroRecap.add(this.jMenuItemActualizarNumeroRecap);
		this.jmenuDetalleAccionesNumeroRecap.add(this.jMenuItemEliminarNumeroRecap);
		this.jmenuDetalleAccionesNumeroRecap.add(this.jMenuItemCancelarNumeroRecap);		
		
		//this.jmenuDetalleDatosNumeroRecap.add(this.jMenuItemDetalleAbrirOrderByNumeroRecap);				
		this.jmenuDetalleDatosNumeroRecap.add(this.jMenuItemDetalleMostarOcultarNumeroRecap);				
				
		//this.jmenuDetalleAccionesNumeroRecap.add(this.jMenuItemGuardarCambiosNumeroRecap);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoNumeroRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesNumeroRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosNumeroRecap, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleNumeroRecap.add(this.jmenuDetalleArchivoNumeroRecap);		
		this.jmenuBarDetalleNumeroRecap.add(this.jmenuDetalleAccionesNumeroRecap);		
		this.jmenuBarDetalleNumeroRecap.add(this.jmenuDetalleDatosNumeroRecap);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleNumeroRecap);				
	}
	
	
	public void inicializarElementosCamposNumeroRecap() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdNumeroRecap = new JLabelMe();
		jLabelIdNumeroRecap.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdNumeroRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdNumeroRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdNumeroRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdNumeroRecap,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidNumeroRecap = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidNumeroRecap.setToolTipText(NumeroRecapConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutNumeroRecap= new GridBagLayout();

		this.jPanelidNumeroRecap.setLayout(this.gridaBagLayoutNumeroRecap);

		jLabelidNumeroRecap = new JLabel();
		jLabelidNumeroRecap.setText("Id");

		jLabelidNumeroRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidNumeroRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidNumeroRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnumero_recapNumeroRecap = new JLabelMe();
		this.jLabelnumero_recapNumeroRecap.setText(""+NumeroRecapConstantesFunciones.LABEL_NUMERORECAP+" : *");
		this.jLabelnumero_recapNumeroRecap.setToolTipText("Numero Recap");
		this.jLabelnumero_recapNumeroRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_recapNumeroRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_recapNumeroRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_recapNumeroRecap,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_recapNumeroRecap=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_recapNumeroRecap.setToolTipText(NumeroRecapConstantesFunciones.LABEL_NUMERORECAP);
		this.gridaBagLayoutNumeroRecap = new GridBagLayout();
		this.jPanelnumero_recapNumeroRecap.setLayout(this.gridaBagLayoutNumeroRecap);


		jTextFieldnumero_recapNumeroRecap= new JTextFieldMe();

		jTextFieldnumero_recapNumeroRecap.setEnabled(false);
		jTextFieldnumero_recapNumeroRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_recapNumeroRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_recapNumeroRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_recapNumeroRecap,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_recapNumeroRecapBusqueda= new JButtonMe();
		this.jButtonnumero_recapNumeroRecapBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_recapNumeroRecapBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_recapNumeroRecapBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_recapNumeroRecapBusqueda.setText("U");
		this.jButtonnumero_recapNumeroRecapBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_recapNumeroRecapBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_recapNumeroRecapBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_recapNumeroRecap.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_recapNumeroRecap.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_recapNumeroRecapBusqueda"));

		if(this.numerorecapSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_recapNumeroRecapBusqueda.setVisible(false);		}


					
		this.jLabelfechaNumeroRecap = new JLabelMe();
		this.jLabelfechaNumeroRecap.setText(""+NumeroRecapConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaNumeroRecap.setToolTipText("Fecha");
		this.jLabelfechaNumeroRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaNumeroRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaNumeroRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaNumeroRecap,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaNumeroRecap=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaNumeroRecap.setToolTipText(NumeroRecapConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutNumeroRecap = new GridBagLayout();
		this.jPanelfechaNumeroRecap.setLayout(this.gridaBagLayoutNumeroRecap);


		//jFormattedTextFieldfechaNumeroRecap= new JFormattedTextFieldMe();

		jDateChooserfechaNumeroRecap= new JDateChooser();
		jDateChooserfechaNumeroRecap.setEnabled(false);
		jDateChooserfechaNumeroRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaNumeroRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaNumeroRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaNumeroRecap,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaNumeroRecap.setDate(new Date());
		jDateChooserfechaNumeroRecap.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaNumeroRecap.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaNumeroRecapBusqueda= new JButtonMe();
		this.jButtonfechaNumeroRecapBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaNumeroRecapBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaNumeroRecapBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaNumeroRecapBusqueda.setText("U");
		this.jButtonfechaNumeroRecapBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaNumeroRecapBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaNumeroRecapBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaNumeroRecap.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaNumeroRecap.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaNumeroRecapBusqueda"));

		if(this.numerorecapSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaNumeroRecapBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysNumeroRecap() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaNumeroRecap = new JLabelMe();
		this.jLabelid_empresaNumeroRecap.setText(""+NumeroRecapConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaNumeroRecap.setToolTipText("Empresa");
		this.jLabelid_empresaNumeroRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaNumeroRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaNumeroRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaNumeroRecap,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaNumeroRecap=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaNumeroRecap.setToolTipText(NumeroRecapConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutNumeroRecap = new GridBagLayout();
		this.jPanelid_empresaNumeroRecap.setLayout(this.gridaBagLayoutNumeroRecap);


		jComboBoxid_empresaNumeroRecap= new JComboBoxMe();
		jComboBoxid_empresaNumeroRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaNumeroRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaNumeroRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaNumeroRecap,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaNumeroRecap.setEnabled(false);

		this.jButtonid_empresaNumeroRecap= new JButtonMe();
		this.jButtonid_empresaNumeroRecap.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaNumeroRecap.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaNumeroRecap.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaNumeroRecap.setText("Buscar");
		this.jButtonid_empresaNumeroRecap.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaNumeroRecap.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaNumeroRecap,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaNumeroRecap.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaNumeroRecap.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaNumeroRecap"));

		this.jButtonid_empresaNumeroRecapBusqueda= new JButtonMe();
		this.jButtonid_empresaNumeroRecapBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaNumeroRecapBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaNumeroRecapBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaNumeroRecapBusqueda.setText("U");
		this.jButtonid_empresaNumeroRecapBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaNumeroRecapBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaNumeroRecapBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaNumeroRecap.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaNumeroRecap.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaNumeroRecapBusqueda"));

		if(this.numerorecapSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaNumeroRecapBusqueda.setVisible(false);		}

		this.jButtonid_empresaNumeroRecapUpdate= new JButtonMe();
		this.jButtonid_empresaNumeroRecapUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaNumeroRecapUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaNumeroRecapUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaNumeroRecapUpdate.setText("U");
		this.jButtonid_empresaNumeroRecapUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaNumeroRecapUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaNumeroRecapUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaNumeroRecap.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaNumeroRecap.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaNumeroRecapUpdate"));



					
		this.jLabelid_sucursalNumeroRecap = new JLabelMe();
		this.jLabelid_sucursalNumeroRecap.setText(""+NumeroRecapConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalNumeroRecap.setToolTipText("Sucursal");
		this.jLabelid_sucursalNumeroRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalNumeroRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalNumeroRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalNumeroRecap,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalNumeroRecap=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalNumeroRecap.setToolTipText(NumeroRecapConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutNumeroRecap = new GridBagLayout();
		this.jPanelid_sucursalNumeroRecap.setLayout(this.gridaBagLayoutNumeroRecap);


		jComboBoxid_sucursalNumeroRecap= new JComboBoxMe();
		jComboBoxid_sucursalNumeroRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalNumeroRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalNumeroRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalNumeroRecap,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalNumeroRecap.setEnabled(false);

		this.jButtonid_sucursalNumeroRecap= new JButtonMe();
		this.jButtonid_sucursalNumeroRecap.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalNumeroRecap.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalNumeroRecap.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalNumeroRecap.setText("Buscar");
		this.jButtonid_sucursalNumeroRecap.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalNumeroRecap.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalNumeroRecap,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalNumeroRecap.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalNumeroRecap.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalNumeroRecap"));

		this.jButtonid_sucursalNumeroRecapBusqueda= new JButtonMe();
		this.jButtonid_sucursalNumeroRecapBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalNumeroRecapBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalNumeroRecapBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalNumeroRecapBusqueda.setText("U");
		this.jButtonid_sucursalNumeroRecapBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalNumeroRecapBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalNumeroRecapBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalNumeroRecap.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalNumeroRecap.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalNumeroRecapBusqueda"));

		if(this.numerorecapSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalNumeroRecapBusqueda.setVisible(false);		}

		this.jButtonid_sucursalNumeroRecapUpdate= new JButtonMe();
		this.jButtonid_sucursalNumeroRecapUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalNumeroRecapUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalNumeroRecapUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalNumeroRecapUpdate.setText("U");
		this.jButtonid_sucursalNumeroRecapUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalNumeroRecapUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalNumeroRecapUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalNumeroRecap.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalNumeroRecap.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalNumeroRecapUpdate"));



					
		this.jLabelid_conexionNumeroRecap = new JLabelMe();
		this.jLabelid_conexionNumeroRecap.setText(""+NumeroRecapConstantesFunciones.LABEL_IDCONEXION+" : *");
		this.jLabelid_conexionNumeroRecap.setToolTipText("Conexion");
		this.jLabelid_conexionNumeroRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_conexionNumeroRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_conexionNumeroRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_conexionNumeroRecap,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_conexionNumeroRecap=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_conexionNumeroRecap.setToolTipText(NumeroRecapConstantesFunciones.LABEL_IDCONEXION);
		this.gridaBagLayoutNumeroRecap = new GridBagLayout();
		this.jPanelid_conexionNumeroRecap.setLayout(this.gridaBagLayoutNumeroRecap);


		jComboBoxid_conexionNumeroRecap= new JComboBoxMe();
		jComboBoxid_conexionNumeroRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_conexionNumeroRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_conexionNumeroRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_conexionNumeroRecap,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_conexionNumeroRecap= new JButtonMe();
		this.jButtonid_conexionNumeroRecap.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_conexionNumeroRecap.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_conexionNumeroRecap.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_conexionNumeroRecap.setText("Buscar");
		this.jButtonid_conexionNumeroRecap.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_conexionNumeroRecap.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_conexionNumeroRecap,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_conexionNumeroRecap.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_conexionNumeroRecap.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_conexionNumeroRecap"));

		this.jButtonid_conexionNumeroRecapBusqueda= new JButtonMe();
		this.jButtonid_conexionNumeroRecapBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_conexionNumeroRecapBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_conexionNumeroRecapBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_conexionNumeroRecapBusqueda.setText("U");
		this.jButtonid_conexionNumeroRecapBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_conexionNumeroRecapBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_conexionNumeroRecapBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_conexionNumeroRecap.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_conexionNumeroRecap.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_conexionNumeroRecapBusqueda"));

		if(this.numerorecapSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_conexionNumeroRecapBusqueda.setVisible(false);		}

		this.jButtonid_conexionNumeroRecapUpdate= new JButtonMe();
		this.jButtonid_conexionNumeroRecapUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_conexionNumeroRecapUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_conexionNumeroRecapUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_conexionNumeroRecapUpdate.setText("U");
		this.jButtonid_conexionNumeroRecapUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_conexionNumeroRecapUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_conexionNumeroRecapUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_conexionNumeroRecap.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_conexionNumeroRecap.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_conexionNumeroRecapUpdate"));



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
		//this.jInternalFrameDetalleNumeroRecap = new NumeroRecapBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Numero Recap DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutNumeroRecap= new GridBagLayout();
		

		
		String sToolTipNumeroRecap="";
		sToolTipNumeroRecap=NumeroRecapConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipNumeroRecap+="(PuntoVenta.NumeroRecap)";
		}
		
		if(!this.numerorecapSessionBean.getEsGuardarRelacionado()) {
			sToolTipNumeroRecap+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoNumeroRecap = new JButtonMe();
		this.jButtonModificarNumeroRecap = new JButtonMe();
        this.jButtonActualizarNumeroRecap = new JButtonMe();
        this.jButtonEliminarNumeroRecap = new JButtonMe();
        this.jButtonCancelarNumeroRecap = new JButtonMe();
        this.jButtonGuardarCambiosNumeroRecap = new JButtonMe();
		this.jButtonGuardarCambiosTablaNumeroRecap = new JButtonMe();
		this.jButtonCerrarNumeroRecap = new JButtonMe();
		
		this.jScrollPanelDatosNumeroRecap = new JScrollPane();   
        this.jScrollPanelDatosEdicionNumeroRecap = new JScrollPane();
		this.jScrollPanelDatosGeneralNumeroRecap = new JScrollPane();
				
		
		
		this.jPanelCamposNumeroRecap = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosNumeroRecap = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesNumeroRecap = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioNumeroRecap = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Numero Recap";
		
		if(!this.numerorecapSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosNumeroRecap.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Numero Recapes" + this.sPath));
		} else {
			this.jScrollPanelDatosNumeroRecap.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionNumeroRecap.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralNumeroRecap.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposNumeroRecap.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposNumeroRecap.setName("jPanelCamposNumeroRecap"); 

		this.jPanelCamposOcultosNumeroRecap.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosNumeroRecap.setName("jPanelCamposOcultosNumeroRecap"); 

        this.jPanelAccionesNumeroRecap.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesNumeroRecap.setToolTipText("Acciones");
        this.jPanelAccionesNumeroRecap.setName("Acciones"); 

		this.jPanelAccionesFormularioNumeroRecap.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioNumeroRecap.setToolTipText("Acciones");
        this.jPanelAccionesFormularioNumeroRecap.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionNumeroRecap, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralNumeroRecap, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosNumeroRecap, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposNumeroRecap, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosNumeroRecap, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioNumeroRecap, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoNumeroRecap.setText("Nuevo");
		this.jButtonModificarNumeroRecap.setText("Editar");
        this.jButtonActualizarNumeroRecap.setText("Actualizar");
        this.jButtonEliminarNumeroRecap.setText("Eliminar");
        this.jButtonCancelarNumeroRecap.setText("Cancelar");
        this.jButtonGuardarCambiosNumeroRecap.setText("Guardar");
		this.jButtonGuardarCambiosTablaNumeroRecap.setText("Guardar");
		this.jButtonCerrarNumeroRecap.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoNumeroRecap,"nuevo_button","Nuevo",this.numerorecapSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarNumeroRecap,"modificar_button","Editar",this.numerorecapSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarNumeroRecap,"actualizar_button","Actualizar",this.numerorecapSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarNumeroRecap,"eliminar_button","Eliminar",this.numerorecapSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarNumeroRecap,"cancelar_button","Cancelar",this.numerorecapSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosNumeroRecap,"guardarcambios_button","Guardar",this.numerorecapSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaNumeroRecap,"guardarcambiostabla_button","Guardar",this.numerorecapSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarNumeroRecap,"cerrar_button","Salir",this.numerorecapSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoNumeroRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarNumeroRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosNumeroRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaNumeroRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarNumeroRecap, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarNumeroRecap, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarNumeroRecap, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarNumeroRecap, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoNumeroRecap.setToolTipText("Nuevo"+" "+NumeroRecapConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarNumeroRecap.setToolTipText("Editar"+" "+NumeroRecapConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarNumeroRecap.setToolTipText("Actualizar"+" "+NumeroRecapConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarNumeroRecap.setToolTipText("Eliminar)"+" "+NumeroRecapConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarNumeroRecap.setToolTipText("Cancelar"+" "+NumeroRecapConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosNumeroRecap.setToolTipText("Guardar"+" "+NumeroRecapConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaNumeroRecap.setToolTipText("Guardar"+" "+NumeroRecapConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarNumeroRecap.setToolTipText("Salir"+" "+NumeroRecapConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoNumeroRecap";
		inputMap = this.jButtonNuevoNumeroRecap.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoNumeroRecap.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoNumeroRecap"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarNumeroRecap";
		inputMap = this.jButtonActualizarNumeroRecap.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarNumeroRecap.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarNumeroRecap"));
		
		//ELIMINAR
		sMapKey = "EliminarNumeroRecap";
		inputMap = this.jButtonEliminarNumeroRecap.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarNumeroRecap.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarNumeroRecap"));
		
		//CANCELAR	
		sMapKey = "CancelarNumeroRecap";
		inputMap = this.jButtonCancelarNumeroRecap.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarNumeroRecap.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarNumeroRecap"));
		
		//CERRAR		
		sMapKey = "CerrarNumeroRecap";
		inputMap = this.jButtonCerrarNumeroRecap.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarNumeroRecap.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarNumeroRecap"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaNumeroRecap";
		inputMap = this.jButtonGuardarCambiosTablaNumeroRecap.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaNumeroRecap.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaNumeroRecap"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoNumeroRecap = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoNumeroRecap.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoNumeroRecap.setToolTipText("Nuevo NumeroRecap");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoNumeroRecap, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarNumeroRecap = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarNumeroRecap.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarNumeroRecap.setToolTipText("Sin Cerrar Ventana NumeroRecap");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarNumeroRecap, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeNumeroRecap = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeNumeroRecap.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeNumeroRecap.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeNumeroRecap, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesNumeroRecap = new JComboBoxMe();
		//this.jComboBoxTiposAccionesNumeroRecap.setText("Accion");
		this.jComboBoxTiposAccionesNumeroRecap.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioNumeroRecap = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioNumeroRecap.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioNumeroRecap.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesNumeroRecap = new JLabelMe();
		
		this.jLabelAccionesNumeroRecap.setText("Acciones");		
		this.jLabelAccionesNumeroRecap.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesNumeroRecap.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesNumeroRecap.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposNumeroRecap();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysNumeroRecap();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesNumeroRecap=new JTabbedPane();
		this.jTabbedPaneRelacionesNumeroRecap.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesNumeroRecap,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesNumeroRecap.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesNumeroRecap.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesNumeroRecap.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesNumeroRecap, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioNumeroRecap.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioNumeroRecap.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioNumeroRecap.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioNumeroRecap, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposNumeroRecap = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosNumeroRecap = new GridBagLayout();
		
		this.jPanelCamposNumeroRecap.setLayout(gridaBagLayoutCamposNumeroRecap);
		this.jPanelCamposOcultosNumeroRecap.setLayout(gridaBagLayoutCamposOcultosNumeroRecap);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
	this.gridBagConstraintsNumeroRecap.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNumeroRecap.gridy = 0;
	this.gridBagConstraintsNumeroRecap.gridx = 0;
	this.gridBagConstraintsNumeroRecap.ipadx = 0;
	this.gridBagConstraintsNumeroRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidNumeroRecap.add(jLabelIdNumeroRecap, this.gridBagConstraintsNumeroRecap);



	this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
	this.gridBagConstraintsNumeroRecap.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNumeroRecap.gridy = 0;
	this.gridBagConstraintsNumeroRecap.gridx = 1;
	this.gridBagConstraintsNumeroRecap.ipadx = 0;
	this.gridBagConstraintsNumeroRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidNumeroRecap.add(jLabelidNumeroRecap, this.gridBagConstraintsNumeroRecap);


	this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
	this.gridBagConstraintsNumeroRecap.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNumeroRecap.gridy = 0;
	this.gridBagConstraintsNumeroRecap.gridx = 0;
	this.gridBagConstraintsNumeroRecap.ipadx = 0;
	this.gridBagConstraintsNumeroRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaNumeroRecap.add(jLabelid_empresaNumeroRecap, this.gridBagConstraintsNumeroRecap);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
		//this.gridBagConstraintsNumeroRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNumeroRecap.gridy = 0;
		this.gridBagConstraintsNumeroRecap.gridx = 2;
		this.gridBagConstraintsNumeroRecap.ipadx = 0;
		this.gridBagConstraintsNumeroRecap.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaNumeroRecap.add(jButtonid_empresaNumeroRecapBusqueda, this.gridBagConstraintsNumeroRecap);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
		//this.gridBagConstraintsNumeroRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNumeroRecap.gridy = 0;
		this.gridBagConstraintsNumeroRecap.gridx = 3;
		this.gridBagConstraintsNumeroRecap.ipadx = 0;
		this.gridBagConstraintsNumeroRecap.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaNumeroRecap.add(jButtonid_empresaNumeroRecapUpdate, this.gridBagConstraintsNumeroRecap);
	}

	this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
	this.gridBagConstraintsNumeroRecap.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNumeroRecap.gridy = 0;
	this.gridBagConstraintsNumeroRecap.gridx = 1;
	this.gridBagConstraintsNumeroRecap.ipadx = 0;
	this.gridBagConstraintsNumeroRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaNumeroRecap.add(jComboBoxid_empresaNumeroRecap, this.gridBagConstraintsNumeroRecap);


	this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
	this.gridBagConstraintsNumeroRecap.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNumeroRecap.gridy = 0;
	this.gridBagConstraintsNumeroRecap.gridx = 0;
	this.gridBagConstraintsNumeroRecap.ipadx = 0;
	this.gridBagConstraintsNumeroRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalNumeroRecap.add(jLabelid_sucursalNumeroRecap, this.gridBagConstraintsNumeroRecap);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
		//this.gridBagConstraintsNumeroRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNumeroRecap.gridy = 0;
		this.gridBagConstraintsNumeroRecap.gridx = 2;
		this.gridBagConstraintsNumeroRecap.ipadx = 0;
		this.gridBagConstraintsNumeroRecap.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalNumeroRecap.add(jButtonid_sucursalNumeroRecapBusqueda, this.gridBagConstraintsNumeroRecap);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
		//this.gridBagConstraintsNumeroRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNumeroRecap.gridy = 0;
		this.gridBagConstraintsNumeroRecap.gridx = 3;
		this.gridBagConstraintsNumeroRecap.ipadx = 0;
		this.gridBagConstraintsNumeroRecap.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalNumeroRecap.add(jButtonid_sucursalNumeroRecapUpdate, this.gridBagConstraintsNumeroRecap);
	}

	this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
	this.gridBagConstraintsNumeroRecap.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNumeroRecap.gridy = 0;
	this.gridBagConstraintsNumeroRecap.gridx = 1;
	this.gridBagConstraintsNumeroRecap.ipadx = 0;
	this.gridBagConstraintsNumeroRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalNumeroRecap.add(jComboBoxid_sucursalNumeroRecap, this.gridBagConstraintsNumeroRecap);


	this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
	this.gridBagConstraintsNumeroRecap.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNumeroRecap.gridy = 0;
	this.gridBagConstraintsNumeroRecap.gridx = 0;
	this.gridBagConstraintsNumeroRecap.ipadx = 0;
	this.gridBagConstraintsNumeroRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_conexionNumeroRecap.add(jLabelid_conexionNumeroRecap, this.gridBagConstraintsNumeroRecap);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
		//this.gridBagConstraintsNumeroRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNumeroRecap.gridy = 0;
		this.gridBagConstraintsNumeroRecap.gridx = 2;
		this.gridBagConstraintsNumeroRecap.ipadx = 0;
		this.gridBagConstraintsNumeroRecap.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_conexionNumeroRecap.add(jButtonid_conexionNumeroRecapBusqueda, this.gridBagConstraintsNumeroRecap);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
		//this.gridBagConstraintsNumeroRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNumeroRecap.gridy = 0;
		this.gridBagConstraintsNumeroRecap.gridx = 3;
		this.gridBagConstraintsNumeroRecap.ipadx = 0;
		this.gridBagConstraintsNumeroRecap.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_conexionNumeroRecap.add(jButtonid_conexionNumeroRecapUpdate, this.gridBagConstraintsNumeroRecap);
	}

	this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
	this.gridBagConstraintsNumeroRecap.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNumeroRecap.gridy = 0;
	this.gridBagConstraintsNumeroRecap.gridx = 1;
	this.gridBagConstraintsNumeroRecap.ipadx = 0;
	this.gridBagConstraintsNumeroRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_conexionNumeroRecap.add(jComboBoxid_conexionNumeroRecap, this.gridBagConstraintsNumeroRecap);


	this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
	this.gridBagConstraintsNumeroRecap.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNumeroRecap.gridy = 0;
	this.gridBagConstraintsNumeroRecap.gridx = 0;
	this.gridBagConstraintsNumeroRecap.ipadx = 0;
	this.gridBagConstraintsNumeroRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_recapNumeroRecap.add(jLabelnumero_recapNumeroRecap, this.gridBagConstraintsNumeroRecap);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
		//this.gridBagConstraintsNumeroRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNumeroRecap.gridy = 0;
		this.gridBagConstraintsNumeroRecap.gridx = 2;
		this.gridBagConstraintsNumeroRecap.ipadx = 0;
		this.gridBagConstraintsNumeroRecap.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_recapNumeroRecap.add(jButtonnumero_recapNumeroRecapBusqueda, this.gridBagConstraintsNumeroRecap);
	}

	this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
	this.gridBagConstraintsNumeroRecap.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNumeroRecap.gridy = 0;
	this.gridBagConstraintsNumeroRecap.gridx = 1;
	this.gridBagConstraintsNumeroRecap.ipadx = 0;
	this.gridBagConstraintsNumeroRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_recapNumeroRecap.add(jTextFieldnumero_recapNumeroRecap, this.gridBagConstraintsNumeroRecap);


	this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
	this.gridBagConstraintsNumeroRecap.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNumeroRecap.gridy = 0;
	this.gridBagConstraintsNumeroRecap.gridx = 0;
	this.gridBagConstraintsNumeroRecap.ipadx = 0;
	this.gridBagConstraintsNumeroRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaNumeroRecap.add(jLabelfechaNumeroRecap, this.gridBagConstraintsNumeroRecap);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
		//this.gridBagConstraintsNumeroRecap.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNumeroRecap.gridy = 0;
		this.gridBagConstraintsNumeroRecap.gridx = 2;
		this.gridBagConstraintsNumeroRecap.ipadx = 0;
		this.gridBagConstraintsNumeroRecap.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaNumeroRecap.add(jButtonfechaNumeroRecapBusqueda, this.gridBagConstraintsNumeroRecap);
	}

	this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
	this.gridBagConstraintsNumeroRecap.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNumeroRecap.gridy = 0;
	this.gridBagConstraintsNumeroRecap.gridx = 1;
	this.gridBagConstraintsNumeroRecap.ipadx = 0;
	this.gridBagConstraintsNumeroRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaNumeroRecap.add(jDateChooserfechaNumeroRecap, this.gridBagConstraintsNumeroRecap);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
	this.gridBagConstraintsNumeroRecap.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNumeroRecap.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNumeroRecap.gridy = iYPanelCamposNumeroRecap;
	this.gridBagConstraintsNumeroRecap.gridx = iXPanelCamposNumeroRecap++;
	this.gridBagConstraintsNumeroRecap.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNumeroRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNumeroRecap.add(this.jPanelidNumeroRecap, this.gridBagConstraintsNumeroRecap);



	if(iXPanelCamposNumeroRecap % 1==0) {
		iXPanelCamposNumeroRecap=0;
		iYPanelCamposNumeroRecap++;
	}
	this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
	this.gridBagConstraintsNumeroRecap.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNumeroRecap.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNumeroRecap.gridy = iYPanelCamposNumeroRecap;
	this.gridBagConstraintsNumeroRecap.gridx = iXPanelCamposNumeroRecap++;
	this.gridBagConstraintsNumeroRecap.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNumeroRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNumeroRecap.add(this.jPanelid_conexionNumeroRecap, this.gridBagConstraintsNumeroRecap);



	if(iXPanelCamposNumeroRecap % 1==0) {
		iXPanelCamposNumeroRecap=0;
		iYPanelCamposNumeroRecap++;
	}
	this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
	this.gridBagConstraintsNumeroRecap.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNumeroRecap.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNumeroRecap.gridy = iYPanelCamposNumeroRecap;
	this.gridBagConstraintsNumeroRecap.gridx = iXPanelCamposNumeroRecap++;
	this.gridBagConstraintsNumeroRecap.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNumeroRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNumeroRecap.add(this.jPanelnumero_recapNumeroRecap, this.gridBagConstraintsNumeroRecap);



	if(iXPanelCamposNumeroRecap % 1==0) {
		iXPanelCamposNumeroRecap=0;
		iYPanelCamposNumeroRecap++;
	}
	this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
	this.gridBagConstraintsNumeroRecap.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNumeroRecap.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNumeroRecap.gridy = iYPanelCamposNumeroRecap;
	this.gridBagConstraintsNumeroRecap.gridx = iXPanelCamposNumeroRecap++;
	this.gridBagConstraintsNumeroRecap.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNumeroRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNumeroRecap.add(this.jPanelfechaNumeroRecap, this.gridBagConstraintsNumeroRecap);



	if(iXPanelCamposNumeroRecap % 1==0) {
		iXPanelCamposNumeroRecap=0;
		iYPanelCamposNumeroRecap++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
	this.gridBagConstraintsNumeroRecap.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNumeroRecap.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNumeroRecap.gridy = iYPanelCamposOcultosNumeroRecap;
	this.gridBagConstraintsNumeroRecap.gridx = iXPanelCamposOcultosNumeroRecap++;
	this.gridBagConstraintsNumeroRecap.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNumeroRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosNumeroRecap.add(this.jPanelid_empresaNumeroRecap, this.gridBagConstraintsNumeroRecap);



	if(iXPanelCamposOcultosNumeroRecap % 1==0) {
		iXPanelCamposOcultosNumeroRecap=0;
		iYPanelCamposOcultosNumeroRecap++;
	}
	this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
	this.gridBagConstraintsNumeroRecap.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNumeroRecap.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNumeroRecap.gridy = iYPanelCamposOcultosNumeroRecap;
	this.gridBagConstraintsNumeroRecap.gridx = iXPanelCamposOcultosNumeroRecap++;
	this.gridBagConstraintsNumeroRecap.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNumeroRecap.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosNumeroRecap.add(this.jPanelid_sucursalNumeroRecap, this.gridBagConstraintsNumeroRecap);



	if(iXPanelCamposOcultosNumeroRecap % 1==0) {
		iXPanelCamposOcultosNumeroRecap=0;
		iYPanelCamposOcultosNumeroRecap++;
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
			
		GridBagLayout gridaBagLayoutAccionesNumeroRecap= new GridBagLayout();
		this.jPanelAccionesNumeroRecap.setLayout(gridaBagLayoutAccionesNumeroRecap);
		
		GridBagLayout gridaBagLayoutAccionesFormularioNumeroRecap= new GridBagLayout();
		this.jPanelAccionesFormularioNumeroRecap.setLayout(gridaBagLayoutAccionesFormularioNumeroRecap);
		
		this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
		this.gridBagConstraintsNumeroRecap.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsNumeroRecap.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioNumeroRecap.add(this.jComboBoxTiposAccionesFormularioNumeroRecap, this.gridBagConstraintsNumeroRecap);

		this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
		this.gridBagConstraintsNumeroRecap.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsNumeroRecap.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioNumeroRecap.add(this.jCheckBoxPostAccionNuevoNumeroRecap, this.gridBagConstraintsNumeroRecap);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.numerorecapSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
			this.gridBagConstraintsNumeroRecap.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsNumeroRecap.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioNumeroRecap.add(this.jCheckBoxPostAccionSinCerrarNumeroRecap, this.gridBagConstraintsNumeroRecap);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.numerorecapSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.numerorecapSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
			this.gridBagConstraintsNumeroRecap.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsNumeroRecap.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioNumeroRecap.add(this.jCheckBoxPostAccionSinMensajeNumeroRecap, this.gridBagConstraintsNumeroRecap);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
		this.gridBagConstraintsNumeroRecap.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNumeroRecap.gridy = 0;
		this.gridBagConstraintsNumeroRecap.gridx = iPosXAccion++;
			
		this.jPanelAccionesNumeroRecap.add(this.jButtonModificarNumeroRecap, this.gridBagConstraintsNumeroRecap);							

		this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
		this.gridBagConstraintsNumeroRecap.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNumeroRecap.gridy = 0;
		this.gridBagConstraintsNumeroRecap.gridx =iPosXAccion++;
			
		this.jPanelAccionesNumeroRecap.add(this.jButtonEliminarNumeroRecap, this.gridBagConstraintsNumeroRecap);
		
			
		this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
		this.gridBagConstraintsNumeroRecap.gridy = 0;		
		this.gridBagConstraintsNumeroRecap.gridx = iPosXAccion++;
		
		this.jPanelAccionesNumeroRecap.add(this.jButtonActualizarNumeroRecap, this.gridBagConstraintsNumeroRecap);


		this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
		this.gridBagConstraintsNumeroRecap.gridy = 0;		
		this.gridBagConstraintsNumeroRecap.gridx = iPosXAccion++;
		
		this.jPanelAccionesNumeroRecap.add(this.jButtonGuardarCambiosNumeroRecap, this.gridBagConstraintsNumeroRecap);	
		
		this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
		this.gridBagConstraintsNumeroRecap.gridy = 0;		
		this.gridBagConstraintsNumeroRecap.gridx =iPosXAccion++;
		
		this.jPanelAccionesNumeroRecap.add(this.jButtonCancelarNumeroRecap, this.gridBagConstraintsNumeroRecap);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutNumeroRecap = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutNumeroRecap);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.numerorecapSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsNumeroRecap = new GridBagConstraints();						
			this.gridBagConstraintsNumeroRecap.gridy = iGridyPrincipal++;
			this.gridBagConstraintsNumeroRecap.gridx = 0;		
			//this.gridBagConstraintsNumeroRecap.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNumeroRecap.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsNumeroRecap.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
		this.gridBagConstraintsNumeroRecap.gridy =iGridyPrincipal++;
		this.gridBagConstraintsNumeroRecap.gridx =0;
		this.gridBagConstraintsNumeroRecap.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsNumeroRecap.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosNumeroRecap, this.gridBagConstraintsNumeroRecap);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(NumeroRecapJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleNumeroRecap = new NumeroRecapBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Numero Recap DATOS");
			
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
			
	        //this.setTitle("[FOR] - Numero Recap DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Numero Recap Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			NumeroRecapModel numerorecapModel=new NumeroRecapModel(this);
			
			//SI USARA CLASE INTERNA
			//NumeroRecapModel.NumeroRecapFocusTraversalPolicy numerorecapFocusTraversalPolicy = numerorecapModel.new NumeroRecapFocusTraversalPolicy(this);
			
			//numerorecapFocusTraversalPolicy.setnumerorecapJInternalFrame(this);
			
			this.setFocusTraversalPolicy(numerorecapModel);
			
			
			this.jContentPaneDetalleNumeroRecap = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleNumeroRecap = new GridBagLayout();	
			this.jContentPaneDetalleNumeroRecap.setLayout(gridaBagLayoutDetalleNumeroRecap);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosNumeroRecap = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
				this.gridBagConstraintsNumeroRecap.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsNumeroRecap.gridx = 0;
					
				
				this.jContentPaneDetalleNumeroRecap.add(jTtoolBarDetalleNumeroRecap, gridBagConstraintsNumeroRecap);								
				
}
			
			this.jScrollPanelDatosEdicionNumeroRecap=   new JScrollPane(jContentPaneDetalleNumeroRecap,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionNumeroRecap.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionNumeroRecap.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionNumeroRecap.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralNumeroRecap=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralNumeroRecap.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralNumeroRecap.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralNumeroRecap.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
			
			
	        this.gridBagConstraintsNumeroRecap.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsNumeroRecap.gridx = 0;
	        
			this.jContentPaneDetalleNumeroRecap.add(jPanelCamposNumeroRecap, gridBagConstraintsNumeroRecap);
			
			
			
			
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
						&& numerorecapSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.numerorecapSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsNumeroRecap= new GridBagConstraints();
						this.gridBagConstraintsNumeroRecap.gridy = iGridyRelaciones++;
						this.gridBagConstraintsNumeroRecap.gridx = 0;
						this.jContentPaneDetalleNumeroRecap.add(this.jTabbedPaneRelacionesNumeroRecap, this.gridBagConstraintsNumeroRecap);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesNumeroRecap.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosNumeroRecap.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
					this.gridBagConstraintsNumeroRecap.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsNumeroRecap.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsNumeroRecap.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsNumeroRecap.gridx = 0;
					
				
					this.jContentPaneDetalleNumeroRecap.add(jPanelCamposOcultosNumeroRecap, gridBagConstraintsNumeroRecap);
				
					this.jPanelCamposOcultosNumeroRecap.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
			this.gridBagConstraintsNumeroRecap.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsNumeroRecap.gridx = 0;
	        this.gridBagConstraintsNumeroRecap.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleNumeroRecap.add(this.jPanelAccionesFormularioNumeroRecap, this.gridBagConstraintsNumeroRecap);							
			
			
			
			this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
	        this.gridBagConstraintsNumeroRecap.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsNumeroRecap.gridx = 0;
	        
			
			this.jContentPaneDetalleNumeroRecap.add(this.jPanelAccionesNumeroRecap, this.gridBagConstraintsNumeroRecap);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionNumeroRecap);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionNumeroRecap=   new JScrollPane(this.jPanelCamposNumeroRecap,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionNumeroRecap.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionNumeroRecap.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionNumeroRecap.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
			this.gridBagConstraintsNumeroRecap.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsNumeroRecap.gridx = 0;
			this.gridBagConstraintsNumeroRecap.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsNumeroRecap.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsNumeroRecap.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionNumeroRecap, this.gridBagConstraintsNumeroRecap);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
			this.gridBagConstraintsNumeroRecap.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsNumeroRecap.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioNumeroRecap, this.gridBagConstraintsNumeroRecap);			
			
			this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
			this.gridBagConstraintsNumeroRecap.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsNumeroRecap.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesNumeroRecap, this.gridBagConstraintsNumeroRecap);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
		this.gridBagConstraintsNumeroRecap.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNumeroRecap.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposNumeroRecap, this.gridBagConstraintsNumeroRecap);
			
			
		this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
		this.gridBagConstraintsNumeroRecap.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNumeroRecap.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosNumeroRecap, this.gridBagConstraintsNumeroRecap);
		
			
		this.gridBagConstraintsNumeroRecap = new GridBagConstraints();
		this.gridBagConstraintsNumeroRecap.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsNumeroRecap.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesNumeroRecap, this.gridBagConstraintsNumeroRecap);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralNumeroRecap;//jContentPane;
		
		return jScrollPanelDatosEdicionNumeroRecap;
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
