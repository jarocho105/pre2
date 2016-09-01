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
import com.bydan.erp.cartera.util.TipoComproConstantesFunciones;

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
public class TipoComproDetalleFormJInternalFrame extends TipoComproBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoCompro;
	
	protected JMenuBar jmenuBarDetalleTipoCompro;
	
	protected JMenu jmenuDetalleTipoCompro;
	protected JMenu jmenuDetalleArchivoTipoCompro;
	protected JMenu jmenuDetalleAccionesTipoCompro;
	protected JMenu jmenuDetalleDatosTipoCompro;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoCompro = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoCompro;	
	protected GridBagConstraints gridBagConstraintsTipoCompro;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoComproBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoCompro;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoComproSessionBean tipocomproSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public TipoComproLogic tipocomproLogic;
	
	public JScrollPane jScrollPanelDatosTipoCompro;
	public JScrollPane jScrollPanelDatosEdicionTipoCompro;
	public JScrollPane jScrollPanelDatosGeneralTipoCompro;
	
	protected JPanel jPanelCamposTipoCompro;    
	protected JPanel jPanelCamposOcultosTipoCompro;    	
	protected JPanel jPanelAccionesTipoCompro;
	protected JPanel jPanelAccionesFormularioTipoCompro;
    
	
	
	protected Integer iXPanelCamposTipoCompro=0;
	protected Integer iYPanelCamposTipoCompro=0;
	
	protected Integer iXPanelCamposOcultosTipoCompro=0;
	protected Integer iYPanelCamposOcultosTipoCompro=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoCompro;
	public JButton jButtonModificarTipoCompro;
	public JButton jButtonActualizarTipoCompro;
    public JButton jButtonEliminarTipoCompro;
	public JButton jButtonCancelarTipoCompro;
    public JButton jButtonGuardarCambiosTipoCompro;
	public JButton jButtonGuardarCambiosTablaTipoCompro;
	protected JButton jButtonCerrarTipoCompro;
	
	
	protected JButton jButtonProcesarInformacionTipoCompro;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoCompro;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoCompro;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoCompro;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoCompro;
	protected JButton jButtonModificarToolBarTipoCompro;
	protected JButton jButtonActualizarToolBarTipoCompro;
    protected JButton jButtonEliminarToolBarTipoCompro;
	protected JButton jButtonCancelarToolBarTipoCompro;
    protected JButton jButtonGuardarCambiosToolBarTipoCompro;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoCompro;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoCompro;
	protected JButton jButtonCerrarToolBarTipoCompro;
	
	protected JButton jButtonProcesarInformacionToolBarTipoCompro;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoCompro;
	protected JMenuItem jMenuItemModificarTipoCompro;
	protected JMenuItem jMenuItemActualizarTipoCompro;
    protected JMenuItem jMenuItemEliminarTipoCompro;
	protected JMenuItem jMenuItemCancelarTipoCompro;
    protected JMenuItem jMenuItemGuardarCambiosTipoCompro;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoCompro;
	protected JMenuItem jMenuItemCerrarTipoCompro;
	protected JMenuItem jMenuItemDetalleCerrarTipoCompro;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoCompro;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoCompro;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoCompro;
	protected JMenuItem jMenuItemMostrarOcultarTipoCompro;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoCompro;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoCompro;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoCompro;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoCompro;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoCompro;
	public JLabel jLabelIdTipoCompro;
	public JLabel jLabelidTipoCompro;
	public JButton jButtonidTipoComproBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoCompro;
	public JLabel jLabelcodigoTipoCompro;
	public JTextField jTextFieldcodigoTipoCompro;
	public JButton jButtoncodigoTipoComproBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoCompro;
	public JLabel jLabelnombreTipoCompro;
	public JTextArea jTextAreanombreTipoCompro;
	public JScrollPane jscrollPanenombreTipoCompro;
	public JButton jButtonnombreTipoComproBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTipoCompro;
	public JLabel jLabelid_empresaTipoCompro;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTipoCompro;
	public JButton jButtonid_empresaTipoCompro= new JButtonMe();
	public JButton jButtonid_empresaTipoComproUpdate= new JButtonMe();
	public JButton jButtonid_empresaTipoComproBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoCompro;
	
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
	
	public TipoComproDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoCompro=new JPanel();
				this.jPanelAccionesFormularioTipoCompro=new JPanel();
				this.jmenuBarDetalleTipoCompro=new JMenuBar();
				this.jTtoolBarDetalleTipoCompro=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoComproDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoCompro No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoComproDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoCompro No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoComproDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoCompro No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoComproDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoCompro No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoComproDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoCompro No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoCompro() {
		return this.jButtonActualizarToolBarTipoCompro;
	}
	
	public JButton getjButtonEliminarToolBarTipoCompro() {
		return this.jButtonEliminarToolBarTipoCompro;
	}
	
	public JButton getjButtonCancelarToolBarTipoCompro() {
		return this.jButtonCancelarToolBarTipoCompro;
	}		
	
	public JButton getjButtonProcesarInformacionTipoCompro() {
		return this.jButtonProcesarInformacionTipoCompro;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoCompro)	{
		this.jButtonProcesarInformacionTipoCompro = jButtonProcesarInformacionTipoCompro;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoCompro() {
		return this.jComboBoxTiposAccionesTipoCompro;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoCompro(
			JComboBox jComboBoxTiposRelacionesTipoCompro) {
		this.jComboBoxTiposRelacionesTipoCompro = jComboBoxTiposRelacionesTipoCompro;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoCompro(
			JComboBox jComboBoxTiposAccionesTipoCompro) {
		this.jComboBoxTiposAccionesTipoCompro = jComboBoxTiposAccionesTipoCompro;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoCompro() {
		return this.jComboBoxTiposAccionesFormularioTipoCompro;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoCompro(
			JComboBox jComboBoxTiposAccionesFormularioTipoCompro) {
		this.jComboBoxTiposAccionesFormularioTipoCompro = jComboBoxTiposAccionesFormularioTipoCompro;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipocomproSessionBean=new TipoComproSessionBean();
		
		this.tipocomproSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipocomproSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipocomproSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoComproJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoComproJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoComproJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Compro MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipocomproSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoComproJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoCompro= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoCompro=new JButtonMe();
				this.jButtonModificarToolBarTipoCompro=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoCompro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoCompro,this.jTtoolBarDetalleTipoCompro,
							"actualizar","actualizar","Actualizar"+" "+TipoComproConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoCompro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoCompro,this.jTtoolBarDetalleTipoCompro,
							"eliminar","eliminar","Eliminar"+" "+TipoComproConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoCompro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoCompro,this.jTtoolBarDetalleTipoCompro,
							"cancelar","cancelar","Cancelar"+" "+TipoComproConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoCompro=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoCompro,this.jTtoolBarDetalleTipoCompro,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoComproConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoCompro,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoCompro,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoCompro,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoCompro=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoCompro=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoCompro=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoCompro=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoCompro=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoCompro= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoCompro.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoCompro,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoCompro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoCompro= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoCompro.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoCompro,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoCompro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoCompro= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoCompro.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoCompro,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoCompro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoCompro= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoCompro.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoCompro,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoCompro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoCompro= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoCompro.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoCompro,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoCompro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoCompro= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoCompro.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoCompro,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoCompro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoCompro= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoCompro.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoCompro,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoCompro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoCompro= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoCompro.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoCompro,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoCompro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoCompro= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoCompro.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoCompro,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoCompro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoCompro= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoCompro.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoCompro,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoCompro, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoCompro.add(this.jMenuItemDetalleCerrarTipoCompro);
		
		this.jmenuDetalleAccionesTipoCompro.add(this.jMenuItemActualizarTipoCompro);
		this.jmenuDetalleAccionesTipoCompro.add(this.jMenuItemEliminarTipoCompro);
		this.jmenuDetalleAccionesTipoCompro.add(this.jMenuItemCancelarTipoCompro);		
		
		//this.jmenuDetalleDatosTipoCompro.add(this.jMenuItemDetalleAbrirOrderByTipoCompro);				
		this.jmenuDetalleDatosTipoCompro.add(this.jMenuItemDetalleMostarOcultarTipoCompro);				
				
		//this.jmenuDetalleAccionesTipoCompro.add(this.jMenuItemGuardarCambiosTipoCompro);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoCompro, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoCompro, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoCompro, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoCompro.add(this.jmenuDetalleArchivoTipoCompro);		
		this.jmenuBarDetalleTipoCompro.add(this.jmenuDetalleAccionesTipoCompro);		
		this.jmenuBarDetalleTipoCompro.add(this.jmenuDetalleDatosTipoCompro);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoCompro);				
	}
	
	
	public void inicializarElementosCamposTipoCompro() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoCompro = new JLabelMe();
		jLabelIdTipoCompro.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoCompro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoCompro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoCompro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoCompro,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoCompro = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoCompro.setToolTipText(TipoComproConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoCompro= new GridBagLayout();

		this.jPanelidTipoCompro.setLayout(this.gridaBagLayoutTipoCompro);

		jLabelidTipoCompro = new JLabel();
		jLabelidTipoCompro.setText("Id");

		jLabelidTipoCompro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoCompro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoCompro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoCompro = new JLabelMe();
		this.jLabelcodigoTipoCompro.setText(""+TipoComproConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoCompro.setToolTipText("Codigo");
		this.jLabelcodigoTipoCompro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoCompro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoCompro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoCompro,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoCompro=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoCompro.setToolTipText(TipoComproConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoCompro = new GridBagLayout();
		this.jPanelcodigoTipoCompro.setLayout(this.gridaBagLayoutTipoCompro);


		jTextFieldcodigoTipoCompro= new JTextFieldMe();

		jTextFieldcodigoTipoCompro.setEnabled(false);
		jTextFieldcodigoTipoCompro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoCompro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoCompro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoCompro,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoComproBusqueda= new JButtonMe();
		this.jButtoncodigoTipoComproBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoComproBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoComproBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoComproBusqueda.setText("U");
		this.jButtoncodigoTipoComproBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoComproBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoComproBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoCompro.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoCompro.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoComproBusqueda"));

		if(this.tipocomproSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoComproBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoCompro = new JLabelMe();
		this.jLabelnombreTipoCompro.setText(""+TipoComproConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoCompro.setToolTipText("Nombre");
		this.jLabelnombreTipoCompro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoCompro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoCompro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoCompro,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoCompro=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoCompro.setToolTipText(TipoComproConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoCompro = new GridBagLayout();
		this.jPanelnombreTipoCompro.setLayout(this.gridaBagLayoutTipoCompro);


		jTextAreanombreTipoCompro= new JTextAreaMe();
		jTextAreanombreTipoCompro.setEnabled(false);
		jTextAreanombreTipoCompro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoCompro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoCompro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoCompro.setLineWrap(true);
		jTextAreanombreTipoCompro.setWrapStyleWord(true);
		jTextAreanombreTipoCompro.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoCompro.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoCompro,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoCompro = new JScrollPane(jTextAreanombreTipoCompro);
		jscrollPanenombreTipoCompro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),70));
		jscrollPanenombreTipoCompro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),70));
		jscrollPanenombreTipoCompro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),70));

		this.jButtonnombreTipoComproBusqueda= new JButtonMe();
		this.jButtonnombreTipoComproBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoComproBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoComproBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoComproBusqueda.setText("U");
		this.jButtonnombreTipoComproBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoComproBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoComproBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoCompro.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoCompro.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoComproBusqueda"));

		if(this.tipocomproSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoComproBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoCompro() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTipoCompro = new JLabelMe();
		this.jLabelid_empresaTipoCompro.setText(""+TipoComproConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTipoCompro.setToolTipText("Empresa");
		this.jLabelid_empresaTipoCompro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoCompro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoCompro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTipoCompro,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTipoCompro=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTipoCompro.setToolTipText(TipoComproConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTipoCompro = new GridBagLayout();
		this.jPanelid_empresaTipoCompro.setLayout(this.gridaBagLayoutTipoCompro);


		jComboBoxid_empresaTipoCompro= new JComboBoxMe();
		jComboBoxid_empresaTipoCompro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoCompro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoCompro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTipoCompro,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTipoCompro.setEnabled(false);

		this.jButtonid_empresaTipoCompro= new JButtonMe();
		this.jButtonid_empresaTipoCompro.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoCompro.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoCompro.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoCompro.setText("Buscar");
		this.jButtonid_empresaTipoCompro.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTipoCompro.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoCompro,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTipoCompro.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoCompro.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoCompro"));

		this.jButtonid_empresaTipoComproBusqueda= new JButtonMe();
		this.jButtonid_empresaTipoComproBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoComproBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoComproBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoComproBusqueda.setText("U");
		this.jButtonid_empresaTipoComproBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTipoComproBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoComproBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTipoCompro.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoCompro.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoComproBusqueda"));

		if(this.tipocomproSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTipoComproBusqueda.setVisible(false);		}

		this.jButtonid_empresaTipoComproUpdate= new JButtonMe();
		this.jButtonid_empresaTipoComproUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoComproUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoComproUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoComproUpdate.setText("U");
		this.jButtonid_empresaTipoComproUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTipoComproUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoComproUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTipoCompro.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoCompro.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoComproUpdate"));



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
		//this.jInternalFrameDetalleTipoCompro = new TipoComproBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Compro DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoCompro= new GridBagLayout();
		

		
		String sToolTipTipoCompro="";
		sToolTipTipoCompro=TipoComproConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoCompro+="(Cartera.TipoCompro)";
		}
		
		if(!this.tipocomproSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoCompro+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoCompro = new JButtonMe();
		this.jButtonModificarTipoCompro = new JButtonMe();
        this.jButtonActualizarTipoCompro = new JButtonMe();
        this.jButtonEliminarTipoCompro = new JButtonMe();
        this.jButtonCancelarTipoCompro = new JButtonMe();
        this.jButtonGuardarCambiosTipoCompro = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoCompro = new JButtonMe();
		this.jButtonCerrarTipoCompro = new JButtonMe();
		
		this.jScrollPanelDatosTipoCompro = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoCompro = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoCompro = new JScrollPane();
				
		
		
		this.jPanelCamposTipoCompro = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoCompro = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoCompro = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoCompro = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Compro";
		
		if(!this.tipocomproSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoCompro.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Compros" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoCompro.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoCompro.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoCompro.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoCompro.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoCompro.setName("jPanelCamposTipoCompro"); 

		this.jPanelCamposOcultosTipoCompro.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoCompro.setName("jPanelCamposOcultosTipoCompro"); 

        this.jPanelAccionesTipoCompro.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoCompro.setToolTipText("Acciones");
        this.jPanelAccionesTipoCompro.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoCompro.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoCompro.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoCompro.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoCompro, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoCompro, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoCompro, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoCompro, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoCompro, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoCompro, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoCompro.setText("Nuevo");
		this.jButtonModificarTipoCompro.setText("Editar");
        this.jButtonActualizarTipoCompro.setText("Actualizar");
        this.jButtonEliminarTipoCompro.setText("Eliminar");
        this.jButtonCancelarTipoCompro.setText("Cancelar");
        this.jButtonGuardarCambiosTipoCompro.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoCompro.setText("Guardar");
		this.jButtonCerrarTipoCompro.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoCompro,"nuevo_button","Nuevo",this.tipocomproSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoCompro,"modificar_button","Editar",this.tipocomproSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoCompro,"actualizar_button","Actualizar",this.tipocomproSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoCompro,"eliminar_button","Eliminar",this.tipocomproSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoCompro,"cancelar_button","Cancelar",this.tipocomproSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoCompro,"guardarcambios_button","Guardar",this.tipocomproSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoCompro,"guardarcambiostabla_button","Guardar",this.tipocomproSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoCompro,"cerrar_button","Salir",this.tipocomproSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoCompro, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoCompro, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoCompro, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoCompro, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoCompro, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoCompro, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoCompro, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoCompro, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoCompro.setToolTipText("Nuevo"+" "+TipoComproConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoCompro.setToolTipText("Editar"+" "+TipoComproConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoCompro.setToolTipText("Actualizar"+" "+TipoComproConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoCompro.setToolTipText("Eliminar)"+" "+TipoComproConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoCompro.setToolTipText("Cancelar"+" "+TipoComproConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoCompro.setToolTipText("Guardar"+" "+TipoComproConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoCompro.setToolTipText("Guardar"+" "+TipoComproConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoCompro.setToolTipText("Salir"+" "+TipoComproConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoCompro";
		inputMap = this.jButtonNuevoTipoCompro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoCompro.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoCompro"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoCompro";
		inputMap = this.jButtonActualizarTipoCompro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoCompro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoCompro"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoCompro";
		inputMap = this.jButtonEliminarTipoCompro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoCompro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoCompro"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoCompro";
		inputMap = this.jButtonCancelarTipoCompro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoCompro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoCompro"));
		
		//CERRAR		
		sMapKey = "CerrarTipoCompro";
		inputMap = this.jButtonCerrarTipoCompro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoCompro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoCompro"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoCompro";
		inputMap = this.jButtonGuardarCambiosTablaTipoCompro.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoCompro.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoCompro"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoCompro = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoCompro.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoCompro.setToolTipText("Nuevo TipoCompro");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoCompro, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoCompro = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoCompro.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoCompro.setToolTipText("Sin Cerrar Ventana TipoCompro");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoCompro, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoCompro = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoCompro.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoCompro.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoCompro, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoCompro = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoCompro.setText("Accion");
		this.jComboBoxTiposAccionesTipoCompro.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoCompro = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoCompro.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoCompro.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoCompro = new JLabelMe();
		
		this.jLabelAccionesTipoCompro.setText("Acciones");		
		this.jLabelAccionesTipoCompro.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoCompro.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoCompro.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoCompro();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoCompro();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoCompro=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoCompro.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoCompro,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoCompro.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoCompro.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoCompro.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoCompro, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoCompro.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoCompro.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoCompro.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoCompro, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoCompro = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoCompro = new GridBagLayout();
		
		this.jPanelCamposTipoCompro.setLayout(gridaBagLayoutCamposTipoCompro);
		this.jPanelCamposOcultosTipoCompro.setLayout(gridaBagLayoutCamposOcultosTipoCompro);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoCompro = new GridBagConstraints();
	this.gridBagConstraintsTipoCompro.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCompro.gridy = 0;
	this.gridBagConstraintsTipoCompro.gridx = 0;
	this.gridBagConstraintsTipoCompro.ipadx = 0;
	this.gridBagConstraintsTipoCompro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoCompro.add(jLabelIdTipoCompro, this.gridBagConstraintsTipoCompro);



	this.gridBagConstraintsTipoCompro = new GridBagConstraints();
	this.gridBagConstraintsTipoCompro.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCompro.gridy = 0;
	this.gridBagConstraintsTipoCompro.gridx = 1;
	this.gridBagConstraintsTipoCompro.ipadx = 0;
	this.gridBagConstraintsTipoCompro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoCompro.add(jLabelidTipoCompro, this.gridBagConstraintsTipoCompro);


	this.gridBagConstraintsTipoCompro = new GridBagConstraints();
	this.gridBagConstraintsTipoCompro.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCompro.gridy = 0;
	this.gridBagConstraintsTipoCompro.gridx = 0;
	this.gridBagConstraintsTipoCompro.ipadx = 0;
	this.gridBagConstraintsTipoCompro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTipoCompro.add(jLabelid_empresaTipoCompro, this.gridBagConstraintsTipoCompro);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoCompro = new GridBagConstraints();
		//this.gridBagConstraintsTipoCompro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCompro.gridy = 0;
		this.gridBagConstraintsTipoCompro.gridx = 2;
		this.gridBagConstraintsTipoCompro.ipadx = 0;
		this.gridBagConstraintsTipoCompro.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoCompro.add(jButtonid_empresaTipoComproBusqueda, this.gridBagConstraintsTipoCompro);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoCompro = new GridBagConstraints();
		//this.gridBagConstraintsTipoCompro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCompro.gridy = 0;
		this.gridBagConstraintsTipoCompro.gridx = 3;
		this.gridBagConstraintsTipoCompro.ipadx = 0;
		this.gridBagConstraintsTipoCompro.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoCompro.add(jButtonid_empresaTipoComproUpdate, this.gridBagConstraintsTipoCompro);
	}

	this.gridBagConstraintsTipoCompro = new GridBagConstraints();
	this.gridBagConstraintsTipoCompro.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCompro.gridy = 0;
	this.gridBagConstraintsTipoCompro.gridx = 1;
	this.gridBagConstraintsTipoCompro.ipadx = 0;
	this.gridBagConstraintsTipoCompro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTipoCompro.add(jComboBoxid_empresaTipoCompro, this.gridBagConstraintsTipoCompro);


	this.gridBagConstraintsTipoCompro = new GridBagConstraints();
	this.gridBagConstraintsTipoCompro.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCompro.gridy = 0;
	this.gridBagConstraintsTipoCompro.gridx = 0;
	this.gridBagConstraintsTipoCompro.ipadx = 0;
	this.gridBagConstraintsTipoCompro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoCompro.add(jLabelcodigoTipoCompro, this.gridBagConstraintsTipoCompro);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoCompro = new GridBagConstraints();
		//this.gridBagConstraintsTipoCompro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCompro.gridy = 0;
		this.gridBagConstraintsTipoCompro.gridx = 2;
		this.gridBagConstraintsTipoCompro.ipadx = 0;
		this.gridBagConstraintsTipoCompro.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoCompro.add(jButtoncodigoTipoComproBusqueda, this.gridBagConstraintsTipoCompro);
	}

	this.gridBagConstraintsTipoCompro = new GridBagConstraints();
	this.gridBagConstraintsTipoCompro.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCompro.gridy = 0;
	this.gridBagConstraintsTipoCompro.gridx = 1;
	this.gridBagConstraintsTipoCompro.ipadx = 0;
	this.gridBagConstraintsTipoCompro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoCompro.add(jTextFieldcodigoTipoCompro, this.gridBagConstraintsTipoCompro);


	this.gridBagConstraintsTipoCompro = new GridBagConstraints();
	this.gridBagConstraintsTipoCompro.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCompro.gridy = 0;
	this.gridBagConstraintsTipoCompro.gridx = 0;
	this.gridBagConstraintsTipoCompro.ipadx = 0;
	this.gridBagConstraintsTipoCompro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoCompro.add(jLabelnombreTipoCompro, this.gridBagConstraintsTipoCompro);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoCompro = new GridBagConstraints();
		//this.gridBagConstraintsTipoCompro.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCompro.gridy = 0;
		this.gridBagConstraintsTipoCompro.gridx = 2;
		this.gridBagConstraintsTipoCompro.ipadx = 0;
		this.gridBagConstraintsTipoCompro.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoCompro.add(jButtonnombreTipoComproBusqueda, this.gridBagConstraintsTipoCompro);
	}

	this.gridBagConstraintsTipoCompro = new GridBagConstraints();
	this.gridBagConstraintsTipoCompro.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCompro.gridy = 0;
	this.gridBagConstraintsTipoCompro.gridx = 1;
	this.gridBagConstraintsTipoCompro.ipadx = 0;
	this.gridBagConstraintsTipoCompro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoCompro.add(jscrollPanenombreTipoCompro, this.gridBagConstraintsTipoCompro);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoCompro = new GridBagConstraints();
	this.gridBagConstraintsTipoCompro.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoCompro.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoCompro.gridy = iYPanelCamposTipoCompro;
	this.gridBagConstraintsTipoCompro.gridx = iXPanelCamposTipoCompro++;
	this.gridBagConstraintsTipoCompro.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoCompro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoCompro.add(this.jPanelidTipoCompro, this.gridBagConstraintsTipoCompro);



	if(iXPanelCamposTipoCompro % 1==0) {
		iXPanelCamposTipoCompro=0;
		iYPanelCamposTipoCompro++;
	}
	this.gridBagConstraintsTipoCompro = new GridBagConstraints();
	this.gridBagConstraintsTipoCompro.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoCompro.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoCompro.gridy = iYPanelCamposTipoCompro;
	this.gridBagConstraintsTipoCompro.gridx = iXPanelCamposTipoCompro++;
	this.gridBagConstraintsTipoCompro.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoCompro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoCompro.add(this.jPanelcodigoTipoCompro, this.gridBagConstraintsTipoCompro);



	if(iXPanelCamposTipoCompro % 1==0) {
		iXPanelCamposTipoCompro=0;
		iYPanelCamposTipoCompro++;
	}
	this.gridBagConstraintsTipoCompro = new GridBagConstraints();
	this.gridBagConstraintsTipoCompro.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoCompro.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoCompro.gridy = iYPanelCamposTipoCompro;
	this.gridBagConstraintsTipoCompro.gridx = iXPanelCamposTipoCompro++;
	this.gridBagConstraintsTipoCompro.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoCompro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoCompro.add(this.jPanelnombreTipoCompro, this.gridBagConstraintsTipoCompro);



	if(iXPanelCamposTipoCompro % 1==0) {
		iXPanelCamposTipoCompro=0;
		iYPanelCamposTipoCompro++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTipoCompro = new GridBagConstraints();
	this.gridBagConstraintsTipoCompro.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoCompro.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoCompro.gridy = iYPanelCamposOcultosTipoCompro;
	this.gridBagConstraintsTipoCompro.gridx = iXPanelCamposOcultosTipoCompro++;
	this.gridBagConstraintsTipoCompro.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoCompro.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTipoCompro.add(this.jPanelid_empresaTipoCompro, this.gridBagConstraintsTipoCompro);



	if(iXPanelCamposOcultosTipoCompro % 1==0) {
		iXPanelCamposOcultosTipoCompro=0;
		iYPanelCamposOcultosTipoCompro++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoCompro= new GridBagLayout();
		this.jPanelAccionesTipoCompro.setLayout(gridaBagLayoutAccionesTipoCompro);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoCompro= new GridBagLayout();
		this.jPanelAccionesFormularioTipoCompro.setLayout(gridaBagLayoutAccionesFormularioTipoCompro);
		
		this.gridBagConstraintsTipoCompro = new GridBagConstraints();
		this.gridBagConstraintsTipoCompro.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoCompro.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoCompro.add(this.jComboBoxTiposAccionesFormularioTipoCompro, this.gridBagConstraintsTipoCompro);

		this.gridBagConstraintsTipoCompro = new GridBagConstraints();
		this.gridBagConstraintsTipoCompro.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoCompro.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoCompro.add(this.jCheckBoxPostAccionNuevoTipoCompro, this.gridBagConstraintsTipoCompro);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipocomproSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoCompro = new GridBagConstraints();
			this.gridBagConstraintsTipoCompro.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoCompro.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoCompro.add(this.jCheckBoxPostAccionSinCerrarTipoCompro, this.gridBagConstraintsTipoCompro);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipocomproSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipocomproSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoCompro = new GridBagConstraints();
			this.gridBagConstraintsTipoCompro.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoCompro.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoCompro.add(this.jCheckBoxPostAccionSinMensajeTipoCompro, this.gridBagConstraintsTipoCompro);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoCompro = new GridBagConstraints();
		this.gridBagConstraintsTipoCompro.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCompro.gridy = 0;
		this.gridBagConstraintsTipoCompro.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoCompro.add(this.jButtonModificarTipoCompro, this.gridBagConstraintsTipoCompro);							

		this.gridBagConstraintsTipoCompro = new GridBagConstraints();
		this.gridBagConstraintsTipoCompro.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCompro.gridy = 0;
		this.gridBagConstraintsTipoCompro.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoCompro.add(this.jButtonEliminarTipoCompro, this.gridBagConstraintsTipoCompro);
		
			
		this.gridBagConstraintsTipoCompro = new GridBagConstraints();
		this.gridBagConstraintsTipoCompro.gridy = 0;		
		this.gridBagConstraintsTipoCompro.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoCompro.add(this.jButtonActualizarTipoCompro, this.gridBagConstraintsTipoCompro);


		this.gridBagConstraintsTipoCompro = new GridBagConstraints();
		this.gridBagConstraintsTipoCompro.gridy = 0;		
		this.gridBagConstraintsTipoCompro.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoCompro.add(this.jButtonGuardarCambiosTipoCompro, this.gridBagConstraintsTipoCompro);	
		
		this.gridBagConstraintsTipoCompro = new GridBagConstraints();
		this.gridBagConstraintsTipoCompro.gridy = 0;		
		this.gridBagConstraintsTipoCompro.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoCompro.add(this.jButtonCancelarTipoCompro, this.gridBagConstraintsTipoCompro);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoCompro = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoCompro);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipocomproSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoCompro = new GridBagConstraints();						
			this.gridBagConstraintsTipoCompro.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoCompro.gridx = 0;		
			//this.gridBagConstraintsTipoCompro.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCompro.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoCompro.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoCompro = new GridBagConstraints();
		this.gridBagConstraintsTipoCompro.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoCompro.gridx =0;
		this.gridBagConstraintsTipoCompro.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoCompro.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoCompro, this.gridBagConstraintsTipoCompro);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoComproJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoCompro = new TipoComproBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Compro DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Compro DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Compro Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoComproModel tipocomproModel=new TipoComproModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoComproModel.TipoComproFocusTraversalPolicy tipocomproFocusTraversalPolicy = tipocomproModel.new TipoComproFocusTraversalPolicy(this);
			
			//tipocomproFocusTraversalPolicy.settipocomproJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipocomproModel);
			
			
			this.jContentPaneDetalleTipoCompro = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoCompro = new GridBagLayout();	
			this.jContentPaneDetalleTipoCompro.setLayout(gridaBagLayoutDetalleTipoCompro);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoCompro = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoCompro = new GridBagConstraints();
				this.gridBagConstraintsTipoCompro.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoCompro.gridx = 0;
					
				
				this.jContentPaneDetalleTipoCompro.add(jTtoolBarDetalleTipoCompro, gridBagConstraintsTipoCompro);								
				
}
			
			this.jScrollPanelDatosEdicionTipoCompro=   new JScrollPane(jContentPaneDetalleTipoCompro,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoCompro.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoCompro.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoCompro.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoCompro=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoCompro.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoCompro.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoCompro.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoCompro = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoCompro.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoCompro.gridx = 0;
	        
			this.jContentPaneDetalleTipoCompro.add(jPanelCamposTipoCompro, gridBagConstraintsTipoCompro);
			
			
			
			
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
						&& tipocomproSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.tipocomproSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoCompro= new GridBagConstraints();
						this.gridBagConstraintsTipoCompro.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoCompro.gridx = 0;
						this.jContentPaneDetalleTipoCompro.add(this.jTabbedPaneRelacionesTipoCompro, this.gridBagConstraintsTipoCompro);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoCompro.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoCompro.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoCompro = new GridBagConstraints();
					this.gridBagConstraintsTipoCompro.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoCompro.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoCompro.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoCompro.gridx = 0;
					
				
					this.jContentPaneDetalleTipoCompro.add(jPanelCamposOcultosTipoCompro, gridBagConstraintsTipoCompro);
				
					this.jPanelCamposOcultosTipoCompro.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoCompro = new GridBagConstraints();
			this.gridBagConstraintsTipoCompro.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTipoCompro.gridx = 0;
	        this.gridBagConstraintsTipoCompro.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoCompro.add(this.jPanelAccionesFormularioTipoCompro, this.gridBagConstraintsTipoCompro);							
			
			
			
			this.gridBagConstraintsTipoCompro = new GridBagConstraints();
	        this.gridBagConstraintsTipoCompro.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTipoCompro.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoCompro.add(this.jPanelAccionesTipoCompro, this.gridBagConstraintsTipoCompro);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoCompro);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoCompro=   new JScrollPane(this.jPanelCamposTipoCompro,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoCompro.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoCompro.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoCompro.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoCompro = new GridBagConstraints();
			this.gridBagConstraintsTipoCompro.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoCompro.gridx = 0;
			this.gridBagConstraintsTipoCompro.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoCompro.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoCompro.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoCompro, this.gridBagConstraintsTipoCompro);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoCompro = new GridBagConstraints();
			this.gridBagConstraintsTipoCompro.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoCompro.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoCompro, this.gridBagConstraintsTipoCompro);			
			
			this.gridBagConstraintsTipoCompro = new GridBagConstraints();
			this.gridBagConstraintsTipoCompro.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoCompro.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoCompro, this.gridBagConstraintsTipoCompro);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoCompro = new GridBagConstraints();
		this.gridBagConstraintsTipoCompro.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCompro.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoCompro, this.gridBagConstraintsTipoCompro);
			
			
		this.gridBagConstraintsTipoCompro = new GridBagConstraints();
		this.gridBagConstraintsTipoCompro.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCompro.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoCompro, this.gridBagConstraintsTipoCompro);
		
			
		this.gridBagConstraintsTipoCompro = new GridBagConstraints();
		this.gridBagConstraintsTipoCompro.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoCompro.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoCompro, this.gridBagConstraintsTipoCompro);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoCompro;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoCompro;
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
