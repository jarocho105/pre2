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
import com.bydan.erp.nomina.util.EmpleadoConstanteConstantesFunciones;

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
public class EmpleadoConstanteDetalleFormJInternalFrame extends EmpleadoConstanteBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleEmpleadoConstante;
	
	protected JMenuBar jmenuBarDetalleEmpleadoConstante;
	
	protected JMenu jmenuDetalleEmpleadoConstante;
	protected JMenu jmenuDetalleArchivoEmpleadoConstante;
	protected JMenu jmenuDetalleAccionesEmpleadoConstante;
	protected JMenu jmenuDetalleDatosEmpleadoConstante;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleEmpleadoConstante = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEmpleadoConstante;	
	protected GridBagConstraints gridBagConstraintsEmpleadoConstante;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected EmpleadoConstanteBeanSwingJInternalFrameAdditional jInternalFrameDetalleEmpleadoConstante;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected ConstanteNomiBeanSwingJInternalFrame constantenomiBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_constantenomi="";
	
	public EmpleadoConstanteSessionBean empleadoconstanteSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public ConstanteNomiSessionBean constantenomiSessionBean;	
	
	public EmpleadoConstanteLogic empleadoconstanteLogic;
	
	public JScrollPane jScrollPanelDatosEmpleadoConstante;
	public JScrollPane jScrollPanelDatosEdicionEmpleadoConstante;
	public JScrollPane jScrollPanelDatosGeneralEmpleadoConstante;
	
	protected JPanel jPanelCamposEmpleadoConstante;    
	protected JPanel jPanelCamposOcultosEmpleadoConstante;    	
	protected JPanel jPanelAccionesEmpleadoConstante;
	protected JPanel jPanelAccionesFormularioEmpleadoConstante;
    
	
	
	protected Integer iXPanelCamposEmpleadoConstante=0;
	protected Integer iYPanelCamposEmpleadoConstante=0;
	
	protected Integer iXPanelCamposOcultosEmpleadoConstante=0;
	protected Integer iYPanelCamposOcultosEmpleadoConstante=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoEmpleadoConstante;
	public JButton jButtonModificarEmpleadoConstante;
	public JButton jButtonActualizarEmpleadoConstante;
    public JButton jButtonEliminarEmpleadoConstante;
	public JButton jButtonCancelarEmpleadoConstante;
    public JButton jButtonGuardarCambiosEmpleadoConstante;
	public JButton jButtonGuardarCambiosTablaEmpleadoConstante;
	protected JButton jButtonCerrarEmpleadoConstante;
	
	
	protected JButton jButtonProcesarInformacionEmpleadoConstante;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoEmpleadoConstante;
	protected JCheckBox jCheckBoxPostAccionSinCerrarEmpleadoConstante;
	protected JCheckBox jCheckBoxPostAccionSinMensajeEmpleadoConstante;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEmpleadoConstante;
	protected JButton jButtonModificarToolBarEmpleadoConstante;
	protected JButton jButtonActualizarToolBarEmpleadoConstante;
    protected JButton jButtonEliminarToolBarEmpleadoConstante;
	protected JButton jButtonCancelarToolBarEmpleadoConstante;
    protected JButton jButtonGuardarCambiosToolBarEmpleadoConstante;
	protected JButton jButtonGuardarCambiosTablaToolBarEmpleadoConstante;
	protected JButton jButtonMostrarOcultarTablaToolBarEmpleadoConstante;
	protected JButton jButtonCerrarToolBarEmpleadoConstante;
	
	protected JButton jButtonProcesarInformacionToolBarEmpleadoConstante;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEmpleadoConstante;
	protected JMenuItem jMenuItemModificarEmpleadoConstante;
	protected JMenuItem jMenuItemActualizarEmpleadoConstante;
    protected JMenuItem jMenuItemEliminarEmpleadoConstante;
	protected JMenuItem jMenuItemCancelarEmpleadoConstante;
    protected JMenuItem jMenuItemGuardarCambiosEmpleadoConstante;
	protected JMenuItem jMenuItemGuardarCambiosTablaEmpleadoConstante;
	protected JMenuItem jMenuItemCerrarEmpleadoConstante;
	protected JMenuItem jMenuItemDetalleCerrarEmpleadoConstante;
	protected JMenuItem jMenuItemDetalleMostarOcultarEmpleadoConstante;
	
	protected JMenuItem jMenuItemProcesarInformacionEmpleadoConstante;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEmpleadoConstante;
	protected JMenuItem jMenuItemMostrarOcultarEmpleadoConstante;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEmpleadoConstante;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEmpleadoConstante;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEmpleadoConstante;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioEmpleadoConstante;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidEmpleadoConstante;
	public JLabel jLabelIdEmpleadoConstante;
	public JLabel jLabelidEmpleadoConstante;
	public JButton jButtonidEmpleadoConstanteBusqueda= new JButtonMe();

	public JPanel jPanelvalorEmpleadoConstante;
	public JLabel jLabelvalorEmpleadoConstante;
	public JTextField jTextFieldvalorEmpleadoConstante;
	public JButton jButtonvalorEmpleadoConstanteBusqueda= new JButtonMe();

	public JPanel jPanelesta_activoEmpleadoConstante;
	public JLabel jLabelesta_activoEmpleadoConstante;
	public JCheckBox jCheckBoxesta_activoEmpleadoConstante;
	public JButton jButtonesta_activoEmpleadoConstanteBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaEmpleadoConstante;
	public JLabel jLabelid_empresaEmpleadoConstante;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaEmpleadoConstante;
	public JButton jButtonid_empresaEmpleadoConstante= new JButtonMe();
	public JButton jButtonid_empresaEmpleadoConstanteUpdate= new JButtonMe();
	public JButton jButtonid_empresaEmpleadoConstanteBusqueda= new JButtonMe();

	public JPanel jPanelid_empleadoEmpleadoConstante;
	public JLabel jLabelid_empleadoEmpleadoConstante;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoEmpleadoConstante;
	public JButton jButtonid_empleadoEmpleadoConstante= new JButtonMe();
	public JButton jButtonid_empleadoEmpleadoConstanteUpdate= new JButtonMe();
	public JButton jButtonid_empleadoEmpleadoConstanteBusqueda= new JButtonMe();

	public JPanel jPanelid_constante_nomiEmpleadoConstante;
	public JLabel jLabelid_constante_nomiEmpleadoConstante;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_constante_nomiEmpleadoConstante;
	public JButton jButtonid_constante_nomiEmpleadoConstante= new JButtonMe();
	public JButton jButtonid_constante_nomiEmpleadoConstanteUpdate= new JButtonMe();
	public JButton jButtonid_constante_nomiEmpleadoConstanteBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesEmpleadoConstante;
	
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
	public int iHeightFormulario=330;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public EmpleadoConstanteDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposEmpleadoConstante=new JPanel();
				this.jPanelAccionesFormularioEmpleadoConstante=new JPanel();
				this.jmenuBarDetalleEmpleadoConstante=new JMenuBar();
				this.jTtoolBarDetalleEmpleadoConstante=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpleadoConstanteDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("EmpleadoConstante No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public EmpleadoConstanteDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("EmpleadoConstante No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpleadoConstanteDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EmpleadoConstante No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpleadoConstanteDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EmpleadoConstante No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EmpleadoConstanteDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EmpleadoConstante No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarEmpleadoConstante() {
		return this.jButtonActualizarToolBarEmpleadoConstante;
	}
	
	public JButton getjButtonEliminarToolBarEmpleadoConstante() {
		return this.jButtonEliminarToolBarEmpleadoConstante;
	}
	
	public JButton getjButtonCancelarToolBarEmpleadoConstante() {
		return this.jButtonCancelarToolBarEmpleadoConstante;
	}		
	
	public JButton getjButtonProcesarInformacionEmpleadoConstante() {
		return this.jButtonProcesarInformacionEmpleadoConstante;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEmpleadoConstante)	{
		this.jButtonProcesarInformacionEmpleadoConstante = jButtonProcesarInformacionEmpleadoConstante;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEmpleadoConstante() {
		return this.jComboBoxTiposAccionesEmpleadoConstante;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEmpleadoConstante(
			JComboBox jComboBoxTiposRelacionesEmpleadoConstante) {
		this.jComboBoxTiposRelacionesEmpleadoConstante = jComboBoxTiposRelacionesEmpleadoConstante;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEmpleadoConstante(
			JComboBox jComboBoxTiposAccionesEmpleadoConstante) {
		this.jComboBoxTiposAccionesEmpleadoConstante = jComboBoxTiposAccionesEmpleadoConstante;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioEmpleadoConstante() {
		return this.jComboBoxTiposAccionesFormularioEmpleadoConstante;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioEmpleadoConstante(
			JComboBox jComboBoxTiposAccionesFormularioEmpleadoConstante) {
		this.jComboBoxTiposAccionesFormularioEmpleadoConstante = jComboBoxTiposAccionesFormularioEmpleadoConstante;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.empleadoconstanteSessionBean=new EmpleadoConstanteSessionBean();
		
		this.empleadoconstanteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.empleadoconstanteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.empleadoconstanteSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EmpleadoConstanteJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EmpleadoConstanteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EmpleadoConstanteJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Empleado Constante MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.empleadoconstanteSessionBean.getEsGuardarRelacionado()) {
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
	
		EmpleadoConstanteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleEmpleadoConstante= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarEmpleadoConstante=new JButtonMe();
				this.jButtonModificarToolBarEmpleadoConstante=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarEmpleadoConstante=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarEmpleadoConstante,this.jTtoolBarDetalleEmpleadoConstante,
							"actualizar","actualizar","Actualizar"+" "+EmpleadoConstanteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarEmpleadoConstante=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarEmpleadoConstante,this.jTtoolBarDetalleEmpleadoConstante,
							"eliminar","eliminar","Eliminar"+" "+EmpleadoConstanteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarEmpleadoConstante=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarEmpleadoConstante,this.jTtoolBarDetalleEmpleadoConstante,
							"cancelar","cancelar","Cancelar"+" "+EmpleadoConstanteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarEmpleadoConstante=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarEmpleadoConstante,this.jTtoolBarDetalleEmpleadoConstante,
							"guardarcambios","guardarcambios","Guardar"+" "+EmpleadoConstanteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarEmpleadoConstante,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarEmpleadoConstante,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarEmpleadoConstante,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleEmpleadoConstante=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleEmpleadoConstante=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoEmpleadoConstante=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesEmpleadoConstante=new JMenuMe("Acciones");
		this.jmenuDetalleDatosEmpleadoConstante=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEmpleadoConstante= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEmpleadoConstante.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEmpleadoConstante,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEmpleadoConstante, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarEmpleadoConstante= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarEmpleadoConstante.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarEmpleadoConstante,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarEmpleadoConstante, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarEmpleadoConstante= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarEmpleadoConstante.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarEmpleadoConstante,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarEmpleadoConstante, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarEmpleadoConstante= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarEmpleadoConstante.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarEmpleadoConstante,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarEmpleadoConstante, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarEmpleadoConstante= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarEmpleadoConstante.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarEmpleadoConstante,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarEmpleadoConstante, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosEmpleadoConstante= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEmpleadoConstante.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEmpleadoConstante,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEmpleadoConstante, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEmpleadoConstante= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEmpleadoConstante.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEmpleadoConstante,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEmpleadoConstante, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarEmpleadoConstante= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarEmpleadoConstante.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarEmpleadoConstante,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarEmpleadoConstante, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEmpleadoConstante= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEmpleadoConstante.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEmpleadoConstante,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEmpleadoConstante, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEmpleadoConstante= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEmpleadoConstante.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEmpleadoConstante,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEmpleadoConstante, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoEmpleadoConstante.add(this.jMenuItemDetalleCerrarEmpleadoConstante);
		
		this.jmenuDetalleAccionesEmpleadoConstante.add(this.jMenuItemActualizarEmpleadoConstante);
		this.jmenuDetalleAccionesEmpleadoConstante.add(this.jMenuItemEliminarEmpleadoConstante);
		this.jmenuDetalleAccionesEmpleadoConstante.add(this.jMenuItemCancelarEmpleadoConstante);		
		
		//this.jmenuDetalleDatosEmpleadoConstante.add(this.jMenuItemDetalleAbrirOrderByEmpleadoConstante);				
		this.jmenuDetalleDatosEmpleadoConstante.add(this.jMenuItemDetalleMostarOcultarEmpleadoConstante);				
				
		//this.jmenuDetalleAccionesEmpleadoConstante.add(this.jMenuItemGuardarCambiosEmpleadoConstante);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoEmpleadoConstante, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesEmpleadoConstante, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosEmpleadoConstante, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleEmpleadoConstante.add(this.jmenuDetalleArchivoEmpleadoConstante);		
		this.jmenuBarDetalleEmpleadoConstante.add(this.jmenuDetalleAccionesEmpleadoConstante);		
		this.jmenuBarDetalleEmpleadoConstante.add(this.jmenuDetalleDatosEmpleadoConstante);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleEmpleadoConstante);				
	}
	
	
	public void inicializarElementosCamposEmpleadoConstante() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdEmpleadoConstante = new JLabelMe();
		jLabelIdEmpleadoConstante.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdEmpleadoConstante.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEmpleadoConstante.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEmpleadoConstante.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdEmpleadoConstante,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidEmpleadoConstante = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidEmpleadoConstante.setToolTipText(EmpleadoConstanteConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutEmpleadoConstante= new GridBagLayout();

		this.jPanelidEmpleadoConstante.setLayout(this.gridaBagLayoutEmpleadoConstante);

		jLabelidEmpleadoConstante = new JLabel();
		jLabelidEmpleadoConstante.setText("Id");

		jLabelidEmpleadoConstante.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidEmpleadoConstante.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidEmpleadoConstante.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelvalorEmpleadoConstante = new JLabelMe();
		this.jLabelvalorEmpleadoConstante.setText(""+EmpleadoConstanteConstantesFunciones.LABEL_VALOR+" : *");
		this.jLabelvalorEmpleadoConstante.setToolTipText("Valor");
		this.jLabelvalorEmpleadoConstante.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorEmpleadoConstante.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorEmpleadoConstante.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalorEmpleadoConstante,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalorEmpleadoConstante=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalorEmpleadoConstante.setToolTipText(EmpleadoConstanteConstantesFunciones.LABEL_VALOR);
		this.gridaBagLayoutEmpleadoConstante = new GridBagLayout();
		this.jPanelvalorEmpleadoConstante.setLayout(this.gridaBagLayoutEmpleadoConstante);


		jTextFieldvalorEmpleadoConstante= new JTextFieldMe();
		jTextFieldvalorEmpleadoConstante.setEnabled(false);
		jTextFieldvalorEmpleadoConstante.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorEmpleadoConstante.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorEmpleadoConstante.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalorEmpleadoConstante,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalorEmpleadoConstante.setText("0.0");

		this.jButtonvalorEmpleadoConstanteBusqueda= new JButtonMe();
		this.jButtonvalorEmpleadoConstanteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorEmpleadoConstanteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorEmpleadoConstanteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalorEmpleadoConstanteBusqueda.setText("U");
		this.jButtonvalorEmpleadoConstanteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalorEmpleadoConstanteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalorEmpleadoConstanteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalorEmpleadoConstante.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalorEmpleadoConstante.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valorEmpleadoConstanteBusqueda"));

		if(this.empleadoconstanteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalorEmpleadoConstanteBusqueda.setVisible(false);		}


					
		this.jLabelesta_activoEmpleadoConstante = new JLabelMe();
		this.jLabelesta_activoEmpleadoConstante.setText(""+EmpleadoConstanteConstantesFunciones.LABEL_ESTAACTIVO+" : *");
		this.jLabelesta_activoEmpleadoConstante.setToolTipText("Esta Activo");
		this.jLabelesta_activoEmpleadoConstante.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelesta_activoEmpleadoConstante.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelesta_activoEmpleadoConstante.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelesta_activoEmpleadoConstante,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelesta_activoEmpleadoConstante=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelesta_activoEmpleadoConstante.setToolTipText(EmpleadoConstanteConstantesFunciones.LABEL_ESTAACTIVO);
		this.gridaBagLayoutEmpleadoConstante = new GridBagLayout();
		this.jPanelesta_activoEmpleadoConstante.setLayout(this.gridaBagLayoutEmpleadoConstante);


		jCheckBoxesta_activoEmpleadoConstante= new JCheckBoxMe();
		jCheckBoxesta_activoEmpleadoConstante.setEnabled(false);

		jCheckBoxesta_activoEmpleadoConstante.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesta_activoEmpleadoConstante.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesta_activoEmpleadoConstante.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxesta_activoEmpleadoConstante,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonesta_activoEmpleadoConstanteBusqueda= new JButtonMe();
		this.jButtonesta_activoEmpleadoConstanteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesta_activoEmpleadoConstanteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesta_activoEmpleadoConstanteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonesta_activoEmpleadoConstanteBusqueda.setText("U");
		this.jButtonesta_activoEmpleadoConstanteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonesta_activoEmpleadoConstanteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonesta_activoEmpleadoConstanteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxesta_activoEmpleadoConstante.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxesta_activoEmpleadoConstante.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"esta_activoEmpleadoConstanteBusqueda"));

		if(this.empleadoconstanteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonesta_activoEmpleadoConstanteBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysEmpleadoConstante() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaEmpleadoConstante = new JLabelMe();
		this.jLabelid_empresaEmpleadoConstante.setText(""+EmpleadoConstanteConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaEmpleadoConstante.setToolTipText("Empresa");
		this.jLabelid_empresaEmpleadoConstante.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaEmpleadoConstante.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaEmpleadoConstante.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaEmpleadoConstante,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaEmpleadoConstante=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaEmpleadoConstante.setToolTipText(EmpleadoConstanteConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutEmpleadoConstante = new GridBagLayout();
		this.jPanelid_empresaEmpleadoConstante.setLayout(this.gridaBagLayoutEmpleadoConstante);


		jComboBoxid_empresaEmpleadoConstante= new JComboBoxMe();
		jComboBoxid_empresaEmpleadoConstante.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaEmpleadoConstante.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaEmpleadoConstante.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaEmpleadoConstante,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaEmpleadoConstante.setEnabled(false);

		this.jButtonid_empresaEmpleadoConstante= new JButtonMe();
		this.jButtonid_empresaEmpleadoConstante.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaEmpleadoConstante.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaEmpleadoConstante.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaEmpleadoConstante.setText("Buscar");
		this.jButtonid_empresaEmpleadoConstante.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaEmpleadoConstante.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaEmpleadoConstante,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaEmpleadoConstante.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaEmpleadoConstante.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaEmpleadoConstante"));

		this.jButtonid_empresaEmpleadoConstanteBusqueda= new JButtonMe();
		this.jButtonid_empresaEmpleadoConstanteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEmpleadoConstanteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEmpleadoConstanteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaEmpleadoConstanteBusqueda.setText("U");
		this.jButtonid_empresaEmpleadoConstanteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaEmpleadoConstanteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaEmpleadoConstanteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaEmpleadoConstante.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaEmpleadoConstante.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaEmpleadoConstanteBusqueda"));

		if(this.empleadoconstanteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaEmpleadoConstanteBusqueda.setVisible(false);		}

		this.jButtonid_empresaEmpleadoConstanteUpdate= new JButtonMe();
		this.jButtonid_empresaEmpleadoConstanteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEmpleadoConstanteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEmpleadoConstanteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaEmpleadoConstanteUpdate.setText("U");
		this.jButtonid_empresaEmpleadoConstanteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaEmpleadoConstanteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaEmpleadoConstanteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaEmpleadoConstante.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaEmpleadoConstante.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaEmpleadoConstanteUpdate"));



					
		this.jLabelid_empleadoEmpleadoConstante = new JLabelMe();
		this.jLabelid_empleadoEmpleadoConstante.setText(""+EmpleadoConstanteConstantesFunciones.LABEL_IDEMPLEADO+" : *");
		this.jLabelid_empleadoEmpleadoConstante.setToolTipText("Empleado");
		this.jLabelid_empleadoEmpleadoConstante.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoEmpleadoConstante.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoEmpleadoConstante.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoEmpleadoConstante,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empleadoEmpleadoConstante=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empleadoEmpleadoConstante.setToolTipText(EmpleadoConstanteConstantesFunciones.LABEL_IDEMPLEADO);
		this.gridaBagLayoutEmpleadoConstante = new GridBagLayout();
		this.jPanelid_empleadoEmpleadoConstante.setLayout(this.gridaBagLayoutEmpleadoConstante);


		jComboBoxid_empleadoEmpleadoConstante= new JComboBoxMe();
		jComboBoxid_empleadoEmpleadoConstante.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoEmpleadoConstante.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoEmpleadoConstante.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoEmpleadoConstante,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empleadoEmpleadoConstante= new JButtonMe();
		this.jButtonid_empleadoEmpleadoConstante.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoEmpleadoConstante.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoEmpleadoConstante.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoEmpleadoConstante.setText("Buscar");
		this.jButtonid_empleadoEmpleadoConstante.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empleadoEmpleadoConstante.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoEmpleadoConstante,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empleadoEmpleadoConstante.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoEmpleadoConstante.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoEmpleadoConstante"));

		this.jButtonid_empleadoEmpleadoConstanteBusqueda= new JButtonMe();
		this.jButtonid_empleadoEmpleadoConstanteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoEmpleadoConstanteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoEmpleadoConstanteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoEmpleadoConstanteBusqueda.setText("U");
		this.jButtonid_empleadoEmpleadoConstanteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empleadoEmpleadoConstanteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoEmpleadoConstanteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empleadoEmpleadoConstante.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoEmpleadoConstante.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoEmpleadoConstanteBusqueda"));

		if(this.empleadoconstanteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empleadoEmpleadoConstanteBusqueda.setVisible(false);		}

		this.jButtonid_empleadoEmpleadoConstanteUpdate= new JButtonMe();
		this.jButtonid_empleadoEmpleadoConstanteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoEmpleadoConstanteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoEmpleadoConstanteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoEmpleadoConstanteUpdate.setText("U");
		this.jButtonid_empleadoEmpleadoConstanteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empleadoEmpleadoConstanteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoEmpleadoConstanteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empleadoEmpleadoConstante.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoEmpleadoConstante.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoEmpleadoConstanteUpdate"));



					
		this.jLabelid_constante_nomiEmpleadoConstante = new JLabelMe();
		this.jLabelid_constante_nomiEmpleadoConstante.setText(""+EmpleadoConstanteConstantesFunciones.LABEL_IDCONSTANTENOMI+" : *");
		this.jLabelid_constante_nomiEmpleadoConstante.setToolTipText("Constante Nomi");
		this.jLabelid_constante_nomiEmpleadoConstante.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_constante_nomiEmpleadoConstante.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_constante_nomiEmpleadoConstante.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_constante_nomiEmpleadoConstante,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_constante_nomiEmpleadoConstante=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_constante_nomiEmpleadoConstante.setToolTipText(EmpleadoConstanteConstantesFunciones.LABEL_IDCONSTANTENOMI);
		this.gridaBagLayoutEmpleadoConstante = new GridBagLayout();
		this.jPanelid_constante_nomiEmpleadoConstante.setLayout(this.gridaBagLayoutEmpleadoConstante);


		jComboBoxid_constante_nomiEmpleadoConstante= new JComboBoxMe();
		jComboBoxid_constante_nomiEmpleadoConstante.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_constante_nomiEmpleadoConstante.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_constante_nomiEmpleadoConstante.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_constante_nomiEmpleadoConstante,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_constante_nomiEmpleadoConstante= new JButtonMe();
		this.jButtonid_constante_nomiEmpleadoConstante.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_constante_nomiEmpleadoConstante.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_constante_nomiEmpleadoConstante.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_constante_nomiEmpleadoConstante.setText("Buscar");
		this.jButtonid_constante_nomiEmpleadoConstante.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_constante_nomiEmpleadoConstante.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_constante_nomiEmpleadoConstante,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_constante_nomiEmpleadoConstante.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_constante_nomiEmpleadoConstante.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_constante_nomiEmpleadoConstante"));

		this.jButtonid_constante_nomiEmpleadoConstanteBusqueda= new JButtonMe();
		this.jButtonid_constante_nomiEmpleadoConstanteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_constante_nomiEmpleadoConstanteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_constante_nomiEmpleadoConstanteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_constante_nomiEmpleadoConstanteBusqueda.setText("U");
		this.jButtonid_constante_nomiEmpleadoConstanteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_constante_nomiEmpleadoConstanteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_constante_nomiEmpleadoConstanteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_constante_nomiEmpleadoConstante.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_constante_nomiEmpleadoConstante.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_constante_nomiEmpleadoConstanteBusqueda"));

		if(this.empleadoconstanteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_constante_nomiEmpleadoConstanteBusqueda.setVisible(false);		}

		this.jButtonid_constante_nomiEmpleadoConstanteUpdate= new JButtonMe();
		this.jButtonid_constante_nomiEmpleadoConstanteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_constante_nomiEmpleadoConstanteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_constante_nomiEmpleadoConstanteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_constante_nomiEmpleadoConstanteUpdate.setText("U");
		this.jButtonid_constante_nomiEmpleadoConstanteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_constante_nomiEmpleadoConstanteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_constante_nomiEmpleadoConstanteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_constante_nomiEmpleadoConstante.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_constante_nomiEmpleadoConstante.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_constante_nomiEmpleadoConstanteUpdate"));



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
		//this.jInternalFrameDetalleEmpleadoConstante = new EmpleadoConstanteBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Empleado Constante DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEmpleadoConstante= new GridBagLayout();
		

		
		String sToolTipEmpleadoConstante="";
		sToolTipEmpleadoConstante=EmpleadoConstanteConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEmpleadoConstante+="(Nomina.EmpleadoConstante)";
		}
		
		if(!this.empleadoconstanteSessionBean.getEsGuardarRelacionado()) {
			sToolTipEmpleadoConstante+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoEmpleadoConstante = new JButtonMe();
		this.jButtonModificarEmpleadoConstante = new JButtonMe();
        this.jButtonActualizarEmpleadoConstante = new JButtonMe();
        this.jButtonEliminarEmpleadoConstante = new JButtonMe();
        this.jButtonCancelarEmpleadoConstante = new JButtonMe();
        this.jButtonGuardarCambiosEmpleadoConstante = new JButtonMe();
		this.jButtonGuardarCambiosTablaEmpleadoConstante = new JButtonMe();
		this.jButtonCerrarEmpleadoConstante = new JButtonMe();
		
		this.jScrollPanelDatosEmpleadoConstante = new JScrollPane();   
        this.jScrollPanelDatosEdicionEmpleadoConstante = new JScrollPane();
		this.jScrollPanelDatosGeneralEmpleadoConstante = new JScrollPane();
				
		
		
		this.jPanelCamposEmpleadoConstante = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosEmpleadoConstante = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesEmpleadoConstante = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioEmpleadoConstante = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Empleado Constante";
		
		if(!this.empleadoconstanteSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEmpleadoConstante.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Empleado Constantes" + this.sPath));
		} else {
			this.jScrollPanelDatosEmpleadoConstante.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionEmpleadoConstante.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralEmpleadoConstante.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposEmpleadoConstante.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposEmpleadoConstante.setName("jPanelCamposEmpleadoConstante"); 

		this.jPanelCamposOcultosEmpleadoConstante.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosEmpleadoConstante.setName("jPanelCamposOcultosEmpleadoConstante"); 

        this.jPanelAccionesEmpleadoConstante.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEmpleadoConstante.setToolTipText("Acciones");
        this.jPanelAccionesEmpleadoConstante.setName("Acciones"); 

		this.jPanelAccionesFormularioEmpleadoConstante.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioEmpleadoConstante.setToolTipText("Acciones");
        this.jPanelAccionesFormularioEmpleadoConstante.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionEmpleadoConstante, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEmpleadoConstante, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEmpleadoConstante, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposEmpleadoConstante, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosEmpleadoConstante, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioEmpleadoConstante, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoEmpleadoConstante.setText("Nuevo");
		this.jButtonModificarEmpleadoConstante.setText("Editar");
        this.jButtonActualizarEmpleadoConstante.setText("Actualizar");
        this.jButtonEliminarEmpleadoConstante.setText("Eliminar");
        this.jButtonCancelarEmpleadoConstante.setText("Cancelar");
        this.jButtonGuardarCambiosEmpleadoConstante.setText("Guardar");
		this.jButtonGuardarCambiosTablaEmpleadoConstante.setText("Guardar");
		this.jButtonCerrarEmpleadoConstante.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEmpleadoConstante,"nuevo_button","Nuevo",this.empleadoconstanteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarEmpleadoConstante,"modificar_button","Editar",this.empleadoconstanteSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarEmpleadoConstante,"actualizar_button","Actualizar",this.empleadoconstanteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarEmpleadoConstante,"eliminar_button","Eliminar",this.empleadoconstanteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarEmpleadoConstante,"cancelar_button","Cancelar",this.empleadoconstanteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosEmpleadoConstante,"guardarcambios_button","Guardar",this.empleadoconstanteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEmpleadoConstante,"guardarcambiostabla_button","Guardar",this.empleadoconstanteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEmpleadoConstante,"cerrar_button","Salir",this.empleadoconstanteSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEmpleadoConstante, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarEmpleadoConstante, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosEmpleadoConstante, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEmpleadoConstante, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEmpleadoConstante, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarEmpleadoConstante, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarEmpleadoConstante, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarEmpleadoConstante, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoEmpleadoConstante.setToolTipText("Nuevo"+" "+EmpleadoConstanteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarEmpleadoConstante.setToolTipText("Editar"+" "+EmpleadoConstanteConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarEmpleadoConstante.setToolTipText("Actualizar"+" "+EmpleadoConstanteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarEmpleadoConstante.setToolTipText("Eliminar)"+" "+EmpleadoConstanteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarEmpleadoConstante.setToolTipText("Cancelar"+" "+EmpleadoConstanteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosEmpleadoConstante.setToolTipText("Guardar"+" "+EmpleadoConstanteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaEmpleadoConstante.setToolTipText("Guardar"+" "+EmpleadoConstanteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEmpleadoConstante.setToolTipText("Salir"+" "+EmpleadoConstanteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEmpleadoConstante";
		inputMap = this.jButtonNuevoEmpleadoConstante.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEmpleadoConstante.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEmpleadoConstante"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarEmpleadoConstante";
		inputMap = this.jButtonActualizarEmpleadoConstante.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarEmpleadoConstante.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarEmpleadoConstante"));
		
		//ELIMINAR
		sMapKey = "EliminarEmpleadoConstante";
		inputMap = this.jButtonEliminarEmpleadoConstante.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarEmpleadoConstante.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarEmpleadoConstante"));
		
		//CANCELAR	
		sMapKey = "CancelarEmpleadoConstante";
		inputMap = this.jButtonCancelarEmpleadoConstante.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarEmpleadoConstante.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarEmpleadoConstante"));
		
		//CERRAR		
		sMapKey = "CerrarEmpleadoConstante";
		inputMap = this.jButtonCerrarEmpleadoConstante.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEmpleadoConstante.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEmpleadoConstante"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEmpleadoConstante";
		inputMap = this.jButtonGuardarCambiosTablaEmpleadoConstante.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEmpleadoConstante.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEmpleadoConstante"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoEmpleadoConstante = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoEmpleadoConstante.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoEmpleadoConstante.setToolTipText("Nuevo EmpleadoConstante");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoEmpleadoConstante, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarEmpleadoConstante = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarEmpleadoConstante.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarEmpleadoConstante.setToolTipText("Sin Cerrar Ventana EmpleadoConstante");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarEmpleadoConstante, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeEmpleadoConstante = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeEmpleadoConstante.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeEmpleadoConstante.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeEmpleadoConstante, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesEmpleadoConstante = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEmpleadoConstante.setText("Accion");
		this.jComboBoxTiposAccionesEmpleadoConstante.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioEmpleadoConstante = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioEmpleadoConstante.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioEmpleadoConstante.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesEmpleadoConstante = new JLabelMe();
		
		this.jLabelAccionesEmpleadoConstante.setText("Acciones");		
		this.jLabelAccionesEmpleadoConstante.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEmpleadoConstante.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEmpleadoConstante.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposEmpleadoConstante();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysEmpleadoConstante();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesEmpleadoConstante=new JTabbedPane();
		this.jTabbedPaneRelacionesEmpleadoConstante.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesEmpleadoConstante,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesEmpleadoConstante.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEmpleadoConstante.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEmpleadoConstante.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEmpleadoConstante, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioEmpleadoConstante.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEmpleadoConstante.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEmpleadoConstante.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioEmpleadoConstante, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposEmpleadoConstante = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosEmpleadoConstante = new GridBagLayout();
		
		this.jPanelCamposEmpleadoConstante.setLayout(gridaBagLayoutCamposEmpleadoConstante);
		this.jPanelCamposOcultosEmpleadoConstante.setLayout(gridaBagLayoutCamposOcultosEmpleadoConstante);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoConstante.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoConstante.gridy = 0;
	this.gridBagConstraintsEmpleadoConstante.gridx = 0;
	this.gridBagConstraintsEmpleadoConstante.ipadx = 0;
	this.gridBagConstraintsEmpleadoConstante.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidEmpleadoConstante.add(jLabelIdEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);



	this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoConstante.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoConstante.gridy = 0;
	this.gridBagConstraintsEmpleadoConstante.gridx = 1;
	this.gridBagConstraintsEmpleadoConstante.ipadx = 0;
	this.gridBagConstraintsEmpleadoConstante.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidEmpleadoConstante.add(jLabelidEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);


	this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoConstante.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoConstante.gridy = 0;
	this.gridBagConstraintsEmpleadoConstante.gridx = 0;
	this.gridBagConstraintsEmpleadoConstante.ipadx = 0;
	this.gridBagConstraintsEmpleadoConstante.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaEmpleadoConstante.add(jLabelid_empresaEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoConstante.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoConstante.gridy = 0;
		this.gridBagConstraintsEmpleadoConstante.gridx = 2;
		this.gridBagConstraintsEmpleadoConstante.ipadx = 0;
		this.gridBagConstraintsEmpleadoConstante.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaEmpleadoConstante.add(jButtonid_empresaEmpleadoConstanteBusqueda, this.gridBagConstraintsEmpleadoConstante);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoConstante.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoConstante.gridy = 0;
		this.gridBagConstraintsEmpleadoConstante.gridx = 3;
		this.gridBagConstraintsEmpleadoConstante.ipadx = 0;
		this.gridBagConstraintsEmpleadoConstante.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaEmpleadoConstante.add(jButtonid_empresaEmpleadoConstanteUpdate, this.gridBagConstraintsEmpleadoConstante);
	}

	this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoConstante.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoConstante.gridy = 0;
	this.gridBagConstraintsEmpleadoConstante.gridx = 1;
	this.gridBagConstraintsEmpleadoConstante.ipadx = 0;
	this.gridBagConstraintsEmpleadoConstante.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaEmpleadoConstante.add(jComboBoxid_empresaEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);


	this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoConstante.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoConstante.gridy = 0;
	this.gridBagConstraintsEmpleadoConstante.gridx = 0;
	this.gridBagConstraintsEmpleadoConstante.ipadx = 0;
	this.gridBagConstraintsEmpleadoConstante.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empleadoEmpleadoConstante.add(jLabelid_empleadoEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoConstante.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoConstante.gridy = 0;
		this.gridBagConstraintsEmpleadoConstante.gridx = 2;
		this.gridBagConstraintsEmpleadoConstante.ipadx = 0;
		this.gridBagConstraintsEmpleadoConstante.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoEmpleadoConstante.add(jButtonid_empleadoEmpleadoConstanteBusqueda, this.gridBagConstraintsEmpleadoConstante);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoConstante.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoConstante.gridy = 0;
		this.gridBagConstraintsEmpleadoConstante.gridx = 3;
		this.gridBagConstraintsEmpleadoConstante.ipadx = 0;
		this.gridBagConstraintsEmpleadoConstante.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoEmpleadoConstante.add(jButtonid_empleadoEmpleadoConstanteUpdate, this.gridBagConstraintsEmpleadoConstante);
	}

	this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoConstante.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoConstante.gridy = 0;
	this.gridBagConstraintsEmpleadoConstante.gridx = 1;
	this.gridBagConstraintsEmpleadoConstante.ipadx = 0;
	this.gridBagConstraintsEmpleadoConstante.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empleadoEmpleadoConstante.add(jComboBoxid_empleadoEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);


	this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoConstante.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoConstante.gridy = 0;
	this.gridBagConstraintsEmpleadoConstante.gridx = 0;
	this.gridBagConstraintsEmpleadoConstante.ipadx = 0;
	this.gridBagConstraintsEmpleadoConstante.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_constante_nomiEmpleadoConstante.add(jLabelid_constante_nomiEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoConstante.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoConstante.gridy = 0;
		this.gridBagConstraintsEmpleadoConstante.gridx = 2;
		this.gridBagConstraintsEmpleadoConstante.ipadx = 0;
		this.gridBagConstraintsEmpleadoConstante.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_constante_nomiEmpleadoConstante.add(jButtonid_constante_nomiEmpleadoConstanteBusqueda, this.gridBagConstraintsEmpleadoConstante);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoConstante.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoConstante.gridy = 0;
		this.gridBagConstraintsEmpleadoConstante.gridx = 3;
		this.gridBagConstraintsEmpleadoConstante.ipadx = 0;
		this.gridBagConstraintsEmpleadoConstante.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_constante_nomiEmpleadoConstante.add(jButtonid_constante_nomiEmpleadoConstanteUpdate, this.gridBagConstraintsEmpleadoConstante);
	}

	this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoConstante.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoConstante.gridy = 0;
	this.gridBagConstraintsEmpleadoConstante.gridx = 1;
	this.gridBagConstraintsEmpleadoConstante.ipadx = 0;
	this.gridBagConstraintsEmpleadoConstante.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_constante_nomiEmpleadoConstante.add(jComboBoxid_constante_nomiEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);


	this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoConstante.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoConstante.gridy = 0;
	this.gridBagConstraintsEmpleadoConstante.gridx = 0;
	this.gridBagConstraintsEmpleadoConstante.ipadx = 0;
	this.gridBagConstraintsEmpleadoConstante.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalorEmpleadoConstante.add(jLabelvalorEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoConstante.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoConstante.gridy = 0;
		this.gridBagConstraintsEmpleadoConstante.gridx = 2;
		this.gridBagConstraintsEmpleadoConstante.ipadx = 0;
		this.gridBagConstraintsEmpleadoConstante.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalorEmpleadoConstante.add(jButtonvalorEmpleadoConstanteBusqueda, this.gridBagConstraintsEmpleadoConstante);
	}

	this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoConstante.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoConstante.gridy = 0;
	this.gridBagConstraintsEmpleadoConstante.gridx = 1;
	this.gridBagConstraintsEmpleadoConstante.ipadx = 0;
	this.gridBagConstraintsEmpleadoConstante.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalorEmpleadoConstante.add(jTextFieldvalorEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);


	this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoConstante.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoConstante.gridy = 0;
	this.gridBagConstraintsEmpleadoConstante.gridx = 0;
	this.gridBagConstraintsEmpleadoConstante.ipadx = 0;
	this.gridBagConstraintsEmpleadoConstante.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelesta_activoEmpleadoConstante.add(jLabelesta_activoEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
		//this.gridBagConstraintsEmpleadoConstante.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEmpleadoConstante.gridy = 0;
		this.gridBagConstraintsEmpleadoConstante.gridx = 2;
		this.gridBagConstraintsEmpleadoConstante.ipadx = 0;
		this.gridBagConstraintsEmpleadoConstante.insets = new Insets(0, 0, 0, 0);
		this.jPanelesta_activoEmpleadoConstante.add(jButtonesta_activoEmpleadoConstanteBusqueda, this.gridBagConstraintsEmpleadoConstante);
	}

	this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoConstante.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEmpleadoConstante.gridy = 0;
	this.gridBagConstraintsEmpleadoConstante.gridx = 1;
	this.gridBagConstraintsEmpleadoConstante.ipadx = 0;
	this.gridBagConstraintsEmpleadoConstante.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelesta_activoEmpleadoConstante.add(jCheckBoxesta_activoEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoConstante.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleadoConstante.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleadoConstante.gridy = iYPanelCamposEmpleadoConstante;
	this.gridBagConstraintsEmpleadoConstante.gridx = iXPanelCamposEmpleadoConstante++;
	this.gridBagConstraintsEmpleadoConstante.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleadoConstante.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpleadoConstante.add(this.jPanelidEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);



	if(iXPanelCamposEmpleadoConstante % 1==0) {
		iXPanelCamposEmpleadoConstante=0;
		iYPanelCamposEmpleadoConstante++;
	}
	this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoConstante.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleadoConstante.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleadoConstante.gridy = iYPanelCamposEmpleadoConstante;
	this.gridBagConstraintsEmpleadoConstante.gridx = iXPanelCamposEmpleadoConstante++;
	this.gridBagConstraintsEmpleadoConstante.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleadoConstante.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpleadoConstante.add(this.jPanelid_empleadoEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);



	if(iXPanelCamposEmpleadoConstante % 1==0) {
		iXPanelCamposEmpleadoConstante=0;
		iYPanelCamposEmpleadoConstante++;
	}
	this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoConstante.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleadoConstante.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleadoConstante.gridy = iYPanelCamposEmpleadoConstante;
	this.gridBagConstraintsEmpleadoConstante.gridx = iXPanelCamposEmpleadoConstante++;
	this.gridBagConstraintsEmpleadoConstante.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleadoConstante.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpleadoConstante.add(this.jPanelid_constante_nomiEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);



	if(iXPanelCamposEmpleadoConstante % 1==0) {
		iXPanelCamposEmpleadoConstante=0;
		iYPanelCamposEmpleadoConstante++;
	}
	this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoConstante.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleadoConstante.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleadoConstante.gridy = iYPanelCamposEmpleadoConstante;
	this.gridBagConstraintsEmpleadoConstante.gridx = iXPanelCamposEmpleadoConstante++;
	this.gridBagConstraintsEmpleadoConstante.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleadoConstante.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpleadoConstante.add(this.jPanelvalorEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);



	if(iXPanelCamposEmpleadoConstante % 1==0) {
		iXPanelCamposEmpleadoConstante=0;
		iYPanelCamposEmpleadoConstante++;
	}
	this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoConstante.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleadoConstante.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleadoConstante.gridy = iYPanelCamposEmpleadoConstante;
	this.gridBagConstraintsEmpleadoConstante.gridx = iXPanelCamposEmpleadoConstante++;
	this.gridBagConstraintsEmpleadoConstante.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleadoConstante.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEmpleadoConstante.add(this.jPanelesta_activoEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);



	if(iXPanelCamposEmpleadoConstante % 1==0) {
		iXPanelCamposEmpleadoConstante=0;
		iYPanelCamposEmpleadoConstante++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
	this.gridBagConstraintsEmpleadoConstante.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEmpleadoConstante.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEmpleadoConstante.gridy = iYPanelCamposOcultosEmpleadoConstante;
	this.gridBagConstraintsEmpleadoConstante.gridx = iXPanelCamposOcultosEmpleadoConstante++;
	this.gridBagConstraintsEmpleadoConstante.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEmpleadoConstante.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosEmpleadoConstante.add(this.jPanelid_empresaEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);



	if(iXPanelCamposOcultosEmpleadoConstante % 1==0) {
		iXPanelCamposOcultosEmpleadoConstante=0;
		iYPanelCamposOcultosEmpleadoConstante++;
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
			
		GridBagLayout gridaBagLayoutAccionesEmpleadoConstante= new GridBagLayout();
		this.jPanelAccionesEmpleadoConstante.setLayout(gridaBagLayoutAccionesEmpleadoConstante);
		
		GridBagLayout gridaBagLayoutAccionesFormularioEmpleadoConstante= new GridBagLayout();
		this.jPanelAccionesFormularioEmpleadoConstante.setLayout(gridaBagLayoutAccionesFormularioEmpleadoConstante);
		
		this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoConstante.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEmpleadoConstante.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEmpleadoConstante.add(this.jComboBoxTiposAccionesFormularioEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);

		this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoConstante.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEmpleadoConstante.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEmpleadoConstante.add(this.jCheckBoxPostAccionNuevoEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.empleadoconstanteSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoConstante.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEmpleadoConstante.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEmpleadoConstante.add(this.jCheckBoxPostAccionSinCerrarEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.empleadoconstanteSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.empleadoconstanteSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoConstante.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEmpleadoConstante.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEmpleadoConstante.add(this.jCheckBoxPostAccionSinMensajeEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoConstante.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoConstante.gridy = 0;
		this.gridBagConstraintsEmpleadoConstante.gridx = iPosXAccion++;
			
		this.jPanelAccionesEmpleadoConstante.add(this.jButtonModificarEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);							

		this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoConstante.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEmpleadoConstante.gridy = 0;
		this.gridBagConstraintsEmpleadoConstante.gridx =iPosXAccion++;
			
		this.jPanelAccionesEmpleadoConstante.add(this.jButtonEliminarEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);
		
			
		this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoConstante.gridy = 0;		
		this.gridBagConstraintsEmpleadoConstante.gridx = iPosXAccion++;
		
		this.jPanelAccionesEmpleadoConstante.add(this.jButtonActualizarEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);


		this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoConstante.gridy = 0;		
		this.gridBagConstraintsEmpleadoConstante.gridx = iPosXAccion++;
		
		this.jPanelAccionesEmpleadoConstante.add(this.jButtonGuardarCambiosEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);	
		
		this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoConstante.gridy = 0;		
		this.gridBagConstraintsEmpleadoConstante.gridx =iPosXAccion++;
		
		this.jPanelAccionesEmpleadoConstante.add(this.jButtonCancelarEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEmpleadoConstante = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEmpleadoConstante);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.empleadoconstanteSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();						
			this.gridBagConstraintsEmpleadoConstante.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEmpleadoConstante.gridx = 0;		
			//this.gridBagConstraintsEmpleadoConstante.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEmpleadoConstante.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEmpleadoConstante.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoConstante.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEmpleadoConstante.gridx =0;
		this.gridBagConstraintsEmpleadoConstante.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEmpleadoConstante.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(EmpleadoConstanteJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleEmpleadoConstante = new EmpleadoConstanteBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Empleado Constante DATOS");
			
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
			
	        //this.setTitle("[FOR] - Empleado Constante DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Empleado Constante Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			EmpleadoConstanteModel empleadoconstanteModel=new EmpleadoConstanteModel(this);
			
			//SI USARA CLASE INTERNA
			//EmpleadoConstanteModel.EmpleadoConstanteFocusTraversalPolicy empleadoconstanteFocusTraversalPolicy = empleadoconstanteModel.new EmpleadoConstanteFocusTraversalPolicy(this);
			
			//empleadoconstanteFocusTraversalPolicy.setempleadoconstanteJInternalFrame(this);
			
			this.setFocusTraversalPolicy(empleadoconstanteModel);
			
			
			this.jContentPaneDetalleEmpleadoConstante = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleEmpleadoConstante = new GridBagLayout();	
			this.jContentPaneDetalleEmpleadoConstante.setLayout(gridaBagLayoutDetalleEmpleadoConstante);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEmpleadoConstante = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
				this.gridBagConstraintsEmpleadoConstante.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsEmpleadoConstante.gridx = 0;
					
				
				this.jContentPaneDetalleEmpleadoConstante.add(jTtoolBarDetalleEmpleadoConstante, gridBagConstraintsEmpleadoConstante);								
				
}
			
			this.jScrollPanelDatosEdicionEmpleadoConstante=   new JScrollPane(jContentPaneDetalleEmpleadoConstante,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEmpleadoConstante.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEmpleadoConstante.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEmpleadoConstante.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralEmpleadoConstante=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEmpleadoConstante.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEmpleadoConstante.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEmpleadoConstante.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
			
			
	        this.gridBagConstraintsEmpleadoConstante.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsEmpleadoConstante.gridx = 0;
	        
			this.jContentPaneDetalleEmpleadoConstante.add(jPanelCamposEmpleadoConstante, gridBagConstraintsEmpleadoConstante);
			
			
			
			
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
						&& empleadoconstanteSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.empleadoconstanteSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsEmpleadoConstante= new GridBagConstraints();
						this.gridBagConstraintsEmpleadoConstante.gridy = iGridyRelaciones++;
						this.gridBagConstraintsEmpleadoConstante.gridx = 0;
						this.jContentPaneDetalleEmpleadoConstante.add(this.jTabbedPaneRelacionesEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesEmpleadoConstante.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosEmpleadoConstante.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
					this.gridBagConstraintsEmpleadoConstante.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsEmpleadoConstante.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsEmpleadoConstante.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsEmpleadoConstante.gridx = 0;
					
				
					this.jContentPaneDetalleEmpleadoConstante.add(jPanelCamposOcultosEmpleadoConstante, gridBagConstraintsEmpleadoConstante);
				
					this.jPanelCamposOcultosEmpleadoConstante.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoConstante.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsEmpleadoConstante.gridx = 0;
	        this.gridBagConstraintsEmpleadoConstante.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleEmpleadoConstante.add(this.jPanelAccionesFormularioEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);							
			
			
			
			this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
	        this.gridBagConstraintsEmpleadoConstante.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsEmpleadoConstante.gridx = 0;
	        
			
			this.jContentPaneDetalleEmpleadoConstante.add(this.jPanelAccionesEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionEmpleadoConstante);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionEmpleadoConstante=   new JScrollPane(this.jPanelCamposEmpleadoConstante,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEmpleadoConstante.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEmpleadoConstante.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEmpleadoConstante.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoConstante.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsEmpleadoConstante.gridx = 0;
			this.gridBagConstraintsEmpleadoConstante.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsEmpleadoConstante.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsEmpleadoConstante.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoConstante.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEmpleadoConstante.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);			
			
			this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
			this.gridBagConstraintsEmpleadoConstante.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEmpleadoConstante.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoConstante.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpleadoConstante.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);
			
			
		this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoConstante.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEmpleadoConstante.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);
		
			
		this.gridBagConstraintsEmpleadoConstante = new GridBagConstraints();
		this.gridBagConstraintsEmpleadoConstante.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEmpleadoConstante.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEmpleadoConstante, this.gridBagConstraintsEmpleadoConstante);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralEmpleadoConstante;//jContentPane;
		
		return jScrollPanelDatosEdicionEmpleadoConstante;
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
