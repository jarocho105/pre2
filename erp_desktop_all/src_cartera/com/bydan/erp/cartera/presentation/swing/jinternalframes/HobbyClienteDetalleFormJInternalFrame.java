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

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.cartera.util.HobbyClienteConstantesFunciones;

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
public class HobbyClienteDetalleFormJInternalFrame extends HobbyClienteBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleHobbyCliente;
	
	protected JMenuBar jmenuBarDetalleHobbyCliente;
	
	protected JMenu jmenuDetalleHobbyCliente;
	protected JMenu jmenuDetalleArchivoHobbyCliente;
	protected JMenu jmenuDetalleAccionesHobbyCliente;
	protected JMenu jmenuDetalleDatosHobbyCliente;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleHobbyCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutHobbyCliente;	
	protected GridBagConstraints gridBagConstraintsHobbyCliente;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected HobbyClienteBeanSwingJInternalFrameAdditional jInternalFrameDetalleHobbyCliente;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected HobbyBeanSwingJInternalFrame hobbyBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_hobby="";
	
	public HobbyClienteSessionBean hobbyclienteSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public HobbySessionBean hobbySessionBean;	
	
	public HobbyClienteLogic hobbyclienteLogic;
	
	public JScrollPane jScrollPanelDatosHobbyCliente;
	public JScrollPane jScrollPanelDatosEdicionHobbyCliente;
	public JScrollPane jScrollPanelDatosGeneralHobbyCliente;
	
	protected JPanel jPanelCamposHobbyCliente;    
	protected JPanel jPanelCamposOcultosHobbyCliente;    	
	protected JPanel jPanelAccionesHobbyCliente;
	protected JPanel jPanelAccionesFormularioHobbyCliente;
    
	
	
	protected Integer iXPanelCamposHobbyCliente=0;
	protected Integer iYPanelCamposHobbyCliente=0;
	
	protected Integer iXPanelCamposOcultosHobbyCliente=0;
	protected Integer iYPanelCamposOcultosHobbyCliente=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoHobbyCliente;
	public JButton jButtonModificarHobbyCliente;
	public JButton jButtonActualizarHobbyCliente;
    public JButton jButtonEliminarHobbyCliente;
	public JButton jButtonCancelarHobbyCliente;
    public JButton jButtonGuardarCambiosHobbyCliente;
	public JButton jButtonGuardarCambiosTablaHobbyCliente;
	protected JButton jButtonCerrarHobbyCliente;
	
	
	protected JButton jButtonProcesarInformacionHobbyCliente;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoHobbyCliente;
	protected JCheckBox jCheckBoxPostAccionSinCerrarHobbyCliente;
	protected JCheckBox jCheckBoxPostAccionSinMensajeHobbyCliente;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarHobbyCliente;
	protected JButton jButtonModificarToolBarHobbyCliente;
	protected JButton jButtonActualizarToolBarHobbyCliente;
    protected JButton jButtonEliminarToolBarHobbyCliente;
	protected JButton jButtonCancelarToolBarHobbyCliente;
    protected JButton jButtonGuardarCambiosToolBarHobbyCliente;
	protected JButton jButtonGuardarCambiosTablaToolBarHobbyCliente;
	protected JButton jButtonMostrarOcultarTablaToolBarHobbyCliente;
	protected JButton jButtonCerrarToolBarHobbyCliente;
	
	protected JButton jButtonProcesarInformacionToolBarHobbyCliente;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoHobbyCliente;
	protected JMenuItem jMenuItemModificarHobbyCliente;
	protected JMenuItem jMenuItemActualizarHobbyCliente;
    protected JMenuItem jMenuItemEliminarHobbyCliente;
	protected JMenuItem jMenuItemCancelarHobbyCliente;
    protected JMenuItem jMenuItemGuardarCambiosHobbyCliente;
	protected JMenuItem jMenuItemGuardarCambiosTablaHobbyCliente;
	protected JMenuItem jMenuItemCerrarHobbyCliente;
	protected JMenuItem jMenuItemDetalleCerrarHobbyCliente;
	protected JMenuItem jMenuItemDetalleMostarOcultarHobbyCliente;
	
	protected JMenuItem jMenuItemProcesarInformacionHobbyCliente;
	protected JMenuItem jMenuItemNuevoGuardarCambiosHobbyCliente;
	protected JMenuItem jMenuItemMostrarOcultarHobbyCliente;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesHobbyCliente;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesHobbyCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesHobbyCliente;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioHobbyCliente;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidHobbyCliente;
	public JLabel jLabelIdHobbyCliente;
	public JLabel jLabelidHobbyCliente;
	public JButton jButtonidHobbyClienteBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionHobbyCliente;
	public JLabel jLabeldescripcionHobbyCliente;
	public JTextArea jTextAreadescripcionHobbyCliente;
	public JScrollPane jscrollPanedescripcionHobbyCliente;
	public JButton jButtondescripcionHobbyClienteBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaHobbyCliente;
	public JLabel jLabelid_empresaHobbyCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaHobbyCliente;
	public JButton jButtonid_empresaHobbyCliente= new JButtonMe();
	public JButton jButtonid_empresaHobbyClienteUpdate= new JButtonMe();
	public JButton jButtonid_empresaHobbyClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_clienteHobbyCliente;
	public JLabel jLabelid_clienteHobbyCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteHobbyCliente;
	public JButton jButtonid_clienteHobbyCliente= new JButtonMe();
	public JButton jButtonid_clienteHobbyClienteUpdate= new JButtonMe();
	public JButton jButtonid_clienteHobbyClienteBusqueda= new JButtonMe();

	public JPanel jPanelid_hobbyHobbyCliente;
	public JLabel jLabelid_hobbyHobbyCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_hobbyHobbyCliente;
	public JButton jButtonid_hobbyHobbyCliente= new JButtonMe();
	public JButton jButtonid_hobbyHobbyClienteUpdate= new JButtonMe();
	public JButton jButtonid_hobbyHobbyClienteBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesHobbyCliente;
	
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
	public int iHeightFormulario=374;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public HobbyClienteDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposHobbyCliente=new JPanel();
				this.jPanelAccionesFormularioHobbyCliente=new JPanel();
				this.jmenuBarDetalleHobbyCliente=new JMenuBar();
				this.jTtoolBarDetalleHobbyCliente=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public HobbyClienteDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("HobbyCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public HobbyClienteDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("HobbyCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public HobbyClienteDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("HobbyCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public HobbyClienteDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("HobbyCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public HobbyClienteDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("HobbyCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarHobbyCliente() {
		return this.jButtonActualizarToolBarHobbyCliente;
	}
	
	public JButton getjButtonEliminarToolBarHobbyCliente() {
		return this.jButtonEliminarToolBarHobbyCliente;
	}
	
	public JButton getjButtonCancelarToolBarHobbyCliente() {
		return this.jButtonCancelarToolBarHobbyCliente;
	}		
	
	public JButton getjButtonProcesarInformacionHobbyCliente() {
		return this.jButtonProcesarInformacionHobbyCliente;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionHobbyCliente)	{
		this.jButtonProcesarInformacionHobbyCliente = jButtonProcesarInformacionHobbyCliente;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesHobbyCliente() {
		return this.jComboBoxTiposAccionesHobbyCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesHobbyCliente(
			JComboBox jComboBoxTiposRelacionesHobbyCliente) {
		this.jComboBoxTiposRelacionesHobbyCliente = jComboBoxTiposRelacionesHobbyCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesHobbyCliente(
			JComboBox jComboBoxTiposAccionesHobbyCliente) {
		this.jComboBoxTiposAccionesHobbyCliente = jComboBoxTiposAccionesHobbyCliente;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioHobbyCliente() {
		return this.jComboBoxTiposAccionesFormularioHobbyCliente;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioHobbyCliente(
			JComboBox jComboBoxTiposAccionesFormularioHobbyCliente) {
		this.jComboBoxTiposAccionesFormularioHobbyCliente = jComboBoxTiposAccionesFormularioHobbyCliente;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.hobbyclienteSessionBean=new HobbyClienteSessionBean();
		
		this.hobbyclienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.hobbyclienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.hobbyclienteSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		HobbyClienteJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		HobbyClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		HobbyClienteJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Hobby Cliente MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.hobbyclienteSessionBean.getEsGuardarRelacionado()) {
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
	
		HobbyClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleHobbyCliente= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarHobbyCliente=new JButtonMe();
				this.jButtonModificarToolBarHobbyCliente=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarHobbyCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarHobbyCliente,this.jTtoolBarDetalleHobbyCliente,
							"actualizar","actualizar","Actualizar"+" "+HobbyClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarHobbyCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarHobbyCliente,this.jTtoolBarDetalleHobbyCliente,
							"eliminar","eliminar","Eliminar"+" "+HobbyClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarHobbyCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarHobbyCliente,this.jTtoolBarDetalleHobbyCliente,
							"cancelar","cancelar","Cancelar"+" "+HobbyClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarHobbyCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarHobbyCliente,this.jTtoolBarDetalleHobbyCliente,
							"guardarcambios","guardarcambios","Guardar"+" "+HobbyClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarHobbyCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarHobbyCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarHobbyCliente,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleHobbyCliente=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleHobbyCliente=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoHobbyCliente=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesHobbyCliente=new JMenuMe("Acciones");
		this.jmenuDetalleDatosHobbyCliente=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoHobbyCliente= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoHobbyCliente.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoHobbyCliente,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoHobbyCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarHobbyCliente= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarHobbyCliente.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarHobbyCliente,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarHobbyCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarHobbyCliente= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarHobbyCliente.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarHobbyCliente,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarHobbyCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarHobbyCliente= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarHobbyCliente.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarHobbyCliente,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarHobbyCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarHobbyCliente= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarHobbyCliente.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarHobbyCliente,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarHobbyCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosHobbyCliente= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosHobbyCliente.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosHobbyCliente,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosHobbyCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarHobbyCliente= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarHobbyCliente.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarHobbyCliente,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarHobbyCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarHobbyCliente= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarHobbyCliente.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarHobbyCliente,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarHobbyCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarHobbyCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarHobbyCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarHobbyCliente,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarHobbyCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarHobbyCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarHobbyCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarHobbyCliente,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarHobbyCliente, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoHobbyCliente.add(this.jMenuItemDetalleCerrarHobbyCliente);
		
		this.jmenuDetalleAccionesHobbyCliente.add(this.jMenuItemActualizarHobbyCliente);
		this.jmenuDetalleAccionesHobbyCliente.add(this.jMenuItemEliminarHobbyCliente);
		this.jmenuDetalleAccionesHobbyCliente.add(this.jMenuItemCancelarHobbyCliente);		
		
		//this.jmenuDetalleDatosHobbyCliente.add(this.jMenuItemDetalleAbrirOrderByHobbyCliente);				
		this.jmenuDetalleDatosHobbyCliente.add(this.jMenuItemDetalleMostarOcultarHobbyCliente);				
				
		//this.jmenuDetalleAccionesHobbyCliente.add(this.jMenuItemGuardarCambiosHobbyCliente);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoHobbyCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesHobbyCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosHobbyCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleHobbyCliente.add(this.jmenuDetalleArchivoHobbyCliente);		
		this.jmenuBarDetalleHobbyCliente.add(this.jmenuDetalleAccionesHobbyCliente);		
		this.jmenuBarDetalleHobbyCliente.add(this.jmenuDetalleDatosHobbyCliente);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleHobbyCliente);				
	}
	
	
	public void inicializarElementosCamposHobbyCliente() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdHobbyCliente = new JLabelMe();
		jLabelIdHobbyCliente.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdHobbyCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdHobbyCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdHobbyCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdHobbyCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidHobbyCliente = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidHobbyCliente.setToolTipText(HobbyClienteConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutHobbyCliente= new GridBagLayout();

		this.jPanelidHobbyCliente.setLayout(this.gridaBagLayoutHobbyCliente);

		jLabelidHobbyCliente = new JLabel();
		jLabelidHobbyCliente.setText("Id");

		jLabelidHobbyCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidHobbyCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidHobbyCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabeldescripcionHobbyCliente = new JLabelMe();
		this.jLabeldescripcionHobbyCliente.setText(""+HobbyClienteConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionHobbyCliente.setToolTipText("Descripcion");
		this.jLabeldescripcionHobbyCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionHobbyCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionHobbyCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionHobbyCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionHobbyCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionHobbyCliente.setToolTipText(HobbyClienteConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutHobbyCliente = new GridBagLayout();
		this.jPaneldescripcionHobbyCliente.setLayout(this.gridaBagLayoutHobbyCliente);


		jTextAreadescripcionHobbyCliente= new JTextAreaMe();
		jTextAreadescripcionHobbyCliente.setEnabled(false);
		jTextAreadescripcionHobbyCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionHobbyCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionHobbyCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionHobbyCliente.setLineWrap(true);
		jTextAreadescripcionHobbyCliente.setWrapStyleWord(true);
		jTextAreadescripcionHobbyCliente.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionHobbyCliente.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionHobbyCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionHobbyCliente = new JScrollPane(jTextAreadescripcionHobbyCliente);
		jscrollPanedescripcionHobbyCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionHobbyCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionHobbyCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionHobbyClienteBusqueda= new JButtonMe();
		this.jButtondescripcionHobbyClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionHobbyClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionHobbyClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionHobbyClienteBusqueda.setText("U");
		this.jButtondescripcionHobbyClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionHobbyClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionHobbyClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionHobbyCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionHobbyCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionHobbyClienteBusqueda"));

		if(this.hobbyclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionHobbyClienteBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysHobbyCliente() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaHobbyCliente = new JLabelMe();
		this.jLabelid_empresaHobbyCliente.setText(""+HobbyClienteConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaHobbyCliente.setToolTipText("Empresa");
		this.jLabelid_empresaHobbyCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaHobbyCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaHobbyCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaHobbyCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaHobbyCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaHobbyCliente.setToolTipText(HobbyClienteConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutHobbyCliente = new GridBagLayout();
		this.jPanelid_empresaHobbyCliente.setLayout(this.gridaBagLayoutHobbyCliente);


		jComboBoxid_empresaHobbyCliente= new JComboBoxMe();
		jComboBoxid_empresaHobbyCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaHobbyCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaHobbyCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaHobbyCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaHobbyCliente.setEnabled(false);

		this.jButtonid_empresaHobbyCliente= new JButtonMe();
		this.jButtonid_empresaHobbyCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaHobbyCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaHobbyCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaHobbyCliente.setText("Buscar");
		this.jButtonid_empresaHobbyCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaHobbyCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaHobbyCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaHobbyCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaHobbyCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaHobbyCliente"));

		this.jButtonid_empresaHobbyClienteBusqueda= new JButtonMe();
		this.jButtonid_empresaHobbyClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaHobbyClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaHobbyClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaHobbyClienteBusqueda.setText("U");
		this.jButtonid_empresaHobbyClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaHobbyClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaHobbyClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaHobbyCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaHobbyCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaHobbyClienteBusqueda"));

		if(this.hobbyclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaHobbyClienteBusqueda.setVisible(false);		}

		this.jButtonid_empresaHobbyClienteUpdate= new JButtonMe();
		this.jButtonid_empresaHobbyClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaHobbyClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaHobbyClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaHobbyClienteUpdate.setText("U");
		this.jButtonid_empresaHobbyClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaHobbyClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaHobbyClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaHobbyCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaHobbyCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaHobbyClienteUpdate"));



					
		this.jLabelid_clienteHobbyCliente = new JLabelMe();
		this.jLabelid_clienteHobbyCliente.setText(""+HobbyClienteConstantesFunciones.LABEL_IDCLIENTE+" : *");
		this.jLabelid_clienteHobbyCliente.setToolTipText("Cliente");
		this.jLabelid_clienteHobbyCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteHobbyCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteHobbyCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_clienteHobbyCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_clienteHobbyCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_clienteHobbyCliente.setToolTipText(HobbyClienteConstantesFunciones.LABEL_IDCLIENTE);
		this.gridaBagLayoutHobbyCliente = new GridBagLayout();
		this.jPanelid_clienteHobbyCliente.setLayout(this.gridaBagLayoutHobbyCliente);


		jComboBoxid_clienteHobbyCliente= new JComboBoxMe();
		jComboBoxid_clienteHobbyCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteHobbyCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteHobbyCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteHobbyCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_clienteHobbyCliente= new JButtonMe();
		this.jButtonid_clienteHobbyCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteHobbyCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteHobbyCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteHobbyCliente.setText("Buscar");
		this.jButtonid_clienteHobbyCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_clienteHobbyCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteHobbyCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_clienteHobbyCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteHobbyCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteHobbyCliente"));

		this.jButtonid_clienteHobbyClienteBusqueda= new JButtonMe();
		this.jButtonid_clienteHobbyClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteHobbyClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteHobbyClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteHobbyClienteBusqueda.setText("U");
		this.jButtonid_clienteHobbyClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_clienteHobbyClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteHobbyClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_clienteHobbyCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteHobbyCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteHobbyClienteBusqueda"));

		if(this.hobbyclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_clienteHobbyClienteBusqueda.setVisible(false);		}

		this.jButtonid_clienteHobbyClienteUpdate= new JButtonMe();
		this.jButtonid_clienteHobbyClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteHobbyClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteHobbyClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteHobbyClienteUpdate.setText("U");
		this.jButtonid_clienteHobbyClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_clienteHobbyClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteHobbyClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_clienteHobbyCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteHobbyCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteHobbyClienteUpdate"));



					
		this.jLabelid_hobbyHobbyCliente = new JLabelMe();
		this.jLabelid_hobbyHobbyCliente.setText(""+HobbyClienteConstantesFunciones.LABEL_IDHOBBY+" : *");
		this.jLabelid_hobbyHobbyCliente.setToolTipText("Hobby");
		this.jLabelid_hobbyHobbyCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_hobbyHobbyCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_hobbyHobbyCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_hobbyHobbyCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_hobbyHobbyCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_hobbyHobbyCliente.setToolTipText(HobbyClienteConstantesFunciones.LABEL_IDHOBBY);
		this.gridaBagLayoutHobbyCliente = new GridBagLayout();
		this.jPanelid_hobbyHobbyCliente.setLayout(this.gridaBagLayoutHobbyCliente);


		jComboBoxid_hobbyHobbyCliente= new JComboBoxMe();
		jComboBoxid_hobbyHobbyCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_hobbyHobbyCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_hobbyHobbyCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_hobbyHobbyCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_hobbyHobbyCliente= new JButtonMe();
		this.jButtonid_hobbyHobbyCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_hobbyHobbyCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_hobbyHobbyCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_hobbyHobbyCliente.setText("Buscar");
		this.jButtonid_hobbyHobbyCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_hobbyHobbyCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_hobbyHobbyCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_hobbyHobbyCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_hobbyHobbyCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_hobbyHobbyCliente"));

		this.jButtonid_hobbyHobbyClienteBusqueda= new JButtonMe();
		this.jButtonid_hobbyHobbyClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_hobbyHobbyClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_hobbyHobbyClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_hobbyHobbyClienteBusqueda.setText("U");
		this.jButtonid_hobbyHobbyClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_hobbyHobbyClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_hobbyHobbyClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_hobbyHobbyCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_hobbyHobbyCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_hobbyHobbyClienteBusqueda"));

		if(this.hobbyclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_hobbyHobbyClienteBusqueda.setVisible(false);		}

		this.jButtonid_hobbyHobbyClienteUpdate= new JButtonMe();
		this.jButtonid_hobbyHobbyClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_hobbyHobbyClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_hobbyHobbyClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_hobbyHobbyClienteUpdate.setText("U");
		this.jButtonid_hobbyHobbyClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_hobbyHobbyClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_hobbyHobbyClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_hobbyHobbyCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_hobbyHobbyCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_hobbyHobbyClienteUpdate"));



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
		//this.jInternalFrameDetalleHobbyCliente = new HobbyClienteBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Hobby Cliente DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutHobbyCliente= new GridBagLayout();
		

		
		String sToolTipHobbyCliente="";
		sToolTipHobbyCliente=HobbyClienteConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipHobbyCliente+="(Cartera.HobbyCliente)";
		}
		
		if(!this.hobbyclienteSessionBean.getEsGuardarRelacionado()) {
			sToolTipHobbyCliente+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoHobbyCliente = new JButtonMe();
		this.jButtonModificarHobbyCliente = new JButtonMe();
        this.jButtonActualizarHobbyCliente = new JButtonMe();
        this.jButtonEliminarHobbyCliente = new JButtonMe();
        this.jButtonCancelarHobbyCliente = new JButtonMe();
        this.jButtonGuardarCambiosHobbyCliente = new JButtonMe();
		this.jButtonGuardarCambiosTablaHobbyCliente = new JButtonMe();
		this.jButtonCerrarHobbyCliente = new JButtonMe();
		
		this.jScrollPanelDatosHobbyCliente = new JScrollPane();   
        this.jScrollPanelDatosEdicionHobbyCliente = new JScrollPane();
		this.jScrollPanelDatosGeneralHobbyCliente = new JScrollPane();
				
		
		
		this.jPanelCamposHobbyCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosHobbyCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesHobbyCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioHobbyCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Hobby Cliente";
		
		if(!this.hobbyclienteSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosHobbyCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Hobby Clientes" + this.sPath));
		} else {
			this.jScrollPanelDatosHobbyCliente.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionHobbyCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralHobbyCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposHobbyCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposHobbyCliente.setName("jPanelCamposHobbyCliente"); 

		this.jPanelCamposOcultosHobbyCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosHobbyCliente.setName("jPanelCamposOcultosHobbyCliente"); 

        this.jPanelAccionesHobbyCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesHobbyCliente.setToolTipText("Acciones");
        this.jPanelAccionesHobbyCliente.setName("Acciones"); 

		this.jPanelAccionesFormularioHobbyCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioHobbyCliente.setToolTipText("Acciones");
        this.jPanelAccionesFormularioHobbyCliente.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionHobbyCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralHobbyCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosHobbyCliente, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposHobbyCliente, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosHobbyCliente, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioHobbyCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoHobbyCliente.setText("Nuevo");
		this.jButtonModificarHobbyCliente.setText("Editar");
        this.jButtonActualizarHobbyCliente.setText("Actualizar");
        this.jButtonEliminarHobbyCliente.setText("Eliminar");
        this.jButtonCancelarHobbyCliente.setText("Cancelar");
        this.jButtonGuardarCambiosHobbyCliente.setText("Guardar");
		this.jButtonGuardarCambiosTablaHobbyCliente.setText("Guardar");
		this.jButtonCerrarHobbyCliente.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoHobbyCliente,"nuevo_button","Nuevo",this.hobbyclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarHobbyCliente,"modificar_button","Editar",this.hobbyclienteSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarHobbyCliente,"actualizar_button","Actualizar",this.hobbyclienteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarHobbyCliente,"eliminar_button","Eliminar",this.hobbyclienteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarHobbyCliente,"cancelar_button","Cancelar",this.hobbyclienteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosHobbyCliente,"guardarcambios_button","Guardar",this.hobbyclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaHobbyCliente,"guardarcambiostabla_button","Guardar",this.hobbyclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarHobbyCliente,"cerrar_button","Salir",this.hobbyclienteSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoHobbyCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarHobbyCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosHobbyCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaHobbyCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarHobbyCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarHobbyCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarHobbyCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarHobbyCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoHobbyCliente.setToolTipText("Nuevo"+" "+HobbyClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarHobbyCliente.setToolTipText("Editar"+" "+HobbyClienteConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarHobbyCliente.setToolTipText("Actualizar"+" "+HobbyClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarHobbyCliente.setToolTipText("Eliminar)"+" "+HobbyClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarHobbyCliente.setToolTipText("Cancelar"+" "+HobbyClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosHobbyCliente.setToolTipText("Guardar"+" "+HobbyClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaHobbyCliente.setToolTipText("Guardar"+" "+HobbyClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarHobbyCliente.setToolTipText("Salir"+" "+HobbyClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoHobbyCliente";
		inputMap = this.jButtonNuevoHobbyCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoHobbyCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoHobbyCliente"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarHobbyCliente";
		inputMap = this.jButtonActualizarHobbyCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarHobbyCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarHobbyCliente"));
		
		//ELIMINAR
		sMapKey = "EliminarHobbyCliente";
		inputMap = this.jButtonEliminarHobbyCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarHobbyCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarHobbyCliente"));
		
		//CANCELAR	
		sMapKey = "CancelarHobbyCliente";
		inputMap = this.jButtonCancelarHobbyCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarHobbyCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarHobbyCliente"));
		
		//CERRAR		
		sMapKey = "CerrarHobbyCliente";
		inputMap = this.jButtonCerrarHobbyCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarHobbyCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarHobbyCliente"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaHobbyCliente";
		inputMap = this.jButtonGuardarCambiosTablaHobbyCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaHobbyCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaHobbyCliente"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoHobbyCliente = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoHobbyCliente.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoHobbyCliente.setToolTipText("Nuevo HobbyCliente");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoHobbyCliente, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarHobbyCliente = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarHobbyCliente.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarHobbyCliente.setToolTipText("Sin Cerrar Ventana HobbyCliente");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarHobbyCliente, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeHobbyCliente = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeHobbyCliente.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeHobbyCliente.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeHobbyCliente, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesHobbyCliente = new JComboBoxMe();
		//this.jComboBoxTiposAccionesHobbyCliente.setText("Accion");
		this.jComboBoxTiposAccionesHobbyCliente.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioHobbyCliente = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioHobbyCliente.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioHobbyCliente.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesHobbyCliente = new JLabelMe();
		
		this.jLabelAccionesHobbyCliente.setText("Acciones");		
		this.jLabelAccionesHobbyCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesHobbyCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesHobbyCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposHobbyCliente();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysHobbyCliente();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesHobbyCliente=new JTabbedPane();
		this.jTabbedPaneRelacionesHobbyCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesHobbyCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesHobbyCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesHobbyCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesHobbyCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesHobbyCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioHobbyCliente.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioHobbyCliente.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioHobbyCliente.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioHobbyCliente, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposHobbyCliente = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosHobbyCliente = new GridBagLayout();
		
		this.jPanelCamposHobbyCliente.setLayout(gridaBagLayoutCamposHobbyCliente);
		this.jPanelCamposOcultosHobbyCliente.setLayout(gridaBagLayoutCamposOcultosHobbyCliente);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
	this.gridBagConstraintsHobbyCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHobbyCliente.gridy = 0;
	this.gridBagConstraintsHobbyCliente.gridx = 0;
	this.gridBagConstraintsHobbyCliente.ipadx = 0;
	this.gridBagConstraintsHobbyCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidHobbyCliente.add(jLabelIdHobbyCliente, this.gridBagConstraintsHobbyCliente);



	this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
	this.gridBagConstraintsHobbyCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHobbyCliente.gridy = 0;
	this.gridBagConstraintsHobbyCliente.gridx = 1;
	this.gridBagConstraintsHobbyCliente.ipadx = 0;
	this.gridBagConstraintsHobbyCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidHobbyCliente.add(jLabelidHobbyCliente, this.gridBagConstraintsHobbyCliente);


	this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
	this.gridBagConstraintsHobbyCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHobbyCliente.gridy = 0;
	this.gridBagConstraintsHobbyCliente.gridx = 0;
	this.gridBagConstraintsHobbyCliente.ipadx = 0;
	this.gridBagConstraintsHobbyCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaHobbyCliente.add(jLabelid_empresaHobbyCliente, this.gridBagConstraintsHobbyCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
		//this.gridBagConstraintsHobbyCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHobbyCliente.gridy = 0;
		this.gridBagConstraintsHobbyCliente.gridx = 2;
		this.gridBagConstraintsHobbyCliente.ipadx = 0;
		this.gridBagConstraintsHobbyCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaHobbyCliente.add(jButtonid_empresaHobbyClienteBusqueda, this.gridBagConstraintsHobbyCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
		//this.gridBagConstraintsHobbyCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHobbyCliente.gridy = 0;
		this.gridBagConstraintsHobbyCliente.gridx = 3;
		this.gridBagConstraintsHobbyCliente.ipadx = 0;
		this.gridBagConstraintsHobbyCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaHobbyCliente.add(jButtonid_empresaHobbyClienteUpdate, this.gridBagConstraintsHobbyCliente);
	}

	this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
	this.gridBagConstraintsHobbyCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHobbyCliente.gridy = 0;
	this.gridBagConstraintsHobbyCliente.gridx = 1;
	this.gridBagConstraintsHobbyCliente.ipadx = 0;
	this.gridBagConstraintsHobbyCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaHobbyCliente.add(jComboBoxid_empresaHobbyCliente, this.gridBagConstraintsHobbyCliente);


	this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
	this.gridBagConstraintsHobbyCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHobbyCliente.gridy = 0;
	this.gridBagConstraintsHobbyCliente.gridx = 0;
	this.gridBagConstraintsHobbyCliente.ipadx = 0;
	this.gridBagConstraintsHobbyCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_clienteHobbyCliente.add(jLabelid_clienteHobbyCliente, this.gridBagConstraintsHobbyCliente);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
	//this.gridBagConstraintsHobbyCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHobbyCliente.gridy = 0;
	this.gridBagConstraintsHobbyCliente.gridx = 2;
	this.gridBagConstraintsHobbyCliente.ipadx = 0;
	this.gridBagConstraintsHobbyCliente.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_clienteHobbyCliente.add(jButtonid_clienteHobbyCliente, this.gridBagConstraintsHobbyCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
		//this.gridBagConstraintsHobbyCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHobbyCliente.gridy = 0;
		this.gridBagConstraintsHobbyCliente.gridx = 3;
		this.gridBagConstraintsHobbyCliente.ipadx = 0;
		this.gridBagConstraintsHobbyCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteHobbyCliente.add(jButtonid_clienteHobbyClienteBusqueda, this.gridBagConstraintsHobbyCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
		//this.gridBagConstraintsHobbyCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHobbyCliente.gridy = 0;
		this.gridBagConstraintsHobbyCliente.gridx = 4;
		this.gridBagConstraintsHobbyCliente.ipadx = 0;
		this.gridBagConstraintsHobbyCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteHobbyCliente.add(jButtonid_clienteHobbyClienteUpdate, this.gridBagConstraintsHobbyCliente);
	}

	this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
	this.gridBagConstraintsHobbyCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHobbyCliente.gridy = 0;
	this.gridBagConstraintsHobbyCliente.gridx = 1;
	this.gridBagConstraintsHobbyCliente.ipadx = 0;
	this.gridBagConstraintsHobbyCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_clienteHobbyCliente.add(jComboBoxid_clienteHobbyCliente, this.gridBagConstraintsHobbyCliente);


	this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
	this.gridBagConstraintsHobbyCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHobbyCliente.gridy = 0;
	this.gridBagConstraintsHobbyCliente.gridx = 0;
	this.gridBagConstraintsHobbyCliente.ipadx = 0;
	this.gridBagConstraintsHobbyCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_hobbyHobbyCliente.add(jLabelid_hobbyHobbyCliente, this.gridBagConstraintsHobbyCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
		//this.gridBagConstraintsHobbyCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHobbyCliente.gridy = 0;
		this.gridBagConstraintsHobbyCliente.gridx = 2;
		this.gridBagConstraintsHobbyCliente.ipadx = 0;
		this.gridBagConstraintsHobbyCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_hobbyHobbyCliente.add(jButtonid_hobbyHobbyClienteBusqueda, this.gridBagConstraintsHobbyCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
		//this.gridBagConstraintsHobbyCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHobbyCliente.gridy = 0;
		this.gridBagConstraintsHobbyCliente.gridx = 3;
		this.gridBagConstraintsHobbyCliente.ipadx = 0;
		this.gridBagConstraintsHobbyCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_hobbyHobbyCliente.add(jButtonid_hobbyHobbyClienteUpdate, this.gridBagConstraintsHobbyCliente);
	}

	this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
	this.gridBagConstraintsHobbyCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHobbyCliente.gridy = 0;
	this.gridBagConstraintsHobbyCliente.gridx = 1;
	this.gridBagConstraintsHobbyCliente.ipadx = 0;
	this.gridBagConstraintsHobbyCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_hobbyHobbyCliente.add(jComboBoxid_hobbyHobbyCliente, this.gridBagConstraintsHobbyCliente);


	this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
	this.gridBagConstraintsHobbyCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHobbyCliente.gridy = 0;
	this.gridBagConstraintsHobbyCliente.gridx = 0;
	this.gridBagConstraintsHobbyCliente.ipadx = 0;
	this.gridBagConstraintsHobbyCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionHobbyCliente.add(jLabeldescripcionHobbyCliente, this.gridBagConstraintsHobbyCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
		//this.gridBagConstraintsHobbyCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHobbyCliente.gridy = 0;
		this.gridBagConstraintsHobbyCliente.gridx = 2;
		this.gridBagConstraintsHobbyCliente.ipadx = 0;
		this.gridBagConstraintsHobbyCliente.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionHobbyCliente.add(jButtondescripcionHobbyClienteBusqueda, this.gridBagConstraintsHobbyCliente);
	}

	this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
	this.gridBagConstraintsHobbyCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHobbyCliente.gridy = 0;
	this.gridBagConstraintsHobbyCliente.gridx = 1;
	this.gridBagConstraintsHobbyCliente.ipadx = 0;
	this.gridBagConstraintsHobbyCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionHobbyCliente.add(jscrollPanedescripcionHobbyCliente, this.gridBagConstraintsHobbyCliente);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
	this.gridBagConstraintsHobbyCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsHobbyCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsHobbyCliente.gridy = iYPanelCamposHobbyCliente;
	this.gridBagConstraintsHobbyCliente.gridx = iXPanelCamposHobbyCliente++;
	this.gridBagConstraintsHobbyCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsHobbyCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposHobbyCliente.add(this.jPanelidHobbyCliente, this.gridBagConstraintsHobbyCliente);



	if(iXPanelCamposHobbyCliente % 1==0) {
		iXPanelCamposHobbyCliente=0;
		iYPanelCamposHobbyCliente++;
	}
	this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
	this.gridBagConstraintsHobbyCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsHobbyCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsHobbyCliente.gridy = iYPanelCamposHobbyCliente;
	this.gridBagConstraintsHobbyCliente.gridx = iXPanelCamposHobbyCliente++;
	this.gridBagConstraintsHobbyCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsHobbyCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposHobbyCliente.add(this.jPanelid_clienteHobbyCliente, this.gridBagConstraintsHobbyCliente);



	if(iXPanelCamposHobbyCliente % 1==0) {
		iXPanelCamposHobbyCliente=0;
		iYPanelCamposHobbyCliente++;
	}
	this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
	this.gridBagConstraintsHobbyCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsHobbyCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsHobbyCliente.gridy = iYPanelCamposHobbyCliente;
	this.gridBagConstraintsHobbyCliente.gridx = iXPanelCamposHobbyCliente++;
	this.gridBagConstraintsHobbyCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsHobbyCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposHobbyCliente.add(this.jPanelid_hobbyHobbyCliente, this.gridBagConstraintsHobbyCliente);



	if(iXPanelCamposHobbyCliente % 1==0) {
		iXPanelCamposHobbyCliente=0;
		iYPanelCamposHobbyCliente++;
	}
	this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
	this.gridBagConstraintsHobbyCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsHobbyCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsHobbyCliente.gridy = iYPanelCamposHobbyCliente;
	this.gridBagConstraintsHobbyCliente.gridx = iXPanelCamposHobbyCliente++;
	this.gridBagConstraintsHobbyCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsHobbyCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposHobbyCliente.add(this.jPaneldescripcionHobbyCliente, this.gridBagConstraintsHobbyCliente);



	if(iXPanelCamposHobbyCliente % 1==0) {
		iXPanelCamposHobbyCliente=0;
		iYPanelCamposHobbyCliente++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
	this.gridBagConstraintsHobbyCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsHobbyCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsHobbyCliente.gridy = iYPanelCamposOcultosHobbyCliente;
	this.gridBagConstraintsHobbyCliente.gridx = iXPanelCamposOcultosHobbyCliente++;
	this.gridBagConstraintsHobbyCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsHobbyCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosHobbyCliente.add(this.jPanelid_empresaHobbyCliente, this.gridBagConstraintsHobbyCliente);



	if(iXPanelCamposOcultosHobbyCliente % 1==0) {
		iXPanelCamposOcultosHobbyCliente=0;
		iYPanelCamposOcultosHobbyCliente++;
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
			
		GridBagLayout gridaBagLayoutAccionesHobbyCliente= new GridBagLayout();
		this.jPanelAccionesHobbyCliente.setLayout(gridaBagLayoutAccionesHobbyCliente);
		
		GridBagLayout gridaBagLayoutAccionesFormularioHobbyCliente= new GridBagLayout();
		this.jPanelAccionesFormularioHobbyCliente.setLayout(gridaBagLayoutAccionesFormularioHobbyCliente);
		
		this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
		this.gridBagConstraintsHobbyCliente.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsHobbyCliente.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioHobbyCliente.add(this.jComboBoxTiposAccionesFormularioHobbyCliente, this.gridBagConstraintsHobbyCliente);

		this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
		this.gridBagConstraintsHobbyCliente.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsHobbyCliente.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioHobbyCliente.add(this.jCheckBoxPostAccionNuevoHobbyCliente, this.gridBagConstraintsHobbyCliente);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.hobbyclienteSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
			this.gridBagConstraintsHobbyCliente.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsHobbyCliente.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioHobbyCliente.add(this.jCheckBoxPostAccionSinCerrarHobbyCliente, this.gridBagConstraintsHobbyCliente);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.hobbyclienteSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.hobbyclienteSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
			this.gridBagConstraintsHobbyCliente.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsHobbyCliente.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioHobbyCliente.add(this.jCheckBoxPostAccionSinMensajeHobbyCliente, this.gridBagConstraintsHobbyCliente);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
		this.gridBagConstraintsHobbyCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHobbyCliente.gridy = 0;
		this.gridBagConstraintsHobbyCliente.gridx = iPosXAccion++;
			
		this.jPanelAccionesHobbyCliente.add(this.jButtonModificarHobbyCliente, this.gridBagConstraintsHobbyCliente);							

		this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
		this.gridBagConstraintsHobbyCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHobbyCliente.gridy = 0;
		this.gridBagConstraintsHobbyCliente.gridx =iPosXAccion++;
			
		this.jPanelAccionesHobbyCliente.add(this.jButtonEliminarHobbyCliente, this.gridBagConstraintsHobbyCliente);
		
			
		this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
		this.gridBagConstraintsHobbyCliente.gridy = 0;		
		this.gridBagConstraintsHobbyCliente.gridx = iPosXAccion++;
		
		this.jPanelAccionesHobbyCliente.add(this.jButtonActualizarHobbyCliente, this.gridBagConstraintsHobbyCliente);


		this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
		this.gridBagConstraintsHobbyCliente.gridy = 0;		
		this.gridBagConstraintsHobbyCliente.gridx = iPosXAccion++;
		
		this.jPanelAccionesHobbyCliente.add(this.jButtonGuardarCambiosHobbyCliente, this.gridBagConstraintsHobbyCliente);	
		
		this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
		this.gridBagConstraintsHobbyCliente.gridy = 0;		
		this.gridBagConstraintsHobbyCliente.gridx =iPosXAccion++;
		
		this.jPanelAccionesHobbyCliente.add(this.jButtonCancelarHobbyCliente, this.gridBagConstraintsHobbyCliente);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutHobbyCliente = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutHobbyCliente);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.hobbyclienteSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsHobbyCliente = new GridBagConstraints();						
			this.gridBagConstraintsHobbyCliente.gridy = iGridyPrincipal++;
			this.gridBagConstraintsHobbyCliente.gridx = 0;		
			//this.gridBagConstraintsHobbyCliente.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHobbyCliente.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsHobbyCliente.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
		this.gridBagConstraintsHobbyCliente.gridy =iGridyPrincipal++;
		this.gridBagConstraintsHobbyCliente.gridx =0;
		this.gridBagConstraintsHobbyCliente.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsHobbyCliente.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosHobbyCliente, this.gridBagConstraintsHobbyCliente);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(HobbyClienteJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleHobbyCliente = new HobbyClienteBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Hobby Cliente DATOS");
			
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
			
	        //this.setTitle("[FOR] - Hobby Cliente DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Hobby Cliente Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			HobbyClienteModel hobbyclienteModel=new HobbyClienteModel(this);
			
			//SI USARA CLASE INTERNA
			//HobbyClienteModel.HobbyClienteFocusTraversalPolicy hobbyclienteFocusTraversalPolicy = hobbyclienteModel.new HobbyClienteFocusTraversalPolicy(this);
			
			//hobbyclienteFocusTraversalPolicy.sethobbyclienteJInternalFrame(this);
			
			this.setFocusTraversalPolicy(hobbyclienteModel);
			
			
			this.jContentPaneDetalleHobbyCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleHobbyCliente = new GridBagLayout();	
			this.jContentPaneDetalleHobbyCliente.setLayout(gridaBagLayoutDetalleHobbyCliente);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosHobbyCliente = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
				this.gridBagConstraintsHobbyCliente.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsHobbyCliente.gridx = 0;
					
				
				this.jContentPaneDetalleHobbyCliente.add(jTtoolBarDetalleHobbyCliente, gridBagConstraintsHobbyCliente);								
				
}
			
			this.jScrollPanelDatosEdicionHobbyCliente=   new JScrollPane(jContentPaneDetalleHobbyCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionHobbyCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionHobbyCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionHobbyCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralHobbyCliente=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralHobbyCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralHobbyCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralHobbyCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
			
			
	        this.gridBagConstraintsHobbyCliente.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsHobbyCliente.gridx = 0;
	        
			this.jContentPaneDetalleHobbyCliente.add(jPanelCamposHobbyCliente, gridBagConstraintsHobbyCliente);
			
			
			
			
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
						&& hobbyclienteSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.hobbyclienteSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsHobbyCliente= new GridBagConstraints();
						this.gridBagConstraintsHobbyCliente.gridy = iGridyRelaciones++;
						this.gridBagConstraintsHobbyCliente.gridx = 0;
						this.jContentPaneDetalleHobbyCliente.add(this.jTabbedPaneRelacionesHobbyCliente, this.gridBagConstraintsHobbyCliente);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesHobbyCliente.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosHobbyCliente.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
					this.gridBagConstraintsHobbyCliente.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsHobbyCliente.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsHobbyCliente.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsHobbyCliente.gridx = 0;
					
				
					this.jContentPaneDetalleHobbyCliente.add(jPanelCamposOcultosHobbyCliente, gridBagConstraintsHobbyCliente);
				
					this.jPanelCamposOcultosHobbyCliente.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
			this.gridBagConstraintsHobbyCliente.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsHobbyCliente.gridx = 0;
	        this.gridBagConstraintsHobbyCliente.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleHobbyCliente.add(this.jPanelAccionesFormularioHobbyCliente, this.gridBagConstraintsHobbyCliente);							
			
			
			
			this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
	        this.gridBagConstraintsHobbyCliente.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsHobbyCliente.gridx = 0;
	        
			
			this.jContentPaneDetalleHobbyCliente.add(this.jPanelAccionesHobbyCliente, this.gridBagConstraintsHobbyCliente);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionHobbyCliente);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionHobbyCliente=   new JScrollPane(this.jPanelCamposHobbyCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionHobbyCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionHobbyCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionHobbyCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
			this.gridBagConstraintsHobbyCliente.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsHobbyCliente.gridx = 0;
			this.gridBagConstraintsHobbyCliente.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsHobbyCliente.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsHobbyCliente.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionHobbyCliente, this.gridBagConstraintsHobbyCliente);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
			this.gridBagConstraintsHobbyCliente.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsHobbyCliente.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioHobbyCliente, this.gridBagConstraintsHobbyCliente);			
			
			this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
			this.gridBagConstraintsHobbyCliente.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsHobbyCliente.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesHobbyCliente, this.gridBagConstraintsHobbyCliente);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
		this.gridBagConstraintsHobbyCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsHobbyCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposHobbyCliente, this.gridBagConstraintsHobbyCliente);
			
			
		this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
		this.gridBagConstraintsHobbyCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsHobbyCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosHobbyCliente, this.gridBagConstraintsHobbyCliente);
		
			
		this.gridBagConstraintsHobbyCliente = new GridBagConstraints();
		this.gridBagConstraintsHobbyCliente.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsHobbyCliente.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesHobbyCliente, this.gridBagConstraintsHobbyCliente);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralHobbyCliente;//jContentPane;
		
		return jScrollPanelDatosEdicionHobbyCliente;
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
