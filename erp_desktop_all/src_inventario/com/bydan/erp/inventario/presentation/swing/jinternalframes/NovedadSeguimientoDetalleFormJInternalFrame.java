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
import com.bydan.erp.inventario.util.NovedadSeguimientoConstantesFunciones;

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
public class NovedadSeguimientoDetalleFormJInternalFrame extends NovedadSeguimientoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleNovedadSeguimiento;
	
	protected JMenuBar jmenuBarDetalleNovedadSeguimiento;
	
	protected JMenu jmenuDetalleNovedadSeguimiento;
	protected JMenu jmenuDetalleArchivoNovedadSeguimiento;
	protected JMenu jmenuDetalleAccionesNovedadSeguimiento;
	protected JMenu jmenuDetalleDatosNovedadSeguimiento;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleNovedadSeguimiento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutNovedadSeguimiento;	
	protected GridBagConstraints gridBagConstraintsNovedadSeguimiento;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected NovedadSeguimientoBeanSwingJInternalFrameAdditional jInternalFrameDetalleNovedadSeguimiento;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected DetalleMovimientoInventarioBeanSwingJInternalFrame detallemovimientoinventarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_detallemovimientoinventario="";

	protected NovedadProductoBeanSwingJInternalFrame novedadproductoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_novedadproducto="";

	protected EstadoNovedadSeguimientoBeanSwingJInternalFrame estadonovedadseguimientoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadonovedadseguimiento="";
	
	public NovedadSeguimientoSessionBean novedadseguimientoSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public DetalleMovimientoInventarioSessionBean detallemovimientoinventarioSessionBean;
	public NovedadProductoSessionBean novedadproductoSessionBean;
	public EstadoNovedadSeguimientoSessionBean estadonovedadseguimientoSessionBean;	
	
	public NovedadSeguimientoLogic novedadseguimientoLogic;
	
	public JScrollPane jScrollPanelDatosNovedadSeguimiento;
	public JScrollPane jScrollPanelDatosEdicionNovedadSeguimiento;
	public JScrollPane jScrollPanelDatosGeneralNovedadSeguimiento;
	
	protected JPanel jPanelCamposNovedadSeguimiento;    
	protected JPanel jPanelCamposOcultosNovedadSeguimiento;    	
	protected JPanel jPanelAccionesNovedadSeguimiento;
	protected JPanel jPanelAccionesFormularioNovedadSeguimiento;
    
	
	
	protected Integer iXPanelCamposNovedadSeguimiento=0;
	protected Integer iYPanelCamposNovedadSeguimiento=0;
	
	protected Integer iXPanelCamposOcultosNovedadSeguimiento=0;
	protected Integer iYPanelCamposOcultosNovedadSeguimiento=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoNovedadSeguimiento;
	public JButton jButtonModificarNovedadSeguimiento;
	public JButton jButtonActualizarNovedadSeguimiento;
    public JButton jButtonEliminarNovedadSeguimiento;
	public JButton jButtonCancelarNovedadSeguimiento;
    public JButton jButtonGuardarCambiosNovedadSeguimiento;
	public JButton jButtonGuardarCambiosTablaNovedadSeguimiento;
	protected JButton jButtonCerrarNovedadSeguimiento;
	
	
	protected JButton jButtonProcesarInformacionNovedadSeguimiento;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoNovedadSeguimiento;
	protected JCheckBox jCheckBoxPostAccionSinCerrarNovedadSeguimiento;
	protected JCheckBox jCheckBoxPostAccionSinMensajeNovedadSeguimiento;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarNovedadSeguimiento;
	protected JButton jButtonModificarToolBarNovedadSeguimiento;
	protected JButton jButtonActualizarToolBarNovedadSeguimiento;
    protected JButton jButtonEliminarToolBarNovedadSeguimiento;
	protected JButton jButtonCancelarToolBarNovedadSeguimiento;
    protected JButton jButtonGuardarCambiosToolBarNovedadSeguimiento;
	protected JButton jButtonGuardarCambiosTablaToolBarNovedadSeguimiento;
	protected JButton jButtonMostrarOcultarTablaToolBarNovedadSeguimiento;
	protected JButton jButtonCerrarToolBarNovedadSeguimiento;
	
	protected JButton jButtonProcesarInformacionToolBarNovedadSeguimiento;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoNovedadSeguimiento;
	protected JMenuItem jMenuItemModificarNovedadSeguimiento;
	protected JMenuItem jMenuItemActualizarNovedadSeguimiento;
    protected JMenuItem jMenuItemEliminarNovedadSeguimiento;
	protected JMenuItem jMenuItemCancelarNovedadSeguimiento;
    protected JMenuItem jMenuItemGuardarCambiosNovedadSeguimiento;
	protected JMenuItem jMenuItemGuardarCambiosTablaNovedadSeguimiento;
	protected JMenuItem jMenuItemCerrarNovedadSeguimiento;
	protected JMenuItem jMenuItemDetalleCerrarNovedadSeguimiento;
	protected JMenuItem jMenuItemDetalleMostarOcultarNovedadSeguimiento;
	
	protected JMenuItem jMenuItemProcesarInformacionNovedadSeguimiento;
	protected JMenuItem jMenuItemNuevoGuardarCambiosNovedadSeguimiento;
	protected JMenuItem jMenuItemMostrarOcultarNovedadSeguimiento;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesNovedadSeguimiento;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesNovedadSeguimiento;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesNovedadSeguimiento;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioNovedadSeguimiento;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidNovedadSeguimiento;
	public JLabel jLabelIdNovedadSeguimiento;
	public JLabel jLabelidNovedadSeguimiento;
	public JButton jButtonidNovedadSeguimientoBusqueda= new JButtonMe();

	public JPanel jPanelnumero_comprobanteNovedadSeguimiento;
	public JLabel jLabelnumero_comprobanteNovedadSeguimiento;
	public JTextField jTextFieldnumero_comprobanteNovedadSeguimiento;
	public JButton jButtonnumero_comprobanteNovedadSeguimientoBusqueda= new JButtonMe();

	public JPanel jPanelfecha_novedadNovedadSeguimiento;
	public JLabel jLabelfecha_novedadNovedadSeguimiento;
	//public JFormattedTextField jDateChooserfecha_novedadNovedadSeguimiento;

	public JDateChooser jDateChooserfecha_novedadNovedadSeguimiento;
	public JButton jButtonfecha_novedadNovedadSeguimientoBusqueda= new JButtonMe();

	public JPanel jPanelfecha_seguimientoNovedadSeguimiento;
	public JLabel jLabelfecha_seguimientoNovedadSeguimiento;
	//public JFormattedTextField jDateChooserfecha_seguimientoNovedadSeguimiento;

	public JDateChooser jDateChooserfecha_seguimientoNovedadSeguimiento;
	public JButton jButtonfecha_seguimientoNovedadSeguimientoBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionNovedadSeguimiento;
	public JLabel jLabeldescripcionNovedadSeguimiento;
	public JTextArea jTextAreadescripcionNovedadSeguimiento;
	public JScrollPane jscrollPanedescripcionNovedadSeguimiento;
	public JButton jButtondescripcionNovedadSeguimientoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaNovedadSeguimiento;
	public JLabel jLabelid_empresaNovedadSeguimiento;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaNovedadSeguimiento;
	public JButton jButtonid_empresaNovedadSeguimiento= new JButtonMe();
	public JButton jButtonid_empresaNovedadSeguimientoUpdate= new JButtonMe();
	public JButton jButtonid_empresaNovedadSeguimientoBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalNovedadSeguimiento;
	public JLabel jLabelid_sucursalNovedadSeguimiento;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalNovedadSeguimiento;
	public JButton jButtonid_sucursalNovedadSeguimiento= new JButtonMe();
	public JButton jButtonid_sucursalNovedadSeguimientoUpdate= new JButtonMe();
	public JButton jButtonid_sucursalNovedadSeguimientoBusqueda= new JButtonMe();

	public JPanel jPanelid_detalle_movimiento_inventarioNovedadSeguimiento;
	public JLabel jLabelid_detalle_movimiento_inventarioNovedadSeguimiento;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_detalle_movimiento_inventarioNovedadSeguimiento;
	public JButton jButtonid_detalle_movimiento_inventarioNovedadSeguimiento= new JButtonMe();
	public JButton jButtonid_detalle_movimiento_inventarioNovedadSeguimientoUpdate= new JButtonMe();
	public JButton jButtonid_detalle_movimiento_inventarioNovedadSeguimientoBusqueda= new JButtonMe();

	public JPanel jPanelid_novedad_productoNovedadSeguimiento;
	public JLabel jLabelid_novedad_productoNovedadSeguimiento;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_novedad_productoNovedadSeguimiento;
	public JButton jButtonid_novedad_productoNovedadSeguimiento= new JButtonMe();
	public JButton jButtonid_novedad_productoNovedadSeguimientoUpdate= new JButtonMe();
	public JButton jButtonid_novedad_productoNovedadSeguimientoBusqueda= new JButtonMe();

	public JPanel jPanelid_estado_novedad_seguimientoNovedadSeguimiento;
	public JLabel jLabelid_estado_novedad_seguimientoNovedadSeguimiento;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_novedad_seguimientoNovedadSeguimiento;
	public JButton jButtonid_estado_novedad_seguimientoNovedadSeguimiento= new JButtonMe();
	public JButton jButtonid_estado_novedad_seguimientoNovedadSeguimientoUpdate= new JButtonMe();
	public JButton jButtonid_estado_novedad_seguimientoNovedadSeguimientoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesNovedadSeguimiento;
	
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
	public int iHeightFormulario=638;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public NovedadSeguimientoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposNovedadSeguimiento=new JPanel();
				this.jPanelAccionesFormularioNovedadSeguimiento=new JPanel();
				this.jmenuBarDetalleNovedadSeguimiento=new JMenuBar();
				this.jTtoolBarDetalleNovedadSeguimiento=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NovedadSeguimientoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("NovedadSeguimiento No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public NovedadSeguimientoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("NovedadSeguimiento No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NovedadSeguimientoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("NovedadSeguimiento No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NovedadSeguimientoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("NovedadSeguimiento No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NovedadSeguimientoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("NovedadSeguimiento No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarNovedadSeguimiento() {
		return this.jButtonActualizarToolBarNovedadSeguimiento;
	}
	
	public JButton getjButtonEliminarToolBarNovedadSeguimiento() {
		return this.jButtonEliminarToolBarNovedadSeguimiento;
	}
	
	public JButton getjButtonCancelarToolBarNovedadSeguimiento() {
		return this.jButtonCancelarToolBarNovedadSeguimiento;
	}		
	
	public JButton getjButtonProcesarInformacionNovedadSeguimiento() {
		return this.jButtonProcesarInformacionNovedadSeguimiento;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionNovedadSeguimiento)	{
		this.jButtonProcesarInformacionNovedadSeguimiento = jButtonProcesarInformacionNovedadSeguimiento;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesNovedadSeguimiento() {
		return this.jComboBoxTiposAccionesNovedadSeguimiento;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesNovedadSeguimiento(
			JComboBox jComboBoxTiposRelacionesNovedadSeguimiento) {
		this.jComboBoxTiposRelacionesNovedadSeguimiento = jComboBoxTiposRelacionesNovedadSeguimiento;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesNovedadSeguimiento(
			JComboBox jComboBoxTiposAccionesNovedadSeguimiento) {
		this.jComboBoxTiposAccionesNovedadSeguimiento = jComboBoxTiposAccionesNovedadSeguimiento;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioNovedadSeguimiento() {
		return this.jComboBoxTiposAccionesFormularioNovedadSeguimiento;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioNovedadSeguimiento(
			JComboBox jComboBoxTiposAccionesFormularioNovedadSeguimiento) {
		this.jComboBoxTiposAccionesFormularioNovedadSeguimiento = jComboBoxTiposAccionesFormularioNovedadSeguimiento;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.novedadseguimientoSessionBean=new NovedadSeguimientoSessionBean();
		
		this.novedadseguimientoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.novedadseguimientoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.novedadseguimientoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		NovedadSeguimientoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		NovedadSeguimientoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		NovedadSeguimientoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Novedad Seguimiento MANTENIMIENTO"));
		
		
		if(iWidth > 950) {
			iWidth=950;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.novedadseguimientoSessionBean.getEsGuardarRelacionado()) {
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
	
		NovedadSeguimientoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleNovedadSeguimiento= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarNovedadSeguimiento=new JButtonMe();
				this.jButtonModificarToolBarNovedadSeguimiento=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarNovedadSeguimiento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarNovedadSeguimiento,this.jTtoolBarDetalleNovedadSeguimiento,
							"actualizar","actualizar","Actualizar"+" "+NovedadSeguimientoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarNovedadSeguimiento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarNovedadSeguimiento,this.jTtoolBarDetalleNovedadSeguimiento,
							"eliminar","eliminar","Eliminar"+" "+NovedadSeguimientoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarNovedadSeguimiento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarNovedadSeguimiento,this.jTtoolBarDetalleNovedadSeguimiento,
							"cancelar","cancelar","Cancelar"+" "+NovedadSeguimientoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarNovedadSeguimiento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarNovedadSeguimiento,this.jTtoolBarDetalleNovedadSeguimiento,
							"guardarcambios","guardarcambios","Guardar"+" "+NovedadSeguimientoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarNovedadSeguimiento,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarNovedadSeguimiento,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarNovedadSeguimiento,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleNovedadSeguimiento=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleNovedadSeguimiento=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoNovedadSeguimiento=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesNovedadSeguimiento=new JMenuMe("Acciones");
		this.jmenuDetalleDatosNovedadSeguimiento=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoNovedadSeguimiento= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoNovedadSeguimiento.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoNovedadSeguimiento,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarNovedadSeguimiento= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarNovedadSeguimiento.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarNovedadSeguimiento,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarNovedadSeguimiento= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarNovedadSeguimiento.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarNovedadSeguimiento,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarNovedadSeguimiento= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarNovedadSeguimiento.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarNovedadSeguimiento,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarNovedadSeguimiento= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarNovedadSeguimiento.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarNovedadSeguimiento,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosNovedadSeguimiento= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosNovedadSeguimiento.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosNovedadSeguimiento,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarNovedadSeguimiento= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarNovedadSeguimiento.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarNovedadSeguimiento,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarNovedadSeguimiento= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarNovedadSeguimiento.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarNovedadSeguimiento,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarNovedadSeguimiento= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarNovedadSeguimiento.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarNovedadSeguimiento,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarNovedadSeguimiento= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarNovedadSeguimiento.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarNovedadSeguimiento,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoNovedadSeguimiento.add(this.jMenuItemDetalleCerrarNovedadSeguimiento);
		
		this.jmenuDetalleAccionesNovedadSeguimiento.add(this.jMenuItemActualizarNovedadSeguimiento);
		this.jmenuDetalleAccionesNovedadSeguimiento.add(this.jMenuItemEliminarNovedadSeguimiento);
		this.jmenuDetalleAccionesNovedadSeguimiento.add(this.jMenuItemCancelarNovedadSeguimiento);		
		
		//this.jmenuDetalleDatosNovedadSeguimiento.add(this.jMenuItemDetalleAbrirOrderByNovedadSeguimiento);				
		this.jmenuDetalleDatosNovedadSeguimiento.add(this.jMenuItemDetalleMostarOcultarNovedadSeguimiento);				
				
		//this.jmenuDetalleAccionesNovedadSeguimiento.add(this.jMenuItemGuardarCambiosNovedadSeguimiento);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleNovedadSeguimiento.add(this.jmenuDetalleArchivoNovedadSeguimiento);		
		this.jmenuBarDetalleNovedadSeguimiento.add(this.jmenuDetalleAccionesNovedadSeguimiento);		
		this.jmenuBarDetalleNovedadSeguimiento.add(this.jmenuDetalleDatosNovedadSeguimiento);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleNovedadSeguimiento);				
	}
	
	
	public void inicializarElementosCamposNovedadSeguimiento() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdNovedadSeguimiento = new JLabelMe();
		jLabelIdNovedadSeguimiento.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdNovedadSeguimiento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdNovedadSeguimiento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdNovedadSeguimiento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdNovedadSeguimiento,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidNovedadSeguimiento = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidNovedadSeguimiento.setToolTipText(NovedadSeguimientoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutNovedadSeguimiento= new GridBagLayout();

		this.jPanelidNovedadSeguimiento.setLayout(this.gridaBagLayoutNovedadSeguimiento);

		jLabelidNovedadSeguimiento = new JLabel();
		jLabelidNovedadSeguimiento.setText("Id");

		jLabelidNovedadSeguimiento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidNovedadSeguimiento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidNovedadSeguimiento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnumero_comprobanteNovedadSeguimiento = new JLabelMe();
		this.jLabelnumero_comprobanteNovedadSeguimiento.setText(""+NovedadSeguimientoConstantesFunciones.LABEL_NUMEROCOMPROBANTE+" : *");
		this.jLabelnumero_comprobanteNovedadSeguimiento.setToolTipText("Numero Comprobante");
		this.jLabelnumero_comprobanteNovedadSeguimiento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_comprobanteNovedadSeguimiento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_comprobanteNovedadSeguimiento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_comprobanteNovedadSeguimiento,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_comprobanteNovedadSeguimiento=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_comprobanteNovedadSeguimiento.setToolTipText(NovedadSeguimientoConstantesFunciones.LABEL_NUMEROCOMPROBANTE);
		this.gridaBagLayoutNovedadSeguimiento = new GridBagLayout();
		this.jPanelnumero_comprobanteNovedadSeguimiento.setLayout(this.gridaBagLayoutNovedadSeguimiento);


		jTextFieldnumero_comprobanteNovedadSeguimiento= new JTextFieldMe();

		jTextFieldnumero_comprobanteNovedadSeguimiento.setEnabled(false);
		jTextFieldnumero_comprobanteNovedadSeguimiento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_comprobanteNovedadSeguimiento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_comprobanteNovedadSeguimiento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_comprobanteNovedadSeguimiento,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_comprobanteNovedadSeguimientoBusqueda= new JButtonMe();
		this.jButtonnumero_comprobanteNovedadSeguimientoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_comprobanteNovedadSeguimientoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_comprobanteNovedadSeguimientoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_comprobanteNovedadSeguimientoBusqueda.setText("U");
		this.jButtonnumero_comprobanteNovedadSeguimientoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_comprobanteNovedadSeguimientoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_comprobanteNovedadSeguimientoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_comprobanteNovedadSeguimiento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_comprobanteNovedadSeguimiento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_comprobanteNovedadSeguimientoBusqueda"));

		if(this.novedadseguimientoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_comprobanteNovedadSeguimientoBusqueda.setVisible(false);		}


					
		this.jLabelfecha_novedadNovedadSeguimiento = new JLabelMe();
		this.jLabelfecha_novedadNovedadSeguimiento.setText(""+NovedadSeguimientoConstantesFunciones.LABEL_FECHANOVEDAD+" : *");
		this.jLabelfecha_novedadNovedadSeguimiento.setToolTipText("Fecha Novedad");
		this.jLabelfecha_novedadNovedadSeguimiento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_novedadNovedadSeguimiento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_novedadNovedadSeguimiento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_novedadNovedadSeguimiento,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_novedadNovedadSeguimiento=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_novedadNovedadSeguimiento.setToolTipText(NovedadSeguimientoConstantesFunciones.LABEL_FECHANOVEDAD);
		this.gridaBagLayoutNovedadSeguimiento = new GridBagLayout();
		this.jPanelfecha_novedadNovedadSeguimiento.setLayout(this.gridaBagLayoutNovedadSeguimiento);


		//jFormattedTextFieldfecha_novedadNovedadSeguimiento= new JFormattedTextFieldMe();

		jDateChooserfecha_novedadNovedadSeguimiento= new JDateChooser();
		jDateChooserfecha_novedadNovedadSeguimiento.setEnabled(false);
		jDateChooserfecha_novedadNovedadSeguimiento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_novedadNovedadSeguimiento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_novedadNovedadSeguimiento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_novedadNovedadSeguimiento,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_novedadNovedadSeguimiento.setDate(new Date());
		jDateChooserfecha_novedadNovedadSeguimiento.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_novedadNovedadSeguimiento.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_novedadNovedadSeguimientoBusqueda= new JButtonMe();
		this.jButtonfecha_novedadNovedadSeguimientoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_novedadNovedadSeguimientoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_novedadNovedadSeguimientoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_novedadNovedadSeguimientoBusqueda.setText("U");
		this.jButtonfecha_novedadNovedadSeguimientoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_novedadNovedadSeguimientoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_novedadNovedadSeguimientoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_novedadNovedadSeguimiento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_novedadNovedadSeguimiento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_novedadNovedadSeguimientoBusqueda"));

		if(this.novedadseguimientoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_novedadNovedadSeguimientoBusqueda.setVisible(false);		}


					
		this.jLabelfecha_seguimientoNovedadSeguimiento = new JLabelMe();
		this.jLabelfecha_seguimientoNovedadSeguimiento.setText(""+NovedadSeguimientoConstantesFunciones.LABEL_FECHASEGUIMIENTO+" : *");
		this.jLabelfecha_seguimientoNovedadSeguimiento.setToolTipText("Fecha Seguimiento");
		this.jLabelfecha_seguimientoNovedadSeguimiento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_seguimientoNovedadSeguimiento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_seguimientoNovedadSeguimiento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_seguimientoNovedadSeguimiento,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_seguimientoNovedadSeguimiento=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_seguimientoNovedadSeguimiento.setToolTipText(NovedadSeguimientoConstantesFunciones.LABEL_FECHASEGUIMIENTO);
		this.gridaBagLayoutNovedadSeguimiento = new GridBagLayout();
		this.jPanelfecha_seguimientoNovedadSeguimiento.setLayout(this.gridaBagLayoutNovedadSeguimiento);


		//jFormattedTextFieldfecha_seguimientoNovedadSeguimiento= new JFormattedTextFieldMe();

		jDateChooserfecha_seguimientoNovedadSeguimiento= new JDateChooser();
		jDateChooserfecha_seguimientoNovedadSeguimiento.setEnabled(false);
		jDateChooserfecha_seguimientoNovedadSeguimiento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_seguimientoNovedadSeguimiento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_seguimientoNovedadSeguimiento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_seguimientoNovedadSeguimiento,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_seguimientoNovedadSeguimiento.setDate(new Date());
		jDateChooserfecha_seguimientoNovedadSeguimiento.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_seguimientoNovedadSeguimiento.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_seguimientoNovedadSeguimientoBusqueda= new JButtonMe();
		this.jButtonfecha_seguimientoNovedadSeguimientoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_seguimientoNovedadSeguimientoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_seguimientoNovedadSeguimientoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_seguimientoNovedadSeguimientoBusqueda.setText("U");
		this.jButtonfecha_seguimientoNovedadSeguimientoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_seguimientoNovedadSeguimientoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_seguimientoNovedadSeguimientoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_seguimientoNovedadSeguimiento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_seguimientoNovedadSeguimiento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_seguimientoNovedadSeguimientoBusqueda"));

		if(this.novedadseguimientoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_seguimientoNovedadSeguimientoBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionNovedadSeguimiento = new JLabelMe();
		this.jLabeldescripcionNovedadSeguimiento.setText(""+NovedadSeguimientoConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionNovedadSeguimiento.setToolTipText("Descripcion");
		this.jLabeldescripcionNovedadSeguimiento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionNovedadSeguimiento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionNovedadSeguimiento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionNovedadSeguimiento,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionNovedadSeguimiento=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionNovedadSeguimiento.setToolTipText(NovedadSeguimientoConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutNovedadSeguimiento = new GridBagLayout();
		this.jPaneldescripcionNovedadSeguimiento.setLayout(this.gridaBagLayoutNovedadSeguimiento);


		jTextAreadescripcionNovedadSeguimiento= new JTextAreaMe();
		jTextAreadescripcionNovedadSeguimiento.setEnabled(false);
		jTextAreadescripcionNovedadSeguimiento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionNovedadSeguimiento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionNovedadSeguimiento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionNovedadSeguimiento.setLineWrap(true);
		jTextAreadescripcionNovedadSeguimiento.setWrapStyleWord(true);
		jTextAreadescripcionNovedadSeguimiento.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionNovedadSeguimiento.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionNovedadSeguimiento,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionNovedadSeguimiento = new JScrollPane(jTextAreadescripcionNovedadSeguimiento);
		jscrollPanedescripcionNovedadSeguimiento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionNovedadSeguimiento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionNovedadSeguimiento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionNovedadSeguimientoBusqueda= new JButtonMe();
		this.jButtondescripcionNovedadSeguimientoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionNovedadSeguimientoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionNovedadSeguimientoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionNovedadSeguimientoBusqueda.setText("U");
		this.jButtondescripcionNovedadSeguimientoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionNovedadSeguimientoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionNovedadSeguimientoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionNovedadSeguimiento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionNovedadSeguimiento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionNovedadSeguimientoBusqueda"));

		if(this.novedadseguimientoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionNovedadSeguimientoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysNovedadSeguimiento() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaNovedadSeguimiento = new JLabelMe();
		this.jLabelid_empresaNovedadSeguimiento.setText(""+NovedadSeguimientoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaNovedadSeguimiento.setToolTipText("Empresa");
		this.jLabelid_empresaNovedadSeguimiento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaNovedadSeguimiento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaNovedadSeguimiento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaNovedadSeguimiento,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaNovedadSeguimiento=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaNovedadSeguimiento.setToolTipText(NovedadSeguimientoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutNovedadSeguimiento = new GridBagLayout();
		this.jPanelid_empresaNovedadSeguimiento.setLayout(this.gridaBagLayoutNovedadSeguimiento);


		jComboBoxid_empresaNovedadSeguimiento= new JComboBoxMe();
		jComboBoxid_empresaNovedadSeguimiento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaNovedadSeguimiento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaNovedadSeguimiento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaNovedadSeguimiento,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaNovedadSeguimiento.setEnabled(false);

		this.jButtonid_empresaNovedadSeguimiento= new JButtonMe();
		this.jButtonid_empresaNovedadSeguimiento.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaNovedadSeguimiento.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaNovedadSeguimiento.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaNovedadSeguimiento.setText("Buscar");
		this.jButtonid_empresaNovedadSeguimiento.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaNovedadSeguimiento.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaNovedadSeguimiento,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaNovedadSeguimiento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaNovedadSeguimiento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaNovedadSeguimiento"));

		this.jButtonid_empresaNovedadSeguimientoBusqueda= new JButtonMe();
		this.jButtonid_empresaNovedadSeguimientoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaNovedadSeguimientoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaNovedadSeguimientoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaNovedadSeguimientoBusqueda.setText("U");
		this.jButtonid_empresaNovedadSeguimientoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaNovedadSeguimientoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaNovedadSeguimientoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaNovedadSeguimiento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaNovedadSeguimiento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaNovedadSeguimientoBusqueda"));

		if(this.novedadseguimientoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaNovedadSeguimientoBusqueda.setVisible(false);		}

		this.jButtonid_empresaNovedadSeguimientoUpdate= new JButtonMe();
		this.jButtonid_empresaNovedadSeguimientoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaNovedadSeguimientoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaNovedadSeguimientoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaNovedadSeguimientoUpdate.setText("U");
		this.jButtonid_empresaNovedadSeguimientoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaNovedadSeguimientoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaNovedadSeguimientoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaNovedadSeguimiento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaNovedadSeguimiento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaNovedadSeguimientoUpdate"));



					
		this.jLabelid_sucursalNovedadSeguimiento = new JLabelMe();
		this.jLabelid_sucursalNovedadSeguimiento.setText(""+NovedadSeguimientoConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalNovedadSeguimiento.setToolTipText("Sucursal");
		this.jLabelid_sucursalNovedadSeguimiento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalNovedadSeguimiento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalNovedadSeguimiento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalNovedadSeguimiento,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalNovedadSeguimiento=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalNovedadSeguimiento.setToolTipText(NovedadSeguimientoConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutNovedadSeguimiento = new GridBagLayout();
		this.jPanelid_sucursalNovedadSeguimiento.setLayout(this.gridaBagLayoutNovedadSeguimiento);


		jComboBoxid_sucursalNovedadSeguimiento= new JComboBoxMe();
		jComboBoxid_sucursalNovedadSeguimiento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalNovedadSeguimiento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalNovedadSeguimiento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalNovedadSeguimiento,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalNovedadSeguimiento.setEnabled(false);

		this.jButtonid_sucursalNovedadSeguimiento= new JButtonMe();
		this.jButtonid_sucursalNovedadSeguimiento.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalNovedadSeguimiento.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalNovedadSeguimiento.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalNovedadSeguimiento.setText("Buscar");
		this.jButtonid_sucursalNovedadSeguimiento.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalNovedadSeguimiento.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalNovedadSeguimiento,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalNovedadSeguimiento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalNovedadSeguimiento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalNovedadSeguimiento"));

		this.jButtonid_sucursalNovedadSeguimientoBusqueda= new JButtonMe();
		this.jButtonid_sucursalNovedadSeguimientoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalNovedadSeguimientoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalNovedadSeguimientoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalNovedadSeguimientoBusqueda.setText("U");
		this.jButtonid_sucursalNovedadSeguimientoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalNovedadSeguimientoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalNovedadSeguimientoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalNovedadSeguimiento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalNovedadSeguimiento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalNovedadSeguimientoBusqueda"));

		if(this.novedadseguimientoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalNovedadSeguimientoBusqueda.setVisible(false);		}

		this.jButtonid_sucursalNovedadSeguimientoUpdate= new JButtonMe();
		this.jButtonid_sucursalNovedadSeguimientoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalNovedadSeguimientoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalNovedadSeguimientoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalNovedadSeguimientoUpdate.setText("U");
		this.jButtonid_sucursalNovedadSeguimientoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalNovedadSeguimientoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalNovedadSeguimientoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalNovedadSeguimiento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalNovedadSeguimiento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalNovedadSeguimientoUpdate"));



					
		this.jLabelid_detalle_movimiento_inventarioNovedadSeguimiento = new JLabelMe();
		this.jLabelid_detalle_movimiento_inventarioNovedadSeguimiento.setText(""+NovedadSeguimientoConstantesFunciones.LABEL_IDDETALLEMOVIMIENTOINVENTARIO+" : *");
		this.jLabelid_detalle_movimiento_inventarioNovedadSeguimiento.setToolTipText("Detalle Movimiento Inventario");
		this.jLabelid_detalle_movimiento_inventarioNovedadSeguimiento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_detalle_movimiento_inventarioNovedadSeguimiento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_detalle_movimiento_inventarioNovedadSeguimiento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_detalle_movimiento_inventarioNovedadSeguimiento,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_detalle_movimiento_inventarioNovedadSeguimiento=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_detalle_movimiento_inventarioNovedadSeguimiento.setToolTipText(NovedadSeguimientoConstantesFunciones.LABEL_IDDETALLEMOVIMIENTOINVENTARIO);
		this.gridaBagLayoutNovedadSeguimiento = new GridBagLayout();
		this.jPanelid_detalle_movimiento_inventarioNovedadSeguimiento.setLayout(this.gridaBagLayoutNovedadSeguimiento);


		jComboBoxid_detalle_movimiento_inventarioNovedadSeguimiento= new JComboBoxMe();
		jComboBoxid_detalle_movimiento_inventarioNovedadSeguimiento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_detalle_movimiento_inventarioNovedadSeguimiento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_detalle_movimiento_inventarioNovedadSeguimiento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_detalle_movimiento_inventarioNovedadSeguimiento,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_detalle_movimiento_inventarioNovedadSeguimiento= new JButtonMe();
		this.jButtonid_detalle_movimiento_inventarioNovedadSeguimiento.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_detalle_movimiento_inventarioNovedadSeguimiento.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_detalle_movimiento_inventarioNovedadSeguimiento.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_detalle_movimiento_inventarioNovedadSeguimiento.setText("Buscar");
		this.jButtonid_detalle_movimiento_inventarioNovedadSeguimiento.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_detalle_movimiento_inventarioNovedadSeguimiento.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_detalle_movimiento_inventarioNovedadSeguimiento,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_detalle_movimiento_inventarioNovedadSeguimiento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_detalle_movimiento_inventarioNovedadSeguimiento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_detalle_movimiento_inventarioNovedadSeguimiento"));

		this.jButtonid_detalle_movimiento_inventarioNovedadSeguimientoBusqueda= new JButtonMe();
		this.jButtonid_detalle_movimiento_inventarioNovedadSeguimientoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_detalle_movimiento_inventarioNovedadSeguimientoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_detalle_movimiento_inventarioNovedadSeguimientoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_detalle_movimiento_inventarioNovedadSeguimientoBusqueda.setText("U");
		this.jButtonid_detalle_movimiento_inventarioNovedadSeguimientoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_detalle_movimiento_inventarioNovedadSeguimientoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_detalle_movimiento_inventarioNovedadSeguimientoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_detalle_movimiento_inventarioNovedadSeguimiento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_detalle_movimiento_inventarioNovedadSeguimiento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_detalle_movimiento_inventarioNovedadSeguimientoBusqueda"));

		if(this.novedadseguimientoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_detalle_movimiento_inventarioNovedadSeguimientoBusqueda.setVisible(false);		}

		this.jButtonid_detalle_movimiento_inventarioNovedadSeguimientoUpdate= new JButtonMe();
		this.jButtonid_detalle_movimiento_inventarioNovedadSeguimientoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_detalle_movimiento_inventarioNovedadSeguimientoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_detalle_movimiento_inventarioNovedadSeguimientoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_detalle_movimiento_inventarioNovedadSeguimientoUpdate.setText("U");
		this.jButtonid_detalle_movimiento_inventarioNovedadSeguimientoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_detalle_movimiento_inventarioNovedadSeguimientoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_detalle_movimiento_inventarioNovedadSeguimientoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_detalle_movimiento_inventarioNovedadSeguimiento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_detalle_movimiento_inventarioNovedadSeguimiento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_detalle_movimiento_inventarioNovedadSeguimientoUpdate"));



					
		this.jLabelid_novedad_productoNovedadSeguimiento = new JLabelMe();
		this.jLabelid_novedad_productoNovedadSeguimiento.setText(""+NovedadSeguimientoConstantesFunciones.LABEL_IDNOVEDADPRODUCTO+" : *");
		this.jLabelid_novedad_productoNovedadSeguimiento.setToolTipText("Novedad Producto");
		this.jLabelid_novedad_productoNovedadSeguimiento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_novedad_productoNovedadSeguimiento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_novedad_productoNovedadSeguimiento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_novedad_productoNovedadSeguimiento,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_novedad_productoNovedadSeguimiento=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_novedad_productoNovedadSeguimiento.setToolTipText(NovedadSeguimientoConstantesFunciones.LABEL_IDNOVEDADPRODUCTO);
		this.gridaBagLayoutNovedadSeguimiento = new GridBagLayout();
		this.jPanelid_novedad_productoNovedadSeguimiento.setLayout(this.gridaBagLayoutNovedadSeguimiento);


		jComboBoxid_novedad_productoNovedadSeguimiento= new JComboBoxMe();
		jComboBoxid_novedad_productoNovedadSeguimiento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_novedad_productoNovedadSeguimiento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_novedad_productoNovedadSeguimiento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_novedad_productoNovedadSeguimiento,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_novedad_productoNovedadSeguimiento= new JButtonMe();
		this.jButtonid_novedad_productoNovedadSeguimiento.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_novedad_productoNovedadSeguimiento.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_novedad_productoNovedadSeguimiento.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_novedad_productoNovedadSeguimiento.setText("Buscar");
		this.jButtonid_novedad_productoNovedadSeguimiento.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_novedad_productoNovedadSeguimiento.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_novedad_productoNovedadSeguimiento,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_novedad_productoNovedadSeguimiento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_novedad_productoNovedadSeguimiento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_novedad_productoNovedadSeguimiento"));

		this.jButtonid_novedad_productoNovedadSeguimientoBusqueda= new JButtonMe();
		this.jButtonid_novedad_productoNovedadSeguimientoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_novedad_productoNovedadSeguimientoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_novedad_productoNovedadSeguimientoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_novedad_productoNovedadSeguimientoBusqueda.setText("U");
		this.jButtonid_novedad_productoNovedadSeguimientoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_novedad_productoNovedadSeguimientoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_novedad_productoNovedadSeguimientoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_novedad_productoNovedadSeguimiento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_novedad_productoNovedadSeguimiento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_novedad_productoNovedadSeguimientoBusqueda"));

		if(this.novedadseguimientoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_novedad_productoNovedadSeguimientoBusqueda.setVisible(false);		}

		this.jButtonid_novedad_productoNovedadSeguimientoUpdate= new JButtonMe();
		this.jButtonid_novedad_productoNovedadSeguimientoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_novedad_productoNovedadSeguimientoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_novedad_productoNovedadSeguimientoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_novedad_productoNovedadSeguimientoUpdate.setText("U");
		this.jButtonid_novedad_productoNovedadSeguimientoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_novedad_productoNovedadSeguimientoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_novedad_productoNovedadSeguimientoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_novedad_productoNovedadSeguimiento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_novedad_productoNovedadSeguimiento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_novedad_productoNovedadSeguimientoUpdate"));



					
		this.jLabelid_estado_novedad_seguimientoNovedadSeguimiento = new JLabelMe();
		this.jLabelid_estado_novedad_seguimientoNovedadSeguimiento.setText(""+NovedadSeguimientoConstantesFunciones.LABEL_IDESTADONOVEDADSEGUIMIENTO+" : *");
		this.jLabelid_estado_novedad_seguimientoNovedadSeguimiento.setToolTipText("Estado Novedad Seguimiento");
		this.jLabelid_estado_novedad_seguimientoNovedadSeguimiento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_estado_novedad_seguimientoNovedadSeguimiento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_estado_novedad_seguimientoNovedadSeguimiento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estado_novedad_seguimientoNovedadSeguimiento,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estado_novedad_seguimientoNovedadSeguimiento=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estado_novedad_seguimientoNovedadSeguimiento.setToolTipText(NovedadSeguimientoConstantesFunciones.LABEL_IDESTADONOVEDADSEGUIMIENTO);
		this.gridaBagLayoutNovedadSeguimiento = new GridBagLayout();
		this.jPanelid_estado_novedad_seguimientoNovedadSeguimiento.setLayout(this.gridaBagLayoutNovedadSeguimiento);


		jComboBoxid_estado_novedad_seguimientoNovedadSeguimiento= new JComboBoxMe();
		jComboBoxid_estado_novedad_seguimientoNovedadSeguimiento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_novedad_seguimientoNovedadSeguimiento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_novedad_seguimientoNovedadSeguimiento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_novedad_seguimientoNovedadSeguimiento,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_estado_novedad_seguimientoNovedadSeguimiento= new JButtonMe();
		this.jButtonid_estado_novedad_seguimientoNovedadSeguimiento.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_novedad_seguimientoNovedadSeguimiento.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_novedad_seguimientoNovedadSeguimiento.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_novedad_seguimientoNovedadSeguimiento.setText("Buscar");
		this.jButtonid_estado_novedad_seguimientoNovedadSeguimiento.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estado_novedad_seguimientoNovedadSeguimiento.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_novedad_seguimientoNovedadSeguimiento,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estado_novedad_seguimientoNovedadSeguimiento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_novedad_seguimientoNovedadSeguimiento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_novedad_seguimientoNovedadSeguimiento"));

		this.jButtonid_estado_novedad_seguimientoNovedadSeguimientoBusqueda= new JButtonMe();
		this.jButtonid_estado_novedad_seguimientoNovedadSeguimientoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_novedad_seguimientoNovedadSeguimientoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_novedad_seguimientoNovedadSeguimientoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_novedad_seguimientoNovedadSeguimientoBusqueda.setText("U");
		this.jButtonid_estado_novedad_seguimientoNovedadSeguimientoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estado_novedad_seguimientoNovedadSeguimientoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_novedad_seguimientoNovedadSeguimientoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estado_novedad_seguimientoNovedadSeguimiento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_novedad_seguimientoNovedadSeguimiento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_novedad_seguimientoNovedadSeguimientoBusqueda"));

		if(this.novedadseguimientoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estado_novedad_seguimientoNovedadSeguimientoBusqueda.setVisible(false);		}

		this.jButtonid_estado_novedad_seguimientoNovedadSeguimientoUpdate= new JButtonMe();
		this.jButtonid_estado_novedad_seguimientoNovedadSeguimientoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_novedad_seguimientoNovedadSeguimientoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_novedad_seguimientoNovedadSeguimientoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_novedad_seguimientoNovedadSeguimientoUpdate.setText("U");
		this.jButtonid_estado_novedad_seguimientoNovedadSeguimientoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estado_novedad_seguimientoNovedadSeguimientoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_novedad_seguimientoNovedadSeguimientoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estado_novedad_seguimientoNovedadSeguimiento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_novedad_seguimientoNovedadSeguimiento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_novedad_seguimientoNovedadSeguimientoUpdate"));



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
		//this.jInternalFrameDetalleNovedadSeguimiento = new NovedadSeguimientoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Novedad Seguimiento DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutNovedadSeguimiento= new GridBagLayout();
		

		
		String sToolTipNovedadSeguimiento="";
		sToolTipNovedadSeguimiento=NovedadSeguimientoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipNovedadSeguimiento+="(Inventario.NovedadSeguimiento)";
		}
		
		if(!this.novedadseguimientoSessionBean.getEsGuardarRelacionado()) {
			sToolTipNovedadSeguimiento+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoNovedadSeguimiento = new JButtonMe();
		this.jButtonModificarNovedadSeguimiento = new JButtonMe();
        this.jButtonActualizarNovedadSeguimiento = new JButtonMe();
        this.jButtonEliminarNovedadSeguimiento = new JButtonMe();
        this.jButtonCancelarNovedadSeguimiento = new JButtonMe();
        this.jButtonGuardarCambiosNovedadSeguimiento = new JButtonMe();
		this.jButtonGuardarCambiosTablaNovedadSeguimiento = new JButtonMe();
		this.jButtonCerrarNovedadSeguimiento = new JButtonMe();
		
		this.jScrollPanelDatosNovedadSeguimiento = new JScrollPane();   
        this.jScrollPanelDatosEdicionNovedadSeguimiento = new JScrollPane();
		this.jScrollPanelDatosGeneralNovedadSeguimiento = new JScrollPane();
				
		
		
		this.jPanelCamposNovedadSeguimiento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosNovedadSeguimiento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesNovedadSeguimiento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioNovedadSeguimiento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Novedad Seguimiento";
		
		if(!this.novedadseguimientoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosNovedadSeguimiento.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Novedad Seguimientoes" + this.sPath));
		} else {
			this.jScrollPanelDatosNovedadSeguimiento.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionNovedadSeguimiento.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralNovedadSeguimiento.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposNovedadSeguimiento.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposNovedadSeguimiento.setName("jPanelCamposNovedadSeguimiento"); 

		this.jPanelCamposOcultosNovedadSeguimiento.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosNovedadSeguimiento.setName("jPanelCamposOcultosNovedadSeguimiento"); 

        this.jPanelAccionesNovedadSeguimiento.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesNovedadSeguimiento.setToolTipText("Acciones");
        this.jPanelAccionesNovedadSeguimiento.setName("Acciones"); 

		this.jPanelAccionesFormularioNovedadSeguimiento.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioNovedadSeguimiento.setToolTipText("Acciones");
        this.jPanelAccionesFormularioNovedadSeguimiento.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoNovedadSeguimiento.setText("Nuevo");
		this.jButtonModificarNovedadSeguimiento.setText("Editar");
        this.jButtonActualizarNovedadSeguimiento.setText("Actualizar");
        this.jButtonEliminarNovedadSeguimiento.setText("Eliminar");
        this.jButtonCancelarNovedadSeguimiento.setText("Cancelar");
        this.jButtonGuardarCambiosNovedadSeguimiento.setText("Guardar");
		this.jButtonGuardarCambiosTablaNovedadSeguimiento.setText("Guardar");
		this.jButtonCerrarNovedadSeguimiento.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoNovedadSeguimiento,"nuevo_button","Nuevo",this.novedadseguimientoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarNovedadSeguimiento,"modificar_button","Editar",this.novedadseguimientoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarNovedadSeguimiento,"actualizar_button","Actualizar",this.novedadseguimientoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarNovedadSeguimiento,"eliminar_button","Eliminar",this.novedadseguimientoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarNovedadSeguimiento,"cancelar_button","Cancelar",this.novedadseguimientoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosNovedadSeguimiento,"guardarcambios_button","Guardar",this.novedadseguimientoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaNovedadSeguimiento,"guardarcambiostabla_button","Guardar",this.novedadseguimientoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarNovedadSeguimiento,"cerrar_button","Salir",this.novedadseguimientoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoNovedadSeguimiento.setToolTipText("Nuevo"+" "+NovedadSeguimientoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarNovedadSeguimiento.setToolTipText("Editar"+" "+NovedadSeguimientoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarNovedadSeguimiento.setToolTipText("Actualizar"+" "+NovedadSeguimientoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarNovedadSeguimiento.setToolTipText("Eliminar)"+" "+NovedadSeguimientoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarNovedadSeguimiento.setToolTipText("Cancelar"+" "+NovedadSeguimientoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosNovedadSeguimiento.setToolTipText("Guardar"+" "+NovedadSeguimientoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaNovedadSeguimiento.setToolTipText("Guardar"+" "+NovedadSeguimientoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarNovedadSeguimiento.setToolTipText("Salir"+" "+NovedadSeguimientoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoNovedadSeguimiento";
		inputMap = this.jButtonNuevoNovedadSeguimiento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoNovedadSeguimiento.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoNovedadSeguimiento"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarNovedadSeguimiento";
		inputMap = this.jButtonActualizarNovedadSeguimiento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarNovedadSeguimiento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarNovedadSeguimiento"));
		
		//ELIMINAR
		sMapKey = "EliminarNovedadSeguimiento";
		inputMap = this.jButtonEliminarNovedadSeguimiento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarNovedadSeguimiento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarNovedadSeguimiento"));
		
		//CANCELAR	
		sMapKey = "CancelarNovedadSeguimiento";
		inputMap = this.jButtonCancelarNovedadSeguimiento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarNovedadSeguimiento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarNovedadSeguimiento"));
		
		//CERRAR		
		sMapKey = "CerrarNovedadSeguimiento";
		inputMap = this.jButtonCerrarNovedadSeguimiento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarNovedadSeguimiento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarNovedadSeguimiento"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaNovedadSeguimiento";
		inputMap = this.jButtonGuardarCambiosTablaNovedadSeguimiento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaNovedadSeguimiento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaNovedadSeguimiento"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoNovedadSeguimiento = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoNovedadSeguimiento.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoNovedadSeguimiento.setToolTipText("Nuevo NovedadSeguimiento");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarNovedadSeguimiento = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarNovedadSeguimiento.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarNovedadSeguimiento.setToolTipText("Sin Cerrar Ventana NovedadSeguimiento");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeNovedadSeguimiento = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeNovedadSeguimiento.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeNovedadSeguimiento.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesNovedadSeguimiento = new JComboBoxMe();
		//this.jComboBoxTiposAccionesNovedadSeguimiento.setText("Accion");
		this.jComboBoxTiposAccionesNovedadSeguimiento.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioNovedadSeguimiento = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioNovedadSeguimiento.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioNovedadSeguimiento.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesNovedadSeguimiento = new JLabelMe();
		
		this.jLabelAccionesNovedadSeguimiento.setText("Acciones");		
		this.jLabelAccionesNovedadSeguimiento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesNovedadSeguimiento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesNovedadSeguimiento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposNovedadSeguimiento();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysNovedadSeguimiento();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesNovedadSeguimiento=new JTabbedPane();
		this.jTabbedPaneRelacionesNovedadSeguimiento.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesNovedadSeguimiento,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesNovedadSeguimiento.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesNovedadSeguimiento.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesNovedadSeguimiento.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioNovedadSeguimiento.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioNovedadSeguimiento.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioNovedadSeguimiento.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioNovedadSeguimiento, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposNovedadSeguimiento = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosNovedadSeguimiento = new GridBagLayout();
		
		this.jPanelCamposNovedadSeguimiento.setLayout(gridaBagLayoutCamposNovedadSeguimiento);
		this.jPanelCamposOcultosNovedadSeguimiento.setLayout(gridaBagLayoutCamposOcultosNovedadSeguimiento);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
	this.gridBagConstraintsNovedadSeguimiento.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNovedadSeguimiento.gridy = 0;
	this.gridBagConstraintsNovedadSeguimiento.gridx = 0;
	this.gridBagConstraintsNovedadSeguimiento.ipadx = 0;
	this.gridBagConstraintsNovedadSeguimiento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidNovedadSeguimiento.add(jLabelIdNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);



	this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
	this.gridBagConstraintsNovedadSeguimiento.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNovedadSeguimiento.gridy = 0;
	this.gridBagConstraintsNovedadSeguimiento.gridx = 1;
	this.gridBagConstraintsNovedadSeguimiento.ipadx = 0;
	this.gridBagConstraintsNovedadSeguimiento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidNovedadSeguimiento.add(jLabelidNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);


	this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
	this.gridBagConstraintsNovedadSeguimiento.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNovedadSeguimiento.gridy = 0;
	this.gridBagConstraintsNovedadSeguimiento.gridx = 0;
	this.gridBagConstraintsNovedadSeguimiento.ipadx = 0;
	this.gridBagConstraintsNovedadSeguimiento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaNovedadSeguimiento.add(jLabelid_empresaNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
		//this.gridBagConstraintsNovedadSeguimiento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNovedadSeguimiento.gridy = 0;
		this.gridBagConstraintsNovedadSeguimiento.gridx = 2;
		this.gridBagConstraintsNovedadSeguimiento.ipadx = 0;
		this.gridBagConstraintsNovedadSeguimiento.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaNovedadSeguimiento.add(jButtonid_empresaNovedadSeguimientoBusqueda, this.gridBagConstraintsNovedadSeguimiento);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
		//this.gridBagConstraintsNovedadSeguimiento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNovedadSeguimiento.gridy = 0;
		this.gridBagConstraintsNovedadSeguimiento.gridx = 3;
		this.gridBagConstraintsNovedadSeguimiento.ipadx = 0;
		this.gridBagConstraintsNovedadSeguimiento.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaNovedadSeguimiento.add(jButtonid_empresaNovedadSeguimientoUpdate, this.gridBagConstraintsNovedadSeguimiento);
	}

	this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
	this.gridBagConstraintsNovedadSeguimiento.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNovedadSeguimiento.gridy = 0;
	this.gridBagConstraintsNovedadSeguimiento.gridx = 1;
	this.gridBagConstraintsNovedadSeguimiento.ipadx = 0;
	this.gridBagConstraintsNovedadSeguimiento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaNovedadSeguimiento.add(jComboBoxid_empresaNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);


	this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
	this.gridBagConstraintsNovedadSeguimiento.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNovedadSeguimiento.gridy = 0;
	this.gridBagConstraintsNovedadSeguimiento.gridx = 0;
	this.gridBagConstraintsNovedadSeguimiento.ipadx = 0;
	this.gridBagConstraintsNovedadSeguimiento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalNovedadSeguimiento.add(jLabelid_sucursalNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
		//this.gridBagConstraintsNovedadSeguimiento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNovedadSeguimiento.gridy = 0;
		this.gridBagConstraintsNovedadSeguimiento.gridx = 2;
		this.gridBagConstraintsNovedadSeguimiento.ipadx = 0;
		this.gridBagConstraintsNovedadSeguimiento.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalNovedadSeguimiento.add(jButtonid_sucursalNovedadSeguimientoBusqueda, this.gridBagConstraintsNovedadSeguimiento);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
		//this.gridBagConstraintsNovedadSeguimiento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNovedadSeguimiento.gridy = 0;
		this.gridBagConstraintsNovedadSeguimiento.gridx = 3;
		this.gridBagConstraintsNovedadSeguimiento.ipadx = 0;
		this.gridBagConstraintsNovedadSeguimiento.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalNovedadSeguimiento.add(jButtonid_sucursalNovedadSeguimientoUpdate, this.gridBagConstraintsNovedadSeguimiento);
	}

	this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
	this.gridBagConstraintsNovedadSeguimiento.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNovedadSeguimiento.gridy = 0;
	this.gridBagConstraintsNovedadSeguimiento.gridx = 1;
	this.gridBagConstraintsNovedadSeguimiento.ipadx = 0;
	this.gridBagConstraintsNovedadSeguimiento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalNovedadSeguimiento.add(jComboBoxid_sucursalNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);


	this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
	this.gridBagConstraintsNovedadSeguimiento.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNovedadSeguimiento.gridy = 0;
	this.gridBagConstraintsNovedadSeguimiento.gridx = 0;
	this.gridBagConstraintsNovedadSeguimiento.ipadx = 0;
	this.gridBagConstraintsNovedadSeguimiento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_detalle_movimiento_inventarioNovedadSeguimiento.add(jLabelid_detalle_movimiento_inventarioNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
		//this.gridBagConstraintsNovedadSeguimiento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNovedadSeguimiento.gridy = 0;
		this.gridBagConstraintsNovedadSeguimiento.gridx = 2;
		this.gridBagConstraintsNovedadSeguimiento.ipadx = 0;
		this.gridBagConstraintsNovedadSeguimiento.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_detalle_movimiento_inventarioNovedadSeguimiento.add(jButtonid_detalle_movimiento_inventarioNovedadSeguimientoBusqueda, this.gridBagConstraintsNovedadSeguimiento);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
		//this.gridBagConstraintsNovedadSeguimiento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNovedadSeguimiento.gridy = 0;
		this.gridBagConstraintsNovedadSeguimiento.gridx = 3;
		this.gridBagConstraintsNovedadSeguimiento.ipadx = 0;
		this.gridBagConstraintsNovedadSeguimiento.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_detalle_movimiento_inventarioNovedadSeguimiento.add(jButtonid_detalle_movimiento_inventarioNovedadSeguimientoUpdate, this.gridBagConstraintsNovedadSeguimiento);
	}

	this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
	this.gridBagConstraintsNovedadSeguimiento.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNovedadSeguimiento.gridy = 0;
	this.gridBagConstraintsNovedadSeguimiento.gridx = 1;
	this.gridBagConstraintsNovedadSeguimiento.ipadx = 0;
	this.gridBagConstraintsNovedadSeguimiento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_detalle_movimiento_inventarioNovedadSeguimiento.add(jComboBoxid_detalle_movimiento_inventarioNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);


	this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
	this.gridBagConstraintsNovedadSeguimiento.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNovedadSeguimiento.gridy = 0;
	this.gridBagConstraintsNovedadSeguimiento.gridx = 0;
	this.gridBagConstraintsNovedadSeguimiento.ipadx = 0;
	this.gridBagConstraintsNovedadSeguimiento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_novedad_productoNovedadSeguimiento.add(jLabelid_novedad_productoNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
		//this.gridBagConstraintsNovedadSeguimiento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNovedadSeguimiento.gridy = 0;
		this.gridBagConstraintsNovedadSeguimiento.gridx = 2;
		this.gridBagConstraintsNovedadSeguimiento.ipadx = 0;
		this.gridBagConstraintsNovedadSeguimiento.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_novedad_productoNovedadSeguimiento.add(jButtonid_novedad_productoNovedadSeguimientoBusqueda, this.gridBagConstraintsNovedadSeguimiento);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
		//this.gridBagConstraintsNovedadSeguimiento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNovedadSeguimiento.gridy = 0;
		this.gridBagConstraintsNovedadSeguimiento.gridx = 3;
		this.gridBagConstraintsNovedadSeguimiento.ipadx = 0;
		this.gridBagConstraintsNovedadSeguimiento.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_novedad_productoNovedadSeguimiento.add(jButtonid_novedad_productoNovedadSeguimientoUpdate, this.gridBagConstraintsNovedadSeguimiento);
	}

	this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
	this.gridBagConstraintsNovedadSeguimiento.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNovedadSeguimiento.gridy = 0;
	this.gridBagConstraintsNovedadSeguimiento.gridx = 1;
	this.gridBagConstraintsNovedadSeguimiento.ipadx = 0;
	this.gridBagConstraintsNovedadSeguimiento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_novedad_productoNovedadSeguimiento.add(jComboBoxid_novedad_productoNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);


	this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
	this.gridBagConstraintsNovedadSeguimiento.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNovedadSeguimiento.gridy = 0;
	this.gridBagConstraintsNovedadSeguimiento.gridx = 0;
	this.gridBagConstraintsNovedadSeguimiento.ipadx = 0;
	this.gridBagConstraintsNovedadSeguimiento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_comprobanteNovedadSeguimiento.add(jLabelnumero_comprobanteNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
		//this.gridBagConstraintsNovedadSeguimiento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNovedadSeguimiento.gridy = 0;
		this.gridBagConstraintsNovedadSeguimiento.gridx = 2;
		this.gridBagConstraintsNovedadSeguimiento.ipadx = 0;
		this.gridBagConstraintsNovedadSeguimiento.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_comprobanteNovedadSeguimiento.add(jButtonnumero_comprobanteNovedadSeguimientoBusqueda, this.gridBagConstraintsNovedadSeguimiento);
	}

	this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
	this.gridBagConstraintsNovedadSeguimiento.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNovedadSeguimiento.gridy = 0;
	this.gridBagConstraintsNovedadSeguimiento.gridx = 1;
	this.gridBagConstraintsNovedadSeguimiento.ipadx = 0;
	this.gridBagConstraintsNovedadSeguimiento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_comprobanteNovedadSeguimiento.add(jTextFieldnumero_comprobanteNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);


	this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
	this.gridBagConstraintsNovedadSeguimiento.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNovedadSeguimiento.gridy = 0;
	this.gridBagConstraintsNovedadSeguimiento.gridx = 0;
	this.gridBagConstraintsNovedadSeguimiento.ipadx = 0;
	this.gridBagConstraintsNovedadSeguimiento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_novedadNovedadSeguimiento.add(jLabelfecha_novedadNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
		//this.gridBagConstraintsNovedadSeguimiento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNovedadSeguimiento.gridy = 0;
		this.gridBagConstraintsNovedadSeguimiento.gridx = 2;
		this.gridBagConstraintsNovedadSeguimiento.ipadx = 0;
		this.gridBagConstraintsNovedadSeguimiento.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_novedadNovedadSeguimiento.add(jButtonfecha_novedadNovedadSeguimientoBusqueda, this.gridBagConstraintsNovedadSeguimiento);
	}

	this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
	this.gridBagConstraintsNovedadSeguimiento.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNovedadSeguimiento.gridy = 0;
	this.gridBagConstraintsNovedadSeguimiento.gridx = 1;
	this.gridBagConstraintsNovedadSeguimiento.ipadx = 0;
	this.gridBagConstraintsNovedadSeguimiento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_novedadNovedadSeguimiento.add(jDateChooserfecha_novedadNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);


	this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
	this.gridBagConstraintsNovedadSeguimiento.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNovedadSeguimiento.gridy = 0;
	this.gridBagConstraintsNovedadSeguimiento.gridx = 0;
	this.gridBagConstraintsNovedadSeguimiento.ipadx = 0;
	this.gridBagConstraintsNovedadSeguimiento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_seguimientoNovedadSeguimiento.add(jLabelfecha_seguimientoNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
		//this.gridBagConstraintsNovedadSeguimiento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNovedadSeguimiento.gridy = 0;
		this.gridBagConstraintsNovedadSeguimiento.gridx = 2;
		this.gridBagConstraintsNovedadSeguimiento.ipadx = 0;
		this.gridBagConstraintsNovedadSeguimiento.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_seguimientoNovedadSeguimiento.add(jButtonfecha_seguimientoNovedadSeguimientoBusqueda, this.gridBagConstraintsNovedadSeguimiento);
	}

	this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
	this.gridBagConstraintsNovedadSeguimiento.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNovedadSeguimiento.gridy = 0;
	this.gridBagConstraintsNovedadSeguimiento.gridx = 1;
	this.gridBagConstraintsNovedadSeguimiento.ipadx = 0;
	this.gridBagConstraintsNovedadSeguimiento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_seguimientoNovedadSeguimiento.add(jDateChooserfecha_seguimientoNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);


	this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
	this.gridBagConstraintsNovedadSeguimiento.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNovedadSeguimiento.gridy = 0;
	this.gridBagConstraintsNovedadSeguimiento.gridx = 0;
	this.gridBagConstraintsNovedadSeguimiento.ipadx = 0;
	this.gridBagConstraintsNovedadSeguimiento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionNovedadSeguimiento.add(jLabeldescripcionNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
		//this.gridBagConstraintsNovedadSeguimiento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNovedadSeguimiento.gridy = 0;
		this.gridBagConstraintsNovedadSeguimiento.gridx = 2;
		this.gridBagConstraintsNovedadSeguimiento.ipadx = 0;
		this.gridBagConstraintsNovedadSeguimiento.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionNovedadSeguimiento.add(jButtondescripcionNovedadSeguimientoBusqueda, this.gridBagConstraintsNovedadSeguimiento);
	}

	this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
	this.gridBagConstraintsNovedadSeguimiento.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNovedadSeguimiento.gridy = 0;
	this.gridBagConstraintsNovedadSeguimiento.gridx = 1;
	this.gridBagConstraintsNovedadSeguimiento.ipadx = 0;
	this.gridBagConstraintsNovedadSeguimiento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionNovedadSeguimiento.add(jscrollPanedescripcionNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);


	this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
	this.gridBagConstraintsNovedadSeguimiento.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNovedadSeguimiento.gridy = 0;
	this.gridBagConstraintsNovedadSeguimiento.gridx = 0;
	this.gridBagConstraintsNovedadSeguimiento.ipadx = 0;
	this.gridBagConstraintsNovedadSeguimiento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_estado_novedad_seguimientoNovedadSeguimiento.add(jLabelid_estado_novedad_seguimientoNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
		//this.gridBagConstraintsNovedadSeguimiento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNovedadSeguimiento.gridy = 0;
		this.gridBagConstraintsNovedadSeguimiento.gridx = 2;
		this.gridBagConstraintsNovedadSeguimiento.ipadx = 0;
		this.gridBagConstraintsNovedadSeguimiento.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_novedad_seguimientoNovedadSeguimiento.add(jButtonid_estado_novedad_seguimientoNovedadSeguimientoBusqueda, this.gridBagConstraintsNovedadSeguimiento);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
		//this.gridBagConstraintsNovedadSeguimiento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNovedadSeguimiento.gridy = 0;
		this.gridBagConstraintsNovedadSeguimiento.gridx = 3;
		this.gridBagConstraintsNovedadSeguimiento.ipadx = 0;
		this.gridBagConstraintsNovedadSeguimiento.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_novedad_seguimientoNovedadSeguimiento.add(jButtonid_estado_novedad_seguimientoNovedadSeguimientoUpdate, this.gridBagConstraintsNovedadSeguimiento);
	}

	this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
	this.gridBagConstraintsNovedadSeguimiento.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNovedadSeguimiento.gridy = 0;
	this.gridBagConstraintsNovedadSeguimiento.gridx = 1;
	this.gridBagConstraintsNovedadSeguimiento.ipadx = 0;
	this.gridBagConstraintsNovedadSeguimiento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_estado_novedad_seguimientoNovedadSeguimiento.add(jComboBoxid_estado_novedad_seguimientoNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
	this.gridBagConstraintsNovedadSeguimiento.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNovedadSeguimiento.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNovedadSeguimiento.gridy = iYPanelCamposNovedadSeguimiento;
	this.gridBagConstraintsNovedadSeguimiento.gridx = iXPanelCamposNovedadSeguimiento++;
	this.gridBagConstraintsNovedadSeguimiento.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNovedadSeguimiento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNovedadSeguimiento.add(this.jPanelidNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);



	if(iXPanelCamposNovedadSeguimiento % 1==0) {
		iXPanelCamposNovedadSeguimiento=0;
		iYPanelCamposNovedadSeguimiento++;
	}
	this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
	this.gridBagConstraintsNovedadSeguimiento.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNovedadSeguimiento.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNovedadSeguimiento.gridy = iYPanelCamposNovedadSeguimiento;
	this.gridBagConstraintsNovedadSeguimiento.gridx = iXPanelCamposNovedadSeguimiento++;
	this.gridBagConstraintsNovedadSeguimiento.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNovedadSeguimiento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNovedadSeguimiento.add(this.jPanelid_detalle_movimiento_inventarioNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);



	if(iXPanelCamposNovedadSeguimiento % 1==0) {
		iXPanelCamposNovedadSeguimiento=0;
		iYPanelCamposNovedadSeguimiento++;
	}
	this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
	this.gridBagConstraintsNovedadSeguimiento.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNovedadSeguimiento.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNovedadSeguimiento.gridy = iYPanelCamposNovedadSeguimiento;
	this.gridBagConstraintsNovedadSeguimiento.gridx = iXPanelCamposNovedadSeguimiento++;
	this.gridBagConstraintsNovedadSeguimiento.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNovedadSeguimiento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNovedadSeguimiento.add(this.jPanelid_novedad_productoNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);



	if(iXPanelCamposNovedadSeguimiento % 1==0) {
		iXPanelCamposNovedadSeguimiento=0;
		iYPanelCamposNovedadSeguimiento++;
	}
	this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
	this.gridBagConstraintsNovedadSeguimiento.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNovedadSeguimiento.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNovedadSeguimiento.gridy = iYPanelCamposNovedadSeguimiento;
	this.gridBagConstraintsNovedadSeguimiento.gridx = iXPanelCamposNovedadSeguimiento++;
	this.gridBagConstraintsNovedadSeguimiento.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNovedadSeguimiento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNovedadSeguimiento.add(this.jPanelnumero_comprobanteNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);



	if(iXPanelCamposNovedadSeguimiento % 1==0) {
		iXPanelCamposNovedadSeguimiento=0;
		iYPanelCamposNovedadSeguimiento++;
	}
	this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
	this.gridBagConstraintsNovedadSeguimiento.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNovedadSeguimiento.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNovedadSeguimiento.gridy = iYPanelCamposNovedadSeguimiento;
	this.gridBagConstraintsNovedadSeguimiento.gridx = iXPanelCamposNovedadSeguimiento++;
	this.gridBagConstraintsNovedadSeguimiento.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNovedadSeguimiento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNovedadSeguimiento.add(this.jPanelfecha_novedadNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);



	if(iXPanelCamposNovedadSeguimiento % 1==0) {
		iXPanelCamposNovedadSeguimiento=0;
		iYPanelCamposNovedadSeguimiento++;
	}
	this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
	this.gridBagConstraintsNovedadSeguimiento.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNovedadSeguimiento.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNovedadSeguimiento.gridy = iYPanelCamposNovedadSeguimiento;
	this.gridBagConstraintsNovedadSeguimiento.gridx = iXPanelCamposNovedadSeguimiento++;
	this.gridBagConstraintsNovedadSeguimiento.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNovedadSeguimiento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNovedadSeguimiento.add(this.jPanelfecha_seguimientoNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);



	if(iXPanelCamposNovedadSeguimiento % 1==0) {
		iXPanelCamposNovedadSeguimiento=0;
		iYPanelCamposNovedadSeguimiento++;
	}
	this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
	this.gridBagConstraintsNovedadSeguimiento.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNovedadSeguimiento.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNovedadSeguimiento.gridy = iYPanelCamposNovedadSeguimiento;
	this.gridBagConstraintsNovedadSeguimiento.gridx = iXPanelCamposNovedadSeguimiento++;
	this.gridBagConstraintsNovedadSeguimiento.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNovedadSeguimiento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNovedadSeguimiento.add(this.jPaneldescripcionNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);



	if(iXPanelCamposNovedadSeguimiento % 1==0) {
		iXPanelCamposNovedadSeguimiento=0;
		iYPanelCamposNovedadSeguimiento++;
	}
	this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
	this.gridBagConstraintsNovedadSeguimiento.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNovedadSeguimiento.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNovedadSeguimiento.gridy = iYPanelCamposNovedadSeguimiento;
	this.gridBagConstraintsNovedadSeguimiento.gridx = iXPanelCamposNovedadSeguimiento++;
	this.gridBagConstraintsNovedadSeguimiento.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNovedadSeguimiento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNovedadSeguimiento.add(this.jPanelid_estado_novedad_seguimientoNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);



	if(iXPanelCamposNovedadSeguimiento % 1==0) {
		iXPanelCamposNovedadSeguimiento=0;
		iYPanelCamposNovedadSeguimiento++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
	this.gridBagConstraintsNovedadSeguimiento.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNovedadSeguimiento.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNovedadSeguimiento.gridy = iYPanelCamposOcultosNovedadSeguimiento;
	this.gridBagConstraintsNovedadSeguimiento.gridx = iXPanelCamposOcultosNovedadSeguimiento++;
	this.gridBagConstraintsNovedadSeguimiento.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNovedadSeguimiento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosNovedadSeguimiento.add(this.jPanelid_empresaNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);



	if(iXPanelCamposOcultosNovedadSeguimiento % 1==0) {
		iXPanelCamposOcultosNovedadSeguimiento=0;
		iYPanelCamposOcultosNovedadSeguimiento++;
	}
	this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
	this.gridBagConstraintsNovedadSeguimiento.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNovedadSeguimiento.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNovedadSeguimiento.gridy = iYPanelCamposOcultosNovedadSeguimiento;
	this.gridBagConstraintsNovedadSeguimiento.gridx = iXPanelCamposOcultosNovedadSeguimiento++;
	this.gridBagConstraintsNovedadSeguimiento.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNovedadSeguimiento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosNovedadSeguimiento.add(this.jPanelid_sucursalNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);



	if(iXPanelCamposOcultosNovedadSeguimiento % 1==0) {
		iXPanelCamposOcultosNovedadSeguimiento=0;
		iYPanelCamposOcultosNovedadSeguimiento++;
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
			
		GridBagLayout gridaBagLayoutAccionesNovedadSeguimiento= new GridBagLayout();
		this.jPanelAccionesNovedadSeguimiento.setLayout(gridaBagLayoutAccionesNovedadSeguimiento);
		
		GridBagLayout gridaBagLayoutAccionesFormularioNovedadSeguimiento= new GridBagLayout();
		this.jPanelAccionesFormularioNovedadSeguimiento.setLayout(gridaBagLayoutAccionesFormularioNovedadSeguimiento);
		
		this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
		this.gridBagConstraintsNovedadSeguimiento.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsNovedadSeguimiento.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioNovedadSeguimiento.add(this.jComboBoxTiposAccionesFormularioNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);

		this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
		this.gridBagConstraintsNovedadSeguimiento.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsNovedadSeguimiento.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioNovedadSeguimiento.add(this.jCheckBoxPostAccionNuevoNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.novedadseguimientoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
			this.gridBagConstraintsNovedadSeguimiento.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsNovedadSeguimiento.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioNovedadSeguimiento.add(this.jCheckBoxPostAccionSinCerrarNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.novedadseguimientoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.novedadseguimientoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
			this.gridBagConstraintsNovedadSeguimiento.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsNovedadSeguimiento.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioNovedadSeguimiento.add(this.jCheckBoxPostAccionSinMensajeNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
		this.gridBagConstraintsNovedadSeguimiento.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNovedadSeguimiento.gridy = 0;
		this.gridBagConstraintsNovedadSeguimiento.gridx = iPosXAccion++;
			
		this.jPanelAccionesNovedadSeguimiento.add(this.jButtonModificarNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);							

		this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
		this.gridBagConstraintsNovedadSeguimiento.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNovedadSeguimiento.gridy = 0;
		this.gridBagConstraintsNovedadSeguimiento.gridx =iPosXAccion++;
			
		this.jPanelAccionesNovedadSeguimiento.add(this.jButtonEliminarNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);
		
			
		this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
		this.gridBagConstraintsNovedadSeguimiento.gridy = 0;		
		this.gridBagConstraintsNovedadSeguimiento.gridx = iPosXAccion++;
		
		this.jPanelAccionesNovedadSeguimiento.add(this.jButtonActualizarNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);


		this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
		this.gridBagConstraintsNovedadSeguimiento.gridy = 0;		
		this.gridBagConstraintsNovedadSeguimiento.gridx = iPosXAccion++;
		
		this.jPanelAccionesNovedadSeguimiento.add(this.jButtonGuardarCambiosNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);	
		
		this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
		this.gridBagConstraintsNovedadSeguimiento.gridy = 0;		
		this.gridBagConstraintsNovedadSeguimiento.gridx =iPosXAccion++;
		
		this.jPanelAccionesNovedadSeguimiento.add(this.jButtonCancelarNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutNovedadSeguimiento = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutNovedadSeguimiento);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.novedadseguimientoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();						
			this.gridBagConstraintsNovedadSeguimiento.gridy = iGridyPrincipal++;
			this.gridBagConstraintsNovedadSeguimiento.gridx = 0;		
			//this.gridBagConstraintsNovedadSeguimiento.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNovedadSeguimiento.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsNovedadSeguimiento.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
		this.gridBagConstraintsNovedadSeguimiento.gridy =iGridyPrincipal++;
		this.gridBagConstraintsNovedadSeguimiento.gridx =0;
		this.gridBagConstraintsNovedadSeguimiento.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsNovedadSeguimiento.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(NovedadSeguimientoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleNovedadSeguimiento = new NovedadSeguimientoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Novedad Seguimiento DATOS");
			
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
			
	        //this.setTitle("[FOR] - Novedad Seguimiento DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Novedad Seguimiento Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			NovedadSeguimientoModel novedadseguimientoModel=new NovedadSeguimientoModel(this);
			
			//SI USARA CLASE INTERNA
			//NovedadSeguimientoModel.NovedadSeguimientoFocusTraversalPolicy novedadseguimientoFocusTraversalPolicy = novedadseguimientoModel.new NovedadSeguimientoFocusTraversalPolicy(this);
			
			//novedadseguimientoFocusTraversalPolicy.setnovedadseguimientoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(novedadseguimientoModel);
			
			
			this.jContentPaneDetalleNovedadSeguimiento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleNovedadSeguimiento = new GridBagLayout();	
			this.jContentPaneDetalleNovedadSeguimiento.setLayout(gridaBagLayoutDetalleNovedadSeguimiento);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosNovedadSeguimiento = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
				this.gridBagConstraintsNovedadSeguimiento.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsNovedadSeguimiento.gridx = 0;
					
				
				this.jContentPaneDetalleNovedadSeguimiento.add(jTtoolBarDetalleNovedadSeguimiento, gridBagConstraintsNovedadSeguimiento);								
				
}
			
			this.jScrollPanelDatosEdicionNovedadSeguimiento=   new JScrollPane(jContentPaneDetalleNovedadSeguimiento,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionNovedadSeguimiento.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionNovedadSeguimiento.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionNovedadSeguimiento.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralNovedadSeguimiento=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralNovedadSeguimiento.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralNovedadSeguimiento.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralNovedadSeguimiento.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
			
			
	        this.gridBagConstraintsNovedadSeguimiento.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsNovedadSeguimiento.gridx = 0;
	        
			this.jContentPaneDetalleNovedadSeguimiento.add(jPanelCamposNovedadSeguimiento, gridBagConstraintsNovedadSeguimiento);
			
			
			
			
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
						&& novedadseguimientoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.novedadseguimientoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsNovedadSeguimiento= new GridBagConstraints();
						this.gridBagConstraintsNovedadSeguimiento.gridy = iGridyRelaciones++;
						this.gridBagConstraintsNovedadSeguimiento.gridx = 0;
						this.jContentPaneDetalleNovedadSeguimiento.add(this.jTabbedPaneRelacionesNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesNovedadSeguimiento.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosNovedadSeguimiento.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
					this.gridBagConstraintsNovedadSeguimiento.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsNovedadSeguimiento.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsNovedadSeguimiento.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsNovedadSeguimiento.gridx = 0;
					
				
					this.jContentPaneDetalleNovedadSeguimiento.add(jPanelCamposOcultosNovedadSeguimiento, gridBagConstraintsNovedadSeguimiento);
				
					this.jPanelCamposOcultosNovedadSeguimiento.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
			this.gridBagConstraintsNovedadSeguimiento.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsNovedadSeguimiento.gridx = 0;
	        this.gridBagConstraintsNovedadSeguimiento.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleNovedadSeguimiento.add(this.jPanelAccionesFormularioNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);							
			
			
			
			this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
	        this.gridBagConstraintsNovedadSeguimiento.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsNovedadSeguimiento.gridx = 0;
	        
			
			this.jContentPaneDetalleNovedadSeguimiento.add(this.jPanelAccionesNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionNovedadSeguimiento);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionNovedadSeguimiento=   new JScrollPane(this.jPanelCamposNovedadSeguimiento,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionNovedadSeguimiento.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionNovedadSeguimiento.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionNovedadSeguimiento.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
			this.gridBagConstraintsNovedadSeguimiento.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsNovedadSeguimiento.gridx = 0;
			this.gridBagConstraintsNovedadSeguimiento.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsNovedadSeguimiento.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsNovedadSeguimiento.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
			this.gridBagConstraintsNovedadSeguimiento.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsNovedadSeguimiento.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);			
			
			this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
			this.gridBagConstraintsNovedadSeguimiento.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsNovedadSeguimiento.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
		this.gridBagConstraintsNovedadSeguimiento.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNovedadSeguimiento.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);
			
			
		this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
		this.gridBagConstraintsNovedadSeguimiento.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNovedadSeguimiento.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);
		
			
		this.gridBagConstraintsNovedadSeguimiento = new GridBagConstraints();
		this.gridBagConstraintsNovedadSeguimiento.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsNovedadSeguimiento.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesNovedadSeguimiento, this.gridBagConstraintsNovedadSeguimiento);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralNovedadSeguimiento;//jContentPane;
		
		return jScrollPanelDatosEdicionNovedadSeguimiento;
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
