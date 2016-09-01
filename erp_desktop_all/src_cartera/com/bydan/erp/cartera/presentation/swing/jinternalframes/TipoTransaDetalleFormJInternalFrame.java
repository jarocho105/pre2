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


import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.cartera.util.TipoTransaConstantesFunciones;

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
public class TipoTransaDetalleFormJInternalFrame extends TipoTransaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoTransa;
	
	protected JMenuBar jmenuBarDetalleTipoTransa;
	
	protected JMenu jmenuDetalleTipoTransa;
	protected JMenu jmenuDetalleArchivoTipoTransa;
	protected JMenu jmenuDetalleAccionesTipoTransa;
	protected JMenu jmenuDetalleDatosTipoTransa;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoTransa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoTransa;	
	protected GridBagConstraints gridBagConstraintsTipoTransa;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoTransaBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoTransa;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoTransaSessionBean tipotransaSessionBean;
	
	

	public TransaccionBeanSwingJInternalFrame transaccionBeanSwingJInternalFrame=null;
	public TransaccionBeanSwingJInternalFrame transaccionBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteTransaccion=false;
	public TransaccionSessionBean transaccionSessionBean;
	
		
	
	public TipoTransaLogic tipotransaLogic;
	
	public JScrollPane jScrollPanelDatosTipoTransa;
	public JScrollPane jScrollPanelDatosEdicionTipoTransa;
	public JScrollPane jScrollPanelDatosGeneralTipoTransa;
	
	protected JPanel jPanelCamposTipoTransa;    
	protected JPanel jPanelCamposOcultosTipoTransa;    	
	protected JPanel jPanelAccionesTipoTransa;
	protected JPanel jPanelAccionesFormularioTipoTransa;
    
	
	
	protected Integer iXPanelCamposTipoTransa=0;
	protected Integer iYPanelCamposTipoTransa=0;
	
	protected Integer iXPanelCamposOcultosTipoTransa=0;
	protected Integer iYPanelCamposOcultosTipoTransa=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoTransa;
	public JButton jButtonModificarTipoTransa;
	public JButton jButtonActualizarTipoTransa;
    public JButton jButtonEliminarTipoTransa;
	public JButton jButtonCancelarTipoTransa;
    public JButton jButtonGuardarCambiosTipoTransa;
	public JButton jButtonGuardarCambiosTablaTipoTransa;
	protected JButton jButtonCerrarTipoTransa;
	
	
	protected JButton jButtonProcesarInformacionTipoTransa;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoTransa;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoTransa;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoTransa;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoTransa;
	protected JButton jButtonModificarToolBarTipoTransa;
	protected JButton jButtonActualizarToolBarTipoTransa;
    protected JButton jButtonEliminarToolBarTipoTransa;
	protected JButton jButtonCancelarToolBarTipoTransa;
    protected JButton jButtonGuardarCambiosToolBarTipoTransa;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoTransa;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoTransa;
	protected JButton jButtonCerrarToolBarTipoTransa;
	
	protected JButton jButtonProcesarInformacionToolBarTipoTransa;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoTransa;
	protected JMenuItem jMenuItemModificarTipoTransa;
	protected JMenuItem jMenuItemActualizarTipoTransa;
    protected JMenuItem jMenuItemEliminarTipoTransa;
	protected JMenuItem jMenuItemCancelarTipoTransa;
    protected JMenuItem jMenuItemGuardarCambiosTipoTransa;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoTransa;
	protected JMenuItem jMenuItemCerrarTipoTransa;
	protected JMenuItem jMenuItemDetalleCerrarTipoTransa;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoTransa;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoTransa;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoTransa;
	protected JMenuItem jMenuItemMostrarOcultarTipoTransa;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoTransa;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoTransa;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoTransa;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoTransa;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoTransa;
	public JLabel jLabelIdTipoTransa;
	public JTextFieldMe jTextFieldidTipoTransa;
	public JButton jButtonidTipoTransaBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoTransa;
	public JLabel jLabelnombreTipoTransa;
	public JTextField jTextFieldnombreTipoTransa;
	public JButton jButtonnombreTipoTransaBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoTransa;
	
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
	
	public TipoTransaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoTransa=new JPanel();
				this.jPanelAccionesFormularioTipoTransa=new JPanel();
				this.jmenuBarDetalleTipoTransa=new JMenuBar();
				this.jTtoolBarDetalleTipoTransa=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoTransaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoTransa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoTransaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoTransa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoTransaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoTransa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoTransaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoTransa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoTransaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoTransa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoTransa() {
		return this.jButtonActualizarToolBarTipoTransa;
	}
	
	public JButton getjButtonEliminarToolBarTipoTransa() {
		return this.jButtonEliminarToolBarTipoTransa;
	}
	
	public JButton getjButtonCancelarToolBarTipoTransa() {
		return this.jButtonCancelarToolBarTipoTransa;
	}		
	
	public JButton getjButtonProcesarInformacionTipoTransa() {
		return this.jButtonProcesarInformacionTipoTransa;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoTransa)	{
		this.jButtonProcesarInformacionTipoTransa = jButtonProcesarInformacionTipoTransa;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoTransa() {
		return this.jComboBoxTiposAccionesTipoTransa;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoTransa(
			JComboBox jComboBoxTiposRelacionesTipoTransa) {
		this.jComboBoxTiposRelacionesTipoTransa = jComboBoxTiposRelacionesTipoTransa;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoTransa(
			JComboBox jComboBoxTiposAccionesTipoTransa) {
		this.jComboBoxTiposAccionesTipoTransa = jComboBoxTiposAccionesTipoTransa;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoTransa() {
		return this.jComboBoxTiposAccionesFormularioTipoTransa;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoTransa(
			JComboBox jComboBoxTiposAccionesFormularioTipoTransa) {
		this.jComboBoxTiposAccionesFormularioTipoTransa = jComboBoxTiposAccionesFormularioTipoTransa;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipotransaSessionBean=new TipoTransaSessionBean();
		
		this.tipotransaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipotransaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipotransaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.transaccionSessionBean=new TransaccionSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoTransaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoTransaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoTransaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Transa MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipotransaSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoTransaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoTransa= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoTransa=new JButtonMe();
				this.jButtonModificarToolBarTipoTransa=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoTransa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoTransa,this.jTtoolBarDetalleTipoTransa,
							"actualizar","actualizar","Actualizar"+" "+TipoTransaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoTransa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoTransa,this.jTtoolBarDetalleTipoTransa,
							"eliminar","eliminar","Eliminar"+" "+TipoTransaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoTransa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoTransa,this.jTtoolBarDetalleTipoTransa,
							"cancelar","cancelar","Cancelar"+" "+TipoTransaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoTransa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoTransa,this.jTtoolBarDetalleTipoTransa,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoTransaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoTransa,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoTransa,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoTransa,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoTransa=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoTransa=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoTransa=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoTransa=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoTransa=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoTransa= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoTransa.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoTransa,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoTransa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoTransa= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoTransa.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoTransa,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoTransa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoTransa= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoTransa.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoTransa,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoTransa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoTransa= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoTransa.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoTransa,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoTransa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoTransa= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoTransa.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoTransa,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoTransa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoTransa= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoTransa.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoTransa,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoTransa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoTransa= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoTransa.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoTransa,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoTransa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoTransa= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoTransa.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoTransa,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoTransa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoTransa= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoTransa.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoTransa,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoTransa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoTransa= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoTransa.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoTransa,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoTransa, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoTransa.add(this.jMenuItemDetalleCerrarTipoTransa);
		
		this.jmenuDetalleAccionesTipoTransa.add(this.jMenuItemActualizarTipoTransa);
		this.jmenuDetalleAccionesTipoTransa.add(this.jMenuItemEliminarTipoTransa);
		this.jmenuDetalleAccionesTipoTransa.add(this.jMenuItemCancelarTipoTransa);		
		
		//this.jmenuDetalleDatosTipoTransa.add(this.jMenuItemDetalleAbrirOrderByTipoTransa);				
		this.jmenuDetalleDatosTipoTransa.add(this.jMenuItemDetalleMostarOcultarTipoTransa);				
				
		//this.jmenuDetalleAccionesTipoTransa.add(this.jMenuItemGuardarCambiosTipoTransa);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoTransa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoTransa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoTransa, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoTransa.add(this.jmenuDetalleArchivoTipoTransa);		
		this.jmenuBarDetalleTipoTransa.add(this.jmenuDetalleAccionesTipoTransa);		
		this.jmenuBarDetalleTipoTransa.add(this.jmenuDetalleDatosTipoTransa);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTipoTransa, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTipoTransa.add(this.jmenuDetalleTipoTransa);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoTransa);				
	}
	
	
	public void inicializarElementosCamposTipoTransa() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoTransa = new JLabelMe();
		jLabelIdTipoTransa.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoTransa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoTransa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoTransa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoTransa,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoTransa = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoTransa.setToolTipText(TipoTransaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoTransa= new GridBagLayout();

		this.jPanelidTipoTransa.setLayout(this.gridaBagLayoutTipoTransa);

		jTextFieldidTipoTransa = new JTextFieldMe();
		jTextFieldidTipoTransa.setText("Id");

		jTextFieldidTipoTransa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoTransa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoTransa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreTipoTransa = new JLabelMe();
		this.jLabelnombreTipoTransa.setText(""+TipoTransaConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoTransa.setToolTipText("Nombre");
		this.jLabelnombreTipoTransa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoTransa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoTransa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoTransa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoTransa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoTransa.setToolTipText(TipoTransaConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoTransa = new GridBagLayout();
		this.jPanelnombreTipoTransa.setLayout(this.gridaBagLayoutTipoTransa);


		jTextFieldnombreTipoTransa= new JTextFieldMe();

		jTextFieldnombreTipoTransa.setEnabled(false);
		jTextFieldnombreTipoTransa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreTipoTransa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreTipoTransa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombreTipoTransa,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombreTipoTransaBusqueda= new JButtonMe();
		this.jButtonnombreTipoTransaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoTransaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoTransaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoTransaBusqueda.setText("U");
		this.jButtonnombreTipoTransaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoTransaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoTransaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombreTipoTransa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombreTipoTransa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoTransaBusqueda"));

		if(this.tipotransaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoTransaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoTransa() {
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
		//this.jInternalFrameDetalleTipoTransa = new TipoTransaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Transa DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoTransa= new GridBagLayout();
		

		
		String sToolTipTipoTransa="";
		sToolTipTipoTransa=TipoTransaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoTransa+="(Cartera.TipoTransa)";
		}
		
		if(!this.tipotransaSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoTransa+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoTransa = new JButtonMe();
		this.jButtonModificarTipoTransa = new JButtonMe();
        this.jButtonActualizarTipoTransa = new JButtonMe();
        this.jButtonEliminarTipoTransa = new JButtonMe();
        this.jButtonCancelarTipoTransa = new JButtonMe();
        this.jButtonGuardarCambiosTipoTransa = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoTransa = new JButtonMe();
		this.jButtonCerrarTipoTransa = new JButtonMe();
		
		this.jScrollPanelDatosTipoTransa = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoTransa = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoTransa = new JScrollPane();
				
		
		
		this.jPanelCamposTipoTransa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoTransa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoTransa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoTransa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Transa";
		
		if(!this.tipotransaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoTransa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Transas" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoTransa.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoTransa.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoTransa.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoTransa.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoTransa.setName("jPanelCamposTipoTransa"); 

		this.jPanelCamposOcultosTipoTransa.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoTransa.setName("jPanelCamposOcultosTipoTransa"); 

        this.jPanelAccionesTipoTransa.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoTransa.setToolTipText("Acciones");
        this.jPanelAccionesTipoTransa.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoTransa.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoTransa.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoTransa.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoTransa, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoTransa, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoTransa, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoTransa, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoTransa, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoTransa, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoTransa.setText("Nuevo");
		this.jButtonModificarTipoTransa.setText("Editar");
        this.jButtonActualizarTipoTransa.setText("Actualizar");
        this.jButtonEliminarTipoTransa.setText("Eliminar");
        this.jButtonCancelarTipoTransa.setText("Cancelar");
        this.jButtonGuardarCambiosTipoTransa.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoTransa.setText("Guardar");
		this.jButtonCerrarTipoTransa.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoTransa,"nuevo_button","Nuevo",this.tipotransaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoTransa,"modificar_button","Editar",this.tipotransaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoTransa,"actualizar_button","Actualizar",this.tipotransaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoTransa,"eliminar_button","Eliminar",this.tipotransaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoTransa,"cancelar_button","Cancelar",this.tipotransaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoTransa,"guardarcambios_button","Guardar",this.tipotransaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoTransa,"guardarcambiostabla_button","Guardar",this.tipotransaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoTransa,"cerrar_button","Salir",this.tipotransaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoTransa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoTransa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoTransa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoTransa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoTransa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoTransa, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoTransa, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoTransa, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoTransa.setToolTipText("Nuevo"+" "+TipoTransaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoTransa.setToolTipText("Editar"+" "+TipoTransaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoTransa.setToolTipText("Actualizar"+" "+TipoTransaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoTransa.setToolTipText("Eliminar)"+" "+TipoTransaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoTransa.setToolTipText("Cancelar"+" "+TipoTransaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoTransa.setToolTipText("Guardar"+" "+TipoTransaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoTransa.setToolTipText("Guardar"+" "+TipoTransaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoTransa.setToolTipText("Salir"+" "+TipoTransaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoTransa";
		inputMap = this.jButtonNuevoTipoTransa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoTransa.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoTransa"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoTransa";
		inputMap = this.jButtonActualizarTipoTransa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoTransa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoTransa"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoTransa";
		inputMap = this.jButtonEliminarTipoTransa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoTransa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoTransa"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoTransa";
		inputMap = this.jButtonCancelarTipoTransa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoTransa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoTransa"));
		
		//CERRAR		
		sMapKey = "CerrarTipoTransa";
		inputMap = this.jButtonCerrarTipoTransa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoTransa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoTransa"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoTransa";
		inputMap = this.jButtonGuardarCambiosTablaTipoTransa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoTransa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoTransa"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoTransa = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoTransa.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoTransa.setToolTipText("Nuevo TipoTransa");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoTransa, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoTransa = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoTransa.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoTransa.setToolTipText("Sin Cerrar Ventana TipoTransa");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoTransa, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoTransa = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoTransa.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoTransa.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoTransa, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoTransa = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoTransa.setText("Accion");
		this.jComboBoxTiposAccionesTipoTransa.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoTransa = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoTransa.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoTransa.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoTransa = new JLabelMe();
		
		this.jLabelAccionesTipoTransa.setText("Acciones");		
		this.jLabelAccionesTipoTransa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoTransa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoTransa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoTransa();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoTransa();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoTransa=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoTransa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoTransa,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoTransa.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoTransa.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoTransa.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoTransa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoTransa.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoTransa.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoTransa.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoTransa, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoTransa = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoTransa = new GridBagLayout();
		
		this.jPanelCamposTipoTransa.setLayout(gridaBagLayoutCamposTipoTransa);
		this.jPanelCamposOcultosTipoTransa.setLayout(gridaBagLayoutCamposOcultosTipoTransa);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoTransa = new GridBagConstraints();
	this.gridBagConstraintsTipoTransa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoTransa.gridy = 0;
	this.gridBagConstraintsTipoTransa.gridx = 0;
	this.gridBagConstraintsTipoTransa.ipadx = 0;
	this.gridBagConstraintsTipoTransa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoTransa.add(jLabelIdTipoTransa, this.gridBagConstraintsTipoTransa);



	this.gridBagConstraintsTipoTransa = new GridBagConstraints();
	this.gridBagConstraintsTipoTransa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoTransa.gridy = 0;
	this.gridBagConstraintsTipoTransa.gridx = 1;
	this.gridBagConstraintsTipoTransa.ipadx = 0;
	this.gridBagConstraintsTipoTransa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoTransa.add(jTextFieldidTipoTransa, this.gridBagConstraintsTipoTransa);


	this.gridBagConstraintsTipoTransa = new GridBagConstraints();
	this.gridBagConstraintsTipoTransa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoTransa.gridy = 0;
	this.gridBagConstraintsTipoTransa.gridx = 0;
	this.gridBagConstraintsTipoTransa.ipadx = 0;
	this.gridBagConstraintsTipoTransa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoTransa.add(jLabelnombreTipoTransa, this.gridBagConstraintsTipoTransa);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoTransa = new GridBagConstraints();
		//this.gridBagConstraintsTipoTransa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoTransa.gridy = 0;
		this.gridBagConstraintsTipoTransa.gridx = 2;
		this.gridBagConstraintsTipoTransa.ipadx = 0;
		this.gridBagConstraintsTipoTransa.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoTransa.add(jButtonnombreTipoTransaBusqueda, this.gridBagConstraintsTipoTransa);
	}

	this.gridBagConstraintsTipoTransa = new GridBagConstraints();
	this.gridBagConstraintsTipoTransa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoTransa.gridy = 0;
	this.gridBagConstraintsTipoTransa.gridx = 1;
	this.gridBagConstraintsTipoTransa.ipadx = 0;
	this.gridBagConstraintsTipoTransa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoTransa.add(jTextFieldnombreTipoTransa, this.gridBagConstraintsTipoTransa);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoTransa = new GridBagConstraints();
	this.gridBagConstraintsTipoTransa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoTransa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoTransa.gridy = iYPanelCamposTipoTransa;
	this.gridBagConstraintsTipoTransa.gridx = iXPanelCamposTipoTransa++;
	this.gridBagConstraintsTipoTransa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoTransa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoTransa.add(this.jPanelidTipoTransa, this.gridBagConstraintsTipoTransa);



	if(iXPanelCamposTipoTransa % 1==0) {
		iXPanelCamposTipoTransa=0;
		iYPanelCamposTipoTransa++;
	}
	this.gridBagConstraintsTipoTransa = new GridBagConstraints();
	this.gridBagConstraintsTipoTransa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoTransa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoTransa.gridy = iYPanelCamposTipoTransa;
	this.gridBagConstraintsTipoTransa.gridx = iXPanelCamposTipoTransa++;
	this.gridBagConstraintsTipoTransa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoTransa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoTransa.add(this.jPanelnombreTipoTransa, this.gridBagConstraintsTipoTransa);



	if(iXPanelCamposTipoTransa % 1==0) {
		iXPanelCamposTipoTransa=0;
		iYPanelCamposTipoTransa++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoTransa= new GridBagLayout();
		this.jPanelAccionesTipoTransa.setLayout(gridaBagLayoutAccionesTipoTransa);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoTransa= new GridBagLayout();
		this.jPanelAccionesFormularioTipoTransa.setLayout(gridaBagLayoutAccionesFormularioTipoTransa);
		
		this.gridBagConstraintsTipoTransa = new GridBagConstraints();
		this.gridBagConstraintsTipoTransa.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoTransa.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoTransa.add(this.jComboBoxTiposAccionesFormularioTipoTransa, this.gridBagConstraintsTipoTransa);

		this.gridBagConstraintsTipoTransa = new GridBagConstraints();
		this.gridBagConstraintsTipoTransa.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoTransa.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoTransa.add(this.jCheckBoxPostAccionNuevoTipoTransa, this.gridBagConstraintsTipoTransa);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipotransaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoTransa = new GridBagConstraints();
			this.gridBagConstraintsTipoTransa.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoTransa.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoTransa.add(this.jCheckBoxPostAccionSinCerrarTipoTransa, this.gridBagConstraintsTipoTransa);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipotransaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipotransaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoTransa = new GridBagConstraints();
			this.gridBagConstraintsTipoTransa.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoTransa.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoTransa.add(this.jCheckBoxPostAccionSinMensajeTipoTransa, this.gridBagConstraintsTipoTransa);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoTransa = new GridBagConstraints();
		this.gridBagConstraintsTipoTransa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoTransa.gridy = 0;
		this.gridBagConstraintsTipoTransa.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoTransa.add(this.jButtonModificarTipoTransa, this.gridBagConstraintsTipoTransa);							

		this.gridBagConstraintsTipoTransa = new GridBagConstraints();
		this.gridBagConstraintsTipoTransa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoTransa.gridy = 0;
		this.gridBagConstraintsTipoTransa.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoTransa.add(this.jButtonEliminarTipoTransa, this.gridBagConstraintsTipoTransa);
		
			
		this.gridBagConstraintsTipoTransa = new GridBagConstraints();
		this.gridBagConstraintsTipoTransa.gridy = 0;		
		this.gridBagConstraintsTipoTransa.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoTransa.add(this.jButtonActualizarTipoTransa, this.gridBagConstraintsTipoTransa);


		this.gridBagConstraintsTipoTransa = new GridBagConstraints();
		this.gridBagConstraintsTipoTransa.gridy = 0;		
		this.gridBagConstraintsTipoTransa.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoTransa.add(this.jButtonGuardarCambiosTipoTransa, this.gridBagConstraintsTipoTransa);	
		
		this.gridBagConstraintsTipoTransa = new GridBagConstraints();
		this.gridBagConstraintsTipoTransa.gridy = 0;		
		this.gridBagConstraintsTipoTransa.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoTransa.add(this.jButtonCancelarTipoTransa, this.gridBagConstraintsTipoTransa);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoTransa = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoTransa);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipotransaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoTransa = new GridBagConstraints();						
			this.gridBagConstraintsTipoTransa.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoTransa.gridx = 0;		
			//this.gridBagConstraintsTipoTransa.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTransa.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoTransa.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoTransa = new GridBagConstraints();
		this.gridBagConstraintsTipoTransa.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoTransa.gridx =0;
		this.gridBagConstraintsTipoTransa.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoTransa.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoTransa, this.gridBagConstraintsTipoTransa);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoTransaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoTransa = new TipoTransaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Transa DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Transa DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Transa Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoTransaModel tipotransaModel=new TipoTransaModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoTransaModel.TipoTransaFocusTraversalPolicy tipotransaFocusTraversalPolicy = tipotransaModel.new TipoTransaFocusTraversalPolicy(this);
			
			//tipotransaFocusTraversalPolicy.settipotransaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipotransaModel);
			
			
			this.jContentPaneDetalleTipoTransa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoTransa = new GridBagLayout();	
			this.jContentPaneDetalleTipoTransa.setLayout(gridaBagLayoutDetalleTipoTransa);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoTransa = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoTransa = new GridBagConstraints();
				this.gridBagConstraintsTipoTransa.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoTransa.gridx = 0;
					
				
				this.jContentPaneDetalleTipoTransa.add(jTtoolBarDetalleTipoTransa, gridBagConstraintsTipoTransa);								
				
}
			
			this.jScrollPanelDatosEdicionTipoTransa=   new JScrollPane(jContentPaneDetalleTipoTransa,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoTransa.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoTransa.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoTransa.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoTransa=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoTransa.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoTransa.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoTransa.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoTransa = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoTransa.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoTransa.gridx = 0;
	        
			this.jContentPaneDetalleTipoTransa.add(jPanelCamposTipoTransa, gridBagConstraintsTipoTransa);
			
			
			
			
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
						&& tipotransaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameTransaccion(this.puedeCargarPorParteTransaccion,false,-1);
					
					if(this.tipotransaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoTransa= new GridBagConstraints();
						this.gridBagConstraintsTipoTransa.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoTransa.gridx = 0;
						this.jContentPaneDetalleTipoTransa.add(this.jTabbedPaneRelacionesTipoTransa, this.gridBagConstraintsTipoTransa);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoTransa.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameTransaccion(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoTransa.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoTransa = new GridBagConstraints();
					this.gridBagConstraintsTipoTransa.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoTransa.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoTransa.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoTransa.gridx = 0;
					
				
					this.jContentPaneDetalleTipoTransa.add(jPanelCamposOcultosTipoTransa, gridBagConstraintsTipoTransa);
				
					this.jPanelCamposOcultosTipoTransa.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoTransa = new GridBagConstraints();
			this.gridBagConstraintsTipoTransa.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsTipoTransa.gridx = 0;
	        this.gridBagConstraintsTipoTransa.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoTransa.add(this.jPanelAccionesFormularioTipoTransa, this.gridBagConstraintsTipoTransa);							
			
			
			
			this.gridBagConstraintsTipoTransa = new GridBagConstraints();
	        this.gridBagConstraintsTipoTransa.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsTipoTransa.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoTransa.add(this.jPanelAccionesTipoTransa, this.gridBagConstraintsTipoTransa);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoTransa);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoTransa=   new JScrollPane(this.jPanelCamposTipoTransa,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoTransa.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoTransa.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoTransa.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoTransa = new GridBagConstraints();
			this.gridBagConstraintsTipoTransa.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoTransa.gridx = 0;
			this.gridBagConstraintsTipoTransa.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoTransa.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoTransa.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoTransa, this.gridBagConstraintsTipoTransa);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoTransa = new GridBagConstraints();
			this.gridBagConstraintsTipoTransa.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoTransa.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoTransa, this.gridBagConstraintsTipoTransa);			
			
			this.gridBagConstraintsTipoTransa = new GridBagConstraints();
			this.gridBagConstraintsTipoTransa.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoTransa.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoTransa, this.gridBagConstraintsTipoTransa);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoTransa = new GridBagConstraints();
		this.gridBagConstraintsTipoTransa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoTransa.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoTransa, this.gridBagConstraintsTipoTransa);
			
			
		this.gridBagConstraintsTipoTransa = new GridBagConstraints();
		this.gridBagConstraintsTipoTransa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoTransa.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoTransa, this.gridBagConstraintsTipoTransa);
		
			
		this.gridBagConstraintsTipoTransa = new GridBagConstraints();
		this.gridBagConstraintsTipoTransa.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoTransa.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoTransa, this.gridBagConstraintsTipoTransa);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoTransa;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoTransa;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameTransaccion(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.transaccionSessionBean=new TransaccionSessionBean();
		this.transaccionSessionBean.setConGuardarRelaciones(false);
		this.transaccionSessionBean.setEsGuardarRelacionado(true);

		this.transaccionBeanSwingJInternalFrame=null;//new TransaccionBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.transaccionBeanSwingJInternalFramePopup=new TransaccionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.transaccionBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.transaccionSessionBean.getEsGuardarRelacionado()) {

				TransaccionJInternalFrame.STIPO_TAMANIO_GENERAL=TipoTransaJInternalFrame.STIPO_TAMANIO_GENERAL;
				TransaccionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoTransaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.transaccionSessionBean.setEsGuardarRelacionado(true);

				this.transaccionBeanSwingJInternalFrame=new TransaccionBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.transaccionBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.transaccionBeanSwingJInternalFrame.settransaccionSessionBean(this.transaccionSessionBean);

				//this.gridBagConstraintsTipoTransa = new GridBagConstraints();
				//this.gridBagConstraintsTipoTransa.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoTransa.gridx = 0;
				//this.jContentPaneDetalleTipoTransa.add(this.transaccionBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoTransa);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoTransa.add("Transacciones",this.transaccionBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoTransa.setComponentAt(iIndexTab,this.transaccionBeanSwingJInternalFrame.getContentPane());
				}

				//TransaccionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.transaccionSessionBean.setEsGuardarRelacionado(false);
				this.transaccionBeanSwingJInternalFrame=null;//new TransaccionBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.transaccionSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteTransaccion) {
					this.jTabbedPaneRelacionesTipoTransa.add("Transacciones",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarTransaccionBeanSwingJInternalFrame(List<TipoTransa> tipotransas,TipoTransa tipotransa,TransaccionBeanSwingJInternalFrame transaccionBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//transaccionBeanSwingJInternalFrame=new TransaccionBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					transaccionBeanSwingJInternalFrame.getTransaccionLogic().setConnexion(this.tipotransaLogic.getConnexion());

					transaccionBeanSwingJInternalFrame.settipotransasForeignKey(tipotransas);
					transaccionBeanSwingJInternalFrame.settipotransaForeignKey(tipotransa);
					transaccionBeanSwingJInternalFrame.transaccionSessionBean.setisBusquedaDesdeForeignKeySesionTipoTransa(true);
					transaccionBeanSwingJInternalFrame.transaccionSessionBean.setlidTipoTransaActual(tipotransa.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					transaccionBeanSwingJInternalFrame.cargarCombosForeignKeyTransaccion(transaccionBeanSwingJInternalFrame.isCargarCombosDependencia);
					transaccionBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoTransa(true);
					transaccionBeanSwingJInternalFrame.setid_tipo_transaFK_IdTipoTransa(tipotransa.getId());

					if(!this.conCargarFormDetalle) {
						transaccionBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					transaccionBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoTransaForeignKey(tipotransa,1,false,true,true);
					transaccionBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					transaccionBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoTransa");
					transaccionBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoTransa");
					transaccionBeanSwingJInternalFrame.inicializarActualizarBindingTablaTransaccion(true);
					transaccionBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesTransaccion("n",transaccionBeanSwingJInternalFrame.isGuardarCambiosEnLote, transaccionBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					transaccionBeanSwingJInternalFrame.setAutoscrolls(true);
					transaccionBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						transaccionBeanSwingJInternalFrame.actualizarEstadoPanelsTransaccion("relacionado");
					} else {
						transaccionBeanSwingJInternalFrame.actualizarEstadoPanelsTransaccion("no_relacionado");
					}

					transaccionBeanSwingJInternalFrame.getjButtonRecargarInformacionTransaccion().setVisible(false);

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
