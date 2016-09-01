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
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.inventario.util.TipoAutoriConsepConstantesFunciones;

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
public class TipoAutoriConsepDetalleFormJInternalFrame extends TipoAutoriConsepBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoAutoriConsep;
	
	protected JMenuBar jmenuBarDetalleTipoAutoriConsep;
	
	protected JMenu jmenuDetalleTipoAutoriConsep;
	protected JMenu jmenuDetalleArchivoTipoAutoriConsep;
	protected JMenu jmenuDetalleAccionesTipoAutoriConsep;
	protected JMenu jmenuDetalleDatosTipoAutoriConsep;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoAutoriConsep = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoAutoriConsep;	
	protected GridBagConstraints gridBagConstraintsTipoAutoriConsep;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoAutoriConsepBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoAutoriConsep;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoAutoriConsepSessionBean tipoautoriconsepSessionBean;
	
	

	public AutoriConsepBeanSwingJInternalFrame autoriconsepBeanSwingJInternalFrame=null;
	public AutoriConsepBeanSwingJInternalFrame autoriconsepBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteAutoriConsep=false;
	public AutoriConsepSessionBean autoriconsepSessionBean;
	
		
	
	public TipoAutoriConsepLogic tipoautoriconsepLogic;
	
	public JScrollPane jScrollPanelDatosTipoAutoriConsep;
	public JScrollPane jScrollPanelDatosEdicionTipoAutoriConsep;
	public JScrollPane jScrollPanelDatosGeneralTipoAutoriConsep;
	
	protected JPanel jPanelCamposTipoAutoriConsep;    
	protected JPanel jPanelCamposOcultosTipoAutoriConsep;    	
	protected JPanel jPanelAccionesTipoAutoriConsep;
	protected JPanel jPanelAccionesFormularioTipoAutoriConsep;
    
	
	
	protected Integer iXPanelCamposTipoAutoriConsep=0;
	protected Integer iYPanelCamposTipoAutoriConsep=0;
	
	protected Integer iXPanelCamposOcultosTipoAutoriConsep=0;
	protected Integer iYPanelCamposOcultosTipoAutoriConsep=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoAutoriConsep;
	public JButton jButtonModificarTipoAutoriConsep;
	public JButton jButtonActualizarTipoAutoriConsep;
    public JButton jButtonEliminarTipoAutoriConsep;
	public JButton jButtonCancelarTipoAutoriConsep;
    public JButton jButtonGuardarCambiosTipoAutoriConsep;
	public JButton jButtonGuardarCambiosTablaTipoAutoriConsep;
	protected JButton jButtonCerrarTipoAutoriConsep;
	
	
	protected JButton jButtonProcesarInformacionTipoAutoriConsep;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoAutoriConsep;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoAutoriConsep;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoAutoriConsep;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoAutoriConsep;
	protected JButton jButtonModificarToolBarTipoAutoriConsep;
	protected JButton jButtonActualizarToolBarTipoAutoriConsep;
    protected JButton jButtonEliminarToolBarTipoAutoriConsep;
	protected JButton jButtonCancelarToolBarTipoAutoriConsep;
    protected JButton jButtonGuardarCambiosToolBarTipoAutoriConsep;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoAutoriConsep;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoAutoriConsep;
	protected JButton jButtonCerrarToolBarTipoAutoriConsep;
	
	protected JButton jButtonProcesarInformacionToolBarTipoAutoriConsep;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoAutoriConsep;
	protected JMenuItem jMenuItemModificarTipoAutoriConsep;
	protected JMenuItem jMenuItemActualizarTipoAutoriConsep;
    protected JMenuItem jMenuItemEliminarTipoAutoriConsep;
	protected JMenuItem jMenuItemCancelarTipoAutoriConsep;
    protected JMenuItem jMenuItemGuardarCambiosTipoAutoriConsep;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoAutoriConsep;
	protected JMenuItem jMenuItemCerrarTipoAutoriConsep;
	protected JMenuItem jMenuItemDetalleCerrarTipoAutoriConsep;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoAutoriConsep;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoAutoriConsep;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoAutoriConsep;
	protected JMenuItem jMenuItemMostrarOcultarTipoAutoriConsep;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoAutoriConsep;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoAutoriConsep;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoAutoriConsep;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoAutoriConsep;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoAutoriConsep;
	public JLabel jLabelIdTipoAutoriConsep;
	public JTextFieldMe jTextFieldidTipoAutoriConsep;
	public JButton jButtonidTipoAutoriConsepBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoAutoriConsep;
	public JLabel jLabelcodigoTipoAutoriConsep;
	public JTextField jTextFieldcodigoTipoAutoriConsep;
	public JButton jButtoncodigoTipoAutoriConsepBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoAutoriConsep;
	public JLabel jLabelnombreTipoAutoriConsep;
	public JTextField jTextFieldnombreTipoAutoriConsep;
	public JButton jButtonnombreTipoAutoriConsepBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoAutoriConsep;
	
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
	
	public TipoAutoriConsepDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoAutoriConsep=new JPanel();
				this.jPanelAccionesFormularioTipoAutoriConsep=new JPanel();
				this.jmenuBarDetalleTipoAutoriConsep=new JMenuBar();
				this.jTtoolBarDetalleTipoAutoriConsep=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoAutoriConsepDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoAutoriConsep No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoAutoriConsepDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoAutoriConsep No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoAutoriConsepDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoAutoriConsep No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoAutoriConsepDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoAutoriConsep No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoAutoriConsepDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoAutoriConsep No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoAutoriConsep() {
		return this.jButtonActualizarToolBarTipoAutoriConsep;
	}
	
	public JButton getjButtonEliminarToolBarTipoAutoriConsep() {
		return this.jButtonEliminarToolBarTipoAutoriConsep;
	}
	
	public JButton getjButtonCancelarToolBarTipoAutoriConsep() {
		return this.jButtonCancelarToolBarTipoAutoriConsep;
	}		
	
	public JButton getjButtonProcesarInformacionTipoAutoriConsep() {
		return this.jButtonProcesarInformacionTipoAutoriConsep;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoAutoriConsep)	{
		this.jButtonProcesarInformacionTipoAutoriConsep = jButtonProcesarInformacionTipoAutoriConsep;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoAutoriConsep() {
		return this.jComboBoxTiposAccionesTipoAutoriConsep;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoAutoriConsep(
			JComboBox jComboBoxTiposRelacionesTipoAutoriConsep) {
		this.jComboBoxTiposRelacionesTipoAutoriConsep = jComboBoxTiposRelacionesTipoAutoriConsep;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoAutoriConsep(
			JComboBox jComboBoxTiposAccionesTipoAutoriConsep) {
		this.jComboBoxTiposAccionesTipoAutoriConsep = jComboBoxTiposAccionesTipoAutoriConsep;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoAutoriConsep() {
		return this.jComboBoxTiposAccionesFormularioTipoAutoriConsep;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoAutoriConsep(
			JComboBox jComboBoxTiposAccionesFormularioTipoAutoriConsep) {
		this.jComboBoxTiposAccionesFormularioTipoAutoriConsep = jComboBoxTiposAccionesFormularioTipoAutoriConsep;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipoautoriconsepSessionBean=new TipoAutoriConsepSessionBean();
		
		this.tipoautoriconsepSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoautoriconsepSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoautoriconsepSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.autoriconsepSessionBean=new AutoriConsepSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoAutoriConsepJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoAutoriConsepJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoAutoriConsepJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Autorizacion Consep MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipoautoriconsepSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoAutoriConsepJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoAutoriConsep= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoAutoriConsep=new JButtonMe();
				this.jButtonModificarToolBarTipoAutoriConsep=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoAutoriConsep=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoAutoriConsep,this.jTtoolBarDetalleTipoAutoriConsep,
							"actualizar","actualizar","Actualizar"+" "+TipoAutoriConsepConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoAutoriConsep=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoAutoriConsep,this.jTtoolBarDetalleTipoAutoriConsep,
							"eliminar","eliminar","Eliminar"+" "+TipoAutoriConsepConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoAutoriConsep=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoAutoriConsep,this.jTtoolBarDetalleTipoAutoriConsep,
							"cancelar","cancelar","Cancelar"+" "+TipoAutoriConsepConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoAutoriConsep=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoAutoriConsep,this.jTtoolBarDetalleTipoAutoriConsep,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoAutoriConsepConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoAutoriConsep,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoAutoriConsep,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoAutoriConsep,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoAutoriConsep=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoAutoriConsep=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoAutoriConsep=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoAutoriConsep=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoAutoriConsep=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoAutoriConsep= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoAutoriConsep.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoAutoriConsep,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoAutoriConsep= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoAutoriConsep.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoAutoriConsep,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoAutoriConsep= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoAutoriConsep.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoAutoriConsep,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoAutoriConsep= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoAutoriConsep.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoAutoriConsep,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoAutoriConsep= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoAutoriConsep.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoAutoriConsep,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoAutoriConsep= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoAutoriConsep.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoAutoriConsep,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoAutoriConsep= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoAutoriConsep.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoAutoriConsep,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoAutoriConsep= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoAutoriConsep.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoAutoriConsep,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoAutoriConsep= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoAutoriConsep.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoAutoriConsep,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoAutoriConsep= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoAutoriConsep.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoAutoriConsep,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoAutoriConsep.add(this.jMenuItemDetalleCerrarTipoAutoriConsep);
		
		this.jmenuDetalleAccionesTipoAutoriConsep.add(this.jMenuItemActualizarTipoAutoriConsep);
		this.jmenuDetalleAccionesTipoAutoriConsep.add(this.jMenuItemEliminarTipoAutoriConsep);
		this.jmenuDetalleAccionesTipoAutoriConsep.add(this.jMenuItemCancelarTipoAutoriConsep);		
		
		//this.jmenuDetalleDatosTipoAutoriConsep.add(this.jMenuItemDetalleAbrirOrderByTipoAutoriConsep);				
		this.jmenuDetalleDatosTipoAutoriConsep.add(this.jMenuItemDetalleMostarOcultarTipoAutoriConsep);				
				
		//this.jmenuDetalleAccionesTipoAutoriConsep.add(this.jMenuItemGuardarCambiosTipoAutoriConsep);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoAutoriConsep.add(this.jmenuDetalleArchivoTipoAutoriConsep);		
		this.jmenuBarDetalleTipoAutoriConsep.add(this.jmenuDetalleAccionesTipoAutoriConsep);		
		this.jmenuBarDetalleTipoAutoriConsep.add(this.jmenuDetalleDatosTipoAutoriConsep);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTipoAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTipoAutoriConsep.add(this.jmenuDetalleTipoAutoriConsep);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoAutoriConsep);				
	}
	
	
	public void inicializarElementosCamposTipoAutoriConsep() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoAutoriConsep = new JLabelMe();
		jLabelIdTipoAutoriConsep.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoAutoriConsep,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoAutoriConsep = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoAutoriConsep.setToolTipText(TipoAutoriConsepConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoAutoriConsep= new GridBagLayout();

		this.jPanelidTipoAutoriConsep.setLayout(this.gridaBagLayoutTipoAutoriConsep);

		jTextFieldidTipoAutoriConsep = new JTextFieldMe();
		jTextFieldidTipoAutoriConsep.setText("Id");

		jTextFieldidTipoAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoAutoriConsep = new JLabelMe();
		this.jLabelcodigoTipoAutoriConsep.setText(""+TipoAutoriConsepConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoAutoriConsep.setToolTipText("Codigo");
		this.jLabelcodigoTipoAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoAutoriConsep,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoAutoriConsep=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoAutoriConsep.setToolTipText(TipoAutoriConsepConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoAutoriConsep = new GridBagLayout();
		this.jPanelcodigoTipoAutoriConsep.setLayout(this.gridaBagLayoutTipoAutoriConsep);


		jTextFieldcodigoTipoAutoriConsep= new JTextFieldMe();

		jTextFieldcodigoTipoAutoriConsep.setEnabled(false);
		jTextFieldcodigoTipoAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoAutoriConsep,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoAutoriConsepBusqueda= new JButtonMe();
		this.jButtoncodigoTipoAutoriConsepBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoAutoriConsepBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoAutoriConsepBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoAutoriConsepBusqueda.setText("U");
		this.jButtoncodigoTipoAutoriConsepBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoAutoriConsepBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoAutoriConsepBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoAutoriConsep.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoAutoriConsep.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoAutoriConsepBusqueda"));

		if(this.tipoautoriconsepSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoAutoriConsepBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoAutoriConsep = new JLabelMe();
		this.jLabelnombreTipoAutoriConsep.setText(""+TipoAutoriConsepConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoAutoriConsep.setToolTipText("Nombre");
		this.jLabelnombreTipoAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoAutoriConsep,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoAutoriConsep=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoAutoriConsep.setToolTipText(TipoAutoriConsepConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoAutoriConsep = new GridBagLayout();
		this.jPanelnombreTipoAutoriConsep.setLayout(this.gridaBagLayoutTipoAutoriConsep);


		jTextFieldnombreTipoAutoriConsep= new JTextFieldMe();

		jTextFieldnombreTipoAutoriConsep.setEnabled(false);
		jTextFieldnombreTipoAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreTipoAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreTipoAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombreTipoAutoriConsep,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombreTipoAutoriConsepBusqueda= new JButtonMe();
		this.jButtonnombreTipoAutoriConsepBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoAutoriConsepBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoAutoriConsepBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoAutoriConsepBusqueda.setText("U");
		this.jButtonnombreTipoAutoriConsepBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoAutoriConsepBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoAutoriConsepBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombreTipoAutoriConsep.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombreTipoAutoriConsep.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoAutoriConsepBusqueda"));

		if(this.tipoautoriconsepSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoAutoriConsepBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoAutoriConsep() {
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
		//this.jInternalFrameDetalleTipoAutoriConsep = new TipoAutoriConsepBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Autorizacion Consep DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoAutoriConsep= new GridBagLayout();
		

		
		String sToolTipTipoAutoriConsep="";
		sToolTipTipoAutoriConsep=TipoAutoriConsepConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoAutoriConsep+="(Inventario.TipoAutoriConsep)";
		}
		
		if(!this.tipoautoriconsepSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoAutoriConsep+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoAutoriConsep = new JButtonMe();
		this.jButtonModificarTipoAutoriConsep = new JButtonMe();
        this.jButtonActualizarTipoAutoriConsep = new JButtonMe();
        this.jButtonEliminarTipoAutoriConsep = new JButtonMe();
        this.jButtonCancelarTipoAutoriConsep = new JButtonMe();
        this.jButtonGuardarCambiosTipoAutoriConsep = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoAutoriConsep = new JButtonMe();
		this.jButtonCerrarTipoAutoriConsep = new JButtonMe();
		
		this.jScrollPanelDatosTipoAutoriConsep = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoAutoriConsep = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoAutoriConsep = new JScrollPane();
				
		
		
		this.jPanelCamposTipoAutoriConsep = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoAutoriConsep = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoAutoriConsep = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoAutoriConsep = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Autorizacion Consep";
		
		if(!this.tipoautoriconsepSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoAutoriConsep.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Autorizacion Consepes" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoAutoriConsep.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoAutoriConsep.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoAutoriConsep.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoAutoriConsep.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoAutoriConsep.setName("jPanelCamposTipoAutoriConsep"); 

		this.jPanelCamposOcultosTipoAutoriConsep.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoAutoriConsep.setName("jPanelCamposOcultosTipoAutoriConsep"); 

        this.jPanelAccionesTipoAutoriConsep.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoAutoriConsep.setToolTipText("Acciones");
        this.jPanelAccionesTipoAutoriConsep.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoAutoriConsep.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoAutoriConsep.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoAutoriConsep.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoAutoriConsep, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoAutoriConsep, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoAutoriConsep, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoAutoriConsep, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoAutoriConsep, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoAutoriConsep, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoAutoriConsep.setText("Nuevo");
		this.jButtonModificarTipoAutoriConsep.setText("Editar");
        this.jButtonActualizarTipoAutoriConsep.setText("Actualizar");
        this.jButtonEliminarTipoAutoriConsep.setText("Eliminar");
        this.jButtonCancelarTipoAutoriConsep.setText("Cancelar");
        this.jButtonGuardarCambiosTipoAutoriConsep.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoAutoriConsep.setText("Guardar");
		this.jButtonCerrarTipoAutoriConsep.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoAutoriConsep,"nuevo_button","Nuevo",this.tipoautoriconsepSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoAutoriConsep,"modificar_button","Editar",this.tipoautoriconsepSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoAutoriConsep,"actualizar_button","Actualizar",this.tipoautoriconsepSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoAutoriConsep,"eliminar_button","Eliminar",this.tipoautoriconsepSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoAutoriConsep,"cancelar_button","Cancelar",this.tipoautoriconsepSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoAutoriConsep,"guardarcambios_button","Guardar",this.tipoautoriconsepSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoAutoriConsep,"guardarcambiostabla_button","Guardar",this.tipoautoriconsepSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoAutoriConsep,"cerrar_button","Salir",this.tipoautoriconsepSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoAutoriConsep, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoAutoriConsep, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoAutoriConsep, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoAutoriConsep.setToolTipText("Nuevo"+" "+TipoAutoriConsepConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoAutoriConsep.setToolTipText("Editar"+" "+TipoAutoriConsepConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoAutoriConsep.setToolTipText("Actualizar"+" "+TipoAutoriConsepConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoAutoriConsep.setToolTipText("Eliminar)"+" "+TipoAutoriConsepConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoAutoriConsep.setToolTipText("Cancelar"+" "+TipoAutoriConsepConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoAutoriConsep.setToolTipText("Guardar"+" "+TipoAutoriConsepConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoAutoriConsep.setToolTipText("Guardar"+" "+TipoAutoriConsepConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoAutoriConsep.setToolTipText("Salir"+" "+TipoAutoriConsepConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoAutoriConsep";
		inputMap = this.jButtonNuevoTipoAutoriConsep.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoAutoriConsep.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoAutoriConsep"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoAutoriConsep";
		inputMap = this.jButtonActualizarTipoAutoriConsep.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoAutoriConsep.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoAutoriConsep"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoAutoriConsep";
		inputMap = this.jButtonEliminarTipoAutoriConsep.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoAutoriConsep.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoAutoriConsep"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoAutoriConsep";
		inputMap = this.jButtonCancelarTipoAutoriConsep.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoAutoriConsep.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoAutoriConsep"));
		
		//CERRAR		
		sMapKey = "CerrarTipoAutoriConsep";
		inputMap = this.jButtonCerrarTipoAutoriConsep.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoAutoriConsep.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoAutoriConsep"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoAutoriConsep";
		inputMap = this.jButtonGuardarCambiosTablaTipoAutoriConsep.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoAutoriConsep.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoAutoriConsep"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoAutoriConsep = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoAutoriConsep.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoAutoriConsep.setToolTipText("Nuevo TipoAutoriConsep");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoAutoriConsep, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoAutoriConsep = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoAutoriConsep.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoAutoriConsep.setToolTipText("Sin Cerrar Ventana TipoAutoriConsep");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoAutoriConsep, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoAutoriConsep = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoAutoriConsep.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoAutoriConsep.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoAutoriConsep, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoAutoriConsep = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoAutoriConsep.setText("Accion");
		this.jComboBoxTiposAccionesTipoAutoriConsep.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoAutoriConsep = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoAutoriConsep.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoAutoriConsep.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoAutoriConsep = new JLabelMe();
		
		this.jLabelAccionesTipoAutoriConsep.setText("Acciones");		
		this.jLabelAccionesTipoAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoAutoriConsep();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoAutoriConsep();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoAutoriConsep=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoAutoriConsep.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoAutoriConsep,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoAutoriConsep.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoAutoriConsep.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoAutoriConsep.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoAutoriConsep.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoAutoriConsep.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoAutoriConsep.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoAutoriConsep, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoAutoriConsep = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoAutoriConsep = new GridBagLayout();
		
		this.jPanelCamposTipoAutoriConsep.setLayout(gridaBagLayoutCamposTipoAutoriConsep);
		this.jPanelCamposOcultosTipoAutoriConsep.setLayout(gridaBagLayoutCamposOcultosTipoAutoriConsep);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();
	this.gridBagConstraintsTipoAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoAutoriConsep.gridy = 0;
	this.gridBagConstraintsTipoAutoriConsep.gridx = 0;
	this.gridBagConstraintsTipoAutoriConsep.ipadx = 0;
	this.gridBagConstraintsTipoAutoriConsep.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoAutoriConsep.add(jLabelIdTipoAutoriConsep, this.gridBagConstraintsTipoAutoriConsep);



	this.gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();
	this.gridBagConstraintsTipoAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoAutoriConsep.gridy = 0;
	this.gridBagConstraintsTipoAutoriConsep.gridx = 1;
	this.gridBagConstraintsTipoAutoriConsep.ipadx = 0;
	this.gridBagConstraintsTipoAutoriConsep.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoAutoriConsep.add(jTextFieldidTipoAutoriConsep, this.gridBagConstraintsTipoAutoriConsep);


	this.gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();
	this.gridBagConstraintsTipoAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoAutoriConsep.gridy = 0;
	this.gridBagConstraintsTipoAutoriConsep.gridx = 0;
	this.gridBagConstraintsTipoAutoriConsep.ipadx = 0;
	this.gridBagConstraintsTipoAutoriConsep.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoAutoriConsep.add(jLabelcodigoTipoAutoriConsep, this.gridBagConstraintsTipoAutoriConsep);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();
		//this.gridBagConstraintsTipoAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoAutoriConsep.gridy = 0;
		this.gridBagConstraintsTipoAutoriConsep.gridx = 2;
		this.gridBagConstraintsTipoAutoriConsep.ipadx = 0;
		this.gridBagConstraintsTipoAutoriConsep.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoAutoriConsep.add(jButtoncodigoTipoAutoriConsepBusqueda, this.gridBagConstraintsTipoAutoriConsep);
	}

	this.gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();
	this.gridBagConstraintsTipoAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoAutoriConsep.gridy = 0;
	this.gridBagConstraintsTipoAutoriConsep.gridx = 1;
	this.gridBagConstraintsTipoAutoriConsep.ipadx = 0;
	this.gridBagConstraintsTipoAutoriConsep.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoAutoriConsep.add(jTextFieldcodigoTipoAutoriConsep, this.gridBagConstraintsTipoAutoriConsep);


	this.gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();
	this.gridBagConstraintsTipoAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoAutoriConsep.gridy = 0;
	this.gridBagConstraintsTipoAutoriConsep.gridx = 0;
	this.gridBagConstraintsTipoAutoriConsep.ipadx = 0;
	this.gridBagConstraintsTipoAutoriConsep.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoAutoriConsep.add(jLabelnombreTipoAutoriConsep, this.gridBagConstraintsTipoAutoriConsep);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();
		//this.gridBagConstraintsTipoAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoAutoriConsep.gridy = 0;
		this.gridBagConstraintsTipoAutoriConsep.gridx = 2;
		this.gridBagConstraintsTipoAutoriConsep.ipadx = 0;
		this.gridBagConstraintsTipoAutoriConsep.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoAutoriConsep.add(jButtonnombreTipoAutoriConsepBusqueda, this.gridBagConstraintsTipoAutoriConsep);
	}

	this.gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();
	this.gridBagConstraintsTipoAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoAutoriConsep.gridy = 0;
	this.gridBagConstraintsTipoAutoriConsep.gridx = 1;
	this.gridBagConstraintsTipoAutoriConsep.ipadx = 0;
	this.gridBagConstraintsTipoAutoriConsep.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoAutoriConsep.add(jTextFieldnombreTipoAutoriConsep, this.gridBagConstraintsTipoAutoriConsep);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();
	this.gridBagConstraintsTipoAutoriConsep.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoAutoriConsep.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoAutoriConsep.gridy = iYPanelCamposTipoAutoriConsep;
	this.gridBagConstraintsTipoAutoriConsep.gridx = iXPanelCamposTipoAutoriConsep++;
	this.gridBagConstraintsTipoAutoriConsep.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoAutoriConsep.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoAutoriConsep.add(this.jPanelidTipoAutoriConsep, this.gridBagConstraintsTipoAutoriConsep);



	if(iXPanelCamposTipoAutoriConsep % 1==0) {
		iXPanelCamposTipoAutoriConsep=0;
		iYPanelCamposTipoAutoriConsep++;
	}
	this.gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();
	this.gridBagConstraintsTipoAutoriConsep.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoAutoriConsep.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoAutoriConsep.gridy = iYPanelCamposTipoAutoriConsep;
	this.gridBagConstraintsTipoAutoriConsep.gridx = iXPanelCamposTipoAutoriConsep++;
	this.gridBagConstraintsTipoAutoriConsep.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoAutoriConsep.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoAutoriConsep.add(this.jPanelcodigoTipoAutoriConsep, this.gridBagConstraintsTipoAutoriConsep);



	if(iXPanelCamposTipoAutoriConsep % 1==0) {
		iXPanelCamposTipoAutoriConsep=0;
		iYPanelCamposTipoAutoriConsep++;
	}
	this.gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();
	this.gridBagConstraintsTipoAutoriConsep.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoAutoriConsep.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoAutoriConsep.gridy = iYPanelCamposTipoAutoriConsep;
	this.gridBagConstraintsTipoAutoriConsep.gridx = iXPanelCamposTipoAutoriConsep++;
	this.gridBagConstraintsTipoAutoriConsep.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoAutoriConsep.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoAutoriConsep.add(this.jPanelnombreTipoAutoriConsep, this.gridBagConstraintsTipoAutoriConsep);



	if(iXPanelCamposTipoAutoriConsep % 1==0) {
		iXPanelCamposTipoAutoriConsep=0;
		iYPanelCamposTipoAutoriConsep++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoAutoriConsep= new GridBagLayout();
		this.jPanelAccionesTipoAutoriConsep.setLayout(gridaBagLayoutAccionesTipoAutoriConsep);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoAutoriConsep= new GridBagLayout();
		this.jPanelAccionesFormularioTipoAutoriConsep.setLayout(gridaBagLayoutAccionesFormularioTipoAutoriConsep);
		
		this.gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsTipoAutoriConsep.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoAutoriConsep.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoAutoriConsep.add(this.jComboBoxTiposAccionesFormularioTipoAutoriConsep, this.gridBagConstraintsTipoAutoriConsep);

		this.gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsTipoAutoriConsep.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoAutoriConsep.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoAutoriConsep.add(this.jCheckBoxPostAccionNuevoTipoAutoriConsep, this.gridBagConstraintsTipoAutoriConsep);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipoautoriconsepSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsTipoAutoriConsep.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoAutoriConsep.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoAutoriConsep.add(this.jCheckBoxPostAccionSinCerrarTipoAutoriConsep, this.gridBagConstraintsTipoAutoriConsep);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipoautoriconsepSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipoautoriconsepSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsTipoAutoriConsep.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoAutoriConsep.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoAutoriConsep.add(this.jCheckBoxPostAccionSinMensajeTipoAutoriConsep, this.gridBagConstraintsTipoAutoriConsep);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsTipoAutoriConsep.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoAutoriConsep.gridy = 0;
		this.gridBagConstraintsTipoAutoriConsep.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoAutoriConsep.add(this.jButtonModificarTipoAutoriConsep, this.gridBagConstraintsTipoAutoriConsep);							

		this.gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsTipoAutoriConsep.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoAutoriConsep.gridy = 0;
		this.gridBagConstraintsTipoAutoriConsep.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoAutoriConsep.add(this.jButtonEliminarTipoAutoriConsep, this.gridBagConstraintsTipoAutoriConsep);
		
			
		this.gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsTipoAutoriConsep.gridy = 0;		
		this.gridBagConstraintsTipoAutoriConsep.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoAutoriConsep.add(this.jButtonActualizarTipoAutoriConsep, this.gridBagConstraintsTipoAutoriConsep);


		this.gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsTipoAutoriConsep.gridy = 0;		
		this.gridBagConstraintsTipoAutoriConsep.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoAutoriConsep.add(this.jButtonGuardarCambiosTipoAutoriConsep, this.gridBagConstraintsTipoAutoriConsep);	
		
		this.gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsTipoAutoriConsep.gridy = 0;		
		this.gridBagConstraintsTipoAutoriConsep.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoAutoriConsep.add(this.jButtonCancelarTipoAutoriConsep, this.gridBagConstraintsTipoAutoriConsep);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoAutoriConsep = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoAutoriConsep);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoautoriconsepSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();						
			this.gridBagConstraintsTipoAutoriConsep.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoAutoriConsep.gridx = 0;		
			//this.gridBagConstraintsTipoAutoriConsep.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoAutoriConsep.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoAutoriConsep.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsTipoAutoriConsep.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoAutoriConsep.gridx =0;
		this.gridBagConstraintsTipoAutoriConsep.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoAutoriConsep.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoAutoriConsep, this.gridBagConstraintsTipoAutoriConsep);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoAutoriConsepJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoAutoriConsep = new TipoAutoriConsepBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Autorizacion Consep DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Autorizacion Consep DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Autorizacion Consep Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoAutoriConsepModel tipoautoriconsepModel=new TipoAutoriConsepModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoAutoriConsepModel.TipoAutoriConsepFocusTraversalPolicy tipoautoriconsepFocusTraversalPolicy = tipoautoriconsepModel.new TipoAutoriConsepFocusTraversalPolicy(this);
			
			//tipoautoriconsepFocusTraversalPolicy.settipoautoriconsepJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipoautoriconsepModel);
			
			
			this.jContentPaneDetalleTipoAutoriConsep = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoAutoriConsep = new GridBagLayout();	
			this.jContentPaneDetalleTipoAutoriConsep.setLayout(gridaBagLayoutDetalleTipoAutoriConsep);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoAutoriConsep = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();
				this.gridBagConstraintsTipoAutoriConsep.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoAutoriConsep.gridx = 0;
					
				
				this.jContentPaneDetalleTipoAutoriConsep.add(jTtoolBarDetalleTipoAutoriConsep, gridBagConstraintsTipoAutoriConsep);								
				
}
			
			this.jScrollPanelDatosEdicionTipoAutoriConsep=   new JScrollPane(jContentPaneDetalleTipoAutoriConsep,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoAutoriConsep.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoAutoriConsep.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoAutoriConsep.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoAutoriConsep=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoAutoriConsep.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoAutoriConsep.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoAutoriConsep.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoAutoriConsep.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoAutoriConsep.gridx = 0;
	        
			this.jContentPaneDetalleTipoAutoriConsep.add(jPanelCamposTipoAutoriConsep, gridBagConstraintsTipoAutoriConsep);
			
			
			
			
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
						&& tipoautoriconsepSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameAutoriConsep(this.puedeCargarPorParteAutoriConsep,false,-1);
					
					if(this.tipoautoriconsepSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoAutoriConsep= new GridBagConstraints();
						this.gridBagConstraintsTipoAutoriConsep.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoAutoriConsep.gridx = 0;
						this.jContentPaneDetalleTipoAutoriConsep.add(this.jTabbedPaneRelacionesTipoAutoriConsep, this.gridBagConstraintsTipoAutoriConsep);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoAutoriConsep.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameAutoriConsep(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoAutoriConsep.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();
					this.gridBagConstraintsTipoAutoriConsep.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoAutoriConsep.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoAutoriConsep.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoAutoriConsep.gridx = 0;
					
				
					this.jContentPaneDetalleTipoAutoriConsep.add(jPanelCamposOcultosTipoAutoriConsep, gridBagConstraintsTipoAutoriConsep);
				
					this.jPanelCamposOcultosTipoAutoriConsep.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsTipoAutoriConsep.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsTipoAutoriConsep.gridx = 0;
	        this.gridBagConstraintsTipoAutoriConsep.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoAutoriConsep.add(this.jPanelAccionesFormularioTipoAutoriConsep, this.gridBagConstraintsTipoAutoriConsep);							
			
			
			
			this.gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();
	        this.gridBagConstraintsTipoAutoriConsep.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsTipoAutoriConsep.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoAutoriConsep.add(this.jPanelAccionesTipoAutoriConsep, this.gridBagConstraintsTipoAutoriConsep);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoAutoriConsep);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoAutoriConsep=   new JScrollPane(this.jPanelCamposTipoAutoriConsep,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoAutoriConsep.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoAutoriConsep.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoAutoriConsep.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsTipoAutoriConsep.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoAutoriConsep.gridx = 0;
			this.gridBagConstraintsTipoAutoriConsep.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoAutoriConsep.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoAutoriConsep.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoAutoriConsep, this.gridBagConstraintsTipoAutoriConsep);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsTipoAutoriConsep.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoAutoriConsep.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoAutoriConsep, this.gridBagConstraintsTipoAutoriConsep);			
			
			this.gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsTipoAutoriConsep.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoAutoriConsep.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoAutoriConsep, this.gridBagConstraintsTipoAutoriConsep);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsTipoAutoriConsep.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoAutoriConsep.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoAutoriConsep, this.gridBagConstraintsTipoAutoriConsep);
			
			
		this.gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsTipoAutoriConsep.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoAutoriConsep.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoAutoriConsep, this.gridBagConstraintsTipoAutoriConsep);
		
			
		this.gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsTipoAutoriConsep.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoAutoriConsep.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoAutoriConsep, this.gridBagConstraintsTipoAutoriConsep);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoAutoriConsep;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoAutoriConsep;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameAutoriConsep(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.autoriconsepSessionBean=new AutoriConsepSessionBean();
		this.autoriconsepSessionBean.setConGuardarRelaciones(true);
		this.autoriconsepSessionBean.setEsGuardarRelacionado(true);

		this.autoriconsepBeanSwingJInternalFrame=null;//new AutoriConsepBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.autoriconsepBeanSwingJInternalFramePopup=new AutoriConsepBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.autoriconsepBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.autoriconsepSessionBean.getEsGuardarRelacionado()) {

				AutoriConsepJInternalFrame.STIPO_TAMANIO_GENERAL=TipoAutoriConsepJInternalFrame.STIPO_TAMANIO_GENERAL;
				AutoriConsepJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoAutoriConsepJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.autoriconsepSessionBean.setEsGuardarRelacionado(true);

				this.autoriconsepBeanSwingJInternalFrame=new AutoriConsepBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,true,true,true,false);//false->4

				this.autoriconsepBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.autoriconsepBeanSwingJInternalFrame.setautoriconsepSessionBean(this.autoriconsepSessionBean);

				//this.gridBagConstraintsTipoAutoriConsep = new GridBagConstraints();
				//this.gridBagConstraintsTipoAutoriConsep.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoAutoriConsep.gridx = 0;
				//this.jContentPaneDetalleTipoAutoriConsep.add(this.autoriconsepBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoAutoriConsep);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoAutoriConsep.add("Autorizaciones Consepes",this.autoriconsepBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoAutoriConsep.setComponentAt(iIndexTab,this.autoriconsepBeanSwingJInternalFrame.getContentPane());
				}

				//AutoriConsepJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.autoriconsepSessionBean.setEsGuardarRelacionado(false);
				this.autoriconsepBeanSwingJInternalFrame=null;//new AutoriConsepBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.autoriconsepSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteAutoriConsep) {
					this.jTabbedPaneRelacionesTipoAutoriConsep.add("Autorizaciones Consepes",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarAutoriConsepBeanSwingJInternalFrame(List<TipoAutoriConsep> tipoautoriconseps,TipoAutoriConsep tipoautoriconsep,AutoriConsepBeanSwingJInternalFrame autoriconsepBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//autoriconsepBeanSwingJInternalFrame=new AutoriConsepBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					autoriconsepBeanSwingJInternalFrame.getAutoriConsepLogic().setConnexion(this.tipoautoriconsepLogic.getConnexion());

					autoriconsepBeanSwingJInternalFrame.settipoautoriconsepsForeignKey(tipoautoriconseps);
					autoriconsepBeanSwingJInternalFrame.settipoautoriconsepForeignKey(tipoautoriconsep);
					autoriconsepBeanSwingJInternalFrame.autoriconsepSessionBean.setisBusquedaDesdeForeignKeySesionTipoAutoriConsep(true);
					autoriconsepBeanSwingJInternalFrame.autoriconsepSessionBean.setlidTipoAutoriConsepActual(tipoautoriconsep.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					autoriconsepBeanSwingJInternalFrame.cargarCombosForeignKeyAutoriConsep(autoriconsepBeanSwingJInternalFrame.isCargarCombosDependencia);
					autoriconsepBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoAutoriConsep(true);
					autoriconsepBeanSwingJInternalFrame.setid_tipo_autori_consepFK_IdTipoAutoriConsep(tipoautoriconsep.getId());

					if(!this.conCargarFormDetalle) {
						autoriconsepBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					autoriconsepBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoAutoriConsepForeignKey(tipoautoriconsep,1,false,true,true);
					autoriconsepBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					autoriconsepBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoAutoriConsep");
					autoriconsepBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoAutoriConsep");
					autoriconsepBeanSwingJInternalFrame.inicializarActualizarBindingTablaAutoriConsep(true);
					autoriconsepBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesAutoriConsep("n",autoriconsepBeanSwingJInternalFrame.isGuardarCambiosEnLote, autoriconsepBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					autoriconsepBeanSwingJInternalFrame.setAutoscrolls(true);
					autoriconsepBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						autoriconsepBeanSwingJInternalFrame.actualizarEstadoPanelsAutoriConsep("relacionado");
					} else {
						autoriconsepBeanSwingJInternalFrame.actualizarEstadoPanelsAutoriConsep("no_relacionado");
					}

					autoriconsepBeanSwingJInternalFrame.getjButtonRecargarInformacionAutoriConsep().setVisible(false);

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
