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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes;



import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;



//import com.bydan.erp.facturacion.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.facturacion.util.EstadoAntiClienteConstantesFunciones;

import com.bydan.erp.facturacion.business.logic.*;
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
public class EstadoAntiClienteDetalleFormJInternalFrame extends EstadoAntiClienteBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleEstadoAntiCliente;
	
	protected JMenuBar jmenuBarDetalleEstadoAntiCliente;
	
	protected JMenu jmenuDetalleEstadoAntiCliente;
	protected JMenu jmenuDetalleArchivoEstadoAntiCliente;
	protected JMenu jmenuDetalleAccionesEstadoAntiCliente;
	protected JMenu jmenuDetalleDatosEstadoAntiCliente;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleEstadoAntiCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEstadoAntiCliente;	
	protected GridBagConstraints gridBagConstraintsEstadoAntiCliente;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected EstadoAntiClienteBeanSwingJInternalFrameAdditional jInternalFrameDetalleEstadoAntiCliente;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public EstadoAntiClienteSessionBean estadoanticlienteSessionBean;
	
	

	public AnticipoClienteBeanSwingJInternalFrame anticipoclienteBeanSwingJInternalFrame=null;
	public AnticipoClienteBeanSwingJInternalFrame anticipoclienteBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteAnticipoCliente=false;
	public AnticipoClienteSessionBean anticipoclienteSessionBean;
	
		
	
	public EstadoAntiClienteLogic estadoanticlienteLogic;
	
	public JScrollPane jScrollPanelDatosEstadoAntiCliente;
	public JScrollPane jScrollPanelDatosEdicionEstadoAntiCliente;
	public JScrollPane jScrollPanelDatosGeneralEstadoAntiCliente;
	
	protected JPanel jPanelCamposEstadoAntiCliente;    
	protected JPanel jPanelCamposOcultosEstadoAntiCliente;    	
	protected JPanel jPanelAccionesEstadoAntiCliente;
	protected JPanel jPanelAccionesFormularioEstadoAntiCliente;
    
	
	
	protected Integer iXPanelCamposEstadoAntiCliente=0;
	protected Integer iYPanelCamposEstadoAntiCliente=0;
	
	protected Integer iXPanelCamposOcultosEstadoAntiCliente=0;
	protected Integer iYPanelCamposOcultosEstadoAntiCliente=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoEstadoAntiCliente;
	public JButton jButtonModificarEstadoAntiCliente;
	public JButton jButtonActualizarEstadoAntiCliente;
    public JButton jButtonEliminarEstadoAntiCliente;
	public JButton jButtonCancelarEstadoAntiCliente;
    public JButton jButtonGuardarCambiosEstadoAntiCliente;
	public JButton jButtonGuardarCambiosTablaEstadoAntiCliente;
	protected JButton jButtonCerrarEstadoAntiCliente;
	
	
	protected JButton jButtonProcesarInformacionEstadoAntiCliente;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoEstadoAntiCliente;
	protected JCheckBox jCheckBoxPostAccionSinCerrarEstadoAntiCliente;
	protected JCheckBox jCheckBoxPostAccionSinMensajeEstadoAntiCliente;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEstadoAntiCliente;
	protected JButton jButtonModificarToolBarEstadoAntiCliente;
	protected JButton jButtonActualizarToolBarEstadoAntiCliente;
    protected JButton jButtonEliminarToolBarEstadoAntiCliente;
	protected JButton jButtonCancelarToolBarEstadoAntiCliente;
    protected JButton jButtonGuardarCambiosToolBarEstadoAntiCliente;
	protected JButton jButtonGuardarCambiosTablaToolBarEstadoAntiCliente;
	protected JButton jButtonMostrarOcultarTablaToolBarEstadoAntiCliente;
	protected JButton jButtonCerrarToolBarEstadoAntiCliente;
	
	protected JButton jButtonProcesarInformacionToolBarEstadoAntiCliente;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEstadoAntiCliente;
	protected JMenuItem jMenuItemModificarEstadoAntiCliente;
	protected JMenuItem jMenuItemActualizarEstadoAntiCliente;
    protected JMenuItem jMenuItemEliminarEstadoAntiCliente;
	protected JMenuItem jMenuItemCancelarEstadoAntiCliente;
    protected JMenuItem jMenuItemGuardarCambiosEstadoAntiCliente;
	protected JMenuItem jMenuItemGuardarCambiosTablaEstadoAntiCliente;
	protected JMenuItem jMenuItemCerrarEstadoAntiCliente;
	protected JMenuItem jMenuItemDetalleCerrarEstadoAntiCliente;
	protected JMenuItem jMenuItemDetalleMostarOcultarEstadoAntiCliente;
	
	protected JMenuItem jMenuItemProcesarInformacionEstadoAntiCliente;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEstadoAntiCliente;
	protected JMenuItem jMenuItemMostrarOcultarEstadoAntiCliente;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEstadoAntiCliente;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEstadoAntiCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEstadoAntiCliente;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioEstadoAntiCliente;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidEstadoAntiCliente;
	public JLabel jLabelIdEstadoAntiCliente;
	public JLabel jLabelidEstadoAntiCliente;
	public JButton jButtonidEstadoAntiClienteBusqueda= new JButtonMe();

	public JPanel jPanelcodigoEstadoAntiCliente;
	public JLabel jLabelcodigoEstadoAntiCliente;
	public JTextField jTextFieldcodigoEstadoAntiCliente;
	public JButton jButtoncodigoEstadoAntiClienteBusqueda= new JButtonMe();

	public JPanel jPanelnombreEstadoAntiCliente;
	public JLabel jLabelnombreEstadoAntiCliente;
	public JTextArea jTextAreanombreEstadoAntiCliente;
	public JScrollPane jscrollPanenombreEstadoAntiCliente;
	public JButton jButtonnombreEstadoAntiClienteBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesEstadoAntiCliente;
	
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
	
	public EstadoAntiClienteDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposEstadoAntiCliente=new JPanel();
				this.jPanelAccionesFormularioEstadoAntiCliente=new JPanel();
				this.jmenuBarDetalleEstadoAntiCliente=new JMenuBar();
				this.jTtoolBarDetalleEstadoAntiCliente=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoAntiClienteDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("EstadoAntiCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public EstadoAntiClienteDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("EstadoAntiCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoAntiClienteDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoAntiCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoAntiClienteDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoAntiCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoAntiClienteDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EstadoAntiCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarEstadoAntiCliente() {
		return this.jButtonActualizarToolBarEstadoAntiCliente;
	}
	
	public JButton getjButtonEliminarToolBarEstadoAntiCliente() {
		return this.jButtonEliminarToolBarEstadoAntiCliente;
	}
	
	public JButton getjButtonCancelarToolBarEstadoAntiCliente() {
		return this.jButtonCancelarToolBarEstadoAntiCliente;
	}		
	
	public JButton getjButtonProcesarInformacionEstadoAntiCliente() {
		return this.jButtonProcesarInformacionEstadoAntiCliente;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEstadoAntiCliente)	{
		this.jButtonProcesarInformacionEstadoAntiCliente = jButtonProcesarInformacionEstadoAntiCliente;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEstadoAntiCliente() {
		return this.jComboBoxTiposAccionesEstadoAntiCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEstadoAntiCliente(
			JComboBox jComboBoxTiposRelacionesEstadoAntiCliente) {
		this.jComboBoxTiposRelacionesEstadoAntiCliente = jComboBoxTiposRelacionesEstadoAntiCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEstadoAntiCliente(
			JComboBox jComboBoxTiposAccionesEstadoAntiCliente) {
		this.jComboBoxTiposAccionesEstadoAntiCliente = jComboBoxTiposAccionesEstadoAntiCliente;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioEstadoAntiCliente() {
		return this.jComboBoxTiposAccionesFormularioEstadoAntiCliente;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioEstadoAntiCliente(
			JComboBox jComboBoxTiposAccionesFormularioEstadoAntiCliente) {
		this.jComboBoxTiposAccionesFormularioEstadoAntiCliente = jComboBoxTiposAccionesFormularioEstadoAntiCliente;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.estadoanticlienteSessionBean=new EstadoAntiClienteSessionBean();
		
		this.estadoanticlienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadoanticlienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.estadoanticlienteSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.anticipoclienteSessionBean=new AnticipoClienteSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EstadoAntiClienteJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EstadoAntiClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EstadoAntiClienteJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estado Anti Cliente MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.estadoanticlienteSessionBean.getEsGuardarRelacionado()) {
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
	
		EstadoAntiClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleEstadoAntiCliente= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarEstadoAntiCliente=new JButtonMe();
				this.jButtonModificarToolBarEstadoAntiCliente=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarEstadoAntiCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarEstadoAntiCliente,this.jTtoolBarDetalleEstadoAntiCliente,
							"actualizar","actualizar","Actualizar"+" "+EstadoAntiClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarEstadoAntiCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarEstadoAntiCliente,this.jTtoolBarDetalleEstadoAntiCliente,
							"eliminar","eliminar","Eliminar"+" "+EstadoAntiClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarEstadoAntiCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarEstadoAntiCliente,this.jTtoolBarDetalleEstadoAntiCliente,
							"cancelar","cancelar","Cancelar"+" "+EstadoAntiClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarEstadoAntiCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarEstadoAntiCliente,this.jTtoolBarDetalleEstadoAntiCliente,
							"guardarcambios","guardarcambios","Guardar"+" "+EstadoAntiClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarEstadoAntiCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarEstadoAntiCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarEstadoAntiCliente,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleEstadoAntiCliente=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleEstadoAntiCliente=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoEstadoAntiCliente=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesEstadoAntiCliente=new JMenuMe("Acciones");
		this.jmenuDetalleDatosEstadoAntiCliente=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEstadoAntiCliente= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEstadoAntiCliente.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEstadoAntiCliente,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEstadoAntiCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarEstadoAntiCliente= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarEstadoAntiCliente.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarEstadoAntiCliente,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarEstadoAntiCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarEstadoAntiCliente= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarEstadoAntiCliente.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarEstadoAntiCliente,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarEstadoAntiCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarEstadoAntiCliente= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarEstadoAntiCliente.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarEstadoAntiCliente,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarEstadoAntiCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarEstadoAntiCliente= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarEstadoAntiCliente.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarEstadoAntiCliente,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarEstadoAntiCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosEstadoAntiCliente= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEstadoAntiCliente.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEstadoAntiCliente,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEstadoAntiCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEstadoAntiCliente= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEstadoAntiCliente.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEstadoAntiCliente,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEstadoAntiCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarEstadoAntiCliente= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarEstadoAntiCliente.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarEstadoAntiCliente,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarEstadoAntiCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEstadoAntiCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEstadoAntiCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEstadoAntiCliente,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEstadoAntiCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEstadoAntiCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEstadoAntiCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEstadoAntiCliente,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEstadoAntiCliente, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoEstadoAntiCliente.add(this.jMenuItemDetalleCerrarEstadoAntiCliente);
		
		this.jmenuDetalleAccionesEstadoAntiCliente.add(this.jMenuItemActualizarEstadoAntiCliente);
		this.jmenuDetalleAccionesEstadoAntiCliente.add(this.jMenuItemEliminarEstadoAntiCliente);
		this.jmenuDetalleAccionesEstadoAntiCliente.add(this.jMenuItemCancelarEstadoAntiCliente);		
		
		//this.jmenuDetalleDatosEstadoAntiCliente.add(this.jMenuItemDetalleAbrirOrderByEstadoAntiCliente);				
		this.jmenuDetalleDatosEstadoAntiCliente.add(this.jMenuItemDetalleMostarOcultarEstadoAntiCliente);				
				
		//this.jmenuDetalleAccionesEstadoAntiCliente.add(this.jMenuItemGuardarCambiosEstadoAntiCliente);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoEstadoAntiCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesEstadoAntiCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosEstadoAntiCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleEstadoAntiCliente.add(this.jmenuDetalleArchivoEstadoAntiCliente);		
		this.jmenuBarDetalleEstadoAntiCliente.add(this.jmenuDetalleAccionesEstadoAntiCliente);		
		this.jmenuBarDetalleEstadoAntiCliente.add(this.jmenuDetalleDatosEstadoAntiCliente);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleEstadoAntiCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleEstadoAntiCliente.add(this.jmenuDetalleEstadoAntiCliente);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleEstadoAntiCliente);				
	}
	
	
	public void inicializarElementosCamposEstadoAntiCliente() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdEstadoAntiCliente = new JLabelMe();
		jLabelIdEstadoAntiCliente.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdEstadoAntiCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEstadoAntiCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEstadoAntiCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdEstadoAntiCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidEstadoAntiCliente = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidEstadoAntiCliente.setToolTipText(EstadoAntiClienteConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutEstadoAntiCliente= new GridBagLayout();

		this.jPanelidEstadoAntiCliente.setLayout(this.gridaBagLayoutEstadoAntiCliente);

		jLabelidEstadoAntiCliente = new JLabel();
		jLabelidEstadoAntiCliente.setText("Id");

		jLabelidEstadoAntiCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidEstadoAntiCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidEstadoAntiCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoEstadoAntiCliente = new JLabelMe();
		this.jLabelcodigoEstadoAntiCliente.setText(""+EstadoAntiClienteConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoEstadoAntiCliente.setToolTipText("Codigo");
		this.jLabelcodigoEstadoAntiCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoEstadoAntiCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoEstadoAntiCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoEstadoAntiCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoEstadoAntiCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoEstadoAntiCliente.setToolTipText(EstadoAntiClienteConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutEstadoAntiCliente = new GridBagLayout();
		this.jPanelcodigoEstadoAntiCliente.setLayout(this.gridaBagLayoutEstadoAntiCliente);


		jTextFieldcodigoEstadoAntiCliente= new JTextFieldMe();

		jTextFieldcodigoEstadoAntiCliente.setEnabled(false);
		jTextFieldcodigoEstadoAntiCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoEstadoAntiCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoEstadoAntiCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoEstadoAntiCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoEstadoAntiClienteBusqueda= new JButtonMe();
		this.jButtoncodigoEstadoAntiClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoEstadoAntiClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoEstadoAntiClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoEstadoAntiClienteBusqueda.setText("U");
		this.jButtoncodigoEstadoAntiClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoEstadoAntiClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoEstadoAntiClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoEstadoAntiCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoEstadoAntiCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoEstadoAntiClienteBusqueda"));

		if(this.estadoanticlienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoEstadoAntiClienteBusqueda.setVisible(false);		}


					
		this.jLabelnombreEstadoAntiCliente = new JLabelMe();
		this.jLabelnombreEstadoAntiCliente.setText(""+EstadoAntiClienteConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreEstadoAntiCliente.setToolTipText("Nombre");
		this.jLabelnombreEstadoAntiCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEstadoAntiCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEstadoAntiCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreEstadoAntiCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreEstadoAntiCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreEstadoAntiCliente.setToolTipText(EstadoAntiClienteConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutEstadoAntiCliente = new GridBagLayout();
		this.jPanelnombreEstadoAntiCliente.setLayout(this.gridaBagLayoutEstadoAntiCliente);


		jTextAreanombreEstadoAntiCliente= new JTextAreaMe();
		jTextAreanombreEstadoAntiCliente.setEnabled(false);
		jTextAreanombreEstadoAntiCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoAntiCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoAntiCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoAntiCliente.setLineWrap(true);
		jTextAreanombreEstadoAntiCliente.setWrapStyleWord(true);
		jTextAreanombreEstadoAntiCliente.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreEstadoAntiCliente.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreEstadoAntiCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreEstadoAntiCliente = new JScrollPane(jTextAreanombreEstadoAntiCliente);
		jscrollPanenombreEstadoAntiCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreEstadoAntiCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreEstadoAntiCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreEstadoAntiClienteBusqueda= new JButtonMe();
		this.jButtonnombreEstadoAntiClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEstadoAntiClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEstadoAntiClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreEstadoAntiClienteBusqueda.setText("U");
		this.jButtonnombreEstadoAntiClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreEstadoAntiClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreEstadoAntiClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreEstadoAntiCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreEstadoAntiCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreEstadoAntiClienteBusqueda"));

		if(this.estadoanticlienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreEstadoAntiClienteBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysEstadoAntiCliente() {
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
		//this.jInternalFrameDetalleEstadoAntiCliente = new EstadoAntiClienteBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Estado Anti Cliente DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEstadoAntiCliente= new GridBagLayout();
		

		
		String sToolTipEstadoAntiCliente="";
		sToolTipEstadoAntiCliente=EstadoAntiClienteConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEstadoAntiCliente+="(Facturacion.EstadoAntiCliente)";
		}
		
		if(!this.estadoanticlienteSessionBean.getEsGuardarRelacionado()) {
			sToolTipEstadoAntiCliente+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoEstadoAntiCliente = new JButtonMe();
		this.jButtonModificarEstadoAntiCliente = new JButtonMe();
        this.jButtonActualizarEstadoAntiCliente = new JButtonMe();
        this.jButtonEliminarEstadoAntiCliente = new JButtonMe();
        this.jButtonCancelarEstadoAntiCliente = new JButtonMe();
        this.jButtonGuardarCambiosEstadoAntiCliente = new JButtonMe();
		this.jButtonGuardarCambiosTablaEstadoAntiCliente = new JButtonMe();
		this.jButtonCerrarEstadoAntiCliente = new JButtonMe();
		
		this.jScrollPanelDatosEstadoAntiCliente = new JScrollPane();   
        this.jScrollPanelDatosEdicionEstadoAntiCliente = new JScrollPane();
		this.jScrollPanelDatosGeneralEstadoAntiCliente = new JScrollPane();
				
		
		
		this.jPanelCamposEstadoAntiCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosEstadoAntiCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesEstadoAntiCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioEstadoAntiCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Estado Anti Cliente";
		
		if(!this.estadoanticlienteSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEstadoAntiCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Anti Clientes" + this.sPath));
		} else {
			this.jScrollPanelDatosEstadoAntiCliente.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionEstadoAntiCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralEstadoAntiCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposEstadoAntiCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposEstadoAntiCliente.setName("jPanelCamposEstadoAntiCliente"); 

		this.jPanelCamposOcultosEstadoAntiCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosEstadoAntiCliente.setName("jPanelCamposOcultosEstadoAntiCliente"); 

        this.jPanelAccionesEstadoAntiCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEstadoAntiCliente.setToolTipText("Acciones");
        this.jPanelAccionesEstadoAntiCliente.setName("Acciones"); 

		this.jPanelAccionesFormularioEstadoAntiCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioEstadoAntiCliente.setToolTipText("Acciones");
        this.jPanelAccionesFormularioEstadoAntiCliente.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionEstadoAntiCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEstadoAntiCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEstadoAntiCliente, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposEstadoAntiCliente, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosEstadoAntiCliente, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioEstadoAntiCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoEstadoAntiCliente.setText("Nuevo");
		this.jButtonModificarEstadoAntiCliente.setText("Editar");
        this.jButtonActualizarEstadoAntiCliente.setText("Actualizar");
        this.jButtonEliminarEstadoAntiCliente.setText("Eliminar");
        this.jButtonCancelarEstadoAntiCliente.setText("Cancelar");
        this.jButtonGuardarCambiosEstadoAntiCliente.setText("Guardar");
		this.jButtonGuardarCambiosTablaEstadoAntiCliente.setText("Guardar");
		this.jButtonCerrarEstadoAntiCliente.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEstadoAntiCliente,"nuevo_button","Nuevo",this.estadoanticlienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarEstadoAntiCliente,"modificar_button","Editar",this.estadoanticlienteSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarEstadoAntiCliente,"actualizar_button","Actualizar",this.estadoanticlienteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarEstadoAntiCliente,"eliminar_button","Eliminar",this.estadoanticlienteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarEstadoAntiCliente,"cancelar_button","Cancelar",this.estadoanticlienteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosEstadoAntiCliente,"guardarcambios_button","Guardar",this.estadoanticlienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEstadoAntiCliente,"guardarcambiostabla_button","Guardar",this.estadoanticlienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEstadoAntiCliente,"cerrar_button","Salir",this.estadoanticlienteSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEstadoAntiCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarEstadoAntiCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosEstadoAntiCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEstadoAntiCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEstadoAntiCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarEstadoAntiCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarEstadoAntiCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarEstadoAntiCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoEstadoAntiCliente.setToolTipText("Nuevo"+" "+EstadoAntiClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarEstadoAntiCliente.setToolTipText("Editar"+" "+EstadoAntiClienteConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarEstadoAntiCliente.setToolTipText("Actualizar"+" "+EstadoAntiClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarEstadoAntiCliente.setToolTipText("Eliminar)"+" "+EstadoAntiClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarEstadoAntiCliente.setToolTipText("Cancelar"+" "+EstadoAntiClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosEstadoAntiCliente.setToolTipText("Guardar"+" "+EstadoAntiClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaEstadoAntiCliente.setToolTipText("Guardar"+" "+EstadoAntiClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEstadoAntiCliente.setToolTipText("Salir"+" "+EstadoAntiClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEstadoAntiCliente";
		inputMap = this.jButtonNuevoEstadoAntiCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEstadoAntiCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEstadoAntiCliente"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarEstadoAntiCliente";
		inputMap = this.jButtonActualizarEstadoAntiCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarEstadoAntiCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarEstadoAntiCliente"));
		
		//ELIMINAR
		sMapKey = "EliminarEstadoAntiCliente";
		inputMap = this.jButtonEliminarEstadoAntiCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarEstadoAntiCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarEstadoAntiCliente"));
		
		//CANCELAR	
		sMapKey = "CancelarEstadoAntiCliente";
		inputMap = this.jButtonCancelarEstadoAntiCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarEstadoAntiCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarEstadoAntiCliente"));
		
		//CERRAR		
		sMapKey = "CerrarEstadoAntiCliente";
		inputMap = this.jButtonCerrarEstadoAntiCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEstadoAntiCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEstadoAntiCliente"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEstadoAntiCliente";
		inputMap = this.jButtonGuardarCambiosTablaEstadoAntiCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEstadoAntiCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEstadoAntiCliente"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoEstadoAntiCliente = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoEstadoAntiCliente.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoEstadoAntiCliente.setToolTipText("Nuevo EstadoAntiCliente");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoEstadoAntiCliente, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarEstadoAntiCliente = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarEstadoAntiCliente.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarEstadoAntiCliente.setToolTipText("Sin Cerrar Ventana EstadoAntiCliente");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarEstadoAntiCliente, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeEstadoAntiCliente = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeEstadoAntiCliente.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeEstadoAntiCliente.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeEstadoAntiCliente, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesEstadoAntiCliente = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEstadoAntiCliente.setText("Accion");
		this.jComboBoxTiposAccionesEstadoAntiCliente.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioEstadoAntiCliente = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioEstadoAntiCliente.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioEstadoAntiCliente.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesEstadoAntiCliente = new JLabelMe();
		
		this.jLabelAccionesEstadoAntiCliente.setText("Acciones");		
		this.jLabelAccionesEstadoAntiCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoAntiCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoAntiCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposEstadoAntiCliente();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysEstadoAntiCliente();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesEstadoAntiCliente=new JTabbedPane();
		this.jTabbedPaneRelacionesEstadoAntiCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesEstadoAntiCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesEstadoAntiCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoAntiCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoAntiCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEstadoAntiCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioEstadoAntiCliente.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEstadoAntiCliente.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEstadoAntiCliente.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioEstadoAntiCliente, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposEstadoAntiCliente = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosEstadoAntiCliente = new GridBagLayout();
		
		this.jPanelCamposEstadoAntiCliente.setLayout(gridaBagLayoutCamposEstadoAntiCliente);
		this.jPanelCamposOcultosEstadoAntiCliente.setLayout(gridaBagLayoutCamposOcultosEstadoAntiCliente);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsEstadoAntiCliente = new GridBagConstraints();
	this.gridBagConstraintsEstadoAntiCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoAntiCliente.gridy = 0;
	this.gridBagConstraintsEstadoAntiCliente.gridx = 0;
	this.gridBagConstraintsEstadoAntiCliente.ipadx = 0;
	this.gridBagConstraintsEstadoAntiCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidEstadoAntiCliente.add(jLabelIdEstadoAntiCliente, this.gridBagConstraintsEstadoAntiCliente);



	this.gridBagConstraintsEstadoAntiCliente = new GridBagConstraints();
	this.gridBagConstraintsEstadoAntiCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoAntiCliente.gridy = 0;
	this.gridBagConstraintsEstadoAntiCliente.gridx = 1;
	this.gridBagConstraintsEstadoAntiCliente.ipadx = 0;
	this.gridBagConstraintsEstadoAntiCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidEstadoAntiCliente.add(jLabelidEstadoAntiCliente, this.gridBagConstraintsEstadoAntiCliente);


	this.gridBagConstraintsEstadoAntiCliente = new GridBagConstraints();
	this.gridBagConstraintsEstadoAntiCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoAntiCliente.gridy = 0;
	this.gridBagConstraintsEstadoAntiCliente.gridx = 0;
	this.gridBagConstraintsEstadoAntiCliente.ipadx = 0;
	this.gridBagConstraintsEstadoAntiCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoEstadoAntiCliente.add(jLabelcodigoEstadoAntiCliente, this.gridBagConstraintsEstadoAntiCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoAntiCliente = new GridBagConstraints();
		//this.gridBagConstraintsEstadoAntiCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoAntiCliente.gridy = 0;
		this.gridBagConstraintsEstadoAntiCliente.gridx = 2;
		this.gridBagConstraintsEstadoAntiCliente.ipadx = 0;
		this.gridBagConstraintsEstadoAntiCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoEstadoAntiCliente.add(jButtoncodigoEstadoAntiClienteBusqueda, this.gridBagConstraintsEstadoAntiCliente);
	}

	this.gridBagConstraintsEstadoAntiCliente = new GridBagConstraints();
	this.gridBagConstraintsEstadoAntiCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoAntiCliente.gridy = 0;
	this.gridBagConstraintsEstadoAntiCliente.gridx = 1;
	this.gridBagConstraintsEstadoAntiCliente.ipadx = 0;
	this.gridBagConstraintsEstadoAntiCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoEstadoAntiCliente.add(jTextFieldcodigoEstadoAntiCliente, this.gridBagConstraintsEstadoAntiCliente);


	this.gridBagConstraintsEstadoAntiCliente = new GridBagConstraints();
	this.gridBagConstraintsEstadoAntiCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoAntiCliente.gridy = 0;
	this.gridBagConstraintsEstadoAntiCliente.gridx = 0;
	this.gridBagConstraintsEstadoAntiCliente.ipadx = 0;
	this.gridBagConstraintsEstadoAntiCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreEstadoAntiCliente.add(jLabelnombreEstadoAntiCliente, this.gridBagConstraintsEstadoAntiCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoAntiCliente = new GridBagConstraints();
		//this.gridBagConstraintsEstadoAntiCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoAntiCliente.gridy = 0;
		this.gridBagConstraintsEstadoAntiCliente.gridx = 2;
		this.gridBagConstraintsEstadoAntiCliente.ipadx = 0;
		this.gridBagConstraintsEstadoAntiCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreEstadoAntiCliente.add(jButtonnombreEstadoAntiClienteBusqueda, this.gridBagConstraintsEstadoAntiCliente);
	}

	this.gridBagConstraintsEstadoAntiCliente = new GridBagConstraints();
	this.gridBagConstraintsEstadoAntiCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoAntiCliente.gridy = 0;
	this.gridBagConstraintsEstadoAntiCliente.gridx = 1;
	this.gridBagConstraintsEstadoAntiCliente.ipadx = 0;
	this.gridBagConstraintsEstadoAntiCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreEstadoAntiCliente.add(jscrollPanenombreEstadoAntiCliente, this.gridBagConstraintsEstadoAntiCliente);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsEstadoAntiCliente = new GridBagConstraints();
	this.gridBagConstraintsEstadoAntiCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoAntiCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoAntiCliente.gridy = iYPanelCamposEstadoAntiCliente;
	this.gridBagConstraintsEstadoAntiCliente.gridx = iXPanelCamposEstadoAntiCliente++;
	this.gridBagConstraintsEstadoAntiCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoAntiCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoAntiCliente.add(this.jPanelidEstadoAntiCliente, this.gridBagConstraintsEstadoAntiCliente);



	if(iXPanelCamposEstadoAntiCliente % 1==0) {
		iXPanelCamposEstadoAntiCliente=0;
		iYPanelCamposEstadoAntiCliente++;
	}
	this.gridBagConstraintsEstadoAntiCliente = new GridBagConstraints();
	this.gridBagConstraintsEstadoAntiCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoAntiCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoAntiCliente.gridy = iYPanelCamposEstadoAntiCliente;
	this.gridBagConstraintsEstadoAntiCliente.gridx = iXPanelCamposEstadoAntiCliente++;
	this.gridBagConstraintsEstadoAntiCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoAntiCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoAntiCliente.add(this.jPanelcodigoEstadoAntiCliente, this.gridBagConstraintsEstadoAntiCliente);



	if(iXPanelCamposEstadoAntiCliente % 1==0) {
		iXPanelCamposEstadoAntiCliente=0;
		iYPanelCamposEstadoAntiCliente++;
	}
	this.gridBagConstraintsEstadoAntiCliente = new GridBagConstraints();
	this.gridBagConstraintsEstadoAntiCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoAntiCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoAntiCliente.gridy = iYPanelCamposEstadoAntiCliente;
	this.gridBagConstraintsEstadoAntiCliente.gridx = iXPanelCamposEstadoAntiCliente++;
	this.gridBagConstraintsEstadoAntiCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoAntiCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoAntiCliente.add(this.jPanelnombreEstadoAntiCliente, this.gridBagConstraintsEstadoAntiCliente);



	if(iXPanelCamposEstadoAntiCliente % 1==0) {
		iXPanelCamposEstadoAntiCliente=0;
		iYPanelCamposEstadoAntiCliente++;
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
			
		GridBagLayout gridaBagLayoutAccionesEstadoAntiCliente= new GridBagLayout();
		this.jPanelAccionesEstadoAntiCliente.setLayout(gridaBagLayoutAccionesEstadoAntiCliente);
		
		GridBagLayout gridaBagLayoutAccionesFormularioEstadoAntiCliente= new GridBagLayout();
		this.jPanelAccionesFormularioEstadoAntiCliente.setLayout(gridaBagLayoutAccionesFormularioEstadoAntiCliente);
		
		this.gridBagConstraintsEstadoAntiCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoAntiCliente.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEstadoAntiCliente.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEstadoAntiCliente.add(this.jComboBoxTiposAccionesFormularioEstadoAntiCliente, this.gridBagConstraintsEstadoAntiCliente);

		this.gridBagConstraintsEstadoAntiCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoAntiCliente.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEstadoAntiCliente.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEstadoAntiCliente.add(this.jCheckBoxPostAccionNuevoEstadoAntiCliente, this.gridBagConstraintsEstadoAntiCliente);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.estadoanticlienteSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsEstadoAntiCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoAntiCliente.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEstadoAntiCliente.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEstadoAntiCliente.add(this.jCheckBoxPostAccionSinCerrarEstadoAntiCliente, this.gridBagConstraintsEstadoAntiCliente);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.estadoanticlienteSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.estadoanticlienteSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsEstadoAntiCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoAntiCliente.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEstadoAntiCliente.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEstadoAntiCliente.add(this.jCheckBoxPostAccionSinMensajeEstadoAntiCliente, this.gridBagConstraintsEstadoAntiCliente);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsEstadoAntiCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoAntiCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoAntiCliente.gridy = 0;
		this.gridBagConstraintsEstadoAntiCliente.gridx = iPosXAccion++;
			
		this.jPanelAccionesEstadoAntiCliente.add(this.jButtonModificarEstadoAntiCliente, this.gridBagConstraintsEstadoAntiCliente);							

		this.gridBagConstraintsEstadoAntiCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoAntiCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoAntiCliente.gridy = 0;
		this.gridBagConstraintsEstadoAntiCliente.gridx =iPosXAccion++;
			
		this.jPanelAccionesEstadoAntiCliente.add(this.jButtonEliminarEstadoAntiCliente, this.gridBagConstraintsEstadoAntiCliente);
		
			
		this.gridBagConstraintsEstadoAntiCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoAntiCliente.gridy = 0;		
		this.gridBagConstraintsEstadoAntiCliente.gridx = iPosXAccion++;
		
		this.jPanelAccionesEstadoAntiCliente.add(this.jButtonActualizarEstadoAntiCliente, this.gridBagConstraintsEstadoAntiCliente);


		this.gridBagConstraintsEstadoAntiCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoAntiCliente.gridy = 0;		
		this.gridBagConstraintsEstadoAntiCliente.gridx = iPosXAccion++;
		
		this.jPanelAccionesEstadoAntiCliente.add(this.jButtonGuardarCambiosEstadoAntiCliente, this.gridBagConstraintsEstadoAntiCliente);	
		
		this.gridBagConstraintsEstadoAntiCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoAntiCliente.gridy = 0;		
		this.gridBagConstraintsEstadoAntiCliente.gridx =iPosXAccion++;
		
		this.jPanelAccionesEstadoAntiCliente.add(this.jButtonCancelarEstadoAntiCliente, this.gridBagConstraintsEstadoAntiCliente);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEstadoAntiCliente = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEstadoAntiCliente);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.estadoanticlienteSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEstadoAntiCliente = new GridBagConstraints();						
			this.gridBagConstraintsEstadoAntiCliente.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadoAntiCliente.gridx = 0;		
			//this.gridBagConstraintsEstadoAntiCliente.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoAntiCliente.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEstadoAntiCliente.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsEstadoAntiCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoAntiCliente.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEstadoAntiCliente.gridx =0;
		this.gridBagConstraintsEstadoAntiCliente.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEstadoAntiCliente.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEstadoAntiCliente, this.gridBagConstraintsEstadoAntiCliente);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(EstadoAntiClienteJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleEstadoAntiCliente = new EstadoAntiClienteBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Estado Anti Cliente DATOS");
			
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
			
	        //this.setTitle("[FOR] - Estado Anti Cliente DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estado Anti Cliente Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			EstadoAntiClienteModel estadoanticlienteModel=new EstadoAntiClienteModel(this);
			
			//SI USARA CLASE INTERNA
			//EstadoAntiClienteModel.EstadoAntiClienteFocusTraversalPolicy estadoanticlienteFocusTraversalPolicy = estadoanticlienteModel.new EstadoAntiClienteFocusTraversalPolicy(this);
			
			//estadoanticlienteFocusTraversalPolicy.setestadoanticlienteJInternalFrame(this);
			
			this.setFocusTraversalPolicy(estadoanticlienteModel);
			
			
			this.jContentPaneDetalleEstadoAntiCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleEstadoAntiCliente = new GridBagLayout();	
			this.jContentPaneDetalleEstadoAntiCliente.setLayout(gridaBagLayoutDetalleEstadoAntiCliente);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEstadoAntiCliente = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsEstadoAntiCliente = new GridBagConstraints();
				this.gridBagConstraintsEstadoAntiCliente.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsEstadoAntiCliente.gridx = 0;
					
				
				this.jContentPaneDetalleEstadoAntiCliente.add(jTtoolBarDetalleEstadoAntiCliente, gridBagConstraintsEstadoAntiCliente);								
				
}
			
			this.jScrollPanelDatosEdicionEstadoAntiCliente=   new JScrollPane(jContentPaneDetalleEstadoAntiCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEstadoAntiCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoAntiCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoAntiCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralEstadoAntiCliente=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEstadoAntiCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoAntiCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoAntiCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEstadoAntiCliente = new GridBagConstraints();
			
			
	        this.gridBagConstraintsEstadoAntiCliente.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsEstadoAntiCliente.gridx = 0;
	        
			this.jContentPaneDetalleEstadoAntiCliente.add(jPanelCamposEstadoAntiCliente, gridBagConstraintsEstadoAntiCliente);
			
			
			
			
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
						&& estadoanticlienteSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameAnticipoCliente(this.puedeCargarPorParteAnticipoCliente,false,-1);
					
					if(this.estadoanticlienteSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsEstadoAntiCliente= new GridBagConstraints();
						this.gridBagConstraintsEstadoAntiCliente.gridy = iGridyRelaciones++;
						this.gridBagConstraintsEstadoAntiCliente.gridx = 0;
						this.jContentPaneDetalleEstadoAntiCliente.add(this.jTabbedPaneRelacionesEstadoAntiCliente, this.gridBagConstraintsEstadoAntiCliente);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesEstadoAntiCliente.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameAnticipoCliente(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosEstadoAntiCliente.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsEstadoAntiCliente = new GridBagConstraints();
					this.gridBagConstraintsEstadoAntiCliente.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsEstadoAntiCliente.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsEstadoAntiCliente.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsEstadoAntiCliente.gridx = 0;
					
				
					this.jContentPaneDetalleEstadoAntiCliente.add(jPanelCamposOcultosEstadoAntiCliente, gridBagConstraintsEstadoAntiCliente);
				
					this.jPanelCamposOcultosEstadoAntiCliente.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsEstadoAntiCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoAntiCliente.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsEstadoAntiCliente.gridx = 0;
	        this.gridBagConstraintsEstadoAntiCliente.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleEstadoAntiCliente.add(this.jPanelAccionesFormularioEstadoAntiCliente, this.gridBagConstraintsEstadoAntiCliente);							
			
			
			
			this.gridBagConstraintsEstadoAntiCliente = new GridBagConstraints();
	        this.gridBagConstraintsEstadoAntiCliente.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsEstadoAntiCliente.gridx = 0;
	        
			
			this.jContentPaneDetalleEstadoAntiCliente.add(this.jPanelAccionesEstadoAntiCliente, this.gridBagConstraintsEstadoAntiCliente);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionEstadoAntiCliente);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionEstadoAntiCliente=   new JScrollPane(this.jPanelCamposEstadoAntiCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEstadoAntiCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoAntiCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoAntiCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsEstadoAntiCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoAntiCliente.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsEstadoAntiCliente.gridx = 0;
			this.gridBagConstraintsEstadoAntiCliente.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsEstadoAntiCliente.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsEstadoAntiCliente.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionEstadoAntiCliente, this.gridBagConstraintsEstadoAntiCliente);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsEstadoAntiCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoAntiCliente.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEstadoAntiCliente.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioEstadoAntiCliente, this.gridBagConstraintsEstadoAntiCliente);			
			
			this.gridBagConstraintsEstadoAntiCliente = new GridBagConstraints();
			this.gridBagConstraintsEstadoAntiCliente.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEstadoAntiCliente.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesEstadoAntiCliente, this.gridBagConstraintsEstadoAntiCliente);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsEstadoAntiCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoAntiCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoAntiCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEstadoAntiCliente, this.gridBagConstraintsEstadoAntiCliente);
			
			
		this.gridBagConstraintsEstadoAntiCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoAntiCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoAntiCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEstadoAntiCliente, this.gridBagConstraintsEstadoAntiCliente);
		
			
		this.gridBagConstraintsEstadoAntiCliente = new GridBagConstraints();
		this.gridBagConstraintsEstadoAntiCliente.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEstadoAntiCliente.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEstadoAntiCliente, this.gridBagConstraintsEstadoAntiCliente);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralEstadoAntiCliente;//jContentPane;
		
		return jScrollPanelDatosEdicionEstadoAntiCliente;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameAnticipoCliente(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.anticipoclienteSessionBean=new AnticipoClienteSessionBean();
		this.anticipoclienteSessionBean.setConGuardarRelaciones(false);
		this.anticipoclienteSessionBean.setEsGuardarRelacionado(true);

		this.anticipoclienteBeanSwingJInternalFrame=null;//new AnticipoClienteBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.anticipoclienteBeanSwingJInternalFramePopup=new AnticipoClienteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.anticipoclienteBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.anticipoclienteSessionBean.getEsGuardarRelacionado()) {

				AnticipoClienteJInternalFrame.STIPO_TAMANIO_GENERAL=EstadoAntiClienteJInternalFrame.STIPO_TAMANIO_GENERAL;
				AnticipoClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EstadoAntiClienteJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.anticipoclienteSessionBean.setEsGuardarRelacionado(true);

				this.anticipoclienteBeanSwingJInternalFrame=new AnticipoClienteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.anticipoclienteBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.anticipoclienteBeanSwingJInternalFrame.setanticipoclienteSessionBean(this.anticipoclienteSessionBean);

				//this.gridBagConstraintsEstadoAntiCliente = new GridBagConstraints();
				//this.gridBagConstraintsEstadoAntiCliente.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEstadoAntiCliente.gridx = 0;
				//this.jContentPaneDetalleEstadoAntiCliente.add(this.anticipoclienteBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEstadoAntiCliente);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEstadoAntiCliente.add("Anticipo Clientes",this.anticipoclienteBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEstadoAntiCliente.setComponentAt(iIndexTab,this.anticipoclienteBeanSwingJInternalFrame.getContentPane());
				}

				//AnticipoClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.anticipoclienteSessionBean.setEsGuardarRelacionado(false);
				this.anticipoclienteBeanSwingJInternalFrame=null;//new AnticipoClienteBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.anticipoclienteSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteAnticipoCliente) {
					this.jTabbedPaneRelacionesEstadoAntiCliente.add("Anticipo Clientes",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarAnticipoClienteBeanSwingJInternalFrame(List<EstadoAntiCliente> estadoanticlientes,EstadoAntiCliente estadoanticliente,AnticipoClienteBeanSwingJInternalFrame anticipoclienteBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//anticipoclienteBeanSwingJInternalFrame=new AnticipoClienteBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					anticipoclienteBeanSwingJInternalFrame.getAnticipoClienteLogic().setConnexion(this.estadoanticlienteLogic.getConnexion());

					anticipoclienteBeanSwingJInternalFrame.setestadoanticlientesForeignKey(estadoanticlientes);
					anticipoclienteBeanSwingJInternalFrame.setestadoanticlienteForeignKey(estadoanticliente);
					anticipoclienteBeanSwingJInternalFrame.anticipoclienteSessionBean.setisBusquedaDesdeForeignKeySesionEstadoAntiCliente(true);
					anticipoclienteBeanSwingJInternalFrame.anticipoclienteSessionBean.setlidEstadoAntiClienteActual(estadoanticliente.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					anticipoclienteBeanSwingJInternalFrame.cargarCombosForeignKeyAnticipoCliente(anticipoclienteBeanSwingJInternalFrame.isCargarCombosDependencia);
					anticipoclienteBeanSwingJInternalFrame.setVisibilidadBusquedasParaEstadoAntiCliente(true);
					anticipoclienteBeanSwingJInternalFrame.setid_estado_anti_clienteFK_IdEstadoAntiCliente(estadoanticliente.getId());

					if(!this.conCargarFormDetalle) {
						anticipoclienteBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					anticipoclienteBeanSwingJInternalFrame.setSelectedItemCombosFrameEstadoAntiClienteForeignKey(estadoanticliente,1,false,true,true);
					anticipoclienteBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					anticipoclienteBeanSwingJInternalFrame.procesarBusqueda("FK_IdEstadoAntiCliente");
					anticipoclienteBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEstadoAntiCliente");
					anticipoclienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaAnticipoCliente(true);
					anticipoclienteBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesAnticipoCliente("n",anticipoclienteBeanSwingJInternalFrame.isGuardarCambiosEnLote, anticipoclienteBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					anticipoclienteBeanSwingJInternalFrame.setAutoscrolls(true);
					anticipoclienteBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						anticipoclienteBeanSwingJInternalFrame.actualizarEstadoPanelsAnticipoCliente("relacionado");
					} else {
						anticipoclienteBeanSwingJInternalFrame.actualizarEstadoPanelsAnticipoCliente("no_relacionado");
					}

					anticipoclienteBeanSwingJInternalFrame.getjButtonRecargarInformacionAnticipoCliente().setVisible(false);

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
