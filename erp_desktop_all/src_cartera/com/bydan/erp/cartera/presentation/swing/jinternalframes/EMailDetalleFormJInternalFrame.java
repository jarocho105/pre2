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
import com.bydan.erp.cartera.util.EMailConstantesFunciones;

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
public class EMailDetalleFormJInternalFrame extends EMailBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleEMail;
	
	protected JMenuBar jmenuBarDetalleEMail;
	
	protected JMenu jmenuDetalleEMail;
	protected JMenu jmenuDetalleArchivoEMail;
	protected JMenu jmenuDetalleAccionesEMail;
	protected JMenu jmenuDetalleDatosEMail;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleEMail = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEMail;	
	protected GridBagConstraints gridBagConstraintsEMail;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected EMailBeanSwingJInternalFrameAdditional jInternalFrameDetalleEMail;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";
	
	public EMailSessionBean emailSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public ClienteSessionBean clienteSessionBean;	
	
	public EMailLogic emailLogic;
	
	public JScrollPane jScrollPanelDatosEMail;
	public JScrollPane jScrollPanelDatosEdicionEMail;
	public JScrollPane jScrollPanelDatosGeneralEMail;
	
	protected JPanel jPanelCamposEMail;    
	protected JPanel jPanelCamposOcultosEMail;    	
	protected JPanel jPanelAccionesEMail;
	protected JPanel jPanelAccionesFormularioEMail;
    
	
	
	protected Integer iXPanelCamposEMail=0;
	protected Integer iYPanelCamposEMail=0;
	
	protected Integer iXPanelCamposOcultosEMail=0;
	protected Integer iYPanelCamposOcultosEMail=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoEMail;
	public JButton jButtonModificarEMail;
	public JButton jButtonActualizarEMail;
    public JButton jButtonEliminarEMail;
	public JButton jButtonCancelarEMail;
    public JButton jButtonGuardarCambiosEMail;
	public JButton jButtonGuardarCambiosTablaEMail;
	protected JButton jButtonCerrarEMail;
	
	
	protected JButton jButtonProcesarInformacionEMail;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoEMail;
	protected JCheckBox jCheckBoxPostAccionSinCerrarEMail;
	protected JCheckBox jCheckBoxPostAccionSinMensajeEMail;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEMail;
	protected JButton jButtonModificarToolBarEMail;
	protected JButton jButtonActualizarToolBarEMail;
    protected JButton jButtonEliminarToolBarEMail;
	protected JButton jButtonCancelarToolBarEMail;
    protected JButton jButtonGuardarCambiosToolBarEMail;
	protected JButton jButtonGuardarCambiosTablaToolBarEMail;
	protected JButton jButtonMostrarOcultarTablaToolBarEMail;
	protected JButton jButtonCerrarToolBarEMail;
	
	protected JButton jButtonProcesarInformacionToolBarEMail;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEMail;
	protected JMenuItem jMenuItemModificarEMail;
	protected JMenuItem jMenuItemActualizarEMail;
    protected JMenuItem jMenuItemEliminarEMail;
	protected JMenuItem jMenuItemCancelarEMail;
    protected JMenuItem jMenuItemGuardarCambiosEMail;
	protected JMenuItem jMenuItemGuardarCambiosTablaEMail;
	protected JMenuItem jMenuItemCerrarEMail;
	protected JMenuItem jMenuItemDetalleCerrarEMail;
	protected JMenuItem jMenuItemDetalleMostarOcultarEMail;
	
	protected JMenuItem jMenuItemProcesarInformacionEMail;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEMail;
	protected JMenuItem jMenuItemMostrarOcultarEMail;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEMail;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEMail;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEMail;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioEMail;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidEMail;
	public JLabel jLabelIdEMail;
	public JLabel jLabelidEMail;
	public JButton jButtonidEMailBusqueda= new JButtonMe();

	public JPanel jPanele_mailEMail;
	public JLabel jLabele_mailEMail;
	public JTextArea jTextAreae_mailEMail;
	public JScrollPane jscrollPanee_mailEMail;
	public JButton jButtone_mailEMailBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionEMail;
	public JLabel jLabeldescripcionEMail;
	public JTextArea jTextAreadescripcionEMail;
	public JScrollPane jscrollPanedescripcionEMail;
	public JButton jButtondescripcionEMailBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaEMail;
	public JLabel jLabelid_empresaEMail;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaEMail;
	public JButton jButtonid_empresaEMail= new JButtonMe();
	public JButton jButtonid_empresaEMailUpdate= new JButtonMe();
	public JButton jButtonid_empresaEMailBusqueda= new JButtonMe();

	public JPanel jPanelid_clienteEMail;
	public JLabel jLabelid_clienteEMail;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteEMail;
	public JButton jButtonid_clienteEMail= new JButtonMe();
	public JButton jButtonid_clienteEMailUpdate= new JButtonMe();
	public JButton jButtonid_clienteEMailBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesEMail;
	
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
	
	public EMailDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposEMail=new JPanel();
				this.jPanelAccionesFormularioEMail=new JPanel();
				this.jmenuBarDetalleEMail=new JMenuBar();
				this.jTtoolBarDetalleEMail=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EMailDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("EMail No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public EMailDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("EMail No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EMailDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EMail No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EMailDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EMail No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EMailDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EMail No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarEMail() {
		return this.jButtonActualizarToolBarEMail;
	}
	
	public JButton getjButtonEliminarToolBarEMail() {
		return this.jButtonEliminarToolBarEMail;
	}
	
	public JButton getjButtonCancelarToolBarEMail() {
		return this.jButtonCancelarToolBarEMail;
	}		
	
	public JButton getjButtonProcesarInformacionEMail() {
		return this.jButtonProcesarInformacionEMail;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEMail)	{
		this.jButtonProcesarInformacionEMail = jButtonProcesarInformacionEMail;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEMail() {
		return this.jComboBoxTiposAccionesEMail;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEMail(
			JComboBox jComboBoxTiposRelacionesEMail) {
		this.jComboBoxTiposRelacionesEMail = jComboBoxTiposRelacionesEMail;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEMail(
			JComboBox jComboBoxTiposAccionesEMail) {
		this.jComboBoxTiposAccionesEMail = jComboBoxTiposAccionesEMail;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioEMail() {
		return this.jComboBoxTiposAccionesFormularioEMail;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioEMail(
			JComboBox jComboBoxTiposAccionesFormularioEMail) {
		this.jComboBoxTiposAccionesFormularioEMail = jComboBoxTiposAccionesFormularioEMail;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.emailSessionBean=new EMailSessionBean();
		
		this.emailSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.emailSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.emailSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EMailJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EMailJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EMailJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"E Mail MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.emailSessionBean.getEsGuardarRelacionado()) {
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
	
		EMailJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleEMail= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarEMail=new JButtonMe();
				this.jButtonModificarToolBarEMail=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarEMail=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarEMail,this.jTtoolBarDetalleEMail,
							"actualizar","actualizar","Actualizar"+" "+EMailConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarEMail=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarEMail,this.jTtoolBarDetalleEMail,
							"eliminar","eliminar","Eliminar"+" "+EMailConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarEMail=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarEMail,this.jTtoolBarDetalleEMail,
							"cancelar","cancelar","Cancelar"+" "+EMailConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarEMail=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarEMail,this.jTtoolBarDetalleEMail,
							"guardarcambios","guardarcambios","Guardar"+" "+EMailConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarEMail,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarEMail,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarEMail,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleEMail=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleEMail=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoEMail=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesEMail=new JMenuMe("Acciones");
		this.jmenuDetalleDatosEMail=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEMail= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEMail.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEMail,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEMail, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarEMail= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarEMail.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarEMail,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarEMail, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarEMail= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarEMail.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarEMail,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarEMail, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarEMail= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarEMail.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarEMail,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarEMail, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarEMail= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarEMail.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarEMail,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarEMail, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosEMail= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEMail.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEMail,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEMail, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEMail= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEMail.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEMail,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEMail, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarEMail= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarEMail.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarEMail,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarEMail, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEMail= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEMail.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEMail,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEMail, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEMail= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEMail.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEMail,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEMail, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoEMail.add(this.jMenuItemDetalleCerrarEMail);
		
		this.jmenuDetalleAccionesEMail.add(this.jMenuItemActualizarEMail);
		this.jmenuDetalleAccionesEMail.add(this.jMenuItemEliminarEMail);
		this.jmenuDetalleAccionesEMail.add(this.jMenuItemCancelarEMail);		
		
		//this.jmenuDetalleDatosEMail.add(this.jMenuItemDetalleAbrirOrderByEMail);				
		this.jmenuDetalleDatosEMail.add(this.jMenuItemDetalleMostarOcultarEMail);				
				
		//this.jmenuDetalleAccionesEMail.add(this.jMenuItemGuardarCambiosEMail);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoEMail, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesEMail, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosEMail, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleEMail.add(this.jmenuDetalleArchivoEMail);		
		this.jmenuBarDetalleEMail.add(this.jmenuDetalleAccionesEMail);		
		this.jmenuBarDetalleEMail.add(this.jmenuDetalleDatosEMail);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleEMail);				
	}
	
	
	public void inicializarElementosCamposEMail() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdEMail = new JLabelMe();
		jLabelIdEMail.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdEMail.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEMail.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEMail.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdEMail,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidEMail = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidEMail.setToolTipText(EMailConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutEMail= new GridBagLayout();

		this.jPanelidEMail.setLayout(this.gridaBagLayoutEMail);

		jLabelidEMail = new JLabel();
		jLabelidEMail.setText("Id");

		jLabelidEMail.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidEMail.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidEMail.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabele_mailEMail = new JLabelMe();
		this.jLabele_mailEMail.setText(""+EMailConstantesFunciones.LABEL_EMAIL+" : *");
		this.jLabele_mailEMail.setToolTipText("E Mail");
		this.jLabele_mailEMail.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabele_mailEMail.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabele_mailEMail.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabele_mailEMail,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanele_mailEMail=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanele_mailEMail.setToolTipText(EMailConstantesFunciones.LABEL_EMAIL);
		this.gridaBagLayoutEMail = new GridBagLayout();
		this.jPanele_mailEMail.setLayout(this.gridaBagLayoutEMail);


		jTextAreae_mailEMail= new JTextAreaMe();
		jTextAreae_mailEMail.setEnabled(false);
		jTextAreae_mailEMail.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreae_mailEMail.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreae_mailEMail.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreae_mailEMail.setLineWrap(true);
		jTextAreae_mailEMail.setWrapStyleWord(true);
		jTextAreae_mailEMail.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreae_mailEMail.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreae_mailEMail,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanee_mailEMail = new JScrollPane(jTextAreae_mailEMail);
		jscrollPanee_mailEMail.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanee_mailEMail.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanee_mailEMail.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtone_mailEMailBusqueda= new JButtonMe();
		this.jButtone_mailEMailBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtone_mailEMailBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtone_mailEMailBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtone_mailEMailBusqueda.setText("U");
		this.jButtone_mailEMailBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtone_mailEMailBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtone_mailEMailBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreae_mailEMail.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreae_mailEMail.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"e_mailEMailBusqueda"));

		if(this.emailSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtone_mailEMailBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionEMail = new JLabelMe();
		this.jLabeldescripcionEMail.setText(""+EMailConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionEMail.setToolTipText("Descripcion");
		this.jLabeldescripcionEMail.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionEMail.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionEMail.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionEMail,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionEMail=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionEMail.setToolTipText(EMailConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutEMail = new GridBagLayout();
		this.jPaneldescripcionEMail.setLayout(this.gridaBagLayoutEMail);


		jTextAreadescripcionEMail= new JTextAreaMe();
		jTextAreadescripcionEMail.setEnabled(false);
		jTextAreadescripcionEMail.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionEMail.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionEMail.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionEMail.setLineWrap(true);
		jTextAreadescripcionEMail.setWrapStyleWord(true);
		jTextAreadescripcionEMail.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionEMail.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionEMail,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionEMail = new JScrollPane(jTextAreadescripcionEMail);
		jscrollPanedescripcionEMail.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionEMail.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionEMail.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondescripcionEMailBusqueda= new JButtonMe();
		this.jButtondescripcionEMailBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionEMailBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionEMailBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionEMailBusqueda.setText("U");
		this.jButtondescripcionEMailBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionEMailBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionEMailBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionEMail.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionEMail.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionEMailBusqueda"));

		if(this.emailSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionEMailBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysEMail() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaEMail = new JLabelMe();
		this.jLabelid_empresaEMail.setText(""+EMailConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaEMail.setToolTipText("Empresa");
		this.jLabelid_empresaEMail.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaEMail.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaEMail.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaEMail,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaEMail=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaEMail.setToolTipText(EMailConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutEMail = new GridBagLayout();
		this.jPanelid_empresaEMail.setLayout(this.gridaBagLayoutEMail);


		jComboBoxid_empresaEMail= new JComboBoxMe();
		jComboBoxid_empresaEMail.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaEMail.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaEMail.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaEMail,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaEMail.setEnabled(false);

		this.jButtonid_empresaEMail= new JButtonMe();
		this.jButtonid_empresaEMail.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaEMail.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaEMail.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaEMail.setText("Buscar");
		this.jButtonid_empresaEMail.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaEMail.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaEMail,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaEMail.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaEMail.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaEMail"));

		this.jButtonid_empresaEMailBusqueda= new JButtonMe();
		this.jButtonid_empresaEMailBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEMailBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEMailBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaEMailBusqueda.setText("U");
		this.jButtonid_empresaEMailBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaEMailBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaEMailBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaEMail.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaEMail.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaEMailBusqueda"));

		if(this.emailSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaEMailBusqueda.setVisible(false);		}

		this.jButtonid_empresaEMailUpdate= new JButtonMe();
		this.jButtonid_empresaEMailUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEMailUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEMailUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaEMailUpdate.setText("U");
		this.jButtonid_empresaEMailUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaEMailUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaEMailUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaEMail.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaEMail.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaEMailUpdate"));



					
		this.jLabelid_clienteEMail = new JLabelMe();
		this.jLabelid_clienteEMail.setText(""+EMailConstantesFunciones.LABEL_IDCLIENTE+" : *");
		this.jLabelid_clienteEMail.setToolTipText("Cliente");
		this.jLabelid_clienteEMail.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteEMail.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteEMail.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_clienteEMail,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_clienteEMail=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_clienteEMail.setToolTipText(EMailConstantesFunciones.LABEL_IDCLIENTE);
		this.gridaBagLayoutEMail = new GridBagLayout();
		this.jPanelid_clienteEMail.setLayout(this.gridaBagLayoutEMail);


		jComboBoxid_clienteEMail= new JComboBoxMe();
		jComboBoxid_clienteEMail.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteEMail.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteEMail.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteEMail,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_clienteEMail= new JButtonMe();
		this.jButtonid_clienteEMail.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteEMail.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteEMail.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteEMail.setText("Buscar");
		this.jButtonid_clienteEMail.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_clienteEMail.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteEMail,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_clienteEMail.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteEMail.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteEMail"));

		this.jButtonid_clienteEMailBusqueda= new JButtonMe();
		this.jButtonid_clienteEMailBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteEMailBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteEMailBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteEMailBusqueda.setText("U");
		this.jButtonid_clienteEMailBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_clienteEMailBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteEMailBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_clienteEMail.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteEMail.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteEMailBusqueda"));

		if(this.emailSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_clienteEMailBusqueda.setVisible(false);		}

		this.jButtonid_clienteEMailUpdate= new JButtonMe();
		this.jButtonid_clienteEMailUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteEMailUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteEMailUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteEMailUpdate.setText("U");
		this.jButtonid_clienteEMailUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_clienteEMailUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteEMailUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_clienteEMail.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteEMail.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteEMailUpdate"));



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
		//this.jInternalFrameDetalleEMail = new EMailBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("E Mail DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEMail= new GridBagLayout();
		

		
		String sToolTipEMail="";
		sToolTipEMail=EMailConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEMail+="(Cartera.EMail)";
		}
		
		if(!this.emailSessionBean.getEsGuardarRelacionado()) {
			sToolTipEMail+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoEMail = new JButtonMe();
		this.jButtonModificarEMail = new JButtonMe();
        this.jButtonActualizarEMail = new JButtonMe();
        this.jButtonEliminarEMail = new JButtonMe();
        this.jButtonCancelarEMail = new JButtonMe();
        this.jButtonGuardarCambiosEMail = new JButtonMe();
		this.jButtonGuardarCambiosTablaEMail = new JButtonMe();
		this.jButtonCerrarEMail = new JButtonMe();
		
		this.jScrollPanelDatosEMail = new JScrollPane();   
        this.jScrollPanelDatosEdicionEMail = new JScrollPane();
		this.jScrollPanelDatosGeneralEMail = new JScrollPane();
				
		
		
		this.jPanelCamposEMail = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosEMail = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesEMail = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioEMail = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: E Mail";
		
		if(!this.emailSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEMail.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos E Mailes" + this.sPath));
		} else {
			this.jScrollPanelDatosEMail.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionEMail.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralEMail.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposEMail.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposEMail.setName("jPanelCamposEMail"); 

		this.jPanelCamposOcultosEMail.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosEMail.setName("jPanelCamposOcultosEMail"); 

        this.jPanelAccionesEMail.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEMail.setToolTipText("Acciones");
        this.jPanelAccionesEMail.setName("Acciones"); 

		this.jPanelAccionesFormularioEMail.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioEMail.setToolTipText("Acciones");
        this.jPanelAccionesFormularioEMail.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionEMail, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEMail, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEMail, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposEMail, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosEMail, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioEMail, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoEMail.setText("Nuevo");
		this.jButtonModificarEMail.setText("Editar");
        this.jButtonActualizarEMail.setText("Actualizar");
        this.jButtonEliminarEMail.setText("Eliminar");
        this.jButtonCancelarEMail.setText("Cancelar");
        this.jButtonGuardarCambiosEMail.setText("Guardar");
		this.jButtonGuardarCambiosTablaEMail.setText("Guardar");
		this.jButtonCerrarEMail.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEMail,"nuevo_button","Nuevo",this.emailSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarEMail,"modificar_button","Editar",this.emailSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarEMail,"actualizar_button","Actualizar",this.emailSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarEMail,"eliminar_button","Eliminar",this.emailSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarEMail,"cancelar_button","Cancelar",this.emailSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosEMail,"guardarcambios_button","Guardar",this.emailSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEMail,"guardarcambiostabla_button","Guardar",this.emailSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEMail,"cerrar_button","Salir",this.emailSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEMail, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarEMail, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosEMail, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEMail, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEMail, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarEMail, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarEMail, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarEMail, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoEMail.setToolTipText("Nuevo"+" "+EMailConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarEMail.setToolTipText("Editar"+" "+EMailConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarEMail.setToolTipText("Actualizar"+" "+EMailConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarEMail.setToolTipText("Eliminar)"+" "+EMailConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarEMail.setToolTipText("Cancelar"+" "+EMailConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosEMail.setToolTipText("Guardar"+" "+EMailConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaEMail.setToolTipText("Guardar"+" "+EMailConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEMail.setToolTipText("Salir"+" "+EMailConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEMail";
		inputMap = this.jButtonNuevoEMail.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEMail.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEMail"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarEMail";
		inputMap = this.jButtonActualizarEMail.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarEMail.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarEMail"));
		
		//ELIMINAR
		sMapKey = "EliminarEMail";
		inputMap = this.jButtonEliminarEMail.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarEMail.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarEMail"));
		
		//CANCELAR	
		sMapKey = "CancelarEMail";
		inputMap = this.jButtonCancelarEMail.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarEMail.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarEMail"));
		
		//CERRAR		
		sMapKey = "CerrarEMail";
		inputMap = this.jButtonCerrarEMail.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEMail.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEMail"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEMail";
		inputMap = this.jButtonGuardarCambiosTablaEMail.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEMail.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEMail"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoEMail = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoEMail.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoEMail.setToolTipText("Nuevo EMail");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoEMail, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarEMail = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarEMail.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarEMail.setToolTipText("Sin Cerrar Ventana EMail");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarEMail, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeEMail = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeEMail.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeEMail.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeEMail, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesEMail = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEMail.setText("Accion");
		this.jComboBoxTiposAccionesEMail.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioEMail = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioEMail.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioEMail.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesEMail = new JLabelMe();
		
		this.jLabelAccionesEMail.setText("Acciones");		
		this.jLabelAccionesEMail.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEMail.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEMail.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposEMail();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysEMail();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesEMail=new JTabbedPane();
		this.jTabbedPaneRelacionesEMail.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesEMail,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesEMail.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEMail.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEMail.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEMail, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioEMail.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEMail.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEMail.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioEMail, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposEMail = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosEMail = new GridBagLayout();
		
		this.jPanelCamposEMail.setLayout(gridaBagLayoutCamposEMail);
		this.jPanelCamposOcultosEMail.setLayout(gridaBagLayoutCamposOcultosEMail);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsEMail = new GridBagConstraints();
	this.gridBagConstraintsEMail.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEMail.gridy = 0;
	this.gridBagConstraintsEMail.gridx = 0;
	this.gridBagConstraintsEMail.ipadx = 0;
	this.gridBagConstraintsEMail.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidEMail.add(jLabelIdEMail, this.gridBagConstraintsEMail);



	this.gridBagConstraintsEMail = new GridBagConstraints();
	this.gridBagConstraintsEMail.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEMail.gridy = 0;
	this.gridBagConstraintsEMail.gridx = 1;
	this.gridBagConstraintsEMail.ipadx = 0;
	this.gridBagConstraintsEMail.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidEMail.add(jLabelidEMail, this.gridBagConstraintsEMail);


	this.gridBagConstraintsEMail = new GridBagConstraints();
	this.gridBagConstraintsEMail.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEMail.gridy = 0;
	this.gridBagConstraintsEMail.gridx = 0;
	this.gridBagConstraintsEMail.ipadx = 0;
	this.gridBagConstraintsEMail.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaEMail.add(jLabelid_empresaEMail, this.gridBagConstraintsEMail);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEMail = new GridBagConstraints();
		//this.gridBagConstraintsEMail.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEMail.gridy = 0;
		this.gridBagConstraintsEMail.gridx = 2;
		this.gridBagConstraintsEMail.ipadx = 0;
		this.gridBagConstraintsEMail.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaEMail.add(jButtonid_empresaEMailBusqueda, this.gridBagConstraintsEMail);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEMail = new GridBagConstraints();
		//this.gridBagConstraintsEMail.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEMail.gridy = 0;
		this.gridBagConstraintsEMail.gridx = 3;
		this.gridBagConstraintsEMail.ipadx = 0;
		this.gridBagConstraintsEMail.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaEMail.add(jButtonid_empresaEMailUpdate, this.gridBagConstraintsEMail);
	}

	this.gridBagConstraintsEMail = new GridBagConstraints();
	this.gridBagConstraintsEMail.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEMail.gridy = 0;
	this.gridBagConstraintsEMail.gridx = 1;
	this.gridBagConstraintsEMail.ipadx = 0;
	this.gridBagConstraintsEMail.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaEMail.add(jComboBoxid_empresaEMail, this.gridBagConstraintsEMail);


	this.gridBagConstraintsEMail = new GridBagConstraints();
	this.gridBagConstraintsEMail.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEMail.gridy = 0;
	this.gridBagConstraintsEMail.gridx = 0;
	this.gridBagConstraintsEMail.ipadx = 0;
	this.gridBagConstraintsEMail.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_clienteEMail.add(jLabelid_clienteEMail, this.gridBagConstraintsEMail);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsEMail = new GridBagConstraints();
	//this.gridBagConstraintsEMail.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEMail.gridy = 0;
	this.gridBagConstraintsEMail.gridx = 2;
	this.gridBagConstraintsEMail.ipadx = 0;
	this.gridBagConstraintsEMail.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_clienteEMail.add(jButtonid_clienteEMail, this.gridBagConstraintsEMail);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEMail = new GridBagConstraints();
		//this.gridBagConstraintsEMail.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEMail.gridy = 0;
		this.gridBagConstraintsEMail.gridx = 3;
		this.gridBagConstraintsEMail.ipadx = 0;
		this.gridBagConstraintsEMail.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteEMail.add(jButtonid_clienteEMailBusqueda, this.gridBagConstraintsEMail);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEMail = new GridBagConstraints();
		//this.gridBagConstraintsEMail.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEMail.gridy = 0;
		this.gridBagConstraintsEMail.gridx = 4;
		this.gridBagConstraintsEMail.ipadx = 0;
		this.gridBagConstraintsEMail.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteEMail.add(jButtonid_clienteEMailUpdate, this.gridBagConstraintsEMail);
	}

	this.gridBagConstraintsEMail = new GridBagConstraints();
	this.gridBagConstraintsEMail.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEMail.gridy = 0;
	this.gridBagConstraintsEMail.gridx = 1;
	this.gridBagConstraintsEMail.ipadx = 0;
	this.gridBagConstraintsEMail.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_clienteEMail.add(jComboBoxid_clienteEMail, this.gridBagConstraintsEMail);


	this.gridBagConstraintsEMail = new GridBagConstraints();
	this.gridBagConstraintsEMail.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEMail.gridy = 0;
	this.gridBagConstraintsEMail.gridx = 0;
	this.gridBagConstraintsEMail.ipadx = 0;
	this.gridBagConstraintsEMail.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanele_mailEMail.add(jLabele_mailEMail, this.gridBagConstraintsEMail);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEMail = new GridBagConstraints();
		//this.gridBagConstraintsEMail.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEMail.gridy = 0;
		this.gridBagConstraintsEMail.gridx = 2;
		this.gridBagConstraintsEMail.ipadx = 0;
		this.gridBagConstraintsEMail.insets = new Insets(0, 0, 0, 0);
		this.jPanele_mailEMail.add(jButtone_mailEMailBusqueda, this.gridBagConstraintsEMail);
	}

	this.gridBagConstraintsEMail = new GridBagConstraints();
	this.gridBagConstraintsEMail.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEMail.gridy = 0;
	this.gridBagConstraintsEMail.gridx = 1;
	this.gridBagConstraintsEMail.ipadx = 0;
	this.gridBagConstraintsEMail.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanele_mailEMail.add(jscrollPanee_mailEMail, this.gridBagConstraintsEMail);


	this.gridBagConstraintsEMail = new GridBagConstraints();
	this.gridBagConstraintsEMail.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEMail.gridy = 0;
	this.gridBagConstraintsEMail.gridx = 0;
	this.gridBagConstraintsEMail.ipadx = 0;
	this.gridBagConstraintsEMail.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionEMail.add(jLabeldescripcionEMail, this.gridBagConstraintsEMail);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEMail = new GridBagConstraints();
		//this.gridBagConstraintsEMail.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEMail.gridy = 0;
		this.gridBagConstraintsEMail.gridx = 2;
		this.gridBagConstraintsEMail.ipadx = 0;
		this.gridBagConstraintsEMail.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionEMail.add(jButtondescripcionEMailBusqueda, this.gridBagConstraintsEMail);
	}

	this.gridBagConstraintsEMail = new GridBagConstraints();
	this.gridBagConstraintsEMail.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEMail.gridy = 0;
	this.gridBagConstraintsEMail.gridx = 1;
	this.gridBagConstraintsEMail.ipadx = 0;
	this.gridBagConstraintsEMail.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionEMail.add(jscrollPanedescripcionEMail, this.gridBagConstraintsEMail);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsEMail = new GridBagConstraints();
	this.gridBagConstraintsEMail.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEMail.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEMail.gridy = iYPanelCamposEMail;
	this.gridBagConstraintsEMail.gridx = iXPanelCamposEMail++;
	this.gridBagConstraintsEMail.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEMail.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEMail.add(this.jPanelidEMail, this.gridBagConstraintsEMail);



	if(iXPanelCamposEMail % 1==0) {
		iXPanelCamposEMail=0;
		iYPanelCamposEMail++;
	}
	this.gridBagConstraintsEMail = new GridBagConstraints();
	this.gridBagConstraintsEMail.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEMail.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEMail.gridy = iYPanelCamposEMail;
	this.gridBagConstraintsEMail.gridx = iXPanelCamposEMail++;
	this.gridBagConstraintsEMail.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEMail.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEMail.add(this.jPanelid_clienteEMail, this.gridBagConstraintsEMail);



	if(iXPanelCamposEMail % 1==0) {
		iXPanelCamposEMail=0;
		iYPanelCamposEMail++;
	}
	this.gridBagConstraintsEMail = new GridBagConstraints();
	this.gridBagConstraintsEMail.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEMail.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEMail.gridy = iYPanelCamposEMail;
	this.gridBagConstraintsEMail.gridx = iXPanelCamposEMail++;
	this.gridBagConstraintsEMail.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEMail.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEMail.add(this.jPanele_mailEMail, this.gridBagConstraintsEMail);



	if(iXPanelCamposEMail % 1==0) {
		iXPanelCamposEMail=0;
		iYPanelCamposEMail++;
	}
	this.gridBagConstraintsEMail = new GridBagConstraints();
	this.gridBagConstraintsEMail.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEMail.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEMail.gridy = iYPanelCamposEMail;
	this.gridBagConstraintsEMail.gridx = iXPanelCamposEMail++;
	this.gridBagConstraintsEMail.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEMail.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEMail.add(this.jPaneldescripcionEMail, this.gridBagConstraintsEMail);



	if(iXPanelCamposEMail % 1==0) {
		iXPanelCamposEMail=0;
		iYPanelCamposEMail++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsEMail = new GridBagConstraints();
	this.gridBagConstraintsEMail.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEMail.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEMail.gridy = iYPanelCamposOcultosEMail;
	this.gridBagConstraintsEMail.gridx = iXPanelCamposOcultosEMail++;
	this.gridBagConstraintsEMail.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEMail.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosEMail.add(this.jPanelid_empresaEMail, this.gridBagConstraintsEMail);



	if(iXPanelCamposOcultosEMail % 1==0) {
		iXPanelCamposOcultosEMail=0;
		iYPanelCamposOcultosEMail++;
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
			
		GridBagLayout gridaBagLayoutAccionesEMail= new GridBagLayout();
		this.jPanelAccionesEMail.setLayout(gridaBagLayoutAccionesEMail);
		
		GridBagLayout gridaBagLayoutAccionesFormularioEMail= new GridBagLayout();
		this.jPanelAccionesFormularioEMail.setLayout(gridaBagLayoutAccionesFormularioEMail);
		
		this.gridBagConstraintsEMail = new GridBagConstraints();
		this.gridBagConstraintsEMail.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEMail.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEMail.add(this.jComboBoxTiposAccionesFormularioEMail, this.gridBagConstraintsEMail);

		this.gridBagConstraintsEMail = new GridBagConstraints();
		this.gridBagConstraintsEMail.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEMail.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEMail.add(this.jCheckBoxPostAccionNuevoEMail, this.gridBagConstraintsEMail);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.emailSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsEMail = new GridBagConstraints();
			this.gridBagConstraintsEMail.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEMail.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEMail.add(this.jCheckBoxPostAccionSinCerrarEMail, this.gridBagConstraintsEMail);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.emailSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.emailSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsEMail = new GridBagConstraints();
			this.gridBagConstraintsEMail.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEMail.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEMail.add(this.jCheckBoxPostAccionSinMensajeEMail, this.gridBagConstraintsEMail);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsEMail = new GridBagConstraints();
		this.gridBagConstraintsEMail.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEMail.gridy = 0;
		this.gridBagConstraintsEMail.gridx = iPosXAccion++;
			
		this.jPanelAccionesEMail.add(this.jButtonModificarEMail, this.gridBagConstraintsEMail);							

		this.gridBagConstraintsEMail = new GridBagConstraints();
		this.gridBagConstraintsEMail.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEMail.gridy = 0;
		this.gridBagConstraintsEMail.gridx =iPosXAccion++;
			
		this.jPanelAccionesEMail.add(this.jButtonEliminarEMail, this.gridBagConstraintsEMail);
		
			
		this.gridBagConstraintsEMail = new GridBagConstraints();
		this.gridBagConstraintsEMail.gridy = 0;		
		this.gridBagConstraintsEMail.gridx = iPosXAccion++;
		
		this.jPanelAccionesEMail.add(this.jButtonActualizarEMail, this.gridBagConstraintsEMail);


		this.gridBagConstraintsEMail = new GridBagConstraints();
		this.gridBagConstraintsEMail.gridy = 0;		
		this.gridBagConstraintsEMail.gridx = iPosXAccion++;
		
		this.jPanelAccionesEMail.add(this.jButtonGuardarCambiosEMail, this.gridBagConstraintsEMail);	
		
		this.gridBagConstraintsEMail = new GridBagConstraints();
		this.gridBagConstraintsEMail.gridy = 0;		
		this.gridBagConstraintsEMail.gridx =iPosXAccion++;
		
		this.jPanelAccionesEMail.add(this.jButtonCancelarEMail, this.gridBagConstraintsEMail);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEMail = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEMail);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.emailSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEMail = new GridBagConstraints();						
			this.gridBagConstraintsEMail.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEMail.gridx = 0;		
			//this.gridBagConstraintsEMail.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEMail.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEMail.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsEMail = new GridBagConstraints();
		this.gridBagConstraintsEMail.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEMail.gridx =0;
		this.gridBagConstraintsEMail.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEMail.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEMail, this.gridBagConstraintsEMail);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(EMailJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleEMail = new EMailBeanSwingJInternalFrameAdditional();//JInternalFrameBase("E Mail DATOS");
			
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
			
	        //this.setTitle("[FOR] - E Mail DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"E Mail Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			EMailModel emailModel=new EMailModel(this);
			
			//SI USARA CLASE INTERNA
			//EMailModel.EMailFocusTraversalPolicy emailFocusTraversalPolicy = emailModel.new EMailFocusTraversalPolicy(this);
			
			//emailFocusTraversalPolicy.setemailJInternalFrame(this);
			
			this.setFocusTraversalPolicy(emailModel);
			
			
			this.jContentPaneDetalleEMail = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleEMail = new GridBagLayout();	
			this.jContentPaneDetalleEMail.setLayout(gridaBagLayoutDetalleEMail);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEMail = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsEMail = new GridBagConstraints();
				this.gridBagConstraintsEMail.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsEMail.gridx = 0;
					
				
				this.jContentPaneDetalleEMail.add(jTtoolBarDetalleEMail, gridBagConstraintsEMail);								
				
}
			
			this.jScrollPanelDatosEdicionEMail=   new JScrollPane(jContentPaneDetalleEMail,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEMail.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEMail.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEMail.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralEMail=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEMail.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEMail.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEMail.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEMail = new GridBagConstraints();
			
			
	        this.gridBagConstraintsEMail.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsEMail.gridx = 0;
	        
			this.jContentPaneDetalleEMail.add(jPanelCamposEMail, gridBagConstraintsEMail);
			
			
			
			
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
						&& emailSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.emailSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsEMail= new GridBagConstraints();
						this.gridBagConstraintsEMail.gridy = iGridyRelaciones++;
						this.gridBagConstraintsEMail.gridx = 0;
						this.jContentPaneDetalleEMail.add(this.jTabbedPaneRelacionesEMail, this.gridBagConstraintsEMail);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesEMail.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosEMail.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsEMail = new GridBagConstraints();
					this.gridBagConstraintsEMail.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsEMail.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsEMail.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsEMail.gridx = 0;
					
				
					this.jContentPaneDetalleEMail.add(jPanelCamposOcultosEMail, gridBagConstraintsEMail);
				
					this.jPanelCamposOcultosEMail.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsEMail = new GridBagConstraints();
			this.gridBagConstraintsEMail.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsEMail.gridx = 0;
	        this.gridBagConstraintsEMail.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleEMail.add(this.jPanelAccionesFormularioEMail, this.gridBagConstraintsEMail);							
			
			
			
			this.gridBagConstraintsEMail = new GridBagConstraints();
	        this.gridBagConstraintsEMail.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsEMail.gridx = 0;
	        
			
			this.jContentPaneDetalleEMail.add(this.jPanelAccionesEMail, this.gridBagConstraintsEMail);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionEMail);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionEMail=   new JScrollPane(this.jPanelCamposEMail,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEMail.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEMail.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEMail.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsEMail = new GridBagConstraints();
			this.gridBagConstraintsEMail.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsEMail.gridx = 0;
			this.gridBagConstraintsEMail.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsEMail.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsEMail.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionEMail, this.gridBagConstraintsEMail);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsEMail = new GridBagConstraints();
			this.gridBagConstraintsEMail.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEMail.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioEMail, this.gridBagConstraintsEMail);			
			
			this.gridBagConstraintsEMail = new GridBagConstraints();
			this.gridBagConstraintsEMail.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEMail.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesEMail, this.gridBagConstraintsEMail);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsEMail = new GridBagConstraints();
		this.gridBagConstraintsEMail.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEMail.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEMail, this.gridBagConstraintsEMail);
			
			
		this.gridBagConstraintsEMail = new GridBagConstraints();
		this.gridBagConstraintsEMail.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEMail.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEMail, this.gridBagConstraintsEMail);
		
			
		this.gridBagConstraintsEMail = new GridBagConstraints();
		this.gridBagConstraintsEMail.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEMail.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEMail, this.gridBagConstraintsEMail);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralEMail;//jContentPane;
		
		return jScrollPanelDatosEdicionEMail;
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
