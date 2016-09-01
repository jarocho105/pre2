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
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.inventario.util.NovedadProductoConstantesFunciones;

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
public class NovedadProductoDetalleFormJInternalFrame extends NovedadProductoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleNovedadProducto;
	
	protected JMenuBar jmenuBarDetalleNovedadProducto;
	
	protected JMenu jmenuDetalleNovedadProducto;
	protected JMenu jmenuDetalleArchivoNovedadProducto;
	protected JMenu jmenuDetalleAccionesNovedadProducto;
	protected JMenu jmenuDetalleDatosNovedadProducto;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleNovedadProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutNovedadProducto;	
	protected GridBagConstraints gridBagConstraintsNovedadProducto;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected NovedadProductoBeanSwingJInternalFrameAdditional jInternalFrameDetalleNovedadProducto;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public NovedadProductoSessionBean novedadproductoSessionBean;
	
	

	public DetalleFacturaProveedorBeanSwingJInternalFrame detallefacturaproveedorBeanSwingJInternalFrame=null;
	public DetalleFacturaProveedorBeanSwingJInternalFrame detallefacturaproveedorBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDetalleFacturaProveedor=false;
	public DetalleFacturaProveedorSessionBean detallefacturaproveedorSessionBean;

	public NovedadSeguimientoBeanSwingJInternalFrame novedadseguimientoBeanSwingJInternalFrame=null;
	public NovedadSeguimientoBeanSwingJInternalFrame novedadseguimientoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteNovedadSeguimiento=false;
	public NovedadSeguimientoSessionBean novedadseguimientoSessionBean;

	public DetalleTransferenciaBeanSwingJInternalFrame detalletransferenciaBeanSwingJInternalFrame=null;
	public DetalleTransferenciaBeanSwingJInternalFrame detalletransferenciaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDetalleTransferencia=false;
	public DetalleTransferenciaSessionBean detalletransferenciaSessionBean;

	public DetalleMovimientoInventarioBeanSwingJInternalFrame detallemovimientoinventarioBeanSwingJInternalFrame=null;
	public DetalleMovimientoInventarioBeanSwingJInternalFrame detallemovimientoinventarioBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDetalleMovimientoInventario=false;
	public DetalleMovimientoInventarioSessionBean detallemovimientoinventarioSessionBean;

	public DetalleOrdenCompraBeanSwingJInternalFrame detalleordencompraBeanSwingJInternalFrame=null;
	public DetalleOrdenCompraBeanSwingJInternalFrame detalleordencompraBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDetalleOrdenCompra=false;
	public DetalleOrdenCompraSessionBean detalleordencompraSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public NovedadProductoLogic novedadproductoLogic;
	
	public JScrollPane jScrollPanelDatosNovedadProducto;
	public JScrollPane jScrollPanelDatosEdicionNovedadProducto;
	public JScrollPane jScrollPanelDatosGeneralNovedadProducto;
	
	protected JPanel jPanelCamposNovedadProducto;    
	protected JPanel jPanelCamposOcultosNovedadProducto;    	
	protected JPanel jPanelAccionesNovedadProducto;
	protected JPanel jPanelAccionesFormularioNovedadProducto;
    
	
	
	protected Integer iXPanelCamposNovedadProducto=0;
	protected Integer iYPanelCamposNovedadProducto=0;
	
	protected Integer iXPanelCamposOcultosNovedadProducto=0;
	protected Integer iYPanelCamposOcultosNovedadProducto=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoNovedadProducto;
	public JButton jButtonModificarNovedadProducto;
	public JButton jButtonActualizarNovedadProducto;
    public JButton jButtonEliminarNovedadProducto;
	public JButton jButtonCancelarNovedadProducto;
    public JButton jButtonGuardarCambiosNovedadProducto;
	public JButton jButtonGuardarCambiosTablaNovedadProducto;
	protected JButton jButtonCerrarNovedadProducto;
	
	
	protected JButton jButtonProcesarInformacionNovedadProducto;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoNovedadProducto;
	protected JCheckBox jCheckBoxPostAccionSinCerrarNovedadProducto;
	protected JCheckBox jCheckBoxPostAccionSinMensajeNovedadProducto;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarNovedadProducto;
	protected JButton jButtonModificarToolBarNovedadProducto;
	protected JButton jButtonActualizarToolBarNovedadProducto;
    protected JButton jButtonEliminarToolBarNovedadProducto;
	protected JButton jButtonCancelarToolBarNovedadProducto;
    protected JButton jButtonGuardarCambiosToolBarNovedadProducto;
	protected JButton jButtonGuardarCambiosTablaToolBarNovedadProducto;
	protected JButton jButtonMostrarOcultarTablaToolBarNovedadProducto;
	protected JButton jButtonCerrarToolBarNovedadProducto;
	
	protected JButton jButtonProcesarInformacionToolBarNovedadProducto;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoNovedadProducto;
	protected JMenuItem jMenuItemModificarNovedadProducto;
	protected JMenuItem jMenuItemActualizarNovedadProducto;
    protected JMenuItem jMenuItemEliminarNovedadProducto;
	protected JMenuItem jMenuItemCancelarNovedadProducto;
    protected JMenuItem jMenuItemGuardarCambiosNovedadProducto;
	protected JMenuItem jMenuItemGuardarCambiosTablaNovedadProducto;
	protected JMenuItem jMenuItemCerrarNovedadProducto;
	protected JMenuItem jMenuItemDetalleCerrarNovedadProducto;
	protected JMenuItem jMenuItemDetalleMostarOcultarNovedadProducto;
	
	protected JMenuItem jMenuItemProcesarInformacionNovedadProducto;
	protected JMenuItem jMenuItemNuevoGuardarCambiosNovedadProducto;
	protected JMenuItem jMenuItemMostrarOcultarNovedadProducto;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesNovedadProducto;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesNovedadProducto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesNovedadProducto;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioNovedadProducto;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidNovedadProducto;
	public JLabel jLabelIdNovedadProducto;
	public JLabel jLabelidNovedadProducto;
	public JButton jButtonidNovedadProductoBusqueda= new JButtonMe();

	public JPanel jPanelcodigoNovedadProducto;
	public JLabel jLabelcodigoNovedadProducto;
	public JTextField jTextFieldcodigoNovedadProducto;
	public JButton jButtoncodigoNovedadProductoBusqueda= new JButtonMe();

	public JPanel jPanelnombreNovedadProducto;
	public JLabel jLabelnombreNovedadProducto;
	public JTextField jTextFieldnombreNovedadProducto;
	public JButton jButtonnombreNovedadProductoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaNovedadProducto;
	public JLabel jLabelid_empresaNovedadProducto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaNovedadProducto;
	public JButton jButtonid_empresaNovedadProducto= new JButtonMe();
	public JButton jButtonid_empresaNovedadProductoUpdate= new JButtonMe();
	public JButton jButtonid_empresaNovedadProductoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesNovedadProducto;
	
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
	
	public NovedadProductoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposNovedadProducto=new JPanel();
				this.jPanelAccionesFormularioNovedadProducto=new JPanel();
				this.jmenuBarDetalleNovedadProducto=new JMenuBar();
				this.jTtoolBarDetalleNovedadProducto=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NovedadProductoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("NovedadProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public NovedadProductoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("NovedadProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NovedadProductoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("NovedadProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NovedadProductoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("NovedadProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NovedadProductoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("NovedadProducto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarNovedadProducto() {
		return this.jButtonActualizarToolBarNovedadProducto;
	}
	
	public JButton getjButtonEliminarToolBarNovedadProducto() {
		return this.jButtonEliminarToolBarNovedadProducto;
	}
	
	public JButton getjButtonCancelarToolBarNovedadProducto() {
		return this.jButtonCancelarToolBarNovedadProducto;
	}		
	
	public JButton getjButtonProcesarInformacionNovedadProducto() {
		return this.jButtonProcesarInformacionNovedadProducto;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionNovedadProducto)	{
		this.jButtonProcesarInformacionNovedadProducto = jButtonProcesarInformacionNovedadProducto;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesNovedadProducto() {
		return this.jComboBoxTiposAccionesNovedadProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesNovedadProducto(
			JComboBox jComboBoxTiposRelacionesNovedadProducto) {
		this.jComboBoxTiposRelacionesNovedadProducto = jComboBoxTiposRelacionesNovedadProducto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesNovedadProducto(
			JComboBox jComboBoxTiposAccionesNovedadProducto) {
		this.jComboBoxTiposAccionesNovedadProducto = jComboBoxTiposAccionesNovedadProducto;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioNovedadProducto() {
		return this.jComboBoxTiposAccionesFormularioNovedadProducto;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioNovedadProducto(
			JComboBox jComboBoxTiposAccionesFormularioNovedadProducto) {
		this.jComboBoxTiposAccionesFormularioNovedadProducto = jComboBoxTiposAccionesFormularioNovedadProducto;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.novedadproductoSessionBean=new NovedadProductoSessionBean();
		
		this.novedadproductoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.novedadproductoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.novedadproductoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.detallefacturaproveedorSessionBean=new DetalleFacturaProveedorSessionBean();
		//this.novedadseguimientoSessionBean=new NovedadSeguimientoSessionBean();
		//this.detalletransferenciaSessionBean=new DetalleTransferenciaSessionBean();
		//this.detallemovimientoinventarioSessionBean=new DetalleMovimientoInventarioSessionBean();
		//this.detalleordencompraSessionBean=new DetalleOrdenCompraSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		NovedadProductoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		NovedadProductoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		NovedadProductoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Novedad Producto MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.novedadproductoSessionBean.getEsGuardarRelacionado()) {
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
	
		NovedadProductoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleNovedadProducto= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarNovedadProducto=new JButtonMe();
				this.jButtonModificarToolBarNovedadProducto=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarNovedadProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarNovedadProducto,this.jTtoolBarDetalleNovedadProducto,
							"actualizar","actualizar","Actualizar"+" "+NovedadProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarNovedadProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarNovedadProducto,this.jTtoolBarDetalleNovedadProducto,
							"eliminar","eliminar","Eliminar"+" "+NovedadProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarNovedadProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarNovedadProducto,this.jTtoolBarDetalleNovedadProducto,
							"cancelar","cancelar","Cancelar"+" "+NovedadProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarNovedadProducto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarNovedadProducto,this.jTtoolBarDetalleNovedadProducto,
							"guardarcambios","guardarcambios","Guardar"+" "+NovedadProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarNovedadProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarNovedadProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarNovedadProducto,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleNovedadProducto=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleNovedadProducto=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoNovedadProducto=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesNovedadProducto=new JMenuMe("Acciones");
		this.jmenuDetalleDatosNovedadProducto=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoNovedadProducto= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoNovedadProducto.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoNovedadProducto,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoNovedadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarNovedadProducto= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarNovedadProducto.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarNovedadProducto,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarNovedadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarNovedadProducto= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarNovedadProducto.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarNovedadProducto,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarNovedadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarNovedadProducto= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarNovedadProducto.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarNovedadProducto,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarNovedadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarNovedadProducto= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarNovedadProducto.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarNovedadProducto,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarNovedadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosNovedadProducto= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosNovedadProducto.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosNovedadProducto,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosNovedadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarNovedadProducto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarNovedadProducto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarNovedadProducto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarNovedadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarNovedadProducto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarNovedadProducto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarNovedadProducto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarNovedadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarNovedadProducto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarNovedadProducto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarNovedadProducto,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarNovedadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarNovedadProducto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarNovedadProducto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarNovedadProducto,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarNovedadProducto, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoNovedadProducto.add(this.jMenuItemDetalleCerrarNovedadProducto);
		
		this.jmenuDetalleAccionesNovedadProducto.add(this.jMenuItemActualizarNovedadProducto);
		this.jmenuDetalleAccionesNovedadProducto.add(this.jMenuItemEliminarNovedadProducto);
		this.jmenuDetalleAccionesNovedadProducto.add(this.jMenuItemCancelarNovedadProducto);		
		
		//this.jmenuDetalleDatosNovedadProducto.add(this.jMenuItemDetalleAbrirOrderByNovedadProducto);				
		this.jmenuDetalleDatosNovedadProducto.add(this.jMenuItemDetalleMostarOcultarNovedadProducto);				
				
		//this.jmenuDetalleAccionesNovedadProducto.add(this.jMenuItemGuardarCambiosNovedadProducto);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoNovedadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesNovedadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosNovedadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleNovedadProducto.add(this.jmenuDetalleArchivoNovedadProducto);		
		this.jmenuBarDetalleNovedadProducto.add(this.jmenuDetalleAccionesNovedadProducto);		
		this.jmenuBarDetalleNovedadProducto.add(this.jmenuDetalleDatosNovedadProducto);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleNovedadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleNovedadProducto.add(this.jmenuDetalleNovedadProducto);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleNovedadProducto);				
	}
	
	
	public void inicializarElementosCamposNovedadProducto() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdNovedadProducto = new JLabelMe();
		jLabelIdNovedadProducto.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdNovedadProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdNovedadProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdNovedadProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdNovedadProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidNovedadProducto = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidNovedadProducto.setToolTipText(NovedadProductoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutNovedadProducto= new GridBagLayout();

		this.jPanelidNovedadProducto.setLayout(this.gridaBagLayoutNovedadProducto);

		jLabelidNovedadProducto = new JLabel();
		jLabelidNovedadProducto.setText("Id");

		jLabelidNovedadProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidNovedadProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidNovedadProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoNovedadProducto = new JLabelMe();
		this.jLabelcodigoNovedadProducto.setText(""+NovedadProductoConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoNovedadProducto.setToolTipText("Codigo");
		this.jLabelcodigoNovedadProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoNovedadProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoNovedadProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoNovedadProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoNovedadProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoNovedadProducto.setToolTipText(NovedadProductoConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutNovedadProducto = new GridBagLayout();
		this.jPanelcodigoNovedadProducto.setLayout(this.gridaBagLayoutNovedadProducto);


		jTextFieldcodigoNovedadProducto= new JTextFieldMe();

		jTextFieldcodigoNovedadProducto.setEnabled(false);
		jTextFieldcodigoNovedadProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoNovedadProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoNovedadProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoNovedadProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoNovedadProductoBusqueda= new JButtonMe();
		this.jButtoncodigoNovedadProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoNovedadProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoNovedadProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoNovedadProductoBusqueda.setText("U");
		this.jButtoncodigoNovedadProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoNovedadProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoNovedadProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoNovedadProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoNovedadProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoNovedadProductoBusqueda"));

		if(this.novedadproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoNovedadProductoBusqueda.setVisible(false);		}


					
		this.jLabelnombreNovedadProducto = new JLabelMe();
		this.jLabelnombreNovedadProducto.setText(""+NovedadProductoConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreNovedadProducto.setToolTipText("Nombre");
		this.jLabelnombreNovedadProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreNovedadProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreNovedadProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreNovedadProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreNovedadProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreNovedadProducto.setToolTipText(NovedadProductoConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutNovedadProducto = new GridBagLayout();
		this.jPanelnombreNovedadProducto.setLayout(this.gridaBagLayoutNovedadProducto);


		jTextFieldnombreNovedadProducto= new JTextFieldMe();

		jTextFieldnombreNovedadProducto.setEnabled(false);
		jTextFieldnombreNovedadProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreNovedadProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreNovedadProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombreNovedadProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombreNovedadProductoBusqueda= new JButtonMe();
		this.jButtonnombreNovedadProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreNovedadProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreNovedadProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreNovedadProductoBusqueda.setText("U");
		this.jButtonnombreNovedadProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreNovedadProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreNovedadProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombreNovedadProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombreNovedadProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreNovedadProductoBusqueda"));

		if(this.novedadproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreNovedadProductoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysNovedadProducto() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaNovedadProducto = new JLabelMe();
		this.jLabelid_empresaNovedadProducto.setText(""+NovedadProductoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaNovedadProducto.setToolTipText("Empresa");
		this.jLabelid_empresaNovedadProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaNovedadProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaNovedadProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaNovedadProducto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaNovedadProducto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaNovedadProducto.setToolTipText(NovedadProductoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutNovedadProducto = new GridBagLayout();
		this.jPanelid_empresaNovedadProducto.setLayout(this.gridaBagLayoutNovedadProducto);


		jComboBoxid_empresaNovedadProducto= new JComboBoxMe();
		jComboBoxid_empresaNovedadProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaNovedadProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaNovedadProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaNovedadProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaNovedadProducto.setEnabled(false);

		this.jButtonid_empresaNovedadProducto= new JButtonMe();
		this.jButtonid_empresaNovedadProducto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaNovedadProducto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaNovedadProducto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaNovedadProducto.setText("Buscar");
		this.jButtonid_empresaNovedadProducto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaNovedadProducto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaNovedadProducto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaNovedadProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaNovedadProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaNovedadProducto"));

		this.jButtonid_empresaNovedadProductoBusqueda= new JButtonMe();
		this.jButtonid_empresaNovedadProductoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaNovedadProductoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaNovedadProductoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaNovedadProductoBusqueda.setText("U");
		this.jButtonid_empresaNovedadProductoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaNovedadProductoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaNovedadProductoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaNovedadProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaNovedadProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaNovedadProductoBusqueda"));

		if(this.novedadproductoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaNovedadProductoBusqueda.setVisible(false);		}

		this.jButtonid_empresaNovedadProductoUpdate= new JButtonMe();
		this.jButtonid_empresaNovedadProductoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaNovedadProductoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaNovedadProductoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaNovedadProductoUpdate.setText("U");
		this.jButtonid_empresaNovedadProductoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaNovedadProductoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaNovedadProductoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaNovedadProducto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaNovedadProducto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaNovedadProductoUpdate"));



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
		//this.jInternalFrameDetalleNovedadProducto = new NovedadProductoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Novedad Producto DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutNovedadProducto= new GridBagLayout();
		

		
		String sToolTipNovedadProducto="";
		sToolTipNovedadProducto=NovedadProductoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipNovedadProducto+="(Inventario.NovedadProducto)";
		}
		
		if(!this.novedadproductoSessionBean.getEsGuardarRelacionado()) {
			sToolTipNovedadProducto+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoNovedadProducto = new JButtonMe();
		this.jButtonModificarNovedadProducto = new JButtonMe();
        this.jButtonActualizarNovedadProducto = new JButtonMe();
        this.jButtonEliminarNovedadProducto = new JButtonMe();
        this.jButtonCancelarNovedadProducto = new JButtonMe();
        this.jButtonGuardarCambiosNovedadProducto = new JButtonMe();
		this.jButtonGuardarCambiosTablaNovedadProducto = new JButtonMe();
		this.jButtonCerrarNovedadProducto = new JButtonMe();
		
		this.jScrollPanelDatosNovedadProducto = new JScrollPane();   
        this.jScrollPanelDatosEdicionNovedadProducto = new JScrollPane();
		this.jScrollPanelDatosGeneralNovedadProducto = new JScrollPane();
				
		
		
		this.jPanelCamposNovedadProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosNovedadProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesNovedadProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioNovedadProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Novedad Producto";
		
		if(!this.novedadproductoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosNovedadProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Novedad Productoes" + this.sPath));
		} else {
			this.jScrollPanelDatosNovedadProducto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionNovedadProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralNovedadProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposNovedadProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposNovedadProducto.setName("jPanelCamposNovedadProducto"); 

		this.jPanelCamposOcultosNovedadProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosNovedadProducto.setName("jPanelCamposOcultosNovedadProducto"); 

        this.jPanelAccionesNovedadProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesNovedadProducto.setToolTipText("Acciones");
        this.jPanelAccionesNovedadProducto.setName("Acciones"); 

		this.jPanelAccionesFormularioNovedadProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioNovedadProducto.setToolTipText("Acciones");
        this.jPanelAccionesFormularioNovedadProducto.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionNovedadProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralNovedadProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosNovedadProducto, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposNovedadProducto, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosNovedadProducto, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioNovedadProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoNovedadProducto.setText("Nuevo");
		this.jButtonModificarNovedadProducto.setText("Editar");
        this.jButtonActualizarNovedadProducto.setText("Actualizar");
        this.jButtonEliminarNovedadProducto.setText("Eliminar");
        this.jButtonCancelarNovedadProducto.setText("Cancelar");
        this.jButtonGuardarCambiosNovedadProducto.setText("Guardar");
		this.jButtonGuardarCambiosTablaNovedadProducto.setText("Guardar");
		this.jButtonCerrarNovedadProducto.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoNovedadProducto,"nuevo_button","Nuevo",this.novedadproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarNovedadProducto,"modificar_button","Editar",this.novedadproductoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarNovedadProducto,"actualizar_button","Actualizar",this.novedadproductoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarNovedadProducto,"eliminar_button","Eliminar",this.novedadproductoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarNovedadProducto,"cancelar_button","Cancelar",this.novedadproductoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosNovedadProducto,"guardarcambios_button","Guardar",this.novedadproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaNovedadProducto,"guardarcambiostabla_button","Guardar",this.novedadproductoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarNovedadProducto,"cerrar_button","Salir",this.novedadproductoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoNovedadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarNovedadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosNovedadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaNovedadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarNovedadProducto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarNovedadProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarNovedadProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarNovedadProducto, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoNovedadProducto.setToolTipText("Nuevo"+" "+NovedadProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarNovedadProducto.setToolTipText("Editar"+" "+NovedadProductoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarNovedadProducto.setToolTipText("Actualizar"+" "+NovedadProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarNovedadProducto.setToolTipText("Eliminar)"+" "+NovedadProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarNovedadProducto.setToolTipText("Cancelar"+" "+NovedadProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosNovedadProducto.setToolTipText("Guardar"+" "+NovedadProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaNovedadProducto.setToolTipText("Guardar"+" "+NovedadProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarNovedadProducto.setToolTipText("Salir"+" "+NovedadProductoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoNovedadProducto";
		inputMap = this.jButtonNuevoNovedadProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoNovedadProducto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoNovedadProducto"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarNovedadProducto";
		inputMap = this.jButtonActualizarNovedadProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarNovedadProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarNovedadProducto"));
		
		//ELIMINAR
		sMapKey = "EliminarNovedadProducto";
		inputMap = this.jButtonEliminarNovedadProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarNovedadProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarNovedadProducto"));
		
		//CANCELAR	
		sMapKey = "CancelarNovedadProducto";
		inputMap = this.jButtonCancelarNovedadProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarNovedadProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarNovedadProducto"));
		
		//CERRAR		
		sMapKey = "CerrarNovedadProducto";
		inputMap = this.jButtonCerrarNovedadProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarNovedadProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarNovedadProducto"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaNovedadProducto";
		inputMap = this.jButtonGuardarCambiosTablaNovedadProducto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaNovedadProducto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaNovedadProducto"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoNovedadProducto = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoNovedadProducto.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoNovedadProducto.setToolTipText("Nuevo NovedadProducto");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoNovedadProducto, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarNovedadProducto = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarNovedadProducto.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarNovedadProducto.setToolTipText("Sin Cerrar Ventana NovedadProducto");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarNovedadProducto, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeNovedadProducto = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeNovedadProducto.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeNovedadProducto.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeNovedadProducto, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesNovedadProducto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesNovedadProducto.setText("Accion");
		this.jComboBoxTiposAccionesNovedadProducto.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioNovedadProducto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioNovedadProducto.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioNovedadProducto.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesNovedadProducto = new JLabelMe();
		
		this.jLabelAccionesNovedadProducto.setText("Acciones");		
		this.jLabelAccionesNovedadProducto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesNovedadProducto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesNovedadProducto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposNovedadProducto();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysNovedadProducto();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesNovedadProducto=new JTabbedPane();
		this.jTabbedPaneRelacionesNovedadProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesNovedadProducto,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesNovedadProducto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesNovedadProducto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesNovedadProducto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesNovedadProducto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioNovedadProducto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioNovedadProducto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioNovedadProducto.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioNovedadProducto, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposNovedadProducto = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosNovedadProducto = new GridBagLayout();
		
		this.jPanelCamposNovedadProducto.setLayout(gridaBagLayoutCamposNovedadProducto);
		this.jPanelCamposOcultosNovedadProducto.setLayout(gridaBagLayoutCamposOcultosNovedadProducto);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
	this.gridBagConstraintsNovedadProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNovedadProducto.gridy = 0;
	this.gridBagConstraintsNovedadProducto.gridx = 0;
	this.gridBagConstraintsNovedadProducto.ipadx = 0;
	this.gridBagConstraintsNovedadProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidNovedadProducto.add(jLabelIdNovedadProducto, this.gridBagConstraintsNovedadProducto);



	this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
	this.gridBagConstraintsNovedadProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNovedadProducto.gridy = 0;
	this.gridBagConstraintsNovedadProducto.gridx = 1;
	this.gridBagConstraintsNovedadProducto.ipadx = 0;
	this.gridBagConstraintsNovedadProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidNovedadProducto.add(jLabelidNovedadProducto, this.gridBagConstraintsNovedadProducto);


	this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
	this.gridBagConstraintsNovedadProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNovedadProducto.gridy = 0;
	this.gridBagConstraintsNovedadProducto.gridx = 0;
	this.gridBagConstraintsNovedadProducto.ipadx = 0;
	this.gridBagConstraintsNovedadProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaNovedadProducto.add(jLabelid_empresaNovedadProducto, this.gridBagConstraintsNovedadProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
		//this.gridBagConstraintsNovedadProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNovedadProducto.gridy = 0;
		this.gridBagConstraintsNovedadProducto.gridx = 2;
		this.gridBagConstraintsNovedadProducto.ipadx = 0;
		this.gridBagConstraintsNovedadProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaNovedadProducto.add(jButtonid_empresaNovedadProductoBusqueda, this.gridBagConstraintsNovedadProducto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
		//this.gridBagConstraintsNovedadProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNovedadProducto.gridy = 0;
		this.gridBagConstraintsNovedadProducto.gridx = 3;
		this.gridBagConstraintsNovedadProducto.ipadx = 0;
		this.gridBagConstraintsNovedadProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaNovedadProducto.add(jButtonid_empresaNovedadProductoUpdate, this.gridBagConstraintsNovedadProducto);
	}

	this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
	this.gridBagConstraintsNovedadProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNovedadProducto.gridy = 0;
	this.gridBagConstraintsNovedadProducto.gridx = 1;
	this.gridBagConstraintsNovedadProducto.ipadx = 0;
	this.gridBagConstraintsNovedadProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaNovedadProducto.add(jComboBoxid_empresaNovedadProducto, this.gridBagConstraintsNovedadProducto);


	this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
	this.gridBagConstraintsNovedadProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNovedadProducto.gridy = 0;
	this.gridBagConstraintsNovedadProducto.gridx = 0;
	this.gridBagConstraintsNovedadProducto.ipadx = 0;
	this.gridBagConstraintsNovedadProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoNovedadProducto.add(jLabelcodigoNovedadProducto, this.gridBagConstraintsNovedadProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
		//this.gridBagConstraintsNovedadProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNovedadProducto.gridy = 0;
		this.gridBagConstraintsNovedadProducto.gridx = 2;
		this.gridBagConstraintsNovedadProducto.ipadx = 0;
		this.gridBagConstraintsNovedadProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoNovedadProducto.add(jButtoncodigoNovedadProductoBusqueda, this.gridBagConstraintsNovedadProducto);
	}

	this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
	this.gridBagConstraintsNovedadProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNovedadProducto.gridy = 0;
	this.gridBagConstraintsNovedadProducto.gridx = 1;
	this.gridBagConstraintsNovedadProducto.ipadx = 0;
	this.gridBagConstraintsNovedadProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoNovedadProducto.add(jTextFieldcodigoNovedadProducto, this.gridBagConstraintsNovedadProducto);


	this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
	this.gridBagConstraintsNovedadProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNovedadProducto.gridy = 0;
	this.gridBagConstraintsNovedadProducto.gridx = 0;
	this.gridBagConstraintsNovedadProducto.ipadx = 0;
	this.gridBagConstraintsNovedadProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreNovedadProducto.add(jLabelnombreNovedadProducto, this.gridBagConstraintsNovedadProducto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
		//this.gridBagConstraintsNovedadProducto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNovedadProducto.gridy = 0;
		this.gridBagConstraintsNovedadProducto.gridx = 2;
		this.gridBagConstraintsNovedadProducto.ipadx = 0;
		this.gridBagConstraintsNovedadProducto.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreNovedadProducto.add(jButtonnombreNovedadProductoBusqueda, this.gridBagConstraintsNovedadProducto);
	}

	this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
	this.gridBagConstraintsNovedadProducto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNovedadProducto.gridy = 0;
	this.gridBagConstraintsNovedadProducto.gridx = 1;
	this.gridBagConstraintsNovedadProducto.ipadx = 0;
	this.gridBagConstraintsNovedadProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreNovedadProducto.add(jTextFieldnombreNovedadProducto, this.gridBagConstraintsNovedadProducto);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
	this.gridBagConstraintsNovedadProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNovedadProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNovedadProducto.gridy = iYPanelCamposNovedadProducto;
	this.gridBagConstraintsNovedadProducto.gridx = iXPanelCamposNovedadProducto++;
	this.gridBagConstraintsNovedadProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNovedadProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNovedadProducto.add(this.jPanelidNovedadProducto, this.gridBagConstraintsNovedadProducto);



	if(iXPanelCamposNovedadProducto % 1==0) {
		iXPanelCamposNovedadProducto=0;
		iYPanelCamposNovedadProducto++;
	}
	this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
	this.gridBagConstraintsNovedadProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNovedadProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNovedadProducto.gridy = iYPanelCamposNovedadProducto;
	this.gridBagConstraintsNovedadProducto.gridx = iXPanelCamposNovedadProducto++;
	this.gridBagConstraintsNovedadProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNovedadProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNovedadProducto.add(this.jPanelcodigoNovedadProducto, this.gridBagConstraintsNovedadProducto);



	if(iXPanelCamposNovedadProducto % 1==0) {
		iXPanelCamposNovedadProducto=0;
		iYPanelCamposNovedadProducto++;
	}
	this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
	this.gridBagConstraintsNovedadProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNovedadProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNovedadProducto.gridy = iYPanelCamposNovedadProducto;
	this.gridBagConstraintsNovedadProducto.gridx = iXPanelCamposNovedadProducto++;
	this.gridBagConstraintsNovedadProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNovedadProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNovedadProducto.add(this.jPanelnombreNovedadProducto, this.gridBagConstraintsNovedadProducto);



	if(iXPanelCamposNovedadProducto % 1==0) {
		iXPanelCamposNovedadProducto=0;
		iYPanelCamposNovedadProducto++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
	this.gridBagConstraintsNovedadProducto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNovedadProducto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNovedadProducto.gridy = iYPanelCamposOcultosNovedadProducto;
	this.gridBagConstraintsNovedadProducto.gridx = iXPanelCamposOcultosNovedadProducto++;
	this.gridBagConstraintsNovedadProducto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNovedadProducto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosNovedadProducto.add(this.jPanelid_empresaNovedadProducto, this.gridBagConstraintsNovedadProducto);



	if(iXPanelCamposOcultosNovedadProducto % 1==0) {
		iXPanelCamposOcultosNovedadProducto=0;
		iYPanelCamposOcultosNovedadProducto++;
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
			
		GridBagLayout gridaBagLayoutAccionesNovedadProducto= new GridBagLayout();
		this.jPanelAccionesNovedadProducto.setLayout(gridaBagLayoutAccionesNovedadProducto);
		
		GridBagLayout gridaBagLayoutAccionesFormularioNovedadProducto= new GridBagLayout();
		this.jPanelAccionesFormularioNovedadProducto.setLayout(gridaBagLayoutAccionesFormularioNovedadProducto);
		
		this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
		this.gridBagConstraintsNovedadProducto.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsNovedadProducto.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioNovedadProducto.add(this.jComboBoxTiposAccionesFormularioNovedadProducto, this.gridBagConstraintsNovedadProducto);

		this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
		this.gridBagConstraintsNovedadProducto.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsNovedadProducto.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioNovedadProducto.add(this.jCheckBoxPostAccionNuevoNovedadProducto, this.gridBagConstraintsNovedadProducto);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.novedadproductoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
			this.gridBagConstraintsNovedadProducto.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsNovedadProducto.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioNovedadProducto.add(this.jCheckBoxPostAccionSinCerrarNovedadProducto, this.gridBagConstraintsNovedadProducto);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.novedadproductoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.novedadproductoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
			this.gridBagConstraintsNovedadProducto.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsNovedadProducto.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioNovedadProducto.add(this.jCheckBoxPostAccionSinMensajeNovedadProducto, this.gridBagConstraintsNovedadProducto);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
		this.gridBagConstraintsNovedadProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNovedadProducto.gridy = 0;
		this.gridBagConstraintsNovedadProducto.gridx = iPosXAccion++;
			
		this.jPanelAccionesNovedadProducto.add(this.jButtonModificarNovedadProducto, this.gridBagConstraintsNovedadProducto);							

		this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
		this.gridBagConstraintsNovedadProducto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNovedadProducto.gridy = 0;
		this.gridBagConstraintsNovedadProducto.gridx =iPosXAccion++;
			
		this.jPanelAccionesNovedadProducto.add(this.jButtonEliminarNovedadProducto, this.gridBagConstraintsNovedadProducto);
		
			
		this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
		this.gridBagConstraintsNovedadProducto.gridy = 0;		
		this.gridBagConstraintsNovedadProducto.gridx = iPosXAccion++;
		
		this.jPanelAccionesNovedadProducto.add(this.jButtonActualizarNovedadProducto, this.gridBagConstraintsNovedadProducto);


		this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
		this.gridBagConstraintsNovedadProducto.gridy = 0;		
		this.gridBagConstraintsNovedadProducto.gridx = iPosXAccion++;
		
		this.jPanelAccionesNovedadProducto.add(this.jButtonGuardarCambiosNovedadProducto, this.gridBagConstraintsNovedadProducto);	
		
		this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
		this.gridBagConstraintsNovedadProducto.gridy = 0;		
		this.gridBagConstraintsNovedadProducto.gridx =iPosXAccion++;
		
		this.jPanelAccionesNovedadProducto.add(this.jButtonCancelarNovedadProducto, this.gridBagConstraintsNovedadProducto);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutNovedadProducto = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutNovedadProducto);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.novedadproductoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsNovedadProducto = new GridBagConstraints();						
			this.gridBagConstraintsNovedadProducto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsNovedadProducto.gridx = 0;		
			//this.gridBagConstraintsNovedadProducto.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNovedadProducto.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsNovedadProducto.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
		this.gridBagConstraintsNovedadProducto.gridy =iGridyPrincipal++;
		this.gridBagConstraintsNovedadProducto.gridx =0;
		this.gridBagConstraintsNovedadProducto.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsNovedadProducto.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosNovedadProducto, this.gridBagConstraintsNovedadProducto);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(NovedadProductoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleNovedadProducto = new NovedadProductoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Novedad Producto DATOS");
			
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
			
	        //this.setTitle("[FOR] - Novedad Producto DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Novedad Producto Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			NovedadProductoModel novedadproductoModel=new NovedadProductoModel(this);
			
			//SI USARA CLASE INTERNA
			//NovedadProductoModel.NovedadProductoFocusTraversalPolicy novedadproductoFocusTraversalPolicy = novedadproductoModel.new NovedadProductoFocusTraversalPolicy(this);
			
			//novedadproductoFocusTraversalPolicy.setnovedadproductoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(novedadproductoModel);
			
			
			this.jContentPaneDetalleNovedadProducto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleNovedadProducto = new GridBagLayout();	
			this.jContentPaneDetalleNovedadProducto.setLayout(gridaBagLayoutDetalleNovedadProducto);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosNovedadProducto = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
				this.gridBagConstraintsNovedadProducto.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsNovedadProducto.gridx = 0;
					
				
				this.jContentPaneDetalleNovedadProducto.add(jTtoolBarDetalleNovedadProducto, gridBagConstraintsNovedadProducto);								
				
}
			
			this.jScrollPanelDatosEdicionNovedadProducto=   new JScrollPane(jContentPaneDetalleNovedadProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionNovedadProducto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionNovedadProducto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionNovedadProducto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralNovedadProducto=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralNovedadProducto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralNovedadProducto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralNovedadProducto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
			
			
	        this.gridBagConstraintsNovedadProducto.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsNovedadProducto.gridx = 0;
	        
			this.jContentPaneDetalleNovedadProducto.add(jPanelCamposNovedadProducto, gridBagConstraintsNovedadProducto);
			
			
			
			
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
						&& novedadproductoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameDetalleFacturaProveedor(this.puedeCargarPorParteDetalleFacturaProveedor,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameDetalleMovimientoInventario(this.puedeCargarPorParteDetalleMovimientoInventario,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameDetalleOrdenCompra(this.puedeCargarPorParteDetalleOrdenCompra,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameDetalleTransferencia(this.puedeCargarPorParteDetalleTransferencia,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameNovedadSeguimiento(this.puedeCargarPorParteNovedadSeguimiento,false,-1);
					
					if(this.novedadproductoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsNovedadProducto= new GridBagConstraints();
						this.gridBagConstraintsNovedadProducto.gridy = iGridyRelaciones++;
						this.gridBagConstraintsNovedadProducto.gridx = 0;
						this.jContentPaneDetalleNovedadProducto.add(this.jTabbedPaneRelacionesNovedadProducto, this.gridBagConstraintsNovedadProducto);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesNovedadProducto.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameDetalleFacturaProveedor(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameDetalleMovimientoInventario(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameDetalleOrdenCompra(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameDetalleTransferencia(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameNovedadSeguimiento(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosNovedadProducto.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
					this.gridBagConstraintsNovedadProducto.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsNovedadProducto.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsNovedadProducto.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsNovedadProducto.gridx = 0;
					
				
					this.jContentPaneDetalleNovedadProducto.add(jPanelCamposOcultosNovedadProducto, gridBagConstraintsNovedadProducto);
				
					this.jPanelCamposOcultosNovedadProducto.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
			this.gridBagConstraintsNovedadProducto.gridy = iGridyRelaciones++;//16;		
	        this.gridBagConstraintsNovedadProducto.gridx = 0;
	        this.gridBagConstraintsNovedadProducto.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleNovedadProducto.add(this.jPanelAccionesFormularioNovedadProducto, this.gridBagConstraintsNovedadProducto);							
			
			
			
			this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
	        this.gridBagConstraintsNovedadProducto.gridy = iGridyRelaciones;//16;		
	        this.gridBagConstraintsNovedadProducto.gridx = 0;
	        
			
			this.jContentPaneDetalleNovedadProducto.add(this.jPanelAccionesNovedadProducto, this.gridBagConstraintsNovedadProducto);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionNovedadProducto);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionNovedadProducto=   new JScrollPane(this.jPanelCamposNovedadProducto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionNovedadProducto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionNovedadProducto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionNovedadProducto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
			this.gridBagConstraintsNovedadProducto.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsNovedadProducto.gridx = 0;
			this.gridBagConstraintsNovedadProducto.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsNovedadProducto.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsNovedadProducto.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionNovedadProducto, this.gridBagConstraintsNovedadProducto);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
			this.gridBagConstraintsNovedadProducto.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsNovedadProducto.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioNovedadProducto, this.gridBagConstraintsNovedadProducto);			
			
			this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
			this.gridBagConstraintsNovedadProducto.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsNovedadProducto.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesNovedadProducto, this.gridBagConstraintsNovedadProducto);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
		this.gridBagConstraintsNovedadProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNovedadProducto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposNovedadProducto, this.gridBagConstraintsNovedadProducto);
			
			
		this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
		this.gridBagConstraintsNovedadProducto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNovedadProducto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosNovedadProducto, this.gridBagConstraintsNovedadProducto);
		
			
		this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
		this.gridBagConstraintsNovedadProducto.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsNovedadProducto.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesNovedadProducto, this.gridBagConstraintsNovedadProducto);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralNovedadProducto;//jContentPane;
		
		return jScrollPanelDatosEdicionNovedadProducto;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameDetalleFacturaProveedor(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.detallefacturaproveedorSessionBean=new DetalleFacturaProveedorSessionBean();
		this.detallefacturaproveedorSessionBean.setConGuardarRelaciones(false);
		this.detallefacturaproveedorSessionBean.setEsGuardarRelacionado(true);

		this.detallefacturaproveedorBeanSwingJInternalFrame=null;//new DetalleFacturaProveedorBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.detallefacturaproveedorBeanSwingJInternalFramePopup=new DetalleFacturaProveedorBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.detallefacturaproveedorBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.detallefacturaproveedorSessionBean.getEsGuardarRelacionado()) {

				DetalleFacturaProveedorJInternalFrame.STIPO_TAMANIO_GENERAL=NovedadProductoJInternalFrame.STIPO_TAMANIO_GENERAL;
				DetalleFacturaProveedorJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=NovedadProductoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.detallefacturaproveedorSessionBean.setEsGuardarRelacionado(true);

				this.detallefacturaproveedorBeanSwingJInternalFrame=new DetalleFacturaProveedorBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.detallefacturaproveedorBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.detallefacturaproveedorBeanSwingJInternalFrame.setdetallefacturaproveedorSessionBean(this.detallefacturaproveedorSessionBean);

				//this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
				//this.gridBagConstraintsNovedadProducto.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsNovedadProducto.gridx = 0;
				//this.jContentPaneDetalleNovedadProducto.add(this.detallefacturaproveedorBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsNovedadProducto);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesNovedadProducto.add("Detalle Factura Proveedores",this.detallefacturaproveedorBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesNovedadProducto.setComponentAt(iIndexTab,this.detallefacturaproveedorBeanSwingJInternalFrame.getContentPane());
				}

				//DetalleFacturaProveedorJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.detallefacturaproveedorSessionBean.setEsGuardarRelacionado(false);
				this.detallefacturaproveedorBeanSwingJInternalFrame=null;//new DetalleFacturaProveedorBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.detallefacturaproveedorSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDetalleFacturaProveedor) {
					this.jTabbedPaneRelacionesNovedadProducto.add("Detalle Factura Proveedores",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameDetalleMovimientoInventario(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.detallemovimientoinventarioSessionBean=new DetalleMovimientoInventarioSessionBean();
		this.detallemovimientoinventarioSessionBean.setConGuardarRelaciones(false);
		this.detallemovimientoinventarioSessionBean.setEsGuardarRelacionado(true);

		this.detallemovimientoinventarioBeanSwingJInternalFrame=null;//new DetalleMovimientoInventarioBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.detallemovimientoinventarioBeanSwingJInternalFramePopup=new DetalleMovimientoInventarioBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.detallemovimientoinventarioBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.detallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {

				DetalleMovimientoInventarioJInternalFrame.STIPO_TAMANIO_GENERAL=NovedadProductoJInternalFrame.STIPO_TAMANIO_GENERAL;
				DetalleMovimientoInventarioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=NovedadProductoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.detallemovimientoinventarioSessionBean.setEsGuardarRelacionado(true);

				this.detallemovimientoinventarioBeanSwingJInternalFrame=new DetalleMovimientoInventarioBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.detallemovimientoinventarioBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.detallemovimientoinventarioBeanSwingJInternalFrame.setdetallemovimientoinventarioSessionBean(this.detallemovimientoinventarioSessionBean);

				//this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
				//this.gridBagConstraintsNovedadProducto.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsNovedadProducto.gridx = 0;
				//this.jContentPaneDetalleNovedadProducto.add(this.detallemovimientoinventarioBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsNovedadProducto);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesNovedadProducto.add("Detalle Movimiento Inventarios",this.detallemovimientoinventarioBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesNovedadProducto.setComponentAt(iIndexTab,this.detallemovimientoinventarioBeanSwingJInternalFrame.getContentPane());
				}

				//DetalleMovimientoInventarioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.detallemovimientoinventarioSessionBean.setEsGuardarRelacionado(false);
				this.detallemovimientoinventarioBeanSwingJInternalFrame=null;//new DetalleMovimientoInventarioBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.detallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDetalleMovimientoInventario) {
					this.jTabbedPaneRelacionesNovedadProducto.add("Detalle Movimiento Inventarios",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameDetalleOrdenCompra(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.detalleordencompraSessionBean=new DetalleOrdenCompraSessionBean();
		this.detalleordencompraSessionBean.setConGuardarRelaciones(false);
		this.detalleordencompraSessionBean.setEsGuardarRelacionado(true);

		this.detalleordencompraBeanSwingJInternalFrame=null;//new DetalleOrdenCompraBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.detalleordencompraBeanSwingJInternalFramePopup=new DetalleOrdenCompraBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.detalleordencompraBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.detalleordencompraSessionBean.getEsGuardarRelacionado()) {

				DetalleOrdenCompraJInternalFrame.STIPO_TAMANIO_GENERAL=NovedadProductoJInternalFrame.STIPO_TAMANIO_GENERAL;
				DetalleOrdenCompraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=NovedadProductoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.detalleordencompraSessionBean.setEsGuardarRelacionado(true);

				this.detalleordencompraBeanSwingJInternalFrame=new DetalleOrdenCompraBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.detalleordencompraBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.detalleordencompraBeanSwingJInternalFrame.setdetalleordencompraSessionBean(this.detalleordencompraSessionBean);

				//this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
				//this.gridBagConstraintsNovedadProducto.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsNovedadProducto.gridx = 0;
				//this.jContentPaneDetalleNovedadProducto.add(this.detalleordencompraBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsNovedadProducto);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesNovedadProducto.add("Detalle Orden Compras",this.detalleordencompraBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesNovedadProducto.setComponentAt(iIndexTab,this.detalleordencompraBeanSwingJInternalFrame.getContentPane());
				}

				//DetalleOrdenCompraJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.detalleordencompraSessionBean.setEsGuardarRelacionado(false);
				this.detalleordencompraBeanSwingJInternalFrame=null;//new DetalleOrdenCompraBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.detalleordencompraSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDetalleOrdenCompra) {
					this.jTabbedPaneRelacionesNovedadProducto.add("Detalle Orden Compras",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameDetalleTransferencia(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.detalletransferenciaSessionBean=new DetalleTransferenciaSessionBean();
		this.detalletransferenciaSessionBean.setConGuardarRelaciones(false);
		this.detalletransferenciaSessionBean.setEsGuardarRelacionado(true);

		this.detalletransferenciaBeanSwingJInternalFrame=null;//new DetalleTransferenciaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.detalletransferenciaBeanSwingJInternalFramePopup=new DetalleTransferenciaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.detalletransferenciaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.detalletransferenciaSessionBean.getEsGuardarRelacionado()) {

				DetalleTransferenciaJInternalFrame.STIPO_TAMANIO_GENERAL=NovedadProductoJInternalFrame.STIPO_TAMANIO_GENERAL;
				DetalleTransferenciaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=NovedadProductoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.detalletransferenciaSessionBean.setEsGuardarRelacionado(true);

				this.detalletransferenciaBeanSwingJInternalFrame=new DetalleTransferenciaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.detalletransferenciaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.detalletransferenciaBeanSwingJInternalFrame.setdetalletransferenciaSessionBean(this.detalletransferenciaSessionBean);

				//this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
				//this.gridBagConstraintsNovedadProducto.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsNovedadProducto.gridx = 0;
				//this.jContentPaneDetalleNovedadProducto.add(this.detalletransferenciaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsNovedadProducto);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesNovedadProducto.add("Detalle Transferencias",this.detalletransferenciaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesNovedadProducto.setComponentAt(iIndexTab,this.detalletransferenciaBeanSwingJInternalFrame.getContentPane());
				}

				//DetalleTransferenciaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.detalletransferenciaSessionBean.setEsGuardarRelacionado(false);
				this.detalletransferenciaBeanSwingJInternalFrame=null;//new DetalleTransferenciaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.detalletransferenciaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDetalleTransferencia) {
					this.jTabbedPaneRelacionesNovedadProducto.add("Detalle Transferencias",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameNovedadSeguimiento(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.novedadseguimientoSessionBean=new NovedadSeguimientoSessionBean();
		this.novedadseguimientoSessionBean.setConGuardarRelaciones(false);
		this.novedadseguimientoSessionBean.setEsGuardarRelacionado(true);

		this.novedadseguimientoBeanSwingJInternalFrame=null;//new NovedadSeguimientoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.novedadseguimientoBeanSwingJInternalFramePopup=new NovedadSeguimientoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.novedadseguimientoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.novedadseguimientoSessionBean.getEsGuardarRelacionado()) {

				NovedadSeguimientoJInternalFrame.STIPO_TAMANIO_GENERAL=NovedadProductoJInternalFrame.STIPO_TAMANIO_GENERAL;
				NovedadSeguimientoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=NovedadProductoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.novedadseguimientoSessionBean.setEsGuardarRelacionado(true);

				this.novedadseguimientoBeanSwingJInternalFrame=new NovedadSeguimientoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.novedadseguimientoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.novedadseguimientoBeanSwingJInternalFrame.setnovedadseguimientoSessionBean(this.novedadseguimientoSessionBean);

				//this.gridBagConstraintsNovedadProducto = new GridBagConstraints();
				//this.gridBagConstraintsNovedadProducto.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsNovedadProducto.gridx = 0;
				//this.jContentPaneDetalleNovedadProducto.add(this.novedadseguimientoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsNovedadProducto);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesNovedadProducto.add("Novedad Seguimientoes",this.novedadseguimientoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesNovedadProducto.setComponentAt(iIndexTab,this.novedadseguimientoBeanSwingJInternalFrame.getContentPane());
				}

				//NovedadSeguimientoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.novedadseguimientoSessionBean.setEsGuardarRelacionado(false);
				this.novedadseguimientoBeanSwingJInternalFrame=null;//new NovedadSeguimientoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.novedadseguimientoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteNovedadSeguimiento) {
					this.jTabbedPaneRelacionesNovedadProducto.add("Novedad Seguimientoes",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarDetalleFacturaProveedorBeanSwingJInternalFrame(List<NovedadProducto> novedadproductos,NovedadProducto novedadproducto,DetalleFacturaProveedorBeanSwingJInternalFrame detallefacturaproveedorBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//detallefacturaproveedorBeanSwingJInternalFrame=new DetalleFacturaProveedorBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					detallefacturaproveedorBeanSwingJInternalFrame.getDetalleFacturaProveedorLogic().setConnexion(this.novedadproductoLogic.getConnexion());

					detallefacturaproveedorBeanSwingJInternalFrame.setnovedadproductosForeignKey(novedadproductos);
					detallefacturaproveedorBeanSwingJInternalFrame.setnovedadproductoForeignKey(novedadproducto);
					detallefacturaproveedorBeanSwingJInternalFrame.detallefacturaproveedorSessionBean.setisBusquedaDesdeForeignKeySesionNovedadProducto(true);
					detallefacturaproveedorBeanSwingJInternalFrame.detallefacturaproveedorSessionBean.setlidNovedadProductoActual(novedadproducto.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					detallefacturaproveedorBeanSwingJInternalFrame.cargarCombosForeignKeyDetalleFacturaProveedor(detallefacturaproveedorBeanSwingJInternalFrame.isCargarCombosDependencia);
					detallefacturaproveedorBeanSwingJInternalFrame.setVisibilidadBusquedasParaNovedadProducto(true);
					detallefacturaproveedorBeanSwingJInternalFrame.setid_novedad_productoFK_IdNovedadProducto(novedadproducto.getId());

					if(!this.conCargarFormDetalle) {
						detallefacturaproveedorBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					detallefacturaproveedorBeanSwingJInternalFrame.setSelectedItemCombosFrameNovedadProductoForeignKey(novedadproducto,1,false,true,true);
					detallefacturaproveedorBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					detallefacturaproveedorBeanSwingJInternalFrame.procesarBusqueda("FK_IdNovedadProducto");
					detallefacturaproveedorBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdNovedadProducto");
					detallefacturaproveedorBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleFacturaProveedor(true);
					detallefacturaproveedorBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDetalleFacturaProveedor("n",detallefacturaproveedorBeanSwingJInternalFrame.isGuardarCambiosEnLote, detallefacturaproveedorBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					detallefacturaproveedorBeanSwingJInternalFrame.setAutoscrolls(true);
					detallefacturaproveedorBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						detallefacturaproveedorBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleFacturaProveedor("relacionado");
					} else {
						detallefacturaproveedorBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleFacturaProveedor("no_relacionado");
					}

					detallefacturaproveedorBeanSwingJInternalFrame.getjButtonRecargarInformacionDetalleFacturaProveedor().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarNovedadSeguimientoBeanSwingJInternalFrame(List<NovedadProducto> novedadproductos,NovedadProducto novedadproducto,NovedadSeguimientoBeanSwingJInternalFrame novedadseguimientoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//novedadseguimientoBeanSwingJInternalFrame=new NovedadSeguimientoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					novedadseguimientoBeanSwingJInternalFrame.getNovedadSeguimientoLogic().setConnexion(this.novedadproductoLogic.getConnexion());

					novedadseguimientoBeanSwingJInternalFrame.setnovedadproductosForeignKey(novedadproductos);
					novedadseguimientoBeanSwingJInternalFrame.setnovedadproductoForeignKey(novedadproducto);
					novedadseguimientoBeanSwingJInternalFrame.novedadseguimientoSessionBean.setisBusquedaDesdeForeignKeySesionNovedadProducto(true);
					novedadseguimientoBeanSwingJInternalFrame.novedadseguimientoSessionBean.setlidNovedadProductoActual(novedadproducto.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					novedadseguimientoBeanSwingJInternalFrame.cargarCombosForeignKeyNovedadSeguimiento(novedadseguimientoBeanSwingJInternalFrame.isCargarCombosDependencia);
					novedadseguimientoBeanSwingJInternalFrame.setVisibilidadBusquedasParaNovedadProducto(true);
					novedadseguimientoBeanSwingJInternalFrame.setid_novedad_productoFK_IdNovedadProducto(novedadproducto.getId());

					if(!this.conCargarFormDetalle) {
						novedadseguimientoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					novedadseguimientoBeanSwingJInternalFrame.setSelectedItemCombosFrameNovedadProductoForeignKey(novedadproducto,1,false,true,true);
					novedadseguimientoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					novedadseguimientoBeanSwingJInternalFrame.procesarBusqueda("FK_IdNovedadProducto");
					novedadseguimientoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdNovedadProducto");
					novedadseguimientoBeanSwingJInternalFrame.inicializarActualizarBindingTablaNovedadSeguimiento(true);
					novedadseguimientoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesNovedadSeguimiento("n",novedadseguimientoBeanSwingJInternalFrame.isGuardarCambiosEnLote, novedadseguimientoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					novedadseguimientoBeanSwingJInternalFrame.setAutoscrolls(true);
					novedadseguimientoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						novedadseguimientoBeanSwingJInternalFrame.actualizarEstadoPanelsNovedadSeguimiento("relacionado");
					} else {
						novedadseguimientoBeanSwingJInternalFrame.actualizarEstadoPanelsNovedadSeguimiento("no_relacionado");
					}

					novedadseguimientoBeanSwingJInternalFrame.getjButtonRecargarInformacionNovedadSeguimiento().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarDetalleTransferenciaBeanSwingJInternalFrame(List<NovedadProducto> novedadproductos,NovedadProducto novedadproducto,DetalleTransferenciaBeanSwingJInternalFrame detalletransferenciaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//detalletransferenciaBeanSwingJInternalFrame=new DetalleTransferenciaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					detalletransferenciaBeanSwingJInternalFrame.getDetalleTransferenciaLogic().setConnexion(this.novedadproductoLogic.getConnexion());

					detalletransferenciaBeanSwingJInternalFrame.setnovedadproductosForeignKey(novedadproductos);
					detalletransferenciaBeanSwingJInternalFrame.setnovedadproductoForeignKey(novedadproducto);
					detalletransferenciaBeanSwingJInternalFrame.detalletransferenciaSessionBean.setisBusquedaDesdeForeignKeySesionNovedadProducto(true);
					detalletransferenciaBeanSwingJInternalFrame.detalletransferenciaSessionBean.setlidNovedadProductoActual(novedadproducto.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					detalletransferenciaBeanSwingJInternalFrame.cargarCombosForeignKeyDetalleTransferencia(detalletransferenciaBeanSwingJInternalFrame.isCargarCombosDependencia);
					detalletransferenciaBeanSwingJInternalFrame.setVisibilidadBusquedasParaNovedadProducto(true);
					detalletransferenciaBeanSwingJInternalFrame.setid_novedad_productoFK_IdNovedadProducto(novedadproducto.getId());

					if(!this.conCargarFormDetalle) {
						detalletransferenciaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					detalletransferenciaBeanSwingJInternalFrame.setSelectedItemCombosFrameNovedadProductoForeignKey(novedadproducto,1,false,true,true);
					detalletransferenciaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					detalletransferenciaBeanSwingJInternalFrame.procesarBusqueda("FK_IdNovedadProducto");
					detalletransferenciaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdNovedadProducto");
					detalletransferenciaBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleTransferencia(true);
					detalletransferenciaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDetalleTransferencia("n",detalletransferenciaBeanSwingJInternalFrame.isGuardarCambiosEnLote, detalletransferenciaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					detalletransferenciaBeanSwingJInternalFrame.setAutoscrolls(true);
					detalletransferenciaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						detalletransferenciaBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleTransferencia("relacionado");
					} else {
						detalletransferenciaBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleTransferencia("no_relacionado");
					}

					detalletransferenciaBeanSwingJInternalFrame.getjButtonRecargarInformacionDetalleTransferencia().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarDetalleMovimientoInventarioBeanSwingJInternalFrame(List<NovedadProducto> novedadproductos,NovedadProducto novedadproducto,DetalleMovimientoInventarioBeanSwingJInternalFrame detallemovimientoinventarioBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//detallemovimientoinventarioBeanSwingJInternalFrame=new DetalleMovimientoInventarioBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					detallemovimientoinventarioBeanSwingJInternalFrame.getDetalleMovimientoInventarioLogic().setConnexion(this.novedadproductoLogic.getConnexion());

					detallemovimientoinventarioBeanSwingJInternalFrame.setnovedadproductosForeignKey(novedadproductos);
					detallemovimientoinventarioBeanSwingJInternalFrame.setnovedadproductoForeignKey(novedadproducto);
					detallemovimientoinventarioBeanSwingJInternalFrame.detallemovimientoinventarioSessionBean.setisBusquedaDesdeForeignKeySesionNovedadProducto(true);
					detallemovimientoinventarioBeanSwingJInternalFrame.detallemovimientoinventarioSessionBean.setlidNovedadProductoActual(novedadproducto.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					detallemovimientoinventarioBeanSwingJInternalFrame.cargarCombosForeignKeyDetalleMovimientoInventario(detallemovimientoinventarioBeanSwingJInternalFrame.isCargarCombosDependencia);
					detallemovimientoinventarioBeanSwingJInternalFrame.setVisibilidadBusquedasParaNovedadProducto(true);
					detallemovimientoinventarioBeanSwingJInternalFrame.setid_novedad_productoFK_IdNovedadProducto(novedadproducto.getId());

					if(!this.conCargarFormDetalle) {
						detallemovimientoinventarioBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					detallemovimientoinventarioBeanSwingJInternalFrame.setSelectedItemCombosFrameNovedadProductoForeignKey(novedadproducto,1,false,true,true);
					detallemovimientoinventarioBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					detallemovimientoinventarioBeanSwingJInternalFrame.procesarBusqueda("FK_IdNovedadProducto");
					detallemovimientoinventarioBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdNovedadProducto");
					detallemovimientoinventarioBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleMovimientoInventario(true);
					detallemovimientoinventarioBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDetalleMovimientoInventario("n",detallemovimientoinventarioBeanSwingJInternalFrame.isGuardarCambiosEnLote, detallemovimientoinventarioBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					detallemovimientoinventarioBeanSwingJInternalFrame.setAutoscrolls(true);
					detallemovimientoinventarioBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						detallemovimientoinventarioBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleMovimientoInventario("relacionado");
					} else {
						detallemovimientoinventarioBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleMovimientoInventario("no_relacionado");
					}

					detallemovimientoinventarioBeanSwingJInternalFrame.getjButtonRecargarInformacionDetalleMovimientoInventario().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarDetalleOrdenCompraBeanSwingJInternalFrame(List<NovedadProducto> novedadproductos,NovedadProducto novedadproducto,DetalleOrdenCompraBeanSwingJInternalFrame detalleordencompraBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//detalleordencompraBeanSwingJInternalFrame=new DetalleOrdenCompraBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					detalleordencompraBeanSwingJInternalFrame.getDetalleOrdenCompraLogic().setConnexion(this.novedadproductoLogic.getConnexion());

					detalleordencompraBeanSwingJInternalFrame.setnovedadproductosForeignKey(novedadproductos);
					detalleordencompraBeanSwingJInternalFrame.setnovedadproductoForeignKey(novedadproducto);
					detalleordencompraBeanSwingJInternalFrame.detalleordencompraSessionBean.setisBusquedaDesdeForeignKeySesionNovedadProducto(true);
					detalleordencompraBeanSwingJInternalFrame.detalleordencompraSessionBean.setlidNovedadProductoActual(novedadproducto.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					detalleordencompraBeanSwingJInternalFrame.cargarCombosForeignKeyDetalleOrdenCompra(detalleordencompraBeanSwingJInternalFrame.isCargarCombosDependencia);
					detalleordencompraBeanSwingJInternalFrame.setVisibilidadBusquedasParaNovedadProducto(true);
					detalleordencompraBeanSwingJInternalFrame.setid_novedad_productoFK_IdNovedadProducto(novedadproducto.getId());

					if(!this.conCargarFormDetalle) {
						detalleordencompraBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					detalleordencompraBeanSwingJInternalFrame.setSelectedItemCombosFrameNovedadProductoForeignKey(novedadproducto,1,false,true,true);
					detalleordencompraBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					detalleordencompraBeanSwingJInternalFrame.procesarBusqueda("FK_IdNovedadProducto");
					detalleordencompraBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdNovedadProducto");
					detalleordencompraBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleOrdenCompra(true);
					detalleordencompraBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDetalleOrdenCompra("n",detalleordencompraBeanSwingJInternalFrame.isGuardarCambiosEnLote, detalleordencompraBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					detalleordencompraBeanSwingJInternalFrame.setAutoscrolls(true);
					detalleordencompraBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						detalleordencompraBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleOrdenCompra("relacionado");
					} else {
						detalleordencompraBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleOrdenCompra("no_relacionado");
					}

					detalleordencompraBeanSwingJInternalFrame.getjButtonRecargarInformacionDetalleOrdenCompra().setVisible(false);

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
