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
package com.bydan.erp.inventario.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.inventario.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.inventario.util.TipoDetalleMovimientoInventarioConstantesFunciones;

import com.bydan.erp.inventario.business.logic.*;
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
public class TipoDetalleMovimientoInventarioDetalleFormJInternalFrame extends TipoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoDetalleMovimientoInventario;
	
	protected JMenuBar jmenuBarDetalleTipoDetalleMovimientoInventario;
	
	protected JMenu jmenuDetalleTipoDetalleMovimientoInventario;
	protected JMenu jmenuDetalleArchivoTipoDetalleMovimientoInventario;
	protected JMenu jmenuDetalleAccionesTipoDetalleMovimientoInventario;
	protected JMenu jmenuDetalleDatosTipoDetalleMovimientoInventario;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoDetalleMovimientoInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoDetalleMovimientoInventario;	
	protected GridBagConstraints gridBagConstraintsTipoDetalleMovimientoInventario;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoDetalleMovimientoInventario;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoDetalleMovimientoInventarioSessionBean tipodetallemovimientoinventarioSessionBean;
	
	

	public DetalleMovimientoInventarioBeanSwingJInternalFrame detallemovimientoinventarioBeanSwingJInternalFrame=null;
	public DetalleMovimientoInventarioBeanSwingJInternalFrame detallemovimientoinventarioBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDetalleMovimientoInventario=false;
	public DetalleMovimientoInventarioSessionBean detallemovimientoinventarioSessionBean;
	
		
	
	public TipoDetalleMovimientoInventarioLogic tipodetallemovimientoinventarioLogic;
	
	public JScrollPane jScrollPanelDatosTipoDetalleMovimientoInventario;
	public JScrollPane jScrollPanelDatosEdicionTipoDetalleMovimientoInventario;
	public JScrollPane jScrollPanelDatosGeneralTipoDetalleMovimientoInventario;
	
	protected JPanel jPanelCamposTipoDetalleMovimientoInventario;    
	protected JPanel jPanelCamposOcultosTipoDetalleMovimientoInventario;    	
	protected JPanel jPanelAccionesTipoDetalleMovimientoInventario;
	protected JPanel jPanelAccionesFormularioTipoDetalleMovimientoInventario;
    
	
	
	protected Integer iXPanelCamposTipoDetalleMovimientoInventario=0;
	protected Integer iYPanelCamposTipoDetalleMovimientoInventario=0;
	
	protected Integer iXPanelCamposOcultosTipoDetalleMovimientoInventario=0;
	protected Integer iYPanelCamposOcultosTipoDetalleMovimientoInventario=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoDetalleMovimientoInventario;
	public JButton jButtonModificarTipoDetalleMovimientoInventario;
	public JButton jButtonActualizarTipoDetalleMovimientoInventario;
    public JButton jButtonEliminarTipoDetalleMovimientoInventario;
	public JButton jButtonCancelarTipoDetalleMovimientoInventario;
    public JButton jButtonGuardarCambiosTipoDetalleMovimientoInventario;
	public JButton jButtonGuardarCambiosTablaTipoDetalleMovimientoInventario;
	protected JButton jButtonCerrarTipoDetalleMovimientoInventario;
	
	
	protected JButton jButtonProcesarInformacionTipoDetalleMovimientoInventario;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoDetalleMovimientoInventario;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoDetalleMovimientoInventario;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoDetalleMovimientoInventario;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoDetalleMovimientoInventario;
	protected JButton jButtonModificarToolBarTipoDetalleMovimientoInventario;
	protected JButton jButtonActualizarToolBarTipoDetalleMovimientoInventario;
    protected JButton jButtonEliminarToolBarTipoDetalleMovimientoInventario;
	protected JButton jButtonCancelarToolBarTipoDetalleMovimientoInventario;
    protected JButton jButtonGuardarCambiosToolBarTipoDetalleMovimientoInventario;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoDetalleMovimientoInventario;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoDetalleMovimientoInventario;
	protected JButton jButtonCerrarToolBarTipoDetalleMovimientoInventario;
	
	protected JButton jButtonProcesarInformacionToolBarTipoDetalleMovimientoInventario;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoDetalleMovimientoInventario;
	protected JMenuItem jMenuItemModificarTipoDetalleMovimientoInventario;
	protected JMenuItem jMenuItemActualizarTipoDetalleMovimientoInventario;
    protected JMenuItem jMenuItemEliminarTipoDetalleMovimientoInventario;
	protected JMenuItem jMenuItemCancelarTipoDetalleMovimientoInventario;
    protected JMenuItem jMenuItemGuardarCambiosTipoDetalleMovimientoInventario;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoDetalleMovimientoInventario;
	protected JMenuItem jMenuItemCerrarTipoDetalleMovimientoInventario;
	protected JMenuItem jMenuItemDetalleCerrarTipoDetalleMovimientoInventario;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoDetalleMovimientoInventario;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoDetalleMovimientoInventario;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoDetalleMovimientoInventario;
	protected JMenuItem jMenuItemMostrarOcultarTipoDetalleMovimientoInventario;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoDetalleMovimientoInventario;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoDetalleMovimientoInventario;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoDetalleMovimientoInventario;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoDetalleMovimientoInventario;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoDetalleMovimientoInventario;
	public JLabel jLabelIdTipoDetalleMovimientoInventario;
	public JTextFieldMe jTextFieldidTipoDetalleMovimientoInventario;
	public JButton jButtonidTipoDetalleMovimientoInventarioBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoDetalleMovimientoInventario;
	public JLabel jLabelcodigoTipoDetalleMovimientoInventario;
	public JTextField jTextFieldcodigoTipoDetalleMovimientoInventario;
	public JButton jButtoncodigoTipoDetalleMovimientoInventarioBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoDetalleMovimientoInventario;
	public JLabel jLabelnombreTipoDetalleMovimientoInventario;
	public JTextField jTextFieldnombreTipoDetalleMovimientoInventario;
	public JButton jButtonnombreTipoDetalleMovimientoInventarioBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoDetalleMovimientoInventario;
	
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
	
	public TipoDetalleMovimientoInventarioDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoDetalleMovimientoInventario=new JPanel();
				this.jPanelAccionesFormularioTipoDetalleMovimientoInventario=new JPanel();
				this.jmenuBarDetalleTipoDetalleMovimientoInventario=new JMenuBar();
				this.jTtoolBarDetalleTipoDetalleMovimientoInventario=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDetalleMovimientoInventarioDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoDetalleMovimientoInventario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoDetalleMovimientoInventarioDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoDetalleMovimientoInventario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDetalleMovimientoInventarioDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoDetalleMovimientoInventario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDetalleMovimientoInventarioDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoDetalleMovimientoInventario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDetalleMovimientoInventarioDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoDetalleMovimientoInventario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoDetalleMovimientoInventario() {
		return this.jButtonActualizarToolBarTipoDetalleMovimientoInventario;
	}
	
	public JButton getjButtonEliminarToolBarTipoDetalleMovimientoInventario() {
		return this.jButtonEliminarToolBarTipoDetalleMovimientoInventario;
	}
	
	public JButton getjButtonCancelarToolBarTipoDetalleMovimientoInventario() {
		return this.jButtonCancelarToolBarTipoDetalleMovimientoInventario;
	}		
	
	public JButton getjButtonProcesarInformacionTipoDetalleMovimientoInventario() {
		return this.jButtonProcesarInformacionTipoDetalleMovimientoInventario;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoDetalleMovimientoInventario)	{
		this.jButtonProcesarInformacionTipoDetalleMovimientoInventario = jButtonProcesarInformacionTipoDetalleMovimientoInventario;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoDetalleMovimientoInventario() {
		return this.jComboBoxTiposAccionesTipoDetalleMovimientoInventario;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoDetalleMovimientoInventario(
			JComboBox jComboBoxTiposRelacionesTipoDetalleMovimientoInventario) {
		this.jComboBoxTiposRelacionesTipoDetalleMovimientoInventario = jComboBoxTiposRelacionesTipoDetalleMovimientoInventario;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoDetalleMovimientoInventario(
			JComboBox jComboBoxTiposAccionesTipoDetalleMovimientoInventario) {
		this.jComboBoxTiposAccionesTipoDetalleMovimientoInventario = jComboBoxTiposAccionesTipoDetalleMovimientoInventario;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoDetalleMovimientoInventario() {
		return this.jComboBoxTiposAccionesFormularioTipoDetalleMovimientoInventario;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoDetalleMovimientoInventario(
			JComboBox jComboBoxTiposAccionesFormularioTipoDetalleMovimientoInventario) {
		this.jComboBoxTiposAccionesFormularioTipoDetalleMovimientoInventario = jComboBoxTiposAccionesFormularioTipoDetalleMovimientoInventario;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipodetallemovimientoinventarioSessionBean=new TipoDetalleMovimientoInventarioSessionBean();
		
		this.tipodetallemovimientoinventarioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipodetallemovimientoinventarioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.detallemovimientoinventarioSessionBean=new DetalleMovimientoInventarioSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoDetalleMovimientoInventarioJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoDetalleMovimientoInventarioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoDetalleMovimientoInventarioJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Costo MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoDetalleMovimientoInventarioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoDetalleMovimientoInventario= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoDetalleMovimientoInventario=new JButtonMe();
				this.jButtonModificarToolBarTipoDetalleMovimientoInventario=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoDetalleMovimientoInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoDetalleMovimientoInventario,this.jTtoolBarDetalleTipoDetalleMovimientoInventario,
							"actualizar","actualizar","Actualizar"+" "+TipoDetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoDetalleMovimientoInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoDetalleMovimientoInventario,this.jTtoolBarDetalleTipoDetalleMovimientoInventario,
							"eliminar","eliminar","Eliminar"+" "+TipoDetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoDetalleMovimientoInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoDetalleMovimientoInventario,this.jTtoolBarDetalleTipoDetalleMovimientoInventario,
							"cancelar","cancelar","Cancelar"+" "+TipoDetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoDetalleMovimientoInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoDetalleMovimientoInventario,this.jTtoolBarDetalleTipoDetalleMovimientoInventario,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoDetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoDetalleMovimientoInventario=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoDetalleMovimientoInventario=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoDetalleMovimientoInventario=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoDetalleMovimientoInventario=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoDetalleMovimientoInventario=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoDetalleMovimientoInventario= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoDetalleMovimientoInventario.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoDetalleMovimientoInventario,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoDetalleMovimientoInventario= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoDetalleMovimientoInventario.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoDetalleMovimientoInventario,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoDetalleMovimientoInventario= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoDetalleMovimientoInventario.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoDetalleMovimientoInventario,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoDetalleMovimientoInventario= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoDetalleMovimientoInventario.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoDetalleMovimientoInventario,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoDetalleMovimientoInventario= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoDetalleMovimientoInventario.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoDetalleMovimientoInventario,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoDetalleMovimientoInventario= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoDetalleMovimientoInventario.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoDetalleMovimientoInventario,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoDetalleMovimientoInventario= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoDetalleMovimientoInventario.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoDetalleMovimientoInventario,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoDetalleMovimientoInventario= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoDetalleMovimientoInventario.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoDetalleMovimientoInventario,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoDetalleMovimientoInventario= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoDetalleMovimientoInventario.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoDetalleMovimientoInventario,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoDetalleMovimientoInventario= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoDetalleMovimientoInventario.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoDetalleMovimientoInventario,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoDetalleMovimientoInventario.add(this.jMenuItemDetalleCerrarTipoDetalleMovimientoInventario);
		
		this.jmenuDetalleAccionesTipoDetalleMovimientoInventario.add(this.jMenuItemActualizarTipoDetalleMovimientoInventario);
		this.jmenuDetalleAccionesTipoDetalleMovimientoInventario.add(this.jMenuItemEliminarTipoDetalleMovimientoInventario);
		this.jmenuDetalleAccionesTipoDetalleMovimientoInventario.add(this.jMenuItemCancelarTipoDetalleMovimientoInventario);		
		
		//this.jmenuDetalleDatosTipoDetalleMovimientoInventario.add(this.jMenuItemDetalleAbrirOrderByTipoDetalleMovimientoInventario);				
		this.jmenuDetalleDatosTipoDetalleMovimientoInventario.add(this.jMenuItemDetalleMostarOcultarTipoDetalleMovimientoInventario);				
				
		//this.jmenuDetalleAccionesTipoDetalleMovimientoInventario.add(this.jMenuItemGuardarCambiosTipoDetalleMovimientoInventario);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoDetalleMovimientoInventario.add(this.jmenuDetalleArchivoTipoDetalleMovimientoInventario);		
		this.jmenuBarDetalleTipoDetalleMovimientoInventario.add(this.jmenuDetalleAccionesTipoDetalleMovimientoInventario);		
		this.jmenuBarDetalleTipoDetalleMovimientoInventario.add(this.jmenuDetalleDatosTipoDetalleMovimientoInventario);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTipoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTipoDetalleMovimientoInventario.add(this.jmenuDetalleTipoDetalleMovimientoInventario);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoDetalleMovimientoInventario);				
	}
	
	
	public void inicializarElementosCamposTipoDetalleMovimientoInventario() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoDetalleMovimientoInventario = new JLabelMe();
		jLabelIdTipoDetalleMovimientoInventario.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoDetalleMovimientoInventario = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoDetalleMovimientoInventario.setToolTipText(TipoDetalleMovimientoInventarioConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoDetalleMovimientoInventario= new GridBagLayout();

		this.jPanelidTipoDetalleMovimientoInventario.setLayout(this.gridaBagLayoutTipoDetalleMovimientoInventario);

		jTextFieldidTipoDetalleMovimientoInventario = new JTextFieldMe();
		jTextFieldidTipoDetalleMovimientoInventario.setText("Id");

		jTextFieldidTipoDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoDetalleMovimientoInventario = new JLabelMe();
		this.jLabelcodigoTipoDetalleMovimientoInventario.setText(""+TipoDetalleMovimientoInventarioConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoDetalleMovimientoInventario.setToolTipText("Codigo");
		this.jLabelcodigoTipoDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoDetalleMovimientoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoDetalleMovimientoInventario.setToolTipText(TipoDetalleMovimientoInventarioConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoDetalleMovimientoInventario = new GridBagLayout();
		this.jPanelcodigoTipoDetalleMovimientoInventario.setLayout(this.gridaBagLayoutTipoDetalleMovimientoInventario);


		jTextFieldcodigoTipoDetalleMovimientoInventario= new JTextFieldMe();

		jTextFieldcodigoTipoDetalleMovimientoInventario.setEnabled(false);
		jTextFieldcodigoTipoDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoDetalleMovimientoInventarioBusqueda= new JButtonMe();
		this.jButtoncodigoTipoDetalleMovimientoInventarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoDetalleMovimientoInventarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoDetalleMovimientoInventarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoDetalleMovimientoInventarioBusqueda.setText("U");
		this.jButtoncodigoTipoDetalleMovimientoInventarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoDetalleMovimientoInventarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoDetalleMovimientoInventarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoDetalleMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoDetalleMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoDetalleMovimientoInventarioBusqueda"));

		if(this.tipodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoDetalleMovimientoInventarioBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoDetalleMovimientoInventario = new JLabelMe();
		this.jLabelnombreTipoDetalleMovimientoInventario.setText(""+TipoDetalleMovimientoInventarioConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoDetalleMovimientoInventario.setToolTipText("Nombre");
		this.jLabelnombreTipoDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoDetalleMovimientoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoDetalleMovimientoInventario.setToolTipText(TipoDetalleMovimientoInventarioConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoDetalleMovimientoInventario = new GridBagLayout();
		this.jPanelnombreTipoDetalleMovimientoInventario.setLayout(this.gridaBagLayoutTipoDetalleMovimientoInventario);


		jTextFieldnombreTipoDetalleMovimientoInventario= new JTextFieldMe();

		jTextFieldnombreTipoDetalleMovimientoInventario.setEnabled(false);
		jTextFieldnombreTipoDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreTipoDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreTipoDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombreTipoDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombreTipoDetalleMovimientoInventarioBusqueda= new JButtonMe();
		this.jButtonnombreTipoDetalleMovimientoInventarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoDetalleMovimientoInventarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoDetalleMovimientoInventarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoDetalleMovimientoInventarioBusqueda.setText("U");
		this.jButtonnombreTipoDetalleMovimientoInventarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoDetalleMovimientoInventarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoDetalleMovimientoInventarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombreTipoDetalleMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombreTipoDetalleMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoDetalleMovimientoInventarioBusqueda"));

		if(this.tipodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoDetalleMovimientoInventarioBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoDetalleMovimientoInventario() {
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
		//this.jInternalFrameDetalleTipoDetalleMovimientoInventario = new TipoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Costo DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoDetalleMovimientoInventario= new GridBagLayout();
		

		
		String sToolTipTipoDetalleMovimientoInventario="";
		sToolTipTipoDetalleMovimientoInventario=TipoDetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoDetalleMovimientoInventario+="(Inventario.TipoDetalleMovimientoInventario)";
		}
		
		if(!this.tipodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoDetalleMovimientoInventario+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoDetalleMovimientoInventario = new JButtonMe();
		this.jButtonModificarTipoDetalleMovimientoInventario = new JButtonMe();
        this.jButtonActualizarTipoDetalleMovimientoInventario = new JButtonMe();
        this.jButtonEliminarTipoDetalleMovimientoInventario = new JButtonMe();
        this.jButtonCancelarTipoDetalleMovimientoInventario = new JButtonMe();
        this.jButtonGuardarCambiosTipoDetalleMovimientoInventario = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoDetalleMovimientoInventario = new JButtonMe();
		this.jButtonCerrarTipoDetalleMovimientoInventario = new JButtonMe();
		
		this.jScrollPanelDatosTipoDetalleMovimientoInventario = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoDetalleMovimientoInventario = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoDetalleMovimientoInventario = new JScrollPane();
				
		
		
		this.jPanelCamposTipoDetalleMovimientoInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoDetalleMovimientoInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoDetalleMovimientoInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoDetalleMovimientoInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Costo";
		
		if(!this.tipodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoDetalleMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Costos" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoDetalleMovimientoInventario.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoDetalleMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoDetalleMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoDetalleMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoDetalleMovimientoInventario.setName("jPanelCamposTipoDetalleMovimientoInventario"); 

		this.jPanelCamposOcultosTipoDetalleMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoDetalleMovimientoInventario.setName("jPanelCamposOcultosTipoDetalleMovimientoInventario"); 

        this.jPanelAccionesTipoDetalleMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoDetalleMovimientoInventario.setToolTipText("Acciones");
        this.jPanelAccionesTipoDetalleMovimientoInventario.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoDetalleMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoDetalleMovimientoInventario.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoDetalleMovimientoInventario.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoDetalleMovimientoInventario.setText("Nuevo");
		this.jButtonModificarTipoDetalleMovimientoInventario.setText("Editar");
        this.jButtonActualizarTipoDetalleMovimientoInventario.setText("Actualizar");
        this.jButtonEliminarTipoDetalleMovimientoInventario.setText("Eliminar");
        this.jButtonCancelarTipoDetalleMovimientoInventario.setText("Cancelar");
        this.jButtonGuardarCambiosTipoDetalleMovimientoInventario.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoDetalleMovimientoInventario.setText("Guardar");
		this.jButtonCerrarTipoDetalleMovimientoInventario.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoDetalleMovimientoInventario,"nuevo_button","Nuevo",this.tipodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoDetalleMovimientoInventario,"modificar_button","Editar",this.tipodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoDetalleMovimientoInventario,"actualizar_button","Actualizar",this.tipodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoDetalleMovimientoInventario,"eliminar_button","Eliminar",this.tipodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoDetalleMovimientoInventario,"cancelar_button","Cancelar",this.tipodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoDetalleMovimientoInventario,"guardarcambios_button","Guardar",this.tipodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoDetalleMovimientoInventario,"guardarcambiostabla_button","Guardar",this.tipodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoDetalleMovimientoInventario,"cerrar_button","Salir",this.tipodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoDetalleMovimientoInventario.setToolTipText("Nuevo"+" "+TipoDetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoDetalleMovimientoInventario.setToolTipText("Editar"+" "+TipoDetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoDetalleMovimientoInventario.setToolTipText("Actualizar"+" "+TipoDetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoDetalleMovimientoInventario.setToolTipText("Eliminar)"+" "+TipoDetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoDetalleMovimientoInventario.setToolTipText("Cancelar"+" "+TipoDetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoDetalleMovimientoInventario.setToolTipText("Guardar"+" "+TipoDetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoDetalleMovimientoInventario.setToolTipText("Guardar"+" "+TipoDetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoDetalleMovimientoInventario.setToolTipText("Salir"+" "+TipoDetalleMovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoDetalleMovimientoInventario";
		inputMap = this.jButtonNuevoTipoDetalleMovimientoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoDetalleMovimientoInventario.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoDetalleMovimientoInventario"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoDetalleMovimientoInventario";
		inputMap = this.jButtonActualizarTipoDetalleMovimientoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoDetalleMovimientoInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoDetalleMovimientoInventario"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoDetalleMovimientoInventario";
		inputMap = this.jButtonEliminarTipoDetalleMovimientoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoDetalleMovimientoInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoDetalleMovimientoInventario"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoDetalleMovimientoInventario";
		inputMap = this.jButtonCancelarTipoDetalleMovimientoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoDetalleMovimientoInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoDetalleMovimientoInventario"));
		
		//CERRAR		
		sMapKey = "CerrarTipoDetalleMovimientoInventario";
		inputMap = this.jButtonCerrarTipoDetalleMovimientoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoDetalleMovimientoInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoDetalleMovimientoInventario"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoDetalleMovimientoInventario";
		inputMap = this.jButtonGuardarCambiosTablaTipoDetalleMovimientoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoDetalleMovimientoInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoDetalleMovimientoInventario"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoDetalleMovimientoInventario = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoDetalleMovimientoInventario.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoDetalleMovimientoInventario.setToolTipText("Nuevo TipoDetalleMovimientoInventario");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoDetalleMovimientoInventario = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoDetalleMovimientoInventario.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoDetalleMovimientoInventario.setToolTipText("Sin Cerrar Ventana TipoDetalleMovimientoInventario");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoDetalleMovimientoInventario = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoDetalleMovimientoInventario.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoDetalleMovimientoInventario.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoDetalleMovimientoInventario = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoDetalleMovimientoInventario.setText("Accion");
		this.jComboBoxTiposAccionesTipoDetalleMovimientoInventario.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoDetalleMovimientoInventario = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoDetalleMovimientoInventario.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoDetalleMovimientoInventario.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoDetalleMovimientoInventario = new JLabelMe();
		
		this.jLabelAccionesTipoDetalleMovimientoInventario.setText("Acciones");		
		this.jLabelAccionesTipoDetalleMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoDetalleMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoDetalleMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoDetalleMovimientoInventario();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoDetalleMovimientoInventario();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoDetalleMovimientoInventario=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoDetalleMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoDetalleMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoDetalleMovimientoInventario.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoDetalleMovimientoInventario.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoDetalleMovimientoInventario.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoDetalleMovimientoInventario.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoDetalleMovimientoInventario.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoDetalleMovimientoInventario.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoDetalleMovimientoInventario = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoDetalleMovimientoInventario = new GridBagLayout();
		
		this.jPanelCamposTipoDetalleMovimientoInventario.setLayout(gridaBagLayoutCamposTipoDetalleMovimientoInventario);
		this.jPanelCamposOcultosTipoDetalleMovimientoInventario.setLayout(gridaBagLayoutCamposOcultosTipoDetalleMovimientoInventario);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsTipoDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDetalleMovimientoInventario.gridy = 0;
	this.gridBagConstraintsTipoDetalleMovimientoInventario.gridx = 0;
	this.gridBagConstraintsTipoDetalleMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsTipoDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoDetalleMovimientoInventario.add(jLabelIdTipoDetalleMovimientoInventario, this.gridBagConstraintsTipoDetalleMovimientoInventario);



	this.gridBagConstraintsTipoDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsTipoDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDetalleMovimientoInventario.gridy = 0;
	this.gridBagConstraintsTipoDetalleMovimientoInventario.gridx = 1;
	this.gridBagConstraintsTipoDetalleMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsTipoDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoDetalleMovimientoInventario.add(jTextFieldidTipoDetalleMovimientoInventario, this.gridBagConstraintsTipoDetalleMovimientoInventario);


	this.gridBagConstraintsTipoDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsTipoDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDetalleMovimientoInventario.gridy = 0;
	this.gridBagConstraintsTipoDetalleMovimientoInventario.gridx = 0;
	this.gridBagConstraintsTipoDetalleMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsTipoDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoDetalleMovimientoInventario.add(jLabelcodigoTipoDetalleMovimientoInventario, this.gridBagConstraintsTipoDetalleMovimientoInventario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoDetalleMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsTipoDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDetalleMovimientoInventario.gridy = 0;
		this.gridBagConstraintsTipoDetalleMovimientoInventario.gridx = 2;
		this.gridBagConstraintsTipoDetalleMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsTipoDetalleMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoDetalleMovimientoInventario.add(jButtoncodigoTipoDetalleMovimientoInventarioBusqueda, this.gridBagConstraintsTipoDetalleMovimientoInventario);
	}

	this.gridBagConstraintsTipoDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsTipoDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDetalleMovimientoInventario.gridy = 0;
	this.gridBagConstraintsTipoDetalleMovimientoInventario.gridx = 1;
	this.gridBagConstraintsTipoDetalleMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsTipoDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoDetalleMovimientoInventario.add(jTextFieldcodigoTipoDetalleMovimientoInventario, this.gridBagConstraintsTipoDetalleMovimientoInventario);


	this.gridBagConstraintsTipoDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsTipoDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDetalleMovimientoInventario.gridy = 0;
	this.gridBagConstraintsTipoDetalleMovimientoInventario.gridx = 0;
	this.gridBagConstraintsTipoDetalleMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsTipoDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoDetalleMovimientoInventario.add(jLabelnombreTipoDetalleMovimientoInventario, this.gridBagConstraintsTipoDetalleMovimientoInventario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoDetalleMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsTipoDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDetalleMovimientoInventario.gridy = 0;
		this.gridBagConstraintsTipoDetalleMovimientoInventario.gridx = 2;
		this.gridBagConstraintsTipoDetalleMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsTipoDetalleMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoDetalleMovimientoInventario.add(jButtonnombreTipoDetalleMovimientoInventarioBusqueda, this.gridBagConstraintsTipoDetalleMovimientoInventario);
	}

	this.gridBagConstraintsTipoDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsTipoDetalleMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDetalleMovimientoInventario.gridy = 0;
	this.gridBagConstraintsTipoDetalleMovimientoInventario.gridx = 1;
	this.gridBagConstraintsTipoDetalleMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsTipoDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoDetalleMovimientoInventario.add(jTextFieldnombreTipoDetalleMovimientoInventario, this.gridBagConstraintsTipoDetalleMovimientoInventario);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsTipoDetalleMovimientoInventario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoDetalleMovimientoInventario.gridy = iYPanelCamposTipoDetalleMovimientoInventario;
	this.gridBagConstraintsTipoDetalleMovimientoInventario.gridx = iXPanelCamposTipoDetalleMovimientoInventario++;
	this.gridBagConstraintsTipoDetalleMovimientoInventario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoDetalleMovimientoInventario.add(this.jPanelidTipoDetalleMovimientoInventario, this.gridBagConstraintsTipoDetalleMovimientoInventario);



	if(iXPanelCamposTipoDetalleMovimientoInventario % 1==0) {
		iXPanelCamposTipoDetalleMovimientoInventario=0;
		iYPanelCamposTipoDetalleMovimientoInventario++;
	}
	this.gridBagConstraintsTipoDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsTipoDetalleMovimientoInventario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoDetalleMovimientoInventario.gridy = iYPanelCamposTipoDetalleMovimientoInventario;
	this.gridBagConstraintsTipoDetalleMovimientoInventario.gridx = iXPanelCamposTipoDetalleMovimientoInventario++;
	this.gridBagConstraintsTipoDetalleMovimientoInventario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoDetalleMovimientoInventario.add(this.jPanelcodigoTipoDetalleMovimientoInventario, this.gridBagConstraintsTipoDetalleMovimientoInventario);



	if(iXPanelCamposTipoDetalleMovimientoInventario % 1==0) {
		iXPanelCamposTipoDetalleMovimientoInventario=0;
		iYPanelCamposTipoDetalleMovimientoInventario++;
	}
	this.gridBagConstraintsTipoDetalleMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsTipoDetalleMovimientoInventario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoDetalleMovimientoInventario.gridy = iYPanelCamposTipoDetalleMovimientoInventario;
	this.gridBagConstraintsTipoDetalleMovimientoInventario.gridx = iXPanelCamposTipoDetalleMovimientoInventario++;
	this.gridBagConstraintsTipoDetalleMovimientoInventario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoDetalleMovimientoInventario.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoDetalleMovimientoInventario.add(this.jPanelnombreTipoDetalleMovimientoInventario, this.gridBagConstraintsTipoDetalleMovimientoInventario);



	if(iXPanelCamposTipoDetalleMovimientoInventario % 1==0) {
		iXPanelCamposTipoDetalleMovimientoInventario=0;
		iYPanelCamposTipoDetalleMovimientoInventario++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoDetalleMovimientoInventario= new GridBagLayout();
		this.jPanelAccionesTipoDetalleMovimientoInventario.setLayout(gridaBagLayoutAccionesTipoDetalleMovimientoInventario);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoDetalleMovimientoInventario= new GridBagLayout();
		this.jPanelAccionesFormularioTipoDetalleMovimientoInventario.setLayout(gridaBagLayoutAccionesFormularioTipoDetalleMovimientoInventario);
		
		this.gridBagConstraintsTipoDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsTipoDetalleMovimientoInventario.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoDetalleMovimientoInventario.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoDetalleMovimientoInventario.add(this.jComboBoxTiposAccionesFormularioTipoDetalleMovimientoInventario, this.gridBagConstraintsTipoDetalleMovimientoInventario);

		this.gridBagConstraintsTipoDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsTipoDetalleMovimientoInventario.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoDetalleMovimientoInventario.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoDetalleMovimientoInventario.add(this.jCheckBoxPostAccionNuevoTipoDetalleMovimientoInventario, this.gridBagConstraintsTipoDetalleMovimientoInventario);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipodetallemovimientoinventarioSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsTipoDetalleMovimientoInventario.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoDetalleMovimientoInventario.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoDetalleMovimientoInventario.add(this.jCheckBoxPostAccionSinCerrarTipoDetalleMovimientoInventario, this.gridBagConstraintsTipoDetalleMovimientoInventario);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipodetallemovimientoinventarioSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsTipoDetalleMovimientoInventario.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoDetalleMovimientoInventario.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoDetalleMovimientoInventario.add(this.jCheckBoxPostAccionSinMensajeTipoDetalleMovimientoInventario, this.gridBagConstraintsTipoDetalleMovimientoInventario);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsTipoDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDetalleMovimientoInventario.gridy = 0;
		this.gridBagConstraintsTipoDetalleMovimientoInventario.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoDetalleMovimientoInventario.add(this.jButtonModificarTipoDetalleMovimientoInventario, this.gridBagConstraintsTipoDetalleMovimientoInventario);							

		this.gridBagConstraintsTipoDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsTipoDetalleMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDetalleMovimientoInventario.gridy = 0;
		this.gridBagConstraintsTipoDetalleMovimientoInventario.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoDetalleMovimientoInventario.add(this.jButtonEliminarTipoDetalleMovimientoInventario, this.gridBagConstraintsTipoDetalleMovimientoInventario);
		
			
		this.gridBagConstraintsTipoDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsTipoDetalleMovimientoInventario.gridy = 0;		
		this.gridBagConstraintsTipoDetalleMovimientoInventario.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoDetalleMovimientoInventario.add(this.jButtonActualizarTipoDetalleMovimientoInventario, this.gridBagConstraintsTipoDetalleMovimientoInventario);


		this.gridBagConstraintsTipoDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsTipoDetalleMovimientoInventario.gridy = 0;		
		this.gridBagConstraintsTipoDetalleMovimientoInventario.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoDetalleMovimientoInventario.add(this.jButtonGuardarCambiosTipoDetalleMovimientoInventario, this.gridBagConstraintsTipoDetalleMovimientoInventario);	
		
		this.gridBagConstraintsTipoDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsTipoDetalleMovimientoInventario.gridy = 0;		
		this.gridBagConstraintsTipoDetalleMovimientoInventario.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoDetalleMovimientoInventario.add(this.jButtonCancelarTipoDetalleMovimientoInventario, this.gridBagConstraintsTipoDetalleMovimientoInventario);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoDetalleMovimientoInventario = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoDetalleMovimientoInventario);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipodetallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoDetalleMovimientoInventario = new GridBagConstraints();						
			this.gridBagConstraintsTipoDetalleMovimientoInventario.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoDetalleMovimientoInventario.gridx = 0;		
			//this.gridBagConstraintsTipoDetalleMovimientoInventario.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDetalleMovimientoInventario.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoDetalleMovimientoInventario.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsTipoDetalleMovimientoInventario.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoDetalleMovimientoInventario.gridx =0;
		this.gridBagConstraintsTipoDetalleMovimientoInventario.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoDetalleMovimientoInventario.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoDetalleMovimientoInventario, this.gridBagConstraintsTipoDetalleMovimientoInventario);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoDetalleMovimientoInventarioJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoDetalleMovimientoInventario = new TipoDetalleMovimientoInventarioBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Costo DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Costo DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Costo Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoDetalleMovimientoInventarioModel tipodetallemovimientoinventarioModel=new TipoDetalleMovimientoInventarioModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoDetalleMovimientoInventarioModel.TipoDetalleMovimientoInventarioFocusTraversalPolicy tipodetallemovimientoinventarioFocusTraversalPolicy = tipodetallemovimientoinventarioModel.new TipoDetalleMovimientoInventarioFocusTraversalPolicy(this);
			
			//tipodetallemovimientoinventarioFocusTraversalPolicy.settipodetallemovimientoinventarioJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipodetallemovimientoinventarioModel);
			
			
			this.jContentPaneDetalleTipoDetalleMovimientoInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoDetalleMovimientoInventario = new GridBagLayout();	
			this.jContentPaneDetalleTipoDetalleMovimientoInventario.setLayout(gridaBagLayoutDetalleTipoDetalleMovimientoInventario);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoDetalleMovimientoInventario = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoDetalleMovimientoInventario = new GridBagConstraints();
				this.gridBagConstraintsTipoDetalleMovimientoInventario.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoDetalleMovimientoInventario.gridx = 0;
					
				
				this.jContentPaneDetalleTipoDetalleMovimientoInventario.add(jTtoolBarDetalleTipoDetalleMovimientoInventario, gridBagConstraintsTipoDetalleMovimientoInventario);								
				
}
			
			this.jScrollPanelDatosEdicionTipoDetalleMovimientoInventario=   new JScrollPane(jContentPaneDetalleTipoDetalleMovimientoInventario,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoDetalleMovimientoInventario.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoDetalleMovimientoInventario.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoDetalleMovimientoInventario.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoDetalleMovimientoInventario=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoDetalleMovimientoInventario.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoDetalleMovimientoInventario.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoDetalleMovimientoInventario.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoDetalleMovimientoInventario = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoDetalleMovimientoInventario.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoDetalleMovimientoInventario.gridx = 0;
	        
			this.jContentPaneDetalleTipoDetalleMovimientoInventario.add(jPanelCamposTipoDetalleMovimientoInventario, gridBagConstraintsTipoDetalleMovimientoInventario);
			
			
			
			
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
						&& tipodetallemovimientoinventarioSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameDetalleMovimientoInventario(this.puedeCargarPorParteDetalleMovimientoInventario,false,-1);
					
					if(this.tipodetallemovimientoinventarioSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoDetalleMovimientoInventario= new GridBagConstraints();
						this.gridBagConstraintsTipoDetalleMovimientoInventario.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoDetalleMovimientoInventario.gridx = 0;
						this.jContentPaneDetalleTipoDetalleMovimientoInventario.add(this.jTabbedPaneRelacionesTipoDetalleMovimientoInventario, this.gridBagConstraintsTipoDetalleMovimientoInventario);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoDetalleMovimientoInventario.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameDetalleMovimientoInventario(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoDetalleMovimientoInventario.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoDetalleMovimientoInventario = new GridBagConstraints();
					this.gridBagConstraintsTipoDetalleMovimientoInventario.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoDetalleMovimientoInventario.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoDetalleMovimientoInventario.gridx = 0;
					
				
					this.jContentPaneDetalleTipoDetalleMovimientoInventario.add(jPanelCamposOcultosTipoDetalleMovimientoInventario, gridBagConstraintsTipoDetalleMovimientoInventario);
				
					this.jPanelCamposOcultosTipoDetalleMovimientoInventario.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsTipoDetalleMovimientoInventario.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsTipoDetalleMovimientoInventario.gridx = 0;
	        this.gridBagConstraintsTipoDetalleMovimientoInventario.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoDetalleMovimientoInventario.add(this.jPanelAccionesFormularioTipoDetalleMovimientoInventario, this.gridBagConstraintsTipoDetalleMovimientoInventario);							
			
			
			
			this.gridBagConstraintsTipoDetalleMovimientoInventario = new GridBagConstraints();
	        this.gridBagConstraintsTipoDetalleMovimientoInventario.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsTipoDetalleMovimientoInventario.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoDetalleMovimientoInventario.add(this.jPanelAccionesTipoDetalleMovimientoInventario, this.gridBagConstraintsTipoDetalleMovimientoInventario);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoDetalleMovimientoInventario);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoDetalleMovimientoInventario=   new JScrollPane(this.jPanelCamposTipoDetalleMovimientoInventario,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoDetalleMovimientoInventario.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoDetalleMovimientoInventario.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoDetalleMovimientoInventario.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsTipoDetalleMovimientoInventario.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoDetalleMovimientoInventario.gridx = 0;
			this.gridBagConstraintsTipoDetalleMovimientoInventario.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoDetalleMovimientoInventario.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoDetalleMovimientoInventario.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoDetalleMovimientoInventario, this.gridBagConstraintsTipoDetalleMovimientoInventario);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsTipoDetalleMovimientoInventario.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoDetalleMovimientoInventario.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoDetalleMovimientoInventario, this.gridBagConstraintsTipoDetalleMovimientoInventario);			
			
			this.gridBagConstraintsTipoDetalleMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsTipoDetalleMovimientoInventario.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoDetalleMovimientoInventario.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoDetalleMovimientoInventario, this.gridBagConstraintsTipoDetalleMovimientoInventario);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsTipoDetalleMovimientoInventario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDetalleMovimientoInventario.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoDetalleMovimientoInventario, this.gridBagConstraintsTipoDetalleMovimientoInventario);
			
			
		this.gridBagConstraintsTipoDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsTipoDetalleMovimientoInventario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDetalleMovimientoInventario.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoDetalleMovimientoInventario, this.gridBagConstraintsTipoDetalleMovimientoInventario);
		
			
		this.gridBagConstraintsTipoDetalleMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsTipoDetalleMovimientoInventario.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoDetalleMovimientoInventario.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoDetalleMovimientoInventario, this.gridBagConstraintsTipoDetalleMovimientoInventario);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoDetalleMovimientoInventario;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoDetalleMovimientoInventario;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameDetalleMovimientoInventario(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.detallemovimientoinventarioSessionBean=new DetalleMovimientoInventarioSessionBean();
		this.detallemovimientoinventarioSessionBean.setConGuardarRelaciones(false);
		this.detallemovimientoinventarioSessionBean.setEsGuardarRelacionado(true);

		this.detallemovimientoinventarioBeanSwingJInternalFrame=null;//new DetalleMovimientoInventarioBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.detallemovimientoinventarioBeanSwingJInternalFramePopup=new DetalleMovimientoInventarioBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.detallemovimientoinventarioBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.detallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {

				DetalleMovimientoInventarioJInternalFrame.STIPO_TAMANIO_GENERAL=TipoDetalleMovimientoInventarioJInternalFrame.STIPO_TAMANIO_GENERAL;
				DetalleMovimientoInventarioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoDetalleMovimientoInventarioJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.detallemovimientoinventarioSessionBean.setEsGuardarRelacionado(true);

				this.detallemovimientoinventarioBeanSwingJInternalFrame=new DetalleMovimientoInventarioBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.detallemovimientoinventarioBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.detallemovimientoinventarioBeanSwingJInternalFrame.setdetallemovimientoinventarioSessionBean(this.detallemovimientoinventarioSessionBean);

				//this.gridBagConstraintsTipoDetalleMovimientoInventario = new GridBagConstraints();
				//this.gridBagConstraintsTipoDetalleMovimientoInventario.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoDetalleMovimientoInventario.gridx = 0;
				//this.jContentPaneDetalleTipoDetalleMovimientoInventario.add(this.detallemovimientoinventarioBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoDetalleMovimientoInventario);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoDetalleMovimientoInventario.add("Detalle Movimiento Inventarios",this.detallemovimientoinventarioBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoDetalleMovimientoInventario.setComponentAt(iIndexTab,this.detallemovimientoinventarioBeanSwingJInternalFrame.getContentPane());
				}

				//DetalleMovimientoInventarioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.detallemovimientoinventarioSessionBean.setEsGuardarRelacionado(false);
				this.detallemovimientoinventarioBeanSwingJInternalFrame=null;//new DetalleMovimientoInventarioBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.detallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDetalleMovimientoInventario) {
					this.jTabbedPaneRelacionesTipoDetalleMovimientoInventario.add("Detalle Movimiento Inventarios",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarDetalleMovimientoInventarioBeanSwingJInternalFrame(List<TipoDetalleMovimientoInventario> tipodetallemovimientoinventarios,TipoDetalleMovimientoInventario tipodetallemovimientoinventario,DetalleMovimientoInventarioBeanSwingJInternalFrame detallemovimientoinventarioBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//detallemovimientoinventarioBeanSwingJInternalFrame=new DetalleMovimientoInventarioBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					detallemovimientoinventarioBeanSwingJInternalFrame.getDetalleMovimientoInventarioLogic().setConnexion(this.tipodetallemovimientoinventarioLogic.getConnexion());

					detallemovimientoinventarioBeanSwingJInternalFrame.settipodetallemovimientoinventariosForeignKey(tipodetallemovimientoinventarios);
					detallemovimientoinventarioBeanSwingJInternalFrame.settipodetallemovimientoinventarioForeignKey(tipodetallemovimientoinventario);
					detallemovimientoinventarioBeanSwingJInternalFrame.detallemovimientoinventarioSessionBean.setisBusquedaDesdeForeignKeySesionTipoDetalleMovimientoInventario(true);
					detallemovimientoinventarioBeanSwingJInternalFrame.detallemovimientoinventarioSessionBean.setlidTipoDetalleMovimientoInventarioActual(tipodetallemovimientoinventario.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					detallemovimientoinventarioBeanSwingJInternalFrame.cargarCombosForeignKeyDetalleMovimientoInventario(detallemovimientoinventarioBeanSwingJInternalFrame.isCargarCombosDependencia);
					detallemovimientoinventarioBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoDetalleMovimientoInventario(true);
					detallemovimientoinventarioBeanSwingJInternalFrame.setid_tipo_detalle_movimiento_inventarioFK_IdTipoDetalleMovimientoInventario(tipodetallemovimientoinventario.getId());

					if(!this.conCargarFormDetalle) {
						detallemovimientoinventarioBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					detallemovimientoinventarioBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoDetalleMovimientoInventarioForeignKey(tipodetallemovimientoinventario,1,false,true,true);
					detallemovimientoinventarioBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					detallemovimientoinventarioBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoDetalleMovimientoInventario");
					detallemovimientoinventarioBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoDetalleMovimientoInventario");
					detallemovimientoinventarioBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleMovimientoInventario(true);
					detallemovimientoinventarioBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDetalleMovimientoInventario("n",detallemovimientoinventarioBeanSwingJInternalFrame.isGuardarCambiosEnLote, detallemovimientoinventarioBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					detallemovimientoinventarioBeanSwingJInternalFrame.setAutoscrolls(true);
					detallemovimientoinventarioBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						detallemovimientoinventarioBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleMovimientoInventario("relacionado");
					} else {
						detallemovimientoinventarioBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleMovimientoInventario("no_relacionado");
					}

					detallemovimientoinventarioBeanSwingJInternalFrame.getjButtonRecargarInformacionDetalleMovimientoInventario().setVisible(false);

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
