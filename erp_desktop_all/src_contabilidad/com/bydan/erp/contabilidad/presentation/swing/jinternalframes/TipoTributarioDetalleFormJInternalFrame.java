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
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.contabilidad.util.TipoTributarioConstantesFunciones;

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
public class TipoTributarioDetalleFormJInternalFrame extends TipoTributarioBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoTributario;
	
	protected JMenuBar jmenuBarDetalleTipoTributario;
	
	protected JMenu jmenuDetalleTipoTributario;
	protected JMenu jmenuDetalleArchivoTipoTributario;
	protected JMenu jmenuDetalleAccionesTipoTributario;
	protected JMenu jmenuDetalleDatosTipoTributario;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoTributario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoTributario;	
	protected GridBagConstraints gridBagConstraintsTipoTributario;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoTributarioBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoTributario;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";
	
	public TipoTributarioSessionBean tipotributarioSessionBean;
	
	

	public TransaccionLocalBeanSwingJInternalFrame transaccionlocalBeanSwingJInternalFrame=null;
	public TransaccionLocalBeanSwingJInternalFrame transaccionlocalBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteTransaccionLocal=false;
	public TransaccionLocalSessionBean transaccionlocalSessionBean;

	public FacturaProveedorServicioBeanSwingJInternalFrame facturaproveedorservicioBeanSwingJInternalFrame=null;
	public FacturaProveedorServicioBeanSwingJInternalFrame facturaproveedorservicioBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteFacturaProveedorServicio=false;
	public FacturaProveedorServicioSessionBean facturaproveedorservicioSessionBean;

	public DefinicionBeanSwingJInternalFrame definicionBeanSwingJInternalFrame=null;
	public DefinicionBeanSwingJInternalFrame definicionBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDefinicion=false;
	public DefinicionSessionBean definicionSessionBean;
	
	
	public PaisSessionBean paisSessionBean;	
	
	public TipoTributarioLogic tipotributarioLogic;
	
	public JScrollPane jScrollPanelDatosTipoTributario;
	public JScrollPane jScrollPanelDatosEdicionTipoTributario;
	public JScrollPane jScrollPanelDatosGeneralTipoTributario;
	
	protected JPanel jPanelCamposTipoTributario;    
	protected JPanel jPanelCamposOcultosTipoTributario;    	
	protected JPanel jPanelAccionesTipoTributario;
	protected JPanel jPanelAccionesFormularioTipoTributario;
    
	
	
	protected Integer iXPanelCamposTipoTributario=0;
	protected Integer iYPanelCamposTipoTributario=0;
	
	protected Integer iXPanelCamposOcultosTipoTributario=0;
	protected Integer iYPanelCamposOcultosTipoTributario=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoTributario;
	public JButton jButtonModificarTipoTributario;
	public JButton jButtonActualizarTipoTributario;
    public JButton jButtonEliminarTipoTributario;
	public JButton jButtonCancelarTipoTributario;
    public JButton jButtonGuardarCambiosTipoTributario;
	public JButton jButtonGuardarCambiosTablaTipoTributario;
	protected JButton jButtonCerrarTipoTributario;
	
	
	protected JButton jButtonProcesarInformacionTipoTributario;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoTributario;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoTributario;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoTributario;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoTributario;
	protected JButton jButtonModificarToolBarTipoTributario;
	protected JButton jButtonActualizarToolBarTipoTributario;
    protected JButton jButtonEliminarToolBarTipoTributario;
	protected JButton jButtonCancelarToolBarTipoTributario;
    protected JButton jButtonGuardarCambiosToolBarTipoTributario;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoTributario;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoTributario;
	protected JButton jButtonCerrarToolBarTipoTributario;
	
	protected JButton jButtonProcesarInformacionToolBarTipoTributario;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoTributario;
	protected JMenuItem jMenuItemModificarTipoTributario;
	protected JMenuItem jMenuItemActualizarTipoTributario;
    protected JMenuItem jMenuItemEliminarTipoTributario;
	protected JMenuItem jMenuItemCancelarTipoTributario;
    protected JMenuItem jMenuItemGuardarCambiosTipoTributario;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoTributario;
	protected JMenuItem jMenuItemCerrarTipoTributario;
	protected JMenuItem jMenuItemDetalleCerrarTipoTributario;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoTributario;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoTributario;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoTributario;
	protected JMenuItem jMenuItemMostrarOcultarTipoTributario;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoTributario;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoTributario;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoTributario;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoTributario;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoTributario;
	public JLabel jLabelIdTipoTributario;
	public JLabel jLabelidTipoTributario;
	public JButton jButtonidTipoTributarioBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoTributario;
	public JLabel jLabelcodigoTipoTributario;
	public JTextArea jTextAreacodigoTipoTributario;
	public JScrollPane jscrollPanecodigoTipoTributario;
	public JButton jButtoncodigoTipoTributarioBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoTributario;
	public JLabel jLabelnombreTipoTributario;
	public JTextArea jTextAreanombreTipoTributario;
	public JScrollPane jscrollPanenombreTipoTributario;
	public JButton jButtonnombreTipoTributarioBusqueda= new JButtonMe();

	
	public JPanel jPanelid_paisTipoTributario;
	public JLabel jLabelid_paisTipoTributario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisTipoTributario;
	public JButton jButtonid_paisTipoTributario= new JButtonMe();
	public JButton jButtonid_paisTipoTributarioUpdate= new JButtonMe();
	public JButton jButtonid_paisTipoTributarioBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoTributario;
	
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
	
	public TipoTributarioDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoTributario=new JPanel();
				this.jPanelAccionesFormularioTipoTributario=new JPanel();
				this.jmenuBarDetalleTipoTributario=new JMenuBar();
				this.jTtoolBarDetalleTipoTributario=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoTributarioDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoTributario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoTributarioDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoTributario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoTributarioDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoTributario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoTributarioDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoTributario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoTributarioDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoTributario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoTributario() {
		return this.jButtonActualizarToolBarTipoTributario;
	}
	
	public JButton getjButtonEliminarToolBarTipoTributario() {
		return this.jButtonEliminarToolBarTipoTributario;
	}
	
	public JButton getjButtonCancelarToolBarTipoTributario() {
		return this.jButtonCancelarToolBarTipoTributario;
	}		
	
	public JButton getjButtonProcesarInformacionTipoTributario() {
		return this.jButtonProcesarInformacionTipoTributario;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoTributario)	{
		this.jButtonProcesarInformacionTipoTributario = jButtonProcesarInformacionTipoTributario;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoTributario() {
		return this.jComboBoxTiposAccionesTipoTributario;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoTributario(
			JComboBox jComboBoxTiposRelacionesTipoTributario) {
		this.jComboBoxTiposRelacionesTipoTributario = jComboBoxTiposRelacionesTipoTributario;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoTributario(
			JComboBox jComboBoxTiposAccionesTipoTributario) {
		this.jComboBoxTiposAccionesTipoTributario = jComboBoxTiposAccionesTipoTributario;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoTributario() {
		return this.jComboBoxTiposAccionesFormularioTipoTributario;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoTributario(
			JComboBox jComboBoxTiposAccionesFormularioTipoTributario) {
		this.jComboBoxTiposAccionesFormularioTipoTributario = jComboBoxTiposAccionesFormularioTipoTributario;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipotributarioSessionBean=new TipoTributarioSessionBean();
		
		this.tipotributarioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipotributarioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipotributarioSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.transaccionlocalSessionBean=new TransaccionLocalSessionBean();
		//this.facturaproveedorservicioSessionBean=new FacturaProveedorServicioSessionBean();
		//this.definicionSessionBean=new DefinicionSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoTributarioJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoTributarioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoTributarioJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Tributario MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipotributarioSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoTributarioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoTributario= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoTributario=new JButtonMe();
				this.jButtonModificarToolBarTipoTributario=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoTributario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoTributario,this.jTtoolBarDetalleTipoTributario,
							"actualizar","actualizar","Actualizar"+" "+TipoTributarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoTributario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoTributario,this.jTtoolBarDetalleTipoTributario,
							"eliminar","eliminar","Eliminar"+" "+TipoTributarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoTributario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoTributario,this.jTtoolBarDetalleTipoTributario,
							"cancelar","cancelar","Cancelar"+" "+TipoTributarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoTributario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoTributario,this.jTtoolBarDetalleTipoTributario,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoTributarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoTributario,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoTributario,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoTributario,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoTributario=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoTributario=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoTributario=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoTributario=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoTributario=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoTributario= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoTributario.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoTributario,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoTributario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoTributario= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoTributario.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoTributario,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoTributario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoTributario= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoTributario.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoTributario,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoTributario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoTributario= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoTributario.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoTributario,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoTributario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoTributario= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoTributario.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoTributario,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoTributario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoTributario= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoTributario.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoTributario,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoTributario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoTributario= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoTributario.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoTributario,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoTributario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoTributario= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoTributario.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoTributario,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoTributario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoTributario= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoTributario.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoTributario,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoTributario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoTributario= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoTributario.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoTributario,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoTributario, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoTributario.add(this.jMenuItemDetalleCerrarTipoTributario);
		
		this.jmenuDetalleAccionesTipoTributario.add(this.jMenuItemActualizarTipoTributario);
		this.jmenuDetalleAccionesTipoTributario.add(this.jMenuItemEliminarTipoTributario);
		this.jmenuDetalleAccionesTipoTributario.add(this.jMenuItemCancelarTipoTributario);		
		
		//this.jmenuDetalleDatosTipoTributario.add(this.jMenuItemDetalleAbrirOrderByTipoTributario);				
		this.jmenuDetalleDatosTipoTributario.add(this.jMenuItemDetalleMostarOcultarTipoTributario);				
				
		//this.jmenuDetalleAccionesTipoTributario.add(this.jMenuItemGuardarCambiosTipoTributario);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoTributario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoTributario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoTributario, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoTributario.add(this.jmenuDetalleArchivoTipoTributario);		
		this.jmenuBarDetalleTipoTributario.add(this.jmenuDetalleAccionesTipoTributario);		
		this.jmenuBarDetalleTipoTributario.add(this.jmenuDetalleDatosTipoTributario);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTipoTributario, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTipoTributario.add(this.jmenuDetalleTipoTributario);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoTributario);				
	}
	
	
	public void inicializarElementosCamposTipoTributario() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoTributario = new JLabelMe();
		jLabelIdTipoTributario.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoTributario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoTributario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoTributario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoTributario,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoTributario = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoTributario.setToolTipText(TipoTributarioConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoTributario= new GridBagLayout();

		this.jPanelidTipoTributario.setLayout(this.gridaBagLayoutTipoTributario);

		jLabelidTipoTributario = new JLabel();
		jLabelidTipoTributario.setText("Id");

		jLabelidTipoTributario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoTributario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoTributario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoTributario = new JLabelMe();
		this.jLabelcodigoTipoTributario.setText(""+TipoTributarioConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoTributario.setToolTipText("Codigo");
		this.jLabelcodigoTipoTributario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoTributario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoTributario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoTributario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoTributario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoTributario.setToolTipText(TipoTributarioConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoTributario = new GridBagLayout();
		this.jPanelcodigoTipoTributario.setLayout(this.gridaBagLayoutTipoTributario);


		jTextAreacodigoTipoTributario= new JTextAreaMe();
		jTextAreacodigoTipoTributario.setEnabled(false);
		jTextAreacodigoTipoTributario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,130),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacodigoTipoTributario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,130),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacodigoTipoTributario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,130),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreacodigoTipoTributario.setLineWrap(true);
		jTextAreacodigoTipoTributario.setWrapStyleWord(true);
		jTextAreacodigoTipoTributario.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreacodigoTipoTributario.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreacodigoTipoTributario,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanecodigoTipoTributario = new JScrollPane(jTextAreacodigoTipoTributario);
		jscrollPanecodigoTipoTributario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,130),70));
		jscrollPanecodigoTipoTributario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,130),70));
		jscrollPanecodigoTipoTributario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,130),70));

		this.jButtoncodigoTipoTributarioBusqueda= new JButtonMe();
		this.jButtoncodigoTipoTributarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoTributarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoTributarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoTributarioBusqueda.setText("U");
		this.jButtoncodigoTipoTributarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoTributarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoTributarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreacodigoTipoTributario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreacodigoTipoTributario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoTributarioBusqueda"));

		if(this.tipotributarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoTributarioBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoTributario = new JLabelMe();
		this.jLabelnombreTipoTributario.setText(""+TipoTributarioConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoTributario.setToolTipText("Nombre");
		this.jLabelnombreTipoTributario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoTributario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoTributario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoTributario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoTributario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoTributario.setToolTipText(TipoTributarioConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoTributario = new GridBagLayout();
		this.jPanelnombreTipoTributario.setLayout(this.gridaBagLayoutTipoTributario);


		jTextAreanombreTipoTributario= new JTextAreaMe();
		jTextAreanombreTipoTributario.setEnabled(false);
		jTextAreanombreTipoTributario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,130),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoTributario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,130),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoTributario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,130),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoTributario.setLineWrap(true);
		jTextAreanombreTipoTributario.setWrapStyleWord(true);
		jTextAreanombreTipoTributario.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoTributario.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoTributario,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoTributario = new JScrollPane(jTextAreanombreTipoTributario);
		jscrollPanenombreTipoTributario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,130),70));
		jscrollPanenombreTipoTributario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,130),70));
		jscrollPanenombreTipoTributario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,130),70));

		this.jButtonnombreTipoTributarioBusqueda= new JButtonMe();
		this.jButtonnombreTipoTributarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoTributarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoTributarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoTributarioBusqueda.setText("U");
		this.jButtonnombreTipoTributarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoTributarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoTributarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoTributario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoTributario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoTributarioBusqueda"));

		if(this.tipotributarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoTributarioBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoTributario() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_paisTipoTributario = new JLabelMe();
		this.jLabelid_paisTipoTributario.setText(""+TipoTributarioConstantesFunciones.LABEL_IDPAIS+" : *");
		this.jLabelid_paisTipoTributario.setToolTipText("Pais");
		this.jLabelid_paisTipoTributario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisTipoTributario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisTipoTributario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_paisTipoTributario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_paisTipoTributario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_paisTipoTributario.setToolTipText(TipoTributarioConstantesFunciones.LABEL_IDPAIS);
		this.gridaBagLayoutTipoTributario = new GridBagLayout();
		this.jPanelid_paisTipoTributario.setLayout(this.gridaBagLayoutTipoTributario);


		jComboBoxid_paisTipoTributario= new JComboBoxMe();
		jComboBoxid_paisTipoTributario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisTipoTributario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisTipoTributario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisTipoTributario,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_paisTipoTributario= new JButtonMe();
		this.jButtonid_paisTipoTributario.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisTipoTributario.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisTipoTributario.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisTipoTributario.setText("Buscar");
		this.jButtonid_paisTipoTributario.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_paisTipoTributario.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisTipoTributario,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_paisTipoTributario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisTipoTributario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisTipoTributario"));

		this.jButtonid_paisTipoTributarioBusqueda= new JButtonMe();
		this.jButtonid_paisTipoTributarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisTipoTributarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisTipoTributarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisTipoTributarioBusqueda.setText("U");
		this.jButtonid_paisTipoTributarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_paisTipoTributarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisTipoTributarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_paisTipoTributario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisTipoTributario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisTipoTributarioBusqueda"));

		if(this.tipotributarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_paisTipoTributarioBusqueda.setVisible(false);		}

		this.jButtonid_paisTipoTributarioUpdate= new JButtonMe();
		this.jButtonid_paisTipoTributarioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisTipoTributarioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisTipoTributarioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisTipoTributarioUpdate.setText("U");
		this.jButtonid_paisTipoTributarioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_paisTipoTributarioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisTipoTributarioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_paisTipoTributario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisTipoTributario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisTipoTributarioUpdate"));



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
		//this.jInternalFrameDetalleTipoTributario = new TipoTributarioBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Tributario DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoTributario= new GridBagLayout();
		

		
		String sToolTipTipoTributario="";
		sToolTipTipoTributario=TipoTributarioConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoTributario+="(Contabilidad.TipoTributario)";
		}
		
		if(!this.tipotributarioSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoTributario+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoTributario = new JButtonMe();
		this.jButtonModificarTipoTributario = new JButtonMe();
        this.jButtonActualizarTipoTributario = new JButtonMe();
        this.jButtonEliminarTipoTributario = new JButtonMe();
        this.jButtonCancelarTipoTributario = new JButtonMe();
        this.jButtonGuardarCambiosTipoTributario = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoTributario = new JButtonMe();
		this.jButtonCerrarTipoTributario = new JButtonMe();
		
		this.jScrollPanelDatosTipoTributario = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoTributario = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoTributario = new JScrollPane();
				
		
		
		this.jPanelCamposTipoTributario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoTributario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoTributario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoTributario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Tributario";
		
		if(!this.tipotributarioSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoTributario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Tributarios" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoTributario.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoTributario.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoTributario.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoTributario.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoTributario.setName("jPanelCamposTipoTributario"); 

		this.jPanelCamposOcultosTipoTributario.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoTributario.setName("jPanelCamposOcultosTipoTributario"); 

        this.jPanelAccionesTipoTributario.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoTributario.setToolTipText("Acciones");
        this.jPanelAccionesTipoTributario.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoTributario.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoTributario.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoTributario.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoTributario, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoTributario, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoTributario, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoTributario, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoTributario, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoTributario, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoTributario.setText("Nuevo");
		this.jButtonModificarTipoTributario.setText("Editar");
        this.jButtonActualizarTipoTributario.setText("Actualizar");
        this.jButtonEliminarTipoTributario.setText("Eliminar");
        this.jButtonCancelarTipoTributario.setText("Cancelar");
        this.jButtonGuardarCambiosTipoTributario.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoTributario.setText("Guardar");
		this.jButtonCerrarTipoTributario.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoTributario,"nuevo_button","Nuevo",this.tipotributarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoTributario,"modificar_button","Editar",this.tipotributarioSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoTributario,"actualizar_button","Actualizar",this.tipotributarioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoTributario,"eliminar_button","Eliminar",this.tipotributarioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoTributario,"cancelar_button","Cancelar",this.tipotributarioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoTributario,"guardarcambios_button","Guardar",this.tipotributarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoTributario,"guardarcambiostabla_button","Guardar",this.tipotributarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoTributario,"cerrar_button","Salir",this.tipotributarioSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoTributario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoTributario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoTributario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoTributario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoTributario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoTributario, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoTributario, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoTributario, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoTributario.setToolTipText("Nuevo"+" "+TipoTributarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoTributario.setToolTipText("Editar"+" "+TipoTributarioConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoTributario.setToolTipText("Actualizar"+" "+TipoTributarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoTributario.setToolTipText("Eliminar)"+" "+TipoTributarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoTributario.setToolTipText("Cancelar"+" "+TipoTributarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoTributario.setToolTipText("Guardar"+" "+TipoTributarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoTributario.setToolTipText("Guardar"+" "+TipoTributarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoTributario.setToolTipText("Salir"+" "+TipoTributarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoTributario";
		inputMap = this.jButtonNuevoTipoTributario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoTributario.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoTributario"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoTributario";
		inputMap = this.jButtonActualizarTipoTributario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoTributario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoTributario"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoTributario";
		inputMap = this.jButtonEliminarTipoTributario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoTributario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoTributario"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoTributario";
		inputMap = this.jButtonCancelarTipoTributario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoTributario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoTributario"));
		
		//CERRAR		
		sMapKey = "CerrarTipoTributario";
		inputMap = this.jButtonCerrarTipoTributario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoTributario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoTributario"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoTributario";
		inputMap = this.jButtonGuardarCambiosTablaTipoTributario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoTributario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoTributario"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoTributario = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoTributario.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoTributario.setToolTipText("Nuevo TipoTributario");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoTributario, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoTributario = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoTributario.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoTributario.setToolTipText("Sin Cerrar Ventana TipoTributario");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoTributario, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoTributario = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoTributario.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoTributario.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoTributario, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoTributario = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoTributario.setText("Accion");
		this.jComboBoxTiposAccionesTipoTributario.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoTributario = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoTributario.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoTributario.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoTributario = new JLabelMe();
		
		this.jLabelAccionesTipoTributario.setText("Acciones");		
		this.jLabelAccionesTipoTributario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoTributario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoTributario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoTributario();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoTributario();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoTributario=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoTributario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoTributario,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoTributario.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoTributario.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoTributario.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoTributario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoTributario.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoTributario.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoTributario.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoTributario, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoTributario = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoTributario = new GridBagLayout();
		
		this.jPanelCamposTipoTributario.setLayout(gridaBagLayoutCamposTipoTributario);
		this.jPanelCamposOcultosTipoTributario.setLayout(gridaBagLayoutCamposOcultosTipoTributario);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoTributario = new GridBagConstraints();
	this.gridBagConstraintsTipoTributario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoTributario.gridy = 0;
	this.gridBagConstraintsTipoTributario.gridx = 0;
	this.gridBagConstraintsTipoTributario.ipadx = 0;
	this.gridBagConstraintsTipoTributario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoTributario.add(jLabelIdTipoTributario, this.gridBagConstraintsTipoTributario);



	this.gridBagConstraintsTipoTributario = new GridBagConstraints();
	this.gridBagConstraintsTipoTributario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoTributario.gridy = 0;
	this.gridBagConstraintsTipoTributario.gridx = 1;
	this.gridBagConstraintsTipoTributario.ipadx = 0;
	this.gridBagConstraintsTipoTributario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoTributario.add(jLabelidTipoTributario, this.gridBagConstraintsTipoTributario);


	this.gridBagConstraintsTipoTributario = new GridBagConstraints();
	this.gridBagConstraintsTipoTributario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoTributario.gridy = 0;
	this.gridBagConstraintsTipoTributario.gridx = 0;
	this.gridBagConstraintsTipoTributario.ipadx = 0;
	this.gridBagConstraintsTipoTributario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_paisTipoTributario.add(jLabelid_paisTipoTributario, this.gridBagConstraintsTipoTributario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoTributario = new GridBagConstraints();
		//this.gridBagConstraintsTipoTributario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoTributario.gridy = 0;
		this.gridBagConstraintsTipoTributario.gridx = 2;
		this.gridBagConstraintsTipoTributario.ipadx = 0;
		this.gridBagConstraintsTipoTributario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisTipoTributario.add(jButtonid_paisTipoTributarioBusqueda, this.gridBagConstraintsTipoTributario);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoTributario = new GridBagConstraints();
		//this.gridBagConstraintsTipoTributario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoTributario.gridy = 0;
		this.gridBagConstraintsTipoTributario.gridx = 3;
		this.gridBagConstraintsTipoTributario.ipadx = 0;
		this.gridBagConstraintsTipoTributario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisTipoTributario.add(jButtonid_paisTipoTributarioUpdate, this.gridBagConstraintsTipoTributario);
	}

	this.gridBagConstraintsTipoTributario = new GridBagConstraints();
	this.gridBagConstraintsTipoTributario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoTributario.gridy = 0;
	this.gridBagConstraintsTipoTributario.gridx = 1;
	this.gridBagConstraintsTipoTributario.ipadx = 0;
	this.gridBagConstraintsTipoTributario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_paisTipoTributario.add(jComboBoxid_paisTipoTributario, this.gridBagConstraintsTipoTributario);


	this.gridBagConstraintsTipoTributario = new GridBagConstraints();
	this.gridBagConstraintsTipoTributario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoTributario.gridy = 0;
	this.gridBagConstraintsTipoTributario.gridx = 0;
	this.gridBagConstraintsTipoTributario.ipadx = 0;
	this.gridBagConstraintsTipoTributario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoTributario.add(jLabelcodigoTipoTributario, this.gridBagConstraintsTipoTributario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoTributario = new GridBagConstraints();
		//this.gridBagConstraintsTipoTributario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoTributario.gridy = 0;
		this.gridBagConstraintsTipoTributario.gridx = 2;
		this.gridBagConstraintsTipoTributario.ipadx = 0;
		this.gridBagConstraintsTipoTributario.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoTributario.add(jButtoncodigoTipoTributarioBusqueda, this.gridBagConstraintsTipoTributario);
	}

	this.gridBagConstraintsTipoTributario = new GridBagConstraints();
	this.gridBagConstraintsTipoTributario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoTributario.gridy = 0;
	this.gridBagConstraintsTipoTributario.gridx = 1;
	this.gridBagConstraintsTipoTributario.ipadx = 0;
	this.gridBagConstraintsTipoTributario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoTributario.add(jscrollPanecodigoTipoTributario, this.gridBagConstraintsTipoTributario);


	this.gridBagConstraintsTipoTributario = new GridBagConstraints();
	this.gridBagConstraintsTipoTributario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoTributario.gridy = 0;
	this.gridBagConstraintsTipoTributario.gridx = 0;
	this.gridBagConstraintsTipoTributario.ipadx = 0;
	this.gridBagConstraintsTipoTributario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoTributario.add(jLabelnombreTipoTributario, this.gridBagConstraintsTipoTributario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoTributario = new GridBagConstraints();
		//this.gridBagConstraintsTipoTributario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoTributario.gridy = 0;
		this.gridBagConstraintsTipoTributario.gridx = 2;
		this.gridBagConstraintsTipoTributario.ipadx = 0;
		this.gridBagConstraintsTipoTributario.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoTributario.add(jButtonnombreTipoTributarioBusqueda, this.gridBagConstraintsTipoTributario);
	}

	this.gridBagConstraintsTipoTributario = new GridBagConstraints();
	this.gridBagConstraintsTipoTributario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoTributario.gridy = 0;
	this.gridBagConstraintsTipoTributario.gridx = 1;
	this.gridBagConstraintsTipoTributario.ipadx = 0;
	this.gridBagConstraintsTipoTributario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoTributario.add(jscrollPanenombreTipoTributario, this.gridBagConstraintsTipoTributario);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoTributario = new GridBagConstraints();
	this.gridBagConstraintsTipoTributario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoTributario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoTributario.gridy = iYPanelCamposTipoTributario;
	this.gridBagConstraintsTipoTributario.gridx = iXPanelCamposTipoTributario++;
	this.gridBagConstraintsTipoTributario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoTributario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoTributario.add(this.jPanelidTipoTributario, this.gridBagConstraintsTipoTributario);



	if(iXPanelCamposTipoTributario % 1==0) {
		iXPanelCamposTipoTributario=0;
		iYPanelCamposTipoTributario++;
	}
	this.gridBagConstraintsTipoTributario = new GridBagConstraints();
	this.gridBagConstraintsTipoTributario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoTributario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoTributario.gridy = iYPanelCamposTipoTributario;
	this.gridBagConstraintsTipoTributario.gridx = iXPanelCamposTipoTributario++;
	this.gridBagConstraintsTipoTributario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoTributario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoTributario.add(this.jPanelid_paisTipoTributario, this.gridBagConstraintsTipoTributario);



	if(iXPanelCamposTipoTributario % 1==0) {
		iXPanelCamposTipoTributario=0;
		iYPanelCamposTipoTributario++;
	}
	this.gridBagConstraintsTipoTributario = new GridBagConstraints();
	this.gridBagConstraintsTipoTributario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoTributario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoTributario.gridy = iYPanelCamposTipoTributario;
	this.gridBagConstraintsTipoTributario.gridx = iXPanelCamposTipoTributario++;
	this.gridBagConstraintsTipoTributario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoTributario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoTributario.add(this.jPanelcodigoTipoTributario, this.gridBagConstraintsTipoTributario);



	if(iXPanelCamposTipoTributario % 1==0) {
		iXPanelCamposTipoTributario=0;
		iYPanelCamposTipoTributario++;
	}
	this.gridBagConstraintsTipoTributario = new GridBagConstraints();
	this.gridBagConstraintsTipoTributario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoTributario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoTributario.gridy = iYPanelCamposTipoTributario;
	this.gridBagConstraintsTipoTributario.gridx = iXPanelCamposTipoTributario++;
	this.gridBagConstraintsTipoTributario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoTributario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoTributario.add(this.jPanelnombreTipoTributario, this.gridBagConstraintsTipoTributario);



	if(iXPanelCamposTipoTributario % 1==0) {
		iXPanelCamposTipoTributario=0;
		iYPanelCamposTipoTributario++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoTributario= new GridBagLayout();
		this.jPanelAccionesTipoTributario.setLayout(gridaBagLayoutAccionesTipoTributario);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoTributario= new GridBagLayout();
		this.jPanelAccionesFormularioTipoTributario.setLayout(gridaBagLayoutAccionesFormularioTipoTributario);
		
		this.gridBagConstraintsTipoTributario = new GridBagConstraints();
		this.gridBagConstraintsTipoTributario.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoTributario.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoTributario.add(this.jComboBoxTiposAccionesFormularioTipoTributario, this.gridBagConstraintsTipoTributario);

		this.gridBagConstraintsTipoTributario = new GridBagConstraints();
		this.gridBagConstraintsTipoTributario.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoTributario.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoTributario.add(this.jCheckBoxPostAccionNuevoTipoTributario, this.gridBagConstraintsTipoTributario);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipotributarioSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoTributario = new GridBagConstraints();
			this.gridBagConstraintsTipoTributario.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoTributario.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoTributario.add(this.jCheckBoxPostAccionSinCerrarTipoTributario, this.gridBagConstraintsTipoTributario);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipotributarioSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipotributarioSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoTributario = new GridBagConstraints();
			this.gridBagConstraintsTipoTributario.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoTributario.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoTributario.add(this.jCheckBoxPostAccionSinMensajeTipoTributario, this.gridBagConstraintsTipoTributario);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoTributario = new GridBagConstraints();
		this.gridBagConstraintsTipoTributario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoTributario.gridy = 0;
		this.gridBagConstraintsTipoTributario.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoTributario.add(this.jButtonModificarTipoTributario, this.gridBagConstraintsTipoTributario);							

		this.gridBagConstraintsTipoTributario = new GridBagConstraints();
		this.gridBagConstraintsTipoTributario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoTributario.gridy = 0;
		this.gridBagConstraintsTipoTributario.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoTributario.add(this.jButtonEliminarTipoTributario, this.gridBagConstraintsTipoTributario);
		
			
		this.gridBagConstraintsTipoTributario = new GridBagConstraints();
		this.gridBagConstraintsTipoTributario.gridy = 0;		
		this.gridBagConstraintsTipoTributario.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoTributario.add(this.jButtonActualizarTipoTributario, this.gridBagConstraintsTipoTributario);


		this.gridBagConstraintsTipoTributario = new GridBagConstraints();
		this.gridBagConstraintsTipoTributario.gridy = 0;		
		this.gridBagConstraintsTipoTributario.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoTributario.add(this.jButtonGuardarCambiosTipoTributario, this.gridBagConstraintsTipoTributario);	
		
		this.gridBagConstraintsTipoTributario = new GridBagConstraints();
		this.gridBagConstraintsTipoTributario.gridy = 0;		
		this.gridBagConstraintsTipoTributario.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoTributario.add(this.jButtonCancelarTipoTributario, this.gridBagConstraintsTipoTributario);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoTributario = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoTributario);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipotributarioSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoTributario = new GridBagConstraints();						
			this.gridBagConstraintsTipoTributario.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoTributario.gridx = 0;		
			//this.gridBagConstraintsTipoTributario.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTributario.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoTributario.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoTributario = new GridBagConstraints();
		this.gridBagConstraintsTipoTributario.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoTributario.gridx =0;
		this.gridBagConstraintsTipoTributario.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoTributario.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoTributario, this.gridBagConstraintsTipoTributario);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoTributarioJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoTributario = new TipoTributarioBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Tributario DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Tributario DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Tributario Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoTributarioModel tipotributarioModel=new TipoTributarioModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoTributarioModel.TipoTributarioFocusTraversalPolicy tipotributarioFocusTraversalPolicy = tipotributarioModel.new TipoTributarioFocusTraversalPolicy(this);
			
			//tipotributarioFocusTraversalPolicy.settipotributarioJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipotributarioModel);
			
			
			this.jContentPaneDetalleTipoTributario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoTributario = new GridBagLayout();	
			this.jContentPaneDetalleTipoTributario.setLayout(gridaBagLayoutDetalleTipoTributario);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoTributario = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoTributario = new GridBagConstraints();
				this.gridBagConstraintsTipoTributario.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoTributario.gridx = 0;
					
				
				this.jContentPaneDetalleTipoTributario.add(jTtoolBarDetalleTipoTributario, gridBagConstraintsTipoTributario);								
				
}
			
			this.jScrollPanelDatosEdicionTipoTributario=   new JScrollPane(jContentPaneDetalleTipoTributario,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoTributario.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoTributario.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoTributario.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoTributario=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoTributario.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoTributario.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoTributario.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoTributario = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoTributario.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoTributario.gridx = 0;
	        
			this.jContentPaneDetalleTipoTributario.add(jPanelCamposTipoTributario, gridBagConstraintsTipoTributario);
			
			
			
			
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
						&& tipotributarioSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameDefinicion(this.puedeCargarPorParteDefinicion,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameFacturaProveedorServicio(this.puedeCargarPorParteFacturaProveedorServicio,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameTransaccionLocal(this.puedeCargarPorParteTransaccionLocal,false,-1);
					
					if(this.tipotributarioSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoTributario= new GridBagConstraints();
						this.gridBagConstraintsTipoTributario.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoTributario.gridx = 0;
						this.jContentPaneDetalleTipoTributario.add(this.jTabbedPaneRelacionesTipoTributario, this.gridBagConstraintsTipoTributario);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoTributario.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameDefinicion(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameFacturaProveedorServicio(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameTransaccionLocal(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoTributario.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoTributario = new GridBagConstraints();
					this.gridBagConstraintsTipoTributario.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoTributario.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoTributario.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoTributario.gridx = 0;
					
				
					this.jContentPaneDetalleTipoTributario.add(jPanelCamposOcultosTipoTributario, gridBagConstraintsTipoTributario);
				
					this.jPanelCamposOcultosTipoTributario.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoTributario = new GridBagConstraints();
			this.gridBagConstraintsTipoTributario.gridy = iGridyRelaciones++;//10;		
	        this.gridBagConstraintsTipoTributario.gridx = 0;
	        this.gridBagConstraintsTipoTributario.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoTributario.add(this.jPanelAccionesFormularioTipoTributario, this.gridBagConstraintsTipoTributario);							
			
			
			
			this.gridBagConstraintsTipoTributario = new GridBagConstraints();
	        this.gridBagConstraintsTipoTributario.gridy = iGridyRelaciones;//10;		
	        this.gridBagConstraintsTipoTributario.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoTributario.add(this.jPanelAccionesTipoTributario, this.gridBagConstraintsTipoTributario);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoTributario);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoTributario=   new JScrollPane(this.jPanelCamposTipoTributario,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoTributario.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoTributario.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoTributario.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoTributario = new GridBagConstraints();
			this.gridBagConstraintsTipoTributario.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoTributario.gridx = 0;
			this.gridBagConstraintsTipoTributario.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoTributario.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoTributario.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoTributario, this.gridBagConstraintsTipoTributario);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoTributario = new GridBagConstraints();
			this.gridBagConstraintsTipoTributario.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoTributario.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoTributario, this.gridBagConstraintsTipoTributario);			
			
			this.gridBagConstraintsTipoTributario = new GridBagConstraints();
			this.gridBagConstraintsTipoTributario.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoTributario.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoTributario, this.gridBagConstraintsTipoTributario);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoTributario = new GridBagConstraints();
		this.gridBagConstraintsTipoTributario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoTributario.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoTributario, this.gridBagConstraintsTipoTributario);
			
			
		this.gridBagConstraintsTipoTributario = new GridBagConstraints();
		this.gridBagConstraintsTipoTributario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoTributario.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoTributario, this.gridBagConstraintsTipoTributario);
		
			
		this.gridBagConstraintsTipoTributario = new GridBagConstraints();
		this.gridBagConstraintsTipoTributario.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoTributario.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoTributario, this.gridBagConstraintsTipoTributario);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoTributario;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoTributario;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameDefinicion(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.definicionSessionBean=new DefinicionSessionBean();
		this.definicionSessionBean.setConGuardarRelaciones(false);
		this.definicionSessionBean.setEsGuardarRelacionado(true);

		this.definicionBeanSwingJInternalFrame=null;//new DefinicionBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.definicionBeanSwingJInternalFramePopup=new DefinicionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.definicionBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.definicionSessionBean.getEsGuardarRelacionado()) {

				DefinicionJInternalFrame.STIPO_TAMANIO_GENERAL=TipoTributarioJInternalFrame.STIPO_TAMANIO_GENERAL;
				DefinicionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoTributarioJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.definicionSessionBean.setEsGuardarRelacionado(true);

				this.definicionBeanSwingJInternalFrame=new DefinicionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.definicionBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.definicionBeanSwingJInternalFrame.setdefinicionSessionBean(this.definicionSessionBean);

				//this.gridBagConstraintsTipoTributario = new GridBagConstraints();
				//this.gridBagConstraintsTipoTributario.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoTributario.gridx = 0;
				//this.jContentPaneDetalleTipoTributario.add(this.definicionBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoTributario);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoTributario.add("Definiciones",this.definicionBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoTributario.setComponentAt(iIndexTab,this.definicionBeanSwingJInternalFrame.getContentPane());
				}

				//DefinicionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.definicionSessionBean.setEsGuardarRelacionado(false);
				this.definicionBeanSwingJInternalFrame=null;//new DefinicionBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.definicionSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDefinicion) {
					this.jTabbedPaneRelacionesTipoTributario.add("Definiciones",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameFacturaProveedorServicio(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.facturaproveedorservicioSessionBean=new FacturaProveedorServicioSessionBean();
		this.facturaproveedorservicioSessionBean.setConGuardarRelaciones(false);
		this.facturaproveedorservicioSessionBean.setEsGuardarRelacionado(true);

		this.facturaproveedorservicioBeanSwingJInternalFrame=null;//new FacturaProveedorServicioBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.facturaproveedorservicioBeanSwingJInternalFramePopup=new FacturaProveedorServicioBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.facturaproveedorservicioBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.facturaproveedorservicioSessionBean.getEsGuardarRelacionado()) {

				FacturaProveedorServicioJInternalFrame.STIPO_TAMANIO_GENERAL=TipoTributarioJInternalFrame.STIPO_TAMANIO_GENERAL;
				FacturaProveedorServicioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoTributarioJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.facturaproveedorservicioSessionBean.setEsGuardarRelacionado(true);

				this.facturaproveedorservicioBeanSwingJInternalFrame=new FacturaProveedorServicioBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.facturaproveedorservicioBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.facturaproveedorservicioBeanSwingJInternalFrame.setfacturaproveedorservicioSessionBean(this.facturaproveedorservicioSessionBean);

				//this.gridBagConstraintsTipoTributario = new GridBagConstraints();
				//this.gridBagConstraintsTipoTributario.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoTributario.gridx = 0;
				//this.jContentPaneDetalleTipoTributario.add(this.facturaproveedorservicioBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoTributario);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoTributario.add("Factura Proveedors",this.facturaproveedorservicioBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoTributario.setComponentAt(iIndexTab,this.facturaproveedorservicioBeanSwingJInternalFrame.getContentPane());
				}

				//FacturaProveedorServicioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.facturaproveedorservicioSessionBean.setEsGuardarRelacionado(false);
				this.facturaproveedorservicioBeanSwingJInternalFrame=null;//new FacturaProveedorServicioBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.facturaproveedorservicioSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteFacturaProveedorServicio) {
					this.jTabbedPaneRelacionesTipoTributario.add("Factura Proveedors",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameTransaccionLocal(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.transaccionlocalSessionBean=new TransaccionLocalSessionBean();
		this.transaccionlocalSessionBean.setConGuardarRelaciones(false);
		this.transaccionlocalSessionBean.setEsGuardarRelacionado(true);

		this.transaccionlocalBeanSwingJInternalFrame=null;//new TransaccionLocalBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.transaccionlocalBeanSwingJInternalFramePopup=new TransaccionLocalBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.transaccionlocalBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.transaccionlocalSessionBean.getEsGuardarRelacionado()) {

				TransaccionLocalJInternalFrame.STIPO_TAMANIO_GENERAL=TipoTributarioJInternalFrame.STIPO_TAMANIO_GENERAL;
				TransaccionLocalJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoTributarioJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.transaccionlocalSessionBean.setEsGuardarRelacionado(true);

				this.transaccionlocalBeanSwingJInternalFrame=new TransaccionLocalBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.transaccionlocalBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.transaccionlocalBeanSwingJInternalFrame.settransaccionlocalSessionBean(this.transaccionlocalSessionBean);

				//this.gridBagConstraintsTipoTributario = new GridBagConstraints();
				//this.gridBagConstraintsTipoTributario.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoTributario.gridx = 0;
				//this.jContentPaneDetalleTipoTributario.add(this.transaccionlocalBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoTributario);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoTributario.add("Transaccion Locales",this.transaccionlocalBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoTributario.setComponentAt(iIndexTab,this.transaccionlocalBeanSwingJInternalFrame.getContentPane());
				}

				//TransaccionLocalJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.transaccionlocalSessionBean.setEsGuardarRelacionado(false);
				this.transaccionlocalBeanSwingJInternalFrame=null;//new TransaccionLocalBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.transaccionlocalSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteTransaccionLocal) {
					this.jTabbedPaneRelacionesTipoTributario.add("Transaccion Locales",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarTransaccionLocalBeanSwingJInternalFrame(List<TipoTributario> tipotributarios,TipoTributario tipotributario,TransaccionLocalBeanSwingJInternalFrame transaccionlocalBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//transaccionlocalBeanSwingJInternalFrame=new TransaccionLocalBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					transaccionlocalBeanSwingJInternalFrame.getTransaccionLocalLogic().setConnexion(this.tipotributarioLogic.getConnexion());

					transaccionlocalBeanSwingJInternalFrame.settipotributariosForeignKey(tipotributarios);
					transaccionlocalBeanSwingJInternalFrame.settipotributarioForeignKey(tipotributario);
					transaccionlocalBeanSwingJInternalFrame.transaccionlocalSessionBean.setisBusquedaDesdeForeignKeySesionTipoTributario(true);
					transaccionlocalBeanSwingJInternalFrame.transaccionlocalSessionBean.setlidTipoTributarioActual(tipotributario.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					transaccionlocalBeanSwingJInternalFrame.cargarCombosForeignKeyTransaccionLocal(transaccionlocalBeanSwingJInternalFrame.isCargarCombosDependencia);
					transaccionlocalBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoTributario(true);
					transaccionlocalBeanSwingJInternalFrame.setid_tipo_tributarioFK_IdTipoTributario(tipotributario.getId());

					if(!this.conCargarFormDetalle) {
						transaccionlocalBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					transaccionlocalBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoTributarioForeignKey(tipotributario,1,false,true,true);
					transaccionlocalBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					transaccionlocalBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoTributario");
					transaccionlocalBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoTributario");
					transaccionlocalBeanSwingJInternalFrame.inicializarActualizarBindingTablaTransaccionLocal(true);
					transaccionlocalBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesTransaccionLocal("n",transaccionlocalBeanSwingJInternalFrame.isGuardarCambiosEnLote, transaccionlocalBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					transaccionlocalBeanSwingJInternalFrame.setAutoscrolls(true);
					transaccionlocalBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						transaccionlocalBeanSwingJInternalFrame.actualizarEstadoPanelsTransaccionLocal("relacionado");
					} else {
						transaccionlocalBeanSwingJInternalFrame.actualizarEstadoPanelsTransaccionLocal("no_relacionado");
					}

					transaccionlocalBeanSwingJInternalFrame.getjButtonRecargarInformacionTransaccionLocal().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarFacturaProveedorServicioBeanSwingJInternalFrame(List<TipoTributario> tipotributarios,TipoTributario tipotributario,FacturaProveedorServicioBeanSwingJInternalFrame facturaproveedorservicioBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//facturaproveedorservicioBeanSwingJInternalFrame=new FacturaProveedorServicioBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					facturaproveedorservicioBeanSwingJInternalFrame.getFacturaProveedorServicioLogic().setConnexion(this.tipotributarioLogic.getConnexion());

					facturaproveedorservicioBeanSwingJInternalFrame.settipotributariosForeignKey(tipotributarios);
					facturaproveedorservicioBeanSwingJInternalFrame.settipotributarioForeignKey(tipotributario);
					facturaproveedorservicioBeanSwingJInternalFrame.facturaproveedorservicioSessionBean.setisBusquedaDesdeForeignKeySesionTipoTributario(true);
					facturaproveedorservicioBeanSwingJInternalFrame.facturaproveedorservicioSessionBean.setlidTipoTributarioActual(tipotributario.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					facturaproveedorservicioBeanSwingJInternalFrame.cargarCombosForeignKeyFacturaProveedorServicio(facturaproveedorservicioBeanSwingJInternalFrame.isCargarCombosDependencia);
					facturaproveedorservicioBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoTributario(true);
					facturaproveedorservicioBeanSwingJInternalFrame.setid_tipo_tributarioFK_IdTipoTributario(tipotributario.getId());

					if(!this.conCargarFormDetalle) {
						facturaproveedorservicioBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					facturaproveedorservicioBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoTributarioForeignKey(tipotributario,1,false,true,true);
					facturaproveedorservicioBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					facturaproveedorservicioBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoTributario");
					facturaproveedorservicioBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoTributario");
					facturaproveedorservicioBeanSwingJInternalFrame.inicializarActualizarBindingTablaFacturaProveedorServicio(true);
					facturaproveedorservicioBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesFacturaProveedorServicio("n",facturaproveedorservicioBeanSwingJInternalFrame.isGuardarCambiosEnLote, facturaproveedorservicioBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					facturaproveedorservicioBeanSwingJInternalFrame.setAutoscrolls(true);
					facturaproveedorservicioBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						facturaproveedorservicioBeanSwingJInternalFrame.actualizarEstadoPanelsFacturaProveedorServicio("relacionado");
					} else {
						facturaproveedorservicioBeanSwingJInternalFrame.actualizarEstadoPanelsFacturaProveedorServicio("no_relacionado");
					}

					facturaproveedorservicioBeanSwingJInternalFrame.getjButtonRecargarInformacionFacturaProveedorServicio().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarDefinicionBeanSwingJInternalFrame(List<TipoTributario> tipotributarios,TipoTributario tipotributario,DefinicionBeanSwingJInternalFrame definicionBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//definicionBeanSwingJInternalFrame=new DefinicionBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					definicionBeanSwingJInternalFrame.getDefinicionLogic().setConnexion(this.tipotributarioLogic.getConnexion());

					definicionBeanSwingJInternalFrame.settipotributariosForeignKey(tipotributarios);
					definicionBeanSwingJInternalFrame.settipotributarioForeignKey(tipotributario);
					definicionBeanSwingJInternalFrame.definicionSessionBean.setisBusquedaDesdeForeignKeySesionTipoTributario(true);
					definicionBeanSwingJInternalFrame.definicionSessionBean.setlidTipoTributarioActual(tipotributario.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					definicionBeanSwingJInternalFrame.cargarCombosForeignKeyDefinicion(definicionBeanSwingJInternalFrame.isCargarCombosDependencia);
					definicionBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoTributario(true);
					definicionBeanSwingJInternalFrame.setid_tipo_tributarioFK_IdTipoTributario(tipotributario.getId());

					if(!this.conCargarFormDetalle) {
						definicionBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					definicionBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoTributarioForeignKey(tipotributario,1,false,true,true);
					definicionBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					definicionBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoTributario");
					definicionBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoTributario");
					definicionBeanSwingJInternalFrame.inicializarActualizarBindingTablaDefinicion(true);
					definicionBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDefinicion("n",definicionBeanSwingJInternalFrame.isGuardarCambiosEnLote, definicionBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					definicionBeanSwingJInternalFrame.setAutoscrolls(true);
					definicionBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						definicionBeanSwingJInternalFrame.actualizarEstadoPanelsDefinicion("relacionado");
					} else {
						definicionBeanSwingJInternalFrame.actualizarEstadoPanelsDefinicion("no_relacionado");
					}

					definicionBeanSwingJInternalFrame.getjButtonRecargarInformacionDefinicion().setVisible(false);

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
