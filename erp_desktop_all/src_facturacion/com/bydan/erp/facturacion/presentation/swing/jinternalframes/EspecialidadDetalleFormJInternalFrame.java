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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.facturacion.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.facturacion.util.EspecialidadConstantesFunciones;

import com.bydan.erp.facturacion.business.logic.*;
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
public class EspecialidadDetalleFormJInternalFrame extends EspecialidadBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleEspecialidad;
	
	protected JMenuBar jmenuBarDetalleEspecialidad;
	
	protected JMenu jmenuDetalleEspecialidad;
	protected JMenu jmenuDetalleArchivoEspecialidad;
	protected JMenu jmenuDetalleAccionesEspecialidad;
	protected JMenu jmenuDetalleDatosEspecialidad;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleEspecialidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEspecialidad;	
	protected GridBagConstraints gridBagConstraintsEspecialidad;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected EspecialidadBeanSwingJInternalFrameAdditional jInternalFrameDetalleEspecialidad;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public EspecialidadSessionBean especialidadSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public EspecialidadLogic especialidadLogic;
	
	public JScrollPane jScrollPanelDatosEspecialidad;
	public JScrollPane jScrollPanelDatosEdicionEspecialidad;
	public JScrollPane jScrollPanelDatosGeneralEspecialidad;
	
	protected JPanel jPanelCamposEspecialidad;    
	protected JPanel jPanelCamposOcultosEspecialidad;    	
	protected JPanel jPanelAccionesEspecialidad;
	protected JPanel jPanelAccionesFormularioEspecialidad;
    
	
	
	protected Integer iXPanelCamposEspecialidad=0;
	protected Integer iYPanelCamposEspecialidad=0;
	
	protected Integer iXPanelCamposOcultosEspecialidad=0;
	protected Integer iYPanelCamposOcultosEspecialidad=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoEspecialidad;
	public JButton jButtonModificarEspecialidad;
	public JButton jButtonActualizarEspecialidad;
    public JButton jButtonEliminarEspecialidad;
	public JButton jButtonCancelarEspecialidad;
    public JButton jButtonGuardarCambiosEspecialidad;
	public JButton jButtonGuardarCambiosTablaEspecialidad;
	protected JButton jButtonCerrarEspecialidad;
	
	
	protected JButton jButtonProcesarInformacionEspecialidad;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoEspecialidad;
	protected JCheckBox jCheckBoxPostAccionSinCerrarEspecialidad;
	protected JCheckBox jCheckBoxPostAccionSinMensajeEspecialidad;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEspecialidad;
	protected JButton jButtonModificarToolBarEspecialidad;
	protected JButton jButtonActualizarToolBarEspecialidad;
    protected JButton jButtonEliminarToolBarEspecialidad;
	protected JButton jButtonCancelarToolBarEspecialidad;
    protected JButton jButtonGuardarCambiosToolBarEspecialidad;
	protected JButton jButtonGuardarCambiosTablaToolBarEspecialidad;
	protected JButton jButtonMostrarOcultarTablaToolBarEspecialidad;
	protected JButton jButtonCerrarToolBarEspecialidad;
	
	protected JButton jButtonProcesarInformacionToolBarEspecialidad;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEspecialidad;
	protected JMenuItem jMenuItemModificarEspecialidad;
	protected JMenuItem jMenuItemActualizarEspecialidad;
    protected JMenuItem jMenuItemEliminarEspecialidad;
	protected JMenuItem jMenuItemCancelarEspecialidad;
    protected JMenuItem jMenuItemGuardarCambiosEspecialidad;
	protected JMenuItem jMenuItemGuardarCambiosTablaEspecialidad;
	protected JMenuItem jMenuItemCerrarEspecialidad;
	protected JMenuItem jMenuItemDetalleCerrarEspecialidad;
	protected JMenuItem jMenuItemDetalleMostarOcultarEspecialidad;
	
	protected JMenuItem jMenuItemProcesarInformacionEspecialidad;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEspecialidad;
	protected JMenuItem jMenuItemMostrarOcultarEspecialidad;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEspecialidad;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEspecialidad;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEspecialidad;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioEspecialidad;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidEspecialidad;
	public JLabel jLabelIdEspecialidad;
	public JLabel jLabelidEspecialidad;
	public JButton jButtonidEspecialidadBusqueda= new JButtonMe();

	public JPanel jPanelcodigoEspecialidad;
	public JLabel jLabelcodigoEspecialidad;
	public JTextField jTextFieldcodigoEspecialidad;
	public JButton jButtoncodigoEspecialidadBusqueda= new JButtonMe();

	public JPanel jPanelnombreEspecialidad;
	public JLabel jLabelnombreEspecialidad;
	public JTextArea jTextAreanombreEspecialidad;
	public JScrollPane jscrollPanenombreEspecialidad;
	public JButton jButtonnombreEspecialidadBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionEspecialidad;
	public JLabel jLabeldescripcionEspecialidad;
	public JTextArea jTextAreadescripcionEspecialidad;
	public JScrollPane jscrollPanedescripcionEspecialidad;
	public JButton jButtondescripcionEspecialidadBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaEspecialidad;
	public JLabel jLabelid_empresaEspecialidad;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaEspecialidad;
	public JButton jButtonid_empresaEspecialidad= new JButtonMe();
	public JButton jButtonid_empresaEspecialidadUpdate= new JButtonMe();
	public JButton jButtonid_empresaEspecialidadBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesEspecialidad;
	
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
	public int iHeightFormulario=550;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public EspecialidadDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposEspecialidad=new JPanel();
				this.jPanelAccionesFormularioEspecialidad=new JPanel();
				this.jmenuBarDetalleEspecialidad=new JMenuBar();
				this.jTtoolBarDetalleEspecialidad=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EspecialidadDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Especialidad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public EspecialidadDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Especialidad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EspecialidadDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Especialidad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EspecialidadDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Especialidad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EspecialidadDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Especialidad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarEspecialidad() {
		return this.jButtonActualizarToolBarEspecialidad;
	}
	
	public JButton getjButtonEliminarToolBarEspecialidad() {
		return this.jButtonEliminarToolBarEspecialidad;
	}
	
	public JButton getjButtonCancelarToolBarEspecialidad() {
		return this.jButtonCancelarToolBarEspecialidad;
	}		
	
	public JButton getjButtonProcesarInformacionEspecialidad() {
		return this.jButtonProcesarInformacionEspecialidad;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEspecialidad)	{
		this.jButtonProcesarInformacionEspecialidad = jButtonProcesarInformacionEspecialidad;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEspecialidad() {
		return this.jComboBoxTiposAccionesEspecialidad;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEspecialidad(
			JComboBox jComboBoxTiposRelacionesEspecialidad) {
		this.jComboBoxTiposRelacionesEspecialidad = jComboBoxTiposRelacionesEspecialidad;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEspecialidad(
			JComboBox jComboBoxTiposAccionesEspecialidad) {
		this.jComboBoxTiposAccionesEspecialidad = jComboBoxTiposAccionesEspecialidad;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioEspecialidad() {
		return this.jComboBoxTiposAccionesFormularioEspecialidad;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioEspecialidad(
			JComboBox jComboBoxTiposAccionesFormularioEspecialidad) {
		this.jComboBoxTiposAccionesFormularioEspecialidad = jComboBoxTiposAccionesFormularioEspecialidad;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.especialidadSessionBean=new EspecialidadSessionBean();
		
		this.especialidadSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.especialidadSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.especialidadSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EspecialidadJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EspecialidadJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EspecialidadJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Especialidad MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.especialidadSessionBean.getEsGuardarRelacionado()) {
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
	
		EspecialidadJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleEspecialidad= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarEspecialidad=new JButtonMe();
				this.jButtonModificarToolBarEspecialidad=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarEspecialidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarEspecialidad,this.jTtoolBarDetalleEspecialidad,
							"actualizar","actualizar","Actualizar"+" "+EspecialidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarEspecialidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarEspecialidad,this.jTtoolBarDetalleEspecialidad,
							"eliminar","eliminar","Eliminar"+" "+EspecialidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarEspecialidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarEspecialidad,this.jTtoolBarDetalleEspecialidad,
							"cancelar","cancelar","Cancelar"+" "+EspecialidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarEspecialidad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarEspecialidad,this.jTtoolBarDetalleEspecialidad,
							"guardarcambios","guardarcambios","Guardar"+" "+EspecialidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarEspecialidad,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarEspecialidad,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarEspecialidad,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleEspecialidad=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleEspecialidad=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoEspecialidad=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesEspecialidad=new JMenuMe("Acciones");
		this.jmenuDetalleDatosEspecialidad=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEspecialidad= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEspecialidad.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEspecialidad,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEspecialidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarEspecialidad= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarEspecialidad.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarEspecialidad,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarEspecialidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarEspecialidad= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarEspecialidad.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarEspecialidad,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarEspecialidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarEspecialidad= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarEspecialidad.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarEspecialidad,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarEspecialidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarEspecialidad= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarEspecialidad.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarEspecialidad,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarEspecialidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosEspecialidad= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEspecialidad.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEspecialidad,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEspecialidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEspecialidad= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEspecialidad.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEspecialidad,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEspecialidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarEspecialidad= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarEspecialidad.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarEspecialidad,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarEspecialidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEspecialidad= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEspecialidad.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEspecialidad,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEspecialidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEspecialidad= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEspecialidad.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEspecialidad,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEspecialidad, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoEspecialidad.add(this.jMenuItemDetalleCerrarEspecialidad);
		
		this.jmenuDetalleAccionesEspecialidad.add(this.jMenuItemActualizarEspecialidad);
		this.jmenuDetalleAccionesEspecialidad.add(this.jMenuItemEliminarEspecialidad);
		this.jmenuDetalleAccionesEspecialidad.add(this.jMenuItemCancelarEspecialidad);		
		
		//this.jmenuDetalleDatosEspecialidad.add(this.jMenuItemDetalleAbrirOrderByEspecialidad);				
		this.jmenuDetalleDatosEspecialidad.add(this.jMenuItemDetalleMostarOcultarEspecialidad);				
				
		//this.jmenuDetalleAccionesEspecialidad.add(this.jMenuItemGuardarCambiosEspecialidad);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoEspecialidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesEspecialidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosEspecialidad, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleEspecialidad.add(this.jmenuDetalleArchivoEspecialidad);		
		this.jmenuBarDetalleEspecialidad.add(this.jmenuDetalleAccionesEspecialidad);		
		this.jmenuBarDetalleEspecialidad.add(this.jmenuDetalleDatosEspecialidad);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleEspecialidad);				
	}
	
	
	public void inicializarElementosCamposEspecialidad() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdEspecialidad = new JLabelMe();
		jLabelIdEspecialidad.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdEspecialidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEspecialidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEspecialidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdEspecialidad,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidEspecialidad = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidEspecialidad.setToolTipText(EspecialidadConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutEspecialidad= new GridBagLayout();

		this.jPanelidEspecialidad.setLayout(this.gridaBagLayoutEspecialidad);

		jLabelidEspecialidad = new JLabel();
		jLabelidEspecialidad.setText("Id");

		jLabelidEspecialidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidEspecialidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidEspecialidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoEspecialidad = new JLabelMe();
		this.jLabelcodigoEspecialidad.setText(""+EspecialidadConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoEspecialidad.setToolTipText("Codigo");
		this.jLabelcodigoEspecialidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoEspecialidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoEspecialidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoEspecialidad,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoEspecialidad=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoEspecialidad.setToolTipText(EspecialidadConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutEspecialidad = new GridBagLayout();
		this.jPanelcodigoEspecialidad.setLayout(this.gridaBagLayoutEspecialidad);


		jTextFieldcodigoEspecialidad= new JTextFieldMe();

		jTextFieldcodigoEspecialidad.setEnabled(false);
		jTextFieldcodigoEspecialidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoEspecialidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoEspecialidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoEspecialidad,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoEspecialidadBusqueda= new JButtonMe();
		this.jButtoncodigoEspecialidadBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoEspecialidadBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoEspecialidadBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoEspecialidadBusqueda.setText("U");
		this.jButtoncodigoEspecialidadBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoEspecialidadBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoEspecialidadBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoEspecialidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoEspecialidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoEspecialidadBusqueda"));

		if(this.especialidadSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoEspecialidadBusqueda.setVisible(false);		}


					
		this.jLabelnombreEspecialidad = new JLabelMe();
		this.jLabelnombreEspecialidad.setText(""+EspecialidadConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreEspecialidad.setToolTipText("Nombre");
		this.jLabelnombreEspecialidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEspecialidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEspecialidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreEspecialidad,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreEspecialidad=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreEspecialidad.setToolTipText(EspecialidadConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutEspecialidad = new GridBagLayout();
		this.jPanelnombreEspecialidad.setLayout(this.gridaBagLayoutEspecialidad);


		jTextAreanombreEspecialidad= new JTextAreaMe();
		jTextAreanombreEspecialidad.setEnabled(false);
		jTextAreanombreEspecialidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEspecialidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEspecialidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEspecialidad.setLineWrap(true);
		jTextAreanombreEspecialidad.setWrapStyleWord(true);
		jTextAreanombreEspecialidad.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreEspecialidad.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreEspecialidad,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreEspecialidad = new JScrollPane(jTextAreanombreEspecialidad);
		jscrollPanenombreEspecialidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreEspecialidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreEspecialidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreEspecialidadBusqueda= new JButtonMe();
		this.jButtonnombreEspecialidadBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEspecialidadBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEspecialidadBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreEspecialidadBusqueda.setText("U");
		this.jButtonnombreEspecialidadBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreEspecialidadBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreEspecialidadBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreEspecialidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreEspecialidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreEspecialidadBusqueda"));

		if(this.especialidadSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreEspecialidadBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionEspecialidad = new JLabelMe();
		this.jLabeldescripcionEspecialidad.setText(""+EspecialidadConstantesFunciones.LABEL_DESCRIPCION+" :");
		this.jLabeldescripcionEspecialidad.setToolTipText("Descripcion");
		this.jLabeldescripcionEspecialidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionEspecialidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionEspecialidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionEspecialidad,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionEspecialidad=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionEspecialidad.setToolTipText(EspecialidadConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutEspecialidad = new GridBagLayout();
		this.jPaneldescripcionEspecialidad.setLayout(this.gridaBagLayoutEspecialidad);


		jTextAreadescripcionEspecialidad= new JTextAreaMe();
		jTextAreadescripcionEspecialidad.setEnabled(false);
		jTextAreadescripcionEspecialidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionEspecialidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionEspecialidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionEspecialidad.setLineWrap(true);
		jTextAreadescripcionEspecialidad.setWrapStyleWord(true);
		jTextAreadescripcionEspecialidad.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionEspecialidad.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionEspecialidad,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionEspecialidad = new JScrollPane(jTextAreadescripcionEspecialidad);
		jscrollPanedescripcionEspecialidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionEspecialidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionEspecialidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionEspecialidadBusqueda= new JButtonMe();
		this.jButtondescripcionEspecialidadBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionEspecialidadBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionEspecialidadBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionEspecialidadBusqueda.setText("U");
		this.jButtondescripcionEspecialidadBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionEspecialidadBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionEspecialidadBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionEspecialidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionEspecialidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionEspecialidadBusqueda"));

		if(this.especialidadSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionEspecialidadBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysEspecialidad() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaEspecialidad = new JLabelMe();
		this.jLabelid_empresaEspecialidad.setText(""+EspecialidadConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaEspecialidad.setToolTipText("Empresa");
		this.jLabelid_empresaEspecialidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaEspecialidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaEspecialidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaEspecialidad,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaEspecialidad=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaEspecialidad.setToolTipText(EspecialidadConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutEspecialidad = new GridBagLayout();
		this.jPanelid_empresaEspecialidad.setLayout(this.gridaBagLayoutEspecialidad);


		jComboBoxid_empresaEspecialidad= new JComboBoxMe();
		jComboBoxid_empresaEspecialidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaEspecialidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaEspecialidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaEspecialidad,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaEspecialidad.setEnabled(false);

		this.jButtonid_empresaEspecialidad= new JButtonMe();
		this.jButtonid_empresaEspecialidad.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaEspecialidad.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaEspecialidad.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaEspecialidad.setText("Buscar");
		this.jButtonid_empresaEspecialidad.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaEspecialidad.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaEspecialidad,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaEspecialidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaEspecialidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaEspecialidad"));

		this.jButtonid_empresaEspecialidadBusqueda= new JButtonMe();
		this.jButtonid_empresaEspecialidadBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEspecialidadBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEspecialidadBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaEspecialidadBusqueda.setText("U");
		this.jButtonid_empresaEspecialidadBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaEspecialidadBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaEspecialidadBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaEspecialidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaEspecialidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaEspecialidadBusqueda"));

		if(this.especialidadSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaEspecialidadBusqueda.setVisible(false);		}

		this.jButtonid_empresaEspecialidadUpdate= new JButtonMe();
		this.jButtonid_empresaEspecialidadUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEspecialidadUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEspecialidadUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaEspecialidadUpdate.setText("U");
		this.jButtonid_empresaEspecialidadUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaEspecialidadUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaEspecialidadUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaEspecialidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaEspecialidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaEspecialidadUpdate"));



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
		//this.jInternalFrameDetalleEspecialidad = new EspecialidadBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Especialidad DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEspecialidad= new GridBagLayout();
		

		
		String sToolTipEspecialidad="";
		sToolTipEspecialidad=EspecialidadConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEspecialidad+="(Facturacion.Especialidad)";
		}
		
		if(!this.especialidadSessionBean.getEsGuardarRelacionado()) {
			sToolTipEspecialidad+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoEspecialidad = new JButtonMe();
		this.jButtonModificarEspecialidad = new JButtonMe();
        this.jButtonActualizarEspecialidad = new JButtonMe();
        this.jButtonEliminarEspecialidad = new JButtonMe();
        this.jButtonCancelarEspecialidad = new JButtonMe();
        this.jButtonGuardarCambiosEspecialidad = new JButtonMe();
		this.jButtonGuardarCambiosTablaEspecialidad = new JButtonMe();
		this.jButtonCerrarEspecialidad = new JButtonMe();
		
		this.jScrollPanelDatosEspecialidad = new JScrollPane();   
        this.jScrollPanelDatosEdicionEspecialidad = new JScrollPane();
		this.jScrollPanelDatosGeneralEspecialidad = new JScrollPane();
				
		
		
		this.jPanelCamposEspecialidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosEspecialidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesEspecialidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioEspecialidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Especialidad";
		
		if(!this.especialidadSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEspecialidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Especialidads" + this.sPath));
		} else {
			this.jScrollPanelDatosEspecialidad.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionEspecialidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralEspecialidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposEspecialidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposEspecialidad.setName("jPanelCamposEspecialidad"); 

		this.jPanelCamposOcultosEspecialidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosEspecialidad.setName("jPanelCamposOcultosEspecialidad"); 

        this.jPanelAccionesEspecialidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEspecialidad.setToolTipText("Acciones");
        this.jPanelAccionesEspecialidad.setName("Acciones"); 

		this.jPanelAccionesFormularioEspecialidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioEspecialidad.setToolTipText("Acciones");
        this.jPanelAccionesFormularioEspecialidad.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionEspecialidad, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEspecialidad, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEspecialidad, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposEspecialidad, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosEspecialidad, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioEspecialidad, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoEspecialidad.setText("Nuevo");
		this.jButtonModificarEspecialidad.setText("Editar");
        this.jButtonActualizarEspecialidad.setText("Actualizar");
        this.jButtonEliminarEspecialidad.setText("Eliminar");
        this.jButtonCancelarEspecialidad.setText("Cancelar");
        this.jButtonGuardarCambiosEspecialidad.setText("Guardar");
		this.jButtonGuardarCambiosTablaEspecialidad.setText("Guardar");
		this.jButtonCerrarEspecialidad.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEspecialidad,"nuevo_button","Nuevo",this.especialidadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarEspecialidad,"modificar_button","Editar",this.especialidadSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarEspecialidad,"actualizar_button","Actualizar",this.especialidadSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarEspecialidad,"eliminar_button","Eliminar",this.especialidadSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarEspecialidad,"cancelar_button","Cancelar",this.especialidadSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosEspecialidad,"guardarcambios_button","Guardar",this.especialidadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEspecialidad,"guardarcambiostabla_button","Guardar",this.especialidadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEspecialidad,"cerrar_button","Salir",this.especialidadSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEspecialidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarEspecialidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosEspecialidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEspecialidad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEspecialidad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarEspecialidad, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarEspecialidad, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarEspecialidad, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoEspecialidad.setToolTipText("Nuevo"+" "+EspecialidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarEspecialidad.setToolTipText("Editar"+" "+EspecialidadConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarEspecialidad.setToolTipText("Actualizar"+" "+EspecialidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarEspecialidad.setToolTipText("Eliminar)"+" "+EspecialidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarEspecialidad.setToolTipText("Cancelar"+" "+EspecialidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosEspecialidad.setToolTipText("Guardar"+" "+EspecialidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaEspecialidad.setToolTipText("Guardar"+" "+EspecialidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEspecialidad.setToolTipText("Salir"+" "+EspecialidadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEspecialidad";
		inputMap = this.jButtonNuevoEspecialidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEspecialidad.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEspecialidad"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarEspecialidad";
		inputMap = this.jButtonActualizarEspecialidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarEspecialidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarEspecialidad"));
		
		//ELIMINAR
		sMapKey = "EliminarEspecialidad";
		inputMap = this.jButtonEliminarEspecialidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarEspecialidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarEspecialidad"));
		
		//CANCELAR	
		sMapKey = "CancelarEspecialidad";
		inputMap = this.jButtonCancelarEspecialidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarEspecialidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarEspecialidad"));
		
		//CERRAR		
		sMapKey = "CerrarEspecialidad";
		inputMap = this.jButtonCerrarEspecialidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEspecialidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEspecialidad"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEspecialidad";
		inputMap = this.jButtonGuardarCambiosTablaEspecialidad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEspecialidad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEspecialidad"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoEspecialidad = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoEspecialidad.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoEspecialidad.setToolTipText("Nuevo Especialidad");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoEspecialidad, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarEspecialidad = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarEspecialidad.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarEspecialidad.setToolTipText("Sin Cerrar Ventana Especialidad");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarEspecialidad, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeEspecialidad = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeEspecialidad.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeEspecialidad.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeEspecialidad, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesEspecialidad = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEspecialidad.setText("Accion");
		this.jComboBoxTiposAccionesEspecialidad.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioEspecialidad = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioEspecialidad.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioEspecialidad.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesEspecialidad = new JLabelMe();
		
		this.jLabelAccionesEspecialidad.setText("Acciones");		
		this.jLabelAccionesEspecialidad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEspecialidad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEspecialidad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposEspecialidad();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysEspecialidad();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesEspecialidad=new JTabbedPane();
		this.jTabbedPaneRelacionesEspecialidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesEspecialidad,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesEspecialidad.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEspecialidad.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEspecialidad.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEspecialidad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioEspecialidad.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEspecialidad.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEspecialidad.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioEspecialidad, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposEspecialidad = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosEspecialidad = new GridBagLayout();
		
		this.jPanelCamposEspecialidad.setLayout(gridaBagLayoutCamposEspecialidad);
		this.jPanelCamposOcultosEspecialidad.setLayout(gridaBagLayoutCamposOcultosEspecialidad);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsEspecialidad = new GridBagConstraints();
	this.gridBagConstraintsEspecialidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEspecialidad.gridy = 0;
	this.gridBagConstraintsEspecialidad.gridx = 0;
	this.gridBagConstraintsEspecialidad.ipadx = 0;
	this.gridBagConstraintsEspecialidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidEspecialidad.add(jLabelIdEspecialidad, this.gridBagConstraintsEspecialidad);



	this.gridBagConstraintsEspecialidad = new GridBagConstraints();
	this.gridBagConstraintsEspecialidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEspecialidad.gridy = 0;
	this.gridBagConstraintsEspecialidad.gridx = 1;
	this.gridBagConstraintsEspecialidad.ipadx = 0;
	this.gridBagConstraintsEspecialidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidEspecialidad.add(jLabelidEspecialidad, this.gridBagConstraintsEspecialidad);


	this.gridBagConstraintsEspecialidad = new GridBagConstraints();
	this.gridBagConstraintsEspecialidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEspecialidad.gridy = 0;
	this.gridBagConstraintsEspecialidad.gridx = 0;
	this.gridBagConstraintsEspecialidad.ipadx = 0;
	this.gridBagConstraintsEspecialidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaEspecialidad.add(jLabelid_empresaEspecialidad, this.gridBagConstraintsEspecialidad);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEspecialidad = new GridBagConstraints();
		//this.gridBagConstraintsEspecialidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEspecialidad.gridy = 0;
		this.gridBagConstraintsEspecialidad.gridx = 2;
		this.gridBagConstraintsEspecialidad.ipadx = 0;
		this.gridBagConstraintsEspecialidad.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaEspecialidad.add(jButtonid_empresaEspecialidadBusqueda, this.gridBagConstraintsEspecialidad);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEspecialidad = new GridBagConstraints();
		//this.gridBagConstraintsEspecialidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEspecialidad.gridy = 0;
		this.gridBagConstraintsEspecialidad.gridx = 3;
		this.gridBagConstraintsEspecialidad.ipadx = 0;
		this.gridBagConstraintsEspecialidad.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaEspecialidad.add(jButtonid_empresaEspecialidadUpdate, this.gridBagConstraintsEspecialidad);
	}

	this.gridBagConstraintsEspecialidad = new GridBagConstraints();
	this.gridBagConstraintsEspecialidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEspecialidad.gridy = 0;
	this.gridBagConstraintsEspecialidad.gridx = 1;
	this.gridBagConstraintsEspecialidad.ipadx = 0;
	this.gridBagConstraintsEspecialidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaEspecialidad.add(jComboBoxid_empresaEspecialidad, this.gridBagConstraintsEspecialidad);


	this.gridBagConstraintsEspecialidad = new GridBagConstraints();
	this.gridBagConstraintsEspecialidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEspecialidad.gridy = 0;
	this.gridBagConstraintsEspecialidad.gridx = 0;
	this.gridBagConstraintsEspecialidad.ipadx = 0;
	this.gridBagConstraintsEspecialidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoEspecialidad.add(jLabelcodigoEspecialidad, this.gridBagConstraintsEspecialidad);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEspecialidad = new GridBagConstraints();
		//this.gridBagConstraintsEspecialidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEspecialidad.gridy = 0;
		this.gridBagConstraintsEspecialidad.gridx = 2;
		this.gridBagConstraintsEspecialidad.ipadx = 0;
		this.gridBagConstraintsEspecialidad.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoEspecialidad.add(jButtoncodigoEspecialidadBusqueda, this.gridBagConstraintsEspecialidad);
	}

	this.gridBagConstraintsEspecialidad = new GridBagConstraints();
	this.gridBagConstraintsEspecialidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEspecialidad.gridy = 0;
	this.gridBagConstraintsEspecialidad.gridx = 1;
	this.gridBagConstraintsEspecialidad.ipadx = 0;
	this.gridBagConstraintsEspecialidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoEspecialidad.add(jTextFieldcodigoEspecialidad, this.gridBagConstraintsEspecialidad);


	this.gridBagConstraintsEspecialidad = new GridBagConstraints();
	this.gridBagConstraintsEspecialidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEspecialidad.gridy = 0;
	this.gridBagConstraintsEspecialidad.gridx = 0;
	this.gridBagConstraintsEspecialidad.ipadx = 0;
	this.gridBagConstraintsEspecialidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreEspecialidad.add(jLabelnombreEspecialidad, this.gridBagConstraintsEspecialidad);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEspecialidad = new GridBagConstraints();
		//this.gridBagConstraintsEspecialidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEspecialidad.gridy = 0;
		this.gridBagConstraintsEspecialidad.gridx = 2;
		this.gridBagConstraintsEspecialidad.ipadx = 0;
		this.gridBagConstraintsEspecialidad.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreEspecialidad.add(jButtonnombreEspecialidadBusqueda, this.gridBagConstraintsEspecialidad);
	}

	this.gridBagConstraintsEspecialidad = new GridBagConstraints();
	this.gridBagConstraintsEspecialidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEspecialidad.gridy = 0;
	this.gridBagConstraintsEspecialidad.gridx = 1;
	this.gridBagConstraintsEspecialidad.ipadx = 0;
	this.gridBagConstraintsEspecialidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreEspecialidad.add(jscrollPanenombreEspecialidad, this.gridBagConstraintsEspecialidad);


	this.gridBagConstraintsEspecialidad = new GridBagConstraints();
	this.gridBagConstraintsEspecialidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEspecialidad.gridy = 0;
	this.gridBagConstraintsEspecialidad.gridx = 0;
	this.gridBagConstraintsEspecialidad.ipadx = 0;
	this.gridBagConstraintsEspecialidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionEspecialidad.add(jLabeldescripcionEspecialidad, this.gridBagConstraintsEspecialidad);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEspecialidad = new GridBagConstraints();
		//this.gridBagConstraintsEspecialidad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEspecialidad.gridy = 0;
		this.gridBagConstraintsEspecialidad.gridx = 2;
		this.gridBagConstraintsEspecialidad.ipadx = 0;
		this.gridBagConstraintsEspecialidad.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionEspecialidad.add(jButtondescripcionEspecialidadBusqueda, this.gridBagConstraintsEspecialidad);
	}

	this.gridBagConstraintsEspecialidad = new GridBagConstraints();
	this.gridBagConstraintsEspecialidad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEspecialidad.gridy = 0;
	this.gridBagConstraintsEspecialidad.gridx = 1;
	this.gridBagConstraintsEspecialidad.ipadx = 0;
	this.gridBagConstraintsEspecialidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionEspecialidad.add(jscrollPanedescripcionEspecialidad, this.gridBagConstraintsEspecialidad);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsEspecialidad = new GridBagConstraints();
	this.gridBagConstraintsEspecialidad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEspecialidad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEspecialidad.gridy = iYPanelCamposEspecialidad;
	this.gridBagConstraintsEspecialidad.gridx = iXPanelCamposEspecialidad++;
	this.gridBagConstraintsEspecialidad.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEspecialidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEspecialidad.add(this.jPanelidEspecialidad, this.gridBagConstraintsEspecialidad);



	if(iXPanelCamposEspecialidad % 1==0) {
		iXPanelCamposEspecialidad=0;
		iYPanelCamposEspecialidad++;
	}
	this.gridBagConstraintsEspecialidad = new GridBagConstraints();
	this.gridBagConstraintsEspecialidad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEspecialidad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEspecialidad.gridy = iYPanelCamposEspecialidad;
	this.gridBagConstraintsEspecialidad.gridx = iXPanelCamposEspecialidad++;
	this.gridBagConstraintsEspecialidad.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEspecialidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEspecialidad.add(this.jPanelcodigoEspecialidad, this.gridBagConstraintsEspecialidad);



	if(iXPanelCamposEspecialidad % 1==0) {
		iXPanelCamposEspecialidad=0;
		iYPanelCamposEspecialidad++;
	}
	this.gridBagConstraintsEspecialidad = new GridBagConstraints();
	this.gridBagConstraintsEspecialidad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEspecialidad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEspecialidad.gridy = iYPanelCamposEspecialidad;
	this.gridBagConstraintsEspecialidad.gridx = iXPanelCamposEspecialidad++;
	this.gridBagConstraintsEspecialidad.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEspecialidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEspecialidad.add(this.jPanelnombreEspecialidad, this.gridBagConstraintsEspecialidad);



	if(iXPanelCamposEspecialidad % 1==0) {
		iXPanelCamposEspecialidad=0;
		iYPanelCamposEspecialidad++;
	}
	this.gridBagConstraintsEspecialidad = new GridBagConstraints();
	this.gridBagConstraintsEspecialidad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEspecialidad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEspecialidad.gridy = iYPanelCamposEspecialidad;
	this.gridBagConstraintsEspecialidad.gridx = iXPanelCamposEspecialidad++;
	this.gridBagConstraintsEspecialidad.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEspecialidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEspecialidad.add(this.jPaneldescripcionEspecialidad, this.gridBagConstraintsEspecialidad);



	if(iXPanelCamposEspecialidad % 1==0) {
		iXPanelCamposEspecialidad=0;
		iYPanelCamposEspecialidad++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsEspecialidad = new GridBagConstraints();
	this.gridBagConstraintsEspecialidad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEspecialidad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEspecialidad.gridy = iYPanelCamposOcultosEspecialidad;
	this.gridBagConstraintsEspecialidad.gridx = iXPanelCamposOcultosEspecialidad++;
	this.gridBagConstraintsEspecialidad.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEspecialidad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosEspecialidad.add(this.jPanelid_empresaEspecialidad, this.gridBagConstraintsEspecialidad);



	if(iXPanelCamposOcultosEspecialidad % 1==0) {
		iXPanelCamposOcultosEspecialidad=0;
		iYPanelCamposOcultosEspecialidad++;
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
			
		GridBagLayout gridaBagLayoutAccionesEspecialidad= new GridBagLayout();
		this.jPanelAccionesEspecialidad.setLayout(gridaBagLayoutAccionesEspecialidad);
		
		GridBagLayout gridaBagLayoutAccionesFormularioEspecialidad= new GridBagLayout();
		this.jPanelAccionesFormularioEspecialidad.setLayout(gridaBagLayoutAccionesFormularioEspecialidad);
		
		this.gridBagConstraintsEspecialidad = new GridBagConstraints();
		this.gridBagConstraintsEspecialidad.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEspecialidad.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEspecialidad.add(this.jComboBoxTiposAccionesFormularioEspecialidad, this.gridBagConstraintsEspecialidad);

		this.gridBagConstraintsEspecialidad = new GridBagConstraints();
		this.gridBagConstraintsEspecialidad.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEspecialidad.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEspecialidad.add(this.jCheckBoxPostAccionNuevoEspecialidad, this.gridBagConstraintsEspecialidad);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.especialidadSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsEspecialidad = new GridBagConstraints();
			this.gridBagConstraintsEspecialidad.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEspecialidad.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEspecialidad.add(this.jCheckBoxPostAccionSinCerrarEspecialidad, this.gridBagConstraintsEspecialidad);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.especialidadSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.especialidadSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsEspecialidad = new GridBagConstraints();
			this.gridBagConstraintsEspecialidad.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEspecialidad.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEspecialidad.add(this.jCheckBoxPostAccionSinMensajeEspecialidad, this.gridBagConstraintsEspecialidad);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsEspecialidad = new GridBagConstraints();
		this.gridBagConstraintsEspecialidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEspecialidad.gridy = 0;
		this.gridBagConstraintsEspecialidad.gridx = iPosXAccion++;
			
		this.jPanelAccionesEspecialidad.add(this.jButtonModificarEspecialidad, this.gridBagConstraintsEspecialidad);							

		this.gridBagConstraintsEspecialidad = new GridBagConstraints();
		this.gridBagConstraintsEspecialidad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEspecialidad.gridy = 0;
		this.gridBagConstraintsEspecialidad.gridx =iPosXAccion++;
			
		this.jPanelAccionesEspecialidad.add(this.jButtonEliminarEspecialidad, this.gridBagConstraintsEspecialidad);
		
			
		this.gridBagConstraintsEspecialidad = new GridBagConstraints();
		this.gridBagConstraintsEspecialidad.gridy = 0;		
		this.gridBagConstraintsEspecialidad.gridx = iPosXAccion++;
		
		this.jPanelAccionesEspecialidad.add(this.jButtonActualizarEspecialidad, this.gridBagConstraintsEspecialidad);


		this.gridBagConstraintsEspecialidad = new GridBagConstraints();
		this.gridBagConstraintsEspecialidad.gridy = 0;		
		this.gridBagConstraintsEspecialidad.gridx = iPosXAccion++;
		
		this.jPanelAccionesEspecialidad.add(this.jButtonGuardarCambiosEspecialidad, this.gridBagConstraintsEspecialidad);	
		
		this.gridBagConstraintsEspecialidad = new GridBagConstraints();
		this.gridBagConstraintsEspecialidad.gridy = 0;		
		this.gridBagConstraintsEspecialidad.gridx =iPosXAccion++;
		
		this.jPanelAccionesEspecialidad.add(this.jButtonCancelarEspecialidad, this.gridBagConstraintsEspecialidad);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEspecialidad = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEspecialidad);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.especialidadSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEspecialidad = new GridBagConstraints();						
			this.gridBagConstraintsEspecialidad.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEspecialidad.gridx = 0;		
			//this.gridBagConstraintsEspecialidad.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEspecialidad.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEspecialidad.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsEspecialidad = new GridBagConstraints();
		this.gridBagConstraintsEspecialidad.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEspecialidad.gridx =0;
		this.gridBagConstraintsEspecialidad.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEspecialidad.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEspecialidad, this.gridBagConstraintsEspecialidad);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(EspecialidadJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleEspecialidad = new EspecialidadBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Especialidad DATOS");
			
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
			
	        //this.setTitle("[FOR] - Especialidad DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Especialidad Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			EspecialidadModel especialidadModel=new EspecialidadModel(this);
			
			//SI USARA CLASE INTERNA
			//EspecialidadModel.EspecialidadFocusTraversalPolicy especialidadFocusTraversalPolicy = especialidadModel.new EspecialidadFocusTraversalPolicy(this);
			
			//especialidadFocusTraversalPolicy.setespecialidadJInternalFrame(this);
			
			this.setFocusTraversalPolicy(especialidadModel);
			
			
			this.jContentPaneDetalleEspecialidad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleEspecialidad = new GridBagLayout();	
			this.jContentPaneDetalleEspecialidad.setLayout(gridaBagLayoutDetalleEspecialidad);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEspecialidad = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsEspecialidad = new GridBagConstraints();
				this.gridBagConstraintsEspecialidad.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsEspecialidad.gridx = 0;
					
				
				this.jContentPaneDetalleEspecialidad.add(jTtoolBarDetalleEspecialidad, gridBagConstraintsEspecialidad);								
				
}
			
			this.jScrollPanelDatosEdicionEspecialidad=   new JScrollPane(jContentPaneDetalleEspecialidad,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEspecialidad.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEspecialidad.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEspecialidad.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralEspecialidad=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEspecialidad.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEspecialidad.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEspecialidad.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEspecialidad = new GridBagConstraints();
			
			
	        this.gridBagConstraintsEspecialidad.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsEspecialidad.gridx = 0;
	        
			this.jContentPaneDetalleEspecialidad.add(jPanelCamposEspecialidad, gridBagConstraintsEspecialidad);
			
			
			
			
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
						&& especialidadSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.especialidadSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsEspecialidad= new GridBagConstraints();
						this.gridBagConstraintsEspecialidad.gridy = iGridyRelaciones++;
						this.gridBagConstraintsEspecialidad.gridx = 0;
						this.jContentPaneDetalleEspecialidad.add(this.jTabbedPaneRelacionesEspecialidad, this.gridBagConstraintsEspecialidad);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesEspecialidad.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosEspecialidad.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsEspecialidad = new GridBagConstraints();
					this.gridBagConstraintsEspecialidad.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsEspecialidad.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsEspecialidad.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsEspecialidad.gridx = 0;
					
				
					this.jContentPaneDetalleEspecialidad.add(jPanelCamposOcultosEspecialidad, gridBagConstraintsEspecialidad);
				
					this.jPanelCamposOcultosEspecialidad.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsEspecialidad = new GridBagConstraints();
			this.gridBagConstraintsEspecialidad.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsEspecialidad.gridx = 0;
	        this.gridBagConstraintsEspecialidad.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleEspecialidad.add(this.jPanelAccionesFormularioEspecialidad, this.gridBagConstraintsEspecialidad);							
			
			
			
			this.gridBagConstraintsEspecialidad = new GridBagConstraints();
	        this.gridBagConstraintsEspecialidad.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsEspecialidad.gridx = 0;
	        
			
			this.jContentPaneDetalleEspecialidad.add(this.jPanelAccionesEspecialidad, this.gridBagConstraintsEspecialidad);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionEspecialidad);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionEspecialidad=   new JScrollPane(this.jPanelCamposEspecialidad,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEspecialidad.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEspecialidad.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEspecialidad.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsEspecialidad = new GridBagConstraints();
			this.gridBagConstraintsEspecialidad.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsEspecialidad.gridx = 0;
			this.gridBagConstraintsEspecialidad.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsEspecialidad.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsEspecialidad.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionEspecialidad, this.gridBagConstraintsEspecialidad);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsEspecialidad = new GridBagConstraints();
			this.gridBagConstraintsEspecialidad.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEspecialidad.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioEspecialidad, this.gridBagConstraintsEspecialidad);			
			
			this.gridBagConstraintsEspecialidad = new GridBagConstraints();
			this.gridBagConstraintsEspecialidad.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEspecialidad.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesEspecialidad, this.gridBagConstraintsEspecialidad);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsEspecialidad = new GridBagConstraints();
		this.gridBagConstraintsEspecialidad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEspecialidad.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEspecialidad, this.gridBagConstraintsEspecialidad);
			
			
		this.gridBagConstraintsEspecialidad = new GridBagConstraints();
		this.gridBagConstraintsEspecialidad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEspecialidad.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEspecialidad, this.gridBagConstraintsEspecialidad);
		
			
		this.gridBagConstraintsEspecialidad = new GridBagConstraints();
		this.gridBagConstraintsEspecialidad.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEspecialidad.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEspecialidad, this.gridBagConstraintsEspecialidad);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralEspecialidad;//jContentPane;
		
		return jScrollPanelDatosEdicionEspecialidad;
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
