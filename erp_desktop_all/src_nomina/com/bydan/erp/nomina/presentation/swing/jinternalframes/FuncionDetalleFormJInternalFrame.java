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
import com.bydan.erp.nomina.util.FuncionConstantesFunciones;

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
public class FuncionDetalleFormJInternalFrame extends FuncionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleFuncion;
	
	protected JMenuBar jmenuBarDetalleFuncion;
	
	protected JMenu jmenuDetalleFuncion;
	protected JMenu jmenuDetalleArchivoFuncion;
	protected JMenu jmenuDetalleAccionesFuncion;
	protected JMenu jmenuDetalleDatosFuncion;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleFuncion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutFuncion;	
	protected GridBagConstraints gridBagConstraintsFuncion;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected FuncionBeanSwingJInternalFrameAdditional jInternalFrameDetalleFuncion;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public FuncionSessionBean funcionSessionBean;
	
	

	public FuncionEstrucBeanSwingJInternalFrame funcionestrucBeanSwingJInternalFrame=null;
	public FuncionEstrucBeanSwingJInternalFrame funcionestrucBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteFuncionEstruc=false;
	public FuncionEstrucSessionBean funcionestrucSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public FuncionLogic funcionLogic;
	
	public JScrollPane jScrollPanelDatosFuncion;
	public JScrollPane jScrollPanelDatosEdicionFuncion;
	public JScrollPane jScrollPanelDatosGeneralFuncion;
	
	protected JPanel jPanelCamposFuncion;    
	protected JPanel jPanelCamposOcultosFuncion;    	
	protected JPanel jPanelAccionesFuncion;
	protected JPanel jPanelAccionesFormularioFuncion;
    
	
	
	protected Integer iXPanelCamposFuncion=0;
	protected Integer iYPanelCamposFuncion=0;
	
	protected Integer iXPanelCamposOcultosFuncion=0;
	protected Integer iYPanelCamposOcultosFuncion=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoFuncion;
	public JButton jButtonModificarFuncion;
	public JButton jButtonActualizarFuncion;
    public JButton jButtonEliminarFuncion;
	public JButton jButtonCancelarFuncion;
    public JButton jButtonGuardarCambiosFuncion;
	public JButton jButtonGuardarCambiosTablaFuncion;
	protected JButton jButtonCerrarFuncion;
	
	
	protected JButton jButtonProcesarInformacionFuncion;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoFuncion;
	protected JCheckBox jCheckBoxPostAccionSinCerrarFuncion;
	protected JCheckBox jCheckBoxPostAccionSinMensajeFuncion;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarFuncion;
	protected JButton jButtonModificarToolBarFuncion;
	protected JButton jButtonActualizarToolBarFuncion;
    protected JButton jButtonEliminarToolBarFuncion;
	protected JButton jButtonCancelarToolBarFuncion;
    protected JButton jButtonGuardarCambiosToolBarFuncion;
	protected JButton jButtonGuardarCambiosTablaToolBarFuncion;
	protected JButton jButtonMostrarOcultarTablaToolBarFuncion;
	protected JButton jButtonCerrarToolBarFuncion;
	
	protected JButton jButtonProcesarInformacionToolBarFuncion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoFuncion;
	protected JMenuItem jMenuItemModificarFuncion;
	protected JMenuItem jMenuItemActualizarFuncion;
    protected JMenuItem jMenuItemEliminarFuncion;
	protected JMenuItem jMenuItemCancelarFuncion;
    protected JMenuItem jMenuItemGuardarCambiosFuncion;
	protected JMenuItem jMenuItemGuardarCambiosTablaFuncion;
	protected JMenuItem jMenuItemCerrarFuncion;
	protected JMenuItem jMenuItemDetalleCerrarFuncion;
	protected JMenuItem jMenuItemDetalleMostarOcultarFuncion;
	
	protected JMenuItem jMenuItemProcesarInformacionFuncion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosFuncion;
	protected JMenuItem jMenuItemMostrarOcultarFuncion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesFuncion;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesFuncion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesFuncion;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioFuncion;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidFuncion;
	public JLabel jLabelIdFuncion;
	public JLabel jLabelidFuncion;
	public JButton jButtonidFuncionBusqueda= new JButtonMe();

	public JPanel jPanelnombreFuncion;
	public JLabel jLabelnombreFuncion;
	public JTextArea jTextAreanombreFuncion;
	public JScrollPane jscrollPanenombreFuncion;
	public JButton jButtonnombreFuncionBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionFuncion;
	public JLabel jLabeldescripcionFuncion;
	public JTextArea jTextAreadescripcionFuncion;
	public JScrollPane jscrollPanedescripcionFuncion;
	public JButton jButtondescripcionFuncionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaFuncion;
	public JLabel jLabelid_empresaFuncion;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaFuncion;
	public JButton jButtonid_empresaFuncion= new JButtonMe();
	public JButton jButtonid_empresaFuncionUpdate= new JButtonMe();
	public JButton jButtonid_empresaFuncionBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesFuncion;
	
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
	public int iHeightFormulario=418;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public FuncionDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposFuncion=new JPanel();
				this.jPanelAccionesFormularioFuncion=new JPanel();
				this.jmenuBarDetalleFuncion=new JMenuBar();
				this.jTtoolBarDetalleFuncion=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FuncionDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Funcion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public FuncionDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Funcion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FuncionDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Funcion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FuncionDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Funcion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FuncionDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Funcion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarFuncion() {
		return this.jButtonActualizarToolBarFuncion;
	}
	
	public JButton getjButtonEliminarToolBarFuncion() {
		return this.jButtonEliminarToolBarFuncion;
	}
	
	public JButton getjButtonCancelarToolBarFuncion() {
		return this.jButtonCancelarToolBarFuncion;
	}		
	
	public JButton getjButtonProcesarInformacionFuncion() {
		return this.jButtonProcesarInformacionFuncion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionFuncion)	{
		this.jButtonProcesarInformacionFuncion = jButtonProcesarInformacionFuncion;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFuncion() {
		return this.jComboBoxTiposAccionesFuncion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesFuncion(
			JComboBox jComboBoxTiposRelacionesFuncion) {
		this.jComboBoxTiposRelacionesFuncion = jComboBoxTiposRelacionesFuncion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFuncion(
			JComboBox jComboBoxTiposAccionesFuncion) {
		this.jComboBoxTiposAccionesFuncion = jComboBoxTiposAccionesFuncion;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioFuncion() {
		return this.jComboBoxTiposAccionesFormularioFuncion;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioFuncion(
			JComboBox jComboBoxTiposAccionesFormularioFuncion) {
		this.jComboBoxTiposAccionesFormularioFuncion = jComboBoxTiposAccionesFormularioFuncion;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.funcionSessionBean=new FuncionSessionBean();
		
		this.funcionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.funcionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.funcionSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.funcionestrucSessionBean=new FuncionEstrucSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		FuncionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		FuncionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		FuncionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Funcion MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.funcionSessionBean.getEsGuardarRelacionado()) {
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
	
		FuncionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleFuncion= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarFuncion=new JButtonMe();
				this.jButtonModificarToolBarFuncion=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarFuncion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarFuncion,this.jTtoolBarDetalleFuncion,
							"actualizar","actualizar","Actualizar"+" "+FuncionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarFuncion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarFuncion,this.jTtoolBarDetalleFuncion,
							"eliminar","eliminar","Eliminar"+" "+FuncionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarFuncion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarFuncion,this.jTtoolBarDetalleFuncion,
							"cancelar","cancelar","Cancelar"+" "+FuncionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarFuncion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarFuncion,this.jTtoolBarDetalleFuncion,
							"guardarcambios","guardarcambios","Guardar"+" "+FuncionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarFuncion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarFuncion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarFuncion,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleFuncion=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleFuncion=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoFuncion=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesFuncion=new JMenuMe("Acciones");
		this.jmenuDetalleDatosFuncion=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoFuncion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoFuncion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoFuncion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoFuncion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarFuncion= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarFuncion.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarFuncion,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarFuncion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarFuncion= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarFuncion.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarFuncion,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarFuncion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarFuncion= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarFuncion.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarFuncion,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarFuncion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarFuncion= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarFuncion.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarFuncion,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarFuncion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosFuncion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosFuncion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosFuncion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosFuncion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarFuncion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarFuncion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarFuncion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarFuncion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarFuncion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarFuncion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarFuncion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarFuncion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarFuncion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarFuncion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarFuncion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarFuncion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarFuncion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarFuncion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarFuncion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarFuncion, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoFuncion.add(this.jMenuItemDetalleCerrarFuncion);
		
		this.jmenuDetalleAccionesFuncion.add(this.jMenuItemActualizarFuncion);
		this.jmenuDetalleAccionesFuncion.add(this.jMenuItemEliminarFuncion);
		this.jmenuDetalleAccionesFuncion.add(this.jMenuItemCancelarFuncion);		
		
		//this.jmenuDetalleDatosFuncion.add(this.jMenuItemDetalleAbrirOrderByFuncion);				
		this.jmenuDetalleDatosFuncion.add(this.jMenuItemDetalleMostarOcultarFuncion);				
				
		//this.jmenuDetalleAccionesFuncion.add(this.jMenuItemGuardarCambiosFuncion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoFuncion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesFuncion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosFuncion, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleFuncion.add(this.jmenuDetalleArchivoFuncion);		
		this.jmenuBarDetalleFuncion.add(this.jmenuDetalleAccionesFuncion);		
		this.jmenuBarDetalleFuncion.add(this.jmenuDetalleDatosFuncion);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleFuncion, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleFuncion.add(this.jmenuDetalleFuncion);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleFuncion);				
	}
	
	
	public void inicializarElementosCamposFuncion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdFuncion = new JLabelMe();
		jLabelIdFuncion.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdFuncion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdFuncion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdFuncion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdFuncion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidFuncion = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidFuncion.setToolTipText(FuncionConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutFuncion= new GridBagLayout();

		this.jPanelidFuncion.setLayout(this.gridaBagLayoutFuncion);

		jLabelidFuncion = new JLabel();
		jLabelidFuncion.setText("Id");

		jLabelidFuncion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidFuncion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidFuncion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreFuncion = new JLabelMe();
		this.jLabelnombreFuncion.setText(""+FuncionConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreFuncion.setToolTipText("Nombre");
		this.jLabelnombreFuncion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreFuncion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreFuncion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreFuncion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreFuncion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreFuncion.setToolTipText(FuncionConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutFuncion = new GridBagLayout();
		this.jPanelnombreFuncion.setLayout(this.gridaBagLayoutFuncion);


		jTextAreanombreFuncion= new JTextAreaMe();
		jTextAreanombreFuncion.setEnabled(false);
		jTextAreanombreFuncion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreFuncion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreFuncion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreFuncion.setLineWrap(true);
		jTextAreanombreFuncion.setWrapStyleWord(true);
		jTextAreanombreFuncion.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreFuncion.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreFuncion,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreFuncion = new JScrollPane(jTextAreanombreFuncion);
		jscrollPanenombreFuncion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreFuncion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreFuncion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreFuncionBusqueda= new JButtonMe();
		this.jButtonnombreFuncionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreFuncionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreFuncionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreFuncionBusqueda.setText("U");
		this.jButtonnombreFuncionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreFuncionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreFuncionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreFuncion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreFuncion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreFuncionBusqueda"));

		if(this.funcionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreFuncionBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionFuncion = new JLabelMe();
		this.jLabeldescripcionFuncion.setText(""+FuncionConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionFuncion.setToolTipText("Descripcion");
		this.jLabeldescripcionFuncion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionFuncion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionFuncion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionFuncion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionFuncion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionFuncion.setToolTipText(FuncionConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutFuncion = new GridBagLayout();
		this.jPaneldescripcionFuncion.setLayout(this.gridaBagLayoutFuncion);


		jTextAreadescripcionFuncion= new JTextAreaMe();
		jTextAreadescripcionFuncion.setEnabled(false);
		jTextAreadescripcionFuncion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionFuncion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionFuncion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionFuncion.setLineWrap(true);
		jTextAreadescripcionFuncion.setWrapStyleWord(true);
		jTextAreadescripcionFuncion.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionFuncion.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionFuncion,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionFuncion = new JScrollPane(jTextAreadescripcionFuncion);
		jscrollPanedescripcionFuncion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionFuncion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionFuncion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionFuncionBusqueda= new JButtonMe();
		this.jButtondescripcionFuncionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionFuncionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionFuncionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionFuncionBusqueda.setText("U");
		this.jButtondescripcionFuncionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionFuncionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionFuncionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionFuncion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionFuncion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionFuncionBusqueda"));

		if(this.funcionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionFuncionBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysFuncion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaFuncion = new JLabelMe();
		this.jLabelid_empresaFuncion.setText(""+FuncionConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaFuncion.setToolTipText("Empresa");
		this.jLabelid_empresaFuncion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaFuncion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaFuncion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaFuncion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaFuncion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaFuncion.setToolTipText(FuncionConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutFuncion = new GridBagLayout();
		this.jPanelid_empresaFuncion.setLayout(this.gridaBagLayoutFuncion);


		jComboBoxid_empresaFuncion= new JComboBoxMe();
		jComboBoxid_empresaFuncion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaFuncion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaFuncion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaFuncion,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaFuncion.setEnabled(false);

		this.jButtonid_empresaFuncion= new JButtonMe();
		this.jButtonid_empresaFuncion.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaFuncion.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaFuncion.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaFuncion.setText("Buscar");
		this.jButtonid_empresaFuncion.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaFuncion.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaFuncion,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaFuncion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaFuncion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaFuncion"));

		this.jButtonid_empresaFuncionBusqueda= new JButtonMe();
		this.jButtonid_empresaFuncionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFuncionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFuncionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaFuncionBusqueda.setText("U");
		this.jButtonid_empresaFuncionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaFuncionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaFuncionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaFuncion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaFuncion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaFuncionBusqueda"));

		if(this.funcionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaFuncionBusqueda.setVisible(false);		}

		this.jButtonid_empresaFuncionUpdate= new JButtonMe();
		this.jButtonid_empresaFuncionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFuncionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFuncionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaFuncionUpdate.setText("U");
		this.jButtonid_empresaFuncionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaFuncionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaFuncionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaFuncion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaFuncion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaFuncionUpdate"));



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
		//this.jInternalFrameDetalleFuncion = new FuncionBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Funcion DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutFuncion= new GridBagLayout();
		

		
		String sToolTipFuncion="";
		sToolTipFuncion=FuncionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipFuncion+="(Nomina.Funcion)";
		}
		
		if(!this.funcionSessionBean.getEsGuardarRelacionado()) {
			sToolTipFuncion+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoFuncion = new JButtonMe();
		this.jButtonModificarFuncion = new JButtonMe();
        this.jButtonActualizarFuncion = new JButtonMe();
        this.jButtonEliminarFuncion = new JButtonMe();
        this.jButtonCancelarFuncion = new JButtonMe();
        this.jButtonGuardarCambiosFuncion = new JButtonMe();
		this.jButtonGuardarCambiosTablaFuncion = new JButtonMe();
		this.jButtonCerrarFuncion = new JButtonMe();
		
		this.jScrollPanelDatosFuncion = new JScrollPane();   
        this.jScrollPanelDatosEdicionFuncion = new JScrollPane();
		this.jScrollPanelDatosGeneralFuncion = new JScrollPane();
				
		
		
		this.jPanelCamposFuncion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosFuncion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesFuncion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioFuncion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Funcion";
		
		if(!this.funcionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosFuncion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Funciones" + this.sPath));
		} else {
			this.jScrollPanelDatosFuncion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionFuncion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralFuncion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposFuncion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposFuncion.setName("jPanelCamposFuncion"); 

		this.jPanelCamposOcultosFuncion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosFuncion.setName("jPanelCamposOcultosFuncion"); 

        this.jPanelAccionesFuncion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesFuncion.setToolTipText("Acciones");
        this.jPanelAccionesFuncion.setName("Acciones"); 

		this.jPanelAccionesFormularioFuncion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioFuncion.setToolTipText("Acciones");
        this.jPanelAccionesFormularioFuncion.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionFuncion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralFuncion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosFuncion, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposFuncion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosFuncion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioFuncion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoFuncion.setText("Nuevo");
		this.jButtonModificarFuncion.setText("Editar");
        this.jButtonActualizarFuncion.setText("Actualizar");
        this.jButtonEliminarFuncion.setText("Eliminar");
        this.jButtonCancelarFuncion.setText("Cancelar");
        this.jButtonGuardarCambiosFuncion.setText("Guardar");
		this.jButtonGuardarCambiosTablaFuncion.setText("Guardar");
		this.jButtonCerrarFuncion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoFuncion,"nuevo_button","Nuevo",this.funcionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarFuncion,"modificar_button","Editar",this.funcionSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarFuncion,"actualizar_button","Actualizar",this.funcionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarFuncion,"eliminar_button","Eliminar",this.funcionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarFuncion,"cancelar_button","Cancelar",this.funcionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosFuncion,"guardarcambios_button","Guardar",this.funcionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaFuncion,"guardarcambiostabla_button","Guardar",this.funcionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarFuncion,"cerrar_button","Salir",this.funcionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoFuncion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarFuncion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosFuncion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaFuncion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarFuncion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarFuncion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarFuncion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarFuncion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoFuncion.setToolTipText("Nuevo"+" "+FuncionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarFuncion.setToolTipText("Editar"+" "+FuncionConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarFuncion.setToolTipText("Actualizar"+" "+FuncionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarFuncion.setToolTipText("Eliminar)"+" "+FuncionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarFuncion.setToolTipText("Cancelar"+" "+FuncionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosFuncion.setToolTipText("Guardar"+" "+FuncionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaFuncion.setToolTipText("Guardar"+" "+FuncionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarFuncion.setToolTipText("Salir"+" "+FuncionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoFuncion";
		inputMap = this.jButtonNuevoFuncion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoFuncion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoFuncion"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarFuncion";
		inputMap = this.jButtonActualizarFuncion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarFuncion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarFuncion"));
		
		//ELIMINAR
		sMapKey = "EliminarFuncion";
		inputMap = this.jButtonEliminarFuncion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarFuncion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarFuncion"));
		
		//CANCELAR	
		sMapKey = "CancelarFuncion";
		inputMap = this.jButtonCancelarFuncion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarFuncion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarFuncion"));
		
		//CERRAR		
		sMapKey = "CerrarFuncion";
		inputMap = this.jButtonCerrarFuncion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarFuncion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarFuncion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaFuncion";
		inputMap = this.jButtonGuardarCambiosTablaFuncion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaFuncion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaFuncion"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoFuncion = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoFuncion.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoFuncion.setToolTipText("Nuevo Funcion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoFuncion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarFuncion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarFuncion.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarFuncion.setToolTipText("Sin Cerrar Ventana Funcion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarFuncion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeFuncion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeFuncion.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeFuncion.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeFuncion, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesFuncion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFuncion.setText("Accion");
		this.jComboBoxTiposAccionesFuncion.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioFuncion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioFuncion.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioFuncion.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesFuncion = new JLabelMe();
		
		this.jLabelAccionesFuncion.setText("Acciones");		
		this.jLabelAccionesFuncion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFuncion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFuncion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposFuncion();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysFuncion();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesFuncion=new JTabbedPane();
		this.jTabbedPaneRelacionesFuncion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesFuncion,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesFuncion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFuncion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFuncion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFuncion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioFuncion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioFuncion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioFuncion.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioFuncion, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposFuncion = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosFuncion = new GridBagLayout();
		
		this.jPanelCamposFuncion.setLayout(gridaBagLayoutCamposFuncion);
		this.jPanelCamposOcultosFuncion.setLayout(gridaBagLayoutCamposOcultosFuncion);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsFuncion = new GridBagConstraints();
	this.gridBagConstraintsFuncion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFuncion.gridy = 0;
	this.gridBagConstraintsFuncion.gridx = 0;
	this.gridBagConstraintsFuncion.ipadx = 0;
	this.gridBagConstraintsFuncion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidFuncion.add(jLabelIdFuncion, this.gridBagConstraintsFuncion);



	this.gridBagConstraintsFuncion = new GridBagConstraints();
	this.gridBagConstraintsFuncion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFuncion.gridy = 0;
	this.gridBagConstraintsFuncion.gridx = 1;
	this.gridBagConstraintsFuncion.ipadx = 0;
	this.gridBagConstraintsFuncion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidFuncion.add(jLabelidFuncion, this.gridBagConstraintsFuncion);


	this.gridBagConstraintsFuncion = new GridBagConstraints();
	this.gridBagConstraintsFuncion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFuncion.gridy = 0;
	this.gridBagConstraintsFuncion.gridx = 0;
	this.gridBagConstraintsFuncion.ipadx = 0;
	this.gridBagConstraintsFuncion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaFuncion.add(jLabelid_empresaFuncion, this.gridBagConstraintsFuncion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFuncion = new GridBagConstraints();
		//this.gridBagConstraintsFuncion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFuncion.gridy = 0;
		this.gridBagConstraintsFuncion.gridx = 2;
		this.gridBagConstraintsFuncion.ipadx = 0;
		this.gridBagConstraintsFuncion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaFuncion.add(jButtonid_empresaFuncionBusqueda, this.gridBagConstraintsFuncion);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFuncion = new GridBagConstraints();
		//this.gridBagConstraintsFuncion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFuncion.gridy = 0;
		this.gridBagConstraintsFuncion.gridx = 3;
		this.gridBagConstraintsFuncion.ipadx = 0;
		this.gridBagConstraintsFuncion.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaFuncion.add(jButtonid_empresaFuncionUpdate, this.gridBagConstraintsFuncion);
	}

	this.gridBagConstraintsFuncion = new GridBagConstraints();
	this.gridBagConstraintsFuncion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFuncion.gridy = 0;
	this.gridBagConstraintsFuncion.gridx = 1;
	this.gridBagConstraintsFuncion.ipadx = 0;
	this.gridBagConstraintsFuncion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaFuncion.add(jComboBoxid_empresaFuncion, this.gridBagConstraintsFuncion);


	this.gridBagConstraintsFuncion = new GridBagConstraints();
	this.gridBagConstraintsFuncion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFuncion.gridy = 0;
	this.gridBagConstraintsFuncion.gridx = 0;
	this.gridBagConstraintsFuncion.ipadx = 0;
	this.gridBagConstraintsFuncion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreFuncion.add(jLabelnombreFuncion, this.gridBagConstraintsFuncion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFuncion = new GridBagConstraints();
		//this.gridBagConstraintsFuncion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFuncion.gridy = 0;
		this.gridBagConstraintsFuncion.gridx = 2;
		this.gridBagConstraintsFuncion.ipadx = 0;
		this.gridBagConstraintsFuncion.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreFuncion.add(jButtonnombreFuncionBusqueda, this.gridBagConstraintsFuncion);
	}

	this.gridBagConstraintsFuncion = new GridBagConstraints();
	this.gridBagConstraintsFuncion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFuncion.gridy = 0;
	this.gridBagConstraintsFuncion.gridx = 1;
	this.gridBagConstraintsFuncion.ipadx = 0;
	this.gridBagConstraintsFuncion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreFuncion.add(jscrollPanenombreFuncion, this.gridBagConstraintsFuncion);


	this.gridBagConstraintsFuncion = new GridBagConstraints();
	this.gridBagConstraintsFuncion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFuncion.gridy = 0;
	this.gridBagConstraintsFuncion.gridx = 0;
	this.gridBagConstraintsFuncion.ipadx = 0;
	this.gridBagConstraintsFuncion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionFuncion.add(jLabeldescripcionFuncion, this.gridBagConstraintsFuncion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFuncion = new GridBagConstraints();
		//this.gridBagConstraintsFuncion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFuncion.gridy = 0;
		this.gridBagConstraintsFuncion.gridx = 2;
		this.gridBagConstraintsFuncion.ipadx = 0;
		this.gridBagConstraintsFuncion.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionFuncion.add(jButtondescripcionFuncionBusqueda, this.gridBagConstraintsFuncion);
	}

	this.gridBagConstraintsFuncion = new GridBagConstraints();
	this.gridBagConstraintsFuncion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFuncion.gridy = 0;
	this.gridBagConstraintsFuncion.gridx = 1;
	this.gridBagConstraintsFuncion.ipadx = 0;
	this.gridBagConstraintsFuncion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionFuncion.add(jscrollPanedescripcionFuncion, this.gridBagConstraintsFuncion);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsFuncion = new GridBagConstraints();
	this.gridBagConstraintsFuncion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFuncion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFuncion.gridy = iYPanelCamposFuncion;
	this.gridBagConstraintsFuncion.gridx = iXPanelCamposFuncion++;
	this.gridBagConstraintsFuncion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFuncion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFuncion.add(this.jPanelidFuncion, this.gridBagConstraintsFuncion);



	if(iXPanelCamposFuncion % 1==0) {
		iXPanelCamposFuncion=0;
		iYPanelCamposFuncion++;
	}
	this.gridBagConstraintsFuncion = new GridBagConstraints();
	this.gridBagConstraintsFuncion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFuncion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFuncion.gridy = iYPanelCamposFuncion;
	this.gridBagConstraintsFuncion.gridx = iXPanelCamposFuncion++;
	this.gridBagConstraintsFuncion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFuncion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFuncion.add(this.jPanelnombreFuncion, this.gridBagConstraintsFuncion);



	if(iXPanelCamposFuncion % 1==0) {
		iXPanelCamposFuncion=0;
		iYPanelCamposFuncion++;
	}
	this.gridBagConstraintsFuncion = new GridBagConstraints();
	this.gridBagConstraintsFuncion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFuncion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFuncion.gridy = iYPanelCamposFuncion;
	this.gridBagConstraintsFuncion.gridx = iXPanelCamposFuncion++;
	this.gridBagConstraintsFuncion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFuncion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFuncion.add(this.jPaneldescripcionFuncion, this.gridBagConstraintsFuncion);



	if(iXPanelCamposFuncion % 1==0) {
		iXPanelCamposFuncion=0;
		iYPanelCamposFuncion++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsFuncion = new GridBagConstraints();
	this.gridBagConstraintsFuncion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFuncion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFuncion.gridy = iYPanelCamposOcultosFuncion;
	this.gridBagConstraintsFuncion.gridx = iXPanelCamposOcultosFuncion++;
	this.gridBagConstraintsFuncion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFuncion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosFuncion.add(this.jPanelid_empresaFuncion, this.gridBagConstraintsFuncion);



	if(iXPanelCamposOcultosFuncion % 1==0) {
		iXPanelCamposOcultosFuncion=0;
		iYPanelCamposOcultosFuncion++;
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
			
		GridBagLayout gridaBagLayoutAccionesFuncion= new GridBagLayout();
		this.jPanelAccionesFuncion.setLayout(gridaBagLayoutAccionesFuncion);
		
		GridBagLayout gridaBagLayoutAccionesFormularioFuncion= new GridBagLayout();
		this.jPanelAccionesFormularioFuncion.setLayout(gridaBagLayoutAccionesFormularioFuncion);
		
		this.gridBagConstraintsFuncion = new GridBagConstraints();
		this.gridBagConstraintsFuncion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsFuncion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioFuncion.add(this.jComboBoxTiposAccionesFormularioFuncion, this.gridBagConstraintsFuncion);

		this.gridBagConstraintsFuncion = new GridBagConstraints();
		this.gridBagConstraintsFuncion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsFuncion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioFuncion.add(this.jCheckBoxPostAccionNuevoFuncion, this.gridBagConstraintsFuncion);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.funcionSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsFuncion = new GridBagConstraints();
			this.gridBagConstraintsFuncion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsFuncion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioFuncion.add(this.jCheckBoxPostAccionSinCerrarFuncion, this.gridBagConstraintsFuncion);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.funcionSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.funcionSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsFuncion = new GridBagConstraints();
			this.gridBagConstraintsFuncion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsFuncion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioFuncion.add(this.jCheckBoxPostAccionSinMensajeFuncion, this.gridBagConstraintsFuncion);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsFuncion = new GridBagConstraints();
		this.gridBagConstraintsFuncion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFuncion.gridy = 0;
		this.gridBagConstraintsFuncion.gridx = iPosXAccion++;
			
		this.jPanelAccionesFuncion.add(this.jButtonModificarFuncion, this.gridBagConstraintsFuncion);							

		this.gridBagConstraintsFuncion = new GridBagConstraints();
		this.gridBagConstraintsFuncion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFuncion.gridy = 0;
		this.gridBagConstraintsFuncion.gridx =iPosXAccion++;
			
		this.jPanelAccionesFuncion.add(this.jButtonEliminarFuncion, this.gridBagConstraintsFuncion);
		
			
		this.gridBagConstraintsFuncion = new GridBagConstraints();
		this.gridBagConstraintsFuncion.gridy = 0;		
		this.gridBagConstraintsFuncion.gridx = iPosXAccion++;
		
		this.jPanelAccionesFuncion.add(this.jButtonActualizarFuncion, this.gridBagConstraintsFuncion);


		this.gridBagConstraintsFuncion = new GridBagConstraints();
		this.gridBagConstraintsFuncion.gridy = 0;		
		this.gridBagConstraintsFuncion.gridx = iPosXAccion++;
		
		this.jPanelAccionesFuncion.add(this.jButtonGuardarCambiosFuncion, this.gridBagConstraintsFuncion);	
		
		this.gridBagConstraintsFuncion = new GridBagConstraints();
		this.gridBagConstraintsFuncion.gridy = 0;		
		this.gridBagConstraintsFuncion.gridx =iPosXAccion++;
		
		this.jPanelAccionesFuncion.add(this.jButtonCancelarFuncion, this.gridBagConstraintsFuncion);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutFuncion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutFuncion);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.funcionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsFuncion = new GridBagConstraints();						
			this.gridBagConstraintsFuncion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsFuncion.gridx = 0;		
			//this.gridBagConstraintsFuncion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFuncion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsFuncion.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsFuncion = new GridBagConstraints();
		this.gridBagConstraintsFuncion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsFuncion.gridx =0;
		this.gridBagConstraintsFuncion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsFuncion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosFuncion, this.gridBagConstraintsFuncion);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(FuncionJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleFuncion = new FuncionBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Funcion DATOS");
			
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
			
	        //this.setTitle("[FOR] - Funcion DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Funcion Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			FuncionModel funcionModel=new FuncionModel(this);
			
			//SI USARA CLASE INTERNA
			//FuncionModel.FuncionFocusTraversalPolicy funcionFocusTraversalPolicy = funcionModel.new FuncionFocusTraversalPolicy(this);
			
			//funcionFocusTraversalPolicy.setfuncionJInternalFrame(this);
			
			this.setFocusTraversalPolicy(funcionModel);
			
			
			this.jContentPaneDetalleFuncion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleFuncion = new GridBagLayout();	
			this.jContentPaneDetalleFuncion.setLayout(gridaBagLayoutDetalleFuncion);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosFuncion = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsFuncion = new GridBagConstraints();
				this.gridBagConstraintsFuncion.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsFuncion.gridx = 0;
					
				
				this.jContentPaneDetalleFuncion.add(jTtoolBarDetalleFuncion, gridBagConstraintsFuncion);								
				
}
			
			this.jScrollPanelDatosEdicionFuncion=   new JScrollPane(jContentPaneDetalleFuncion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionFuncion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFuncion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFuncion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralFuncion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralFuncion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFuncion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFuncion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsFuncion = new GridBagConstraints();
			
			
	        this.gridBagConstraintsFuncion.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsFuncion.gridx = 0;
	        
			this.jContentPaneDetalleFuncion.add(jPanelCamposFuncion, gridBagConstraintsFuncion);
			
			
			
			
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
						&& funcionSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameFuncionEstruc(this.puedeCargarPorParteFuncionEstruc,false,-1);
					
					if(this.funcionSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsFuncion= new GridBagConstraints();
						this.gridBagConstraintsFuncion.gridy = iGridyRelaciones++;
						this.gridBagConstraintsFuncion.gridx = 0;
						this.jContentPaneDetalleFuncion.add(this.jTabbedPaneRelacionesFuncion, this.gridBagConstraintsFuncion);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesFuncion.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameFuncionEstruc(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosFuncion.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsFuncion = new GridBagConstraints();
					this.gridBagConstraintsFuncion.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsFuncion.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsFuncion.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsFuncion.gridx = 0;
					
				
					this.jContentPaneDetalleFuncion.add(jPanelCamposOcultosFuncion, gridBagConstraintsFuncion);
				
					this.jPanelCamposOcultosFuncion.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsFuncion = new GridBagConstraints();
			this.gridBagConstraintsFuncion.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsFuncion.gridx = 0;
	        this.gridBagConstraintsFuncion.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleFuncion.add(this.jPanelAccionesFormularioFuncion, this.gridBagConstraintsFuncion);							
			
			
			
			this.gridBagConstraintsFuncion = new GridBagConstraints();
	        this.gridBagConstraintsFuncion.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsFuncion.gridx = 0;
	        
			
			this.jContentPaneDetalleFuncion.add(this.jPanelAccionesFuncion, this.gridBagConstraintsFuncion);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionFuncion);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionFuncion=   new JScrollPane(this.jPanelCamposFuncion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionFuncion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFuncion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFuncion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsFuncion = new GridBagConstraints();
			this.gridBagConstraintsFuncion.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsFuncion.gridx = 0;
			this.gridBagConstraintsFuncion.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsFuncion.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsFuncion.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionFuncion, this.gridBagConstraintsFuncion);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsFuncion = new GridBagConstraints();
			this.gridBagConstraintsFuncion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsFuncion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioFuncion, this.gridBagConstraintsFuncion);			
			
			this.gridBagConstraintsFuncion = new GridBagConstraints();
			this.gridBagConstraintsFuncion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsFuncion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFuncion, this.gridBagConstraintsFuncion);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsFuncion = new GridBagConstraints();
		this.gridBagConstraintsFuncion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFuncion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposFuncion, this.gridBagConstraintsFuncion);
			
			
		this.gridBagConstraintsFuncion = new GridBagConstraints();
		this.gridBagConstraintsFuncion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFuncion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosFuncion, this.gridBagConstraintsFuncion);
		
			
		this.gridBagConstraintsFuncion = new GridBagConstraints();
		this.gridBagConstraintsFuncion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsFuncion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesFuncion, this.gridBagConstraintsFuncion);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralFuncion;//jContentPane;
		
		return jScrollPanelDatosEdicionFuncion;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameFuncionEstruc(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.funcionestrucSessionBean=new FuncionEstrucSessionBean();
		this.funcionestrucSessionBean.setConGuardarRelaciones(false);
		this.funcionestrucSessionBean.setEsGuardarRelacionado(true);

		this.funcionestrucBeanSwingJInternalFrame=null;//new FuncionEstrucBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.funcionestrucBeanSwingJInternalFramePopup=new FuncionEstrucBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.funcionestrucBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.funcionestrucSessionBean.getEsGuardarRelacionado()) {

				FuncionEstrucJInternalFrame.STIPO_TAMANIO_GENERAL=FuncionJInternalFrame.STIPO_TAMANIO_GENERAL;
				FuncionEstrucJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=FuncionJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.funcionestrucSessionBean.setEsGuardarRelacionado(true);

				this.funcionestrucBeanSwingJInternalFrame=new FuncionEstrucBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.funcionestrucBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.funcionestrucBeanSwingJInternalFrame.setfuncionestrucSessionBean(this.funcionestrucSessionBean);

				//this.gridBagConstraintsFuncion = new GridBagConstraints();
				//this.gridBagConstraintsFuncion.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsFuncion.gridx = 0;
				//this.jContentPaneDetalleFuncion.add(this.funcionestrucBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsFuncion);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesFuncion.add("Funcion Estruces",this.funcionestrucBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesFuncion.setComponentAt(iIndexTab,this.funcionestrucBeanSwingJInternalFrame.getContentPane());
				}

				//FuncionEstrucJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.funcionestrucSessionBean.setEsGuardarRelacionado(false);
				this.funcionestrucBeanSwingJInternalFrame=null;//new FuncionEstrucBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.funcionestrucSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteFuncionEstruc) {
					this.jTabbedPaneRelacionesFuncion.add("Funcion Estruces",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarFuncionEstrucBeanSwingJInternalFrame(List<Funcion> funcions,Funcion funcion,FuncionEstrucBeanSwingJInternalFrame funcionestrucBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//funcionestrucBeanSwingJInternalFrame=new FuncionEstrucBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					funcionestrucBeanSwingJInternalFrame.getFuncionEstrucLogic().setConnexion(this.funcionLogic.getConnexion());

					funcionestrucBeanSwingJInternalFrame.setfuncionsForeignKey(funcions);
					funcionestrucBeanSwingJInternalFrame.setfuncionForeignKey(funcion);
					funcionestrucBeanSwingJInternalFrame.funcionestrucSessionBean.setisBusquedaDesdeForeignKeySesionFuncion(true);
					funcionestrucBeanSwingJInternalFrame.funcionestrucSessionBean.setlidFuncionActual(funcion.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					funcionestrucBeanSwingJInternalFrame.cargarCombosForeignKeyFuncionEstruc(funcionestrucBeanSwingJInternalFrame.isCargarCombosDependencia);
					funcionestrucBeanSwingJInternalFrame.setVisibilidadBusquedasParaFuncion(true);
					funcionestrucBeanSwingJInternalFrame.setid_funcionFK_IdFuncion(funcion.getId());

					if(!this.conCargarFormDetalle) {
						funcionestrucBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					funcionestrucBeanSwingJInternalFrame.setSelectedItemCombosFrameFuncionForeignKey(funcion,1,false,true,true);
					funcionestrucBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					funcionestrucBeanSwingJInternalFrame.procesarBusqueda("FK_IdFuncion");
					funcionestrucBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdFuncion");
					funcionestrucBeanSwingJInternalFrame.inicializarActualizarBindingTablaFuncionEstruc(true);
					funcionestrucBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesFuncionEstruc("n",funcionestrucBeanSwingJInternalFrame.isGuardarCambiosEnLote, funcionestrucBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					funcionestrucBeanSwingJInternalFrame.setAutoscrolls(true);
					funcionestrucBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						funcionestrucBeanSwingJInternalFrame.actualizarEstadoPanelsFuncionEstruc("relacionado");
					} else {
						funcionestrucBeanSwingJInternalFrame.actualizarEstadoPanelsFuncionEstruc("no_relacionado");
					}

					funcionestrucBeanSwingJInternalFrame.getjButtonRecargarInformacionFuncionEstruc().setVisible(false);

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
