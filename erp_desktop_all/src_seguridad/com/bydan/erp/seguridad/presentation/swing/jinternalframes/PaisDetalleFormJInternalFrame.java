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
package com.bydan.erp.seguridad.presentation.swing.jinternalframes;


import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.seguridad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.seguridad.util.PaisConstantesFunciones;

import com.bydan.erp.seguridad.business.logic.*;
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
public class PaisDetalleFormJInternalFrame extends PaisBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetallePais;
	
	protected JMenuBar jmenuBarDetallePais;
	
	protected JMenu jmenuDetallePais;
	protected JMenu jmenuDetalleArchivoPais;
	protected JMenu jmenuDetalleAccionesPais;
	protected JMenu jmenuDetalleDatosPais;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetallePais = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPais;	
	protected GridBagConstraints gridBagConstraintsPais;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected PaisBeanSwingJInternalFrameAdditional jInternalFrameDetallePais;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected ContinenteBeanSwingJInternalFrame continenteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_continente="";
	
	public PaisSessionBean paisSessionBean;
	
	

	public CiudadBeanSwingJInternalFrame ciudadBeanSwingJInternalFrame=null;
	public CiudadBeanSwingJInternalFrame ciudadBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteCiudad=false;
	public CiudadSessionBean ciudadSessionBean;

	public ProvinciaBeanSwingJInternalFrame provinciaBeanSwingJInternalFrame=null;
	public ProvinciaBeanSwingJInternalFrame provinciaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteProvincia=false;
	public ProvinciaSessionBean provinciaSessionBean;

	public RegionBeanSwingJInternalFrame regionBeanSwingJInternalFrame=null;
	public RegionBeanSwingJInternalFrame regionBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteRegion=false;
	public RegionSessionBean regionSessionBean;
	
	
	public ContinenteSessionBean continenteSessionBean;	
	
	public PaisLogic paisLogic;
	
	public JScrollPane jScrollPanelDatosPais;
	public JScrollPane jScrollPanelDatosEdicionPais;
	public JScrollPane jScrollPanelDatosGeneralPais;
	
	protected JPanel jPanelCamposPais;    
	protected JPanel jPanelCamposOcultosPais;    	
	protected JPanel jPanelAccionesPais;
	protected JPanel jPanelAccionesFormularioPais;
    
	
	
	protected Integer iXPanelCamposPais=0;
	protected Integer iYPanelCamposPais=0;
	
	protected Integer iXPanelCamposOcultosPais=0;
	protected Integer iYPanelCamposOcultosPais=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoPais;
	public JButton jButtonModificarPais;
	public JButton jButtonActualizarPais;
    public JButton jButtonEliminarPais;
	public JButton jButtonCancelarPais;
    public JButton jButtonGuardarCambiosPais;
	public JButton jButtonGuardarCambiosTablaPais;
	protected JButton jButtonCerrarPais;
	
	
	protected JButton jButtonProcesarInformacionPais;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoPais;
	protected JCheckBox jCheckBoxPostAccionSinCerrarPais;
	protected JCheckBox jCheckBoxPostAccionSinMensajePais;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPais;
	protected JButton jButtonModificarToolBarPais;
	protected JButton jButtonActualizarToolBarPais;
    protected JButton jButtonEliminarToolBarPais;
	protected JButton jButtonCancelarToolBarPais;
    protected JButton jButtonGuardarCambiosToolBarPais;
	protected JButton jButtonGuardarCambiosTablaToolBarPais;
	protected JButton jButtonMostrarOcultarTablaToolBarPais;
	protected JButton jButtonCerrarToolBarPais;
	
	protected JButton jButtonProcesarInformacionToolBarPais;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPais;
	protected JMenuItem jMenuItemModificarPais;
	protected JMenuItem jMenuItemActualizarPais;
    protected JMenuItem jMenuItemEliminarPais;
	protected JMenuItem jMenuItemCancelarPais;
    protected JMenuItem jMenuItemGuardarCambiosPais;
	protected JMenuItem jMenuItemGuardarCambiosTablaPais;
	protected JMenuItem jMenuItemCerrarPais;
	protected JMenuItem jMenuItemDetalleCerrarPais;
	protected JMenuItem jMenuItemDetalleMostarOcultarPais;
	
	protected JMenuItem jMenuItemProcesarInformacionPais;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPais;
	protected JMenuItem jMenuItemMostrarOcultarPais;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPais;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPais;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPais;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioPais;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidPais;
	public JLabel jLabelIdPais;
	public JLabel jLabelidPais;
	public JButton jButtonidPaisBusqueda= new JButtonMe();

	public JPanel jPanelcodigoPais;
	public JLabel jLabelcodigoPais;
	public JTextField jTextFieldcodigoPais;
	public JButton jButtoncodigoPaisBusqueda= new JButtonMe();

	public JPanel jPanelnombrePais;
	public JLabel jLabelnombrePais;
	public JTextArea jTextAreanombrePais;
	public JScrollPane jscrollPanenombrePais;
	public JButton jButtonnombrePaisBusqueda= new JButtonMe();

	public JPanel jPanelnacionalidadPais;
	public JLabel jLabelnacionalidadPais;
	public JTextField jTextFieldnacionalidadPais;
	public JButton jButtonnacionalidadPaisBusqueda= new JButtonMe();

	
	public JPanel jPanelid_continentePais;
	public JLabel jLabelid_continentePais;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_continentePais;
	public JButton jButtonid_continentePais= new JButtonMe();
	public JButton jButtonid_continentePaisUpdate= new JButtonMe();
	public JButton jButtonid_continentePaisBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesPais;
	
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
	public int iHeightFormulario=594;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public PaisDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposPais=new JPanel();
				this.jPanelAccionesFormularioPais=new JPanel();
				this.jmenuBarDetallePais=new JMenuBar();
				this.jTtoolBarDetallePais=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PaisDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Pais No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public PaisDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Pais No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PaisDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Pais No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PaisDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Pais No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PaisDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Pais No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarPais() {
		return this.jButtonActualizarToolBarPais;
	}
	
	public JButton getjButtonEliminarToolBarPais() {
		return this.jButtonEliminarToolBarPais;
	}
	
	public JButton getjButtonCancelarToolBarPais() {
		return this.jButtonCancelarToolBarPais;
	}		
	
	public JButton getjButtonProcesarInformacionPais() {
		return this.jButtonProcesarInformacionPais;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPais)	{
		this.jButtonProcesarInformacionPais = jButtonProcesarInformacionPais;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPais() {
		return this.jComboBoxTiposAccionesPais;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPais(
			JComboBox jComboBoxTiposRelacionesPais) {
		this.jComboBoxTiposRelacionesPais = jComboBoxTiposRelacionesPais;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPais(
			JComboBox jComboBoxTiposAccionesPais) {
		this.jComboBoxTiposAccionesPais = jComboBoxTiposAccionesPais;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioPais() {
		return this.jComboBoxTiposAccionesFormularioPais;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioPais(
			JComboBox jComboBoxTiposAccionesFormularioPais) {
		this.jComboBoxTiposAccionesFormularioPais = jComboBoxTiposAccionesFormularioPais;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.paisSessionBean=new PaisSessionBean();
		
		this.paisSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.paisSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.paisSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.ciudadSessionBean=new CiudadSessionBean();
		//this.provinciaSessionBean=new ProvinciaSessionBean();
		//this.regionSessionBean=new RegionSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PaisJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PaisJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PaisJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Pais MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.paisSessionBean.getEsGuardarRelacionado()) {
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
	
		PaisJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetallePais= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarPais=new JButtonMe();
				this.jButtonModificarToolBarPais=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarPais=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarPais,this.jTtoolBarDetallePais,
							"actualizar","actualizar","Actualizar"+" "+PaisConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarPais=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarPais,this.jTtoolBarDetallePais,
							"eliminar","eliminar","Eliminar"+" "+PaisConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarPais=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarPais,this.jTtoolBarDetallePais,
							"cancelar","cancelar","Cancelar"+" "+PaisConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarPais=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarPais,this.jTtoolBarDetallePais,
							"guardarcambios","guardarcambios","Guardar"+" "+PaisConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarPais,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarPais,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarPais,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetallePais=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetallePais=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoPais=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesPais=new JMenuMe("Acciones");
		this.jmenuDetalleDatosPais=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPais= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPais.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPais,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPais, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarPais= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarPais.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarPais,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarPais, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarPais= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarPais.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarPais,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarPais, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarPais= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarPais.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarPais,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarPais, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarPais= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarPais.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarPais,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarPais, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosPais= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPais.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPais,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPais, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPais= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPais.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPais,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPais, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarPais= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarPais.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarPais,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarPais, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPais= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPais.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPais,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPais, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPais= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPais.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPais,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPais, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoPais.add(this.jMenuItemDetalleCerrarPais);
		
		this.jmenuDetalleAccionesPais.add(this.jMenuItemActualizarPais);
		this.jmenuDetalleAccionesPais.add(this.jMenuItemEliminarPais);
		this.jmenuDetalleAccionesPais.add(this.jMenuItemCancelarPais);		
		
		//this.jmenuDetalleDatosPais.add(this.jMenuItemDetalleAbrirOrderByPais);				
		this.jmenuDetalleDatosPais.add(this.jMenuItemDetalleMostarOcultarPais);				
				
		//this.jmenuDetalleAccionesPais.add(this.jMenuItemGuardarCambiosPais);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoPais, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesPais, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosPais, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetallePais.add(this.jmenuDetalleArchivoPais);		
		this.jmenuBarDetallePais.add(this.jmenuDetalleAccionesPais);		
		this.jmenuBarDetallePais.add(this.jmenuDetalleDatosPais);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetallePais, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetallePais.add(this.jmenuDetallePais);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetallePais);				
	}
	
	
	public void inicializarElementosCamposPais() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdPais = new JLabelMe();
		jLabelIdPais.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdPais.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPais.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPais.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdPais,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidPais = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidPais.setToolTipText(PaisConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutPais= new GridBagLayout();

		this.jPanelidPais.setLayout(this.gridaBagLayoutPais);

		jLabelidPais = new JLabel();
		jLabelidPais.setText("Id");

		jLabelidPais.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPais.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPais.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoPais = new JLabelMe();
		this.jLabelcodigoPais.setText(""+PaisConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoPais.setToolTipText("Codigo");
		this.jLabelcodigoPais.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoPais.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoPais.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoPais,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoPais=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoPais.setToolTipText(PaisConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutPais = new GridBagLayout();
		this.jPanelcodigoPais.setLayout(this.gridaBagLayoutPais);


		jTextFieldcodigoPais= new JTextFieldMe();

		jTextFieldcodigoPais.setEnabled(false);
		jTextFieldcodigoPais.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoPais.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoPais.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoPais,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoPaisBusqueda= new JButtonMe();
		this.jButtoncodigoPaisBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoPaisBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoPaisBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoPaisBusqueda.setText("U");
		this.jButtoncodigoPaisBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoPaisBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoPaisBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoPais.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoPais.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoPaisBusqueda"));

		if(this.paisSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoPaisBusqueda.setVisible(false);		}


					
		this.jLabelnombrePais = new JLabelMe();
		this.jLabelnombrePais.setText(""+PaisConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombrePais.setToolTipText("Nombre");
		this.jLabelnombrePais.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombrePais.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombrePais.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombrePais,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombrePais=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombrePais.setToolTipText(PaisConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutPais = new GridBagLayout();
		this.jPanelnombrePais.setLayout(this.gridaBagLayoutPais);


		jTextAreanombrePais= new JTextAreaMe();
		jTextAreanombrePais.setEnabled(false);
		jTextAreanombrePais.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombrePais.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombrePais.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombrePais.setLineWrap(true);
		jTextAreanombrePais.setWrapStyleWord(true);
		jTextAreanombrePais.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombrePais.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreanombrePais,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombrePais = new JScrollPane(jTextAreanombrePais);
		jscrollPanenombrePais.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanenombrePais.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanenombrePais.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtonnombrePaisBusqueda= new JButtonMe();
		this.jButtonnombrePaisBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombrePaisBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombrePaisBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombrePaisBusqueda.setText("U");
		this.jButtonnombrePaisBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombrePaisBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombrePaisBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombrePais.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombrePais.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombrePaisBusqueda"));

		if(this.paisSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombrePaisBusqueda.setVisible(false);		}


					
		this.jLabelnacionalidadPais = new JLabelMe();
		this.jLabelnacionalidadPais.setText(""+PaisConstantesFunciones.LABEL_NACIONALIDAD+" : *");
		this.jLabelnacionalidadPais.setToolTipText("Nacionalidad");
		this.jLabelnacionalidadPais.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnacionalidadPais.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnacionalidadPais.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnacionalidadPais,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnacionalidadPais=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnacionalidadPais.setToolTipText(PaisConstantesFunciones.LABEL_NACIONALIDAD);
		this.gridaBagLayoutPais = new GridBagLayout();
		this.jPanelnacionalidadPais.setLayout(this.gridaBagLayoutPais);


		jTextFieldnacionalidadPais= new JTextFieldMe();

		jTextFieldnacionalidadPais.setEnabled(false);
		jTextFieldnacionalidadPais.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnacionalidadPais.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnacionalidadPais.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnacionalidadPais,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnacionalidadPaisBusqueda= new JButtonMe();
		this.jButtonnacionalidadPaisBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnacionalidadPaisBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnacionalidadPaisBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnacionalidadPaisBusqueda.setText("U");
		this.jButtonnacionalidadPaisBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnacionalidadPaisBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnacionalidadPaisBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnacionalidadPais.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnacionalidadPais.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nacionalidadPaisBusqueda"));

		if(this.paisSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnacionalidadPaisBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysPais() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_continentePais = new JLabelMe();
		this.jLabelid_continentePais.setText(""+PaisConstantesFunciones.LABEL_IDCONTINENTE+" : *");
		this.jLabelid_continentePais.setToolTipText("Continente");
		this.jLabelid_continentePais.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_continentePais.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_continentePais.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_continentePais,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_continentePais=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_continentePais.setToolTipText(PaisConstantesFunciones.LABEL_IDCONTINENTE);
		this.gridaBagLayoutPais = new GridBagLayout();
		this.jPanelid_continentePais.setLayout(this.gridaBagLayoutPais);


		jComboBoxid_continentePais= new JComboBoxMe();
		jComboBoxid_continentePais.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_continentePais.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_continentePais.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_continentePais,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_continentePais= new JButtonMe();
		this.jButtonid_continentePais.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_continentePais.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_continentePais.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_continentePais.setText("Buscar");
		this.jButtonid_continentePais.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_continentePais.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_continentePais,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_continentePais.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_continentePais.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_continentePais"));

		this.jButtonid_continentePaisBusqueda= new JButtonMe();
		this.jButtonid_continentePaisBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_continentePaisBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_continentePaisBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_continentePaisBusqueda.setText("U");
		this.jButtonid_continentePaisBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_continentePaisBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_continentePaisBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_continentePais.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_continentePais.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_continentePaisBusqueda"));

		if(this.paisSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_continentePaisBusqueda.setVisible(false);		}

		this.jButtonid_continentePaisUpdate= new JButtonMe();
		this.jButtonid_continentePaisUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_continentePaisUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_continentePaisUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_continentePaisUpdate.setText("U");
		this.jButtonid_continentePaisUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_continentePaisUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_continentePaisUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_continentePais.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_continentePais.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_continentePaisUpdate"));



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
		//this.jInternalFrameDetallePais = new PaisBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Pais DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPais= new GridBagLayout();
		

		
		String sToolTipPais="";
		sToolTipPais=PaisConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPais+="(Seguridad.Pais)";
		}
		
		if(!this.paisSessionBean.getEsGuardarRelacionado()) {
			sToolTipPais+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoPais = new JButtonMe();
		this.jButtonModificarPais = new JButtonMe();
        this.jButtonActualizarPais = new JButtonMe();
        this.jButtonEliminarPais = new JButtonMe();
        this.jButtonCancelarPais = new JButtonMe();
        this.jButtonGuardarCambiosPais = new JButtonMe();
		this.jButtonGuardarCambiosTablaPais = new JButtonMe();
		this.jButtonCerrarPais = new JButtonMe();
		
		this.jScrollPanelDatosPais = new JScrollPane();   
        this.jScrollPanelDatosEdicionPais = new JScrollPane();
		this.jScrollPanelDatosGeneralPais = new JScrollPane();
				
		
		
		this.jPanelCamposPais = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosPais = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesPais = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioPais = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Pais";
		
		if(!this.paisSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPais.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Paises" + this.sPath));
		} else {
			this.jScrollPanelDatosPais.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionPais.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralPais.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposPais.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposPais.setName("jPanelCamposPais"); 

		this.jPanelCamposOcultosPais.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosPais.setName("jPanelCamposOcultosPais"); 

        this.jPanelAccionesPais.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPais.setToolTipText("Acciones");
        this.jPanelAccionesPais.setName("Acciones"); 

		this.jPanelAccionesFormularioPais.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioPais.setToolTipText("Acciones");
        this.jPanelAccionesFormularioPais.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionPais, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPais, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPais, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposPais, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosPais, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioPais, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoPais.setText("Nuevo");
		this.jButtonModificarPais.setText("Editar");
        this.jButtonActualizarPais.setText("Actualizar");
        this.jButtonEliminarPais.setText("Eliminar");
        this.jButtonCancelarPais.setText("Cancelar");
        this.jButtonGuardarCambiosPais.setText("Guardar");
		this.jButtonGuardarCambiosTablaPais.setText("Guardar");
		this.jButtonCerrarPais.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPais,"nuevo_button","Nuevo",this.paisSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarPais,"modificar_button","Editar",this.paisSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarPais,"actualizar_button","Actualizar",this.paisSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarPais,"eliminar_button","Eliminar",this.paisSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarPais,"cancelar_button","Cancelar",this.paisSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosPais,"guardarcambios_button","Guardar",this.paisSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPais,"guardarcambiostabla_button","Guardar",this.paisSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPais,"cerrar_button","Salir",this.paisSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPais, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarPais, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosPais, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPais, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPais, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarPais, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarPais, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarPais, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoPais.setToolTipText("Nuevo"+" "+PaisConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarPais.setToolTipText("Editar"+" "+PaisConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarPais.setToolTipText("Actualizar"+" "+PaisConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarPais.setToolTipText("Eliminar)"+" "+PaisConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarPais.setToolTipText("Cancelar"+" "+PaisConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosPais.setToolTipText("Guardar"+" "+PaisConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaPais.setToolTipText("Guardar"+" "+PaisConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPais.setToolTipText("Salir"+" "+PaisConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPais";
		inputMap = this.jButtonNuevoPais.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPais.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPais"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarPais";
		inputMap = this.jButtonActualizarPais.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarPais.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarPais"));
		
		//ELIMINAR
		sMapKey = "EliminarPais";
		inputMap = this.jButtonEliminarPais.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarPais.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarPais"));
		
		//CANCELAR	
		sMapKey = "CancelarPais";
		inputMap = this.jButtonCancelarPais.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarPais.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarPais"));
		
		//CERRAR		
		sMapKey = "CerrarPais";
		inputMap = this.jButtonCerrarPais.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPais.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPais"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPais";
		inputMap = this.jButtonGuardarCambiosTablaPais.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPais.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPais"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoPais = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoPais.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoPais.setToolTipText("Nuevo Pais");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoPais, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarPais = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarPais.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarPais.setToolTipText("Sin Cerrar Ventana Pais");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarPais, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajePais = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajePais.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajePais.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajePais, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesPais = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPais.setText("Accion");
		this.jComboBoxTiposAccionesPais.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioPais = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioPais.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioPais.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesPais = new JLabelMe();
		
		this.jLabelAccionesPais.setText("Acciones");		
		this.jLabelAccionesPais.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPais.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPais.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposPais();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysPais();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesPais=new JTabbedPane();
		this.jTabbedPaneRelacionesPais.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesPais,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesPais.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPais.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPais.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPais, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioPais.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPais.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPais.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioPais, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposPais = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosPais = new GridBagLayout();
		
		this.jPanelCamposPais.setLayout(gridaBagLayoutCamposPais);
		this.jPanelCamposOcultosPais.setLayout(gridaBagLayoutCamposOcultosPais);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsPais = new GridBagConstraints();
	this.gridBagConstraintsPais.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPais.gridy = 0;
	this.gridBagConstraintsPais.gridx = 0;
	this.gridBagConstraintsPais.ipadx = 0;
	this.gridBagConstraintsPais.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidPais.add(jLabelIdPais, this.gridBagConstraintsPais);



	this.gridBagConstraintsPais = new GridBagConstraints();
	this.gridBagConstraintsPais.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPais.gridy = 0;
	this.gridBagConstraintsPais.gridx = 1;
	this.gridBagConstraintsPais.ipadx = 0;
	this.gridBagConstraintsPais.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidPais.add(jLabelidPais, this.gridBagConstraintsPais);


	this.gridBagConstraintsPais = new GridBagConstraints();
	this.gridBagConstraintsPais.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPais.gridy = 0;
	this.gridBagConstraintsPais.gridx = 0;
	this.gridBagConstraintsPais.ipadx = 0;
	this.gridBagConstraintsPais.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_continentePais.add(jLabelid_continentePais, this.gridBagConstraintsPais);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPais = new GridBagConstraints();
		//this.gridBagConstraintsPais.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPais.gridy = 0;
		this.gridBagConstraintsPais.gridx = 2;
		this.gridBagConstraintsPais.ipadx = 0;
		this.gridBagConstraintsPais.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_continentePais.add(jButtonid_continentePaisBusqueda, this.gridBagConstraintsPais);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPais = new GridBagConstraints();
		//this.gridBagConstraintsPais.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPais.gridy = 0;
		this.gridBagConstraintsPais.gridx = 3;
		this.gridBagConstraintsPais.ipadx = 0;
		this.gridBagConstraintsPais.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_continentePais.add(jButtonid_continentePaisUpdate, this.gridBagConstraintsPais);
	}

	this.gridBagConstraintsPais = new GridBagConstraints();
	this.gridBagConstraintsPais.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPais.gridy = 0;
	this.gridBagConstraintsPais.gridx = 1;
	this.gridBagConstraintsPais.ipadx = 0;
	this.gridBagConstraintsPais.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_continentePais.add(jComboBoxid_continentePais, this.gridBagConstraintsPais);


	this.gridBagConstraintsPais = new GridBagConstraints();
	this.gridBagConstraintsPais.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPais.gridy = 0;
	this.gridBagConstraintsPais.gridx = 0;
	this.gridBagConstraintsPais.ipadx = 0;
	this.gridBagConstraintsPais.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoPais.add(jLabelcodigoPais, this.gridBagConstraintsPais);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPais = new GridBagConstraints();
		//this.gridBagConstraintsPais.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPais.gridy = 0;
		this.gridBagConstraintsPais.gridx = 2;
		this.gridBagConstraintsPais.ipadx = 0;
		this.gridBagConstraintsPais.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoPais.add(jButtoncodigoPaisBusqueda, this.gridBagConstraintsPais);
	}

	this.gridBagConstraintsPais = new GridBagConstraints();
	this.gridBagConstraintsPais.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPais.gridy = 0;
	this.gridBagConstraintsPais.gridx = 1;
	this.gridBagConstraintsPais.ipadx = 0;
	this.gridBagConstraintsPais.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoPais.add(jTextFieldcodigoPais, this.gridBagConstraintsPais);


	this.gridBagConstraintsPais = new GridBagConstraints();
	this.gridBagConstraintsPais.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPais.gridy = 0;
	this.gridBagConstraintsPais.gridx = 0;
	this.gridBagConstraintsPais.ipadx = 0;
	this.gridBagConstraintsPais.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombrePais.add(jLabelnombrePais, this.gridBagConstraintsPais);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPais = new GridBagConstraints();
		//this.gridBagConstraintsPais.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPais.gridy = 0;
		this.gridBagConstraintsPais.gridx = 2;
		this.gridBagConstraintsPais.ipadx = 0;
		this.gridBagConstraintsPais.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombrePais.add(jButtonnombrePaisBusqueda, this.gridBagConstraintsPais);
	}

	this.gridBagConstraintsPais = new GridBagConstraints();
	this.gridBagConstraintsPais.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPais.gridy = 0;
	this.gridBagConstraintsPais.gridx = 1;
	this.gridBagConstraintsPais.ipadx = 0;
	this.gridBagConstraintsPais.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombrePais.add(jscrollPanenombrePais, this.gridBagConstraintsPais);


	this.gridBagConstraintsPais = new GridBagConstraints();
	this.gridBagConstraintsPais.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPais.gridy = 0;
	this.gridBagConstraintsPais.gridx = 0;
	this.gridBagConstraintsPais.ipadx = 0;
	this.gridBagConstraintsPais.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnacionalidadPais.add(jLabelnacionalidadPais, this.gridBagConstraintsPais);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPais = new GridBagConstraints();
		//this.gridBagConstraintsPais.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPais.gridy = 0;
		this.gridBagConstraintsPais.gridx = 2;
		this.gridBagConstraintsPais.ipadx = 0;
		this.gridBagConstraintsPais.insets = new Insets(0, 0, 0, 0);
		this.jPanelnacionalidadPais.add(jButtonnacionalidadPaisBusqueda, this.gridBagConstraintsPais);
	}

	this.gridBagConstraintsPais = new GridBagConstraints();
	this.gridBagConstraintsPais.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPais.gridy = 0;
	this.gridBagConstraintsPais.gridx = 1;
	this.gridBagConstraintsPais.ipadx = 0;
	this.gridBagConstraintsPais.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnacionalidadPais.add(jTextFieldnacionalidadPais, this.gridBagConstraintsPais);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsPais = new GridBagConstraints();
	this.gridBagConstraintsPais.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPais.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPais.gridy = iYPanelCamposPais;
	this.gridBagConstraintsPais.gridx = iXPanelCamposPais++;
	this.gridBagConstraintsPais.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPais.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPais.add(this.jPanelidPais, this.gridBagConstraintsPais);



	if(iXPanelCamposPais % 1==0) {
		iXPanelCamposPais=0;
		iYPanelCamposPais++;
	}
	this.gridBagConstraintsPais = new GridBagConstraints();
	this.gridBagConstraintsPais.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPais.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPais.gridy = iYPanelCamposPais;
	this.gridBagConstraintsPais.gridx = iXPanelCamposPais++;
	this.gridBagConstraintsPais.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPais.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPais.add(this.jPanelid_continentePais, this.gridBagConstraintsPais);



	if(iXPanelCamposPais % 1==0) {
		iXPanelCamposPais=0;
		iYPanelCamposPais++;
	}
	this.gridBagConstraintsPais = new GridBagConstraints();
	this.gridBagConstraintsPais.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPais.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPais.gridy = iYPanelCamposPais;
	this.gridBagConstraintsPais.gridx = iXPanelCamposPais++;
	this.gridBagConstraintsPais.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPais.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPais.add(this.jPanelcodigoPais, this.gridBagConstraintsPais);



	if(iXPanelCamposPais % 1==0) {
		iXPanelCamposPais=0;
		iYPanelCamposPais++;
	}
	this.gridBagConstraintsPais = new GridBagConstraints();
	this.gridBagConstraintsPais.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPais.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPais.gridy = iYPanelCamposPais;
	this.gridBagConstraintsPais.gridx = iXPanelCamposPais++;
	this.gridBagConstraintsPais.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPais.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPais.add(this.jPanelnombrePais, this.gridBagConstraintsPais);



	if(iXPanelCamposPais % 1==0) {
		iXPanelCamposPais=0;
		iYPanelCamposPais++;
	}
	this.gridBagConstraintsPais = new GridBagConstraints();
	this.gridBagConstraintsPais.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPais.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPais.gridy = iYPanelCamposPais;
	this.gridBagConstraintsPais.gridx = iXPanelCamposPais++;
	this.gridBagConstraintsPais.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPais.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPais.add(this.jPanelnacionalidadPais, this.gridBagConstraintsPais);



	if(iXPanelCamposPais % 1==0) {
		iXPanelCamposPais=0;
		iYPanelCamposPais++;
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
			
		GridBagLayout gridaBagLayoutAccionesPais= new GridBagLayout();
		this.jPanelAccionesPais.setLayout(gridaBagLayoutAccionesPais);
		
		GridBagLayout gridaBagLayoutAccionesFormularioPais= new GridBagLayout();
		this.jPanelAccionesFormularioPais.setLayout(gridaBagLayoutAccionesFormularioPais);
		
		this.gridBagConstraintsPais = new GridBagConstraints();
		this.gridBagConstraintsPais.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPais.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPais.add(this.jComboBoxTiposAccionesFormularioPais, this.gridBagConstraintsPais);

		this.gridBagConstraintsPais = new GridBagConstraints();
		this.gridBagConstraintsPais.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPais.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPais.add(this.jCheckBoxPostAccionNuevoPais, this.gridBagConstraintsPais);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.paisSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsPais = new GridBagConstraints();
			this.gridBagConstraintsPais.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsPais.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioPais.add(this.jCheckBoxPostAccionSinCerrarPais, this.gridBagConstraintsPais);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.paisSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.paisSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsPais = new GridBagConstraints();
			this.gridBagConstraintsPais.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsPais.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioPais.add(this.jCheckBoxPostAccionSinMensajePais, this.gridBagConstraintsPais);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsPais = new GridBagConstraints();
		this.gridBagConstraintsPais.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPais.gridy = 0;
		this.gridBagConstraintsPais.gridx = iPosXAccion++;
			
		this.jPanelAccionesPais.add(this.jButtonModificarPais, this.gridBagConstraintsPais);							

		this.gridBagConstraintsPais = new GridBagConstraints();
		this.gridBagConstraintsPais.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPais.gridy = 0;
		this.gridBagConstraintsPais.gridx =iPosXAccion++;
			
		this.jPanelAccionesPais.add(this.jButtonEliminarPais, this.gridBagConstraintsPais);
		
			
		this.gridBagConstraintsPais = new GridBagConstraints();
		this.gridBagConstraintsPais.gridy = 0;		
		this.gridBagConstraintsPais.gridx = iPosXAccion++;
		
		this.jPanelAccionesPais.add(this.jButtonActualizarPais, this.gridBagConstraintsPais);


		this.gridBagConstraintsPais = new GridBagConstraints();
		this.gridBagConstraintsPais.gridy = 0;		
		this.gridBagConstraintsPais.gridx = iPosXAccion++;
		
		this.jPanelAccionesPais.add(this.jButtonGuardarCambiosPais, this.gridBagConstraintsPais);	
		
		this.gridBagConstraintsPais = new GridBagConstraints();
		this.gridBagConstraintsPais.gridy = 0;		
		this.gridBagConstraintsPais.gridx =iPosXAccion++;
		
		this.jPanelAccionesPais.add(this.jButtonCancelarPais, this.gridBagConstraintsPais);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPais = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPais);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.paisSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPais = new GridBagConstraints();						
			this.gridBagConstraintsPais.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPais.gridx = 0;		
			//this.gridBagConstraintsPais.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPais.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPais.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsPais = new GridBagConstraints();
		this.gridBagConstraintsPais.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPais.gridx =0;
		this.gridBagConstraintsPais.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPais.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPais, this.gridBagConstraintsPais);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(PaisJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetallePais = new PaisBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Pais DATOS");
			
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
			
	        //this.setTitle("[FOR] - Pais DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Pais Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			PaisModel paisModel=new PaisModel(this);
			
			//SI USARA CLASE INTERNA
			//PaisModel.PaisFocusTraversalPolicy paisFocusTraversalPolicy = paisModel.new PaisFocusTraversalPolicy(this);
			
			//paisFocusTraversalPolicy.setpaisJInternalFrame(this);
			
			this.setFocusTraversalPolicy(paisModel);
			
			
			this.jContentPaneDetallePais = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetallePais = new GridBagLayout();	
			this.jContentPaneDetallePais.setLayout(gridaBagLayoutDetallePais);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPais = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsPais = new GridBagConstraints();
				this.gridBagConstraintsPais.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsPais.gridx = 0;
					
				
				this.jContentPaneDetallePais.add(jTtoolBarDetallePais, gridBagConstraintsPais);								
				
}
			
			this.jScrollPanelDatosEdicionPais=   new JScrollPane(jContentPaneDetallePais,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPais.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPais.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPais.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralPais=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPais.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPais.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPais.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPais = new GridBagConstraints();
			
			
	        this.gridBagConstraintsPais.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsPais.gridx = 0;
	        
			this.jContentPaneDetallePais.add(jPanelCamposPais, gridBagConstraintsPais);
			
			
			
			
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
						&& paisSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameCiudad(this.puedeCargarPorParteCiudad,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameProvincia(this.puedeCargarPorParteProvincia,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameRegion(this.puedeCargarPorParteRegion,false,-1);
					
					if(this.paisSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsPais= new GridBagConstraints();
						this.gridBagConstraintsPais.gridy = iGridyRelaciones++;
						this.gridBagConstraintsPais.gridx = 0;
						this.jContentPaneDetallePais.add(this.jTabbedPaneRelacionesPais, this.gridBagConstraintsPais);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesPais.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameCiudad(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameProvincia(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameRegion(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosPais.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsPais = new GridBagConstraints();
					this.gridBagConstraintsPais.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsPais.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsPais.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsPais.gridx = 0;
					
				
					this.jContentPaneDetallePais.add(jPanelCamposOcultosPais, gridBagConstraintsPais);
				
					this.jPanelCamposOcultosPais.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsPais = new GridBagConstraints();
			this.gridBagConstraintsPais.gridy = iGridyRelaciones++;//10;		
	        this.gridBagConstraintsPais.gridx = 0;
	        this.gridBagConstraintsPais.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetallePais.add(this.jPanelAccionesFormularioPais, this.gridBagConstraintsPais);							
			
			
			
			this.gridBagConstraintsPais = new GridBagConstraints();
	        this.gridBagConstraintsPais.gridy = iGridyRelaciones;//10;		
	        this.gridBagConstraintsPais.gridx = 0;
	        
			
			this.jContentPaneDetallePais.add(this.jPanelAccionesPais, this.gridBagConstraintsPais);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionPais);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionPais=   new JScrollPane(this.jPanelCamposPais,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPais.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPais.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPais.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsPais = new GridBagConstraints();
			this.gridBagConstraintsPais.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsPais.gridx = 0;
			this.gridBagConstraintsPais.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsPais.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsPais.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionPais, this.gridBagConstraintsPais);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsPais = new GridBagConstraints();
			this.gridBagConstraintsPais.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPais.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioPais, this.gridBagConstraintsPais);			
			
			this.gridBagConstraintsPais = new GridBagConstraints();
			this.gridBagConstraintsPais.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPais.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesPais, this.gridBagConstraintsPais);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsPais = new GridBagConstraints();
		this.gridBagConstraintsPais.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPais.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPais, this.gridBagConstraintsPais);
			
			
		this.gridBagConstraintsPais = new GridBagConstraints();
		this.gridBagConstraintsPais.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPais.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPais, this.gridBagConstraintsPais);
		
			
		this.gridBagConstraintsPais = new GridBagConstraints();
		this.gridBagConstraintsPais.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPais.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPais, this.gridBagConstraintsPais);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralPais;//jContentPane;
		
		return jScrollPanelDatosEdicionPais;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameCiudad(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.ciudadSessionBean=new CiudadSessionBean();
		this.ciudadSessionBean.setConGuardarRelaciones(false);
		this.ciudadSessionBean.setEsGuardarRelacionado(true);

		this.ciudadBeanSwingJInternalFrame=null;//new CiudadBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.ciudadBeanSwingJInternalFramePopup=new CiudadBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.ciudadBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.ciudadSessionBean.getEsGuardarRelacionado()) {

				CiudadJInternalFrame.STIPO_TAMANIO_GENERAL=PaisJInternalFrame.STIPO_TAMANIO_GENERAL;
				CiudadJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=PaisJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.ciudadSessionBean.setEsGuardarRelacionado(true);

				this.ciudadBeanSwingJInternalFrame=new CiudadBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.ciudadBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.ciudadBeanSwingJInternalFrame.setciudadSessionBean(this.ciudadSessionBean);

				//this.gridBagConstraintsPais = new GridBagConstraints();
				//this.gridBagConstraintsPais.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsPais.gridx = 0;
				//this.jContentPaneDetallePais.add(this.ciudadBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsPais);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesPais.add("Ciudades",this.ciudadBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesPais.setComponentAt(iIndexTab,this.ciudadBeanSwingJInternalFrame.getContentPane());
				}

				//CiudadJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.ciudadSessionBean.setEsGuardarRelacionado(false);
				this.ciudadBeanSwingJInternalFrame=null;//new CiudadBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.ciudadSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteCiudad) {
					this.jTabbedPaneRelacionesPais.add("Ciudades",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameProvincia(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.provinciaSessionBean=new ProvinciaSessionBean();
		this.provinciaSessionBean.setConGuardarRelaciones(false);
		this.provinciaSessionBean.setEsGuardarRelacionado(true);

		this.provinciaBeanSwingJInternalFrame=null;//new ProvinciaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.provinciaBeanSwingJInternalFramePopup=new ProvinciaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.provinciaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.provinciaSessionBean.getEsGuardarRelacionado()) {

				ProvinciaJInternalFrame.STIPO_TAMANIO_GENERAL=PaisJInternalFrame.STIPO_TAMANIO_GENERAL;
				ProvinciaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=PaisJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.provinciaSessionBean.setEsGuardarRelacionado(true);

				this.provinciaBeanSwingJInternalFrame=new ProvinciaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.provinciaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.provinciaBeanSwingJInternalFrame.setprovinciaSessionBean(this.provinciaSessionBean);

				//this.gridBagConstraintsPais = new GridBagConstraints();
				//this.gridBagConstraintsPais.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsPais.gridx = 0;
				//this.jContentPaneDetallePais.add(this.provinciaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsPais);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesPais.add("Provinciaes",this.provinciaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesPais.setComponentAt(iIndexTab,this.provinciaBeanSwingJInternalFrame.getContentPane());
				}

				//ProvinciaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.provinciaSessionBean.setEsGuardarRelacionado(false);
				this.provinciaBeanSwingJInternalFrame=null;//new ProvinciaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.provinciaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteProvincia) {
					this.jTabbedPaneRelacionesPais.add("Provinciaes",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameRegion(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.regionSessionBean=new RegionSessionBean();
		this.regionSessionBean.setConGuardarRelaciones(false);
		this.regionSessionBean.setEsGuardarRelacionado(true);

		this.regionBeanSwingJInternalFrame=null;//new RegionBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.regionBeanSwingJInternalFramePopup=new RegionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.regionBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.regionSessionBean.getEsGuardarRelacionado()) {

				RegionJInternalFrame.STIPO_TAMANIO_GENERAL=PaisJInternalFrame.STIPO_TAMANIO_GENERAL;
				RegionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=PaisJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.regionSessionBean.setEsGuardarRelacionado(true);

				this.regionBeanSwingJInternalFrame=new RegionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.regionBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.regionBeanSwingJInternalFrame.setregionSessionBean(this.regionSessionBean);

				//this.gridBagConstraintsPais = new GridBagConstraints();
				//this.gridBagConstraintsPais.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsPais.gridx = 0;
				//this.jContentPaneDetallePais.add(this.regionBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsPais);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesPais.add("Regiones",this.regionBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesPais.setComponentAt(iIndexTab,this.regionBeanSwingJInternalFrame.getContentPane());
				}

				//RegionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.regionSessionBean.setEsGuardarRelacionado(false);
				this.regionBeanSwingJInternalFrame=null;//new RegionBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.regionSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteRegion) {
					this.jTabbedPaneRelacionesPais.add("Regiones",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarCiudadBeanSwingJInternalFrame(List<Pais> paiss,Pais pais,CiudadBeanSwingJInternalFrame ciudadBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//ciudadBeanSwingJInternalFrame=new CiudadBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					ciudadBeanSwingJInternalFrame.getCiudadLogic().setConnexion(this.paisLogic.getConnexion());

					ciudadBeanSwingJInternalFrame.setpaissForeignKey(paiss);
					ciudadBeanSwingJInternalFrame.setpaisForeignKey(pais);
					ciudadBeanSwingJInternalFrame.ciudadSessionBean.setisBusquedaDesdeForeignKeySesionPais(true);
					ciudadBeanSwingJInternalFrame.ciudadSessionBean.setlidPaisActual(pais.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					ciudadBeanSwingJInternalFrame.cargarCombosForeignKeyCiudad(ciudadBeanSwingJInternalFrame.isCargarCombosDependencia);
					ciudadBeanSwingJInternalFrame.setVisibilidadBusquedasParaPais(true);
					ciudadBeanSwingJInternalFrame.setid_paisFK_IdPais(pais.getId());

					if(!this.conCargarFormDetalle) {
						ciudadBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					ciudadBeanSwingJInternalFrame.setSelectedItemCombosFramePaisForeignKey(pais,1,false,true,true);
					ciudadBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					ciudadBeanSwingJInternalFrame.procesarBusqueda("FK_IdPais");
					ciudadBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdPais");
					ciudadBeanSwingJInternalFrame.inicializarActualizarBindingTablaCiudad(true);
					ciudadBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesCiudad("n",ciudadBeanSwingJInternalFrame.isGuardarCambiosEnLote, ciudadBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					ciudadBeanSwingJInternalFrame.setAutoscrolls(true);
					ciudadBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						ciudadBeanSwingJInternalFrame.actualizarEstadoPanelsCiudad("relacionado");
					} else {
						ciudadBeanSwingJInternalFrame.actualizarEstadoPanelsCiudad("no_relacionado");
					}

					ciudadBeanSwingJInternalFrame.getjButtonRecargarInformacionCiudad().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarProvinciaBeanSwingJInternalFrame(List<Pais> paiss,Pais pais,ProvinciaBeanSwingJInternalFrame provinciaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//provinciaBeanSwingJInternalFrame=new ProvinciaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					provinciaBeanSwingJInternalFrame.getProvinciaLogic().setConnexion(this.paisLogic.getConnexion());

					provinciaBeanSwingJInternalFrame.setpaissForeignKey(paiss);
					provinciaBeanSwingJInternalFrame.setpaisForeignKey(pais);
					provinciaBeanSwingJInternalFrame.provinciaSessionBean.setisBusquedaDesdeForeignKeySesionPais(true);
					provinciaBeanSwingJInternalFrame.provinciaSessionBean.setlidPaisActual(pais.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					provinciaBeanSwingJInternalFrame.cargarCombosForeignKeyProvincia(provinciaBeanSwingJInternalFrame.isCargarCombosDependencia);
					provinciaBeanSwingJInternalFrame.setVisibilidadBusquedasParaPais(true);
					provinciaBeanSwingJInternalFrame.setid_paisFK_IdPais(pais.getId());

					if(!this.conCargarFormDetalle) {
						provinciaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					provinciaBeanSwingJInternalFrame.setSelectedItemCombosFramePaisForeignKey(pais,1,false,true,true);
					provinciaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					provinciaBeanSwingJInternalFrame.procesarBusqueda("FK_IdPais");
					provinciaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdPais");
					provinciaBeanSwingJInternalFrame.inicializarActualizarBindingTablaProvincia(true);
					provinciaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesProvincia("n",provinciaBeanSwingJInternalFrame.isGuardarCambiosEnLote, provinciaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					provinciaBeanSwingJInternalFrame.setAutoscrolls(true);
					provinciaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						provinciaBeanSwingJInternalFrame.actualizarEstadoPanelsProvincia("relacionado");
					} else {
						provinciaBeanSwingJInternalFrame.actualizarEstadoPanelsProvincia("no_relacionado");
					}

					provinciaBeanSwingJInternalFrame.getjButtonRecargarInformacionProvincia().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarRegionBeanSwingJInternalFrame(List<Pais> paiss,Pais pais,RegionBeanSwingJInternalFrame regionBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//regionBeanSwingJInternalFrame=new RegionBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					regionBeanSwingJInternalFrame.getRegionLogic().setConnexion(this.paisLogic.getConnexion());

					regionBeanSwingJInternalFrame.setpaissForeignKey(paiss);
					regionBeanSwingJInternalFrame.setpaisForeignKey(pais);
					regionBeanSwingJInternalFrame.regionSessionBean.setisBusquedaDesdeForeignKeySesionPais(true);
					regionBeanSwingJInternalFrame.regionSessionBean.setlidPaisActual(pais.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					regionBeanSwingJInternalFrame.cargarCombosForeignKeyRegion(regionBeanSwingJInternalFrame.isCargarCombosDependencia);
					regionBeanSwingJInternalFrame.setVisibilidadBusquedasParaPais(true);
					regionBeanSwingJInternalFrame.setid_paisFK_IdPais(pais.getId());

					if(!this.conCargarFormDetalle) {
						regionBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					regionBeanSwingJInternalFrame.setSelectedItemCombosFramePaisForeignKey(pais,1,false,true,true);
					regionBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					regionBeanSwingJInternalFrame.procesarBusqueda("FK_IdPais");
					regionBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdPais");
					regionBeanSwingJInternalFrame.inicializarActualizarBindingTablaRegion(true);
					regionBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesRegion("n",regionBeanSwingJInternalFrame.isGuardarCambiosEnLote, regionBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					regionBeanSwingJInternalFrame.setAutoscrolls(true);
					regionBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						regionBeanSwingJInternalFrame.actualizarEstadoPanelsRegion("relacionado");
					} else {
						regionBeanSwingJInternalFrame.actualizarEstadoPanelsRegion("no_relacionado");
					}

					regionBeanSwingJInternalFrame.getjButtonRecargarInformacionRegion().setVisible(false);

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
