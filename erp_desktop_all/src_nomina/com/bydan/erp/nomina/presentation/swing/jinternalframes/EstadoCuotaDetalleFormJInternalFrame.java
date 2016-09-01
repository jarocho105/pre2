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



import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;



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
import com.bydan.erp.nomina.util.EstadoCuotaConstantesFunciones;

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
public class EstadoCuotaDetalleFormJInternalFrame extends EstadoCuotaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleEstadoCuota;
	
	protected JMenuBar jmenuBarDetalleEstadoCuota;
	
	protected JMenu jmenuDetalleEstadoCuota;
	protected JMenu jmenuDetalleArchivoEstadoCuota;
	protected JMenu jmenuDetalleAccionesEstadoCuota;
	protected JMenu jmenuDetalleDatosEstadoCuota;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleEstadoCuota = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEstadoCuota;	
	protected GridBagConstraints gridBagConstraintsEstadoCuota;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected EstadoCuotaBeanSwingJInternalFrameAdditional jInternalFrameDetalleEstadoCuota;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public EstadoCuotaSessionBean estadocuotaSessionBean;
	
	

	public CuotaBeanSwingJInternalFrame cuotaBeanSwingJInternalFrame=null;
	public CuotaBeanSwingJInternalFrame cuotaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteCuota=false;
	public CuotaSessionBean cuotaSessionBean;
	
		
	
	public EstadoCuotaLogic estadocuotaLogic;
	
	public JScrollPane jScrollPanelDatosEstadoCuota;
	public JScrollPane jScrollPanelDatosEdicionEstadoCuota;
	public JScrollPane jScrollPanelDatosGeneralEstadoCuota;
	
	protected JPanel jPanelCamposEstadoCuota;    
	protected JPanel jPanelCamposOcultosEstadoCuota;    	
	protected JPanel jPanelAccionesEstadoCuota;
	protected JPanel jPanelAccionesFormularioEstadoCuota;
    
	
	
	protected Integer iXPanelCamposEstadoCuota=0;
	protected Integer iYPanelCamposEstadoCuota=0;
	
	protected Integer iXPanelCamposOcultosEstadoCuota=0;
	protected Integer iYPanelCamposOcultosEstadoCuota=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoEstadoCuota;
	public JButton jButtonModificarEstadoCuota;
	public JButton jButtonActualizarEstadoCuota;
    public JButton jButtonEliminarEstadoCuota;
	public JButton jButtonCancelarEstadoCuota;
    public JButton jButtonGuardarCambiosEstadoCuota;
	public JButton jButtonGuardarCambiosTablaEstadoCuota;
	protected JButton jButtonCerrarEstadoCuota;
	
	
	protected JButton jButtonProcesarInformacionEstadoCuota;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoEstadoCuota;
	protected JCheckBox jCheckBoxPostAccionSinCerrarEstadoCuota;
	protected JCheckBox jCheckBoxPostAccionSinMensajeEstadoCuota;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEstadoCuota;
	protected JButton jButtonModificarToolBarEstadoCuota;
	protected JButton jButtonActualizarToolBarEstadoCuota;
    protected JButton jButtonEliminarToolBarEstadoCuota;
	protected JButton jButtonCancelarToolBarEstadoCuota;
    protected JButton jButtonGuardarCambiosToolBarEstadoCuota;
	protected JButton jButtonGuardarCambiosTablaToolBarEstadoCuota;
	protected JButton jButtonMostrarOcultarTablaToolBarEstadoCuota;
	protected JButton jButtonCerrarToolBarEstadoCuota;
	
	protected JButton jButtonProcesarInformacionToolBarEstadoCuota;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEstadoCuota;
	protected JMenuItem jMenuItemModificarEstadoCuota;
	protected JMenuItem jMenuItemActualizarEstadoCuota;
    protected JMenuItem jMenuItemEliminarEstadoCuota;
	protected JMenuItem jMenuItemCancelarEstadoCuota;
    protected JMenuItem jMenuItemGuardarCambiosEstadoCuota;
	protected JMenuItem jMenuItemGuardarCambiosTablaEstadoCuota;
	protected JMenuItem jMenuItemCerrarEstadoCuota;
	protected JMenuItem jMenuItemDetalleCerrarEstadoCuota;
	protected JMenuItem jMenuItemDetalleMostarOcultarEstadoCuota;
	
	protected JMenuItem jMenuItemProcesarInformacionEstadoCuota;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEstadoCuota;
	protected JMenuItem jMenuItemMostrarOcultarEstadoCuota;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEstadoCuota;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEstadoCuota;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEstadoCuota;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioEstadoCuota;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidEstadoCuota;
	public JLabel jLabelIdEstadoCuota;
	public JTextFieldMe jTextFieldidEstadoCuota;
	public JButton jButtonidEstadoCuotaBusqueda= new JButtonMe();

	public JPanel jPanelcodigoEstadoCuota;
	public JLabel jLabelcodigoEstadoCuota;
	public JTextField jTextFieldcodigoEstadoCuota;
	public JButton jButtoncodigoEstadoCuotaBusqueda= new JButtonMe();

	public JPanel jPanelnombreEstadoCuota;
	public JLabel jLabelnombreEstadoCuota;
	public JTextArea jTextAreanombreEstadoCuota;
	public JScrollPane jscrollPanenombreEstadoCuota;
	public JButton jButtonnombreEstadoCuotaBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesEstadoCuota;
	
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
	
	public EstadoCuotaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposEstadoCuota=new JPanel();
				this.jPanelAccionesFormularioEstadoCuota=new JPanel();
				this.jmenuBarDetalleEstadoCuota=new JMenuBar();
				this.jTtoolBarDetalleEstadoCuota=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoCuotaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("EstadoCuota No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public EstadoCuotaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("EstadoCuota No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoCuotaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoCuota No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoCuotaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoCuota No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoCuotaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EstadoCuota No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarEstadoCuota() {
		return this.jButtonActualizarToolBarEstadoCuota;
	}
	
	public JButton getjButtonEliminarToolBarEstadoCuota() {
		return this.jButtonEliminarToolBarEstadoCuota;
	}
	
	public JButton getjButtonCancelarToolBarEstadoCuota() {
		return this.jButtonCancelarToolBarEstadoCuota;
	}		
	
	public JButton getjButtonProcesarInformacionEstadoCuota() {
		return this.jButtonProcesarInformacionEstadoCuota;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEstadoCuota)	{
		this.jButtonProcesarInformacionEstadoCuota = jButtonProcesarInformacionEstadoCuota;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEstadoCuota() {
		return this.jComboBoxTiposAccionesEstadoCuota;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEstadoCuota(
			JComboBox jComboBoxTiposRelacionesEstadoCuota) {
		this.jComboBoxTiposRelacionesEstadoCuota = jComboBoxTiposRelacionesEstadoCuota;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEstadoCuota(
			JComboBox jComboBoxTiposAccionesEstadoCuota) {
		this.jComboBoxTiposAccionesEstadoCuota = jComboBoxTiposAccionesEstadoCuota;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioEstadoCuota() {
		return this.jComboBoxTiposAccionesFormularioEstadoCuota;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioEstadoCuota(
			JComboBox jComboBoxTiposAccionesFormularioEstadoCuota) {
		this.jComboBoxTiposAccionesFormularioEstadoCuota = jComboBoxTiposAccionesFormularioEstadoCuota;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.estadocuotaSessionBean=new EstadoCuotaSessionBean();
		
		this.estadocuotaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadocuotaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.estadocuotaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.cuotaSessionBean=new CuotaSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EstadoCuotaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EstadoCuotaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EstadoCuotaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estado Cuota MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.estadocuotaSessionBean.getEsGuardarRelacionado()) {
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
	
		EstadoCuotaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleEstadoCuota= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarEstadoCuota=new JButtonMe();
				this.jButtonModificarToolBarEstadoCuota=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarEstadoCuota=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarEstadoCuota,this.jTtoolBarDetalleEstadoCuota,
							"actualizar","actualizar","Actualizar"+" "+EstadoCuotaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarEstadoCuota=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarEstadoCuota,this.jTtoolBarDetalleEstadoCuota,
							"eliminar","eliminar","Eliminar"+" "+EstadoCuotaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarEstadoCuota=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarEstadoCuota,this.jTtoolBarDetalleEstadoCuota,
							"cancelar","cancelar","Cancelar"+" "+EstadoCuotaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarEstadoCuota=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarEstadoCuota,this.jTtoolBarDetalleEstadoCuota,
							"guardarcambios","guardarcambios","Guardar"+" "+EstadoCuotaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarEstadoCuota,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarEstadoCuota,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarEstadoCuota,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleEstadoCuota=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleEstadoCuota=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoEstadoCuota=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesEstadoCuota=new JMenuMe("Acciones");
		this.jmenuDetalleDatosEstadoCuota=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEstadoCuota= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEstadoCuota.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEstadoCuota,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEstadoCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarEstadoCuota= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarEstadoCuota.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarEstadoCuota,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarEstadoCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarEstadoCuota= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarEstadoCuota.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarEstadoCuota,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarEstadoCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarEstadoCuota= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarEstadoCuota.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarEstadoCuota,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarEstadoCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarEstadoCuota= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarEstadoCuota.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarEstadoCuota,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarEstadoCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosEstadoCuota= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEstadoCuota.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEstadoCuota,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEstadoCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEstadoCuota= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEstadoCuota.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEstadoCuota,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEstadoCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarEstadoCuota= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarEstadoCuota.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarEstadoCuota,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarEstadoCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEstadoCuota= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEstadoCuota.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEstadoCuota,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEstadoCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEstadoCuota= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEstadoCuota.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEstadoCuota,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEstadoCuota, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoEstadoCuota.add(this.jMenuItemDetalleCerrarEstadoCuota);
		
		this.jmenuDetalleAccionesEstadoCuota.add(this.jMenuItemActualizarEstadoCuota);
		this.jmenuDetalleAccionesEstadoCuota.add(this.jMenuItemEliminarEstadoCuota);
		this.jmenuDetalleAccionesEstadoCuota.add(this.jMenuItemCancelarEstadoCuota);		
		
		//this.jmenuDetalleDatosEstadoCuota.add(this.jMenuItemDetalleAbrirOrderByEstadoCuota);				
		this.jmenuDetalleDatosEstadoCuota.add(this.jMenuItemDetalleMostarOcultarEstadoCuota);				
				
		//this.jmenuDetalleAccionesEstadoCuota.add(this.jMenuItemGuardarCambiosEstadoCuota);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoEstadoCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesEstadoCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosEstadoCuota, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleEstadoCuota.add(this.jmenuDetalleArchivoEstadoCuota);		
		this.jmenuBarDetalleEstadoCuota.add(this.jmenuDetalleAccionesEstadoCuota);		
		this.jmenuBarDetalleEstadoCuota.add(this.jmenuDetalleDatosEstadoCuota);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleEstadoCuota, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleEstadoCuota.add(this.jmenuDetalleEstadoCuota);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleEstadoCuota);				
	}
	
	
	public void inicializarElementosCamposEstadoCuota() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdEstadoCuota = new JLabelMe();
		jLabelIdEstadoCuota.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdEstadoCuota.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEstadoCuota.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEstadoCuota.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdEstadoCuota,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidEstadoCuota = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidEstadoCuota.setToolTipText(EstadoCuotaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutEstadoCuota= new GridBagLayout();

		this.jPanelidEstadoCuota.setLayout(this.gridaBagLayoutEstadoCuota);

		jTextFieldidEstadoCuota = new JTextFieldMe();
		jTextFieldidEstadoCuota.setText("Id");

		jTextFieldidEstadoCuota.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidEstadoCuota.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidEstadoCuota.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoEstadoCuota = new JLabelMe();
		this.jLabelcodigoEstadoCuota.setText(""+EstadoCuotaConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoEstadoCuota.setToolTipText("Codigo");
		this.jLabelcodigoEstadoCuota.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoEstadoCuota.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoEstadoCuota.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoEstadoCuota,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoEstadoCuota=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoEstadoCuota.setToolTipText(EstadoCuotaConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutEstadoCuota = new GridBagLayout();
		this.jPanelcodigoEstadoCuota.setLayout(this.gridaBagLayoutEstadoCuota);


		jTextFieldcodigoEstadoCuota= new JTextFieldMe();

		jTextFieldcodigoEstadoCuota.setEnabled(false);
		jTextFieldcodigoEstadoCuota.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoEstadoCuota.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoEstadoCuota.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoEstadoCuota,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoEstadoCuotaBusqueda= new JButtonMe();
		this.jButtoncodigoEstadoCuotaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoEstadoCuotaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoEstadoCuotaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoEstadoCuotaBusqueda.setText("U");
		this.jButtoncodigoEstadoCuotaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoEstadoCuotaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoEstadoCuotaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoEstadoCuota.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoEstadoCuota.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoEstadoCuotaBusqueda"));

		if(this.estadocuotaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoEstadoCuotaBusqueda.setVisible(false);		}


					
		this.jLabelnombreEstadoCuota = new JLabelMe();
		this.jLabelnombreEstadoCuota.setText(""+EstadoCuotaConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreEstadoCuota.setToolTipText("Nombre");
		this.jLabelnombreEstadoCuota.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEstadoCuota.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEstadoCuota.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreEstadoCuota,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreEstadoCuota=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreEstadoCuota.setToolTipText(EstadoCuotaConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutEstadoCuota = new GridBagLayout();
		this.jPanelnombreEstadoCuota.setLayout(this.gridaBagLayoutEstadoCuota);


		jTextAreanombreEstadoCuota= new JTextAreaMe();
		jTextAreanombreEstadoCuota.setEnabled(false);
		jTextAreanombreEstadoCuota.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoCuota.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoCuota.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoCuota.setLineWrap(true);
		jTextAreanombreEstadoCuota.setWrapStyleWord(true);
		jTextAreanombreEstadoCuota.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreEstadoCuota.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreEstadoCuota,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreEstadoCuota = new JScrollPane(jTextAreanombreEstadoCuota);
		jscrollPanenombreEstadoCuota.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreEstadoCuota.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreEstadoCuota.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreEstadoCuotaBusqueda= new JButtonMe();
		this.jButtonnombreEstadoCuotaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEstadoCuotaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEstadoCuotaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreEstadoCuotaBusqueda.setText("U");
		this.jButtonnombreEstadoCuotaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreEstadoCuotaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreEstadoCuotaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreEstadoCuota.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreEstadoCuota.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreEstadoCuotaBusqueda"));

		if(this.estadocuotaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreEstadoCuotaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysEstadoCuota() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
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
		//this.jInternalFrameDetalleEstadoCuota = new EstadoCuotaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Estado Cuota DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEstadoCuota= new GridBagLayout();
		

		
		String sToolTipEstadoCuota="";
		sToolTipEstadoCuota=EstadoCuotaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEstadoCuota+="(Nomina.EstadoCuota)";
		}
		
		if(!this.estadocuotaSessionBean.getEsGuardarRelacionado()) {
			sToolTipEstadoCuota+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoEstadoCuota = new JButtonMe();
		this.jButtonModificarEstadoCuota = new JButtonMe();
        this.jButtonActualizarEstadoCuota = new JButtonMe();
        this.jButtonEliminarEstadoCuota = new JButtonMe();
        this.jButtonCancelarEstadoCuota = new JButtonMe();
        this.jButtonGuardarCambiosEstadoCuota = new JButtonMe();
		this.jButtonGuardarCambiosTablaEstadoCuota = new JButtonMe();
		this.jButtonCerrarEstadoCuota = new JButtonMe();
		
		this.jScrollPanelDatosEstadoCuota = new JScrollPane();   
        this.jScrollPanelDatosEdicionEstadoCuota = new JScrollPane();
		this.jScrollPanelDatosGeneralEstadoCuota = new JScrollPane();
				
		
		
		this.jPanelCamposEstadoCuota = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosEstadoCuota = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesEstadoCuota = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioEstadoCuota = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Estado Cuota";
		
		if(!this.estadocuotaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEstadoCuota.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Cuotas" + this.sPath));
		} else {
			this.jScrollPanelDatosEstadoCuota.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionEstadoCuota.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralEstadoCuota.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposEstadoCuota.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposEstadoCuota.setName("jPanelCamposEstadoCuota"); 

		this.jPanelCamposOcultosEstadoCuota.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosEstadoCuota.setName("jPanelCamposOcultosEstadoCuota"); 

        this.jPanelAccionesEstadoCuota.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEstadoCuota.setToolTipText("Acciones");
        this.jPanelAccionesEstadoCuota.setName("Acciones"); 

		this.jPanelAccionesFormularioEstadoCuota.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioEstadoCuota.setToolTipText("Acciones");
        this.jPanelAccionesFormularioEstadoCuota.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionEstadoCuota, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEstadoCuota, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEstadoCuota, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposEstadoCuota, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosEstadoCuota, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioEstadoCuota, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoEstadoCuota.setText("Nuevo");
		this.jButtonModificarEstadoCuota.setText("Editar");
        this.jButtonActualizarEstadoCuota.setText("Actualizar");
        this.jButtonEliminarEstadoCuota.setText("Eliminar");
        this.jButtonCancelarEstadoCuota.setText("Cancelar");
        this.jButtonGuardarCambiosEstadoCuota.setText("Guardar");
		this.jButtonGuardarCambiosTablaEstadoCuota.setText("Guardar");
		this.jButtonCerrarEstadoCuota.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEstadoCuota,"nuevo_button","Nuevo",this.estadocuotaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarEstadoCuota,"modificar_button","Editar",this.estadocuotaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarEstadoCuota,"actualizar_button","Actualizar",this.estadocuotaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarEstadoCuota,"eliminar_button","Eliminar",this.estadocuotaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarEstadoCuota,"cancelar_button","Cancelar",this.estadocuotaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosEstadoCuota,"guardarcambios_button","Guardar",this.estadocuotaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEstadoCuota,"guardarcambiostabla_button","Guardar",this.estadocuotaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEstadoCuota,"cerrar_button","Salir",this.estadocuotaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEstadoCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarEstadoCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosEstadoCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEstadoCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEstadoCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarEstadoCuota, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarEstadoCuota, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarEstadoCuota, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoEstadoCuota.setToolTipText("Nuevo"+" "+EstadoCuotaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarEstadoCuota.setToolTipText("Editar"+" "+EstadoCuotaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarEstadoCuota.setToolTipText("Actualizar"+" "+EstadoCuotaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarEstadoCuota.setToolTipText("Eliminar)"+" "+EstadoCuotaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarEstadoCuota.setToolTipText("Cancelar"+" "+EstadoCuotaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosEstadoCuota.setToolTipText("Guardar"+" "+EstadoCuotaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaEstadoCuota.setToolTipText("Guardar"+" "+EstadoCuotaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEstadoCuota.setToolTipText("Salir"+" "+EstadoCuotaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEstadoCuota";
		inputMap = this.jButtonNuevoEstadoCuota.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEstadoCuota.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEstadoCuota"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarEstadoCuota";
		inputMap = this.jButtonActualizarEstadoCuota.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarEstadoCuota.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarEstadoCuota"));
		
		//ELIMINAR
		sMapKey = "EliminarEstadoCuota";
		inputMap = this.jButtonEliminarEstadoCuota.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarEstadoCuota.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarEstadoCuota"));
		
		//CANCELAR	
		sMapKey = "CancelarEstadoCuota";
		inputMap = this.jButtonCancelarEstadoCuota.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarEstadoCuota.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarEstadoCuota"));
		
		//CERRAR		
		sMapKey = "CerrarEstadoCuota";
		inputMap = this.jButtonCerrarEstadoCuota.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEstadoCuota.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEstadoCuota"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEstadoCuota";
		inputMap = this.jButtonGuardarCambiosTablaEstadoCuota.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEstadoCuota.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEstadoCuota"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoEstadoCuota = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoEstadoCuota.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoEstadoCuota.setToolTipText("Nuevo EstadoCuota");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoEstadoCuota, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarEstadoCuota = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarEstadoCuota.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarEstadoCuota.setToolTipText("Sin Cerrar Ventana EstadoCuota");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarEstadoCuota, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeEstadoCuota = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeEstadoCuota.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeEstadoCuota.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeEstadoCuota, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesEstadoCuota = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEstadoCuota.setText("Accion");
		this.jComboBoxTiposAccionesEstadoCuota.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioEstadoCuota = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioEstadoCuota.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioEstadoCuota.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesEstadoCuota = new JLabelMe();
		
		this.jLabelAccionesEstadoCuota.setText("Acciones");		
		this.jLabelAccionesEstadoCuota.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoCuota.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoCuota.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposEstadoCuota();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysEstadoCuota();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesEstadoCuota=new JTabbedPane();
		this.jTabbedPaneRelacionesEstadoCuota.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesEstadoCuota,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesEstadoCuota.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoCuota.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoCuota.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEstadoCuota, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioEstadoCuota.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEstadoCuota.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEstadoCuota.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioEstadoCuota, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposEstadoCuota = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosEstadoCuota = new GridBagLayout();
		
		this.jPanelCamposEstadoCuota.setLayout(gridaBagLayoutCamposEstadoCuota);
		this.jPanelCamposOcultosEstadoCuota.setLayout(gridaBagLayoutCamposOcultosEstadoCuota);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsEstadoCuota = new GridBagConstraints();
	this.gridBagConstraintsEstadoCuota.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoCuota.gridy = 0;
	this.gridBagConstraintsEstadoCuota.gridx = 0;
	this.gridBagConstraintsEstadoCuota.ipadx = 0;
	this.gridBagConstraintsEstadoCuota.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidEstadoCuota.add(jLabelIdEstadoCuota, this.gridBagConstraintsEstadoCuota);



	this.gridBagConstraintsEstadoCuota = new GridBagConstraints();
	this.gridBagConstraintsEstadoCuota.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoCuota.gridy = 0;
	this.gridBagConstraintsEstadoCuota.gridx = 1;
	this.gridBagConstraintsEstadoCuota.ipadx = 0;
	this.gridBagConstraintsEstadoCuota.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidEstadoCuota.add(jTextFieldidEstadoCuota, this.gridBagConstraintsEstadoCuota);


	this.gridBagConstraintsEstadoCuota = new GridBagConstraints();
	this.gridBagConstraintsEstadoCuota.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoCuota.gridy = 0;
	this.gridBagConstraintsEstadoCuota.gridx = 0;
	this.gridBagConstraintsEstadoCuota.ipadx = 0;
	this.gridBagConstraintsEstadoCuota.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoEstadoCuota.add(jLabelcodigoEstadoCuota, this.gridBagConstraintsEstadoCuota);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoCuota = new GridBagConstraints();
		//this.gridBagConstraintsEstadoCuota.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoCuota.gridy = 0;
		this.gridBagConstraintsEstadoCuota.gridx = 2;
		this.gridBagConstraintsEstadoCuota.ipadx = 0;
		this.gridBagConstraintsEstadoCuota.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoEstadoCuota.add(jButtoncodigoEstadoCuotaBusqueda, this.gridBagConstraintsEstadoCuota);
	}

	this.gridBagConstraintsEstadoCuota = new GridBagConstraints();
	this.gridBagConstraintsEstadoCuota.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoCuota.gridy = 0;
	this.gridBagConstraintsEstadoCuota.gridx = 1;
	this.gridBagConstraintsEstadoCuota.ipadx = 0;
	this.gridBagConstraintsEstadoCuota.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoEstadoCuota.add(jTextFieldcodigoEstadoCuota, this.gridBagConstraintsEstadoCuota);


	this.gridBagConstraintsEstadoCuota = new GridBagConstraints();
	this.gridBagConstraintsEstadoCuota.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoCuota.gridy = 0;
	this.gridBagConstraintsEstadoCuota.gridx = 0;
	this.gridBagConstraintsEstadoCuota.ipadx = 0;
	this.gridBagConstraintsEstadoCuota.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreEstadoCuota.add(jLabelnombreEstadoCuota, this.gridBagConstraintsEstadoCuota);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoCuota = new GridBagConstraints();
		//this.gridBagConstraintsEstadoCuota.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoCuota.gridy = 0;
		this.gridBagConstraintsEstadoCuota.gridx = 2;
		this.gridBagConstraintsEstadoCuota.ipadx = 0;
		this.gridBagConstraintsEstadoCuota.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreEstadoCuota.add(jButtonnombreEstadoCuotaBusqueda, this.gridBagConstraintsEstadoCuota);
	}

	this.gridBagConstraintsEstadoCuota = new GridBagConstraints();
	this.gridBagConstraintsEstadoCuota.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoCuota.gridy = 0;
	this.gridBagConstraintsEstadoCuota.gridx = 1;
	this.gridBagConstraintsEstadoCuota.ipadx = 0;
	this.gridBagConstraintsEstadoCuota.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreEstadoCuota.add(jscrollPanenombreEstadoCuota, this.gridBagConstraintsEstadoCuota);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsEstadoCuota = new GridBagConstraints();
	this.gridBagConstraintsEstadoCuota.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoCuota.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoCuota.gridy = iYPanelCamposEstadoCuota;
	this.gridBagConstraintsEstadoCuota.gridx = iXPanelCamposEstadoCuota++;
	this.gridBagConstraintsEstadoCuota.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoCuota.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoCuota.add(this.jPanelidEstadoCuota, this.gridBagConstraintsEstadoCuota);



	if(iXPanelCamposEstadoCuota % 1==0) {
		iXPanelCamposEstadoCuota=0;
		iYPanelCamposEstadoCuota++;
	}
	this.gridBagConstraintsEstadoCuota = new GridBagConstraints();
	this.gridBagConstraintsEstadoCuota.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoCuota.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoCuota.gridy = iYPanelCamposEstadoCuota;
	this.gridBagConstraintsEstadoCuota.gridx = iXPanelCamposEstadoCuota++;
	this.gridBagConstraintsEstadoCuota.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoCuota.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoCuota.add(this.jPanelcodigoEstadoCuota, this.gridBagConstraintsEstadoCuota);



	if(iXPanelCamposEstadoCuota % 1==0) {
		iXPanelCamposEstadoCuota=0;
		iYPanelCamposEstadoCuota++;
	}
	this.gridBagConstraintsEstadoCuota = new GridBagConstraints();
	this.gridBagConstraintsEstadoCuota.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoCuota.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoCuota.gridy = iYPanelCamposEstadoCuota;
	this.gridBagConstraintsEstadoCuota.gridx = iXPanelCamposEstadoCuota++;
	this.gridBagConstraintsEstadoCuota.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoCuota.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoCuota.add(this.jPanelnombreEstadoCuota, this.gridBagConstraintsEstadoCuota);



	if(iXPanelCamposEstadoCuota % 1==0) {
		iXPanelCamposEstadoCuota=0;
		iYPanelCamposEstadoCuota++;
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
			
		GridBagLayout gridaBagLayoutAccionesEstadoCuota= new GridBagLayout();
		this.jPanelAccionesEstadoCuota.setLayout(gridaBagLayoutAccionesEstadoCuota);
		
		GridBagLayout gridaBagLayoutAccionesFormularioEstadoCuota= new GridBagLayout();
		this.jPanelAccionesFormularioEstadoCuota.setLayout(gridaBagLayoutAccionesFormularioEstadoCuota);
		
		this.gridBagConstraintsEstadoCuota = new GridBagConstraints();
		this.gridBagConstraintsEstadoCuota.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEstadoCuota.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEstadoCuota.add(this.jComboBoxTiposAccionesFormularioEstadoCuota, this.gridBagConstraintsEstadoCuota);

		this.gridBagConstraintsEstadoCuota = new GridBagConstraints();
		this.gridBagConstraintsEstadoCuota.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEstadoCuota.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEstadoCuota.add(this.jCheckBoxPostAccionNuevoEstadoCuota, this.gridBagConstraintsEstadoCuota);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.estadocuotaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsEstadoCuota = new GridBagConstraints();
			this.gridBagConstraintsEstadoCuota.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEstadoCuota.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEstadoCuota.add(this.jCheckBoxPostAccionSinCerrarEstadoCuota, this.gridBagConstraintsEstadoCuota);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.estadocuotaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.estadocuotaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsEstadoCuota = new GridBagConstraints();
			this.gridBagConstraintsEstadoCuota.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEstadoCuota.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEstadoCuota.add(this.jCheckBoxPostAccionSinMensajeEstadoCuota, this.gridBagConstraintsEstadoCuota);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsEstadoCuota = new GridBagConstraints();
		this.gridBagConstraintsEstadoCuota.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoCuota.gridy = 0;
		this.gridBagConstraintsEstadoCuota.gridx = iPosXAccion++;
			
		this.jPanelAccionesEstadoCuota.add(this.jButtonModificarEstadoCuota, this.gridBagConstraintsEstadoCuota);							

		this.gridBagConstraintsEstadoCuota = new GridBagConstraints();
		this.gridBagConstraintsEstadoCuota.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoCuota.gridy = 0;
		this.gridBagConstraintsEstadoCuota.gridx =iPosXAccion++;
			
		this.jPanelAccionesEstadoCuota.add(this.jButtonEliminarEstadoCuota, this.gridBagConstraintsEstadoCuota);
		
			
		this.gridBagConstraintsEstadoCuota = new GridBagConstraints();
		this.gridBagConstraintsEstadoCuota.gridy = 0;		
		this.gridBagConstraintsEstadoCuota.gridx = iPosXAccion++;
		
		this.jPanelAccionesEstadoCuota.add(this.jButtonActualizarEstadoCuota, this.gridBagConstraintsEstadoCuota);


		this.gridBagConstraintsEstadoCuota = new GridBagConstraints();
		this.gridBagConstraintsEstadoCuota.gridy = 0;		
		this.gridBagConstraintsEstadoCuota.gridx = iPosXAccion++;
		
		this.jPanelAccionesEstadoCuota.add(this.jButtonGuardarCambiosEstadoCuota, this.gridBagConstraintsEstadoCuota);	
		
		this.gridBagConstraintsEstadoCuota = new GridBagConstraints();
		this.gridBagConstraintsEstadoCuota.gridy = 0;		
		this.gridBagConstraintsEstadoCuota.gridx =iPosXAccion++;
		
		this.jPanelAccionesEstadoCuota.add(this.jButtonCancelarEstadoCuota, this.gridBagConstraintsEstadoCuota);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEstadoCuota = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEstadoCuota);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.estadocuotaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEstadoCuota = new GridBagConstraints();						
			this.gridBagConstraintsEstadoCuota.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadoCuota.gridx = 0;		
			//this.gridBagConstraintsEstadoCuota.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoCuota.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEstadoCuota.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsEstadoCuota = new GridBagConstraints();
		this.gridBagConstraintsEstadoCuota.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEstadoCuota.gridx =0;
		this.gridBagConstraintsEstadoCuota.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEstadoCuota.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEstadoCuota, this.gridBagConstraintsEstadoCuota);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(EstadoCuotaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleEstadoCuota = new EstadoCuotaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Estado Cuota DATOS");
			
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
			
	        //this.setTitle("[FOR] - Estado Cuota DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estado Cuota Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			EstadoCuotaModel estadocuotaModel=new EstadoCuotaModel(this);
			
			//SI USARA CLASE INTERNA
			//EstadoCuotaModel.EstadoCuotaFocusTraversalPolicy estadocuotaFocusTraversalPolicy = estadocuotaModel.new EstadoCuotaFocusTraversalPolicy(this);
			
			//estadocuotaFocusTraversalPolicy.setestadocuotaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(estadocuotaModel);
			
			
			this.jContentPaneDetalleEstadoCuota = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleEstadoCuota = new GridBagLayout();	
			this.jContentPaneDetalleEstadoCuota.setLayout(gridaBagLayoutDetalleEstadoCuota);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEstadoCuota = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsEstadoCuota = new GridBagConstraints();
				this.gridBagConstraintsEstadoCuota.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsEstadoCuota.gridx = 0;
					
				
				this.jContentPaneDetalleEstadoCuota.add(jTtoolBarDetalleEstadoCuota, gridBagConstraintsEstadoCuota);								
				
}
			
			this.jScrollPanelDatosEdicionEstadoCuota=   new JScrollPane(jContentPaneDetalleEstadoCuota,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEstadoCuota.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoCuota.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoCuota.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralEstadoCuota=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEstadoCuota.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoCuota.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoCuota.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEstadoCuota = new GridBagConstraints();
			
			
	        this.gridBagConstraintsEstadoCuota.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsEstadoCuota.gridx = 0;
	        
			this.jContentPaneDetalleEstadoCuota.add(jPanelCamposEstadoCuota, gridBagConstraintsEstadoCuota);
			
			
			
			
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
						&& estadocuotaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameCuota(this.puedeCargarPorParteCuota,false,-1);
					
					if(this.estadocuotaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsEstadoCuota= new GridBagConstraints();
						this.gridBagConstraintsEstadoCuota.gridy = iGridyRelaciones++;
						this.gridBagConstraintsEstadoCuota.gridx = 0;
						this.jContentPaneDetalleEstadoCuota.add(this.jTabbedPaneRelacionesEstadoCuota, this.gridBagConstraintsEstadoCuota);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesEstadoCuota.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameCuota(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosEstadoCuota.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsEstadoCuota = new GridBagConstraints();
					this.gridBagConstraintsEstadoCuota.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsEstadoCuota.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsEstadoCuota.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsEstadoCuota.gridx = 0;
					
				
					this.jContentPaneDetalleEstadoCuota.add(jPanelCamposOcultosEstadoCuota, gridBagConstraintsEstadoCuota);
				
					this.jPanelCamposOcultosEstadoCuota.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsEstadoCuota = new GridBagConstraints();
			this.gridBagConstraintsEstadoCuota.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsEstadoCuota.gridx = 0;
	        this.gridBagConstraintsEstadoCuota.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleEstadoCuota.add(this.jPanelAccionesFormularioEstadoCuota, this.gridBagConstraintsEstadoCuota);							
			
			
			
			this.gridBagConstraintsEstadoCuota = new GridBagConstraints();
	        this.gridBagConstraintsEstadoCuota.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsEstadoCuota.gridx = 0;
	        
			
			this.jContentPaneDetalleEstadoCuota.add(this.jPanelAccionesEstadoCuota, this.gridBagConstraintsEstadoCuota);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionEstadoCuota);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionEstadoCuota=   new JScrollPane(this.jPanelCamposEstadoCuota,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEstadoCuota.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoCuota.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoCuota.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsEstadoCuota = new GridBagConstraints();
			this.gridBagConstraintsEstadoCuota.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsEstadoCuota.gridx = 0;
			this.gridBagConstraintsEstadoCuota.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsEstadoCuota.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsEstadoCuota.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionEstadoCuota, this.gridBagConstraintsEstadoCuota);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsEstadoCuota = new GridBagConstraints();
			this.gridBagConstraintsEstadoCuota.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEstadoCuota.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioEstadoCuota, this.gridBagConstraintsEstadoCuota);			
			
			this.gridBagConstraintsEstadoCuota = new GridBagConstraints();
			this.gridBagConstraintsEstadoCuota.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEstadoCuota.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesEstadoCuota, this.gridBagConstraintsEstadoCuota);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsEstadoCuota = new GridBagConstraints();
		this.gridBagConstraintsEstadoCuota.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoCuota.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEstadoCuota, this.gridBagConstraintsEstadoCuota);
			
			
		this.gridBagConstraintsEstadoCuota = new GridBagConstraints();
		this.gridBagConstraintsEstadoCuota.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoCuota.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEstadoCuota, this.gridBagConstraintsEstadoCuota);
		
			
		this.gridBagConstraintsEstadoCuota = new GridBagConstraints();
		this.gridBagConstraintsEstadoCuota.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEstadoCuota.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEstadoCuota, this.gridBagConstraintsEstadoCuota);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralEstadoCuota;//jContentPane;
		
		return jScrollPanelDatosEdicionEstadoCuota;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameCuota(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.cuotaSessionBean=new CuotaSessionBean();
		this.cuotaSessionBean.setConGuardarRelaciones(false);
		this.cuotaSessionBean.setEsGuardarRelacionado(true);

		this.cuotaBeanSwingJInternalFrame=null;//new CuotaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.cuotaBeanSwingJInternalFramePopup=new CuotaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.cuotaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.cuotaSessionBean.getEsGuardarRelacionado()) {

				CuotaJInternalFrame.STIPO_TAMANIO_GENERAL=EstadoCuotaJInternalFrame.STIPO_TAMANIO_GENERAL;
				CuotaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EstadoCuotaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.cuotaSessionBean.setEsGuardarRelacionado(true);

				this.cuotaBeanSwingJInternalFrame=new CuotaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.cuotaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.cuotaBeanSwingJInternalFrame.setcuotaSessionBean(this.cuotaSessionBean);

				//this.gridBagConstraintsEstadoCuota = new GridBagConstraints();
				//this.gridBagConstraintsEstadoCuota.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEstadoCuota.gridx = 0;
				//this.jContentPaneDetalleEstadoCuota.add(this.cuotaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEstadoCuota);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEstadoCuota.add("Cuotas",this.cuotaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEstadoCuota.setComponentAt(iIndexTab,this.cuotaBeanSwingJInternalFrame.getContentPane());
				}

				//CuotaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.cuotaSessionBean.setEsGuardarRelacionado(false);
				this.cuotaBeanSwingJInternalFrame=null;//new CuotaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.cuotaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteCuota) {
					this.jTabbedPaneRelacionesEstadoCuota.add("Cuotas",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarCuotaBeanSwingJInternalFrame(List<EstadoCuota> estadocuotas,EstadoCuota estadocuota,CuotaBeanSwingJInternalFrame cuotaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//cuotaBeanSwingJInternalFrame=new CuotaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					cuotaBeanSwingJInternalFrame.getCuotaLogic().setConnexion(this.estadocuotaLogic.getConnexion());

					cuotaBeanSwingJInternalFrame.setestadocuotasForeignKey(estadocuotas);
					cuotaBeanSwingJInternalFrame.setestadocuotaForeignKey(estadocuota);
					cuotaBeanSwingJInternalFrame.cuotaSessionBean.setisBusquedaDesdeForeignKeySesionEstadoCuota(true);
					cuotaBeanSwingJInternalFrame.cuotaSessionBean.setlidEstadoCuotaActual(estadocuota.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					cuotaBeanSwingJInternalFrame.cargarCombosForeignKeyCuota(cuotaBeanSwingJInternalFrame.isCargarCombosDependencia);
					cuotaBeanSwingJInternalFrame.setVisibilidadBusquedasParaEstadoCuota(true);
					cuotaBeanSwingJInternalFrame.setid_estado_cuotaFK_IdEstadoCuota(estadocuota.getId());

					if(!this.conCargarFormDetalle) {
						cuotaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					cuotaBeanSwingJInternalFrame.setSelectedItemCombosFrameEstadoCuotaForeignKey(estadocuota,1,false,true,true);
					cuotaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					cuotaBeanSwingJInternalFrame.procesarBusqueda("FK_IdEstadoCuota");
					cuotaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEstadoCuota");
					cuotaBeanSwingJInternalFrame.inicializarActualizarBindingTablaCuota(true);
					cuotaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesCuota("n",cuotaBeanSwingJInternalFrame.isGuardarCambiosEnLote, cuotaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					cuotaBeanSwingJInternalFrame.setAutoscrolls(true);
					cuotaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						cuotaBeanSwingJInternalFrame.actualizarEstadoPanelsCuota("relacionado");
					} else {
						cuotaBeanSwingJInternalFrame.actualizarEstadoPanelsCuota("no_relacionado");
					}

					cuotaBeanSwingJInternalFrame.getjButtonRecargarInformacionCuota().setVisible(false);

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
