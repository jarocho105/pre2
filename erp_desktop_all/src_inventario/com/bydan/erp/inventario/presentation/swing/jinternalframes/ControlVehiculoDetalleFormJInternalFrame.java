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
package com.bydan.erp.inventario.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.inventario.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.inventario.util.ControlVehiculoConstantesFunciones;

import com.bydan.erp.inventario.business.logic.*;
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
public class ControlVehiculoDetalleFormJInternalFrame extends ControlVehiculoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleControlVehiculo;
	
	protected JMenuBar jmenuBarDetalleControlVehiculo;
	
	protected JMenu jmenuDetalleControlVehiculo;
	protected JMenu jmenuDetalleArchivoControlVehiculo;
	protected JMenu jmenuDetalleAccionesControlVehiculo;
	protected JMenu jmenuDetalleDatosControlVehiculo;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleControlVehiculo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutControlVehiculo;	
	protected GridBagConstraints gridBagConstraintsControlVehiculo;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ControlVehiculoBeanSwingJInternalFrameAdditional jInternalFrameDetalleControlVehiculo;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public ControlVehiculoSessionBean controlvehiculoSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public ControlVehiculoLogic controlvehiculoLogic;
	
	public JScrollPane jScrollPanelDatosControlVehiculo;
	public JScrollPane jScrollPanelDatosEdicionControlVehiculo;
	public JScrollPane jScrollPanelDatosGeneralControlVehiculo;
	
	protected JPanel jPanelCamposControlVehiculo;    
	protected JPanel jPanelCamposOcultosControlVehiculo;    	
	protected JPanel jPanelAccionesControlVehiculo;
	protected JPanel jPanelAccionesFormularioControlVehiculo;
    
	
	
	protected Integer iXPanelCamposControlVehiculo=0;
	protected Integer iYPanelCamposControlVehiculo=0;
	
	protected Integer iXPanelCamposOcultosControlVehiculo=0;
	protected Integer iYPanelCamposOcultosControlVehiculo=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoControlVehiculo;
	public JButton jButtonModificarControlVehiculo;
	public JButton jButtonActualizarControlVehiculo;
    public JButton jButtonEliminarControlVehiculo;
	public JButton jButtonCancelarControlVehiculo;
    public JButton jButtonGuardarCambiosControlVehiculo;
	public JButton jButtonGuardarCambiosTablaControlVehiculo;
	protected JButton jButtonCerrarControlVehiculo;
	
	
	protected JButton jButtonProcesarInformacionControlVehiculo;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoControlVehiculo;
	protected JCheckBox jCheckBoxPostAccionSinCerrarControlVehiculo;
	protected JCheckBox jCheckBoxPostAccionSinMensajeControlVehiculo;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarControlVehiculo;
	protected JButton jButtonModificarToolBarControlVehiculo;
	protected JButton jButtonActualizarToolBarControlVehiculo;
    protected JButton jButtonEliminarToolBarControlVehiculo;
	protected JButton jButtonCancelarToolBarControlVehiculo;
    protected JButton jButtonGuardarCambiosToolBarControlVehiculo;
	protected JButton jButtonGuardarCambiosTablaToolBarControlVehiculo;
	protected JButton jButtonMostrarOcultarTablaToolBarControlVehiculo;
	protected JButton jButtonCerrarToolBarControlVehiculo;
	
	protected JButton jButtonProcesarInformacionToolBarControlVehiculo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoControlVehiculo;
	protected JMenuItem jMenuItemModificarControlVehiculo;
	protected JMenuItem jMenuItemActualizarControlVehiculo;
    protected JMenuItem jMenuItemEliminarControlVehiculo;
	protected JMenuItem jMenuItemCancelarControlVehiculo;
    protected JMenuItem jMenuItemGuardarCambiosControlVehiculo;
	protected JMenuItem jMenuItemGuardarCambiosTablaControlVehiculo;
	protected JMenuItem jMenuItemCerrarControlVehiculo;
	protected JMenuItem jMenuItemDetalleCerrarControlVehiculo;
	protected JMenuItem jMenuItemDetalleMostarOcultarControlVehiculo;
	
	protected JMenuItem jMenuItemProcesarInformacionControlVehiculo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosControlVehiculo;
	protected JMenuItem jMenuItemMostrarOcultarControlVehiculo;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesControlVehiculo;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesControlVehiculo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesControlVehiculo;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioControlVehiculo;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidControlVehiculo;
	public JLabel jLabelIdControlVehiculo;
	public JLabel jLabelidControlVehiculo;
	public JButton jButtonidControlVehiculoBusqueda= new JButtonMe();

	public JPanel jPanelnombre_conductorControlVehiculo;
	public JLabel jLabelnombre_conductorControlVehiculo;
	public JTextArea jTextAreanombre_conductorControlVehiculo;
	public JScrollPane jscrollPanenombre_conductorControlVehiculo;
	public JButton jButtonnombre_conductorControlVehiculoBusqueda= new JButtonMe();

	public JPanel jPanelnumero_placaControlVehiculo;
	public JLabel jLabelnumero_placaControlVehiculo;
	public JTextArea jTextAreanumero_placaControlVehiculo;
	public JScrollPane jscrollPanenumero_placaControlVehiculo;
	public JButton jButtonnumero_placaControlVehiculoBusqueda= new JButtonMe();

	public JPanel jPanelfecha_entradaControlVehiculo;
	public JLabel jLabelfecha_entradaControlVehiculo;
	//public JFormattedTextField jDateChooserfecha_entradaControlVehiculo;

	public JDateChooser jDateChooserfecha_entradaControlVehiculo;
	public JButton jButtonfecha_entradaControlVehiculoBusqueda= new JButtonMe();

	public JPanel jPanelfecha_salidaControlVehiculo;
	public JLabel jLabelfecha_salidaControlVehiculo;
	//public JFormattedTextField jDateChooserfecha_salidaControlVehiculo;

	public JDateChooser jDateChooserfecha_salidaControlVehiculo;
	public JButton jButtonfecha_salidaControlVehiculoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaControlVehiculo;
	public JLabel jLabelid_empresaControlVehiculo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaControlVehiculo;
	public JButton jButtonid_empresaControlVehiculo= new JButtonMe();
	public JButton jButtonid_empresaControlVehiculoUpdate= new JButtonMe();
	public JButton jButtonid_empresaControlVehiculoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesControlVehiculo;
	
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
	public int iHeightFormulario=506;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ControlVehiculoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposControlVehiculo=new JPanel();
				this.jPanelAccionesFormularioControlVehiculo=new JPanel();
				this.jmenuBarDetalleControlVehiculo=new JMenuBar();
				this.jTtoolBarDetalleControlVehiculo=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ControlVehiculoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ControlVehiculo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ControlVehiculoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ControlVehiculo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ControlVehiculoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ControlVehiculo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ControlVehiculoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ControlVehiculo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ControlVehiculoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ControlVehiculo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarControlVehiculo() {
		return this.jButtonActualizarToolBarControlVehiculo;
	}
	
	public JButton getjButtonEliminarToolBarControlVehiculo() {
		return this.jButtonEliminarToolBarControlVehiculo;
	}
	
	public JButton getjButtonCancelarToolBarControlVehiculo() {
		return this.jButtonCancelarToolBarControlVehiculo;
	}		
	
	public JButton getjButtonProcesarInformacionControlVehiculo() {
		return this.jButtonProcesarInformacionControlVehiculo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionControlVehiculo)	{
		this.jButtonProcesarInformacionControlVehiculo = jButtonProcesarInformacionControlVehiculo;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesControlVehiculo() {
		return this.jComboBoxTiposAccionesControlVehiculo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesControlVehiculo(
			JComboBox jComboBoxTiposRelacionesControlVehiculo) {
		this.jComboBoxTiposRelacionesControlVehiculo = jComboBoxTiposRelacionesControlVehiculo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesControlVehiculo(
			JComboBox jComboBoxTiposAccionesControlVehiculo) {
		this.jComboBoxTiposAccionesControlVehiculo = jComboBoxTiposAccionesControlVehiculo;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioControlVehiculo() {
		return this.jComboBoxTiposAccionesFormularioControlVehiculo;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioControlVehiculo(
			JComboBox jComboBoxTiposAccionesFormularioControlVehiculo) {
		this.jComboBoxTiposAccionesFormularioControlVehiculo = jComboBoxTiposAccionesFormularioControlVehiculo;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.controlvehiculoSessionBean=new ControlVehiculoSessionBean();
		
		this.controlvehiculoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.controlvehiculoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.controlvehiculoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ControlVehiculoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ControlVehiculoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ControlVehiculoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Control Vehiculo MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.controlvehiculoSessionBean.getEsGuardarRelacionado()) {
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
	
		ControlVehiculoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleControlVehiculo= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarControlVehiculo=new JButtonMe();
				this.jButtonModificarToolBarControlVehiculo=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarControlVehiculo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarControlVehiculo,this.jTtoolBarDetalleControlVehiculo,
							"actualizar","actualizar","Actualizar"+" "+ControlVehiculoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarControlVehiculo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarControlVehiculo,this.jTtoolBarDetalleControlVehiculo,
							"eliminar","eliminar","Eliminar"+" "+ControlVehiculoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarControlVehiculo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarControlVehiculo,this.jTtoolBarDetalleControlVehiculo,
							"cancelar","cancelar","Cancelar"+" "+ControlVehiculoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarControlVehiculo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarControlVehiculo,this.jTtoolBarDetalleControlVehiculo,
							"guardarcambios","guardarcambios","Guardar"+" "+ControlVehiculoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarControlVehiculo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarControlVehiculo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarControlVehiculo,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleControlVehiculo=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleControlVehiculo=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoControlVehiculo=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesControlVehiculo=new JMenuMe("Acciones");
		this.jmenuDetalleDatosControlVehiculo=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoControlVehiculo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoControlVehiculo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoControlVehiculo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoControlVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarControlVehiculo= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarControlVehiculo.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarControlVehiculo,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarControlVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarControlVehiculo= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarControlVehiculo.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarControlVehiculo,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarControlVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarControlVehiculo= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarControlVehiculo.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarControlVehiculo,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarControlVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarControlVehiculo= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarControlVehiculo.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarControlVehiculo,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarControlVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosControlVehiculo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosControlVehiculo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosControlVehiculo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosControlVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarControlVehiculo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarControlVehiculo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarControlVehiculo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarControlVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarControlVehiculo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarControlVehiculo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarControlVehiculo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarControlVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarControlVehiculo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarControlVehiculo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarControlVehiculo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarControlVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarControlVehiculo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarControlVehiculo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarControlVehiculo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarControlVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoControlVehiculo.add(this.jMenuItemDetalleCerrarControlVehiculo);
		
		this.jmenuDetalleAccionesControlVehiculo.add(this.jMenuItemActualizarControlVehiculo);
		this.jmenuDetalleAccionesControlVehiculo.add(this.jMenuItemEliminarControlVehiculo);
		this.jmenuDetalleAccionesControlVehiculo.add(this.jMenuItemCancelarControlVehiculo);		
		
		//this.jmenuDetalleDatosControlVehiculo.add(this.jMenuItemDetalleAbrirOrderByControlVehiculo);				
		this.jmenuDetalleDatosControlVehiculo.add(this.jMenuItemDetalleMostarOcultarControlVehiculo);				
				
		//this.jmenuDetalleAccionesControlVehiculo.add(this.jMenuItemGuardarCambiosControlVehiculo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoControlVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesControlVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosControlVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleControlVehiculo.add(this.jmenuDetalleArchivoControlVehiculo);		
		this.jmenuBarDetalleControlVehiculo.add(this.jmenuDetalleAccionesControlVehiculo);		
		this.jmenuBarDetalleControlVehiculo.add(this.jmenuDetalleDatosControlVehiculo);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleControlVehiculo);				
	}
	
	
	public void inicializarElementosCamposControlVehiculo() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdControlVehiculo = new JLabelMe();
		jLabelIdControlVehiculo.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdControlVehiculo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdControlVehiculo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdControlVehiculo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdControlVehiculo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidControlVehiculo = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidControlVehiculo.setToolTipText(ControlVehiculoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutControlVehiculo= new GridBagLayout();

		this.jPanelidControlVehiculo.setLayout(this.gridaBagLayoutControlVehiculo);

		jLabelidControlVehiculo = new JLabel();
		jLabelidControlVehiculo.setText("Id");

		jLabelidControlVehiculo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidControlVehiculo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidControlVehiculo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombre_conductorControlVehiculo = new JLabelMe();
		this.jLabelnombre_conductorControlVehiculo.setText(""+ControlVehiculoConstantesFunciones.LABEL_NOMBRECONDUCTOR+" : *");
		this.jLabelnombre_conductorControlVehiculo.setToolTipText("Nombre Conductor");
		this.jLabelnombre_conductorControlVehiculo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_conductorControlVehiculo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_conductorControlVehiculo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_conductorControlVehiculo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_conductorControlVehiculo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_conductorControlVehiculo.setToolTipText(ControlVehiculoConstantesFunciones.LABEL_NOMBRECONDUCTOR);
		this.gridaBagLayoutControlVehiculo = new GridBagLayout();
		this.jPanelnombre_conductorControlVehiculo.setLayout(this.gridaBagLayoutControlVehiculo);


		jTextAreanombre_conductorControlVehiculo= new JTextAreaMe();
		jTextAreanombre_conductorControlVehiculo.setEnabled(false);
		jTextAreanombre_conductorControlVehiculo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_conductorControlVehiculo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_conductorControlVehiculo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_conductorControlVehiculo.setLineWrap(true);
		jTextAreanombre_conductorControlVehiculo.setWrapStyleWord(true);
		jTextAreanombre_conductorControlVehiculo.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_conductorControlVehiculo.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_conductorControlVehiculo,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_conductorControlVehiculo = new JScrollPane(jTextAreanombre_conductorControlVehiculo);
		jscrollPanenombre_conductorControlVehiculo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_conductorControlVehiculo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_conductorControlVehiculo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_conductorControlVehiculoBusqueda= new JButtonMe();
		this.jButtonnombre_conductorControlVehiculoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_conductorControlVehiculoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_conductorControlVehiculoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_conductorControlVehiculoBusqueda.setText("U");
		this.jButtonnombre_conductorControlVehiculoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_conductorControlVehiculoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_conductorControlVehiculoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_conductorControlVehiculo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_conductorControlVehiculo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_conductorControlVehiculoBusqueda"));

		if(this.controlvehiculoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_conductorControlVehiculoBusqueda.setVisible(false);		}


					
		this.jLabelnumero_placaControlVehiculo = new JLabelMe();
		this.jLabelnumero_placaControlVehiculo.setText(""+ControlVehiculoConstantesFunciones.LABEL_NUMEROPLACA+" : *");
		this.jLabelnumero_placaControlVehiculo.setToolTipText("Numero_placa");
		this.jLabelnumero_placaControlVehiculo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_placaControlVehiculo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_placaControlVehiculo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_placaControlVehiculo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_placaControlVehiculo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_placaControlVehiculo.setToolTipText(ControlVehiculoConstantesFunciones.LABEL_NUMEROPLACA);
		this.gridaBagLayoutControlVehiculo = new GridBagLayout();
		this.jPanelnumero_placaControlVehiculo.setLayout(this.gridaBagLayoutControlVehiculo);


		jTextAreanumero_placaControlVehiculo= new JTextAreaMe();
		jTextAreanumero_placaControlVehiculo.setEnabled(false);
		jTextAreanumero_placaControlVehiculo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanumero_placaControlVehiculo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanumero_placaControlVehiculo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanumero_placaControlVehiculo.setLineWrap(true);
		jTextAreanumero_placaControlVehiculo.setWrapStyleWord(true);
		jTextAreanumero_placaControlVehiculo.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanumero_placaControlVehiculo.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanumero_placaControlVehiculo,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenumero_placaControlVehiculo = new JScrollPane(jTextAreanumero_placaControlVehiculo);
		jscrollPanenumero_placaControlVehiculo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenumero_placaControlVehiculo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenumero_placaControlVehiculo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnumero_placaControlVehiculoBusqueda= new JButtonMe();
		this.jButtonnumero_placaControlVehiculoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_placaControlVehiculoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_placaControlVehiculoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_placaControlVehiculoBusqueda.setText("U");
		this.jButtonnumero_placaControlVehiculoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_placaControlVehiculoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_placaControlVehiculoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanumero_placaControlVehiculo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanumero_placaControlVehiculo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_placaControlVehiculoBusqueda"));

		if(this.controlvehiculoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_placaControlVehiculoBusqueda.setVisible(false);		}


					
		this.jLabelfecha_entradaControlVehiculo = new JLabelMe();
		this.jLabelfecha_entradaControlVehiculo.setText(""+ControlVehiculoConstantesFunciones.LABEL_FECHAENTRADA+" : *");
		this.jLabelfecha_entradaControlVehiculo.setToolTipText("Fecha Entrada");
		this.jLabelfecha_entradaControlVehiculo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_entradaControlVehiculo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_entradaControlVehiculo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_entradaControlVehiculo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_entradaControlVehiculo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_entradaControlVehiculo.setToolTipText(ControlVehiculoConstantesFunciones.LABEL_FECHAENTRADA);
		this.gridaBagLayoutControlVehiculo = new GridBagLayout();
		this.jPanelfecha_entradaControlVehiculo.setLayout(this.gridaBagLayoutControlVehiculo);


		//jFormattedTextFieldfecha_entradaControlVehiculo= new JFormattedTextFieldMe();

		jDateChooserfecha_entradaControlVehiculo= new JDateChooser();
		jDateChooserfecha_entradaControlVehiculo.setEnabled(false);
		jDateChooserfecha_entradaControlVehiculo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_entradaControlVehiculo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_entradaControlVehiculo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_entradaControlVehiculo,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_entradaControlVehiculo.setDate(new Date());
		jDateChooserfecha_entradaControlVehiculo.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_entradaControlVehiculo.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_entradaControlVehiculoBusqueda= new JButtonMe();
		this.jButtonfecha_entradaControlVehiculoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_entradaControlVehiculoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_entradaControlVehiculoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_entradaControlVehiculoBusqueda.setText("U");
		this.jButtonfecha_entradaControlVehiculoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_entradaControlVehiculoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_entradaControlVehiculoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_entradaControlVehiculo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_entradaControlVehiculo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_entradaControlVehiculoBusqueda"));

		if(this.controlvehiculoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_entradaControlVehiculoBusqueda.setVisible(false);		}


					
		this.jLabelfecha_salidaControlVehiculo = new JLabelMe();
		this.jLabelfecha_salidaControlVehiculo.setText(""+ControlVehiculoConstantesFunciones.LABEL_FECHASALIDA+" : *");
		this.jLabelfecha_salidaControlVehiculo.setToolTipText("Fecha Salida");
		this.jLabelfecha_salidaControlVehiculo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_salidaControlVehiculo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_salidaControlVehiculo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_salidaControlVehiculo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_salidaControlVehiculo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_salidaControlVehiculo.setToolTipText(ControlVehiculoConstantesFunciones.LABEL_FECHASALIDA);
		this.gridaBagLayoutControlVehiculo = new GridBagLayout();
		this.jPanelfecha_salidaControlVehiculo.setLayout(this.gridaBagLayoutControlVehiculo);


		//jFormattedTextFieldfecha_salidaControlVehiculo= new JFormattedTextFieldMe();

		jDateChooserfecha_salidaControlVehiculo= new JDateChooser();
		jDateChooserfecha_salidaControlVehiculo.setEnabled(false);
		jDateChooserfecha_salidaControlVehiculo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_salidaControlVehiculo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_salidaControlVehiculo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_salidaControlVehiculo,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_salidaControlVehiculo.setDate(new Date());
		jDateChooserfecha_salidaControlVehiculo.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_salidaControlVehiculo.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_salidaControlVehiculoBusqueda= new JButtonMe();
		this.jButtonfecha_salidaControlVehiculoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_salidaControlVehiculoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_salidaControlVehiculoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_salidaControlVehiculoBusqueda.setText("U");
		this.jButtonfecha_salidaControlVehiculoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_salidaControlVehiculoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_salidaControlVehiculoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_salidaControlVehiculo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_salidaControlVehiculo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_salidaControlVehiculoBusqueda"));

		if(this.controlvehiculoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_salidaControlVehiculoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysControlVehiculo() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaControlVehiculo = new JLabelMe();
		this.jLabelid_empresaControlVehiculo.setText(""+ControlVehiculoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaControlVehiculo.setToolTipText("Empresa");
		this.jLabelid_empresaControlVehiculo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaControlVehiculo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaControlVehiculo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaControlVehiculo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaControlVehiculo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaControlVehiculo.setToolTipText(ControlVehiculoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutControlVehiculo = new GridBagLayout();
		this.jPanelid_empresaControlVehiculo.setLayout(this.gridaBagLayoutControlVehiculo);


		jComboBoxid_empresaControlVehiculo= new JComboBoxMe();
		jComboBoxid_empresaControlVehiculo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaControlVehiculo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaControlVehiculo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaControlVehiculo,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaControlVehiculo.setEnabled(false);

		this.jButtonid_empresaControlVehiculo= new JButtonMe();
		this.jButtonid_empresaControlVehiculo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaControlVehiculo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaControlVehiculo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaControlVehiculo.setText("Buscar");
		this.jButtonid_empresaControlVehiculo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaControlVehiculo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaControlVehiculo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaControlVehiculo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaControlVehiculo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaControlVehiculo"));

		this.jButtonid_empresaControlVehiculoBusqueda= new JButtonMe();
		this.jButtonid_empresaControlVehiculoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaControlVehiculoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaControlVehiculoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaControlVehiculoBusqueda.setText("U");
		this.jButtonid_empresaControlVehiculoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaControlVehiculoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaControlVehiculoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaControlVehiculo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaControlVehiculo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaControlVehiculoBusqueda"));

		if(this.controlvehiculoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaControlVehiculoBusqueda.setVisible(false);		}

		this.jButtonid_empresaControlVehiculoUpdate= new JButtonMe();
		this.jButtonid_empresaControlVehiculoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaControlVehiculoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaControlVehiculoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaControlVehiculoUpdate.setText("U");
		this.jButtonid_empresaControlVehiculoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaControlVehiculoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaControlVehiculoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaControlVehiculo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaControlVehiculo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaControlVehiculoUpdate"));



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
		//this.jInternalFrameDetalleControlVehiculo = new ControlVehiculoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Control Vehiculo DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutControlVehiculo= new GridBagLayout();
		

		
		String sToolTipControlVehiculo="";
		sToolTipControlVehiculo=ControlVehiculoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipControlVehiculo+="(Inventario.ControlVehiculo)";
		}
		
		if(!this.controlvehiculoSessionBean.getEsGuardarRelacionado()) {
			sToolTipControlVehiculo+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoControlVehiculo = new JButtonMe();
		this.jButtonModificarControlVehiculo = new JButtonMe();
        this.jButtonActualizarControlVehiculo = new JButtonMe();
        this.jButtonEliminarControlVehiculo = new JButtonMe();
        this.jButtonCancelarControlVehiculo = new JButtonMe();
        this.jButtonGuardarCambiosControlVehiculo = new JButtonMe();
		this.jButtonGuardarCambiosTablaControlVehiculo = new JButtonMe();
		this.jButtonCerrarControlVehiculo = new JButtonMe();
		
		this.jScrollPanelDatosControlVehiculo = new JScrollPane();   
        this.jScrollPanelDatosEdicionControlVehiculo = new JScrollPane();
		this.jScrollPanelDatosGeneralControlVehiculo = new JScrollPane();
				
		
		
		this.jPanelCamposControlVehiculo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosControlVehiculo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesControlVehiculo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioControlVehiculo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Control Vehiculo";
		
		if(!this.controlvehiculoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosControlVehiculo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Control Vehiculoes" + this.sPath));
		} else {
			this.jScrollPanelDatosControlVehiculo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionControlVehiculo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralControlVehiculo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposControlVehiculo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposControlVehiculo.setName("jPanelCamposControlVehiculo"); 

		this.jPanelCamposOcultosControlVehiculo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosControlVehiculo.setName("jPanelCamposOcultosControlVehiculo"); 

        this.jPanelAccionesControlVehiculo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesControlVehiculo.setToolTipText("Acciones");
        this.jPanelAccionesControlVehiculo.setName("Acciones"); 

		this.jPanelAccionesFormularioControlVehiculo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioControlVehiculo.setToolTipText("Acciones");
        this.jPanelAccionesFormularioControlVehiculo.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionControlVehiculo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralControlVehiculo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosControlVehiculo, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposControlVehiculo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosControlVehiculo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioControlVehiculo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoControlVehiculo.setText("Nuevo");
		this.jButtonModificarControlVehiculo.setText("Editar");
        this.jButtonActualizarControlVehiculo.setText("Actualizar");
        this.jButtonEliminarControlVehiculo.setText("Eliminar");
        this.jButtonCancelarControlVehiculo.setText("Cancelar");
        this.jButtonGuardarCambiosControlVehiculo.setText("Guardar");
		this.jButtonGuardarCambiosTablaControlVehiculo.setText("Guardar");
		this.jButtonCerrarControlVehiculo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoControlVehiculo,"nuevo_button","Nuevo",this.controlvehiculoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarControlVehiculo,"modificar_button","Editar",this.controlvehiculoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarControlVehiculo,"actualizar_button","Actualizar",this.controlvehiculoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarControlVehiculo,"eliminar_button","Eliminar",this.controlvehiculoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarControlVehiculo,"cancelar_button","Cancelar",this.controlvehiculoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosControlVehiculo,"guardarcambios_button","Guardar",this.controlvehiculoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaControlVehiculo,"guardarcambiostabla_button","Guardar",this.controlvehiculoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarControlVehiculo,"cerrar_button","Salir",this.controlvehiculoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoControlVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarControlVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosControlVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaControlVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarControlVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarControlVehiculo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarControlVehiculo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarControlVehiculo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoControlVehiculo.setToolTipText("Nuevo"+" "+ControlVehiculoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarControlVehiculo.setToolTipText("Editar"+" "+ControlVehiculoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarControlVehiculo.setToolTipText("Actualizar"+" "+ControlVehiculoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarControlVehiculo.setToolTipText("Eliminar)"+" "+ControlVehiculoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarControlVehiculo.setToolTipText("Cancelar"+" "+ControlVehiculoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosControlVehiculo.setToolTipText("Guardar"+" "+ControlVehiculoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaControlVehiculo.setToolTipText("Guardar"+" "+ControlVehiculoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarControlVehiculo.setToolTipText("Salir"+" "+ControlVehiculoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoControlVehiculo";
		inputMap = this.jButtonNuevoControlVehiculo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoControlVehiculo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoControlVehiculo"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarControlVehiculo";
		inputMap = this.jButtonActualizarControlVehiculo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarControlVehiculo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarControlVehiculo"));
		
		//ELIMINAR
		sMapKey = "EliminarControlVehiculo";
		inputMap = this.jButtonEliminarControlVehiculo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarControlVehiculo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarControlVehiculo"));
		
		//CANCELAR	
		sMapKey = "CancelarControlVehiculo";
		inputMap = this.jButtonCancelarControlVehiculo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarControlVehiculo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarControlVehiculo"));
		
		//CERRAR		
		sMapKey = "CerrarControlVehiculo";
		inputMap = this.jButtonCerrarControlVehiculo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarControlVehiculo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarControlVehiculo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaControlVehiculo";
		inputMap = this.jButtonGuardarCambiosTablaControlVehiculo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaControlVehiculo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaControlVehiculo"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoControlVehiculo = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoControlVehiculo.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoControlVehiculo.setToolTipText("Nuevo ControlVehiculo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoControlVehiculo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarControlVehiculo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarControlVehiculo.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarControlVehiculo.setToolTipText("Sin Cerrar Ventana ControlVehiculo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarControlVehiculo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeControlVehiculo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeControlVehiculo.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeControlVehiculo.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeControlVehiculo, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesControlVehiculo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesControlVehiculo.setText("Accion");
		this.jComboBoxTiposAccionesControlVehiculo.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioControlVehiculo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioControlVehiculo.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioControlVehiculo.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesControlVehiculo = new JLabelMe();
		
		this.jLabelAccionesControlVehiculo.setText("Acciones");		
		this.jLabelAccionesControlVehiculo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesControlVehiculo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesControlVehiculo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposControlVehiculo();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysControlVehiculo();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesControlVehiculo=new JTabbedPane();
		this.jTabbedPaneRelacionesControlVehiculo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesControlVehiculo,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesControlVehiculo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesControlVehiculo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesControlVehiculo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesControlVehiculo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioControlVehiculo.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioControlVehiculo.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioControlVehiculo.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioControlVehiculo, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposControlVehiculo = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosControlVehiculo = new GridBagLayout();
		
		this.jPanelCamposControlVehiculo.setLayout(gridaBagLayoutCamposControlVehiculo);
		this.jPanelCamposOcultosControlVehiculo.setLayout(gridaBagLayoutCamposOcultosControlVehiculo);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
	this.gridBagConstraintsControlVehiculo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsControlVehiculo.gridy = 0;
	this.gridBagConstraintsControlVehiculo.gridx = 0;
	this.gridBagConstraintsControlVehiculo.ipadx = 0;
	this.gridBagConstraintsControlVehiculo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidControlVehiculo.add(jLabelIdControlVehiculo, this.gridBagConstraintsControlVehiculo);



	this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
	this.gridBagConstraintsControlVehiculo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsControlVehiculo.gridy = 0;
	this.gridBagConstraintsControlVehiculo.gridx = 1;
	this.gridBagConstraintsControlVehiculo.ipadx = 0;
	this.gridBagConstraintsControlVehiculo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidControlVehiculo.add(jLabelidControlVehiculo, this.gridBagConstraintsControlVehiculo);


	this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
	this.gridBagConstraintsControlVehiculo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsControlVehiculo.gridy = 0;
	this.gridBagConstraintsControlVehiculo.gridx = 0;
	this.gridBagConstraintsControlVehiculo.ipadx = 0;
	this.gridBagConstraintsControlVehiculo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaControlVehiculo.add(jLabelid_empresaControlVehiculo, this.gridBagConstraintsControlVehiculo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
		//this.gridBagConstraintsControlVehiculo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsControlVehiculo.gridy = 0;
		this.gridBagConstraintsControlVehiculo.gridx = 2;
		this.gridBagConstraintsControlVehiculo.ipadx = 0;
		this.gridBagConstraintsControlVehiculo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaControlVehiculo.add(jButtonid_empresaControlVehiculoBusqueda, this.gridBagConstraintsControlVehiculo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
		//this.gridBagConstraintsControlVehiculo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsControlVehiculo.gridy = 0;
		this.gridBagConstraintsControlVehiculo.gridx = 3;
		this.gridBagConstraintsControlVehiculo.ipadx = 0;
		this.gridBagConstraintsControlVehiculo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaControlVehiculo.add(jButtonid_empresaControlVehiculoUpdate, this.gridBagConstraintsControlVehiculo);
	}

	this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
	this.gridBagConstraintsControlVehiculo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsControlVehiculo.gridy = 0;
	this.gridBagConstraintsControlVehiculo.gridx = 1;
	this.gridBagConstraintsControlVehiculo.ipadx = 0;
	this.gridBagConstraintsControlVehiculo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaControlVehiculo.add(jComboBoxid_empresaControlVehiculo, this.gridBagConstraintsControlVehiculo);


	this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
	this.gridBagConstraintsControlVehiculo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsControlVehiculo.gridy = 0;
	this.gridBagConstraintsControlVehiculo.gridx = 0;
	this.gridBagConstraintsControlVehiculo.ipadx = 0;
	this.gridBagConstraintsControlVehiculo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_conductorControlVehiculo.add(jLabelnombre_conductorControlVehiculo, this.gridBagConstraintsControlVehiculo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
		//this.gridBagConstraintsControlVehiculo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsControlVehiculo.gridy = 0;
		this.gridBagConstraintsControlVehiculo.gridx = 2;
		this.gridBagConstraintsControlVehiculo.ipadx = 0;
		this.gridBagConstraintsControlVehiculo.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_conductorControlVehiculo.add(jButtonnombre_conductorControlVehiculoBusqueda, this.gridBagConstraintsControlVehiculo);
	}

	this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
	this.gridBagConstraintsControlVehiculo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsControlVehiculo.gridy = 0;
	this.gridBagConstraintsControlVehiculo.gridx = 1;
	this.gridBagConstraintsControlVehiculo.ipadx = 0;
	this.gridBagConstraintsControlVehiculo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_conductorControlVehiculo.add(jscrollPanenombre_conductorControlVehiculo, this.gridBagConstraintsControlVehiculo);


	this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
	this.gridBagConstraintsControlVehiculo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsControlVehiculo.gridy = 0;
	this.gridBagConstraintsControlVehiculo.gridx = 0;
	this.gridBagConstraintsControlVehiculo.ipadx = 0;
	this.gridBagConstraintsControlVehiculo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_placaControlVehiculo.add(jLabelnumero_placaControlVehiculo, this.gridBagConstraintsControlVehiculo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
		//this.gridBagConstraintsControlVehiculo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsControlVehiculo.gridy = 0;
		this.gridBagConstraintsControlVehiculo.gridx = 2;
		this.gridBagConstraintsControlVehiculo.ipadx = 0;
		this.gridBagConstraintsControlVehiculo.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_placaControlVehiculo.add(jButtonnumero_placaControlVehiculoBusqueda, this.gridBagConstraintsControlVehiculo);
	}

	this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
	this.gridBagConstraintsControlVehiculo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsControlVehiculo.gridy = 0;
	this.gridBagConstraintsControlVehiculo.gridx = 1;
	this.gridBagConstraintsControlVehiculo.ipadx = 0;
	this.gridBagConstraintsControlVehiculo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_placaControlVehiculo.add(jscrollPanenumero_placaControlVehiculo, this.gridBagConstraintsControlVehiculo);


	this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
	this.gridBagConstraintsControlVehiculo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsControlVehiculo.gridy = 0;
	this.gridBagConstraintsControlVehiculo.gridx = 0;
	this.gridBagConstraintsControlVehiculo.ipadx = 0;
	this.gridBagConstraintsControlVehiculo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_entradaControlVehiculo.add(jLabelfecha_entradaControlVehiculo, this.gridBagConstraintsControlVehiculo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
		//this.gridBagConstraintsControlVehiculo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsControlVehiculo.gridy = 0;
		this.gridBagConstraintsControlVehiculo.gridx = 2;
		this.gridBagConstraintsControlVehiculo.ipadx = 0;
		this.gridBagConstraintsControlVehiculo.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_entradaControlVehiculo.add(jButtonfecha_entradaControlVehiculoBusqueda, this.gridBagConstraintsControlVehiculo);
	}

	this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
	this.gridBagConstraintsControlVehiculo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsControlVehiculo.gridy = 0;
	this.gridBagConstraintsControlVehiculo.gridx = 1;
	this.gridBagConstraintsControlVehiculo.ipadx = 0;
	this.gridBagConstraintsControlVehiculo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_entradaControlVehiculo.add(jDateChooserfecha_entradaControlVehiculo, this.gridBagConstraintsControlVehiculo);


	this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
	this.gridBagConstraintsControlVehiculo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsControlVehiculo.gridy = 0;
	this.gridBagConstraintsControlVehiculo.gridx = 0;
	this.gridBagConstraintsControlVehiculo.ipadx = 0;
	this.gridBagConstraintsControlVehiculo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_salidaControlVehiculo.add(jLabelfecha_salidaControlVehiculo, this.gridBagConstraintsControlVehiculo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
		//this.gridBagConstraintsControlVehiculo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsControlVehiculo.gridy = 0;
		this.gridBagConstraintsControlVehiculo.gridx = 2;
		this.gridBagConstraintsControlVehiculo.ipadx = 0;
		this.gridBagConstraintsControlVehiculo.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_salidaControlVehiculo.add(jButtonfecha_salidaControlVehiculoBusqueda, this.gridBagConstraintsControlVehiculo);
	}

	this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
	this.gridBagConstraintsControlVehiculo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsControlVehiculo.gridy = 0;
	this.gridBagConstraintsControlVehiculo.gridx = 1;
	this.gridBagConstraintsControlVehiculo.ipadx = 0;
	this.gridBagConstraintsControlVehiculo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_salidaControlVehiculo.add(jDateChooserfecha_salidaControlVehiculo, this.gridBagConstraintsControlVehiculo);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
	this.gridBagConstraintsControlVehiculo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsControlVehiculo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsControlVehiculo.gridy = iYPanelCamposControlVehiculo;
	this.gridBagConstraintsControlVehiculo.gridx = iXPanelCamposControlVehiculo++;
	this.gridBagConstraintsControlVehiculo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsControlVehiculo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposControlVehiculo.add(this.jPanelidControlVehiculo, this.gridBagConstraintsControlVehiculo);



	if(iXPanelCamposControlVehiculo % 1==0) {
		iXPanelCamposControlVehiculo=0;
		iYPanelCamposControlVehiculo++;
	}
	this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
	this.gridBagConstraintsControlVehiculo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsControlVehiculo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsControlVehiculo.gridy = iYPanelCamposControlVehiculo;
	this.gridBagConstraintsControlVehiculo.gridx = iXPanelCamposControlVehiculo++;
	this.gridBagConstraintsControlVehiculo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsControlVehiculo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposControlVehiculo.add(this.jPanelnombre_conductorControlVehiculo, this.gridBagConstraintsControlVehiculo);



	if(iXPanelCamposControlVehiculo % 1==0) {
		iXPanelCamposControlVehiculo=0;
		iYPanelCamposControlVehiculo++;
	}
	this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
	this.gridBagConstraintsControlVehiculo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsControlVehiculo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsControlVehiculo.gridy = iYPanelCamposControlVehiculo;
	this.gridBagConstraintsControlVehiculo.gridx = iXPanelCamposControlVehiculo++;
	this.gridBagConstraintsControlVehiculo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsControlVehiculo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposControlVehiculo.add(this.jPanelnumero_placaControlVehiculo, this.gridBagConstraintsControlVehiculo);



	if(iXPanelCamposControlVehiculo % 1==0) {
		iXPanelCamposControlVehiculo=0;
		iYPanelCamposControlVehiculo++;
	}
	this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
	this.gridBagConstraintsControlVehiculo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsControlVehiculo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsControlVehiculo.gridy = iYPanelCamposControlVehiculo;
	this.gridBagConstraintsControlVehiculo.gridx = iXPanelCamposControlVehiculo++;
	this.gridBagConstraintsControlVehiculo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsControlVehiculo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposControlVehiculo.add(this.jPanelfecha_entradaControlVehiculo, this.gridBagConstraintsControlVehiculo);



	if(iXPanelCamposControlVehiculo % 1==0) {
		iXPanelCamposControlVehiculo=0;
		iYPanelCamposControlVehiculo++;
	}
	this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
	this.gridBagConstraintsControlVehiculo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsControlVehiculo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsControlVehiculo.gridy = iYPanelCamposControlVehiculo;
	this.gridBagConstraintsControlVehiculo.gridx = iXPanelCamposControlVehiculo++;
	this.gridBagConstraintsControlVehiculo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsControlVehiculo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposControlVehiculo.add(this.jPanelfecha_salidaControlVehiculo, this.gridBagConstraintsControlVehiculo);



	if(iXPanelCamposControlVehiculo % 1==0) {
		iXPanelCamposControlVehiculo=0;
		iYPanelCamposControlVehiculo++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
	this.gridBagConstraintsControlVehiculo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsControlVehiculo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsControlVehiculo.gridy = iYPanelCamposOcultosControlVehiculo;
	this.gridBagConstraintsControlVehiculo.gridx = iXPanelCamposOcultosControlVehiculo++;
	this.gridBagConstraintsControlVehiculo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsControlVehiculo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosControlVehiculo.add(this.jPanelid_empresaControlVehiculo, this.gridBagConstraintsControlVehiculo);



	if(iXPanelCamposOcultosControlVehiculo % 1==0) {
		iXPanelCamposOcultosControlVehiculo=0;
		iYPanelCamposOcultosControlVehiculo++;
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
			
		GridBagLayout gridaBagLayoutAccionesControlVehiculo= new GridBagLayout();
		this.jPanelAccionesControlVehiculo.setLayout(gridaBagLayoutAccionesControlVehiculo);
		
		GridBagLayout gridaBagLayoutAccionesFormularioControlVehiculo= new GridBagLayout();
		this.jPanelAccionesFormularioControlVehiculo.setLayout(gridaBagLayoutAccionesFormularioControlVehiculo);
		
		this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
		this.gridBagConstraintsControlVehiculo.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsControlVehiculo.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioControlVehiculo.add(this.jComboBoxTiposAccionesFormularioControlVehiculo, this.gridBagConstraintsControlVehiculo);

		this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
		this.gridBagConstraintsControlVehiculo.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsControlVehiculo.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioControlVehiculo.add(this.jCheckBoxPostAccionNuevoControlVehiculo, this.gridBagConstraintsControlVehiculo);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.controlvehiculoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
			this.gridBagConstraintsControlVehiculo.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsControlVehiculo.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioControlVehiculo.add(this.jCheckBoxPostAccionSinCerrarControlVehiculo, this.gridBagConstraintsControlVehiculo);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.controlvehiculoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.controlvehiculoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
			this.gridBagConstraintsControlVehiculo.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsControlVehiculo.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioControlVehiculo.add(this.jCheckBoxPostAccionSinMensajeControlVehiculo, this.gridBagConstraintsControlVehiculo);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
		this.gridBagConstraintsControlVehiculo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsControlVehiculo.gridy = 0;
		this.gridBagConstraintsControlVehiculo.gridx = iPosXAccion++;
			
		this.jPanelAccionesControlVehiculo.add(this.jButtonModificarControlVehiculo, this.gridBagConstraintsControlVehiculo);							

		this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
		this.gridBagConstraintsControlVehiculo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsControlVehiculo.gridy = 0;
		this.gridBagConstraintsControlVehiculo.gridx =iPosXAccion++;
			
		this.jPanelAccionesControlVehiculo.add(this.jButtonEliminarControlVehiculo, this.gridBagConstraintsControlVehiculo);
		
			
		this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
		this.gridBagConstraintsControlVehiculo.gridy = 0;		
		this.gridBagConstraintsControlVehiculo.gridx = iPosXAccion++;
		
		this.jPanelAccionesControlVehiculo.add(this.jButtonActualizarControlVehiculo, this.gridBagConstraintsControlVehiculo);


		this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
		this.gridBagConstraintsControlVehiculo.gridy = 0;		
		this.gridBagConstraintsControlVehiculo.gridx = iPosXAccion++;
		
		this.jPanelAccionesControlVehiculo.add(this.jButtonGuardarCambiosControlVehiculo, this.gridBagConstraintsControlVehiculo);	
		
		this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
		this.gridBagConstraintsControlVehiculo.gridy = 0;		
		this.gridBagConstraintsControlVehiculo.gridx =iPosXAccion++;
		
		this.jPanelAccionesControlVehiculo.add(this.jButtonCancelarControlVehiculo, this.gridBagConstraintsControlVehiculo);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutControlVehiculo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutControlVehiculo);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.controlvehiculoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsControlVehiculo = new GridBagConstraints();						
			this.gridBagConstraintsControlVehiculo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsControlVehiculo.gridx = 0;		
			//this.gridBagConstraintsControlVehiculo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsControlVehiculo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsControlVehiculo.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
		this.gridBagConstraintsControlVehiculo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsControlVehiculo.gridx =0;
		this.gridBagConstraintsControlVehiculo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsControlVehiculo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosControlVehiculo, this.gridBagConstraintsControlVehiculo);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ControlVehiculoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleControlVehiculo = new ControlVehiculoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Control Vehiculo DATOS");
			
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
			
	        //this.setTitle("[FOR] - Control Vehiculo DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Control Vehiculo Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ControlVehiculoModel controlvehiculoModel=new ControlVehiculoModel(this);
			
			//SI USARA CLASE INTERNA
			//ControlVehiculoModel.ControlVehiculoFocusTraversalPolicy controlvehiculoFocusTraversalPolicy = controlvehiculoModel.new ControlVehiculoFocusTraversalPolicy(this);
			
			//controlvehiculoFocusTraversalPolicy.setcontrolvehiculoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(controlvehiculoModel);
			
			
			this.jContentPaneDetalleControlVehiculo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleControlVehiculo = new GridBagLayout();	
			this.jContentPaneDetalleControlVehiculo.setLayout(gridaBagLayoutDetalleControlVehiculo);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosControlVehiculo = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
				this.gridBagConstraintsControlVehiculo.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsControlVehiculo.gridx = 0;
					
				
				this.jContentPaneDetalleControlVehiculo.add(jTtoolBarDetalleControlVehiculo, gridBagConstraintsControlVehiculo);								
				
}
			
			this.jScrollPanelDatosEdicionControlVehiculo=   new JScrollPane(jContentPaneDetalleControlVehiculo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionControlVehiculo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionControlVehiculo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionControlVehiculo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralControlVehiculo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralControlVehiculo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralControlVehiculo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralControlVehiculo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
			
			
	        this.gridBagConstraintsControlVehiculo.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsControlVehiculo.gridx = 0;
	        
			this.jContentPaneDetalleControlVehiculo.add(jPanelCamposControlVehiculo, gridBagConstraintsControlVehiculo);
			
			
			
			
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
						&& controlvehiculoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.controlvehiculoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsControlVehiculo= new GridBagConstraints();
						this.gridBagConstraintsControlVehiculo.gridy = iGridyRelaciones++;
						this.gridBagConstraintsControlVehiculo.gridx = 0;
						this.jContentPaneDetalleControlVehiculo.add(this.jTabbedPaneRelacionesControlVehiculo, this.gridBagConstraintsControlVehiculo);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesControlVehiculo.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosControlVehiculo.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
					this.gridBagConstraintsControlVehiculo.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsControlVehiculo.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsControlVehiculo.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsControlVehiculo.gridx = 0;
					
				
					this.jContentPaneDetalleControlVehiculo.add(jPanelCamposOcultosControlVehiculo, gridBagConstraintsControlVehiculo);
				
					this.jPanelCamposOcultosControlVehiculo.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
			this.gridBagConstraintsControlVehiculo.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsControlVehiculo.gridx = 0;
	        this.gridBagConstraintsControlVehiculo.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleControlVehiculo.add(this.jPanelAccionesFormularioControlVehiculo, this.gridBagConstraintsControlVehiculo);							
			
			
			
			this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
	        this.gridBagConstraintsControlVehiculo.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsControlVehiculo.gridx = 0;
	        
			
			this.jContentPaneDetalleControlVehiculo.add(this.jPanelAccionesControlVehiculo, this.gridBagConstraintsControlVehiculo);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionControlVehiculo);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionControlVehiculo=   new JScrollPane(this.jPanelCamposControlVehiculo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionControlVehiculo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionControlVehiculo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionControlVehiculo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
			this.gridBagConstraintsControlVehiculo.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsControlVehiculo.gridx = 0;
			this.gridBagConstraintsControlVehiculo.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsControlVehiculo.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsControlVehiculo.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionControlVehiculo, this.gridBagConstraintsControlVehiculo);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
			this.gridBagConstraintsControlVehiculo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsControlVehiculo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioControlVehiculo, this.gridBagConstraintsControlVehiculo);			
			
			this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
			this.gridBagConstraintsControlVehiculo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsControlVehiculo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesControlVehiculo, this.gridBagConstraintsControlVehiculo);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
		this.gridBagConstraintsControlVehiculo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsControlVehiculo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposControlVehiculo, this.gridBagConstraintsControlVehiculo);
			
			
		this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
		this.gridBagConstraintsControlVehiculo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsControlVehiculo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosControlVehiculo, this.gridBagConstraintsControlVehiculo);
		
			
		this.gridBagConstraintsControlVehiculo = new GridBagConstraints();
		this.gridBagConstraintsControlVehiculo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsControlVehiculo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesControlVehiculo, this.gridBagConstraintsControlVehiculo);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralControlVehiculo;//jContentPane;
		
		return jScrollPanelDatosEdicionControlVehiculo;
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
