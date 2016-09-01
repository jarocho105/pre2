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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.facturacion.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.facturacion.util.PoliticaClienteConstantesFunciones;

import com.bydan.erp.facturacion.business.logic.*;
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
public class PoliticaClienteDetalleFormJInternalFrame extends PoliticaClienteBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetallePoliticaCliente;
	
	protected JMenuBar jmenuBarDetallePoliticaCliente;
	
	protected JMenu jmenuDetallePoliticaCliente;
	protected JMenu jmenuDetalleArchivoPoliticaCliente;
	protected JMenu jmenuDetalleAccionesPoliticaCliente;
	protected JMenu jmenuDetalleDatosPoliticaCliente;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetallePoliticaCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPoliticaCliente;	
	protected GridBagConstraints gridBagConstraintsPoliticaCliente;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected PoliticaClienteBeanSwingJInternalFrameAdditional jInternalFrameDetallePoliticaCliente;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";
	
	public PoliticaClienteSessionBean politicaclienteSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public ClienteSessionBean clienteSessionBean;	
	
	public PoliticaClienteLogic politicaclienteLogic;
	
	public JScrollPane jScrollPanelDatosPoliticaCliente;
	public JScrollPane jScrollPanelDatosEdicionPoliticaCliente;
	public JScrollPane jScrollPanelDatosGeneralPoliticaCliente;
	
	protected JPanel jPanelCamposPoliticaCliente;    
	protected JPanel jPanelCamposOcultosPoliticaCliente;    	
	protected JPanel jPanelAccionesPoliticaCliente;
	protected JPanel jPanelAccionesFormularioPoliticaCliente;
    
	
	
	protected Integer iXPanelCamposPoliticaCliente=0;
	protected Integer iYPanelCamposPoliticaCliente=0;
	
	protected Integer iXPanelCamposOcultosPoliticaCliente=0;
	protected Integer iYPanelCamposOcultosPoliticaCliente=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoPoliticaCliente;
	public JButton jButtonModificarPoliticaCliente;
	public JButton jButtonActualizarPoliticaCliente;
    public JButton jButtonEliminarPoliticaCliente;
	public JButton jButtonCancelarPoliticaCliente;
    public JButton jButtonGuardarCambiosPoliticaCliente;
	public JButton jButtonGuardarCambiosTablaPoliticaCliente;
	protected JButton jButtonCerrarPoliticaCliente;
	
	
	protected JButton jButtonProcesarInformacionPoliticaCliente;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoPoliticaCliente;
	protected JCheckBox jCheckBoxPostAccionSinCerrarPoliticaCliente;
	protected JCheckBox jCheckBoxPostAccionSinMensajePoliticaCliente;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPoliticaCliente;
	protected JButton jButtonModificarToolBarPoliticaCliente;
	protected JButton jButtonActualizarToolBarPoliticaCliente;
    protected JButton jButtonEliminarToolBarPoliticaCliente;
	protected JButton jButtonCancelarToolBarPoliticaCliente;
    protected JButton jButtonGuardarCambiosToolBarPoliticaCliente;
	protected JButton jButtonGuardarCambiosTablaToolBarPoliticaCliente;
	protected JButton jButtonMostrarOcultarTablaToolBarPoliticaCliente;
	protected JButton jButtonCerrarToolBarPoliticaCliente;
	
	protected JButton jButtonProcesarInformacionToolBarPoliticaCliente;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPoliticaCliente;
	protected JMenuItem jMenuItemModificarPoliticaCliente;
	protected JMenuItem jMenuItemActualizarPoliticaCliente;
    protected JMenuItem jMenuItemEliminarPoliticaCliente;
	protected JMenuItem jMenuItemCancelarPoliticaCliente;
    protected JMenuItem jMenuItemGuardarCambiosPoliticaCliente;
	protected JMenuItem jMenuItemGuardarCambiosTablaPoliticaCliente;
	protected JMenuItem jMenuItemCerrarPoliticaCliente;
	protected JMenuItem jMenuItemDetalleCerrarPoliticaCliente;
	protected JMenuItem jMenuItemDetalleMostarOcultarPoliticaCliente;
	
	protected JMenuItem jMenuItemProcesarInformacionPoliticaCliente;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPoliticaCliente;
	protected JMenuItem jMenuItemMostrarOcultarPoliticaCliente;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPoliticaCliente;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPoliticaCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPoliticaCliente;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioPoliticaCliente;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidPoliticaCliente;
	public JLabel jLabelIdPoliticaCliente;
	public JLabel jLabelidPoliticaCliente;
	public JButton jButtonidPoliticaClienteBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaPoliticaCliente;
	public JLabel jLabelid_empresaPoliticaCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaPoliticaCliente;
	public JButton jButtonid_empresaPoliticaCliente= new JButtonMe();
	public JButton jButtonid_empresaPoliticaClienteUpdate= new JButtonMe();
	public JButton jButtonid_empresaPoliticaClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalPoliticaCliente;
	public JLabel jLabelid_sucursalPoliticaCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalPoliticaCliente;
	public JButton jButtonid_sucursalPoliticaCliente= new JButtonMe();
	public JButton jButtonid_sucursalPoliticaClienteUpdate= new JButtonMe();
	public JButton jButtonid_sucursalPoliticaClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_clientePoliticaCliente;
	public JLabel jLabelid_clientePoliticaCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clientePoliticaCliente;
	public JButton jButtonid_clientePoliticaCliente= new JButtonMe();
	public JButton jButtonid_clientePoliticaClienteUpdate= new JButtonMe();
	public JButton jButtonid_clientePoliticaClienteBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesPoliticaCliente;
	
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
	public int iHeightFormulario=198;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public PoliticaClienteDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposPoliticaCliente=new JPanel();
				this.jPanelAccionesFormularioPoliticaCliente=new JPanel();
				this.jmenuBarDetallePoliticaCliente=new JMenuBar();
				this.jTtoolBarDetallePoliticaCliente=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PoliticaClienteDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("PoliticaCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public PoliticaClienteDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("PoliticaCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PoliticaClienteDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PoliticaCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PoliticaClienteDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PoliticaCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PoliticaClienteDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PoliticaCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarPoliticaCliente() {
		return this.jButtonActualizarToolBarPoliticaCliente;
	}
	
	public JButton getjButtonEliminarToolBarPoliticaCliente() {
		return this.jButtonEliminarToolBarPoliticaCliente;
	}
	
	public JButton getjButtonCancelarToolBarPoliticaCliente() {
		return this.jButtonCancelarToolBarPoliticaCliente;
	}		
	
	public JButton getjButtonProcesarInformacionPoliticaCliente() {
		return this.jButtonProcesarInformacionPoliticaCliente;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPoliticaCliente)	{
		this.jButtonProcesarInformacionPoliticaCliente = jButtonProcesarInformacionPoliticaCliente;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPoliticaCliente() {
		return this.jComboBoxTiposAccionesPoliticaCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPoliticaCliente(
			JComboBox jComboBoxTiposRelacionesPoliticaCliente) {
		this.jComboBoxTiposRelacionesPoliticaCliente = jComboBoxTiposRelacionesPoliticaCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPoliticaCliente(
			JComboBox jComboBoxTiposAccionesPoliticaCliente) {
		this.jComboBoxTiposAccionesPoliticaCliente = jComboBoxTiposAccionesPoliticaCliente;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioPoliticaCliente() {
		return this.jComboBoxTiposAccionesFormularioPoliticaCliente;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioPoliticaCliente(
			JComboBox jComboBoxTiposAccionesFormularioPoliticaCliente) {
		this.jComboBoxTiposAccionesFormularioPoliticaCliente = jComboBoxTiposAccionesFormularioPoliticaCliente;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.politicaclienteSessionBean=new PoliticaClienteSessionBean();
		
		this.politicaclienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.politicaclienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.politicaclienteSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PoliticaClienteJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PoliticaClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PoliticaClienteJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Politica Cliente MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.politicaclienteSessionBean.getEsGuardarRelacionado()) {
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
	
		PoliticaClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetallePoliticaCliente= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarPoliticaCliente=new JButtonMe();
				this.jButtonModificarToolBarPoliticaCliente=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarPoliticaCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarPoliticaCliente,this.jTtoolBarDetallePoliticaCliente,
							"actualizar","actualizar","Actualizar"+" "+PoliticaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarPoliticaCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarPoliticaCliente,this.jTtoolBarDetallePoliticaCliente,
							"eliminar","eliminar","Eliminar"+" "+PoliticaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarPoliticaCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarPoliticaCliente,this.jTtoolBarDetallePoliticaCliente,
							"cancelar","cancelar","Cancelar"+" "+PoliticaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarPoliticaCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarPoliticaCliente,this.jTtoolBarDetallePoliticaCliente,
							"guardarcambios","guardarcambios","Guardar"+" "+PoliticaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarPoliticaCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarPoliticaCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarPoliticaCliente,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetallePoliticaCliente=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetallePoliticaCliente=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoPoliticaCliente=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesPoliticaCliente=new JMenuMe("Acciones");
		this.jmenuDetalleDatosPoliticaCliente=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPoliticaCliente= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPoliticaCliente.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPoliticaCliente,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPoliticaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarPoliticaCliente= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarPoliticaCliente.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarPoliticaCliente,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarPoliticaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarPoliticaCliente= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarPoliticaCliente.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarPoliticaCliente,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarPoliticaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarPoliticaCliente= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarPoliticaCliente.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarPoliticaCliente,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarPoliticaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarPoliticaCliente= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarPoliticaCliente.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarPoliticaCliente,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarPoliticaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosPoliticaCliente= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPoliticaCliente.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPoliticaCliente,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPoliticaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPoliticaCliente= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPoliticaCliente.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPoliticaCliente,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPoliticaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarPoliticaCliente= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarPoliticaCliente.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarPoliticaCliente,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarPoliticaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPoliticaCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPoliticaCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPoliticaCliente,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPoliticaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPoliticaCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPoliticaCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPoliticaCliente,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPoliticaCliente, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoPoliticaCliente.add(this.jMenuItemDetalleCerrarPoliticaCliente);
		
		this.jmenuDetalleAccionesPoliticaCliente.add(this.jMenuItemActualizarPoliticaCliente);
		this.jmenuDetalleAccionesPoliticaCliente.add(this.jMenuItemEliminarPoliticaCliente);
		this.jmenuDetalleAccionesPoliticaCliente.add(this.jMenuItemCancelarPoliticaCliente);		
		
		//this.jmenuDetalleDatosPoliticaCliente.add(this.jMenuItemDetalleAbrirOrderByPoliticaCliente);				
		this.jmenuDetalleDatosPoliticaCliente.add(this.jMenuItemDetalleMostarOcultarPoliticaCliente);				
				
		//this.jmenuDetalleAccionesPoliticaCliente.add(this.jMenuItemGuardarCambiosPoliticaCliente);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoPoliticaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesPoliticaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosPoliticaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetallePoliticaCliente.add(this.jmenuDetalleArchivoPoliticaCliente);		
		this.jmenuBarDetallePoliticaCliente.add(this.jmenuDetalleAccionesPoliticaCliente);		
		this.jmenuBarDetallePoliticaCliente.add(this.jmenuDetalleDatosPoliticaCliente);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetallePoliticaCliente);				
	}
	
	
	public void inicializarElementosCamposPoliticaCliente() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdPoliticaCliente = new JLabelMe();
		jLabelIdPoliticaCliente.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdPoliticaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPoliticaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPoliticaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdPoliticaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidPoliticaCliente = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidPoliticaCliente.setToolTipText(PoliticaClienteConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutPoliticaCliente= new GridBagLayout();

		this.jPanelidPoliticaCliente.setLayout(this.gridaBagLayoutPoliticaCliente);

		jLabelidPoliticaCliente = new JLabel();
		jLabelidPoliticaCliente.setText("Id");

		jLabelidPoliticaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPoliticaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPoliticaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



	}
	
	public void inicializarElementosCamposForeigKeysPoliticaCliente() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaPoliticaCliente = new JLabelMe();
		this.jLabelid_empresaPoliticaCliente.setText(""+PoliticaClienteConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaPoliticaCliente.setToolTipText("Empresa");
		this.jLabelid_empresaPoliticaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaPoliticaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaPoliticaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaPoliticaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaPoliticaCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaPoliticaCliente.setToolTipText(PoliticaClienteConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutPoliticaCliente = new GridBagLayout();
		this.jPanelid_empresaPoliticaCliente.setLayout(this.gridaBagLayoutPoliticaCliente);


		jComboBoxid_empresaPoliticaCliente= new JComboBoxMe();
		jComboBoxid_empresaPoliticaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaPoliticaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaPoliticaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaPoliticaCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaPoliticaCliente.setEnabled(false);

		this.jButtonid_empresaPoliticaCliente= new JButtonMe();
		this.jButtonid_empresaPoliticaCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPoliticaCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPoliticaCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPoliticaCliente.setText("Buscar");
		this.jButtonid_empresaPoliticaCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaPoliticaCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPoliticaCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaPoliticaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPoliticaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPoliticaCliente"));

		this.jButtonid_empresaPoliticaClienteBusqueda= new JButtonMe();
		this.jButtonid_empresaPoliticaClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPoliticaClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPoliticaClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaPoliticaClienteBusqueda.setText("U");
		this.jButtonid_empresaPoliticaClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaPoliticaClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPoliticaClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaPoliticaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPoliticaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPoliticaClienteBusqueda"));

		if(this.politicaclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaPoliticaClienteBusqueda.setVisible(false);		}

		this.jButtonid_empresaPoliticaClienteUpdate= new JButtonMe();
		this.jButtonid_empresaPoliticaClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPoliticaClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPoliticaClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaPoliticaClienteUpdate.setText("U");
		this.jButtonid_empresaPoliticaClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaPoliticaClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPoliticaClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaPoliticaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPoliticaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPoliticaClienteUpdate"));



					
		this.jLabelid_sucursalPoliticaCliente = new JLabelMe();
		this.jLabelid_sucursalPoliticaCliente.setText(""+PoliticaClienteConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalPoliticaCliente.setToolTipText("Sucursal");
		this.jLabelid_sucursalPoliticaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalPoliticaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalPoliticaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalPoliticaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalPoliticaCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalPoliticaCliente.setToolTipText(PoliticaClienteConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutPoliticaCliente = new GridBagLayout();
		this.jPanelid_sucursalPoliticaCliente.setLayout(this.gridaBagLayoutPoliticaCliente);


		jComboBoxid_sucursalPoliticaCliente= new JComboBoxMe();
		jComboBoxid_sucursalPoliticaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalPoliticaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalPoliticaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalPoliticaCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalPoliticaCliente.setEnabled(false);

		this.jButtonid_sucursalPoliticaCliente= new JButtonMe();
		this.jButtonid_sucursalPoliticaCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalPoliticaCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalPoliticaCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalPoliticaCliente.setText("Buscar");
		this.jButtonid_sucursalPoliticaCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalPoliticaCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalPoliticaCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalPoliticaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalPoliticaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalPoliticaCliente"));

		this.jButtonid_sucursalPoliticaClienteBusqueda= new JButtonMe();
		this.jButtonid_sucursalPoliticaClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalPoliticaClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalPoliticaClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalPoliticaClienteBusqueda.setText("U");
		this.jButtonid_sucursalPoliticaClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalPoliticaClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalPoliticaClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalPoliticaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalPoliticaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalPoliticaClienteBusqueda"));

		if(this.politicaclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalPoliticaClienteBusqueda.setVisible(false);		}

		this.jButtonid_sucursalPoliticaClienteUpdate= new JButtonMe();
		this.jButtonid_sucursalPoliticaClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalPoliticaClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalPoliticaClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalPoliticaClienteUpdate.setText("U");
		this.jButtonid_sucursalPoliticaClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalPoliticaClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalPoliticaClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalPoliticaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalPoliticaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalPoliticaClienteUpdate"));



					
		this.jLabelid_clientePoliticaCliente = new JLabelMe();
		this.jLabelid_clientePoliticaCliente.setText(""+PoliticaClienteConstantesFunciones.LABEL_IDCLIENTE+" : *");
		this.jLabelid_clientePoliticaCliente.setToolTipText("Cliente");
		this.jLabelid_clientePoliticaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clientePoliticaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clientePoliticaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_clientePoliticaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_clientePoliticaCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_clientePoliticaCliente.setToolTipText(PoliticaClienteConstantesFunciones.LABEL_IDCLIENTE);
		this.gridaBagLayoutPoliticaCliente = new GridBagLayout();
		this.jPanelid_clientePoliticaCliente.setLayout(this.gridaBagLayoutPoliticaCliente);


		jComboBoxid_clientePoliticaCliente= new JComboBoxMe();
		jComboBoxid_clientePoliticaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clientePoliticaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clientePoliticaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clientePoliticaCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_clientePoliticaCliente= new JButtonMe();
		this.jButtonid_clientePoliticaCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clientePoliticaCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clientePoliticaCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clientePoliticaCliente.setText("Buscar");
		this.jButtonid_clientePoliticaCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_clientePoliticaCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clientePoliticaCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_clientePoliticaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clientePoliticaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clientePoliticaCliente"));

		this.jButtonid_clientePoliticaClienteBusqueda= new JButtonMe();
		this.jButtonid_clientePoliticaClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clientePoliticaClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clientePoliticaClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clientePoliticaClienteBusqueda.setText("U");
		this.jButtonid_clientePoliticaClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_clientePoliticaClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clientePoliticaClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_clientePoliticaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clientePoliticaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clientePoliticaClienteBusqueda"));

		if(this.politicaclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_clientePoliticaClienteBusqueda.setVisible(false);		}

		this.jButtonid_clientePoliticaClienteUpdate= new JButtonMe();
		this.jButtonid_clientePoliticaClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clientePoliticaClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clientePoliticaClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clientePoliticaClienteUpdate.setText("U");
		this.jButtonid_clientePoliticaClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_clientePoliticaClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clientePoliticaClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_clientePoliticaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clientePoliticaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clientePoliticaClienteUpdate"));



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
		//this.jInternalFrameDetallePoliticaCliente = new PoliticaClienteBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Politica Cliente DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPoliticaCliente= new GridBagLayout();
		

		
		String sToolTipPoliticaCliente="";
		sToolTipPoliticaCliente=PoliticaClienteConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPoliticaCliente+="(Facturacion.PoliticaCliente)";
		}
		
		if(!this.politicaclienteSessionBean.getEsGuardarRelacionado()) {
			sToolTipPoliticaCliente+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoPoliticaCliente = new JButtonMe();
		this.jButtonModificarPoliticaCliente = new JButtonMe();
        this.jButtonActualizarPoliticaCliente = new JButtonMe();
        this.jButtonEliminarPoliticaCliente = new JButtonMe();
        this.jButtonCancelarPoliticaCliente = new JButtonMe();
        this.jButtonGuardarCambiosPoliticaCliente = new JButtonMe();
		this.jButtonGuardarCambiosTablaPoliticaCliente = new JButtonMe();
		this.jButtonCerrarPoliticaCliente = new JButtonMe();
		
		this.jScrollPanelDatosPoliticaCliente = new JScrollPane();   
        this.jScrollPanelDatosEdicionPoliticaCliente = new JScrollPane();
		this.jScrollPanelDatosGeneralPoliticaCliente = new JScrollPane();
				
		
		
		this.jPanelCamposPoliticaCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosPoliticaCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesPoliticaCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioPoliticaCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Politica Cliente";
		
		if(!this.politicaclienteSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPoliticaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Politica Clientes" + this.sPath));
		} else {
			this.jScrollPanelDatosPoliticaCliente.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionPoliticaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralPoliticaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposPoliticaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposPoliticaCliente.setName("jPanelCamposPoliticaCliente"); 

		this.jPanelCamposOcultosPoliticaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosPoliticaCliente.setName("jPanelCamposOcultosPoliticaCliente"); 

        this.jPanelAccionesPoliticaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPoliticaCliente.setToolTipText("Acciones");
        this.jPanelAccionesPoliticaCliente.setName("Acciones"); 

		this.jPanelAccionesFormularioPoliticaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioPoliticaCliente.setToolTipText("Acciones");
        this.jPanelAccionesFormularioPoliticaCliente.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionPoliticaCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPoliticaCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPoliticaCliente, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposPoliticaCliente, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosPoliticaCliente, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioPoliticaCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoPoliticaCliente.setText("Nuevo");
		this.jButtonModificarPoliticaCliente.setText("Editar");
        this.jButtonActualizarPoliticaCliente.setText("Actualizar");
        this.jButtonEliminarPoliticaCliente.setText("Eliminar");
        this.jButtonCancelarPoliticaCliente.setText("Cancelar");
        this.jButtonGuardarCambiosPoliticaCliente.setText("Guardar");
		this.jButtonGuardarCambiosTablaPoliticaCliente.setText("Guardar");
		this.jButtonCerrarPoliticaCliente.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPoliticaCliente,"nuevo_button","Nuevo",this.politicaclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarPoliticaCliente,"modificar_button","Editar",this.politicaclienteSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarPoliticaCliente,"actualizar_button","Actualizar",this.politicaclienteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarPoliticaCliente,"eliminar_button","Eliminar",this.politicaclienteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarPoliticaCliente,"cancelar_button","Cancelar",this.politicaclienteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosPoliticaCliente,"guardarcambios_button","Guardar",this.politicaclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPoliticaCliente,"guardarcambiostabla_button","Guardar",this.politicaclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPoliticaCliente,"cerrar_button","Salir",this.politicaclienteSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPoliticaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarPoliticaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosPoliticaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPoliticaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPoliticaCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarPoliticaCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarPoliticaCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarPoliticaCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoPoliticaCliente.setToolTipText("Nuevo"+" "+PoliticaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarPoliticaCliente.setToolTipText("Editar"+" "+PoliticaClienteConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarPoliticaCliente.setToolTipText("Actualizar"+" "+PoliticaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarPoliticaCliente.setToolTipText("Eliminar)"+" "+PoliticaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarPoliticaCliente.setToolTipText("Cancelar"+" "+PoliticaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosPoliticaCliente.setToolTipText("Guardar"+" "+PoliticaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaPoliticaCliente.setToolTipText("Guardar"+" "+PoliticaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPoliticaCliente.setToolTipText("Salir"+" "+PoliticaClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPoliticaCliente";
		inputMap = this.jButtonNuevoPoliticaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPoliticaCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPoliticaCliente"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarPoliticaCliente";
		inputMap = this.jButtonActualizarPoliticaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarPoliticaCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarPoliticaCliente"));
		
		//ELIMINAR
		sMapKey = "EliminarPoliticaCliente";
		inputMap = this.jButtonEliminarPoliticaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarPoliticaCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarPoliticaCliente"));
		
		//CANCELAR	
		sMapKey = "CancelarPoliticaCliente";
		inputMap = this.jButtonCancelarPoliticaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarPoliticaCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarPoliticaCliente"));
		
		//CERRAR		
		sMapKey = "CerrarPoliticaCliente";
		inputMap = this.jButtonCerrarPoliticaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPoliticaCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPoliticaCliente"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPoliticaCliente";
		inputMap = this.jButtonGuardarCambiosTablaPoliticaCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPoliticaCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPoliticaCliente"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoPoliticaCliente = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoPoliticaCliente.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoPoliticaCliente.setToolTipText("Nuevo PoliticaCliente");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoPoliticaCliente, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarPoliticaCliente = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarPoliticaCliente.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarPoliticaCliente.setToolTipText("Sin Cerrar Ventana PoliticaCliente");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarPoliticaCliente, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajePoliticaCliente = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajePoliticaCliente.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajePoliticaCliente.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajePoliticaCliente, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesPoliticaCliente = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPoliticaCliente.setText("Accion");
		this.jComboBoxTiposAccionesPoliticaCliente.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioPoliticaCliente = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioPoliticaCliente.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioPoliticaCliente.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesPoliticaCliente = new JLabelMe();
		
		this.jLabelAccionesPoliticaCliente.setText("Acciones");		
		this.jLabelAccionesPoliticaCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPoliticaCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPoliticaCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposPoliticaCliente();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysPoliticaCliente();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesPoliticaCliente=new JTabbedPane();
		this.jTabbedPaneRelacionesPoliticaCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesPoliticaCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesPoliticaCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPoliticaCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPoliticaCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPoliticaCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioPoliticaCliente.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPoliticaCliente.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPoliticaCliente.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioPoliticaCliente, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposPoliticaCliente = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosPoliticaCliente = new GridBagLayout();
		
		this.jPanelCamposPoliticaCliente.setLayout(gridaBagLayoutCamposPoliticaCliente);
		this.jPanelCamposOcultosPoliticaCliente.setLayout(gridaBagLayoutCamposOcultosPoliticaCliente);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsPoliticaCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticaCliente.gridy = 0;
	this.gridBagConstraintsPoliticaCliente.gridx = 0;
	this.gridBagConstraintsPoliticaCliente.ipadx = 0;
	this.gridBagConstraintsPoliticaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidPoliticaCliente.add(jLabelIdPoliticaCliente, this.gridBagConstraintsPoliticaCliente);



	this.gridBagConstraintsPoliticaCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticaCliente.gridy = 0;
	this.gridBagConstraintsPoliticaCliente.gridx = 1;
	this.gridBagConstraintsPoliticaCliente.ipadx = 0;
	this.gridBagConstraintsPoliticaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidPoliticaCliente.add(jLabelidPoliticaCliente, this.gridBagConstraintsPoliticaCliente);


	this.gridBagConstraintsPoliticaCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticaCliente.gridy = 0;
	this.gridBagConstraintsPoliticaCliente.gridx = 0;
	this.gridBagConstraintsPoliticaCliente.ipadx = 0;
	this.gridBagConstraintsPoliticaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaPoliticaCliente.add(jLabelid_empresaPoliticaCliente, this.gridBagConstraintsPoliticaCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPoliticaCliente = new GridBagConstraints();
		//this.gridBagConstraintsPoliticaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticaCliente.gridy = 0;
		this.gridBagConstraintsPoliticaCliente.gridx = 2;
		this.gridBagConstraintsPoliticaCliente.ipadx = 0;
		this.gridBagConstraintsPoliticaCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaPoliticaCliente.add(jButtonid_empresaPoliticaClienteBusqueda, this.gridBagConstraintsPoliticaCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPoliticaCliente = new GridBagConstraints();
		//this.gridBagConstraintsPoliticaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticaCliente.gridy = 0;
		this.gridBagConstraintsPoliticaCliente.gridx = 3;
		this.gridBagConstraintsPoliticaCliente.ipadx = 0;
		this.gridBagConstraintsPoliticaCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaPoliticaCliente.add(jButtonid_empresaPoliticaClienteUpdate, this.gridBagConstraintsPoliticaCliente);
	}

	this.gridBagConstraintsPoliticaCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticaCliente.gridy = 0;
	this.gridBagConstraintsPoliticaCliente.gridx = 1;
	this.gridBagConstraintsPoliticaCliente.ipadx = 0;
	this.gridBagConstraintsPoliticaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaPoliticaCliente.add(jComboBoxid_empresaPoliticaCliente, this.gridBagConstraintsPoliticaCliente);


	this.gridBagConstraintsPoliticaCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticaCliente.gridy = 0;
	this.gridBagConstraintsPoliticaCliente.gridx = 0;
	this.gridBagConstraintsPoliticaCliente.ipadx = 0;
	this.gridBagConstraintsPoliticaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalPoliticaCliente.add(jLabelid_sucursalPoliticaCliente, this.gridBagConstraintsPoliticaCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPoliticaCliente = new GridBagConstraints();
		//this.gridBagConstraintsPoliticaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticaCliente.gridy = 0;
		this.gridBagConstraintsPoliticaCliente.gridx = 2;
		this.gridBagConstraintsPoliticaCliente.ipadx = 0;
		this.gridBagConstraintsPoliticaCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalPoliticaCliente.add(jButtonid_sucursalPoliticaClienteBusqueda, this.gridBagConstraintsPoliticaCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPoliticaCliente = new GridBagConstraints();
		//this.gridBagConstraintsPoliticaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticaCliente.gridy = 0;
		this.gridBagConstraintsPoliticaCliente.gridx = 3;
		this.gridBagConstraintsPoliticaCliente.ipadx = 0;
		this.gridBagConstraintsPoliticaCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalPoliticaCliente.add(jButtonid_sucursalPoliticaClienteUpdate, this.gridBagConstraintsPoliticaCliente);
	}

	this.gridBagConstraintsPoliticaCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticaCliente.gridy = 0;
	this.gridBagConstraintsPoliticaCliente.gridx = 1;
	this.gridBagConstraintsPoliticaCliente.ipadx = 0;
	this.gridBagConstraintsPoliticaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalPoliticaCliente.add(jComboBoxid_sucursalPoliticaCliente, this.gridBagConstraintsPoliticaCliente);


	this.gridBagConstraintsPoliticaCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticaCliente.gridy = 0;
	this.gridBagConstraintsPoliticaCliente.gridx = 0;
	this.gridBagConstraintsPoliticaCliente.ipadx = 0;
	this.gridBagConstraintsPoliticaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_clientePoliticaCliente.add(jLabelid_clientePoliticaCliente, this.gridBagConstraintsPoliticaCliente);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsPoliticaCliente = new GridBagConstraints();
	//this.gridBagConstraintsPoliticaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticaCliente.gridy = 0;
	this.gridBagConstraintsPoliticaCliente.gridx = 2;
	this.gridBagConstraintsPoliticaCliente.ipadx = 0;
	this.gridBagConstraintsPoliticaCliente.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_clientePoliticaCliente.add(jButtonid_clientePoliticaCliente, this.gridBagConstraintsPoliticaCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPoliticaCliente = new GridBagConstraints();
		//this.gridBagConstraintsPoliticaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticaCliente.gridy = 0;
		this.gridBagConstraintsPoliticaCliente.gridx = 3;
		this.gridBagConstraintsPoliticaCliente.ipadx = 0;
		this.gridBagConstraintsPoliticaCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clientePoliticaCliente.add(jButtonid_clientePoliticaClienteBusqueda, this.gridBagConstraintsPoliticaCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPoliticaCliente = new GridBagConstraints();
		//this.gridBagConstraintsPoliticaCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPoliticaCliente.gridy = 0;
		this.gridBagConstraintsPoliticaCliente.gridx = 4;
		this.gridBagConstraintsPoliticaCliente.ipadx = 0;
		this.gridBagConstraintsPoliticaCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clientePoliticaCliente.add(jButtonid_clientePoliticaClienteUpdate, this.gridBagConstraintsPoliticaCliente);
	}

	this.gridBagConstraintsPoliticaCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticaCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPoliticaCliente.gridy = 0;
	this.gridBagConstraintsPoliticaCliente.gridx = 1;
	this.gridBagConstraintsPoliticaCliente.ipadx = 0;
	this.gridBagConstraintsPoliticaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_clientePoliticaCliente.add(jComboBoxid_clientePoliticaCliente, this.gridBagConstraintsPoliticaCliente);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsPoliticaCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticaCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPoliticaCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPoliticaCliente.gridy = iYPanelCamposPoliticaCliente;
	this.gridBagConstraintsPoliticaCliente.gridx = iXPanelCamposPoliticaCliente++;
	this.gridBagConstraintsPoliticaCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPoliticaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPoliticaCliente.add(this.jPanelidPoliticaCliente, this.gridBagConstraintsPoliticaCliente);



	if(iXPanelCamposPoliticaCliente % 1==0) {
		iXPanelCamposPoliticaCliente=0;
		iYPanelCamposPoliticaCliente++;
	}
	this.gridBagConstraintsPoliticaCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticaCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPoliticaCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPoliticaCliente.gridy = iYPanelCamposPoliticaCliente;
	this.gridBagConstraintsPoliticaCliente.gridx = iXPanelCamposPoliticaCliente++;
	this.gridBagConstraintsPoliticaCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPoliticaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPoliticaCliente.add(this.jPanelid_clientePoliticaCliente, this.gridBagConstraintsPoliticaCliente);



	if(iXPanelCamposPoliticaCliente % 1==0) {
		iXPanelCamposPoliticaCliente=0;
		iYPanelCamposPoliticaCliente++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsPoliticaCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticaCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPoliticaCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPoliticaCliente.gridy = iYPanelCamposOcultosPoliticaCliente;
	this.gridBagConstraintsPoliticaCliente.gridx = iXPanelCamposOcultosPoliticaCliente++;
	this.gridBagConstraintsPoliticaCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPoliticaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPoliticaCliente.add(this.jPanelid_empresaPoliticaCliente, this.gridBagConstraintsPoliticaCliente);



	if(iXPanelCamposOcultosPoliticaCliente % 1==0) {
		iXPanelCamposOcultosPoliticaCliente=0;
		iYPanelCamposOcultosPoliticaCliente++;
	}
	this.gridBagConstraintsPoliticaCliente = new GridBagConstraints();
	this.gridBagConstraintsPoliticaCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPoliticaCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPoliticaCliente.gridy = iYPanelCamposOcultosPoliticaCliente;
	this.gridBagConstraintsPoliticaCliente.gridx = iXPanelCamposOcultosPoliticaCliente++;
	this.gridBagConstraintsPoliticaCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPoliticaCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPoliticaCliente.add(this.jPanelid_sucursalPoliticaCliente, this.gridBagConstraintsPoliticaCliente);



	if(iXPanelCamposOcultosPoliticaCliente % 1==0) {
		iXPanelCamposOcultosPoliticaCliente=0;
		iYPanelCamposOcultosPoliticaCliente++;
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
			
		GridBagLayout gridaBagLayoutAccionesPoliticaCliente= new GridBagLayout();
		this.jPanelAccionesPoliticaCliente.setLayout(gridaBagLayoutAccionesPoliticaCliente);
		
		GridBagLayout gridaBagLayoutAccionesFormularioPoliticaCliente= new GridBagLayout();
		this.jPanelAccionesFormularioPoliticaCliente.setLayout(gridaBagLayoutAccionesFormularioPoliticaCliente);
		
		this.gridBagConstraintsPoliticaCliente = new GridBagConstraints();
		this.gridBagConstraintsPoliticaCliente.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPoliticaCliente.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPoliticaCliente.add(this.jComboBoxTiposAccionesFormularioPoliticaCliente, this.gridBagConstraintsPoliticaCliente);

		this.gridBagConstraintsPoliticaCliente = new GridBagConstraints();
		this.gridBagConstraintsPoliticaCliente.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPoliticaCliente.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPoliticaCliente.add(this.jCheckBoxPostAccionNuevoPoliticaCliente, this.gridBagConstraintsPoliticaCliente);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.politicaclienteSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsPoliticaCliente = new GridBagConstraints();
			this.gridBagConstraintsPoliticaCliente.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsPoliticaCliente.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioPoliticaCliente.add(this.jCheckBoxPostAccionSinCerrarPoliticaCliente, this.gridBagConstraintsPoliticaCliente);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.politicaclienteSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.politicaclienteSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsPoliticaCliente = new GridBagConstraints();
			this.gridBagConstraintsPoliticaCliente.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsPoliticaCliente.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioPoliticaCliente.add(this.jCheckBoxPostAccionSinMensajePoliticaCliente, this.gridBagConstraintsPoliticaCliente);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsPoliticaCliente = new GridBagConstraints();
		this.gridBagConstraintsPoliticaCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPoliticaCliente.gridy = 0;
		this.gridBagConstraintsPoliticaCliente.gridx = iPosXAccion++;
			
		this.jPanelAccionesPoliticaCliente.add(this.jButtonModificarPoliticaCliente, this.gridBagConstraintsPoliticaCliente);							

		this.gridBagConstraintsPoliticaCliente = new GridBagConstraints();
		this.gridBagConstraintsPoliticaCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPoliticaCliente.gridy = 0;
		this.gridBagConstraintsPoliticaCliente.gridx =iPosXAccion++;
			
		this.jPanelAccionesPoliticaCliente.add(this.jButtonEliminarPoliticaCliente, this.gridBagConstraintsPoliticaCliente);
		
			
		this.gridBagConstraintsPoliticaCliente = new GridBagConstraints();
		this.gridBagConstraintsPoliticaCliente.gridy = 0;		
		this.gridBagConstraintsPoliticaCliente.gridx = iPosXAccion++;
		
		this.jPanelAccionesPoliticaCliente.add(this.jButtonActualizarPoliticaCliente, this.gridBagConstraintsPoliticaCliente);


		this.gridBagConstraintsPoliticaCliente = new GridBagConstraints();
		this.gridBagConstraintsPoliticaCliente.gridy = 0;		
		this.gridBagConstraintsPoliticaCliente.gridx = iPosXAccion++;
		
		this.jPanelAccionesPoliticaCliente.add(this.jButtonGuardarCambiosPoliticaCliente, this.gridBagConstraintsPoliticaCliente);	
		
		this.gridBagConstraintsPoliticaCliente = new GridBagConstraints();
		this.gridBagConstraintsPoliticaCliente.gridy = 0;		
		this.gridBagConstraintsPoliticaCliente.gridx =iPosXAccion++;
		
		this.jPanelAccionesPoliticaCliente.add(this.jButtonCancelarPoliticaCliente, this.gridBagConstraintsPoliticaCliente);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPoliticaCliente = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPoliticaCliente);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.politicaclienteSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPoliticaCliente = new GridBagConstraints();						
			this.gridBagConstraintsPoliticaCliente.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPoliticaCliente.gridx = 0;		
			//this.gridBagConstraintsPoliticaCliente.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPoliticaCliente.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPoliticaCliente.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsPoliticaCliente = new GridBagConstraints();
		this.gridBagConstraintsPoliticaCliente.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPoliticaCliente.gridx =0;
		this.gridBagConstraintsPoliticaCliente.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPoliticaCliente.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPoliticaCliente, this.gridBagConstraintsPoliticaCliente);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(PoliticaClienteJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetallePoliticaCliente = new PoliticaClienteBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Politica Cliente DATOS");
			
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
			
	        //this.setTitle("[FOR] - Politica Cliente DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Politica Cliente Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			PoliticaClienteModel politicaclienteModel=new PoliticaClienteModel(this);
			
			//SI USARA CLASE INTERNA
			//PoliticaClienteModel.PoliticaClienteFocusTraversalPolicy politicaclienteFocusTraversalPolicy = politicaclienteModel.new PoliticaClienteFocusTraversalPolicy(this);
			
			//politicaclienteFocusTraversalPolicy.setpoliticaclienteJInternalFrame(this);
			
			this.setFocusTraversalPolicy(politicaclienteModel);
			
			
			this.jContentPaneDetallePoliticaCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetallePoliticaCliente = new GridBagLayout();	
			this.jContentPaneDetallePoliticaCliente.setLayout(gridaBagLayoutDetallePoliticaCliente);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPoliticaCliente = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsPoliticaCliente = new GridBagConstraints();
				this.gridBagConstraintsPoliticaCliente.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsPoliticaCliente.gridx = 0;
					
				
				this.jContentPaneDetallePoliticaCliente.add(jTtoolBarDetallePoliticaCliente, gridBagConstraintsPoliticaCliente);								
				
}
			
			this.jScrollPanelDatosEdicionPoliticaCliente=   new JScrollPane(jContentPaneDetallePoliticaCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPoliticaCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPoliticaCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPoliticaCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralPoliticaCliente=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPoliticaCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPoliticaCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPoliticaCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPoliticaCliente = new GridBagConstraints();
			
			
	        this.gridBagConstraintsPoliticaCliente.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsPoliticaCliente.gridx = 0;
	        
			this.jContentPaneDetallePoliticaCliente.add(jPanelCamposPoliticaCliente, gridBagConstraintsPoliticaCliente);
			
			
			
			
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
						&& politicaclienteSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.politicaclienteSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsPoliticaCliente= new GridBagConstraints();
						this.gridBagConstraintsPoliticaCliente.gridy = iGridyRelaciones++;
						this.gridBagConstraintsPoliticaCliente.gridx = 0;
						this.jContentPaneDetallePoliticaCliente.add(this.jTabbedPaneRelacionesPoliticaCliente, this.gridBagConstraintsPoliticaCliente);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesPoliticaCliente.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosPoliticaCliente.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsPoliticaCliente = new GridBagConstraints();
					this.gridBagConstraintsPoliticaCliente.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsPoliticaCliente.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsPoliticaCliente.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsPoliticaCliente.gridx = 0;
					
				
					this.jContentPaneDetallePoliticaCliente.add(jPanelCamposOcultosPoliticaCliente, gridBagConstraintsPoliticaCliente);
				
					this.jPanelCamposOcultosPoliticaCliente.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsPoliticaCliente = new GridBagConstraints();
			this.gridBagConstraintsPoliticaCliente.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsPoliticaCliente.gridx = 0;
	        this.gridBagConstraintsPoliticaCliente.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetallePoliticaCliente.add(this.jPanelAccionesFormularioPoliticaCliente, this.gridBagConstraintsPoliticaCliente);							
			
			
			
			this.gridBagConstraintsPoliticaCliente = new GridBagConstraints();
	        this.gridBagConstraintsPoliticaCliente.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsPoliticaCliente.gridx = 0;
	        
			
			this.jContentPaneDetallePoliticaCliente.add(this.jPanelAccionesPoliticaCliente, this.gridBagConstraintsPoliticaCliente);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionPoliticaCliente);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionPoliticaCliente=   new JScrollPane(this.jPanelCamposPoliticaCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPoliticaCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPoliticaCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPoliticaCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsPoliticaCliente = new GridBagConstraints();
			this.gridBagConstraintsPoliticaCliente.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsPoliticaCliente.gridx = 0;
			this.gridBagConstraintsPoliticaCliente.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsPoliticaCliente.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsPoliticaCliente.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionPoliticaCliente, this.gridBagConstraintsPoliticaCliente);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsPoliticaCliente = new GridBagConstraints();
			this.gridBagConstraintsPoliticaCliente.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPoliticaCliente.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioPoliticaCliente, this.gridBagConstraintsPoliticaCliente);			
			
			this.gridBagConstraintsPoliticaCliente = new GridBagConstraints();
			this.gridBagConstraintsPoliticaCliente.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPoliticaCliente.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesPoliticaCliente, this.gridBagConstraintsPoliticaCliente);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsPoliticaCliente = new GridBagConstraints();
		this.gridBagConstraintsPoliticaCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPoliticaCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPoliticaCliente, this.gridBagConstraintsPoliticaCliente);
			
			
		this.gridBagConstraintsPoliticaCliente = new GridBagConstraints();
		this.gridBagConstraintsPoliticaCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPoliticaCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPoliticaCliente, this.gridBagConstraintsPoliticaCliente);
		
			
		this.gridBagConstraintsPoliticaCliente = new GridBagConstraints();
		this.gridBagConstraintsPoliticaCliente.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPoliticaCliente.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPoliticaCliente, this.gridBagConstraintsPoliticaCliente);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralPoliticaCliente;//jContentPane;
		
		return jScrollPanelDatosEdicionPoliticaCliente;
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
