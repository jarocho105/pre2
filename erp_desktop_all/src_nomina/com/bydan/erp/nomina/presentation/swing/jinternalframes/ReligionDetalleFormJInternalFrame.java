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
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.nomina.util.ReligionConstantesFunciones;

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
public class ReligionDetalleFormJInternalFrame extends ReligionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleReligion;
	
	protected JMenuBar jmenuBarDetalleReligion;
	
	protected JMenu jmenuDetalleReligion;
	protected JMenu jmenuDetalleArchivoReligion;
	protected JMenu jmenuDetalleAccionesReligion;
	protected JMenu jmenuDetalleDatosReligion;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleReligion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutReligion;	
	protected GridBagConstraints gridBagConstraintsReligion;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ReligionBeanSwingJInternalFrameAdditional jInternalFrameDetalleReligion;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public ReligionSessionBean religionSessionBean;
	
	

	public EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame=null;
	public EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteEmpleado=false;
	public EmpleadoSessionBean empleadoSessionBean;
	
		
	
	public ReligionLogic religionLogic;
	
	public JScrollPane jScrollPanelDatosReligion;
	public JScrollPane jScrollPanelDatosEdicionReligion;
	public JScrollPane jScrollPanelDatosGeneralReligion;
	
	protected JPanel jPanelCamposReligion;    
	protected JPanel jPanelCamposOcultosReligion;    	
	protected JPanel jPanelAccionesReligion;
	protected JPanel jPanelAccionesFormularioReligion;
    
	
	
	protected Integer iXPanelCamposReligion=0;
	protected Integer iYPanelCamposReligion=0;
	
	protected Integer iXPanelCamposOcultosReligion=0;
	protected Integer iYPanelCamposOcultosReligion=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoReligion;
	public JButton jButtonModificarReligion;
	public JButton jButtonActualizarReligion;
    public JButton jButtonEliminarReligion;
	public JButton jButtonCancelarReligion;
    public JButton jButtonGuardarCambiosReligion;
	public JButton jButtonGuardarCambiosTablaReligion;
	protected JButton jButtonCerrarReligion;
	
	
	protected JButton jButtonProcesarInformacionReligion;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoReligion;
	protected JCheckBox jCheckBoxPostAccionSinCerrarReligion;
	protected JCheckBox jCheckBoxPostAccionSinMensajeReligion;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarReligion;
	protected JButton jButtonModificarToolBarReligion;
	protected JButton jButtonActualizarToolBarReligion;
    protected JButton jButtonEliminarToolBarReligion;
	protected JButton jButtonCancelarToolBarReligion;
    protected JButton jButtonGuardarCambiosToolBarReligion;
	protected JButton jButtonGuardarCambiosTablaToolBarReligion;
	protected JButton jButtonMostrarOcultarTablaToolBarReligion;
	protected JButton jButtonCerrarToolBarReligion;
	
	protected JButton jButtonProcesarInformacionToolBarReligion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoReligion;
	protected JMenuItem jMenuItemModificarReligion;
	protected JMenuItem jMenuItemActualizarReligion;
    protected JMenuItem jMenuItemEliminarReligion;
	protected JMenuItem jMenuItemCancelarReligion;
    protected JMenuItem jMenuItemGuardarCambiosReligion;
	protected JMenuItem jMenuItemGuardarCambiosTablaReligion;
	protected JMenuItem jMenuItemCerrarReligion;
	protected JMenuItem jMenuItemDetalleCerrarReligion;
	protected JMenuItem jMenuItemDetalleMostarOcultarReligion;
	
	protected JMenuItem jMenuItemProcesarInformacionReligion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosReligion;
	protected JMenuItem jMenuItemMostrarOcultarReligion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesReligion;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesReligion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesReligion;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioReligion;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidReligion;
	public JLabel jLabelIdReligion;
	public JLabel jLabelidReligion;
	public JButton jButtonidReligionBusqueda= new JButtonMe();

	public JPanel jPanelcodigoReligion;
	public JLabel jLabelcodigoReligion;
	public JTextField jTextFieldcodigoReligion;
	public JButton jButtoncodigoReligionBusqueda= new JButtonMe();

	public JPanel jPanelnombreReligion;
	public JLabel jLabelnombreReligion;
	public JTextArea jTextAreanombreReligion;
	public JScrollPane jscrollPanenombreReligion;
	public JButton jButtonnombreReligionBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesReligion;
	
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
	public int iHeightFormulario=418;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ReligionDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposReligion=new JPanel();
				this.jPanelAccionesFormularioReligion=new JPanel();
				this.jmenuBarDetalleReligion=new JMenuBar();
				this.jTtoolBarDetalleReligion=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ReligionDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Religion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ReligionDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Religion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ReligionDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Religion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ReligionDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Religion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ReligionDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Religion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarReligion() {
		return this.jButtonActualizarToolBarReligion;
	}
	
	public JButton getjButtonEliminarToolBarReligion() {
		return this.jButtonEliminarToolBarReligion;
	}
	
	public JButton getjButtonCancelarToolBarReligion() {
		return this.jButtonCancelarToolBarReligion;
	}		
	
	public JButton getjButtonProcesarInformacionReligion() {
		return this.jButtonProcesarInformacionReligion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionReligion)	{
		this.jButtonProcesarInformacionReligion = jButtonProcesarInformacionReligion;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesReligion() {
		return this.jComboBoxTiposAccionesReligion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesReligion(
			JComboBox jComboBoxTiposRelacionesReligion) {
		this.jComboBoxTiposRelacionesReligion = jComboBoxTiposRelacionesReligion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesReligion(
			JComboBox jComboBoxTiposAccionesReligion) {
		this.jComboBoxTiposAccionesReligion = jComboBoxTiposAccionesReligion;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioReligion() {
		return this.jComboBoxTiposAccionesFormularioReligion;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioReligion(
			JComboBox jComboBoxTiposAccionesFormularioReligion) {
		this.jComboBoxTiposAccionesFormularioReligion = jComboBoxTiposAccionesFormularioReligion;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.religionSessionBean=new ReligionSessionBean();
		
		this.religionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.religionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.religionSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.empleadoSessionBean=new EmpleadoSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ReligionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ReligionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ReligionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Religion MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.religionSessionBean.getEsGuardarRelacionado()) {
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
	
		ReligionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleReligion= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarReligion=new JButtonMe();
				this.jButtonModificarToolBarReligion=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarReligion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarReligion,this.jTtoolBarDetalleReligion,
							"actualizar","actualizar","Actualizar"+" "+ReligionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarReligion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarReligion,this.jTtoolBarDetalleReligion,
							"eliminar","eliminar","Eliminar"+" "+ReligionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarReligion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarReligion,this.jTtoolBarDetalleReligion,
							"cancelar","cancelar","Cancelar"+" "+ReligionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarReligion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarReligion,this.jTtoolBarDetalleReligion,
							"guardarcambios","guardarcambios","Guardar"+" "+ReligionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarReligion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarReligion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarReligion,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleReligion=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleReligion=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoReligion=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesReligion=new JMenuMe("Acciones");
		this.jmenuDetalleDatosReligion=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoReligion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoReligion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoReligion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoReligion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarReligion= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarReligion.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarReligion,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarReligion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarReligion= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarReligion.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarReligion,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarReligion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarReligion= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarReligion.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarReligion,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarReligion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarReligion= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarReligion.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarReligion,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarReligion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosReligion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosReligion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosReligion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosReligion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarReligion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarReligion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarReligion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarReligion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarReligion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarReligion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarReligion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarReligion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarReligion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarReligion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarReligion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarReligion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarReligion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarReligion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarReligion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarReligion, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoReligion.add(this.jMenuItemDetalleCerrarReligion);
		
		this.jmenuDetalleAccionesReligion.add(this.jMenuItemActualizarReligion);
		this.jmenuDetalleAccionesReligion.add(this.jMenuItemEliminarReligion);
		this.jmenuDetalleAccionesReligion.add(this.jMenuItemCancelarReligion);		
		
		//this.jmenuDetalleDatosReligion.add(this.jMenuItemDetalleAbrirOrderByReligion);				
		this.jmenuDetalleDatosReligion.add(this.jMenuItemDetalleMostarOcultarReligion);				
				
		//this.jmenuDetalleAccionesReligion.add(this.jMenuItemGuardarCambiosReligion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoReligion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesReligion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosReligion, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleReligion.add(this.jmenuDetalleArchivoReligion);		
		this.jmenuBarDetalleReligion.add(this.jmenuDetalleAccionesReligion);		
		this.jmenuBarDetalleReligion.add(this.jmenuDetalleDatosReligion);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleReligion, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleReligion.add(this.jmenuDetalleReligion);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleReligion);				
	}
	
	
	public void inicializarElementosCamposReligion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdReligion = new JLabelMe();
		jLabelIdReligion.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdReligion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdReligion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdReligion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdReligion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidReligion = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidReligion.setToolTipText(ReligionConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutReligion= new GridBagLayout();

		this.jPanelidReligion.setLayout(this.gridaBagLayoutReligion);

		jLabelidReligion = new JLabel();
		jLabelidReligion.setText("Id");

		jLabelidReligion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidReligion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidReligion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoReligion = new JLabelMe();
		this.jLabelcodigoReligion.setText(""+ReligionConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoReligion.setToolTipText("Codigo");
		this.jLabelcodigoReligion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoReligion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoReligion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoReligion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoReligion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoReligion.setToolTipText(ReligionConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutReligion = new GridBagLayout();
		this.jPanelcodigoReligion.setLayout(this.gridaBagLayoutReligion);


		jTextFieldcodigoReligion= new JTextFieldMe();

		jTextFieldcodigoReligion.setEnabled(false);
		jTextFieldcodigoReligion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoReligion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoReligion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoReligion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoReligionBusqueda= new JButtonMe();
		this.jButtoncodigoReligionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoReligionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoReligionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoReligionBusqueda.setText("U");
		this.jButtoncodigoReligionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoReligionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoReligionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoReligion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoReligion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoReligionBusqueda"));

		if(this.religionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoReligionBusqueda.setVisible(false);		}


					
		this.jLabelnombreReligion = new JLabelMe();
		this.jLabelnombreReligion.setText(""+ReligionConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreReligion.setToolTipText("Nombre");
		this.jLabelnombreReligion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreReligion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreReligion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreReligion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreReligion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreReligion.setToolTipText(ReligionConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutReligion = new GridBagLayout();
		this.jPanelnombreReligion.setLayout(this.gridaBagLayoutReligion);


		jTextAreanombreReligion= new JTextAreaMe();
		jTextAreanombreReligion.setEnabled(false);
		jTextAreanombreReligion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreReligion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreReligion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreReligion.setLineWrap(true);
		jTextAreanombreReligion.setWrapStyleWord(true);
		jTextAreanombreReligion.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreReligion.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreReligion,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreReligion = new JScrollPane(jTextAreanombreReligion);
		jscrollPanenombreReligion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreReligion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreReligion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreReligionBusqueda= new JButtonMe();
		this.jButtonnombreReligionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreReligionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreReligionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreReligionBusqueda.setText("U");
		this.jButtonnombreReligionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreReligionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreReligionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreReligion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreReligion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreReligionBusqueda"));

		if(this.religionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreReligionBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysReligion() {
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
		//this.jInternalFrameDetalleReligion = new ReligionBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Religion DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutReligion= new GridBagLayout();
		

		
		String sToolTipReligion="";
		sToolTipReligion=ReligionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipReligion+="(Nomina.Religion)";
		}
		
		if(!this.religionSessionBean.getEsGuardarRelacionado()) {
			sToolTipReligion+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoReligion = new JButtonMe();
		this.jButtonModificarReligion = new JButtonMe();
        this.jButtonActualizarReligion = new JButtonMe();
        this.jButtonEliminarReligion = new JButtonMe();
        this.jButtonCancelarReligion = new JButtonMe();
        this.jButtonGuardarCambiosReligion = new JButtonMe();
		this.jButtonGuardarCambiosTablaReligion = new JButtonMe();
		this.jButtonCerrarReligion = new JButtonMe();
		
		this.jScrollPanelDatosReligion = new JScrollPane();   
        this.jScrollPanelDatosEdicionReligion = new JScrollPane();
		this.jScrollPanelDatosGeneralReligion = new JScrollPane();
				
		
		
		this.jPanelCamposReligion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosReligion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesReligion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioReligion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Religion";
		
		if(!this.religionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosReligion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Religiones" + this.sPath));
		} else {
			this.jScrollPanelDatosReligion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionReligion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralReligion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposReligion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposReligion.setName("jPanelCamposReligion"); 

		this.jPanelCamposOcultosReligion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosReligion.setName("jPanelCamposOcultosReligion"); 

        this.jPanelAccionesReligion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesReligion.setToolTipText("Acciones");
        this.jPanelAccionesReligion.setName("Acciones"); 

		this.jPanelAccionesFormularioReligion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioReligion.setToolTipText("Acciones");
        this.jPanelAccionesFormularioReligion.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionReligion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralReligion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosReligion, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposReligion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosReligion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioReligion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoReligion.setText("Nuevo");
		this.jButtonModificarReligion.setText("Editar");
        this.jButtonActualizarReligion.setText("Actualizar");
        this.jButtonEliminarReligion.setText("Eliminar");
        this.jButtonCancelarReligion.setText("Cancelar");
        this.jButtonGuardarCambiosReligion.setText("Guardar");
		this.jButtonGuardarCambiosTablaReligion.setText("Guardar");
		this.jButtonCerrarReligion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoReligion,"nuevo_button","Nuevo",this.religionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarReligion,"modificar_button","Editar",this.religionSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarReligion,"actualizar_button","Actualizar",this.religionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarReligion,"eliminar_button","Eliminar",this.religionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarReligion,"cancelar_button","Cancelar",this.religionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosReligion,"guardarcambios_button","Guardar",this.religionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaReligion,"guardarcambiostabla_button","Guardar",this.religionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarReligion,"cerrar_button","Salir",this.religionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoReligion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarReligion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosReligion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaReligion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarReligion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarReligion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarReligion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarReligion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoReligion.setToolTipText("Nuevo"+" "+ReligionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarReligion.setToolTipText("Editar"+" "+ReligionConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarReligion.setToolTipText("Actualizar"+" "+ReligionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarReligion.setToolTipText("Eliminar)"+" "+ReligionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarReligion.setToolTipText("Cancelar"+" "+ReligionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosReligion.setToolTipText("Guardar"+" "+ReligionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaReligion.setToolTipText("Guardar"+" "+ReligionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarReligion.setToolTipText("Salir"+" "+ReligionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoReligion";
		inputMap = this.jButtonNuevoReligion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoReligion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoReligion"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarReligion";
		inputMap = this.jButtonActualizarReligion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarReligion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarReligion"));
		
		//ELIMINAR
		sMapKey = "EliminarReligion";
		inputMap = this.jButtonEliminarReligion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarReligion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarReligion"));
		
		//CANCELAR	
		sMapKey = "CancelarReligion";
		inputMap = this.jButtonCancelarReligion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarReligion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarReligion"));
		
		//CERRAR		
		sMapKey = "CerrarReligion";
		inputMap = this.jButtonCerrarReligion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarReligion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarReligion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaReligion";
		inputMap = this.jButtonGuardarCambiosTablaReligion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaReligion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaReligion"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoReligion = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoReligion.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoReligion.setToolTipText("Nuevo Religion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoReligion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarReligion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarReligion.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarReligion.setToolTipText("Sin Cerrar Ventana Religion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarReligion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeReligion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeReligion.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeReligion.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeReligion, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesReligion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesReligion.setText("Accion");
		this.jComboBoxTiposAccionesReligion.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioReligion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioReligion.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioReligion.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesReligion = new JLabelMe();
		
		this.jLabelAccionesReligion.setText("Acciones");		
		this.jLabelAccionesReligion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesReligion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesReligion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposReligion();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysReligion();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesReligion=new JTabbedPane();
		this.jTabbedPaneRelacionesReligion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesReligion,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesReligion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesReligion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesReligion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesReligion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioReligion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioReligion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioReligion.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioReligion, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposReligion = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosReligion = new GridBagLayout();
		
		this.jPanelCamposReligion.setLayout(gridaBagLayoutCamposReligion);
		this.jPanelCamposOcultosReligion.setLayout(gridaBagLayoutCamposOcultosReligion);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsReligion = new GridBagConstraints();
	this.gridBagConstraintsReligion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReligion.gridy = 0;
	this.gridBagConstraintsReligion.gridx = 0;
	this.gridBagConstraintsReligion.ipadx = 0;
	this.gridBagConstraintsReligion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidReligion.add(jLabelIdReligion, this.gridBagConstraintsReligion);



	this.gridBagConstraintsReligion = new GridBagConstraints();
	this.gridBagConstraintsReligion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReligion.gridy = 0;
	this.gridBagConstraintsReligion.gridx = 1;
	this.gridBagConstraintsReligion.ipadx = 0;
	this.gridBagConstraintsReligion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidReligion.add(jLabelidReligion, this.gridBagConstraintsReligion);


	this.gridBagConstraintsReligion = new GridBagConstraints();
	this.gridBagConstraintsReligion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReligion.gridy = 0;
	this.gridBagConstraintsReligion.gridx = 0;
	this.gridBagConstraintsReligion.ipadx = 0;
	this.gridBagConstraintsReligion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoReligion.add(jLabelcodigoReligion, this.gridBagConstraintsReligion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReligion = new GridBagConstraints();
		//this.gridBagConstraintsReligion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReligion.gridy = 0;
		this.gridBagConstraintsReligion.gridx = 2;
		this.gridBagConstraintsReligion.ipadx = 0;
		this.gridBagConstraintsReligion.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoReligion.add(jButtoncodigoReligionBusqueda, this.gridBagConstraintsReligion);
	}

	this.gridBagConstraintsReligion = new GridBagConstraints();
	this.gridBagConstraintsReligion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReligion.gridy = 0;
	this.gridBagConstraintsReligion.gridx = 1;
	this.gridBagConstraintsReligion.ipadx = 0;
	this.gridBagConstraintsReligion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoReligion.add(jTextFieldcodigoReligion, this.gridBagConstraintsReligion);


	this.gridBagConstraintsReligion = new GridBagConstraints();
	this.gridBagConstraintsReligion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReligion.gridy = 0;
	this.gridBagConstraintsReligion.gridx = 0;
	this.gridBagConstraintsReligion.ipadx = 0;
	this.gridBagConstraintsReligion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreReligion.add(jLabelnombreReligion, this.gridBagConstraintsReligion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsReligion = new GridBagConstraints();
		//this.gridBagConstraintsReligion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsReligion.gridy = 0;
		this.gridBagConstraintsReligion.gridx = 2;
		this.gridBagConstraintsReligion.ipadx = 0;
		this.gridBagConstraintsReligion.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreReligion.add(jButtonnombreReligionBusqueda, this.gridBagConstraintsReligion);
	}

	this.gridBagConstraintsReligion = new GridBagConstraints();
	this.gridBagConstraintsReligion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsReligion.gridy = 0;
	this.gridBagConstraintsReligion.gridx = 1;
	this.gridBagConstraintsReligion.ipadx = 0;
	this.gridBagConstraintsReligion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreReligion.add(jscrollPanenombreReligion, this.gridBagConstraintsReligion);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsReligion = new GridBagConstraints();
	this.gridBagConstraintsReligion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsReligion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsReligion.gridy = iYPanelCamposReligion;
	this.gridBagConstraintsReligion.gridx = iXPanelCamposReligion++;
	this.gridBagConstraintsReligion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsReligion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposReligion.add(this.jPanelidReligion, this.gridBagConstraintsReligion);



	if(iXPanelCamposReligion % 1==0) {
		iXPanelCamposReligion=0;
		iYPanelCamposReligion++;
	}
	this.gridBagConstraintsReligion = new GridBagConstraints();
	this.gridBagConstraintsReligion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsReligion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsReligion.gridy = iYPanelCamposReligion;
	this.gridBagConstraintsReligion.gridx = iXPanelCamposReligion++;
	this.gridBagConstraintsReligion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsReligion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposReligion.add(this.jPanelcodigoReligion, this.gridBagConstraintsReligion);



	if(iXPanelCamposReligion % 1==0) {
		iXPanelCamposReligion=0;
		iYPanelCamposReligion++;
	}
	this.gridBagConstraintsReligion = new GridBagConstraints();
	this.gridBagConstraintsReligion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsReligion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsReligion.gridy = iYPanelCamposReligion;
	this.gridBagConstraintsReligion.gridx = iXPanelCamposReligion++;
	this.gridBagConstraintsReligion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsReligion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposReligion.add(this.jPanelnombreReligion, this.gridBagConstraintsReligion);



	if(iXPanelCamposReligion % 1==0) {
		iXPanelCamposReligion=0;
		iYPanelCamposReligion++;
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
			
		GridBagLayout gridaBagLayoutAccionesReligion= new GridBagLayout();
		this.jPanelAccionesReligion.setLayout(gridaBagLayoutAccionesReligion);
		
		GridBagLayout gridaBagLayoutAccionesFormularioReligion= new GridBagLayout();
		this.jPanelAccionesFormularioReligion.setLayout(gridaBagLayoutAccionesFormularioReligion);
		
		this.gridBagConstraintsReligion = new GridBagConstraints();
		this.gridBagConstraintsReligion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsReligion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioReligion.add(this.jComboBoxTiposAccionesFormularioReligion, this.gridBagConstraintsReligion);

		this.gridBagConstraintsReligion = new GridBagConstraints();
		this.gridBagConstraintsReligion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsReligion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioReligion.add(this.jCheckBoxPostAccionNuevoReligion, this.gridBagConstraintsReligion);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.religionSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsReligion = new GridBagConstraints();
			this.gridBagConstraintsReligion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsReligion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioReligion.add(this.jCheckBoxPostAccionSinCerrarReligion, this.gridBagConstraintsReligion);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.religionSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.religionSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsReligion = new GridBagConstraints();
			this.gridBagConstraintsReligion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsReligion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioReligion.add(this.jCheckBoxPostAccionSinMensajeReligion, this.gridBagConstraintsReligion);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsReligion = new GridBagConstraints();
		this.gridBagConstraintsReligion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsReligion.gridy = 0;
		this.gridBagConstraintsReligion.gridx = iPosXAccion++;
			
		this.jPanelAccionesReligion.add(this.jButtonModificarReligion, this.gridBagConstraintsReligion);							

		this.gridBagConstraintsReligion = new GridBagConstraints();
		this.gridBagConstraintsReligion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsReligion.gridy = 0;
		this.gridBagConstraintsReligion.gridx =iPosXAccion++;
			
		this.jPanelAccionesReligion.add(this.jButtonEliminarReligion, this.gridBagConstraintsReligion);
		
			
		this.gridBagConstraintsReligion = new GridBagConstraints();
		this.gridBagConstraintsReligion.gridy = 0;		
		this.gridBagConstraintsReligion.gridx = iPosXAccion++;
		
		this.jPanelAccionesReligion.add(this.jButtonActualizarReligion, this.gridBagConstraintsReligion);


		this.gridBagConstraintsReligion = new GridBagConstraints();
		this.gridBagConstraintsReligion.gridy = 0;		
		this.gridBagConstraintsReligion.gridx = iPosXAccion++;
		
		this.jPanelAccionesReligion.add(this.jButtonGuardarCambiosReligion, this.gridBagConstraintsReligion);	
		
		this.gridBagConstraintsReligion = new GridBagConstraints();
		this.gridBagConstraintsReligion.gridy = 0;		
		this.gridBagConstraintsReligion.gridx =iPosXAccion++;
		
		this.jPanelAccionesReligion.add(this.jButtonCancelarReligion, this.gridBagConstraintsReligion);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutReligion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutReligion);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.religionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsReligion = new GridBagConstraints();						
			this.gridBagConstraintsReligion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsReligion.gridx = 0;		
			//this.gridBagConstraintsReligion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsReligion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsReligion.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsReligion = new GridBagConstraints();
		this.gridBagConstraintsReligion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsReligion.gridx =0;
		this.gridBagConstraintsReligion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsReligion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosReligion, this.gridBagConstraintsReligion);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ReligionJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleReligion = new ReligionBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Religion DATOS");
			
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
			
	        //this.setTitle("[FOR] - Religion DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Religion Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ReligionModel religionModel=new ReligionModel(this);
			
			//SI USARA CLASE INTERNA
			//ReligionModel.ReligionFocusTraversalPolicy religionFocusTraversalPolicy = religionModel.new ReligionFocusTraversalPolicy(this);
			
			//religionFocusTraversalPolicy.setreligionJInternalFrame(this);
			
			this.setFocusTraversalPolicy(religionModel);
			
			
			this.jContentPaneDetalleReligion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleReligion = new GridBagLayout();	
			this.jContentPaneDetalleReligion.setLayout(gridaBagLayoutDetalleReligion);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosReligion = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsReligion = new GridBagConstraints();
				this.gridBagConstraintsReligion.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsReligion.gridx = 0;
					
				
				this.jContentPaneDetalleReligion.add(jTtoolBarDetalleReligion, gridBagConstraintsReligion);								
				
}
			
			this.jScrollPanelDatosEdicionReligion=   new JScrollPane(jContentPaneDetalleReligion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionReligion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionReligion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionReligion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralReligion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralReligion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralReligion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralReligion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsReligion = new GridBagConstraints();
			
			
	        this.gridBagConstraintsReligion.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsReligion.gridx = 0;
	        
			this.jContentPaneDetalleReligion.add(jPanelCamposReligion, gridBagConstraintsReligion);
			
			
			
			
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
						&& religionSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameEmpleado(this.puedeCargarPorParteEmpleado,false,-1);
					
					if(this.religionSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsReligion= new GridBagConstraints();
						this.gridBagConstraintsReligion.gridy = iGridyRelaciones++;
						this.gridBagConstraintsReligion.gridx = 0;
						this.jContentPaneDetalleReligion.add(this.jTabbedPaneRelacionesReligion, this.gridBagConstraintsReligion);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesReligion.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameEmpleado(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosReligion.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsReligion = new GridBagConstraints();
					this.gridBagConstraintsReligion.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsReligion.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsReligion.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsReligion.gridx = 0;
					
				
					this.jContentPaneDetalleReligion.add(jPanelCamposOcultosReligion, gridBagConstraintsReligion);
				
					this.jPanelCamposOcultosReligion.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsReligion = new GridBagConstraints();
			this.gridBagConstraintsReligion.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsReligion.gridx = 0;
	        this.gridBagConstraintsReligion.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleReligion.add(this.jPanelAccionesFormularioReligion, this.gridBagConstraintsReligion);							
			
			
			
			this.gridBagConstraintsReligion = new GridBagConstraints();
	        this.gridBagConstraintsReligion.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsReligion.gridx = 0;
	        
			
			this.jContentPaneDetalleReligion.add(this.jPanelAccionesReligion, this.gridBagConstraintsReligion);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionReligion);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionReligion=   new JScrollPane(this.jPanelCamposReligion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionReligion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionReligion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionReligion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsReligion = new GridBagConstraints();
			this.gridBagConstraintsReligion.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsReligion.gridx = 0;
			this.gridBagConstraintsReligion.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsReligion.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsReligion.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionReligion, this.gridBagConstraintsReligion);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsReligion = new GridBagConstraints();
			this.gridBagConstraintsReligion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsReligion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioReligion, this.gridBagConstraintsReligion);			
			
			this.gridBagConstraintsReligion = new GridBagConstraints();
			this.gridBagConstraintsReligion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsReligion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesReligion, this.gridBagConstraintsReligion);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsReligion = new GridBagConstraints();
		this.gridBagConstraintsReligion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsReligion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposReligion, this.gridBagConstraintsReligion);
			
			
		this.gridBagConstraintsReligion = new GridBagConstraints();
		this.gridBagConstraintsReligion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsReligion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosReligion, this.gridBagConstraintsReligion);
		
			
		this.gridBagConstraintsReligion = new GridBagConstraints();
		this.gridBagConstraintsReligion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsReligion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesReligion, this.gridBagConstraintsReligion);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralReligion;//jContentPane;
		
		return jScrollPanelDatosEdicionReligion;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameEmpleado(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.empleadoSessionBean=new EmpleadoSessionBean();
		this.empleadoSessionBean.setConGuardarRelaciones(false);
		this.empleadoSessionBean.setEsGuardarRelacionado(true);

		this.empleadoBeanSwingJInternalFrame=null;//new EmpleadoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.empleadoBeanSwingJInternalFramePopup=new EmpleadoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.empleadoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.empleadoSessionBean.getEsGuardarRelacionado()) {

				EmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL=ReligionJInternalFrame.STIPO_TAMANIO_GENERAL;
				EmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ReligionJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.empleadoSessionBean.setEsGuardarRelacionado(true);

				this.empleadoBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.empleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.empleadoBeanSwingJInternalFrame.setempleadoSessionBean(this.empleadoSessionBean);

				//this.gridBagConstraintsReligion = new GridBagConstraints();
				//this.gridBagConstraintsReligion.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsReligion.gridx = 0;
				//this.jContentPaneDetalleReligion.add(this.empleadoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsReligion);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesReligion.add("Empleados",this.empleadoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesReligion.setComponentAt(iIndexTab,this.empleadoBeanSwingJInternalFrame.getContentPane());
				}

				//EmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.empleadoSessionBean.setEsGuardarRelacionado(false);
				this.empleadoBeanSwingJInternalFrame=null;//new EmpleadoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.empleadoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteEmpleado) {
					this.jTabbedPaneRelacionesReligion.add("Empleados",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarEmpleadoBeanSwingJInternalFrame(List<Religion> religions,Religion religion,EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//empleadoBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					empleadoBeanSwingJInternalFrame.getEmpleadoLogic().setConnexion(this.religionLogic.getConnexion());

					empleadoBeanSwingJInternalFrame.setreligionsForeignKey(religions);
					empleadoBeanSwingJInternalFrame.setreligionForeignKey(religion);
					empleadoBeanSwingJInternalFrame.empleadoSessionBean.setisBusquedaDesdeForeignKeySesionReligion(true);
					empleadoBeanSwingJInternalFrame.empleadoSessionBean.setlidReligionActual(religion.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					empleadoBeanSwingJInternalFrame.cargarCombosForeignKeyEmpleado(empleadoBeanSwingJInternalFrame.isCargarCombosDependencia);
					empleadoBeanSwingJInternalFrame.setVisibilidadBusquedasParaReligion(true);
					empleadoBeanSwingJInternalFrame.setid_religionFK_IdReligion(religion.getId());

					if(!this.conCargarFormDetalle) {
						empleadoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					empleadoBeanSwingJInternalFrame.setSelectedItemCombosFrameReligionForeignKey(religion,1,false,true,true);
					empleadoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					empleadoBeanSwingJInternalFrame.procesarBusqueda("FK_IdReligion");
					empleadoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdReligion");
					empleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleado(true);
					empleadoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesEmpleado("n",empleadoBeanSwingJInternalFrame.isGuardarCambiosEnLote, empleadoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					empleadoBeanSwingJInternalFrame.setAutoscrolls(true);
					empleadoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						empleadoBeanSwingJInternalFrame.actualizarEstadoPanelsEmpleado("relacionado");
					} else {
						empleadoBeanSwingJInternalFrame.actualizarEstadoPanelsEmpleado("no_relacionado");
					}

					empleadoBeanSwingJInternalFrame.getjButtonRecargarInformacionEmpleado().setVisible(false);

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
