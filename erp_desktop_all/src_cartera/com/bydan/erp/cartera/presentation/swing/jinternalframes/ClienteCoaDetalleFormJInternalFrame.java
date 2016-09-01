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

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.cartera.util.ClienteCoaConstantesFunciones;

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
public class ClienteCoaDetalleFormJInternalFrame extends ClienteCoaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleClienteCoa;
	
	protected JMenuBar jmenuBarDetalleClienteCoa;
	
	protected JMenu jmenuDetalleClienteCoa;
	protected JMenu jmenuDetalleArchivoClienteCoa;
	protected JMenu jmenuDetalleAccionesClienteCoa;
	protected JMenu jmenuDetalleDatosClienteCoa;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleClienteCoa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutClienteCoa;	
	protected GridBagConstraints gridBagConstraintsClienteCoa;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ClienteCoaBeanSwingJInternalFrameAdditional jInternalFrameDetalleClienteCoa;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_usuario="";
	
	public ClienteCoaSessionBean clientecoaSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public UsuarioSessionBean usuarioSessionBean;	
	
	public ClienteCoaLogic clientecoaLogic;
	
	public JScrollPane jScrollPanelDatosClienteCoa;
	public JScrollPane jScrollPanelDatosEdicionClienteCoa;
	public JScrollPane jScrollPanelDatosGeneralClienteCoa;
	
	protected JPanel jPanelCamposClienteCoa;    
	protected JPanel jPanelCamposOcultosClienteCoa;    	
	protected JPanel jPanelAccionesClienteCoa;
	protected JPanel jPanelAccionesFormularioClienteCoa;
    
	
	
	protected Integer iXPanelCamposClienteCoa=0;
	protected Integer iYPanelCamposClienteCoa=0;
	
	protected Integer iXPanelCamposOcultosClienteCoa=0;
	protected Integer iYPanelCamposOcultosClienteCoa=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoClienteCoa;
	public JButton jButtonModificarClienteCoa;
	public JButton jButtonActualizarClienteCoa;
    public JButton jButtonEliminarClienteCoa;
	public JButton jButtonCancelarClienteCoa;
    public JButton jButtonGuardarCambiosClienteCoa;
	public JButton jButtonGuardarCambiosTablaClienteCoa;
	protected JButton jButtonCerrarClienteCoa;
	
	
	protected JButton jButtonProcesarInformacionClienteCoa;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoClienteCoa;
	protected JCheckBox jCheckBoxPostAccionSinCerrarClienteCoa;
	protected JCheckBox jCheckBoxPostAccionSinMensajeClienteCoa;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarClienteCoa;
	protected JButton jButtonModificarToolBarClienteCoa;
	protected JButton jButtonActualizarToolBarClienteCoa;
    protected JButton jButtonEliminarToolBarClienteCoa;
	protected JButton jButtonCancelarToolBarClienteCoa;
    protected JButton jButtonGuardarCambiosToolBarClienteCoa;
	protected JButton jButtonGuardarCambiosTablaToolBarClienteCoa;
	protected JButton jButtonMostrarOcultarTablaToolBarClienteCoa;
	protected JButton jButtonCerrarToolBarClienteCoa;
	
	protected JButton jButtonProcesarInformacionToolBarClienteCoa;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoClienteCoa;
	protected JMenuItem jMenuItemModificarClienteCoa;
	protected JMenuItem jMenuItemActualizarClienteCoa;
    protected JMenuItem jMenuItemEliminarClienteCoa;
	protected JMenuItem jMenuItemCancelarClienteCoa;
    protected JMenuItem jMenuItemGuardarCambiosClienteCoa;
	protected JMenuItem jMenuItemGuardarCambiosTablaClienteCoa;
	protected JMenuItem jMenuItemCerrarClienteCoa;
	protected JMenuItem jMenuItemDetalleCerrarClienteCoa;
	protected JMenuItem jMenuItemDetalleMostarOcultarClienteCoa;
	
	protected JMenuItem jMenuItemProcesarInformacionClienteCoa;
	protected JMenuItem jMenuItemNuevoGuardarCambiosClienteCoa;
	protected JMenuItem jMenuItemMostrarOcultarClienteCoa;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesClienteCoa;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesClienteCoa;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesClienteCoa;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioClienteCoa;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidClienteCoa;
	public JLabel jLabelIdClienteCoa;
	public JLabel jLabelidClienteCoa;
	public JButton jButtonidClienteCoaBusqueda= new JButtonMe();

	public JPanel jPanelautori_imprentaClienteCoa;
	public JLabel jLabelautori_imprentaClienteCoa;
	public JTextField jTextFieldautori_imprentaClienteCoa;
	public JButton jButtonautori_imprentaClienteCoaBusqueda= new JButtonMe();

	public JPanel jPanelautori_usuarioClienteCoa;
	public JLabel jLabelautori_usuarioClienteCoa;
	public JTextField jTextFieldautori_usuarioClienteCoa;
	public JButton jButtonautori_usuarioClienteCoaBusqueda= new JButtonMe();

	public JPanel jPanelnum_factura_iniClienteCoa;
	public JLabel jLabelnum_factura_iniClienteCoa;
	public JTextField jTextFieldnum_factura_iniClienteCoa;
	public JButton jButtonnum_factura_iniClienteCoaBusqueda= new JButtonMe();

	public JPanel jPanelnum_factura_finClienteCoa;
	public JLabel jLabelnum_factura_finClienteCoa;
	public JTextField jTextFieldnum_factura_finClienteCoa;
	public JButton jButtonnum_factura_finClienteCoaBusqueda= new JButtonMe();

	public JPanel jPanelserie_docuClienteCoa;
	public JLabel jLabelserie_docuClienteCoa;
	public JTextField jTextFieldserie_docuClienteCoa;
	public JButton jButtonserie_docuClienteCoaBusqueda= new JButtonMe();

	public JPanel jPanelfecha_valiClienteCoa;
	public JLabel jLabelfecha_valiClienteCoa;
	//public JFormattedTextField jDateChooserfecha_valiClienteCoa;

	public JDateChooser jDateChooserfecha_valiClienteCoa;
	public JButton jButtonfecha_valiClienteCoaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaClienteCoa;
	public JLabel jLabelid_empresaClienteCoa;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaClienteCoa;
	public JButton jButtonid_empresaClienteCoa= new JButtonMe();
	public JButton jButtonid_empresaClienteCoaUpdate= new JButtonMe();
	public JButton jButtonid_empresaClienteCoaBusqueda= new JButtonMe();

	public JPanel jPanelid_clienteClienteCoa;
	public JLabel jLabelid_clienteClienteCoa;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteClienteCoa;
	public JButton jButtonid_clienteClienteCoa= new JButtonMe();
	public JButton jButtonid_clienteClienteCoaUpdate= new JButtonMe();
	public JButton jButtonid_clienteClienteCoaBusqueda= new JButtonMe();

	public JPanel jPanelid_usuarioClienteCoa;
	public JLabel jLabelid_usuarioClienteCoa;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_usuarioClienteCoa;
	public JButton jButtonid_usuarioClienteCoa= new JButtonMe();
	public JButton jButtonid_usuarioClienteCoaUpdate= new JButtonMe();
	public JButton jButtonid_usuarioClienteCoaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesClienteCoa;
	
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
	public int iHeightFormulario=902;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ClienteCoaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposClienteCoa=new JPanel();
				this.jPanelAccionesFormularioClienteCoa=new JPanel();
				this.jmenuBarDetalleClienteCoa=new JMenuBar();
				this.jTtoolBarDetalleClienteCoa=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ClienteCoaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ClienteCoa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ClienteCoaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ClienteCoa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ClienteCoaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ClienteCoa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ClienteCoaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ClienteCoa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ClienteCoaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ClienteCoa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarClienteCoa() {
		return this.jButtonActualizarToolBarClienteCoa;
	}
	
	public JButton getjButtonEliminarToolBarClienteCoa() {
		return this.jButtonEliminarToolBarClienteCoa;
	}
	
	public JButton getjButtonCancelarToolBarClienteCoa() {
		return this.jButtonCancelarToolBarClienteCoa;
	}		
	
	public JButton getjButtonProcesarInformacionClienteCoa() {
		return this.jButtonProcesarInformacionClienteCoa;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionClienteCoa)	{
		this.jButtonProcesarInformacionClienteCoa = jButtonProcesarInformacionClienteCoa;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesClienteCoa() {
		return this.jComboBoxTiposAccionesClienteCoa;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesClienteCoa(
			JComboBox jComboBoxTiposRelacionesClienteCoa) {
		this.jComboBoxTiposRelacionesClienteCoa = jComboBoxTiposRelacionesClienteCoa;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesClienteCoa(
			JComboBox jComboBoxTiposAccionesClienteCoa) {
		this.jComboBoxTiposAccionesClienteCoa = jComboBoxTiposAccionesClienteCoa;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioClienteCoa() {
		return this.jComboBoxTiposAccionesFormularioClienteCoa;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioClienteCoa(
			JComboBox jComboBoxTiposAccionesFormularioClienteCoa) {
		this.jComboBoxTiposAccionesFormularioClienteCoa = jComboBoxTiposAccionesFormularioClienteCoa;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.clientecoaSessionBean=new ClienteCoaSessionBean();
		
		this.clientecoaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.clientecoaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.clientecoaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ClienteCoaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ClienteCoaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ClienteCoaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Coa MANTENIMIENTO"));
		
		
		if(iWidth > 950) {
			iWidth=950;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.clientecoaSessionBean.getEsGuardarRelacionado()) {
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
	
		ClienteCoaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleClienteCoa= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarClienteCoa=new JButtonMe();
				this.jButtonModificarToolBarClienteCoa=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarClienteCoa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarClienteCoa,this.jTtoolBarDetalleClienteCoa,
							"actualizar","actualizar","Actualizar"+" "+ClienteCoaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarClienteCoa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarClienteCoa,this.jTtoolBarDetalleClienteCoa,
							"eliminar","eliminar","Eliminar"+" "+ClienteCoaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarClienteCoa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarClienteCoa,this.jTtoolBarDetalleClienteCoa,
							"cancelar","cancelar","Cancelar"+" "+ClienteCoaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarClienteCoa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarClienteCoa,this.jTtoolBarDetalleClienteCoa,
							"guardarcambios","guardarcambios","Guardar"+" "+ClienteCoaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarClienteCoa,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarClienteCoa,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarClienteCoa,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleClienteCoa=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleClienteCoa=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoClienteCoa=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesClienteCoa=new JMenuMe("Acciones");
		this.jmenuDetalleDatosClienteCoa=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoClienteCoa= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoClienteCoa.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoClienteCoa,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoClienteCoa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarClienteCoa= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarClienteCoa.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarClienteCoa,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarClienteCoa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarClienteCoa= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarClienteCoa.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarClienteCoa,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarClienteCoa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarClienteCoa= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarClienteCoa.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarClienteCoa,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarClienteCoa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarClienteCoa= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarClienteCoa.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarClienteCoa,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarClienteCoa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosClienteCoa= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosClienteCoa.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosClienteCoa,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosClienteCoa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarClienteCoa= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarClienteCoa.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarClienteCoa,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarClienteCoa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarClienteCoa= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarClienteCoa.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarClienteCoa,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarClienteCoa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarClienteCoa= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarClienteCoa.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarClienteCoa,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarClienteCoa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarClienteCoa= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarClienteCoa.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarClienteCoa,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarClienteCoa, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoClienteCoa.add(this.jMenuItemDetalleCerrarClienteCoa);
		
		this.jmenuDetalleAccionesClienteCoa.add(this.jMenuItemActualizarClienteCoa);
		this.jmenuDetalleAccionesClienteCoa.add(this.jMenuItemEliminarClienteCoa);
		this.jmenuDetalleAccionesClienteCoa.add(this.jMenuItemCancelarClienteCoa);		
		
		//this.jmenuDetalleDatosClienteCoa.add(this.jMenuItemDetalleAbrirOrderByClienteCoa);				
		this.jmenuDetalleDatosClienteCoa.add(this.jMenuItemDetalleMostarOcultarClienteCoa);				
				
		//this.jmenuDetalleAccionesClienteCoa.add(this.jMenuItemGuardarCambiosClienteCoa);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoClienteCoa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesClienteCoa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosClienteCoa, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleClienteCoa.add(this.jmenuDetalleArchivoClienteCoa);		
		this.jmenuBarDetalleClienteCoa.add(this.jmenuDetalleAccionesClienteCoa);		
		this.jmenuBarDetalleClienteCoa.add(this.jmenuDetalleDatosClienteCoa);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleClienteCoa);				
	}
	
	
	public void inicializarElementosCamposClienteCoa() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdClienteCoa = new JLabelMe();
		jLabelIdClienteCoa.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdClienteCoa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdClienteCoa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdClienteCoa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdClienteCoa,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidClienteCoa = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidClienteCoa.setToolTipText(ClienteCoaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutClienteCoa= new GridBagLayout();

		this.jPanelidClienteCoa.setLayout(this.gridaBagLayoutClienteCoa);

		jLabelidClienteCoa = new JLabel();
		jLabelidClienteCoa.setText("Id");

		jLabelidClienteCoa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidClienteCoa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidClienteCoa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelautori_imprentaClienteCoa = new JLabelMe();
		this.jLabelautori_imprentaClienteCoa.setText(""+ClienteCoaConstantesFunciones.LABEL_AUTORIIMPRENTA+" : *");
		this.jLabelautori_imprentaClienteCoa.setToolTipText("Autorizacion Imprenta");
		this.jLabelautori_imprentaClienteCoa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelautori_imprentaClienteCoa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelautori_imprentaClienteCoa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelautori_imprentaClienteCoa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelautori_imprentaClienteCoa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelautori_imprentaClienteCoa.setToolTipText(ClienteCoaConstantesFunciones.LABEL_AUTORIIMPRENTA);
		this.gridaBagLayoutClienteCoa = new GridBagLayout();
		this.jPanelautori_imprentaClienteCoa.setLayout(this.gridaBagLayoutClienteCoa);


		jTextFieldautori_imprentaClienteCoa= new JTextFieldMe();

		jTextFieldautori_imprentaClienteCoa.setEnabled(false);
		jTextFieldautori_imprentaClienteCoa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldautori_imprentaClienteCoa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldautori_imprentaClienteCoa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldautori_imprentaClienteCoa,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonautori_imprentaClienteCoaBusqueda= new JButtonMe();
		this.jButtonautori_imprentaClienteCoaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonautori_imprentaClienteCoaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonautori_imprentaClienteCoaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonautori_imprentaClienteCoaBusqueda.setText("U");
		this.jButtonautori_imprentaClienteCoaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonautori_imprentaClienteCoaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonautori_imprentaClienteCoaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldautori_imprentaClienteCoa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldautori_imprentaClienteCoa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"autori_imprentaClienteCoaBusqueda"));

		if(this.clientecoaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonautori_imprentaClienteCoaBusqueda.setVisible(false);		}


					
		this.jLabelautori_usuarioClienteCoa = new JLabelMe();
		this.jLabelautori_usuarioClienteCoa.setText(""+ClienteCoaConstantesFunciones.LABEL_AUTORIUSUARIO+" : *");
		this.jLabelautori_usuarioClienteCoa.setToolTipText("Autorizacion Usuario");
		this.jLabelautori_usuarioClienteCoa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelautori_usuarioClienteCoa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelautori_usuarioClienteCoa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelautori_usuarioClienteCoa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelautori_usuarioClienteCoa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelautori_usuarioClienteCoa.setToolTipText(ClienteCoaConstantesFunciones.LABEL_AUTORIUSUARIO);
		this.gridaBagLayoutClienteCoa = new GridBagLayout();
		this.jPanelautori_usuarioClienteCoa.setLayout(this.gridaBagLayoutClienteCoa);


		jTextFieldautori_usuarioClienteCoa= new JTextFieldMe();

		jTextFieldautori_usuarioClienteCoa.setEnabled(false);
		jTextFieldautori_usuarioClienteCoa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldautori_usuarioClienteCoa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldautori_usuarioClienteCoa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldautori_usuarioClienteCoa,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonautori_usuarioClienteCoaBusqueda= new JButtonMe();
		this.jButtonautori_usuarioClienteCoaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonautori_usuarioClienteCoaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonautori_usuarioClienteCoaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonautori_usuarioClienteCoaBusqueda.setText("U");
		this.jButtonautori_usuarioClienteCoaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonautori_usuarioClienteCoaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonautori_usuarioClienteCoaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldautori_usuarioClienteCoa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldautori_usuarioClienteCoa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"autori_usuarioClienteCoaBusqueda"));

		if(this.clientecoaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonautori_usuarioClienteCoaBusqueda.setVisible(false);		}


					
		this.jLabelnum_factura_iniClienteCoa = new JLabelMe();
		this.jLabelnum_factura_iniClienteCoa.setText(""+ClienteCoaConstantesFunciones.LABEL_NUMFACTURAINI+" : *");
		this.jLabelnum_factura_iniClienteCoa.setToolTipText("Factura Inicial");
		this.jLabelnum_factura_iniClienteCoa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnum_factura_iniClienteCoa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnum_factura_iniClienteCoa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnum_factura_iniClienteCoa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnum_factura_iniClienteCoa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnum_factura_iniClienteCoa.setToolTipText(ClienteCoaConstantesFunciones.LABEL_NUMFACTURAINI);
		this.gridaBagLayoutClienteCoa = new GridBagLayout();
		this.jPanelnum_factura_iniClienteCoa.setLayout(this.gridaBagLayoutClienteCoa);


		jTextFieldnum_factura_iniClienteCoa= new JTextFieldMe();

		jTextFieldnum_factura_iniClienteCoa.setEnabled(false);
		jTextFieldnum_factura_iniClienteCoa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnum_factura_iniClienteCoa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnum_factura_iniClienteCoa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnum_factura_iniClienteCoa,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnum_factura_iniClienteCoaBusqueda= new JButtonMe();
		this.jButtonnum_factura_iniClienteCoaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnum_factura_iniClienteCoaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnum_factura_iniClienteCoaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnum_factura_iniClienteCoaBusqueda.setText("U");
		this.jButtonnum_factura_iniClienteCoaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnum_factura_iniClienteCoaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnum_factura_iniClienteCoaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnum_factura_iniClienteCoa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnum_factura_iniClienteCoa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"num_factura_iniClienteCoaBusqueda"));

		if(this.clientecoaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnum_factura_iniClienteCoaBusqueda.setVisible(false);		}


					
		this.jLabelnum_factura_finClienteCoa = new JLabelMe();
		this.jLabelnum_factura_finClienteCoa.setText(""+ClienteCoaConstantesFunciones.LABEL_NUMFACTURAFIN+" : *");
		this.jLabelnum_factura_finClienteCoa.setToolTipText("Factura Final");
		this.jLabelnum_factura_finClienteCoa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnum_factura_finClienteCoa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnum_factura_finClienteCoa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnum_factura_finClienteCoa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnum_factura_finClienteCoa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnum_factura_finClienteCoa.setToolTipText(ClienteCoaConstantesFunciones.LABEL_NUMFACTURAFIN);
		this.gridaBagLayoutClienteCoa = new GridBagLayout();
		this.jPanelnum_factura_finClienteCoa.setLayout(this.gridaBagLayoutClienteCoa);


		jTextFieldnum_factura_finClienteCoa= new JTextFieldMe();

		jTextFieldnum_factura_finClienteCoa.setEnabled(false);
		jTextFieldnum_factura_finClienteCoa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnum_factura_finClienteCoa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnum_factura_finClienteCoa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnum_factura_finClienteCoa,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnum_factura_finClienteCoaBusqueda= new JButtonMe();
		this.jButtonnum_factura_finClienteCoaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnum_factura_finClienteCoaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnum_factura_finClienteCoaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnum_factura_finClienteCoaBusqueda.setText("U");
		this.jButtonnum_factura_finClienteCoaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnum_factura_finClienteCoaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnum_factura_finClienteCoaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnum_factura_finClienteCoa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnum_factura_finClienteCoa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"num_factura_finClienteCoaBusqueda"));

		if(this.clientecoaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnum_factura_finClienteCoaBusqueda.setVisible(false);		}


					
		this.jLabelserie_docuClienteCoa = new JLabelMe();
		this.jLabelserie_docuClienteCoa.setText(""+ClienteCoaConstantesFunciones.LABEL_SERIEDOCU+" : *");
		this.jLabelserie_docuClienteCoa.setToolTipText("Serie Documento");
		this.jLabelserie_docuClienteCoa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelserie_docuClienteCoa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelserie_docuClienteCoa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelserie_docuClienteCoa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelserie_docuClienteCoa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelserie_docuClienteCoa.setToolTipText(ClienteCoaConstantesFunciones.LABEL_SERIEDOCU);
		this.gridaBagLayoutClienteCoa = new GridBagLayout();
		this.jPanelserie_docuClienteCoa.setLayout(this.gridaBagLayoutClienteCoa);


		jTextFieldserie_docuClienteCoa= new JTextFieldMe();

		jTextFieldserie_docuClienteCoa.setEnabled(false);
		jTextFieldserie_docuClienteCoa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldserie_docuClienteCoa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldserie_docuClienteCoa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldserie_docuClienteCoa,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonserie_docuClienteCoaBusqueda= new JButtonMe();
		this.jButtonserie_docuClienteCoaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonserie_docuClienteCoaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonserie_docuClienteCoaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonserie_docuClienteCoaBusqueda.setText("U");
		this.jButtonserie_docuClienteCoaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonserie_docuClienteCoaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonserie_docuClienteCoaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldserie_docuClienteCoa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldserie_docuClienteCoa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"serie_docuClienteCoaBusqueda"));

		if(this.clientecoaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonserie_docuClienteCoaBusqueda.setVisible(false);		}


					
		this.jLabelfecha_valiClienteCoa = new JLabelMe();
		this.jLabelfecha_valiClienteCoa.setText(""+ClienteCoaConstantesFunciones.LABEL_FECHAVALI+" : *");
		this.jLabelfecha_valiClienteCoa.setToolTipText("Fecha Validez");
		this.jLabelfecha_valiClienteCoa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_valiClienteCoa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_valiClienteCoa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_valiClienteCoa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_valiClienteCoa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_valiClienteCoa.setToolTipText(ClienteCoaConstantesFunciones.LABEL_FECHAVALI);
		this.gridaBagLayoutClienteCoa = new GridBagLayout();
		this.jPanelfecha_valiClienteCoa.setLayout(this.gridaBagLayoutClienteCoa);


		//jFormattedTextFieldfecha_valiClienteCoa= new JFormattedTextFieldMe();

		jDateChooserfecha_valiClienteCoa= new JDateChooser();
		jDateChooserfecha_valiClienteCoa.setEnabled(false);
		jDateChooserfecha_valiClienteCoa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_valiClienteCoa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_valiClienteCoa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_valiClienteCoa,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_valiClienteCoa.setDate(new Date());
		jDateChooserfecha_valiClienteCoa.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_valiClienteCoa.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_valiClienteCoaBusqueda= new JButtonMe();
		this.jButtonfecha_valiClienteCoaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_valiClienteCoaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_valiClienteCoaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_valiClienteCoaBusqueda.setText("U");
		this.jButtonfecha_valiClienteCoaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_valiClienteCoaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_valiClienteCoaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_valiClienteCoa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_valiClienteCoa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_valiClienteCoaBusqueda"));

		if(this.clientecoaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_valiClienteCoaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysClienteCoa() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaClienteCoa = new JLabelMe();
		this.jLabelid_empresaClienteCoa.setText(""+ClienteCoaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaClienteCoa.setToolTipText("Empresa");
		this.jLabelid_empresaClienteCoa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaClienteCoa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaClienteCoa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaClienteCoa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaClienteCoa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaClienteCoa.setToolTipText(ClienteCoaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutClienteCoa = new GridBagLayout();
		this.jPanelid_empresaClienteCoa.setLayout(this.gridaBagLayoutClienteCoa);


		jComboBoxid_empresaClienteCoa= new JComboBoxMe();
		jComboBoxid_empresaClienteCoa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaClienteCoa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaClienteCoa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaClienteCoa,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaClienteCoa.setEnabled(false);

		this.jButtonid_empresaClienteCoa= new JButtonMe();
		this.jButtonid_empresaClienteCoa.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaClienteCoa.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaClienteCoa.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaClienteCoa.setText("Buscar");
		this.jButtonid_empresaClienteCoa.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaClienteCoa.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaClienteCoa,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaClienteCoa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaClienteCoa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaClienteCoa"));

		this.jButtonid_empresaClienteCoaBusqueda= new JButtonMe();
		this.jButtonid_empresaClienteCoaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaClienteCoaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaClienteCoaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaClienteCoaBusqueda.setText("U");
		this.jButtonid_empresaClienteCoaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaClienteCoaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaClienteCoaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaClienteCoa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaClienteCoa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaClienteCoaBusqueda"));

		if(this.clientecoaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaClienteCoaBusqueda.setVisible(false);		}

		this.jButtonid_empresaClienteCoaUpdate= new JButtonMe();
		this.jButtonid_empresaClienteCoaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaClienteCoaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaClienteCoaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaClienteCoaUpdate.setText("U");
		this.jButtonid_empresaClienteCoaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaClienteCoaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaClienteCoaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaClienteCoa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaClienteCoa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaClienteCoaUpdate"));



					
		this.jLabelid_clienteClienteCoa = new JLabelMe();
		this.jLabelid_clienteClienteCoa.setText(""+ClienteCoaConstantesFunciones.LABEL_IDCLIENTE+" : *");
		this.jLabelid_clienteClienteCoa.setToolTipText("Cliente");
		this.jLabelid_clienteClienteCoa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteClienteCoa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteClienteCoa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_clienteClienteCoa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_clienteClienteCoa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_clienteClienteCoa.setToolTipText(ClienteCoaConstantesFunciones.LABEL_IDCLIENTE);
		this.gridaBagLayoutClienteCoa = new GridBagLayout();
		this.jPanelid_clienteClienteCoa.setLayout(this.gridaBagLayoutClienteCoa);


		jComboBoxid_clienteClienteCoa= new JComboBoxMe();
		jComboBoxid_clienteClienteCoa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteClienteCoa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteClienteCoa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteClienteCoa,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_clienteClienteCoa= new JButtonMe();
		this.jButtonid_clienteClienteCoa.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteClienteCoa.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteClienteCoa.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteClienteCoa.setText("Buscar");
		this.jButtonid_clienteClienteCoa.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_clienteClienteCoa.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteClienteCoa,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_clienteClienteCoa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteClienteCoa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteClienteCoa"));

		this.jButtonid_clienteClienteCoaBusqueda= new JButtonMe();
		this.jButtonid_clienteClienteCoaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteClienteCoaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteClienteCoaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteClienteCoaBusqueda.setText("U");
		this.jButtonid_clienteClienteCoaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_clienteClienteCoaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteClienteCoaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_clienteClienteCoa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteClienteCoa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteClienteCoaBusqueda"));

		if(this.clientecoaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_clienteClienteCoaBusqueda.setVisible(false);		}

		this.jButtonid_clienteClienteCoaUpdate= new JButtonMe();
		this.jButtonid_clienteClienteCoaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteClienteCoaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteClienteCoaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteClienteCoaUpdate.setText("U");
		this.jButtonid_clienteClienteCoaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_clienteClienteCoaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteClienteCoaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_clienteClienteCoa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteClienteCoa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteClienteCoaUpdate"));



					
		this.jLabelid_usuarioClienteCoa = new JLabelMe();
		this.jLabelid_usuarioClienteCoa.setText(""+ClienteCoaConstantesFunciones.LABEL_IDUSUARIO+" : *");
		this.jLabelid_usuarioClienteCoa.setToolTipText("Usuario");
		this.jLabelid_usuarioClienteCoa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioClienteCoa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioClienteCoa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_usuarioClienteCoa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_usuarioClienteCoa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_usuarioClienteCoa.setToolTipText(ClienteCoaConstantesFunciones.LABEL_IDUSUARIO);
		this.gridaBagLayoutClienteCoa = new GridBagLayout();
		this.jPanelid_usuarioClienteCoa.setLayout(this.gridaBagLayoutClienteCoa);


		jComboBoxid_usuarioClienteCoa= new JComboBoxMe();
		jComboBoxid_usuarioClienteCoa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioClienteCoa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioClienteCoa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_usuarioClienteCoa,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_usuarioClienteCoa.setEnabled(false);

		this.jButtonid_usuarioClienteCoa= new JButtonMe();
		this.jButtonid_usuarioClienteCoa.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioClienteCoa.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioClienteCoa.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioClienteCoa.setText("Buscar");
		this.jButtonid_usuarioClienteCoa.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_usuarioClienteCoa.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioClienteCoa,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_usuarioClienteCoa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioClienteCoa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioClienteCoa"));

		this.jButtonid_usuarioClienteCoaBusqueda= new JButtonMe();
		this.jButtonid_usuarioClienteCoaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioClienteCoaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioClienteCoaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioClienteCoaBusqueda.setText("U");
		this.jButtonid_usuarioClienteCoaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_usuarioClienteCoaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioClienteCoaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_usuarioClienteCoa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioClienteCoa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioClienteCoaBusqueda"));

		if(this.clientecoaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_usuarioClienteCoaBusqueda.setVisible(false);		}

		this.jButtonid_usuarioClienteCoaUpdate= new JButtonMe();
		this.jButtonid_usuarioClienteCoaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioClienteCoaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioClienteCoaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioClienteCoaUpdate.setText("U");
		this.jButtonid_usuarioClienteCoaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_usuarioClienteCoaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioClienteCoaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_usuarioClienteCoa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioClienteCoa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioClienteCoaUpdate"));



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
		//this.jInternalFrameDetalleClienteCoa = new ClienteCoaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Coa DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutClienteCoa= new GridBagLayout();
		

		
		String sToolTipClienteCoa="";
		sToolTipClienteCoa=ClienteCoaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipClienteCoa+="(Cartera.ClienteCoa)";
		}
		
		if(!this.clientecoaSessionBean.getEsGuardarRelacionado()) {
			sToolTipClienteCoa+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoClienteCoa = new JButtonMe();
		this.jButtonModificarClienteCoa = new JButtonMe();
        this.jButtonActualizarClienteCoa = new JButtonMe();
        this.jButtonEliminarClienteCoa = new JButtonMe();
        this.jButtonCancelarClienteCoa = new JButtonMe();
        this.jButtonGuardarCambiosClienteCoa = new JButtonMe();
		this.jButtonGuardarCambiosTablaClienteCoa = new JButtonMe();
		this.jButtonCerrarClienteCoa = new JButtonMe();
		
		this.jScrollPanelDatosClienteCoa = new JScrollPane();   
        this.jScrollPanelDatosEdicionClienteCoa = new JScrollPane();
		this.jScrollPanelDatosGeneralClienteCoa = new JScrollPane();
				
		
		
		this.jPanelCamposClienteCoa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosClienteCoa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesClienteCoa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioClienteCoa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Coa";
		
		if(!this.clientecoaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosClienteCoa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Coas" + this.sPath));
		} else {
			this.jScrollPanelDatosClienteCoa.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionClienteCoa.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralClienteCoa.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposClienteCoa.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposClienteCoa.setName("jPanelCamposClienteCoa"); 

		this.jPanelCamposOcultosClienteCoa.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosClienteCoa.setName("jPanelCamposOcultosClienteCoa"); 

        this.jPanelAccionesClienteCoa.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesClienteCoa.setToolTipText("Acciones");
        this.jPanelAccionesClienteCoa.setName("Acciones"); 

		this.jPanelAccionesFormularioClienteCoa.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioClienteCoa.setToolTipText("Acciones");
        this.jPanelAccionesFormularioClienteCoa.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionClienteCoa, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralClienteCoa, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosClienteCoa, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposClienteCoa, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosClienteCoa, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioClienteCoa, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoClienteCoa.setText("Nuevo");
		this.jButtonModificarClienteCoa.setText("Editar");
        this.jButtonActualizarClienteCoa.setText("Actualizar");
        this.jButtonEliminarClienteCoa.setText("Eliminar");
        this.jButtonCancelarClienteCoa.setText("Cancelar");
        this.jButtonGuardarCambiosClienteCoa.setText("Guardar");
		this.jButtonGuardarCambiosTablaClienteCoa.setText("Guardar");
		this.jButtonCerrarClienteCoa.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoClienteCoa,"nuevo_button","Nuevo",this.clientecoaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarClienteCoa,"modificar_button","Editar",this.clientecoaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarClienteCoa,"actualizar_button","Actualizar",this.clientecoaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarClienteCoa,"eliminar_button","Eliminar",this.clientecoaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarClienteCoa,"cancelar_button","Cancelar",this.clientecoaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosClienteCoa,"guardarcambios_button","Guardar",this.clientecoaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaClienteCoa,"guardarcambiostabla_button","Guardar",this.clientecoaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarClienteCoa,"cerrar_button","Salir",this.clientecoaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoClienteCoa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarClienteCoa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosClienteCoa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaClienteCoa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarClienteCoa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarClienteCoa, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarClienteCoa, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarClienteCoa, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoClienteCoa.setToolTipText("Nuevo"+" "+ClienteCoaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarClienteCoa.setToolTipText("Editar"+" "+ClienteCoaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarClienteCoa.setToolTipText("Actualizar"+" "+ClienteCoaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarClienteCoa.setToolTipText("Eliminar)"+" "+ClienteCoaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarClienteCoa.setToolTipText("Cancelar"+" "+ClienteCoaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosClienteCoa.setToolTipText("Guardar"+" "+ClienteCoaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaClienteCoa.setToolTipText("Guardar"+" "+ClienteCoaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarClienteCoa.setToolTipText("Salir"+" "+ClienteCoaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoClienteCoa";
		inputMap = this.jButtonNuevoClienteCoa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoClienteCoa.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoClienteCoa"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarClienteCoa";
		inputMap = this.jButtonActualizarClienteCoa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarClienteCoa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarClienteCoa"));
		
		//ELIMINAR
		sMapKey = "EliminarClienteCoa";
		inputMap = this.jButtonEliminarClienteCoa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarClienteCoa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarClienteCoa"));
		
		//CANCELAR	
		sMapKey = "CancelarClienteCoa";
		inputMap = this.jButtonCancelarClienteCoa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarClienteCoa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarClienteCoa"));
		
		//CERRAR		
		sMapKey = "CerrarClienteCoa";
		inputMap = this.jButtonCerrarClienteCoa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarClienteCoa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarClienteCoa"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaClienteCoa";
		inputMap = this.jButtonGuardarCambiosTablaClienteCoa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaClienteCoa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaClienteCoa"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoClienteCoa = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoClienteCoa.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoClienteCoa.setToolTipText("Nuevo ClienteCoa");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoClienteCoa, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarClienteCoa = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarClienteCoa.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarClienteCoa.setToolTipText("Sin Cerrar Ventana ClienteCoa");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarClienteCoa, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeClienteCoa = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeClienteCoa.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeClienteCoa.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeClienteCoa, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesClienteCoa = new JComboBoxMe();
		//this.jComboBoxTiposAccionesClienteCoa.setText("Accion");
		this.jComboBoxTiposAccionesClienteCoa.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioClienteCoa = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioClienteCoa.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioClienteCoa.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesClienteCoa = new JLabelMe();
		
		this.jLabelAccionesClienteCoa.setText("Acciones");		
		this.jLabelAccionesClienteCoa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesClienteCoa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesClienteCoa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposClienteCoa();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysClienteCoa();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesClienteCoa=new JTabbedPane();
		this.jTabbedPaneRelacionesClienteCoa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesClienteCoa,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesClienteCoa.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesClienteCoa.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesClienteCoa.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesClienteCoa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioClienteCoa.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioClienteCoa.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioClienteCoa.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioClienteCoa, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposClienteCoa = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosClienteCoa = new GridBagLayout();
		
		this.jPanelCamposClienteCoa.setLayout(gridaBagLayoutCamposClienteCoa);
		this.jPanelCamposOcultosClienteCoa.setLayout(gridaBagLayoutCamposOcultosClienteCoa);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsClienteCoa = new GridBagConstraints();
	this.gridBagConstraintsClienteCoa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteCoa.gridy = 0;
	this.gridBagConstraintsClienteCoa.gridx = 0;
	this.gridBagConstraintsClienteCoa.ipadx = 0;
	this.gridBagConstraintsClienteCoa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidClienteCoa.add(jLabelIdClienteCoa, this.gridBagConstraintsClienteCoa);



	this.gridBagConstraintsClienteCoa = new GridBagConstraints();
	this.gridBagConstraintsClienteCoa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteCoa.gridy = 0;
	this.gridBagConstraintsClienteCoa.gridx = 1;
	this.gridBagConstraintsClienteCoa.ipadx = 0;
	this.gridBagConstraintsClienteCoa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidClienteCoa.add(jLabelidClienteCoa, this.gridBagConstraintsClienteCoa);


	this.gridBagConstraintsClienteCoa = new GridBagConstraints();
	this.gridBagConstraintsClienteCoa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteCoa.gridy = 0;
	this.gridBagConstraintsClienteCoa.gridx = 0;
	this.gridBagConstraintsClienteCoa.ipadx = 0;
	this.gridBagConstraintsClienteCoa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaClienteCoa.add(jLabelid_empresaClienteCoa, this.gridBagConstraintsClienteCoa);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsClienteCoa = new GridBagConstraints();
		//this.gridBagConstraintsClienteCoa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteCoa.gridy = 0;
		this.gridBagConstraintsClienteCoa.gridx = 2;
		this.gridBagConstraintsClienteCoa.ipadx = 0;
		this.gridBagConstraintsClienteCoa.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaClienteCoa.add(jButtonid_empresaClienteCoaBusqueda, this.gridBagConstraintsClienteCoa);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsClienteCoa = new GridBagConstraints();
		//this.gridBagConstraintsClienteCoa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteCoa.gridy = 0;
		this.gridBagConstraintsClienteCoa.gridx = 3;
		this.gridBagConstraintsClienteCoa.ipadx = 0;
		this.gridBagConstraintsClienteCoa.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaClienteCoa.add(jButtonid_empresaClienteCoaUpdate, this.gridBagConstraintsClienteCoa);
	}

	this.gridBagConstraintsClienteCoa = new GridBagConstraints();
	this.gridBagConstraintsClienteCoa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteCoa.gridy = 0;
	this.gridBagConstraintsClienteCoa.gridx = 1;
	this.gridBagConstraintsClienteCoa.ipadx = 0;
	this.gridBagConstraintsClienteCoa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaClienteCoa.add(jComboBoxid_empresaClienteCoa, this.gridBagConstraintsClienteCoa);


	this.gridBagConstraintsClienteCoa = new GridBagConstraints();
	this.gridBagConstraintsClienteCoa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteCoa.gridy = 0;
	this.gridBagConstraintsClienteCoa.gridx = 0;
	this.gridBagConstraintsClienteCoa.ipadx = 0;
	this.gridBagConstraintsClienteCoa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_clienteClienteCoa.add(jLabelid_clienteClienteCoa, this.gridBagConstraintsClienteCoa);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsClienteCoa = new GridBagConstraints();
	//this.gridBagConstraintsClienteCoa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteCoa.gridy = 0;
	this.gridBagConstraintsClienteCoa.gridx = 2;
	this.gridBagConstraintsClienteCoa.ipadx = 0;
	this.gridBagConstraintsClienteCoa.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_clienteClienteCoa.add(jButtonid_clienteClienteCoa, this.gridBagConstraintsClienteCoa);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsClienteCoa = new GridBagConstraints();
		//this.gridBagConstraintsClienteCoa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteCoa.gridy = 0;
		this.gridBagConstraintsClienteCoa.gridx = 3;
		this.gridBagConstraintsClienteCoa.ipadx = 0;
		this.gridBagConstraintsClienteCoa.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteClienteCoa.add(jButtonid_clienteClienteCoaBusqueda, this.gridBagConstraintsClienteCoa);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsClienteCoa = new GridBagConstraints();
		//this.gridBagConstraintsClienteCoa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteCoa.gridy = 0;
		this.gridBagConstraintsClienteCoa.gridx = 4;
		this.gridBagConstraintsClienteCoa.ipadx = 0;
		this.gridBagConstraintsClienteCoa.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteClienteCoa.add(jButtonid_clienteClienteCoaUpdate, this.gridBagConstraintsClienteCoa);
	}

	this.gridBagConstraintsClienteCoa = new GridBagConstraints();
	this.gridBagConstraintsClienteCoa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteCoa.gridy = 0;
	this.gridBagConstraintsClienteCoa.gridx = 1;
	this.gridBagConstraintsClienteCoa.ipadx = 0;
	this.gridBagConstraintsClienteCoa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_clienteClienteCoa.add(jComboBoxid_clienteClienteCoa, this.gridBagConstraintsClienteCoa);


	this.gridBagConstraintsClienteCoa = new GridBagConstraints();
	this.gridBagConstraintsClienteCoa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteCoa.gridy = 0;
	this.gridBagConstraintsClienteCoa.gridx = 0;
	this.gridBagConstraintsClienteCoa.ipadx = 0;
	this.gridBagConstraintsClienteCoa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_usuarioClienteCoa.add(jLabelid_usuarioClienteCoa, this.gridBagConstraintsClienteCoa);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsClienteCoa = new GridBagConstraints();
		//this.gridBagConstraintsClienteCoa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteCoa.gridy = 0;
		this.gridBagConstraintsClienteCoa.gridx = 2;
		this.gridBagConstraintsClienteCoa.ipadx = 0;
		this.gridBagConstraintsClienteCoa.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioClienteCoa.add(jButtonid_usuarioClienteCoaBusqueda, this.gridBagConstraintsClienteCoa);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsClienteCoa = new GridBagConstraints();
		//this.gridBagConstraintsClienteCoa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteCoa.gridy = 0;
		this.gridBagConstraintsClienteCoa.gridx = 3;
		this.gridBagConstraintsClienteCoa.ipadx = 0;
		this.gridBagConstraintsClienteCoa.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioClienteCoa.add(jButtonid_usuarioClienteCoaUpdate, this.gridBagConstraintsClienteCoa);
	}

	this.gridBagConstraintsClienteCoa = new GridBagConstraints();
	this.gridBagConstraintsClienteCoa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteCoa.gridy = 0;
	this.gridBagConstraintsClienteCoa.gridx = 1;
	this.gridBagConstraintsClienteCoa.ipadx = 0;
	this.gridBagConstraintsClienteCoa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_usuarioClienteCoa.add(jComboBoxid_usuarioClienteCoa, this.gridBagConstraintsClienteCoa);


	this.gridBagConstraintsClienteCoa = new GridBagConstraints();
	this.gridBagConstraintsClienteCoa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteCoa.gridy = 0;
	this.gridBagConstraintsClienteCoa.gridx = 0;
	this.gridBagConstraintsClienteCoa.ipadx = 0;
	this.gridBagConstraintsClienteCoa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelautori_imprentaClienteCoa.add(jLabelautori_imprentaClienteCoa, this.gridBagConstraintsClienteCoa);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsClienteCoa = new GridBagConstraints();
		//this.gridBagConstraintsClienteCoa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteCoa.gridy = 0;
		this.gridBagConstraintsClienteCoa.gridx = 2;
		this.gridBagConstraintsClienteCoa.ipadx = 0;
		this.gridBagConstraintsClienteCoa.insets = new Insets(0, 0, 0, 0);
		this.jPanelautori_imprentaClienteCoa.add(jButtonautori_imprentaClienteCoaBusqueda, this.gridBagConstraintsClienteCoa);
	}

	this.gridBagConstraintsClienteCoa = new GridBagConstraints();
	this.gridBagConstraintsClienteCoa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteCoa.gridy = 0;
	this.gridBagConstraintsClienteCoa.gridx = 1;
	this.gridBagConstraintsClienteCoa.ipadx = 0;
	this.gridBagConstraintsClienteCoa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelautori_imprentaClienteCoa.add(jTextFieldautori_imprentaClienteCoa, this.gridBagConstraintsClienteCoa);


	this.gridBagConstraintsClienteCoa = new GridBagConstraints();
	this.gridBagConstraintsClienteCoa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteCoa.gridy = 0;
	this.gridBagConstraintsClienteCoa.gridx = 0;
	this.gridBagConstraintsClienteCoa.ipadx = 0;
	this.gridBagConstraintsClienteCoa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelautori_usuarioClienteCoa.add(jLabelautori_usuarioClienteCoa, this.gridBagConstraintsClienteCoa);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsClienteCoa = new GridBagConstraints();
		//this.gridBagConstraintsClienteCoa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteCoa.gridy = 0;
		this.gridBagConstraintsClienteCoa.gridx = 2;
		this.gridBagConstraintsClienteCoa.ipadx = 0;
		this.gridBagConstraintsClienteCoa.insets = new Insets(0, 0, 0, 0);
		this.jPanelautori_usuarioClienteCoa.add(jButtonautori_usuarioClienteCoaBusqueda, this.gridBagConstraintsClienteCoa);
	}

	this.gridBagConstraintsClienteCoa = new GridBagConstraints();
	this.gridBagConstraintsClienteCoa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteCoa.gridy = 0;
	this.gridBagConstraintsClienteCoa.gridx = 1;
	this.gridBagConstraintsClienteCoa.ipadx = 0;
	this.gridBagConstraintsClienteCoa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelautori_usuarioClienteCoa.add(jTextFieldautori_usuarioClienteCoa, this.gridBagConstraintsClienteCoa);


	this.gridBagConstraintsClienteCoa = new GridBagConstraints();
	this.gridBagConstraintsClienteCoa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteCoa.gridy = 0;
	this.gridBagConstraintsClienteCoa.gridx = 0;
	this.gridBagConstraintsClienteCoa.ipadx = 0;
	this.gridBagConstraintsClienteCoa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnum_factura_iniClienteCoa.add(jLabelnum_factura_iniClienteCoa, this.gridBagConstraintsClienteCoa);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsClienteCoa = new GridBagConstraints();
		//this.gridBagConstraintsClienteCoa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteCoa.gridy = 0;
		this.gridBagConstraintsClienteCoa.gridx = 2;
		this.gridBagConstraintsClienteCoa.ipadx = 0;
		this.gridBagConstraintsClienteCoa.insets = new Insets(0, 0, 0, 0);
		this.jPanelnum_factura_iniClienteCoa.add(jButtonnum_factura_iniClienteCoaBusqueda, this.gridBagConstraintsClienteCoa);
	}

	this.gridBagConstraintsClienteCoa = new GridBagConstraints();
	this.gridBagConstraintsClienteCoa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteCoa.gridy = 0;
	this.gridBagConstraintsClienteCoa.gridx = 1;
	this.gridBagConstraintsClienteCoa.ipadx = 0;
	this.gridBagConstraintsClienteCoa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnum_factura_iniClienteCoa.add(jTextFieldnum_factura_iniClienteCoa, this.gridBagConstraintsClienteCoa);


	this.gridBagConstraintsClienteCoa = new GridBagConstraints();
	this.gridBagConstraintsClienteCoa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteCoa.gridy = 0;
	this.gridBagConstraintsClienteCoa.gridx = 0;
	this.gridBagConstraintsClienteCoa.ipadx = 0;
	this.gridBagConstraintsClienteCoa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnum_factura_finClienteCoa.add(jLabelnum_factura_finClienteCoa, this.gridBagConstraintsClienteCoa);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsClienteCoa = new GridBagConstraints();
		//this.gridBagConstraintsClienteCoa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteCoa.gridy = 0;
		this.gridBagConstraintsClienteCoa.gridx = 2;
		this.gridBagConstraintsClienteCoa.ipadx = 0;
		this.gridBagConstraintsClienteCoa.insets = new Insets(0, 0, 0, 0);
		this.jPanelnum_factura_finClienteCoa.add(jButtonnum_factura_finClienteCoaBusqueda, this.gridBagConstraintsClienteCoa);
	}

	this.gridBagConstraintsClienteCoa = new GridBagConstraints();
	this.gridBagConstraintsClienteCoa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteCoa.gridy = 0;
	this.gridBagConstraintsClienteCoa.gridx = 1;
	this.gridBagConstraintsClienteCoa.ipadx = 0;
	this.gridBagConstraintsClienteCoa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnum_factura_finClienteCoa.add(jTextFieldnum_factura_finClienteCoa, this.gridBagConstraintsClienteCoa);


	this.gridBagConstraintsClienteCoa = new GridBagConstraints();
	this.gridBagConstraintsClienteCoa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteCoa.gridy = 0;
	this.gridBagConstraintsClienteCoa.gridx = 0;
	this.gridBagConstraintsClienteCoa.ipadx = 0;
	this.gridBagConstraintsClienteCoa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelserie_docuClienteCoa.add(jLabelserie_docuClienteCoa, this.gridBagConstraintsClienteCoa);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsClienteCoa = new GridBagConstraints();
		//this.gridBagConstraintsClienteCoa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteCoa.gridy = 0;
		this.gridBagConstraintsClienteCoa.gridx = 2;
		this.gridBagConstraintsClienteCoa.ipadx = 0;
		this.gridBagConstraintsClienteCoa.insets = new Insets(0, 0, 0, 0);
		this.jPanelserie_docuClienteCoa.add(jButtonserie_docuClienteCoaBusqueda, this.gridBagConstraintsClienteCoa);
	}

	this.gridBagConstraintsClienteCoa = new GridBagConstraints();
	this.gridBagConstraintsClienteCoa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteCoa.gridy = 0;
	this.gridBagConstraintsClienteCoa.gridx = 1;
	this.gridBagConstraintsClienteCoa.ipadx = 0;
	this.gridBagConstraintsClienteCoa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelserie_docuClienteCoa.add(jTextFieldserie_docuClienteCoa, this.gridBagConstraintsClienteCoa);


	this.gridBagConstraintsClienteCoa = new GridBagConstraints();
	this.gridBagConstraintsClienteCoa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteCoa.gridy = 0;
	this.gridBagConstraintsClienteCoa.gridx = 0;
	this.gridBagConstraintsClienteCoa.ipadx = 0;
	this.gridBagConstraintsClienteCoa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_valiClienteCoa.add(jLabelfecha_valiClienteCoa, this.gridBagConstraintsClienteCoa);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsClienteCoa = new GridBagConstraints();
		//this.gridBagConstraintsClienteCoa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsClienteCoa.gridy = 0;
		this.gridBagConstraintsClienteCoa.gridx = 2;
		this.gridBagConstraintsClienteCoa.ipadx = 0;
		this.gridBagConstraintsClienteCoa.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_valiClienteCoa.add(jButtonfecha_valiClienteCoaBusqueda, this.gridBagConstraintsClienteCoa);
	}

	this.gridBagConstraintsClienteCoa = new GridBagConstraints();
	this.gridBagConstraintsClienteCoa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsClienteCoa.gridy = 0;
	this.gridBagConstraintsClienteCoa.gridx = 1;
	this.gridBagConstraintsClienteCoa.ipadx = 0;
	this.gridBagConstraintsClienteCoa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_valiClienteCoa.add(jDateChooserfecha_valiClienteCoa, this.gridBagConstraintsClienteCoa);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsClienteCoa = new GridBagConstraints();
	this.gridBagConstraintsClienteCoa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsClienteCoa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsClienteCoa.gridy = iYPanelCamposClienteCoa;
	this.gridBagConstraintsClienteCoa.gridx = iXPanelCamposClienteCoa++;
	this.gridBagConstraintsClienteCoa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsClienteCoa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposClienteCoa.add(this.jPanelidClienteCoa, this.gridBagConstraintsClienteCoa);



	if(iXPanelCamposClienteCoa % 1==0) {
		iXPanelCamposClienteCoa=0;
		iYPanelCamposClienteCoa++;
	}
	this.gridBagConstraintsClienteCoa = new GridBagConstraints();
	this.gridBagConstraintsClienteCoa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsClienteCoa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsClienteCoa.gridy = iYPanelCamposClienteCoa;
	this.gridBagConstraintsClienteCoa.gridx = iXPanelCamposClienteCoa++;
	this.gridBagConstraintsClienteCoa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsClienteCoa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposClienteCoa.add(this.jPanelid_clienteClienteCoa, this.gridBagConstraintsClienteCoa);



	if(iXPanelCamposClienteCoa % 1==0) {
		iXPanelCamposClienteCoa=0;
		iYPanelCamposClienteCoa++;
	}
	this.gridBagConstraintsClienteCoa = new GridBagConstraints();
	this.gridBagConstraintsClienteCoa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsClienteCoa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsClienteCoa.gridy = iYPanelCamposClienteCoa;
	this.gridBagConstraintsClienteCoa.gridx = iXPanelCamposClienteCoa++;
	this.gridBagConstraintsClienteCoa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsClienteCoa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposClienteCoa.add(this.jPanelautori_imprentaClienteCoa, this.gridBagConstraintsClienteCoa);



	if(iXPanelCamposClienteCoa % 1==0) {
		iXPanelCamposClienteCoa=0;
		iYPanelCamposClienteCoa++;
	}
	this.gridBagConstraintsClienteCoa = new GridBagConstraints();
	this.gridBagConstraintsClienteCoa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsClienteCoa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsClienteCoa.gridy = iYPanelCamposClienteCoa;
	this.gridBagConstraintsClienteCoa.gridx = iXPanelCamposClienteCoa++;
	this.gridBagConstraintsClienteCoa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsClienteCoa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposClienteCoa.add(this.jPanelautori_usuarioClienteCoa, this.gridBagConstraintsClienteCoa);



	if(iXPanelCamposClienteCoa % 1==0) {
		iXPanelCamposClienteCoa=0;
		iYPanelCamposClienteCoa++;
	}
	this.gridBagConstraintsClienteCoa = new GridBagConstraints();
	this.gridBagConstraintsClienteCoa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsClienteCoa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsClienteCoa.gridy = iYPanelCamposClienteCoa;
	this.gridBagConstraintsClienteCoa.gridx = iXPanelCamposClienteCoa++;
	this.gridBagConstraintsClienteCoa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsClienteCoa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposClienteCoa.add(this.jPanelnum_factura_iniClienteCoa, this.gridBagConstraintsClienteCoa);



	if(iXPanelCamposClienteCoa % 1==0) {
		iXPanelCamposClienteCoa=0;
		iYPanelCamposClienteCoa++;
	}
	this.gridBagConstraintsClienteCoa = new GridBagConstraints();
	this.gridBagConstraintsClienteCoa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsClienteCoa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsClienteCoa.gridy = iYPanelCamposClienteCoa;
	this.gridBagConstraintsClienteCoa.gridx = iXPanelCamposClienteCoa++;
	this.gridBagConstraintsClienteCoa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsClienteCoa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposClienteCoa.add(this.jPanelnum_factura_finClienteCoa, this.gridBagConstraintsClienteCoa);



	if(iXPanelCamposClienteCoa % 1==0) {
		iXPanelCamposClienteCoa=0;
		iYPanelCamposClienteCoa++;
	}
	this.gridBagConstraintsClienteCoa = new GridBagConstraints();
	this.gridBagConstraintsClienteCoa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsClienteCoa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsClienteCoa.gridy = iYPanelCamposClienteCoa;
	this.gridBagConstraintsClienteCoa.gridx = iXPanelCamposClienteCoa++;
	this.gridBagConstraintsClienteCoa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsClienteCoa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposClienteCoa.add(this.jPanelserie_docuClienteCoa, this.gridBagConstraintsClienteCoa);



	if(iXPanelCamposClienteCoa % 1==0) {
		iXPanelCamposClienteCoa=0;
		iYPanelCamposClienteCoa++;
	}
	this.gridBagConstraintsClienteCoa = new GridBagConstraints();
	this.gridBagConstraintsClienteCoa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsClienteCoa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsClienteCoa.gridy = iYPanelCamposClienteCoa;
	this.gridBagConstraintsClienteCoa.gridx = iXPanelCamposClienteCoa++;
	this.gridBagConstraintsClienteCoa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsClienteCoa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposClienteCoa.add(this.jPanelfecha_valiClienteCoa, this.gridBagConstraintsClienteCoa);



	if(iXPanelCamposClienteCoa % 1==0) {
		iXPanelCamposClienteCoa=0;
		iYPanelCamposClienteCoa++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsClienteCoa = new GridBagConstraints();
	this.gridBagConstraintsClienteCoa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsClienteCoa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsClienteCoa.gridy = iYPanelCamposOcultosClienteCoa;
	this.gridBagConstraintsClienteCoa.gridx = iXPanelCamposOcultosClienteCoa++;
	this.gridBagConstraintsClienteCoa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsClienteCoa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosClienteCoa.add(this.jPanelid_empresaClienteCoa, this.gridBagConstraintsClienteCoa);



	if(iXPanelCamposOcultosClienteCoa % 1==0) {
		iXPanelCamposOcultosClienteCoa=0;
		iYPanelCamposOcultosClienteCoa++;
	}
	this.gridBagConstraintsClienteCoa = new GridBagConstraints();
	this.gridBagConstraintsClienteCoa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsClienteCoa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsClienteCoa.gridy = iYPanelCamposOcultosClienteCoa;
	this.gridBagConstraintsClienteCoa.gridx = iXPanelCamposOcultosClienteCoa++;
	this.gridBagConstraintsClienteCoa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsClienteCoa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosClienteCoa.add(this.jPanelid_usuarioClienteCoa, this.gridBagConstraintsClienteCoa);



	if(iXPanelCamposOcultosClienteCoa % 1==0) {
		iXPanelCamposOcultosClienteCoa=0;
		iYPanelCamposOcultosClienteCoa++;
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
			
		GridBagLayout gridaBagLayoutAccionesClienteCoa= new GridBagLayout();
		this.jPanelAccionesClienteCoa.setLayout(gridaBagLayoutAccionesClienteCoa);
		
		GridBagLayout gridaBagLayoutAccionesFormularioClienteCoa= new GridBagLayout();
		this.jPanelAccionesFormularioClienteCoa.setLayout(gridaBagLayoutAccionesFormularioClienteCoa);
		
		this.gridBagConstraintsClienteCoa = new GridBagConstraints();
		this.gridBagConstraintsClienteCoa.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsClienteCoa.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioClienteCoa.add(this.jComboBoxTiposAccionesFormularioClienteCoa, this.gridBagConstraintsClienteCoa);

		this.gridBagConstraintsClienteCoa = new GridBagConstraints();
		this.gridBagConstraintsClienteCoa.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsClienteCoa.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioClienteCoa.add(this.jCheckBoxPostAccionNuevoClienteCoa, this.gridBagConstraintsClienteCoa);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.clientecoaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsClienteCoa = new GridBagConstraints();
			this.gridBagConstraintsClienteCoa.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsClienteCoa.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioClienteCoa.add(this.jCheckBoxPostAccionSinCerrarClienteCoa, this.gridBagConstraintsClienteCoa);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.clientecoaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.clientecoaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsClienteCoa = new GridBagConstraints();
			this.gridBagConstraintsClienteCoa.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsClienteCoa.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioClienteCoa.add(this.jCheckBoxPostAccionSinMensajeClienteCoa, this.gridBagConstraintsClienteCoa);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsClienteCoa = new GridBagConstraints();
		this.gridBagConstraintsClienteCoa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsClienteCoa.gridy = 0;
		this.gridBagConstraintsClienteCoa.gridx = iPosXAccion++;
			
		this.jPanelAccionesClienteCoa.add(this.jButtonModificarClienteCoa, this.gridBagConstraintsClienteCoa);							

		this.gridBagConstraintsClienteCoa = new GridBagConstraints();
		this.gridBagConstraintsClienteCoa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsClienteCoa.gridy = 0;
		this.gridBagConstraintsClienteCoa.gridx =iPosXAccion++;
			
		this.jPanelAccionesClienteCoa.add(this.jButtonEliminarClienteCoa, this.gridBagConstraintsClienteCoa);
		
			
		this.gridBagConstraintsClienteCoa = new GridBagConstraints();
		this.gridBagConstraintsClienteCoa.gridy = 0;		
		this.gridBagConstraintsClienteCoa.gridx = iPosXAccion++;
		
		this.jPanelAccionesClienteCoa.add(this.jButtonActualizarClienteCoa, this.gridBagConstraintsClienteCoa);


		this.gridBagConstraintsClienteCoa = new GridBagConstraints();
		this.gridBagConstraintsClienteCoa.gridy = 0;		
		this.gridBagConstraintsClienteCoa.gridx = iPosXAccion++;
		
		this.jPanelAccionesClienteCoa.add(this.jButtonGuardarCambiosClienteCoa, this.gridBagConstraintsClienteCoa);	
		
		this.gridBagConstraintsClienteCoa = new GridBagConstraints();
		this.gridBagConstraintsClienteCoa.gridy = 0;		
		this.gridBagConstraintsClienteCoa.gridx =iPosXAccion++;
		
		this.jPanelAccionesClienteCoa.add(this.jButtonCancelarClienteCoa, this.gridBagConstraintsClienteCoa);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutClienteCoa = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutClienteCoa);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.clientecoaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsClienteCoa = new GridBagConstraints();						
			this.gridBagConstraintsClienteCoa.gridy = iGridyPrincipal++;
			this.gridBagConstraintsClienteCoa.gridx = 0;		
			//this.gridBagConstraintsClienteCoa.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsClienteCoa.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsClienteCoa.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsClienteCoa = new GridBagConstraints();
		this.gridBagConstraintsClienteCoa.gridy =iGridyPrincipal++;
		this.gridBagConstraintsClienteCoa.gridx =0;
		this.gridBagConstraintsClienteCoa.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsClienteCoa.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosClienteCoa, this.gridBagConstraintsClienteCoa);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ClienteCoaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleClienteCoa = new ClienteCoaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Coa DATOS");
			
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
			
	        //this.setTitle("[FOR] - Coa DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Coa Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ClienteCoaModel clientecoaModel=new ClienteCoaModel(this);
			
			//SI USARA CLASE INTERNA
			//ClienteCoaModel.ClienteCoaFocusTraversalPolicy clientecoaFocusTraversalPolicy = clientecoaModel.new ClienteCoaFocusTraversalPolicy(this);
			
			//clientecoaFocusTraversalPolicy.setclientecoaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(clientecoaModel);
			
			
			this.jContentPaneDetalleClienteCoa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleClienteCoa = new GridBagLayout();	
			this.jContentPaneDetalleClienteCoa.setLayout(gridaBagLayoutDetalleClienteCoa);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosClienteCoa = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsClienteCoa = new GridBagConstraints();
				this.gridBagConstraintsClienteCoa.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsClienteCoa.gridx = 0;
					
				
				this.jContentPaneDetalleClienteCoa.add(jTtoolBarDetalleClienteCoa, gridBagConstraintsClienteCoa);								
				
}
			
			this.jScrollPanelDatosEdicionClienteCoa=   new JScrollPane(jContentPaneDetalleClienteCoa,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionClienteCoa.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionClienteCoa.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionClienteCoa.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralClienteCoa=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralClienteCoa.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralClienteCoa.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralClienteCoa.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsClienteCoa = new GridBagConstraints();
			
			
	        this.gridBagConstraintsClienteCoa.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsClienteCoa.gridx = 0;
	        
			this.jContentPaneDetalleClienteCoa.add(jPanelCamposClienteCoa, gridBagConstraintsClienteCoa);
			
			
			
			
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
						&& clientecoaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.clientecoaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsClienteCoa= new GridBagConstraints();
						this.gridBagConstraintsClienteCoa.gridy = iGridyRelaciones++;
						this.gridBagConstraintsClienteCoa.gridx = 0;
						this.jContentPaneDetalleClienteCoa.add(this.jTabbedPaneRelacionesClienteCoa, this.gridBagConstraintsClienteCoa);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesClienteCoa.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosClienteCoa.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsClienteCoa = new GridBagConstraints();
					this.gridBagConstraintsClienteCoa.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsClienteCoa.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsClienteCoa.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsClienteCoa.gridx = 0;
					
				
					this.jContentPaneDetalleClienteCoa.add(jPanelCamposOcultosClienteCoa, gridBagConstraintsClienteCoa);
				
					this.jPanelCamposOcultosClienteCoa.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsClienteCoa = new GridBagConstraints();
			this.gridBagConstraintsClienteCoa.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsClienteCoa.gridx = 0;
	        this.gridBagConstraintsClienteCoa.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleClienteCoa.add(this.jPanelAccionesFormularioClienteCoa, this.gridBagConstraintsClienteCoa);							
			
			
			
			this.gridBagConstraintsClienteCoa = new GridBagConstraints();
	        this.gridBagConstraintsClienteCoa.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsClienteCoa.gridx = 0;
	        
			
			this.jContentPaneDetalleClienteCoa.add(this.jPanelAccionesClienteCoa, this.gridBagConstraintsClienteCoa);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionClienteCoa);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionClienteCoa=   new JScrollPane(this.jPanelCamposClienteCoa,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionClienteCoa.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionClienteCoa.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionClienteCoa.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsClienteCoa = new GridBagConstraints();
			this.gridBagConstraintsClienteCoa.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsClienteCoa.gridx = 0;
			this.gridBagConstraintsClienteCoa.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsClienteCoa.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsClienteCoa.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionClienteCoa, this.gridBagConstraintsClienteCoa);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsClienteCoa = new GridBagConstraints();
			this.gridBagConstraintsClienteCoa.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsClienteCoa.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioClienteCoa, this.gridBagConstraintsClienteCoa);			
			
			this.gridBagConstraintsClienteCoa = new GridBagConstraints();
			this.gridBagConstraintsClienteCoa.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsClienteCoa.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesClienteCoa, this.gridBagConstraintsClienteCoa);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsClienteCoa = new GridBagConstraints();
		this.gridBagConstraintsClienteCoa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsClienteCoa.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposClienteCoa, this.gridBagConstraintsClienteCoa);
			
			
		this.gridBagConstraintsClienteCoa = new GridBagConstraints();
		this.gridBagConstraintsClienteCoa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsClienteCoa.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosClienteCoa, this.gridBagConstraintsClienteCoa);
		
			
		this.gridBagConstraintsClienteCoa = new GridBagConstraints();
		this.gridBagConstraintsClienteCoa.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsClienteCoa.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesClienteCoa, this.gridBagConstraintsClienteCoa);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralClienteCoa;//jContentPane;
		
		return jScrollPanelDatosEdicionClienteCoa;
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
