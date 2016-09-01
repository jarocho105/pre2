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
package com.bydan.erp.nomina.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.nomina.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.nomina.util.VestimentaConstantesFunciones;

import com.bydan.erp.nomina.business.logic.*;
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
public class VestimentaDetalleFormJInternalFrame extends VestimentaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleVestimenta;
	
	protected JMenuBar jmenuBarDetalleVestimenta;
	
	protected JMenu jmenuDetalleVestimenta;
	protected JMenu jmenuDetalleArchivoVestimenta;
	protected JMenu jmenuDetalleAccionesVestimenta;
	protected JMenu jmenuDetalleDatosVestimenta;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleVestimenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutVestimenta;	
	protected GridBagConstraints gridBagConstraintsVestimenta;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected VestimentaBeanSwingJInternalFrameAdditional jInternalFrameDetalleVestimenta;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public VestimentaSessionBean vestimentaSessionBean;
	
	

	public TallaVestidoBeanSwingJInternalFrame tallavestidoBeanSwingJInternalFrame=null;
	public TallaVestidoBeanSwingJInternalFrame tallavestidoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteTallaVestido=false;
	public TallaVestidoSessionBean tallavestidoSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public VestimentaLogic vestimentaLogic;
	
	public JScrollPane jScrollPanelDatosVestimenta;
	public JScrollPane jScrollPanelDatosEdicionVestimenta;
	public JScrollPane jScrollPanelDatosGeneralVestimenta;
	
	protected JPanel jPanelCamposVestimenta;    
	protected JPanel jPanelCamposOcultosVestimenta;    	
	protected JPanel jPanelAccionesVestimenta;
	protected JPanel jPanelAccionesFormularioVestimenta;
    
	
	
	protected Integer iXPanelCamposVestimenta=0;
	protected Integer iYPanelCamposVestimenta=0;
	
	protected Integer iXPanelCamposOcultosVestimenta=0;
	protected Integer iYPanelCamposOcultosVestimenta=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoVestimenta;
	public JButton jButtonModificarVestimenta;
	public JButton jButtonActualizarVestimenta;
    public JButton jButtonEliminarVestimenta;
	public JButton jButtonCancelarVestimenta;
    public JButton jButtonGuardarCambiosVestimenta;
	public JButton jButtonGuardarCambiosTablaVestimenta;
	protected JButton jButtonCerrarVestimenta;
	
	
	protected JButton jButtonProcesarInformacionVestimenta;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoVestimenta;
	protected JCheckBox jCheckBoxPostAccionSinCerrarVestimenta;
	protected JCheckBox jCheckBoxPostAccionSinMensajeVestimenta;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarVestimenta;
	protected JButton jButtonModificarToolBarVestimenta;
	protected JButton jButtonActualizarToolBarVestimenta;
    protected JButton jButtonEliminarToolBarVestimenta;
	protected JButton jButtonCancelarToolBarVestimenta;
    protected JButton jButtonGuardarCambiosToolBarVestimenta;
	protected JButton jButtonGuardarCambiosTablaToolBarVestimenta;
	protected JButton jButtonMostrarOcultarTablaToolBarVestimenta;
	protected JButton jButtonCerrarToolBarVestimenta;
	
	protected JButton jButtonProcesarInformacionToolBarVestimenta;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoVestimenta;
	protected JMenuItem jMenuItemModificarVestimenta;
	protected JMenuItem jMenuItemActualizarVestimenta;
    protected JMenuItem jMenuItemEliminarVestimenta;
	protected JMenuItem jMenuItemCancelarVestimenta;
    protected JMenuItem jMenuItemGuardarCambiosVestimenta;
	protected JMenuItem jMenuItemGuardarCambiosTablaVestimenta;
	protected JMenuItem jMenuItemCerrarVestimenta;
	protected JMenuItem jMenuItemDetalleCerrarVestimenta;
	protected JMenuItem jMenuItemDetalleMostarOcultarVestimenta;
	
	protected JMenuItem jMenuItemProcesarInformacionVestimenta;
	protected JMenuItem jMenuItemNuevoGuardarCambiosVestimenta;
	protected JMenuItem jMenuItemMostrarOcultarVestimenta;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesVestimenta;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesVestimenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesVestimenta;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioVestimenta;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidVestimenta;
	public JLabel jLabelIdVestimenta;
	public JLabel jLabelidVestimenta;
	public JButton jButtonidVestimentaBusqueda= new JButtonMe();

	public JPanel jPanelnombreVestimenta;
	public JLabel jLabelnombreVestimenta;
	public JTextArea jTextAreanombreVestimenta;
	public JScrollPane jscrollPanenombreVestimenta;
	public JButton jButtonnombreVestimentaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaVestimenta;
	public JLabel jLabelid_empresaVestimenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaVestimenta;
	public JButton jButtonid_empresaVestimenta= new JButtonMe();
	public JButton jButtonid_empresaVestimentaUpdate= new JButtonMe();
	public JButton jButtonid_empresaVestimentaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesVestimenta;
	
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
	
	public VestimentaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposVestimenta=new JPanel();
				this.jPanelAccionesFormularioVestimenta=new JPanel();
				this.jmenuBarDetalleVestimenta=new JMenuBar();
				this.jTtoolBarDetalleVestimenta=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VestimentaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Vestimenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public VestimentaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Vestimenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VestimentaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Vestimenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VestimentaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Vestimenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VestimentaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Vestimenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarVestimenta() {
		return this.jButtonActualizarToolBarVestimenta;
	}
	
	public JButton getjButtonEliminarToolBarVestimenta() {
		return this.jButtonEliminarToolBarVestimenta;
	}
	
	public JButton getjButtonCancelarToolBarVestimenta() {
		return this.jButtonCancelarToolBarVestimenta;
	}		
	
	public JButton getjButtonProcesarInformacionVestimenta() {
		return this.jButtonProcesarInformacionVestimenta;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionVestimenta)	{
		this.jButtonProcesarInformacionVestimenta = jButtonProcesarInformacionVestimenta;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesVestimenta() {
		return this.jComboBoxTiposAccionesVestimenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesVestimenta(
			JComboBox jComboBoxTiposRelacionesVestimenta) {
		this.jComboBoxTiposRelacionesVestimenta = jComboBoxTiposRelacionesVestimenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesVestimenta(
			JComboBox jComboBoxTiposAccionesVestimenta) {
		this.jComboBoxTiposAccionesVestimenta = jComboBoxTiposAccionesVestimenta;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioVestimenta() {
		return this.jComboBoxTiposAccionesFormularioVestimenta;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioVestimenta(
			JComboBox jComboBoxTiposAccionesFormularioVestimenta) {
		this.jComboBoxTiposAccionesFormularioVestimenta = jComboBoxTiposAccionesFormularioVestimenta;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.vestimentaSessionBean=new VestimentaSessionBean();
		
		this.vestimentaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.vestimentaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.vestimentaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.tallavestidoSessionBean=new TallaVestidoSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		VestimentaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		VestimentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		VestimentaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Vestimenta MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.vestimentaSessionBean.getEsGuardarRelacionado()) {
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
	
		VestimentaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleVestimenta= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarVestimenta=new JButtonMe();
				this.jButtonModificarToolBarVestimenta=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarVestimenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarVestimenta,this.jTtoolBarDetalleVestimenta,
							"actualizar","actualizar","Actualizar"+" "+VestimentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarVestimenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarVestimenta,this.jTtoolBarDetalleVestimenta,
							"eliminar","eliminar","Eliminar"+" "+VestimentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarVestimenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarVestimenta,this.jTtoolBarDetalleVestimenta,
							"cancelar","cancelar","Cancelar"+" "+VestimentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarVestimenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarVestimenta,this.jTtoolBarDetalleVestimenta,
							"guardarcambios","guardarcambios","Guardar"+" "+VestimentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarVestimenta,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarVestimenta,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarVestimenta,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleVestimenta=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleVestimenta=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoVestimenta=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesVestimenta=new JMenuMe("Acciones");
		this.jmenuDetalleDatosVestimenta=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoVestimenta= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoVestimenta.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoVestimenta,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoVestimenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarVestimenta= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarVestimenta.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarVestimenta,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarVestimenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarVestimenta= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarVestimenta.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarVestimenta,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarVestimenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarVestimenta= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarVestimenta.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarVestimenta,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarVestimenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarVestimenta= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarVestimenta.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarVestimenta,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarVestimenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosVestimenta= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosVestimenta.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosVestimenta,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosVestimenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarVestimenta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarVestimenta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarVestimenta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarVestimenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarVestimenta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarVestimenta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarVestimenta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarVestimenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarVestimenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarVestimenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarVestimenta,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarVestimenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarVestimenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarVestimenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarVestimenta,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarVestimenta, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoVestimenta.add(this.jMenuItemDetalleCerrarVestimenta);
		
		this.jmenuDetalleAccionesVestimenta.add(this.jMenuItemActualizarVestimenta);
		this.jmenuDetalleAccionesVestimenta.add(this.jMenuItemEliminarVestimenta);
		this.jmenuDetalleAccionesVestimenta.add(this.jMenuItemCancelarVestimenta);		
		
		//this.jmenuDetalleDatosVestimenta.add(this.jMenuItemDetalleAbrirOrderByVestimenta);				
		this.jmenuDetalleDatosVestimenta.add(this.jMenuItemDetalleMostarOcultarVestimenta);				
				
		//this.jmenuDetalleAccionesVestimenta.add(this.jMenuItemGuardarCambiosVestimenta);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoVestimenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesVestimenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosVestimenta, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleVestimenta.add(this.jmenuDetalleArchivoVestimenta);		
		this.jmenuBarDetalleVestimenta.add(this.jmenuDetalleAccionesVestimenta);		
		this.jmenuBarDetalleVestimenta.add(this.jmenuDetalleDatosVestimenta);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleVestimenta, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleVestimenta.add(this.jmenuDetalleVestimenta);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleVestimenta);				
	}
	
	
	public void inicializarElementosCamposVestimenta() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdVestimenta = new JLabelMe();
		jLabelIdVestimenta.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdVestimenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdVestimenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdVestimenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdVestimenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidVestimenta = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidVestimenta.setToolTipText(VestimentaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutVestimenta= new GridBagLayout();

		this.jPanelidVestimenta.setLayout(this.gridaBagLayoutVestimenta);

		jLabelidVestimenta = new JLabel();
		jLabelidVestimenta.setText("Id");

		jLabelidVestimenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidVestimenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidVestimenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreVestimenta = new JLabelMe();
		this.jLabelnombreVestimenta.setText(""+VestimentaConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreVestimenta.setToolTipText("Nombre");
		this.jLabelnombreVestimenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreVestimenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreVestimenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreVestimenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreVestimenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreVestimenta.setToolTipText(VestimentaConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutVestimenta = new GridBagLayout();
		this.jPanelnombreVestimenta.setLayout(this.gridaBagLayoutVestimenta);


		jTextAreanombreVestimenta= new JTextAreaMe();
		jTextAreanombreVestimenta.setEnabled(false);
		jTextAreanombreVestimenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreVestimenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreVestimenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreVestimenta.setLineWrap(true);
		jTextAreanombreVestimenta.setWrapStyleWord(true);
		jTextAreanombreVestimenta.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreVestimenta.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreVestimenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreVestimenta = new JScrollPane(jTextAreanombreVestimenta);
		jscrollPanenombreVestimenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreVestimenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreVestimenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreVestimentaBusqueda= new JButtonMe();
		this.jButtonnombreVestimentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreVestimentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreVestimentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreVestimentaBusqueda.setText("U");
		this.jButtonnombreVestimentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreVestimentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreVestimentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreVestimenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreVestimenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreVestimentaBusqueda"));

		if(this.vestimentaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreVestimentaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysVestimenta() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaVestimenta = new JLabelMe();
		this.jLabelid_empresaVestimenta.setText(""+VestimentaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaVestimenta.setToolTipText("Empresa");
		this.jLabelid_empresaVestimenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaVestimenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaVestimenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaVestimenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaVestimenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaVestimenta.setToolTipText(VestimentaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutVestimenta = new GridBagLayout();
		this.jPanelid_empresaVestimenta.setLayout(this.gridaBagLayoutVestimenta);


		jComboBoxid_empresaVestimenta= new JComboBoxMe();
		jComboBoxid_empresaVestimenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaVestimenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaVestimenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaVestimenta,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaVestimenta.setEnabled(false);

		this.jButtonid_empresaVestimenta= new JButtonMe();
		this.jButtonid_empresaVestimenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaVestimenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaVestimenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaVestimenta.setText("Buscar");
		this.jButtonid_empresaVestimenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaVestimenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaVestimenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaVestimenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaVestimenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaVestimenta"));

		this.jButtonid_empresaVestimentaBusqueda= new JButtonMe();
		this.jButtonid_empresaVestimentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaVestimentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaVestimentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaVestimentaBusqueda.setText("U");
		this.jButtonid_empresaVestimentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaVestimentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaVestimentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaVestimenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaVestimenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaVestimentaBusqueda"));

		if(this.vestimentaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaVestimentaBusqueda.setVisible(false);		}

		this.jButtonid_empresaVestimentaUpdate= new JButtonMe();
		this.jButtonid_empresaVestimentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaVestimentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaVestimentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaVestimentaUpdate.setText("U");
		this.jButtonid_empresaVestimentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaVestimentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaVestimentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaVestimenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaVestimenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaVestimentaUpdate"));



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
		//this.jInternalFrameDetalleVestimenta = new VestimentaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Vestimenta DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutVestimenta= new GridBagLayout();
		

		
		String sToolTipVestimenta="";
		sToolTipVestimenta=VestimentaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipVestimenta+="(Nomina.Vestimenta)";
		}
		
		if(!this.vestimentaSessionBean.getEsGuardarRelacionado()) {
			sToolTipVestimenta+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoVestimenta = new JButtonMe();
		this.jButtonModificarVestimenta = new JButtonMe();
        this.jButtonActualizarVestimenta = new JButtonMe();
        this.jButtonEliminarVestimenta = new JButtonMe();
        this.jButtonCancelarVestimenta = new JButtonMe();
        this.jButtonGuardarCambiosVestimenta = new JButtonMe();
		this.jButtonGuardarCambiosTablaVestimenta = new JButtonMe();
		this.jButtonCerrarVestimenta = new JButtonMe();
		
		this.jScrollPanelDatosVestimenta = new JScrollPane();   
        this.jScrollPanelDatosEdicionVestimenta = new JScrollPane();
		this.jScrollPanelDatosGeneralVestimenta = new JScrollPane();
				
		
		
		this.jPanelCamposVestimenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosVestimenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesVestimenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioVestimenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Vestimenta";
		
		if(!this.vestimentaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosVestimenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Vestimentas" + this.sPath));
		} else {
			this.jScrollPanelDatosVestimenta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionVestimenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralVestimenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposVestimenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposVestimenta.setName("jPanelCamposVestimenta"); 

		this.jPanelCamposOcultosVestimenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosVestimenta.setName("jPanelCamposOcultosVestimenta"); 

        this.jPanelAccionesVestimenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesVestimenta.setToolTipText("Acciones");
        this.jPanelAccionesVestimenta.setName("Acciones"); 

		this.jPanelAccionesFormularioVestimenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioVestimenta.setToolTipText("Acciones");
        this.jPanelAccionesFormularioVestimenta.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionVestimenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralVestimenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosVestimenta, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposVestimenta, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosVestimenta, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioVestimenta, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoVestimenta.setText("Nuevo");
		this.jButtonModificarVestimenta.setText("Editar");
        this.jButtonActualizarVestimenta.setText("Actualizar");
        this.jButtonEliminarVestimenta.setText("Eliminar");
        this.jButtonCancelarVestimenta.setText("Cancelar");
        this.jButtonGuardarCambiosVestimenta.setText("Guardar");
		this.jButtonGuardarCambiosTablaVestimenta.setText("Guardar");
		this.jButtonCerrarVestimenta.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoVestimenta,"nuevo_button","Nuevo",this.vestimentaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarVestimenta,"modificar_button","Editar",this.vestimentaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarVestimenta,"actualizar_button","Actualizar",this.vestimentaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarVestimenta,"eliminar_button","Eliminar",this.vestimentaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarVestimenta,"cancelar_button","Cancelar",this.vestimentaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosVestimenta,"guardarcambios_button","Guardar",this.vestimentaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaVestimenta,"guardarcambiostabla_button","Guardar",this.vestimentaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarVestimenta,"cerrar_button","Salir",this.vestimentaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoVestimenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarVestimenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosVestimenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaVestimenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarVestimenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarVestimenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarVestimenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarVestimenta, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoVestimenta.setToolTipText("Nuevo"+" "+VestimentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarVestimenta.setToolTipText("Editar"+" "+VestimentaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarVestimenta.setToolTipText("Actualizar"+" "+VestimentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarVestimenta.setToolTipText("Eliminar)"+" "+VestimentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarVestimenta.setToolTipText("Cancelar"+" "+VestimentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosVestimenta.setToolTipText("Guardar"+" "+VestimentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaVestimenta.setToolTipText("Guardar"+" "+VestimentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarVestimenta.setToolTipText("Salir"+" "+VestimentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoVestimenta";
		inputMap = this.jButtonNuevoVestimenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoVestimenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoVestimenta"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarVestimenta";
		inputMap = this.jButtonActualizarVestimenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarVestimenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarVestimenta"));
		
		//ELIMINAR
		sMapKey = "EliminarVestimenta";
		inputMap = this.jButtonEliminarVestimenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarVestimenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarVestimenta"));
		
		//CANCELAR	
		sMapKey = "CancelarVestimenta";
		inputMap = this.jButtonCancelarVestimenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarVestimenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarVestimenta"));
		
		//CERRAR		
		sMapKey = "CerrarVestimenta";
		inputMap = this.jButtonCerrarVestimenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarVestimenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarVestimenta"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaVestimenta";
		inputMap = this.jButtonGuardarCambiosTablaVestimenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaVestimenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaVestimenta"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoVestimenta = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoVestimenta.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoVestimenta.setToolTipText("Nuevo Vestimenta");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoVestimenta, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarVestimenta = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarVestimenta.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarVestimenta.setToolTipText("Sin Cerrar Ventana Vestimenta");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarVestimenta, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeVestimenta = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeVestimenta.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeVestimenta.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeVestimenta, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesVestimenta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesVestimenta.setText("Accion");
		this.jComboBoxTiposAccionesVestimenta.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioVestimenta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioVestimenta.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioVestimenta.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesVestimenta = new JLabelMe();
		
		this.jLabelAccionesVestimenta.setText("Acciones");		
		this.jLabelAccionesVestimenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesVestimenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesVestimenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposVestimenta();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysVestimenta();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesVestimenta=new JTabbedPane();
		this.jTabbedPaneRelacionesVestimenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesVestimenta,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesVestimenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesVestimenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesVestimenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesVestimenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioVestimenta.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioVestimenta.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioVestimenta.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioVestimenta, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposVestimenta = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosVestimenta = new GridBagLayout();
		
		this.jPanelCamposVestimenta.setLayout(gridaBagLayoutCamposVestimenta);
		this.jPanelCamposOcultosVestimenta.setLayout(gridaBagLayoutCamposOcultosVestimenta);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsVestimenta = new GridBagConstraints();
	this.gridBagConstraintsVestimenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVestimenta.gridy = 0;
	this.gridBagConstraintsVestimenta.gridx = 0;
	this.gridBagConstraintsVestimenta.ipadx = 0;
	this.gridBagConstraintsVestimenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidVestimenta.add(jLabelIdVestimenta, this.gridBagConstraintsVestimenta);



	this.gridBagConstraintsVestimenta = new GridBagConstraints();
	this.gridBagConstraintsVestimenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVestimenta.gridy = 0;
	this.gridBagConstraintsVestimenta.gridx = 1;
	this.gridBagConstraintsVestimenta.ipadx = 0;
	this.gridBagConstraintsVestimenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidVestimenta.add(jLabelidVestimenta, this.gridBagConstraintsVestimenta);


	this.gridBagConstraintsVestimenta = new GridBagConstraints();
	this.gridBagConstraintsVestimenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVestimenta.gridy = 0;
	this.gridBagConstraintsVestimenta.gridx = 0;
	this.gridBagConstraintsVestimenta.ipadx = 0;
	this.gridBagConstraintsVestimenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaVestimenta.add(jLabelid_empresaVestimenta, this.gridBagConstraintsVestimenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVestimenta = new GridBagConstraints();
		//this.gridBagConstraintsVestimenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVestimenta.gridy = 0;
		this.gridBagConstraintsVestimenta.gridx = 2;
		this.gridBagConstraintsVestimenta.ipadx = 0;
		this.gridBagConstraintsVestimenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaVestimenta.add(jButtonid_empresaVestimentaBusqueda, this.gridBagConstraintsVestimenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVestimenta = new GridBagConstraints();
		//this.gridBagConstraintsVestimenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVestimenta.gridy = 0;
		this.gridBagConstraintsVestimenta.gridx = 3;
		this.gridBagConstraintsVestimenta.ipadx = 0;
		this.gridBagConstraintsVestimenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaVestimenta.add(jButtonid_empresaVestimentaUpdate, this.gridBagConstraintsVestimenta);
	}

	this.gridBagConstraintsVestimenta = new GridBagConstraints();
	this.gridBagConstraintsVestimenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVestimenta.gridy = 0;
	this.gridBagConstraintsVestimenta.gridx = 1;
	this.gridBagConstraintsVestimenta.ipadx = 0;
	this.gridBagConstraintsVestimenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaVestimenta.add(jComboBoxid_empresaVestimenta, this.gridBagConstraintsVestimenta);


	this.gridBagConstraintsVestimenta = new GridBagConstraints();
	this.gridBagConstraintsVestimenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVestimenta.gridy = 0;
	this.gridBagConstraintsVestimenta.gridx = 0;
	this.gridBagConstraintsVestimenta.ipadx = 0;
	this.gridBagConstraintsVestimenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreVestimenta.add(jLabelnombreVestimenta, this.gridBagConstraintsVestimenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVestimenta = new GridBagConstraints();
		//this.gridBagConstraintsVestimenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVestimenta.gridy = 0;
		this.gridBagConstraintsVestimenta.gridx = 2;
		this.gridBagConstraintsVestimenta.ipadx = 0;
		this.gridBagConstraintsVestimenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreVestimenta.add(jButtonnombreVestimentaBusqueda, this.gridBagConstraintsVestimenta);
	}

	this.gridBagConstraintsVestimenta = new GridBagConstraints();
	this.gridBagConstraintsVestimenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVestimenta.gridy = 0;
	this.gridBagConstraintsVestimenta.gridx = 1;
	this.gridBagConstraintsVestimenta.ipadx = 0;
	this.gridBagConstraintsVestimenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreVestimenta.add(jscrollPanenombreVestimenta, this.gridBagConstraintsVestimenta);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsVestimenta = new GridBagConstraints();
	this.gridBagConstraintsVestimenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVestimenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVestimenta.gridy = iYPanelCamposVestimenta;
	this.gridBagConstraintsVestimenta.gridx = iXPanelCamposVestimenta++;
	this.gridBagConstraintsVestimenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVestimenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVestimenta.add(this.jPanelidVestimenta, this.gridBagConstraintsVestimenta);



	if(iXPanelCamposVestimenta % 1==0) {
		iXPanelCamposVestimenta=0;
		iYPanelCamposVestimenta++;
	}
	this.gridBagConstraintsVestimenta = new GridBagConstraints();
	this.gridBagConstraintsVestimenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVestimenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVestimenta.gridy = iYPanelCamposVestimenta;
	this.gridBagConstraintsVestimenta.gridx = iXPanelCamposVestimenta++;
	this.gridBagConstraintsVestimenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVestimenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVestimenta.add(this.jPanelnombreVestimenta, this.gridBagConstraintsVestimenta);



	if(iXPanelCamposVestimenta % 1==0) {
		iXPanelCamposVestimenta=0;
		iYPanelCamposVestimenta++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsVestimenta = new GridBagConstraints();
	this.gridBagConstraintsVestimenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVestimenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVestimenta.gridy = iYPanelCamposOcultosVestimenta;
	this.gridBagConstraintsVestimenta.gridx = iXPanelCamposOcultosVestimenta++;
	this.gridBagConstraintsVestimenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVestimenta.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosVestimenta.add(this.jPanelid_empresaVestimenta, this.gridBagConstraintsVestimenta);



	if(iXPanelCamposOcultosVestimenta % 1==0) {
		iXPanelCamposOcultosVestimenta=0;
		iYPanelCamposOcultosVestimenta++;
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
			
		GridBagLayout gridaBagLayoutAccionesVestimenta= new GridBagLayout();
		this.jPanelAccionesVestimenta.setLayout(gridaBagLayoutAccionesVestimenta);
		
		GridBagLayout gridaBagLayoutAccionesFormularioVestimenta= new GridBagLayout();
		this.jPanelAccionesFormularioVestimenta.setLayout(gridaBagLayoutAccionesFormularioVestimenta);
		
		this.gridBagConstraintsVestimenta = new GridBagConstraints();
		this.gridBagConstraintsVestimenta.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsVestimenta.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioVestimenta.add(this.jComboBoxTiposAccionesFormularioVestimenta, this.gridBagConstraintsVestimenta);

		this.gridBagConstraintsVestimenta = new GridBagConstraints();
		this.gridBagConstraintsVestimenta.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsVestimenta.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioVestimenta.add(this.jCheckBoxPostAccionNuevoVestimenta, this.gridBagConstraintsVestimenta);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.vestimentaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsVestimenta = new GridBagConstraints();
			this.gridBagConstraintsVestimenta.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsVestimenta.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioVestimenta.add(this.jCheckBoxPostAccionSinCerrarVestimenta, this.gridBagConstraintsVestimenta);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.vestimentaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.vestimentaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsVestimenta = new GridBagConstraints();
			this.gridBagConstraintsVestimenta.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsVestimenta.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioVestimenta.add(this.jCheckBoxPostAccionSinMensajeVestimenta, this.gridBagConstraintsVestimenta);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsVestimenta = new GridBagConstraints();
		this.gridBagConstraintsVestimenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVestimenta.gridy = 0;
		this.gridBagConstraintsVestimenta.gridx = iPosXAccion++;
			
		this.jPanelAccionesVestimenta.add(this.jButtonModificarVestimenta, this.gridBagConstraintsVestimenta);							

		this.gridBagConstraintsVestimenta = new GridBagConstraints();
		this.gridBagConstraintsVestimenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVestimenta.gridy = 0;
		this.gridBagConstraintsVestimenta.gridx =iPosXAccion++;
			
		this.jPanelAccionesVestimenta.add(this.jButtonEliminarVestimenta, this.gridBagConstraintsVestimenta);
		
			
		this.gridBagConstraintsVestimenta = new GridBagConstraints();
		this.gridBagConstraintsVestimenta.gridy = 0;		
		this.gridBagConstraintsVestimenta.gridx = iPosXAccion++;
		
		this.jPanelAccionesVestimenta.add(this.jButtonActualizarVestimenta, this.gridBagConstraintsVestimenta);


		this.gridBagConstraintsVestimenta = new GridBagConstraints();
		this.gridBagConstraintsVestimenta.gridy = 0;		
		this.gridBagConstraintsVestimenta.gridx = iPosXAccion++;
		
		this.jPanelAccionesVestimenta.add(this.jButtonGuardarCambiosVestimenta, this.gridBagConstraintsVestimenta);	
		
		this.gridBagConstraintsVestimenta = new GridBagConstraints();
		this.gridBagConstraintsVestimenta.gridy = 0;		
		this.gridBagConstraintsVestimenta.gridx =iPosXAccion++;
		
		this.jPanelAccionesVestimenta.add(this.jButtonCancelarVestimenta, this.gridBagConstraintsVestimenta);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutVestimenta = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutVestimenta);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.vestimentaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsVestimenta = new GridBagConstraints();						
			this.gridBagConstraintsVestimenta.gridy = iGridyPrincipal++;
			this.gridBagConstraintsVestimenta.gridx = 0;		
			//this.gridBagConstraintsVestimenta.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVestimenta.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsVestimenta.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsVestimenta = new GridBagConstraints();
		this.gridBagConstraintsVestimenta.gridy =iGridyPrincipal++;
		this.gridBagConstraintsVestimenta.gridx =0;
		this.gridBagConstraintsVestimenta.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsVestimenta.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosVestimenta, this.gridBagConstraintsVestimenta);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(VestimentaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleVestimenta = new VestimentaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Vestimenta DATOS");
			
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
			
	        //this.setTitle("[FOR] - Vestimenta DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Vestimenta Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			VestimentaModel vestimentaModel=new VestimentaModel(this);
			
			//SI USARA CLASE INTERNA
			//VestimentaModel.VestimentaFocusTraversalPolicy vestimentaFocusTraversalPolicy = vestimentaModel.new VestimentaFocusTraversalPolicy(this);
			
			//vestimentaFocusTraversalPolicy.setvestimentaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(vestimentaModel);
			
			
			this.jContentPaneDetalleVestimenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleVestimenta = new GridBagLayout();	
			this.jContentPaneDetalleVestimenta.setLayout(gridaBagLayoutDetalleVestimenta);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosVestimenta = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsVestimenta = new GridBagConstraints();
				this.gridBagConstraintsVestimenta.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsVestimenta.gridx = 0;
					
				
				this.jContentPaneDetalleVestimenta.add(jTtoolBarDetalleVestimenta, gridBagConstraintsVestimenta);								
				
}
			
			this.jScrollPanelDatosEdicionVestimenta=   new JScrollPane(jContentPaneDetalleVestimenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionVestimenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionVestimenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionVestimenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralVestimenta=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralVestimenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralVestimenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralVestimenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsVestimenta = new GridBagConstraints();
			
			
	        this.gridBagConstraintsVestimenta.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsVestimenta.gridx = 0;
	        
			this.jContentPaneDetalleVestimenta.add(jPanelCamposVestimenta, gridBagConstraintsVestimenta);
			
			
			
			
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
						&& vestimentaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameTallaVestido(this.puedeCargarPorParteTallaVestido,false,-1);
					
					if(this.vestimentaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsVestimenta= new GridBagConstraints();
						this.gridBagConstraintsVestimenta.gridy = iGridyRelaciones++;
						this.gridBagConstraintsVestimenta.gridx = 0;
						this.jContentPaneDetalleVestimenta.add(this.jTabbedPaneRelacionesVestimenta, this.gridBagConstraintsVestimenta);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesVestimenta.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameTallaVestido(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosVestimenta.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsVestimenta = new GridBagConstraints();
					this.gridBagConstraintsVestimenta.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsVestimenta.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsVestimenta.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsVestimenta.gridx = 0;
					
				
					this.jContentPaneDetalleVestimenta.add(jPanelCamposOcultosVestimenta, gridBagConstraintsVestimenta);
				
					this.jPanelCamposOcultosVestimenta.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsVestimenta = new GridBagConstraints();
			this.gridBagConstraintsVestimenta.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsVestimenta.gridx = 0;
	        this.gridBagConstraintsVestimenta.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleVestimenta.add(this.jPanelAccionesFormularioVestimenta, this.gridBagConstraintsVestimenta);							
			
			
			
			this.gridBagConstraintsVestimenta = new GridBagConstraints();
	        this.gridBagConstraintsVestimenta.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsVestimenta.gridx = 0;
	        
			
			this.jContentPaneDetalleVestimenta.add(this.jPanelAccionesVestimenta, this.gridBagConstraintsVestimenta);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionVestimenta);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionVestimenta=   new JScrollPane(this.jPanelCamposVestimenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionVestimenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionVestimenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionVestimenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsVestimenta = new GridBagConstraints();
			this.gridBagConstraintsVestimenta.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsVestimenta.gridx = 0;
			this.gridBagConstraintsVestimenta.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsVestimenta.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsVestimenta.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionVestimenta, this.gridBagConstraintsVestimenta);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsVestimenta = new GridBagConstraints();
			this.gridBagConstraintsVestimenta.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsVestimenta.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioVestimenta, this.gridBagConstraintsVestimenta);			
			
			this.gridBagConstraintsVestimenta = new GridBagConstraints();
			this.gridBagConstraintsVestimenta.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsVestimenta.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesVestimenta, this.gridBagConstraintsVestimenta);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsVestimenta = new GridBagConstraints();
		this.gridBagConstraintsVestimenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVestimenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposVestimenta, this.gridBagConstraintsVestimenta);
			
			
		this.gridBagConstraintsVestimenta = new GridBagConstraints();
		this.gridBagConstraintsVestimenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVestimenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosVestimenta, this.gridBagConstraintsVestimenta);
		
			
		this.gridBagConstraintsVestimenta = new GridBagConstraints();
		this.gridBagConstraintsVestimenta.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsVestimenta.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesVestimenta, this.gridBagConstraintsVestimenta);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralVestimenta;//jContentPane;
		
		return jScrollPanelDatosEdicionVestimenta;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameTallaVestido(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.tallavestidoSessionBean=new TallaVestidoSessionBean();
		this.tallavestidoSessionBean.setConGuardarRelaciones(false);
		this.tallavestidoSessionBean.setEsGuardarRelacionado(true);

		this.tallavestidoBeanSwingJInternalFrame=null;//new TallaVestidoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.tallavestidoBeanSwingJInternalFramePopup=new TallaVestidoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.tallavestidoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.tallavestidoSessionBean.getEsGuardarRelacionado()) {

				TallaVestidoJInternalFrame.STIPO_TAMANIO_GENERAL=VestimentaJInternalFrame.STIPO_TAMANIO_GENERAL;
				TallaVestidoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=VestimentaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.tallavestidoSessionBean.setEsGuardarRelacionado(true);

				this.tallavestidoBeanSwingJInternalFrame=new TallaVestidoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.tallavestidoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.tallavestidoBeanSwingJInternalFrame.settallavestidoSessionBean(this.tallavestidoSessionBean);

				//this.gridBagConstraintsVestimenta = new GridBagConstraints();
				//this.gridBagConstraintsVestimenta.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsVestimenta.gridx = 0;
				//this.jContentPaneDetalleVestimenta.add(this.tallavestidoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsVestimenta);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesVestimenta.add("Talla Vestidos",this.tallavestidoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesVestimenta.setComponentAt(iIndexTab,this.tallavestidoBeanSwingJInternalFrame.getContentPane());
				}

				//TallaVestidoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.tallavestidoSessionBean.setEsGuardarRelacionado(false);
				this.tallavestidoBeanSwingJInternalFrame=null;//new TallaVestidoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.tallavestidoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteTallaVestido) {
					this.jTabbedPaneRelacionesVestimenta.add("Talla Vestidos",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarTallaVestidoBeanSwingJInternalFrame(List<Vestimenta> vestimentas,Vestimenta vestimenta,TallaVestidoBeanSwingJInternalFrame tallavestidoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//tallavestidoBeanSwingJInternalFrame=new TallaVestidoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					tallavestidoBeanSwingJInternalFrame.getTallaVestidoLogic().setConnexion(this.vestimentaLogic.getConnexion());

					tallavestidoBeanSwingJInternalFrame.setvestimentasForeignKey(vestimentas);
					tallavestidoBeanSwingJInternalFrame.setvestimentaForeignKey(vestimenta);
					tallavestidoBeanSwingJInternalFrame.tallavestidoSessionBean.setisBusquedaDesdeForeignKeySesionVestimenta(true);
					tallavestidoBeanSwingJInternalFrame.tallavestidoSessionBean.setlidVestimentaActual(vestimenta.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					tallavestidoBeanSwingJInternalFrame.cargarCombosForeignKeyTallaVestido(tallavestidoBeanSwingJInternalFrame.isCargarCombosDependencia);
					tallavestidoBeanSwingJInternalFrame.setVisibilidadBusquedasParaVestimenta(true);
					tallavestidoBeanSwingJInternalFrame.setid_vestimentaFK_IdVestimenta(vestimenta.getId());

					if(!this.conCargarFormDetalle) {
						tallavestidoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					tallavestidoBeanSwingJInternalFrame.setSelectedItemCombosFrameVestimentaForeignKey(vestimenta,1,false,true,true);
					tallavestidoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					tallavestidoBeanSwingJInternalFrame.procesarBusqueda("FK_IdVestimenta");
					tallavestidoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdVestimenta");
					tallavestidoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTallaVestido(true);
					tallavestidoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesTallaVestido("n",tallavestidoBeanSwingJInternalFrame.isGuardarCambiosEnLote, tallavestidoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					tallavestidoBeanSwingJInternalFrame.setAutoscrolls(true);
					tallavestidoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						tallavestidoBeanSwingJInternalFrame.actualizarEstadoPanelsTallaVestido("relacionado");
					} else {
						tallavestidoBeanSwingJInternalFrame.actualizarEstadoPanelsTallaVestido("no_relacionado");
					}

					tallavestidoBeanSwingJInternalFrame.getjButtonRecargarInformacionTallaVestido().setVisible(false);

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
