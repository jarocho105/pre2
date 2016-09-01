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
package com.bydan.erp.seguridad.presentation.swing.jinternalframes;


import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.seguridad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.seguridad.util.TipoEmpresaConstantesFunciones;

import com.bydan.erp.seguridad.business.logic.*;
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
public class TipoEmpresaDetalleFormJInternalFrame extends TipoEmpresaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoEmpresa;
	
	protected JMenuBar jmenuBarDetalleTipoEmpresa;
	
	protected JMenu jmenuDetalleTipoEmpresa;
	protected JMenu jmenuDetalleArchivoTipoEmpresa;
	protected JMenu jmenuDetalleAccionesTipoEmpresa;
	protected JMenu jmenuDetalleDatosTipoEmpresa;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoEmpresa;	
	protected GridBagConstraints gridBagConstraintsTipoEmpresa;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoEmpresaBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoEmpresa;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoEmpresaSessionBean tipoempresaSessionBean;
	
	
	
		
	
	public TipoEmpresaLogic tipoempresaLogic;
	
	public JScrollPane jScrollPanelDatosTipoEmpresa;
	public JScrollPane jScrollPanelDatosEdicionTipoEmpresa;
	public JScrollPane jScrollPanelDatosGeneralTipoEmpresa;
	
	protected JPanel jPanelCamposTipoEmpresa;    
	protected JPanel jPanelCamposOcultosTipoEmpresa;    	
	protected JPanel jPanelAccionesTipoEmpresa;
	protected JPanel jPanelAccionesFormularioTipoEmpresa;
    
	
	
	protected Integer iXPanelCamposTipoEmpresa=0;
	protected Integer iYPanelCamposTipoEmpresa=0;
	
	protected Integer iXPanelCamposOcultosTipoEmpresa=0;
	protected Integer iYPanelCamposOcultosTipoEmpresa=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoEmpresa;
	public JButton jButtonModificarTipoEmpresa;
	public JButton jButtonActualizarTipoEmpresa;
    public JButton jButtonEliminarTipoEmpresa;
	public JButton jButtonCancelarTipoEmpresa;
    public JButton jButtonGuardarCambiosTipoEmpresa;
	public JButton jButtonGuardarCambiosTablaTipoEmpresa;
	protected JButton jButtonCerrarTipoEmpresa;
	
	
	protected JButton jButtonProcesarInformacionTipoEmpresa;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoEmpresa;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoEmpresa;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoEmpresa;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoEmpresa;
	protected JButton jButtonModificarToolBarTipoEmpresa;
	protected JButton jButtonActualizarToolBarTipoEmpresa;
    protected JButton jButtonEliminarToolBarTipoEmpresa;
	protected JButton jButtonCancelarToolBarTipoEmpresa;
    protected JButton jButtonGuardarCambiosToolBarTipoEmpresa;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoEmpresa;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoEmpresa;
	protected JButton jButtonCerrarToolBarTipoEmpresa;
	
	protected JButton jButtonProcesarInformacionToolBarTipoEmpresa;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoEmpresa;
	protected JMenuItem jMenuItemModificarTipoEmpresa;
	protected JMenuItem jMenuItemActualizarTipoEmpresa;
    protected JMenuItem jMenuItemEliminarTipoEmpresa;
	protected JMenuItem jMenuItemCancelarTipoEmpresa;
    protected JMenuItem jMenuItemGuardarCambiosTipoEmpresa;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoEmpresa;
	protected JMenuItem jMenuItemCerrarTipoEmpresa;
	protected JMenuItem jMenuItemDetalleCerrarTipoEmpresa;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoEmpresa;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoEmpresa;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoEmpresa;
	protected JMenuItem jMenuItemMostrarOcultarTipoEmpresa;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoEmpresa;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoEmpresa;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoEmpresa;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoEmpresa;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoEmpresa;
	public JLabel jLabelIdTipoEmpresa;
	public JLabel jLabelidTipoEmpresa;
	public JButton jButtonidTipoEmpresaBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoEmpresa;
	public JLabel jLabelcodigoTipoEmpresa;
	public JTextField jTextFieldcodigoTipoEmpresa;
	public JButton jButtoncodigoTipoEmpresaBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoEmpresa;
	public JLabel jLabelnombreTipoEmpresa;
	public JTextArea jTextAreanombreTipoEmpresa;
	public JScrollPane jscrollPanenombreTipoEmpresa;
	public JButton jButtonnombreTipoEmpresaBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoEmpresa;
	
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
	
	public TipoEmpresaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoEmpresa=new JPanel();
				this.jPanelAccionesFormularioTipoEmpresa=new JPanel();
				this.jmenuBarDetalleTipoEmpresa=new JMenuBar();
				this.jTtoolBarDetalleTipoEmpresa=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoEmpresaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoEmpresaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoEmpresaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoEmpresaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoEmpresaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoEmpresa() {
		return this.jButtonActualizarToolBarTipoEmpresa;
	}
	
	public JButton getjButtonEliminarToolBarTipoEmpresa() {
		return this.jButtonEliminarToolBarTipoEmpresa;
	}
	
	public JButton getjButtonCancelarToolBarTipoEmpresa() {
		return this.jButtonCancelarToolBarTipoEmpresa;
	}		
	
	public JButton getjButtonProcesarInformacionTipoEmpresa() {
		return this.jButtonProcesarInformacionTipoEmpresa;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoEmpresa)	{
		this.jButtonProcesarInformacionTipoEmpresa = jButtonProcesarInformacionTipoEmpresa;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoEmpresa() {
		return this.jComboBoxTiposAccionesTipoEmpresa;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoEmpresa(
			JComboBox jComboBoxTiposRelacionesTipoEmpresa) {
		this.jComboBoxTiposRelacionesTipoEmpresa = jComboBoxTiposRelacionesTipoEmpresa;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoEmpresa(
			JComboBox jComboBoxTiposAccionesTipoEmpresa) {
		this.jComboBoxTiposAccionesTipoEmpresa = jComboBoxTiposAccionesTipoEmpresa;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoEmpresa() {
		return this.jComboBoxTiposAccionesFormularioTipoEmpresa;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoEmpresa(
			JComboBox jComboBoxTiposAccionesFormularioTipoEmpresa) {
		this.jComboBoxTiposAccionesFormularioTipoEmpresa = jComboBoxTiposAccionesFormularioTipoEmpresa;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipoempresaSessionBean=new TipoEmpresaSessionBean();
		
		this.tipoempresaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoempresaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoempresaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoEmpresaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoEmpresaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoEmpresaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Empresa MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipoempresaSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoEmpresaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoEmpresa= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoEmpresa=new JButtonMe();
				this.jButtonModificarToolBarTipoEmpresa=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoEmpresa,this.jTtoolBarDetalleTipoEmpresa,
							"actualizar","actualizar","Actualizar"+" "+TipoEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoEmpresa,this.jTtoolBarDetalleTipoEmpresa,
							"eliminar","eliminar","Eliminar"+" "+TipoEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoEmpresa,this.jTtoolBarDetalleTipoEmpresa,
							"cancelar","cancelar","Cancelar"+" "+TipoEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoEmpresa,this.jTtoolBarDetalleTipoEmpresa,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoEmpresa=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoEmpresa=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoEmpresa=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoEmpresa=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoEmpresa=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoEmpresa= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoEmpresa.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoEmpresa,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoEmpresa= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoEmpresa.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoEmpresa,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoEmpresa= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoEmpresa.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoEmpresa,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoEmpresa= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoEmpresa.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoEmpresa,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoEmpresa= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoEmpresa.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoEmpresa,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoEmpresa= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoEmpresa.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoEmpresa,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoEmpresa= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoEmpresa.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoEmpresa,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoEmpresa= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoEmpresa.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoEmpresa,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoEmpresa= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoEmpresa.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoEmpresa,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoEmpresa= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoEmpresa.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoEmpresa,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoEmpresa.add(this.jMenuItemDetalleCerrarTipoEmpresa);
		
		this.jmenuDetalleAccionesTipoEmpresa.add(this.jMenuItemActualizarTipoEmpresa);
		this.jmenuDetalleAccionesTipoEmpresa.add(this.jMenuItemEliminarTipoEmpresa);
		this.jmenuDetalleAccionesTipoEmpresa.add(this.jMenuItemCancelarTipoEmpresa);		
		
		//this.jmenuDetalleDatosTipoEmpresa.add(this.jMenuItemDetalleAbrirOrderByTipoEmpresa);				
		this.jmenuDetalleDatosTipoEmpresa.add(this.jMenuItemDetalleMostarOcultarTipoEmpresa);				
				
		//this.jmenuDetalleAccionesTipoEmpresa.add(this.jMenuItemGuardarCambiosTipoEmpresa);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoEmpresa.add(this.jmenuDetalleArchivoTipoEmpresa);		
		this.jmenuBarDetalleTipoEmpresa.add(this.jmenuDetalleAccionesTipoEmpresa);		
		this.jmenuBarDetalleTipoEmpresa.add(this.jmenuDetalleDatosTipoEmpresa);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoEmpresa);				
	}
	
	
	public void inicializarElementosCamposTipoEmpresa() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoEmpresa = new JLabelMe();
		jLabelIdTipoEmpresa.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoEmpresa = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoEmpresa.setToolTipText(TipoEmpresaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoEmpresa= new GridBagLayout();

		this.jPanelidTipoEmpresa.setLayout(this.gridaBagLayoutTipoEmpresa);

		jLabelidTipoEmpresa = new JLabel();
		jLabelidTipoEmpresa.setText("Id");

		jLabelidTipoEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoEmpresa = new JLabelMe();
		this.jLabelcodigoTipoEmpresa.setText(""+TipoEmpresaConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoEmpresa.setToolTipText("Codigo");
		this.jLabelcodigoTipoEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoEmpresa.setToolTipText(TipoEmpresaConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoEmpresa = new GridBagLayout();
		this.jPanelcodigoTipoEmpresa.setLayout(this.gridaBagLayoutTipoEmpresa);


		jTextFieldcodigoTipoEmpresa= new JTextFieldMe();

		jTextFieldcodigoTipoEmpresa.setEnabled(false);
		jTextFieldcodigoTipoEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoEmpresaBusqueda= new JButtonMe();
		this.jButtoncodigoTipoEmpresaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoEmpresaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoEmpresaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoEmpresaBusqueda.setText("U");
		this.jButtoncodigoTipoEmpresaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoEmpresaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoEmpresaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoEmpresaBusqueda"));

		if(this.tipoempresaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoEmpresaBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoEmpresa = new JLabelMe();
		this.jLabelnombreTipoEmpresa.setText(""+TipoEmpresaConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoEmpresa.setToolTipText("Nombre");
		this.jLabelnombreTipoEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoEmpresa.setToolTipText(TipoEmpresaConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoEmpresa = new GridBagLayout();
		this.jPanelnombreTipoEmpresa.setLayout(this.gridaBagLayoutTipoEmpresa);


		jTextAreanombreTipoEmpresa= new JTextAreaMe();
		jTextAreanombreTipoEmpresa.setEnabled(false);
		jTextAreanombreTipoEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoEmpresa.setLineWrap(true);
		jTextAreanombreTipoEmpresa.setWrapStyleWord(true);
		jTextAreanombreTipoEmpresa.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoEmpresa.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoEmpresa = new JScrollPane(jTextAreanombreTipoEmpresa);
		jscrollPanenombreTipoEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoEmpresaBusqueda= new JButtonMe();
		this.jButtonnombreTipoEmpresaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoEmpresaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoEmpresaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoEmpresaBusqueda.setText("U");
		this.jButtonnombreTipoEmpresaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoEmpresaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoEmpresaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoEmpresaBusqueda"));

		if(this.tipoempresaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoEmpresaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoEmpresa() {
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
		//this.jInternalFrameDetalleTipoEmpresa = new TipoEmpresaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Empresa DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoEmpresa= new GridBagLayout();
		

		
		String sToolTipTipoEmpresa="";
		sToolTipTipoEmpresa=TipoEmpresaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoEmpresa+="(Seguridad.TipoEmpresa)";
		}
		
		if(!this.tipoempresaSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoEmpresa+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoEmpresa = new JButtonMe();
		this.jButtonModificarTipoEmpresa = new JButtonMe();
        this.jButtonActualizarTipoEmpresa = new JButtonMe();
        this.jButtonEliminarTipoEmpresa = new JButtonMe();
        this.jButtonCancelarTipoEmpresa = new JButtonMe();
        this.jButtonGuardarCambiosTipoEmpresa = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoEmpresa = new JButtonMe();
		this.jButtonCerrarTipoEmpresa = new JButtonMe();
		
		this.jScrollPanelDatosTipoEmpresa = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoEmpresa = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoEmpresa = new JScrollPane();
				
		
		
		this.jPanelCamposTipoEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Empresa";
		
		if(!this.tipoempresaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Empresas" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoEmpresa.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoEmpresa.setName("jPanelCamposTipoEmpresa"); 

		this.jPanelCamposOcultosTipoEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoEmpresa.setName("jPanelCamposOcultosTipoEmpresa"); 

        this.jPanelAccionesTipoEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoEmpresa.setToolTipText("Acciones");
        this.jPanelAccionesTipoEmpresa.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoEmpresa.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoEmpresa.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoEmpresa.setText("Nuevo");
		this.jButtonModificarTipoEmpresa.setText("Editar");
        this.jButtonActualizarTipoEmpresa.setText("Actualizar");
        this.jButtonEliminarTipoEmpresa.setText("Eliminar");
        this.jButtonCancelarTipoEmpresa.setText("Cancelar");
        this.jButtonGuardarCambiosTipoEmpresa.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoEmpresa.setText("Guardar");
		this.jButtonCerrarTipoEmpresa.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoEmpresa,"nuevo_button","Nuevo",this.tipoempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoEmpresa,"modificar_button","Editar",this.tipoempresaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoEmpresa,"actualizar_button","Actualizar",this.tipoempresaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoEmpresa,"eliminar_button","Eliminar",this.tipoempresaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoEmpresa,"cancelar_button","Cancelar",this.tipoempresaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoEmpresa,"guardarcambios_button","Guardar",this.tipoempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoEmpresa,"guardarcambiostabla_button","Guardar",this.tipoempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoEmpresa,"cerrar_button","Salir",this.tipoempresaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoEmpresa.setToolTipText("Nuevo"+" "+TipoEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoEmpresa.setToolTipText("Editar"+" "+TipoEmpresaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoEmpresa.setToolTipText("Actualizar"+" "+TipoEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoEmpresa.setToolTipText("Eliminar)"+" "+TipoEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoEmpresa.setToolTipText("Cancelar"+" "+TipoEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoEmpresa.setToolTipText("Guardar"+" "+TipoEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoEmpresa.setToolTipText("Guardar"+" "+TipoEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoEmpresa.setToolTipText("Salir"+" "+TipoEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoEmpresa";
		inputMap = this.jButtonNuevoTipoEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoEmpresa.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoEmpresa"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoEmpresa";
		inputMap = this.jButtonActualizarTipoEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoEmpresa"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoEmpresa";
		inputMap = this.jButtonEliminarTipoEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoEmpresa"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoEmpresa";
		inputMap = this.jButtonCancelarTipoEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoEmpresa"));
		
		//CERRAR		
		sMapKey = "CerrarTipoEmpresa";
		inputMap = this.jButtonCerrarTipoEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoEmpresa"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoEmpresa";
		inputMap = this.jButtonGuardarCambiosTablaTipoEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoEmpresa"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoEmpresa = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoEmpresa.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoEmpresa.setToolTipText("Nuevo TipoEmpresa");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoEmpresa = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoEmpresa.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoEmpresa.setToolTipText("Sin Cerrar Ventana TipoEmpresa");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoEmpresa = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoEmpresa.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoEmpresa.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoEmpresa.setText("Accion");
		this.jComboBoxTiposAccionesTipoEmpresa.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoEmpresa.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoEmpresa.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoEmpresa = new JLabelMe();
		
		this.jLabelAccionesTipoEmpresa.setText("Acciones");		
		this.jLabelAccionesTipoEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoEmpresa();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoEmpresa();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoEmpresa=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoEmpresa.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoEmpresa.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoEmpresa.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoEmpresa.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoEmpresa.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoEmpresa.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoEmpresa = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoEmpresa = new GridBagLayout();
		
		this.jPanelCamposTipoEmpresa.setLayout(gridaBagLayoutCamposTipoEmpresa);
		this.jPanelCamposOcultosTipoEmpresa.setLayout(gridaBagLayoutCamposOcultosTipoEmpresa);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoEmpresa.gridy = 0;
	this.gridBagConstraintsTipoEmpresa.gridx = 0;
	this.gridBagConstraintsTipoEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoEmpresa.add(jLabelIdTipoEmpresa, this.gridBagConstraintsTipoEmpresa);



	this.gridBagConstraintsTipoEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoEmpresa.gridy = 0;
	this.gridBagConstraintsTipoEmpresa.gridx = 1;
	this.gridBagConstraintsTipoEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoEmpresa.add(jLabelidTipoEmpresa, this.gridBagConstraintsTipoEmpresa);


	this.gridBagConstraintsTipoEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoEmpresa.gridy = 0;
	this.gridBagConstraintsTipoEmpresa.gridx = 0;
	this.gridBagConstraintsTipoEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoEmpresa.add(jLabelcodigoTipoEmpresa, this.gridBagConstraintsTipoEmpresa);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsTipoEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoEmpresa.gridy = 0;
		this.gridBagConstraintsTipoEmpresa.gridx = 2;
		this.gridBagConstraintsTipoEmpresa.ipadx = 0;
		this.gridBagConstraintsTipoEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoEmpresa.add(jButtoncodigoTipoEmpresaBusqueda, this.gridBagConstraintsTipoEmpresa);
	}

	this.gridBagConstraintsTipoEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoEmpresa.gridy = 0;
	this.gridBagConstraintsTipoEmpresa.gridx = 1;
	this.gridBagConstraintsTipoEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoEmpresa.add(jTextFieldcodigoTipoEmpresa, this.gridBagConstraintsTipoEmpresa);


	this.gridBagConstraintsTipoEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoEmpresa.gridy = 0;
	this.gridBagConstraintsTipoEmpresa.gridx = 0;
	this.gridBagConstraintsTipoEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoEmpresa.add(jLabelnombreTipoEmpresa, this.gridBagConstraintsTipoEmpresa);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsTipoEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoEmpresa.gridy = 0;
		this.gridBagConstraintsTipoEmpresa.gridx = 2;
		this.gridBagConstraintsTipoEmpresa.ipadx = 0;
		this.gridBagConstraintsTipoEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoEmpresa.add(jButtonnombreTipoEmpresaBusqueda, this.gridBagConstraintsTipoEmpresa);
	}

	this.gridBagConstraintsTipoEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoEmpresa.gridy = 0;
	this.gridBagConstraintsTipoEmpresa.gridx = 1;
	this.gridBagConstraintsTipoEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoEmpresa.add(jscrollPanenombreTipoEmpresa, this.gridBagConstraintsTipoEmpresa);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoEmpresa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoEmpresa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoEmpresa.gridy = iYPanelCamposTipoEmpresa;
	this.gridBagConstraintsTipoEmpresa.gridx = iXPanelCamposTipoEmpresa++;
	this.gridBagConstraintsTipoEmpresa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoEmpresa.add(this.jPanelidTipoEmpresa, this.gridBagConstraintsTipoEmpresa);



	if(iXPanelCamposTipoEmpresa % 1==0) {
		iXPanelCamposTipoEmpresa=0;
		iYPanelCamposTipoEmpresa++;
	}
	this.gridBagConstraintsTipoEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoEmpresa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoEmpresa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoEmpresa.gridy = iYPanelCamposTipoEmpresa;
	this.gridBagConstraintsTipoEmpresa.gridx = iXPanelCamposTipoEmpresa++;
	this.gridBagConstraintsTipoEmpresa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoEmpresa.add(this.jPanelcodigoTipoEmpresa, this.gridBagConstraintsTipoEmpresa);



	if(iXPanelCamposTipoEmpresa % 1==0) {
		iXPanelCamposTipoEmpresa=0;
		iYPanelCamposTipoEmpresa++;
	}
	this.gridBagConstraintsTipoEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoEmpresa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoEmpresa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoEmpresa.gridy = iYPanelCamposTipoEmpresa;
	this.gridBagConstraintsTipoEmpresa.gridx = iXPanelCamposTipoEmpresa++;
	this.gridBagConstraintsTipoEmpresa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoEmpresa.add(this.jPanelnombreTipoEmpresa, this.gridBagConstraintsTipoEmpresa);



	if(iXPanelCamposTipoEmpresa % 1==0) {
		iXPanelCamposTipoEmpresa=0;
		iYPanelCamposTipoEmpresa++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoEmpresa= new GridBagLayout();
		this.jPanelAccionesTipoEmpresa.setLayout(gridaBagLayoutAccionesTipoEmpresa);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoEmpresa= new GridBagLayout();
		this.jPanelAccionesFormularioTipoEmpresa.setLayout(gridaBagLayoutAccionesFormularioTipoEmpresa);
		
		this.gridBagConstraintsTipoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoEmpresa.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoEmpresa.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoEmpresa.add(this.jComboBoxTiposAccionesFormularioTipoEmpresa, this.gridBagConstraintsTipoEmpresa);

		this.gridBagConstraintsTipoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoEmpresa.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoEmpresa.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoEmpresa.add(this.jCheckBoxPostAccionNuevoTipoEmpresa, this.gridBagConstraintsTipoEmpresa);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipoempresaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoEmpresa.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoEmpresa.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoEmpresa.add(this.jCheckBoxPostAccionSinCerrarTipoEmpresa, this.gridBagConstraintsTipoEmpresa);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipoempresaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipoempresaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoEmpresa.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoEmpresa.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoEmpresa.add(this.jCheckBoxPostAccionSinMensajeTipoEmpresa, this.gridBagConstraintsTipoEmpresa);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoEmpresa.gridy = 0;
		this.gridBagConstraintsTipoEmpresa.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoEmpresa.add(this.jButtonModificarTipoEmpresa, this.gridBagConstraintsTipoEmpresa);							

		this.gridBagConstraintsTipoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoEmpresa.gridy = 0;
		this.gridBagConstraintsTipoEmpresa.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoEmpresa.add(this.jButtonEliminarTipoEmpresa, this.gridBagConstraintsTipoEmpresa);
		
			
		this.gridBagConstraintsTipoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoEmpresa.gridy = 0;		
		this.gridBagConstraintsTipoEmpresa.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoEmpresa.add(this.jButtonActualizarTipoEmpresa, this.gridBagConstraintsTipoEmpresa);


		this.gridBagConstraintsTipoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoEmpresa.gridy = 0;		
		this.gridBagConstraintsTipoEmpresa.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoEmpresa.add(this.jButtonGuardarCambiosTipoEmpresa, this.gridBagConstraintsTipoEmpresa);	
		
		this.gridBagConstraintsTipoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoEmpresa.gridy = 0;		
		this.gridBagConstraintsTipoEmpresa.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoEmpresa.add(this.jButtonCancelarTipoEmpresa, this.gridBagConstraintsTipoEmpresa);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoEmpresa = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoEmpresa);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoempresaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoEmpresa = new GridBagConstraints();						
			this.gridBagConstraintsTipoEmpresa.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoEmpresa.gridx = 0;		
			//this.gridBagConstraintsTipoEmpresa.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoEmpresa.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoEmpresa.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoEmpresa.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoEmpresa.gridx =0;
		this.gridBagConstraintsTipoEmpresa.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoEmpresa.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoEmpresa, this.gridBagConstraintsTipoEmpresa);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoEmpresaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoEmpresa = new TipoEmpresaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Empresa DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Empresa DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Empresa Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoEmpresaModel tipoempresaModel=new TipoEmpresaModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoEmpresaModel.TipoEmpresaFocusTraversalPolicy tipoempresaFocusTraversalPolicy = tipoempresaModel.new TipoEmpresaFocusTraversalPolicy(this);
			
			//tipoempresaFocusTraversalPolicy.settipoempresaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipoempresaModel);
			
			
			this.jContentPaneDetalleTipoEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoEmpresa = new GridBagLayout();	
			this.jContentPaneDetalleTipoEmpresa.setLayout(gridaBagLayoutDetalleTipoEmpresa);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoEmpresa = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoEmpresa = new GridBagConstraints();
				this.gridBagConstraintsTipoEmpresa.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoEmpresa.gridx = 0;
					
				
				this.jContentPaneDetalleTipoEmpresa.add(jTtoolBarDetalleTipoEmpresa, gridBagConstraintsTipoEmpresa);								
				
}
			
			this.jScrollPanelDatosEdicionTipoEmpresa=   new JScrollPane(jContentPaneDetalleTipoEmpresa,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoEmpresa.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoEmpresa.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoEmpresa.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoEmpresa=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoEmpresa.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoEmpresa.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoEmpresa.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoEmpresa = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoEmpresa.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoEmpresa.gridx = 0;
	        
			this.jContentPaneDetalleTipoEmpresa.add(jPanelCamposTipoEmpresa, gridBagConstraintsTipoEmpresa);
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			
			;
			//}
						
			this.conMaximoRelaciones=false;
			
			if(this.parametroGeneralUsuario.getcon_cargar_por_parte()) {
			}									
			
			//CARGA O NO CARGA RELACIONADOS(MAESTRO DETALLE)
									  // ABAJO VIENE DE PARAMETRO GENERAL USUARIO
			if(conMaximoRelaciones) { // && this.conFuncionalidadRelaciones) {
				if(!this.conCargarMinimo) {
					if(cargarRelaciones 
						&& tipoempresaSessionBean.getConGuardarRelaciones()
						) {
					
					if(this.tipoempresaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoEmpresa= new GridBagConstraints();
						this.gridBagConstraintsTipoEmpresa.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoEmpresa.gridx = 0;
						this.jContentPaneDetalleTipoEmpresa.add(this.jTabbedPaneRelacionesTipoEmpresa, this.gridBagConstraintsTipoEmpresa);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoEmpresa.setVisible(false);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoEmpresa.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoEmpresa = new GridBagConstraints();
					this.gridBagConstraintsTipoEmpresa.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoEmpresa.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoEmpresa.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoEmpresa.gridx = 0;
					
				
					this.jContentPaneDetalleTipoEmpresa.add(jPanelCamposOcultosTipoEmpresa, gridBagConstraintsTipoEmpresa);
				
					this.jPanelCamposOcultosTipoEmpresa.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoEmpresa.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTipoEmpresa.gridx = 0;
	        this.gridBagConstraintsTipoEmpresa.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoEmpresa.add(this.jPanelAccionesFormularioTipoEmpresa, this.gridBagConstraintsTipoEmpresa);							
			
			
			
			this.gridBagConstraintsTipoEmpresa = new GridBagConstraints();
	        this.gridBagConstraintsTipoEmpresa.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTipoEmpresa.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoEmpresa.add(this.jPanelAccionesTipoEmpresa, this.gridBagConstraintsTipoEmpresa);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoEmpresa);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoEmpresa=   new JScrollPane(this.jPanelCamposTipoEmpresa,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoEmpresa.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoEmpresa.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoEmpresa.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoEmpresa.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoEmpresa.gridx = 0;
			this.gridBagConstraintsTipoEmpresa.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoEmpresa.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoEmpresa.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoEmpresa, this.gridBagConstraintsTipoEmpresa);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoEmpresa.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoEmpresa.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoEmpresa, this.gridBagConstraintsTipoEmpresa);			
			
			this.gridBagConstraintsTipoEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoEmpresa.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoEmpresa.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoEmpresa, this.gridBagConstraintsTipoEmpresa);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoEmpresa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoEmpresa.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoEmpresa, this.gridBagConstraintsTipoEmpresa);
			
			
		this.gridBagConstraintsTipoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoEmpresa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoEmpresa.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoEmpresa, this.gridBagConstraintsTipoEmpresa);
		
			
		this.gridBagConstraintsTipoEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoEmpresa.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoEmpresa.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoEmpresa, this.gridBagConstraintsTipoEmpresa);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoEmpresa;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoEmpresa;
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
