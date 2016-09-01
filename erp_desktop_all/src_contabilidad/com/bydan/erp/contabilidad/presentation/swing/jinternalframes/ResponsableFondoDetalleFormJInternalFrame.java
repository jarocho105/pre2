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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.contabilidad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.contabilidad.util.ResponsableFondoConstantesFunciones;

import com.bydan.erp.contabilidad.business.logic.*;
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
public class ResponsableFondoDetalleFormJInternalFrame extends ResponsableFondoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleResponsableFondo;
	
	protected JMenuBar jmenuBarDetalleResponsableFondo;
	
	protected JMenu jmenuDetalleResponsableFondo;
	protected JMenu jmenuDetalleArchivoResponsableFondo;
	protected JMenu jmenuDetalleAccionesResponsableFondo;
	protected JMenu jmenuDetalleDatosResponsableFondo;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleResponsableFondo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutResponsableFondo;	
	protected GridBagConstraints gridBagConstraintsResponsableFondo;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ResponsableFondoBeanSwingJInternalFrameAdditional jInternalFrameDetalleResponsableFondo;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";
	
	public ResponsableFondoSessionBean responsablefondoSessionBean;
	
	

	public FacturaProveedorBeanSwingJInternalFrame facturaproveedorBeanSwingJInternalFrame=null;
	public FacturaProveedorBeanSwingJInternalFrame facturaproveedorBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteFacturaProveedor=false;
	public FacturaProveedorSessionBean facturaproveedorSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;	
	
	public ResponsableFondoLogic responsablefondoLogic;
	
	public JScrollPane jScrollPanelDatosResponsableFondo;
	public JScrollPane jScrollPanelDatosEdicionResponsableFondo;
	public JScrollPane jScrollPanelDatosGeneralResponsableFondo;
	
	protected JPanel jPanelCamposResponsableFondo;    
	protected JPanel jPanelCamposOcultosResponsableFondo;    	
	protected JPanel jPanelAccionesResponsableFondo;
	protected JPanel jPanelAccionesFormularioResponsableFondo;
    
	
	
	protected Integer iXPanelCamposResponsableFondo=0;
	protected Integer iYPanelCamposResponsableFondo=0;
	
	protected Integer iXPanelCamposOcultosResponsableFondo=0;
	protected Integer iYPanelCamposOcultosResponsableFondo=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoResponsableFondo;
	public JButton jButtonModificarResponsableFondo;
	public JButton jButtonActualizarResponsableFondo;
    public JButton jButtonEliminarResponsableFondo;
	public JButton jButtonCancelarResponsableFondo;
    public JButton jButtonGuardarCambiosResponsableFondo;
	public JButton jButtonGuardarCambiosTablaResponsableFondo;
	protected JButton jButtonCerrarResponsableFondo;
	
	
	protected JButton jButtonProcesarInformacionResponsableFondo;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoResponsableFondo;
	protected JCheckBox jCheckBoxPostAccionSinCerrarResponsableFondo;
	protected JCheckBox jCheckBoxPostAccionSinMensajeResponsableFondo;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarResponsableFondo;
	protected JButton jButtonModificarToolBarResponsableFondo;
	protected JButton jButtonActualizarToolBarResponsableFondo;
    protected JButton jButtonEliminarToolBarResponsableFondo;
	protected JButton jButtonCancelarToolBarResponsableFondo;
    protected JButton jButtonGuardarCambiosToolBarResponsableFondo;
	protected JButton jButtonGuardarCambiosTablaToolBarResponsableFondo;
	protected JButton jButtonMostrarOcultarTablaToolBarResponsableFondo;
	protected JButton jButtonCerrarToolBarResponsableFondo;
	
	protected JButton jButtonProcesarInformacionToolBarResponsableFondo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoResponsableFondo;
	protected JMenuItem jMenuItemModificarResponsableFondo;
	protected JMenuItem jMenuItemActualizarResponsableFondo;
    protected JMenuItem jMenuItemEliminarResponsableFondo;
	protected JMenuItem jMenuItemCancelarResponsableFondo;
    protected JMenuItem jMenuItemGuardarCambiosResponsableFondo;
	protected JMenuItem jMenuItemGuardarCambiosTablaResponsableFondo;
	protected JMenuItem jMenuItemCerrarResponsableFondo;
	protected JMenuItem jMenuItemDetalleCerrarResponsableFondo;
	protected JMenuItem jMenuItemDetalleMostarOcultarResponsableFondo;
	
	protected JMenuItem jMenuItemProcesarInformacionResponsableFondo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosResponsableFondo;
	protected JMenuItem jMenuItemMostrarOcultarResponsableFondo;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesResponsableFondo;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesResponsableFondo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesResponsableFondo;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioResponsableFondo;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidResponsableFondo;
	public JLabel jLabelIdResponsableFondo;
	public JLabel jLabelidResponsableFondo;
	public JButton jButtonidResponsableFondoBusqueda= new JButtonMe();

	public JPanel jPanelsecuencialResponsableFondo;
	public JLabel jLabelsecuencialResponsableFondo;
	public JTextField jTextFieldsecuencialResponsableFondo;
	public JButton jButtonsecuencialResponsableFondoBusqueda= new JButtonMe();

	public JPanel jPanelvalor_cajaResponsableFondo;
	public JLabel jLabelvalor_cajaResponsableFondo;
	public JTextField jTextFieldvalor_cajaResponsableFondo;
	public JButton jButtonvalor_cajaResponsableFondoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaResponsableFondo;
	public JLabel jLabelid_empresaResponsableFondo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaResponsableFondo;
	public JButton jButtonid_empresaResponsableFondo= new JButtonMe();
	public JButton jButtonid_empresaResponsableFondoUpdate= new JButtonMe();
	public JButton jButtonid_empresaResponsableFondoBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalResponsableFondo;
	public JLabel jLabelid_sucursalResponsableFondo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalResponsableFondo;
	public JButton jButtonid_sucursalResponsableFondo= new JButtonMe();
	public JButton jButtonid_sucursalResponsableFondoUpdate= new JButtonMe();
	public JButton jButtonid_sucursalResponsableFondoBusqueda= new JButtonMe();

	public JPanel jPanelid_empleadoResponsableFondo;
	public JLabel jLabelid_empleadoResponsableFondo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoResponsableFondo;
	public JButton jButtonid_empleadoResponsableFondo= new JButtonMe();
	public JButton jButtonid_empleadoResponsableFondoUpdate= new JButtonMe();
	public JButton jButtonid_empleadoResponsableFondoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesResponsableFondo;
	
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
	public int iHeightFormulario=286;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ResponsableFondoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposResponsableFondo=new JPanel();
				this.jPanelAccionesFormularioResponsableFondo=new JPanel();
				this.jmenuBarDetalleResponsableFondo=new JMenuBar();
				this.jTtoolBarDetalleResponsableFondo=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ResponsableFondoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ResponsableFondo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ResponsableFondoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ResponsableFondo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ResponsableFondoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ResponsableFondo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ResponsableFondoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ResponsableFondo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ResponsableFondoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ResponsableFondo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarResponsableFondo() {
		return this.jButtonActualizarToolBarResponsableFondo;
	}
	
	public JButton getjButtonEliminarToolBarResponsableFondo() {
		return this.jButtonEliminarToolBarResponsableFondo;
	}
	
	public JButton getjButtonCancelarToolBarResponsableFondo() {
		return this.jButtonCancelarToolBarResponsableFondo;
	}		
	
	public JButton getjButtonProcesarInformacionResponsableFondo() {
		return this.jButtonProcesarInformacionResponsableFondo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionResponsableFondo)	{
		this.jButtonProcesarInformacionResponsableFondo = jButtonProcesarInformacionResponsableFondo;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesResponsableFondo() {
		return this.jComboBoxTiposAccionesResponsableFondo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesResponsableFondo(
			JComboBox jComboBoxTiposRelacionesResponsableFondo) {
		this.jComboBoxTiposRelacionesResponsableFondo = jComboBoxTiposRelacionesResponsableFondo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesResponsableFondo(
			JComboBox jComboBoxTiposAccionesResponsableFondo) {
		this.jComboBoxTiposAccionesResponsableFondo = jComboBoxTiposAccionesResponsableFondo;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioResponsableFondo() {
		return this.jComboBoxTiposAccionesFormularioResponsableFondo;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioResponsableFondo(
			JComboBox jComboBoxTiposAccionesFormularioResponsableFondo) {
		this.jComboBoxTiposAccionesFormularioResponsableFondo = jComboBoxTiposAccionesFormularioResponsableFondo;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.responsablefondoSessionBean=new ResponsableFondoSessionBean();
		
		this.responsablefondoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.responsablefondoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.responsablefondoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.facturaproveedorSessionBean=new FacturaProveedorSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ResponsableFondoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ResponsableFondoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ResponsableFondoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Responsable Fondo Rotativo MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.responsablefondoSessionBean.getEsGuardarRelacionado()) {
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
	
		ResponsableFondoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleResponsableFondo= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarResponsableFondo=new JButtonMe();
				this.jButtonModificarToolBarResponsableFondo=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarResponsableFondo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarResponsableFondo,this.jTtoolBarDetalleResponsableFondo,
							"actualizar","actualizar","Actualizar"+" "+ResponsableFondoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarResponsableFondo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarResponsableFondo,this.jTtoolBarDetalleResponsableFondo,
							"eliminar","eliminar","Eliminar"+" "+ResponsableFondoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarResponsableFondo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarResponsableFondo,this.jTtoolBarDetalleResponsableFondo,
							"cancelar","cancelar","Cancelar"+" "+ResponsableFondoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarResponsableFondo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarResponsableFondo,this.jTtoolBarDetalleResponsableFondo,
							"guardarcambios","guardarcambios","Guardar"+" "+ResponsableFondoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarResponsableFondo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarResponsableFondo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarResponsableFondo,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleResponsableFondo=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleResponsableFondo=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoResponsableFondo=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesResponsableFondo=new JMenuMe("Acciones");
		this.jmenuDetalleDatosResponsableFondo=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoResponsableFondo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoResponsableFondo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoResponsableFondo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoResponsableFondo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarResponsableFondo= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarResponsableFondo.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarResponsableFondo,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarResponsableFondo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarResponsableFondo= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarResponsableFondo.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarResponsableFondo,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarResponsableFondo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarResponsableFondo= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarResponsableFondo.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarResponsableFondo,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarResponsableFondo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarResponsableFondo= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarResponsableFondo.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarResponsableFondo,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarResponsableFondo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosResponsableFondo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosResponsableFondo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosResponsableFondo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosResponsableFondo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarResponsableFondo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarResponsableFondo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarResponsableFondo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarResponsableFondo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarResponsableFondo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarResponsableFondo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarResponsableFondo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarResponsableFondo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarResponsableFondo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarResponsableFondo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarResponsableFondo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarResponsableFondo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarResponsableFondo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarResponsableFondo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarResponsableFondo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarResponsableFondo, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoResponsableFondo.add(this.jMenuItemDetalleCerrarResponsableFondo);
		
		this.jmenuDetalleAccionesResponsableFondo.add(this.jMenuItemActualizarResponsableFondo);
		this.jmenuDetalleAccionesResponsableFondo.add(this.jMenuItemEliminarResponsableFondo);
		this.jmenuDetalleAccionesResponsableFondo.add(this.jMenuItemCancelarResponsableFondo);		
		
		//this.jmenuDetalleDatosResponsableFondo.add(this.jMenuItemDetalleAbrirOrderByResponsableFondo);				
		this.jmenuDetalleDatosResponsableFondo.add(this.jMenuItemDetalleMostarOcultarResponsableFondo);				
				
		//this.jmenuDetalleAccionesResponsableFondo.add(this.jMenuItemGuardarCambiosResponsableFondo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoResponsableFondo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesResponsableFondo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosResponsableFondo, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleResponsableFondo.add(this.jmenuDetalleArchivoResponsableFondo);		
		this.jmenuBarDetalleResponsableFondo.add(this.jmenuDetalleAccionesResponsableFondo);		
		this.jmenuBarDetalleResponsableFondo.add(this.jmenuDetalleDatosResponsableFondo);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleResponsableFondo, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleResponsableFondo.add(this.jmenuDetalleResponsableFondo);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleResponsableFondo);				
	}
	
	
	public void inicializarElementosCamposResponsableFondo() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdResponsableFondo = new JLabelMe();
		jLabelIdResponsableFondo.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdResponsableFondo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdResponsableFondo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdResponsableFondo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdResponsableFondo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidResponsableFondo = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidResponsableFondo.setToolTipText(ResponsableFondoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutResponsableFondo= new GridBagLayout();

		this.jPanelidResponsableFondo.setLayout(this.gridaBagLayoutResponsableFondo);

		jLabelidResponsableFondo = new JLabel();
		jLabelidResponsableFondo.setText("Id");

		jLabelidResponsableFondo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidResponsableFondo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidResponsableFondo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelsecuencialResponsableFondo = new JLabelMe();
		this.jLabelsecuencialResponsableFondo.setText(""+ResponsableFondoConstantesFunciones.LABEL_SECUENCIAL+" : *");
		this.jLabelsecuencialResponsableFondo.setToolTipText("Secuencial");
		this.jLabelsecuencialResponsableFondo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsecuencialResponsableFondo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsecuencialResponsableFondo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsecuencialResponsableFondo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsecuencialResponsableFondo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsecuencialResponsableFondo.setToolTipText(ResponsableFondoConstantesFunciones.LABEL_SECUENCIAL);
		this.gridaBagLayoutResponsableFondo = new GridBagLayout();
		this.jPanelsecuencialResponsableFondo.setLayout(this.gridaBagLayoutResponsableFondo);


		jTextFieldsecuencialResponsableFondo= new JTextFieldMe();
		jTextFieldsecuencialResponsableFondo.setEnabled(false);
		jTextFieldsecuencialResponsableFondo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuencialResponsableFondo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuencialResponsableFondo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsecuencialResponsableFondo,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldsecuencialResponsableFondo.setText("0");

		this.jButtonsecuencialResponsableFondoBusqueda= new JButtonMe();
		this.jButtonsecuencialResponsableFondoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuencialResponsableFondoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuencialResponsableFondoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsecuencialResponsableFondoBusqueda.setText("U");
		this.jButtonsecuencialResponsableFondoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsecuencialResponsableFondoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsecuencialResponsableFondoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsecuencialResponsableFondo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsecuencialResponsableFondo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"secuencialResponsableFondoBusqueda"));

		if(this.responsablefondoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsecuencialResponsableFondoBusqueda.setVisible(false);		}


					
		this.jLabelvalor_cajaResponsableFondo = new JLabelMe();
		this.jLabelvalor_cajaResponsableFondo.setText(""+ResponsableFondoConstantesFunciones.LABEL_VALORCAJA+" : *");
		this.jLabelvalor_cajaResponsableFondo.setToolTipText("Valor Caja");
		this.jLabelvalor_cajaResponsableFondo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_cajaResponsableFondo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_cajaResponsableFondo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_cajaResponsableFondo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_cajaResponsableFondo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_cajaResponsableFondo.setToolTipText(ResponsableFondoConstantesFunciones.LABEL_VALORCAJA);
		this.gridaBagLayoutResponsableFondo = new GridBagLayout();
		this.jPanelvalor_cajaResponsableFondo.setLayout(this.gridaBagLayoutResponsableFondo);


		jTextFieldvalor_cajaResponsableFondo= new JTextFieldMe();
		jTextFieldvalor_cajaResponsableFondo.setEnabled(false);
		jTextFieldvalor_cajaResponsableFondo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_cajaResponsableFondo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_cajaResponsableFondo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_cajaResponsableFondo,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_cajaResponsableFondo.setText("0.0");

		this.jButtonvalor_cajaResponsableFondoBusqueda= new JButtonMe();
		this.jButtonvalor_cajaResponsableFondoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_cajaResponsableFondoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_cajaResponsableFondoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_cajaResponsableFondoBusqueda.setText("U");
		this.jButtonvalor_cajaResponsableFondoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_cajaResponsableFondoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_cajaResponsableFondoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_cajaResponsableFondo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_cajaResponsableFondo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_cajaResponsableFondoBusqueda"));

		if(this.responsablefondoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_cajaResponsableFondoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysResponsableFondo() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaResponsableFondo = new JLabelMe();
		this.jLabelid_empresaResponsableFondo.setText(""+ResponsableFondoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaResponsableFondo.setToolTipText("Empresa");
		this.jLabelid_empresaResponsableFondo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaResponsableFondo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaResponsableFondo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaResponsableFondo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaResponsableFondo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaResponsableFondo.setToolTipText(ResponsableFondoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutResponsableFondo = new GridBagLayout();
		this.jPanelid_empresaResponsableFondo.setLayout(this.gridaBagLayoutResponsableFondo);


		jComboBoxid_empresaResponsableFondo= new JComboBoxMe();
		jComboBoxid_empresaResponsableFondo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaResponsableFondo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaResponsableFondo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaResponsableFondo,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaResponsableFondo.setEnabled(false);

		this.jButtonid_empresaResponsableFondo= new JButtonMe();
		this.jButtonid_empresaResponsableFondo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaResponsableFondo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaResponsableFondo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaResponsableFondo.setText("Buscar");
		this.jButtonid_empresaResponsableFondo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaResponsableFondo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaResponsableFondo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaResponsableFondo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaResponsableFondo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaResponsableFondo"));

		this.jButtonid_empresaResponsableFondoBusqueda= new JButtonMe();
		this.jButtonid_empresaResponsableFondoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaResponsableFondoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaResponsableFondoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaResponsableFondoBusqueda.setText("U");
		this.jButtonid_empresaResponsableFondoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaResponsableFondoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaResponsableFondoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaResponsableFondo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaResponsableFondo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaResponsableFondoBusqueda"));

		if(this.responsablefondoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaResponsableFondoBusqueda.setVisible(false);		}

		this.jButtonid_empresaResponsableFondoUpdate= new JButtonMe();
		this.jButtonid_empresaResponsableFondoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaResponsableFondoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaResponsableFondoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaResponsableFondoUpdate.setText("U");
		this.jButtonid_empresaResponsableFondoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaResponsableFondoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaResponsableFondoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaResponsableFondo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaResponsableFondo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaResponsableFondoUpdate"));



					
		this.jLabelid_sucursalResponsableFondo = new JLabelMe();
		this.jLabelid_sucursalResponsableFondo.setText(""+ResponsableFondoConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalResponsableFondo.setToolTipText("Sucursal");
		this.jLabelid_sucursalResponsableFondo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalResponsableFondo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalResponsableFondo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalResponsableFondo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalResponsableFondo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalResponsableFondo.setToolTipText(ResponsableFondoConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutResponsableFondo = new GridBagLayout();
		this.jPanelid_sucursalResponsableFondo.setLayout(this.gridaBagLayoutResponsableFondo);


		jComboBoxid_sucursalResponsableFondo= new JComboBoxMe();
		jComboBoxid_sucursalResponsableFondo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalResponsableFondo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalResponsableFondo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalResponsableFondo,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalResponsableFondo.setEnabled(false);

		this.jButtonid_sucursalResponsableFondo= new JButtonMe();
		this.jButtonid_sucursalResponsableFondo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalResponsableFondo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalResponsableFondo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalResponsableFondo.setText("Buscar");
		this.jButtonid_sucursalResponsableFondo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalResponsableFondo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalResponsableFondo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalResponsableFondo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalResponsableFondo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalResponsableFondo"));

		this.jButtonid_sucursalResponsableFondoBusqueda= new JButtonMe();
		this.jButtonid_sucursalResponsableFondoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalResponsableFondoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalResponsableFondoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalResponsableFondoBusqueda.setText("U");
		this.jButtonid_sucursalResponsableFondoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalResponsableFondoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalResponsableFondoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalResponsableFondo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalResponsableFondo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalResponsableFondoBusqueda"));

		if(this.responsablefondoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalResponsableFondoBusqueda.setVisible(false);		}

		this.jButtonid_sucursalResponsableFondoUpdate= new JButtonMe();
		this.jButtonid_sucursalResponsableFondoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalResponsableFondoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalResponsableFondoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalResponsableFondoUpdate.setText("U");
		this.jButtonid_sucursalResponsableFondoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalResponsableFondoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalResponsableFondoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalResponsableFondo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalResponsableFondo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalResponsableFondoUpdate"));



					
		this.jLabelid_empleadoResponsableFondo = new JLabelMe();
		this.jLabelid_empleadoResponsableFondo.setText(""+ResponsableFondoConstantesFunciones.LABEL_IDEMPLEADO+" : *");
		this.jLabelid_empleadoResponsableFondo.setToolTipText("Empleado");
		this.jLabelid_empleadoResponsableFondo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoResponsableFondo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoResponsableFondo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-48),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoResponsableFondo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empleadoResponsableFondo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empleadoResponsableFondo.setToolTipText(ResponsableFondoConstantesFunciones.LABEL_IDEMPLEADO);
		this.gridaBagLayoutResponsableFondo = new GridBagLayout();
		this.jPanelid_empleadoResponsableFondo.setLayout(this.gridaBagLayoutResponsableFondo);


		jComboBoxid_empleadoResponsableFondo= new JComboBoxMe();
		jComboBoxid_empleadoResponsableFondo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoResponsableFondo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoResponsableFondo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoResponsableFondo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empleadoResponsableFondo= new JButtonMe();
		this.jButtonid_empleadoResponsableFondo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoResponsableFondo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoResponsableFondo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoResponsableFondo.setText("Buscar");
		this.jButtonid_empleadoResponsableFondo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empleadoResponsableFondo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoResponsableFondo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empleadoResponsableFondo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoResponsableFondo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoResponsableFondo"));

		this.jButtonid_empleadoResponsableFondoBusqueda= new JButtonMe();
		this.jButtonid_empleadoResponsableFondoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoResponsableFondoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoResponsableFondoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoResponsableFondoBusqueda.setText("U");
		this.jButtonid_empleadoResponsableFondoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empleadoResponsableFondoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoResponsableFondoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empleadoResponsableFondo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoResponsableFondo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoResponsableFondoBusqueda"));

		if(this.responsablefondoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empleadoResponsableFondoBusqueda.setVisible(false);		}

		this.jButtonid_empleadoResponsableFondoUpdate= new JButtonMe();
		this.jButtonid_empleadoResponsableFondoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoResponsableFondoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoResponsableFondoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoResponsableFondoUpdate.setText("U");
		this.jButtonid_empleadoResponsableFondoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empleadoResponsableFondoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoResponsableFondoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empleadoResponsableFondo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoResponsableFondo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoResponsableFondoUpdate"));



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
		//this.jInternalFrameDetalleResponsableFondo = new ResponsableFondoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Responsable Fondo Rotativo DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutResponsableFondo= new GridBagLayout();
		

		
		String sToolTipResponsableFondo="";
		sToolTipResponsableFondo=ResponsableFondoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipResponsableFondo+="(Contabilidad.ResponsableFondo)";
		}
		
		if(!this.responsablefondoSessionBean.getEsGuardarRelacionado()) {
			sToolTipResponsableFondo+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoResponsableFondo = new JButtonMe();
		this.jButtonModificarResponsableFondo = new JButtonMe();
        this.jButtonActualizarResponsableFondo = new JButtonMe();
        this.jButtonEliminarResponsableFondo = new JButtonMe();
        this.jButtonCancelarResponsableFondo = new JButtonMe();
        this.jButtonGuardarCambiosResponsableFondo = new JButtonMe();
		this.jButtonGuardarCambiosTablaResponsableFondo = new JButtonMe();
		this.jButtonCerrarResponsableFondo = new JButtonMe();
		
		this.jScrollPanelDatosResponsableFondo = new JScrollPane();   
        this.jScrollPanelDatosEdicionResponsableFondo = new JScrollPane();
		this.jScrollPanelDatosGeneralResponsableFondo = new JScrollPane();
				
		
		
		this.jPanelCamposResponsableFondo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosResponsableFondo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesResponsableFondo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioResponsableFondo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Responsable Fondo Rotativo";
		
		if(!this.responsablefondoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosResponsableFondo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Responsable Fondo Rotativos" + this.sPath));
		} else {
			this.jScrollPanelDatosResponsableFondo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionResponsableFondo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralResponsableFondo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposResponsableFondo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposResponsableFondo.setName("jPanelCamposResponsableFondo"); 

		this.jPanelCamposOcultosResponsableFondo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosResponsableFondo.setName("jPanelCamposOcultosResponsableFondo"); 

        this.jPanelAccionesResponsableFondo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesResponsableFondo.setToolTipText("Acciones");
        this.jPanelAccionesResponsableFondo.setName("Acciones"); 

		this.jPanelAccionesFormularioResponsableFondo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioResponsableFondo.setToolTipText("Acciones");
        this.jPanelAccionesFormularioResponsableFondo.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionResponsableFondo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralResponsableFondo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosResponsableFondo, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposResponsableFondo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosResponsableFondo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioResponsableFondo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoResponsableFondo.setText("Nuevo");
		this.jButtonModificarResponsableFondo.setText("Editar");
        this.jButtonActualizarResponsableFondo.setText("Actualizar");
        this.jButtonEliminarResponsableFondo.setText("Eliminar");
        this.jButtonCancelarResponsableFondo.setText("Cancelar");
        this.jButtonGuardarCambiosResponsableFondo.setText("Guardar");
		this.jButtonGuardarCambiosTablaResponsableFondo.setText("Guardar");
		this.jButtonCerrarResponsableFondo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoResponsableFondo,"nuevo_button","Nuevo",this.responsablefondoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarResponsableFondo,"modificar_button","Editar",this.responsablefondoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarResponsableFondo,"actualizar_button","Actualizar",this.responsablefondoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarResponsableFondo,"eliminar_button","Eliminar",this.responsablefondoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarResponsableFondo,"cancelar_button","Cancelar",this.responsablefondoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosResponsableFondo,"guardarcambios_button","Guardar",this.responsablefondoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaResponsableFondo,"guardarcambiostabla_button","Guardar",this.responsablefondoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarResponsableFondo,"cerrar_button","Salir",this.responsablefondoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoResponsableFondo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarResponsableFondo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosResponsableFondo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaResponsableFondo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarResponsableFondo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarResponsableFondo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarResponsableFondo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarResponsableFondo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoResponsableFondo.setToolTipText("Nuevo"+" "+ResponsableFondoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarResponsableFondo.setToolTipText("Editar"+" "+ResponsableFondoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarResponsableFondo.setToolTipText("Actualizar"+" "+ResponsableFondoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarResponsableFondo.setToolTipText("Eliminar)"+" "+ResponsableFondoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarResponsableFondo.setToolTipText("Cancelar"+" "+ResponsableFondoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosResponsableFondo.setToolTipText("Guardar"+" "+ResponsableFondoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaResponsableFondo.setToolTipText("Guardar"+" "+ResponsableFondoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarResponsableFondo.setToolTipText("Salir"+" "+ResponsableFondoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoResponsableFondo";
		inputMap = this.jButtonNuevoResponsableFondo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoResponsableFondo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoResponsableFondo"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarResponsableFondo";
		inputMap = this.jButtonActualizarResponsableFondo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarResponsableFondo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarResponsableFondo"));
		
		//ELIMINAR
		sMapKey = "EliminarResponsableFondo";
		inputMap = this.jButtonEliminarResponsableFondo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarResponsableFondo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarResponsableFondo"));
		
		//CANCELAR	
		sMapKey = "CancelarResponsableFondo";
		inputMap = this.jButtonCancelarResponsableFondo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarResponsableFondo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarResponsableFondo"));
		
		//CERRAR		
		sMapKey = "CerrarResponsableFondo";
		inputMap = this.jButtonCerrarResponsableFondo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarResponsableFondo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarResponsableFondo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaResponsableFondo";
		inputMap = this.jButtonGuardarCambiosTablaResponsableFondo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaResponsableFondo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaResponsableFondo"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoResponsableFondo = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoResponsableFondo.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoResponsableFondo.setToolTipText("Nuevo ResponsableFondo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoResponsableFondo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarResponsableFondo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarResponsableFondo.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarResponsableFondo.setToolTipText("Sin Cerrar Ventana ResponsableFondo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarResponsableFondo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeResponsableFondo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeResponsableFondo.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeResponsableFondo.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeResponsableFondo, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesResponsableFondo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesResponsableFondo.setText("Accion");
		this.jComboBoxTiposAccionesResponsableFondo.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioResponsableFondo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioResponsableFondo.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioResponsableFondo.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesResponsableFondo = new JLabelMe();
		
		this.jLabelAccionesResponsableFondo.setText("Acciones");		
		this.jLabelAccionesResponsableFondo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesResponsableFondo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesResponsableFondo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposResponsableFondo();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysResponsableFondo();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesResponsableFondo=new JTabbedPane();
		this.jTabbedPaneRelacionesResponsableFondo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesResponsableFondo,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesResponsableFondo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesResponsableFondo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesResponsableFondo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesResponsableFondo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioResponsableFondo.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioResponsableFondo.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioResponsableFondo.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioResponsableFondo, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposResponsableFondo = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosResponsableFondo = new GridBagLayout();
		
		this.jPanelCamposResponsableFondo.setLayout(gridaBagLayoutCamposResponsableFondo);
		this.jPanelCamposOcultosResponsableFondo.setLayout(gridaBagLayoutCamposOcultosResponsableFondo);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
	this.gridBagConstraintsResponsableFondo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResponsableFondo.gridy = 0;
	this.gridBagConstraintsResponsableFondo.gridx = 0;
	this.gridBagConstraintsResponsableFondo.ipadx = 0;
	this.gridBagConstraintsResponsableFondo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidResponsableFondo.add(jLabelIdResponsableFondo, this.gridBagConstraintsResponsableFondo);



	this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
	this.gridBagConstraintsResponsableFondo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResponsableFondo.gridy = 0;
	this.gridBagConstraintsResponsableFondo.gridx = 1;
	this.gridBagConstraintsResponsableFondo.ipadx = 0;
	this.gridBagConstraintsResponsableFondo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidResponsableFondo.add(jLabelidResponsableFondo, this.gridBagConstraintsResponsableFondo);


	this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
	this.gridBagConstraintsResponsableFondo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResponsableFondo.gridy = 0;
	this.gridBagConstraintsResponsableFondo.gridx = 0;
	this.gridBagConstraintsResponsableFondo.ipadx = 0;
	this.gridBagConstraintsResponsableFondo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaResponsableFondo.add(jLabelid_empresaResponsableFondo, this.gridBagConstraintsResponsableFondo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
		//this.gridBagConstraintsResponsableFondo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResponsableFondo.gridy = 0;
		this.gridBagConstraintsResponsableFondo.gridx = 2;
		this.gridBagConstraintsResponsableFondo.ipadx = 0;
		this.gridBagConstraintsResponsableFondo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaResponsableFondo.add(jButtonid_empresaResponsableFondoBusqueda, this.gridBagConstraintsResponsableFondo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
		//this.gridBagConstraintsResponsableFondo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResponsableFondo.gridy = 0;
		this.gridBagConstraintsResponsableFondo.gridx = 3;
		this.gridBagConstraintsResponsableFondo.ipadx = 0;
		this.gridBagConstraintsResponsableFondo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaResponsableFondo.add(jButtonid_empresaResponsableFondoUpdate, this.gridBagConstraintsResponsableFondo);
	}

	this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
	this.gridBagConstraintsResponsableFondo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResponsableFondo.gridy = 0;
	this.gridBagConstraintsResponsableFondo.gridx = 1;
	this.gridBagConstraintsResponsableFondo.ipadx = 0;
	this.gridBagConstraintsResponsableFondo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaResponsableFondo.add(jComboBoxid_empresaResponsableFondo, this.gridBagConstraintsResponsableFondo);


	this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
	this.gridBagConstraintsResponsableFondo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResponsableFondo.gridy = 0;
	this.gridBagConstraintsResponsableFondo.gridx = 0;
	this.gridBagConstraintsResponsableFondo.ipadx = 0;
	this.gridBagConstraintsResponsableFondo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalResponsableFondo.add(jLabelid_sucursalResponsableFondo, this.gridBagConstraintsResponsableFondo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
		//this.gridBagConstraintsResponsableFondo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResponsableFondo.gridy = 0;
		this.gridBagConstraintsResponsableFondo.gridx = 2;
		this.gridBagConstraintsResponsableFondo.ipadx = 0;
		this.gridBagConstraintsResponsableFondo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalResponsableFondo.add(jButtonid_sucursalResponsableFondoBusqueda, this.gridBagConstraintsResponsableFondo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
		//this.gridBagConstraintsResponsableFondo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResponsableFondo.gridy = 0;
		this.gridBagConstraintsResponsableFondo.gridx = 3;
		this.gridBagConstraintsResponsableFondo.ipadx = 0;
		this.gridBagConstraintsResponsableFondo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalResponsableFondo.add(jButtonid_sucursalResponsableFondoUpdate, this.gridBagConstraintsResponsableFondo);
	}

	this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
	this.gridBagConstraintsResponsableFondo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResponsableFondo.gridy = 0;
	this.gridBagConstraintsResponsableFondo.gridx = 1;
	this.gridBagConstraintsResponsableFondo.ipadx = 0;
	this.gridBagConstraintsResponsableFondo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalResponsableFondo.add(jComboBoxid_sucursalResponsableFondo, this.gridBagConstraintsResponsableFondo);


	this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
	this.gridBagConstraintsResponsableFondo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResponsableFondo.gridy = 0;
	this.gridBagConstraintsResponsableFondo.gridx = 0;
	this.gridBagConstraintsResponsableFondo.ipadx = 0;
	this.gridBagConstraintsResponsableFondo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empleadoResponsableFondo.add(jLabelid_empleadoResponsableFondo, this.gridBagConstraintsResponsableFondo);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
	//this.gridBagConstraintsResponsableFondo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResponsableFondo.gridy = 0;
	this.gridBagConstraintsResponsableFondo.gridx = 2;
	this.gridBagConstraintsResponsableFondo.ipadx = 0;
	this.gridBagConstraintsResponsableFondo.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_empleadoResponsableFondo.add(jButtonid_empleadoResponsableFondo, this.gridBagConstraintsResponsableFondo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
		//this.gridBagConstraintsResponsableFondo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResponsableFondo.gridy = 0;
		this.gridBagConstraintsResponsableFondo.gridx = 3;
		this.gridBagConstraintsResponsableFondo.ipadx = 0;
		this.gridBagConstraintsResponsableFondo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoResponsableFondo.add(jButtonid_empleadoResponsableFondoBusqueda, this.gridBagConstraintsResponsableFondo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
		//this.gridBagConstraintsResponsableFondo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResponsableFondo.gridy = 0;
		this.gridBagConstraintsResponsableFondo.gridx = 4;
		this.gridBagConstraintsResponsableFondo.ipadx = 0;
		this.gridBagConstraintsResponsableFondo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoResponsableFondo.add(jButtonid_empleadoResponsableFondoUpdate, this.gridBagConstraintsResponsableFondo);
	}

	this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
	this.gridBagConstraintsResponsableFondo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResponsableFondo.gridy = 0;
	this.gridBagConstraintsResponsableFondo.gridx = 1;
	this.gridBagConstraintsResponsableFondo.ipadx = 0;
	this.gridBagConstraintsResponsableFondo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empleadoResponsableFondo.add(jComboBoxid_empleadoResponsableFondo, this.gridBagConstraintsResponsableFondo);


	this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
	this.gridBagConstraintsResponsableFondo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResponsableFondo.gridy = 0;
	this.gridBagConstraintsResponsableFondo.gridx = 0;
	this.gridBagConstraintsResponsableFondo.ipadx = 0;
	this.gridBagConstraintsResponsableFondo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsecuencialResponsableFondo.add(jLabelsecuencialResponsableFondo, this.gridBagConstraintsResponsableFondo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
		//this.gridBagConstraintsResponsableFondo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResponsableFondo.gridy = 0;
		this.gridBagConstraintsResponsableFondo.gridx = 2;
		this.gridBagConstraintsResponsableFondo.ipadx = 0;
		this.gridBagConstraintsResponsableFondo.insets = new Insets(0, 0, 0, 0);
		this.jPanelsecuencialResponsableFondo.add(jButtonsecuencialResponsableFondoBusqueda, this.gridBagConstraintsResponsableFondo);
	}

	this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
	this.gridBagConstraintsResponsableFondo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResponsableFondo.gridy = 0;
	this.gridBagConstraintsResponsableFondo.gridx = 1;
	this.gridBagConstraintsResponsableFondo.ipadx = 0;
	this.gridBagConstraintsResponsableFondo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsecuencialResponsableFondo.add(jTextFieldsecuencialResponsableFondo, this.gridBagConstraintsResponsableFondo);


	this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
	this.gridBagConstraintsResponsableFondo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResponsableFondo.gridy = 0;
	this.gridBagConstraintsResponsableFondo.gridx = 0;
	this.gridBagConstraintsResponsableFondo.ipadx = 0;
	this.gridBagConstraintsResponsableFondo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_cajaResponsableFondo.add(jLabelvalor_cajaResponsableFondo, this.gridBagConstraintsResponsableFondo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
		//this.gridBagConstraintsResponsableFondo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResponsableFondo.gridy = 0;
		this.gridBagConstraintsResponsableFondo.gridx = 2;
		this.gridBagConstraintsResponsableFondo.ipadx = 0;
		this.gridBagConstraintsResponsableFondo.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_cajaResponsableFondo.add(jButtonvalor_cajaResponsableFondoBusqueda, this.gridBagConstraintsResponsableFondo);
	}

	this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
	this.gridBagConstraintsResponsableFondo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResponsableFondo.gridy = 0;
	this.gridBagConstraintsResponsableFondo.gridx = 1;
	this.gridBagConstraintsResponsableFondo.ipadx = 0;
	this.gridBagConstraintsResponsableFondo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_cajaResponsableFondo.add(jTextFieldvalor_cajaResponsableFondo, this.gridBagConstraintsResponsableFondo);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
	this.gridBagConstraintsResponsableFondo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsResponsableFondo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsResponsableFondo.gridy = iYPanelCamposResponsableFondo;
	this.gridBagConstraintsResponsableFondo.gridx = iXPanelCamposResponsableFondo++;
	this.gridBagConstraintsResponsableFondo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsResponsableFondo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposResponsableFondo.add(this.jPanelidResponsableFondo, this.gridBagConstraintsResponsableFondo);



	if(iXPanelCamposResponsableFondo % 1==0) {
		iXPanelCamposResponsableFondo=0;
		iYPanelCamposResponsableFondo++;
	}
	this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
	this.gridBagConstraintsResponsableFondo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsResponsableFondo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsResponsableFondo.gridy = iYPanelCamposResponsableFondo;
	this.gridBagConstraintsResponsableFondo.gridx = iXPanelCamposResponsableFondo++;
	this.gridBagConstraintsResponsableFondo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsResponsableFondo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposResponsableFondo.add(this.jPanelid_empleadoResponsableFondo, this.gridBagConstraintsResponsableFondo);



	if(iXPanelCamposResponsableFondo % 1==0) {
		iXPanelCamposResponsableFondo=0;
		iYPanelCamposResponsableFondo++;
	}
	this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
	this.gridBagConstraintsResponsableFondo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsResponsableFondo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsResponsableFondo.gridy = iYPanelCamposResponsableFondo;
	this.gridBagConstraintsResponsableFondo.gridx = iXPanelCamposResponsableFondo++;
	this.gridBagConstraintsResponsableFondo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsResponsableFondo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposResponsableFondo.add(this.jPanelsecuencialResponsableFondo, this.gridBagConstraintsResponsableFondo);



	if(iXPanelCamposResponsableFondo % 1==0) {
		iXPanelCamposResponsableFondo=0;
		iYPanelCamposResponsableFondo++;
	}
	this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
	this.gridBagConstraintsResponsableFondo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsResponsableFondo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsResponsableFondo.gridy = iYPanelCamposResponsableFondo;
	this.gridBagConstraintsResponsableFondo.gridx = iXPanelCamposResponsableFondo++;
	this.gridBagConstraintsResponsableFondo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsResponsableFondo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposResponsableFondo.add(this.jPanelvalor_cajaResponsableFondo, this.gridBagConstraintsResponsableFondo);



	if(iXPanelCamposResponsableFondo % 1==0) {
		iXPanelCamposResponsableFondo=0;
		iYPanelCamposResponsableFondo++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
	this.gridBagConstraintsResponsableFondo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsResponsableFondo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsResponsableFondo.gridy = iYPanelCamposOcultosResponsableFondo;
	this.gridBagConstraintsResponsableFondo.gridx = iXPanelCamposOcultosResponsableFondo++;
	this.gridBagConstraintsResponsableFondo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsResponsableFondo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosResponsableFondo.add(this.jPanelid_empresaResponsableFondo, this.gridBagConstraintsResponsableFondo);



	if(iXPanelCamposOcultosResponsableFondo % 1==0) {
		iXPanelCamposOcultosResponsableFondo=0;
		iYPanelCamposOcultosResponsableFondo++;
	}
	this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
	this.gridBagConstraintsResponsableFondo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsResponsableFondo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsResponsableFondo.gridy = iYPanelCamposOcultosResponsableFondo;
	this.gridBagConstraintsResponsableFondo.gridx = iXPanelCamposOcultosResponsableFondo++;
	this.gridBagConstraintsResponsableFondo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsResponsableFondo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosResponsableFondo.add(this.jPanelid_sucursalResponsableFondo, this.gridBagConstraintsResponsableFondo);



	if(iXPanelCamposOcultosResponsableFondo % 1==0) {
		iXPanelCamposOcultosResponsableFondo=0;
		iYPanelCamposOcultosResponsableFondo++;
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
			
		GridBagLayout gridaBagLayoutAccionesResponsableFondo= new GridBagLayout();
		this.jPanelAccionesResponsableFondo.setLayout(gridaBagLayoutAccionesResponsableFondo);
		
		GridBagLayout gridaBagLayoutAccionesFormularioResponsableFondo= new GridBagLayout();
		this.jPanelAccionesFormularioResponsableFondo.setLayout(gridaBagLayoutAccionesFormularioResponsableFondo);
		
		this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
		this.gridBagConstraintsResponsableFondo.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsResponsableFondo.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioResponsableFondo.add(this.jComboBoxTiposAccionesFormularioResponsableFondo, this.gridBagConstraintsResponsableFondo);

		this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
		this.gridBagConstraintsResponsableFondo.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsResponsableFondo.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioResponsableFondo.add(this.jCheckBoxPostAccionNuevoResponsableFondo, this.gridBagConstraintsResponsableFondo);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.responsablefondoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
			this.gridBagConstraintsResponsableFondo.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsResponsableFondo.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioResponsableFondo.add(this.jCheckBoxPostAccionSinCerrarResponsableFondo, this.gridBagConstraintsResponsableFondo);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.responsablefondoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.responsablefondoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
			this.gridBagConstraintsResponsableFondo.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsResponsableFondo.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioResponsableFondo.add(this.jCheckBoxPostAccionSinMensajeResponsableFondo, this.gridBagConstraintsResponsableFondo);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
		this.gridBagConstraintsResponsableFondo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsResponsableFondo.gridy = 0;
		this.gridBagConstraintsResponsableFondo.gridx = iPosXAccion++;
			
		this.jPanelAccionesResponsableFondo.add(this.jButtonModificarResponsableFondo, this.gridBagConstraintsResponsableFondo);							

		this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
		this.gridBagConstraintsResponsableFondo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsResponsableFondo.gridy = 0;
		this.gridBagConstraintsResponsableFondo.gridx =iPosXAccion++;
			
		this.jPanelAccionesResponsableFondo.add(this.jButtonEliminarResponsableFondo, this.gridBagConstraintsResponsableFondo);
		
			
		this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
		this.gridBagConstraintsResponsableFondo.gridy = 0;		
		this.gridBagConstraintsResponsableFondo.gridx = iPosXAccion++;
		
		this.jPanelAccionesResponsableFondo.add(this.jButtonActualizarResponsableFondo, this.gridBagConstraintsResponsableFondo);


		this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
		this.gridBagConstraintsResponsableFondo.gridy = 0;		
		this.gridBagConstraintsResponsableFondo.gridx = iPosXAccion++;
		
		this.jPanelAccionesResponsableFondo.add(this.jButtonGuardarCambiosResponsableFondo, this.gridBagConstraintsResponsableFondo);	
		
		this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
		this.gridBagConstraintsResponsableFondo.gridy = 0;		
		this.gridBagConstraintsResponsableFondo.gridx =iPosXAccion++;
		
		this.jPanelAccionesResponsableFondo.add(this.jButtonCancelarResponsableFondo, this.gridBagConstraintsResponsableFondo);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutResponsableFondo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutResponsableFondo);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.responsablefondoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsResponsableFondo = new GridBagConstraints();						
			this.gridBagConstraintsResponsableFondo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsResponsableFondo.gridx = 0;		
			//this.gridBagConstraintsResponsableFondo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResponsableFondo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsResponsableFondo.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
		this.gridBagConstraintsResponsableFondo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsResponsableFondo.gridx =0;
		this.gridBagConstraintsResponsableFondo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsResponsableFondo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosResponsableFondo, this.gridBagConstraintsResponsableFondo);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ResponsableFondoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleResponsableFondo = new ResponsableFondoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Responsable Fondo Rotativo DATOS");
			
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
			
	        //this.setTitle("[FOR] - Responsable Fondo Rotativo DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Responsable Fondo Rotativo Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ResponsableFondoModel responsablefondoModel=new ResponsableFondoModel(this);
			
			//SI USARA CLASE INTERNA
			//ResponsableFondoModel.ResponsableFondoFocusTraversalPolicy responsablefondoFocusTraversalPolicy = responsablefondoModel.new ResponsableFondoFocusTraversalPolicy(this);
			
			//responsablefondoFocusTraversalPolicy.setresponsablefondoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(responsablefondoModel);
			
			
			this.jContentPaneDetalleResponsableFondo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleResponsableFondo = new GridBagLayout();	
			this.jContentPaneDetalleResponsableFondo.setLayout(gridaBagLayoutDetalleResponsableFondo);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosResponsableFondo = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
				this.gridBagConstraintsResponsableFondo.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsResponsableFondo.gridx = 0;
					
				
				this.jContentPaneDetalleResponsableFondo.add(jTtoolBarDetalleResponsableFondo, gridBagConstraintsResponsableFondo);								
				
}
			
			this.jScrollPanelDatosEdicionResponsableFondo=   new JScrollPane(jContentPaneDetalleResponsableFondo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionResponsableFondo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionResponsableFondo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionResponsableFondo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralResponsableFondo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralResponsableFondo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralResponsableFondo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralResponsableFondo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
			
			
	        this.gridBagConstraintsResponsableFondo.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsResponsableFondo.gridx = 0;
	        
			this.jContentPaneDetalleResponsableFondo.add(jPanelCamposResponsableFondo, gridBagConstraintsResponsableFondo);
			
			
			
			
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
						&& responsablefondoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameFacturaProveedor(this.puedeCargarPorParteFacturaProveedor,false,-1);
					
					if(this.responsablefondoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsResponsableFondo= new GridBagConstraints();
						this.gridBagConstraintsResponsableFondo.gridy = iGridyRelaciones++;
						this.gridBagConstraintsResponsableFondo.gridx = 0;
						this.jContentPaneDetalleResponsableFondo.add(this.jTabbedPaneRelacionesResponsableFondo, this.gridBagConstraintsResponsableFondo);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesResponsableFondo.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameFacturaProveedor(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosResponsableFondo.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
					this.gridBagConstraintsResponsableFondo.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsResponsableFondo.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsResponsableFondo.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsResponsableFondo.gridx = 0;
					
				
					this.jContentPaneDetalleResponsableFondo.add(jPanelCamposOcultosResponsableFondo, gridBagConstraintsResponsableFondo);
				
					this.jPanelCamposOcultosResponsableFondo.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
			this.gridBagConstraintsResponsableFondo.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsResponsableFondo.gridx = 0;
	        this.gridBagConstraintsResponsableFondo.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleResponsableFondo.add(this.jPanelAccionesFormularioResponsableFondo, this.gridBagConstraintsResponsableFondo);							
			
			
			
			this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
	        this.gridBagConstraintsResponsableFondo.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsResponsableFondo.gridx = 0;
	        
			
			this.jContentPaneDetalleResponsableFondo.add(this.jPanelAccionesResponsableFondo, this.gridBagConstraintsResponsableFondo);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionResponsableFondo);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionResponsableFondo=   new JScrollPane(this.jPanelCamposResponsableFondo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionResponsableFondo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionResponsableFondo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionResponsableFondo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
			this.gridBagConstraintsResponsableFondo.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsResponsableFondo.gridx = 0;
			this.gridBagConstraintsResponsableFondo.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsResponsableFondo.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsResponsableFondo.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionResponsableFondo, this.gridBagConstraintsResponsableFondo);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
			this.gridBagConstraintsResponsableFondo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsResponsableFondo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioResponsableFondo, this.gridBagConstraintsResponsableFondo);			
			
			this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
			this.gridBagConstraintsResponsableFondo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsResponsableFondo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesResponsableFondo, this.gridBagConstraintsResponsableFondo);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
		this.gridBagConstraintsResponsableFondo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsResponsableFondo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposResponsableFondo, this.gridBagConstraintsResponsableFondo);
			
			
		this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
		this.gridBagConstraintsResponsableFondo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsResponsableFondo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosResponsableFondo, this.gridBagConstraintsResponsableFondo);
		
			
		this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
		this.gridBagConstraintsResponsableFondo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsResponsableFondo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesResponsableFondo, this.gridBagConstraintsResponsableFondo);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralResponsableFondo;//jContentPane;
		
		return jScrollPanelDatosEdicionResponsableFondo;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameFacturaProveedor(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.facturaproveedorSessionBean=new FacturaProveedorSessionBean();
		this.facturaproveedorSessionBean.setConGuardarRelaciones(true);
		this.facturaproveedorSessionBean.setEsGuardarRelacionado(true);

		this.facturaproveedorBeanSwingJInternalFrame=null;//new FacturaProveedorBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.facturaproveedorBeanSwingJInternalFramePopup=new FacturaProveedorBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.facturaproveedorBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.facturaproveedorSessionBean.getEsGuardarRelacionado()) {

				FacturaProveedorJInternalFrame.STIPO_TAMANIO_GENERAL=ResponsableFondoJInternalFrame.STIPO_TAMANIO_GENERAL;
				FacturaProveedorJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ResponsableFondoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.facturaproveedorSessionBean.setEsGuardarRelacionado(true);

				this.facturaproveedorBeanSwingJInternalFrame=new FacturaProveedorBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,true,true,true,false);//false->4

				this.facturaproveedorBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.facturaproveedorBeanSwingJInternalFrame.setfacturaproveedorSessionBean(this.facturaproveedorSessionBean);

				//this.gridBagConstraintsResponsableFondo = new GridBagConstraints();
				//this.gridBagConstraintsResponsableFondo.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsResponsableFondo.gridx = 0;
				//this.jContentPaneDetalleResponsableFondo.add(this.facturaproveedorBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsResponsableFondo);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesResponsableFondo.add("Factura Proveedors",this.facturaproveedorBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesResponsableFondo.setComponentAt(iIndexTab,this.facturaproveedorBeanSwingJInternalFrame.getContentPane());
				}

				//FacturaProveedorJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.facturaproveedorSessionBean.setEsGuardarRelacionado(false);
				this.facturaproveedorBeanSwingJInternalFrame=null;//new FacturaProveedorBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.facturaproveedorSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteFacturaProveedor) {
					this.jTabbedPaneRelacionesResponsableFondo.add("Factura Proveedors",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarFacturaProveedorBeanSwingJInternalFrame(List<ResponsableFondo> responsablefondos,ResponsableFondo responsablefondo,FacturaProveedorBeanSwingJInternalFrame facturaproveedorBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//facturaproveedorBeanSwingJInternalFrame=new FacturaProveedorBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					facturaproveedorBeanSwingJInternalFrame.getFacturaProveedorLogic().setConnexion(this.responsablefondoLogic.getConnexion());

					facturaproveedorBeanSwingJInternalFrame.setresponsablefondosForeignKey(responsablefondos);
					facturaproveedorBeanSwingJInternalFrame.setresponsablefondoForeignKey(responsablefondo);
					facturaproveedorBeanSwingJInternalFrame.facturaproveedorSessionBean.setisBusquedaDesdeForeignKeySesionResponsableFondo(true);
					facturaproveedorBeanSwingJInternalFrame.facturaproveedorSessionBean.setlidResponsableFondoActual(responsablefondo.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					facturaproveedorBeanSwingJInternalFrame.cargarCombosForeignKeyFacturaProveedor(facturaproveedorBeanSwingJInternalFrame.isCargarCombosDependencia);
					facturaproveedorBeanSwingJInternalFrame.setVisibilidadBusquedasParaResponsableFondo(true);
					facturaproveedorBeanSwingJInternalFrame.setid_responsable_fondoFK_IdResponsableFondo(responsablefondo.getId());

					if(!this.conCargarFormDetalle) {
						facturaproveedorBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					facturaproveedorBeanSwingJInternalFrame.setSelectedItemCombosFrameResponsableFondoForeignKey(responsablefondo,1,false,true,true);
					facturaproveedorBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					facturaproveedorBeanSwingJInternalFrame.procesarBusqueda("FK_IdResponsableFondo");
					facturaproveedorBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdResponsableFondo");
					facturaproveedorBeanSwingJInternalFrame.inicializarActualizarBindingTablaFacturaProveedor(true);
					facturaproveedorBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesFacturaProveedor("n",facturaproveedorBeanSwingJInternalFrame.isGuardarCambiosEnLote, facturaproveedorBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					facturaproveedorBeanSwingJInternalFrame.setAutoscrolls(true);
					facturaproveedorBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						facturaproveedorBeanSwingJInternalFrame.actualizarEstadoPanelsFacturaProveedor("relacionado");
					} else {
						facturaproveedorBeanSwingJInternalFrame.actualizarEstadoPanelsFacturaProveedor("no_relacionado");
					}

					facturaproveedorBeanSwingJInternalFrame.getjButtonRecargarInformacionFacturaProveedor().setVisible(false);

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
