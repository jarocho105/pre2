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



import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;



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
import com.bydan.erp.seguridad.util.ParametroSeguridadConstantesFunciones;

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
public class ParametroSeguridadDetalleFormJInternalFrame extends ParametroSeguridadBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleParametroSeguridad;
	
	protected JMenuBar jmenuBarDetalleParametroSeguridad;
	
	protected JMenu jmenuDetalleParametroSeguridad;
	protected JMenu jmenuDetalleArchivoParametroSeguridad;
	protected JMenu jmenuDetalleAccionesParametroSeguridad;
	protected JMenu jmenuDetalleDatosParametroSeguridad;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleParametroSeguridad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutParametroSeguridad;	
	protected GridBagConstraints gridBagConstraintsParametroSeguridad;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ParametroSeguridadBeanSwingJInternalFrameAdditional jInternalFrameDetalleParametroSeguridad;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public ParametroSeguridadSessionBean parametroseguridadSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public ParametroSeguridadLogic parametroseguridadLogic;
	
	public JScrollPane jScrollPanelDatosParametroSeguridad;
	public JScrollPane jScrollPanelDatosEdicionParametroSeguridad;
	public JScrollPane jScrollPanelDatosGeneralParametroSeguridad;
	
	protected JPanel jPanelCamposParametroSeguridad;    
	protected JPanel jPanelCamposOcultosParametroSeguridad;    	
	protected JPanel jPanelAccionesParametroSeguridad;
	protected JPanel jPanelAccionesFormularioParametroSeguridad;
    
	
	
	protected Integer iXPanelCamposParametroSeguridad=0;
	protected Integer iYPanelCamposParametroSeguridad=0;
	
	protected Integer iXPanelCamposOcultosParametroSeguridad=0;
	protected Integer iYPanelCamposOcultosParametroSeguridad=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoParametroSeguridad;
	public JButton jButtonModificarParametroSeguridad;
	public JButton jButtonActualizarParametroSeguridad;
    public JButton jButtonEliminarParametroSeguridad;
	public JButton jButtonCancelarParametroSeguridad;
    public JButton jButtonGuardarCambiosParametroSeguridad;
	public JButton jButtonGuardarCambiosTablaParametroSeguridad;
	protected JButton jButtonCerrarParametroSeguridad;
	
	
	protected JButton jButtonProcesarInformacionParametroSeguridad;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoParametroSeguridad;
	protected JCheckBox jCheckBoxPostAccionSinCerrarParametroSeguridad;
	protected JCheckBox jCheckBoxPostAccionSinMensajeParametroSeguridad;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarParametroSeguridad;
	protected JButton jButtonModificarToolBarParametroSeguridad;
	protected JButton jButtonActualizarToolBarParametroSeguridad;
    protected JButton jButtonEliminarToolBarParametroSeguridad;
	protected JButton jButtonCancelarToolBarParametroSeguridad;
    protected JButton jButtonGuardarCambiosToolBarParametroSeguridad;
	protected JButton jButtonGuardarCambiosTablaToolBarParametroSeguridad;
	protected JButton jButtonMostrarOcultarTablaToolBarParametroSeguridad;
	protected JButton jButtonCerrarToolBarParametroSeguridad;
	
	protected JButton jButtonProcesarInformacionToolBarParametroSeguridad;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoParametroSeguridad;
	protected JMenuItem jMenuItemModificarParametroSeguridad;
	protected JMenuItem jMenuItemActualizarParametroSeguridad;
    protected JMenuItem jMenuItemEliminarParametroSeguridad;
	protected JMenuItem jMenuItemCancelarParametroSeguridad;
    protected JMenuItem jMenuItemGuardarCambiosParametroSeguridad;
	protected JMenuItem jMenuItemGuardarCambiosTablaParametroSeguridad;
	protected JMenuItem jMenuItemCerrarParametroSeguridad;
	protected JMenuItem jMenuItemDetalleCerrarParametroSeguridad;
	protected JMenuItem jMenuItemDetalleMostarOcultarParametroSeguridad;
	
	protected JMenuItem jMenuItemProcesarInformacionParametroSeguridad;
	protected JMenuItem jMenuItemNuevoGuardarCambiosParametroSeguridad;
	protected JMenuItem jMenuItemMostrarOcultarParametroSeguridad;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesParametroSeguridad;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesParametroSeguridad;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesParametroSeguridad;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioParametroSeguridad;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidParametroSeguridad;
	public JLabel jLabelIdParametroSeguridad;
	public JLabel jLabelidParametroSeguridad;
	public JButton jButtonidParametroSeguridadBusqueda= new JButtonMe();

	public JPanel jPanelcon_carteraParametroSeguridad;
	public JLabel jLabelcon_carteraParametroSeguridad;
	public JCheckBox jCheckBoxcon_carteraParametroSeguridad;
	public JButton jButtoncon_carteraParametroSeguridadBusqueda= new JButtonMe();

	public JPanel jPanelcon_copiar_clientesParametroSeguridad;
	public JLabel jLabelcon_copiar_clientesParametroSeguridad;
	public JCheckBox jCheckBoxcon_copiar_clientesParametroSeguridad;
	public JButton jButtoncon_copiar_clientesParametroSeguridadBusqueda= new JButtonMe();

	public JPanel jPanelcon_copiar_proveedoresParametroSeguridad;
	public JLabel jLabelcon_copiar_proveedoresParametroSeguridad;
	public JCheckBox jCheckBoxcon_copiar_proveedoresParametroSeguridad;
	public JButton jButtoncon_copiar_proveedoresParametroSeguridadBusqueda= new JButtonMe();

	public JPanel jPanelcon_generar_cliente_proveParametroSeguridad;
	public JLabel jLabelcon_generar_cliente_proveParametroSeguridad;
	public JCheckBox jCheckBoxcon_generar_cliente_proveParametroSeguridad;
	public JButton jButtoncon_generar_cliente_proveParametroSeguridadBusqueda= new JButtonMe();

	public JPanel jPanelcliente_con_secuencial_autoParametroSeguridad;
	public JLabel jLabelcliente_con_secuencial_autoParametroSeguridad;
	public JCheckBox jCheckBoxcliente_con_secuencial_autoParametroSeguridad;
	public JButton jButtoncliente_con_secuencial_autoParametroSeguridadBusqueda= new JButtonMe();

	public JPanel jPanelcliente_num_maximo_inicialesParametroSeguridad;
	public JLabel jLabelcliente_num_maximo_inicialesParametroSeguridad;
	public JTextField jTextFieldcliente_num_maximo_inicialesParametroSeguridad;
	public JButton jButtoncliente_num_maximo_inicialesParametroSeguridadBusqueda= new JButtonMe();

	public JPanel jPanelprove_con_secuencial_autoParametroSeguridad;
	public JLabel jLabelprove_con_secuencial_autoParametroSeguridad;
	public JCheckBox jCheckBoxprove_con_secuencial_autoParametroSeguridad;
	public JButton jButtonprove_con_secuencial_autoParametroSeguridadBusqueda= new JButtonMe();

	public JPanel jPanelprove_num_maximo_inicialesParametroSeguridad;
	public JLabel jLabelprove_num_maximo_inicialesParametroSeguridad;
	public JTextField jTextFieldprove_num_maximo_inicialesParametroSeguridad;
	public JButton jButtonprove_num_maximo_inicialesParametroSeguridadBusqueda= new JButtonMe();

	public JPanel jPanelcon_validar_gruposParametroSeguridad;
	public JLabel jLabelcon_validar_gruposParametroSeguridad;
	public JCheckBox jCheckBoxcon_validar_gruposParametroSeguridad;
	public JButton jButtoncon_validar_gruposParametroSeguridadBusqueda= new JButtonMe();

	public JPanel jPanelacti_fijo_con_secuencial_autoParametroSeguridad;
	public JLabel jLabelacti_fijo_con_secuencial_autoParametroSeguridad;
	public JCheckBox jCheckBoxacti_fijo_con_secuencial_autoParametroSeguridad;
	public JButton jButtonacti_fijo_con_secuencial_autoParametroSeguridadBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaParametroSeguridad;
	public JLabel jLabelid_empresaParametroSeguridad;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaParametroSeguridad;
	public JButton jButtonid_empresaParametroSeguridad= new JButtonMe();
	public JButton jButtonid_empresaParametroSeguridadUpdate= new JButtonMe();
	public JButton jButtonid_empresaParametroSeguridadBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesParametroSeguridad;
	
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
	
	public ParametroSeguridadDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposParametroSeguridad=new JPanel();
				this.jPanelAccionesFormularioParametroSeguridad=new JPanel();
				this.jmenuBarDetalleParametroSeguridad=new JMenuBar();
				this.jTtoolBarDetalleParametroSeguridad=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroSeguridadDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ParametroSeguridad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ParametroSeguridadDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ParametroSeguridad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroSeguridadDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroSeguridad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroSeguridadDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroSeguridad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroSeguridadDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ParametroSeguridad No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarParametroSeguridad() {
		return this.jButtonActualizarToolBarParametroSeguridad;
	}
	
	public JButton getjButtonEliminarToolBarParametroSeguridad() {
		return this.jButtonEliminarToolBarParametroSeguridad;
	}
	
	public JButton getjButtonCancelarToolBarParametroSeguridad() {
		return this.jButtonCancelarToolBarParametroSeguridad;
	}		
	
	public JButton getjButtonProcesarInformacionParametroSeguridad() {
		return this.jButtonProcesarInformacionParametroSeguridad;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionParametroSeguridad)	{
		this.jButtonProcesarInformacionParametroSeguridad = jButtonProcesarInformacionParametroSeguridad;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesParametroSeguridad() {
		return this.jComboBoxTiposAccionesParametroSeguridad;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesParametroSeguridad(
			JComboBox jComboBoxTiposRelacionesParametroSeguridad) {
		this.jComboBoxTiposRelacionesParametroSeguridad = jComboBoxTiposRelacionesParametroSeguridad;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesParametroSeguridad(
			JComboBox jComboBoxTiposAccionesParametroSeguridad) {
		this.jComboBoxTiposAccionesParametroSeguridad = jComboBoxTiposAccionesParametroSeguridad;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioParametroSeguridad() {
		return this.jComboBoxTiposAccionesFormularioParametroSeguridad;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioParametroSeguridad(
			JComboBox jComboBoxTiposAccionesFormularioParametroSeguridad) {
		this.jComboBoxTiposAccionesFormularioParametroSeguridad = jComboBoxTiposAccionesFormularioParametroSeguridad;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.parametroseguridadSessionBean=new ParametroSeguridadSessionBean();
		
		this.parametroseguridadSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.parametroseguridadSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.parametroseguridadSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ParametroSeguridadJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ParametroSeguridadJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ParametroSeguridadJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Parametro Seguridad MANTENIMIENTO"));
		
		
		if(iWidth > 1250) {
			iWidth=1250;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.parametroseguridadSessionBean.getEsGuardarRelacionado()) {
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
	
		ParametroSeguridadJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleParametroSeguridad= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarParametroSeguridad=new JButtonMe();
				this.jButtonModificarToolBarParametroSeguridad=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarParametroSeguridad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarParametroSeguridad,this.jTtoolBarDetalleParametroSeguridad,
							"actualizar","actualizar","Actualizar"+" "+ParametroSeguridadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarParametroSeguridad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarParametroSeguridad,this.jTtoolBarDetalleParametroSeguridad,
							"eliminar","eliminar","Eliminar"+" "+ParametroSeguridadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarParametroSeguridad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarParametroSeguridad,this.jTtoolBarDetalleParametroSeguridad,
							"cancelar","cancelar","Cancelar"+" "+ParametroSeguridadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarParametroSeguridad=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarParametroSeguridad,this.jTtoolBarDetalleParametroSeguridad,
							"guardarcambios","guardarcambios","Guardar"+" "+ParametroSeguridadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarParametroSeguridad,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarParametroSeguridad,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarParametroSeguridad,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleParametroSeguridad=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleParametroSeguridad=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoParametroSeguridad=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesParametroSeguridad=new JMenuMe("Acciones");
		this.jmenuDetalleDatosParametroSeguridad=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoParametroSeguridad= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoParametroSeguridad.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoParametroSeguridad,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoParametroSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarParametroSeguridad= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarParametroSeguridad.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarParametroSeguridad,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarParametroSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarParametroSeguridad= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarParametroSeguridad.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarParametroSeguridad,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarParametroSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarParametroSeguridad= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarParametroSeguridad.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarParametroSeguridad,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarParametroSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarParametroSeguridad= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarParametroSeguridad.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarParametroSeguridad,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarParametroSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosParametroSeguridad= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosParametroSeguridad.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosParametroSeguridad,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosParametroSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarParametroSeguridad= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarParametroSeguridad.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarParametroSeguridad,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarParametroSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarParametroSeguridad= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarParametroSeguridad.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarParametroSeguridad,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarParametroSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarParametroSeguridad= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarParametroSeguridad.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarParametroSeguridad,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarParametroSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarParametroSeguridad= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarParametroSeguridad.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarParametroSeguridad,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarParametroSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoParametroSeguridad.add(this.jMenuItemDetalleCerrarParametroSeguridad);
		
		this.jmenuDetalleAccionesParametroSeguridad.add(this.jMenuItemActualizarParametroSeguridad);
		this.jmenuDetalleAccionesParametroSeguridad.add(this.jMenuItemEliminarParametroSeguridad);
		this.jmenuDetalleAccionesParametroSeguridad.add(this.jMenuItemCancelarParametroSeguridad);		
		
		//this.jmenuDetalleDatosParametroSeguridad.add(this.jMenuItemDetalleAbrirOrderByParametroSeguridad);				
		this.jmenuDetalleDatosParametroSeguridad.add(this.jMenuItemDetalleMostarOcultarParametroSeguridad);				
				
		//this.jmenuDetalleAccionesParametroSeguridad.add(this.jMenuItemGuardarCambiosParametroSeguridad);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoParametroSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesParametroSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosParametroSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleParametroSeguridad.add(this.jmenuDetalleArchivoParametroSeguridad);		
		this.jmenuBarDetalleParametroSeguridad.add(this.jmenuDetalleAccionesParametroSeguridad);		
		this.jmenuBarDetalleParametroSeguridad.add(this.jmenuDetalleDatosParametroSeguridad);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleParametroSeguridad);				
	}
	
	
	public void inicializarElementosCamposParametroSeguridad() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdParametroSeguridad = new JLabelMe();
		jLabelIdParametroSeguridad.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdParametroSeguridad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdParametroSeguridad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdParametroSeguridad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdParametroSeguridad,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidParametroSeguridad = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidParametroSeguridad.setToolTipText(ParametroSeguridadConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutParametroSeguridad= new GridBagLayout();

		this.jPanelidParametroSeguridad.setLayout(this.gridaBagLayoutParametroSeguridad);

		jLabelidParametroSeguridad = new JLabel();
		jLabelidParametroSeguridad.setText("Id");

		jLabelidParametroSeguridad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidParametroSeguridad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidParametroSeguridad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcon_carteraParametroSeguridad = new JLabelMe();
		this.jLabelcon_carteraParametroSeguridad.setText(""+ParametroSeguridadConstantesFunciones.LABEL_CONCARTERA+" : *");
		this.jLabelcon_carteraParametroSeguridad.setToolTipText("Cartera");
		this.jLabelcon_carteraParametroSeguridad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_carteraParametroSeguridad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_carteraParametroSeguridad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_carteraParametroSeguridad,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_carteraParametroSeguridad=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_carteraParametroSeguridad.setToolTipText(ParametroSeguridadConstantesFunciones.LABEL_CONCARTERA);
		this.gridaBagLayoutParametroSeguridad = new GridBagLayout();
		this.jPanelcon_carteraParametroSeguridad.setLayout(this.gridaBagLayoutParametroSeguridad);


		jCheckBoxcon_carteraParametroSeguridad= new JCheckBoxMe();
		jCheckBoxcon_carteraParametroSeguridad.setEnabled(false);

		jCheckBoxcon_carteraParametroSeguridad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_carteraParametroSeguridad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_carteraParametroSeguridad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_carteraParametroSeguridad,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_carteraParametroSeguridadBusqueda= new JButtonMe();
		this.jButtoncon_carteraParametroSeguridadBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_carteraParametroSeguridadBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_carteraParametroSeguridadBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_carteraParametroSeguridadBusqueda.setText("U");
		this.jButtoncon_carteraParametroSeguridadBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_carteraParametroSeguridadBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_carteraParametroSeguridadBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_carteraParametroSeguridad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_carteraParametroSeguridad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_carteraParametroSeguridadBusqueda"));

		if(this.parametroseguridadSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_carteraParametroSeguridadBusqueda.setVisible(false);		}


					
		this.jLabelcon_copiar_clientesParametroSeguridad = new JLabelMe();
		this.jLabelcon_copiar_clientesParametroSeguridad.setText(""+ParametroSeguridadConstantesFunciones.LABEL_CONCOPIARCLIENTES+" : *");
		this.jLabelcon_copiar_clientesParametroSeguridad.setToolTipText("Copiar Clientes");
		this.jLabelcon_copiar_clientesParametroSeguridad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_copiar_clientesParametroSeguridad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_copiar_clientesParametroSeguridad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_copiar_clientesParametroSeguridad,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_copiar_clientesParametroSeguridad=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_copiar_clientesParametroSeguridad.setToolTipText(ParametroSeguridadConstantesFunciones.LABEL_CONCOPIARCLIENTES);
		this.gridaBagLayoutParametroSeguridad = new GridBagLayout();
		this.jPanelcon_copiar_clientesParametroSeguridad.setLayout(this.gridaBagLayoutParametroSeguridad);


		jCheckBoxcon_copiar_clientesParametroSeguridad= new JCheckBoxMe();
		jCheckBoxcon_copiar_clientesParametroSeguridad.setEnabled(false);

		jCheckBoxcon_copiar_clientesParametroSeguridad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_copiar_clientesParametroSeguridad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_copiar_clientesParametroSeguridad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_copiar_clientesParametroSeguridad,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_copiar_clientesParametroSeguridadBusqueda= new JButtonMe();
		this.jButtoncon_copiar_clientesParametroSeguridadBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_copiar_clientesParametroSeguridadBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_copiar_clientesParametroSeguridadBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_copiar_clientesParametroSeguridadBusqueda.setText("U");
		this.jButtoncon_copiar_clientesParametroSeguridadBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_copiar_clientesParametroSeguridadBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_copiar_clientesParametroSeguridadBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_copiar_clientesParametroSeguridad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_copiar_clientesParametroSeguridad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_copiar_clientesParametroSeguridadBusqueda"));

		if(this.parametroseguridadSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_copiar_clientesParametroSeguridadBusqueda.setVisible(false);		}


					
		this.jLabelcon_copiar_proveedoresParametroSeguridad = new JLabelMe();
		this.jLabelcon_copiar_proveedoresParametroSeguridad.setText(""+ParametroSeguridadConstantesFunciones.LABEL_CONCOPIARPROVEEDORES+" : *");
		this.jLabelcon_copiar_proveedoresParametroSeguridad.setToolTipText("Copiar Proveedores");
		this.jLabelcon_copiar_proveedoresParametroSeguridad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_copiar_proveedoresParametroSeguridad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcon_copiar_proveedoresParametroSeguridad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_copiar_proveedoresParametroSeguridad,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_copiar_proveedoresParametroSeguridad=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_copiar_proveedoresParametroSeguridad.setToolTipText(ParametroSeguridadConstantesFunciones.LABEL_CONCOPIARPROVEEDORES);
		this.gridaBagLayoutParametroSeguridad = new GridBagLayout();
		this.jPanelcon_copiar_proveedoresParametroSeguridad.setLayout(this.gridaBagLayoutParametroSeguridad);


		jCheckBoxcon_copiar_proveedoresParametroSeguridad= new JCheckBoxMe();
		jCheckBoxcon_copiar_proveedoresParametroSeguridad.setEnabled(false);

		jCheckBoxcon_copiar_proveedoresParametroSeguridad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_copiar_proveedoresParametroSeguridad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_copiar_proveedoresParametroSeguridad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_copiar_proveedoresParametroSeguridad,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_copiar_proveedoresParametroSeguridadBusqueda= new JButtonMe();
		this.jButtoncon_copiar_proveedoresParametroSeguridadBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_copiar_proveedoresParametroSeguridadBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_copiar_proveedoresParametroSeguridadBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_copiar_proveedoresParametroSeguridadBusqueda.setText("U");
		this.jButtoncon_copiar_proveedoresParametroSeguridadBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_copiar_proveedoresParametroSeguridadBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_copiar_proveedoresParametroSeguridadBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_copiar_proveedoresParametroSeguridad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_copiar_proveedoresParametroSeguridad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_copiar_proveedoresParametroSeguridadBusqueda"));

		if(this.parametroseguridadSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_copiar_proveedoresParametroSeguridadBusqueda.setVisible(false);		}


					
		this.jLabelcon_generar_cliente_proveParametroSeguridad = new JLabelMe();
		this.jLabelcon_generar_cliente_proveParametroSeguridad.setText(""+ParametroSeguridadConstantesFunciones.LABEL_CONGENERARCLIENTEPROVE+" : *");
		this.jLabelcon_generar_cliente_proveParametroSeguridad.setToolTipText("Generar Clientes-Proveedores");
		this.jLabelcon_generar_cliente_proveParametroSeguridad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcon_generar_cliente_proveParametroSeguridad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcon_generar_cliente_proveParametroSeguridad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_generar_cliente_proveParametroSeguridad,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_generar_cliente_proveParametroSeguridad=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_generar_cliente_proveParametroSeguridad.setToolTipText(ParametroSeguridadConstantesFunciones.LABEL_CONGENERARCLIENTEPROVE);
		this.gridaBagLayoutParametroSeguridad = new GridBagLayout();
		this.jPanelcon_generar_cliente_proveParametroSeguridad.setLayout(this.gridaBagLayoutParametroSeguridad);


		jCheckBoxcon_generar_cliente_proveParametroSeguridad= new JCheckBoxMe();
		jCheckBoxcon_generar_cliente_proveParametroSeguridad.setEnabled(false);

		jCheckBoxcon_generar_cliente_proveParametroSeguridad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_generar_cliente_proveParametroSeguridad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_generar_cliente_proveParametroSeguridad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_generar_cliente_proveParametroSeguridad,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_generar_cliente_proveParametroSeguridadBusqueda= new JButtonMe();
		this.jButtoncon_generar_cliente_proveParametroSeguridadBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_generar_cliente_proveParametroSeguridadBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_generar_cliente_proveParametroSeguridadBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_generar_cliente_proveParametroSeguridadBusqueda.setText("U");
		this.jButtoncon_generar_cliente_proveParametroSeguridadBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_generar_cliente_proveParametroSeguridadBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_generar_cliente_proveParametroSeguridadBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_generar_cliente_proveParametroSeguridad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_generar_cliente_proveParametroSeguridad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_generar_cliente_proveParametroSeguridadBusqueda"));

		if(this.parametroseguridadSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_generar_cliente_proveParametroSeguridadBusqueda.setVisible(false);		}


					
		this.jLabelcliente_con_secuencial_autoParametroSeguridad = new JLabelMe();
		this.jLabelcliente_con_secuencial_autoParametroSeguridad.setText(""+ParametroSeguridadConstantesFunciones.LABEL_CLIENTECONSECUENCIALAUTO+" : *");
		this.jLabelcliente_con_secuencial_autoParametroSeguridad.setToolTipText("Secuencial Automa.");
		this.jLabelcliente_con_secuencial_autoParametroSeguridad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcliente_con_secuencial_autoParametroSeguridad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcliente_con_secuencial_autoParametroSeguridad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcliente_con_secuencial_autoParametroSeguridad,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcliente_con_secuencial_autoParametroSeguridad=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcliente_con_secuencial_autoParametroSeguridad.setToolTipText(ParametroSeguridadConstantesFunciones.LABEL_CLIENTECONSECUENCIALAUTO);
		this.gridaBagLayoutParametroSeguridad = new GridBagLayout();
		this.jPanelcliente_con_secuencial_autoParametroSeguridad.setLayout(this.gridaBagLayoutParametroSeguridad);


		jCheckBoxcliente_con_secuencial_autoParametroSeguridad= new JCheckBoxMe();
		jCheckBoxcliente_con_secuencial_autoParametroSeguridad.setEnabled(false);

		jCheckBoxcliente_con_secuencial_autoParametroSeguridad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcliente_con_secuencial_autoParametroSeguridad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcliente_con_secuencial_autoParametroSeguridad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcliente_con_secuencial_autoParametroSeguridad,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncliente_con_secuencial_autoParametroSeguridadBusqueda= new JButtonMe();
		this.jButtoncliente_con_secuencial_autoParametroSeguridadBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncliente_con_secuencial_autoParametroSeguridadBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncliente_con_secuencial_autoParametroSeguridadBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncliente_con_secuencial_autoParametroSeguridadBusqueda.setText("U");
		this.jButtoncliente_con_secuencial_autoParametroSeguridadBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncliente_con_secuencial_autoParametroSeguridadBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncliente_con_secuencial_autoParametroSeguridadBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcliente_con_secuencial_autoParametroSeguridad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcliente_con_secuencial_autoParametroSeguridad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cliente_con_secuencial_autoParametroSeguridadBusqueda"));

		if(this.parametroseguridadSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncliente_con_secuencial_autoParametroSeguridadBusqueda.setVisible(false);		}


					
		this.jLabelcliente_num_maximo_inicialesParametroSeguridad = new JLabelMe();
		this.jLabelcliente_num_maximo_inicialesParametroSeguridad.setText(""+ParametroSeguridadConstantesFunciones.LABEL_CLIENTENUMMAXIMOINICIALES+" : *");
		this.jLabelcliente_num_maximo_inicialesParametroSeguridad.setToolTipText("Numero Maximo Iniciales");
		this.jLabelcliente_num_maximo_inicialesParametroSeguridad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcliente_num_maximo_inicialesParametroSeguridad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcliente_num_maximo_inicialesParametroSeguridad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelcliente_num_maximo_inicialesParametroSeguridad,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcliente_num_maximo_inicialesParametroSeguridad=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcliente_num_maximo_inicialesParametroSeguridad.setToolTipText(ParametroSeguridadConstantesFunciones.LABEL_CLIENTENUMMAXIMOINICIALES);
		this.gridaBagLayoutParametroSeguridad = new GridBagLayout();
		this.jPanelcliente_num_maximo_inicialesParametroSeguridad.setLayout(this.gridaBagLayoutParametroSeguridad);


		jTextFieldcliente_num_maximo_inicialesParametroSeguridad= new JTextFieldMe();
		jTextFieldcliente_num_maximo_inicialesParametroSeguridad.setEnabled(false);
		jTextFieldcliente_num_maximo_inicialesParametroSeguridad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcliente_num_maximo_inicialesParametroSeguridad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcliente_num_maximo_inicialesParametroSeguridad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcliente_num_maximo_inicialesParametroSeguridad,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcliente_num_maximo_inicialesParametroSeguridad.setText("0");

		this.jButtoncliente_num_maximo_inicialesParametroSeguridadBusqueda= new JButtonMe();
		this.jButtoncliente_num_maximo_inicialesParametroSeguridadBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncliente_num_maximo_inicialesParametroSeguridadBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncliente_num_maximo_inicialesParametroSeguridadBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncliente_num_maximo_inicialesParametroSeguridadBusqueda.setText("U");
		this.jButtoncliente_num_maximo_inicialesParametroSeguridadBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncliente_num_maximo_inicialesParametroSeguridadBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncliente_num_maximo_inicialesParametroSeguridadBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcliente_num_maximo_inicialesParametroSeguridad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcliente_num_maximo_inicialesParametroSeguridad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cliente_num_maximo_inicialesParametroSeguridadBusqueda"));

		if(this.parametroseguridadSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncliente_num_maximo_inicialesParametroSeguridadBusqueda.setVisible(false);		}


					
		this.jLabelprove_con_secuencial_autoParametroSeguridad = new JLabelMe();
		this.jLabelprove_con_secuencial_autoParametroSeguridad.setText(""+ParametroSeguridadConstantesFunciones.LABEL_PROVECONSECUENCIALAUTO+" : *");
		this.jLabelprove_con_secuencial_autoParametroSeguridad.setToolTipText("Secuencial Automatico");
		this.jLabelprove_con_secuencial_autoParametroSeguridad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelprove_con_secuencial_autoParametroSeguridad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelprove_con_secuencial_autoParametroSeguridad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelprove_con_secuencial_autoParametroSeguridad,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelprove_con_secuencial_autoParametroSeguridad=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelprove_con_secuencial_autoParametroSeguridad.setToolTipText(ParametroSeguridadConstantesFunciones.LABEL_PROVECONSECUENCIALAUTO);
		this.gridaBagLayoutParametroSeguridad = new GridBagLayout();
		this.jPanelprove_con_secuencial_autoParametroSeguridad.setLayout(this.gridaBagLayoutParametroSeguridad);


		jCheckBoxprove_con_secuencial_autoParametroSeguridad= new JCheckBoxMe();
		jCheckBoxprove_con_secuencial_autoParametroSeguridad.setEnabled(false);

		jCheckBoxprove_con_secuencial_autoParametroSeguridad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxprove_con_secuencial_autoParametroSeguridad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxprove_con_secuencial_autoParametroSeguridad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxprove_con_secuencial_autoParametroSeguridad,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonprove_con_secuencial_autoParametroSeguridadBusqueda= new JButtonMe();
		this.jButtonprove_con_secuencial_autoParametroSeguridadBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprove_con_secuencial_autoParametroSeguridadBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprove_con_secuencial_autoParametroSeguridadBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonprove_con_secuencial_autoParametroSeguridadBusqueda.setText("U");
		this.jButtonprove_con_secuencial_autoParametroSeguridadBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonprove_con_secuencial_autoParametroSeguridadBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonprove_con_secuencial_autoParametroSeguridadBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxprove_con_secuencial_autoParametroSeguridad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxprove_con_secuencial_autoParametroSeguridad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"prove_con_secuencial_autoParametroSeguridadBusqueda"));

		if(this.parametroseguridadSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonprove_con_secuencial_autoParametroSeguridadBusqueda.setVisible(false);		}


					
		this.jLabelprove_num_maximo_inicialesParametroSeguridad = new JLabelMe();
		this.jLabelprove_num_maximo_inicialesParametroSeguridad.setText(""+ParametroSeguridadConstantesFunciones.LABEL_PROVENUMMAXIMOINICIALES+" : *");
		this.jLabelprove_num_maximo_inicialesParametroSeguridad.setToolTipText("Numero Maximo Iniciales.");
		this.jLabelprove_num_maximo_inicialesParametroSeguridad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelprove_num_maximo_inicialesParametroSeguridad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelprove_num_maximo_inicialesParametroSeguridad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelprove_num_maximo_inicialesParametroSeguridad,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelprove_num_maximo_inicialesParametroSeguridad=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelprove_num_maximo_inicialesParametroSeguridad.setToolTipText(ParametroSeguridadConstantesFunciones.LABEL_PROVENUMMAXIMOINICIALES);
		this.gridaBagLayoutParametroSeguridad = new GridBagLayout();
		this.jPanelprove_num_maximo_inicialesParametroSeguridad.setLayout(this.gridaBagLayoutParametroSeguridad);


		jTextFieldprove_num_maximo_inicialesParametroSeguridad= new JTextFieldMe();
		jTextFieldprove_num_maximo_inicialesParametroSeguridad.setEnabled(false);
		jTextFieldprove_num_maximo_inicialesParametroSeguridad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprove_num_maximo_inicialesParametroSeguridad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprove_num_maximo_inicialesParametroSeguridad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldprove_num_maximo_inicialesParametroSeguridad,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldprove_num_maximo_inicialesParametroSeguridad.setText("0");

		this.jButtonprove_num_maximo_inicialesParametroSeguridadBusqueda= new JButtonMe();
		this.jButtonprove_num_maximo_inicialesParametroSeguridadBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprove_num_maximo_inicialesParametroSeguridadBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprove_num_maximo_inicialesParametroSeguridadBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonprove_num_maximo_inicialesParametroSeguridadBusqueda.setText("U");
		this.jButtonprove_num_maximo_inicialesParametroSeguridadBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonprove_num_maximo_inicialesParametroSeguridadBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonprove_num_maximo_inicialesParametroSeguridadBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldprove_num_maximo_inicialesParametroSeguridad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldprove_num_maximo_inicialesParametroSeguridad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"prove_num_maximo_inicialesParametroSeguridadBusqueda"));

		if(this.parametroseguridadSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonprove_num_maximo_inicialesParametroSeguridadBusqueda.setVisible(false);		}


					
		this.jLabelcon_validar_gruposParametroSeguridad = new JLabelMe();
		this.jLabelcon_validar_gruposParametroSeguridad.setText(""+ParametroSeguridadConstantesFunciones.LABEL_CONVALIDARGRUPOS+" : *");
		this.jLabelcon_validar_gruposParametroSeguridad.setToolTipText("Validar Grupos");
		this.jLabelcon_validar_gruposParametroSeguridad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_validar_gruposParametroSeguridad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_validar_gruposParametroSeguridad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_validar_gruposParametroSeguridad,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_validar_gruposParametroSeguridad=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_validar_gruposParametroSeguridad.setToolTipText(ParametroSeguridadConstantesFunciones.LABEL_CONVALIDARGRUPOS);
		this.gridaBagLayoutParametroSeguridad = new GridBagLayout();
		this.jPanelcon_validar_gruposParametroSeguridad.setLayout(this.gridaBagLayoutParametroSeguridad);


		jCheckBoxcon_validar_gruposParametroSeguridad= new JCheckBoxMe();
		jCheckBoxcon_validar_gruposParametroSeguridad.setEnabled(false);

		jCheckBoxcon_validar_gruposParametroSeguridad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_validar_gruposParametroSeguridad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_validar_gruposParametroSeguridad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_validar_gruposParametroSeguridad,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_validar_gruposParametroSeguridadBusqueda= new JButtonMe();
		this.jButtoncon_validar_gruposParametroSeguridadBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_validar_gruposParametroSeguridadBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_validar_gruposParametroSeguridadBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_validar_gruposParametroSeguridadBusqueda.setText("U");
		this.jButtoncon_validar_gruposParametroSeguridadBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_validar_gruposParametroSeguridadBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_validar_gruposParametroSeguridadBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_validar_gruposParametroSeguridad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_validar_gruposParametroSeguridad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_validar_gruposParametroSeguridadBusqueda"));

		if(this.parametroseguridadSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_validar_gruposParametroSeguridadBusqueda.setVisible(false);		}


					
		this.jLabelacti_fijo_con_secuencial_autoParametroSeguridad = new JLabelMe();
		this.jLabelacti_fijo_con_secuencial_autoParametroSeguridad.setText(""+ParametroSeguridadConstantesFunciones.LABEL_ACTIFIJOCONSECUENCIALAUTO+" : *");
		this.jLabelacti_fijo_con_secuencial_autoParametroSeguridad.setToolTipText("Activos Fijos Sec. Autom.");
		this.jLabelacti_fijo_con_secuencial_autoParametroSeguridad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelacti_fijo_con_secuencial_autoParametroSeguridad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelacti_fijo_con_secuencial_autoParametroSeguridad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelacti_fijo_con_secuencial_autoParametroSeguridad,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelacti_fijo_con_secuencial_autoParametroSeguridad=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelacti_fijo_con_secuencial_autoParametroSeguridad.setToolTipText(ParametroSeguridadConstantesFunciones.LABEL_ACTIFIJOCONSECUENCIALAUTO);
		this.gridaBagLayoutParametroSeguridad = new GridBagLayout();
		this.jPanelacti_fijo_con_secuencial_autoParametroSeguridad.setLayout(this.gridaBagLayoutParametroSeguridad);


		jCheckBoxacti_fijo_con_secuencial_autoParametroSeguridad= new JCheckBoxMe();
		jCheckBoxacti_fijo_con_secuencial_autoParametroSeguridad.setEnabled(false);

		jCheckBoxacti_fijo_con_secuencial_autoParametroSeguridad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxacti_fijo_con_secuencial_autoParametroSeguridad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxacti_fijo_con_secuencial_autoParametroSeguridad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxacti_fijo_con_secuencial_autoParametroSeguridad,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonacti_fijo_con_secuencial_autoParametroSeguridadBusqueda= new JButtonMe();
		this.jButtonacti_fijo_con_secuencial_autoParametroSeguridadBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonacti_fijo_con_secuencial_autoParametroSeguridadBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonacti_fijo_con_secuencial_autoParametroSeguridadBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonacti_fijo_con_secuencial_autoParametroSeguridadBusqueda.setText("U");
		this.jButtonacti_fijo_con_secuencial_autoParametroSeguridadBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonacti_fijo_con_secuencial_autoParametroSeguridadBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonacti_fijo_con_secuencial_autoParametroSeguridadBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxacti_fijo_con_secuencial_autoParametroSeguridad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxacti_fijo_con_secuencial_autoParametroSeguridad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"acti_fijo_con_secuencial_autoParametroSeguridadBusqueda"));

		if(this.parametroseguridadSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonacti_fijo_con_secuencial_autoParametroSeguridadBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysParametroSeguridad() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaParametroSeguridad = new JLabelMe();
		this.jLabelid_empresaParametroSeguridad.setText(""+ParametroSeguridadConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaParametroSeguridad.setToolTipText("Empresa");
		this.jLabelid_empresaParametroSeguridad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaParametroSeguridad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaParametroSeguridad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaParametroSeguridad,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaParametroSeguridad=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaParametroSeguridad.setToolTipText(ParametroSeguridadConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutParametroSeguridad = new GridBagLayout();
		this.jPanelid_empresaParametroSeguridad.setLayout(this.gridaBagLayoutParametroSeguridad);


		jComboBoxid_empresaParametroSeguridad= new JComboBoxMe();
		jComboBoxid_empresaParametroSeguridad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaParametroSeguridad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaParametroSeguridad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaParametroSeguridad,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaParametroSeguridad.setEnabled(false);

		this.jButtonid_empresaParametroSeguridad= new JButtonMe();
		this.jButtonid_empresaParametroSeguridad.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaParametroSeguridad.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaParametroSeguridad.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaParametroSeguridad.setText("Buscar");
		this.jButtonid_empresaParametroSeguridad.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaParametroSeguridad.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaParametroSeguridad,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaParametroSeguridad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaParametroSeguridad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaParametroSeguridad"));

		this.jButtonid_empresaParametroSeguridadBusqueda= new JButtonMe();
		this.jButtonid_empresaParametroSeguridadBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroSeguridadBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroSeguridadBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaParametroSeguridadBusqueda.setText("U");
		this.jButtonid_empresaParametroSeguridadBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaParametroSeguridadBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaParametroSeguridadBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaParametroSeguridad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaParametroSeguridad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaParametroSeguridadBusqueda"));

		if(this.parametroseguridadSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaParametroSeguridadBusqueda.setVisible(false);		}

		this.jButtonid_empresaParametroSeguridadUpdate= new JButtonMe();
		this.jButtonid_empresaParametroSeguridadUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroSeguridadUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroSeguridadUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaParametroSeguridadUpdate.setText("U");
		this.jButtonid_empresaParametroSeguridadUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaParametroSeguridadUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaParametroSeguridadUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaParametroSeguridad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaParametroSeguridad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaParametroSeguridadUpdate"));



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
		//this.jInternalFrameDetalleParametroSeguridad = new ParametroSeguridadBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Parametro Seguridad DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutParametroSeguridad= new GridBagLayout();
		

		
		String sToolTipParametroSeguridad="";
		sToolTipParametroSeguridad=ParametroSeguridadConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipParametroSeguridad+="(Seguridad.ParametroSeguridad)";
		}
		
		if(!this.parametroseguridadSessionBean.getEsGuardarRelacionado()) {
			sToolTipParametroSeguridad+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoParametroSeguridad = new JButtonMe();
		this.jButtonModificarParametroSeguridad = new JButtonMe();
        this.jButtonActualizarParametroSeguridad = new JButtonMe();
        this.jButtonEliminarParametroSeguridad = new JButtonMe();
        this.jButtonCancelarParametroSeguridad = new JButtonMe();
        this.jButtonGuardarCambiosParametroSeguridad = new JButtonMe();
		this.jButtonGuardarCambiosTablaParametroSeguridad = new JButtonMe();
		this.jButtonCerrarParametroSeguridad = new JButtonMe();
		
		this.jScrollPanelDatosParametroSeguridad = new JScrollPane();   
        this.jScrollPanelDatosEdicionParametroSeguridad = new JScrollPane();
		this.jScrollPanelDatosGeneralParametroSeguridad = new JScrollPane();
				
		
		
		this.jPanelCamposParametroSeguridad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosParametroSeguridad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesParametroSeguridad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioParametroSeguridad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Parametro Seguridad";
		
		if(!this.parametroseguridadSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosParametroSeguridad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Seguridades" + this.sPath));
		} else {
			this.jScrollPanelDatosParametroSeguridad.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionParametroSeguridad.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralParametroSeguridad.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposParametroSeguridad.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposParametroSeguridad.setName("jPanelCamposParametroSeguridad"); 

		this.jPanelCamposOcultosParametroSeguridad.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosParametroSeguridad.setName("jPanelCamposOcultosParametroSeguridad"); 

        this.jPanelAccionesParametroSeguridad.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesParametroSeguridad.setToolTipText("Acciones");
        this.jPanelAccionesParametroSeguridad.setName("Acciones"); 

		this.jPanelAccionesFormularioParametroSeguridad.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioParametroSeguridad.setToolTipText("Acciones");
        this.jPanelAccionesFormularioParametroSeguridad.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionParametroSeguridad, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralParametroSeguridad, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosParametroSeguridad, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposParametroSeguridad, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosParametroSeguridad, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioParametroSeguridad, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoParametroSeguridad.setText("Nuevo");
		this.jButtonModificarParametroSeguridad.setText("Editar");
        this.jButtonActualizarParametroSeguridad.setText("Actualizar");
        this.jButtonEliminarParametroSeguridad.setText("Eliminar");
        this.jButtonCancelarParametroSeguridad.setText("Cancelar");
        this.jButtonGuardarCambiosParametroSeguridad.setText("Guardar");
		this.jButtonGuardarCambiosTablaParametroSeguridad.setText("Guardar");
		this.jButtonCerrarParametroSeguridad.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoParametroSeguridad,"nuevo_button","Nuevo",this.parametroseguridadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarParametroSeguridad,"modificar_button","Editar",this.parametroseguridadSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarParametroSeguridad,"actualizar_button","Actualizar",this.parametroseguridadSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarParametroSeguridad,"eliminar_button","Eliminar",this.parametroseguridadSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarParametroSeguridad,"cancelar_button","Cancelar",this.parametroseguridadSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosParametroSeguridad,"guardarcambios_button","Guardar",this.parametroseguridadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaParametroSeguridad,"guardarcambiostabla_button","Guardar",this.parametroseguridadSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarParametroSeguridad,"cerrar_button","Salir",this.parametroseguridadSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoParametroSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarParametroSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosParametroSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaParametroSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarParametroSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarParametroSeguridad, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarParametroSeguridad, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarParametroSeguridad, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoParametroSeguridad.setToolTipText("Nuevo"+" "+ParametroSeguridadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarParametroSeguridad.setToolTipText("Editar"+" "+ParametroSeguridadConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarParametroSeguridad.setToolTipText("Actualizar"+" "+ParametroSeguridadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarParametroSeguridad.setToolTipText("Eliminar)"+" "+ParametroSeguridadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarParametroSeguridad.setToolTipText("Cancelar"+" "+ParametroSeguridadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosParametroSeguridad.setToolTipText("Guardar"+" "+ParametroSeguridadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaParametroSeguridad.setToolTipText("Guardar"+" "+ParametroSeguridadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarParametroSeguridad.setToolTipText("Salir"+" "+ParametroSeguridadConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoParametroSeguridad";
		inputMap = this.jButtonNuevoParametroSeguridad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoParametroSeguridad.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoParametroSeguridad"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarParametroSeguridad";
		inputMap = this.jButtonActualizarParametroSeguridad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarParametroSeguridad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarParametroSeguridad"));
		
		//ELIMINAR
		sMapKey = "EliminarParametroSeguridad";
		inputMap = this.jButtonEliminarParametroSeguridad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarParametroSeguridad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarParametroSeguridad"));
		
		//CANCELAR	
		sMapKey = "CancelarParametroSeguridad";
		inputMap = this.jButtonCancelarParametroSeguridad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarParametroSeguridad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarParametroSeguridad"));
		
		//CERRAR		
		sMapKey = "CerrarParametroSeguridad";
		inputMap = this.jButtonCerrarParametroSeguridad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarParametroSeguridad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarParametroSeguridad"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaParametroSeguridad";
		inputMap = this.jButtonGuardarCambiosTablaParametroSeguridad.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaParametroSeguridad.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaParametroSeguridad"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoParametroSeguridad = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoParametroSeguridad.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoParametroSeguridad.setToolTipText("Nuevo ParametroSeguridad");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoParametroSeguridad, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarParametroSeguridad = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarParametroSeguridad.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarParametroSeguridad.setToolTipText("Sin Cerrar Ventana ParametroSeguridad");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarParametroSeguridad, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeParametroSeguridad = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeParametroSeguridad.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeParametroSeguridad.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeParametroSeguridad, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesParametroSeguridad = new JComboBoxMe();
		//this.jComboBoxTiposAccionesParametroSeguridad.setText("Accion");
		this.jComboBoxTiposAccionesParametroSeguridad.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioParametroSeguridad = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioParametroSeguridad.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioParametroSeguridad.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesParametroSeguridad = new JLabelMe();
		
		this.jLabelAccionesParametroSeguridad.setText("Acciones");		
		this.jLabelAccionesParametroSeguridad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroSeguridad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroSeguridad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposParametroSeguridad();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysParametroSeguridad();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesParametroSeguridad=new JTabbedPane();
		this.jTabbedPaneRelacionesParametroSeguridad.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesParametroSeguridad,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesParametroSeguridad.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroSeguridad.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroSeguridad.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesParametroSeguridad, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioParametroSeguridad.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioParametroSeguridad.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioParametroSeguridad.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioParametroSeguridad, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposParametroSeguridad = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosParametroSeguridad = new GridBagLayout();
		
		this.jPanelCamposParametroSeguridad.setLayout(gridaBagLayoutCamposParametroSeguridad);
		this.jPanelCamposOcultosParametroSeguridad.setLayout(gridaBagLayoutCamposOcultosParametroSeguridad);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
	this.gridBagConstraintsParametroSeguridad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroSeguridad.gridy = 0;
	this.gridBagConstraintsParametroSeguridad.gridx = 0;
	this.gridBagConstraintsParametroSeguridad.ipadx = 0;
	this.gridBagConstraintsParametroSeguridad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidParametroSeguridad.add(jLabelIdParametroSeguridad, this.gridBagConstraintsParametroSeguridad);



	this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
	this.gridBagConstraintsParametroSeguridad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroSeguridad.gridy = 0;
	this.gridBagConstraintsParametroSeguridad.gridx = 1;
	this.gridBagConstraintsParametroSeguridad.ipadx = 0;
	this.gridBagConstraintsParametroSeguridad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidParametroSeguridad.add(jLabelidParametroSeguridad, this.gridBagConstraintsParametroSeguridad);


	this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
	this.gridBagConstraintsParametroSeguridad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroSeguridad.gridy = 0;
	this.gridBagConstraintsParametroSeguridad.gridx = 0;
	this.gridBagConstraintsParametroSeguridad.ipadx = 0;
	this.gridBagConstraintsParametroSeguridad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaParametroSeguridad.add(jLabelid_empresaParametroSeguridad, this.gridBagConstraintsParametroSeguridad);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
		//this.gridBagConstraintsParametroSeguridad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroSeguridad.gridy = 0;
		this.gridBagConstraintsParametroSeguridad.gridx = 2;
		this.gridBagConstraintsParametroSeguridad.ipadx = 0;
		this.gridBagConstraintsParametroSeguridad.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaParametroSeguridad.add(jButtonid_empresaParametroSeguridadBusqueda, this.gridBagConstraintsParametroSeguridad);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
		//this.gridBagConstraintsParametroSeguridad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroSeguridad.gridy = 0;
		this.gridBagConstraintsParametroSeguridad.gridx = 3;
		this.gridBagConstraintsParametroSeguridad.ipadx = 0;
		this.gridBagConstraintsParametroSeguridad.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaParametroSeguridad.add(jButtonid_empresaParametroSeguridadUpdate, this.gridBagConstraintsParametroSeguridad);
	}

	this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
	this.gridBagConstraintsParametroSeguridad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroSeguridad.gridy = 0;
	this.gridBagConstraintsParametroSeguridad.gridx = 1;
	this.gridBagConstraintsParametroSeguridad.ipadx = 0;
	this.gridBagConstraintsParametroSeguridad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaParametroSeguridad.add(jComboBoxid_empresaParametroSeguridad, this.gridBagConstraintsParametroSeguridad);


	this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
	this.gridBagConstraintsParametroSeguridad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroSeguridad.gridy = 0;
	this.gridBagConstraintsParametroSeguridad.gridx = 0;
	this.gridBagConstraintsParametroSeguridad.ipadx = 0;
	this.gridBagConstraintsParametroSeguridad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_carteraParametroSeguridad.add(jLabelcon_carteraParametroSeguridad, this.gridBagConstraintsParametroSeguridad);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
		//this.gridBagConstraintsParametroSeguridad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroSeguridad.gridy = 0;
		this.gridBagConstraintsParametroSeguridad.gridx = 2;
		this.gridBagConstraintsParametroSeguridad.ipadx = 0;
		this.gridBagConstraintsParametroSeguridad.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_carteraParametroSeguridad.add(jButtoncon_carteraParametroSeguridadBusqueda, this.gridBagConstraintsParametroSeguridad);
	}

	this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
	this.gridBagConstraintsParametroSeguridad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroSeguridad.gridy = 0;
	this.gridBagConstraintsParametroSeguridad.gridx = 1;
	this.gridBagConstraintsParametroSeguridad.ipadx = 0;
	this.gridBagConstraintsParametroSeguridad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_carteraParametroSeguridad.add(jCheckBoxcon_carteraParametroSeguridad, this.gridBagConstraintsParametroSeguridad);


	this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
	this.gridBagConstraintsParametroSeguridad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroSeguridad.gridy = 0;
	this.gridBagConstraintsParametroSeguridad.gridx = 0;
	this.gridBagConstraintsParametroSeguridad.ipadx = 0;
	this.gridBagConstraintsParametroSeguridad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_copiar_clientesParametroSeguridad.add(jLabelcon_copiar_clientesParametroSeguridad, this.gridBagConstraintsParametroSeguridad);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
		//this.gridBagConstraintsParametroSeguridad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroSeguridad.gridy = 0;
		this.gridBagConstraintsParametroSeguridad.gridx = 2;
		this.gridBagConstraintsParametroSeguridad.ipadx = 0;
		this.gridBagConstraintsParametroSeguridad.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_copiar_clientesParametroSeguridad.add(jButtoncon_copiar_clientesParametroSeguridadBusqueda, this.gridBagConstraintsParametroSeguridad);
	}

	this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
	this.gridBagConstraintsParametroSeguridad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroSeguridad.gridy = 0;
	this.gridBagConstraintsParametroSeguridad.gridx = 1;
	this.gridBagConstraintsParametroSeguridad.ipadx = 0;
	this.gridBagConstraintsParametroSeguridad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_copiar_clientesParametroSeguridad.add(jCheckBoxcon_copiar_clientesParametroSeguridad, this.gridBagConstraintsParametroSeguridad);


	this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
	this.gridBagConstraintsParametroSeguridad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroSeguridad.gridy = 0;
	this.gridBagConstraintsParametroSeguridad.gridx = 0;
	this.gridBagConstraintsParametroSeguridad.ipadx = 0;
	this.gridBagConstraintsParametroSeguridad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_copiar_proveedoresParametroSeguridad.add(jLabelcon_copiar_proveedoresParametroSeguridad, this.gridBagConstraintsParametroSeguridad);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
		//this.gridBagConstraintsParametroSeguridad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroSeguridad.gridy = 0;
		this.gridBagConstraintsParametroSeguridad.gridx = 2;
		this.gridBagConstraintsParametroSeguridad.ipadx = 0;
		this.gridBagConstraintsParametroSeguridad.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_copiar_proveedoresParametroSeguridad.add(jButtoncon_copiar_proveedoresParametroSeguridadBusqueda, this.gridBagConstraintsParametroSeguridad);
	}

	this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
	this.gridBagConstraintsParametroSeguridad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroSeguridad.gridy = 0;
	this.gridBagConstraintsParametroSeguridad.gridx = 1;
	this.gridBagConstraintsParametroSeguridad.ipadx = 0;
	this.gridBagConstraintsParametroSeguridad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_copiar_proveedoresParametroSeguridad.add(jCheckBoxcon_copiar_proveedoresParametroSeguridad, this.gridBagConstraintsParametroSeguridad);


	this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
	this.gridBagConstraintsParametroSeguridad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroSeguridad.gridy = 0;
	this.gridBagConstraintsParametroSeguridad.gridx = 0;
	this.gridBagConstraintsParametroSeguridad.ipadx = 0;
	this.gridBagConstraintsParametroSeguridad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_generar_cliente_proveParametroSeguridad.add(jLabelcon_generar_cliente_proveParametroSeguridad, this.gridBagConstraintsParametroSeguridad);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
		//this.gridBagConstraintsParametroSeguridad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroSeguridad.gridy = 0;
		this.gridBagConstraintsParametroSeguridad.gridx = 2;
		this.gridBagConstraintsParametroSeguridad.ipadx = 0;
		this.gridBagConstraintsParametroSeguridad.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_generar_cliente_proveParametroSeguridad.add(jButtoncon_generar_cliente_proveParametroSeguridadBusqueda, this.gridBagConstraintsParametroSeguridad);
	}

	this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
	this.gridBagConstraintsParametroSeguridad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroSeguridad.gridy = 0;
	this.gridBagConstraintsParametroSeguridad.gridx = 1;
	this.gridBagConstraintsParametroSeguridad.ipadx = 0;
	this.gridBagConstraintsParametroSeguridad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_generar_cliente_proveParametroSeguridad.add(jCheckBoxcon_generar_cliente_proveParametroSeguridad, this.gridBagConstraintsParametroSeguridad);


	this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
	this.gridBagConstraintsParametroSeguridad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroSeguridad.gridy = 0;
	this.gridBagConstraintsParametroSeguridad.gridx = 0;
	this.gridBagConstraintsParametroSeguridad.ipadx = 0;
	this.gridBagConstraintsParametroSeguridad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcliente_con_secuencial_autoParametroSeguridad.add(jLabelcliente_con_secuencial_autoParametroSeguridad, this.gridBagConstraintsParametroSeguridad);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
		//this.gridBagConstraintsParametroSeguridad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroSeguridad.gridy = 0;
		this.gridBagConstraintsParametroSeguridad.gridx = 2;
		this.gridBagConstraintsParametroSeguridad.ipadx = 0;
		this.gridBagConstraintsParametroSeguridad.insets = new Insets(0, 0, 0, 0);
		this.jPanelcliente_con_secuencial_autoParametroSeguridad.add(jButtoncliente_con_secuencial_autoParametroSeguridadBusqueda, this.gridBagConstraintsParametroSeguridad);
	}

	this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
	this.gridBagConstraintsParametroSeguridad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroSeguridad.gridy = 0;
	this.gridBagConstraintsParametroSeguridad.gridx = 1;
	this.gridBagConstraintsParametroSeguridad.ipadx = 0;
	this.gridBagConstraintsParametroSeguridad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcliente_con_secuencial_autoParametroSeguridad.add(jCheckBoxcliente_con_secuencial_autoParametroSeguridad, this.gridBagConstraintsParametroSeguridad);


	this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
	this.gridBagConstraintsParametroSeguridad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroSeguridad.gridy = 0;
	this.gridBagConstraintsParametroSeguridad.gridx = 0;
	this.gridBagConstraintsParametroSeguridad.ipadx = 0;
	this.gridBagConstraintsParametroSeguridad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcliente_num_maximo_inicialesParametroSeguridad.add(jLabelcliente_num_maximo_inicialesParametroSeguridad, this.gridBagConstraintsParametroSeguridad);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
		//this.gridBagConstraintsParametroSeguridad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroSeguridad.gridy = 0;
		this.gridBagConstraintsParametroSeguridad.gridx = 2;
		this.gridBagConstraintsParametroSeguridad.ipadx = 0;
		this.gridBagConstraintsParametroSeguridad.insets = new Insets(0, 0, 0, 0);
		this.jPanelcliente_num_maximo_inicialesParametroSeguridad.add(jButtoncliente_num_maximo_inicialesParametroSeguridadBusqueda, this.gridBagConstraintsParametroSeguridad);
	}

	this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
	this.gridBagConstraintsParametroSeguridad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroSeguridad.gridy = 0;
	this.gridBagConstraintsParametroSeguridad.gridx = 1;
	this.gridBagConstraintsParametroSeguridad.ipadx = 0;
	this.gridBagConstraintsParametroSeguridad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcliente_num_maximo_inicialesParametroSeguridad.add(jTextFieldcliente_num_maximo_inicialesParametroSeguridad, this.gridBagConstraintsParametroSeguridad);


	this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
	this.gridBagConstraintsParametroSeguridad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroSeguridad.gridy = 0;
	this.gridBagConstraintsParametroSeguridad.gridx = 0;
	this.gridBagConstraintsParametroSeguridad.ipadx = 0;
	this.gridBagConstraintsParametroSeguridad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelprove_con_secuencial_autoParametroSeguridad.add(jLabelprove_con_secuencial_autoParametroSeguridad, this.gridBagConstraintsParametroSeguridad);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
		//this.gridBagConstraintsParametroSeguridad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroSeguridad.gridy = 0;
		this.gridBagConstraintsParametroSeguridad.gridx = 2;
		this.gridBagConstraintsParametroSeguridad.ipadx = 0;
		this.gridBagConstraintsParametroSeguridad.insets = new Insets(0, 0, 0, 0);
		this.jPanelprove_con_secuencial_autoParametroSeguridad.add(jButtonprove_con_secuencial_autoParametroSeguridadBusqueda, this.gridBagConstraintsParametroSeguridad);
	}

	this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
	this.gridBagConstraintsParametroSeguridad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroSeguridad.gridy = 0;
	this.gridBagConstraintsParametroSeguridad.gridx = 1;
	this.gridBagConstraintsParametroSeguridad.ipadx = 0;
	this.gridBagConstraintsParametroSeguridad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelprove_con_secuencial_autoParametroSeguridad.add(jCheckBoxprove_con_secuencial_autoParametroSeguridad, this.gridBagConstraintsParametroSeguridad);


	this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
	this.gridBagConstraintsParametroSeguridad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroSeguridad.gridy = 0;
	this.gridBagConstraintsParametroSeguridad.gridx = 0;
	this.gridBagConstraintsParametroSeguridad.ipadx = 0;
	this.gridBagConstraintsParametroSeguridad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelprove_num_maximo_inicialesParametroSeguridad.add(jLabelprove_num_maximo_inicialesParametroSeguridad, this.gridBagConstraintsParametroSeguridad);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
		//this.gridBagConstraintsParametroSeguridad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroSeguridad.gridy = 0;
		this.gridBagConstraintsParametroSeguridad.gridx = 2;
		this.gridBagConstraintsParametroSeguridad.ipadx = 0;
		this.gridBagConstraintsParametroSeguridad.insets = new Insets(0, 0, 0, 0);
		this.jPanelprove_num_maximo_inicialesParametroSeguridad.add(jButtonprove_num_maximo_inicialesParametroSeguridadBusqueda, this.gridBagConstraintsParametroSeguridad);
	}

	this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
	this.gridBagConstraintsParametroSeguridad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroSeguridad.gridy = 0;
	this.gridBagConstraintsParametroSeguridad.gridx = 1;
	this.gridBagConstraintsParametroSeguridad.ipadx = 0;
	this.gridBagConstraintsParametroSeguridad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelprove_num_maximo_inicialesParametroSeguridad.add(jTextFieldprove_num_maximo_inicialesParametroSeguridad, this.gridBagConstraintsParametroSeguridad);


	this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
	this.gridBagConstraintsParametroSeguridad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroSeguridad.gridy = 0;
	this.gridBagConstraintsParametroSeguridad.gridx = 0;
	this.gridBagConstraintsParametroSeguridad.ipadx = 0;
	this.gridBagConstraintsParametroSeguridad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcon_validar_gruposParametroSeguridad.add(jLabelcon_validar_gruposParametroSeguridad, this.gridBagConstraintsParametroSeguridad);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
		//this.gridBagConstraintsParametroSeguridad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroSeguridad.gridy = 0;
		this.gridBagConstraintsParametroSeguridad.gridx = 2;
		this.gridBagConstraintsParametroSeguridad.ipadx = 0;
		this.gridBagConstraintsParametroSeguridad.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_validar_gruposParametroSeguridad.add(jButtoncon_validar_gruposParametroSeguridadBusqueda, this.gridBagConstraintsParametroSeguridad);
	}

	this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
	this.gridBagConstraintsParametroSeguridad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroSeguridad.gridy = 0;
	this.gridBagConstraintsParametroSeguridad.gridx = 1;
	this.gridBagConstraintsParametroSeguridad.ipadx = 0;
	this.gridBagConstraintsParametroSeguridad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcon_validar_gruposParametroSeguridad.add(jCheckBoxcon_validar_gruposParametroSeguridad, this.gridBagConstraintsParametroSeguridad);


	this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
	this.gridBagConstraintsParametroSeguridad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroSeguridad.gridy = 0;
	this.gridBagConstraintsParametroSeguridad.gridx = 0;
	this.gridBagConstraintsParametroSeguridad.ipadx = 0;
	this.gridBagConstraintsParametroSeguridad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelacti_fijo_con_secuencial_autoParametroSeguridad.add(jLabelacti_fijo_con_secuencial_autoParametroSeguridad, this.gridBagConstraintsParametroSeguridad);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
		//this.gridBagConstraintsParametroSeguridad.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroSeguridad.gridy = 0;
		this.gridBagConstraintsParametroSeguridad.gridx = 2;
		this.gridBagConstraintsParametroSeguridad.ipadx = 0;
		this.gridBagConstraintsParametroSeguridad.insets = new Insets(0, 0, 0, 0);
		this.jPanelacti_fijo_con_secuencial_autoParametroSeguridad.add(jButtonacti_fijo_con_secuencial_autoParametroSeguridadBusqueda, this.gridBagConstraintsParametroSeguridad);
	}

	this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
	this.gridBagConstraintsParametroSeguridad.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroSeguridad.gridy = 0;
	this.gridBagConstraintsParametroSeguridad.gridx = 1;
	this.gridBagConstraintsParametroSeguridad.ipadx = 0;
	this.gridBagConstraintsParametroSeguridad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelacti_fijo_con_secuencial_autoParametroSeguridad.add(jCheckBoxacti_fijo_con_secuencial_autoParametroSeguridad, this.gridBagConstraintsParametroSeguridad);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
	this.gridBagConstraintsParametroSeguridad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroSeguridad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroSeguridad.gridy = iYPanelCamposParametroSeguridad;
	this.gridBagConstraintsParametroSeguridad.gridx = iXPanelCamposParametroSeguridad++;
	this.gridBagConstraintsParametroSeguridad.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroSeguridad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroSeguridad.add(this.jPanelidParametroSeguridad, this.gridBagConstraintsParametroSeguridad);



	if(iXPanelCamposParametroSeguridad % 1==0) {
		iXPanelCamposParametroSeguridad=0;
		iYPanelCamposParametroSeguridad++;
	}
	this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
	this.gridBagConstraintsParametroSeguridad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroSeguridad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroSeguridad.gridy = iYPanelCamposParametroSeguridad;
	this.gridBagConstraintsParametroSeguridad.gridx = iXPanelCamposParametroSeguridad++;
	this.gridBagConstraintsParametroSeguridad.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroSeguridad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroSeguridad.add(this.jPanelcon_carteraParametroSeguridad, this.gridBagConstraintsParametroSeguridad);



	if(iXPanelCamposParametroSeguridad % 1==0) {
		iXPanelCamposParametroSeguridad=0;
		iYPanelCamposParametroSeguridad++;
	}
	this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
	this.gridBagConstraintsParametroSeguridad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroSeguridad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroSeguridad.gridy = iYPanelCamposParametroSeguridad;
	this.gridBagConstraintsParametroSeguridad.gridx = iXPanelCamposParametroSeguridad++;
	this.gridBagConstraintsParametroSeguridad.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroSeguridad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroSeguridad.add(this.jPanelcon_copiar_clientesParametroSeguridad, this.gridBagConstraintsParametroSeguridad);



	if(iXPanelCamposParametroSeguridad % 1==0) {
		iXPanelCamposParametroSeguridad=0;
		iYPanelCamposParametroSeguridad++;
	}
	this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
	this.gridBagConstraintsParametroSeguridad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroSeguridad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroSeguridad.gridy = iYPanelCamposParametroSeguridad;
	this.gridBagConstraintsParametroSeguridad.gridx = iXPanelCamposParametroSeguridad++;
	this.gridBagConstraintsParametroSeguridad.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroSeguridad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroSeguridad.add(this.jPanelcon_copiar_proveedoresParametroSeguridad, this.gridBagConstraintsParametroSeguridad);



	if(iXPanelCamposParametroSeguridad % 1==0) {
		iXPanelCamposParametroSeguridad=0;
		iYPanelCamposParametroSeguridad++;
	}
	this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
	this.gridBagConstraintsParametroSeguridad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroSeguridad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroSeguridad.gridy = iYPanelCamposParametroSeguridad;
	this.gridBagConstraintsParametroSeguridad.gridx = iXPanelCamposParametroSeguridad++;
	this.gridBagConstraintsParametroSeguridad.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroSeguridad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroSeguridad.add(this.jPanelcon_generar_cliente_proveParametroSeguridad, this.gridBagConstraintsParametroSeguridad);



	if(iXPanelCamposParametroSeguridad % 1==0) {
		iXPanelCamposParametroSeguridad=0;
		iYPanelCamposParametroSeguridad++;
	}

	iXPanelCamposParametroSeguridad=0;
	iYPanelCamposParametroSeguridad++;


	if(!iXPanelCamposParametroSeguridad.equals(0)) {
		iXPanelCamposParametroSeguridad=0;
		iYPanelCamposParametroSeguridad++;
	}

	JLabelMe jLabelTitulocliente_con_secuencial_autoParametroSeguridad = new JLabelMe();
	jLabelTitulocliente_con_secuencial_autoParametroSeguridad.setText("Clientes");
	jLabelTitulocliente_con_secuencial_autoParametroSeguridad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL));
	jLabelTitulocliente_con_secuencial_autoParametroSeguridad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL));
	jLabelTitulocliente_con_secuencial_autoParametroSeguridad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL));

	FuncionesSwing.setFormatoLabelTituloGrupo(jLabelTitulocliente_con_secuencial_autoParametroSeguridad);

	this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
	this.gridBagConstraintsParametroSeguridad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroSeguridad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroSeguridad.gridy = iYPanelCamposParametroSeguridad;
	this.gridBagConstraintsParametroSeguridad.gridx = iXPanelCamposParametroSeguridad++;
	this.gridBagConstraintsParametroSeguridad.ipadx = 0;
	this.gridBagConstraintsParametroSeguridad.gridwidth = 1;
	this.gridBagConstraintsParametroSeguridad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroSeguridad.add(jLabelTitulocliente_con_secuencial_autoParametroSeguridad, this.gridBagConstraintsParametroSeguridad);



	if(iXPanelCamposParametroSeguridad % 1==0) {
		iXPanelCamposParametroSeguridad=0;
		iYPanelCamposParametroSeguridad++;
	}

	if(!iXPanelCamposParametroSeguridad.equals(0)) {
		iXPanelCamposParametroSeguridad=0;
		iYPanelCamposParametroSeguridad++;
	}


	this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
	this.gridBagConstraintsParametroSeguridad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroSeguridad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroSeguridad.gridy = iYPanelCamposParametroSeguridad;
	this.gridBagConstraintsParametroSeguridad.gridx = iXPanelCamposParametroSeguridad++;
	this.gridBagConstraintsParametroSeguridad.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroSeguridad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroSeguridad.add(this.jPanelcliente_con_secuencial_autoParametroSeguridad, this.gridBagConstraintsParametroSeguridad);



	if(iXPanelCamposParametroSeguridad % 1==0) {
		iXPanelCamposParametroSeguridad=0;
		iYPanelCamposParametroSeguridad++;
	}
	this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
	this.gridBagConstraintsParametroSeguridad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroSeguridad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroSeguridad.gridy = iYPanelCamposParametroSeguridad;
	this.gridBagConstraintsParametroSeguridad.gridx = iXPanelCamposParametroSeguridad++;
	this.gridBagConstraintsParametroSeguridad.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroSeguridad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroSeguridad.add(this.jPanelcliente_num_maximo_inicialesParametroSeguridad, this.gridBagConstraintsParametroSeguridad);



	if(iXPanelCamposParametroSeguridad % 1==0) {
		iXPanelCamposParametroSeguridad=0;
		iYPanelCamposParametroSeguridad++;
	}

	iXPanelCamposParametroSeguridad=0;
	iYPanelCamposParametroSeguridad++;


	if(!iXPanelCamposParametroSeguridad.equals(0)) {
		iXPanelCamposParametroSeguridad=0;
		iYPanelCamposParametroSeguridad++;
	}

	JLabelMe jLabelTituloprove_con_secuencial_autoParametroSeguridad = new JLabelMe();
	jLabelTituloprove_con_secuencial_autoParametroSeguridad.setText("Proveedores");
	jLabelTituloprove_con_secuencial_autoParametroSeguridad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL));
	jLabelTituloprove_con_secuencial_autoParametroSeguridad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL));
	jLabelTituloprove_con_secuencial_autoParametroSeguridad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL));

	FuncionesSwing.setFormatoLabelTituloGrupo(jLabelTituloprove_con_secuencial_autoParametroSeguridad);

	this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
	this.gridBagConstraintsParametroSeguridad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroSeguridad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroSeguridad.gridy = iYPanelCamposParametroSeguridad;
	this.gridBagConstraintsParametroSeguridad.gridx = iXPanelCamposParametroSeguridad++;
	this.gridBagConstraintsParametroSeguridad.ipadx = 0;
	this.gridBagConstraintsParametroSeguridad.gridwidth = 1;
	this.gridBagConstraintsParametroSeguridad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroSeguridad.add(jLabelTituloprove_con_secuencial_autoParametroSeguridad, this.gridBagConstraintsParametroSeguridad);



	if(iXPanelCamposParametroSeguridad % 1==0) {
		iXPanelCamposParametroSeguridad=0;
		iYPanelCamposParametroSeguridad++;
	}

	if(!iXPanelCamposParametroSeguridad.equals(0)) {
		iXPanelCamposParametroSeguridad=0;
		iYPanelCamposParametroSeguridad++;
	}


	this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
	this.gridBagConstraintsParametroSeguridad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroSeguridad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroSeguridad.gridy = iYPanelCamposParametroSeguridad;
	this.gridBagConstraintsParametroSeguridad.gridx = iXPanelCamposParametroSeguridad++;
	this.gridBagConstraintsParametroSeguridad.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroSeguridad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroSeguridad.add(this.jPanelprove_con_secuencial_autoParametroSeguridad, this.gridBagConstraintsParametroSeguridad);



	if(iXPanelCamposParametroSeguridad % 1==0) {
		iXPanelCamposParametroSeguridad=0;
		iYPanelCamposParametroSeguridad++;
	}
	this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
	this.gridBagConstraintsParametroSeguridad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroSeguridad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroSeguridad.gridy = iYPanelCamposParametroSeguridad;
	this.gridBagConstraintsParametroSeguridad.gridx = iXPanelCamposParametroSeguridad++;
	this.gridBagConstraintsParametroSeguridad.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroSeguridad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroSeguridad.add(this.jPanelprove_num_maximo_inicialesParametroSeguridad, this.gridBagConstraintsParametroSeguridad);



	if(iXPanelCamposParametroSeguridad % 1==0) {
		iXPanelCamposParametroSeguridad=0;
		iYPanelCamposParametroSeguridad++;
	}

	iXPanelCamposParametroSeguridad=0;
	iYPanelCamposParametroSeguridad++;


	if(!iXPanelCamposParametroSeguridad.equals(0)) {
		iXPanelCamposParametroSeguridad=0;
		iYPanelCamposParametroSeguridad++;
	}

	JLabelMe jLabelTitulocon_validar_gruposParametroSeguridad = new JLabelMe();
	jLabelTitulocon_validar_gruposParametroSeguridad.setText("Clientes-Proveedor");
	jLabelTitulocon_validar_gruposParametroSeguridad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL));
	jLabelTitulocon_validar_gruposParametroSeguridad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL));
	jLabelTitulocon_validar_gruposParametroSeguridad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL));

	FuncionesSwing.setFormatoLabelTituloGrupo(jLabelTitulocon_validar_gruposParametroSeguridad);

	this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
	this.gridBagConstraintsParametroSeguridad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroSeguridad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroSeguridad.gridy = iYPanelCamposParametroSeguridad;
	this.gridBagConstraintsParametroSeguridad.gridx = iXPanelCamposParametroSeguridad++;
	this.gridBagConstraintsParametroSeguridad.ipadx = 0;
	this.gridBagConstraintsParametroSeguridad.gridwidth = 1;
	this.gridBagConstraintsParametroSeguridad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroSeguridad.add(jLabelTitulocon_validar_gruposParametroSeguridad, this.gridBagConstraintsParametroSeguridad);



	if(iXPanelCamposParametroSeguridad % 1==0) {
		iXPanelCamposParametroSeguridad=0;
		iYPanelCamposParametroSeguridad++;
	}

	if(!iXPanelCamposParametroSeguridad.equals(0)) {
		iXPanelCamposParametroSeguridad=0;
		iYPanelCamposParametroSeguridad++;
	}


	this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
	this.gridBagConstraintsParametroSeguridad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroSeguridad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroSeguridad.gridy = iYPanelCamposParametroSeguridad;
	this.gridBagConstraintsParametroSeguridad.gridx = iXPanelCamposParametroSeguridad++;
	this.gridBagConstraintsParametroSeguridad.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroSeguridad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroSeguridad.add(this.jPanelcon_validar_gruposParametroSeguridad, this.gridBagConstraintsParametroSeguridad);



	if(iXPanelCamposParametroSeguridad % 1==0) {
		iXPanelCamposParametroSeguridad=0;
		iYPanelCamposParametroSeguridad++;
	}

	iXPanelCamposParametroSeguridad=0;
	iYPanelCamposParametroSeguridad++;


	if(!iXPanelCamposParametroSeguridad.equals(0)) {
		iXPanelCamposParametroSeguridad=0;
		iYPanelCamposParametroSeguridad++;
	}

	JLabelMe jLabelTituloacti_fijo_con_secuencial_autoParametroSeguridad = new JLabelMe();
	jLabelTituloacti_fijo_con_secuencial_autoParametroSeguridad.setText("Activos Fijos");
	jLabelTituloacti_fijo_con_secuencial_autoParametroSeguridad.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL));
	jLabelTituloacti_fijo_con_secuencial_autoParametroSeguridad.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL));
	jLabelTituloacti_fijo_con_secuencial_autoParametroSeguridad.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL));

	FuncionesSwing.setFormatoLabelTituloGrupo(jLabelTituloacti_fijo_con_secuencial_autoParametroSeguridad);

	this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
	this.gridBagConstraintsParametroSeguridad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroSeguridad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroSeguridad.gridy = iYPanelCamposParametroSeguridad;
	this.gridBagConstraintsParametroSeguridad.gridx = iXPanelCamposParametroSeguridad++;
	this.gridBagConstraintsParametroSeguridad.ipadx = 0;
	this.gridBagConstraintsParametroSeguridad.gridwidth = 1;
	this.gridBagConstraintsParametroSeguridad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroSeguridad.add(jLabelTituloacti_fijo_con_secuencial_autoParametroSeguridad, this.gridBagConstraintsParametroSeguridad);



	if(iXPanelCamposParametroSeguridad % 1==0) {
		iXPanelCamposParametroSeguridad=0;
		iYPanelCamposParametroSeguridad++;
	}

	if(!iXPanelCamposParametroSeguridad.equals(0)) {
		iXPanelCamposParametroSeguridad=0;
		iYPanelCamposParametroSeguridad++;
	}


	this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
	this.gridBagConstraintsParametroSeguridad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroSeguridad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroSeguridad.gridy = iYPanelCamposParametroSeguridad;
	this.gridBagConstraintsParametroSeguridad.gridx = iXPanelCamposParametroSeguridad++;
	this.gridBagConstraintsParametroSeguridad.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroSeguridad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroSeguridad.add(this.jPanelacti_fijo_con_secuencial_autoParametroSeguridad, this.gridBagConstraintsParametroSeguridad);



	if(iXPanelCamposParametroSeguridad % 1==0) {
		iXPanelCamposParametroSeguridad=0;
		iYPanelCamposParametroSeguridad++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
	this.gridBagConstraintsParametroSeguridad.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroSeguridad.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroSeguridad.gridy = iYPanelCamposOcultosParametroSeguridad;
	this.gridBagConstraintsParametroSeguridad.gridx = iXPanelCamposOcultosParametroSeguridad++;
	this.gridBagConstraintsParametroSeguridad.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroSeguridad.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosParametroSeguridad.add(this.jPanelid_empresaParametroSeguridad, this.gridBagConstraintsParametroSeguridad);



	if(iXPanelCamposOcultosParametroSeguridad % 1==0) {
		iXPanelCamposOcultosParametroSeguridad=0;
		iYPanelCamposOcultosParametroSeguridad++;
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
			
		GridBagLayout gridaBagLayoutAccionesParametroSeguridad= new GridBagLayout();
		this.jPanelAccionesParametroSeguridad.setLayout(gridaBagLayoutAccionesParametroSeguridad);
		
		GridBagLayout gridaBagLayoutAccionesFormularioParametroSeguridad= new GridBagLayout();
		this.jPanelAccionesFormularioParametroSeguridad.setLayout(gridaBagLayoutAccionesFormularioParametroSeguridad);
		
		this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
		this.gridBagConstraintsParametroSeguridad.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsParametroSeguridad.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioParametroSeguridad.add(this.jComboBoxTiposAccionesFormularioParametroSeguridad, this.gridBagConstraintsParametroSeguridad);

		this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
		this.gridBagConstraintsParametroSeguridad.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsParametroSeguridad.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioParametroSeguridad.add(this.jCheckBoxPostAccionNuevoParametroSeguridad, this.gridBagConstraintsParametroSeguridad);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.parametroseguridadSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
			this.gridBagConstraintsParametroSeguridad.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsParametroSeguridad.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioParametroSeguridad.add(this.jCheckBoxPostAccionSinCerrarParametroSeguridad, this.gridBagConstraintsParametroSeguridad);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.parametroseguridadSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.parametroseguridadSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
			this.gridBagConstraintsParametroSeguridad.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsParametroSeguridad.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioParametroSeguridad.add(this.jCheckBoxPostAccionSinMensajeParametroSeguridad, this.gridBagConstraintsParametroSeguridad);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
		this.gridBagConstraintsParametroSeguridad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroSeguridad.gridy = 0;
		this.gridBagConstraintsParametroSeguridad.gridx = iPosXAccion++;
			
		this.jPanelAccionesParametroSeguridad.add(this.jButtonModificarParametroSeguridad, this.gridBagConstraintsParametroSeguridad);							

		this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
		this.gridBagConstraintsParametroSeguridad.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroSeguridad.gridy = 0;
		this.gridBagConstraintsParametroSeguridad.gridx =iPosXAccion++;
			
		this.jPanelAccionesParametroSeguridad.add(this.jButtonEliminarParametroSeguridad, this.gridBagConstraintsParametroSeguridad);
		
			
		this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
		this.gridBagConstraintsParametroSeguridad.gridy = 0;		
		this.gridBagConstraintsParametroSeguridad.gridx = iPosXAccion++;
		
		this.jPanelAccionesParametroSeguridad.add(this.jButtonActualizarParametroSeguridad, this.gridBagConstraintsParametroSeguridad);


		this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
		this.gridBagConstraintsParametroSeguridad.gridy = 0;		
		this.gridBagConstraintsParametroSeguridad.gridx = iPosXAccion++;
		
		this.jPanelAccionesParametroSeguridad.add(this.jButtonGuardarCambiosParametroSeguridad, this.gridBagConstraintsParametroSeguridad);	
		
		this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
		this.gridBagConstraintsParametroSeguridad.gridy = 0;		
		this.gridBagConstraintsParametroSeguridad.gridx =iPosXAccion++;
		
		this.jPanelAccionesParametroSeguridad.add(this.jButtonCancelarParametroSeguridad, this.gridBagConstraintsParametroSeguridad);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutParametroSeguridad = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutParametroSeguridad);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.parametroseguridadSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();						
			this.gridBagConstraintsParametroSeguridad.gridy = iGridyPrincipal++;
			this.gridBagConstraintsParametroSeguridad.gridx = 0;		
			//this.gridBagConstraintsParametroSeguridad.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroSeguridad.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsParametroSeguridad.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
		this.gridBagConstraintsParametroSeguridad.gridy =iGridyPrincipal++;
		this.gridBagConstraintsParametroSeguridad.gridx =0;
		this.gridBagConstraintsParametroSeguridad.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsParametroSeguridad.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosParametroSeguridad, this.gridBagConstraintsParametroSeguridad);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ParametroSeguridadJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleParametroSeguridad = new ParametroSeguridadBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Parametro Seguridad DATOS");
			
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
			
	        //this.setTitle("[FOR] - Parametro Seguridad DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Parametro Seguridad Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ParametroSeguridadModel parametroseguridadModel=new ParametroSeguridadModel(this);
			
			//SI USARA CLASE INTERNA
			//ParametroSeguridadModel.ParametroSeguridadFocusTraversalPolicy parametroseguridadFocusTraversalPolicy = parametroseguridadModel.new ParametroSeguridadFocusTraversalPolicy(this);
			
			//parametroseguridadFocusTraversalPolicy.setparametroseguridadJInternalFrame(this);
			
			this.setFocusTraversalPolicy(parametroseguridadModel);
			
			
			this.jContentPaneDetalleParametroSeguridad = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleParametroSeguridad = new GridBagLayout();	
			this.jContentPaneDetalleParametroSeguridad.setLayout(gridaBagLayoutDetalleParametroSeguridad);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosParametroSeguridad = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
				this.gridBagConstraintsParametroSeguridad.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsParametroSeguridad.gridx = 0;
					
				
				this.jContentPaneDetalleParametroSeguridad.add(jTtoolBarDetalleParametroSeguridad, gridBagConstraintsParametroSeguridad);								
				
}
			
			this.jScrollPanelDatosEdicionParametroSeguridad=   new JScrollPane(jContentPaneDetalleParametroSeguridad,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionParametroSeguridad.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroSeguridad.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroSeguridad.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralParametroSeguridad=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralParametroSeguridad.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroSeguridad.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroSeguridad.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
			
			
	        this.gridBagConstraintsParametroSeguridad.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsParametroSeguridad.gridx = 0;
	        
			this.jContentPaneDetalleParametroSeguridad.add(jPanelCamposParametroSeguridad, gridBagConstraintsParametroSeguridad);
			
			
			
			
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
						&& parametroseguridadSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.parametroseguridadSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsParametroSeguridad= new GridBagConstraints();
						this.gridBagConstraintsParametroSeguridad.gridy = iGridyRelaciones++;
						this.gridBagConstraintsParametroSeguridad.gridx = 0;
						this.jContentPaneDetalleParametroSeguridad.add(this.jTabbedPaneRelacionesParametroSeguridad, this.gridBagConstraintsParametroSeguridad);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesParametroSeguridad.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosParametroSeguridad.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
					this.gridBagConstraintsParametroSeguridad.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsParametroSeguridad.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsParametroSeguridad.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsParametroSeguridad.gridx = 0;
					
				
					this.jContentPaneDetalleParametroSeguridad.add(jPanelCamposOcultosParametroSeguridad, gridBagConstraintsParametroSeguridad);
				
					this.jPanelCamposOcultosParametroSeguridad.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
			this.gridBagConstraintsParametroSeguridad.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsParametroSeguridad.gridx = 0;
	        this.gridBagConstraintsParametroSeguridad.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleParametroSeguridad.add(this.jPanelAccionesFormularioParametroSeguridad, this.gridBagConstraintsParametroSeguridad);							
			
			
			
			this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
	        this.gridBagConstraintsParametroSeguridad.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsParametroSeguridad.gridx = 0;
	        
			
			this.jContentPaneDetalleParametroSeguridad.add(this.jPanelAccionesParametroSeguridad, this.gridBagConstraintsParametroSeguridad);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionParametroSeguridad);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionParametroSeguridad=   new JScrollPane(this.jPanelCamposParametroSeguridad,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionParametroSeguridad.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroSeguridad.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroSeguridad.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
			this.gridBagConstraintsParametroSeguridad.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsParametroSeguridad.gridx = 0;
			this.gridBagConstraintsParametroSeguridad.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsParametroSeguridad.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsParametroSeguridad.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionParametroSeguridad, this.gridBagConstraintsParametroSeguridad);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
			this.gridBagConstraintsParametroSeguridad.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsParametroSeguridad.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioParametroSeguridad, this.gridBagConstraintsParametroSeguridad);			
			
			this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
			this.gridBagConstraintsParametroSeguridad.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsParametroSeguridad.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesParametroSeguridad, this.gridBagConstraintsParametroSeguridad);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
		this.gridBagConstraintsParametroSeguridad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroSeguridad.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposParametroSeguridad, this.gridBagConstraintsParametroSeguridad);
			
			
		this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
		this.gridBagConstraintsParametroSeguridad.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroSeguridad.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosParametroSeguridad, this.gridBagConstraintsParametroSeguridad);
		
			
		this.gridBagConstraintsParametroSeguridad = new GridBagConstraints();
		this.gridBagConstraintsParametroSeguridad.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsParametroSeguridad.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesParametroSeguridad, this.gridBagConstraintsParametroSeguridad);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralParametroSeguridad;//jContentPane;
		
		return jScrollPanelDatosEdicionParametroSeguridad;
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
