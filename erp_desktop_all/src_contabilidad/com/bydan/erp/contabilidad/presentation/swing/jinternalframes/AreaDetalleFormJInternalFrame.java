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
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.contabilidad.util.AreaConstantesFunciones;

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
public class AreaDetalleFormJInternalFrame extends AreaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleArea;
	
	protected JMenuBar jmenuBarDetalleArea;
	
	protected JMenu jmenuDetalleArea;
	protected JMenu jmenuDetalleArchivoArea;
	protected JMenu jmenuDetalleAccionesArea;
	protected JMenu jmenuDetalleDatosArea;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleArea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutArea;	
	protected GridBagConstraints gridBagConstraintsArea;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected AreaBeanSwingJInternalFrameAdditional jInternalFrameDetalleArea;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected EmpleadoBeanSwingJInternalFrame empleadosustitutoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleadosustituto="";
	
	public AreaSessionBean areaSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public EmpleadoSessionBean empleadosustitutoSessionBean;	
	
	public AreaLogic areaLogic;
	
	public JScrollPane jScrollPanelDatosArea;
	public JScrollPane jScrollPanelDatosEdicionArea;
	public JScrollPane jScrollPanelDatosGeneralArea;
	
	protected JPanel jPanelCamposArea;    
	protected JPanel jPanelCamposOcultosArea;    	
	protected JPanel jPanelAccionesArea;
	protected JPanel jPanelAccionesFormularioArea;
    
	
	
	protected Integer iXPanelCamposArea=0;
	protected Integer iYPanelCamposArea=0;
	
	protected Integer iXPanelCamposOcultosArea=0;
	protected Integer iYPanelCamposOcultosArea=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoArea;
	public JButton jButtonModificarArea;
	public JButton jButtonActualizarArea;
    public JButton jButtonEliminarArea;
	public JButton jButtonCancelarArea;
    public JButton jButtonGuardarCambiosArea;
	public JButton jButtonGuardarCambiosTablaArea;
	protected JButton jButtonCerrarArea;
	
	
	protected JButton jButtonProcesarInformacionArea;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoArea;
	protected JCheckBox jCheckBoxPostAccionSinCerrarArea;
	protected JCheckBox jCheckBoxPostAccionSinMensajeArea;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarArea;
	protected JButton jButtonModificarToolBarArea;
	protected JButton jButtonActualizarToolBarArea;
    protected JButton jButtonEliminarToolBarArea;
	protected JButton jButtonCancelarToolBarArea;
    protected JButton jButtonGuardarCambiosToolBarArea;
	protected JButton jButtonGuardarCambiosTablaToolBarArea;
	protected JButton jButtonMostrarOcultarTablaToolBarArea;
	protected JButton jButtonCerrarToolBarArea;
	
	protected JButton jButtonProcesarInformacionToolBarArea;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoArea;
	protected JMenuItem jMenuItemModificarArea;
	protected JMenuItem jMenuItemActualizarArea;
    protected JMenuItem jMenuItemEliminarArea;
	protected JMenuItem jMenuItemCancelarArea;
    protected JMenuItem jMenuItemGuardarCambiosArea;
	protected JMenuItem jMenuItemGuardarCambiosTablaArea;
	protected JMenuItem jMenuItemCerrarArea;
	protected JMenuItem jMenuItemDetalleCerrarArea;
	protected JMenuItem jMenuItemDetalleMostarOcultarArea;
	
	protected JMenuItem jMenuItemProcesarInformacionArea;
	protected JMenuItem jMenuItemNuevoGuardarCambiosArea;
	protected JMenuItem jMenuItemMostrarOcultarArea;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesArea;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesArea;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesArea;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioArea;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidArea;
	public JLabel jLabelIdArea;
	public JLabel jLabelidArea;
	public JButton jButtonidAreaBusqueda= new JButtonMe();

	public JPanel jPanelcodigoArea;
	public JLabel jLabelcodigoArea;
	public JTextField jTextFieldcodigoArea;
	public JButton jButtoncodigoAreaBusqueda= new JButtonMe();

	public JPanel jPanelnombreArea;
	public JLabel jLabelnombreArea;
	public JTextArea jTextAreanombreArea;
	public JScrollPane jscrollPanenombreArea;
	public JButton jButtonnombreAreaBusqueda= new JButtonMe();

	public JPanel jPanelsecuencial_pedidoArea;
	public JLabel jLabelsecuencial_pedidoArea;
	public JTextField jTextFieldsecuencial_pedidoArea;
	public JButton jButtonsecuencial_pedidoAreaBusqueda= new JButtonMe();

	public JPanel jPanelsecuencial_cotizacionArea;
	public JLabel jLabelsecuencial_cotizacionArea;
	public JTextField jTextFieldsecuencial_cotizacionArea;
	public JButton jButtonsecuencial_cotizacionAreaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaArea;
	public JLabel jLabelid_empresaArea;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaArea;
	public JButton jButtonid_empresaArea= new JButtonMe();
	public JButton jButtonid_empresaAreaUpdate= new JButtonMe();
	public JButton jButtonid_empresaAreaBusqueda= new JButtonMe();

	public JPanel jPanelid_empleadoArea;
	public JLabel jLabelid_empleadoArea;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoArea;
	public JButton jButtonid_empleadoArea= new JButtonMe();
	public JButton jButtonid_empleadoAreaUpdate= new JButtonMe();
	public JButton jButtonid_empleadoAreaBusqueda= new JButtonMe();

	public JPanel jPanelid_empleado_sustitutoArea;
	public JLabel jLabelid_empleado_sustitutoArea;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleado_sustitutoArea;
	public JButton jButtonid_empleado_sustitutoArea= new JButtonMe();
	public JButton jButtonid_empleado_sustitutoAreaUpdate= new JButtonMe();
	public JButton jButtonid_empleado_sustitutoAreaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesArea;
	
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
	public int iHeightFormulario=770;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public AreaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposArea=new JPanel();
				this.jPanelAccionesFormularioArea=new JPanel();
				this.jmenuBarDetalleArea=new JMenuBar();
				this.jTtoolBarDetalleArea=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AreaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Area No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public AreaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Area No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AreaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Area No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AreaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Area No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AreaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Area No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarArea() {
		return this.jButtonActualizarToolBarArea;
	}
	
	public JButton getjButtonEliminarToolBarArea() {
		return this.jButtonEliminarToolBarArea;
	}
	
	public JButton getjButtonCancelarToolBarArea() {
		return this.jButtonCancelarToolBarArea;
	}		
	
	public JButton getjButtonProcesarInformacionArea() {
		return this.jButtonProcesarInformacionArea;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionArea)	{
		this.jButtonProcesarInformacionArea = jButtonProcesarInformacionArea;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesArea() {
		return this.jComboBoxTiposAccionesArea;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesArea(
			JComboBox jComboBoxTiposRelacionesArea) {
		this.jComboBoxTiposRelacionesArea = jComboBoxTiposRelacionesArea;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesArea(
			JComboBox jComboBoxTiposAccionesArea) {
		this.jComboBoxTiposAccionesArea = jComboBoxTiposAccionesArea;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioArea() {
		return this.jComboBoxTiposAccionesFormularioArea;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioArea(
			JComboBox jComboBoxTiposAccionesFormularioArea) {
		this.jComboBoxTiposAccionesFormularioArea = jComboBoxTiposAccionesFormularioArea;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.areaSessionBean=new AreaSessionBean();
		
		this.areaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.areaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.areaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		AreaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		AreaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		AreaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Area MANTENIMIENTO"));
		
		
		if(iWidth > 850) {
			iWidth=850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.areaSessionBean.getEsGuardarRelacionado()) {
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
	
		AreaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleArea= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarArea=new JButtonMe();
				this.jButtonModificarToolBarArea=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarArea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarArea,this.jTtoolBarDetalleArea,
							"actualizar","actualizar","Actualizar"+" "+AreaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarArea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarArea,this.jTtoolBarDetalleArea,
							"eliminar","eliminar","Eliminar"+" "+AreaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarArea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarArea,this.jTtoolBarDetalleArea,
							"cancelar","cancelar","Cancelar"+" "+AreaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarArea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarArea,this.jTtoolBarDetalleArea,
							"guardarcambios","guardarcambios","Guardar"+" "+AreaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarArea,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarArea,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarArea,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleArea=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleArea=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoArea=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesArea=new JMenuMe("Acciones");
		this.jmenuDetalleDatosArea=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoArea= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoArea.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoArea,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoArea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarArea= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarArea.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarArea,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarArea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarArea= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarArea.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarArea,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarArea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarArea= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarArea.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarArea,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarArea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarArea= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarArea.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarArea,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarArea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosArea= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosArea.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosArea,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosArea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarArea= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarArea.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarArea,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarArea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarArea= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarArea.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarArea,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarArea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarArea= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarArea.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarArea,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarArea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarArea= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarArea.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarArea,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarArea, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoArea.add(this.jMenuItemDetalleCerrarArea);
		
		this.jmenuDetalleAccionesArea.add(this.jMenuItemActualizarArea);
		this.jmenuDetalleAccionesArea.add(this.jMenuItemEliminarArea);
		this.jmenuDetalleAccionesArea.add(this.jMenuItemCancelarArea);		
		
		//this.jmenuDetalleDatosArea.add(this.jMenuItemDetalleAbrirOrderByArea);				
		this.jmenuDetalleDatosArea.add(this.jMenuItemDetalleMostarOcultarArea);				
				
		//this.jmenuDetalleAccionesArea.add(this.jMenuItemGuardarCambiosArea);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoArea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesArea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosArea, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleArea.add(this.jmenuDetalleArchivoArea);		
		this.jmenuBarDetalleArea.add(this.jmenuDetalleAccionesArea);		
		this.jmenuBarDetalleArea.add(this.jmenuDetalleDatosArea);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleArea);				
	}
	
	
	public void inicializarElementosCamposArea() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdArea = new JLabelMe();
		jLabelIdArea.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdArea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdArea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdArea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdArea,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidArea = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidArea.setToolTipText(AreaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutArea= new GridBagLayout();

		this.jPanelidArea.setLayout(this.gridaBagLayoutArea);

		jLabelidArea = new JLabel();
		jLabelidArea.setText("Id");

		jLabelidArea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidArea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidArea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoArea = new JLabelMe();
		this.jLabelcodigoArea.setText(""+AreaConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoArea.setToolTipText("Codigo");
		this.jLabelcodigoArea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoArea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoArea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoArea,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoArea=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoArea.setToolTipText(AreaConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutArea = new GridBagLayout();
		this.jPanelcodigoArea.setLayout(this.gridaBagLayoutArea);


		jTextFieldcodigoArea= new JTextFieldMe();

		jTextFieldcodigoArea.setEnabled(false);
		jTextFieldcodigoArea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoArea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoArea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoArea,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoAreaBusqueda= new JButtonMe();
		this.jButtoncodigoAreaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoAreaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoAreaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoAreaBusqueda.setText("U");
		this.jButtoncodigoAreaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoAreaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoAreaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoArea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoArea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoAreaBusqueda"));

		if(this.areaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoAreaBusqueda.setVisible(false);		}


					
		this.jLabelnombreArea = new JLabelMe();
		this.jLabelnombreArea.setText(""+AreaConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreArea.setToolTipText("Nombre");
		this.jLabelnombreArea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreArea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreArea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreArea,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreArea=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreArea.setToolTipText(AreaConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutArea = new GridBagLayout();
		this.jPanelnombreArea.setLayout(this.gridaBagLayoutArea);


		jTextAreanombreArea= new JTextAreaMe();
		jTextAreanombreArea.setEnabled(false);
		jTextAreanombreArea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreArea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreArea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreArea.setLineWrap(true);
		jTextAreanombreArea.setWrapStyleWord(true);
		jTextAreanombreArea.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreArea.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreArea,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreArea = new JScrollPane(jTextAreanombreArea);
		jscrollPanenombreArea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreArea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreArea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreAreaBusqueda= new JButtonMe();
		this.jButtonnombreAreaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreAreaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreAreaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreAreaBusqueda.setText("U");
		this.jButtonnombreAreaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreAreaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreAreaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreArea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreArea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreAreaBusqueda"));

		if(this.areaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreAreaBusqueda.setVisible(false);		}


					
		this.jLabelsecuencial_pedidoArea = new JLabelMe();
		this.jLabelsecuencial_pedidoArea.setText(""+AreaConstantesFunciones.LABEL_SECUENCIALPEDIDO+" : *");
		this.jLabelsecuencial_pedidoArea.setToolTipText("Secuencial Pedido");
		this.jLabelsecuencial_pedidoArea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelsecuencial_pedidoArea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelsecuencial_pedidoArea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelsecuencial_pedidoArea,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsecuencial_pedidoArea=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsecuencial_pedidoArea.setToolTipText(AreaConstantesFunciones.LABEL_SECUENCIALPEDIDO);
		this.gridaBagLayoutArea = new GridBagLayout();
		this.jPanelsecuencial_pedidoArea.setLayout(this.gridaBagLayoutArea);


		jTextFieldsecuencial_pedidoArea= new JTextFieldMe();

		jTextFieldsecuencial_pedidoArea.setEnabled(false);
		jTextFieldsecuencial_pedidoArea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuencial_pedidoArea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuencial_pedidoArea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsecuencial_pedidoArea,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonsecuencial_pedidoAreaBusqueda= new JButtonMe();
		this.jButtonsecuencial_pedidoAreaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuencial_pedidoAreaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuencial_pedidoAreaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsecuencial_pedidoAreaBusqueda.setText("U");
		this.jButtonsecuencial_pedidoAreaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsecuencial_pedidoAreaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsecuencial_pedidoAreaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsecuencial_pedidoArea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsecuencial_pedidoArea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"secuencial_pedidoAreaBusqueda"));

		if(this.areaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsecuencial_pedidoAreaBusqueda.setVisible(false);		}


					
		this.jLabelsecuencial_cotizacionArea = new JLabelMe();
		this.jLabelsecuencial_cotizacionArea.setText(""+AreaConstantesFunciones.LABEL_SECUENCIALCOTIZACION+" : *");
		this.jLabelsecuencial_cotizacionArea.setToolTipText("Secuencial Cotizacion");
		this.jLabelsecuencial_cotizacionArea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelsecuencial_cotizacionArea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelsecuencial_cotizacionArea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelsecuencial_cotizacionArea,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsecuencial_cotizacionArea=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsecuencial_cotizacionArea.setToolTipText(AreaConstantesFunciones.LABEL_SECUENCIALCOTIZACION);
		this.gridaBagLayoutArea = new GridBagLayout();
		this.jPanelsecuencial_cotizacionArea.setLayout(this.gridaBagLayoutArea);


		jTextFieldsecuencial_cotizacionArea= new JTextFieldMe();

		jTextFieldsecuencial_cotizacionArea.setEnabled(false);
		jTextFieldsecuencial_cotizacionArea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuencial_cotizacionArea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuencial_cotizacionArea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsecuencial_cotizacionArea,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonsecuencial_cotizacionAreaBusqueda= new JButtonMe();
		this.jButtonsecuencial_cotizacionAreaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuencial_cotizacionAreaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuencial_cotizacionAreaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsecuencial_cotizacionAreaBusqueda.setText("U");
		this.jButtonsecuencial_cotizacionAreaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsecuencial_cotizacionAreaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsecuencial_cotizacionAreaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsecuencial_cotizacionArea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsecuencial_cotizacionArea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"secuencial_cotizacionAreaBusqueda"));

		if(this.areaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsecuencial_cotizacionAreaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysArea() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaArea = new JLabelMe();
		this.jLabelid_empresaArea.setText(""+AreaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaArea.setToolTipText("Empresa");
		this.jLabelid_empresaArea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaArea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaArea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaArea,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaArea=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaArea.setToolTipText(AreaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutArea = new GridBagLayout();
		this.jPanelid_empresaArea.setLayout(this.gridaBagLayoutArea);


		jComboBoxid_empresaArea= new JComboBoxMe();
		jComboBoxid_empresaArea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaArea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaArea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaArea,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaArea.setEnabled(false);

		this.jButtonid_empresaArea= new JButtonMe();
		this.jButtonid_empresaArea.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaArea.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaArea.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaArea.setText("Buscar");
		this.jButtonid_empresaArea.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaArea.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaArea,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaArea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaArea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaArea"));

		this.jButtonid_empresaAreaBusqueda= new JButtonMe();
		this.jButtonid_empresaAreaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaAreaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaAreaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaAreaBusqueda.setText("U");
		this.jButtonid_empresaAreaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaAreaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaAreaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaArea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaArea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaAreaBusqueda"));

		if(this.areaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaAreaBusqueda.setVisible(false);		}

		this.jButtonid_empresaAreaUpdate= new JButtonMe();
		this.jButtonid_empresaAreaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaAreaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaAreaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaAreaUpdate.setText("U");
		this.jButtonid_empresaAreaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaAreaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaAreaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaArea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaArea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaAreaUpdate"));



					
		this.jLabelid_empleadoArea = new JLabelMe();
		this.jLabelid_empleadoArea.setText(""+AreaConstantesFunciones.LABEL_IDEMPLEADO+" : *");
		this.jLabelid_empleadoArea.setToolTipText("Empleado");
		this.jLabelid_empleadoArea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoArea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoArea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoArea,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empleadoArea=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empleadoArea.setToolTipText(AreaConstantesFunciones.LABEL_IDEMPLEADO);
		this.gridaBagLayoutArea = new GridBagLayout();
		this.jPanelid_empleadoArea.setLayout(this.gridaBagLayoutArea);


		jComboBoxid_empleadoArea= new JComboBoxMe();
		jComboBoxid_empleadoArea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoArea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoArea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoArea,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empleadoArea= new JButtonMe();
		this.jButtonid_empleadoArea.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoArea.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoArea.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoArea.setText("Buscar");
		this.jButtonid_empleadoArea.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empleadoArea.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoArea,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empleadoArea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoArea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoArea"));

		this.jButtonid_empleadoAreaBusqueda= new JButtonMe();
		this.jButtonid_empleadoAreaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoAreaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoAreaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoAreaBusqueda.setText("U");
		this.jButtonid_empleadoAreaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empleadoAreaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoAreaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empleadoArea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoArea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoAreaBusqueda"));

		if(this.areaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empleadoAreaBusqueda.setVisible(false);		}

		this.jButtonid_empleadoAreaUpdate= new JButtonMe();
		this.jButtonid_empleadoAreaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoAreaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoAreaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoAreaUpdate.setText("U");
		this.jButtonid_empleadoAreaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empleadoAreaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoAreaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empleadoArea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoArea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoAreaUpdate"));



					
		this.jLabelid_empleado_sustitutoArea = new JLabelMe();
		this.jLabelid_empleado_sustitutoArea.setText(""+AreaConstantesFunciones.LABEL_IDEMPLEADOSUSTITUTO+" : *");
		this.jLabelid_empleado_sustitutoArea.setToolTipText("Empleado Sustituto");
		this.jLabelid_empleado_sustitutoArea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_empleado_sustitutoArea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_empleado_sustitutoArea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empleado_sustitutoArea,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empleado_sustitutoArea=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empleado_sustitutoArea.setToolTipText(AreaConstantesFunciones.LABEL_IDEMPLEADOSUSTITUTO);
		this.gridaBagLayoutArea = new GridBagLayout();
		this.jPanelid_empleado_sustitutoArea.setLayout(this.gridaBagLayoutArea);


		jComboBoxid_empleado_sustitutoArea= new JComboBoxMe();
		jComboBoxid_empleado_sustitutoArea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleado_sustitutoArea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleado_sustitutoArea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleado_sustitutoArea,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empleado_sustitutoArea= new JButtonMe();
		this.jButtonid_empleado_sustitutoArea.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleado_sustitutoArea.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleado_sustitutoArea.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleado_sustitutoArea.setText("Buscar");
		this.jButtonid_empleado_sustitutoArea.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empleado_sustitutoArea.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleado_sustitutoArea,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empleado_sustitutoArea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleado_sustitutoArea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleado_sustitutoArea"));

		this.jButtonid_empleado_sustitutoAreaBusqueda= new JButtonMe();
		this.jButtonid_empleado_sustitutoAreaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleado_sustitutoAreaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleado_sustitutoAreaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleado_sustitutoAreaBusqueda.setText("U");
		this.jButtonid_empleado_sustitutoAreaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empleado_sustitutoAreaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleado_sustitutoAreaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empleado_sustitutoArea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleado_sustitutoArea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleado_sustitutoAreaBusqueda"));

		if(this.areaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empleado_sustitutoAreaBusqueda.setVisible(false);		}

		this.jButtonid_empleado_sustitutoAreaUpdate= new JButtonMe();
		this.jButtonid_empleado_sustitutoAreaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleado_sustitutoAreaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleado_sustitutoAreaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleado_sustitutoAreaUpdate.setText("U");
		this.jButtonid_empleado_sustitutoAreaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empleado_sustitutoAreaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleado_sustitutoAreaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empleado_sustitutoArea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleado_sustitutoArea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleado_sustitutoAreaUpdate"));



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
		//this.jInternalFrameDetalleArea = new AreaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Area DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutArea= new GridBagLayout();
		

		
		String sToolTipArea="";
		sToolTipArea=AreaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipArea+="(Contabilidad.Area)";
		}
		
		if(!this.areaSessionBean.getEsGuardarRelacionado()) {
			sToolTipArea+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoArea = new JButtonMe();
		this.jButtonModificarArea = new JButtonMe();
        this.jButtonActualizarArea = new JButtonMe();
        this.jButtonEliminarArea = new JButtonMe();
        this.jButtonCancelarArea = new JButtonMe();
        this.jButtonGuardarCambiosArea = new JButtonMe();
		this.jButtonGuardarCambiosTablaArea = new JButtonMe();
		this.jButtonCerrarArea = new JButtonMe();
		
		this.jScrollPanelDatosArea = new JScrollPane();   
        this.jScrollPanelDatosEdicionArea = new JScrollPane();
		this.jScrollPanelDatosGeneralArea = new JScrollPane();
				
		
		
		this.jPanelCamposArea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosArea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesArea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioArea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Area";
		
		if(!this.areaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosArea.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Areas" + this.sPath));
		} else {
			this.jScrollPanelDatosArea.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionArea.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralArea.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposArea.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposArea.setName("jPanelCamposArea"); 

		this.jPanelCamposOcultosArea.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosArea.setName("jPanelCamposOcultosArea"); 

        this.jPanelAccionesArea.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesArea.setToolTipText("Acciones");
        this.jPanelAccionesArea.setName("Acciones"); 

		this.jPanelAccionesFormularioArea.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioArea.setToolTipText("Acciones");
        this.jPanelAccionesFormularioArea.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionArea, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralArea, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosArea, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposArea, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosArea, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioArea, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoArea.setText("Nuevo");
		this.jButtonModificarArea.setText("Editar");
        this.jButtonActualizarArea.setText("Actualizar");
        this.jButtonEliminarArea.setText("Eliminar");
        this.jButtonCancelarArea.setText("Cancelar");
        this.jButtonGuardarCambiosArea.setText("Guardar");
		this.jButtonGuardarCambiosTablaArea.setText("Guardar");
		this.jButtonCerrarArea.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoArea,"nuevo_button","Nuevo",this.areaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarArea,"modificar_button","Editar",this.areaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarArea,"actualizar_button","Actualizar",this.areaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarArea,"eliminar_button","Eliminar",this.areaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarArea,"cancelar_button","Cancelar",this.areaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosArea,"guardarcambios_button","Guardar",this.areaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaArea,"guardarcambiostabla_button","Guardar",this.areaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarArea,"cerrar_button","Salir",this.areaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoArea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarArea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosArea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaArea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarArea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarArea, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarArea, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarArea, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoArea.setToolTipText("Nuevo"+" "+AreaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarArea.setToolTipText("Editar"+" "+AreaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarArea.setToolTipText("Actualizar"+" "+AreaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarArea.setToolTipText("Eliminar)"+" "+AreaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarArea.setToolTipText("Cancelar"+" "+AreaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosArea.setToolTipText("Guardar"+" "+AreaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaArea.setToolTipText("Guardar"+" "+AreaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarArea.setToolTipText("Salir"+" "+AreaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoArea";
		inputMap = this.jButtonNuevoArea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoArea.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoArea"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarArea";
		inputMap = this.jButtonActualizarArea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarArea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarArea"));
		
		//ELIMINAR
		sMapKey = "EliminarArea";
		inputMap = this.jButtonEliminarArea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarArea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarArea"));
		
		//CANCELAR	
		sMapKey = "CancelarArea";
		inputMap = this.jButtonCancelarArea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarArea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarArea"));
		
		//CERRAR		
		sMapKey = "CerrarArea";
		inputMap = this.jButtonCerrarArea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarArea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarArea"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaArea";
		inputMap = this.jButtonGuardarCambiosTablaArea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaArea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaArea"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoArea = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoArea.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoArea.setToolTipText("Nuevo Area");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoArea, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarArea = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarArea.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarArea.setToolTipText("Sin Cerrar Ventana Area");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarArea, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeArea = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeArea.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeArea.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeArea, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesArea = new JComboBoxMe();
		//this.jComboBoxTiposAccionesArea.setText("Accion");
		this.jComboBoxTiposAccionesArea.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioArea = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioArea.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioArea.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesArea = new JLabelMe();
		
		this.jLabelAccionesArea.setText("Acciones");		
		this.jLabelAccionesArea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesArea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesArea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposArea();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysArea();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesArea=new JTabbedPane();
		this.jTabbedPaneRelacionesArea.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesArea,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesArea.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesArea.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesArea.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesArea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioArea.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioArea.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioArea.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioArea, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposArea = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosArea = new GridBagLayout();
		
		this.jPanelCamposArea.setLayout(gridaBagLayoutCamposArea);
		this.jPanelCamposOcultosArea.setLayout(gridaBagLayoutCamposOcultosArea);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsArea = new GridBagConstraints();
	this.gridBagConstraintsArea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsArea.gridy = 0;
	this.gridBagConstraintsArea.gridx = 0;
	this.gridBagConstraintsArea.ipadx = 0;
	this.gridBagConstraintsArea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidArea.add(jLabelIdArea, this.gridBagConstraintsArea);



	this.gridBagConstraintsArea = new GridBagConstraints();
	this.gridBagConstraintsArea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsArea.gridy = 0;
	this.gridBagConstraintsArea.gridx = 1;
	this.gridBagConstraintsArea.ipadx = 0;
	this.gridBagConstraintsArea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidArea.add(jLabelidArea, this.gridBagConstraintsArea);


	this.gridBagConstraintsArea = new GridBagConstraints();
	this.gridBagConstraintsArea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsArea.gridy = 0;
	this.gridBagConstraintsArea.gridx = 0;
	this.gridBagConstraintsArea.ipadx = 0;
	this.gridBagConstraintsArea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaArea.add(jLabelid_empresaArea, this.gridBagConstraintsArea);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsArea = new GridBagConstraints();
		//this.gridBagConstraintsArea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsArea.gridy = 0;
		this.gridBagConstraintsArea.gridx = 2;
		this.gridBagConstraintsArea.ipadx = 0;
		this.gridBagConstraintsArea.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaArea.add(jButtonid_empresaAreaBusqueda, this.gridBagConstraintsArea);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsArea = new GridBagConstraints();
		//this.gridBagConstraintsArea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsArea.gridy = 0;
		this.gridBagConstraintsArea.gridx = 3;
		this.gridBagConstraintsArea.ipadx = 0;
		this.gridBagConstraintsArea.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaArea.add(jButtonid_empresaAreaUpdate, this.gridBagConstraintsArea);
	}

	this.gridBagConstraintsArea = new GridBagConstraints();
	this.gridBagConstraintsArea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsArea.gridy = 0;
	this.gridBagConstraintsArea.gridx = 1;
	this.gridBagConstraintsArea.ipadx = 0;
	this.gridBagConstraintsArea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaArea.add(jComboBoxid_empresaArea, this.gridBagConstraintsArea);


	this.gridBagConstraintsArea = new GridBagConstraints();
	this.gridBagConstraintsArea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsArea.gridy = 0;
	this.gridBagConstraintsArea.gridx = 0;
	this.gridBagConstraintsArea.ipadx = 0;
	this.gridBagConstraintsArea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empleadoArea.add(jLabelid_empleadoArea, this.gridBagConstraintsArea);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsArea = new GridBagConstraints();
	//this.gridBagConstraintsArea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsArea.gridy = 0;
	this.gridBagConstraintsArea.gridx = 2;
	this.gridBagConstraintsArea.ipadx = 0;
	this.gridBagConstraintsArea.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_empleadoArea.add(jButtonid_empleadoArea, this.gridBagConstraintsArea);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsArea = new GridBagConstraints();
		//this.gridBagConstraintsArea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsArea.gridy = 0;
		this.gridBagConstraintsArea.gridx = 3;
		this.gridBagConstraintsArea.ipadx = 0;
		this.gridBagConstraintsArea.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoArea.add(jButtonid_empleadoAreaBusqueda, this.gridBagConstraintsArea);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsArea = new GridBagConstraints();
		//this.gridBagConstraintsArea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsArea.gridy = 0;
		this.gridBagConstraintsArea.gridx = 4;
		this.gridBagConstraintsArea.ipadx = 0;
		this.gridBagConstraintsArea.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoArea.add(jButtonid_empleadoAreaUpdate, this.gridBagConstraintsArea);
	}

	this.gridBagConstraintsArea = new GridBagConstraints();
	this.gridBagConstraintsArea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsArea.gridy = 0;
	this.gridBagConstraintsArea.gridx = 1;
	this.gridBagConstraintsArea.ipadx = 0;
	this.gridBagConstraintsArea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empleadoArea.add(jComboBoxid_empleadoArea, this.gridBagConstraintsArea);


	this.gridBagConstraintsArea = new GridBagConstraints();
	this.gridBagConstraintsArea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsArea.gridy = 0;
	this.gridBagConstraintsArea.gridx = 0;
	this.gridBagConstraintsArea.ipadx = 0;
	this.gridBagConstraintsArea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empleado_sustitutoArea.add(jLabelid_empleado_sustitutoArea, this.gridBagConstraintsArea);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsArea = new GridBagConstraints();
	//this.gridBagConstraintsArea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsArea.gridy = 0;
	this.gridBagConstraintsArea.gridx = 2;
	this.gridBagConstraintsArea.ipadx = 0;
	this.gridBagConstraintsArea.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_empleado_sustitutoArea.add(jButtonid_empleado_sustitutoArea, this.gridBagConstraintsArea);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsArea = new GridBagConstraints();
		//this.gridBagConstraintsArea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsArea.gridy = 0;
		this.gridBagConstraintsArea.gridx = 3;
		this.gridBagConstraintsArea.ipadx = 0;
		this.gridBagConstraintsArea.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleado_sustitutoArea.add(jButtonid_empleado_sustitutoAreaBusqueda, this.gridBagConstraintsArea);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsArea = new GridBagConstraints();
		//this.gridBagConstraintsArea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsArea.gridy = 0;
		this.gridBagConstraintsArea.gridx = 4;
		this.gridBagConstraintsArea.ipadx = 0;
		this.gridBagConstraintsArea.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleado_sustitutoArea.add(jButtonid_empleado_sustitutoAreaUpdate, this.gridBagConstraintsArea);
	}

	this.gridBagConstraintsArea = new GridBagConstraints();
	this.gridBagConstraintsArea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsArea.gridy = 0;
	this.gridBagConstraintsArea.gridx = 1;
	this.gridBagConstraintsArea.ipadx = 0;
	this.gridBagConstraintsArea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empleado_sustitutoArea.add(jComboBoxid_empleado_sustitutoArea, this.gridBagConstraintsArea);


	this.gridBagConstraintsArea = new GridBagConstraints();
	this.gridBagConstraintsArea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsArea.gridy = 0;
	this.gridBagConstraintsArea.gridx = 0;
	this.gridBagConstraintsArea.ipadx = 0;
	this.gridBagConstraintsArea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoArea.add(jLabelcodigoArea, this.gridBagConstraintsArea);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsArea = new GridBagConstraints();
		//this.gridBagConstraintsArea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsArea.gridy = 0;
		this.gridBagConstraintsArea.gridx = 2;
		this.gridBagConstraintsArea.ipadx = 0;
		this.gridBagConstraintsArea.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoArea.add(jButtoncodigoAreaBusqueda, this.gridBagConstraintsArea);
	}

	this.gridBagConstraintsArea = new GridBagConstraints();
	this.gridBagConstraintsArea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsArea.gridy = 0;
	this.gridBagConstraintsArea.gridx = 1;
	this.gridBagConstraintsArea.ipadx = 0;
	this.gridBagConstraintsArea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoArea.add(jTextFieldcodigoArea, this.gridBagConstraintsArea);


	this.gridBagConstraintsArea = new GridBagConstraints();
	this.gridBagConstraintsArea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsArea.gridy = 0;
	this.gridBagConstraintsArea.gridx = 0;
	this.gridBagConstraintsArea.ipadx = 0;
	this.gridBagConstraintsArea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreArea.add(jLabelnombreArea, this.gridBagConstraintsArea);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsArea = new GridBagConstraints();
		//this.gridBagConstraintsArea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsArea.gridy = 0;
		this.gridBagConstraintsArea.gridx = 2;
		this.gridBagConstraintsArea.ipadx = 0;
		this.gridBagConstraintsArea.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreArea.add(jButtonnombreAreaBusqueda, this.gridBagConstraintsArea);
	}

	this.gridBagConstraintsArea = new GridBagConstraints();
	this.gridBagConstraintsArea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsArea.gridy = 0;
	this.gridBagConstraintsArea.gridx = 1;
	this.gridBagConstraintsArea.ipadx = 0;
	this.gridBagConstraintsArea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreArea.add(jscrollPanenombreArea, this.gridBagConstraintsArea);


	this.gridBagConstraintsArea = new GridBagConstraints();
	this.gridBagConstraintsArea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsArea.gridy = 0;
	this.gridBagConstraintsArea.gridx = 0;
	this.gridBagConstraintsArea.ipadx = 0;
	this.gridBagConstraintsArea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsecuencial_pedidoArea.add(jLabelsecuencial_pedidoArea, this.gridBagConstraintsArea);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsArea = new GridBagConstraints();
		//this.gridBagConstraintsArea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsArea.gridy = 0;
		this.gridBagConstraintsArea.gridx = 2;
		this.gridBagConstraintsArea.ipadx = 0;
		this.gridBagConstraintsArea.insets = new Insets(0, 0, 0, 0);
		this.jPanelsecuencial_pedidoArea.add(jButtonsecuencial_pedidoAreaBusqueda, this.gridBagConstraintsArea);
	}

	this.gridBagConstraintsArea = new GridBagConstraints();
	this.gridBagConstraintsArea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsArea.gridy = 0;
	this.gridBagConstraintsArea.gridx = 1;
	this.gridBagConstraintsArea.ipadx = 0;
	this.gridBagConstraintsArea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsecuencial_pedidoArea.add(jTextFieldsecuencial_pedidoArea, this.gridBagConstraintsArea);


	this.gridBagConstraintsArea = new GridBagConstraints();
	this.gridBagConstraintsArea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsArea.gridy = 0;
	this.gridBagConstraintsArea.gridx = 0;
	this.gridBagConstraintsArea.ipadx = 0;
	this.gridBagConstraintsArea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsecuencial_cotizacionArea.add(jLabelsecuencial_cotizacionArea, this.gridBagConstraintsArea);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsArea = new GridBagConstraints();
		//this.gridBagConstraintsArea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsArea.gridy = 0;
		this.gridBagConstraintsArea.gridx = 2;
		this.gridBagConstraintsArea.ipadx = 0;
		this.gridBagConstraintsArea.insets = new Insets(0, 0, 0, 0);
		this.jPanelsecuencial_cotizacionArea.add(jButtonsecuencial_cotizacionAreaBusqueda, this.gridBagConstraintsArea);
	}

	this.gridBagConstraintsArea = new GridBagConstraints();
	this.gridBagConstraintsArea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsArea.gridy = 0;
	this.gridBagConstraintsArea.gridx = 1;
	this.gridBagConstraintsArea.ipadx = 0;
	this.gridBagConstraintsArea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsecuencial_cotizacionArea.add(jTextFieldsecuencial_cotizacionArea, this.gridBagConstraintsArea);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsArea = new GridBagConstraints();
	this.gridBagConstraintsArea.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsArea.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsArea.gridy = iYPanelCamposArea;
	this.gridBagConstraintsArea.gridx = iXPanelCamposArea++;
	this.gridBagConstraintsArea.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsArea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposArea.add(this.jPanelidArea, this.gridBagConstraintsArea);



	if(iXPanelCamposArea % 1==0) {
		iXPanelCamposArea=0;
		iYPanelCamposArea++;
	}
	this.gridBagConstraintsArea = new GridBagConstraints();
	this.gridBagConstraintsArea.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsArea.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsArea.gridy = iYPanelCamposArea;
	this.gridBagConstraintsArea.gridx = iXPanelCamposArea++;
	this.gridBagConstraintsArea.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsArea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposArea.add(this.jPanelid_empleadoArea, this.gridBagConstraintsArea);



	if(iXPanelCamposArea % 1==0) {
		iXPanelCamposArea=0;
		iYPanelCamposArea++;
	}
	this.gridBagConstraintsArea = new GridBagConstraints();
	this.gridBagConstraintsArea.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsArea.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsArea.gridy = iYPanelCamposArea;
	this.gridBagConstraintsArea.gridx = iXPanelCamposArea++;
	this.gridBagConstraintsArea.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsArea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposArea.add(this.jPanelid_empleado_sustitutoArea, this.gridBagConstraintsArea);



	if(iXPanelCamposArea % 1==0) {
		iXPanelCamposArea=0;
		iYPanelCamposArea++;
	}
	this.gridBagConstraintsArea = new GridBagConstraints();
	this.gridBagConstraintsArea.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsArea.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsArea.gridy = iYPanelCamposArea;
	this.gridBagConstraintsArea.gridx = iXPanelCamposArea++;
	this.gridBagConstraintsArea.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsArea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposArea.add(this.jPanelcodigoArea, this.gridBagConstraintsArea);



	if(iXPanelCamposArea % 1==0) {
		iXPanelCamposArea=0;
		iYPanelCamposArea++;
	}
	this.gridBagConstraintsArea = new GridBagConstraints();
	this.gridBagConstraintsArea.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsArea.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsArea.gridy = iYPanelCamposArea;
	this.gridBagConstraintsArea.gridx = iXPanelCamposArea++;
	this.gridBagConstraintsArea.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsArea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposArea.add(this.jPanelnombreArea, this.gridBagConstraintsArea);



	if(iXPanelCamposArea % 1==0) {
		iXPanelCamposArea=0;
		iYPanelCamposArea++;
	}
	this.gridBagConstraintsArea = new GridBagConstraints();
	this.gridBagConstraintsArea.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsArea.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsArea.gridy = iYPanelCamposArea;
	this.gridBagConstraintsArea.gridx = iXPanelCamposArea++;
	this.gridBagConstraintsArea.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsArea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposArea.add(this.jPanelsecuencial_pedidoArea, this.gridBagConstraintsArea);



	if(iXPanelCamposArea % 1==0) {
		iXPanelCamposArea=0;
		iYPanelCamposArea++;
	}
	this.gridBagConstraintsArea = new GridBagConstraints();
	this.gridBagConstraintsArea.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsArea.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsArea.gridy = iYPanelCamposArea;
	this.gridBagConstraintsArea.gridx = iXPanelCamposArea++;
	this.gridBagConstraintsArea.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsArea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposArea.add(this.jPanelsecuencial_cotizacionArea, this.gridBagConstraintsArea);



	if(iXPanelCamposArea % 1==0) {
		iXPanelCamposArea=0;
		iYPanelCamposArea++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsArea = new GridBagConstraints();
	this.gridBagConstraintsArea.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsArea.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsArea.gridy = iYPanelCamposOcultosArea;
	this.gridBagConstraintsArea.gridx = iXPanelCamposOcultosArea++;
	this.gridBagConstraintsArea.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsArea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosArea.add(this.jPanelid_empresaArea, this.gridBagConstraintsArea);



	if(iXPanelCamposOcultosArea % 1==0) {
		iXPanelCamposOcultosArea=0;
		iYPanelCamposOcultosArea++;
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
			
		GridBagLayout gridaBagLayoutAccionesArea= new GridBagLayout();
		this.jPanelAccionesArea.setLayout(gridaBagLayoutAccionesArea);
		
		GridBagLayout gridaBagLayoutAccionesFormularioArea= new GridBagLayout();
		this.jPanelAccionesFormularioArea.setLayout(gridaBagLayoutAccionesFormularioArea);
		
		this.gridBagConstraintsArea = new GridBagConstraints();
		this.gridBagConstraintsArea.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsArea.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioArea.add(this.jComboBoxTiposAccionesFormularioArea, this.gridBagConstraintsArea);

		this.gridBagConstraintsArea = new GridBagConstraints();
		this.gridBagConstraintsArea.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsArea.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioArea.add(this.jCheckBoxPostAccionNuevoArea, this.gridBagConstraintsArea);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.areaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsArea = new GridBagConstraints();
			this.gridBagConstraintsArea.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsArea.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioArea.add(this.jCheckBoxPostAccionSinCerrarArea, this.gridBagConstraintsArea);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.areaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.areaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsArea = new GridBagConstraints();
			this.gridBagConstraintsArea.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsArea.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioArea.add(this.jCheckBoxPostAccionSinMensajeArea, this.gridBagConstraintsArea);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsArea = new GridBagConstraints();
		this.gridBagConstraintsArea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsArea.gridy = 0;
		this.gridBagConstraintsArea.gridx = iPosXAccion++;
			
		this.jPanelAccionesArea.add(this.jButtonModificarArea, this.gridBagConstraintsArea);							

		this.gridBagConstraintsArea = new GridBagConstraints();
		this.gridBagConstraintsArea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsArea.gridy = 0;
		this.gridBagConstraintsArea.gridx =iPosXAccion++;
			
		this.jPanelAccionesArea.add(this.jButtonEliminarArea, this.gridBagConstraintsArea);
		
			
		this.gridBagConstraintsArea = new GridBagConstraints();
		this.gridBagConstraintsArea.gridy = 0;		
		this.gridBagConstraintsArea.gridx = iPosXAccion++;
		
		this.jPanelAccionesArea.add(this.jButtonActualizarArea, this.gridBagConstraintsArea);


		this.gridBagConstraintsArea = new GridBagConstraints();
		this.gridBagConstraintsArea.gridy = 0;		
		this.gridBagConstraintsArea.gridx = iPosXAccion++;
		
		this.jPanelAccionesArea.add(this.jButtonGuardarCambiosArea, this.gridBagConstraintsArea);	
		
		this.gridBagConstraintsArea = new GridBagConstraints();
		this.gridBagConstraintsArea.gridy = 0;		
		this.gridBagConstraintsArea.gridx =iPosXAccion++;
		
		this.jPanelAccionesArea.add(this.jButtonCancelarArea, this.gridBagConstraintsArea);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutArea = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutArea);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.areaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsArea = new GridBagConstraints();						
			this.gridBagConstraintsArea.gridy = iGridyPrincipal++;
			this.gridBagConstraintsArea.gridx = 0;		
			//this.gridBagConstraintsArea.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsArea.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsArea.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsArea = new GridBagConstraints();
		this.gridBagConstraintsArea.gridy =iGridyPrincipal++;
		this.gridBagConstraintsArea.gridx =0;
		this.gridBagConstraintsArea.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsArea.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosArea, this.gridBagConstraintsArea);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(AreaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleArea = new AreaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Area DATOS");
			
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
			
	        //this.setTitle("[FOR] - Area DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Area Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			AreaModel areaModel=new AreaModel(this);
			
			//SI USARA CLASE INTERNA
			//AreaModel.AreaFocusTraversalPolicy areaFocusTraversalPolicy = areaModel.new AreaFocusTraversalPolicy(this);
			
			//areaFocusTraversalPolicy.setareaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(areaModel);
			
			
			this.jContentPaneDetalleArea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleArea = new GridBagLayout();	
			this.jContentPaneDetalleArea.setLayout(gridaBagLayoutDetalleArea);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosArea = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsArea = new GridBagConstraints();
				this.gridBagConstraintsArea.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsArea.gridx = 0;
					
				
				this.jContentPaneDetalleArea.add(jTtoolBarDetalleArea, gridBagConstraintsArea);								
				
}
			
			this.jScrollPanelDatosEdicionArea=   new JScrollPane(jContentPaneDetalleArea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionArea.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionArea.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionArea.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralArea=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralArea.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralArea.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralArea.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsArea = new GridBagConstraints();
			
			
	        this.gridBagConstraintsArea.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsArea.gridx = 0;
	        
			this.jContentPaneDetalleArea.add(jPanelCamposArea, gridBagConstraintsArea);
			
			
			
			
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
						&& areaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.areaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsArea= new GridBagConstraints();
						this.gridBagConstraintsArea.gridy = iGridyRelaciones++;
						this.gridBagConstraintsArea.gridx = 0;
						this.jContentPaneDetalleArea.add(this.jTabbedPaneRelacionesArea, this.gridBagConstraintsArea);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesArea.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosArea.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsArea = new GridBagConstraints();
					this.gridBagConstraintsArea.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsArea.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsArea.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsArea.gridx = 0;
					
				
					this.jContentPaneDetalleArea.add(jPanelCamposOcultosArea, gridBagConstraintsArea);
				
					this.jPanelCamposOcultosArea.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsArea = new GridBagConstraints();
			this.gridBagConstraintsArea.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsArea.gridx = 0;
	        this.gridBagConstraintsArea.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleArea.add(this.jPanelAccionesFormularioArea, this.gridBagConstraintsArea);							
			
			
			
			this.gridBagConstraintsArea = new GridBagConstraints();
	        this.gridBagConstraintsArea.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsArea.gridx = 0;
	        
			
			this.jContentPaneDetalleArea.add(this.jPanelAccionesArea, this.gridBagConstraintsArea);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionArea);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionArea=   new JScrollPane(this.jPanelCamposArea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionArea.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionArea.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionArea.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsArea = new GridBagConstraints();
			this.gridBagConstraintsArea.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsArea.gridx = 0;
			this.gridBagConstraintsArea.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsArea.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsArea.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionArea, this.gridBagConstraintsArea);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsArea = new GridBagConstraints();
			this.gridBagConstraintsArea.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsArea.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioArea, this.gridBagConstraintsArea);			
			
			this.gridBagConstraintsArea = new GridBagConstraints();
			this.gridBagConstraintsArea.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsArea.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesArea, this.gridBagConstraintsArea);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsArea = new GridBagConstraints();
		this.gridBagConstraintsArea.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsArea.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposArea, this.gridBagConstraintsArea);
			
			
		this.gridBagConstraintsArea = new GridBagConstraints();
		this.gridBagConstraintsArea.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsArea.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosArea, this.gridBagConstraintsArea);
		
			
		this.gridBagConstraintsArea = new GridBagConstraints();
		this.gridBagConstraintsArea.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsArea.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesArea, this.gridBagConstraintsArea);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralArea;//jContentPane;
		
		return jScrollPanelDatosEdicionArea;
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
