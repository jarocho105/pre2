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
import com.bydan.erp.cartera.util.VehiculoClienteConstantesFunciones;

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
public class VehiculoClienteDetalleFormJInternalFrame extends VehiculoClienteBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleVehiculoCliente;
	
	protected JMenuBar jmenuBarDetalleVehiculoCliente;
	
	protected JMenu jmenuDetalleVehiculoCliente;
	protected JMenu jmenuDetalleArchivoVehiculoCliente;
	protected JMenu jmenuDetalleAccionesVehiculoCliente;
	protected JMenu jmenuDetalleDatosVehiculoCliente;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleVehiculoCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutVehiculoCliente;	
	protected GridBagConstraints gridBagConstraintsVehiculoCliente;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected VehiculoClienteBeanSwingJInternalFrameAdditional jInternalFrameDetalleVehiculoCliente;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";
	
	public VehiculoClienteSessionBean vehiculoclienteSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public ClienteSessionBean clienteSessionBean;	
	
	public VehiculoClienteLogic vehiculoclienteLogic;
	
	public JScrollPane jScrollPanelDatosVehiculoCliente;
	public JScrollPane jScrollPanelDatosEdicionVehiculoCliente;
	public JScrollPane jScrollPanelDatosGeneralVehiculoCliente;
	
	protected JPanel jPanelCamposVehiculoCliente;    
	protected JPanel jPanelCamposOcultosVehiculoCliente;    	
	protected JPanel jPanelAccionesVehiculoCliente;
	protected JPanel jPanelAccionesFormularioVehiculoCliente;
    
	
	
	protected Integer iXPanelCamposVehiculoCliente=0;
	protected Integer iYPanelCamposVehiculoCliente=0;
	
	protected Integer iXPanelCamposOcultosVehiculoCliente=0;
	protected Integer iYPanelCamposOcultosVehiculoCliente=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoVehiculoCliente;
	public JButton jButtonModificarVehiculoCliente;
	public JButton jButtonActualizarVehiculoCliente;
    public JButton jButtonEliminarVehiculoCliente;
	public JButton jButtonCancelarVehiculoCliente;
    public JButton jButtonGuardarCambiosVehiculoCliente;
	public JButton jButtonGuardarCambiosTablaVehiculoCliente;
	protected JButton jButtonCerrarVehiculoCliente;
	
	
	protected JButton jButtonProcesarInformacionVehiculoCliente;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoVehiculoCliente;
	protected JCheckBox jCheckBoxPostAccionSinCerrarVehiculoCliente;
	protected JCheckBox jCheckBoxPostAccionSinMensajeVehiculoCliente;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarVehiculoCliente;
	protected JButton jButtonModificarToolBarVehiculoCliente;
	protected JButton jButtonActualizarToolBarVehiculoCliente;
    protected JButton jButtonEliminarToolBarVehiculoCliente;
	protected JButton jButtonCancelarToolBarVehiculoCliente;
    protected JButton jButtonGuardarCambiosToolBarVehiculoCliente;
	protected JButton jButtonGuardarCambiosTablaToolBarVehiculoCliente;
	protected JButton jButtonMostrarOcultarTablaToolBarVehiculoCliente;
	protected JButton jButtonCerrarToolBarVehiculoCliente;
	
	protected JButton jButtonProcesarInformacionToolBarVehiculoCliente;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoVehiculoCliente;
	protected JMenuItem jMenuItemModificarVehiculoCliente;
	protected JMenuItem jMenuItemActualizarVehiculoCliente;
    protected JMenuItem jMenuItemEliminarVehiculoCliente;
	protected JMenuItem jMenuItemCancelarVehiculoCliente;
    protected JMenuItem jMenuItemGuardarCambiosVehiculoCliente;
	protected JMenuItem jMenuItemGuardarCambiosTablaVehiculoCliente;
	protected JMenuItem jMenuItemCerrarVehiculoCliente;
	protected JMenuItem jMenuItemDetalleCerrarVehiculoCliente;
	protected JMenuItem jMenuItemDetalleMostarOcultarVehiculoCliente;
	
	protected JMenuItem jMenuItemProcesarInformacionVehiculoCliente;
	protected JMenuItem jMenuItemNuevoGuardarCambiosVehiculoCliente;
	protected JMenuItem jMenuItemMostrarOcultarVehiculoCliente;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesVehiculoCliente;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesVehiculoCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesVehiculoCliente;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioVehiculoCliente;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidVehiculoCliente;
	public JLabel jLabelIdVehiculoCliente;
	public JLabel jLabelidVehiculoCliente;
	public JButton jButtonidVehiculoClienteBusqueda= new JButtonMe();

	public JPanel jPanelcodigoVehiculoCliente;
	public JLabel jLabelcodigoVehiculoCliente;
	public JTextField jTextFieldcodigoVehiculoCliente;
	public JButton jButtoncodigoVehiculoClienteBusqueda= new JButtonMe();

	public JPanel jPanelmarcaVehiculoCliente;
	public JLabel jLabelmarcaVehiculoCliente;
	public JTextArea jTextAreamarcaVehiculoCliente;
	public JScrollPane jscrollPanemarcaVehiculoCliente;
	public JButton jButtonmarcaVehiculoClienteBusqueda= new JButtonMe();

	public JPanel jPanelmodeloVehiculoCliente;
	public JLabel jLabelmodeloVehiculoCliente;
	public JTextArea jTextAreamodeloVehiculoCliente;
	public JScrollPane jscrollPanemodeloVehiculoCliente;
	public JButton jButtonmodeloVehiculoClienteBusqueda= new JButtonMe();

	public JPanel jPanelplacaVehiculoCliente;
	public JLabel jLabelplacaVehiculoCliente;
	public JTextField jTextFieldplacaVehiculoCliente;
	public JButton jButtonplacaVehiculoClienteBusqueda= new JButtonMe();

	public JPanel jPanelanioVehiculoCliente;
	public JLabel jLabelanioVehiculoCliente;
	public JTextField jTextFieldanioVehiculoCliente;
	public JButton jButtonanioVehiculoClienteBusqueda= new JButtonMe();

	public JPanel jPaneles_prendadoVehiculoCliente;
	public JLabel jLabeles_prendadoVehiculoCliente;
	public JCheckBox jCheckBoxes_prendadoVehiculoCliente;
	public JButton jButtones_prendadoVehiculoClienteBusqueda= new JButtonMe();

	public JPanel jPanelvalor_avaluoVehiculoCliente;
	public JLabel jLabelvalor_avaluoVehiculoCliente;
	public JTextField jTextFieldvalor_avaluoVehiculoCliente;
	public JButton jButtonvalor_avaluoVehiculoClienteBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaVehiculoCliente;
	public JLabel jLabelid_empresaVehiculoCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaVehiculoCliente;
	public JButton jButtonid_empresaVehiculoCliente= new JButtonMe();
	public JButton jButtonid_empresaVehiculoClienteUpdate= new JButtonMe();
	public JButton jButtonid_empresaVehiculoClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_clienteVehiculoCliente;
	public JLabel jLabelid_clienteVehiculoCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteVehiculoCliente;
	public JButton jButtonid_clienteVehiculoCliente= new JButtonMe();
	public JButton jButtonid_clienteVehiculoClienteUpdate= new JButtonMe();
	public JButton jButtonid_clienteVehiculoClienteBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesVehiculoCliente;
	
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
	public int iHeightFormulario=858;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public VehiculoClienteDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposVehiculoCliente=new JPanel();
				this.jPanelAccionesFormularioVehiculoCliente=new JPanel();
				this.jmenuBarDetalleVehiculoCliente=new JMenuBar();
				this.jTtoolBarDetalleVehiculoCliente=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VehiculoClienteDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("VehiculoCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public VehiculoClienteDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("VehiculoCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VehiculoClienteDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("VehiculoCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VehiculoClienteDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("VehiculoCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VehiculoClienteDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("VehiculoCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarVehiculoCliente() {
		return this.jButtonActualizarToolBarVehiculoCliente;
	}
	
	public JButton getjButtonEliminarToolBarVehiculoCliente() {
		return this.jButtonEliminarToolBarVehiculoCliente;
	}
	
	public JButton getjButtonCancelarToolBarVehiculoCliente() {
		return this.jButtonCancelarToolBarVehiculoCliente;
	}		
	
	public JButton getjButtonProcesarInformacionVehiculoCliente() {
		return this.jButtonProcesarInformacionVehiculoCliente;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionVehiculoCliente)	{
		this.jButtonProcesarInformacionVehiculoCliente = jButtonProcesarInformacionVehiculoCliente;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesVehiculoCliente() {
		return this.jComboBoxTiposAccionesVehiculoCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesVehiculoCliente(
			JComboBox jComboBoxTiposRelacionesVehiculoCliente) {
		this.jComboBoxTiposRelacionesVehiculoCliente = jComboBoxTiposRelacionesVehiculoCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesVehiculoCliente(
			JComboBox jComboBoxTiposAccionesVehiculoCliente) {
		this.jComboBoxTiposAccionesVehiculoCliente = jComboBoxTiposAccionesVehiculoCliente;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioVehiculoCliente() {
		return this.jComboBoxTiposAccionesFormularioVehiculoCliente;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioVehiculoCliente(
			JComboBox jComboBoxTiposAccionesFormularioVehiculoCliente) {
		this.jComboBoxTiposAccionesFormularioVehiculoCliente = jComboBoxTiposAccionesFormularioVehiculoCliente;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.vehiculoclienteSessionBean=new VehiculoClienteSessionBean();
		
		this.vehiculoclienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.vehiculoclienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.vehiculoclienteSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		VehiculoClienteJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		VehiculoClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		VehiculoClienteJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Vehiculo Cliente MANTENIMIENTO"));
		
		
		if(iWidth > 1050) {
			iWidth=1050;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.vehiculoclienteSessionBean.getEsGuardarRelacionado()) {
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
	
		VehiculoClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleVehiculoCliente= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarVehiculoCliente=new JButtonMe();
				this.jButtonModificarToolBarVehiculoCliente=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarVehiculoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarVehiculoCliente,this.jTtoolBarDetalleVehiculoCliente,
							"actualizar","actualizar","Actualizar"+" "+VehiculoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarVehiculoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarVehiculoCliente,this.jTtoolBarDetalleVehiculoCliente,
							"eliminar","eliminar","Eliminar"+" "+VehiculoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarVehiculoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarVehiculoCliente,this.jTtoolBarDetalleVehiculoCliente,
							"cancelar","cancelar","Cancelar"+" "+VehiculoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarVehiculoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarVehiculoCliente,this.jTtoolBarDetalleVehiculoCliente,
							"guardarcambios","guardarcambios","Guardar"+" "+VehiculoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarVehiculoCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarVehiculoCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarVehiculoCliente,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleVehiculoCliente=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleVehiculoCliente=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoVehiculoCliente=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesVehiculoCliente=new JMenuMe("Acciones");
		this.jmenuDetalleDatosVehiculoCliente=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoVehiculoCliente= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoVehiculoCliente.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoVehiculoCliente,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoVehiculoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarVehiculoCliente= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarVehiculoCliente.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarVehiculoCliente,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarVehiculoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarVehiculoCliente= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarVehiculoCliente.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarVehiculoCliente,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarVehiculoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarVehiculoCliente= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarVehiculoCliente.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarVehiculoCliente,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarVehiculoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarVehiculoCliente= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarVehiculoCliente.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarVehiculoCliente,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarVehiculoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosVehiculoCliente= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosVehiculoCliente.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosVehiculoCliente,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosVehiculoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarVehiculoCliente= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarVehiculoCliente.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarVehiculoCliente,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarVehiculoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarVehiculoCliente= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarVehiculoCliente.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarVehiculoCliente,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarVehiculoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarVehiculoCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarVehiculoCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarVehiculoCliente,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarVehiculoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarVehiculoCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarVehiculoCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarVehiculoCliente,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarVehiculoCliente, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoVehiculoCliente.add(this.jMenuItemDetalleCerrarVehiculoCliente);
		
		this.jmenuDetalleAccionesVehiculoCliente.add(this.jMenuItemActualizarVehiculoCliente);
		this.jmenuDetalleAccionesVehiculoCliente.add(this.jMenuItemEliminarVehiculoCliente);
		this.jmenuDetalleAccionesVehiculoCliente.add(this.jMenuItemCancelarVehiculoCliente);		
		
		//this.jmenuDetalleDatosVehiculoCliente.add(this.jMenuItemDetalleAbrirOrderByVehiculoCliente);				
		this.jmenuDetalleDatosVehiculoCliente.add(this.jMenuItemDetalleMostarOcultarVehiculoCliente);				
				
		//this.jmenuDetalleAccionesVehiculoCliente.add(this.jMenuItemGuardarCambiosVehiculoCliente);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoVehiculoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesVehiculoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosVehiculoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleVehiculoCliente.add(this.jmenuDetalleArchivoVehiculoCliente);		
		this.jmenuBarDetalleVehiculoCliente.add(this.jmenuDetalleAccionesVehiculoCliente);		
		this.jmenuBarDetalleVehiculoCliente.add(this.jmenuDetalleDatosVehiculoCliente);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleVehiculoCliente);				
	}
	
	
	public void inicializarElementosCamposVehiculoCliente() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdVehiculoCliente = new JLabelMe();
		jLabelIdVehiculoCliente.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdVehiculoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdVehiculoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdVehiculoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdVehiculoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidVehiculoCliente = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidVehiculoCliente.setToolTipText(VehiculoClienteConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutVehiculoCliente= new GridBagLayout();

		this.jPanelidVehiculoCliente.setLayout(this.gridaBagLayoutVehiculoCliente);

		jLabelidVehiculoCliente = new JLabel();
		jLabelidVehiculoCliente.setText("Id");

		jLabelidVehiculoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidVehiculoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidVehiculoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoVehiculoCliente = new JLabelMe();
		this.jLabelcodigoVehiculoCliente.setText(""+VehiculoClienteConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoVehiculoCliente.setToolTipText("Codigo");
		this.jLabelcodigoVehiculoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoVehiculoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoVehiculoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoVehiculoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoVehiculoCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoVehiculoCliente.setToolTipText(VehiculoClienteConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutVehiculoCliente = new GridBagLayout();
		this.jPanelcodigoVehiculoCliente.setLayout(this.gridaBagLayoutVehiculoCliente);


		jTextFieldcodigoVehiculoCliente= new JTextFieldMe();

		jTextFieldcodigoVehiculoCliente.setEnabled(false);
		jTextFieldcodigoVehiculoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoVehiculoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoVehiculoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoVehiculoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoVehiculoClienteBusqueda= new JButtonMe();
		this.jButtoncodigoVehiculoClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoVehiculoClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoVehiculoClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoVehiculoClienteBusqueda.setText("U");
		this.jButtoncodigoVehiculoClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoVehiculoClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoVehiculoClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoVehiculoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoVehiculoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoVehiculoClienteBusqueda"));

		if(this.vehiculoclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoVehiculoClienteBusqueda.setVisible(false);		}


					
		this.jLabelmarcaVehiculoCliente = new JLabelMe();
		this.jLabelmarcaVehiculoCliente.setText(""+VehiculoClienteConstantesFunciones.LABEL_MARCA+" : *");
		this.jLabelmarcaVehiculoCliente.setToolTipText("Marca");
		this.jLabelmarcaVehiculoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmarcaVehiculoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmarcaVehiculoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelmarcaVehiculoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelmarcaVehiculoCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelmarcaVehiculoCliente.setToolTipText(VehiculoClienteConstantesFunciones.LABEL_MARCA);
		this.gridaBagLayoutVehiculoCliente = new GridBagLayout();
		this.jPanelmarcaVehiculoCliente.setLayout(this.gridaBagLayoutVehiculoCliente);


		jTextAreamarcaVehiculoCliente= new JTextAreaMe();
		jTextAreamarcaVehiculoCliente.setEnabled(false);
		jTextAreamarcaVehiculoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreamarcaVehiculoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreamarcaVehiculoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreamarcaVehiculoCliente.setLineWrap(true);
		jTextAreamarcaVehiculoCliente.setWrapStyleWord(true);
		jTextAreamarcaVehiculoCliente.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreamarcaVehiculoCliente.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreamarcaVehiculoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanemarcaVehiculoCliente = new JScrollPane(jTextAreamarcaVehiculoCliente);
		jscrollPanemarcaVehiculoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanemarcaVehiculoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanemarcaVehiculoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonmarcaVehiculoClienteBusqueda= new JButtonMe();
		this.jButtonmarcaVehiculoClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmarcaVehiculoClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmarcaVehiculoClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonmarcaVehiculoClienteBusqueda.setText("U");
		this.jButtonmarcaVehiculoClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonmarcaVehiculoClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonmarcaVehiculoClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreamarcaVehiculoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreamarcaVehiculoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"marcaVehiculoClienteBusqueda"));

		if(this.vehiculoclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonmarcaVehiculoClienteBusqueda.setVisible(false);		}


					
		this.jLabelmodeloVehiculoCliente = new JLabelMe();
		this.jLabelmodeloVehiculoCliente.setText(""+VehiculoClienteConstantesFunciones.LABEL_MODELO+" : *");
		this.jLabelmodeloVehiculoCliente.setToolTipText("Modelo");
		this.jLabelmodeloVehiculoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmodeloVehiculoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmodeloVehiculoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelmodeloVehiculoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelmodeloVehiculoCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelmodeloVehiculoCliente.setToolTipText(VehiculoClienteConstantesFunciones.LABEL_MODELO);
		this.gridaBagLayoutVehiculoCliente = new GridBagLayout();
		this.jPanelmodeloVehiculoCliente.setLayout(this.gridaBagLayoutVehiculoCliente);


		jTextAreamodeloVehiculoCliente= new JTextAreaMe();
		jTextAreamodeloVehiculoCliente.setEnabled(false);
		jTextAreamodeloVehiculoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreamodeloVehiculoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreamodeloVehiculoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreamodeloVehiculoCliente.setLineWrap(true);
		jTextAreamodeloVehiculoCliente.setWrapStyleWord(true);
		jTextAreamodeloVehiculoCliente.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreamodeloVehiculoCliente.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreamodeloVehiculoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanemodeloVehiculoCliente = new JScrollPane(jTextAreamodeloVehiculoCliente);
		jscrollPanemodeloVehiculoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanemodeloVehiculoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanemodeloVehiculoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonmodeloVehiculoClienteBusqueda= new JButtonMe();
		this.jButtonmodeloVehiculoClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmodeloVehiculoClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmodeloVehiculoClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonmodeloVehiculoClienteBusqueda.setText("U");
		this.jButtonmodeloVehiculoClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonmodeloVehiculoClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonmodeloVehiculoClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreamodeloVehiculoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreamodeloVehiculoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"modeloVehiculoClienteBusqueda"));

		if(this.vehiculoclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonmodeloVehiculoClienteBusqueda.setVisible(false);		}


					
		this.jLabelplacaVehiculoCliente = new JLabelMe();
		this.jLabelplacaVehiculoCliente.setText(""+VehiculoClienteConstantesFunciones.LABEL_PLACA+" : *");
		this.jLabelplacaVehiculoCliente.setToolTipText("Placa");
		this.jLabelplacaVehiculoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelplacaVehiculoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelplacaVehiculoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelplacaVehiculoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelplacaVehiculoCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelplacaVehiculoCliente.setToolTipText(VehiculoClienteConstantesFunciones.LABEL_PLACA);
		this.gridaBagLayoutVehiculoCliente = new GridBagLayout();
		this.jPanelplacaVehiculoCliente.setLayout(this.gridaBagLayoutVehiculoCliente);


		jTextFieldplacaVehiculoCliente= new JTextFieldMe();

		jTextFieldplacaVehiculoCliente.setEnabled(false);
		jTextFieldplacaVehiculoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldplacaVehiculoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldplacaVehiculoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldplacaVehiculoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonplacaVehiculoClienteBusqueda= new JButtonMe();
		this.jButtonplacaVehiculoClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonplacaVehiculoClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonplacaVehiculoClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonplacaVehiculoClienteBusqueda.setText("U");
		this.jButtonplacaVehiculoClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonplacaVehiculoClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonplacaVehiculoClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldplacaVehiculoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldplacaVehiculoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"placaVehiculoClienteBusqueda"));

		if(this.vehiculoclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonplacaVehiculoClienteBusqueda.setVisible(false);		}


					
		this.jLabelanioVehiculoCliente = new JLabelMe();
		this.jLabelanioVehiculoCliente.setText(""+VehiculoClienteConstantesFunciones.LABEL_ANIO+" : *");
		this.jLabelanioVehiculoCliente.setToolTipText("Anio");
		this.jLabelanioVehiculoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelanioVehiculoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelanioVehiculoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelanioVehiculoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelanioVehiculoCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelanioVehiculoCliente.setToolTipText(VehiculoClienteConstantesFunciones.LABEL_ANIO);
		this.gridaBagLayoutVehiculoCliente = new GridBagLayout();
		this.jPanelanioVehiculoCliente.setLayout(this.gridaBagLayoutVehiculoCliente);


		jTextFieldanioVehiculoCliente= new JTextFieldMe();
		jTextFieldanioVehiculoCliente.setEnabled(false);
		jTextFieldanioVehiculoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldanioVehiculoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldanioVehiculoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldanioVehiculoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldanioVehiculoCliente.setText("0");

		this.jButtonanioVehiculoClienteBusqueda= new JButtonMe();
		this.jButtonanioVehiculoClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonanioVehiculoClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonanioVehiculoClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonanioVehiculoClienteBusqueda.setText("U");
		this.jButtonanioVehiculoClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonanioVehiculoClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonanioVehiculoClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldanioVehiculoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldanioVehiculoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"anioVehiculoClienteBusqueda"));

		if(this.vehiculoclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonanioVehiculoClienteBusqueda.setVisible(false);		}


					
		this.jLabeles_prendadoVehiculoCliente = new JLabelMe();
		this.jLabeles_prendadoVehiculoCliente.setText(""+VehiculoClienteConstantesFunciones.LABEL_ESPRENDADO+" : *");
		this.jLabeles_prendadoVehiculoCliente.setToolTipText("Es Prendado");
		this.jLabeles_prendadoVehiculoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_prendadoVehiculoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_prendadoVehiculoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeles_prendadoVehiculoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_prendadoVehiculoCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_prendadoVehiculoCliente.setToolTipText(VehiculoClienteConstantesFunciones.LABEL_ESPRENDADO);
		this.gridaBagLayoutVehiculoCliente = new GridBagLayout();
		this.jPaneles_prendadoVehiculoCliente.setLayout(this.gridaBagLayoutVehiculoCliente);


		jCheckBoxes_prendadoVehiculoCliente= new JCheckBoxMe();
		jCheckBoxes_prendadoVehiculoCliente.setEnabled(false);

		jCheckBoxes_prendadoVehiculoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_prendadoVehiculoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_prendadoVehiculoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_prendadoVehiculoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_prendadoVehiculoClienteBusqueda= new JButtonMe();
		this.jButtones_prendadoVehiculoClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_prendadoVehiculoClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_prendadoVehiculoClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_prendadoVehiculoClienteBusqueda.setText("U");
		this.jButtones_prendadoVehiculoClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_prendadoVehiculoClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_prendadoVehiculoClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_prendadoVehiculoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_prendadoVehiculoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_prendadoVehiculoClienteBusqueda"));

		if(this.vehiculoclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_prendadoVehiculoClienteBusqueda.setVisible(false);		}


					
		this.jLabelvalor_avaluoVehiculoCliente = new JLabelMe();
		this.jLabelvalor_avaluoVehiculoCliente.setText(""+VehiculoClienteConstantesFunciones.LABEL_VALORAVALUO+" : *");
		this.jLabelvalor_avaluoVehiculoCliente.setToolTipText("Valor Avaluo");
		this.jLabelvalor_avaluoVehiculoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_avaluoVehiculoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_avaluoVehiculoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_avaluoVehiculoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_avaluoVehiculoCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_avaluoVehiculoCliente.setToolTipText(VehiculoClienteConstantesFunciones.LABEL_VALORAVALUO);
		this.gridaBagLayoutVehiculoCliente = new GridBagLayout();
		this.jPanelvalor_avaluoVehiculoCliente.setLayout(this.gridaBagLayoutVehiculoCliente);


		jTextFieldvalor_avaluoVehiculoCliente= new JTextFieldMe();
		jTextFieldvalor_avaluoVehiculoCliente.setEnabled(false);
		jTextFieldvalor_avaluoVehiculoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_avaluoVehiculoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_avaluoVehiculoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_avaluoVehiculoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_avaluoVehiculoCliente.setText("0.0");

		this.jButtonvalor_avaluoVehiculoClienteBusqueda= new JButtonMe();
		this.jButtonvalor_avaluoVehiculoClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_avaluoVehiculoClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_avaluoVehiculoClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_avaluoVehiculoClienteBusqueda.setText("U");
		this.jButtonvalor_avaluoVehiculoClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_avaluoVehiculoClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_avaluoVehiculoClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_avaluoVehiculoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_avaluoVehiculoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_avaluoVehiculoClienteBusqueda"));

		if(this.vehiculoclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_avaluoVehiculoClienteBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysVehiculoCliente() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaVehiculoCliente = new JLabelMe();
		this.jLabelid_empresaVehiculoCliente.setText(""+VehiculoClienteConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaVehiculoCliente.setToolTipText("Empresa");
		this.jLabelid_empresaVehiculoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaVehiculoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaVehiculoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaVehiculoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaVehiculoCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaVehiculoCliente.setToolTipText(VehiculoClienteConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutVehiculoCliente = new GridBagLayout();
		this.jPanelid_empresaVehiculoCliente.setLayout(this.gridaBagLayoutVehiculoCliente);


		jComboBoxid_empresaVehiculoCliente= new JComboBoxMe();
		jComboBoxid_empresaVehiculoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaVehiculoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaVehiculoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaVehiculoCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaVehiculoCliente.setEnabled(false);

		this.jButtonid_empresaVehiculoCliente= new JButtonMe();
		this.jButtonid_empresaVehiculoCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaVehiculoCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaVehiculoCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaVehiculoCliente.setText("Buscar");
		this.jButtonid_empresaVehiculoCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaVehiculoCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaVehiculoCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaVehiculoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaVehiculoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaVehiculoCliente"));

		this.jButtonid_empresaVehiculoClienteBusqueda= new JButtonMe();
		this.jButtonid_empresaVehiculoClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaVehiculoClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaVehiculoClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaVehiculoClienteBusqueda.setText("U");
		this.jButtonid_empresaVehiculoClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaVehiculoClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaVehiculoClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaVehiculoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaVehiculoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaVehiculoClienteBusqueda"));

		if(this.vehiculoclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaVehiculoClienteBusqueda.setVisible(false);		}

		this.jButtonid_empresaVehiculoClienteUpdate= new JButtonMe();
		this.jButtonid_empresaVehiculoClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaVehiculoClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaVehiculoClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaVehiculoClienteUpdate.setText("U");
		this.jButtonid_empresaVehiculoClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaVehiculoClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaVehiculoClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaVehiculoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaVehiculoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaVehiculoClienteUpdate"));



					
		this.jLabelid_clienteVehiculoCliente = new JLabelMe();
		this.jLabelid_clienteVehiculoCliente.setText(""+VehiculoClienteConstantesFunciones.LABEL_IDCLIENTE+" : *");
		this.jLabelid_clienteVehiculoCliente.setToolTipText("Cliente");
		this.jLabelid_clienteVehiculoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteVehiculoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteVehiculoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_clienteVehiculoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_clienteVehiculoCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_clienteVehiculoCliente.setToolTipText(VehiculoClienteConstantesFunciones.LABEL_IDCLIENTE);
		this.gridaBagLayoutVehiculoCliente = new GridBagLayout();
		this.jPanelid_clienteVehiculoCliente.setLayout(this.gridaBagLayoutVehiculoCliente);


		jComboBoxid_clienteVehiculoCliente= new JComboBoxMe();
		jComboBoxid_clienteVehiculoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteVehiculoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteVehiculoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteVehiculoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_clienteVehiculoCliente= new JButtonMe();
		this.jButtonid_clienteVehiculoCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteVehiculoCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteVehiculoCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteVehiculoCliente.setText("Buscar");
		this.jButtonid_clienteVehiculoCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_clienteVehiculoCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteVehiculoCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_clienteVehiculoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteVehiculoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteVehiculoCliente"));

		this.jButtonid_clienteVehiculoClienteBusqueda= new JButtonMe();
		this.jButtonid_clienteVehiculoClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteVehiculoClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteVehiculoClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteVehiculoClienteBusqueda.setText("U");
		this.jButtonid_clienteVehiculoClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_clienteVehiculoClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteVehiculoClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_clienteVehiculoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteVehiculoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteVehiculoClienteBusqueda"));

		if(this.vehiculoclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_clienteVehiculoClienteBusqueda.setVisible(false);		}

		this.jButtonid_clienteVehiculoClienteUpdate= new JButtonMe();
		this.jButtonid_clienteVehiculoClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteVehiculoClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteVehiculoClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteVehiculoClienteUpdate.setText("U");
		this.jButtonid_clienteVehiculoClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_clienteVehiculoClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteVehiculoClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_clienteVehiculoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteVehiculoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteVehiculoClienteUpdate"));



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
		//this.jInternalFrameDetalleVehiculoCliente = new VehiculoClienteBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Vehiculo Cliente DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutVehiculoCliente= new GridBagLayout();
		

		
		String sToolTipVehiculoCliente="";
		sToolTipVehiculoCliente=VehiculoClienteConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipVehiculoCliente+="(Cartera.VehiculoCliente)";
		}
		
		if(!this.vehiculoclienteSessionBean.getEsGuardarRelacionado()) {
			sToolTipVehiculoCliente+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoVehiculoCliente = new JButtonMe();
		this.jButtonModificarVehiculoCliente = new JButtonMe();
        this.jButtonActualizarVehiculoCliente = new JButtonMe();
        this.jButtonEliminarVehiculoCliente = new JButtonMe();
        this.jButtonCancelarVehiculoCliente = new JButtonMe();
        this.jButtonGuardarCambiosVehiculoCliente = new JButtonMe();
		this.jButtonGuardarCambiosTablaVehiculoCliente = new JButtonMe();
		this.jButtonCerrarVehiculoCliente = new JButtonMe();
		
		this.jScrollPanelDatosVehiculoCliente = new JScrollPane();   
        this.jScrollPanelDatosEdicionVehiculoCliente = new JScrollPane();
		this.jScrollPanelDatosGeneralVehiculoCliente = new JScrollPane();
				
		
		
		this.jPanelCamposVehiculoCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosVehiculoCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesVehiculoCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioVehiculoCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Vehiculo Cliente";
		
		if(!this.vehiculoclienteSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosVehiculoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Vehiculo Clientes" + this.sPath));
		} else {
			this.jScrollPanelDatosVehiculoCliente.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionVehiculoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralVehiculoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposVehiculoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposVehiculoCliente.setName("jPanelCamposVehiculoCliente"); 

		this.jPanelCamposOcultosVehiculoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosVehiculoCliente.setName("jPanelCamposOcultosVehiculoCliente"); 

        this.jPanelAccionesVehiculoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesVehiculoCliente.setToolTipText("Acciones");
        this.jPanelAccionesVehiculoCliente.setName("Acciones"); 

		this.jPanelAccionesFormularioVehiculoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioVehiculoCliente.setToolTipText("Acciones");
        this.jPanelAccionesFormularioVehiculoCliente.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionVehiculoCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralVehiculoCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosVehiculoCliente, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposVehiculoCliente, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosVehiculoCliente, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioVehiculoCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoVehiculoCliente.setText("Nuevo");
		this.jButtonModificarVehiculoCliente.setText("Editar");
        this.jButtonActualizarVehiculoCliente.setText("Actualizar");
        this.jButtonEliminarVehiculoCliente.setText("Eliminar");
        this.jButtonCancelarVehiculoCliente.setText("Cancelar");
        this.jButtonGuardarCambiosVehiculoCliente.setText("Guardar");
		this.jButtonGuardarCambiosTablaVehiculoCliente.setText("Guardar");
		this.jButtonCerrarVehiculoCliente.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoVehiculoCliente,"nuevo_button","Nuevo",this.vehiculoclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarVehiculoCliente,"modificar_button","Editar",this.vehiculoclienteSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarVehiculoCliente,"actualizar_button","Actualizar",this.vehiculoclienteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarVehiculoCliente,"eliminar_button","Eliminar",this.vehiculoclienteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarVehiculoCliente,"cancelar_button","Cancelar",this.vehiculoclienteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosVehiculoCliente,"guardarcambios_button","Guardar",this.vehiculoclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaVehiculoCliente,"guardarcambiostabla_button","Guardar",this.vehiculoclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarVehiculoCliente,"cerrar_button","Salir",this.vehiculoclienteSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoVehiculoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarVehiculoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosVehiculoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaVehiculoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarVehiculoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarVehiculoCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarVehiculoCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarVehiculoCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoVehiculoCliente.setToolTipText("Nuevo"+" "+VehiculoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarVehiculoCliente.setToolTipText("Editar"+" "+VehiculoClienteConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarVehiculoCliente.setToolTipText("Actualizar"+" "+VehiculoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarVehiculoCliente.setToolTipText("Eliminar)"+" "+VehiculoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarVehiculoCliente.setToolTipText("Cancelar"+" "+VehiculoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosVehiculoCliente.setToolTipText("Guardar"+" "+VehiculoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaVehiculoCliente.setToolTipText("Guardar"+" "+VehiculoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarVehiculoCliente.setToolTipText("Salir"+" "+VehiculoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoVehiculoCliente";
		inputMap = this.jButtonNuevoVehiculoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoVehiculoCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoVehiculoCliente"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarVehiculoCliente";
		inputMap = this.jButtonActualizarVehiculoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarVehiculoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarVehiculoCliente"));
		
		//ELIMINAR
		sMapKey = "EliminarVehiculoCliente";
		inputMap = this.jButtonEliminarVehiculoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarVehiculoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarVehiculoCliente"));
		
		//CANCELAR	
		sMapKey = "CancelarVehiculoCliente";
		inputMap = this.jButtonCancelarVehiculoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarVehiculoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarVehiculoCliente"));
		
		//CERRAR		
		sMapKey = "CerrarVehiculoCliente";
		inputMap = this.jButtonCerrarVehiculoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarVehiculoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarVehiculoCliente"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaVehiculoCliente";
		inputMap = this.jButtonGuardarCambiosTablaVehiculoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaVehiculoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaVehiculoCliente"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoVehiculoCliente = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoVehiculoCliente.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoVehiculoCliente.setToolTipText("Nuevo VehiculoCliente");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoVehiculoCliente, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarVehiculoCliente = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarVehiculoCliente.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarVehiculoCliente.setToolTipText("Sin Cerrar Ventana VehiculoCliente");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarVehiculoCliente, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeVehiculoCliente = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeVehiculoCliente.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeVehiculoCliente.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeVehiculoCliente, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesVehiculoCliente = new JComboBoxMe();
		//this.jComboBoxTiposAccionesVehiculoCliente.setText("Accion");
		this.jComboBoxTiposAccionesVehiculoCliente.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioVehiculoCliente = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioVehiculoCliente.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioVehiculoCliente.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesVehiculoCliente = new JLabelMe();
		
		this.jLabelAccionesVehiculoCliente.setText("Acciones");		
		this.jLabelAccionesVehiculoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesVehiculoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesVehiculoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposVehiculoCliente();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysVehiculoCliente();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesVehiculoCliente=new JTabbedPane();
		this.jTabbedPaneRelacionesVehiculoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesVehiculoCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesVehiculoCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesVehiculoCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesVehiculoCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesVehiculoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioVehiculoCliente.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioVehiculoCliente.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioVehiculoCliente.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioVehiculoCliente, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposVehiculoCliente = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosVehiculoCliente = new GridBagLayout();
		
		this.jPanelCamposVehiculoCliente.setLayout(gridaBagLayoutCamposVehiculoCliente);
		this.jPanelCamposOcultosVehiculoCliente.setLayout(gridaBagLayoutCamposOcultosVehiculoCliente);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
	this.gridBagConstraintsVehiculoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVehiculoCliente.gridy = 0;
	this.gridBagConstraintsVehiculoCliente.gridx = 0;
	this.gridBagConstraintsVehiculoCliente.ipadx = 0;
	this.gridBagConstraintsVehiculoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidVehiculoCliente.add(jLabelIdVehiculoCliente, this.gridBagConstraintsVehiculoCliente);



	this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
	this.gridBagConstraintsVehiculoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVehiculoCliente.gridy = 0;
	this.gridBagConstraintsVehiculoCliente.gridx = 1;
	this.gridBagConstraintsVehiculoCliente.ipadx = 0;
	this.gridBagConstraintsVehiculoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidVehiculoCliente.add(jLabelidVehiculoCliente, this.gridBagConstraintsVehiculoCliente);


	this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
	this.gridBagConstraintsVehiculoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVehiculoCliente.gridy = 0;
	this.gridBagConstraintsVehiculoCliente.gridx = 0;
	this.gridBagConstraintsVehiculoCliente.ipadx = 0;
	this.gridBagConstraintsVehiculoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaVehiculoCliente.add(jLabelid_empresaVehiculoCliente, this.gridBagConstraintsVehiculoCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
		//this.gridBagConstraintsVehiculoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVehiculoCliente.gridy = 0;
		this.gridBagConstraintsVehiculoCliente.gridx = 2;
		this.gridBagConstraintsVehiculoCliente.ipadx = 0;
		this.gridBagConstraintsVehiculoCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaVehiculoCliente.add(jButtonid_empresaVehiculoClienteBusqueda, this.gridBagConstraintsVehiculoCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
		//this.gridBagConstraintsVehiculoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVehiculoCliente.gridy = 0;
		this.gridBagConstraintsVehiculoCliente.gridx = 3;
		this.gridBagConstraintsVehiculoCliente.ipadx = 0;
		this.gridBagConstraintsVehiculoCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaVehiculoCliente.add(jButtonid_empresaVehiculoClienteUpdate, this.gridBagConstraintsVehiculoCliente);
	}

	this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
	this.gridBagConstraintsVehiculoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVehiculoCliente.gridy = 0;
	this.gridBagConstraintsVehiculoCliente.gridx = 1;
	this.gridBagConstraintsVehiculoCliente.ipadx = 0;
	this.gridBagConstraintsVehiculoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaVehiculoCliente.add(jComboBoxid_empresaVehiculoCliente, this.gridBagConstraintsVehiculoCliente);


	this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
	this.gridBagConstraintsVehiculoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVehiculoCliente.gridy = 0;
	this.gridBagConstraintsVehiculoCliente.gridx = 0;
	this.gridBagConstraintsVehiculoCliente.ipadx = 0;
	this.gridBagConstraintsVehiculoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_clienteVehiculoCliente.add(jLabelid_clienteVehiculoCliente, this.gridBagConstraintsVehiculoCliente);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
	//this.gridBagConstraintsVehiculoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVehiculoCliente.gridy = 0;
	this.gridBagConstraintsVehiculoCliente.gridx = 2;
	this.gridBagConstraintsVehiculoCliente.ipadx = 0;
	this.gridBagConstraintsVehiculoCliente.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_clienteVehiculoCliente.add(jButtonid_clienteVehiculoCliente, this.gridBagConstraintsVehiculoCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
		//this.gridBagConstraintsVehiculoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVehiculoCliente.gridy = 0;
		this.gridBagConstraintsVehiculoCliente.gridx = 3;
		this.gridBagConstraintsVehiculoCliente.ipadx = 0;
		this.gridBagConstraintsVehiculoCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteVehiculoCliente.add(jButtonid_clienteVehiculoClienteBusqueda, this.gridBagConstraintsVehiculoCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
		//this.gridBagConstraintsVehiculoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVehiculoCliente.gridy = 0;
		this.gridBagConstraintsVehiculoCliente.gridx = 4;
		this.gridBagConstraintsVehiculoCliente.ipadx = 0;
		this.gridBagConstraintsVehiculoCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteVehiculoCliente.add(jButtonid_clienteVehiculoClienteUpdate, this.gridBagConstraintsVehiculoCliente);
	}

	this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
	this.gridBagConstraintsVehiculoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVehiculoCliente.gridy = 0;
	this.gridBagConstraintsVehiculoCliente.gridx = 1;
	this.gridBagConstraintsVehiculoCliente.ipadx = 0;
	this.gridBagConstraintsVehiculoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_clienteVehiculoCliente.add(jComboBoxid_clienteVehiculoCliente, this.gridBagConstraintsVehiculoCliente);


	this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
	this.gridBagConstraintsVehiculoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVehiculoCliente.gridy = 0;
	this.gridBagConstraintsVehiculoCliente.gridx = 0;
	this.gridBagConstraintsVehiculoCliente.ipadx = 0;
	this.gridBagConstraintsVehiculoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoVehiculoCliente.add(jLabelcodigoVehiculoCliente, this.gridBagConstraintsVehiculoCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
		//this.gridBagConstraintsVehiculoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVehiculoCliente.gridy = 0;
		this.gridBagConstraintsVehiculoCliente.gridx = 2;
		this.gridBagConstraintsVehiculoCliente.ipadx = 0;
		this.gridBagConstraintsVehiculoCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoVehiculoCliente.add(jButtoncodigoVehiculoClienteBusqueda, this.gridBagConstraintsVehiculoCliente);
	}

	this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
	this.gridBagConstraintsVehiculoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVehiculoCliente.gridy = 0;
	this.gridBagConstraintsVehiculoCliente.gridx = 1;
	this.gridBagConstraintsVehiculoCliente.ipadx = 0;
	this.gridBagConstraintsVehiculoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoVehiculoCliente.add(jTextFieldcodigoVehiculoCliente, this.gridBagConstraintsVehiculoCliente);


	this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
	this.gridBagConstraintsVehiculoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVehiculoCliente.gridy = 0;
	this.gridBagConstraintsVehiculoCliente.gridx = 0;
	this.gridBagConstraintsVehiculoCliente.ipadx = 0;
	this.gridBagConstraintsVehiculoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelmarcaVehiculoCliente.add(jLabelmarcaVehiculoCliente, this.gridBagConstraintsVehiculoCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
		//this.gridBagConstraintsVehiculoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVehiculoCliente.gridy = 0;
		this.gridBagConstraintsVehiculoCliente.gridx = 2;
		this.gridBagConstraintsVehiculoCliente.ipadx = 0;
		this.gridBagConstraintsVehiculoCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelmarcaVehiculoCliente.add(jButtonmarcaVehiculoClienteBusqueda, this.gridBagConstraintsVehiculoCliente);
	}

	this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
	this.gridBagConstraintsVehiculoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVehiculoCliente.gridy = 0;
	this.gridBagConstraintsVehiculoCliente.gridx = 1;
	this.gridBagConstraintsVehiculoCliente.ipadx = 0;
	this.gridBagConstraintsVehiculoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelmarcaVehiculoCliente.add(jscrollPanemarcaVehiculoCliente, this.gridBagConstraintsVehiculoCliente);


	this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
	this.gridBagConstraintsVehiculoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVehiculoCliente.gridy = 0;
	this.gridBagConstraintsVehiculoCliente.gridx = 0;
	this.gridBagConstraintsVehiculoCliente.ipadx = 0;
	this.gridBagConstraintsVehiculoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelmodeloVehiculoCliente.add(jLabelmodeloVehiculoCliente, this.gridBagConstraintsVehiculoCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
		//this.gridBagConstraintsVehiculoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVehiculoCliente.gridy = 0;
		this.gridBagConstraintsVehiculoCliente.gridx = 2;
		this.gridBagConstraintsVehiculoCliente.ipadx = 0;
		this.gridBagConstraintsVehiculoCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelmodeloVehiculoCliente.add(jButtonmodeloVehiculoClienteBusqueda, this.gridBagConstraintsVehiculoCliente);
	}

	this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
	this.gridBagConstraintsVehiculoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVehiculoCliente.gridy = 0;
	this.gridBagConstraintsVehiculoCliente.gridx = 1;
	this.gridBagConstraintsVehiculoCliente.ipadx = 0;
	this.gridBagConstraintsVehiculoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelmodeloVehiculoCliente.add(jscrollPanemodeloVehiculoCliente, this.gridBagConstraintsVehiculoCliente);


	this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
	this.gridBagConstraintsVehiculoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVehiculoCliente.gridy = 0;
	this.gridBagConstraintsVehiculoCliente.gridx = 0;
	this.gridBagConstraintsVehiculoCliente.ipadx = 0;
	this.gridBagConstraintsVehiculoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelplacaVehiculoCliente.add(jLabelplacaVehiculoCliente, this.gridBagConstraintsVehiculoCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
		//this.gridBagConstraintsVehiculoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVehiculoCliente.gridy = 0;
		this.gridBagConstraintsVehiculoCliente.gridx = 2;
		this.gridBagConstraintsVehiculoCliente.ipadx = 0;
		this.gridBagConstraintsVehiculoCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelplacaVehiculoCliente.add(jButtonplacaVehiculoClienteBusqueda, this.gridBagConstraintsVehiculoCliente);
	}

	this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
	this.gridBagConstraintsVehiculoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVehiculoCliente.gridy = 0;
	this.gridBagConstraintsVehiculoCliente.gridx = 1;
	this.gridBagConstraintsVehiculoCliente.ipadx = 0;
	this.gridBagConstraintsVehiculoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelplacaVehiculoCliente.add(jTextFieldplacaVehiculoCliente, this.gridBagConstraintsVehiculoCliente);


	this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
	this.gridBagConstraintsVehiculoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVehiculoCliente.gridy = 0;
	this.gridBagConstraintsVehiculoCliente.gridx = 0;
	this.gridBagConstraintsVehiculoCliente.ipadx = 0;
	this.gridBagConstraintsVehiculoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelanioVehiculoCliente.add(jLabelanioVehiculoCliente, this.gridBagConstraintsVehiculoCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
		//this.gridBagConstraintsVehiculoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVehiculoCliente.gridy = 0;
		this.gridBagConstraintsVehiculoCliente.gridx = 2;
		this.gridBagConstraintsVehiculoCliente.ipadx = 0;
		this.gridBagConstraintsVehiculoCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelanioVehiculoCliente.add(jButtonanioVehiculoClienteBusqueda, this.gridBagConstraintsVehiculoCliente);
	}

	this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
	this.gridBagConstraintsVehiculoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVehiculoCliente.gridy = 0;
	this.gridBagConstraintsVehiculoCliente.gridx = 1;
	this.gridBagConstraintsVehiculoCliente.ipadx = 0;
	this.gridBagConstraintsVehiculoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelanioVehiculoCliente.add(jTextFieldanioVehiculoCliente, this.gridBagConstraintsVehiculoCliente);


	this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
	this.gridBagConstraintsVehiculoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVehiculoCliente.gridy = 0;
	this.gridBagConstraintsVehiculoCliente.gridx = 0;
	this.gridBagConstraintsVehiculoCliente.ipadx = 0;
	this.gridBagConstraintsVehiculoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_prendadoVehiculoCliente.add(jLabeles_prendadoVehiculoCliente, this.gridBagConstraintsVehiculoCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
		//this.gridBagConstraintsVehiculoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVehiculoCliente.gridy = 0;
		this.gridBagConstraintsVehiculoCliente.gridx = 2;
		this.gridBagConstraintsVehiculoCliente.ipadx = 0;
		this.gridBagConstraintsVehiculoCliente.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_prendadoVehiculoCliente.add(jButtones_prendadoVehiculoClienteBusqueda, this.gridBagConstraintsVehiculoCliente);
	}

	this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
	this.gridBagConstraintsVehiculoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVehiculoCliente.gridy = 0;
	this.gridBagConstraintsVehiculoCliente.gridx = 1;
	this.gridBagConstraintsVehiculoCliente.ipadx = 0;
	this.gridBagConstraintsVehiculoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_prendadoVehiculoCliente.add(jCheckBoxes_prendadoVehiculoCliente, this.gridBagConstraintsVehiculoCliente);


	this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
	this.gridBagConstraintsVehiculoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVehiculoCliente.gridy = 0;
	this.gridBagConstraintsVehiculoCliente.gridx = 0;
	this.gridBagConstraintsVehiculoCliente.ipadx = 0;
	this.gridBagConstraintsVehiculoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_avaluoVehiculoCliente.add(jLabelvalor_avaluoVehiculoCliente, this.gridBagConstraintsVehiculoCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
		//this.gridBagConstraintsVehiculoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVehiculoCliente.gridy = 0;
		this.gridBagConstraintsVehiculoCliente.gridx = 2;
		this.gridBagConstraintsVehiculoCliente.ipadx = 0;
		this.gridBagConstraintsVehiculoCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_avaluoVehiculoCliente.add(jButtonvalor_avaluoVehiculoClienteBusqueda, this.gridBagConstraintsVehiculoCliente);
	}

	this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
	this.gridBagConstraintsVehiculoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVehiculoCliente.gridy = 0;
	this.gridBagConstraintsVehiculoCliente.gridx = 1;
	this.gridBagConstraintsVehiculoCliente.ipadx = 0;
	this.gridBagConstraintsVehiculoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_avaluoVehiculoCliente.add(jTextFieldvalor_avaluoVehiculoCliente, this.gridBagConstraintsVehiculoCliente);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
	this.gridBagConstraintsVehiculoCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVehiculoCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVehiculoCliente.gridy = iYPanelCamposVehiculoCliente;
	this.gridBagConstraintsVehiculoCliente.gridx = iXPanelCamposVehiculoCliente++;
	this.gridBagConstraintsVehiculoCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVehiculoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVehiculoCliente.add(this.jPanelidVehiculoCliente, this.gridBagConstraintsVehiculoCliente);



	if(iXPanelCamposVehiculoCliente % 1==0) {
		iXPanelCamposVehiculoCliente=0;
		iYPanelCamposVehiculoCliente++;
	}
	this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
	this.gridBagConstraintsVehiculoCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVehiculoCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVehiculoCliente.gridy = iYPanelCamposVehiculoCliente;
	this.gridBagConstraintsVehiculoCliente.gridx = iXPanelCamposVehiculoCliente++;
	this.gridBagConstraintsVehiculoCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVehiculoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVehiculoCliente.add(this.jPanelid_clienteVehiculoCliente, this.gridBagConstraintsVehiculoCliente);



	if(iXPanelCamposVehiculoCliente % 1==0) {
		iXPanelCamposVehiculoCliente=0;
		iYPanelCamposVehiculoCliente++;
	}
	this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
	this.gridBagConstraintsVehiculoCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVehiculoCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVehiculoCliente.gridy = iYPanelCamposVehiculoCliente;
	this.gridBagConstraintsVehiculoCliente.gridx = iXPanelCamposVehiculoCliente++;
	this.gridBagConstraintsVehiculoCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVehiculoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVehiculoCliente.add(this.jPanelcodigoVehiculoCliente, this.gridBagConstraintsVehiculoCliente);



	if(iXPanelCamposVehiculoCliente % 1==0) {
		iXPanelCamposVehiculoCliente=0;
		iYPanelCamposVehiculoCliente++;
	}
	this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
	this.gridBagConstraintsVehiculoCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVehiculoCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVehiculoCliente.gridy = iYPanelCamposVehiculoCliente;
	this.gridBagConstraintsVehiculoCliente.gridx = iXPanelCamposVehiculoCliente++;
	this.gridBagConstraintsVehiculoCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVehiculoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVehiculoCliente.add(this.jPanelmarcaVehiculoCliente, this.gridBagConstraintsVehiculoCliente);



	if(iXPanelCamposVehiculoCliente % 1==0) {
		iXPanelCamposVehiculoCliente=0;
		iYPanelCamposVehiculoCliente++;
	}
	this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
	this.gridBagConstraintsVehiculoCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVehiculoCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVehiculoCliente.gridy = iYPanelCamposVehiculoCliente;
	this.gridBagConstraintsVehiculoCliente.gridx = iXPanelCamposVehiculoCliente++;
	this.gridBagConstraintsVehiculoCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVehiculoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVehiculoCliente.add(this.jPanelmodeloVehiculoCliente, this.gridBagConstraintsVehiculoCliente);



	if(iXPanelCamposVehiculoCliente % 1==0) {
		iXPanelCamposVehiculoCliente=0;
		iYPanelCamposVehiculoCliente++;
	}
	this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
	this.gridBagConstraintsVehiculoCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVehiculoCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVehiculoCliente.gridy = iYPanelCamposVehiculoCliente;
	this.gridBagConstraintsVehiculoCliente.gridx = iXPanelCamposVehiculoCliente++;
	this.gridBagConstraintsVehiculoCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVehiculoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVehiculoCliente.add(this.jPanelplacaVehiculoCliente, this.gridBagConstraintsVehiculoCliente);



	if(iXPanelCamposVehiculoCliente % 1==0) {
		iXPanelCamposVehiculoCliente=0;
		iYPanelCamposVehiculoCliente++;
	}
	this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
	this.gridBagConstraintsVehiculoCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVehiculoCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVehiculoCliente.gridy = iYPanelCamposVehiculoCliente;
	this.gridBagConstraintsVehiculoCliente.gridx = iXPanelCamposVehiculoCliente++;
	this.gridBagConstraintsVehiculoCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVehiculoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVehiculoCliente.add(this.jPanelanioVehiculoCliente, this.gridBagConstraintsVehiculoCliente);



	if(iXPanelCamposVehiculoCliente % 1==0) {
		iXPanelCamposVehiculoCliente=0;
		iYPanelCamposVehiculoCliente++;
	}
	this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
	this.gridBagConstraintsVehiculoCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVehiculoCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVehiculoCliente.gridy = iYPanelCamposVehiculoCliente;
	this.gridBagConstraintsVehiculoCliente.gridx = iXPanelCamposVehiculoCliente++;
	this.gridBagConstraintsVehiculoCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVehiculoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVehiculoCliente.add(this.jPaneles_prendadoVehiculoCliente, this.gridBagConstraintsVehiculoCliente);



	if(iXPanelCamposVehiculoCliente % 1==0) {
		iXPanelCamposVehiculoCliente=0;
		iYPanelCamposVehiculoCliente++;
	}
	this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
	this.gridBagConstraintsVehiculoCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVehiculoCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVehiculoCliente.gridy = iYPanelCamposVehiculoCliente;
	this.gridBagConstraintsVehiculoCliente.gridx = iXPanelCamposVehiculoCliente++;
	this.gridBagConstraintsVehiculoCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVehiculoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVehiculoCliente.add(this.jPanelvalor_avaluoVehiculoCliente, this.gridBagConstraintsVehiculoCliente);



	if(iXPanelCamposVehiculoCliente % 1==0) {
		iXPanelCamposVehiculoCliente=0;
		iYPanelCamposVehiculoCliente++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
	this.gridBagConstraintsVehiculoCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVehiculoCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVehiculoCliente.gridy = iYPanelCamposOcultosVehiculoCliente;
	this.gridBagConstraintsVehiculoCliente.gridx = iXPanelCamposOcultosVehiculoCliente++;
	this.gridBagConstraintsVehiculoCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVehiculoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosVehiculoCliente.add(this.jPanelid_empresaVehiculoCliente, this.gridBagConstraintsVehiculoCliente);



	if(iXPanelCamposOcultosVehiculoCliente % 1==0) {
		iXPanelCamposOcultosVehiculoCliente=0;
		iYPanelCamposOcultosVehiculoCliente++;
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
			
		GridBagLayout gridaBagLayoutAccionesVehiculoCliente= new GridBagLayout();
		this.jPanelAccionesVehiculoCliente.setLayout(gridaBagLayoutAccionesVehiculoCliente);
		
		GridBagLayout gridaBagLayoutAccionesFormularioVehiculoCliente= new GridBagLayout();
		this.jPanelAccionesFormularioVehiculoCliente.setLayout(gridaBagLayoutAccionesFormularioVehiculoCliente);
		
		this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
		this.gridBagConstraintsVehiculoCliente.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsVehiculoCliente.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioVehiculoCliente.add(this.jComboBoxTiposAccionesFormularioVehiculoCliente, this.gridBagConstraintsVehiculoCliente);

		this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
		this.gridBagConstraintsVehiculoCliente.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsVehiculoCliente.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioVehiculoCliente.add(this.jCheckBoxPostAccionNuevoVehiculoCliente, this.gridBagConstraintsVehiculoCliente);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.vehiculoclienteSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
			this.gridBagConstraintsVehiculoCliente.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsVehiculoCliente.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioVehiculoCliente.add(this.jCheckBoxPostAccionSinCerrarVehiculoCliente, this.gridBagConstraintsVehiculoCliente);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.vehiculoclienteSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.vehiculoclienteSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
			this.gridBagConstraintsVehiculoCliente.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsVehiculoCliente.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioVehiculoCliente.add(this.jCheckBoxPostAccionSinMensajeVehiculoCliente, this.gridBagConstraintsVehiculoCliente);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
		this.gridBagConstraintsVehiculoCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVehiculoCliente.gridy = 0;
		this.gridBagConstraintsVehiculoCliente.gridx = iPosXAccion++;
			
		this.jPanelAccionesVehiculoCliente.add(this.jButtonModificarVehiculoCliente, this.gridBagConstraintsVehiculoCliente);							

		this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
		this.gridBagConstraintsVehiculoCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVehiculoCliente.gridy = 0;
		this.gridBagConstraintsVehiculoCliente.gridx =iPosXAccion++;
			
		this.jPanelAccionesVehiculoCliente.add(this.jButtonEliminarVehiculoCliente, this.gridBagConstraintsVehiculoCliente);
		
			
		this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
		this.gridBagConstraintsVehiculoCliente.gridy = 0;		
		this.gridBagConstraintsVehiculoCliente.gridx = iPosXAccion++;
		
		this.jPanelAccionesVehiculoCliente.add(this.jButtonActualizarVehiculoCliente, this.gridBagConstraintsVehiculoCliente);


		this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
		this.gridBagConstraintsVehiculoCliente.gridy = 0;		
		this.gridBagConstraintsVehiculoCliente.gridx = iPosXAccion++;
		
		this.jPanelAccionesVehiculoCliente.add(this.jButtonGuardarCambiosVehiculoCliente, this.gridBagConstraintsVehiculoCliente);	
		
		this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
		this.gridBagConstraintsVehiculoCliente.gridy = 0;		
		this.gridBagConstraintsVehiculoCliente.gridx =iPosXAccion++;
		
		this.jPanelAccionesVehiculoCliente.add(this.jButtonCancelarVehiculoCliente, this.gridBagConstraintsVehiculoCliente);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutVehiculoCliente = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutVehiculoCliente);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.vehiculoclienteSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();						
			this.gridBagConstraintsVehiculoCliente.gridy = iGridyPrincipal++;
			this.gridBagConstraintsVehiculoCliente.gridx = 0;		
			//this.gridBagConstraintsVehiculoCliente.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVehiculoCliente.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsVehiculoCliente.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
		this.gridBagConstraintsVehiculoCliente.gridy =iGridyPrincipal++;
		this.gridBagConstraintsVehiculoCliente.gridx =0;
		this.gridBagConstraintsVehiculoCliente.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsVehiculoCliente.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosVehiculoCliente, this.gridBagConstraintsVehiculoCliente);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(VehiculoClienteJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleVehiculoCliente = new VehiculoClienteBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Vehiculo Cliente DATOS");
			
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
			
	        //this.setTitle("[FOR] - Vehiculo Cliente DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Vehiculo Cliente Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			VehiculoClienteModel vehiculoclienteModel=new VehiculoClienteModel(this);
			
			//SI USARA CLASE INTERNA
			//VehiculoClienteModel.VehiculoClienteFocusTraversalPolicy vehiculoclienteFocusTraversalPolicy = vehiculoclienteModel.new VehiculoClienteFocusTraversalPolicy(this);
			
			//vehiculoclienteFocusTraversalPolicy.setvehiculoclienteJInternalFrame(this);
			
			this.setFocusTraversalPolicy(vehiculoclienteModel);
			
			
			this.jContentPaneDetalleVehiculoCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleVehiculoCliente = new GridBagLayout();	
			this.jContentPaneDetalleVehiculoCliente.setLayout(gridaBagLayoutDetalleVehiculoCliente);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosVehiculoCliente = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
				this.gridBagConstraintsVehiculoCliente.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsVehiculoCliente.gridx = 0;
					
				
				this.jContentPaneDetalleVehiculoCliente.add(jTtoolBarDetalleVehiculoCliente, gridBagConstraintsVehiculoCliente);								
				
}
			
			this.jScrollPanelDatosEdicionVehiculoCliente=   new JScrollPane(jContentPaneDetalleVehiculoCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionVehiculoCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionVehiculoCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionVehiculoCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralVehiculoCliente=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralVehiculoCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralVehiculoCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralVehiculoCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
			
			
	        this.gridBagConstraintsVehiculoCliente.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsVehiculoCliente.gridx = 0;
	        
			this.jContentPaneDetalleVehiculoCliente.add(jPanelCamposVehiculoCliente, gridBagConstraintsVehiculoCliente);
			
			
			
			
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
						&& vehiculoclienteSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.vehiculoclienteSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsVehiculoCliente= new GridBagConstraints();
						this.gridBagConstraintsVehiculoCliente.gridy = iGridyRelaciones++;
						this.gridBagConstraintsVehiculoCliente.gridx = 0;
						this.jContentPaneDetalleVehiculoCliente.add(this.jTabbedPaneRelacionesVehiculoCliente, this.gridBagConstraintsVehiculoCliente);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesVehiculoCliente.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosVehiculoCliente.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
					this.gridBagConstraintsVehiculoCliente.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsVehiculoCliente.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsVehiculoCliente.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsVehiculoCliente.gridx = 0;
					
				
					this.jContentPaneDetalleVehiculoCliente.add(jPanelCamposOcultosVehiculoCliente, gridBagConstraintsVehiculoCliente);
				
					this.jPanelCamposOcultosVehiculoCliente.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
			this.gridBagConstraintsVehiculoCliente.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsVehiculoCliente.gridx = 0;
	        this.gridBagConstraintsVehiculoCliente.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleVehiculoCliente.add(this.jPanelAccionesFormularioVehiculoCliente, this.gridBagConstraintsVehiculoCliente);							
			
			
			
			this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
	        this.gridBagConstraintsVehiculoCliente.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsVehiculoCliente.gridx = 0;
	        
			
			this.jContentPaneDetalleVehiculoCliente.add(this.jPanelAccionesVehiculoCliente, this.gridBagConstraintsVehiculoCliente);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionVehiculoCliente);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionVehiculoCliente=   new JScrollPane(this.jPanelCamposVehiculoCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionVehiculoCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionVehiculoCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionVehiculoCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
			this.gridBagConstraintsVehiculoCliente.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsVehiculoCliente.gridx = 0;
			this.gridBagConstraintsVehiculoCliente.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsVehiculoCliente.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsVehiculoCliente.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionVehiculoCliente, this.gridBagConstraintsVehiculoCliente);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
			this.gridBagConstraintsVehiculoCliente.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsVehiculoCliente.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioVehiculoCliente, this.gridBagConstraintsVehiculoCliente);			
			
			this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
			this.gridBagConstraintsVehiculoCliente.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsVehiculoCliente.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesVehiculoCliente, this.gridBagConstraintsVehiculoCliente);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
		this.gridBagConstraintsVehiculoCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVehiculoCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposVehiculoCliente, this.gridBagConstraintsVehiculoCliente);
			
			
		this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
		this.gridBagConstraintsVehiculoCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVehiculoCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosVehiculoCliente, this.gridBagConstraintsVehiculoCliente);
		
			
		this.gridBagConstraintsVehiculoCliente = new GridBagConstraints();
		this.gridBagConstraintsVehiculoCliente.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsVehiculoCliente.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesVehiculoCliente, this.gridBagConstraintsVehiculoCliente);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralVehiculoCliente;//jContentPane;
		
		return jScrollPanelDatosEdicionVehiculoCliente;
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
