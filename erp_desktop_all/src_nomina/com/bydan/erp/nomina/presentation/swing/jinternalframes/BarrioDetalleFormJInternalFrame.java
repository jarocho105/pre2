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
import com.bydan.erp.nomina.util.BarrioConstantesFunciones;

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
public class BarrioDetalleFormJInternalFrame extends BarrioBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleBarrio;
	
	protected JMenuBar jmenuBarDetalleBarrio;
	
	protected JMenu jmenuDetalleBarrio;
	protected JMenu jmenuDetalleArchivoBarrio;
	protected JMenu jmenuDetalleAccionesBarrio;
	protected JMenu jmenuDetalleDatosBarrio;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleBarrio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutBarrio;	
	protected GridBagConstraints gridBagConstraintsBarrio;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected BarrioBeanSwingJInternalFrameAdditional jInternalFrameDetalleBarrio;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected ProvinciaBeanSwingJInternalFrame provinciaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_provincia="";

	protected CantonBeanSwingJInternalFrame cantonBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_canton="";

	protected ParroquiaBeanSwingJInternalFrame parroquiaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_parroquia="";
	
	public BarrioSessionBean barrioSessionBean;
	
	
	
	
	public ProvinciaSessionBean provinciaSessionBean;
	public CantonSessionBean cantonSessionBean;
	public ParroquiaSessionBean parroquiaSessionBean;	
	
	public BarrioLogic barrioLogic;
	
	public JScrollPane jScrollPanelDatosBarrio;
	public JScrollPane jScrollPanelDatosEdicionBarrio;
	public JScrollPane jScrollPanelDatosGeneralBarrio;
	
	protected JPanel jPanelCamposBarrio;    
	protected JPanel jPanelCamposOcultosBarrio;    	
	protected JPanel jPanelAccionesBarrio;
	protected JPanel jPanelAccionesFormularioBarrio;
    
	
	
	protected Integer iXPanelCamposBarrio=0;
	protected Integer iYPanelCamposBarrio=0;
	
	protected Integer iXPanelCamposOcultosBarrio=0;
	protected Integer iYPanelCamposOcultosBarrio=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoBarrio;
	public JButton jButtonModificarBarrio;
	public JButton jButtonActualizarBarrio;
    public JButton jButtonEliminarBarrio;
	public JButton jButtonCancelarBarrio;
    public JButton jButtonGuardarCambiosBarrio;
	public JButton jButtonGuardarCambiosTablaBarrio;
	protected JButton jButtonCerrarBarrio;
	
	
	protected JButton jButtonProcesarInformacionBarrio;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoBarrio;
	protected JCheckBox jCheckBoxPostAccionSinCerrarBarrio;
	protected JCheckBox jCheckBoxPostAccionSinMensajeBarrio;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarBarrio;
	protected JButton jButtonModificarToolBarBarrio;
	protected JButton jButtonActualizarToolBarBarrio;
    protected JButton jButtonEliminarToolBarBarrio;
	protected JButton jButtonCancelarToolBarBarrio;
    protected JButton jButtonGuardarCambiosToolBarBarrio;
	protected JButton jButtonGuardarCambiosTablaToolBarBarrio;
	protected JButton jButtonMostrarOcultarTablaToolBarBarrio;
	protected JButton jButtonCerrarToolBarBarrio;
	
	protected JButton jButtonProcesarInformacionToolBarBarrio;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoBarrio;
	protected JMenuItem jMenuItemModificarBarrio;
	protected JMenuItem jMenuItemActualizarBarrio;
    protected JMenuItem jMenuItemEliminarBarrio;
	protected JMenuItem jMenuItemCancelarBarrio;
    protected JMenuItem jMenuItemGuardarCambiosBarrio;
	protected JMenuItem jMenuItemGuardarCambiosTablaBarrio;
	protected JMenuItem jMenuItemCerrarBarrio;
	protected JMenuItem jMenuItemDetalleCerrarBarrio;
	protected JMenuItem jMenuItemDetalleMostarOcultarBarrio;
	
	protected JMenuItem jMenuItemProcesarInformacionBarrio;
	protected JMenuItem jMenuItemNuevoGuardarCambiosBarrio;
	protected JMenuItem jMenuItemMostrarOcultarBarrio;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesBarrio;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesBarrio;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesBarrio;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioBarrio;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidBarrio;
	public JLabel jLabelIdBarrio;
	public JLabel jLabelidBarrio;
	public JButton jButtonidBarrioBusqueda= new JButtonMe();

	public JPanel jPanelcodigoBarrio;
	public JLabel jLabelcodigoBarrio;
	public JTextField jTextFieldcodigoBarrio;
	public JButton jButtoncodigoBarrioBusqueda= new JButtonMe();

	public JPanel jPanelnombreBarrio;
	public JLabel jLabelnombreBarrio;
	public JTextArea jTextAreanombreBarrio;
	public JScrollPane jscrollPanenombreBarrio;
	public JButton jButtonnombreBarrioBusqueda= new JButtonMe();

	
	public JPanel jPanelid_provinciaBarrio;
	public JLabel jLabelid_provinciaBarrio;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_provinciaBarrio;
	public JButton jButtonid_provinciaBarrio= new JButtonMe();
	public JButton jButtonid_provinciaBarrioUpdate= new JButtonMe();
	public JButton jButtonid_provinciaBarrioBusqueda= new JButtonMe();

	public JPanel jPanelid_cantonBarrio;
	public JLabel jLabelid_cantonBarrio;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cantonBarrio;
	public JButton jButtonid_cantonBarrio= new JButtonMe();
	public JButton jButtonid_cantonBarrioUpdate= new JButtonMe();
	public JButton jButtonid_cantonBarrioBusqueda= new JButtonMe();

	public JPanel jPanelid_parroquiaBarrio;
	public JLabel jLabelid_parroquiaBarrio;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_parroquiaBarrio;
	public JButton jButtonid_parroquiaBarrio= new JButtonMe();
	public JButton jButtonid_parroquiaBarrioUpdate= new JButtonMe();
	public JButton jButtonid_parroquiaBarrioBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesBarrio;
	
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
	public int iHeightFormulario=550;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public BarrioDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposBarrio=new JPanel();
				this.jPanelAccionesFormularioBarrio=new JPanel();
				this.jmenuBarDetalleBarrio=new JMenuBar();
				this.jTtoolBarDetalleBarrio=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public BarrioDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Barrio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public BarrioDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Barrio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public BarrioDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Barrio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public BarrioDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Barrio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public BarrioDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Barrio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarBarrio() {
		return this.jButtonActualizarToolBarBarrio;
	}
	
	public JButton getjButtonEliminarToolBarBarrio() {
		return this.jButtonEliminarToolBarBarrio;
	}
	
	public JButton getjButtonCancelarToolBarBarrio() {
		return this.jButtonCancelarToolBarBarrio;
	}		
	
	public JButton getjButtonProcesarInformacionBarrio() {
		return this.jButtonProcesarInformacionBarrio;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionBarrio)	{
		this.jButtonProcesarInformacionBarrio = jButtonProcesarInformacionBarrio;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesBarrio() {
		return this.jComboBoxTiposAccionesBarrio;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesBarrio(
			JComboBox jComboBoxTiposRelacionesBarrio) {
		this.jComboBoxTiposRelacionesBarrio = jComboBoxTiposRelacionesBarrio;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesBarrio(
			JComboBox jComboBoxTiposAccionesBarrio) {
		this.jComboBoxTiposAccionesBarrio = jComboBoxTiposAccionesBarrio;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioBarrio() {
		return this.jComboBoxTiposAccionesFormularioBarrio;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioBarrio(
			JComboBox jComboBoxTiposAccionesFormularioBarrio) {
		this.jComboBoxTiposAccionesFormularioBarrio = jComboBoxTiposAccionesFormularioBarrio;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.barrioSessionBean=new BarrioSessionBean();
		
		this.barrioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.barrioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.barrioSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		BarrioJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		BarrioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		BarrioJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Barrio MANTENIMIENTO"));
		
		
		if(iWidth > 750) {
			iWidth=750;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.barrioSessionBean.getEsGuardarRelacionado()) {
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
	
		BarrioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleBarrio= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarBarrio=new JButtonMe();
				this.jButtonModificarToolBarBarrio=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarBarrio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarBarrio,this.jTtoolBarDetalleBarrio,
							"actualizar","actualizar","Actualizar"+" "+BarrioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarBarrio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarBarrio,this.jTtoolBarDetalleBarrio,
							"eliminar","eliminar","Eliminar"+" "+BarrioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarBarrio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarBarrio,this.jTtoolBarDetalleBarrio,
							"cancelar","cancelar","Cancelar"+" "+BarrioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarBarrio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarBarrio,this.jTtoolBarDetalleBarrio,
							"guardarcambios","guardarcambios","Guardar"+" "+BarrioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarBarrio,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarBarrio,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarBarrio,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleBarrio=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleBarrio=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoBarrio=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesBarrio=new JMenuMe("Acciones");
		this.jmenuDetalleDatosBarrio=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoBarrio= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoBarrio.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoBarrio,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoBarrio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarBarrio= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarBarrio.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarBarrio,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarBarrio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarBarrio= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarBarrio.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarBarrio,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarBarrio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarBarrio= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarBarrio.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarBarrio,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarBarrio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarBarrio= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarBarrio.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarBarrio,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarBarrio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosBarrio= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosBarrio.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosBarrio,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosBarrio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarBarrio= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarBarrio.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarBarrio,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarBarrio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarBarrio= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarBarrio.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarBarrio,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarBarrio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarBarrio= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarBarrio.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarBarrio,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarBarrio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarBarrio= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarBarrio.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarBarrio,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarBarrio, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoBarrio.add(this.jMenuItemDetalleCerrarBarrio);
		
		this.jmenuDetalleAccionesBarrio.add(this.jMenuItemActualizarBarrio);
		this.jmenuDetalleAccionesBarrio.add(this.jMenuItemEliminarBarrio);
		this.jmenuDetalleAccionesBarrio.add(this.jMenuItemCancelarBarrio);		
		
		//this.jmenuDetalleDatosBarrio.add(this.jMenuItemDetalleAbrirOrderByBarrio);				
		this.jmenuDetalleDatosBarrio.add(this.jMenuItemDetalleMostarOcultarBarrio);				
				
		//this.jmenuDetalleAccionesBarrio.add(this.jMenuItemGuardarCambiosBarrio);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoBarrio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesBarrio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosBarrio, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleBarrio.add(this.jmenuDetalleArchivoBarrio);		
		this.jmenuBarDetalleBarrio.add(this.jmenuDetalleAccionesBarrio);		
		this.jmenuBarDetalleBarrio.add(this.jmenuDetalleDatosBarrio);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleBarrio);				
	}
	
	
	public void inicializarElementosCamposBarrio() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdBarrio = new JLabelMe();
		jLabelIdBarrio.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdBarrio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdBarrio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdBarrio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdBarrio,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidBarrio = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidBarrio.setToolTipText(BarrioConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutBarrio= new GridBagLayout();

		this.jPanelidBarrio.setLayout(this.gridaBagLayoutBarrio);

		jLabelidBarrio = new JLabel();
		jLabelidBarrio.setText("Id");

		jLabelidBarrio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidBarrio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidBarrio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoBarrio = new JLabelMe();
		this.jLabelcodigoBarrio.setText(""+BarrioConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoBarrio.setToolTipText("Codigo");
		this.jLabelcodigoBarrio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoBarrio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoBarrio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoBarrio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoBarrio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoBarrio.setToolTipText(BarrioConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutBarrio = new GridBagLayout();
		this.jPanelcodigoBarrio.setLayout(this.gridaBagLayoutBarrio);


		jTextFieldcodigoBarrio= new JTextFieldMe();

		jTextFieldcodigoBarrio.setEnabled(false);
		jTextFieldcodigoBarrio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBarrio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoBarrio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoBarrio,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoBarrioBusqueda= new JButtonMe();
		this.jButtoncodigoBarrioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoBarrioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoBarrioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoBarrioBusqueda.setText("U");
		this.jButtoncodigoBarrioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoBarrioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoBarrioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoBarrio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoBarrio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoBarrioBusqueda"));

		if(this.barrioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoBarrioBusqueda.setVisible(false);		}


					
		this.jLabelnombreBarrio = new JLabelMe();
		this.jLabelnombreBarrio.setText(""+BarrioConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreBarrio.setToolTipText("Nombre");
		this.jLabelnombreBarrio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreBarrio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreBarrio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreBarrio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreBarrio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreBarrio.setToolTipText(BarrioConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutBarrio = new GridBagLayout();
		this.jPanelnombreBarrio.setLayout(this.gridaBagLayoutBarrio);


		jTextAreanombreBarrio= new JTextAreaMe();
		jTextAreanombreBarrio.setEnabled(false);
		jTextAreanombreBarrio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBarrio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBarrio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreBarrio.setLineWrap(true);
		jTextAreanombreBarrio.setWrapStyleWord(true);
		jTextAreanombreBarrio.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreBarrio.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreBarrio,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreBarrio = new JScrollPane(jTextAreanombreBarrio);
		jscrollPanenombreBarrio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreBarrio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreBarrio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreBarrioBusqueda= new JButtonMe();
		this.jButtonnombreBarrioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreBarrioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreBarrioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreBarrioBusqueda.setText("U");
		this.jButtonnombreBarrioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreBarrioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreBarrioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreBarrio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreBarrio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreBarrioBusqueda"));

		if(this.barrioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreBarrioBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysBarrio() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_provinciaBarrio = new JLabelMe();
		this.jLabelid_provinciaBarrio.setText(""+BarrioConstantesFunciones.LABEL_IDPROVINCIA+" : *");
		this.jLabelid_provinciaBarrio.setToolTipText("Provincia");
		this.jLabelid_provinciaBarrio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_provinciaBarrio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_provinciaBarrio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_provinciaBarrio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_provinciaBarrio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_provinciaBarrio.setToolTipText(BarrioConstantesFunciones.LABEL_IDPROVINCIA);
		this.gridaBagLayoutBarrio = new GridBagLayout();
		this.jPanelid_provinciaBarrio.setLayout(this.gridaBagLayoutBarrio);


		jComboBoxid_provinciaBarrio= new JComboBoxMe();
		jComboBoxid_provinciaBarrio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_provinciaBarrio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_provinciaBarrio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_provinciaBarrio,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_provinciaBarrio= new JButtonMe();
		this.jButtonid_provinciaBarrio.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_provinciaBarrio.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_provinciaBarrio.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_provinciaBarrio.setText("Buscar");
		this.jButtonid_provinciaBarrio.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_provinciaBarrio.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_provinciaBarrio,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_provinciaBarrio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_provinciaBarrio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_provinciaBarrio"));

		this.jButtonid_provinciaBarrioBusqueda= new JButtonMe();
		this.jButtonid_provinciaBarrioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_provinciaBarrioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_provinciaBarrioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_provinciaBarrioBusqueda.setText("U");
		this.jButtonid_provinciaBarrioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_provinciaBarrioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_provinciaBarrioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_provinciaBarrio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_provinciaBarrio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_provinciaBarrioBusqueda"));

		if(this.barrioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_provinciaBarrioBusqueda.setVisible(false);		}

		this.jButtonid_provinciaBarrioUpdate= new JButtonMe();
		this.jButtonid_provinciaBarrioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_provinciaBarrioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_provinciaBarrioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_provinciaBarrioUpdate.setText("U");
		this.jButtonid_provinciaBarrioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_provinciaBarrioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_provinciaBarrioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_provinciaBarrio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_provinciaBarrio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_provinciaBarrioUpdate"));



					
		this.jLabelid_cantonBarrio = new JLabelMe();
		this.jLabelid_cantonBarrio.setText(""+BarrioConstantesFunciones.LABEL_IDCANTON+" : *");
		this.jLabelid_cantonBarrio.setToolTipText("Canton");
		this.jLabelid_cantonBarrio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_cantonBarrio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_cantonBarrio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cantonBarrio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cantonBarrio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cantonBarrio.setToolTipText(BarrioConstantesFunciones.LABEL_IDCANTON);
		this.gridaBagLayoutBarrio = new GridBagLayout();
		this.jPanelid_cantonBarrio.setLayout(this.gridaBagLayoutBarrio);


		jComboBoxid_cantonBarrio= new JComboBoxMe();
		jComboBoxid_cantonBarrio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cantonBarrio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cantonBarrio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cantonBarrio,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cantonBarrio= new JButtonMe();
		this.jButtonid_cantonBarrio.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cantonBarrio.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cantonBarrio.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cantonBarrio.setText("Buscar");
		this.jButtonid_cantonBarrio.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cantonBarrio.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cantonBarrio,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cantonBarrio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cantonBarrio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cantonBarrio"));

		this.jButtonid_cantonBarrioBusqueda= new JButtonMe();
		this.jButtonid_cantonBarrioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cantonBarrioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cantonBarrioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cantonBarrioBusqueda.setText("U");
		this.jButtonid_cantonBarrioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cantonBarrioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cantonBarrioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cantonBarrio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cantonBarrio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cantonBarrioBusqueda"));

		if(this.barrioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cantonBarrioBusqueda.setVisible(false);		}

		this.jButtonid_cantonBarrioUpdate= new JButtonMe();
		this.jButtonid_cantonBarrioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cantonBarrioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cantonBarrioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cantonBarrioUpdate.setText("U");
		this.jButtonid_cantonBarrioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cantonBarrioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cantonBarrioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cantonBarrio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cantonBarrio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cantonBarrioUpdate"));



					
		this.jLabelid_parroquiaBarrio = new JLabelMe();
		this.jLabelid_parroquiaBarrio.setText(""+BarrioConstantesFunciones.LABEL_IDPARROQUIA+" : *");
		this.jLabelid_parroquiaBarrio.setToolTipText("Parroquia");
		this.jLabelid_parroquiaBarrio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_parroquiaBarrio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_parroquiaBarrio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-52),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_parroquiaBarrio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_parroquiaBarrio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_parroquiaBarrio.setToolTipText(BarrioConstantesFunciones.LABEL_IDPARROQUIA);
		this.gridaBagLayoutBarrio = new GridBagLayout();
		this.jPanelid_parroquiaBarrio.setLayout(this.gridaBagLayoutBarrio);


		jComboBoxid_parroquiaBarrio= new JComboBoxMe();
		jComboBoxid_parroquiaBarrio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_parroquiaBarrio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_parroquiaBarrio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_parroquiaBarrio,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_parroquiaBarrio= new JButtonMe();
		this.jButtonid_parroquiaBarrio.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_parroquiaBarrio.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_parroquiaBarrio.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_parroquiaBarrio.setText("Buscar");
		this.jButtonid_parroquiaBarrio.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_parroquiaBarrio.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_parroquiaBarrio,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_parroquiaBarrio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_parroquiaBarrio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_parroquiaBarrio"));

		this.jButtonid_parroquiaBarrioBusqueda= new JButtonMe();
		this.jButtonid_parroquiaBarrioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_parroquiaBarrioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_parroquiaBarrioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_parroquiaBarrioBusqueda.setText("U");
		this.jButtonid_parroquiaBarrioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_parroquiaBarrioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_parroquiaBarrioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_parroquiaBarrio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_parroquiaBarrio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_parroquiaBarrioBusqueda"));

		if(this.barrioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_parroquiaBarrioBusqueda.setVisible(false);		}

		this.jButtonid_parroquiaBarrioUpdate= new JButtonMe();
		this.jButtonid_parroquiaBarrioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_parroquiaBarrioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_parroquiaBarrioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_parroquiaBarrioUpdate.setText("U");
		this.jButtonid_parroquiaBarrioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_parroquiaBarrioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_parroquiaBarrioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_parroquiaBarrio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_parroquiaBarrio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_parroquiaBarrioUpdate"));



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
		//this.jInternalFrameDetalleBarrio = new BarrioBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Barrio DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutBarrio= new GridBagLayout();
		

		
		String sToolTipBarrio="";
		sToolTipBarrio=BarrioConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipBarrio+="(Nomina.Barrio)";
		}
		
		if(!this.barrioSessionBean.getEsGuardarRelacionado()) {
			sToolTipBarrio+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoBarrio = new JButtonMe();
		this.jButtonModificarBarrio = new JButtonMe();
        this.jButtonActualizarBarrio = new JButtonMe();
        this.jButtonEliminarBarrio = new JButtonMe();
        this.jButtonCancelarBarrio = new JButtonMe();
        this.jButtonGuardarCambiosBarrio = new JButtonMe();
		this.jButtonGuardarCambiosTablaBarrio = new JButtonMe();
		this.jButtonCerrarBarrio = new JButtonMe();
		
		this.jScrollPanelDatosBarrio = new JScrollPane();   
        this.jScrollPanelDatosEdicionBarrio = new JScrollPane();
		this.jScrollPanelDatosGeneralBarrio = new JScrollPane();
				
		
		
		this.jPanelCamposBarrio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosBarrio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesBarrio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioBarrio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Barrio";
		
		if(!this.barrioSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosBarrio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Barrios" + this.sPath));
		} else {
			this.jScrollPanelDatosBarrio.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionBarrio.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralBarrio.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposBarrio.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposBarrio.setName("jPanelCamposBarrio"); 

		this.jPanelCamposOcultosBarrio.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosBarrio.setName("jPanelCamposOcultosBarrio"); 

        this.jPanelAccionesBarrio.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesBarrio.setToolTipText("Acciones");
        this.jPanelAccionesBarrio.setName("Acciones"); 

		this.jPanelAccionesFormularioBarrio.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioBarrio.setToolTipText("Acciones");
        this.jPanelAccionesFormularioBarrio.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionBarrio, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralBarrio, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosBarrio, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposBarrio, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosBarrio, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioBarrio, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoBarrio.setText("Nuevo");
		this.jButtonModificarBarrio.setText("Editar");
        this.jButtonActualizarBarrio.setText("Actualizar");
        this.jButtonEliminarBarrio.setText("Eliminar");
        this.jButtonCancelarBarrio.setText("Cancelar");
        this.jButtonGuardarCambiosBarrio.setText("Guardar");
		this.jButtonGuardarCambiosTablaBarrio.setText("Guardar");
		this.jButtonCerrarBarrio.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoBarrio,"nuevo_button","Nuevo",this.barrioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarBarrio,"modificar_button","Editar",this.barrioSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarBarrio,"actualizar_button","Actualizar",this.barrioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarBarrio,"eliminar_button","Eliminar",this.barrioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarBarrio,"cancelar_button","Cancelar",this.barrioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosBarrio,"guardarcambios_button","Guardar",this.barrioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaBarrio,"guardarcambiostabla_button","Guardar",this.barrioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarBarrio,"cerrar_button","Salir",this.barrioSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoBarrio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarBarrio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosBarrio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaBarrio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarBarrio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarBarrio, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarBarrio, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarBarrio, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoBarrio.setToolTipText("Nuevo"+" "+BarrioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarBarrio.setToolTipText("Editar"+" "+BarrioConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarBarrio.setToolTipText("Actualizar"+" "+BarrioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarBarrio.setToolTipText("Eliminar)"+" "+BarrioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarBarrio.setToolTipText("Cancelar"+" "+BarrioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosBarrio.setToolTipText("Guardar"+" "+BarrioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaBarrio.setToolTipText("Guardar"+" "+BarrioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarBarrio.setToolTipText("Salir"+" "+BarrioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoBarrio";
		inputMap = this.jButtonNuevoBarrio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoBarrio.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoBarrio"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarBarrio";
		inputMap = this.jButtonActualizarBarrio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarBarrio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarBarrio"));
		
		//ELIMINAR
		sMapKey = "EliminarBarrio";
		inputMap = this.jButtonEliminarBarrio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarBarrio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarBarrio"));
		
		//CANCELAR	
		sMapKey = "CancelarBarrio";
		inputMap = this.jButtonCancelarBarrio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarBarrio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarBarrio"));
		
		//CERRAR		
		sMapKey = "CerrarBarrio";
		inputMap = this.jButtonCerrarBarrio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarBarrio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarBarrio"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaBarrio";
		inputMap = this.jButtonGuardarCambiosTablaBarrio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaBarrio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaBarrio"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoBarrio = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoBarrio.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoBarrio.setToolTipText("Nuevo Barrio");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoBarrio, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarBarrio = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarBarrio.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarBarrio.setToolTipText("Sin Cerrar Ventana Barrio");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarBarrio, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeBarrio = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeBarrio.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeBarrio.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeBarrio, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesBarrio = new JComboBoxMe();
		//this.jComboBoxTiposAccionesBarrio.setText("Accion");
		this.jComboBoxTiposAccionesBarrio.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioBarrio = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioBarrio.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioBarrio.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesBarrio = new JLabelMe();
		
		this.jLabelAccionesBarrio.setText("Acciones");		
		this.jLabelAccionesBarrio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesBarrio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesBarrio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposBarrio();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysBarrio();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesBarrio=new JTabbedPane();
		this.jTabbedPaneRelacionesBarrio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesBarrio,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesBarrio.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesBarrio.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesBarrio.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesBarrio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioBarrio.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioBarrio.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioBarrio.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioBarrio, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposBarrio = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosBarrio = new GridBagLayout();
		
		this.jPanelCamposBarrio.setLayout(gridaBagLayoutCamposBarrio);
		this.jPanelCamposOcultosBarrio.setLayout(gridaBagLayoutCamposOcultosBarrio);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsBarrio = new GridBagConstraints();
	this.gridBagConstraintsBarrio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBarrio.gridy = 0;
	this.gridBagConstraintsBarrio.gridx = 0;
	this.gridBagConstraintsBarrio.ipadx = 0;
	this.gridBagConstraintsBarrio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidBarrio.add(jLabelIdBarrio, this.gridBagConstraintsBarrio);



	this.gridBagConstraintsBarrio = new GridBagConstraints();
	this.gridBagConstraintsBarrio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBarrio.gridy = 0;
	this.gridBagConstraintsBarrio.gridx = 1;
	this.gridBagConstraintsBarrio.ipadx = 0;
	this.gridBagConstraintsBarrio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidBarrio.add(jLabelidBarrio, this.gridBagConstraintsBarrio);


	this.gridBagConstraintsBarrio = new GridBagConstraints();
	this.gridBagConstraintsBarrio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBarrio.gridy = 0;
	this.gridBagConstraintsBarrio.gridx = 0;
	this.gridBagConstraintsBarrio.ipadx = 0;
	this.gridBagConstraintsBarrio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_provinciaBarrio.add(jLabelid_provinciaBarrio, this.gridBagConstraintsBarrio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBarrio = new GridBagConstraints();
		//this.gridBagConstraintsBarrio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBarrio.gridy = 0;
		this.gridBagConstraintsBarrio.gridx = 2;
		this.gridBagConstraintsBarrio.ipadx = 0;
		this.gridBagConstraintsBarrio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_provinciaBarrio.add(jButtonid_provinciaBarrioBusqueda, this.gridBagConstraintsBarrio);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBarrio = new GridBagConstraints();
		//this.gridBagConstraintsBarrio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBarrio.gridy = 0;
		this.gridBagConstraintsBarrio.gridx = 3;
		this.gridBagConstraintsBarrio.ipadx = 0;
		this.gridBagConstraintsBarrio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_provinciaBarrio.add(jButtonid_provinciaBarrioUpdate, this.gridBagConstraintsBarrio);
	}

	this.gridBagConstraintsBarrio = new GridBagConstraints();
	this.gridBagConstraintsBarrio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBarrio.gridy = 0;
	this.gridBagConstraintsBarrio.gridx = 1;
	this.gridBagConstraintsBarrio.ipadx = 0;
	this.gridBagConstraintsBarrio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_provinciaBarrio.add(jComboBoxid_provinciaBarrio, this.gridBagConstraintsBarrio);


	this.gridBagConstraintsBarrio = new GridBagConstraints();
	this.gridBagConstraintsBarrio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBarrio.gridy = 0;
	this.gridBagConstraintsBarrio.gridx = 0;
	this.gridBagConstraintsBarrio.ipadx = 0;
	this.gridBagConstraintsBarrio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_cantonBarrio.add(jLabelid_cantonBarrio, this.gridBagConstraintsBarrio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBarrio = new GridBagConstraints();
		//this.gridBagConstraintsBarrio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBarrio.gridy = 0;
		this.gridBagConstraintsBarrio.gridx = 2;
		this.gridBagConstraintsBarrio.ipadx = 0;
		this.gridBagConstraintsBarrio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cantonBarrio.add(jButtonid_cantonBarrioBusqueda, this.gridBagConstraintsBarrio);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBarrio = new GridBagConstraints();
		//this.gridBagConstraintsBarrio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBarrio.gridy = 0;
		this.gridBagConstraintsBarrio.gridx = 3;
		this.gridBagConstraintsBarrio.ipadx = 0;
		this.gridBagConstraintsBarrio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cantonBarrio.add(jButtonid_cantonBarrioUpdate, this.gridBagConstraintsBarrio);
	}

	this.gridBagConstraintsBarrio = new GridBagConstraints();
	this.gridBagConstraintsBarrio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBarrio.gridy = 0;
	this.gridBagConstraintsBarrio.gridx = 1;
	this.gridBagConstraintsBarrio.ipadx = 0;
	this.gridBagConstraintsBarrio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_cantonBarrio.add(jComboBoxid_cantonBarrio, this.gridBagConstraintsBarrio);


	this.gridBagConstraintsBarrio = new GridBagConstraints();
	this.gridBagConstraintsBarrio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBarrio.gridy = 0;
	this.gridBagConstraintsBarrio.gridx = 0;
	this.gridBagConstraintsBarrio.ipadx = 0;
	this.gridBagConstraintsBarrio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_parroquiaBarrio.add(jLabelid_parroquiaBarrio, this.gridBagConstraintsBarrio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBarrio = new GridBagConstraints();
		//this.gridBagConstraintsBarrio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBarrio.gridy = 0;
		this.gridBagConstraintsBarrio.gridx = 2;
		this.gridBagConstraintsBarrio.ipadx = 0;
		this.gridBagConstraintsBarrio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_parroquiaBarrio.add(jButtonid_parroquiaBarrioBusqueda, this.gridBagConstraintsBarrio);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBarrio = new GridBagConstraints();
		//this.gridBagConstraintsBarrio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBarrio.gridy = 0;
		this.gridBagConstraintsBarrio.gridx = 3;
		this.gridBagConstraintsBarrio.ipadx = 0;
		this.gridBagConstraintsBarrio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_parroquiaBarrio.add(jButtonid_parroquiaBarrioUpdate, this.gridBagConstraintsBarrio);
	}

	this.gridBagConstraintsBarrio = new GridBagConstraints();
	this.gridBagConstraintsBarrio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBarrio.gridy = 0;
	this.gridBagConstraintsBarrio.gridx = 1;
	this.gridBagConstraintsBarrio.ipadx = 0;
	this.gridBagConstraintsBarrio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_parroquiaBarrio.add(jComboBoxid_parroquiaBarrio, this.gridBagConstraintsBarrio);


	this.gridBagConstraintsBarrio = new GridBagConstraints();
	this.gridBagConstraintsBarrio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBarrio.gridy = 0;
	this.gridBagConstraintsBarrio.gridx = 0;
	this.gridBagConstraintsBarrio.ipadx = 0;
	this.gridBagConstraintsBarrio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoBarrio.add(jLabelcodigoBarrio, this.gridBagConstraintsBarrio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBarrio = new GridBagConstraints();
		//this.gridBagConstraintsBarrio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBarrio.gridy = 0;
		this.gridBagConstraintsBarrio.gridx = 2;
		this.gridBagConstraintsBarrio.ipadx = 0;
		this.gridBagConstraintsBarrio.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoBarrio.add(jButtoncodigoBarrioBusqueda, this.gridBagConstraintsBarrio);
	}

	this.gridBagConstraintsBarrio = new GridBagConstraints();
	this.gridBagConstraintsBarrio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBarrio.gridy = 0;
	this.gridBagConstraintsBarrio.gridx = 1;
	this.gridBagConstraintsBarrio.ipadx = 0;
	this.gridBagConstraintsBarrio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoBarrio.add(jTextFieldcodigoBarrio, this.gridBagConstraintsBarrio);


	this.gridBagConstraintsBarrio = new GridBagConstraints();
	this.gridBagConstraintsBarrio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBarrio.gridy = 0;
	this.gridBagConstraintsBarrio.gridx = 0;
	this.gridBagConstraintsBarrio.ipadx = 0;
	this.gridBagConstraintsBarrio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreBarrio.add(jLabelnombreBarrio, this.gridBagConstraintsBarrio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsBarrio = new GridBagConstraints();
		//this.gridBagConstraintsBarrio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsBarrio.gridy = 0;
		this.gridBagConstraintsBarrio.gridx = 2;
		this.gridBagConstraintsBarrio.ipadx = 0;
		this.gridBagConstraintsBarrio.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreBarrio.add(jButtonnombreBarrioBusqueda, this.gridBagConstraintsBarrio);
	}

	this.gridBagConstraintsBarrio = new GridBagConstraints();
	this.gridBagConstraintsBarrio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsBarrio.gridy = 0;
	this.gridBagConstraintsBarrio.gridx = 1;
	this.gridBagConstraintsBarrio.ipadx = 0;
	this.gridBagConstraintsBarrio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreBarrio.add(jscrollPanenombreBarrio, this.gridBagConstraintsBarrio);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsBarrio = new GridBagConstraints();
	this.gridBagConstraintsBarrio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBarrio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBarrio.gridy = iYPanelCamposBarrio;
	this.gridBagConstraintsBarrio.gridx = iXPanelCamposBarrio++;
	this.gridBagConstraintsBarrio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBarrio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBarrio.add(this.jPanelidBarrio, this.gridBagConstraintsBarrio);



	if(iXPanelCamposBarrio % 1==0) {
		iXPanelCamposBarrio=0;
		iYPanelCamposBarrio++;
	}
	this.gridBagConstraintsBarrio = new GridBagConstraints();
	this.gridBagConstraintsBarrio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBarrio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBarrio.gridy = iYPanelCamposBarrio;
	this.gridBagConstraintsBarrio.gridx = iXPanelCamposBarrio++;
	this.gridBagConstraintsBarrio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBarrio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBarrio.add(this.jPanelid_provinciaBarrio, this.gridBagConstraintsBarrio);



	if(iXPanelCamposBarrio % 1==0) {
		iXPanelCamposBarrio=0;
		iYPanelCamposBarrio++;
	}
	this.gridBagConstraintsBarrio = new GridBagConstraints();
	this.gridBagConstraintsBarrio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBarrio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBarrio.gridy = iYPanelCamposBarrio;
	this.gridBagConstraintsBarrio.gridx = iXPanelCamposBarrio++;
	this.gridBagConstraintsBarrio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBarrio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBarrio.add(this.jPanelid_cantonBarrio, this.gridBagConstraintsBarrio);



	if(iXPanelCamposBarrio % 1==0) {
		iXPanelCamposBarrio=0;
		iYPanelCamposBarrio++;
	}
	this.gridBagConstraintsBarrio = new GridBagConstraints();
	this.gridBagConstraintsBarrio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBarrio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBarrio.gridy = iYPanelCamposBarrio;
	this.gridBagConstraintsBarrio.gridx = iXPanelCamposBarrio++;
	this.gridBagConstraintsBarrio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBarrio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBarrio.add(this.jPanelid_parroquiaBarrio, this.gridBagConstraintsBarrio);



	if(iXPanelCamposBarrio % 1==0) {
		iXPanelCamposBarrio=0;
		iYPanelCamposBarrio++;
	}
	this.gridBagConstraintsBarrio = new GridBagConstraints();
	this.gridBagConstraintsBarrio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBarrio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBarrio.gridy = iYPanelCamposBarrio;
	this.gridBagConstraintsBarrio.gridx = iXPanelCamposBarrio++;
	this.gridBagConstraintsBarrio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBarrio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBarrio.add(this.jPanelcodigoBarrio, this.gridBagConstraintsBarrio);



	if(iXPanelCamposBarrio % 1==0) {
		iXPanelCamposBarrio=0;
		iYPanelCamposBarrio++;
	}
	this.gridBagConstraintsBarrio = new GridBagConstraints();
	this.gridBagConstraintsBarrio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsBarrio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsBarrio.gridy = iYPanelCamposBarrio;
	this.gridBagConstraintsBarrio.gridx = iXPanelCamposBarrio++;
	this.gridBagConstraintsBarrio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsBarrio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposBarrio.add(this.jPanelnombreBarrio, this.gridBagConstraintsBarrio);



	if(iXPanelCamposBarrio % 1==0) {
		iXPanelCamposBarrio=0;
		iYPanelCamposBarrio++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
		
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
			
		GridBagLayout gridaBagLayoutAccionesBarrio= new GridBagLayout();
		this.jPanelAccionesBarrio.setLayout(gridaBagLayoutAccionesBarrio);
		
		GridBagLayout gridaBagLayoutAccionesFormularioBarrio= new GridBagLayout();
		this.jPanelAccionesFormularioBarrio.setLayout(gridaBagLayoutAccionesFormularioBarrio);
		
		this.gridBagConstraintsBarrio = new GridBagConstraints();
		this.gridBagConstraintsBarrio.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsBarrio.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioBarrio.add(this.jComboBoxTiposAccionesFormularioBarrio, this.gridBagConstraintsBarrio);

		this.gridBagConstraintsBarrio = new GridBagConstraints();
		this.gridBagConstraintsBarrio.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsBarrio.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioBarrio.add(this.jCheckBoxPostAccionNuevoBarrio, this.gridBagConstraintsBarrio);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.barrioSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsBarrio = new GridBagConstraints();
			this.gridBagConstraintsBarrio.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsBarrio.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioBarrio.add(this.jCheckBoxPostAccionSinCerrarBarrio, this.gridBagConstraintsBarrio);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.barrioSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.barrioSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsBarrio = new GridBagConstraints();
			this.gridBagConstraintsBarrio.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsBarrio.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioBarrio.add(this.jCheckBoxPostAccionSinMensajeBarrio, this.gridBagConstraintsBarrio);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsBarrio = new GridBagConstraints();
		this.gridBagConstraintsBarrio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBarrio.gridy = 0;
		this.gridBagConstraintsBarrio.gridx = iPosXAccion++;
			
		this.jPanelAccionesBarrio.add(this.jButtonModificarBarrio, this.gridBagConstraintsBarrio);							

		this.gridBagConstraintsBarrio = new GridBagConstraints();
		this.gridBagConstraintsBarrio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsBarrio.gridy = 0;
		this.gridBagConstraintsBarrio.gridx =iPosXAccion++;
			
		this.jPanelAccionesBarrio.add(this.jButtonEliminarBarrio, this.gridBagConstraintsBarrio);
		
			
		this.gridBagConstraintsBarrio = new GridBagConstraints();
		this.gridBagConstraintsBarrio.gridy = 0;		
		this.gridBagConstraintsBarrio.gridx = iPosXAccion++;
		
		this.jPanelAccionesBarrio.add(this.jButtonActualizarBarrio, this.gridBagConstraintsBarrio);


		this.gridBagConstraintsBarrio = new GridBagConstraints();
		this.gridBagConstraintsBarrio.gridy = 0;		
		this.gridBagConstraintsBarrio.gridx = iPosXAccion++;
		
		this.jPanelAccionesBarrio.add(this.jButtonGuardarCambiosBarrio, this.gridBagConstraintsBarrio);	
		
		this.gridBagConstraintsBarrio = new GridBagConstraints();
		this.gridBagConstraintsBarrio.gridy = 0;		
		this.gridBagConstraintsBarrio.gridx =iPosXAccion++;
		
		this.jPanelAccionesBarrio.add(this.jButtonCancelarBarrio, this.gridBagConstraintsBarrio);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutBarrio = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutBarrio);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.barrioSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsBarrio = new GridBagConstraints();						
			this.gridBagConstraintsBarrio.gridy = iGridyPrincipal++;
			this.gridBagConstraintsBarrio.gridx = 0;		
			//this.gridBagConstraintsBarrio.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsBarrio.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsBarrio.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsBarrio = new GridBagConstraints();
		this.gridBagConstraintsBarrio.gridy =iGridyPrincipal++;
		this.gridBagConstraintsBarrio.gridx =0;
		this.gridBagConstraintsBarrio.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsBarrio.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosBarrio, this.gridBagConstraintsBarrio);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(BarrioJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleBarrio = new BarrioBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Barrio DATOS");
			
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
			
	        //this.setTitle("[FOR] - Barrio DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Barrio Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			BarrioModel barrioModel=new BarrioModel(this);
			
			//SI USARA CLASE INTERNA
			//BarrioModel.BarrioFocusTraversalPolicy barrioFocusTraversalPolicy = barrioModel.new BarrioFocusTraversalPolicy(this);
			
			//barrioFocusTraversalPolicy.setbarrioJInternalFrame(this);
			
			this.setFocusTraversalPolicy(barrioModel);
			
			
			this.jContentPaneDetalleBarrio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleBarrio = new GridBagLayout();	
			this.jContentPaneDetalleBarrio.setLayout(gridaBagLayoutDetalleBarrio);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosBarrio = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsBarrio = new GridBagConstraints();
				this.gridBagConstraintsBarrio.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsBarrio.gridx = 0;
					
				
				this.jContentPaneDetalleBarrio.add(jTtoolBarDetalleBarrio, gridBagConstraintsBarrio);								
				
}
			
			this.jScrollPanelDatosEdicionBarrio=   new JScrollPane(jContentPaneDetalleBarrio,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionBarrio.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionBarrio.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionBarrio.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralBarrio=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralBarrio.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralBarrio.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralBarrio.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsBarrio = new GridBagConstraints();
			
			
	        this.gridBagConstraintsBarrio.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsBarrio.gridx = 0;
	        
			this.jContentPaneDetalleBarrio.add(jPanelCamposBarrio, gridBagConstraintsBarrio);
			
			
			
			
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
						&& barrioSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.barrioSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsBarrio= new GridBagConstraints();
						this.gridBagConstraintsBarrio.gridy = iGridyRelaciones++;
						this.gridBagConstraintsBarrio.gridx = 0;
						this.jContentPaneDetalleBarrio.add(this.jTabbedPaneRelacionesBarrio, this.gridBagConstraintsBarrio);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesBarrio.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosBarrio.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsBarrio = new GridBagConstraints();
					this.gridBagConstraintsBarrio.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsBarrio.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsBarrio.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsBarrio.gridx = 0;
					
				
					this.jContentPaneDetalleBarrio.add(jPanelCamposOcultosBarrio, gridBagConstraintsBarrio);
				
					this.jPanelCamposOcultosBarrio.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsBarrio = new GridBagConstraints();
			this.gridBagConstraintsBarrio.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsBarrio.gridx = 0;
	        this.gridBagConstraintsBarrio.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleBarrio.add(this.jPanelAccionesFormularioBarrio, this.gridBagConstraintsBarrio);							
			
			
			
			this.gridBagConstraintsBarrio = new GridBagConstraints();
	        this.gridBagConstraintsBarrio.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsBarrio.gridx = 0;
	        
			
			this.jContentPaneDetalleBarrio.add(this.jPanelAccionesBarrio, this.gridBagConstraintsBarrio);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionBarrio);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionBarrio=   new JScrollPane(this.jPanelCamposBarrio,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionBarrio.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionBarrio.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionBarrio.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsBarrio = new GridBagConstraints();
			this.gridBagConstraintsBarrio.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsBarrio.gridx = 0;
			this.gridBagConstraintsBarrio.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsBarrio.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsBarrio.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionBarrio, this.gridBagConstraintsBarrio);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsBarrio = new GridBagConstraints();
			this.gridBagConstraintsBarrio.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsBarrio.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioBarrio, this.gridBagConstraintsBarrio);			
			
			this.gridBagConstraintsBarrio = new GridBagConstraints();
			this.gridBagConstraintsBarrio.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsBarrio.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesBarrio, this.gridBagConstraintsBarrio);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsBarrio = new GridBagConstraints();
		this.gridBagConstraintsBarrio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsBarrio.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposBarrio, this.gridBagConstraintsBarrio);
			
			
		this.gridBagConstraintsBarrio = new GridBagConstraints();
		this.gridBagConstraintsBarrio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsBarrio.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosBarrio, this.gridBagConstraintsBarrio);
		
			
		this.gridBagConstraintsBarrio = new GridBagConstraints();
		this.gridBagConstraintsBarrio.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsBarrio.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesBarrio, this.gridBagConstraintsBarrio);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralBarrio;//jContentPane;
		
		return jScrollPanelDatosEdicionBarrio;
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
