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
import com.bydan.erp.nomina.util.VisaConstantesFunciones;

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
public class VisaDetalleFormJInternalFrame extends VisaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleVisa;
	
	protected JMenuBar jmenuBarDetalleVisa;
	
	protected JMenu jmenuDetalleVisa;
	protected JMenu jmenuDetalleArchivoVisa;
	protected JMenu jmenuDetalleAccionesVisa;
	protected JMenu jmenuDetalleDatosVisa;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleVisa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutVisa;	
	protected GridBagConstraints gridBagConstraintsVisa;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected VisaBeanSwingJInternalFrameAdditional jInternalFrameDetalleVisa;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";
	
	public VisaSessionBean visaSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public PaisSessionBean paisSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;	
	
	public VisaLogic visaLogic;
	
	public JScrollPane jScrollPanelDatosVisa;
	public JScrollPane jScrollPanelDatosEdicionVisa;
	public JScrollPane jScrollPanelDatosGeneralVisa;
	
	protected JPanel jPanelCamposVisa;    
	protected JPanel jPanelCamposOcultosVisa;    	
	protected JPanel jPanelAccionesVisa;
	protected JPanel jPanelAccionesFormularioVisa;
    
	
	
	protected Integer iXPanelCamposVisa=0;
	protected Integer iYPanelCamposVisa=0;
	
	protected Integer iXPanelCamposOcultosVisa=0;
	protected Integer iYPanelCamposOcultosVisa=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoVisa;
	public JButton jButtonModificarVisa;
	public JButton jButtonActualizarVisa;
    public JButton jButtonEliminarVisa;
	public JButton jButtonCancelarVisa;
    public JButton jButtonGuardarCambiosVisa;
	public JButton jButtonGuardarCambiosTablaVisa;
	protected JButton jButtonCerrarVisa;
	
	
	protected JButton jButtonProcesarInformacionVisa;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoVisa;
	protected JCheckBox jCheckBoxPostAccionSinCerrarVisa;
	protected JCheckBox jCheckBoxPostAccionSinMensajeVisa;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarVisa;
	protected JButton jButtonModificarToolBarVisa;
	protected JButton jButtonActualizarToolBarVisa;
    protected JButton jButtonEliminarToolBarVisa;
	protected JButton jButtonCancelarToolBarVisa;
    protected JButton jButtonGuardarCambiosToolBarVisa;
	protected JButton jButtonGuardarCambiosTablaToolBarVisa;
	protected JButton jButtonMostrarOcultarTablaToolBarVisa;
	protected JButton jButtonCerrarToolBarVisa;
	
	protected JButton jButtonProcesarInformacionToolBarVisa;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoVisa;
	protected JMenuItem jMenuItemModificarVisa;
	protected JMenuItem jMenuItemActualizarVisa;
    protected JMenuItem jMenuItemEliminarVisa;
	protected JMenuItem jMenuItemCancelarVisa;
    protected JMenuItem jMenuItemGuardarCambiosVisa;
	protected JMenuItem jMenuItemGuardarCambiosTablaVisa;
	protected JMenuItem jMenuItemCerrarVisa;
	protected JMenuItem jMenuItemDetalleCerrarVisa;
	protected JMenuItem jMenuItemDetalleMostarOcultarVisa;
	
	protected JMenuItem jMenuItemProcesarInformacionVisa;
	protected JMenuItem jMenuItemNuevoGuardarCambiosVisa;
	protected JMenuItem jMenuItemMostrarOcultarVisa;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesVisa;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesVisa;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesVisa;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioVisa;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidVisa;
	public JLabel jLabelIdVisa;
	public JLabel jLabelidVisa;
	public JButton jButtonidVisaBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionVisa;
	public JLabel jLabeldescripcionVisa;
	public JTextArea jTextAreadescripcionVisa;
	public JScrollPane jscrollPanedescripcionVisa;
	public JButton jButtondescripcionVisaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaVisa;
	public JLabel jLabelid_empresaVisa;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaVisa;
	public JButton jButtonid_empresaVisa= new JButtonMe();
	public JButton jButtonid_empresaVisaUpdate= new JButtonMe();
	public JButton jButtonid_empresaVisaBusqueda= new JButtonMe();

	public JPanel jPanelid_paisVisa;
	public JLabel jLabelid_paisVisa;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisVisa;
	public JButton jButtonid_paisVisa= new JButtonMe();
	public JButton jButtonid_paisVisaUpdate= new JButtonMe();
	public JButton jButtonid_paisVisaBusqueda= new JButtonMe();

	public JPanel jPanelid_empleadoVisa;
	public JLabel jLabelid_empleadoVisa;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoVisa;
	public JButton jButtonid_empleadoVisa= new JButtonMe();
	public JButton jButtonid_empleadoVisaUpdate= new JButtonMe();
	public JButton jButtonid_empleadoVisaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesVisa;
	
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
	
	public VisaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposVisa=new JPanel();
				this.jPanelAccionesFormularioVisa=new JPanel();
				this.jmenuBarDetalleVisa=new JMenuBar();
				this.jTtoolBarDetalleVisa=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VisaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Visa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public VisaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Visa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VisaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Visa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VisaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Visa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public VisaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Visa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarVisa() {
		return this.jButtonActualizarToolBarVisa;
	}
	
	public JButton getjButtonEliminarToolBarVisa() {
		return this.jButtonEliminarToolBarVisa;
	}
	
	public JButton getjButtonCancelarToolBarVisa() {
		return this.jButtonCancelarToolBarVisa;
	}		
	
	public JButton getjButtonProcesarInformacionVisa() {
		return this.jButtonProcesarInformacionVisa;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionVisa)	{
		this.jButtonProcesarInformacionVisa = jButtonProcesarInformacionVisa;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesVisa() {
		return this.jComboBoxTiposAccionesVisa;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesVisa(
			JComboBox jComboBoxTiposRelacionesVisa) {
		this.jComboBoxTiposRelacionesVisa = jComboBoxTiposRelacionesVisa;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesVisa(
			JComboBox jComboBoxTiposAccionesVisa) {
		this.jComboBoxTiposAccionesVisa = jComboBoxTiposAccionesVisa;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioVisa() {
		return this.jComboBoxTiposAccionesFormularioVisa;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioVisa(
			JComboBox jComboBoxTiposAccionesFormularioVisa) {
		this.jComboBoxTiposAccionesFormularioVisa = jComboBoxTiposAccionesFormularioVisa;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.visaSessionBean=new VisaSessionBean();
		
		this.visaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.visaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.visaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		VisaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		VisaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		VisaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Visa MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.visaSessionBean.getEsGuardarRelacionado()) {
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
	
		VisaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleVisa= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarVisa=new JButtonMe();
				this.jButtonModificarToolBarVisa=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarVisa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarVisa,this.jTtoolBarDetalleVisa,
							"actualizar","actualizar","Actualizar"+" "+VisaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarVisa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarVisa,this.jTtoolBarDetalleVisa,
							"eliminar","eliminar","Eliminar"+" "+VisaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarVisa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarVisa,this.jTtoolBarDetalleVisa,
							"cancelar","cancelar","Cancelar"+" "+VisaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarVisa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarVisa,this.jTtoolBarDetalleVisa,
							"guardarcambios","guardarcambios","Guardar"+" "+VisaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarVisa,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarVisa,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarVisa,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleVisa=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleVisa=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoVisa=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesVisa=new JMenuMe("Acciones");
		this.jmenuDetalleDatosVisa=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoVisa= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoVisa.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoVisa,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoVisa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarVisa= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarVisa.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarVisa,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarVisa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarVisa= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarVisa.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarVisa,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarVisa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarVisa= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarVisa.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarVisa,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarVisa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarVisa= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarVisa.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarVisa,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarVisa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosVisa= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosVisa.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosVisa,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosVisa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarVisa= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarVisa.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarVisa,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarVisa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarVisa= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarVisa.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarVisa,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarVisa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarVisa= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarVisa.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarVisa,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarVisa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarVisa= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarVisa.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarVisa,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarVisa, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoVisa.add(this.jMenuItemDetalleCerrarVisa);
		
		this.jmenuDetalleAccionesVisa.add(this.jMenuItemActualizarVisa);
		this.jmenuDetalleAccionesVisa.add(this.jMenuItemEliminarVisa);
		this.jmenuDetalleAccionesVisa.add(this.jMenuItemCancelarVisa);		
		
		//this.jmenuDetalleDatosVisa.add(this.jMenuItemDetalleAbrirOrderByVisa);				
		this.jmenuDetalleDatosVisa.add(this.jMenuItemDetalleMostarOcultarVisa);				
				
		//this.jmenuDetalleAccionesVisa.add(this.jMenuItemGuardarCambiosVisa);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoVisa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesVisa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosVisa, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleVisa.add(this.jmenuDetalleArchivoVisa);		
		this.jmenuBarDetalleVisa.add(this.jmenuDetalleAccionesVisa);		
		this.jmenuBarDetalleVisa.add(this.jmenuDetalleDatosVisa);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleVisa);				
	}
	
	
	public void inicializarElementosCamposVisa() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdVisa = new JLabelMe();
		jLabelIdVisa.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdVisa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdVisa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdVisa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdVisa,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidVisa = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidVisa.setToolTipText(VisaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutVisa= new GridBagLayout();

		this.jPanelidVisa.setLayout(this.gridaBagLayoutVisa);

		jLabelidVisa = new JLabel();
		jLabelidVisa.setText("Id");

		jLabelidVisa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidVisa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidVisa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabeldescripcionVisa = new JLabelMe();
		this.jLabeldescripcionVisa.setText(""+VisaConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionVisa.setToolTipText("Descripcion");
		this.jLabeldescripcionVisa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionVisa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionVisa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionVisa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionVisa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionVisa.setToolTipText(VisaConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutVisa = new GridBagLayout();
		this.jPaneldescripcionVisa.setLayout(this.gridaBagLayoutVisa);


		jTextAreadescripcionVisa= new JTextAreaMe();
		jTextAreadescripcionVisa.setEnabled(false);
		jTextAreadescripcionVisa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionVisa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionVisa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionVisa.setLineWrap(true);
		jTextAreadescripcionVisa.setWrapStyleWord(true);
		jTextAreadescripcionVisa.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionVisa.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionVisa,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionVisa = new JScrollPane(jTextAreadescripcionVisa);
		jscrollPanedescripcionVisa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionVisa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionVisa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionVisaBusqueda= new JButtonMe();
		this.jButtondescripcionVisaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionVisaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionVisaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionVisaBusqueda.setText("U");
		this.jButtondescripcionVisaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionVisaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionVisaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionVisa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionVisa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionVisaBusqueda"));

		if(this.visaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionVisaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysVisa() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaVisa = new JLabelMe();
		this.jLabelid_empresaVisa.setText(""+VisaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaVisa.setToolTipText("Empresa");
		this.jLabelid_empresaVisa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaVisa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaVisa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaVisa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaVisa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaVisa.setToolTipText(VisaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutVisa = new GridBagLayout();
		this.jPanelid_empresaVisa.setLayout(this.gridaBagLayoutVisa);


		jComboBoxid_empresaVisa= new JComboBoxMe();
		jComboBoxid_empresaVisa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaVisa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaVisa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaVisa,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaVisa.setEnabled(false);

		this.jButtonid_empresaVisa= new JButtonMe();
		this.jButtonid_empresaVisa.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaVisa.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaVisa.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaVisa.setText("Buscar");
		this.jButtonid_empresaVisa.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaVisa.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaVisa,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaVisa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaVisa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaVisa"));

		this.jButtonid_empresaVisaBusqueda= new JButtonMe();
		this.jButtonid_empresaVisaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaVisaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaVisaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaVisaBusqueda.setText("U");
		this.jButtonid_empresaVisaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaVisaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaVisaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaVisa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaVisa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaVisaBusqueda"));

		if(this.visaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaVisaBusqueda.setVisible(false);		}

		this.jButtonid_empresaVisaUpdate= new JButtonMe();
		this.jButtonid_empresaVisaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaVisaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaVisaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaVisaUpdate.setText("U");
		this.jButtonid_empresaVisaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaVisaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaVisaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaVisa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaVisa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaVisaUpdate"));



					
		this.jLabelid_paisVisa = new JLabelMe();
		this.jLabelid_paisVisa.setText(""+VisaConstantesFunciones.LABEL_IDPAIS+" : *");
		this.jLabelid_paisVisa.setToolTipText("Pais");
		this.jLabelid_paisVisa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisVisa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisVisa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_paisVisa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_paisVisa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_paisVisa.setToolTipText(VisaConstantesFunciones.LABEL_IDPAIS);
		this.gridaBagLayoutVisa = new GridBagLayout();
		this.jPanelid_paisVisa.setLayout(this.gridaBagLayoutVisa);


		jComboBoxid_paisVisa= new JComboBoxMe();
		jComboBoxid_paisVisa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisVisa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisVisa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisVisa,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_paisVisa= new JButtonMe();
		this.jButtonid_paisVisa.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisVisa.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisVisa.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisVisa.setText("Buscar");
		this.jButtonid_paisVisa.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_paisVisa.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisVisa,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_paisVisa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisVisa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisVisa"));

		this.jButtonid_paisVisaBusqueda= new JButtonMe();
		this.jButtonid_paisVisaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisVisaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisVisaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisVisaBusqueda.setText("U");
		this.jButtonid_paisVisaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_paisVisaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisVisaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_paisVisa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisVisa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisVisaBusqueda"));

		if(this.visaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_paisVisaBusqueda.setVisible(false);		}

		this.jButtonid_paisVisaUpdate= new JButtonMe();
		this.jButtonid_paisVisaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisVisaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisVisaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisVisaUpdate.setText("U");
		this.jButtonid_paisVisaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_paisVisaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisVisaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_paisVisa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisVisa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisVisaUpdate"));



					
		this.jLabelid_empleadoVisa = new JLabelMe();
		this.jLabelid_empleadoVisa.setText(""+VisaConstantesFunciones.LABEL_IDEMPLEADO+" : *");
		this.jLabelid_empleadoVisa.setToolTipText("Empleado");
		this.jLabelid_empleadoVisa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoVisa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoVisa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoVisa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empleadoVisa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empleadoVisa.setToolTipText(VisaConstantesFunciones.LABEL_IDEMPLEADO);
		this.gridaBagLayoutVisa = new GridBagLayout();
		this.jPanelid_empleadoVisa.setLayout(this.gridaBagLayoutVisa);


		jComboBoxid_empleadoVisa= new JComboBoxMe();
		jComboBoxid_empleadoVisa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoVisa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoVisa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoVisa,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empleadoVisa= new JButtonMe();
		this.jButtonid_empleadoVisa.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoVisa.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoVisa.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoVisa.setText("Buscar");
		this.jButtonid_empleadoVisa.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empleadoVisa.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoVisa,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empleadoVisa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoVisa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoVisa"));

		this.jButtonid_empleadoVisaBusqueda= new JButtonMe();
		this.jButtonid_empleadoVisaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoVisaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoVisaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoVisaBusqueda.setText("U");
		this.jButtonid_empleadoVisaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empleadoVisaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoVisaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empleadoVisa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoVisa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoVisaBusqueda"));

		if(this.visaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empleadoVisaBusqueda.setVisible(false);		}

		this.jButtonid_empleadoVisaUpdate= new JButtonMe();
		this.jButtonid_empleadoVisaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoVisaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoVisaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoVisaUpdate.setText("U");
		this.jButtonid_empleadoVisaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empleadoVisaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoVisaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empleadoVisa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoVisa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoVisaUpdate"));



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
		//this.jInternalFrameDetalleVisa = new VisaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Visa DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutVisa= new GridBagLayout();
		

		
		String sToolTipVisa="";
		sToolTipVisa=VisaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipVisa+="(Nomina.Visa)";
		}
		
		if(!this.visaSessionBean.getEsGuardarRelacionado()) {
			sToolTipVisa+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoVisa = new JButtonMe();
		this.jButtonModificarVisa = new JButtonMe();
        this.jButtonActualizarVisa = new JButtonMe();
        this.jButtonEliminarVisa = new JButtonMe();
        this.jButtonCancelarVisa = new JButtonMe();
        this.jButtonGuardarCambiosVisa = new JButtonMe();
		this.jButtonGuardarCambiosTablaVisa = new JButtonMe();
		this.jButtonCerrarVisa = new JButtonMe();
		
		this.jScrollPanelDatosVisa = new JScrollPane();   
        this.jScrollPanelDatosEdicionVisa = new JScrollPane();
		this.jScrollPanelDatosGeneralVisa = new JScrollPane();
				
		
		
		this.jPanelCamposVisa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosVisa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesVisa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioVisa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Visa";
		
		if(!this.visaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosVisa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Visas" + this.sPath));
		} else {
			this.jScrollPanelDatosVisa.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionVisa.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralVisa.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposVisa.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposVisa.setName("jPanelCamposVisa"); 

		this.jPanelCamposOcultosVisa.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosVisa.setName("jPanelCamposOcultosVisa"); 

        this.jPanelAccionesVisa.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesVisa.setToolTipText("Acciones");
        this.jPanelAccionesVisa.setName("Acciones"); 

		this.jPanelAccionesFormularioVisa.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioVisa.setToolTipText("Acciones");
        this.jPanelAccionesFormularioVisa.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionVisa, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralVisa, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosVisa, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposVisa, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosVisa, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioVisa, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoVisa.setText("Nuevo");
		this.jButtonModificarVisa.setText("Editar");
        this.jButtonActualizarVisa.setText("Actualizar");
        this.jButtonEliminarVisa.setText("Eliminar");
        this.jButtonCancelarVisa.setText("Cancelar");
        this.jButtonGuardarCambiosVisa.setText("Guardar");
		this.jButtonGuardarCambiosTablaVisa.setText("Guardar");
		this.jButtonCerrarVisa.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoVisa,"nuevo_button","Nuevo",this.visaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarVisa,"modificar_button","Editar",this.visaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarVisa,"actualizar_button","Actualizar",this.visaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarVisa,"eliminar_button","Eliminar",this.visaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarVisa,"cancelar_button","Cancelar",this.visaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosVisa,"guardarcambios_button","Guardar",this.visaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaVisa,"guardarcambiostabla_button","Guardar",this.visaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarVisa,"cerrar_button","Salir",this.visaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoVisa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarVisa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosVisa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaVisa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarVisa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarVisa, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarVisa, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarVisa, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoVisa.setToolTipText("Nuevo"+" "+VisaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarVisa.setToolTipText("Editar"+" "+VisaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarVisa.setToolTipText("Actualizar"+" "+VisaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarVisa.setToolTipText("Eliminar)"+" "+VisaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarVisa.setToolTipText("Cancelar"+" "+VisaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosVisa.setToolTipText("Guardar"+" "+VisaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaVisa.setToolTipText("Guardar"+" "+VisaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarVisa.setToolTipText("Salir"+" "+VisaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoVisa";
		inputMap = this.jButtonNuevoVisa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoVisa.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoVisa"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarVisa";
		inputMap = this.jButtonActualizarVisa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarVisa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarVisa"));
		
		//ELIMINAR
		sMapKey = "EliminarVisa";
		inputMap = this.jButtonEliminarVisa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarVisa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarVisa"));
		
		//CANCELAR	
		sMapKey = "CancelarVisa";
		inputMap = this.jButtonCancelarVisa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarVisa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarVisa"));
		
		//CERRAR		
		sMapKey = "CerrarVisa";
		inputMap = this.jButtonCerrarVisa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarVisa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarVisa"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaVisa";
		inputMap = this.jButtonGuardarCambiosTablaVisa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaVisa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaVisa"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoVisa = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoVisa.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoVisa.setToolTipText("Nuevo Visa");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoVisa, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarVisa = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarVisa.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarVisa.setToolTipText("Sin Cerrar Ventana Visa");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarVisa, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeVisa = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeVisa.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeVisa.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeVisa, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesVisa = new JComboBoxMe();
		//this.jComboBoxTiposAccionesVisa.setText("Accion");
		this.jComboBoxTiposAccionesVisa.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioVisa = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioVisa.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioVisa.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesVisa = new JLabelMe();
		
		this.jLabelAccionesVisa.setText("Acciones");		
		this.jLabelAccionesVisa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesVisa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesVisa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposVisa();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysVisa();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesVisa=new JTabbedPane();
		this.jTabbedPaneRelacionesVisa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesVisa,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesVisa.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesVisa.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesVisa.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesVisa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioVisa.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioVisa.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioVisa.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioVisa, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposVisa = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosVisa = new GridBagLayout();
		
		this.jPanelCamposVisa.setLayout(gridaBagLayoutCamposVisa);
		this.jPanelCamposOcultosVisa.setLayout(gridaBagLayoutCamposOcultosVisa);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsVisa = new GridBagConstraints();
	this.gridBagConstraintsVisa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVisa.gridy = 0;
	this.gridBagConstraintsVisa.gridx = 0;
	this.gridBagConstraintsVisa.ipadx = 0;
	this.gridBagConstraintsVisa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidVisa.add(jLabelIdVisa, this.gridBagConstraintsVisa);



	this.gridBagConstraintsVisa = new GridBagConstraints();
	this.gridBagConstraintsVisa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVisa.gridy = 0;
	this.gridBagConstraintsVisa.gridx = 1;
	this.gridBagConstraintsVisa.ipadx = 0;
	this.gridBagConstraintsVisa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidVisa.add(jLabelidVisa, this.gridBagConstraintsVisa);


	this.gridBagConstraintsVisa = new GridBagConstraints();
	this.gridBagConstraintsVisa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVisa.gridy = 0;
	this.gridBagConstraintsVisa.gridx = 0;
	this.gridBagConstraintsVisa.ipadx = 0;
	this.gridBagConstraintsVisa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaVisa.add(jLabelid_empresaVisa, this.gridBagConstraintsVisa);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVisa = new GridBagConstraints();
		//this.gridBagConstraintsVisa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVisa.gridy = 0;
		this.gridBagConstraintsVisa.gridx = 2;
		this.gridBagConstraintsVisa.ipadx = 0;
		this.gridBagConstraintsVisa.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaVisa.add(jButtonid_empresaVisaBusqueda, this.gridBagConstraintsVisa);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVisa = new GridBagConstraints();
		//this.gridBagConstraintsVisa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVisa.gridy = 0;
		this.gridBagConstraintsVisa.gridx = 3;
		this.gridBagConstraintsVisa.ipadx = 0;
		this.gridBagConstraintsVisa.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaVisa.add(jButtonid_empresaVisaUpdate, this.gridBagConstraintsVisa);
	}

	this.gridBagConstraintsVisa = new GridBagConstraints();
	this.gridBagConstraintsVisa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVisa.gridy = 0;
	this.gridBagConstraintsVisa.gridx = 1;
	this.gridBagConstraintsVisa.ipadx = 0;
	this.gridBagConstraintsVisa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaVisa.add(jComboBoxid_empresaVisa, this.gridBagConstraintsVisa);


	this.gridBagConstraintsVisa = new GridBagConstraints();
	this.gridBagConstraintsVisa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVisa.gridy = 0;
	this.gridBagConstraintsVisa.gridx = 0;
	this.gridBagConstraintsVisa.ipadx = 0;
	this.gridBagConstraintsVisa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_paisVisa.add(jLabelid_paisVisa, this.gridBagConstraintsVisa);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVisa = new GridBagConstraints();
		//this.gridBagConstraintsVisa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVisa.gridy = 0;
		this.gridBagConstraintsVisa.gridx = 2;
		this.gridBagConstraintsVisa.ipadx = 0;
		this.gridBagConstraintsVisa.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisVisa.add(jButtonid_paisVisaBusqueda, this.gridBagConstraintsVisa);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVisa = new GridBagConstraints();
		//this.gridBagConstraintsVisa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVisa.gridy = 0;
		this.gridBagConstraintsVisa.gridx = 3;
		this.gridBagConstraintsVisa.ipadx = 0;
		this.gridBagConstraintsVisa.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisVisa.add(jButtonid_paisVisaUpdate, this.gridBagConstraintsVisa);
	}

	this.gridBagConstraintsVisa = new GridBagConstraints();
	this.gridBagConstraintsVisa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVisa.gridy = 0;
	this.gridBagConstraintsVisa.gridx = 1;
	this.gridBagConstraintsVisa.ipadx = 0;
	this.gridBagConstraintsVisa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_paisVisa.add(jComboBoxid_paisVisa, this.gridBagConstraintsVisa);


	this.gridBagConstraintsVisa = new GridBagConstraints();
	this.gridBagConstraintsVisa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVisa.gridy = 0;
	this.gridBagConstraintsVisa.gridx = 0;
	this.gridBagConstraintsVisa.ipadx = 0;
	this.gridBagConstraintsVisa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empleadoVisa.add(jLabelid_empleadoVisa, this.gridBagConstraintsVisa);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsVisa = new GridBagConstraints();
	//this.gridBagConstraintsVisa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVisa.gridy = 0;
	this.gridBagConstraintsVisa.gridx = 2;
	this.gridBagConstraintsVisa.ipadx = 0;
	this.gridBagConstraintsVisa.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_empleadoVisa.add(jButtonid_empleadoVisa, this.gridBagConstraintsVisa);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVisa = new GridBagConstraints();
		//this.gridBagConstraintsVisa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVisa.gridy = 0;
		this.gridBagConstraintsVisa.gridx = 3;
		this.gridBagConstraintsVisa.ipadx = 0;
		this.gridBagConstraintsVisa.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoVisa.add(jButtonid_empleadoVisaBusqueda, this.gridBagConstraintsVisa);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVisa = new GridBagConstraints();
		//this.gridBagConstraintsVisa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVisa.gridy = 0;
		this.gridBagConstraintsVisa.gridx = 4;
		this.gridBagConstraintsVisa.ipadx = 0;
		this.gridBagConstraintsVisa.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoVisa.add(jButtonid_empleadoVisaUpdate, this.gridBagConstraintsVisa);
	}

	this.gridBagConstraintsVisa = new GridBagConstraints();
	this.gridBagConstraintsVisa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVisa.gridy = 0;
	this.gridBagConstraintsVisa.gridx = 1;
	this.gridBagConstraintsVisa.ipadx = 0;
	this.gridBagConstraintsVisa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empleadoVisa.add(jComboBoxid_empleadoVisa, this.gridBagConstraintsVisa);


	this.gridBagConstraintsVisa = new GridBagConstraints();
	this.gridBagConstraintsVisa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVisa.gridy = 0;
	this.gridBagConstraintsVisa.gridx = 0;
	this.gridBagConstraintsVisa.ipadx = 0;
	this.gridBagConstraintsVisa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionVisa.add(jLabeldescripcionVisa, this.gridBagConstraintsVisa);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsVisa = new GridBagConstraints();
		//this.gridBagConstraintsVisa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsVisa.gridy = 0;
		this.gridBagConstraintsVisa.gridx = 2;
		this.gridBagConstraintsVisa.ipadx = 0;
		this.gridBagConstraintsVisa.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionVisa.add(jButtondescripcionVisaBusqueda, this.gridBagConstraintsVisa);
	}

	this.gridBagConstraintsVisa = new GridBagConstraints();
	this.gridBagConstraintsVisa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsVisa.gridy = 0;
	this.gridBagConstraintsVisa.gridx = 1;
	this.gridBagConstraintsVisa.ipadx = 0;
	this.gridBagConstraintsVisa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionVisa.add(jscrollPanedescripcionVisa, this.gridBagConstraintsVisa);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsVisa = new GridBagConstraints();
	this.gridBagConstraintsVisa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVisa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVisa.gridy = iYPanelCamposVisa;
	this.gridBagConstraintsVisa.gridx = iXPanelCamposVisa++;
	this.gridBagConstraintsVisa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVisa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVisa.add(this.jPanelidVisa, this.gridBagConstraintsVisa);



	if(iXPanelCamposVisa % 1==0) {
		iXPanelCamposVisa=0;
		iYPanelCamposVisa++;
	}
	this.gridBagConstraintsVisa = new GridBagConstraints();
	this.gridBagConstraintsVisa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVisa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVisa.gridy = iYPanelCamposVisa;
	this.gridBagConstraintsVisa.gridx = iXPanelCamposVisa++;
	this.gridBagConstraintsVisa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVisa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVisa.add(this.jPanelid_paisVisa, this.gridBagConstraintsVisa);



	if(iXPanelCamposVisa % 1==0) {
		iXPanelCamposVisa=0;
		iYPanelCamposVisa++;
	}
	this.gridBagConstraintsVisa = new GridBagConstraints();
	this.gridBagConstraintsVisa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVisa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVisa.gridy = iYPanelCamposVisa;
	this.gridBagConstraintsVisa.gridx = iXPanelCamposVisa++;
	this.gridBagConstraintsVisa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVisa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVisa.add(this.jPanelid_empleadoVisa, this.gridBagConstraintsVisa);



	if(iXPanelCamposVisa % 1==0) {
		iXPanelCamposVisa=0;
		iYPanelCamposVisa++;
	}
	this.gridBagConstraintsVisa = new GridBagConstraints();
	this.gridBagConstraintsVisa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVisa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVisa.gridy = iYPanelCamposVisa;
	this.gridBagConstraintsVisa.gridx = iXPanelCamposVisa++;
	this.gridBagConstraintsVisa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVisa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposVisa.add(this.jPaneldescripcionVisa, this.gridBagConstraintsVisa);



	if(iXPanelCamposVisa % 1==0) {
		iXPanelCamposVisa=0;
		iYPanelCamposVisa++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsVisa = new GridBagConstraints();
	this.gridBagConstraintsVisa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsVisa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsVisa.gridy = iYPanelCamposOcultosVisa;
	this.gridBagConstraintsVisa.gridx = iXPanelCamposOcultosVisa++;
	this.gridBagConstraintsVisa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsVisa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosVisa.add(this.jPanelid_empresaVisa, this.gridBagConstraintsVisa);



	if(iXPanelCamposOcultosVisa % 1==0) {
		iXPanelCamposOcultosVisa=0;
		iYPanelCamposOcultosVisa++;
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
			
		GridBagLayout gridaBagLayoutAccionesVisa= new GridBagLayout();
		this.jPanelAccionesVisa.setLayout(gridaBagLayoutAccionesVisa);
		
		GridBagLayout gridaBagLayoutAccionesFormularioVisa= new GridBagLayout();
		this.jPanelAccionesFormularioVisa.setLayout(gridaBagLayoutAccionesFormularioVisa);
		
		this.gridBagConstraintsVisa = new GridBagConstraints();
		this.gridBagConstraintsVisa.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsVisa.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioVisa.add(this.jComboBoxTiposAccionesFormularioVisa, this.gridBagConstraintsVisa);

		this.gridBagConstraintsVisa = new GridBagConstraints();
		this.gridBagConstraintsVisa.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsVisa.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioVisa.add(this.jCheckBoxPostAccionNuevoVisa, this.gridBagConstraintsVisa);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.visaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsVisa = new GridBagConstraints();
			this.gridBagConstraintsVisa.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsVisa.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioVisa.add(this.jCheckBoxPostAccionSinCerrarVisa, this.gridBagConstraintsVisa);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.visaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.visaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsVisa = new GridBagConstraints();
			this.gridBagConstraintsVisa.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsVisa.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioVisa.add(this.jCheckBoxPostAccionSinMensajeVisa, this.gridBagConstraintsVisa);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsVisa = new GridBagConstraints();
		this.gridBagConstraintsVisa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVisa.gridy = 0;
		this.gridBagConstraintsVisa.gridx = iPosXAccion++;
			
		this.jPanelAccionesVisa.add(this.jButtonModificarVisa, this.gridBagConstraintsVisa);							

		this.gridBagConstraintsVisa = new GridBagConstraints();
		this.gridBagConstraintsVisa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsVisa.gridy = 0;
		this.gridBagConstraintsVisa.gridx =iPosXAccion++;
			
		this.jPanelAccionesVisa.add(this.jButtonEliminarVisa, this.gridBagConstraintsVisa);
		
			
		this.gridBagConstraintsVisa = new GridBagConstraints();
		this.gridBagConstraintsVisa.gridy = 0;		
		this.gridBagConstraintsVisa.gridx = iPosXAccion++;
		
		this.jPanelAccionesVisa.add(this.jButtonActualizarVisa, this.gridBagConstraintsVisa);


		this.gridBagConstraintsVisa = new GridBagConstraints();
		this.gridBagConstraintsVisa.gridy = 0;		
		this.gridBagConstraintsVisa.gridx = iPosXAccion++;
		
		this.jPanelAccionesVisa.add(this.jButtonGuardarCambiosVisa, this.gridBagConstraintsVisa);	
		
		this.gridBagConstraintsVisa = new GridBagConstraints();
		this.gridBagConstraintsVisa.gridy = 0;		
		this.gridBagConstraintsVisa.gridx =iPosXAccion++;
		
		this.jPanelAccionesVisa.add(this.jButtonCancelarVisa, this.gridBagConstraintsVisa);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutVisa = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutVisa);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.visaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsVisa = new GridBagConstraints();						
			this.gridBagConstraintsVisa.gridy = iGridyPrincipal++;
			this.gridBagConstraintsVisa.gridx = 0;		
			//this.gridBagConstraintsVisa.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsVisa.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsVisa.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsVisa = new GridBagConstraints();
		this.gridBagConstraintsVisa.gridy =iGridyPrincipal++;
		this.gridBagConstraintsVisa.gridx =0;
		this.gridBagConstraintsVisa.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsVisa.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosVisa, this.gridBagConstraintsVisa);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(VisaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleVisa = new VisaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Visa DATOS");
			
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
			
	        //this.setTitle("[FOR] - Visa DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Visa Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			VisaModel visaModel=new VisaModel(this);
			
			//SI USARA CLASE INTERNA
			//VisaModel.VisaFocusTraversalPolicy visaFocusTraversalPolicy = visaModel.new VisaFocusTraversalPolicy(this);
			
			//visaFocusTraversalPolicy.setvisaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(visaModel);
			
			
			this.jContentPaneDetalleVisa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleVisa = new GridBagLayout();	
			this.jContentPaneDetalleVisa.setLayout(gridaBagLayoutDetalleVisa);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosVisa = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsVisa = new GridBagConstraints();
				this.gridBagConstraintsVisa.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsVisa.gridx = 0;
					
				
				this.jContentPaneDetalleVisa.add(jTtoolBarDetalleVisa, gridBagConstraintsVisa);								
				
}
			
			this.jScrollPanelDatosEdicionVisa=   new JScrollPane(jContentPaneDetalleVisa,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionVisa.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionVisa.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionVisa.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralVisa=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralVisa.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralVisa.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralVisa.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsVisa = new GridBagConstraints();
			
			
	        this.gridBagConstraintsVisa.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsVisa.gridx = 0;
	        
			this.jContentPaneDetalleVisa.add(jPanelCamposVisa, gridBagConstraintsVisa);
			
			
			
			
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
						&& visaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.visaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsVisa= new GridBagConstraints();
						this.gridBagConstraintsVisa.gridy = iGridyRelaciones++;
						this.gridBagConstraintsVisa.gridx = 0;
						this.jContentPaneDetalleVisa.add(this.jTabbedPaneRelacionesVisa, this.gridBagConstraintsVisa);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesVisa.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosVisa.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsVisa = new GridBagConstraints();
					this.gridBagConstraintsVisa.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsVisa.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsVisa.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsVisa.gridx = 0;
					
				
					this.jContentPaneDetalleVisa.add(jPanelCamposOcultosVisa, gridBagConstraintsVisa);
				
					this.jPanelCamposOcultosVisa.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsVisa = new GridBagConstraints();
			this.gridBagConstraintsVisa.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsVisa.gridx = 0;
	        this.gridBagConstraintsVisa.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleVisa.add(this.jPanelAccionesFormularioVisa, this.gridBagConstraintsVisa);							
			
			
			
			this.gridBagConstraintsVisa = new GridBagConstraints();
	        this.gridBagConstraintsVisa.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsVisa.gridx = 0;
	        
			
			this.jContentPaneDetalleVisa.add(this.jPanelAccionesVisa, this.gridBagConstraintsVisa);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionVisa);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionVisa=   new JScrollPane(this.jPanelCamposVisa,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionVisa.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionVisa.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionVisa.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsVisa = new GridBagConstraints();
			this.gridBagConstraintsVisa.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsVisa.gridx = 0;
			this.gridBagConstraintsVisa.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsVisa.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsVisa.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionVisa, this.gridBagConstraintsVisa);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsVisa = new GridBagConstraints();
			this.gridBagConstraintsVisa.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsVisa.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioVisa, this.gridBagConstraintsVisa);			
			
			this.gridBagConstraintsVisa = new GridBagConstraints();
			this.gridBagConstraintsVisa.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsVisa.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesVisa, this.gridBagConstraintsVisa);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsVisa = new GridBagConstraints();
		this.gridBagConstraintsVisa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVisa.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposVisa, this.gridBagConstraintsVisa);
			
			
		this.gridBagConstraintsVisa = new GridBagConstraints();
		this.gridBagConstraintsVisa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsVisa.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosVisa, this.gridBagConstraintsVisa);
		
			
		this.gridBagConstraintsVisa = new GridBagConstraints();
		this.gridBagConstraintsVisa.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsVisa.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesVisa, this.gridBagConstraintsVisa);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralVisa;//jContentPane;
		
		return jScrollPanelDatosEdicionVisa;
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
