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
package com.bydan.erp.tesoreria.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.tesoreria.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.tesoreria.util.ParametroTesoreriaDefectoConstantesFunciones;

import com.bydan.erp.tesoreria.business.logic.*;
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
public class ParametroTesoreriaDefectoDetalleFormJInternalFrame extends ParametroTesoreriaDefectoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleParametroTesoreriaDefecto;
	
	protected JMenuBar jmenuBarDetalleParametroTesoreriaDefecto;
	
	protected JMenu jmenuDetalleParametroTesoreriaDefecto;
	protected JMenu jmenuDetalleArchivoParametroTesoreriaDefecto;
	protected JMenu jmenuDetalleAccionesParametroTesoreriaDefecto;
	protected JMenu jmenuDetalleDatosParametroTesoreriaDefecto;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleParametroTesoreriaDefecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutParametroTesoreriaDefecto;	
	protected GridBagConstraints gridBagConstraintsParametroTesoreriaDefecto;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ParametroTesoreriaDefectoBeanSwingJInternalFrameAdditional jInternalFrameDetalleParametroTesoreriaDefecto;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected TipoCuentaBancoGlobalBeanSwingJInternalFrame tipocuentabancoglobalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocuentabancoglobal="";
	
	public ParametroTesoreriaDefectoSessionBean parametrotesoreriadefectoSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public TipoCuentaBancoGlobalSessionBean tipocuentabancoglobalSessionBean;	
	
	public ParametroTesoreriaDefectoLogic parametrotesoreriadefectoLogic;
	
	public JScrollPane jScrollPanelDatosParametroTesoreriaDefecto;
	public JScrollPane jScrollPanelDatosEdicionParametroTesoreriaDefecto;
	public JScrollPane jScrollPanelDatosGeneralParametroTesoreriaDefecto;
	
	protected JPanel jPanelCamposParametroTesoreriaDefecto;    
	protected JPanel jPanelCamposOcultosParametroTesoreriaDefecto;    	
	protected JPanel jPanelAccionesParametroTesoreriaDefecto;
	protected JPanel jPanelAccionesFormularioParametroTesoreriaDefecto;
    
	
	
	protected Integer iXPanelCamposParametroTesoreriaDefecto=0;
	protected Integer iYPanelCamposParametroTesoreriaDefecto=0;
	
	protected Integer iXPanelCamposOcultosParametroTesoreriaDefecto=0;
	protected Integer iYPanelCamposOcultosParametroTesoreriaDefecto=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoParametroTesoreriaDefecto;
	public JButton jButtonModificarParametroTesoreriaDefecto;
	public JButton jButtonActualizarParametroTesoreriaDefecto;
    public JButton jButtonEliminarParametroTesoreriaDefecto;
	public JButton jButtonCancelarParametroTesoreriaDefecto;
    public JButton jButtonGuardarCambiosParametroTesoreriaDefecto;
	public JButton jButtonGuardarCambiosTablaParametroTesoreriaDefecto;
	protected JButton jButtonCerrarParametroTesoreriaDefecto;
	
	
	protected JButton jButtonProcesarInformacionParametroTesoreriaDefecto;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoParametroTesoreriaDefecto;
	protected JCheckBox jCheckBoxPostAccionSinCerrarParametroTesoreriaDefecto;
	protected JCheckBox jCheckBoxPostAccionSinMensajeParametroTesoreriaDefecto;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarParametroTesoreriaDefecto;
	protected JButton jButtonModificarToolBarParametroTesoreriaDefecto;
	protected JButton jButtonActualizarToolBarParametroTesoreriaDefecto;
    protected JButton jButtonEliminarToolBarParametroTesoreriaDefecto;
	protected JButton jButtonCancelarToolBarParametroTesoreriaDefecto;
    protected JButton jButtonGuardarCambiosToolBarParametroTesoreriaDefecto;
	protected JButton jButtonGuardarCambiosTablaToolBarParametroTesoreriaDefecto;
	protected JButton jButtonMostrarOcultarTablaToolBarParametroTesoreriaDefecto;
	protected JButton jButtonCerrarToolBarParametroTesoreriaDefecto;
	
	protected JButton jButtonProcesarInformacionToolBarParametroTesoreriaDefecto;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoParametroTesoreriaDefecto;
	protected JMenuItem jMenuItemModificarParametroTesoreriaDefecto;
	protected JMenuItem jMenuItemActualizarParametroTesoreriaDefecto;
    protected JMenuItem jMenuItemEliminarParametroTesoreriaDefecto;
	protected JMenuItem jMenuItemCancelarParametroTesoreriaDefecto;
    protected JMenuItem jMenuItemGuardarCambiosParametroTesoreriaDefecto;
	protected JMenuItem jMenuItemGuardarCambiosTablaParametroTesoreriaDefecto;
	protected JMenuItem jMenuItemCerrarParametroTesoreriaDefecto;
	protected JMenuItem jMenuItemDetalleCerrarParametroTesoreriaDefecto;
	protected JMenuItem jMenuItemDetalleMostarOcultarParametroTesoreriaDefecto;
	
	protected JMenuItem jMenuItemProcesarInformacionParametroTesoreriaDefecto;
	protected JMenuItem jMenuItemNuevoGuardarCambiosParametroTesoreriaDefecto;
	protected JMenuItem jMenuItemMostrarOcultarParametroTesoreriaDefecto;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesParametroTesoreriaDefecto;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesParametroTesoreriaDefecto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesParametroTesoreriaDefecto;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioParametroTesoreriaDefecto;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidParametroTesoreriaDefecto;
	public JLabel jLabelIdParametroTesoreriaDefecto;
	public JLabel jLabelidParametroTesoreriaDefecto;
	public JButton jButtonidParametroTesoreriaDefectoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaParametroTesoreriaDefecto;
	public JLabel jLabelid_empresaParametroTesoreriaDefecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaParametroTesoreriaDefecto;
	public JButton jButtonid_empresaParametroTesoreriaDefecto= new JButtonMe();
	public JButton jButtonid_empresaParametroTesoreriaDefectoUpdate= new JButtonMe();
	public JButton jButtonid_empresaParametroTesoreriaDefectoBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalParametroTesoreriaDefecto;
	public JLabel jLabelid_sucursalParametroTesoreriaDefecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalParametroTesoreriaDefecto;
	public JButton jButtonid_sucursalParametroTesoreriaDefecto= new JButtonMe();
	public JButton jButtonid_sucursalParametroTesoreriaDefectoUpdate= new JButtonMe();
	public JButton jButtonid_sucursalParametroTesoreriaDefectoBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_cuenta_banco_globalParametroTesoreriaDefecto;
	public JLabel jLabelid_tipo_cuenta_banco_globalParametroTesoreriaDefecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_cuenta_banco_globalParametroTesoreriaDefecto;
	public JButton jButtonid_tipo_cuenta_banco_globalParametroTesoreriaDefecto= new JButtonMe();
	public JButton jButtonid_tipo_cuenta_banco_globalParametroTesoreriaDefectoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_cuenta_banco_globalParametroTesoreriaDefectoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesParametroTesoreriaDefecto;
	
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
	
	public ParametroTesoreriaDefectoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposParametroTesoreriaDefecto=new JPanel();
				this.jPanelAccionesFormularioParametroTesoreriaDefecto=new JPanel();
				this.jmenuBarDetalleParametroTesoreriaDefecto=new JMenuBar();
				this.jTtoolBarDetalleParametroTesoreriaDefecto=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroTesoreriaDefectoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ParametroTesoreriaDefecto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ParametroTesoreriaDefectoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ParametroTesoreriaDefecto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroTesoreriaDefectoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroTesoreriaDefecto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroTesoreriaDefectoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroTesoreriaDefecto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroTesoreriaDefectoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ParametroTesoreriaDefecto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarParametroTesoreriaDefecto() {
		return this.jButtonActualizarToolBarParametroTesoreriaDefecto;
	}
	
	public JButton getjButtonEliminarToolBarParametroTesoreriaDefecto() {
		return this.jButtonEliminarToolBarParametroTesoreriaDefecto;
	}
	
	public JButton getjButtonCancelarToolBarParametroTesoreriaDefecto() {
		return this.jButtonCancelarToolBarParametroTesoreriaDefecto;
	}		
	
	public JButton getjButtonProcesarInformacionParametroTesoreriaDefecto() {
		return this.jButtonProcesarInformacionParametroTesoreriaDefecto;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionParametroTesoreriaDefecto)	{
		this.jButtonProcesarInformacionParametroTesoreriaDefecto = jButtonProcesarInformacionParametroTesoreriaDefecto;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesParametroTesoreriaDefecto() {
		return this.jComboBoxTiposAccionesParametroTesoreriaDefecto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesParametroTesoreriaDefecto(
			JComboBox jComboBoxTiposRelacionesParametroTesoreriaDefecto) {
		this.jComboBoxTiposRelacionesParametroTesoreriaDefecto = jComboBoxTiposRelacionesParametroTesoreriaDefecto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesParametroTesoreriaDefecto(
			JComboBox jComboBoxTiposAccionesParametroTesoreriaDefecto) {
		this.jComboBoxTiposAccionesParametroTesoreriaDefecto = jComboBoxTiposAccionesParametroTesoreriaDefecto;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioParametroTesoreriaDefecto() {
		return this.jComboBoxTiposAccionesFormularioParametroTesoreriaDefecto;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioParametroTesoreriaDefecto(
			JComboBox jComboBoxTiposAccionesFormularioParametroTesoreriaDefecto) {
		this.jComboBoxTiposAccionesFormularioParametroTesoreriaDefecto = jComboBoxTiposAccionesFormularioParametroTesoreriaDefecto;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.parametrotesoreriadefectoSessionBean=new ParametroTesoreriaDefectoSessionBean();
		
		this.parametrotesoreriadefectoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.parametrotesoreriadefectoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.parametrotesoreriadefectoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ParametroTesoreriaDefectoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ParametroTesoreriaDefectoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ParametroTesoreriaDefectoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Parametro Tesoreria Defecto MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.parametrotesoreriadefectoSessionBean.getEsGuardarRelacionado()) {
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
	
		ParametroTesoreriaDefectoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleParametroTesoreriaDefecto= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarParametroTesoreriaDefecto=new JButtonMe();
				this.jButtonModificarToolBarParametroTesoreriaDefecto=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarParametroTesoreriaDefecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarParametroTesoreriaDefecto,this.jTtoolBarDetalleParametroTesoreriaDefecto,
							"actualizar","actualizar","Actualizar"+" "+ParametroTesoreriaDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarParametroTesoreriaDefecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarParametroTesoreriaDefecto,this.jTtoolBarDetalleParametroTesoreriaDefecto,
							"eliminar","eliminar","Eliminar"+" "+ParametroTesoreriaDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarParametroTesoreriaDefecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarParametroTesoreriaDefecto,this.jTtoolBarDetalleParametroTesoreriaDefecto,
							"cancelar","cancelar","Cancelar"+" "+ParametroTesoreriaDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarParametroTesoreriaDefecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarParametroTesoreriaDefecto,this.jTtoolBarDetalleParametroTesoreriaDefecto,
							"guardarcambios","guardarcambios","Guardar"+" "+ParametroTesoreriaDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarParametroTesoreriaDefecto,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarParametroTesoreriaDefecto,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarParametroTesoreriaDefecto,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleParametroTesoreriaDefecto=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleParametroTesoreriaDefecto=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoParametroTesoreriaDefecto=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesParametroTesoreriaDefecto=new JMenuMe("Acciones");
		this.jmenuDetalleDatosParametroTesoreriaDefecto=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoParametroTesoreriaDefecto= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoParametroTesoreriaDefecto.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoParametroTesoreriaDefecto,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoParametroTesoreriaDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarParametroTesoreriaDefecto= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarParametroTesoreriaDefecto.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarParametroTesoreriaDefecto,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarParametroTesoreriaDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarParametroTesoreriaDefecto= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarParametroTesoreriaDefecto.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarParametroTesoreriaDefecto,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarParametroTesoreriaDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarParametroTesoreriaDefecto= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarParametroTesoreriaDefecto.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarParametroTesoreriaDefecto,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarParametroTesoreriaDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarParametroTesoreriaDefecto= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarParametroTesoreriaDefecto.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarParametroTesoreriaDefecto,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarParametroTesoreriaDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosParametroTesoreriaDefecto= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosParametroTesoreriaDefecto.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosParametroTesoreriaDefecto,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosParametroTesoreriaDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarParametroTesoreriaDefecto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarParametroTesoreriaDefecto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarParametroTesoreriaDefecto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarParametroTesoreriaDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarParametroTesoreriaDefecto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarParametroTesoreriaDefecto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarParametroTesoreriaDefecto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarParametroTesoreriaDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarParametroTesoreriaDefecto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarParametroTesoreriaDefecto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarParametroTesoreriaDefecto,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarParametroTesoreriaDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarParametroTesoreriaDefecto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarParametroTesoreriaDefecto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarParametroTesoreriaDefecto,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarParametroTesoreriaDefecto, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoParametroTesoreriaDefecto.add(this.jMenuItemDetalleCerrarParametroTesoreriaDefecto);
		
		this.jmenuDetalleAccionesParametroTesoreriaDefecto.add(this.jMenuItemActualizarParametroTesoreriaDefecto);
		this.jmenuDetalleAccionesParametroTesoreriaDefecto.add(this.jMenuItemEliminarParametroTesoreriaDefecto);
		this.jmenuDetalleAccionesParametroTesoreriaDefecto.add(this.jMenuItemCancelarParametroTesoreriaDefecto);		
		
		//this.jmenuDetalleDatosParametroTesoreriaDefecto.add(this.jMenuItemDetalleAbrirOrderByParametroTesoreriaDefecto);				
		this.jmenuDetalleDatosParametroTesoreriaDefecto.add(this.jMenuItemDetalleMostarOcultarParametroTesoreriaDefecto);				
				
		//this.jmenuDetalleAccionesParametroTesoreriaDefecto.add(this.jMenuItemGuardarCambiosParametroTesoreriaDefecto);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoParametroTesoreriaDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesParametroTesoreriaDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosParametroTesoreriaDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleParametroTesoreriaDefecto.add(this.jmenuDetalleArchivoParametroTesoreriaDefecto);		
		this.jmenuBarDetalleParametroTesoreriaDefecto.add(this.jmenuDetalleAccionesParametroTesoreriaDefecto);		
		this.jmenuBarDetalleParametroTesoreriaDefecto.add(this.jmenuDetalleDatosParametroTesoreriaDefecto);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleParametroTesoreriaDefecto);				
	}
	
	
	public void inicializarElementosCamposParametroTesoreriaDefecto() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdParametroTesoreriaDefecto = new JLabelMe();
		jLabelIdParametroTesoreriaDefecto.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdParametroTesoreriaDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdParametroTesoreriaDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdParametroTesoreriaDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdParametroTesoreriaDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidParametroTesoreriaDefecto = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidParametroTesoreriaDefecto.setToolTipText(ParametroTesoreriaDefectoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutParametroTesoreriaDefecto= new GridBagLayout();

		this.jPanelidParametroTesoreriaDefecto.setLayout(this.gridaBagLayoutParametroTesoreriaDefecto);

		jLabelidParametroTesoreriaDefecto = new JLabel();
		jLabelidParametroTesoreriaDefecto.setText("Id");

		jLabelidParametroTesoreriaDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidParametroTesoreriaDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidParametroTesoreriaDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



	}
	
	public void inicializarElementosCamposForeigKeysParametroTesoreriaDefecto() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaParametroTesoreriaDefecto = new JLabelMe();
		this.jLabelid_empresaParametroTesoreriaDefecto.setText(""+ParametroTesoreriaDefectoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaParametroTesoreriaDefecto.setToolTipText("Empresa");
		this.jLabelid_empresaParametroTesoreriaDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaParametroTesoreriaDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaParametroTesoreriaDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaParametroTesoreriaDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaParametroTesoreriaDefecto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaParametroTesoreriaDefecto.setToolTipText(ParametroTesoreriaDefectoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutParametroTesoreriaDefecto = new GridBagLayout();
		this.jPanelid_empresaParametroTesoreriaDefecto.setLayout(this.gridaBagLayoutParametroTesoreriaDefecto);


		jComboBoxid_empresaParametroTesoreriaDefecto= new JComboBoxMe();
		jComboBoxid_empresaParametroTesoreriaDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaParametroTesoreriaDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaParametroTesoreriaDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaParametroTesoreriaDefecto,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaParametroTesoreriaDefecto.setEnabled(false);

		this.jButtonid_empresaParametroTesoreriaDefecto= new JButtonMe();
		this.jButtonid_empresaParametroTesoreriaDefecto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaParametroTesoreriaDefecto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaParametroTesoreriaDefecto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaParametroTesoreriaDefecto.setText("Buscar");
		this.jButtonid_empresaParametroTesoreriaDefecto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaParametroTesoreriaDefecto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaParametroTesoreriaDefecto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaParametroTesoreriaDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaParametroTesoreriaDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaParametroTesoreriaDefecto"));

		this.jButtonid_empresaParametroTesoreriaDefectoBusqueda= new JButtonMe();
		this.jButtonid_empresaParametroTesoreriaDefectoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroTesoreriaDefectoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroTesoreriaDefectoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaParametroTesoreriaDefectoBusqueda.setText("U");
		this.jButtonid_empresaParametroTesoreriaDefectoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaParametroTesoreriaDefectoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaParametroTesoreriaDefectoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaParametroTesoreriaDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaParametroTesoreriaDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaParametroTesoreriaDefectoBusqueda"));

		if(this.parametrotesoreriadefectoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaParametroTesoreriaDefectoBusqueda.setVisible(false);		}

		this.jButtonid_empresaParametroTesoreriaDefectoUpdate= new JButtonMe();
		this.jButtonid_empresaParametroTesoreriaDefectoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroTesoreriaDefectoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroTesoreriaDefectoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaParametroTesoreriaDefectoUpdate.setText("U");
		this.jButtonid_empresaParametroTesoreriaDefectoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaParametroTesoreriaDefectoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaParametroTesoreriaDefectoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaParametroTesoreriaDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaParametroTesoreriaDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaParametroTesoreriaDefectoUpdate"));



					
		this.jLabelid_sucursalParametroTesoreriaDefecto = new JLabelMe();
		this.jLabelid_sucursalParametroTesoreriaDefecto.setText(""+ParametroTesoreriaDefectoConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalParametroTesoreriaDefecto.setToolTipText("Sucursal");
		this.jLabelid_sucursalParametroTesoreriaDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalParametroTesoreriaDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalParametroTesoreriaDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalParametroTesoreriaDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalParametroTesoreriaDefecto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalParametroTesoreriaDefecto.setToolTipText(ParametroTesoreriaDefectoConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutParametroTesoreriaDefecto = new GridBagLayout();
		this.jPanelid_sucursalParametroTesoreriaDefecto.setLayout(this.gridaBagLayoutParametroTesoreriaDefecto);


		jComboBoxid_sucursalParametroTesoreriaDefecto= new JComboBoxMe();
		jComboBoxid_sucursalParametroTesoreriaDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalParametroTesoreriaDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalParametroTesoreriaDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalParametroTesoreriaDefecto,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalParametroTesoreriaDefecto.setEnabled(false);

		this.jButtonid_sucursalParametroTesoreriaDefecto= new JButtonMe();
		this.jButtonid_sucursalParametroTesoreriaDefecto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalParametroTesoreriaDefecto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalParametroTesoreriaDefecto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalParametroTesoreriaDefecto.setText("Buscar");
		this.jButtonid_sucursalParametroTesoreriaDefecto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalParametroTesoreriaDefecto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalParametroTesoreriaDefecto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalParametroTesoreriaDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalParametroTesoreriaDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalParametroTesoreriaDefecto"));

		this.jButtonid_sucursalParametroTesoreriaDefectoBusqueda= new JButtonMe();
		this.jButtonid_sucursalParametroTesoreriaDefectoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalParametroTesoreriaDefectoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalParametroTesoreriaDefectoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalParametroTesoreriaDefectoBusqueda.setText("U");
		this.jButtonid_sucursalParametroTesoreriaDefectoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalParametroTesoreriaDefectoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalParametroTesoreriaDefectoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalParametroTesoreriaDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalParametroTesoreriaDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalParametroTesoreriaDefectoBusqueda"));

		if(this.parametrotesoreriadefectoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalParametroTesoreriaDefectoBusqueda.setVisible(false);		}

		this.jButtonid_sucursalParametroTesoreriaDefectoUpdate= new JButtonMe();
		this.jButtonid_sucursalParametroTesoreriaDefectoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalParametroTesoreriaDefectoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalParametroTesoreriaDefectoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalParametroTesoreriaDefectoUpdate.setText("U");
		this.jButtonid_sucursalParametroTesoreriaDefectoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalParametroTesoreriaDefectoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalParametroTesoreriaDefectoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalParametroTesoreriaDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalParametroTesoreriaDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalParametroTesoreriaDefectoUpdate"));



					
		this.jLabelid_tipo_cuenta_banco_globalParametroTesoreriaDefecto = new JLabelMe();
		this.jLabelid_tipo_cuenta_banco_globalParametroTesoreriaDefecto.setText(""+ParametroTesoreriaDefectoConstantesFunciones.LABEL_IDTIPOCUENTABANCOGLOBAL+" : *");
		this.jLabelid_tipo_cuenta_banco_globalParametroTesoreriaDefecto.setToolTipText("Tipo Cuenta");
		this.jLabelid_tipo_cuenta_banco_globalParametroTesoreriaDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_cuenta_banco_globalParametroTesoreriaDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_cuenta_banco_globalParametroTesoreriaDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_cuenta_banco_globalParametroTesoreriaDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_cuenta_banco_globalParametroTesoreriaDefecto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_cuenta_banco_globalParametroTesoreriaDefecto.setToolTipText(ParametroTesoreriaDefectoConstantesFunciones.LABEL_IDTIPOCUENTABANCOGLOBAL);
		this.gridaBagLayoutParametroTesoreriaDefecto = new GridBagLayout();
		this.jPanelid_tipo_cuenta_banco_globalParametroTesoreriaDefecto.setLayout(this.gridaBagLayoutParametroTesoreriaDefecto);


		jComboBoxid_tipo_cuenta_banco_globalParametroTesoreriaDefecto= new JComboBoxMe();
		jComboBoxid_tipo_cuenta_banco_globalParametroTesoreriaDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_cuenta_banco_globalParametroTesoreriaDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_cuenta_banco_globalParametroTesoreriaDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_cuenta_banco_globalParametroTesoreriaDefecto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_cuenta_banco_globalParametroTesoreriaDefecto= new JButtonMe();
		this.jButtonid_tipo_cuenta_banco_globalParametroTesoreriaDefecto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_cuenta_banco_globalParametroTesoreriaDefecto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_cuenta_banco_globalParametroTesoreriaDefecto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_cuenta_banco_globalParametroTesoreriaDefecto.setText("Buscar");
		this.jButtonid_tipo_cuenta_banco_globalParametroTesoreriaDefecto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_cuenta_banco_globalParametroTesoreriaDefecto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_cuenta_banco_globalParametroTesoreriaDefecto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_cuenta_banco_globalParametroTesoreriaDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_cuenta_banco_globalParametroTesoreriaDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_cuenta_banco_globalParametroTesoreriaDefecto"));

		this.jButtonid_tipo_cuenta_banco_globalParametroTesoreriaDefectoBusqueda= new JButtonMe();
		this.jButtonid_tipo_cuenta_banco_globalParametroTesoreriaDefectoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cuenta_banco_globalParametroTesoreriaDefectoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cuenta_banco_globalParametroTesoreriaDefectoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_cuenta_banco_globalParametroTesoreriaDefectoBusqueda.setText("U");
		this.jButtonid_tipo_cuenta_banco_globalParametroTesoreriaDefectoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_cuenta_banco_globalParametroTesoreriaDefectoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_cuenta_banco_globalParametroTesoreriaDefectoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_cuenta_banco_globalParametroTesoreriaDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_cuenta_banco_globalParametroTesoreriaDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_cuenta_banco_globalParametroTesoreriaDefectoBusqueda"));

		if(this.parametrotesoreriadefectoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_cuenta_banco_globalParametroTesoreriaDefectoBusqueda.setVisible(false);		}

		this.jButtonid_tipo_cuenta_banco_globalParametroTesoreriaDefectoUpdate= new JButtonMe();
		this.jButtonid_tipo_cuenta_banco_globalParametroTesoreriaDefectoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cuenta_banco_globalParametroTesoreriaDefectoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cuenta_banco_globalParametroTesoreriaDefectoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_cuenta_banco_globalParametroTesoreriaDefectoUpdate.setText("U");
		this.jButtonid_tipo_cuenta_banco_globalParametroTesoreriaDefectoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_cuenta_banco_globalParametroTesoreriaDefectoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_cuenta_banco_globalParametroTesoreriaDefectoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_cuenta_banco_globalParametroTesoreriaDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_cuenta_banco_globalParametroTesoreriaDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_cuenta_banco_globalParametroTesoreriaDefectoUpdate"));



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
		//this.jInternalFrameDetalleParametroTesoreriaDefecto = new ParametroTesoreriaDefectoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Parametro Tesoreria Defecto DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutParametroTesoreriaDefecto= new GridBagLayout();
		

		
		String sToolTipParametroTesoreriaDefecto="";
		sToolTipParametroTesoreriaDefecto=ParametroTesoreriaDefectoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipParametroTesoreriaDefecto+="(Tesoreria.ParametroTesoreriaDefecto)";
		}
		
		if(!this.parametrotesoreriadefectoSessionBean.getEsGuardarRelacionado()) {
			sToolTipParametroTesoreriaDefecto+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoParametroTesoreriaDefecto = new JButtonMe();
		this.jButtonModificarParametroTesoreriaDefecto = new JButtonMe();
        this.jButtonActualizarParametroTesoreriaDefecto = new JButtonMe();
        this.jButtonEliminarParametroTesoreriaDefecto = new JButtonMe();
        this.jButtonCancelarParametroTesoreriaDefecto = new JButtonMe();
        this.jButtonGuardarCambiosParametroTesoreriaDefecto = new JButtonMe();
		this.jButtonGuardarCambiosTablaParametroTesoreriaDefecto = new JButtonMe();
		this.jButtonCerrarParametroTesoreriaDefecto = new JButtonMe();
		
		this.jScrollPanelDatosParametroTesoreriaDefecto = new JScrollPane();   
        this.jScrollPanelDatosEdicionParametroTesoreriaDefecto = new JScrollPane();
		this.jScrollPanelDatosGeneralParametroTesoreriaDefecto = new JScrollPane();
				
		
		
		this.jPanelCamposParametroTesoreriaDefecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosParametroTesoreriaDefecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesParametroTesoreriaDefecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioParametroTesoreriaDefecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Parametro Tesoreria Defecto";
		
		if(!this.parametrotesoreriadefectoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosParametroTesoreriaDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Tesoreria Defectos" + this.sPath));
		} else {
			this.jScrollPanelDatosParametroTesoreriaDefecto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionParametroTesoreriaDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralParametroTesoreriaDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposParametroTesoreriaDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposParametroTesoreriaDefecto.setName("jPanelCamposParametroTesoreriaDefecto"); 

		this.jPanelCamposOcultosParametroTesoreriaDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosParametroTesoreriaDefecto.setName("jPanelCamposOcultosParametroTesoreriaDefecto"); 

        this.jPanelAccionesParametroTesoreriaDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesParametroTesoreriaDefecto.setToolTipText("Acciones");
        this.jPanelAccionesParametroTesoreriaDefecto.setName("Acciones"); 

		this.jPanelAccionesFormularioParametroTesoreriaDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioParametroTesoreriaDefecto.setToolTipText("Acciones");
        this.jPanelAccionesFormularioParametroTesoreriaDefecto.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionParametroTesoreriaDefecto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralParametroTesoreriaDefecto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosParametroTesoreriaDefecto, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposParametroTesoreriaDefecto, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosParametroTesoreriaDefecto, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioParametroTesoreriaDefecto, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoParametroTesoreriaDefecto.setText("Nuevo");
		this.jButtonModificarParametroTesoreriaDefecto.setText("Editar");
        this.jButtonActualizarParametroTesoreriaDefecto.setText("Actualizar");
        this.jButtonEliminarParametroTesoreriaDefecto.setText("Eliminar");
        this.jButtonCancelarParametroTesoreriaDefecto.setText("Cancelar");
        this.jButtonGuardarCambiosParametroTesoreriaDefecto.setText("Guardar");
		this.jButtonGuardarCambiosTablaParametroTesoreriaDefecto.setText("Guardar");
		this.jButtonCerrarParametroTesoreriaDefecto.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoParametroTesoreriaDefecto,"nuevo_button","Nuevo",this.parametrotesoreriadefectoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarParametroTesoreriaDefecto,"modificar_button","Editar",this.parametrotesoreriadefectoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarParametroTesoreriaDefecto,"actualizar_button","Actualizar",this.parametrotesoreriadefectoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarParametroTesoreriaDefecto,"eliminar_button","Eliminar",this.parametrotesoreriadefectoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarParametroTesoreriaDefecto,"cancelar_button","Cancelar",this.parametrotesoreriadefectoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosParametroTesoreriaDefecto,"guardarcambios_button","Guardar",this.parametrotesoreriadefectoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaParametroTesoreriaDefecto,"guardarcambiostabla_button","Guardar",this.parametrotesoreriadefectoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarParametroTesoreriaDefecto,"cerrar_button","Salir",this.parametrotesoreriadefectoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoParametroTesoreriaDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarParametroTesoreriaDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosParametroTesoreriaDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaParametroTesoreriaDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarParametroTesoreriaDefecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarParametroTesoreriaDefecto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarParametroTesoreriaDefecto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarParametroTesoreriaDefecto, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoParametroTesoreriaDefecto.setToolTipText("Nuevo"+" "+ParametroTesoreriaDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarParametroTesoreriaDefecto.setToolTipText("Editar"+" "+ParametroTesoreriaDefectoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarParametroTesoreriaDefecto.setToolTipText("Actualizar"+" "+ParametroTesoreriaDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarParametroTesoreriaDefecto.setToolTipText("Eliminar)"+" "+ParametroTesoreriaDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarParametroTesoreriaDefecto.setToolTipText("Cancelar"+" "+ParametroTesoreriaDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosParametroTesoreriaDefecto.setToolTipText("Guardar"+" "+ParametroTesoreriaDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaParametroTesoreriaDefecto.setToolTipText("Guardar"+" "+ParametroTesoreriaDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarParametroTesoreriaDefecto.setToolTipText("Salir"+" "+ParametroTesoreriaDefectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoParametroTesoreriaDefecto";
		inputMap = this.jButtonNuevoParametroTesoreriaDefecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoParametroTesoreriaDefecto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoParametroTesoreriaDefecto"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarParametroTesoreriaDefecto";
		inputMap = this.jButtonActualizarParametroTesoreriaDefecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarParametroTesoreriaDefecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarParametroTesoreriaDefecto"));
		
		//ELIMINAR
		sMapKey = "EliminarParametroTesoreriaDefecto";
		inputMap = this.jButtonEliminarParametroTesoreriaDefecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarParametroTesoreriaDefecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarParametroTesoreriaDefecto"));
		
		//CANCELAR	
		sMapKey = "CancelarParametroTesoreriaDefecto";
		inputMap = this.jButtonCancelarParametroTesoreriaDefecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarParametroTesoreriaDefecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarParametroTesoreriaDefecto"));
		
		//CERRAR		
		sMapKey = "CerrarParametroTesoreriaDefecto";
		inputMap = this.jButtonCerrarParametroTesoreriaDefecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarParametroTesoreriaDefecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarParametroTesoreriaDefecto"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaParametroTesoreriaDefecto";
		inputMap = this.jButtonGuardarCambiosTablaParametroTesoreriaDefecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaParametroTesoreriaDefecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaParametroTesoreriaDefecto"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoParametroTesoreriaDefecto = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoParametroTesoreriaDefecto.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoParametroTesoreriaDefecto.setToolTipText("Nuevo ParametroTesoreriaDefecto");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoParametroTesoreriaDefecto, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarParametroTesoreriaDefecto = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarParametroTesoreriaDefecto.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarParametroTesoreriaDefecto.setToolTipText("Sin Cerrar Ventana ParametroTesoreriaDefecto");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarParametroTesoreriaDefecto, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeParametroTesoreriaDefecto = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeParametroTesoreriaDefecto.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeParametroTesoreriaDefecto.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeParametroTesoreriaDefecto, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesParametroTesoreriaDefecto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesParametroTesoreriaDefecto.setText("Accion");
		this.jComboBoxTiposAccionesParametroTesoreriaDefecto.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioParametroTesoreriaDefecto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioParametroTesoreriaDefecto.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioParametroTesoreriaDefecto.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesParametroTesoreriaDefecto = new JLabelMe();
		
		this.jLabelAccionesParametroTesoreriaDefecto.setText("Acciones");		
		this.jLabelAccionesParametroTesoreriaDefecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroTesoreriaDefecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroTesoreriaDefecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposParametroTesoreriaDefecto();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysParametroTesoreriaDefecto();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesParametroTesoreriaDefecto=new JTabbedPane();
		this.jTabbedPaneRelacionesParametroTesoreriaDefecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesParametroTesoreriaDefecto,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesParametroTesoreriaDefecto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroTesoreriaDefecto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroTesoreriaDefecto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesParametroTesoreriaDefecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioParametroTesoreriaDefecto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioParametroTesoreriaDefecto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioParametroTesoreriaDefecto.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioParametroTesoreriaDefecto, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposParametroTesoreriaDefecto = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosParametroTesoreriaDefecto = new GridBagLayout();
		
		this.jPanelCamposParametroTesoreriaDefecto.setLayout(gridaBagLayoutCamposParametroTesoreriaDefecto);
		this.jPanelCamposOcultosParametroTesoreriaDefecto.setLayout(gridaBagLayoutCamposOcultosParametroTesoreriaDefecto);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroTesoreriaDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroTesoreriaDefecto.gridy = 0;
	this.gridBagConstraintsParametroTesoreriaDefecto.gridx = 0;
	this.gridBagConstraintsParametroTesoreriaDefecto.ipadx = 0;
	this.gridBagConstraintsParametroTesoreriaDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidParametroTesoreriaDefecto.add(jLabelIdParametroTesoreriaDefecto, this.gridBagConstraintsParametroTesoreriaDefecto);



	this.gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroTesoreriaDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroTesoreriaDefecto.gridy = 0;
	this.gridBagConstraintsParametroTesoreriaDefecto.gridx = 1;
	this.gridBagConstraintsParametroTesoreriaDefecto.ipadx = 0;
	this.gridBagConstraintsParametroTesoreriaDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidParametroTesoreriaDefecto.add(jLabelidParametroTesoreriaDefecto, this.gridBagConstraintsParametroTesoreriaDefecto);


	this.gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroTesoreriaDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroTesoreriaDefecto.gridy = 0;
	this.gridBagConstraintsParametroTesoreriaDefecto.gridx = 0;
	this.gridBagConstraintsParametroTesoreriaDefecto.ipadx = 0;
	this.gridBagConstraintsParametroTesoreriaDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaParametroTesoreriaDefecto.add(jLabelid_empresaParametroTesoreriaDefecto, this.gridBagConstraintsParametroTesoreriaDefecto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroTesoreriaDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroTesoreriaDefecto.gridy = 0;
		this.gridBagConstraintsParametroTesoreriaDefecto.gridx = 2;
		this.gridBagConstraintsParametroTesoreriaDefecto.ipadx = 0;
		this.gridBagConstraintsParametroTesoreriaDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaParametroTesoreriaDefecto.add(jButtonid_empresaParametroTesoreriaDefectoBusqueda, this.gridBagConstraintsParametroTesoreriaDefecto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroTesoreriaDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroTesoreriaDefecto.gridy = 0;
		this.gridBagConstraintsParametroTesoreriaDefecto.gridx = 3;
		this.gridBagConstraintsParametroTesoreriaDefecto.ipadx = 0;
		this.gridBagConstraintsParametroTesoreriaDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaParametroTesoreriaDefecto.add(jButtonid_empresaParametroTesoreriaDefectoUpdate, this.gridBagConstraintsParametroTesoreriaDefecto);
	}

	this.gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroTesoreriaDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroTesoreriaDefecto.gridy = 0;
	this.gridBagConstraintsParametroTesoreriaDefecto.gridx = 1;
	this.gridBagConstraintsParametroTesoreriaDefecto.ipadx = 0;
	this.gridBagConstraintsParametroTesoreriaDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaParametroTesoreriaDefecto.add(jComboBoxid_empresaParametroTesoreriaDefecto, this.gridBagConstraintsParametroTesoreriaDefecto);


	this.gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroTesoreriaDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroTesoreriaDefecto.gridy = 0;
	this.gridBagConstraintsParametroTesoreriaDefecto.gridx = 0;
	this.gridBagConstraintsParametroTesoreriaDefecto.ipadx = 0;
	this.gridBagConstraintsParametroTesoreriaDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalParametroTesoreriaDefecto.add(jLabelid_sucursalParametroTesoreriaDefecto, this.gridBagConstraintsParametroTesoreriaDefecto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroTesoreriaDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroTesoreriaDefecto.gridy = 0;
		this.gridBagConstraintsParametroTesoreriaDefecto.gridx = 2;
		this.gridBagConstraintsParametroTesoreriaDefecto.ipadx = 0;
		this.gridBagConstraintsParametroTesoreriaDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalParametroTesoreriaDefecto.add(jButtonid_sucursalParametroTesoreriaDefectoBusqueda, this.gridBagConstraintsParametroTesoreriaDefecto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroTesoreriaDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroTesoreriaDefecto.gridy = 0;
		this.gridBagConstraintsParametroTesoreriaDefecto.gridx = 3;
		this.gridBagConstraintsParametroTesoreriaDefecto.ipadx = 0;
		this.gridBagConstraintsParametroTesoreriaDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalParametroTesoreriaDefecto.add(jButtonid_sucursalParametroTesoreriaDefectoUpdate, this.gridBagConstraintsParametroTesoreriaDefecto);
	}

	this.gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroTesoreriaDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroTesoreriaDefecto.gridy = 0;
	this.gridBagConstraintsParametroTesoreriaDefecto.gridx = 1;
	this.gridBagConstraintsParametroTesoreriaDefecto.ipadx = 0;
	this.gridBagConstraintsParametroTesoreriaDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalParametroTesoreriaDefecto.add(jComboBoxid_sucursalParametroTesoreriaDefecto, this.gridBagConstraintsParametroTesoreriaDefecto);


	this.gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroTesoreriaDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroTesoreriaDefecto.gridy = 0;
	this.gridBagConstraintsParametroTesoreriaDefecto.gridx = 0;
	this.gridBagConstraintsParametroTesoreriaDefecto.ipadx = 0;
	this.gridBagConstraintsParametroTesoreriaDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_cuenta_banco_globalParametroTesoreriaDefecto.add(jLabelid_tipo_cuenta_banco_globalParametroTesoreriaDefecto, this.gridBagConstraintsParametroTesoreriaDefecto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroTesoreriaDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroTesoreriaDefecto.gridy = 0;
		this.gridBagConstraintsParametroTesoreriaDefecto.gridx = 2;
		this.gridBagConstraintsParametroTesoreriaDefecto.ipadx = 0;
		this.gridBagConstraintsParametroTesoreriaDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_cuenta_banco_globalParametroTesoreriaDefecto.add(jButtonid_tipo_cuenta_banco_globalParametroTesoreriaDefectoBusqueda, this.gridBagConstraintsParametroTesoreriaDefecto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();
		//this.gridBagConstraintsParametroTesoreriaDefecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroTesoreriaDefecto.gridy = 0;
		this.gridBagConstraintsParametroTesoreriaDefecto.gridx = 3;
		this.gridBagConstraintsParametroTesoreriaDefecto.ipadx = 0;
		this.gridBagConstraintsParametroTesoreriaDefecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_cuenta_banco_globalParametroTesoreriaDefecto.add(jButtonid_tipo_cuenta_banco_globalParametroTesoreriaDefectoUpdate, this.gridBagConstraintsParametroTesoreriaDefecto);
	}

	this.gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroTesoreriaDefecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroTesoreriaDefecto.gridy = 0;
	this.gridBagConstraintsParametroTesoreriaDefecto.gridx = 1;
	this.gridBagConstraintsParametroTesoreriaDefecto.ipadx = 0;
	this.gridBagConstraintsParametroTesoreriaDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_cuenta_banco_globalParametroTesoreriaDefecto.add(jComboBoxid_tipo_cuenta_banco_globalParametroTesoreriaDefecto, this.gridBagConstraintsParametroTesoreriaDefecto);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroTesoreriaDefecto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroTesoreriaDefecto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroTesoreriaDefecto.gridy = iYPanelCamposParametroTesoreriaDefecto;
	this.gridBagConstraintsParametroTesoreriaDefecto.gridx = iXPanelCamposParametroTesoreriaDefecto++;
	this.gridBagConstraintsParametroTesoreriaDefecto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroTesoreriaDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroTesoreriaDefecto.add(this.jPanelidParametroTesoreriaDefecto, this.gridBagConstraintsParametroTesoreriaDefecto);



	if(iXPanelCamposParametroTesoreriaDefecto % 1==0) {
		iXPanelCamposParametroTesoreriaDefecto=0;
		iYPanelCamposParametroTesoreriaDefecto++;
	}
	this.gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroTesoreriaDefecto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroTesoreriaDefecto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroTesoreriaDefecto.gridy = iYPanelCamposParametroTesoreriaDefecto;
	this.gridBagConstraintsParametroTesoreriaDefecto.gridx = iXPanelCamposParametroTesoreriaDefecto++;
	this.gridBagConstraintsParametroTesoreriaDefecto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroTesoreriaDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroTesoreriaDefecto.add(this.jPanelid_tipo_cuenta_banco_globalParametroTesoreriaDefecto, this.gridBagConstraintsParametroTesoreriaDefecto);



	if(iXPanelCamposParametroTesoreriaDefecto % 1==0) {
		iXPanelCamposParametroTesoreriaDefecto=0;
		iYPanelCamposParametroTesoreriaDefecto++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroTesoreriaDefecto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroTesoreriaDefecto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroTesoreriaDefecto.gridy = iYPanelCamposOcultosParametroTesoreriaDefecto;
	this.gridBagConstraintsParametroTesoreriaDefecto.gridx = iXPanelCamposOcultosParametroTesoreriaDefecto++;
	this.gridBagConstraintsParametroTesoreriaDefecto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroTesoreriaDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosParametroTesoreriaDefecto.add(this.jPanelid_empresaParametroTesoreriaDefecto, this.gridBagConstraintsParametroTesoreriaDefecto);



	if(iXPanelCamposOcultosParametroTesoreriaDefecto % 1==0) {
		iXPanelCamposOcultosParametroTesoreriaDefecto=0;
		iYPanelCamposOcultosParametroTesoreriaDefecto++;
	}
	this.gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();
	this.gridBagConstraintsParametroTesoreriaDefecto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroTesoreriaDefecto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroTesoreriaDefecto.gridy = iYPanelCamposOcultosParametroTesoreriaDefecto;
	this.gridBagConstraintsParametroTesoreriaDefecto.gridx = iXPanelCamposOcultosParametroTesoreriaDefecto++;
	this.gridBagConstraintsParametroTesoreriaDefecto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroTesoreriaDefecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosParametroTesoreriaDefecto.add(this.jPanelid_sucursalParametroTesoreriaDefecto, this.gridBagConstraintsParametroTesoreriaDefecto);



	if(iXPanelCamposOcultosParametroTesoreriaDefecto % 1==0) {
		iXPanelCamposOcultosParametroTesoreriaDefecto=0;
		iYPanelCamposOcultosParametroTesoreriaDefecto++;
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
			
		GridBagLayout gridaBagLayoutAccionesParametroTesoreriaDefecto= new GridBagLayout();
		this.jPanelAccionesParametroTesoreriaDefecto.setLayout(gridaBagLayoutAccionesParametroTesoreriaDefecto);
		
		GridBagLayout gridaBagLayoutAccionesFormularioParametroTesoreriaDefecto= new GridBagLayout();
		this.jPanelAccionesFormularioParametroTesoreriaDefecto.setLayout(gridaBagLayoutAccionesFormularioParametroTesoreriaDefecto);
		
		this.gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroTesoreriaDefecto.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsParametroTesoreriaDefecto.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioParametroTesoreriaDefecto.add(this.jComboBoxTiposAccionesFormularioParametroTesoreriaDefecto, this.gridBagConstraintsParametroTesoreriaDefecto);

		this.gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroTesoreriaDefecto.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsParametroTesoreriaDefecto.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioParametroTesoreriaDefecto.add(this.jCheckBoxPostAccionNuevoParametroTesoreriaDefecto, this.gridBagConstraintsParametroTesoreriaDefecto);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.parametrotesoreriadefectoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroTesoreriaDefecto.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsParametroTesoreriaDefecto.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioParametroTesoreriaDefecto.add(this.jCheckBoxPostAccionSinCerrarParametroTesoreriaDefecto, this.gridBagConstraintsParametroTesoreriaDefecto);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.parametrotesoreriadefectoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.parametrotesoreriadefectoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroTesoreriaDefecto.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsParametroTesoreriaDefecto.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioParametroTesoreriaDefecto.add(this.jCheckBoxPostAccionSinMensajeParametroTesoreriaDefecto, this.gridBagConstraintsParametroTesoreriaDefecto);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroTesoreriaDefecto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroTesoreriaDefecto.gridy = 0;
		this.gridBagConstraintsParametroTesoreriaDefecto.gridx = iPosXAccion++;
			
		this.jPanelAccionesParametroTesoreriaDefecto.add(this.jButtonModificarParametroTesoreriaDefecto, this.gridBagConstraintsParametroTesoreriaDefecto);							

		this.gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroTesoreriaDefecto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroTesoreriaDefecto.gridy = 0;
		this.gridBagConstraintsParametroTesoreriaDefecto.gridx =iPosXAccion++;
			
		this.jPanelAccionesParametroTesoreriaDefecto.add(this.jButtonEliminarParametroTesoreriaDefecto, this.gridBagConstraintsParametroTesoreriaDefecto);
		
			
		this.gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroTesoreriaDefecto.gridy = 0;		
		this.gridBagConstraintsParametroTesoreriaDefecto.gridx = iPosXAccion++;
		
		this.jPanelAccionesParametroTesoreriaDefecto.add(this.jButtonActualizarParametroTesoreriaDefecto, this.gridBagConstraintsParametroTesoreriaDefecto);


		this.gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroTesoreriaDefecto.gridy = 0;		
		this.gridBagConstraintsParametroTesoreriaDefecto.gridx = iPosXAccion++;
		
		this.jPanelAccionesParametroTesoreriaDefecto.add(this.jButtonGuardarCambiosParametroTesoreriaDefecto, this.gridBagConstraintsParametroTesoreriaDefecto);	
		
		this.gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroTesoreriaDefecto.gridy = 0;		
		this.gridBagConstraintsParametroTesoreriaDefecto.gridx =iPosXAccion++;
		
		this.jPanelAccionesParametroTesoreriaDefecto.add(this.jButtonCancelarParametroTesoreriaDefecto, this.gridBagConstraintsParametroTesoreriaDefecto);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutParametroTesoreriaDefecto = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutParametroTesoreriaDefecto);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.parametrotesoreriadefectoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();						
			this.gridBagConstraintsParametroTesoreriaDefecto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsParametroTesoreriaDefecto.gridx = 0;		
			//this.gridBagConstraintsParametroTesoreriaDefecto.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroTesoreriaDefecto.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsParametroTesoreriaDefecto.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroTesoreriaDefecto.gridy =iGridyPrincipal++;
		this.gridBagConstraintsParametroTesoreriaDefecto.gridx =0;
		this.gridBagConstraintsParametroTesoreriaDefecto.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsParametroTesoreriaDefecto.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosParametroTesoreriaDefecto, this.gridBagConstraintsParametroTesoreriaDefecto);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ParametroTesoreriaDefectoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleParametroTesoreriaDefecto = new ParametroTesoreriaDefectoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Parametro Tesoreria Defecto DATOS");
			
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
			
	        //this.setTitle("[FOR] - Parametro Tesoreria Defecto DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Parametro Tesoreria Defecto Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ParametroTesoreriaDefectoModel parametrotesoreriadefectoModel=new ParametroTesoreriaDefectoModel(this);
			
			//SI USARA CLASE INTERNA
			//ParametroTesoreriaDefectoModel.ParametroTesoreriaDefectoFocusTraversalPolicy parametrotesoreriadefectoFocusTraversalPolicy = parametrotesoreriadefectoModel.new ParametroTesoreriaDefectoFocusTraversalPolicy(this);
			
			//parametrotesoreriadefectoFocusTraversalPolicy.setparametrotesoreriadefectoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(parametrotesoreriadefectoModel);
			
			
			this.jContentPaneDetalleParametroTesoreriaDefecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleParametroTesoreriaDefecto = new GridBagLayout();	
			this.jContentPaneDetalleParametroTesoreriaDefecto.setLayout(gridaBagLayoutDetalleParametroTesoreriaDefecto);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosParametroTesoreriaDefecto = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();
				this.gridBagConstraintsParametroTesoreriaDefecto.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsParametroTesoreriaDefecto.gridx = 0;
					
				
				this.jContentPaneDetalleParametroTesoreriaDefecto.add(jTtoolBarDetalleParametroTesoreriaDefecto, gridBagConstraintsParametroTesoreriaDefecto);								
				
}
			
			this.jScrollPanelDatosEdicionParametroTesoreriaDefecto=   new JScrollPane(jContentPaneDetalleParametroTesoreriaDefecto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionParametroTesoreriaDefecto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroTesoreriaDefecto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroTesoreriaDefecto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralParametroTesoreriaDefecto=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralParametroTesoreriaDefecto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroTesoreriaDefecto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroTesoreriaDefecto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();
			
			
	        this.gridBagConstraintsParametroTesoreriaDefecto.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsParametroTesoreriaDefecto.gridx = 0;
	        
			this.jContentPaneDetalleParametroTesoreriaDefecto.add(jPanelCamposParametroTesoreriaDefecto, gridBagConstraintsParametroTesoreriaDefecto);
			
			
			
			
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
						&& parametrotesoreriadefectoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.parametrotesoreriadefectoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsParametroTesoreriaDefecto= new GridBagConstraints();
						this.gridBagConstraintsParametroTesoreriaDefecto.gridy = iGridyRelaciones++;
						this.gridBagConstraintsParametroTesoreriaDefecto.gridx = 0;
						this.jContentPaneDetalleParametroTesoreriaDefecto.add(this.jTabbedPaneRelacionesParametroTesoreriaDefecto, this.gridBagConstraintsParametroTesoreriaDefecto);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesParametroTesoreriaDefecto.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosParametroTesoreriaDefecto.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();
					this.gridBagConstraintsParametroTesoreriaDefecto.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsParametroTesoreriaDefecto.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsParametroTesoreriaDefecto.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsParametroTesoreriaDefecto.gridx = 0;
					
				
					this.jContentPaneDetalleParametroTesoreriaDefecto.add(jPanelCamposOcultosParametroTesoreriaDefecto, gridBagConstraintsParametroTesoreriaDefecto);
				
					this.jPanelCamposOcultosParametroTesoreriaDefecto.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroTesoreriaDefecto.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsParametroTesoreriaDefecto.gridx = 0;
	        this.gridBagConstraintsParametroTesoreriaDefecto.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleParametroTesoreriaDefecto.add(this.jPanelAccionesFormularioParametroTesoreriaDefecto, this.gridBagConstraintsParametroTesoreriaDefecto);							
			
			
			
			this.gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();
	        this.gridBagConstraintsParametroTesoreriaDefecto.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsParametroTesoreriaDefecto.gridx = 0;
	        
			
			this.jContentPaneDetalleParametroTesoreriaDefecto.add(this.jPanelAccionesParametroTesoreriaDefecto, this.gridBagConstraintsParametroTesoreriaDefecto);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionParametroTesoreriaDefecto);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionParametroTesoreriaDefecto=   new JScrollPane(this.jPanelCamposParametroTesoreriaDefecto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionParametroTesoreriaDefecto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroTesoreriaDefecto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroTesoreriaDefecto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroTesoreriaDefecto.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsParametroTesoreriaDefecto.gridx = 0;
			this.gridBagConstraintsParametroTesoreriaDefecto.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsParametroTesoreriaDefecto.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsParametroTesoreriaDefecto.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionParametroTesoreriaDefecto, this.gridBagConstraintsParametroTesoreriaDefecto);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroTesoreriaDefecto.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsParametroTesoreriaDefecto.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioParametroTesoreriaDefecto, this.gridBagConstraintsParametroTesoreriaDefecto);			
			
			this.gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();
			this.gridBagConstraintsParametroTesoreriaDefecto.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsParametroTesoreriaDefecto.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesParametroTesoreriaDefecto, this.gridBagConstraintsParametroTesoreriaDefecto);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroTesoreriaDefecto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroTesoreriaDefecto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposParametroTesoreriaDefecto, this.gridBagConstraintsParametroTesoreriaDefecto);
			
			
		this.gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroTesoreriaDefecto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroTesoreriaDefecto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosParametroTesoreriaDefecto, this.gridBagConstraintsParametroTesoreriaDefecto);
		
			
		this.gridBagConstraintsParametroTesoreriaDefecto = new GridBagConstraints();
		this.gridBagConstraintsParametroTesoreriaDefecto.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsParametroTesoreriaDefecto.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesParametroTesoreriaDefecto, this.gridBagConstraintsParametroTesoreriaDefecto);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralParametroTesoreriaDefecto;//jContentPane;
		
		return jScrollPanelDatosEdicionParametroTesoreriaDefecto;
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
