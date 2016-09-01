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


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.cartera.util.AreaCrConstantesFunciones;

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
public class AreaCrDetalleFormJInternalFrame extends AreaCrBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleAreaCr;
	
	protected JMenuBar jmenuBarDetalleAreaCr;
	
	protected JMenu jmenuDetalleAreaCr;
	protected JMenu jmenuDetalleArchivoAreaCr;
	protected JMenu jmenuDetalleAccionesAreaCr;
	protected JMenu jmenuDetalleDatosAreaCr;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleAreaCr = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutAreaCr;	
	protected GridBagConstraints gridBagConstraintsAreaCr;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected AreaCrBeanSwingJInternalFrameAdditional jInternalFrameDetalleAreaCr;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";
	
	public AreaCrSessionBean areacrSessionBean;
	
	

	public ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame=null;
	public ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteCliente=false;
	public ClienteSessionBean clienteSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;	
	
	public AreaCrLogic areacrLogic;
	
	public JScrollPane jScrollPanelDatosAreaCr;
	public JScrollPane jScrollPanelDatosEdicionAreaCr;
	public JScrollPane jScrollPanelDatosGeneralAreaCr;
	
	protected JPanel jPanelCamposAreaCr;    
	protected JPanel jPanelCamposOcultosAreaCr;    	
	protected JPanel jPanelAccionesAreaCr;
	protected JPanel jPanelAccionesFormularioAreaCr;
    
	
	
	protected Integer iXPanelCamposAreaCr=0;
	protected Integer iYPanelCamposAreaCr=0;
	
	protected Integer iXPanelCamposOcultosAreaCr=0;
	protected Integer iYPanelCamposOcultosAreaCr=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoAreaCr;
	public JButton jButtonModificarAreaCr;
	public JButton jButtonActualizarAreaCr;
    public JButton jButtonEliminarAreaCr;
	public JButton jButtonCancelarAreaCr;
    public JButton jButtonGuardarCambiosAreaCr;
	public JButton jButtonGuardarCambiosTablaAreaCr;
	protected JButton jButtonCerrarAreaCr;
	
	
	protected JButton jButtonProcesarInformacionAreaCr;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoAreaCr;
	protected JCheckBox jCheckBoxPostAccionSinCerrarAreaCr;
	protected JCheckBox jCheckBoxPostAccionSinMensajeAreaCr;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarAreaCr;
	protected JButton jButtonModificarToolBarAreaCr;
	protected JButton jButtonActualizarToolBarAreaCr;
    protected JButton jButtonEliminarToolBarAreaCr;
	protected JButton jButtonCancelarToolBarAreaCr;
    protected JButton jButtonGuardarCambiosToolBarAreaCr;
	protected JButton jButtonGuardarCambiosTablaToolBarAreaCr;
	protected JButton jButtonMostrarOcultarTablaToolBarAreaCr;
	protected JButton jButtonCerrarToolBarAreaCr;
	
	protected JButton jButtonProcesarInformacionToolBarAreaCr;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoAreaCr;
	protected JMenuItem jMenuItemModificarAreaCr;
	protected JMenuItem jMenuItemActualizarAreaCr;
    protected JMenuItem jMenuItemEliminarAreaCr;
	protected JMenuItem jMenuItemCancelarAreaCr;
    protected JMenuItem jMenuItemGuardarCambiosAreaCr;
	protected JMenuItem jMenuItemGuardarCambiosTablaAreaCr;
	protected JMenuItem jMenuItemCerrarAreaCr;
	protected JMenuItem jMenuItemDetalleCerrarAreaCr;
	protected JMenuItem jMenuItemDetalleMostarOcultarAreaCr;
	
	protected JMenuItem jMenuItemProcesarInformacionAreaCr;
	protected JMenuItem jMenuItemNuevoGuardarCambiosAreaCr;
	protected JMenuItem jMenuItemMostrarOcultarAreaCr;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesAreaCr;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesAreaCr;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesAreaCr;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioAreaCr;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidAreaCr;
	public JLabel jLabelIdAreaCr;
	public JLabel jLabelidAreaCr;
	public JButton jButtonidAreaCrBusqueda= new JButtonMe();

	public JPanel jPanelcodigoAreaCr;
	public JLabel jLabelcodigoAreaCr;
	public JTextField jTextFieldcodigoAreaCr;
	public JButton jButtoncodigoAreaCrBusqueda= new JButtonMe();

	public JPanel jPanelnombreAreaCr;
	public JLabel jLabelnombreAreaCr;
	public JTextArea jTextAreanombreAreaCr;
	public JScrollPane jscrollPanenombreAreaCr;
	public JButton jButtonnombreAreaCrBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaAreaCr;
	public JLabel jLabelid_empresaAreaCr;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaAreaCr;
	public JButton jButtonid_empresaAreaCr= new JButtonMe();
	public JButton jButtonid_empresaAreaCrUpdate= new JButtonMe();
	public JButton jButtonid_empresaAreaCrBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalAreaCr;
	public JLabel jLabelid_sucursalAreaCr;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalAreaCr;
	public JButton jButtonid_sucursalAreaCr= new JButtonMe();
	public JButton jButtonid_sucursalAreaCrUpdate= new JButtonMe();
	public JButton jButtonid_sucursalAreaCrBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesAreaCr;
	
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
	
	public AreaCrDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposAreaCr=new JPanel();
				this.jPanelAccionesFormularioAreaCr=new JPanel();
				this.jmenuBarDetalleAreaCr=new JMenuBar();
				this.jTtoolBarDetalleAreaCr=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AreaCrDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("AreaCr No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public AreaCrDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("AreaCr No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AreaCrDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("AreaCr No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AreaCrDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("AreaCr No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AreaCrDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("AreaCr No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarAreaCr() {
		return this.jButtonActualizarToolBarAreaCr;
	}
	
	public JButton getjButtonEliminarToolBarAreaCr() {
		return this.jButtonEliminarToolBarAreaCr;
	}
	
	public JButton getjButtonCancelarToolBarAreaCr() {
		return this.jButtonCancelarToolBarAreaCr;
	}		
	
	public JButton getjButtonProcesarInformacionAreaCr() {
		return this.jButtonProcesarInformacionAreaCr;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionAreaCr)	{
		this.jButtonProcesarInformacionAreaCr = jButtonProcesarInformacionAreaCr;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesAreaCr() {
		return this.jComboBoxTiposAccionesAreaCr;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesAreaCr(
			JComboBox jComboBoxTiposRelacionesAreaCr) {
		this.jComboBoxTiposRelacionesAreaCr = jComboBoxTiposRelacionesAreaCr;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesAreaCr(
			JComboBox jComboBoxTiposAccionesAreaCr) {
		this.jComboBoxTiposAccionesAreaCr = jComboBoxTiposAccionesAreaCr;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioAreaCr() {
		return this.jComboBoxTiposAccionesFormularioAreaCr;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioAreaCr(
			JComboBox jComboBoxTiposAccionesFormularioAreaCr) {
		this.jComboBoxTiposAccionesFormularioAreaCr = jComboBoxTiposAccionesFormularioAreaCr;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.areacrSessionBean=new AreaCrSessionBean();
		
		this.areacrSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.areacrSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.areacrSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.clienteSessionBean=new ClienteSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		AreaCrJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		AreaCrJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		AreaCrJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Area MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.areacrSessionBean.getEsGuardarRelacionado()) {
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
	
		AreaCrJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleAreaCr= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarAreaCr=new JButtonMe();
				this.jButtonModificarToolBarAreaCr=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarAreaCr=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarAreaCr,this.jTtoolBarDetalleAreaCr,
							"actualizar","actualizar","Actualizar"+" "+AreaCrConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarAreaCr=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarAreaCr,this.jTtoolBarDetalleAreaCr,
							"eliminar","eliminar","Eliminar"+" "+AreaCrConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarAreaCr=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarAreaCr,this.jTtoolBarDetalleAreaCr,
							"cancelar","cancelar","Cancelar"+" "+AreaCrConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarAreaCr=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarAreaCr,this.jTtoolBarDetalleAreaCr,
							"guardarcambios","guardarcambios","Guardar"+" "+AreaCrConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarAreaCr,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarAreaCr,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarAreaCr,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleAreaCr=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleAreaCr=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoAreaCr=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesAreaCr=new JMenuMe("Acciones");
		this.jmenuDetalleDatosAreaCr=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoAreaCr= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoAreaCr.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoAreaCr,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoAreaCr, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarAreaCr= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarAreaCr.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarAreaCr,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarAreaCr, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarAreaCr= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarAreaCr.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarAreaCr,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarAreaCr, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarAreaCr= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarAreaCr.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarAreaCr,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarAreaCr, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarAreaCr= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarAreaCr.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarAreaCr,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarAreaCr, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosAreaCr= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosAreaCr.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosAreaCr,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosAreaCr, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarAreaCr= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarAreaCr.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarAreaCr,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarAreaCr, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarAreaCr= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarAreaCr.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarAreaCr,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarAreaCr, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarAreaCr= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarAreaCr.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarAreaCr,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarAreaCr, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarAreaCr= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarAreaCr.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarAreaCr,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarAreaCr, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoAreaCr.add(this.jMenuItemDetalleCerrarAreaCr);
		
		this.jmenuDetalleAccionesAreaCr.add(this.jMenuItemActualizarAreaCr);
		this.jmenuDetalleAccionesAreaCr.add(this.jMenuItemEliminarAreaCr);
		this.jmenuDetalleAccionesAreaCr.add(this.jMenuItemCancelarAreaCr);		
		
		//this.jmenuDetalleDatosAreaCr.add(this.jMenuItemDetalleAbrirOrderByAreaCr);				
		this.jmenuDetalleDatosAreaCr.add(this.jMenuItemDetalleMostarOcultarAreaCr);				
				
		//this.jmenuDetalleAccionesAreaCr.add(this.jMenuItemGuardarCambiosAreaCr);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoAreaCr, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesAreaCr, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosAreaCr, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleAreaCr.add(this.jmenuDetalleArchivoAreaCr);		
		this.jmenuBarDetalleAreaCr.add(this.jmenuDetalleAccionesAreaCr);		
		this.jmenuBarDetalleAreaCr.add(this.jmenuDetalleDatosAreaCr);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleAreaCr, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleAreaCr.add(this.jmenuDetalleAreaCr);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleAreaCr);				
	}
	
	
	public void inicializarElementosCamposAreaCr() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdAreaCr = new JLabelMe();
		jLabelIdAreaCr.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdAreaCr.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdAreaCr.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdAreaCr.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdAreaCr,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidAreaCr = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidAreaCr.setToolTipText(AreaCrConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutAreaCr= new GridBagLayout();

		this.jPanelidAreaCr.setLayout(this.gridaBagLayoutAreaCr);

		jLabelidAreaCr = new JLabel();
		jLabelidAreaCr.setText("Id");

		jLabelidAreaCr.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidAreaCr.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidAreaCr.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoAreaCr = new JLabelMe();
		this.jLabelcodigoAreaCr.setText(""+AreaCrConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoAreaCr.setToolTipText("Codigo");
		this.jLabelcodigoAreaCr.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoAreaCr.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoAreaCr.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoAreaCr,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoAreaCr=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoAreaCr.setToolTipText(AreaCrConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutAreaCr = new GridBagLayout();
		this.jPanelcodigoAreaCr.setLayout(this.gridaBagLayoutAreaCr);


		jTextFieldcodigoAreaCr= new JTextFieldMe();

		jTextFieldcodigoAreaCr.setEnabled(false);
		jTextFieldcodigoAreaCr.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoAreaCr.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoAreaCr.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoAreaCr,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoAreaCrBusqueda= new JButtonMe();
		this.jButtoncodigoAreaCrBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoAreaCrBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoAreaCrBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoAreaCrBusqueda.setText("U");
		this.jButtoncodigoAreaCrBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoAreaCrBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoAreaCrBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoAreaCr.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoAreaCr.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoAreaCrBusqueda"));

		if(this.areacrSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoAreaCrBusqueda.setVisible(false);		}


					
		this.jLabelnombreAreaCr = new JLabelMe();
		this.jLabelnombreAreaCr.setText(""+AreaCrConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreAreaCr.setToolTipText("Nombre");
		this.jLabelnombreAreaCr.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreAreaCr.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreAreaCr.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreAreaCr,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreAreaCr=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreAreaCr.setToolTipText(AreaCrConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutAreaCr = new GridBagLayout();
		this.jPanelnombreAreaCr.setLayout(this.gridaBagLayoutAreaCr);


		jTextAreanombreAreaCr= new JTextAreaMe();
		jTextAreanombreAreaCr.setEnabled(false);
		jTextAreanombreAreaCr.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreAreaCr.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreAreaCr.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreAreaCr.setLineWrap(true);
		jTextAreanombreAreaCr.setWrapStyleWord(true);
		jTextAreanombreAreaCr.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreAreaCr.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreAreaCr,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreAreaCr = new JScrollPane(jTextAreanombreAreaCr);
		jscrollPanenombreAreaCr.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreAreaCr.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreAreaCr.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreAreaCrBusqueda= new JButtonMe();
		this.jButtonnombreAreaCrBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreAreaCrBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreAreaCrBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreAreaCrBusqueda.setText("U");
		this.jButtonnombreAreaCrBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreAreaCrBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreAreaCrBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreAreaCr.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreAreaCr.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreAreaCrBusqueda"));

		if(this.areacrSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreAreaCrBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysAreaCr() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaAreaCr = new JLabelMe();
		this.jLabelid_empresaAreaCr.setText(""+AreaCrConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaAreaCr.setToolTipText("Empresa");
		this.jLabelid_empresaAreaCr.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaAreaCr.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaAreaCr.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaAreaCr,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaAreaCr=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaAreaCr.setToolTipText(AreaCrConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutAreaCr = new GridBagLayout();
		this.jPanelid_empresaAreaCr.setLayout(this.gridaBagLayoutAreaCr);


		jComboBoxid_empresaAreaCr= new JComboBoxMe();
		jComboBoxid_empresaAreaCr.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaAreaCr.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaAreaCr.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaAreaCr,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaAreaCr.setEnabled(false);

		this.jButtonid_empresaAreaCr= new JButtonMe();
		this.jButtonid_empresaAreaCr.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaAreaCr.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaAreaCr.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaAreaCr.setText("Buscar");
		this.jButtonid_empresaAreaCr.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaAreaCr.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaAreaCr,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaAreaCr.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaAreaCr.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaAreaCr"));

		this.jButtonid_empresaAreaCrBusqueda= new JButtonMe();
		this.jButtonid_empresaAreaCrBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaAreaCrBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaAreaCrBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaAreaCrBusqueda.setText("U");
		this.jButtonid_empresaAreaCrBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaAreaCrBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaAreaCrBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaAreaCr.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaAreaCr.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaAreaCrBusqueda"));

		if(this.areacrSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaAreaCrBusqueda.setVisible(false);		}

		this.jButtonid_empresaAreaCrUpdate= new JButtonMe();
		this.jButtonid_empresaAreaCrUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaAreaCrUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaAreaCrUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaAreaCrUpdate.setText("U");
		this.jButtonid_empresaAreaCrUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaAreaCrUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaAreaCrUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaAreaCr.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaAreaCr.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaAreaCrUpdate"));



					
		this.jLabelid_sucursalAreaCr = new JLabelMe();
		this.jLabelid_sucursalAreaCr.setText(""+AreaCrConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalAreaCr.setToolTipText("Sucursal");
		this.jLabelid_sucursalAreaCr.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalAreaCr.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalAreaCr.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalAreaCr,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalAreaCr=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalAreaCr.setToolTipText(AreaCrConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutAreaCr = new GridBagLayout();
		this.jPanelid_sucursalAreaCr.setLayout(this.gridaBagLayoutAreaCr);


		jComboBoxid_sucursalAreaCr= new JComboBoxMe();
		jComboBoxid_sucursalAreaCr.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalAreaCr.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalAreaCr.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalAreaCr,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalAreaCr.setEnabled(false);

		this.jButtonid_sucursalAreaCr= new JButtonMe();
		this.jButtonid_sucursalAreaCr.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalAreaCr.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalAreaCr.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalAreaCr.setText("Buscar");
		this.jButtonid_sucursalAreaCr.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalAreaCr.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalAreaCr,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalAreaCr.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalAreaCr.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalAreaCr"));

		this.jButtonid_sucursalAreaCrBusqueda= new JButtonMe();
		this.jButtonid_sucursalAreaCrBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalAreaCrBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalAreaCrBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalAreaCrBusqueda.setText("U");
		this.jButtonid_sucursalAreaCrBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalAreaCrBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalAreaCrBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalAreaCr.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalAreaCr.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalAreaCrBusqueda"));

		if(this.areacrSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalAreaCrBusqueda.setVisible(false);		}

		this.jButtonid_sucursalAreaCrUpdate= new JButtonMe();
		this.jButtonid_sucursalAreaCrUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalAreaCrUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalAreaCrUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalAreaCrUpdate.setText("U");
		this.jButtonid_sucursalAreaCrUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalAreaCrUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalAreaCrUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalAreaCr.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalAreaCr.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalAreaCrUpdate"));



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
		//this.jInternalFrameDetalleAreaCr = new AreaCrBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Area DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutAreaCr= new GridBagLayout();
		

		
		String sToolTipAreaCr="";
		sToolTipAreaCr=AreaCrConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipAreaCr+="(Cartera.AreaCr)";
		}
		
		if(!this.areacrSessionBean.getEsGuardarRelacionado()) {
			sToolTipAreaCr+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoAreaCr = new JButtonMe();
		this.jButtonModificarAreaCr = new JButtonMe();
        this.jButtonActualizarAreaCr = new JButtonMe();
        this.jButtonEliminarAreaCr = new JButtonMe();
        this.jButtonCancelarAreaCr = new JButtonMe();
        this.jButtonGuardarCambiosAreaCr = new JButtonMe();
		this.jButtonGuardarCambiosTablaAreaCr = new JButtonMe();
		this.jButtonCerrarAreaCr = new JButtonMe();
		
		this.jScrollPanelDatosAreaCr = new JScrollPane();   
        this.jScrollPanelDatosEdicionAreaCr = new JScrollPane();
		this.jScrollPanelDatosGeneralAreaCr = new JScrollPane();
				
		
		
		this.jPanelCamposAreaCr = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosAreaCr = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesAreaCr = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioAreaCr = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Area";
		
		if(!this.areacrSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosAreaCr.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Areas" + this.sPath));
		} else {
			this.jScrollPanelDatosAreaCr.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionAreaCr.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralAreaCr.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposAreaCr.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposAreaCr.setName("jPanelCamposAreaCr"); 

		this.jPanelCamposOcultosAreaCr.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosAreaCr.setName("jPanelCamposOcultosAreaCr"); 

        this.jPanelAccionesAreaCr.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesAreaCr.setToolTipText("Acciones");
        this.jPanelAccionesAreaCr.setName("Acciones"); 

		this.jPanelAccionesFormularioAreaCr.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioAreaCr.setToolTipText("Acciones");
        this.jPanelAccionesFormularioAreaCr.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionAreaCr, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralAreaCr, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosAreaCr, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposAreaCr, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosAreaCr, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioAreaCr, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoAreaCr.setText("Nuevo");
		this.jButtonModificarAreaCr.setText("Editar");
        this.jButtonActualizarAreaCr.setText("Actualizar");
        this.jButtonEliminarAreaCr.setText("Eliminar");
        this.jButtonCancelarAreaCr.setText("Cancelar");
        this.jButtonGuardarCambiosAreaCr.setText("Guardar");
		this.jButtonGuardarCambiosTablaAreaCr.setText("Guardar");
		this.jButtonCerrarAreaCr.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoAreaCr,"nuevo_button","Nuevo",this.areacrSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarAreaCr,"modificar_button","Editar",this.areacrSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarAreaCr,"actualizar_button","Actualizar",this.areacrSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarAreaCr,"eliminar_button","Eliminar",this.areacrSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarAreaCr,"cancelar_button","Cancelar",this.areacrSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosAreaCr,"guardarcambios_button","Guardar",this.areacrSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaAreaCr,"guardarcambiostabla_button","Guardar",this.areacrSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarAreaCr,"cerrar_button","Salir",this.areacrSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoAreaCr, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarAreaCr, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosAreaCr, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaAreaCr, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarAreaCr, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarAreaCr, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarAreaCr, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarAreaCr, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoAreaCr.setToolTipText("Nuevo"+" "+AreaCrConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarAreaCr.setToolTipText("Editar"+" "+AreaCrConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarAreaCr.setToolTipText("Actualizar"+" "+AreaCrConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarAreaCr.setToolTipText("Eliminar)"+" "+AreaCrConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarAreaCr.setToolTipText("Cancelar"+" "+AreaCrConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosAreaCr.setToolTipText("Guardar"+" "+AreaCrConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaAreaCr.setToolTipText("Guardar"+" "+AreaCrConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarAreaCr.setToolTipText("Salir"+" "+AreaCrConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoAreaCr";
		inputMap = this.jButtonNuevoAreaCr.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoAreaCr.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoAreaCr"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarAreaCr";
		inputMap = this.jButtonActualizarAreaCr.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarAreaCr.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarAreaCr"));
		
		//ELIMINAR
		sMapKey = "EliminarAreaCr";
		inputMap = this.jButtonEliminarAreaCr.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarAreaCr.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarAreaCr"));
		
		//CANCELAR	
		sMapKey = "CancelarAreaCr";
		inputMap = this.jButtonCancelarAreaCr.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarAreaCr.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarAreaCr"));
		
		//CERRAR		
		sMapKey = "CerrarAreaCr";
		inputMap = this.jButtonCerrarAreaCr.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarAreaCr.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarAreaCr"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaAreaCr";
		inputMap = this.jButtonGuardarCambiosTablaAreaCr.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaAreaCr.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaAreaCr"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoAreaCr = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoAreaCr.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoAreaCr.setToolTipText("Nuevo AreaCr");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoAreaCr, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarAreaCr = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarAreaCr.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarAreaCr.setToolTipText("Sin Cerrar Ventana AreaCr");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarAreaCr, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeAreaCr = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeAreaCr.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeAreaCr.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeAreaCr, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesAreaCr = new JComboBoxMe();
		//this.jComboBoxTiposAccionesAreaCr.setText("Accion");
		this.jComboBoxTiposAccionesAreaCr.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioAreaCr = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioAreaCr.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioAreaCr.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesAreaCr = new JLabelMe();
		
		this.jLabelAccionesAreaCr.setText("Acciones");		
		this.jLabelAccionesAreaCr.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesAreaCr.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesAreaCr.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposAreaCr();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysAreaCr();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesAreaCr=new JTabbedPane();
		this.jTabbedPaneRelacionesAreaCr.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesAreaCr,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesAreaCr.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesAreaCr.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesAreaCr.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesAreaCr, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioAreaCr.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioAreaCr.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioAreaCr.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioAreaCr, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposAreaCr = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosAreaCr = new GridBagLayout();
		
		this.jPanelCamposAreaCr.setLayout(gridaBagLayoutCamposAreaCr);
		this.jPanelCamposOcultosAreaCr.setLayout(gridaBagLayoutCamposOcultosAreaCr);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsAreaCr = new GridBagConstraints();
	this.gridBagConstraintsAreaCr.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAreaCr.gridy = 0;
	this.gridBagConstraintsAreaCr.gridx = 0;
	this.gridBagConstraintsAreaCr.ipadx = 0;
	this.gridBagConstraintsAreaCr.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidAreaCr.add(jLabelIdAreaCr, this.gridBagConstraintsAreaCr);



	this.gridBagConstraintsAreaCr = new GridBagConstraints();
	this.gridBagConstraintsAreaCr.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAreaCr.gridy = 0;
	this.gridBagConstraintsAreaCr.gridx = 1;
	this.gridBagConstraintsAreaCr.ipadx = 0;
	this.gridBagConstraintsAreaCr.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidAreaCr.add(jLabelidAreaCr, this.gridBagConstraintsAreaCr);


	this.gridBagConstraintsAreaCr = new GridBagConstraints();
	this.gridBagConstraintsAreaCr.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAreaCr.gridy = 0;
	this.gridBagConstraintsAreaCr.gridx = 0;
	this.gridBagConstraintsAreaCr.ipadx = 0;
	this.gridBagConstraintsAreaCr.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaAreaCr.add(jLabelid_empresaAreaCr, this.gridBagConstraintsAreaCr);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAreaCr = new GridBagConstraints();
		//this.gridBagConstraintsAreaCr.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAreaCr.gridy = 0;
		this.gridBagConstraintsAreaCr.gridx = 2;
		this.gridBagConstraintsAreaCr.ipadx = 0;
		this.gridBagConstraintsAreaCr.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaAreaCr.add(jButtonid_empresaAreaCrBusqueda, this.gridBagConstraintsAreaCr);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAreaCr = new GridBagConstraints();
		//this.gridBagConstraintsAreaCr.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAreaCr.gridy = 0;
		this.gridBagConstraintsAreaCr.gridx = 3;
		this.gridBagConstraintsAreaCr.ipadx = 0;
		this.gridBagConstraintsAreaCr.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaAreaCr.add(jButtonid_empresaAreaCrUpdate, this.gridBagConstraintsAreaCr);
	}

	this.gridBagConstraintsAreaCr = new GridBagConstraints();
	this.gridBagConstraintsAreaCr.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAreaCr.gridy = 0;
	this.gridBagConstraintsAreaCr.gridx = 1;
	this.gridBagConstraintsAreaCr.ipadx = 0;
	this.gridBagConstraintsAreaCr.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaAreaCr.add(jComboBoxid_empresaAreaCr, this.gridBagConstraintsAreaCr);


	this.gridBagConstraintsAreaCr = new GridBagConstraints();
	this.gridBagConstraintsAreaCr.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAreaCr.gridy = 0;
	this.gridBagConstraintsAreaCr.gridx = 0;
	this.gridBagConstraintsAreaCr.ipadx = 0;
	this.gridBagConstraintsAreaCr.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalAreaCr.add(jLabelid_sucursalAreaCr, this.gridBagConstraintsAreaCr);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAreaCr = new GridBagConstraints();
		//this.gridBagConstraintsAreaCr.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAreaCr.gridy = 0;
		this.gridBagConstraintsAreaCr.gridx = 2;
		this.gridBagConstraintsAreaCr.ipadx = 0;
		this.gridBagConstraintsAreaCr.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalAreaCr.add(jButtonid_sucursalAreaCrBusqueda, this.gridBagConstraintsAreaCr);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAreaCr = new GridBagConstraints();
		//this.gridBagConstraintsAreaCr.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAreaCr.gridy = 0;
		this.gridBagConstraintsAreaCr.gridx = 3;
		this.gridBagConstraintsAreaCr.ipadx = 0;
		this.gridBagConstraintsAreaCr.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalAreaCr.add(jButtonid_sucursalAreaCrUpdate, this.gridBagConstraintsAreaCr);
	}

	this.gridBagConstraintsAreaCr = new GridBagConstraints();
	this.gridBagConstraintsAreaCr.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAreaCr.gridy = 0;
	this.gridBagConstraintsAreaCr.gridx = 1;
	this.gridBagConstraintsAreaCr.ipadx = 0;
	this.gridBagConstraintsAreaCr.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalAreaCr.add(jComboBoxid_sucursalAreaCr, this.gridBagConstraintsAreaCr);


	this.gridBagConstraintsAreaCr = new GridBagConstraints();
	this.gridBagConstraintsAreaCr.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAreaCr.gridy = 0;
	this.gridBagConstraintsAreaCr.gridx = 0;
	this.gridBagConstraintsAreaCr.ipadx = 0;
	this.gridBagConstraintsAreaCr.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoAreaCr.add(jLabelcodigoAreaCr, this.gridBagConstraintsAreaCr);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAreaCr = new GridBagConstraints();
		//this.gridBagConstraintsAreaCr.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAreaCr.gridy = 0;
		this.gridBagConstraintsAreaCr.gridx = 2;
		this.gridBagConstraintsAreaCr.ipadx = 0;
		this.gridBagConstraintsAreaCr.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoAreaCr.add(jButtoncodigoAreaCrBusqueda, this.gridBagConstraintsAreaCr);
	}

	this.gridBagConstraintsAreaCr = new GridBagConstraints();
	this.gridBagConstraintsAreaCr.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAreaCr.gridy = 0;
	this.gridBagConstraintsAreaCr.gridx = 1;
	this.gridBagConstraintsAreaCr.ipadx = 0;
	this.gridBagConstraintsAreaCr.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoAreaCr.add(jTextFieldcodigoAreaCr, this.gridBagConstraintsAreaCr);


	this.gridBagConstraintsAreaCr = new GridBagConstraints();
	this.gridBagConstraintsAreaCr.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAreaCr.gridy = 0;
	this.gridBagConstraintsAreaCr.gridx = 0;
	this.gridBagConstraintsAreaCr.ipadx = 0;
	this.gridBagConstraintsAreaCr.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreAreaCr.add(jLabelnombreAreaCr, this.gridBagConstraintsAreaCr);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAreaCr = new GridBagConstraints();
		//this.gridBagConstraintsAreaCr.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAreaCr.gridy = 0;
		this.gridBagConstraintsAreaCr.gridx = 2;
		this.gridBagConstraintsAreaCr.ipadx = 0;
		this.gridBagConstraintsAreaCr.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreAreaCr.add(jButtonnombreAreaCrBusqueda, this.gridBagConstraintsAreaCr);
	}

	this.gridBagConstraintsAreaCr = new GridBagConstraints();
	this.gridBagConstraintsAreaCr.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAreaCr.gridy = 0;
	this.gridBagConstraintsAreaCr.gridx = 1;
	this.gridBagConstraintsAreaCr.ipadx = 0;
	this.gridBagConstraintsAreaCr.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreAreaCr.add(jscrollPanenombreAreaCr, this.gridBagConstraintsAreaCr);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsAreaCr = new GridBagConstraints();
	this.gridBagConstraintsAreaCr.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAreaCr.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAreaCr.gridy = iYPanelCamposAreaCr;
	this.gridBagConstraintsAreaCr.gridx = iXPanelCamposAreaCr++;
	this.gridBagConstraintsAreaCr.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAreaCr.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAreaCr.add(this.jPanelidAreaCr, this.gridBagConstraintsAreaCr);



	if(iXPanelCamposAreaCr % 1==0) {
		iXPanelCamposAreaCr=0;
		iYPanelCamposAreaCr++;
	}
	this.gridBagConstraintsAreaCr = new GridBagConstraints();
	this.gridBagConstraintsAreaCr.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAreaCr.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAreaCr.gridy = iYPanelCamposAreaCr;
	this.gridBagConstraintsAreaCr.gridx = iXPanelCamposAreaCr++;
	this.gridBagConstraintsAreaCr.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAreaCr.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAreaCr.add(this.jPanelcodigoAreaCr, this.gridBagConstraintsAreaCr);



	if(iXPanelCamposAreaCr % 1==0) {
		iXPanelCamposAreaCr=0;
		iYPanelCamposAreaCr++;
	}
	this.gridBagConstraintsAreaCr = new GridBagConstraints();
	this.gridBagConstraintsAreaCr.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAreaCr.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAreaCr.gridy = iYPanelCamposAreaCr;
	this.gridBagConstraintsAreaCr.gridx = iXPanelCamposAreaCr++;
	this.gridBagConstraintsAreaCr.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAreaCr.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAreaCr.add(this.jPanelnombreAreaCr, this.gridBagConstraintsAreaCr);



	if(iXPanelCamposAreaCr % 1==0) {
		iXPanelCamposAreaCr=0;
		iYPanelCamposAreaCr++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsAreaCr = new GridBagConstraints();
	this.gridBagConstraintsAreaCr.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAreaCr.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAreaCr.gridy = iYPanelCamposOcultosAreaCr;
	this.gridBagConstraintsAreaCr.gridx = iXPanelCamposOcultosAreaCr++;
	this.gridBagConstraintsAreaCr.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAreaCr.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosAreaCr.add(this.jPanelid_empresaAreaCr, this.gridBagConstraintsAreaCr);



	if(iXPanelCamposOcultosAreaCr % 1==0) {
		iXPanelCamposOcultosAreaCr=0;
		iYPanelCamposOcultosAreaCr++;
	}
	this.gridBagConstraintsAreaCr = new GridBagConstraints();
	this.gridBagConstraintsAreaCr.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAreaCr.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAreaCr.gridy = iYPanelCamposOcultosAreaCr;
	this.gridBagConstraintsAreaCr.gridx = iXPanelCamposOcultosAreaCr++;
	this.gridBagConstraintsAreaCr.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAreaCr.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosAreaCr.add(this.jPanelid_sucursalAreaCr, this.gridBagConstraintsAreaCr);



	if(iXPanelCamposOcultosAreaCr % 1==0) {
		iXPanelCamposOcultosAreaCr=0;
		iYPanelCamposOcultosAreaCr++;
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
			
		GridBagLayout gridaBagLayoutAccionesAreaCr= new GridBagLayout();
		this.jPanelAccionesAreaCr.setLayout(gridaBagLayoutAccionesAreaCr);
		
		GridBagLayout gridaBagLayoutAccionesFormularioAreaCr= new GridBagLayout();
		this.jPanelAccionesFormularioAreaCr.setLayout(gridaBagLayoutAccionesFormularioAreaCr);
		
		this.gridBagConstraintsAreaCr = new GridBagConstraints();
		this.gridBagConstraintsAreaCr.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsAreaCr.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioAreaCr.add(this.jComboBoxTiposAccionesFormularioAreaCr, this.gridBagConstraintsAreaCr);

		this.gridBagConstraintsAreaCr = new GridBagConstraints();
		this.gridBagConstraintsAreaCr.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsAreaCr.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioAreaCr.add(this.jCheckBoxPostAccionNuevoAreaCr, this.gridBagConstraintsAreaCr);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.areacrSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsAreaCr = new GridBagConstraints();
			this.gridBagConstraintsAreaCr.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsAreaCr.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioAreaCr.add(this.jCheckBoxPostAccionSinCerrarAreaCr, this.gridBagConstraintsAreaCr);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.areacrSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.areacrSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsAreaCr = new GridBagConstraints();
			this.gridBagConstraintsAreaCr.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsAreaCr.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioAreaCr.add(this.jCheckBoxPostAccionSinMensajeAreaCr, this.gridBagConstraintsAreaCr);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsAreaCr = new GridBagConstraints();
		this.gridBagConstraintsAreaCr.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAreaCr.gridy = 0;
		this.gridBagConstraintsAreaCr.gridx = iPosXAccion++;
			
		this.jPanelAccionesAreaCr.add(this.jButtonModificarAreaCr, this.gridBagConstraintsAreaCr);							

		this.gridBagConstraintsAreaCr = new GridBagConstraints();
		this.gridBagConstraintsAreaCr.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAreaCr.gridy = 0;
		this.gridBagConstraintsAreaCr.gridx =iPosXAccion++;
			
		this.jPanelAccionesAreaCr.add(this.jButtonEliminarAreaCr, this.gridBagConstraintsAreaCr);
		
			
		this.gridBagConstraintsAreaCr = new GridBagConstraints();
		this.gridBagConstraintsAreaCr.gridy = 0;		
		this.gridBagConstraintsAreaCr.gridx = iPosXAccion++;
		
		this.jPanelAccionesAreaCr.add(this.jButtonActualizarAreaCr, this.gridBagConstraintsAreaCr);


		this.gridBagConstraintsAreaCr = new GridBagConstraints();
		this.gridBagConstraintsAreaCr.gridy = 0;		
		this.gridBagConstraintsAreaCr.gridx = iPosXAccion++;
		
		this.jPanelAccionesAreaCr.add(this.jButtonGuardarCambiosAreaCr, this.gridBagConstraintsAreaCr);	
		
		this.gridBagConstraintsAreaCr = new GridBagConstraints();
		this.gridBagConstraintsAreaCr.gridy = 0;		
		this.gridBagConstraintsAreaCr.gridx =iPosXAccion++;
		
		this.jPanelAccionesAreaCr.add(this.jButtonCancelarAreaCr, this.gridBagConstraintsAreaCr);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutAreaCr = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutAreaCr);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.areacrSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsAreaCr = new GridBagConstraints();						
			this.gridBagConstraintsAreaCr.gridy = iGridyPrincipal++;
			this.gridBagConstraintsAreaCr.gridx = 0;		
			//this.gridBagConstraintsAreaCr.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAreaCr.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsAreaCr.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsAreaCr = new GridBagConstraints();
		this.gridBagConstraintsAreaCr.gridy =iGridyPrincipal++;
		this.gridBagConstraintsAreaCr.gridx =0;
		this.gridBagConstraintsAreaCr.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsAreaCr.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosAreaCr, this.gridBagConstraintsAreaCr);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(AreaCrJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleAreaCr = new AreaCrBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Area DATOS");
			
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
		    
			AreaCrModel areacrModel=new AreaCrModel(this);
			
			//SI USARA CLASE INTERNA
			//AreaCrModel.AreaCrFocusTraversalPolicy areacrFocusTraversalPolicy = areacrModel.new AreaCrFocusTraversalPolicy(this);
			
			//areacrFocusTraversalPolicy.setareacrJInternalFrame(this);
			
			this.setFocusTraversalPolicy(areacrModel);
			
			
			this.jContentPaneDetalleAreaCr = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleAreaCr = new GridBagLayout();	
			this.jContentPaneDetalleAreaCr.setLayout(gridaBagLayoutDetalleAreaCr);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosAreaCr = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsAreaCr = new GridBagConstraints();
				this.gridBagConstraintsAreaCr.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsAreaCr.gridx = 0;
					
				
				this.jContentPaneDetalleAreaCr.add(jTtoolBarDetalleAreaCr, gridBagConstraintsAreaCr);								
				
}
			
			this.jScrollPanelDatosEdicionAreaCr=   new JScrollPane(jContentPaneDetalleAreaCr,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionAreaCr.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionAreaCr.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionAreaCr.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralAreaCr=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralAreaCr.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralAreaCr.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralAreaCr.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsAreaCr = new GridBagConstraints();
			
			
	        this.gridBagConstraintsAreaCr.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsAreaCr.gridx = 0;
	        
			this.jContentPaneDetalleAreaCr.add(jPanelCamposAreaCr, gridBagConstraintsAreaCr);
			
			
			
			
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
						&& areacrSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameCliente(this.puedeCargarPorParteCliente,false,-1);
					
					if(this.areacrSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsAreaCr= new GridBagConstraints();
						this.gridBagConstraintsAreaCr.gridy = iGridyRelaciones++;
						this.gridBagConstraintsAreaCr.gridx = 0;
						this.jContentPaneDetalleAreaCr.add(this.jTabbedPaneRelacionesAreaCr, this.gridBagConstraintsAreaCr);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesAreaCr.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameCliente(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosAreaCr.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsAreaCr = new GridBagConstraints();
					this.gridBagConstraintsAreaCr.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsAreaCr.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsAreaCr.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsAreaCr.gridx = 0;
					
				
					this.jContentPaneDetalleAreaCr.add(jPanelCamposOcultosAreaCr, gridBagConstraintsAreaCr);
				
					this.jPanelCamposOcultosAreaCr.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsAreaCr = new GridBagConstraints();
			this.gridBagConstraintsAreaCr.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsAreaCr.gridx = 0;
	        this.gridBagConstraintsAreaCr.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleAreaCr.add(this.jPanelAccionesFormularioAreaCr, this.gridBagConstraintsAreaCr);							
			
			
			
			this.gridBagConstraintsAreaCr = new GridBagConstraints();
	        this.gridBagConstraintsAreaCr.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsAreaCr.gridx = 0;
	        
			
			this.jContentPaneDetalleAreaCr.add(this.jPanelAccionesAreaCr, this.gridBagConstraintsAreaCr);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionAreaCr);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionAreaCr=   new JScrollPane(this.jPanelCamposAreaCr,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionAreaCr.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionAreaCr.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionAreaCr.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsAreaCr = new GridBagConstraints();
			this.gridBagConstraintsAreaCr.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsAreaCr.gridx = 0;
			this.gridBagConstraintsAreaCr.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsAreaCr.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsAreaCr.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionAreaCr, this.gridBagConstraintsAreaCr);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsAreaCr = new GridBagConstraints();
			this.gridBagConstraintsAreaCr.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsAreaCr.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioAreaCr, this.gridBagConstraintsAreaCr);			
			
			this.gridBagConstraintsAreaCr = new GridBagConstraints();
			this.gridBagConstraintsAreaCr.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsAreaCr.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesAreaCr, this.gridBagConstraintsAreaCr);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsAreaCr = new GridBagConstraints();
		this.gridBagConstraintsAreaCr.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAreaCr.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposAreaCr, this.gridBagConstraintsAreaCr);
			
			
		this.gridBagConstraintsAreaCr = new GridBagConstraints();
		this.gridBagConstraintsAreaCr.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAreaCr.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosAreaCr, this.gridBagConstraintsAreaCr);
		
			
		this.gridBagConstraintsAreaCr = new GridBagConstraints();
		this.gridBagConstraintsAreaCr.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsAreaCr.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesAreaCr, this.gridBagConstraintsAreaCr);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralAreaCr;//jContentPane;
		
		return jScrollPanelDatosEdicionAreaCr;
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

				ClienteJInternalFrame.STIPO_TAMANIO_GENERAL=AreaCrJInternalFrame.STIPO_TAMANIO_GENERAL;
				ClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=AreaCrJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.clienteSessionBean.setEsGuardarRelacionado(true);

				this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.clienteBeanSwingJInternalFrame.setclienteSessionBean(this.clienteSessionBean);

				//this.gridBagConstraintsAreaCr = new GridBagConstraints();
				//this.gridBagConstraintsAreaCr.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsAreaCr.gridx = 0;
				//this.jContentPaneDetalleAreaCr.add(this.clienteBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsAreaCr);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesAreaCr.add("Clientes",this.clienteBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesAreaCr.setComponentAt(iIndexTab,this.clienteBeanSwingJInternalFrame.getContentPane());
				}

				//ClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.clienteSessionBean.setEsGuardarRelacionado(false);
				this.clienteBeanSwingJInternalFrame=null;//new ClienteBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.clienteSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteCliente) {
					this.jTabbedPaneRelacionesAreaCr.add("Clientes",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarClienteBeanSwingJInternalFrame(List<AreaCr> areacrs,AreaCr areacr,ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					clienteBeanSwingJInternalFrame.getClienteLogic().setConnexion(this.areacrLogic.getConnexion());

					clienteBeanSwingJInternalFrame.setareacrsForeignKey(areacrs);
					clienteBeanSwingJInternalFrame.setareacrForeignKey(areacr);
					clienteBeanSwingJInternalFrame.clienteSessionBean.setisBusquedaDesdeForeignKeySesionAreaCr(true);
					clienteBeanSwingJInternalFrame.clienteSessionBean.setlidAreaCrActual(areacr.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					clienteBeanSwingJInternalFrame.cargarCombosForeignKeyCliente(clienteBeanSwingJInternalFrame.isCargarCombosDependencia);
					clienteBeanSwingJInternalFrame.setVisibilidadBusquedasParaAreaCr(true);
					clienteBeanSwingJInternalFrame.setid_area_crFK_IdAreaCr(areacr.getId());

					if(!this.conCargarFormDetalle) {
						clienteBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					clienteBeanSwingJInternalFrame.setSelectedItemCombosFrameAreaCrForeignKey(areacr,1,false,true,true);
					clienteBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					clienteBeanSwingJInternalFrame.procesarBusqueda("FK_IdAreaCr");
					clienteBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdAreaCr");
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
