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


import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.seguridad.util.RegionConstantesFunciones;

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
public class RegionDetalleFormJInternalFrame extends RegionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleRegion;
	
	protected JMenuBar jmenuBarDetalleRegion;
	
	protected JMenu jmenuDetalleRegion;
	protected JMenu jmenuDetalleArchivoRegion;
	protected JMenu jmenuDetalleAccionesRegion;
	protected JMenu jmenuDetalleDatosRegion;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleRegion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutRegion;	
	protected GridBagConstraints gridBagConstraintsRegion;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected RegionBeanSwingJInternalFrameAdditional jInternalFrameDetalleRegion;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";
	
	public RegionSessionBean regionSessionBean;
	
	

	public ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame=null;
	public ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteCliente=false;
	public ClienteSessionBean clienteSessionBean;

	public ProvinciaBeanSwingJInternalFrame provinciaBeanSwingJInternalFrame=null;
	public ProvinciaBeanSwingJInternalFrame provinciaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteProvincia=false;
	public ProvinciaSessionBean provinciaSessionBean;

	public ParametroCarteraDefectoBeanSwingJInternalFrame parametrocarteradefectoBeanSwingJInternalFrame=null;
	public ParametroCarteraDefectoBeanSwingJInternalFrame parametrocarteradefectoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteParametroCarteraDefecto=false;
	public ParametroCarteraDefectoSessionBean parametrocarteradefectoSessionBean;
	
	
	public PaisSessionBean paisSessionBean;	
	
	public RegionLogic regionLogic;
	
	public JScrollPane jScrollPanelDatosRegion;
	public JScrollPane jScrollPanelDatosEdicionRegion;
	public JScrollPane jScrollPanelDatosGeneralRegion;
	
	protected JPanel jPanelCamposRegion;    
	protected JPanel jPanelCamposOcultosRegion;    	
	protected JPanel jPanelAccionesRegion;
	protected JPanel jPanelAccionesFormularioRegion;
    
	
	
	protected Integer iXPanelCamposRegion=0;
	protected Integer iYPanelCamposRegion=0;
	
	protected Integer iXPanelCamposOcultosRegion=0;
	protected Integer iYPanelCamposOcultosRegion=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoRegion;
	public JButton jButtonModificarRegion;
	public JButton jButtonActualizarRegion;
    public JButton jButtonEliminarRegion;
	public JButton jButtonCancelarRegion;
    public JButton jButtonGuardarCambiosRegion;
	public JButton jButtonGuardarCambiosTablaRegion;
	protected JButton jButtonCerrarRegion;
	
	
	protected JButton jButtonProcesarInformacionRegion;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoRegion;
	protected JCheckBox jCheckBoxPostAccionSinCerrarRegion;
	protected JCheckBox jCheckBoxPostAccionSinMensajeRegion;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarRegion;
	protected JButton jButtonModificarToolBarRegion;
	protected JButton jButtonActualizarToolBarRegion;
    protected JButton jButtonEliminarToolBarRegion;
	protected JButton jButtonCancelarToolBarRegion;
    protected JButton jButtonGuardarCambiosToolBarRegion;
	protected JButton jButtonGuardarCambiosTablaToolBarRegion;
	protected JButton jButtonMostrarOcultarTablaToolBarRegion;
	protected JButton jButtonCerrarToolBarRegion;
	
	protected JButton jButtonProcesarInformacionToolBarRegion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoRegion;
	protected JMenuItem jMenuItemModificarRegion;
	protected JMenuItem jMenuItemActualizarRegion;
    protected JMenuItem jMenuItemEliminarRegion;
	protected JMenuItem jMenuItemCancelarRegion;
    protected JMenuItem jMenuItemGuardarCambiosRegion;
	protected JMenuItem jMenuItemGuardarCambiosTablaRegion;
	protected JMenuItem jMenuItemCerrarRegion;
	protected JMenuItem jMenuItemDetalleCerrarRegion;
	protected JMenuItem jMenuItemDetalleMostarOcultarRegion;
	
	protected JMenuItem jMenuItemProcesarInformacionRegion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosRegion;
	protected JMenuItem jMenuItemMostrarOcultarRegion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesRegion;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesRegion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesRegion;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioRegion;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidRegion;
	public JLabel jLabelIdRegion;
	public JLabel jLabelidRegion;
	public JButton jButtonidRegionBusqueda= new JButtonMe();

	public JPanel jPanelcodigoRegion;
	public JLabel jLabelcodigoRegion;
	public JTextField jTextFieldcodigoRegion;
	public JButton jButtoncodigoRegionBusqueda= new JButtonMe();

	public JPanel jPanelnombreRegion;
	public JLabel jLabelnombreRegion;
	public JTextArea jTextAreanombreRegion;
	public JScrollPane jscrollPanenombreRegion;
	public JButton jButtonnombreRegionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_paisRegion;
	public JLabel jLabelid_paisRegion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisRegion;
	public JButton jButtonid_paisRegion= new JButtonMe();
	public JButton jButtonid_paisRegionUpdate= new JButtonMe();
	public JButton jButtonid_paisRegionBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesRegion;
	
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
	public int iHeightFormulario=462;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public RegionDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposRegion=new JPanel();
				this.jPanelAccionesFormularioRegion=new JPanel();
				this.jmenuBarDetalleRegion=new JMenuBar();
				this.jTtoolBarDetalleRegion=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RegionDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Region No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public RegionDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Region No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RegionDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Region No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RegionDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Region No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RegionDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Region No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarRegion() {
		return this.jButtonActualizarToolBarRegion;
	}
	
	public JButton getjButtonEliminarToolBarRegion() {
		return this.jButtonEliminarToolBarRegion;
	}
	
	public JButton getjButtonCancelarToolBarRegion() {
		return this.jButtonCancelarToolBarRegion;
	}		
	
	public JButton getjButtonProcesarInformacionRegion() {
		return this.jButtonProcesarInformacionRegion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionRegion)	{
		this.jButtonProcesarInformacionRegion = jButtonProcesarInformacionRegion;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesRegion() {
		return this.jComboBoxTiposAccionesRegion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesRegion(
			JComboBox jComboBoxTiposRelacionesRegion) {
		this.jComboBoxTiposRelacionesRegion = jComboBoxTiposRelacionesRegion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesRegion(
			JComboBox jComboBoxTiposAccionesRegion) {
		this.jComboBoxTiposAccionesRegion = jComboBoxTiposAccionesRegion;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioRegion() {
		return this.jComboBoxTiposAccionesFormularioRegion;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioRegion(
			JComboBox jComboBoxTiposAccionesFormularioRegion) {
		this.jComboBoxTiposAccionesFormularioRegion = jComboBoxTiposAccionesFormularioRegion;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.regionSessionBean=new RegionSessionBean();
		
		this.regionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.regionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.regionSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.clienteSessionBean=new ClienteSessionBean();
		//this.provinciaSessionBean=new ProvinciaSessionBean();
		//this.parametrocarteradefectoSessionBean=new ParametroCarteraDefectoSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		RegionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		RegionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		RegionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Region MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.regionSessionBean.getEsGuardarRelacionado()) {
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
	
		RegionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleRegion= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarRegion=new JButtonMe();
				this.jButtonModificarToolBarRegion=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarRegion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarRegion,this.jTtoolBarDetalleRegion,
							"actualizar","actualizar","Actualizar"+" "+RegionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarRegion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarRegion,this.jTtoolBarDetalleRegion,
							"eliminar","eliminar","Eliminar"+" "+RegionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarRegion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarRegion,this.jTtoolBarDetalleRegion,
							"cancelar","cancelar","Cancelar"+" "+RegionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarRegion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarRegion,this.jTtoolBarDetalleRegion,
							"guardarcambios","guardarcambios","Guardar"+" "+RegionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarRegion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarRegion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarRegion,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleRegion=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleRegion=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoRegion=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesRegion=new JMenuMe("Acciones");
		this.jmenuDetalleDatosRegion=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoRegion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoRegion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRegion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRegion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarRegion= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarRegion.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarRegion,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarRegion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarRegion= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarRegion.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarRegion,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarRegion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarRegion= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarRegion.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarRegion,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarRegion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarRegion= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarRegion.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarRegion,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarRegion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosRegion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosRegion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosRegion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosRegion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarRegion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarRegion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarRegion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarRegion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarRegion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarRegion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarRegion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarRegion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarRegion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarRegion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarRegion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarRegion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarRegion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarRegion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarRegion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarRegion, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoRegion.add(this.jMenuItemDetalleCerrarRegion);
		
		this.jmenuDetalleAccionesRegion.add(this.jMenuItemActualizarRegion);
		this.jmenuDetalleAccionesRegion.add(this.jMenuItemEliminarRegion);
		this.jmenuDetalleAccionesRegion.add(this.jMenuItemCancelarRegion);		
		
		//this.jmenuDetalleDatosRegion.add(this.jMenuItemDetalleAbrirOrderByRegion);				
		this.jmenuDetalleDatosRegion.add(this.jMenuItemDetalleMostarOcultarRegion);				
				
		//this.jmenuDetalleAccionesRegion.add(this.jMenuItemGuardarCambiosRegion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoRegion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesRegion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosRegion, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleRegion.add(this.jmenuDetalleArchivoRegion);		
		this.jmenuBarDetalleRegion.add(this.jmenuDetalleAccionesRegion);		
		this.jmenuBarDetalleRegion.add(this.jmenuDetalleDatosRegion);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleRegion, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleRegion.add(this.jmenuDetalleRegion);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleRegion);				
	}
	
	
	public void inicializarElementosCamposRegion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdRegion = new JLabelMe();
		jLabelIdRegion.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdRegion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdRegion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdRegion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdRegion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidRegion = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidRegion.setToolTipText(RegionConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutRegion= new GridBagLayout();

		this.jPanelidRegion.setLayout(this.gridaBagLayoutRegion);

		jLabelidRegion = new JLabel();
		jLabelidRegion.setText("Id");

		jLabelidRegion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidRegion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidRegion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoRegion = new JLabelMe();
		this.jLabelcodigoRegion.setText(""+RegionConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoRegion.setToolTipText("Codigo");
		this.jLabelcodigoRegion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoRegion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoRegion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoRegion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoRegion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoRegion.setToolTipText(RegionConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutRegion = new GridBagLayout();
		this.jPanelcodigoRegion.setLayout(this.gridaBagLayoutRegion);


		jTextFieldcodigoRegion= new JTextFieldMe();

		jTextFieldcodigoRegion.setEnabled(false);
		jTextFieldcodigoRegion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoRegion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoRegion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoRegion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoRegionBusqueda= new JButtonMe();
		this.jButtoncodigoRegionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoRegionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoRegionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoRegionBusqueda.setText("U");
		this.jButtoncodigoRegionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoRegionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoRegionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoRegion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoRegion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoRegionBusqueda"));

		if(this.regionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoRegionBusqueda.setVisible(false);		}


					
		this.jLabelnombreRegion = new JLabelMe();
		this.jLabelnombreRegion.setText(""+RegionConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreRegion.setToolTipText("Nombre");
		this.jLabelnombreRegion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreRegion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreRegion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreRegion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreRegion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreRegion.setToolTipText(RegionConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutRegion = new GridBagLayout();
		this.jPanelnombreRegion.setLayout(this.gridaBagLayoutRegion);


		jTextAreanombreRegion= new JTextAreaMe();
		jTextAreanombreRegion.setEnabled(false);
		jTextAreanombreRegion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreRegion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreRegion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreRegion.setLineWrap(true);
		jTextAreanombreRegion.setWrapStyleWord(true);
		jTextAreanombreRegion.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreRegion.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreanombreRegion,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreRegion = new JScrollPane(jTextAreanombreRegion);
		jscrollPanenombreRegion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanenombreRegion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanenombreRegion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtonnombreRegionBusqueda= new JButtonMe();
		this.jButtonnombreRegionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreRegionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreRegionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreRegionBusqueda.setText("U");
		this.jButtonnombreRegionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreRegionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreRegionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreRegion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreRegion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreRegionBusqueda"));

		if(this.regionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreRegionBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysRegion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_paisRegion = new JLabelMe();
		this.jLabelid_paisRegion.setText(""+RegionConstantesFunciones.LABEL_IDPAIS+" : *");
		this.jLabelid_paisRegion.setToolTipText("Pais");
		this.jLabelid_paisRegion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisRegion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisRegion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_paisRegion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_paisRegion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_paisRegion.setToolTipText(RegionConstantesFunciones.LABEL_IDPAIS);
		this.gridaBagLayoutRegion = new GridBagLayout();
		this.jPanelid_paisRegion.setLayout(this.gridaBagLayoutRegion);


		jComboBoxid_paisRegion= new JComboBoxMe();
		jComboBoxid_paisRegion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisRegion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisRegion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisRegion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_paisRegion= new JButtonMe();
		this.jButtonid_paisRegion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisRegion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisRegion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisRegion.setText("Buscar");
		this.jButtonid_paisRegion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_paisRegion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisRegion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_paisRegion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisRegion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisRegion"));

		this.jButtonid_paisRegionBusqueda= new JButtonMe();
		this.jButtonid_paisRegionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisRegionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisRegionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisRegionBusqueda.setText("U");
		this.jButtonid_paisRegionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_paisRegionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisRegionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_paisRegion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisRegion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisRegionBusqueda"));

		if(this.regionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_paisRegionBusqueda.setVisible(false);		}

		this.jButtonid_paisRegionUpdate= new JButtonMe();
		this.jButtonid_paisRegionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisRegionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisRegionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisRegionUpdate.setText("U");
		this.jButtonid_paisRegionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_paisRegionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisRegionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_paisRegion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisRegion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisRegionUpdate"));



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
		//this.jInternalFrameDetalleRegion = new RegionBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Region DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutRegion= new GridBagLayout();
		

		
		String sToolTipRegion="";
		sToolTipRegion=RegionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipRegion+="(Seguridad.Region)";
		}
		
		if(!this.regionSessionBean.getEsGuardarRelacionado()) {
			sToolTipRegion+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoRegion = new JButtonMe();
		this.jButtonModificarRegion = new JButtonMe();
        this.jButtonActualizarRegion = new JButtonMe();
        this.jButtonEliminarRegion = new JButtonMe();
        this.jButtonCancelarRegion = new JButtonMe();
        this.jButtonGuardarCambiosRegion = new JButtonMe();
		this.jButtonGuardarCambiosTablaRegion = new JButtonMe();
		this.jButtonCerrarRegion = new JButtonMe();
		
		this.jScrollPanelDatosRegion = new JScrollPane();   
        this.jScrollPanelDatosEdicionRegion = new JScrollPane();
		this.jScrollPanelDatosGeneralRegion = new JScrollPane();
				
		
		
		this.jPanelCamposRegion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosRegion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesRegion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioRegion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Region";
		
		if(!this.regionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosRegion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Regiones" + this.sPath));
		} else {
			this.jScrollPanelDatosRegion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionRegion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralRegion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposRegion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposRegion.setName("jPanelCamposRegion"); 

		this.jPanelCamposOcultosRegion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosRegion.setName("jPanelCamposOcultosRegion"); 

        this.jPanelAccionesRegion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesRegion.setToolTipText("Acciones");
        this.jPanelAccionesRegion.setName("Acciones"); 

		this.jPanelAccionesFormularioRegion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioRegion.setToolTipText("Acciones");
        this.jPanelAccionesFormularioRegion.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionRegion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralRegion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosRegion, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposRegion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosRegion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioRegion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoRegion.setText("Nuevo");
		this.jButtonModificarRegion.setText("Editar");
        this.jButtonActualizarRegion.setText("Actualizar");
        this.jButtonEliminarRegion.setText("Eliminar");
        this.jButtonCancelarRegion.setText("Cancelar");
        this.jButtonGuardarCambiosRegion.setText("Guardar");
		this.jButtonGuardarCambiosTablaRegion.setText("Guardar");
		this.jButtonCerrarRegion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRegion,"nuevo_button","Nuevo",this.regionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarRegion,"modificar_button","Editar",this.regionSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarRegion,"actualizar_button","Actualizar",this.regionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarRegion,"eliminar_button","Eliminar",this.regionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarRegion,"cancelar_button","Cancelar",this.regionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosRegion,"guardarcambios_button","Guardar",this.regionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaRegion,"guardarcambiostabla_button","Guardar",this.regionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarRegion,"cerrar_button","Salir",this.regionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoRegion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarRegion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosRegion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaRegion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarRegion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarRegion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarRegion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarRegion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoRegion.setToolTipText("Nuevo"+" "+RegionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarRegion.setToolTipText("Editar"+" "+RegionConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarRegion.setToolTipText("Actualizar"+" "+RegionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarRegion.setToolTipText("Eliminar)"+" "+RegionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarRegion.setToolTipText("Cancelar"+" "+RegionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosRegion.setToolTipText("Guardar"+" "+RegionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaRegion.setToolTipText("Guardar"+" "+RegionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarRegion.setToolTipText("Salir"+" "+RegionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoRegion";
		inputMap = this.jButtonNuevoRegion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoRegion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoRegion"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarRegion";
		inputMap = this.jButtonActualizarRegion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarRegion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarRegion"));
		
		//ELIMINAR
		sMapKey = "EliminarRegion";
		inputMap = this.jButtonEliminarRegion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarRegion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarRegion"));
		
		//CANCELAR	
		sMapKey = "CancelarRegion";
		inputMap = this.jButtonCancelarRegion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarRegion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarRegion"));
		
		//CERRAR		
		sMapKey = "CerrarRegion";
		inputMap = this.jButtonCerrarRegion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarRegion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarRegion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaRegion";
		inputMap = this.jButtonGuardarCambiosTablaRegion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaRegion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaRegion"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoRegion = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoRegion.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoRegion.setToolTipText("Nuevo Region");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoRegion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarRegion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarRegion.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarRegion.setToolTipText("Sin Cerrar Ventana Region");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarRegion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeRegion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeRegion.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeRegion.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeRegion, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesRegion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesRegion.setText("Accion");
		this.jComboBoxTiposAccionesRegion.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioRegion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioRegion.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioRegion.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesRegion = new JLabelMe();
		
		this.jLabelAccionesRegion.setText("Acciones");		
		this.jLabelAccionesRegion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesRegion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesRegion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposRegion();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysRegion();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesRegion=new JTabbedPane();
		this.jTabbedPaneRelacionesRegion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesRegion,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesRegion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesRegion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesRegion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesRegion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioRegion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioRegion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioRegion.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioRegion, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposRegion = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosRegion = new GridBagLayout();
		
		this.jPanelCamposRegion.setLayout(gridaBagLayoutCamposRegion);
		this.jPanelCamposOcultosRegion.setLayout(gridaBagLayoutCamposOcultosRegion);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsRegion = new GridBagConstraints();
	this.gridBagConstraintsRegion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRegion.gridy = 0;
	this.gridBagConstraintsRegion.gridx = 0;
	this.gridBagConstraintsRegion.ipadx = 0;
	this.gridBagConstraintsRegion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidRegion.add(jLabelIdRegion, this.gridBagConstraintsRegion);



	this.gridBagConstraintsRegion = new GridBagConstraints();
	this.gridBagConstraintsRegion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRegion.gridy = 0;
	this.gridBagConstraintsRegion.gridx = 1;
	this.gridBagConstraintsRegion.ipadx = 0;
	this.gridBagConstraintsRegion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidRegion.add(jLabelidRegion, this.gridBagConstraintsRegion);


	this.gridBagConstraintsRegion = new GridBagConstraints();
	this.gridBagConstraintsRegion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRegion.gridy = 0;
	this.gridBagConstraintsRegion.gridx = 0;
	this.gridBagConstraintsRegion.ipadx = 0;
	this.gridBagConstraintsRegion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_paisRegion.add(jLabelid_paisRegion, this.gridBagConstraintsRegion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRegion = new GridBagConstraints();
		//this.gridBagConstraintsRegion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRegion.gridy = 0;
		this.gridBagConstraintsRegion.gridx = 2;
		this.gridBagConstraintsRegion.ipadx = 0;
		this.gridBagConstraintsRegion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisRegion.add(jButtonid_paisRegionBusqueda, this.gridBagConstraintsRegion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRegion = new GridBagConstraints();
		//this.gridBagConstraintsRegion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRegion.gridy = 0;
		this.gridBagConstraintsRegion.gridx = 3;
		this.gridBagConstraintsRegion.ipadx = 0;
		this.gridBagConstraintsRegion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisRegion.add(jButtonid_paisRegionUpdate, this.gridBagConstraintsRegion);
	}

	this.gridBagConstraintsRegion = new GridBagConstraints();
	this.gridBagConstraintsRegion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRegion.gridy = 0;
	this.gridBagConstraintsRegion.gridx = 1;
	this.gridBagConstraintsRegion.ipadx = 0;
	this.gridBagConstraintsRegion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_paisRegion.add(jComboBoxid_paisRegion, this.gridBagConstraintsRegion);


	this.gridBagConstraintsRegion = new GridBagConstraints();
	this.gridBagConstraintsRegion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRegion.gridy = 0;
	this.gridBagConstraintsRegion.gridx = 0;
	this.gridBagConstraintsRegion.ipadx = 0;
	this.gridBagConstraintsRegion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoRegion.add(jLabelcodigoRegion, this.gridBagConstraintsRegion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRegion = new GridBagConstraints();
		//this.gridBagConstraintsRegion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRegion.gridy = 0;
		this.gridBagConstraintsRegion.gridx = 2;
		this.gridBagConstraintsRegion.ipadx = 0;
		this.gridBagConstraintsRegion.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoRegion.add(jButtoncodigoRegionBusqueda, this.gridBagConstraintsRegion);
	}

	this.gridBagConstraintsRegion = new GridBagConstraints();
	this.gridBagConstraintsRegion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRegion.gridy = 0;
	this.gridBagConstraintsRegion.gridx = 1;
	this.gridBagConstraintsRegion.ipadx = 0;
	this.gridBagConstraintsRegion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoRegion.add(jTextFieldcodigoRegion, this.gridBagConstraintsRegion);


	this.gridBagConstraintsRegion = new GridBagConstraints();
	this.gridBagConstraintsRegion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRegion.gridy = 0;
	this.gridBagConstraintsRegion.gridx = 0;
	this.gridBagConstraintsRegion.ipadx = 0;
	this.gridBagConstraintsRegion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreRegion.add(jLabelnombreRegion, this.gridBagConstraintsRegion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRegion = new GridBagConstraints();
		//this.gridBagConstraintsRegion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRegion.gridy = 0;
		this.gridBagConstraintsRegion.gridx = 2;
		this.gridBagConstraintsRegion.ipadx = 0;
		this.gridBagConstraintsRegion.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreRegion.add(jButtonnombreRegionBusqueda, this.gridBagConstraintsRegion);
	}

	this.gridBagConstraintsRegion = new GridBagConstraints();
	this.gridBagConstraintsRegion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRegion.gridy = 0;
	this.gridBagConstraintsRegion.gridx = 1;
	this.gridBagConstraintsRegion.ipadx = 0;
	this.gridBagConstraintsRegion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreRegion.add(jscrollPanenombreRegion, this.gridBagConstraintsRegion);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsRegion = new GridBagConstraints();
	this.gridBagConstraintsRegion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRegion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRegion.gridy = iYPanelCamposRegion;
	this.gridBagConstraintsRegion.gridx = iXPanelCamposRegion++;
	this.gridBagConstraintsRegion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRegion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRegion.add(this.jPanelidRegion, this.gridBagConstraintsRegion);



	if(iXPanelCamposRegion % 1==0) {
		iXPanelCamposRegion=0;
		iYPanelCamposRegion++;
	}
	this.gridBagConstraintsRegion = new GridBagConstraints();
	this.gridBagConstraintsRegion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRegion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRegion.gridy = iYPanelCamposRegion;
	this.gridBagConstraintsRegion.gridx = iXPanelCamposRegion++;
	this.gridBagConstraintsRegion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRegion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRegion.add(this.jPanelid_paisRegion, this.gridBagConstraintsRegion);



	if(iXPanelCamposRegion % 1==0) {
		iXPanelCamposRegion=0;
		iYPanelCamposRegion++;
	}
	this.gridBagConstraintsRegion = new GridBagConstraints();
	this.gridBagConstraintsRegion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRegion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRegion.gridy = iYPanelCamposRegion;
	this.gridBagConstraintsRegion.gridx = iXPanelCamposRegion++;
	this.gridBagConstraintsRegion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRegion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRegion.add(this.jPanelcodigoRegion, this.gridBagConstraintsRegion);



	if(iXPanelCamposRegion % 1==0) {
		iXPanelCamposRegion=0;
		iYPanelCamposRegion++;
	}
	this.gridBagConstraintsRegion = new GridBagConstraints();
	this.gridBagConstraintsRegion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRegion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRegion.gridy = iYPanelCamposRegion;
	this.gridBagConstraintsRegion.gridx = iXPanelCamposRegion++;
	this.gridBagConstraintsRegion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRegion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRegion.add(this.jPanelnombreRegion, this.gridBagConstraintsRegion);



	if(iXPanelCamposRegion % 1==0) {
		iXPanelCamposRegion=0;
		iYPanelCamposRegion++;
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
			
		GridBagLayout gridaBagLayoutAccionesRegion= new GridBagLayout();
		this.jPanelAccionesRegion.setLayout(gridaBagLayoutAccionesRegion);
		
		GridBagLayout gridaBagLayoutAccionesFormularioRegion= new GridBagLayout();
		this.jPanelAccionesFormularioRegion.setLayout(gridaBagLayoutAccionesFormularioRegion);
		
		this.gridBagConstraintsRegion = new GridBagConstraints();
		this.gridBagConstraintsRegion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsRegion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioRegion.add(this.jComboBoxTiposAccionesFormularioRegion, this.gridBagConstraintsRegion);

		this.gridBagConstraintsRegion = new GridBagConstraints();
		this.gridBagConstraintsRegion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsRegion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioRegion.add(this.jCheckBoxPostAccionNuevoRegion, this.gridBagConstraintsRegion);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.regionSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsRegion = new GridBagConstraints();
			this.gridBagConstraintsRegion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsRegion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioRegion.add(this.jCheckBoxPostAccionSinCerrarRegion, this.gridBagConstraintsRegion);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.regionSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.regionSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsRegion = new GridBagConstraints();
			this.gridBagConstraintsRegion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsRegion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioRegion.add(this.jCheckBoxPostAccionSinMensajeRegion, this.gridBagConstraintsRegion);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsRegion = new GridBagConstraints();
		this.gridBagConstraintsRegion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRegion.gridy = 0;
		this.gridBagConstraintsRegion.gridx = iPosXAccion++;
			
		this.jPanelAccionesRegion.add(this.jButtonModificarRegion, this.gridBagConstraintsRegion);							

		this.gridBagConstraintsRegion = new GridBagConstraints();
		this.gridBagConstraintsRegion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRegion.gridy = 0;
		this.gridBagConstraintsRegion.gridx =iPosXAccion++;
			
		this.jPanelAccionesRegion.add(this.jButtonEliminarRegion, this.gridBagConstraintsRegion);
		
			
		this.gridBagConstraintsRegion = new GridBagConstraints();
		this.gridBagConstraintsRegion.gridy = 0;		
		this.gridBagConstraintsRegion.gridx = iPosXAccion++;
		
		this.jPanelAccionesRegion.add(this.jButtonActualizarRegion, this.gridBagConstraintsRegion);


		this.gridBagConstraintsRegion = new GridBagConstraints();
		this.gridBagConstraintsRegion.gridy = 0;		
		this.gridBagConstraintsRegion.gridx = iPosXAccion++;
		
		this.jPanelAccionesRegion.add(this.jButtonGuardarCambiosRegion, this.gridBagConstraintsRegion);	
		
		this.gridBagConstraintsRegion = new GridBagConstraints();
		this.gridBagConstraintsRegion.gridy = 0;		
		this.gridBagConstraintsRegion.gridx =iPosXAccion++;
		
		this.jPanelAccionesRegion.add(this.jButtonCancelarRegion, this.gridBagConstraintsRegion);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutRegion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutRegion);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.regionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsRegion = new GridBagConstraints();						
			this.gridBagConstraintsRegion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsRegion.gridx = 0;		
			//this.gridBagConstraintsRegion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRegion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsRegion.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsRegion = new GridBagConstraints();
		this.gridBagConstraintsRegion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsRegion.gridx =0;
		this.gridBagConstraintsRegion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsRegion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosRegion, this.gridBagConstraintsRegion);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(RegionJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleRegion = new RegionBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Region DATOS");
			
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
			
	        //this.setTitle("[FOR] - Region DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Region Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			RegionModel regionModel=new RegionModel(this);
			
			//SI USARA CLASE INTERNA
			//RegionModel.RegionFocusTraversalPolicy regionFocusTraversalPolicy = regionModel.new RegionFocusTraversalPolicy(this);
			
			//regionFocusTraversalPolicy.setregionJInternalFrame(this);
			
			this.setFocusTraversalPolicy(regionModel);
			
			
			this.jContentPaneDetalleRegion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleRegion = new GridBagLayout();	
			this.jContentPaneDetalleRegion.setLayout(gridaBagLayoutDetalleRegion);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosRegion = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsRegion = new GridBagConstraints();
				this.gridBagConstraintsRegion.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsRegion.gridx = 0;
					
				
				this.jContentPaneDetalleRegion.add(jTtoolBarDetalleRegion, gridBagConstraintsRegion);								
				
}
			
			this.jScrollPanelDatosEdicionRegion=   new JScrollPane(jContentPaneDetalleRegion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionRegion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionRegion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionRegion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralRegion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralRegion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralRegion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralRegion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsRegion = new GridBagConstraints();
			
			
	        this.gridBagConstraintsRegion.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsRegion.gridx = 0;
	        
			this.jContentPaneDetalleRegion.add(jPanelCamposRegion, gridBagConstraintsRegion);
			
			
			
			
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
						&& regionSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameCliente(this.puedeCargarPorParteCliente,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameParametroCarteraDefecto(this.puedeCargarPorParteParametroCarteraDefecto,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameProvincia(this.puedeCargarPorParteProvincia,false,-1);
					
					if(this.regionSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsRegion= new GridBagConstraints();
						this.gridBagConstraintsRegion.gridy = iGridyRelaciones++;
						this.gridBagConstraintsRegion.gridx = 0;
						this.jContentPaneDetalleRegion.add(this.jTabbedPaneRelacionesRegion, this.gridBagConstraintsRegion);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesRegion.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameCliente(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameParametroCarteraDefecto(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameProvincia(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosRegion.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsRegion = new GridBagConstraints();
					this.gridBagConstraintsRegion.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsRegion.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsRegion.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsRegion.gridx = 0;
					
				
					this.jContentPaneDetalleRegion.add(jPanelCamposOcultosRegion, gridBagConstraintsRegion);
				
					this.jPanelCamposOcultosRegion.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsRegion = new GridBagConstraints();
			this.gridBagConstraintsRegion.gridy = iGridyRelaciones++;//10;		
	        this.gridBagConstraintsRegion.gridx = 0;
	        this.gridBagConstraintsRegion.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleRegion.add(this.jPanelAccionesFormularioRegion, this.gridBagConstraintsRegion);							
			
			
			
			this.gridBagConstraintsRegion = new GridBagConstraints();
	        this.gridBagConstraintsRegion.gridy = iGridyRelaciones;//10;		
	        this.gridBagConstraintsRegion.gridx = 0;
	        
			
			this.jContentPaneDetalleRegion.add(this.jPanelAccionesRegion, this.gridBagConstraintsRegion);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionRegion);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionRegion=   new JScrollPane(this.jPanelCamposRegion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionRegion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionRegion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionRegion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsRegion = new GridBagConstraints();
			this.gridBagConstraintsRegion.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsRegion.gridx = 0;
			this.gridBagConstraintsRegion.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsRegion.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsRegion.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionRegion, this.gridBagConstraintsRegion);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsRegion = new GridBagConstraints();
			this.gridBagConstraintsRegion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsRegion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioRegion, this.gridBagConstraintsRegion);			
			
			this.gridBagConstraintsRegion = new GridBagConstraints();
			this.gridBagConstraintsRegion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsRegion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesRegion, this.gridBagConstraintsRegion);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsRegion = new GridBagConstraints();
		this.gridBagConstraintsRegion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRegion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposRegion, this.gridBagConstraintsRegion);
			
			
		this.gridBagConstraintsRegion = new GridBagConstraints();
		this.gridBagConstraintsRegion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRegion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosRegion, this.gridBagConstraintsRegion);
		
			
		this.gridBagConstraintsRegion = new GridBagConstraints();
		this.gridBagConstraintsRegion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsRegion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesRegion, this.gridBagConstraintsRegion);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralRegion;//jContentPane;
		
		return jScrollPanelDatosEdicionRegion;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameCliente(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.clienteSessionBean=new ClienteSessionBean();
		this.clienteSessionBean.setConGuardarRelaciones(false);
		this.clienteSessionBean.setEsGuardarRelacionado(true);

		this.clienteBeanSwingJInternalFrame=null;//new ClienteBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.clienteBeanSwingJInternalFramePopup=new ClienteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.clienteBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.clienteSessionBean.getEsGuardarRelacionado()) {

				ClienteJInternalFrame.STIPO_TAMANIO_GENERAL=RegionJInternalFrame.STIPO_TAMANIO_GENERAL;
				ClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=RegionJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.clienteSessionBean.setEsGuardarRelacionado(true);

				this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.clienteBeanSwingJInternalFrame.setclienteSessionBean(this.clienteSessionBean);

				//this.gridBagConstraintsRegion = new GridBagConstraints();
				//this.gridBagConstraintsRegion.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsRegion.gridx = 0;
				//this.jContentPaneDetalleRegion.add(this.clienteBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsRegion);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesRegion.add("Clientes",this.clienteBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesRegion.setComponentAt(iIndexTab,this.clienteBeanSwingJInternalFrame.getContentPane());
				}

				//ClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.clienteSessionBean.setEsGuardarRelacionado(false);
				this.clienteBeanSwingJInternalFrame=null;//new ClienteBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.clienteSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteCliente) {
					this.jTabbedPaneRelacionesRegion.add("Clientes",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameParametroCarteraDefecto(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.parametrocarteradefectoSessionBean=new ParametroCarteraDefectoSessionBean();
		this.parametrocarteradefectoSessionBean.setConGuardarRelaciones(false);
		this.parametrocarteradefectoSessionBean.setEsGuardarRelacionado(true);

		this.parametrocarteradefectoBeanSwingJInternalFrame=null;//new ParametroCarteraDefectoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.parametrocarteradefectoBeanSwingJInternalFramePopup=new ParametroCarteraDefectoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.parametrocarteradefectoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.parametrocarteradefectoSessionBean.getEsGuardarRelacionado()) {

				ParametroCarteraDefectoJInternalFrame.STIPO_TAMANIO_GENERAL=RegionJInternalFrame.STIPO_TAMANIO_GENERAL;
				ParametroCarteraDefectoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=RegionJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.parametrocarteradefectoSessionBean.setEsGuardarRelacionado(true);

				this.parametrocarteradefectoBeanSwingJInternalFrame=new ParametroCarteraDefectoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.parametrocarteradefectoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.parametrocarteradefectoBeanSwingJInternalFrame.setparametrocarteradefectoSessionBean(this.parametrocarteradefectoSessionBean);

				//this.gridBagConstraintsRegion = new GridBagConstraints();
				//this.gridBagConstraintsRegion.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsRegion.gridx = 0;
				//this.jContentPaneDetalleRegion.add(this.parametrocarteradefectoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsRegion);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesRegion.add("Parametro Cartera Defectos",this.parametrocarteradefectoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesRegion.setComponentAt(iIndexTab,this.parametrocarteradefectoBeanSwingJInternalFrame.getContentPane());
				}

				//ParametroCarteraDefectoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.parametrocarteradefectoSessionBean.setEsGuardarRelacionado(false);
				this.parametrocarteradefectoBeanSwingJInternalFrame=null;//new ParametroCarteraDefectoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.parametrocarteradefectoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteParametroCarteraDefecto) {
					this.jTabbedPaneRelacionesRegion.add("Parametro Cartera Defectos",new JPanel());
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

				ProvinciaJInternalFrame.STIPO_TAMANIO_GENERAL=RegionJInternalFrame.STIPO_TAMANIO_GENERAL;
				ProvinciaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=RegionJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.provinciaSessionBean.setEsGuardarRelacionado(true);

				this.provinciaBeanSwingJInternalFrame=new ProvinciaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.provinciaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.provinciaBeanSwingJInternalFrame.setprovinciaSessionBean(this.provinciaSessionBean);

				//this.gridBagConstraintsRegion = new GridBagConstraints();
				//this.gridBagConstraintsRegion.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsRegion.gridx = 0;
				//this.jContentPaneDetalleRegion.add(this.provinciaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsRegion);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesRegion.add("Provinciaes",this.provinciaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesRegion.setComponentAt(iIndexTab,this.provinciaBeanSwingJInternalFrame.getContentPane());
				}

				//ProvinciaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.provinciaSessionBean.setEsGuardarRelacionado(false);
				this.provinciaBeanSwingJInternalFrame=null;//new ProvinciaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.provinciaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteProvincia) {
					this.jTabbedPaneRelacionesRegion.add("Provinciaes",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarClienteBeanSwingJInternalFrame(List<Region> regions,Region region,ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					clienteBeanSwingJInternalFrame.getClienteLogic().setConnexion(this.regionLogic.getConnexion());

					clienteBeanSwingJInternalFrame.setregionsForeignKey(regions);
					clienteBeanSwingJInternalFrame.setregionForeignKey(region);
					clienteBeanSwingJInternalFrame.clienteSessionBean.setisBusquedaDesdeForeignKeySesionRegion(true);
					clienteBeanSwingJInternalFrame.clienteSessionBean.setlidRegionActual(region.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					clienteBeanSwingJInternalFrame.cargarCombosForeignKeyCliente(clienteBeanSwingJInternalFrame.isCargarCombosDependencia);
					clienteBeanSwingJInternalFrame.setVisibilidadBusquedasParaRegion(true);
					clienteBeanSwingJInternalFrame.setid_regionFK_IdRegion(region.getId());

					if(!this.conCargarFormDetalle) {
						clienteBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					clienteBeanSwingJInternalFrame.setSelectedItemCombosFrameRegionForeignKey(region,1,false,true,true);
					clienteBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					clienteBeanSwingJInternalFrame.procesarBusqueda("FK_IdRegion");
					clienteBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdRegion");
					clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente(true);
					clienteBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesCliente("n",clienteBeanSwingJInternalFrame.isGuardarCambiosEnLote, clienteBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					clienteBeanSwingJInternalFrame.setAutoscrolls(true);
					clienteBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						clienteBeanSwingJInternalFrame.actualizarEstadoPanelsCliente("relacionado");
					} else {
						clienteBeanSwingJInternalFrame.actualizarEstadoPanelsCliente("no_relacionado");
					}

					clienteBeanSwingJInternalFrame.getjButtonRecargarInformacionCliente().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarProvinciaBeanSwingJInternalFrame(List<Region> regions,Region region,ProvinciaBeanSwingJInternalFrame provinciaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//provinciaBeanSwingJInternalFrame=new ProvinciaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					provinciaBeanSwingJInternalFrame.getProvinciaLogic().setConnexion(this.regionLogic.getConnexion());

					provinciaBeanSwingJInternalFrame.setregionsForeignKey(regions);
					provinciaBeanSwingJInternalFrame.setregionForeignKey(region);
					provinciaBeanSwingJInternalFrame.provinciaSessionBean.setisBusquedaDesdeForeignKeySesionRegion(true);
					provinciaBeanSwingJInternalFrame.provinciaSessionBean.setlidRegionActual(region.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					provinciaBeanSwingJInternalFrame.cargarCombosForeignKeyProvincia(provinciaBeanSwingJInternalFrame.isCargarCombosDependencia);
					provinciaBeanSwingJInternalFrame.setVisibilidadBusquedasParaRegion(true);
					provinciaBeanSwingJInternalFrame.setid_regionFK_IdRegion(region.getId());

					if(!this.conCargarFormDetalle) {
						provinciaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					provinciaBeanSwingJInternalFrame.setSelectedItemCombosFrameRegionForeignKey(region,1,false,true,true);
					provinciaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					provinciaBeanSwingJInternalFrame.procesarBusqueda("FK_IdRegion");
					provinciaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdRegion");
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

		public void cargarParametroCarteraDefectoBeanSwingJInternalFrame(List<Region> regions,Region region,ParametroCarteraDefectoBeanSwingJInternalFrame parametrocarteradefectoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//parametrocarteradefectoBeanSwingJInternalFrame=new ParametroCarteraDefectoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					parametrocarteradefectoBeanSwingJInternalFrame.getParametroCarteraDefectoLogic().setConnexion(this.regionLogic.getConnexion());

					parametrocarteradefectoBeanSwingJInternalFrame.setregionsForeignKey(regions);
					parametrocarteradefectoBeanSwingJInternalFrame.setregionForeignKey(region);
					parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoSessionBean.setisBusquedaDesdeForeignKeySesionRegion(true);
					parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoSessionBean.setlidRegionActual(region.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					parametrocarteradefectoBeanSwingJInternalFrame.cargarCombosForeignKeyParametroCarteraDefecto(parametrocarteradefectoBeanSwingJInternalFrame.isCargarCombosDependencia);
					parametrocarteradefectoBeanSwingJInternalFrame.setVisibilidadBusquedasParaRegion(true);
					parametrocarteradefectoBeanSwingJInternalFrame.setid_regionFK_IdRegion(region.getId());

					if(!this.conCargarFormDetalle) {
						parametrocarteradefectoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					parametrocarteradefectoBeanSwingJInternalFrame.setSelectedItemCombosFrameRegionForeignKey(region,1,false,true,true);
					parametrocarteradefectoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					parametrocarteradefectoBeanSwingJInternalFrame.procesarBusqueda("FK_IdRegion");
					parametrocarteradefectoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdRegion");
					parametrocarteradefectoBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroCarteraDefecto(true);
					parametrocarteradefectoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesParametroCarteraDefecto("n",parametrocarteradefectoBeanSwingJInternalFrame.isGuardarCambiosEnLote, parametrocarteradefectoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					parametrocarteradefectoBeanSwingJInternalFrame.setAutoscrolls(true);
					parametrocarteradefectoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						parametrocarteradefectoBeanSwingJInternalFrame.actualizarEstadoPanelsParametroCarteraDefecto("relacionado");
					} else {
						parametrocarteradefectoBeanSwingJInternalFrame.actualizarEstadoPanelsParametroCarteraDefecto("no_relacionado");
					}

					parametrocarteradefectoBeanSwingJInternalFrame.getjButtonRecargarInformacionParametroCarteraDefecto().setVisible(false);

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
