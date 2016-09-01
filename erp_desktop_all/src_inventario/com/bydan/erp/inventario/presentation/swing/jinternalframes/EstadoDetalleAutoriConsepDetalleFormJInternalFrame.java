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



import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;



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
import com.bydan.erp.inventario.util.EstadoDetalleAutoriConsepConstantesFunciones;

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
public class EstadoDetalleAutoriConsepDetalleFormJInternalFrame extends EstadoDetalleAutoriConsepBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleEstadoDetalleAutoriConsep;
	
	protected JMenuBar jmenuBarDetalleEstadoDetalleAutoriConsep;
	
	protected JMenu jmenuDetalleEstadoDetalleAutoriConsep;
	protected JMenu jmenuDetalleArchivoEstadoDetalleAutoriConsep;
	protected JMenu jmenuDetalleAccionesEstadoDetalleAutoriConsep;
	protected JMenu jmenuDetalleDatosEstadoDetalleAutoriConsep;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleEstadoDetalleAutoriConsep = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEstadoDetalleAutoriConsep;	
	protected GridBagConstraints gridBagConstraintsEstadoDetalleAutoriConsep;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected EstadoDetalleAutoriConsepBeanSwingJInternalFrameAdditional jInternalFrameDetalleEstadoDetalleAutoriConsep;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public EstadoDetalleAutoriConsepSessionBean estadodetalleautoriconsepSessionBean;
	
	
	
		
	
	public EstadoDetalleAutoriConsepLogic estadodetalleautoriconsepLogic;
	
	public JScrollPane jScrollPanelDatosEstadoDetalleAutoriConsep;
	public JScrollPane jScrollPanelDatosEdicionEstadoDetalleAutoriConsep;
	public JScrollPane jScrollPanelDatosGeneralEstadoDetalleAutoriConsep;
	
	protected JPanel jPanelCamposEstadoDetalleAutoriConsep;    
	protected JPanel jPanelCamposOcultosEstadoDetalleAutoriConsep;    	
	protected JPanel jPanelAccionesEstadoDetalleAutoriConsep;
	protected JPanel jPanelAccionesFormularioEstadoDetalleAutoriConsep;
    
	
	
	protected Integer iXPanelCamposEstadoDetalleAutoriConsep=0;
	protected Integer iYPanelCamposEstadoDetalleAutoriConsep=0;
	
	protected Integer iXPanelCamposOcultosEstadoDetalleAutoriConsep=0;
	protected Integer iYPanelCamposOcultosEstadoDetalleAutoriConsep=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoEstadoDetalleAutoriConsep;
	public JButton jButtonModificarEstadoDetalleAutoriConsep;
	public JButton jButtonActualizarEstadoDetalleAutoriConsep;
    public JButton jButtonEliminarEstadoDetalleAutoriConsep;
	public JButton jButtonCancelarEstadoDetalleAutoriConsep;
    public JButton jButtonGuardarCambiosEstadoDetalleAutoriConsep;
	public JButton jButtonGuardarCambiosTablaEstadoDetalleAutoriConsep;
	protected JButton jButtonCerrarEstadoDetalleAutoriConsep;
	
	
	protected JButton jButtonProcesarInformacionEstadoDetalleAutoriConsep;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoEstadoDetalleAutoriConsep;
	protected JCheckBox jCheckBoxPostAccionSinCerrarEstadoDetalleAutoriConsep;
	protected JCheckBox jCheckBoxPostAccionSinMensajeEstadoDetalleAutoriConsep;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEstadoDetalleAutoriConsep;
	protected JButton jButtonModificarToolBarEstadoDetalleAutoriConsep;
	protected JButton jButtonActualizarToolBarEstadoDetalleAutoriConsep;
    protected JButton jButtonEliminarToolBarEstadoDetalleAutoriConsep;
	protected JButton jButtonCancelarToolBarEstadoDetalleAutoriConsep;
    protected JButton jButtonGuardarCambiosToolBarEstadoDetalleAutoriConsep;
	protected JButton jButtonGuardarCambiosTablaToolBarEstadoDetalleAutoriConsep;
	protected JButton jButtonMostrarOcultarTablaToolBarEstadoDetalleAutoriConsep;
	protected JButton jButtonCerrarToolBarEstadoDetalleAutoriConsep;
	
	protected JButton jButtonProcesarInformacionToolBarEstadoDetalleAutoriConsep;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEstadoDetalleAutoriConsep;
	protected JMenuItem jMenuItemModificarEstadoDetalleAutoriConsep;
	protected JMenuItem jMenuItemActualizarEstadoDetalleAutoriConsep;
    protected JMenuItem jMenuItemEliminarEstadoDetalleAutoriConsep;
	protected JMenuItem jMenuItemCancelarEstadoDetalleAutoriConsep;
    protected JMenuItem jMenuItemGuardarCambiosEstadoDetalleAutoriConsep;
	protected JMenuItem jMenuItemGuardarCambiosTablaEstadoDetalleAutoriConsep;
	protected JMenuItem jMenuItemCerrarEstadoDetalleAutoriConsep;
	protected JMenuItem jMenuItemDetalleCerrarEstadoDetalleAutoriConsep;
	protected JMenuItem jMenuItemDetalleMostarOcultarEstadoDetalleAutoriConsep;
	
	protected JMenuItem jMenuItemProcesarInformacionEstadoDetalleAutoriConsep;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEstadoDetalleAutoriConsep;
	protected JMenuItem jMenuItemMostrarOcultarEstadoDetalleAutoriConsep;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEstadoDetalleAutoriConsep;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEstadoDetalleAutoriConsep;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEstadoDetalleAutoriConsep;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioEstadoDetalleAutoriConsep;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidEstadoDetalleAutoriConsep;
	public JLabel jLabelIdEstadoDetalleAutoriConsep;
	public JTextFieldMe jTextFieldidEstadoDetalleAutoriConsep;
	public JButton jButtonidEstadoDetalleAutoriConsepBusqueda= new JButtonMe();

	public JPanel jPanelcodigoEstadoDetalleAutoriConsep;
	public JLabel jLabelcodigoEstadoDetalleAutoriConsep;
	public JTextField jTextFieldcodigoEstadoDetalleAutoriConsep;
	public JButton jButtoncodigoEstadoDetalleAutoriConsepBusqueda= new JButtonMe();

	public JPanel jPanelnombreEstadoDetalleAutoriConsep;
	public JLabel jLabelnombreEstadoDetalleAutoriConsep;
	public JTextField jTextFieldnombreEstadoDetalleAutoriConsep;
	public JButton jButtonnombreEstadoDetalleAutoriConsepBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesEstadoDetalleAutoriConsep;
	
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
	
	public EstadoDetalleAutoriConsepDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposEstadoDetalleAutoriConsep=new JPanel();
				this.jPanelAccionesFormularioEstadoDetalleAutoriConsep=new JPanel();
				this.jmenuBarDetalleEstadoDetalleAutoriConsep=new JMenuBar();
				this.jTtoolBarDetalleEstadoDetalleAutoriConsep=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoDetalleAutoriConsepDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("EstadoDetalleAutoriConsep No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public EstadoDetalleAutoriConsepDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("EstadoDetalleAutoriConsep No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoDetalleAutoriConsepDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoDetalleAutoriConsep No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoDetalleAutoriConsepDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoDetalleAutoriConsep No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoDetalleAutoriConsepDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EstadoDetalleAutoriConsep No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarEstadoDetalleAutoriConsep() {
		return this.jButtonActualizarToolBarEstadoDetalleAutoriConsep;
	}
	
	public JButton getjButtonEliminarToolBarEstadoDetalleAutoriConsep() {
		return this.jButtonEliminarToolBarEstadoDetalleAutoriConsep;
	}
	
	public JButton getjButtonCancelarToolBarEstadoDetalleAutoriConsep() {
		return this.jButtonCancelarToolBarEstadoDetalleAutoriConsep;
	}		
	
	public JButton getjButtonProcesarInformacionEstadoDetalleAutoriConsep() {
		return this.jButtonProcesarInformacionEstadoDetalleAutoriConsep;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEstadoDetalleAutoriConsep)	{
		this.jButtonProcesarInformacionEstadoDetalleAutoriConsep = jButtonProcesarInformacionEstadoDetalleAutoriConsep;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEstadoDetalleAutoriConsep() {
		return this.jComboBoxTiposAccionesEstadoDetalleAutoriConsep;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEstadoDetalleAutoriConsep(
			JComboBox jComboBoxTiposRelacionesEstadoDetalleAutoriConsep) {
		this.jComboBoxTiposRelacionesEstadoDetalleAutoriConsep = jComboBoxTiposRelacionesEstadoDetalleAutoriConsep;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEstadoDetalleAutoriConsep(
			JComboBox jComboBoxTiposAccionesEstadoDetalleAutoriConsep) {
		this.jComboBoxTiposAccionesEstadoDetalleAutoriConsep = jComboBoxTiposAccionesEstadoDetalleAutoriConsep;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioEstadoDetalleAutoriConsep() {
		return this.jComboBoxTiposAccionesFormularioEstadoDetalleAutoriConsep;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioEstadoDetalleAutoriConsep(
			JComboBox jComboBoxTiposAccionesFormularioEstadoDetalleAutoriConsep) {
		this.jComboBoxTiposAccionesFormularioEstadoDetalleAutoriConsep = jComboBoxTiposAccionesFormularioEstadoDetalleAutoriConsep;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.estadodetalleautoriconsepSessionBean=new EstadoDetalleAutoriConsepSessionBean();
		
		this.estadodetalleautoriconsepSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadodetalleautoriconsepSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.estadodetalleautoriconsepSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EstadoDetalleAutoriConsepJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EstadoDetalleAutoriConsepJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EstadoDetalleAutoriConsepJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estado Detalle Autorizacion Consep MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.estadodetalleautoriconsepSessionBean.getEsGuardarRelacionado()) {
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
	
		EstadoDetalleAutoriConsepJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleEstadoDetalleAutoriConsep= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarEstadoDetalleAutoriConsep=new JButtonMe();
				this.jButtonModificarToolBarEstadoDetalleAutoriConsep=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarEstadoDetalleAutoriConsep=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarEstadoDetalleAutoriConsep,this.jTtoolBarDetalleEstadoDetalleAutoriConsep,
							"actualizar","actualizar","Actualizar"+" "+EstadoDetalleAutoriConsepConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarEstadoDetalleAutoriConsep=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarEstadoDetalleAutoriConsep,this.jTtoolBarDetalleEstadoDetalleAutoriConsep,
							"eliminar","eliminar","Eliminar"+" "+EstadoDetalleAutoriConsepConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarEstadoDetalleAutoriConsep=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarEstadoDetalleAutoriConsep,this.jTtoolBarDetalleEstadoDetalleAutoriConsep,
							"cancelar","cancelar","Cancelar"+" "+EstadoDetalleAutoriConsepConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarEstadoDetalleAutoriConsep=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarEstadoDetalleAutoriConsep,this.jTtoolBarDetalleEstadoDetalleAutoriConsep,
							"guardarcambios","guardarcambios","Guardar"+" "+EstadoDetalleAutoriConsepConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarEstadoDetalleAutoriConsep,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarEstadoDetalleAutoriConsep,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarEstadoDetalleAutoriConsep,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleEstadoDetalleAutoriConsep=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleEstadoDetalleAutoriConsep=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoEstadoDetalleAutoriConsep=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesEstadoDetalleAutoriConsep=new JMenuMe("Acciones");
		this.jmenuDetalleDatosEstadoDetalleAutoriConsep=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEstadoDetalleAutoriConsep= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEstadoDetalleAutoriConsep.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEstadoDetalleAutoriConsep,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEstadoDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarEstadoDetalleAutoriConsep= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarEstadoDetalleAutoriConsep.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarEstadoDetalleAutoriConsep,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarEstadoDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarEstadoDetalleAutoriConsep= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarEstadoDetalleAutoriConsep.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarEstadoDetalleAutoriConsep,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarEstadoDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarEstadoDetalleAutoriConsep= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarEstadoDetalleAutoriConsep.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarEstadoDetalleAutoriConsep,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarEstadoDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarEstadoDetalleAutoriConsep= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarEstadoDetalleAutoriConsep.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarEstadoDetalleAutoriConsep,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarEstadoDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosEstadoDetalleAutoriConsep= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEstadoDetalleAutoriConsep.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEstadoDetalleAutoriConsep,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEstadoDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEstadoDetalleAutoriConsep= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEstadoDetalleAutoriConsep.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEstadoDetalleAutoriConsep,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEstadoDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarEstadoDetalleAutoriConsep= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarEstadoDetalleAutoriConsep.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarEstadoDetalleAutoriConsep,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarEstadoDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEstadoDetalleAutoriConsep= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEstadoDetalleAutoriConsep.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEstadoDetalleAutoriConsep,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEstadoDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEstadoDetalleAutoriConsep= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEstadoDetalleAutoriConsep.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEstadoDetalleAutoriConsep,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEstadoDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoEstadoDetalleAutoriConsep.add(this.jMenuItemDetalleCerrarEstadoDetalleAutoriConsep);
		
		this.jmenuDetalleAccionesEstadoDetalleAutoriConsep.add(this.jMenuItemActualizarEstadoDetalleAutoriConsep);
		this.jmenuDetalleAccionesEstadoDetalleAutoriConsep.add(this.jMenuItemEliminarEstadoDetalleAutoriConsep);
		this.jmenuDetalleAccionesEstadoDetalleAutoriConsep.add(this.jMenuItemCancelarEstadoDetalleAutoriConsep);		
		
		//this.jmenuDetalleDatosEstadoDetalleAutoriConsep.add(this.jMenuItemDetalleAbrirOrderByEstadoDetalleAutoriConsep);				
		this.jmenuDetalleDatosEstadoDetalleAutoriConsep.add(this.jMenuItemDetalleMostarOcultarEstadoDetalleAutoriConsep);				
				
		//this.jmenuDetalleAccionesEstadoDetalleAutoriConsep.add(this.jMenuItemGuardarCambiosEstadoDetalleAutoriConsep);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoEstadoDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesEstadoDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosEstadoDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleEstadoDetalleAutoriConsep.add(this.jmenuDetalleArchivoEstadoDetalleAutoriConsep);		
		this.jmenuBarDetalleEstadoDetalleAutoriConsep.add(this.jmenuDetalleAccionesEstadoDetalleAutoriConsep);		
		this.jmenuBarDetalleEstadoDetalleAutoriConsep.add(this.jmenuDetalleDatosEstadoDetalleAutoriConsep);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleEstadoDetalleAutoriConsep);				
	}
	
	
	public void inicializarElementosCamposEstadoDetalleAutoriConsep() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdEstadoDetalleAutoriConsep = new JLabelMe();
		jLabelIdEstadoDetalleAutoriConsep.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdEstadoDetalleAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEstadoDetalleAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEstadoDetalleAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdEstadoDetalleAutoriConsep,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidEstadoDetalleAutoriConsep = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidEstadoDetalleAutoriConsep.setToolTipText(EstadoDetalleAutoriConsepConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutEstadoDetalleAutoriConsep= new GridBagLayout();

		this.jPanelidEstadoDetalleAutoriConsep.setLayout(this.gridaBagLayoutEstadoDetalleAutoriConsep);

		jTextFieldidEstadoDetalleAutoriConsep = new JTextFieldMe();
		jTextFieldidEstadoDetalleAutoriConsep.setText("Id");

		jTextFieldidEstadoDetalleAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidEstadoDetalleAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidEstadoDetalleAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoEstadoDetalleAutoriConsep = new JLabelMe();
		this.jLabelcodigoEstadoDetalleAutoriConsep.setText(""+EstadoDetalleAutoriConsepConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoEstadoDetalleAutoriConsep.setToolTipText("Codigo");
		this.jLabelcodigoEstadoDetalleAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoEstadoDetalleAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoEstadoDetalleAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoEstadoDetalleAutoriConsep,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoEstadoDetalleAutoriConsep=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoEstadoDetalleAutoriConsep.setToolTipText(EstadoDetalleAutoriConsepConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutEstadoDetalleAutoriConsep = new GridBagLayout();
		this.jPanelcodigoEstadoDetalleAutoriConsep.setLayout(this.gridaBagLayoutEstadoDetalleAutoriConsep);


		jTextFieldcodigoEstadoDetalleAutoriConsep= new JTextFieldMe();

		jTextFieldcodigoEstadoDetalleAutoriConsep.setEnabled(false);
		jTextFieldcodigoEstadoDetalleAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoEstadoDetalleAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoEstadoDetalleAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoEstadoDetalleAutoriConsep,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoEstadoDetalleAutoriConsepBusqueda= new JButtonMe();
		this.jButtoncodigoEstadoDetalleAutoriConsepBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoEstadoDetalleAutoriConsepBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoEstadoDetalleAutoriConsepBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoEstadoDetalleAutoriConsepBusqueda.setText("U");
		this.jButtoncodigoEstadoDetalleAutoriConsepBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoEstadoDetalleAutoriConsepBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoEstadoDetalleAutoriConsepBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoEstadoDetalleAutoriConsep.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoEstadoDetalleAutoriConsep.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoEstadoDetalleAutoriConsepBusqueda"));

		if(this.estadodetalleautoriconsepSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoEstadoDetalleAutoriConsepBusqueda.setVisible(false);		}


					
		this.jLabelnombreEstadoDetalleAutoriConsep = new JLabelMe();
		this.jLabelnombreEstadoDetalleAutoriConsep.setText(""+EstadoDetalleAutoriConsepConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreEstadoDetalleAutoriConsep.setToolTipText("Nombre");
		this.jLabelnombreEstadoDetalleAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEstadoDetalleAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEstadoDetalleAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreEstadoDetalleAutoriConsep,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreEstadoDetalleAutoriConsep=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreEstadoDetalleAutoriConsep.setToolTipText(EstadoDetalleAutoriConsepConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutEstadoDetalleAutoriConsep = new GridBagLayout();
		this.jPanelnombreEstadoDetalleAutoriConsep.setLayout(this.gridaBagLayoutEstadoDetalleAutoriConsep);


		jTextFieldnombreEstadoDetalleAutoriConsep= new JTextFieldMe();

		jTextFieldnombreEstadoDetalleAutoriConsep.setEnabled(false);
		jTextFieldnombreEstadoDetalleAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreEstadoDetalleAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreEstadoDetalleAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombreEstadoDetalleAutoriConsep,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombreEstadoDetalleAutoriConsepBusqueda= new JButtonMe();
		this.jButtonnombreEstadoDetalleAutoriConsepBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEstadoDetalleAutoriConsepBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEstadoDetalleAutoriConsepBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreEstadoDetalleAutoriConsepBusqueda.setText("U");
		this.jButtonnombreEstadoDetalleAutoriConsepBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreEstadoDetalleAutoriConsepBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreEstadoDetalleAutoriConsepBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombreEstadoDetalleAutoriConsep.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombreEstadoDetalleAutoriConsep.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreEstadoDetalleAutoriConsepBusqueda"));

		if(this.estadodetalleautoriconsepSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreEstadoDetalleAutoriConsepBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysEstadoDetalleAutoriConsep() {
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
		//this.jInternalFrameDetalleEstadoDetalleAutoriConsep = new EstadoDetalleAutoriConsepBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Estado Detalle Autorizacion Consep DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEstadoDetalleAutoriConsep= new GridBagLayout();
		

		
		String sToolTipEstadoDetalleAutoriConsep="";
		sToolTipEstadoDetalleAutoriConsep=EstadoDetalleAutoriConsepConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEstadoDetalleAutoriConsep+="(Inventario.EstadoDetalleAutoriConsep)";
		}
		
		if(!this.estadodetalleautoriconsepSessionBean.getEsGuardarRelacionado()) {
			sToolTipEstadoDetalleAutoriConsep+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoEstadoDetalleAutoriConsep = new JButtonMe();
		this.jButtonModificarEstadoDetalleAutoriConsep = new JButtonMe();
        this.jButtonActualizarEstadoDetalleAutoriConsep = new JButtonMe();
        this.jButtonEliminarEstadoDetalleAutoriConsep = new JButtonMe();
        this.jButtonCancelarEstadoDetalleAutoriConsep = new JButtonMe();
        this.jButtonGuardarCambiosEstadoDetalleAutoriConsep = new JButtonMe();
		this.jButtonGuardarCambiosTablaEstadoDetalleAutoriConsep = new JButtonMe();
		this.jButtonCerrarEstadoDetalleAutoriConsep = new JButtonMe();
		
		this.jScrollPanelDatosEstadoDetalleAutoriConsep = new JScrollPane();   
        this.jScrollPanelDatosEdicionEstadoDetalleAutoriConsep = new JScrollPane();
		this.jScrollPanelDatosGeneralEstadoDetalleAutoriConsep = new JScrollPane();
				
		
		
		this.jPanelCamposEstadoDetalleAutoriConsep = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosEstadoDetalleAutoriConsep = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesEstadoDetalleAutoriConsep = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioEstadoDetalleAutoriConsep = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Estado Detalle Autorizacion Consep";
		
		if(!this.estadodetalleautoriconsepSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEstadoDetalleAutoriConsep.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Detalle Autorizacion Consepes" + this.sPath));
		} else {
			this.jScrollPanelDatosEstadoDetalleAutoriConsep.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionEstadoDetalleAutoriConsep.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralEstadoDetalleAutoriConsep.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposEstadoDetalleAutoriConsep.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposEstadoDetalleAutoriConsep.setName("jPanelCamposEstadoDetalleAutoriConsep"); 

		this.jPanelCamposOcultosEstadoDetalleAutoriConsep.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosEstadoDetalleAutoriConsep.setName("jPanelCamposOcultosEstadoDetalleAutoriConsep"); 

        this.jPanelAccionesEstadoDetalleAutoriConsep.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEstadoDetalleAutoriConsep.setToolTipText("Acciones");
        this.jPanelAccionesEstadoDetalleAutoriConsep.setName("Acciones"); 

		this.jPanelAccionesFormularioEstadoDetalleAutoriConsep.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioEstadoDetalleAutoriConsep.setToolTipText("Acciones");
        this.jPanelAccionesFormularioEstadoDetalleAutoriConsep.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionEstadoDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEstadoDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEstadoDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposEstadoDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosEstadoDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioEstadoDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoEstadoDetalleAutoriConsep.setText("Nuevo");
		this.jButtonModificarEstadoDetalleAutoriConsep.setText("Editar");
        this.jButtonActualizarEstadoDetalleAutoriConsep.setText("Actualizar");
        this.jButtonEliminarEstadoDetalleAutoriConsep.setText("Eliminar");
        this.jButtonCancelarEstadoDetalleAutoriConsep.setText("Cancelar");
        this.jButtonGuardarCambiosEstadoDetalleAutoriConsep.setText("Guardar");
		this.jButtonGuardarCambiosTablaEstadoDetalleAutoriConsep.setText("Guardar");
		this.jButtonCerrarEstadoDetalleAutoriConsep.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEstadoDetalleAutoriConsep,"nuevo_button","Nuevo",this.estadodetalleautoriconsepSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarEstadoDetalleAutoriConsep,"modificar_button","Editar",this.estadodetalleautoriconsepSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarEstadoDetalleAutoriConsep,"actualizar_button","Actualizar",this.estadodetalleautoriconsepSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarEstadoDetalleAutoriConsep,"eliminar_button","Eliminar",this.estadodetalleautoriconsepSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarEstadoDetalleAutoriConsep,"cancelar_button","Cancelar",this.estadodetalleautoriconsepSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosEstadoDetalleAutoriConsep,"guardarcambios_button","Guardar",this.estadodetalleautoriconsepSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEstadoDetalleAutoriConsep,"guardarcambiostabla_button","Guardar",this.estadodetalleautoriconsepSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEstadoDetalleAutoriConsep,"cerrar_button","Salir",this.estadodetalleautoriconsepSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEstadoDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarEstadoDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosEstadoDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEstadoDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEstadoDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarEstadoDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarEstadoDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarEstadoDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoEstadoDetalleAutoriConsep.setToolTipText("Nuevo"+" "+EstadoDetalleAutoriConsepConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarEstadoDetalleAutoriConsep.setToolTipText("Editar"+" "+EstadoDetalleAutoriConsepConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarEstadoDetalleAutoriConsep.setToolTipText("Actualizar"+" "+EstadoDetalleAutoriConsepConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarEstadoDetalleAutoriConsep.setToolTipText("Eliminar)"+" "+EstadoDetalleAutoriConsepConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarEstadoDetalleAutoriConsep.setToolTipText("Cancelar"+" "+EstadoDetalleAutoriConsepConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosEstadoDetalleAutoriConsep.setToolTipText("Guardar"+" "+EstadoDetalleAutoriConsepConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaEstadoDetalleAutoriConsep.setToolTipText("Guardar"+" "+EstadoDetalleAutoriConsepConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEstadoDetalleAutoriConsep.setToolTipText("Salir"+" "+EstadoDetalleAutoriConsepConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEstadoDetalleAutoriConsep";
		inputMap = this.jButtonNuevoEstadoDetalleAutoriConsep.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEstadoDetalleAutoriConsep.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEstadoDetalleAutoriConsep"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarEstadoDetalleAutoriConsep";
		inputMap = this.jButtonActualizarEstadoDetalleAutoriConsep.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarEstadoDetalleAutoriConsep.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarEstadoDetalleAutoriConsep"));
		
		//ELIMINAR
		sMapKey = "EliminarEstadoDetalleAutoriConsep";
		inputMap = this.jButtonEliminarEstadoDetalleAutoriConsep.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarEstadoDetalleAutoriConsep.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarEstadoDetalleAutoriConsep"));
		
		//CANCELAR	
		sMapKey = "CancelarEstadoDetalleAutoriConsep";
		inputMap = this.jButtonCancelarEstadoDetalleAutoriConsep.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarEstadoDetalleAutoriConsep.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarEstadoDetalleAutoriConsep"));
		
		//CERRAR		
		sMapKey = "CerrarEstadoDetalleAutoriConsep";
		inputMap = this.jButtonCerrarEstadoDetalleAutoriConsep.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEstadoDetalleAutoriConsep.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEstadoDetalleAutoriConsep"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEstadoDetalleAutoriConsep";
		inputMap = this.jButtonGuardarCambiosTablaEstadoDetalleAutoriConsep.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEstadoDetalleAutoriConsep.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEstadoDetalleAutoriConsep"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoEstadoDetalleAutoriConsep = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoEstadoDetalleAutoriConsep.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoEstadoDetalleAutoriConsep.setToolTipText("Nuevo EstadoDetalleAutoriConsep");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoEstadoDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarEstadoDetalleAutoriConsep = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarEstadoDetalleAutoriConsep.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarEstadoDetalleAutoriConsep.setToolTipText("Sin Cerrar Ventana EstadoDetalleAutoriConsep");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarEstadoDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeEstadoDetalleAutoriConsep = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeEstadoDetalleAutoriConsep.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeEstadoDetalleAutoriConsep.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeEstadoDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesEstadoDetalleAutoriConsep = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEstadoDetalleAutoriConsep.setText("Accion");
		this.jComboBoxTiposAccionesEstadoDetalleAutoriConsep.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioEstadoDetalleAutoriConsep = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioEstadoDetalleAutoriConsep.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioEstadoDetalleAutoriConsep.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesEstadoDetalleAutoriConsep = new JLabelMe();
		
		this.jLabelAccionesEstadoDetalleAutoriConsep.setText("Acciones");		
		this.jLabelAccionesEstadoDetalleAutoriConsep.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoDetalleAutoriConsep.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoDetalleAutoriConsep.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposEstadoDetalleAutoriConsep();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysEstadoDetalleAutoriConsep();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesEstadoDetalleAutoriConsep=new JTabbedPane();
		this.jTabbedPaneRelacionesEstadoDetalleAutoriConsep.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesEstadoDetalleAutoriConsep,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesEstadoDetalleAutoriConsep.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoDetalleAutoriConsep.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoDetalleAutoriConsep.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEstadoDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioEstadoDetalleAutoriConsep.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEstadoDetalleAutoriConsep.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEstadoDetalleAutoriConsep.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioEstadoDetalleAutoriConsep, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposEstadoDetalleAutoriConsep = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosEstadoDetalleAutoriConsep = new GridBagLayout();
		
		this.jPanelCamposEstadoDetalleAutoriConsep.setLayout(gridaBagLayoutCamposEstadoDetalleAutoriConsep);
		this.jPanelCamposOcultosEstadoDetalleAutoriConsep.setLayout(gridaBagLayoutCamposOcultosEstadoDetalleAutoriConsep);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsEstadoDetalleAutoriConsep = new GridBagConstraints();
	this.gridBagConstraintsEstadoDetalleAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoDetalleAutoriConsep.gridy = 0;
	this.gridBagConstraintsEstadoDetalleAutoriConsep.gridx = 0;
	this.gridBagConstraintsEstadoDetalleAutoriConsep.ipadx = 0;
	this.gridBagConstraintsEstadoDetalleAutoriConsep.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidEstadoDetalleAutoriConsep.add(jLabelIdEstadoDetalleAutoriConsep, this.gridBagConstraintsEstadoDetalleAutoriConsep);



	this.gridBagConstraintsEstadoDetalleAutoriConsep = new GridBagConstraints();
	this.gridBagConstraintsEstadoDetalleAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoDetalleAutoriConsep.gridy = 0;
	this.gridBagConstraintsEstadoDetalleAutoriConsep.gridx = 1;
	this.gridBagConstraintsEstadoDetalleAutoriConsep.ipadx = 0;
	this.gridBagConstraintsEstadoDetalleAutoriConsep.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidEstadoDetalleAutoriConsep.add(jTextFieldidEstadoDetalleAutoriConsep, this.gridBagConstraintsEstadoDetalleAutoriConsep);


	this.gridBagConstraintsEstadoDetalleAutoriConsep = new GridBagConstraints();
	this.gridBagConstraintsEstadoDetalleAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoDetalleAutoriConsep.gridy = 0;
	this.gridBagConstraintsEstadoDetalleAutoriConsep.gridx = 0;
	this.gridBagConstraintsEstadoDetalleAutoriConsep.ipadx = 0;
	this.gridBagConstraintsEstadoDetalleAutoriConsep.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoEstadoDetalleAutoriConsep.add(jLabelcodigoEstadoDetalleAutoriConsep, this.gridBagConstraintsEstadoDetalleAutoriConsep);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoDetalleAutoriConsep = new GridBagConstraints();
		//this.gridBagConstraintsEstadoDetalleAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoDetalleAutoriConsep.gridy = 0;
		this.gridBagConstraintsEstadoDetalleAutoriConsep.gridx = 2;
		this.gridBagConstraintsEstadoDetalleAutoriConsep.ipadx = 0;
		this.gridBagConstraintsEstadoDetalleAutoriConsep.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoEstadoDetalleAutoriConsep.add(jButtoncodigoEstadoDetalleAutoriConsepBusqueda, this.gridBagConstraintsEstadoDetalleAutoriConsep);
	}

	this.gridBagConstraintsEstadoDetalleAutoriConsep = new GridBagConstraints();
	this.gridBagConstraintsEstadoDetalleAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoDetalleAutoriConsep.gridy = 0;
	this.gridBagConstraintsEstadoDetalleAutoriConsep.gridx = 1;
	this.gridBagConstraintsEstadoDetalleAutoriConsep.ipadx = 0;
	this.gridBagConstraintsEstadoDetalleAutoriConsep.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoEstadoDetalleAutoriConsep.add(jTextFieldcodigoEstadoDetalleAutoriConsep, this.gridBagConstraintsEstadoDetalleAutoriConsep);


	this.gridBagConstraintsEstadoDetalleAutoriConsep = new GridBagConstraints();
	this.gridBagConstraintsEstadoDetalleAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoDetalleAutoriConsep.gridy = 0;
	this.gridBagConstraintsEstadoDetalleAutoriConsep.gridx = 0;
	this.gridBagConstraintsEstadoDetalleAutoriConsep.ipadx = 0;
	this.gridBagConstraintsEstadoDetalleAutoriConsep.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreEstadoDetalleAutoriConsep.add(jLabelnombreEstadoDetalleAutoriConsep, this.gridBagConstraintsEstadoDetalleAutoriConsep);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoDetalleAutoriConsep = new GridBagConstraints();
		//this.gridBagConstraintsEstadoDetalleAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoDetalleAutoriConsep.gridy = 0;
		this.gridBagConstraintsEstadoDetalleAutoriConsep.gridx = 2;
		this.gridBagConstraintsEstadoDetalleAutoriConsep.ipadx = 0;
		this.gridBagConstraintsEstadoDetalleAutoriConsep.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreEstadoDetalleAutoriConsep.add(jButtonnombreEstadoDetalleAutoriConsepBusqueda, this.gridBagConstraintsEstadoDetalleAutoriConsep);
	}

	this.gridBagConstraintsEstadoDetalleAutoriConsep = new GridBagConstraints();
	this.gridBagConstraintsEstadoDetalleAutoriConsep.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoDetalleAutoriConsep.gridy = 0;
	this.gridBagConstraintsEstadoDetalleAutoriConsep.gridx = 1;
	this.gridBagConstraintsEstadoDetalleAutoriConsep.ipadx = 0;
	this.gridBagConstraintsEstadoDetalleAutoriConsep.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreEstadoDetalleAutoriConsep.add(jTextFieldnombreEstadoDetalleAutoriConsep, this.gridBagConstraintsEstadoDetalleAutoriConsep);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsEstadoDetalleAutoriConsep = new GridBagConstraints();
	this.gridBagConstraintsEstadoDetalleAutoriConsep.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoDetalleAutoriConsep.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoDetalleAutoriConsep.gridy = iYPanelCamposEstadoDetalleAutoriConsep;
	this.gridBagConstraintsEstadoDetalleAutoriConsep.gridx = iXPanelCamposEstadoDetalleAutoriConsep++;
	this.gridBagConstraintsEstadoDetalleAutoriConsep.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoDetalleAutoriConsep.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoDetalleAutoriConsep.add(this.jPanelidEstadoDetalleAutoriConsep, this.gridBagConstraintsEstadoDetalleAutoriConsep);



	if(iXPanelCamposEstadoDetalleAutoriConsep % 1==0) {
		iXPanelCamposEstadoDetalleAutoriConsep=0;
		iYPanelCamposEstadoDetalleAutoriConsep++;
	}
	this.gridBagConstraintsEstadoDetalleAutoriConsep = new GridBagConstraints();
	this.gridBagConstraintsEstadoDetalleAutoriConsep.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoDetalleAutoriConsep.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoDetalleAutoriConsep.gridy = iYPanelCamposEstadoDetalleAutoriConsep;
	this.gridBagConstraintsEstadoDetalleAutoriConsep.gridx = iXPanelCamposEstadoDetalleAutoriConsep++;
	this.gridBagConstraintsEstadoDetalleAutoriConsep.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoDetalleAutoriConsep.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoDetalleAutoriConsep.add(this.jPanelcodigoEstadoDetalleAutoriConsep, this.gridBagConstraintsEstadoDetalleAutoriConsep);



	if(iXPanelCamposEstadoDetalleAutoriConsep % 1==0) {
		iXPanelCamposEstadoDetalleAutoriConsep=0;
		iYPanelCamposEstadoDetalleAutoriConsep++;
	}
	this.gridBagConstraintsEstadoDetalleAutoriConsep = new GridBagConstraints();
	this.gridBagConstraintsEstadoDetalleAutoriConsep.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoDetalleAutoriConsep.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoDetalleAutoriConsep.gridy = iYPanelCamposEstadoDetalleAutoriConsep;
	this.gridBagConstraintsEstadoDetalleAutoriConsep.gridx = iXPanelCamposEstadoDetalleAutoriConsep++;
	this.gridBagConstraintsEstadoDetalleAutoriConsep.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoDetalleAutoriConsep.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoDetalleAutoriConsep.add(this.jPanelnombreEstadoDetalleAutoriConsep, this.gridBagConstraintsEstadoDetalleAutoriConsep);



	if(iXPanelCamposEstadoDetalleAutoriConsep % 1==0) {
		iXPanelCamposEstadoDetalleAutoriConsep=0;
		iYPanelCamposEstadoDetalleAutoriConsep++;
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
			
		GridBagLayout gridaBagLayoutAccionesEstadoDetalleAutoriConsep= new GridBagLayout();
		this.jPanelAccionesEstadoDetalleAutoriConsep.setLayout(gridaBagLayoutAccionesEstadoDetalleAutoriConsep);
		
		GridBagLayout gridaBagLayoutAccionesFormularioEstadoDetalleAutoriConsep= new GridBagLayout();
		this.jPanelAccionesFormularioEstadoDetalleAutoriConsep.setLayout(gridaBagLayoutAccionesFormularioEstadoDetalleAutoriConsep);
		
		this.gridBagConstraintsEstadoDetalleAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleAutoriConsep.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEstadoDetalleAutoriConsep.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEstadoDetalleAutoriConsep.add(this.jComboBoxTiposAccionesFormularioEstadoDetalleAutoriConsep, this.gridBagConstraintsEstadoDetalleAutoriConsep);

		this.gridBagConstraintsEstadoDetalleAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleAutoriConsep.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEstadoDetalleAutoriConsep.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEstadoDetalleAutoriConsep.add(this.jCheckBoxPostAccionNuevoEstadoDetalleAutoriConsep, this.gridBagConstraintsEstadoDetalleAutoriConsep);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.estadodetalleautoriconsepSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsEstadoDetalleAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleAutoriConsep.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEstadoDetalleAutoriConsep.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEstadoDetalleAutoriConsep.add(this.jCheckBoxPostAccionSinCerrarEstadoDetalleAutoriConsep, this.gridBagConstraintsEstadoDetalleAutoriConsep);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.estadodetalleautoriconsepSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.estadodetalleautoriconsepSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsEstadoDetalleAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleAutoriConsep.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEstadoDetalleAutoriConsep.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEstadoDetalleAutoriConsep.add(this.jCheckBoxPostAccionSinMensajeEstadoDetalleAutoriConsep, this.gridBagConstraintsEstadoDetalleAutoriConsep);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsEstadoDetalleAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleAutoriConsep.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoDetalleAutoriConsep.gridy = 0;
		this.gridBagConstraintsEstadoDetalleAutoriConsep.gridx = iPosXAccion++;
			
		this.jPanelAccionesEstadoDetalleAutoriConsep.add(this.jButtonModificarEstadoDetalleAutoriConsep, this.gridBagConstraintsEstadoDetalleAutoriConsep);							

		this.gridBagConstraintsEstadoDetalleAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleAutoriConsep.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoDetalleAutoriConsep.gridy = 0;
		this.gridBagConstraintsEstadoDetalleAutoriConsep.gridx =iPosXAccion++;
			
		this.jPanelAccionesEstadoDetalleAutoriConsep.add(this.jButtonEliminarEstadoDetalleAutoriConsep, this.gridBagConstraintsEstadoDetalleAutoriConsep);
		
			
		this.gridBagConstraintsEstadoDetalleAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleAutoriConsep.gridy = 0;		
		this.gridBagConstraintsEstadoDetalleAutoriConsep.gridx = iPosXAccion++;
		
		this.jPanelAccionesEstadoDetalleAutoriConsep.add(this.jButtonActualizarEstadoDetalleAutoriConsep, this.gridBagConstraintsEstadoDetalleAutoriConsep);


		this.gridBagConstraintsEstadoDetalleAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleAutoriConsep.gridy = 0;		
		this.gridBagConstraintsEstadoDetalleAutoriConsep.gridx = iPosXAccion++;
		
		this.jPanelAccionesEstadoDetalleAutoriConsep.add(this.jButtonGuardarCambiosEstadoDetalleAutoriConsep, this.gridBagConstraintsEstadoDetalleAutoriConsep);	
		
		this.gridBagConstraintsEstadoDetalleAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleAutoriConsep.gridy = 0;		
		this.gridBagConstraintsEstadoDetalleAutoriConsep.gridx =iPosXAccion++;
		
		this.jPanelAccionesEstadoDetalleAutoriConsep.add(this.jButtonCancelarEstadoDetalleAutoriConsep, this.gridBagConstraintsEstadoDetalleAutoriConsep);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEstadoDetalleAutoriConsep = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEstadoDetalleAutoriConsep);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.estadodetalleautoriconsepSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEstadoDetalleAutoriConsep = new GridBagConstraints();						
			this.gridBagConstraintsEstadoDetalleAutoriConsep.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadoDetalleAutoriConsep.gridx = 0;		
			//this.gridBagConstraintsEstadoDetalleAutoriConsep.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoDetalleAutoriConsep.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEstadoDetalleAutoriConsep.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsEstadoDetalleAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleAutoriConsep.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEstadoDetalleAutoriConsep.gridx =0;
		this.gridBagConstraintsEstadoDetalleAutoriConsep.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEstadoDetalleAutoriConsep.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEstadoDetalleAutoriConsep, this.gridBagConstraintsEstadoDetalleAutoriConsep);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(EstadoDetalleAutoriConsepJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleEstadoDetalleAutoriConsep = new EstadoDetalleAutoriConsepBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Estado Detalle Autorizacion Consep DATOS");
			
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
			
	        //this.setTitle("[FOR] - Estado Detalle Autorizacion Consep DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estado Detalle Autorizacion Consep Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			EstadoDetalleAutoriConsepModel estadodetalleautoriconsepModel=new EstadoDetalleAutoriConsepModel(this);
			
			//SI USARA CLASE INTERNA
			//EstadoDetalleAutoriConsepModel.EstadoDetalleAutoriConsepFocusTraversalPolicy estadodetalleautoriconsepFocusTraversalPolicy = estadodetalleautoriconsepModel.new EstadoDetalleAutoriConsepFocusTraversalPolicy(this);
			
			//estadodetalleautoriconsepFocusTraversalPolicy.setestadodetalleautoriconsepJInternalFrame(this);
			
			this.setFocusTraversalPolicy(estadodetalleautoriconsepModel);
			
			
			this.jContentPaneDetalleEstadoDetalleAutoriConsep = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleEstadoDetalleAutoriConsep = new GridBagLayout();	
			this.jContentPaneDetalleEstadoDetalleAutoriConsep.setLayout(gridaBagLayoutDetalleEstadoDetalleAutoriConsep);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEstadoDetalleAutoriConsep = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsEstadoDetalleAutoriConsep = new GridBagConstraints();
				this.gridBagConstraintsEstadoDetalleAutoriConsep.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsEstadoDetalleAutoriConsep.gridx = 0;
					
				
				this.jContentPaneDetalleEstadoDetalleAutoriConsep.add(jTtoolBarDetalleEstadoDetalleAutoriConsep, gridBagConstraintsEstadoDetalleAutoriConsep);								
				
}
			
			this.jScrollPanelDatosEdicionEstadoDetalleAutoriConsep=   new JScrollPane(jContentPaneDetalleEstadoDetalleAutoriConsep,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEstadoDetalleAutoriConsep.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoDetalleAutoriConsep.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoDetalleAutoriConsep.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralEstadoDetalleAutoriConsep=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEstadoDetalleAutoriConsep.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoDetalleAutoriConsep.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoDetalleAutoriConsep.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEstadoDetalleAutoriConsep = new GridBagConstraints();
			
			
	        this.gridBagConstraintsEstadoDetalleAutoriConsep.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsEstadoDetalleAutoriConsep.gridx = 0;
	        
			this.jContentPaneDetalleEstadoDetalleAutoriConsep.add(jPanelCamposEstadoDetalleAutoriConsep, gridBagConstraintsEstadoDetalleAutoriConsep);
			
			
			
			
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
						&& estadodetalleautoriconsepSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.estadodetalleautoriconsepSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsEstadoDetalleAutoriConsep= new GridBagConstraints();
						this.gridBagConstraintsEstadoDetalleAutoriConsep.gridy = iGridyRelaciones++;
						this.gridBagConstraintsEstadoDetalleAutoriConsep.gridx = 0;
						this.jContentPaneDetalleEstadoDetalleAutoriConsep.add(this.jTabbedPaneRelacionesEstadoDetalleAutoriConsep, this.gridBagConstraintsEstadoDetalleAutoriConsep);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesEstadoDetalleAutoriConsep.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosEstadoDetalleAutoriConsep.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsEstadoDetalleAutoriConsep = new GridBagConstraints();
					this.gridBagConstraintsEstadoDetalleAutoriConsep.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsEstadoDetalleAutoriConsep.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsEstadoDetalleAutoriConsep.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsEstadoDetalleAutoriConsep.gridx = 0;
					
				
					this.jContentPaneDetalleEstadoDetalleAutoriConsep.add(jPanelCamposOcultosEstadoDetalleAutoriConsep, gridBagConstraintsEstadoDetalleAutoriConsep);
				
					this.jPanelCamposOcultosEstadoDetalleAutoriConsep.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsEstadoDetalleAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleAutoriConsep.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsEstadoDetalleAutoriConsep.gridx = 0;
	        this.gridBagConstraintsEstadoDetalleAutoriConsep.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleEstadoDetalleAutoriConsep.add(this.jPanelAccionesFormularioEstadoDetalleAutoriConsep, this.gridBagConstraintsEstadoDetalleAutoriConsep);							
			
			
			
			this.gridBagConstraintsEstadoDetalleAutoriConsep = new GridBagConstraints();
	        this.gridBagConstraintsEstadoDetalleAutoriConsep.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsEstadoDetalleAutoriConsep.gridx = 0;
	        
			
			this.jContentPaneDetalleEstadoDetalleAutoriConsep.add(this.jPanelAccionesEstadoDetalleAutoriConsep, this.gridBagConstraintsEstadoDetalleAutoriConsep);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionEstadoDetalleAutoriConsep);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionEstadoDetalleAutoriConsep=   new JScrollPane(this.jPanelCamposEstadoDetalleAutoriConsep,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEstadoDetalleAutoriConsep.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoDetalleAutoriConsep.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoDetalleAutoriConsep.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsEstadoDetalleAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleAutoriConsep.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsEstadoDetalleAutoriConsep.gridx = 0;
			this.gridBagConstraintsEstadoDetalleAutoriConsep.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsEstadoDetalleAutoriConsep.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsEstadoDetalleAutoriConsep.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionEstadoDetalleAutoriConsep, this.gridBagConstraintsEstadoDetalleAutoriConsep);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsEstadoDetalleAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleAutoriConsep.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEstadoDetalleAutoriConsep.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioEstadoDetalleAutoriConsep, this.gridBagConstraintsEstadoDetalleAutoriConsep);			
			
			this.gridBagConstraintsEstadoDetalleAutoriConsep = new GridBagConstraints();
			this.gridBagConstraintsEstadoDetalleAutoriConsep.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEstadoDetalleAutoriConsep.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesEstadoDetalleAutoriConsep, this.gridBagConstraintsEstadoDetalleAutoriConsep);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsEstadoDetalleAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleAutoriConsep.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoDetalleAutoriConsep.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEstadoDetalleAutoriConsep, this.gridBagConstraintsEstadoDetalleAutoriConsep);
			
			
		this.gridBagConstraintsEstadoDetalleAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleAutoriConsep.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoDetalleAutoriConsep.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEstadoDetalleAutoriConsep, this.gridBagConstraintsEstadoDetalleAutoriConsep);
		
			
		this.gridBagConstraintsEstadoDetalleAutoriConsep = new GridBagConstraints();
		this.gridBagConstraintsEstadoDetalleAutoriConsep.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEstadoDetalleAutoriConsep.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEstadoDetalleAutoriConsep, this.gridBagConstraintsEstadoDetalleAutoriConsep);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralEstadoDetalleAutoriConsep;//jContentPane;
		
		return jScrollPanelDatosEdicionEstadoDetalleAutoriConsep;
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
