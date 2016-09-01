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
package com.bydan.erp.cartera.presentation.swing.jinternalframes;



import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;



//import com.bydan.erp.cartera.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.cartera.util.ParametroFuncionalConstantesFunciones;

import com.bydan.erp.cartera.business.logic.*;
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
public class ParametroFuncionalDetalleFormJInternalFrame extends ParametroFuncionalBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleParametroFuncional;
	
	protected JMenuBar jmenuBarDetalleParametroFuncional;
	
	protected JMenu jmenuDetalleParametroFuncional;
	protected JMenu jmenuDetalleArchivoParametroFuncional;
	protected JMenu jmenuDetalleAccionesParametroFuncional;
	protected JMenu jmenuDetalleDatosParametroFuncional;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleParametroFuncional = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutParametroFuncional;	
	protected GridBagConstraints gridBagConstraintsParametroFuncional;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ParametroFuncionalBeanSwingJInternalFrameAdditional jInternalFrameDetalleParametroFuncional;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public ParametroFuncionalSessionBean parametrofuncionalSessionBean;
	
	
	
		
	
	public ParametroFuncionalLogic parametrofuncionalLogic;
	
	public JScrollPane jScrollPanelDatosParametroFuncional;
	public JScrollPane jScrollPanelDatosEdicionParametroFuncional;
	public JScrollPane jScrollPanelDatosGeneralParametroFuncional;
	
	protected JPanel jPanelCamposParametroFuncional;    
	protected JPanel jPanelCamposOcultosParametroFuncional;    	
	protected JPanel jPanelAccionesParametroFuncional;
	protected JPanel jPanelAccionesFormularioParametroFuncional;
    
	
	
	protected Integer iXPanelCamposParametroFuncional=0;
	protected Integer iYPanelCamposParametroFuncional=0;
	
	protected Integer iXPanelCamposOcultosParametroFuncional=0;
	protected Integer iYPanelCamposOcultosParametroFuncional=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoParametroFuncional;
	public JButton jButtonModificarParametroFuncional;
	public JButton jButtonActualizarParametroFuncional;
    public JButton jButtonEliminarParametroFuncional;
	public JButton jButtonCancelarParametroFuncional;
    public JButton jButtonGuardarCambiosParametroFuncional;
	public JButton jButtonGuardarCambiosTablaParametroFuncional;
	protected JButton jButtonCerrarParametroFuncional;
	
	
	protected JButton jButtonProcesarInformacionParametroFuncional;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoParametroFuncional;
	protected JCheckBox jCheckBoxPostAccionSinCerrarParametroFuncional;
	protected JCheckBox jCheckBoxPostAccionSinMensajeParametroFuncional;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarParametroFuncional;
	protected JButton jButtonModificarToolBarParametroFuncional;
	protected JButton jButtonActualizarToolBarParametroFuncional;
    protected JButton jButtonEliminarToolBarParametroFuncional;
	protected JButton jButtonCancelarToolBarParametroFuncional;
    protected JButton jButtonGuardarCambiosToolBarParametroFuncional;
	protected JButton jButtonGuardarCambiosTablaToolBarParametroFuncional;
	protected JButton jButtonMostrarOcultarTablaToolBarParametroFuncional;
	protected JButton jButtonCerrarToolBarParametroFuncional;
	
	protected JButton jButtonProcesarInformacionToolBarParametroFuncional;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoParametroFuncional;
	protected JMenuItem jMenuItemModificarParametroFuncional;
	protected JMenuItem jMenuItemActualizarParametroFuncional;
    protected JMenuItem jMenuItemEliminarParametroFuncional;
	protected JMenuItem jMenuItemCancelarParametroFuncional;
    protected JMenuItem jMenuItemGuardarCambiosParametroFuncional;
	protected JMenuItem jMenuItemGuardarCambiosTablaParametroFuncional;
	protected JMenuItem jMenuItemCerrarParametroFuncional;
	protected JMenuItem jMenuItemDetalleCerrarParametroFuncional;
	protected JMenuItem jMenuItemDetalleMostarOcultarParametroFuncional;
	
	protected JMenuItem jMenuItemProcesarInformacionParametroFuncional;
	protected JMenuItem jMenuItemNuevoGuardarCambiosParametroFuncional;
	protected JMenuItem jMenuItemMostrarOcultarParametroFuncional;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesParametroFuncional;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesParametroFuncional;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesParametroFuncional;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioParametroFuncional;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidParametroFuncional;
	public JLabel jLabelIdParametroFuncional;
	public JLabel jLabelidParametroFuncional;
	public JButton jButtonidParametroFuncionalBusqueda= new JButtonMe();

	public JPanel jPanelcon_copia_clientesParametroFuncional;
	public JLabel jLabelcon_copia_clientesParametroFuncional;
	public JCheckBox jCheckBoxcon_copia_clientesParametroFuncional;
	public JButton jButtoncon_copia_clientesParametroFuncionalBusqueda= new JButtonMe();

	public JPanel jPanelcon_copia_proveedorParametroFuncional;
	public JLabel jLabelcon_copia_proveedorParametroFuncional;
	public JCheckBox jCheckBoxcon_copia_proveedorParametroFuncional;
	public JButton jButtoncon_copia_proveedorParametroFuncionalBusqueda= new JButtonMe();

	public JPanel jPanelcon_proveedor_clienteParametroFuncional;
	public JLabel jLabelcon_proveedor_clienteParametroFuncional;
	public JCheckBox jCheckBoxcon_proveedor_clienteParametroFuncional;
	public JButton jButtoncon_proveedor_clienteParametroFuncionalBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesParametroFuncional;
	
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
	
	public ParametroFuncionalDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposParametroFuncional=new JPanel();
				this.jPanelAccionesFormularioParametroFuncional=new JPanel();
				this.jmenuBarDetalleParametroFuncional=new JMenuBar();
				this.jTtoolBarDetalleParametroFuncional=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroFuncionalDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ParametroFuncional No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ParametroFuncionalDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ParametroFuncional No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroFuncionalDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroFuncional No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroFuncionalDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroFuncional No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroFuncionalDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ParametroFuncional No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarParametroFuncional() {
		return this.jButtonActualizarToolBarParametroFuncional;
	}
	
	public JButton getjButtonEliminarToolBarParametroFuncional() {
		return this.jButtonEliminarToolBarParametroFuncional;
	}
	
	public JButton getjButtonCancelarToolBarParametroFuncional() {
		return this.jButtonCancelarToolBarParametroFuncional;
	}		
	
	public JButton getjButtonProcesarInformacionParametroFuncional() {
		return this.jButtonProcesarInformacionParametroFuncional;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionParametroFuncional)	{
		this.jButtonProcesarInformacionParametroFuncional = jButtonProcesarInformacionParametroFuncional;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesParametroFuncional() {
		return this.jComboBoxTiposAccionesParametroFuncional;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesParametroFuncional(
			JComboBox jComboBoxTiposRelacionesParametroFuncional) {
		this.jComboBoxTiposRelacionesParametroFuncional = jComboBoxTiposRelacionesParametroFuncional;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesParametroFuncional(
			JComboBox jComboBoxTiposAccionesParametroFuncional) {
		this.jComboBoxTiposAccionesParametroFuncional = jComboBoxTiposAccionesParametroFuncional;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioParametroFuncional() {
		return this.jComboBoxTiposAccionesFormularioParametroFuncional;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioParametroFuncional(
			JComboBox jComboBoxTiposAccionesFormularioParametroFuncional) {
		this.jComboBoxTiposAccionesFormularioParametroFuncional = jComboBoxTiposAccionesFormularioParametroFuncional;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.parametrofuncionalSessionBean=new ParametroFuncionalSessionBean();
		
		this.parametrofuncionalSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.parametrofuncionalSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.parametrofuncionalSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ParametroFuncionalJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ParametroFuncionalJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ParametroFuncionalJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Parametro Funcional MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.parametrofuncionalSessionBean.getEsGuardarRelacionado()) {
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
	
		ParametroFuncionalJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleParametroFuncional= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarParametroFuncional=new JButtonMe();
				this.jButtonModificarToolBarParametroFuncional=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarParametroFuncional=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarParametroFuncional,this.jTtoolBarDetalleParametroFuncional,
							"actualizar","actualizar","Actualizar"+" "+ParametroFuncionalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarParametroFuncional=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarParametroFuncional,this.jTtoolBarDetalleParametroFuncional,
							"eliminar","eliminar","Eliminar"+" "+ParametroFuncionalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarParametroFuncional=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarParametroFuncional,this.jTtoolBarDetalleParametroFuncional,
							"cancelar","cancelar","Cancelar"+" "+ParametroFuncionalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarParametroFuncional=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarParametroFuncional,this.jTtoolBarDetalleParametroFuncional,
							"guardarcambios","guardarcambios","Guardar"+" "+ParametroFuncionalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarParametroFuncional,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarParametroFuncional,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarParametroFuncional,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleParametroFuncional=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleParametroFuncional=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoParametroFuncional=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesParametroFuncional=new JMenuMe("Acciones");
		this.jmenuDetalleDatosParametroFuncional=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoParametroFuncional= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoParametroFuncional.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoParametroFuncional,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoParametroFuncional, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarParametroFuncional= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarParametroFuncional.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarParametroFuncional,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarParametroFuncional, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarParametroFuncional= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarParametroFuncional.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarParametroFuncional,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarParametroFuncional, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarParametroFuncional= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarParametroFuncional.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarParametroFuncional,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarParametroFuncional, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarParametroFuncional= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarParametroFuncional.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarParametroFuncional,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarParametroFuncional, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosParametroFuncional= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosParametroFuncional.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosParametroFuncional,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosParametroFuncional, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarParametroFuncional= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarParametroFuncional.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarParametroFuncional,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarParametroFuncional, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarParametroFuncional= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarParametroFuncional.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarParametroFuncional,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarParametroFuncional, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarParametroFuncional= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarParametroFuncional.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarParametroFuncional,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarParametroFuncional, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarParametroFuncional= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarParametroFuncional.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarParametroFuncional,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarParametroFuncional, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoParametroFuncional.add(this.jMenuItemDetalleCerrarParametroFuncional);
		
		this.jmenuDetalleAccionesParametroFuncional.add(this.jMenuItemActualizarParametroFuncional);
		this.jmenuDetalleAccionesParametroFuncional.add(this.jMenuItemEliminarParametroFuncional);
		this.jmenuDetalleAccionesParametroFuncional.add(this.jMenuItemCancelarParametroFuncional);		
		
		//this.jmenuDetalleDatosParametroFuncional.add(this.jMenuItemDetalleAbrirOrderByParametroFuncional);				
		this.jmenuDetalleDatosParametroFuncional.add(this.jMenuItemDetalleMostarOcultarParametroFuncional);				
				
		//this.jmenuDetalleAccionesParametroFuncional.add(this.jMenuItemGuardarCambiosParametroFuncional);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoParametroFuncional, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesParametroFuncional, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosParametroFuncional, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleParametroFuncional.add(this.jmenuDetalleArchivoParametroFuncional);		
		this.jmenuBarDetalleParametroFuncional.add(this.jmenuDetalleAccionesParametroFuncional);		
		this.jmenuBarDetalleParametroFuncional.add(this.jmenuDetalleDatosParametroFuncional);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleParametroFuncional);				
	}
	
	
	public void inicializarElementosCamposParametroFuncional() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdParametroFuncional = new JLabelMe();
		jLabelIdParametroFuncional.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdParametroFuncional.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdParametroFuncional.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdParametroFuncional.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdParametroFuncional,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidParametroFuncional = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidParametroFuncional.setToolTipText(ParametroFuncionalConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutParametroFuncional= new GridBagLayout();

		this.jPanelidParametroFuncional.setLayout(this.gridaBagLayoutParametroFuncional);

		jLabelidParametroFuncional = new JLabel();
		jLabelidParametroFuncional.setText("Id");

		jLabelidParametroFuncional.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidParametroFuncional.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidParametroFuncional.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcon_copia_clientesParametroFuncional = new JLabelMe();
		this.jLabelcon_copia_clientesParametroFuncional.setText(""+ParametroFuncionalConstantesFunciones.LABEL_CONCOPIACLIENTES+" : *");
		this.jLabelcon_copia_clientesParametroFuncional.setToolTipText("Concopia Clientes");
		this.jLabelcon_copia_clientesParametroFuncional.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_copia_clientesParametroFuncional.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_copia_clientesParametroFuncional.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_copia_clientesParametroFuncional,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_copia_clientesParametroFuncional=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_copia_clientesParametroFuncional.setToolTipText(ParametroFuncionalConstantesFunciones.LABEL_CONCOPIACLIENTES);
		this.gridaBagLayoutParametroFuncional = new GridBagLayout();
		this.jPanelcon_copia_clientesParametroFuncional.setLayout(this.gridaBagLayoutParametroFuncional);


		jCheckBoxcon_copia_clientesParametroFuncional= new JCheckBoxMe();
		jCheckBoxcon_copia_clientesParametroFuncional.setEnabled(false);

		jCheckBoxcon_copia_clientesParametroFuncional.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_copia_clientesParametroFuncional.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_copia_clientesParametroFuncional.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_copia_clientesParametroFuncional,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_copia_clientesParametroFuncionalBusqueda= new JButtonMe();
		this.jButtoncon_copia_clientesParametroFuncionalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_copia_clientesParametroFuncionalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_copia_clientesParametroFuncionalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_copia_clientesParametroFuncionalBusqueda.setText("U");
		this.jButtoncon_copia_clientesParametroFuncionalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_copia_clientesParametroFuncionalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_copia_clientesParametroFuncionalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_copia_clientesParametroFuncional.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_copia_clientesParametroFuncional.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_copia_clientesParametroFuncionalBusqueda"));

		if(this.parametrofuncionalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_copia_clientesParametroFuncionalBusqueda.setVisible(false);		}


					
		this.jLabelcon_copia_proveedorParametroFuncional = new JLabelMe();
		this.jLabelcon_copia_proveedorParametroFuncional.setText(""+ParametroFuncionalConstantesFunciones.LABEL_CONCOPIAPROVEEDOR+" : *");
		this.jLabelcon_copia_proveedorParametroFuncional.setToolTipText("Concopia Proveedor");
		this.jLabelcon_copia_proveedorParametroFuncional.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_copia_proveedorParametroFuncional.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_copia_proveedorParametroFuncional.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_copia_proveedorParametroFuncional,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_copia_proveedorParametroFuncional=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_copia_proveedorParametroFuncional.setToolTipText(ParametroFuncionalConstantesFunciones.LABEL_CONCOPIAPROVEEDOR);
		this.gridaBagLayoutParametroFuncional = new GridBagLayout();
		this.jPanelcon_copia_proveedorParametroFuncional.setLayout(this.gridaBagLayoutParametroFuncional);


		jCheckBoxcon_copia_proveedorParametroFuncional= new JCheckBoxMe();
		jCheckBoxcon_copia_proveedorParametroFuncional.setEnabled(false);

		jCheckBoxcon_copia_proveedorParametroFuncional.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_copia_proveedorParametroFuncional.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_copia_proveedorParametroFuncional.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_copia_proveedorParametroFuncional,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_copia_proveedorParametroFuncionalBusqueda= new JButtonMe();
		this.jButtoncon_copia_proveedorParametroFuncionalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_copia_proveedorParametroFuncionalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_copia_proveedorParametroFuncionalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_copia_proveedorParametroFuncionalBusqueda.setText("U");
		this.jButtoncon_copia_proveedorParametroFuncionalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_copia_proveedorParametroFuncionalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_copia_proveedorParametroFuncionalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_copia_proveedorParametroFuncional.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_copia_proveedorParametroFuncional.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_copia_proveedorParametroFuncionalBusqueda"));

		if(this.parametrofuncionalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_copia_proveedorParametroFuncionalBusqueda.setVisible(false);		}


					
		this.jLabelcon_proveedor_clienteParametroFuncional = new JLabelMe();
		this.jLabelcon_proveedor_clienteParametroFuncional.setText(""+ParametroFuncionalConstantesFunciones.LABEL_CONPROVEEDORCLIENTE+" : *");
		this.jLabelcon_proveedor_clienteParametroFuncional.setToolTipText("Conproveedor Cliente");
		this.jLabelcon_proveedor_clienteParametroFuncional.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcon_proveedor_clienteParametroFuncional.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcon_proveedor_clienteParametroFuncional.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_proveedor_clienteParametroFuncional,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_proveedor_clienteParametroFuncional=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_proveedor_clienteParametroFuncional.setToolTipText(ParametroFuncionalConstantesFunciones.LABEL_CONPROVEEDORCLIENTE);
		this.gridaBagLayoutParametroFuncional = new GridBagLayout();
		this.jPanelcon_proveedor_clienteParametroFuncional.setLayout(this.gridaBagLayoutParametroFuncional);


		jCheckBoxcon_proveedor_clienteParametroFuncional= new JCheckBoxMe();
		jCheckBoxcon_proveedor_clienteParametroFuncional.setEnabled(false);

		jCheckBoxcon_proveedor_clienteParametroFuncional.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_proveedor_clienteParametroFuncional.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_proveedor_clienteParametroFuncional.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_proveedor_clienteParametroFuncional,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_proveedor_clienteParametroFuncionalBusqueda= new JButtonMe();
		this.jButtoncon_proveedor_clienteParametroFuncionalBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_proveedor_clienteParametroFuncionalBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_proveedor_clienteParametroFuncionalBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_proveedor_clienteParametroFuncionalBusqueda.setText("U");
		this.jButtoncon_proveedor_clienteParametroFuncionalBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_proveedor_clienteParametroFuncionalBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_proveedor_clienteParametroFuncionalBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_proveedor_clienteParametroFuncional.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_proveedor_clienteParametroFuncional.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_proveedor_clienteParametroFuncionalBusqueda"));

		if(this.parametrofuncionalSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_proveedor_clienteParametroFuncionalBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysParametroFuncional() {
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
		//this.jInternalFrameDetalleParametroFuncional = new ParametroFuncionalBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Parametro Funcional DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutParametroFuncional= new GridBagLayout();
		

		
		String sToolTipParametroFuncional="";
		sToolTipParametroFuncional=ParametroFuncionalConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipParametroFuncional+="(Cartera.ParametroFuncional)";
		}
		
		if(!this.parametrofuncionalSessionBean.getEsGuardarRelacionado()) {
			sToolTipParametroFuncional+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoParametroFuncional = new JButtonMe();
		this.jButtonModificarParametroFuncional = new JButtonMe();
        this.jButtonActualizarParametroFuncional = new JButtonMe();
        this.jButtonEliminarParametroFuncional = new JButtonMe();
        this.jButtonCancelarParametroFuncional = new JButtonMe();
        this.jButtonGuardarCambiosParametroFuncional = new JButtonMe();
		this.jButtonGuardarCambiosTablaParametroFuncional = new JButtonMe();
		this.jButtonCerrarParametroFuncional = new JButtonMe();
		
		this.jScrollPanelDatosParametroFuncional = new JScrollPane();   
        this.jScrollPanelDatosEdicionParametroFuncional = new JScrollPane();
		this.jScrollPanelDatosGeneralParametroFuncional = new JScrollPane();
				
		
		
		this.jPanelCamposParametroFuncional = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosParametroFuncional = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesParametroFuncional = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioParametroFuncional = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Parametro Funcional";
		
		if(!this.parametrofuncionalSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosParametroFuncional.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Funcionales" + this.sPath));
		} else {
			this.jScrollPanelDatosParametroFuncional.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionParametroFuncional.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralParametroFuncional.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposParametroFuncional.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposParametroFuncional.setName("jPanelCamposParametroFuncional"); 

		this.jPanelCamposOcultosParametroFuncional.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosParametroFuncional.setName("jPanelCamposOcultosParametroFuncional"); 

        this.jPanelAccionesParametroFuncional.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesParametroFuncional.setToolTipText("Acciones");
        this.jPanelAccionesParametroFuncional.setName("Acciones"); 

		this.jPanelAccionesFormularioParametroFuncional.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioParametroFuncional.setToolTipText("Acciones");
        this.jPanelAccionesFormularioParametroFuncional.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionParametroFuncional, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralParametroFuncional, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosParametroFuncional, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposParametroFuncional, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosParametroFuncional, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioParametroFuncional, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoParametroFuncional.setText("Nuevo");
		this.jButtonModificarParametroFuncional.setText("Editar");
        this.jButtonActualizarParametroFuncional.setText("Actualizar");
        this.jButtonEliminarParametroFuncional.setText("Eliminar");
        this.jButtonCancelarParametroFuncional.setText("Cancelar");
        this.jButtonGuardarCambiosParametroFuncional.setText("Guardar");
		this.jButtonGuardarCambiosTablaParametroFuncional.setText("Guardar");
		this.jButtonCerrarParametroFuncional.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoParametroFuncional,"nuevo_button","Nuevo",this.parametrofuncionalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarParametroFuncional,"modificar_button","Editar",this.parametrofuncionalSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarParametroFuncional,"actualizar_button","Actualizar",this.parametrofuncionalSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarParametroFuncional,"eliminar_button","Eliminar",this.parametrofuncionalSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarParametroFuncional,"cancelar_button","Cancelar",this.parametrofuncionalSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosParametroFuncional,"guardarcambios_button","Guardar",this.parametrofuncionalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaParametroFuncional,"guardarcambiostabla_button","Guardar",this.parametrofuncionalSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarParametroFuncional,"cerrar_button","Salir",this.parametrofuncionalSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoParametroFuncional, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarParametroFuncional, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosParametroFuncional, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaParametroFuncional, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarParametroFuncional, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarParametroFuncional, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarParametroFuncional, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarParametroFuncional, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoParametroFuncional.setToolTipText("Nuevo"+" "+ParametroFuncionalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarParametroFuncional.setToolTipText("Editar"+" "+ParametroFuncionalConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarParametroFuncional.setToolTipText("Actualizar"+" "+ParametroFuncionalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarParametroFuncional.setToolTipText("Eliminar)"+" "+ParametroFuncionalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarParametroFuncional.setToolTipText("Cancelar"+" "+ParametroFuncionalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosParametroFuncional.setToolTipText("Guardar"+" "+ParametroFuncionalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaParametroFuncional.setToolTipText("Guardar"+" "+ParametroFuncionalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarParametroFuncional.setToolTipText("Salir"+" "+ParametroFuncionalConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoParametroFuncional";
		inputMap = this.jButtonNuevoParametroFuncional.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoParametroFuncional.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoParametroFuncional"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarParametroFuncional";
		inputMap = this.jButtonActualizarParametroFuncional.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarParametroFuncional.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarParametroFuncional"));
		
		//ELIMINAR
		sMapKey = "EliminarParametroFuncional";
		inputMap = this.jButtonEliminarParametroFuncional.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarParametroFuncional.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarParametroFuncional"));
		
		//CANCELAR	
		sMapKey = "CancelarParametroFuncional";
		inputMap = this.jButtonCancelarParametroFuncional.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarParametroFuncional.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarParametroFuncional"));
		
		//CERRAR		
		sMapKey = "CerrarParametroFuncional";
		inputMap = this.jButtonCerrarParametroFuncional.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarParametroFuncional.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarParametroFuncional"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaParametroFuncional";
		inputMap = this.jButtonGuardarCambiosTablaParametroFuncional.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaParametroFuncional.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaParametroFuncional"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoParametroFuncional = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoParametroFuncional.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoParametroFuncional.setToolTipText("Nuevo ParametroFuncional");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoParametroFuncional, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarParametroFuncional = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarParametroFuncional.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarParametroFuncional.setToolTipText("Sin Cerrar Ventana ParametroFuncional");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarParametroFuncional, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeParametroFuncional = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeParametroFuncional.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeParametroFuncional.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeParametroFuncional, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesParametroFuncional = new JComboBoxMe();
		//this.jComboBoxTiposAccionesParametroFuncional.setText("Accion");
		this.jComboBoxTiposAccionesParametroFuncional.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioParametroFuncional = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioParametroFuncional.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioParametroFuncional.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesParametroFuncional = new JLabelMe();
		
		this.jLabelAccionesParametroFuncional.setText("Acciones");		
		this.jLabelAccionesParametroFuncional.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroFuncional.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroFuncional.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposParametroFuncional();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysParametroFuncional();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesParametroFuncional=new JTabbedPane();
		this.jTabbedPaneRelacionesParametroFuncional.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesParametroFuncional,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesParametroFuncional.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroFuncional.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroFuncional.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesParametroFuncional, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioParametroFuncional.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioParametroFuncional.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioParametroFuncional.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioParametroFuncional, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposParametroFuncional = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosParametroFuncional = new GridBagLayout();
		
		this.jPanelCamposParametroFuncional.setLayout(gridaBagLayoutCamposParametroFuncional);
		this.jPanelCamposOcultosParametroFuncional.setLayout(gridaBagLayoutCamposOcultosParametroFuncional);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsParametroFuncional = new GridBagConstraints();
	this.gridBagConstraintsParametroFuncional.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFuncional.gridy = 0;
	this.gridBagConstraintsParametroFuncional.gridx = 0;
	this.gridBagConstraintsParametroFuncional.ipadx = 0;
	this.gridBagConstraintsParametroFuncional.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidParametroFuncional.add(jLabelIdParametroFuncional, this.gridBagConstraintsParametroFuncional);



	this.gridBagConstraintsParametroFuncional = new GridBagConstraints();
	this.gridBagConstraintsParametroFuncional.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFuncional.gridy = 0;
	this.gridBagConstraintsParametroFuncional.gridx = 1;
	this.gridBagConstraintsParametroFuncional.ipadx = 0;
	this.gridBagConstraintsParametroFuncional.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidParametroFuncional.add(jLabelidParametroFuncional, this.gridBagConstraintsParametroFuncional);


	this.gridBagConstraintsParametroFuncional = new GridBagConstraints();
	this.gridBagConstraintsParametroFuncional.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFuncional.gridy = 0;
	this.gridBagConstraintsParametroFuncional.gridx = 0;
	this.gridBagConstraintsParametroFuncional.ipadx = 0;
	this.gridBagConstraintsParametroFuncional.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_copia_clientesParametroFuncional.add(jLabelcon_copia_clientesParametroFuncional, this.gridBagConstraintsParametroFuncional);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFuncional = new GridBagConstraints();
		//this.gridBagConstraintsParametroFuncional.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFuncional.gridy = 0;
		this.gridBagConstraintsParametroFuncional.gridx = 2;
		this.gridBagConstraintsParametroFuncional.ipadx = 0;
		this.gridBagConstraintsParametroFuncional.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_copia_clientesParametroFuncional.add(jButtoncon_copia_clientesParametroFuncionalBusqueda, this.gridBagConstraintsParametroFuncional);
	}

	this.gridBagConstraintsParametroFuncional = new GridBagConstraints();
	this.gridBagConstraintsParametroFuncional.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFuncional.gridy = 0;
	this.gridBagConstraintsParametroFuncional.gridx = 1;
	this.gridBagConstraintsParametroFuncional.ipadx = 0;
	this.gridBagConstraintsParametroFuncional.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_copia_clientesParametroFuncional.add(jCheckBoxcon_copia_clientesParametroFuncional, this.gridBagConstraintsParametroFuncional);


	this.gridBagConstraintsParametroFuncional = new GridBagConstraints();
	this.gridBagConstraintsParametroFuncional.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFuncional.gridy = 0;
	this.gridBagConstraintsParametroFuncional.gridx = 0;
	this.gridBagConstraintsParametroFuncional.ipadx = 0;
	this.gridBagConstraintsParametroFuncional.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_copia_proveedorParametroFuncional.add(jLabelcon_copia_proveedorParametroFuncional, this.gridBagConstraintsParametroFuncional);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFuncional = new GridBagConstraints();
		//this.gridBagConstraintsParametroFuncional.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFuncional.gridy = 0;
		this.gridBagConstraintsParametroFuncional.gridx = 2;
		this.gridBagConstraintsParametroFuncional.ipadx = 0;
		this.gridBagConstraintsParametroFuncional.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_copia_proveedorParametroFuncional.add(jButtoncon_copia_proveedorParametroFuncionalBusqueda, this.gridBagConstraintsParametroFuncional);
	}

	this.gridBagConstraintsParametroFuncional = new GridBagConstraints();
	this.gridBagConstraintsParametroFuncional.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFuncional.gridy = 0;
	this.gridBagConstraintsParametroFuncional.gridx = 1;
	this.gridBagConstraintsParametroFuncional.ipadx = 0;
	this.gridBagConstraintsParametroFuncional.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_copia_proveedorParametroFuncional.add(jCheckBoxcon_copia_proveedorParametroFuncional, this.gridBagConstraintsParametroFuncional);


	this.gridBagConstraintsParametroFuncional = new GridBagConstraints();
	this.gridBagConstraintsParametroFuncional.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFuncional.gridy = 0;
	this.gridBagConstraintsParametroFuncional.gridx = 0;
	this.gridBagConstraintsParametroFuncional.ipadx = 0;
	this.gridBagConstraintsParametroFuncional.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_proveedor_clienteParametroFuncional.add(jLabelcon_proveedor_clienteParametroFuncional, this.gridBagConstraintsParametroFuncional);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroFuncional = new GridBagConstraints();
		//this.gridBagConstraintsParametroFuncional.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroFuncional.gridy = 0;
		this.gridBagConstraintsParametroFuncional.gridx = 2;
		this.gridBagConstraintsParametroFuncional.ipadx = 0;
		this.gridBagConstraintsParametroFuncional.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_proveedor_clienteParametroFuncional.add(jButtoncon_proveedor_clienteParametroFuncionalBusqueda, this.gridBagConstraintsParametroFuncional);
	}

	this.gridBagConstraintsParametroFuncional = new GridBagConstraints();
	this.gridBagConstraintsParametroFuncional.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroFuncional.gridy = 0;
	this.gridBagConstraintsParametroFuncional.gridx = 1;
	this.gridBagConstraintsParametroFuncional.ipadx = 0;
	this.gridBagConstraintsParametroFuncional.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_proveedor_clienteParametroFuncional.add(jCheckBoxcon_proveedor_clienteParametroFuncional, this.gridBagConstraintsParametroFuncional);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsParametroFuncional = new GridBagConstraints();
	this.gridBagConstraintsParametroFuncional.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFuncional.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFuncional.gridy = iYPanelCamposParametroFuncional;
	this.gridBagConstraintsParametroFuncional.gridx = iXPanelCamposParametroFuncional++;
	this.gridBagConstraintsParametroFuncional.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFuncional.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroFuncional.add(this.jPanelidParametroFuncional, this.gridBagConstraintsParametroFuncional);



	if(iXPanelCamposParametroFuncional % 1==0) {
		iXPanelCamposParametroFuncional=0;
		iYPanelCamposParametroFuncional++;
	}
	this.gridBagConstraintsParametroFuncional = new GridBagConstraints();
	this.gridBagConstraintsParametroFuncional.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFuncional.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFuncional.gridy = iYPanelCamposParametroFuncional;
	this.gridBagConstraintsParametroFuncional.gridx = iXPanelCamposParametroFuncional++;
	this.gridBagConstraintsParametroFuncional.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFuncional.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroFuncional.add(this.jPanelcon_copia_clientesParametroFuncional, this.gridBagConstraintsParametroFuncional);



	if(iXPanelCamposParametroFuncional % 1==0) {
		iXPanelCamposParametroFuncional=0;
		iYPanelCamposParametroFuncional++;
	}
	this.gridBagConstraintsParametroFuncional = new GridBagConstraints();
	this.gridBagConstraintsParametroFuncional.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFuncional.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFuncional.gridy = iYPanelCamposParametroFuncional;
	this.gridBagConstraintsParametroFuncional.gridx = iXPanelCamposParametroFuncional++;
	this.gridBagConstraintsParametroFuncional.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFuncional.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroFuncional.add(this.jPanelcon_copia_proveedorParametroFuncional, this.gridBagConstraintsParametroFuncional);



	if(iXPanelCamposParametroFuncional % 1==0) {
		iXPanelCamposParametroFuncional=0;
		iYPanelCamposParametroFuncional++;
	}
	this.gridBagConstraintsParametroFuncional = new GridBagConstraints();
	this.gridBagConstraintsParametroFuncional.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroFuncional.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroFuncional.gridy = iYPanelCamposParametroFuncional;
	this.gridBagConstraintsParametroFuncional.gridx = iXPanelCamposParametroFuncional++;
	this.gridBagConstraintsParametroFuncional.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroFuncional.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroFuncional.add(this.jPanelcon_proveedor_clienteParametroFuncional, this.gridBagConstraintsParametroFuncional);



	if(iXPanelCamposParametroFuncional % 1==0) {
		iXPanelCamposParametroFuncional=0;
		iYPanelCamposParametroFuncional++;
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
			
		GridBagLayout gridaBagLayoutAccionesParametroFuncional= new GridBagLayout();
		this.jPanelAccionesParametroFuncional.setLayout(gridaBagLayoutAccionesParametroFuncional);
		
		GridBagLayout gridaBagLayoutAccionesFormularioParametroFuncional= new GridBagLayout();
		this.jPanelAccionesFormularioParametroFuncional.setLayout(gridaBagLayoutAccionesFormularioParametroFuncional);
		
		this.gridBagConstraintsParametroFuncional = new GridBagConstraints();
		this.gridBagConstraintsParametroFuncional.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsParametroFuncional.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioParametroFuncional.add(this.jComboBoxTiposAccionesFormularioParametroFuncional, this.gridBagConstraintsParametroFuncional);

		this.gridBagConstraintsParametroFuncional = new GridBagConstraints();
		this.gridBagConstraintsParametroFuncional.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsParametroFuncional.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioParametroFuncional.add(this.jCheckBoxPostAccionNuevoParametroFuncional, this.gridBagConstraintsParametroFuncional);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.parametrofuncionalSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsParametroFuncional = new GridBagConstraints();
			this.gridBagConstraintsParametroFuncional.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsParametroFuncional.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioParametroFuncional.add(this.jCheckBoxPostAccionSinCerrarParametroFuncional, this.gridBagConstraintsParametroFuncional);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.parametrofuncionalSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.parametrofuncionalSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsParametroFuncional = new GridBagConstraints();
			this.gridBagConstraintsParametroFuncional.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsParametroFuncional.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioParametroFuncional.add(this.jCheckBoxPostAccionSinMensajeParametroFuncional, this.gridBagConstraintsParametroFuncional);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsParametroFuncional = new GridBagConstraints();
		this.gridBagConstraintsParametroFuncional.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroFuncional.gridy = 0;
		this.gridBagConstraintsParametroFuncional.gridx = iPosXAccion++;
			
		this.jPanelAccionesParametroFuncional.add(this.jButtonModificarParametroFuncional, this.gridBagConstraintsParametroFuncional);							

		this.gridBagConstraintsParametroFuncional = new GridBagConstraints();
		this.gridBagConstraintsParametroFuncional.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroFuncional.gridy = 0;
		this.gridBagConstraintsParametroFuncional.gridx =iPosXAccion++;
			
		this.jPanelAccionesParametroFuncional.add(this.jButtonEliminarParametroFuncional, this.gridBagConstraintsParametroFuncional);
		
			
		this.gridBagConstraintsParametroFuncional = new GridBagConstraints();
		this.gridBagConstraintsParametroFuncional.gridy = 0;		
		this.gridBagConstraintsParametroFuncional.gridx = iPosXAccion++;
		
		this.jPanelAccionesParametroFuncional.add(this.jButtonActualizarParametroFuncional, this.gridBagConstraintsParametroFuncional);


		this.gridBagConstraintsParametroFuncional = new GridBagConstraints();
		this.gridBagConstraintsParametroFuncional.gridy = 0;		
		this.gridBagConstraintsParametroFuncional.gridx = iPosXAccion++;
		
		this.jPanelAccionesParametroFuncional.add(this.jButtonGuardarCambiosParametroFuncional, this.gridBagConstraintsParametroFuncional);	
		
		this.gridBagConstraintsParametroFuncional = new GridBagConstraints();
		this.gridBagConstraintsParametroFuncional.gridy = 0;		
		this.gridBagConstraintsParametroFuncional.gridx =iPosXAccion++;
		
		this.jPanelAccionesParametroFuncional.add(this.jButtonCancelarParametroFuncional, this.gridBagConstraintsParametroFuncional);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutParametroFuncional = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutParametroFuncional);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.parametrofuncionalSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsParametroFuncional = new GridBagConstraints();						
			this.gridBagConstraintsParametroFuncional.gridy = iGridyPrincipal++;
			this.gridBagConstraintsParametroFuncional.gridx = 0;		
			//this.gridBagConstraintsParametroFuncional.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroFuncional.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsParametroFuncional.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsParametroFuncional = new GridBagConstraints();
		this.gridBagConstraintsParametroFuncional.gridy =iGridyPrincipal++;
		this.gridBagConstraintsParametroFuncional.gridx =0;
		this.gridBagConstraintsParametroFuncional.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsParametroFuncional.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosParametroFuncional, this.gridBagConstraintsParametroFuncional);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ParametroFuncionalJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleParametroFuncional = new ParametroFuncionalBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Parametro Funcional DATOS");
			
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
			
	        //this.setTitle("[FOR] - Parametro Funcional DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Parametro Funcional Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ParametroFuncionalModel parametrofuncionalModel=new ParametroFuncionalModel(this);
			
			//SI USARA CLASE INTERNA
			//ParametroFuncionalModel.ParametroFuncionalFocusTraversalPolicy parametrofuncionalFocusTraversalPolicy = parametrofuncionalModel.new ParametroFuncionalFocusTraversalPolicy(this);
			
			//parametrofuncionalFocusTraversalPolicy.setparametrofuncionalJInternalFrame(this);
			
			this.setFocusTraversalPolicy(parametrofuncionalModel);
			
			
			this.jContentPaneDetalleParametroFuncional = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleParametroFuncional = new GridBagLayout();	
			this.jContentPaneDetalleParametroFuncional.setLayout(gridaBagLayoutDetalleParametroFuncional);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosParametroFuncional = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsParametroFuncional = new GridBagConstraints();
				this.gridBagConstraintsParametroFuncional.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsParametroFuncional.gridx = 0;
					
				
				this.jContentPaneDetalleParametroFuncional.add(jTtoolBarDetalleParametroFuncional, gridBagConstraintsParametroFuncional);								
				
}
			
			this.jScrollPanelDatosEdicionParametroFuncional=   new JScrollPane(jContentPaneDetalleParametroFuncional,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionParametroFuncional.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroFuncional.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroFuncional.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralParametroFuncional=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralParametroFuncional.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroFuncional.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroFuncional.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsParametroFuncional = new GridBagConstraints();
			
			
	        this.gridBagConstraintsParametroFuncional.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsParametroFuncional.gridx = 0;
	        
			this.jContentPaneDetalleParametroFuncional.add(jPanelCamposParametroFuncional, gridBagConstraintsParametroFuncional);
			
			
			
			
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
						&& parametrofuncionalSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.parametrofuncionalSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsParametroFuncional= new GridBagConstraints();
						this.gridBagConstraintsParametroFuncional.gridy = iGridyRelaciones++;
						this.gridBagConstraintsParametroFuncional.gridx = 0;
						this.jContentPaneDetalleParametroFuncional.add(this.jTabbedPaneRelacionesParametroFuncional, this.gridBagConstraintsParametroFuncional);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesParametroFuncional.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosParametroFuncional.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsParametroFuncional = new GridBagConstraints();
					this.gridBagConstraintsParametroFuncional.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsParametroFuncional.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsParametroFuncional.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsParametroFuncional.gridx = 0;
					
				
					this.jContentPaneDetalleParametroFuncional.add(jPanelCamposOcultosParametroFuncional, gridBagConstraintsParametroFuncional);
				
					this.jPanelCamposOcultosParametroFuncional.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsParametroFuncional = new GridBagConstraints();
			this.gridBagConstraintsParametroFuncional.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsParametroFuncional.gridx = 0;
	        this.gridBagConstraintsParametroFuncional.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleParametroFuncional.add(this.jPanelAccionesFormularioParametroFuncional, this.gridBagConstraintsParametroFuncional);							
			
			
			
			this.gridBagConstraintsParametroFuncional = new GridBagConstraints();
	        this.gridBagConstraintsParametroFuncional.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsParametroFuncional.gridx = 0;
	        
			
			this.jContentPaneDetalleParametroFuncional.add(this.jPanelAccionesParametroFuncional, this.gridBagConstraintsParametroFuncional);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionParametroFuncional);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionParametroFuncional=   new JScrollPane(this.jPanelCamposParametroFuncional,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionParametroFuncional.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroFuncional.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroFuncional.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsParametroFuncional = new GridBagConstraints();
			this.gridBagConstraintsParametroFuncional.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsParametroFuncional.gridx = 0;
			this.gridBagConstraintsParametroFuncional.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsParametroFuncional.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsParametroFuncional.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionParametroFuncional, this.gridBagConstraintsParametroFuncional);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsParametroFuncional = new GridBagConstraints();
			this.gridBagConstraintsParametroFuncional.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsParametroFuncional.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioParametroFuncional, this.gridBagConstraintsParametroFuncional);			
			
			this.gridBagConstraintsParametroFuncional = new GridBagConstraints();
			this.gridBagConstraintsParametroFuncional.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsParametroFuncional.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesParametroFuncional, this.gridBagConstraintsParametroFuncional);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsParametroFuncional = new GridBagConstraints();
		this.gridBagConstraintsParametroFuncional.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroFuncional.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposParametroFuncional, this.gridBagConstraintsParametroFuncional);
			
			
		this.gridBagConstraintsParametroFuncional = new GridBagConstraints();
		this.gridBagConstraintsParametroFuncional.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroFuncional.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosParametroFuncional, this.gridBagConstraintsParametroFuncional);
		
			
		this.gridBagConstraintsParametroFuncional = new GridBagConstraints();
		this.gridBagConstraintsParametroFuncional.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsParametroFuncional.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesParametroFuncional, this.gridBagConstraintsParametroFuncional);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralParametroFuncional;//jContentPane;
		
		return jScrollPanelDatosEdicionParametroFuncional;
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
