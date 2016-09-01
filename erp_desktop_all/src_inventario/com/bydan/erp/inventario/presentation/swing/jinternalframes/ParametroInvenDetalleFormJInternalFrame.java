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

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.inventario.util.ParametroInvenConstantesFunciones;

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
public class ParametroInvenDetalleFormJInternalFrame extends ParametroInvenBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleParametroInven;
	
	protected JMenuBar jmenuBarDetalleParametroInven;
	
	protected JMenu jmenuDetalleParametroInven;
	protected JMenu jmenuDetalleArchivoParametroInven;
	protected JMenu jmenuDetalleAccionesParametroInven;
	protected JMenu jmenuDetalleDatosParametroInven;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleParametroInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutParametroInven;	
	protected GridBagConstraints gridBagConstraintsParametroInven;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ParametroInvenBeanSwingJInternalFrameAdditional jInternalFrameDetalleParametroInven;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public ParametroInvenSessionBean parametroinvenSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public ParametroInvenLogic parametroinvenLogic;
	
	public JScrollPane jScrollPanelDatosParametroInven;
	public JScrollPane jScrollPanelDatosEdicionParametroInven;
	public JScrollPane jScrollPanelDatosGeneralParametroInven;
	
	protected JPanel jPanelCamposParametroInven;    
	protected JPanel jPanelCamposOcultosParametroInven;    	
	protected JPanel jPanelAccionesParametroInven;
	protected JPanel jPanelAccionesFormularioParametroInven;
    
	
	
	protected Integer iXPanelCamposParametroInven=0;
	protected Integer iYPanelCamposParametroInven=0;
	
	protected Integer iXPanelCamposOcultosParametroInven=0;
	protected Integer iYPanelCamposOcultosParametroInven=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoParametroInven;
	public JButton jButtonModificarParametroInven;
	public JButton jButtonActualizarParametroInven;
    public JButton jButtonEliminarParametroInven;
	public JButton jButtonCancelarParametroInven;
    public JButton jButtonGuardarCambiosParametroInven;
	public JButton jButtonGuardarCambiosTablaParametroInven;
	protected JButton jButtonCerrarParametroInven;
	
	
	protected JButton jButtonProcesarInformacionParametroInven;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoParametroInven;
	protected JCheckBox jCheckBoxPostAccionSinCerrarParametroInven;
	protected JCheckBox jCheckBoxPostAccionSinMensajeParametroInven;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarParametroInven;
	protected JButton jButtonModificarToolBarParametroInven;
	protected JButton jButtonActualizarToolBarParametroInven;
    protected JButton jButtonEliminarToolBarParametroInven;
	protected JButton jButtonCancelarToolBarParametroInven;
    protected JButton jButtonGuardarCambiosToolBarParametroInven;
	protected JButton jButtonGuardarCambiosTablaToolBarParametroInven;
	protected JButton jButtonMostrarOcultarTablaToolBarParametroInven;
	protected JButton jButtonCerrarToolBarParametroInven;
	
	protected JButton jButtonProcesarInformacionToolBarParametroInven;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoParametroInven;
	protected JMenuItem jMenuItemModificarParametroInven;
	protected JMenuItem jMenuItemActualizarParametroInven;
    protected JMenuItem jMenuItemEliminarParametroInven;
	protected JMenuItem jMenuItemCancelarParametroInven;
    protected JMenuItem jMenuItemGuardarCambiosParametroInven;
	protected JMenuItem jMenuItemGuardarCambiosTablaParametroInven;
	protected JMenuItem jMenuItemCerrarParametroInven;
	protected JMenuItem jMenuItemDetalleCerrarParametroInven;
	protected JMenuItem jMenuItemDetalleMostarOcultarParametroInven;
	
	protected JMenuItem jMenuItemProcesarInformacionParametroInven;
	protected JMenuItem jMenuItemNuevoGuardarCambiosParametroInven;
	protected JMenuItem jMenuItemMostrarOcultarParametroInven;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesParametroInven;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesParametroInven;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesParametroInven;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioParametroInven;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidParametroInven;
	public JLabel jLabelIdParametroInven;
	public JLabel jLabelidParametroInven;
	public JButton jButtonidParametroInvenBusqueda= new JButtonMe();

	public JPanel jPanelsecuencial_pedidoParametroInven;
	public JLabel jLabelsecuencial_pedidoParametroInven;
	public JTextField jTextFieldsecuencial_pedidoParametroInven;
	public JButton jButtonsecuencial_pedidoParametroInvenBusqueda= new JButtonMe();

	public JPanel jPanelnumero_serieParametroInven;
	public JLabel jLabelnumero_serieParametroInven;
	public JTextField jTextFieldnumero_serieParametroInven;
	public JButton jButtonnumero_serieParametroInvenBusqueda= new JButtonMe();

	public JPanel jPanelnumero_decimalesParametroInven;
	public JLabel jLabelnumero_decimalesParametroInven;
	public JTextField jTextFieldnumero_decimalesParametroInven;
	public JButton jButtonnumero_decimalesParametroInvenBusqueda= new JButtonMe();

	public JPanel jPanelnumero_items_requisicionParametroInven;
	public JLabel jLabelnumero_items_requisicionParametroInven;
	public JTextField jTextFieldnumero_items_requisicionParametroInven;
	public JButton jButtonnumero_items_requisicionParametroInvenBusqueda= new JButtonMe();

	public JPanel jPanelcon_cuenta_contableParametroInven;
	public JLabel jLabelcon_cuenta_contableParametroInven;
	public JCheckBox jCheckBoxcon_cuenta_contableParametroInven;
	public JButton jButtoncon_cuenta_contableParametroInvenBusqueda= new JButtonMe();

	public JPanel jPanelcon_cuenta_contable_lineaParametroInven;
	public JLabel jLabelcon_cuenta_contable_lineaParametroInven;
	public JCheckBox jCheckBoxcon_cuenta_contable_lineaParametroInven;
	public JButton jButtoncon_cuenta_contable_lineaParametroInvenBusqueda= new JButtonMe();

	public JPanel jPanelcon_cuenta_bancoParametroInven;
	public JLabel jLabelcon_cuenta_bancoParametroInven;
	public JCheckBox jCheckBoxcon_cuenta_bancoParametroInven;
	public JButton jButtoncon_cuenta_bancoParametroInvenBusqueda= new JButtonMe();

	public JPanel jPanelcon_copiar_productoParametroInven;
	public JLabel jLabelcon_copiar_productoParametroInven;
	public JCheckBox jCheckBoxcon_copiar_productoParametroInven;
	public JButton jButtoncon_copiar_productoParametroInvenBusqueda= new JButtonMe();

	public JPanel jPanelcon_crear_producto_sucursalParametroInven;
	public JLabel jLabelcon_crear_producto_sucursalParametroInven;
	public JCheckBox jCheckBoxcon_crear_producto_sucursalParametroInven;
	public JButton jButtoncon_crear_producto_sucursalParametroInvenBusqueda= new JButtonMe();

	public JPanel jPanelcon_crear_lista_precio_sucursal_bodegaParametroInven;
	public JLabel jLabelcon_crear_lista_precio_sucursal_bodegaParametroInven;
	public JCheckBox jCheckBoxcon_crear_lista_precio_sucursal_bodegaParametroInven;
	public JButton jButtoncon_crear_lista_precio_sucursal_bodegaParametroInvenBusqueda= new JButtonMe();

	public JPanel jPanelcon_compras_aprobacionParametroInven;
	public JLabel jLabelcon_compras_aprobacionParametroInven;
	public JCheckBox jCheckBoxcon_compras_aprobacionParametroInven;
	public JButton jButtoncon_compras_aprobacionParametroInvenBusqueda= new JButtonMe();

	public JPanel jPanelcon_envio_mailParametroInven;
	public JLabel jLabelcon_envio_mailParametroInven;
	public JCheckBox jCheckBoxcon_envio_mailParametroInven;
	public JButton jButtoncon_envio_mailParametroInvenBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaParametroInven;
	public JLabel jLabelid_empresaParametroInven;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaParametroInven;
	public JButton jButtonid_empresaParametroInven= new JButtonMe();
	public JButton jButtonid_empresaParametroInvenUpdate= new JButtonMe();
	public JButton jButtonid_empresaParametroInvenBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesParametroInven;
	
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
	public int iHeightFormulario=682;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ParametroInvenDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposParametroInven=new JPanel();
				this.jPanelAccionesFormularioParametroInven=new JPanel();
				this.jmenuBarDetalleParametroInven=new JMenuBar();
				this.jTtoolBarDetalleParametroInven=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroInvenDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ParametroInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ParametroInvenDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ParametroInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroInvenDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroInvenDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroInvenDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ParametroInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarParametroInven() {
		return this.jButtonActualizarToolBarParametroInven;
	}
	
	public JButton getjButtonEliminarToolBarParametroInven() {
		return this.jButtonEliminarToolBarParametroInven;
	}
	
	public JButton getjButtonCancelarToolBarParametroInven() {
		return this.jButtonCancelarToolBarParametroInven;
	}		
	
	public JButton getjButtonProcesarInformacionParametroInven() {
		return this.jButtonProcesarInformacionParametroInven;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionParametroInven)	{
		this.jButtonProcesarInformacionParametroInven = jButtonProcesarInformacionParametroInven;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesParametroInven() {
		return this.jComboBoxTiposAccionesParametroInven;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesParametroInven(
			JComboBox jComboBoxTiposRelacionesParametroInven) {
		this.jComboBoxTiposRelacionesParametroInven = jComboBoxTiposRelacionesParametroInven;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesParametroInven(
			JComboBox jComboBoxTiposAccionesParametroInven) {
		this.jComboBoxTiposAccionesParametroInven = jComboBoxTiposAccionesParametroInven;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioParametroInven() {
		return this.jComboBoxTiposAccionesFormularioParametroInven;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioParametroInven(
			JComboBox jComboBoxTiposAccionesFormularioParametroInven) {
		this.jComboBoxTiposAccionesFormularioParametroInven = jComboBoxTiposAccionesFormularioParametroInven;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.parametroinvenSessionBean=new ParametroInvenSessionBean();
		
		this.parametroinvenSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.parametroinvenSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.parametroinvenSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ParametroInvenJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ParametroInvenJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ParametroInvenJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Parametro Inven MANTENIMIENTO"));
		
		
		if(iWidth > 1450) {
			iWidth=1450;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.parametroinvenSessionBean.getEsGuardarRelacionado()) {
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
	
		ParametroInvenJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleParametroInven= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarParametroInven=new JButtonMe();
				this.jButtonModificarToolBarParametroInven=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarParametroInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarParametroInven,this.jTtoolBarDetalleParametroInven,
							"actualizar","actualizar","Actualizar"+" "+ParametroInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarParametroInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarParametroInven,this.jTtoolBarDetalleParametroInven,
							"eliminar","eliminar","Eliminar"+" "+ParametroInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarParametroInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarParametroInven,this.jTtoolBarDetalleParametroInven,
							"cancelar","cancelar","Cancelar"+" "+ParametroInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarParametroInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarParametroInven,this.jTtoolBarDetalleParametroInven,
							"guardarcambios","guardarcambios","Guardar"+" "+ParametroInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarParametroInven,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarParametroInven,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarParametroInven,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleParametroInven=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleParametroInven=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoParametroInven=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesParametroInven=new JMenuMe("Acciones");
		this.jmenuDetalleDatosParametroInven=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoParametroInven= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoParametroInven.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoParametroInven,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoParametroInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarParametroInven= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarParametroInven.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarParametroInven,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarParametroInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarParametroInven= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarParametroInven.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarParametroInven,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarParametroInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarParametroInven= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarParametroInven.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarParametroInven,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarParametroInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarParametroInven= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarParametroInven.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarParametroInven,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarParametroInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosParametroInven= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosParametroInven.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosParametroInven,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosParametroInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarParametroInven= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarParametroInven.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarParametroInven,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarParametroInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarParametroInven= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarParametroInven.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarParametroInven,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarParametroInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarParametroInven= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarParametroInven.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarParametroInven,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarParametroInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarParametroInven= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarParametroInven.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarParametroInven,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarParametroInven, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoParametroInven.add(this.jMenuItemDetalleCerrarParametroInven);
		
		this.jmenuDetalleAccionesParametroInven.add(this.jMenuItemActualizarParametroInven);
		this.jmenuDetalleAccionesParametroInven.add(this.jMenuItemEliminarParametroInven);
		this.jmenuDetalleAccionesParametroInven.add(this.jMenuItemCancelarParametroInven);		
		
		//this.jmenuDetalleDatosParametroInven.add(this.jMenuItemDetalleAbrirOrderByParametroInven);				
		this.jmenuDetalleDatosParametroInven.add(this.jMenuItemDetalleMostarOcultarParametroInven);				
				
		//this.jmenuDetalleAccionesParametroInven.add(this.jMenuItemGuardarCambiosParametroInven);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoParametroInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesParametroInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosParametroInven, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleParametroInven.add(this.jmenuDetalleArchivoParametroInven);		
		this.jmenuBarDetalleParametroInven.add(this.jmenuDetalleAccionesParametroInven);		
		this.jmenuBarDetalleParametroInven.add(this.jmenuDetalleDatosParametroInven);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleParametroInven);				
	}
	
	
	public void inicializarElementosCamposParametroInven() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdParametroInven = new JLabelMe();
		jLabelIdParametroInven.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdParametroInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdParametroInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdParametroInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdParametroInven,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidParametroInven = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidParametroInven.setToolTipText(ParametroInvenConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutParametroInven= new GridBagLayout();

		this.jPanelidParametroInven.setLayout(this.gridaBagLayoutParametroInven);

		jLabelidParametroInven = new JLabel();
		jLabelidParametroInven.setText("Id");

		jLabelidParametroInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidParametroInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidParametroInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelsecuencial_pedidoParametroInven = new JLabelMe();
		this.jLabelsecuencial_pedidoParametroInven.setText(""+ParametroInvenConstantesFunciones.LABEL_SECUENCIALPEDIDO+" : *");
		this.jLabelsecuencial_pedidoParametroInven.setToolTipText("Secuencial Pedido");
		this.jLabelsecuencial_pedidoParametroInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelsecuencial_pedidoParametroInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelsecuencial_pedidoParametroInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelsecuencial_pedidoParametroInven,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsecuencial_pedidoParametroInven=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsecuencial_pedidoParametroInven.setToolTipText(ParametroInvenConstantesFunciones.LABEL_SECUENCIALPEDIDO);
		this.gridaBagLayoutParametroInven = new GridBagLayout();
		this.jPanelsecuencial_pedidoParametroInven.setLayout(this.gridaBagLayoutParametroInven);


		jTextFieldsecuencial_pedidoParametroInven= new JTextFieldMe();
		jTextFieldsecuencial_pedidoParametroInven.setEnabled(false);
		jTextFieldsecuencial_pedidoParametroInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuencial_pedidoParametroInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuencial_pedidoParametroInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsecuencial_pedidoParametroInven,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldsecuencial_pedidoParametroInven.setText("0");

		this.jButtonsecuencial_pedidoParametroInvenBusqueda= new JButtonMe();
		this.jButtonsecuencial_pedidoParametroInvenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuencial_pedidoParametroInvenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuencial_pedidoParametroInvenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsecuencial_pedidoParametroInvenBusqueda.setText("U");
		this.jButtonsecuencial_pedidoParametroInvenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsecuencial_pedidoParametroInvenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsecuencial_pedidoParametroInvenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsecuencial_pedidoParametroInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsecuencial_pedidoParametroInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"secuencial_pedidoParametroInvenBusqueda"));

		if(this.parametroinvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsecuencial_pedidoParametroInvenBusqueda.setVisible(false);		}


					
		this.jLabelnumero_serieParametroInven = new JLabelMe();
		this.jLabelnumero_serieParametroInven.setText(""+ParametroInvenConstantesFunciones.LABEL_NUMEROSERIE+" : *");
		this.jLabelnumero_serieParametroInven.setToolTipText("No Serie");
		this.jLabelnumero_serieParametroInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_serieParametroInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_serieParametroInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_serieParametroInven,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_serieParametroInven=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_serieParametroInven.setToolTipText(ParametroInvenConstantesFunciones.LABEL_NUMEROSERIE);
		this.gridaBagLayoutParametroInven = new GridBagLayout();
		this.jPanelnumero_serieParametroInven.setLayout(this.gridaBagLayoutParametroInven);


		jTextFieldnumero_serieParametroInven= new JTextFieldMe();
		jTextFieldnumero_serieParametroInven.setEnabled(false);
		jTextFieldnumero_serieParametroInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_serieParametroInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_serieParametroInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_serieParametroInven,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_serieParametroInven.setText("0");

		this.jButtonnumero_serieParametroInvenBusqueda= new JButtonMe();
		this.jButtonnumero_serieParametroInvenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_serieParametroInvenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_serieParametroInvenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_serieParametroInvenBusqueda.setText("U");
		this.jButtonnumero_serieParametroInvenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_serieParametroInvenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_serieParametroInvenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_serieParametroInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_serieParametroInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_serieParametroInvenBusqueda"));

		if(this.parametroinvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_serieParametroInvenBusqueda.setVisible(false);		}


					
		this.jLabelnumero_decimalesParametroInven = new JLabelMe();
		this.jLabelnumero_decimalesParametroInven.setText(""+ParametroInvenConstantesFunciones.LABEL_NUMERODECIMALES+" : *");
		this.jLabelnumero_decimalesParametroInven.setToolTipText("No Decimales");
		this.jLabelnumero_decimalesParametroInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_decimalesParametroInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_decimalesParametroInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_decimalesParametroInven,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_decimalesParametroInven=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_decimalesParametroInven.setToolTipText(ParametroInvenConstantesFunciones.LABEL_NUMERODECIMALES);
		this.gridaBagLayoutParametroInven = new GridBagLayout();
		this.jPanelnumero_decimalesParametroInven.setLayout(this.gridaBagLayoutParametroInven);


		jTextFieldnumero_decimalesParametroInven= new JTextFieldMe();
		jTextFieldnumero_decimalesParametroInven.setEnabled(false);
		jTextFieldnumero_decimalesParametroInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_decimalesParametroInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_decimalesParametroInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_decimalesParametroInven,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_decimalesParametroInven.setText("0");

		this.jButtonnumero_decimalesParametroInvenBusqueda= new JButtonMe();
		this.jButtonnumero_decimalesParametroInvenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_decimalesParametroInvenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_decimalesParametroInvenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_decimalesParametroInvenBusqueda.setText("U");
		this.jButtonnumero_decimalesParametroInvenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_decimalesParametroInvenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_decimalesParametroInvenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_decimalesParametroInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_decimalesParametroInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_decimalesParametroInvenBusqueda"));

		if(this.parametroinvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_decimalesParametroInvenBusqueda.setVisible(false);		}


					
		this.jLabelnumero_items_requisicionParametroInven = new JLabelMe();
		this.jLabelnumero_items_requisicionParametroInven.setText(""+ParametroInvenConstantesFunciones.LABEL_NUMEROITEMSREQUISICION+" : *");
		this.jLabelnumero_items_requisicionParametroInven.setToolTipText("No Items Requisicion");
		this.jLabelnumero_items_requisicionParametroInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnumero_items_requisicionParametroInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnumero_items_requisicionParametroInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_items_requisicionParametroInven,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_items_requisicionParametroInven=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_items_requisicionParametroInven.setToolTipText(ParametroInvenConstantesFunciones.LABEL_NUMEROITEMSREQUISICION);
		this.gridaBagLayoutParametroInven = new GridBagLayout();
		this.jPanelnumero_items_requisicionParametroInven.setLayout(this.gridaBagLayoutParametroInven);


		jTextFieldnumero_items_requisicionParametroInven= new JTextFieldMe();
		jTextFieldnumero_items_requisicionParametroInven.setEnabled(false);
		jTextFieldnumero_items_requisicionParametroInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_items_requisicionParametroInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_items_requisicionParametroInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_items_requisicionParametroInven,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_items_requisicionParametroInven.setText("0");

		this.jButtonnumero_items_requisicionParametroInvenBusqueda= new JButtonMe();
		this.jButtonnumero_items_requisicionParametroInvenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_items_requisicionParametroInvenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_items_requisicionParametroInvenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_items_requisicionParametroInvenBusqueda.setText("U");
		this.jButtonnumero_items_requisicionParametroInvenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_items_requisicionParametroInvenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_items_requisicionParametroInvenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_items_requisicionParametroInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_items_requisicionParametroInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_items_requisicionParametroInvenBusqueda"));

		if(this.parametroinvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_items_requisicionParametroInvenBusqueda.setVisible(false);		}


					
		this.jLabelcon_cuenta_contableParametroInven = new JLabelMe();
		this.jLabelcon_cuenta_contableParametroInven.setText(""+ParametroInvenConstantesFunciones.LABEL_CONCUENTACONTABLE+" : *");
		this.jLabelcon_cuenta_contableParametroInven.setToolTipText("Con Cuenta Contable");
		this.jLabelcon_cuenta_contableParametroInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_cuenta_contableParametroInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_cuenta_contableParametroInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_cuenta_contableParametroInven,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_cuenta_contableParametroInven=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_cuenta_contableParametroInven.setToolTipText(ParametroInvenConstantesFunciones.LABEL_CONCUENTACONTABLE);
		this.gridaBagLayoutParametroInven = new GridBagLayout();
		this.jPanelcon_cuenta_contableParametroInven.setLayout(this.gridaBagLayoutParametroInven);


		jCheckBoxcon_cuenta_contableParametroInven= new JCheckBoxMe();
		jCheckBoxcon_cuenta_contableParametroInven.setEnabled(false);

		jCheckBoxcon_cuenta_contableParametroInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_cuenta_contableParametroInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_cuenta_contableParametroInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_cuenta_contableParametroInven,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_cuenta_contableParametroInvenBusqueda= new JButtonMe();
		this.jButtoncon_cuenta_contableParametroInvenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_cuenta_contableParametroInvenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_cuenta_contableParametroInvenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_cuenta_contableParametroInvenBusqueda.setText("U");
		this.jButtoncon_cuenta_contableParametroInvenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_cuenta_contableParametroInvenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_cuenta_contableParametroInvenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_cuenta_contableParametroInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_cuenta_contableParametroInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_cuenta_contableParametroInvenBusqueda"));

		if(this.parametroinvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_cuenta_contableParametroInvenBusqueda.setVisible(false);		}


					
		this.jLabelcon_cuenta_contable_lineaParametroInven = new JLabelMe();
		this.jLabelcon_cuenta_contable_lineaParametroInven.setText(""+ParametroInvenConstantesFunciones.LABEL_CONCUENTACONTABLELINEA+" : *");
		this.jLabelcon_cuenta_contable_lineaParametroInven.setToolTipText("Con Cuenta Contable Linea");
		this.jLabelcon_cuenta_contable_lineaParametroInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcon_cuenta_contable_lineaParametroInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcon_cuenta_contable_lineaParametroInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_cuenta_contable_lineaParametroInven,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_cuenta_contable_lineaParametroInven=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_cuenta_contable_lineaParametroInven.setToolTipText(ParametroInvenConstantesFunciones.LABEL_CONCUENTACONTABLELINEA);
		this.gridaBagLayoutParametroInven = new GridBagLayout();
		this.jPanelcon_cuenta_contable_lineaParametroInven.setLayout(this.gridaBagLayoutParametroInven);


		jCheckBoxcon_cuenta_contable_lineaParametroInven= new JCheckBoxMe();
		jCheckBoxcon_cuenta_contable_lineaParametroInven.setEnabled(false);

		jCheckBoxcon_cuenta_contable_lineaParametroInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_cuenta_contable_lineaParametroInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_cuenta_contable_lineaParametroInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_cuenta_contable_lineaParametroInven,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_cuenta_contable_lineaParametroInvenBusqueda= new JButtonMe();
		this.jButtoncon_cuenta_contable_lineaParametroInvenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_cuenta_contable_lineaParametroInvenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_cuenta_contable_lineaParametroInvenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_cuenta_contable_lineaParametroInvenBusqueda.setText("U");
		this.jButtoncon_cuenta_contable_lineaParametroInvenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_cuenta_contable_lineaParametroInvenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_cuenta_contable_lineaParametroInvenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_cuenta_contable_lineaParametroInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_cuenta_contable_lineaParametroInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_cuenta_contable_lineaParametroInvenBusqueda"));

		if(this.parametroinvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_cuenta_contable_lineaParametroInvenBusqueda.setVisible(false);		}


					
		this.jLabelcon_cuenta_bancoParametroInven = new JLabelMe();
		this.jLabelcon_cuenta_bancoParametroInven.setText(""+ParametroInvenConstantesFunciones.LABEL_CONCUENTABANCO+" : *");
		this.jLabelcon_cuenta_bancoParametroInven.setToolTipText("Con Cuenta Banco");
		this.jLabelcon_cuenta_bancoParametroInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_cuenta_bancoParametroInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_cuenta_bancoParametroInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_cuenta_bancoParametroInven,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_cuenta_bancoParametroInven=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_cuenta_bancoParametroInven.setToolTipText(ParametroInvenConstantesFunciones.LABEL_CONCUENTABANCO);
		this.gridaBagLayoutParametroInven = new GridBagLayout();
		this.jPanelcon_cuenta_bancoParametroInven.setLayout(this.gridaBagLayoutParametroInven);


		jCheckBoxcon_cuenta_bancoParametroInven= new JCheckBoxMe();
		jCheckBoxcon_cuenta_bancoParametroInven.setEnabled(false);

		jCheckBoxcon_cuenta_bancoParametroInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_cuenta_bancoParametroInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_cuenta_bancoParametroInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_cuenta_bancoParametroInven,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_cuenta_bancoParametroInvenBusqueda= new JButtonMe();
		this.jButtoncon_cuenta_bancoParametroInvenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_cuenta_bancoParametroInvenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_cuenta_bancoParametroInvenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_cuenta_bancoParametroInvenBusqueda.setText("U");
		this.jButtoncon_cuenta_bancoParametroInvenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_cuenta_bancoParametroInvenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_cuenta_bancoParametroInvenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_cuenta_bancoParametroInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_cuenta_bancoParametroInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_cuenta_bancoParametroInvenBusqueda"));

		if(this.parametroinvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_cuenta_bancoParametroInvenBusqueda.setVisible(false);		}


					
		this.jLabelcon_copiar_productoParametroInven = new JLabelMe();
		this.jLabelcon_copiar_productoParametroInven.setText(""+ParametroInvenConstantesFunciones.LABEL_CONCOPIARPRODUCTO+" : *");
		this.jLabelcon_copiar_productoParametroInven.setToolTipText("Copiar Producto");
		this.jLabelcon_copiar_productoParametroInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_copiar_productoParametroInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_copiar_productoParametroInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_copiar_productoParametroInven,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_copiar_productoParametroInven=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_copiar_productoParametroInven.setToolTipText(ParametroInvenConstantesFunciones.LABEL_CONCOPIARPRODUCTO);
		this.gridaBagLayoutParametroInven = new GridBagLayout();
		this.jPanelcon_copiar_productoParametroInven.setLayout(this.gridaBagLayoutParametroInven);


		jCheckBoxcon_copiar_productoParametroInven= new JCheckBoxMe();
		jCheckBoxcon_copiar_productoParametroInven.setEnabled(false);

		jCheckBoxcon_copiar_productoParametroInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_copiar_productoParametroInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_copiar_productoParametroInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_copiar_productoParametroInven,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_copiar_productoParametroInvenBusqueda= new JButtonMe();
		this.jButtoncon_copiar_productoParametroInvenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_copiar_productoParametroInvenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_copiar_productoParametroInvenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_copiar_productoParametroInvenBusqueda.setText("U");
		this.jButtoncon_copiar_productoParametroInvenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_copiar_productoParametroInvenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_copiar_productoParametroInvenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_copiar_productoParametroInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_copiar_productoParametroInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_copiar_productoParametroInvenBusqueda"));

		if(this.parametroinvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_copiar_productoParametroInvenBusqueda.setVisible(false);		}


					
		this.jLabelcon_crear_producto_sucursalParametroInven = new JLabelMe();
		this.jLabelcon_crear_producto_sucursalParametroInven.setText(""+ParametroInvenConstantesFunciones.LABEL_CONCREARPRODUCTOSUCURSAL+" : *");
		this.jLabelcon_crear_producto_sucursalParametroInven.setToolTipText("Crear Producto Sucursal");
		this.jLabelcon_crear_producto_sucursalParametroInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcon_crear_producto_sucursalParametroInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcon_crear_producto_sucursalParametroInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_crear_producto_sucursalParametroInven,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_crear_producto_sucursalParametroInven=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_crear_producto_sucursalParametroInven.setToolTipText(ParametroInvenConstantesFunciones.LABEL_CONCREARPRODUCTOSUCURSAL);
		this.gridaBagLayoutParametroInven = new GridBagLayout();
		this.jPanelcon_crear_producto_sucursalParametroInven.setLayout(this.gridaBagLayoutParametroInven);


		jCheckBoxcon_crear_producto_sucursalParametroInven= new JCheckBoxMe();
		jCheckBoxcon_crear_producto_sucursalParametroInven.setEnabled(false);

		jCheckBoxcon_crear_producto_sucursalParametroInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_crear_producto_sucursalParametroInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_crear_producto_sucursalParametroInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_crear_producto_sucursalParametroInven,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_crear_producto_sucursalParametroInvenBusqueda= new JButtonMe();
		this.jButtoncon_crear_producto_sucursalParametroInvenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_crear_producto_sucursalParametroInvenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_crear_producto_sucursalParametroInvenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_crear_producto_sucursalParametroInvenBusqueda.setText("U");
		this.jButtoncon_crear_producto_sucursalParametroInvenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_crear_producto_sucursalParametroInvenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_crear_producto_sucursalParametroInvenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_crear_producto_sucursalParametroInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_crear_producto_sucursalParametroInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_crear_producto_sucursalParametroInvenBusqueda"));

		if(this.parametroinvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_crear_producto_sucursalParametroInvenBusqueda.setVisible(false);		}


					
		this.jLabelcon_crear_lista_precio_sucursal_bodegaParametroInven = new JLabelMe();
		this.jLabelcon_crear_lista_precio_sucursal_bodegaParametroInven.setText(""+ParametroInvenConstantesFunciones.LABEL_CONCREARLISTAPRECIOSUCURSALBODEGA+" : *");
		this.jLabelcon_crear_lista_precio_sucursal_bodegaParametroInven.setToolTipText("Crear Lista Precio Sucursal Bodega");
		this.jLabelcon_crear_lista_precio_sucursal_bodegaParametroInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcon_crear_lista_precio_sucursal_bodegaParametroInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcon_crear_lista_precio_sucursal_bodegaParametroInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_crear_lista_precio_sucursal_bodegaParametroInven,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_crear_lista_precio_sucursal_bodegaParametroInven=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_crear_lista_precio_sucursal_bodegaParametroInven.setToolTipText(ParametroInvenConstantesFunciones.LABEL_CONCREARLISTAPRECIOSUCURSALBODEGA);
		this.gridaBagLayoutParametroInven = new GridBagLayout();
		this.jPanelcon_crear_lista_precio_sucursal_bodegaParametroInven.setLayout(this.gridaBagLayoutParametroInven);


		jCheckBoxcon_crear_lista_precio_sucursal_bodegaParametroInven= new JCheckBoxMe();
		jCheckBoxcon_crear_lista_precio_sucursal_bodegaParametroInven.setEnabled(false);

		jCheckBoxcon_crear_lista_precio_sucursal_bodegaParametroInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_crear_lista_precio_sucursal_bodegaParametroInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_crear_lista_precio_sucursal_bodegaParametroInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_crear_lista_precio_sucursal_bodegaParametroInven,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_crear_lista_precio_sucursal_bodegaParametroInvenBusqueda= new JButtonMe();
		this.jButtoncon_crear_lista_precio_sucursal_bodegaParametroInvenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_crear_lista_precio_sucursal_bodegaParametroInvenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_crear_lista_precio_sucursal_bodegaParametroInvenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_crear_lista_precio_sucursal_bodegaParametroInvenBusqueda.setText("U");
		this.jButtoncon_crear_lista_precio_sucursal_bodegaParametroInvenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_crear_lista_precio_sucursal_bodegaParametroInvenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_crear_lista_precio_sucursal_bodegaParametroInvenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_crear_lista_precio_sucursal_bodegaParametroInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_crear_lista_precio_sucursal_bodegaParametroInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_crear_lista_precio_sucursal_bodegaParametroInvenBusqueda"));

		if(this.parametroinvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_crear_lista_precio_sucursal_bodegaParametroInvenBusqueda.setVisible(false);		}


					
		this.jLabelcon_compras_aprobacionParametroInven = new JLabelMe();
		this.jLabelcon_compras_aprobacionParametroInven.setText(""+ParametroInvenConstantesFunciones.LABEL_CONCOMPRASAPROBACION+" : *");
		this.jLabelcon_compras_aprobacionParametroInven.setToolTipText("Compras Aprobacion");
		this.jLabelcon_compras_aprobacionParametroInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_compras_aprobacionParametroInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_compras_aprobacionParametroInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_compras_aprobacionParametroInven,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_compras_aprobacionParametroInven=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_compras_aprobacionParametroInven.setToolTipText(ParametroInvenConstantesFunciones.LABEL_CONCOMPRASAPROBACION);
		this.gridaBagLayoutParametroInven = new GridBagLayout();
		this.jPanelcon_compras_aprobacionParametroInven.setLayout(this.gridaBagLayoutParametroInven);


		jCheckBoxcon_compras_aprobacionParametroInven= new JCheckBoxMe();
		jCheckBoxcon_compras_aprobacionParametroInven.setEnabled(false);

		jCheckBoxcon_compras_aprobacionParametroInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_compras_aprobacionParametroInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_compras_aprobacionParametroInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_compras_aprobacionParametroInven,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_compras_aprobacionParametroInvenBusqueda= new JButtonMe();
		this.jButtoncon_compras_aprobacionParametroInvenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_compras_aprobacionParametroInvenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_compras_aprobacionParametroInvenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_compras_aprobacionParametroInvenBusqueda.setText("U");
		this.jButtoncon_compras_aprobacionParametroInvenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_compras_aprobacionParametroInvenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_compras_aprobacionParametroInvenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_compras_aprobacionParametroInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_compras_aprobacionParametroInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_compras_aprobacionParametroInvenBusqueda"));

		if(this.parametroinvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_compras_aprobacionParametroInvenBusqueda.setVisible(false);		}


					
		this.jLabelcon_envio_mailParametroInven = new JLabelMe();
		this.jLabelcon_envio_mailParametroInven.setText(""+ParametroInvenConstantesFunciones.LABEL_CONENVIOMAIL+" : *");
		this.jLabelcon_envio_mailParametroInven.setToolTipText("Envio Mail");
		this.jLabelcon_envio_mailParametroInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_envio_mailParametroInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_envio_mailParametroInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_envio_mailParametroInven,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_envio_mailParametroInven=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_envio_mailParametroInven.setToolTipText(ParametroInvenConstantesFunciones.LABEL_CONENVIOMAIL);
		this.gridaBagLayoutParametroInven = new GridBagLayout();
		this.jPanelcon_envio_mailParametroInven.setLayout(this.gridaBagLayoutParametroInven);


		jCheckBoxcon_envio_mailParametroInven= new JCheckBoxMe();
		jCheckBoxcon_envio_mailParametroInven.setEnabled(false);

		jCheckBoxcon_envio_mailParametroInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_envio_mailParametroInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_envio_mailParametroInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_envio_mailParametroInven,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_envio_mailParametroInvenBusqueda= new JButtonMe();
		this.jButtoncon_envio_mailParametroInvenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_envio_mailParametroInvenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_envio_mailParametroInvenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_envio_mailParametroInvenBusqueda.setText("U");
		this.jButtoncon_envio_mailParametroInvenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_envio_mailParametroInvenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_envio_mailParametroInvenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_envio_mailParametroInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_envio_mailParametroInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_envio_mailParametroInvenBusqueda"));

		if(this.parametroinvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_envio_mailParametroInvenBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysParametroInven() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaParametroInven = new JLabelMe();
		this.jLabelid_empresaParametroInven.setText(""+ParametroInvenConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaParametroInven.setToolTipText("Empresa");
		this.jLabelid_empresaParametroInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaParametroInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaParametroInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaParametroInven,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaParametroInven=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaParametroInven.setToolTipText(ParametroInvenConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutParametroInven = new GridBagLayout();
		this.jPanelid_empresaParametroInven.setLayout(this.gridaBagLayoutParametroInven);


		jComboBoxid_empresaParametroInven= new JComboBoxMe();
		jComboBoxid_empresaParametroInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaParametroInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaParametroInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaParametroInven,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaParametroInven.setEnabled(false);

		this.jButtonid_empresaParametroInven= new JButtonMe();
		this.jButtonid_empresaParametroInven.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaParametroInven.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaParametroInven.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaParametroInven.setText("Buscar");
		this.jButtonid_empresaParametroInven.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaParametroInven.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaParametroInven,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaParametroInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaParametroInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaParametroInven"));

		this.jButtonid_empresaParametroInvenBusqueda= new JButtonMe();
		this.jButtonid_empresaParametroInvenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroInvenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroInvenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaParametroInvenBusqueda.setText("U");
		this.jButtonid_empresaParametroInvenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaParametroInvenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaParametroInvenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaParametroInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaParametroInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaParametroInvenBusqueda"));

		if(this.parametroinvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaParametroInvenBusqueda.setVisible(false);		}

		this.jButtonid_empresaParametroInvenUpdate= new JButtonMe();
		this.jButtonid_empresaParametroInvenUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroInvenUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroInvenUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaParametroInvenUpdate.setText("U");
		this.jButtonid_empresaParametroInvenUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaParametroInvenUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaParametroInvenUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaParametroInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaParametroInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaParametroInvenUpdate"));



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
		//this.jInternalFrameDetalleParametroInven = new ParametroInvenBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Parametro Inven DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutParametroInven= new GridBagLayout();
		

		
		String sToolTipParametroInven="";
		sToolTipParametroInven=ParametroInvenConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipParametroInven+="(Inventario.ParametroInven)";
		}
		
		if(!this.parametroinvenSessionBean.getEsGuardarRelacionado()) {
			sToolTipParametroInven+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoParametroInven = new JButtonMe();
		this.jButtonModificarParametroInven = new JButtonMe();
        this.jButtonActualizarParametroInven = new JButtonMe();
        this.jButtonEliminarParametroInven = new JButtonMe();
        this.jButtonCancelarParametroInven = new JButtonMe();
        this.jButtonGuardarCambiosParametroInven = new JButtonMe();
		this.jButtonGuardarCambiosTablaParametroInven = new JButtonMe();
		this.jButtonCerrarParametroInven = new JButtonMe();
		
		this.jScrollPanelDatosParametroInven = new JScrollPane();   
        this.jScrollPanelDatosEdicionParametroInven = new JScrollPane();
		this.jScrollPanelDatosGeneralParametroInven = new JScrollPane();
				
		
		
		this.jPanelCamposParametroInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosParametroInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesParametroInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioParametroInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Parametro Inven";
		
		if(!this.parametroinvenSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosParametroInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Invenes" + this.sPath));
		} else {
			this.jScrollPanelDatosParametroInven.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionParametroInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralParametroInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposParametroInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposParametroInven.setName("jPanelCamposParametroInven"); 

		this.jPanelCamposOcultosParametroInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosParametroInven.setName("jPanelCamposOcultosParametroInven"); 

        this.jPanelAccionesParametroInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesParametroInven.setToolTipText("Acciones");
        this.jPanelAccionesParametroInven.setName("Acciones"); 

		this.jPanelAccionesFormularioParametroInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioParametroInven.setToolTipText("Acciones");
        this.jPanelAccionesFormularioParametroInven.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionParametroInven, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralParametroInven, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosParametroInven, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposParametroInven, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosParametroInven, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioParametroInven, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoParametroInven.setText("Nuevo");
		this.jButtonModificarParametroInven.setText("Editar");
        this.jButtonActualizarParametroInven.setText("Actualizar");
        this.jButtonEliminarParametroInven.setText("Eliminar");
        this.jButtonCancelarParametroInven.setText("Cancelar");
        this.jButtonGuardarCambiosParametroInven.setText("Guardar");
		this.jButtonGuardarCambiosTablaParametroInven.setText("Guardar");
		this.jButtonCerrarParametroInven.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoParametroInven,"nuevo_button","Nuevo",this.parametroinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarParametroInven,"modificar_button","Editar",this.parametroinvenSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarParametroInven,"actualizar_button","Actualizar",this.parametroinvenSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarParametroInven,"eliminar_button","Eliminar",this.parametroinvenSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarParametroInven,"cancelar_button","Cancelar",this.parametroinvenSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosParametroInven,"guardarcambios_button","Guardar",this.parametroinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaParametroInven,"guardarcambiostabla_button","Guardar",this.parametroinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarParametroInven,"cerrar_button","Salir",this.parametroinvenSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoParametroInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarParametroInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosParametroInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaParametroInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarParametroInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarParametroInven, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarParametroInven, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarParametroInven, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoParametroInven.setToolTipText("Nuevo"+" "+ParametroInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarParametroInven.setToolTipText("Editar"+" "+ParametroInvenConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarParametroInven.setToolTipText("Actualizar"+" "+ParametroInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarParametroInven.setToolTipText("Eliminar)"+" "+ParametroInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarParametroInven.setToolTipText("Cancelar"+" "+ParametroInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosParametroInven.setToolTipText("Guardar"+" "+ParametroInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaParametroInven.setToolTipText("Guardar"+" "+ParametroInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarParametroInven.setToolTipText("Salir"+" "+ParametroInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoParametroInven";
		inputMap = this.jButtonNuevoParametroInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoParametroInven.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoParametroInven"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarParametroInven";
		inputMap = this.jButtonActualizarParametroInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarParametroInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarParametroInven"));
		
		//ELIMINAR
		sMapKey = "EliminarParametroInven";
		inputMap = this.jButtonEliminarParametroInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarParametroInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarParametroInven"));
		
		//CANCELAR	
		sMapKey = "CancelarParametroInven";
		inputMap = this.jButtonCancelarParametroInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarParametroInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarParametroInven"));
		
		//CERRAR		
		sMapKey = "CerrarParametroInven";
		inputMap = this.jButtonCerrarParametroInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarParametroInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarParametroInven"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaParametroInven";
		inputMap = this.jButtonGuardarCambiosTablaParametroInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaParametroInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaParametroInven"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoParametroInven = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoParametroInven.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoParametroInven.setToolTipText("Nuevo ParametroInven");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoParametroInven, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarParametroInven = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarParametroInven.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarParametroInven.setToolTipText("Sin Cerrar Ventana ParametroInven");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarParametroInven, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeParametroInven = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeParametroInven.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeParametroInven.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeParametroInven, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesParametroInven = new JComboBoxMe();
		//this.jComboBoxTiposAccionesParametroInven.setText("Accion");
		this.jComboBoxTiposAccionesParametroInven.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioParametroInven = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioParametroInven.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioParametroInven.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesParametroInven = new JLabelMe();
		
		this.jLabelAccionesParametroInven.setText("Acciones");		
		this.jLabelAccionesParametroInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposParametroInven();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysParametroInven();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesParametroInven=new JTabbedPane();
		this.jTabbedPaneRelacionesParametroInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesParametroInven,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesParametroInven.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroInven.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroInven.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesParametroInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioParametroInven.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioParametroInven.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioParametroInven.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioParametroInven, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposParametroInven = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosParametroInven = new GridBagLayout();
		
		this.jPanelCamposParametroInven.setLayout(gridaBagLayoutCamposParametroInven);
		this.jPanelCamposOcultosParametroInven.setLayout(gridaBagLayoutCamposOcultosParametroInven);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsParametroInven = new GridBagConstraints();
	this.gridBagConstraintsParametroInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroInven.gridy = 0;
	this.gridBagConstraintsParametroInven.gridx = 0;
	this.gridBagConstraintsParametroInven.ipadx = 0;
	this.gridBagConstraintsParametroInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidParametroInven.add(jLabelIdParametroInven, this.gridBagConstraintsParametroInven);



	this.gridBagConstraintsParametroInven = new GridBagConstraints();
	this.gridBagConstraintsParametroInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroInven.gridy = 0;
	this.gridBagConstraintsParametroInven.gridx = 1;
	this.gridBagConstraintsParametroInven.ipadx = 0;
	this.gridBagConstraintsParametroInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidParametroInven.add(jLabelidParametroInven, this.gridBagConstraintsParametroInven);


	this.gridBagConstraintsParametroInven = new GridBagConstraints();
	this.gridBagConstraintsParametroInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroInven.gridy = 0;
	this.gridBagConstraintsParametroInven.gridx = 0;
	this.gridBagConstraintsParametroInven.ipadx = 0;
	this.gridBagConstraintsParametroInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaParametroInven.add(jLabelid_empresaParametroInven, this.gridBagConstraintsParametroInven);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroInven = new GridBagConstraints();
		//this.gridBagConstraintsParametroInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroInven.gridy = 0;
		this.gridBagConstraintsParametroInven.gridx = 2;
		this.gridBagConstraintsParametroInven.ipadx = 0;
		this.gridBagConstraintsParametroInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaParametroInven.add(jButtonid_empresaParametroInvenBusqueda, this.gridBagConstraintsParametroInven);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroInven = new GridBagConstraints();
		//this.gridBagConstraintsParametroInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroInven.gridy = 0;
		this.gridBagConstraintsParametroInven.gridx = 3;
		this.gridBagConstraintsParametroInven.ipadx = 0;
		this.gridBagConstraintsParametroInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaParametroInven.add(jButtonid_empresaParametroInvenUpdate, this.gridBagConstraintsParametroInven);
	}

	this.gridBagConstraintsParametroInven = new GridBagConstraints();
	this.gridBagConstraintsParametroInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroInven.gridy = 0;
	this.gridBagConstraintsParametroInven.gridx = 1;
	this.gridBagConstraintsParametroInven.ipadx = 0;
	this.gridBagConstraintsParametroInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaParametroInven.add(jComboBoxid_empresaParametroInven, this.gridBagConstraintsParametroInven);


	this.gridBagConstraintsParametroInven = new GridBagConstraints();
	this.gridBagConstraintsParametroInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroInven.gridy = 0;
	this.gridBagConstraintsParametroInven.gridx = 0;
	this.gridBagConstraintsParametroInven.ipadx = 0;
	this.gridBagConstraintsParametroInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsecuencial_pedidoParametroInven.add(jLabelsecuencial_pedidoParametroInven, this.gridBagConstraintsParametroInven);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroInven = new GridBagConstraints();
		//this.gridBagConstraintsParametroInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroInven.gridy = 0;
		this.gridBagConstraintsParametroInven.gridx = 2;
		this.gridBagConstraintsParametroInven.ipadx = 0;
		this.gridBagConstraintsParametroInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelsecuencial_pedidoParametroInven.add(jButtonsecuencial_pedidoParametroInvenBusqueda, this.gridBagConstraintsParametroInven);
	}

	this.gridBagConstraintsParametroInven = new GridBagConstraints();
	this.gridBagConstraintsParametroInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroInven.gridy = 0;
	this.gridBagConstraintsParametroInven.gridx = 1;
	this.gridBagConstraintsParametroInven.ipadx = 0;
	this.gridBagConstraintsParametroInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsecuencial_pedidoParametroInven.add(jTextFieldsecuencial_pedidoParametroInven, this.gridBagConstraintsParametroInven);


	this.gridBagConstraintsParametroInven = new GridBagConstraints();
	this.gridBagConstraintsParametroInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroInven.gridy = 0;
	this.gridBagConstraintsParametroInven.gridx = 0;
	this.gridBagConstraintsParametroInven.ipadx = 0;
	this.gridBagConstraintsParametroInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_serieParametroInven.add(jLabelnumero_serieParametroInven, this.gridBagConstraintsParametroInven);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroInven = new GridBagConstraints();
		//this.gridBagConstraintsParametroInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroInven.gridy = 0;
		this.gridBagConstraintsParametroInven.gridx = 2;
		this.gridBagConstraintsParametroInven.ipadx = 0;
		this.gridBagConstraintsParametroInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_serieParametroInven.add(jButtonnumero_serieParametroInvenBusqueda, this.gridBagConstraintsParametroInven);
	}

	this.gridBagConstraintsParametroInven = new GridBagConstraints();
	this.gridBagConstraintsParametroInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroInven.gridy = 0;
	this.gridBagConstraintsParametroInven.gridx = 1;
	this.gridBagConstraintsParametroInven.ipadx = 0;
	this.gridBagConstraintsParametroInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_serieParametroInven.add(jTextFieldnumero_serieParametroInven, this.gridBagConstraintsParametroInven);


	this.gridBagConstraintsParametroInven = new GridBagConstraints();
	this.gridBagConstraintsParametroInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroInven.gridy = 0;
	this.gridBagConstraintsParametroInven.gridx = 0;
	this.gridBagConstraintsParametroInven.ipadx = 0;
	this.gridBagConstraintsParametroInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_decimalesParametroInven.add(jLabelnumero_decimalesParametroInven, this.gridBagConstraintsParametroInven);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroInven = new GridBagConstraints();
		//this.gridBagConstraintsParametroInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroInven.gridy = 0;
		this.gridBagConstraintsParametroInven.gridx = 2;
		this.gridBagConstraintsParametroInven.ipadx = 0;
		this.gridBagConstraintsParametroInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_decimalesParametroInven.add(jButtonnumero_decimalesParametroInvenBusqueda, this.gridBagConstraintsParametroInven);
	}

	this.gridBagConstraintsParametroInven = new GridBagConstraints();
	this.gridBagConstraintsParametroInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroInven.gridy = 0;
	this.gridBagConstraintsParametroInven.gridx = 1;
	this.gridBagConstraintsParametroInven.ipadx = 0;
	this.gridBagConstraintsParametroInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_decimalesParametroInven.add(jTextFieldnumero_decimalesParametroInven, this.gridBagConstraintsParametroInven);


	this.gridBagConstraintsParametroInven = new GridBagConstraints();
	this.gridBagConstraintsParametroInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroInven.gridy = 0;
	this.gridBagConstraintsParametroInven.gridx = 0;
	this.gridBagConstraintsParametroInven.ipadx = 0;
	this.gridBagConstraintsParametroInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_items_requisicionParametroInven.add(jLabelnumero_items_requisicionParametroInven, this.gridBagConstraintsParametroInven);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroInven = new GridBagConstraints();
		//this.gridBagConstraintsParametroInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroInven.gridy = 0;
		this.gridBagConstraintsParametroInven.gridx = 2;
		this.gridBagConstraintsParametroInven.ipadx = 0;
		this.gridBagConstraintsParametroInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_items_requisicionParametroInven.add(jButtonnumero_items_requisicionParametroInvenBusqueda, this.gridBagConstraintsParametroInven);
	}

	this.gridBagConstraintsParametroInven = new GridBagConstraints();
	this.gridBagConstraintsParametroInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroInven.gridy = 0;
	this.gridBagConstraintsParametroInven.gridx = 1;
	this.gridBagConstraintsParametroInven.ipadx = 0;
	this.gridBagConstraintsParametroInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_items_requisicionParametroInven.add(jTextFieldnumero_items_requisicionParametroInven, this.gridBagConstraintsParametroInven);


	this.gridBagConstraintsParametroInven = new GridBagConstraints();
	this.gridBagConstraintsParametroInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroInven.gridy = 0;
	this.gridBagConstraintsParametroInven.gridx = 0;
	this.gridBagConstraintsParametroInven.ipadx = 0;
	this.gridBagConstraintsParametroInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_cuenta_contableParametroInven.add(jLabelcon_cuenta_contableParametroInven, this.gridBagConstraintsParametroInven);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroInven = new GridBagConstraints();
		//this.gridBagConstraintsParametroInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroInven.gridy = 0;
		this.gridBagConstraintsParametroInven.gridx = 2;
		this.gridBagConstraintsParametroInven.ipadx = 0;
		this.gridBagConstraintsParametroInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_cuenta_contableParametroInven.add(jButtoncon_cuenta_contableParametroInvenBusqueda, this.gridBagConstraintsParametroInven);
	}

	this.gridBagConstraintsParametroInven = new GridBagConstraints();
	this.gridBagConstraintsParametroInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroInven.gridy = 0;
	this.gridBagConstraintsParametroInven.gridx = 1;
	this.gridBagConstraintsParametroInven.ipadx = 0;
	this.gridBagConstraintsParametroInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_cuenta_contableParametroInven.add(jCheckBoxcon_cuenta_contableParametroInven, this.gridBagConstraintsParametroInven);


	this.gridBagConstraintsParametroInven = new GridBagConstraints();
	this.gridBagConstraintsParametroInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroInven.gridy = 0;
	this.gridBagConstraintsParametroInven.gridx = 0;
	this.gridBagConstraintsParametroInven.ipadx = 0;
	this.gridBagConstraintsParametroInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_cuenta_contable_lineaParametroInven.add(jLabelcon_cuenta_contable_lineaParametroInven, this.gridBagConstraintsParametroInven);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroInven = new GridBagConstraints();
		//this.gridBagConstraintsParametroInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroInven.gridy = 0;
		this.gridBagConstraintsParametroInven.gridx = 2;
		this.gridBagConstraintsParametroInven.ipadx = 0;
		this.gridBagConstraintsParametroInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_cuenta_contable_lineaParametroInven.add(jButtoncon_cuenta_contable_lineaParametroInvenBusqueda, this.gridBagConstraintsParametroInven);
	}

	this.gridBagConstraintsParametroInven = new GridBagConstraints();
	this.gridBagConstraintsParametroInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroInven.gridy = 0;
	this.gridBagConstraintsParametroInven.gridx = 1;
	this.gridBagConstraintsParametroInven.ipadx = 0;
	this.gridBagConstraintsParametroInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_cuenta_contable_lineaParametroInven.add(jCheckBoxcon_cuenta_contable_lineaParametroInven, this.gridBagConstraintsParametroInven);


	this.gridBagConstraintsParametroInven = new GridBagConstraints();
	this.gridBagConstraintsParametroInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroInven.gridy = 0;
	this.gridBagConstraintsParametroInven.gridx = 0;
	this.gridBagConstraintsParametroInven.ipadx = 0;
	this.gridBagConstraintsParametroInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_cuenta_bancoParametroInven.add(jLabelcon_cuenta_bancoParametroInven, this.gridBagConstraintsParametroInven);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroInven = new GridBagConstraints();
		//this.gridBagConstraintsParametroInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroInven.gridy = 0;
		this.gridBagConstraintsParametroInven.gridx = 2;
		this.gridBagConstraintsParametroInven.ipadx = 0;
		this.gridBagConstraintsParametroInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_cuenta_bancoParametroInven.add(jButtoncon_cuenta_bancoParametroInvenBusqueda, this.gridBagConstraintsParametroInven);
	}

	this.gridBagConstraintsParametroInven = new GridBagConstraints();
	this.gridBagConstraintsParametroInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroInven.gridy = 0;
	this.gridBagConstraintsParametroInven.gridx = 1;
	this.gridBagConstraintsParametroInven.ipadx = 0;
	this.gridBagConstraintsParametroInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_cuenta_bancoParametroInven.add(jCheckBoxcon_cuenta_bancoParametroInven, this.gridBagConstraintsParametroInven);


	this.gridBagConstraintsParametroInven = new GridBagConstraints();
	this.gridBagConstraintsParametroInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroInven.gridy = 0;
	this.gridBagConstraintsParametroInven.gridx = 0;
	this.gridBagConstraintsParametroInven.ipadx = 0;
	this.gridBagConstraintsParametroInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_copiar_productoParametroInven.add(jLabelcon_copiar_productoParametroInven, this.gridBagConstraintsParametroInven);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroInven = new GridBagConstraints();
		//this.gridBagConstraintsParametroInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroInven.gridy = 0;
		this.gridBagConstraintsParametroInven.gridx = 2;
		this.gridBagConstraintsParametroInven.ipadx = 0;
		this.gridBagConstraintsParametroInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_copiar_productoParametroInven.add(jButtoncon_copiar_productoParametroInvenBusqueda, this.gridBagConstraintsParametroInven);
	}

	this.gridBagConstraintsParametroInven = new GridBagConstraints();
	this.gridBagConstraintsParametroInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroInven.gridy = 0;
	this.gridBagConstraintsParametroInven.gridx = 1;
	this.gridBagConstraintsParametroInven.ipadx = 0;
	this.gridBagConstraintsParametroInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_copiar_productoParametroInven.add(jCheckBoxcon_copiar_productoParametroInven, this.gridBagConstraintsParametroInven);


	this.gridBagConstraintsParametroInven = new GridBagConstraints();
	this.gridBagConstraintsParametroInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroInven.gridy = 0;
	this.gridBagConstraintsParametroInven.gridx = 0;
	this.gridBagConstraintsParametroInven.ipadx = 0;
	this.gridBagConstraintsParametroInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_crear_producto_sucursalParametroInven.add(jLabelcon_crear_producto_sucursalParametroInven, this.gridBagConstraintsParametroInven);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroInven = new GridBagConstraints();
		//this.gridBagConstraintsParametroInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroInven.gridy = 0;
		this.gridBagConstraintsParametroInven.gridx = 2;
		this.gridBagConstraintsParametroInven.ipadx = 0;
		this.gridBagConstraintsParametroInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_crear_producto_sucursalParametroInven.add(jButtoncon_crear_producto_sucursalParametroInvenBusqueda, this.gridBagConstraintsParametroInven);
	}

	this.gridBagConstraintsParametroInven = new GridBagConstraints();
	this.gridBagConstraintsParametroInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroInven.gridy = 0;
	this.gridBagConstraintsParametroInven.gridx = 1;
	this.gridBagConstraintsParametroInven.ipadx = 0;
	this.gridBagConstraintsParametroInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_crear_producto_sucursalParametroInven.add(jCheckBoxcon_crear_producto_sucursalParametroInven, this.gridBagConstraintsParametroInven);


	this.gridBagConstraintsParametroInven = new GridBagConstraints();
	this.gridBagConstraintsParametroInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroInven.gridy = 0;
	this.gridBagConstraintsParametroInven.gridx = 0;
	this.gridBagConstraintsParametroInven.ipadx = 0;
	this.gridBagConstraintsParametroInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_crear_lista_precio_sucursal_bodegaParametroInven.add(jLabelcon_crear_lista_precio_sucursal_bodegaParametroInven, this.gridBagConstraintsParametroInven);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroInven = new GridBagConstraints();
		//this.gridBagConstraintsParametroInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroInven.gridy = 0;
		this.gridBagConstraintsParametroInven.gridx = 2;
		this.gridBagConstraintsParametroInven.ipadx = 0;
		this.gridBagConstraintsParametroInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_crear_lista_precio_sucursal_bodegaParametroInven.add(jButtoncon_crear_lista_precio_sucursal_bodegaParametroInvenBusqueda, this.gridBagConstraintsParametroInven);
	}

	this.gridBagConstraintsParametroInven = new GridBagConstraints();
	this.gridBagConstraintsParametroInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroInven.gridy = 0;
	this.gridBagConstraintsParametroInven.gridx = 1;
	this.gridBagConstraintsParametroInven.ipadx = 0;
	this.gridBagConstraintsParametroInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_crear_lista_precio_sucursal_bodegaParametroInven.add(jCheckBoxcon_crear_lista_precio_sucursal_bodegaParametroInven, this.gridBagConstraintsParametroInven);


	this.gridBagConstraintsParametroInven = new GridBagConstraints();
	this.gridBagConstraintsParametroInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroInven.gridy = 0;
	this.gridBagConstraintsParametroInven.gridx = 0;
	this.gridBagConstraintsParametroInven.ipadx = 0;
	this.gridBagConstraintsParametroInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_compras_aprobacionParametroInven.add(jLabelcon_compras_aprobacionParametroInven, this.gridBagConstraintsParametroInven);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroInven = new GridBagConstraints();
		//this.gridBagConstraintsParametroInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroInven.gridy = 0;
		this.gridBagConstraintsParametroInven.gridx = 2;
		this.gridBagConstraintsParametroInven.ipadx = 0;
		this.gridBagConstraintsParametroInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_compras_aprobacionParametroInven.add(jButtoncon_compras_aprobacionParametroInvenBusqueda, this.gridBagConstraintsParametroInven);
	}

	this.gridBagConstraintsParametroInven = new GridBagConstraints();
	this.gridBagConstraintsParametroInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroInven.gridy = 0;
	this.gridBagConstraintsParametroInven.gridx = 1;
	this.gridBagConstraintsParametroInven.ipadx = 0;
	this.gridBagConstraintsParametroInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_compras_aprobacionParametroInven.add(jCheckBoxcon_compras_aprobacionParametroInven, this.gridBagConstraintsParametroInven);


	this.gridBagConstraintsParametroInven = new GridBagConstraints();
	this.gridBagConstraintsParametroInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroInven.gridy = 0;
	this.gridBagConstraintsParametroInven.gridx = 0;
	this.gridBagConstraintsParametroInven.ipadx = 0;
	this.gridBagConstraintsParametroInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_envio_mailParametroInven.add(jLabelcon_envio_mailParametroInven, this.gridBagConstraintsParametroInven);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroInven = new GridBagConstraints();
		//this.gridBagConstraintsParametroInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroInven.gridy = 0;
		this.gridBagConstraintsParametroInven.gridx = 2;
		this.gridBagConstraintsParametroInven.ipadx = 0;
		this.gridBagConstraintsParametroInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_envio_mailParametroInven.add(jButtoncon_envio_mailParametroInvenBusqueda, this.gridBagConstraintsParametroInven);
	}

	this.gridBagConstraintsParametroInven = new GridBagConstraints();
	this.gridBagConstraintsParametroInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroInven.gridy = 0;
	this.gridBagConstraintsParametroInven.gridx = 1;
	this.gridBagConstraintsParametroInven.ipadx = 0;
	this.gridBagConstraintsParametroInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_envio_mailParametroInven.add(jCheckBoxcon_envio_mailParametroInven, this.gridBagConstraintsParametroInven);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsParametroInven = new GridBagConstraints();
	this.gridBagConstraintsParametroInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroInven.gridy = iYPanelCamposParametroInven;
	this.gridBagConstraintsParametroInven.gridx = iXPanelCamposParametroInven++;
	this.gridBagConstraintsParametroInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroInven.add(this.jPanelidParametroInven, this.gridBagConstraintsParametroInven);



	if(iXPanelCamposParametroInven % 1==0) {
		iXPanelCamposParametroInven=0;
		iYPanelCamposParametroInven++;
	}
	this.gridBagConstraintsParametroInven = new GridBagConstraints();
	this.gridBagConstraintsParametroInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroInven.gridy = iYPanelCamposParametroInven;
	this.gridBagConstraintsParametroInven.gridx = iXPanelCamposParametroInven++;
	this.gridBagConstraintsParametroInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroInven.add(this.jPanelsecuencial_pedidoParametroInven, this.gridBagConstraintsParametroInven);



	if(iXPanelCamposParametroInven % 1==0) {
		iXPanelCamposParametroInven=0;
		iYPanelCamposParametroInven++;
	}
	this.gridBagConstraintsParametroInven = new GridBagConstraints();
	this.gridBagConstraintsParametroInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroInven.gridy = iYPanelCamposParametroInven;
	this.gridBagConstraintsParametroInven.gridx = iXPanelCamposParametroInven++;
	this.gridBagConstraintsParametroInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroInven.add(this.jPanelnumero_serieParametroInven, this.gridBagConstraintsParametroInven);



	if(iXPanelCamposParametroInven % 1==0) {
		iXPanelCamposParametroInven=0;
		iYPanelCamposParametroInven++;
	}
	this.gridBagConstraintsParametroInven = new GridBagConstraints();
	this.gridBagConstraintsParametroInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroInven.gridy = iYPanelCamposParametroInven;
	this.gridBagConstraintsParametroInven.gridx = iXPanelCamposParametroInven++;
	this.gridBagConstraintsParametroInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroInven.add(this.jPanelnumero_decimalesParametroInven, this.gridBagConstraintsParametroInven);



	if(iXPanelCamposParametroInven % 1==0) {
		iXPanelCamposParametroInven=0;
		iYPanelCamposParametroInven++;
	}
	this.gridBagConstraintsParametroInven = new GridBagConstraints();
	this.gridBagConstraintsParametroInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroInven.gridy = iYPanelCamposParametroInven;
	this.gridBagConstraintsParametroInven.gridx = iXPanelCamposParametroInven++;
	this.gridBagConstraintsParametroInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroInven.add(this.jPanelnumero_items_requisicionParametroInven, this.gridBagConstraintsParametroInven);



	if(iXPanelCamposParametroInven % 1==0) {
		iXPanelCamposParametroInven=0;
		iYPanelCamposParametroInven++;
	}
	this.gridBagConstraintsParametroInven = new GridBagConstraints();
	this.gridBagConstraintsParametroInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroInven.gridy = iYPanelCamposParametroInven;
	this.gridBagConstraintsParametroInven.gridx = iXPanelCamposParametroInven++;
	this.gridBagConstraintsParametroInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroInven.add(this.jPanelcon_cuenta_contableParametroInven, this.gridBagConstraintsParametroInven);



	if(iXPanelCamposParametroInven % 1==0) {
		iXPanelCamposParametroInven=0;
		iYPanelCamposParametroInven++;
	}
	this.gridBagConstraintsParametroInven = new GridBagConstraints();
	this.gridBagConstraintsParametroInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroInven.gridy = iYPanelCamposParametroInven;
	this.gridBagConstraintsParametroInven.gridx = iXPanelCamposParametroInven++;
	this.gridBagConstraintsParametroInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroInven.add(this.jPanelcon_cuenta_contable_lineaParametroInven, this.gridBagConstraintsParametroInven);



	if(iXPanelCamposParametroInven % 1==0) {
		iXPanelCamposParametroInven=0;
		iYPanelCamposParametroInven++;
	}
	this.gridBagConstraintsParametroInven = new GridBagConstraints();
	this.gridBagConstraintsParametroInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroInven.gridy = iYPanelCamposParametroInven;
	this.gridBagConstraintsParametroInven.gridx = iXPanelCamposParametroInven++;
	this.gridBagConstraintsParametroInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroInven.add(this.jPanelcon_cuenta_bancoParametroInven, this.gridBagConstraintsParametroInven);



	if(iXPanelCamposParametroInven % 1==0) {
		iXPanelCamposParametroInven=0;
		iYPanelCamposParametroInven++;
	}
	this.gridBagConstraintsParametroInven = new GridBagConstraints();
	this.gridBagConstraintsParametroInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroInven.gridy = iYPanelCamposParametroInven;
	this.gridBagConstraintsParametroInven.gridx = iXPanelCamposParametroInven++;
	this.gridBagConstraintsParametroInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroInven.add(this.jPanelcon_copiar_productoParametroInven, this.gridBagConstraintsParametroInven);



	if(iXPanelCamposParametroInven % 1==0) {
		iXPanelCamposParametroInven=0;
		iYPanelCamposParametroInven++;
	}
	this.gridBagConstraintsParametroInven = new GridBagConstraints();
	this.gridBagConstraintsParametroInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroInven.gridy = iYPanelCamposParametroInven;
	this.gridBagConstraintsParametroInven.gridx = iXPanelCamposParametroInven++;
	this.gridBagConstraintsParametroInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroInven.add(this.jPanelcon_crear_producto_sucursalParametroInven, this.gridBagConstraintsParametroInven);



	if(iXPanelCamposParametroInven % 1==0) {
		iXPanelCamposParametroInven=0;
		iYPanelCamposParametroInven++;
	}
	this.gridBagConstraintsParametroInven = new GridBagConstraints();
	this.gridBagConstraintsParametroInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroInven.gridy = iYPanelCamposParametroInven;
	this.gridBagConstraintsParametroInven.gridx = iXPanelCamposParametroInven++;
	this.gridBagConstraintsParametroInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroInven.add(this.jPanelcon_crear_lista_precio_sucursal_bodegaParametroInven, this.gridBagConstraintsParametroInven);



	if(iXPanelCamposParametroInven % 1==0) {
		iXPanelCamposParametroInven=0;
		iYPanelCamposParametroInven++;
	}
	this.gridBagConstraintsParametroInven = new GridBagConstraints();
	this.gridBagConstraintsParametroInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroInven.gridy = iYPanelCamposParametroInven;
	this.gridBagConstraintsParametroInven.gridx = iXPanelCamposParametroInven++;
	this.gridBagConstraintsParametroInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroInven.add(this.jPanelcon_compras_aprobacionParametroInven, this.gridBagConstraintsParametroInven);



	if(iXPanelCamposParametroInven % 1==0) {
		iXPanelCamposParametroInven=0;
		iYPanelCamposParametroInven++;
	}
	this.gridBagConstraintsParametroInven = new GridBagConstraints();
	this.gridBagConstraintsParametroInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroInven.gridy = iYPanelCamposParametroInven;
	this.gridBagConstraintsParametroInven.gridx = iXPanelCamposParametroInven++;
	this.gridBagConstraintsParametroInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroInven.add(this.jPanelcon_envio_mailParametroInven, this.gridBagConstraintsParametroInven);



	if(iXPanelCamposParametroInven % 1==0) {
		iXPanelCamposParametroInven=0;
		iYPanelCamposParametroInven++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsParametroInven = new GridBagConstraints();
	this.gridBagConstraintsParametroInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroInven.gridy = iYPanelCamposOcultosParametroInven;
	this.gridBagConstraintsParametroInven.gridx = iXPanelCamposOcultosParametroInven++;
	this.gridBagConstraintsParametroInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosParametroInven.add(this.jPanelid_empresaParametroInven, this.gridBagConstraintsParametroInven);



	if(iXPanelCamposOcultosParametroInven % 1==0) {
		iXPanelCamposOcultosParametroInven=0;
		iYPanelCamposOcultosParametroInven++;
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
			
		GridBagLayout gridaBagLayoutAccionesParametroInven= new GridBagLayout();
		this.jPanelAccionesParametroInven.setLayout(gridaBagLayoutAccionesParametroInven);
		
		GridBagLayout gridaBagLayoutAccionesFormularioParametroInven= new GridBagLayout();
		this.jPanelAccionesFormularioParametroInven.setLayout(gridaBagLayoutAccionesFormularioParametroInven);
		
		this.gridBagConstraintsParametroInven = new GridBagConstraints();
		this.gridBagConstraintsParametroInven.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsParametroInven.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioParametroInven.add(this.jComboBoxTiposAccionesFormularioParametroInven, this.gridBagConstraintsParametroInven);

		this.gridBagConstraintsParametroInven = new GridBagConstraints();
		this.gridBagConstraintsParametroInven.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsParametroInven.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioParametroInven.add(this.jCheckBoxPostAccionNuevoParametroInven, this.gridBagConstraintsParametroInven);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.parametroinvenSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsParametroInven = new GridBagConstraints();
			this.gridBagConstraintsParametroInven.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsParametroInven.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioParametroInven.add(this.jCheckBoxPostAccionSinCerrarParametroInven, this.gridBagConstraintsParametroInven);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.parametroinvenSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.parametroinvenSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsParametroInven = new GridBagConstraints();
			this.gridBagConstraintsParametroInven.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsParametroInven.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioParametroInven.add(this.jCheckBoxPostAccionSinMensajeParametroInven, this.gridBagConstraintsParametroInven);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsParametroInven = new GridBagConstraints();
		this.gridBagConstraintsParametroInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroInven.gridy = 0;
		this.gridBagConstraintsParametroInven.gridx = iPosXAccion++;
			
		this.jPanelAccionesParametroInven.add(this.jButtonModificarParametroInven, this.gridBagConstraintsParametroInven);							

		this.gridBagConstraintsParametroInven = new GridBagConstraints();
		this.gridBagConstraintsParametroInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroInven.gridy = 0;
		this.gridBagConstraintsParametroInven.gridx =iPosXAccion++;
			
		this.jPanelAccionesParametroInven.add(this.jButtonEliminarParametroInven, this.gridBagConstraintsParametroInven);
		
			
		this.gridBagConstraintsParametroInven = new GridBagConstraints();
		this.gridBagConstraintsParametroInven.gridy = 0;		
		this.gridBagConstraintsParametroInven.gridx = iPosXAccion++;
		
		this.jPanelAccionesParametroInven.add(this.jButtonActualizarParametroInven, this.gridBagConstraintsParametroInven);


		this.gridBagConstraintsParametroInven = new GridBagConstraints();
		this.gridBagConstraintsParametroInven.gridy = 0;		
		this.gridBagConstraintsParametroInven.gridx = iPosXAccion++;
		
		this.jPanelAccionesParametroInven.add(this.jButtonGuardarCambiosParametroInven, this.gridBagConstraintsParametroInven);	
		
		this.gridBagConstraintsParametroInven = new GridBagConstraints();
		this.gridBagConstraintsParametroInven.gridy = 0;		
		this.gridBagConstraintsParametroInven.gridx =iPosXAccion++;
		
		this.jPanelAccionesParametroInven.add(this.jButtonCancelarParametroInven, this.gridBagConstraintsParametroInven);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutParametroInven = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutParametroInven);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.parametroinvenSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsParametroInven = new GridBagConstraints();						
			this.gridBagConstraintsParametroInven.gridy = iGridyPrincipal++;
			this.gridBagConstraintsParametroInven.gridx = 0;		
			//this.gridBagConstraintsParametroInven.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroInven.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsParametroInven.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsParametroInven = new GridBagConstraints();
		this.gridBagConstraintsParametroInven.gridy =iGridyPrincipal++;
		this.gridBagConstraintsParametroInven.gridx =0;
		this.gridBagConstraintsParametroInven.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsParametroInven.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosParametroInven, this.gridBagConstraintsParametroInven);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ParametroInvenJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleParametroInven = new ParametroInvenBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Parametro Inven DATOS");
			
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
			
	        //this.setTitle("[FOR] - Parametro Inven DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Parametro Inven Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ParametroInvenModel parametroinvenModel=new ParametroInvenModel(this);
			
			//SI USARA CLASE INTERNA
			//ParametroInvenModel.ParametroInvenFocusTraversalPolicy parametroinvenFocusTraversalPolicy = parametroinvenModel.new ParametroInvenFocusTraversalPolicy(this);
			
			//parametroinvenFocusTraversalPolicy.setparametroinvenJInternalFrame(this);
			
			this.setFocusTraversalPolicy(parametroinvenModel);
			
			
			this.jContentPaneDetalleParametroInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleParametroInven = new GridBagLayout();	
			this.jContentPaneDetalleParametroInven.setLayout(gridaBagLayoutDetalleParametroInven);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosParametroInven = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsParametroInven = new GridBagConstraints();
				this.gridBagConstraintsParametroInven.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsParametroInven.gridx = 0;
					
				
				this.jContentPaneDetalleParametroInven.add(jTtoolBarDetalleParametroInven, gridBagConstraintsParametroInven);								
				
}
			
			this.jScrollPanelDatosEdicionParametroInven=   new JScrollPane(jContentPaneDetalleParametroInven,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionParametroInven.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroInven.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroInven.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralParametroInven=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralParametroInven.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroInven.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroInven.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsParametroInven = new GridBagConstraints();
			
			
	        this.gridBagConstraintsParametroInven.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsParametroInven.gridx = 0;
	        
			this.jContentPaneDetalleParametroInven.add(jPanelCamposParametroInven, gridBagConstraintsParametroInven);
			
			
			
			
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
						&& parametroinvenSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.parametroinvenSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsParametroInven= new GridBagConstraints();
						this.gridBagConstraintsParametroInven.gridy = iGridyRelaciones++;
						this.gridBagConstraintsParametroInven.gridx = 0;
						this.jContentPaneDetalleParametroInven.add(this.jTabbedPaneRelacionesParametroInven, this.gridBagConstraintsParametroInven);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesParametroInven.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosParametroInven.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsParametroInven = new GridBagConstraints();
					this.gridBagConstraintsParametroInven.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsParametroInven.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsParametroInven.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsParametroInven.gridx = 0;
					
				
					this.jContentPaneDetalleParametroInven.add(jPanelCamposOcultosParametroInven, gridBagConstraintsParametroInven);
				
					this.jPanelCamposOcultosParametroInven.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsParametroInven = new GridBagConstraints();
			this.gridBagConstraintsParametroInven.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsParametroInven.gridx = 0;
	        this.gridBagConstraintsParametroInven.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleParametroInven.add(this.jPanelAccionesFormularioParametroInven, this.gridBagConstraintsParametroInven);							
			
			
			
			this.gridBagConstraintsParametroInven = new GridBagConstraints();
	        this.gridBagConstraintsParametroInven.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsParametroInven.gridx = 0;
	        
			
			this.jContentPaneDetalleParametroInven.add(this.jPanelAccionesParametroInven, this.gridBagConstraintsParametroInven);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionParametroInven);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionParametroInven=   new JScrollPane(this.jPanelCamposParametroInven,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionParametroInven.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroInven.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroInven.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsParametroInven = new GridBagConstraints();
			this.gridBagConstraintsParametroInven.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsParametroInven.gridx = 0;
			this.gridBagConstraintsParametroInven.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsParametroInven.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsParametroInven.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionParametroInven, this.gridBagConstraintsParametroInven);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsParametroInven = new GridBagConstraints();
			this.gridBagConstraintsParametroInven.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsParametroInven.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioParametroInven, this.gridBagConstraintsParametroInven);			
			
			this.gridBagConstraintsParametroInven = new GridBagConstraints();
			this.gridBagConstraintsParametroInven.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsParametroInven.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesParametroInven, this.gridBagConstraintsParametroInven);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsParametroInven = new GridBagConstraints();
		this.gridBagConstraintsParametroInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroInven.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposParametroInven, this.gridBagConstraintsParametroInven);
			
			
		this.gridBagConstraintsParametroInven = new GridBagConstraints();
		this.gridBagConstraintsParametroInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroInven.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosParametroInven, this.gridBagConstraintsParametroInven);
		
			
		this.gridBagConstraintsParametroInven = new GridBagConstraints();
		this.gridBagConstraintsParametroInven.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsParametroInven.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesParametroInven, this.gridBagConstraintsParametroInven);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralParametroInven;//jContentPane;
		
		return jScrollPanelDatosEdicionParametroInven;
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
