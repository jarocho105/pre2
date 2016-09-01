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
package com.bydan.erp.importaciones.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.importaciones.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.importaciones.business.entity.*;
import com.bydan.erp.importaciones.util.ContenedorConstantesFunciones;

import com.bydan.erp.importaciones.business.logic.*;
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
public class ContenedorDetalleFormJInternalFrame extends ContenedorBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleContenedor;
	
	protected JMenuBar jmenuBarDetalleContenedor;
	
	protected JMenu jmenuDetalleContenedor;
	protected JMenu jmenuDetalleArchivoContenedor;
	protected JMenu jmenuDetalleAccionesContenedor;
	protected JMenu jmenuDetalleDatosContenedor;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleContenedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutContenedor;	
	protected GridBagConstraints gridBagConstraintsContenedor;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ContenedorBeanSwingJInternalFrameAdditional jInternalFrameDetalleContenedor;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected PedidoBeanSwingJInternalFrame pedidoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pedido="";
	
	public ContenedorSessionBean contenedorSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public PedidoSessionBean pedidoSessionBean;	
	
	public ContenedorLogic contenedorLogic;
	
	public JScrollPane jScrollPanelDatosContenedor;
	public JScrollPane jScrollPanelDatosEdicionContenedor;
	public JScrollPane jScrollPanelDatosGeneralContenedor;
	
	protected JPanel jPanelCamposContenedor;    
	protected JPanel jPanelCamposOcultosContenedor;    	
	protected JPanel jPanelAccionesContenedor;
	protected JPanel jPanelAccionesFormularioContenedor;
    
	
	
	protected Integer iXPanelCamposContenedor=0;
	protected Integer iYPanelCamposContenedor=0;
	
	protected Integer iXPanelCamposOcultosContenedor=0;
	protected Integer iYPanelCamposOcultosContenedor=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoContenedor;
	public JButton jButtonModificarContenedor;
	public JButton jButtonActualizarContenedor;
    public JButton jButtonEliminarContenedor;
	public JButton jButtonCancelarContenedor;
    public JButton jButtonGuardarCambiosContenedor;
	public JButton jButtonGuardarCambiosTablaContenedor;
	protected JButton jButtonCerrarContenedor;
	
	
	protected JButton jButtonProcesarInformacionContenedor;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoContenedor;
	protected JCheckBox jCheckBoxPostAccionSinCerrarContenedor;
	protected JCheckBox jCheckBoxPostAccionSinMensajeContenedor;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarContenedor;
	protected JButton jButtonModificarToolBarContenedor;
	protected JButton jButtonActualizarToolBarContenedor;
    protected JButton jButtonEliminarToolBarContenedor;
	protected JButton jButtonCancelarToolBarContenedor;
    protected JButton jButtonGuardarCambiosToolBarContenedor;
	protected JButton jButtonGuardarCambiosTablaToolBarContenedor;
	protected JButton jButtonMostrarOcultarTablaToolBarContenedor;
	protected JButton jButtonCerrarToolBarContenedor;
	
	protected JButton jButtonProcesarInformacionToolBarContenedor;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoContenedor;
	protected JMenuItem jMenuItemModificarContenedor;
	protected JMenuItem jMenuItemActualizarContenedor;
    protected JMenuItem jMenuItemEliminarContenedor;
	protected JMenuItem jMenuItemCancelarContenedor;
    protected JMenuItem jMenuItemGuardarCambiosContenedor;
	protected JMenuItem jMenuItemGuardarCambiosTablaContenedor;
	protected JMenuItem jMenuItemCerrarContenedor;
	protected JMenuItem jMenuItemDetalleCerrarContenedor;
	protected JMenuItem jMenuItemDetalleMostarOcultarContenedor;
	
	protected JMenuItem jMenuItemProcesarInformacionContenedor;
	protected JMenuItem jMenuItemNuevoGuardarCambiosContenedor;
	protected JMenuItem jMenuItemMostrarOcultarContenedor;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesContenedor;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesContenedor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesContenedor;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioContenedor;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidContenedor;
	public JLabel jLabelIdContenedor;
	public JLabel jLabelidContenedor;
	public JButton jButtonidContenedorBusqueda= new JButtonMe();

	public JPanel jPanelnumeroContenedor;
	public JLabel jLabelnumeroContenedor;
	public JTextField jTextFieldnumeroContenedor;
	public JButton jButtonnumeroContenedorBusqueda= new JButtonMe();

	public JPanel jPanelnumero_blContenedor;
	public JLabel jLabelnumero_blContenedor;
	public JTextField jTextFieldnumero_blContenedor;
	public JButton jButtonnumero_blContenedorBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionContenedor;
	public JLabel jLabeldescripcionContenedor;
	public JTextArea jTextAreadescripcionContenedor;
	public JScrollPane jscrollPanedescripcionContenedor;
	public JButton jButtondescripcionContenedorBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaContenedor;
	public JLabel jLabelid_empresaContenedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaContenedor;
	public JButton jButtonid_empresaContenedor= new JButtonMe();
	public JButton jButtonid_empresaContenedorUpdate= new JButtonMe();
	public JButton jButtonid_empresaContenedorBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalContenedor;
	public JLabel jLabelid_sucursalContenedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalContenedor;
	public JButton jButtonid_sucursalContenedor= new JButtonMe();
	public JButton jButtonid_sucursalContenedorUpdate= new JButtonMe();
	public JButton jButtonid_sucursalContenedorBusqueda= new JButtonMe();

	public JPanel jPanelid_pedidoContenedor;
	public JLabel jLabelid_pedidoContenedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_pedidoContenedor;
	public JButton jButtonid_pedidoContenedor= new JButtonMe();
	public JButton jButtonid_pedidoContenedorUpdate= new JButtonMe();
	public JButton jButtonid_pedidoContenedorBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesContenedor;
	
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
	
	public ContenedorDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposContenedor=new JPanel();
				this.jPanelAccionesFormularioContenedor=new JPanel();
				this.jmenuBarDetalleContenedor=new JMenuBar();
				this.jTtoolBarDetalleContenedor=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ContenedorDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Contenedor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ContenedorDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Contenedor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ContenedorDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Contenedor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ContenedorDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Contenedor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ContenedorDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Contenedor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarContenedor() {
		return this.jButtonActualizarToolBarContenedor;
	}
	
	public JButton getjButtonEliminarToolBarContenedor() {
		return this.jButtonEliminarToolBarContenedor;
	}
	
	public JButton getjButtonCancelarToolBarContenedor() {
		return this.jButtonCancelarToolBarContenedor;
	}		
	
	public JButton getjButtonProcesarInformacionContenedor() {
		return this.jButtonProcesarInformacionContenedor;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionContenedor)	{
		this.jButtonProcesarInformacionContenedor = jButtonProcesarInformacionContenedor;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesContenedor() {
		return this.jComboBoxTiposAccionesContenedor;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesContenedor(
			JComboBox jComboBoxTiposRelacionesContenedor) {
		this.jComboBoxTiposRelacionesContenedor = jComboBoxTiposRelacionesContenedor;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesContenedor(
			JComboBox jComboBoxTiposAccionesContenedor) {
		this.jComboBoxTiposAccionesContenedor = jComboBoxTiposAccionesContenedor;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioContenedor() {
		return this.jComboBoxTiposAccionesFormularioContenedor;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioContenedor(
			JComboBox jComboBoxTiposAccionesFormularioContenedor) {
		this.jComboBoxTiposAccionesFormularioContenedor = jComboBoxTiposAccionesFormularioContenedor;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.contenedorSessionBean=new ContenedorSessionBean();
		
		this.contenedorSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.contenedorSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.contenedorSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ContenedorJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ContenedorJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ContenedorJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Contenedor MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.contenedorSessionBean.getEsGuardarRelacionado()) {
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
	
		ContenedorJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleContenedor= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarContenedor=new JButtonMe();
				this.jButtonModificarToolBarContenedor=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarContenedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarContenedor,this.jTtoolBarDetalleContenedor,
							"actualizar","actualizar","Actualizar"+" "+ContenedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarContenedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarContenedor,this.jTtoolBarDetalleContenedor,
							"eliminar","eliminar","Eliminar"+" "+ContenedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarContenedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarContenedor,this.jTtoolBarDetalleContenedor,
							"cancelar","cancelar","Cancelar"+" "+ContenedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarContenedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarContenedor,this.jTtoolBarDetalleContenedor,
							"guardarcambios","guardarcambios","Guardar"+" "+ContenedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarContenedor,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarContenedor,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarContenedor,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleContenedor=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleContenedor=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoContenedor=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesContenedor=new JMenuMe("Acciones");
		this.jmenuDetalleDatosContenedor=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoContenedor= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoContenedor.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoContenedor,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoContenedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarContenedor= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarContenedor.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarContenedor,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarContenedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarContenedor= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarContenedor.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarContenedor,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarContenedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarContenedor= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarContenedor.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarContenedor,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarContenedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarContenedor= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarContenedor.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarContenedor,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarContenedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosContenedor= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosContenedor.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosContenedor,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosContenedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarContenedor= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarContenedor.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarContenedor,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarContenedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarContenedor= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarContenedor.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarContenedor,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarContenedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarContenedor= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarContenedor.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarContenedor,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarContenedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarContenedor= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarContenedor.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarContenedor,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarContenedor, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoContenedor.add(this.jMenuItemDetalleCerrarContenedor);
		
		this.jmenuDetalleAccionesContenedor.add(this.jMenuItemActualizarContenedor);
		this.jmenuDetalleAccionesContenedor.add(this.jMenuItemEliminarContenedor);
		this.jmenuDetalleAccionesContenedor.add(this.jMenuItemCancelarContenedor);		
		
		//this.jmenuDetalleDatosContenedor.add(this.jMenuItemDetalleAbrirOrderByContenedor);				
		this.jmenuDetalleDatosContenedor.add(this.jMenuItemDetalleMostarOcultarContenedor);				
				
		//this.jmenuDetalleAccionesContenedor.add(this.jMenuItemGuardarCambiosContenedor);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoContenedor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesContenedor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosContenedor, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleContenedor.add(this.jmenuDetalleArchivoContenedor);		
		this.jmenuBarDetalleContenedor.add(this.jmenuDetalleAccionesContenedor);		
		this.jmenuBarDetalleContenedor.add(this.jmenuDetalleDatosContenedor);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleContenedor);				
	}
	
	
	public void inicializarElementosCamposContenedor() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdContenedor = new JLabelMe();
		jLabelIdContenedor.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdContenedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdContenedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdContenedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdContenedor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidContenedor = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidContenedor.setToolTipText(ContenedorConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutContenedor= new GridBagLayout();

		this.jPanelidContenedor.setLayout(this.gridaBagLayoutContenedor);

		jLabelidContenedor = new JLabel();
		jLabelidContenedor.setText("Id");

		jLabelidContenedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidContenedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidContenedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnumeroContenedor = new JLabelMe();
		this.jLabelnumeroContenedor.setText(""+ContenedorConstantesFunciones.LABEL_NUMERO+" : *");
		this.jLabelnumeroContenedor.setToolTipText("Numero");
		this.jLabelnumeroContenedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumeroContenedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumeroContenedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumeroContenedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumeroContenedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumeroContenedor.setToolTipText(ContenedorConstantesFunciones.LABEL_NUMERO);
		this.gridaBagLayoutContenedor = new GridBagLayout();
		this.jPanelnumeroContenedor.setLayout(this.gridaBagLayoutContenedor);


		jTextFieldnumeroContenedor= new JTextFieldMe();

		jTextFieldnumeroContenedor.setEnabled(false);
		jTextFieldnumeroContenedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumeroContenedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumeroContenedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumeroContenedor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumeroContenedorBusqueda= new JButtonMe();
		this.jButtonnumeroContenedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumeroContenedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumeroContenedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumeroContenedorBusqueda.setText("U");
		this.jButtonnumeroContenedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumeroContenedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumeroContenedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumeroContenedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumeroContenedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numeroContenedorBusqueda"));

		if(this.contenedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumeroContenedorBusqueda.setVisible(false);		}


					
		this.jLabelnumero_blContenedor = new JLabelMe();
		this.jLabelnumero_blContenedor.setText(""+ContenedorConstantesFunciones.LABEL_NUMEROBL+" : *");
		this.jLabelnumero_blContenedor.setToolTipText("Numero Bl");
		this.jLabelnumero_blContenedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_blContenedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_blContenedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_blContenedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_blContenedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_blContenedor.setToolTipText(ContenedorConstantesFunciones.LABEL_NUMEROBL);
		this.gridaBagLayoutContenedor = new GridBagLayout();
		this.jPanelnumero_blContenedor.setLayout(this.gridaBagLayoutContenedor);


		jTextFieldnumero_blContenedor= new JTextFieldMe();

		jTextFieldnumero_blContenedor.setEnabled(false);
		jTextFieldnumero_blContenedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_blContenedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_blContenedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_blContenedor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_blContenedorBusqueda= new JButtonMe();
		this.jButtonnumero_blContenedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_blContenedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_blContenedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_blContenedorBusqueda.setText("U");
		this.jButtonnumero_blContenedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_blContenedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_blContenedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_blContenedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_blContenedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_blContenedorBusqueda"));

		if(this.contenedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_blContenedorBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionContenedor = new JLabelMe();
		this.jLabeldescripcionContenedor.setText(""+ContenedorConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionContenedor.setToolTipText("Descripcion");
		this.jLabeldescripcionContenedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionContenedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionContenedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionContenedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionContenedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionContenedor.setToolTipText(ContenedorConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutContenedor = new GridBagLayout();
		this.jPaneldescripcionContenedor.setLayout(this.gridaBagLayoutContenedor);


		jTextAreadescripcionContenedor= new JTextAreaMe();
		jTextAreadescripcionContenedor.setEnabled(false);
		jTextAreadescripcionContenedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionContenedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionContenedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionContenedor.setLineWrap(true);
		jTextAreadescripcionContenedor.setWrapStyleWord(true);
		jTextAreadescripcionContenedor.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionContenedor.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionContenedor,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionContenedor = new JScrollPane(jTextAreadescripcionContenedor);
		jscrollPanedescripcionContenedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionContenedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionContenedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionContenedorBusqueda= new JButtonMe();
		this.jButtondescripcionContenedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionContenedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionContenedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionContenedorBusqueda.setText("U");
		this.jButtondescripcionContenedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionContenedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionContenedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionContenedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionContenedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionContenedorBusqueda"));

		if(this.contenedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionContenedorBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysContenedor() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaContenedor = new JLabelMe();
		this.jLabelid_empresaContenedor.setText(""+ContenedorConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaContenedor.setToolTipText("Empresa");
		this.jLabelid_empresaContenedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaContenedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaContenedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaContenedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaContenedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaContenedor.setToolTipText(ContenedorConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutContenedor = new GridBagLayout();
		this.jPanelid_empresaContenedor.setLayout(this.gridaBagLayoutContenedor);


		jComboBoxid_empresaContenedor= new JComboBoxMe();
		jComboBoxid_empresaContenedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaContenedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaContenedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaContenedor,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaContenedor.setEnabled(false);

		this.jButtonid_empresaContenedor= new JButtonMe();
		this.jButtonid_empresaContenedor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaContenedor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaContenedor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaContenedor.setText("Buscar");
		this.jButtonid_empresaContenedor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaContenedor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaContenedor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaContenedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaContenedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaContenedor"));

		this.jButtonid_empresaContenedorBusqueda= new JButtonMe();
		this.jButtonid_empresaContenedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaContenedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaContenedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaContenedorBusqueda.setText("U");
		this.jButtonid_empresaContenedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaContenedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaContenedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaContenedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaContenedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaContenedorBusqueda"));

		if(this.contenedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaContenedorBusqueda.setVisible(false);		}

		this.jButtonid_empresaContenedorUpdate= new JButtonMe();
		this.jButtonid_empresaContenedorUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaContenedorUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaContenedorUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaContenedorUpdate.setText("U");
		this.jButtonid_empresaContenedorUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaContenedorUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaContenedorUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaContenedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaContenedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaContenedorUpdate"));



					
		this.jLabelid_sucursalContenedor = new JLabelMe();
		this.jLabelid_sucursalContenedor.setText(""+ContenedorConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalContenedor.setToolTipText("Sucursal");
		this.jLabelid_sucursalContenedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalContenedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalContenedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalContenedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalContenedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalContenedor.setToolTipText(ContenedorConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutContenedor = new GridBagLayout();
		this.jPanelid_sucursalContenedor.setLayout(this.gridaBagLayoutContenedor);


		jComboBoxid_sucursalContenedor= new JComboBoxMe();
		jComboBoxid_sucursalContenedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalContenedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalContenedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalContenedor,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalContenedor.setEnabled(false);

		this.jButtonid_sucursalContenedor= new JButtonMe();
		this.jButtonid_sucursalContenedor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalContenedor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalContenedor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalContenedor.setText("Buscar");
		this.jButtonid_sucursalContenedor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalContenedor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalContenedor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalContenedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalContenedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalContenedor"));

		this.jButtonid_sucursalContenedorBusqueda= new JButtonMe();
		this.jButtonid_sucursalContenedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalContenedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalContenedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalContenedorBusqueda.setText("U");
		this.jButtonid_sucursalContenedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalContenedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalContenedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalContenedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalContenedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalContenedorBusqueda"));

		if(this.contenedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalContenedorBusqueda.setVisible(false);		}

		this.jButtonid_sucursalContenedorUpdate= new JButtonMe();
		this.jButtonid_sucursalContenedorUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalContenedorUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalContenedorUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalContenedorUpdate.setText("U");
		this.jButtonid_sucursalContenedorUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalContenedorUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalContenedorUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalContenedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalContenedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalContenedorUpdate"));



					
		this.jLabelid_pedidoContenedor = new JLabelMe();
		this.jLabelid_pedidoContenedor.setText(""+ContenedorConstantesFunciones.LABEL_IDPEDIDO+" : *");
		this.jLabelid_pedidoContenedor.setToolTipText("Pedido");
		this.jLabelid_pedidoContenedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_pedidoContenedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_pedidoContenedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_pedidoContenedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_pedidoContenedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_pedidoContenedor.setToolTipText(ContenedorConstantesFunciones.LABEL_IDPEDIDO);
		this.gridaBagLayoutContenedor = new GridBagLayout();
		this.jPanelid_pedidoContenedor.setLayout(this.gridaBagLayoutContenedor);


		jComboBoxid_pedidoContenedor= new JComboBoxMe();
		jComboBoxid_pedidoContenedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_pedidoContenedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_pedidoContenedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_pedidoContenedor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_pedidoContenedor= new JButtonMe();
		this.jButtonid_pedidoContenedor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_pedidoContenedor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_pedidoContenedor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_pedidoContenedor.setText("Buscar");
		this.jButtonid_pedidoContenedor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_pedidoContenedor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_pedidoContenedor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_pedidoContenedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_pedidoContenedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_pedidoContenedor"));

		this.jButtonid_pedidoContenedorBusqueda= new JButtonMe();
		this.jButtonid_pedidoContenedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_pedidoContenedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_pedidoContenedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_pedidoContenedorBusqueda.setText("U");
		this.jButtonid_pedidoContenedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_pedidoContenedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_pedidoContenedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_pedidoContenedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_pedidoContenedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_pedidoContenedorBusqueda"));

		if(this.contenedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_pedidoContenedorBusqueda.setVisible(false);		}

		this.jButtonid_pedidoContenedorUpdate= new JButtonMe();
		this.jButtonid_pedidoContenedorUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_pedidoContenedorUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_pedidoContenedorUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_pedidoContenedorUpdate.setText("U");
		this.jButtonid_pedidoContenedorUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_pedidoContenedorUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_pedidoContenedorUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_pedidoContenedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_pedidoContenedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_pedidoContenedorUpdate"));



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
		//this.jInternalFrameDetalleContenedor = new ContenedorBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Contenedor DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutContenedor= new GridBagLayout();
		

		
		String sToolTipContenedor="";
		sToolTipContenedor=ContenedorConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipContenedor+="(Importaciones.Contenedor)";
		}
		
		if(!this.contenedorSessionBean.getEsGuardarRelacionado()) {
			sToolTipContenedor+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoContenedor = new JButtonMe();
		this.jButtonModificarContenedor = new JButtonMe();
        this.jButtonActualizarContenedor = new JButtonMe();
        this.jButtonEliminarContenedor = new JButtonMe();
        this.jButtonCancelarContenedor = new JButtonMe();
        this.jButtonGuardarCambiosContenedor = new JButtonMe();
		this.jButtonGuardarCambiosTablaContenedor = new JButtonMe();
		this.jButtonCerrarContenedor = new JButtonMe();
		
		this.jScrollPanelDatosContenedor = new JScrollPane();   
        this.jScrollPanelDatosEdicionContenedor = new JScrollPane();
		this.jScrollPanelDatosGeneralContenedor = new JScrollPane();
				
		
		
		this.jPanelCamposContenedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosContenedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesContenedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioContenedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Contenedor";
		
		if(!this.contenedorSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosContenedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Contenedores" + this.sPath));
		} else {
			this.jScrollPanelDatosContenedor.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionContenedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralContenedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposContenedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposContenedor.setName("jPanelCamposContenedor"); 

		this.jPanelCamposOcultosContenedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosContenedor.setName("jPanelCamposOcultosContenedor"); 

        this.jPanelAccionesContenedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesContenedor.setToolTipText("Acciones");
        this.jPanelAccionesContenedor.setName("Acciones"); 

		this.jPanelAccionesFormularioContenedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioContenedor.setToolTipText("Acciones");
        this.jPanelAccionesFormularioContenedor.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionContenedor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralContenedor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosContenedor, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposContenedor, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosContenedor, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioContenedor, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoContenedor.setText("Nuevo");
		this.jButtonModificarContenedor.setText("Editar");
        this.jButtonActualizarContenedor.setText("Actualizar");
        this.jButtonEliminarContenedor.setText("Eliminar");
        this.jButtonCancelarContenedor.setText("Cancelar");
        this.jButtonGuardarCambiosContenedor.setText("Guardar");
		this.jButtonGuardarCambiosTablaContenedor.setText("Guardar");
		this.jButtonCerrarContenedor.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoContenedor,"nuevo_button","Nuevo",this.contenedorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarContenedor,"modificar_button","Editar",this.contenedorSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarContenedor,"actualizar_button","Actualizar",this.contenedorSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarContenedor,"eliminar_button","Eliminar",this.contenedorSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarContenedor,"cancelar_button","Cancelar",this.contenedorSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosContenedor,"guardarcambios_button","Guardar",this.contenedorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaContenedor,"guardarcambiostabla_button","Guardar",this.contenedorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarContenedor,"cerrar_button","Salir",this.contenedorSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoContenedor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarContenedor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosContenedor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaContenedor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarContenedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarContenedor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarContenedor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarContenedor, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoContenedor.setToolTipText("Nuevo"+" "+ContenedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarContenedor.setToolTipText("Editar"+" "+ContenedorConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarContenedor.setToolTipText("Actualizar"+" "+ContenedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarContenedor.setToolTipText("Eliminar)"+" "+ContenedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarContenedor.setToolTipText("Cancelar"+" "+ContenedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosContenedor.setToolTipText("Guardar"+" "+ContenedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaContenedor.setToolTipText("Guardar"+" "+ContenedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarContenedor.setToolTipText("Salir"+" "+ContenedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoContenedor";
		inputMap = this.jButtonNuevoContenedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoContenedor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoContenedor"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarContenedor";
		inputMap = this.jButtonActualizarContenedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarContenedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarContenedor"));
		
		//ELIMINAR
		sMapKey = "EliminarContenedor";
		inputMap = this.jButtonEliminarContenedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarContenedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarContenedor"));
		
		//CANCELAR	
		sMapKey = "CancelarContenedor";
		inputMap = this.jButtonCancelarContenedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarContenedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarContenedor"));
		
		//CERRAR		
		sMapKey = "CerrarContenedor";
		inputMap = this.jButtonCerrarContenedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarContenedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarContenedor"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaContenedor";
		inputMap = this.jButtonGuardarCambiosTablaContenedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaContenedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaContenedor"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoContenedor = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoContenedor.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoContenedor.setToolTipText("Nuevo Contenedor");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoContenedor, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarContenedor = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarContenedor.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarContenedor.setToolTipText("Sin Cerrar Ventana Contenedor");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarContenedor, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeContenedor = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeContenedor.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeContenedor.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeContenedor, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesContenedor = new JComboBoxMe();
		//this.jComboBoxTiposAccionesContenedor.setText("Accion");
		this.jComboBoxTiposAccionesContenedor.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioContenedor = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioContenedor.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioContenedor.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesContenedor = new JLabelMe();
		
		this.jLabelAccionesContenedor.setText("Acciones");		
		this.jLabelAccionesContenedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesContenedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesContenedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposContenedor();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysContenedor();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesContenedor=new JTabbedPane();
		this.jTabbedPaneRelacionesContenedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesContenedor,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesContenedor.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesContenedor.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesContenedor.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesContenedor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioContenedor.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioContenedor.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioContenedor.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioContenedor, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposContenedor = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosContenedor = new GridBagLayout();
		
		this.jPanelCamposContenedor.setLayout(gridaBagLayoutCamposContenedor);
		this.jPanelCamposOcultosContenedor.setLayout(gridaBagLayoutCamposOcultosContenedor);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsContenedor = new GridBagConstraints();
	this.gridBagConstraintsContenedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsContenedor.gridy = 0;
	this.gridBagConstraintsContenedor.gridx = 0;
	this.gridBagConstraintsContenedor.ipadx = 0;
	this.gridBagConstraintsContenedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidContenedor.add(jLabelIdContenedor, this.gridBagConstraintsContenedor);



	this.gridBagConstraintsContenedor = new GridBagConstraints();
	this.gridBagConstraintsContenedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsContenedor.gridy = 0;
	this.gridBagConstraintsContenedor.gridx = 1;
	this.gridBagConstraintsContenedor.ipadx = 0;
	this.gridBagConstraintsContenedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidContenedor.add(jLabelidContenedor, this.gridBagConstraintsContenedor);


	this.gridBagConstraintsContenedor = new GridBagConstraints();
	this.gridBagConstraintsContenedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsContenedor.gridy = 0;
	this.gridBagConstraintsContenedor.gridx = 0;
	this.gridBagConstraintsContenedor.ipadx = 0;
	this.gridBagConstraintsContenedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaContenedor.add(jLabelid_empresaContenedor, this.gridBagConstraintsContenedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsContenedor = new GridBagConstraints();
		//this.gridBagConstraintsContenedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsContenedor.gridy = 0;
		this.gridBagConstraintsContenedor.gridx = 2;
		this.gridBagConstraintsContenedor.ipadx = 0;
		this.gridBagConstraintsContenedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaContenedor.add(jButtonid_empresaContenedorBusqueda, this.gridBagConstraintsContenedor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsContenedor = new GridBagConstraints();
		//this.gridBagConstraintsContenedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsContenedor.gridy = 0;
		this.gridBagConstraintsContenedor.gridx = 3;
		this.gridBagConstraintsContenedor.ipadx = 0;
		this.gridBagConstraintsContenedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaContenedor.add(jButtonid_empresaContenedorUpdate, this.gridBagConstraintsContenedor);
	}

	this.gridBagConstraintsContenedor = new GridBagConstraints();
	this.gridBagConstraintsContenedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsContenedor.gridy = 0;
	this.gridBagConstraintsContenedor.gridx = 1;
	this.gridBagConstraintsContenedor.ipadx = 0;
	this.gridBagConstraintsContenedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaContenedor.add(jComboBoxid_empresaContenedor, this.gridBagConstraintsContenedor);


	this.gridBagConstraintsContenedor = new GridBagConstraints();
	this.gridBagConstraintsContenedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsContenedor.gridy = 0;
	this.gridBagConstraintsContenedor.gridx = 0;
	this.gridBagConstraintsContenedor.ipadx = 0;
	this.gridBagConstraintsContenedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalContenedor.add(jLabelid_sucursalContenedor, this.gridBagConstraintsContenedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsContenedor = new GridBagConstraints();
		//this.gridBagConstraintsContenedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsContenedor.gridy = 0;
		this.gridBagConstraintsContenedor.gridx = 2;
		this.gridBagConstraintsContenedor.ipadx = 0;
		this.gridBagConstraintsContenedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalContenedor.add(jButtonid_sucursalContenedorBusqueda, this.gridBagConstraintsContenedor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsContenedor = new GridBagConstraints();
		//this.gridBagConstraintsContenedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsContenedor.gridy = 0;
		this.gridBagConstraintsContenedor.gridx = 3;
		this.gridBagConstraintsContenedor.ipadx = 0;
		this.gridBagConstraintsContenedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalContenedor.add(jButtonid_sucursalContenedorUpdate, this.gridBagConstraintsContenedor);
	}

	this.gridBagConstraintsContenedor = new GridBagConstraints();
	this.gridBagConstraintsContenedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsContenedor.gridy = 0;
	this.gridBagConstraintsContenedor.gridx = 1;
	this.gridBagConstraintsContenedor.ipadx = 0;
	this.gridBagConstraintsContenedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalContenedor.add(jComboBoxid_sucursalContenedor, this.gridBagConstraintsContenedor);


	this.gridBagConstraintsContenedor = new GridBagConstraints();
	this.gridBagConstraintsContenedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsContenedor.gridy = 0;
	this.gridBagConstraintsContenedor.gridx = 0;
	this.gridBagConstraintsContenedor.ipadx = 0;
	this.gridBagConstraintsContenedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_pedidoContenedor.add(jLabelid_pedidoContenedor, this.gridBagConstraintsContenedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsContenedor = new GridBagConstraints();
		//this.gridBagConstraintsContenedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsContenedor.gridy = 0;
		this.gridBagConstraintsContenedor.gridx = 2;
		this.gridBagConstraintsContenedor.ipadx = 0;
		this.gridBagConstraintsContenedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_pedidoContenedor.add(jButtonid_pedidoContenedorBusqueda, this.gridBagConstraintsContenedor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsContenedor = new GridBagConstraints();
		//this.gridBagConstraintsContenedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsContenedor.gridy = 0;
		this.gridBagConstraintsContenedor.gridx = 3;
		this.gridBagConstraintsContenedor.ipadx = 0;
		this.gridBagConstraintsContenedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_pedidoContenedor.add(jButtonid_pedidoContenedorUpdate, this.gridBagConstraintsContenedor);
	}

	this.gridBagConstraintsContenedor = new GridBagConstraints();
	this.gridBagConstraintsContenedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsContenedor.gridy = 0;
	this.gridBagConstraintsContenedor.gridx = 1;
	this.gridBagConstraintsContenedor.ipadx = 0;
	this.gridBagConstraintsContenedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_pedidoContenedor.add(jComboBoxid_pedidoContenedor, this.gridBagConstraintsContenedor);


	this.gridBagConstraintsContenedor = new GridBagConstraints();
	this.gridBagConstraintsContenedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsContenedor.gridy = 0;
	this.gridBagConstraintsContenedor.gridx = 0;
	this.gridBagConstraintsContenedor.ipadx = 0;
	this.gridBagConstraintsContenedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumeroContenedor.add(jLabelnumeroContenedor, this.gridBagConstraintsContenedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsContenedor = new GridBagConstraints();
		//this.gridBagConstraintsContenedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsContenedor.gridy = 0;
		this.gridBagConstraintsContenedor.gridx = 2;
		this.gridBagConstraintsContenedor.ipadx = 0;
		this.gridBagConstraintsContenedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumeroContenedor.add(jButtonnumeroContenedorBusqueda, this.gridBagConstraintsContenedor);
	}

	this.gridBagConstraintsContenedor = new GridBagConstraints();
	this.gridBagConstraintsContenedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsContenedor.gridy = 0;
	this.gridBagConstraintsContenedor.gridx = 1;
	this.gridBagConstraintsContenedor.ipadx = 0;
	this.gridBagConstraintsContenedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumeroContenedor.add(jTextFieldnumeroContenedor, this.gridBagConstraintsContenedor);


	this.gridBagConstraintsContenedor = new GridBagConstraints();
	this.gridBagConstraintsContenedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsContenedor.gridy = 0;
	this.gridBagConstraintsContenedor.gridx = 0;
	this.gridBagConstraintsContenedor.ipadx = 0;
	this.gridBagConstraintsContenedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_blContenedor.add(jLabelnumero_blContenedor, this.gridBagConstraintsContenedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsContenedor = new GridBagConstraints();
		//this.gridBagConstraintsContenedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsContenedor.gridy = 0;
		this.gridBagConstraintsContenedor.gridx = 2;
		this.gridBagConstraintsContenedor.ipadx = 0;
		this.gridBagConstraintsContenedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_blContenedor.add(jButtonnumero_blContenedorBusqueda, this.gridBagConstraintsContenedor);
	}

	this.gridBagConstraintsContenedor = new GridBagConstraints();
	this.gridBagConstraintsContenedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsContenedor.gridy = 0;
	this.gridBagConstraintsContenedor.gridx = 1;
	this.gridBagConstraintsContenedor.ipadx = 0;
	this.gridBagConstraintsContenedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_blContenedor.add(jTextFieldnumero_blContenedor, this.gridBagConstraintsContenedor);


	this.gridBagConstraintsContenedor = new GridBagConstraints();
	this.gridBagConstraintsContenedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsContenedor.gridy = 0;
	this.gridBagConstraintsContenedor.gridx = 0;
	this.gridBagConstraintsContenedor.ipadx = 0;
	this.gridBagConstraintsContenedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionContenedor.add(jLabeldescripcionContenedor, this.gridBagConstraintsContenedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsContenedor = new GridBagConstraints();
		//this.gridBagConstraintsContenedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsContenedor.gridy = 0;
		this.gridBagConstraintsContenedor.gridx = 2;
		this.gridBagConstraintsContenedor.ipadx = 0;
		this.gridBagConstraintsContenedor.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionContenedor.add(jButtondescripcionContenedorBusqueda, this.gridBagConstraintsContenedor);
	}

	this.gridBagConstraintsContenedor = new GridBagConstraints();
	this.gridBagConstraintsContenedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsContenedor.gridy = 0;
	this.gridBagConstraintsContenedor.gridx = 1;
	this.gridBagConstraintsContenedor.ipadx = 0;
	this.gridBagConstraintsContenedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionContenedor.add(jscrollPanedescripcionContenedor, this.gridBagConstraintsContenedor);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsContenedor = new GridBagConstraints();
	this.gridBagConstraintsContenedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsContenedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsContenedor.gridy = iYPanelCamposContenedor;
	this.gridBagConstraintsContenedor.gridx = iXPanelCamposContenedor++;
	this.gridBagConstraintsContenedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsContenedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposContenedor.add(this.jPanelidContenedor, this.gridBagConstraintsContenedor);



	if(iXPanelCamposContenedor % 1==0) {
		iXPanelCamposContenedor=0;
		iYPanelCamposContenedor++;
	}
	this.gridBagConstraintsContenedor = new GridBagConstraints();
	this.gridBagConstraintsContenedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsContenedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsContenedor.gridy = iYPanelCamposContenedor;
	this.gridBagConstraintsContenedor.gridx = iXPanelCamposContenedor++;
	this.gridBagConstraintsContenedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsContenedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposContenedor.add(this.jPanelid_pedidoContenedor, this.gridBagConstraintsContenedor);



	if(iXPanelCamposContenedor % 1==0) {
		iXPanelCamposContenedor=0;
		iYPanelCamposContenedor++;
	}
	this.gridBagConstraintsContenedor = new GridBagConstraints();
	this.gridBagConstraintsContenedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsContenedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsContenedor.gridy = iYPanelCamposContenedor;
	this.gridBagConstraintsContenedor.gridx = iXPanelCamposContenedor++;
	this.gridBagConstraintsContenedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsContenedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposContenedor.add(this.jPanelnumeroContenedor, this.gridBagConstraintsContenedor);



	if(iXPanelCamposContenedor % 1==0) {
		iXPanelCamposContenedor=0;
		iYPanelCamposContenedor++;
	}
	this.gridBagConstraintsContenedor = new GridBagConstraints();
	this.gridBagConstraintsContenedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsContenedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsContenedor.gridy = iYPanelCamposContenedor;
	this.gridBagConstraintsContenedor.gridx = iXPanelCamposContenedor++;
	this.gridBagConstraintsContenedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsContenedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposContenedor.add(this.jPanelnumero_blContenedor, this.gridBagConstraintsContenedor);



	if(iXPanelCamposContenedor % 1==0) {
		iXPanelCamposContenedor=0;
		iYPanelCamposContenedor++;
	}
	this.gridBagConstraintsContenedor = new GridBagConstraints();
	this.gridBagConstraintsContenedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsContenedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsContenedor.gridy = iYPanelCamposContenedor;
	this.gridBagConstraintsContenedor.gridx = iXPanelCamposContenedor++;
	this.gridBagConstraintsContenedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsContenedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposContenedor.add(this.jPaneldescripcionContenedor, this.gridBagConstraintsContenedor);



	if(iXPanelCamposContenedor % 1==0) {
		iXPanelCamposContenedor=0;
		iYPanelCamposContenedor++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsContenedor = new GridBagConstraints();
	this.gridBagConstraintsContenedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsContenedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsContenedor.gridy = iYPanelCamposOcultosContenedor;
	this.gridBagConstraintsContenedor.gridx = iXPanelCamposOcultosContenedor++;
	this.gridBagConstraintsContenedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsContenedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosContenedor.add(this.jPanelid_empresaContenedor, this.gridBagConstraintsContenedor);



	if(iXPanelCamposOcultosContenedor % 1==0) {
		iXPanelCamposOcultosContenedor=0;
		iYPanelCamposOcultosContenedor++;
	}
	this.gridBagConstraintsContenedor = new GridBagConstraints();
	this.gridBagConstraintsContenedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsContenedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsContenedor.gridy = iYPanelCamposOcultosContenedor;
	this.gridBagConstraintsContenedor.gridx = iXPanelCamposOcultosContenedor++;
	this.gridBagConstraintsContenedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsContenedor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosContenedor.add(this.jPanelid_sucursalContenedor, this.gridBagConstraintsContenedor);



	if(iXPanelCamposOcultosContenedor % 1==0) {
		iXPanelCamposOcultosContenedor=0;
		iYPanelCamposOcultosContenedor++;
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
			
		GridBagLayout gridaBagLayoutAccionesContenedor= new GridBagLayout();
		this.jPanelAccionesContenedor.setLayout(gridaBagLayoutAccionesContenedor);
		
		GridBagLayout gridaBagLayoutAccionesFormularioContenedor= new GridBagLayout();
		this.jPanelAccionesFormularioContenedor.setLayout(gridaBagLayoutAccionesFormularioContenedor);
		
		this.gridBagConstraintsContenedor = new GridBagConstraints();
		this.gridBagConstraintsContenedor.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsContenedor.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioContenedor.add(this.jComboBoxTiposAccionesFormularioContenedor, this.gridBagConstraintsContenedor);

		this.gridBagConstraintsContenedor = new GridBagConstraints();
		this.gridBagConstraintsContenedor.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsContenedor.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioContenedor.add(this.jCheckBoxPostAccionNuevoContenedor, this.gridBagConstraintsContenedor);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.contenedorSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsContenedor = new GridBagConstraints();
			this.gridBagConstraintsContenedor.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsContenedor.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioContenedor.add(this.jCheckBoxPostAccionSinCerrarContenedor, this.gridBagConstraintsContenedor);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.contenedorSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.contenedorSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsContenedor = new GridBagConstraints();
			this.gridBagConstraintsContenedor.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsContenedor.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioContenedor.add(this.jCheckBoxPostAccionSinMensajeContenedor, this.gridBagConstraintsContenedor);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsContenedor = new GridBagConstraints();
		this.gridBagConstraintsContenedor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsContenedor.gridy = 0;
		this.gridBagConstraintsContenedor.gridx = iPosXAccion++;
			
		this.jPanelAccionesContenedor.add(this.jButtonModificarContenedor, this.gridBagConstraintsContenedor);							

		this.gridBagConstraintsContenedor = new GridBagConstraints();
		this.gridBagConstraintsContenedor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsContenedor.gridy = 0;
		this.gridBagConstraintsContenedor.gridx =iPosXAccion++;
			
		this.jPanelAccionesContenedor.add(this.jButtonEliminarContenedor, this.gridBagConstraintsContenedor);
		
			
		this.gridBagConstraintsContenedor = new GridBagConstraints();
		this.gridBagConstraintsContenedor.gridy = 0;		
		this.gridBagConstraintsContenedor.gridx = iPosXAccion++;
		
		this.jPanelAccionesContenedor.add(this.jButtonActualizarContenedor, this.gridBagConstraintsContenedor);


		this.gridBagConstraintsContenedor = new GridBagConstraints();
		this.gridBagConstraintsContenedor.gridy = 0;		
		this.gridBagConstraintsContenedor.gridx = iPosXAccion++;
		
		this.jPanelAccionesContenedor.add(this.jButtonGuardarCambiosContenedor, this.gridBagConstraintsContenedor);	
		
		this.gridBagConstraintsContenedor = new GridBagConstraints();
		this.gridBagConstraintsContenedor.gridy = 0;		
		this.gridBagConstraintsContenedor.gridx =iPosXAccion++;
		
		this.jPanelAccionesContenedor.add(this.jButtonCancelarContenedor, this.gridBagConstraintsContenedor);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutContenedor = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutContenedor);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.contenedorSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsContenedor = new GridBagConstraints();						
			this.gridBagConstraintsContenedor.gridy = iGridyPrincipal++;
			this.gridBagConstraintsContenedor.gridx = 0;		
			//this.gridBagConstraintsContenedor.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsContenedor.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsContenedor.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsContenedor = new GridBagConstraints();
		this.gridBagConstraintsContenedor.gridy =iGridyPrincipal++;
		this.gridBagConstraintsContenedor.gridx =0;
		this.gridBagConstraintsContenedor.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsContenedor.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosContenedor, this.gridBagConstraintsContenedor);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ContenedorJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleContenedor = new ContenedorBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Contenedor DATOS");
			
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
			
	        //this.setTitle("[FOR] - Contenedor DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Contenedor Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ContenedorModel contenedorModel=new ContenedorModel(this);
			
			//SI USARA CLASE INTERNA
			//ContenedorModel.ContenedorFocusTraversalPolicy contenedorFocusTraversalPolicy = contenedorModel.new ContenedorFocusTraversalPolicy(this);
			
			//contenedorFocusTraversalPolicy.setcontenedorJInternalFrame(this);
			
			this.setFocusTraversalPolicy(contenedorModel);
			
			
			this.jContentPaneDetalleContenedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleContenedor = new GridBagLayout();	
			this.jContentPaneDetalleContenedor.setLayout(gridaBagLayoutDetalleContenedor);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosContenedor = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsContenedor = new GridBagConstraints();
				this.gridBagConstraintsContenedor.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsContenedor.gridx = 0;
					
				
				this.jContentPaneDetalleContenedor.add(jTtoolBarDetalleContenedor, gridBagConstraintsContenedor);								
				
}
			
			this.jScrollPanelDatosEdicionContenedor=   new JScrollPane(jContentPaneDetalleContenedor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionContenedor.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionContenedor.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionContenedor.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralContenedor=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralContenedor.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralContenedor.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralContenedor.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsContenedor = new GridBagConstraints();
			
			
	        this.gridBagConstraintsContenedor.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsContenedor.gridx = 0;
	        
			this.jContentPaneDetalleContenedor.add(jPanelCamposContenedor, gridBagConstraintsContenedor);
			
			
			
			
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
						&& contenedorSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.contenedorSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsContenedor= new GridBagConstraints();
						this.gridBagConstraintsContenedor.gridy = iGridyRelaciones++;
						this.gridBagConstraintsContenedor.gridx = 0;
						this.jContentPaneDetalleContenedor.add(this.jTabbedPaneRelacionesContenedor, this.gridBagConstraintsContenedor);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesContenedor.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosContenedor.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsContenedor = new GridBagConstraints();
					this.gridBagConstraintsContenedor.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsContenedor.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsContenedor.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsContenedor.gridx = 0;
					
				
					this.jContentPaneDetalleContenedor.add(jPanelCamposOcultosContenedor, gridBagConstraintsContenedor);
				
					this.jPanelCamposOcultosContenedor.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsContenedor = new GridBagConstraints();
			this.gridBagConstraintsContenedor.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsContenedor.gridx = 0;
	        this.gridBagConstraintsContenedor.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleContenedor.add(this.jPanelAccionesFormularioContenedor, this.gridBagConstraintsContenedor);							
			
			
			
			this.gridBagConstraintsContenedor = new GridBagConstraints();
	        this.gridBagConstraintsContenedor.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsContenedor.gridx = 0;
	        
			
			this.jContentPaneDetalleContenedor.add(this.jPanelAccionesContenedor, this.gridBagConstraintsContenedor);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionContenedor);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionContenedor=   new JScrollPane(this.jPanelCamposContenedor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionContenedor.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionContenedor.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionContenedor.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsContenedor = new GridBagConstraints();
			this.gridBagConstraintsContenedor.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsContenedor.gridx = 0;
			this.gridBagConstraintsContenedor.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsContenedor.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsContenedor.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionContenedor, this.gridBagConstraintsContenedor);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsContenedor = new GridBagConstraints();
			this.gridBagConstraintsContenedor.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsContenedor.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioContenedor, this.gridBagConstraintsContenedor);			
			
			this.gridBagConstraintsContenedor = new GridBagConstraints();
			this.gridBagConstraintsContenedor.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsContenedor.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesContenedor, this.gridBagConstraintsContenedor);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsContenedor = new GridBagConstraints();
		this.gridBagConstraintsContenedor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsContenedor.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposContenedor, this.gridBagConstraintsContenedor);
			
			
		this.gridBagConstraintsContenedor = new GridBagConstraints();
		this.gridBagConstraintsContenedor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsContenedor.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosContenedor, this.gridBagConstraintsContenedor);
		
			
		this.gridBagConstraintsContenedor = new GridBagConstraints();
		this.gridBagConstraintsContenedor.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsContenedor.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesContenedor, this.gridBagConstraintsContenedor);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralContenedor;//jContentPane;
		
		return jScrollPanelDatosEdicionContenedor;
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
