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

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.inventario.util.TipoMensajeCorreoInvenConstantesFunciones;

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
public class TipoMensajeCorreoInvenDetalleFormJInternalFrame extends TipoMensajeCorreoInvenBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoMensajeCorreoInven;
	
	protected JMenuBar jmenuBarDetalleTipoMensajeCorreoInven;
	
	protected JMenu jmenuDetalleTipoMensajeCorreoInven;
	protected JMenu jmenuDetalleArchivoTipoMensajeCorreoInven;
	protected JMenu jmenuDetalleAccionesTipoMensajeCorreoInven;
	protected JMenu jmenuDetalleDatosTipoMensajeCorreoInven;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoMensajeCorreoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoMensajeCorreoInven;	
	protected GridBagConstraints gridBagConstraintsTipoMensajeCorreoInven;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoMensajeCorreoInvenBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoMensajeCorreoInven;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_modulo="";
	
	public TipoMensajeCorreoInvenSessionBean tipomensajecorreoinvenSessionBean;
	
	
	
	
	public ModuloSessionBean moduloSessionBean;	
	
	public TipoMensajeCorreoInvenLogic tipomensajecorreoinvenLogic;
	
	public JScrollPane jScrollPanelDatosTipoMensajeCorreoInven;
	public JScrollPane jScrollPanelDatosEdicionTipoMensajeCorreoInven;
	public JScrollPane jScrollPanelDatosGeneralTipoMensajeCorreoInven;
	
	protected JPanel jPanelCamposTipoMensajeCorreoInven;    
	protected JPanel jPanelCamposOcultosTipoMensajeCorreoInven;    	
	protected JPanel jPanelAccionesTipoMensajeCorreoInven;
	protected JPanel jPanelAccionesFormularioTipoMensajeCorreoInven;
    
	
	
	protected Integer iXPanelCamposTipoMensajeCorreoInven=0;
	protected Integer iYPanelCamposTipoMensajeCorreoInven=0;
	
	protected Integer iXPanelCamposOcultosTipoMensajeCorreoInven=0;
	protected Integer iYPanelCamposOcultosTipoMensajeCorreoInven=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoMensajeCorreoInven;
	public JButton jButtonModificarTipoMensajeCorreoInven;
	public JButton jButtonActualizarTipoMensajeCorreoInven;
    public JButton jButtonEliminarTipoMensajeCorreoInven;
	public JButton jButtonCancelarTipoMensajeCorreoInven;
    public JButton jButtonGuardarCambiosTipoMensajeCorreoInven;
	public JButton jButtonGuardarCambiosTablaTipoMensajeCorreoInven;
	protected JButton jButtonCerrarTipoMensajeCorreoInven;
	
	
	protected JButton jButtonProcesarInformacionTipoMensajeCorreoInven;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoMensajeCorreoInven;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoMensajeCorreoInven;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoMensajeCorreoInven;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoMensajeCorreoInven;
	protected JButton jButtonModificarToolBarTipoMensajeCorreoInven;
	protected JButton jButtonActualizarToolBarTipoMensajeCorreoInven;
    protected JButton jButtonEliminarToolBarTipoMensajeCorreoInven;
	protected JButton jButtonCancelarToolBarTipoMensajeCorreoInven;
    protected JButton jButtonGuardarCambiosToolBarTipoMensajeCorreoInven;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoMensajeCorreoInven;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoMensajeCorreoInven;
	protected JButton jButtonCerrarToolBarTipoMensajeCorreoInven;
	
	protected JButton jButtonProcesarInformacionToolBarTipoMensajeCorreoInven;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoMensajeCorreoInven;
	protected JMenuItem jMenuItemModificarTipoMensajeCorreoInven;
	protected JMenuItem jMenuItemActualizarTipoMensajeCorreoInven;
    protected JMenuItem jMenuItemEliminarTipoMensajeCorreoInven;
	protected JMenuItem jMenuItemCancelarTipoMensajeCorreoInven;
    protected JMenuItem jMenuItemGuardarCambiosTipoMensajeCorreoInven;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoMensajeCorreoInven;
	protected JMenuItem jMenuItemCerrarTipoMensajeCorreoInven;
	protected JMenuItem jMenuItemDetalleCerrarTipoMensajeCorreoInven;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoMensajeCorreoInven;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoMensajeCorreoInven;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoMensajeCorreoInven;
	protected JMenuItem jMenuItemMostrarOcultarTipoMensajeCorreoInven;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoMensajeCorreoInven;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoMensajeCorreoInven;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoMensajeCorreoInven;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoMensajeCorreoInven;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoMensajeCorreoInven;
	public JLabel jLabelIdTipoMensajeCorreoInven;
	public JLabel jLabelidTipoMensajeCorreoInven;
	public JButton jButtonidTipoMensajeCorreoInvenBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoMensajeCorreoInven;
	public JLabel jLabelcodigoTipoMensajeCorreoInven;
	public JTextField jTextFieldcodigoTipoMensajeCorreoInven;
	public JButton jButtoncodigoTipoMensajeCorreoInvenBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoMensajeCorreoInven;
	public JLabel jLabelnombreTipoMensajeCorreoInven;
	public JTextArea jTextAreanombreTipoMensajeCorreoInven;
	public JScrollPane jscrollPanenombreTipoMensajeCorreoInven;
	public JButton jButtonnombreTipoMensajeCorreoInvenBusqueda= new JButtonMe();

	
	public JPanel jPanelid_moduloTipoMensajeCorreoInven;
	public JLabel jLabelid_moduloTipoMensajeCorreoInven;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_moduloTipoMensajeCorreoInven;
	public JButton jButtonid_moduloTipoMensajeCorreoInven= new JButtonMe();
	public JButton jButtonid_moduloTipoMensajeCorreoInvenUpdate= new JButtonMe();
	public JButton jButtonid_moduloTipoMensajeCorreoInvenBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoMensajeCorreoInven;
	
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
	
	public TipoMensajeCorreoInvenDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoMensajeCorreoInven=new JPanel();
				this.jPanelAccionesFormularioTipoMensajeCorreoInven=new JPanel();
				this.jmenuBarDetalleTipoMensajeCorreoInven=new JMenuBar();
				this.jTtoolBarDetalleTipoMensajeCorreoInven=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoMensajeCorreoInvenDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoMensajeCorreoInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoMensajeCorreoInvenDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoMensajeCorreoInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoMensajeCorreoInvenDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoMensajeCorreoInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoMensajeCorreoInvenDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoMensajeCorreoInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoMensajeCorreoInvenDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoMensajeCorreoInven No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoMensajeCorreoInven() {
		return this.jButtonActualizarToolBarTipoMensajeCorreoInven;
	}
	
	public JButton getjButtonEliminarToolBarTipoMensajeCorreoInven() {
		return this.jButtonEliminarToolBarTipoMensajeCorreoInven;
	}
	
	public JButton getjButtonCancelarToolBarTipoMensajeCorreoInven() {
		return this.jButtonCancelarToolBarTipoMensajeCorreoInven;
	}		
	
	public JButton getjButtonProcesarInformacionTipoMensajeCorreoInven() {
		return this.jButtonProcesarInformacionTipoMensajeCorreoInven;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoMensajeCorreoInven)	{
		this.jButtonProcesarInformacionTipoMensajeCorreoInven = jButtonProcesarInformacionTipoMensajeCorreoInven;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoMensajeCorreoInven() {
		return this.jComboBoxTiposAccionesTipoMensajeCorreoInven;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoMensajeCorreoInven(
			JComboBox jComboBoxTiposRelacionesTipoMensajeCorreoInven) {
		this.jComboBoxTiposRelacionesTipoMensajeCorreoInven = jComboBoxTiposRelacionesTipoMensajeCorreoInven;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoMensajeCorreoInven(
			JComboBox jComboBoxTiposAccionesTipoMensajeCorreoInven) {
		this.jComboBoxTiposAccionesTipoMensajeCorreoInven = jComboBoxTiposAccionesTipoMensajeCorreoInven;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoMensajeCorreoInven() {
		return this.jComboBoxTiposAccionesFormularioTipoMensajeCorreoInven;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoMensajeCorreoInven(
			JComboBox jComboBoxTiposAccionesFormularioTipoMensajeCorreoInven) {
		this.jComboBoxTiposAccionesFormularioTipoMensajeCorreoInven = jComboBoxTiposAccionesFormularioTipoMensajeCorreoInven;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipomensajecorreoinvenSessionBean=new TipoMensajeCorreoInvenSessionBean();
		
		this.tipomensajecorreoinvenSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipomensajecorreoinvenSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipomensajecorreoinvenSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoMensajeCorreoInvenJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoMensajeCorreoInvenJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoMensajeCorreoInvenJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Mensaje Correo MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipomensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoMensajeCorreoInvenJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoMensajeCorreoInven= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoMensajeCorreoInven=new JButtonMe();
				this.jButtonModificarToolBarTipoMensajeCorreoInven=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoMensajeCorreoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoMensajeCorreoInven,this.jTtoolBarDetalleTipoMensajeCorreoInven,
							"actualizar","actualizar","Actualizar"+" "+TipoMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoMensajeCorreoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoMensajeCorreoInven,this.jTtoolBarDetalleTipoMensajeCorreoInven,
							"eliminar","eliminar","Eliminar"+" "+TipoMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoMensajeCorreoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoMensajeCorreoInven,this.jTtoolBarDetalleTipoMensajeCorreoInven,
							"cancelar","cancelar","Cancelar"+" "+TipoMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoMensajeCorreoInven=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoMensajeCorreoInven,this.jTtoolBarDetalleTipoMensajeCorreoInven,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoMensajeCorreoInven,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoMensajeCorreoInven,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoMensajeCorreoInven,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoMensajeCorreoInven=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoMensajeCorreoInven=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoMensajeCorreoInven=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoMensajeCorreoInven=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoMensajeCorreoInven=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoMensajeCorreoInven= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoMensajeCorreoInven.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoMensajeCorreoInven,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoMensajeCorreoInven= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoMensajeCorreoInven.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoMensajeCorreoInven,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoMensajeCorreoInven= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoMensajeCorreoInven.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoMensajeCorreoInven,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoMensajeCorreoInven= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoMensajeCorreoInven.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoMensajeCorreoInven,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoMensajeCorreoInven= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoMensajeCorreoInven.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoMensajeCorreoInven,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoMensajeCorreoInven= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoMensajeCorreoInven.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoMensajeCorreoInven,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoMensajeCorreoInven= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoMensajeCorreoInven.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoMensajeCorreoInven,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoMensajeCorreoInven= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoMensajeCorreoInven.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoMensajeCorreoInven,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoMensajeCorreoInven= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoMensajeCorreoInven.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoMensajeCorreoInven,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoMensajeCorreoInven= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoMensajeCorreoInven.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoMensajeCorreoInven,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoMensajeCorreoInven.add(this.jMenuItemDetalleCerrarTipoMensajeCorreoInven);
		
		this.jmenuDetalleAccionesTipoMensajeCorreoInven.add(this.jMenuItemActualizarTipoMensajeCorreoInven);
		this.jmenuDetalleAccionesTipoMensajeCorreoInven.add(this.jMenuItemEliminarTipoMensajeCorreoInven);
		this.jmenuDetalleAccionesTipoMensajeCorreoInven.add(this.jMenuItemCancelarTipoMensajeCorreoInven);		
		
		//this.jmenuDetalleDatosTipoMensajeCorreoInven.add(this.jMenuItemDetalleAbrirOrderByTipoMensajeCorreoInven);				
		this.jmenuDetalleDatosTipoMensajeCorreoInven.add(this.jMenuItemDetalleMostarOcultarTipoMensajeCorreoInven);				
				
		//this.jmenuDetalleAccionesTipoMensajeCorreoInven.add(this.jMenuItemGuardarCambiosTipoMensajeCorreoInven);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoMensajeCorreoInven.add(this.jmenuDetalleArchivoTipoMensajeCorreoInven);		
		this.jmenuBarDetalleTipoMensajeCorreoInven.add(this.jmenuDetalleAccionesTipoMensajeCorreoInven);		
		this.jmenuBarDetalleTipoMensajeCorreoInven.add(this.jmenuDetalleDatosTipoMensajeCorreoInven);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoMensajeCorreoInven);				
	}
	
	
	public void inicializarElementosCamposTipoMensajeCorreoInven() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoMensajeCorreoInven = new JLabelMe();
		jLabelIdTipoMensajeCorreoInven.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoMensajeCorreoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoMensajeCorreoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoMensajeCorreoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoMensajeCorreoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoMensajeCorreoInven = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoMensajeCorreoInven.setToolTipText(TipoMensajeCorreoInvenConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoMensajeCorreoInven= new GridBagLayout();

		this.jPanelidTipoMensajeCorreoInven.setLayout(this.gridaBagLayoutTipoMensajeCorreoInven);

		jLabelidTipoMensajeCorreoInven = new JLabel();
		jLabelidTipoMensajeCorreoInven.setText("Id");

		jLabelidTipoMensajeCorreoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoMensajeCorreoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoMensajeCorreoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoMensajeCorreoInven = new JLabelMe();
		this.jLabelcodigoTipoMensajeCorreoInven.setText(""+TipoMensajeCorreoInvenConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoMensajeCorreoInven.setToolTipText("Codigo");
		this.jLabelcodigoTipoMensajeCorreoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoMensajeCorreoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoMensajeCorreoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoMensajeCorreoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoMensajeCorreoInven=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoMensajeCorreoInven.setToolTipText(TipoMensajeCorreoInvenConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoMensajeCorreoInven = new GridBagLayout();
		this.jPanelcodigoTipoMensajeCorreoInven.setLayout(this.gridaBagLayoutTipoMensajeCorreoInven);


		jTextFieldcodigoTipoMensajeCorreoInven= new JTextFieldMe();

		jTextFieldcodigoTipoMensajeCorreoInven.setEnabled(false);
		jTextFieldcodigoTipoMensajeCorreoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoMensajeCorreoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoMensajeCorreoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoMensajeCorreoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoMensajeCorreoInvenBusqueda= new JButtonMe();
		this.jButtoncodigoTipoMensajeCorreoInvenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoMensajeCorreoInvenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoMensajeCorreoInvenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoMensajeCorreoInvenBusqueda.setText("U");
		this.jButtoncodigoTipoMensajeCorreoInvenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoMensajeCorreoInvenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoMensajeCorreoInvenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoMensajeCorreoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoMensajeCorreoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoMensajeCorreoInvenBusqueda"));

		if(this.tipomensajecorreoinvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoMensajeCorreoInvenBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoMensajeCorreoInven = new JLabelMe();
		this.jLabelnombreTipoMensajeCorreoInven.setText(""+TipoMensajeCorreoInvenConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoMensajeCorreoInven.setToolTipText("Nombre");
		this.jLabelnombreTipoMensajeCorreoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoMensajeCorreoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoMensajeCorreoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoMensajeCorreoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoMensajeCorreoInven=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoMensajeCorreoInven.setToolTipText(TipoMensajeCorreoInvenConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoMensajeCorreoInven = new GridBagLayout();
		this.jPanelnombreTipoMensajeCorreoInven.setLayout(this.gridaBagLayoutTipoMensajeCorreoInven);


		jTextAreanombreTipoMensajeCorreoInven= new JTextAreaMe();
		jTextAreanombreTipoMensajeCorreoInven.setEnabled(false);
		jTextAreanombreTipoMensajeCorreoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoMensajeCorreoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoMensajeCorreoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoMensajeCorreoInven.setLineWrap(true);
		jTextAreanombreTipoMensajeCorreoInven.setWrapStyleWord(true);
		jTextAreanombreTipoMensajeCorreoInven.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoMensajeCorreoInven.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoMensajeCorreoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoMensajeCorreoInven = new JScrollPane(jTextAreanombreTipoMensajeCorreoInven);
		jscrollPanenombreTipoMensajeCorreoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoMensajeCorreoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoMensajeCorreoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoMensajeCorreoInvenBusqueda= new JButtonMe();
		this.jButtonnombreTipoMensajeCorreoInvenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoMensajeCorreoInvenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoMensajeCorreoInvenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoMensajeCorreoInvenBusqueda.setText("U");
		this.jButtonnombreTipoMensajeCorreoInvenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoMensajeCorreoInvenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoMensajeCorreoInvenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoMensajeCorreoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoMensajeCorreoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoMensajeCorreoInvenBusqueda"));

		if(this.tipomensajecorreoinvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoMensajeCorreoInvenBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoMensajeCorreoInven() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_moduloTipoMensajeCorreoInven = new JLabelMe();
		this.jLabelid_moduloTipoMensajeCorreoInven.setText(""+TipoMensajeCorreoInvenConstantesFunciones.LABEL_IDMODULO+" : *");
		this.jLabelid_moduloTipoMensajeCorreoInven.setToolTipText("Modulo");
		this.jLabelid_moduloTipoMensajeCorreoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloTipoMensajeCorreoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloTipoMensajeCorreoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_moduloTipoMensajeCorreoInven,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_moduloTipoMensajeCorreoInven=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_moduloTipoMensajeCorreoInven.setToolTipText(TipoMensajeCorreoInvenConstantesFunciones.LABEL_IDMODULO);
		this.gridaBagLayoutTipoMensajeCorreoInven = new GridBagLayout();
		this.jPanelid_moduloTipoMensajeCorreoInven.setLayout(this.gridaBagLayoutTipoMensajeCorreoInven);


		jComboBoxid_moduloTipoMensajeCorreoInven= new JComboBoxMe();
		jComboBoxid_moduloTipoMensajeCorreoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloTipoMensajeCorreoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloTipoMensajeCorreoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_moduloTipoMensajeCorreoInven,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_moduloTipoMensajeCorreoInven.setEnabled(false);

		this.jButtonid_moduloTipoMensajeCorreoInven= new JButtonMe();
		this.jButtonid_moduloTipoMensajeCorreoInven.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloTipoMensajeCorreoInven.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloTipoMensajeCorreoInven.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloTipoMensajeCorreoInven.setText("Buscar");
		this.jButtonid_moduloTipoMensajeCorreoInven.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_moduloTipoMensajeCorreoInven.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloTipoMensajeCorreoInven,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_moduloTipoMensajeCorreoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloTipoMensajeCorreoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloTipoMensajeCorreoInven"));

		this.jButtonid_moduloTipoMensajeCorreoInvenBusqueda= new JButtonMe();
		this.jButtonid_moduloTipoMensajeCorreoInvenBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloTipoMensajeCorreoInvenBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloTipoMensajeCorreoInvenBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloTipoMensajeCorreoInvenBusqueda.setText("U");
		this.jButtonid_moduloTipoMensajeCorreoInvenBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_moduloTipoMensajeCorreoInvenBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloTipoMensajeCorreoInvenBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_moduloTipoMensajeCorreoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloTipoMensajeCorreoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloTipoMensajeCorreoInvenBusqueda"));

		if(this.tipomensajecorreoinvenSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_moduloTipoMensajeCorreoInvenBusqueda.setVisible(false);		}

		this.jButtonid_moduloTipoMensajeCorreoInvenUpdate= new JButtonMe();
		this.jButtonid_moduloTipoMensajeCorreoInvenUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloTipoMensajeCorreoInvenUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloTipoMensajeCorreoInvenUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloTipoMensajeCorreoInvenUpdate.setText("U");
		this.jButtonid_moduloTipoMensajeCorreoInvenUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_moduloTipoMensajeCorreoInvenUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloTipoMensajeCorreoInvenUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_moduloTipoMensajeCorreoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloTipoMensajeCorreoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloTipoMensajeCorreoInvenUpdate"));



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
		//this.jInternalFrameDetalleTipoMensajeCorreoInven = new TipoMensajeCorreoInvenBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Mensaje Correo DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoMensajeCorreoInven= new GridBagLayout();
		

		
		String sToolTipTipoMensajeCorreoInven="";
		sToolTipTipoMensajeCorreoInven=TipoMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoMensajeCorreoInven+="(Inventario.TipoMensajeCorreoInven)";
		}
		
		if(!this.tipomensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoMensajeCorreoInven+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoMensajeCorreoInven = new JButtonMe();
		this.jButtonModificarTipoMensajeCorreoInven = new JButtonMe();
        this.jButtonActualizarTipoMensajeCorreoInven = new JButtonMe();
        this.jButtonEliminarTipoMensajeCorreoInven = new JButtonMe();
        this.jButtonCancelarTipoMensajeCorreoInven = new JButtonMe();
        this.jButtonGuardarCambiosTipoMensajeCorreoInven = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoMensajeCorreoInven = new JButtonMe();
		this.jButtonCerrarTipoMensajeCorreoInven = new JButtonMe();
		
		this.jScrollPanelDatosTipoMensajeCorreoInven = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoMensajeCorreoInven = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoMensajeCorreoInven = new JScrollPane();
				
		
		
		this.jPanelCamposTipoMensajeCorreoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoMensajeCorreoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoMensajeCorreoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoMensajeCorreoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Mensaje Correo";
		
		if(!this.tipomensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoMensajeCorreoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Mensaje Correos" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoMensajeCorreoInven.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoMensajeCorreoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoMensajeCorreoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoMensajeCorreoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoMensajeCorreoInven.setName("jPanelCamposTipoMensajeCorreoInven"); 

		this.jPanelCamposOcultosTipoMensajeCorreoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoMensajeCorreoInven.setName("jPanelCamposOcultosTipoMensajeCorreoInven"); 

        this.jPanelAccionesTipoMensajeCorreoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoMensajeCorreoInven.setToolTipText("Acciones");
        this.jPanelAccionesTipoMensajeCorreoInven.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoMensajeCorreoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoMensajeCorreoInven.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoMensajeCorreoInven.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoMensajeCorreoInven.setText("Nuevo");
		this.jButtonModificarTipoMensajeCorreoInven.setText("Editar");
        this.jButtonActualizarTipoMensajeCorreoInven.setText("Actualizar");
        this.jButtonEliminarTipoMensajeCorreoInven.setText("Eliminar");
        this.jButtonCancelarTipoMensajeCorreoInven.setText("Cancelar");
        this.jButtonGuardarCambiosTipoMensajeCorreoInven.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoMensajeCorreoInven.setText("Guardar");
		this.jButtonCerrarTipoMensajeCorreoInven.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoMensajeCorreoInven,"nuevo_button","Nuevo",this.tipomensajecorreoinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoMensajeCorreoInven,"modificar_button","Editar",this.tipomensajecorreoinvenSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoMensajeCorreoInven,"actualizar_button","Actualizar",this.tipomensajecorreoinvenSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoMensajeCorreoInven,"eliminar_button","Eliminar",this.tipomensajecorreoinvenSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoMensajeCorreoInven,"cancelar_button","Cancelar",this.tipomensajecorreoinvenSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoMensajeCorreoInven,"guardarcambios_button","Guardar",this.tipomensajecorreoinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoMensajeCorreoInven,"guardarcambiostabla_button","Guardar",this.tipomensajecorreoinvenSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoMensajeCorreoInven,"cerrar_button","Salir",this.tipomensajecorreoinvenSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoMensajeCorreoInven.setToolTipText("Nuevo"+" "+TipoMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoMensajeCorreoInven.setToolTipText("Editar"+" "+TipoMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoMensajeCorreoInven.setToolTipText("Actualizar"+" "+TipoMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoMensajeCorreoInven.setToolTipText("Eliminar)"+" "+TipoMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoMensajeCorreoInven.setToolTipText("Cancelar"+" "+TipoMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoMensajeCorreoInven.setToolTipText("Guardar"+" "+TipoMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoMensajeCorreoInven.setToolTipText("Guardar"+" "+TipoMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoMensajeCorreoInven.setToolTipText("Salir"+" "+TipoMensajeCorreoInvenConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoMensajeCorreoInven";
		inputMap = this.jButtonNuevoTipoMensajeCorreoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoMensajeCorreoInven.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoMensajeCorreoInven"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoMensajeCorreoInven";
		inputMap = this.jButtonActualizarTipoMensajeCorreoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoMensajeCorreoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoMensajeCorreoInven"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoMensajeCorreoInven";
		inputMap = this.jButtonEliminarTipoMensajeCorreoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoMensajeCorreoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoMensajeCorreoInven"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoMensajeCorreoInven";
		inputMap = this.jButtonCancelarTipoMensajeCorreoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoMensajeCorreoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoMensajeCorreoInven"));
		
		//CERRAR		
		sMapKey = "CerrarTipoMensajeCorreoInven";
		inputMap = this.jButtonCerrarTipoMensajeCorreoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoMensajeCorreoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoMensajeCorreoInven"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoMensajeCorreoInven";
		inputMap = this.jButtonGuardarCambiosTablaTipoMensajeCorreoInven.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoMensajeCorreoInven.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoMensajeCorreoInven"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoMensajeCorreoInven = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoMensajeCorreoInven.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoMensajeCorreoInven.setToolTipText("Nuevo TipoMensajeCorreoInven");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoMensajeCorreoInven = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoMensajeCorreoInven.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoMensajeCorreoInven.setToolTipText("Sin Cerrar Ventana TipoMensajeCorreoInven");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoMensajeCorreoInven = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoMensajeCorreoInven.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoMensajeCorreoInven.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoMensajeCorreoInven = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoMensajeCorreoInven.setText("Accion");
		this.jComboBoxTiposAccionesTipoMensajeCorreoInven.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoMensajeCorreoInven = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoMensajeCorreoInven.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoMensajeCorreoInven.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoMensajeCorreoInven = new JLabelMe();
		
		this.jLabelAccionesTipoMensajeCorreoInven.setText("Acciones");		
		this.jLabelAccionesTipoMensajeCorreoInven.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoMensajeCorreoInven.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoMensajeCorreoInven.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoMensajeCorreoInven();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoMensajeCorreoInven();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoMensajeCorreoInven=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoMensajeCorreoInven.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoMensajeCorreoInven,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoMensajeCorreoInven.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoMensajeCorreoInven.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoMensajeCorreoInven.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoMensajeCorreoInven.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoMensajeCorreoInven.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoMensajeCorreoInven.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoMensajeCorreoInven, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoMensajeCorreoInven = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoMensajeCorreoInven = new GridBagLayout();
		
		this.jPanelCamposTipoMensajeCorreoInven.setLayout(gridaBagLayoutCamposTipoMensajeCorreoInven);
		this.jPanelCamposOcultosTipoMensajeCorreoInven.setLayout(gridaBagLayoutCamposOcultosTipoMensajeCorreoInven);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoMensajeCorreoInven = new GridBagConstraints();
	this.gridBagConstraintsTipoMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoMensajeCorreoInven.gridy = 0;
	this.gridBagConstraintsTipoMensajeCorreoInven.gridx = 0;
	this.gridBagConstraintsTipoMensajeCorreoInven.ipadx = 0;
	this.gridBagConstraintsTipoMensajeCorreoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoMensajeCorreoInven.add(jLabelIdTipoMensajeCorreoInven, this.gridBagConstraintsTipoMensajeCorreoInven);



	this.gridBagConstraintsTipoMensajeCorreoInven = new GridBagConstraints();
	this.gridBagConstraintsTipoMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoMensajeCorreoInven.gridy = 0;
	this.gridBagConstraintsTipoMensajeCorreoInven.gridx = 1;
	this.gridBagConstraintsTipoMensajeCorreoInven.ipadx = 0;
	this.gridBagConstraintsTipoMensajeCorreoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoMensajeCorreoInven.add(jLabelidTipoMensajeCorreoInven, this.gridBagConstraintsTipoMensajeCorreoInven);


	this.gridBagConstraintsTipoMensajeCorreoInven = new GridBagConstraints();
	this.gridBagConstraintsTipoMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoMensajeCorreoInven.gridy = 0;
	this.gridBagConstraintsTipoMensajeCorreoInven.gridx = 0;
	this.gridBagConstraintsTipoMensajeCorreoInven.ipadx = 0;
	this.gridBagConstraintsTipoMensajeCorreoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_moduloTipoMensajeCorreoInven.add(jLabelid_moduloTipoMensajeCorreoInven, this.gridBagConstraintsTipoMensajeCorreoInven);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoMensajeCorreoInven = new GridBagConstraints();
		//this.gridBagConstraintsTipoMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMensajeCorreoInven.gridy = 0;
		this.gridBagConstraintsTipoMensajeCorreoInven.gridx = 2;
		this.gridBagConstraintsTipoMensajeCorreoInven.ipadx = 0;
		this.gridBagConstraintsTipoMensajeCorreoInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloTipoMensajeCorreoInven.add(jButtonid_moduloTipoMensajeCorreoInvenBusqueda, this.gridBagConstraintsTipoMensajeCorreoInven);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoMensajeCorreoInven = new GridBagConstraints();
		//this.gridBagConstraintsTipoMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMensajeCorreoInven.gridy = 0;
		this.gridBagConstraintsTipoMensajeCorreoInven.gridx = 3;
		this.gridBagConstraintsTipoMensajeCorreoInven.ipadx = 0;
		this.gridBagConstraintsTipoMensajeCorreoInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloTipoMensajeCorreoInven.add(jButtonid_moduloTipoMensajeCorreoInvenUpdate, this.gridBagConstraintsTipoMensajeCorreoInven);
	}

	this.gridBagConstraintsTipoMensajeCorreoInven = new GridBagConstraints();
	this.gridBagConstraintsTipoMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoMensajeCorreoInven.gridy = 0;
	this.gridBagConstraintsTipoMensajeCorreoInven.gridx = 1;
	this.gridBagConstraintsTipoMensajeCorreoInven.ipadx = 0;
	this.gridBagConstraintsTipoMensajeCorreoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_moduloTipoMensajeCorreoInven.add(jComboBoxid_moduloTipoMensajeCorreoInven, this.gridBagConstraintsTipoMensajeCorreoInven);


	this.gridBagConstraintsTipoMensajeCorreoInven = new GridBagConstraints();
	this.gridBagConstraintsTipoMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoMensajeCorreoInven.gridy = 0;
	this.gridBagConstraintsTipoMensajeCorreoInven.gridx = 0;
	this.gridBagConstraintsTipoMensajeCorreoInven.ipadx = 0;
	this.gridBagConstraintsTipoMensajeCorreoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoMensajeCorreoInven.add(jLabelcodigoTipoMensajeCorreoInven, this.gridBagConstraintsTipoMensajeCorreoInven);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoMensajeCorreoInven = new GridBagConstraints();
		//this.gridBagConstraintsTipoMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMensajeCorreoInven.gridy = 0;
		this.gridBagConstraintsTipoMensajeCorreoInven.gridx = 2;
		this.gridBagConstraintsTipoMensajeCorreoInven.ipadx = 0;
		this.gridBagConstraintsTipoMensajeCorreoInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoMensajeCorreoInven.add(jButtoncodigoTipoMensajeCorreoInvenBusqueda, this.gridBagConstraintsTipoMensajeCorreoInven);
	}

	this.gridBagConstraintsTipoMensajeCorreoInven = new GridBagConstraints();
	this.gridBagConstraintsTipoMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoMensajeCorreoInven.gridy = 0;
	this.gridBagConstraintsTipoMensajeCorreoInven.gridx = 1;
	this.gridBagConstraintsTipoMensajeCorreoInven.ipadx = 0;
	this.gridBagConstraintsTipoMensajeCorreoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoMensajeCorreoInven.add(jTextFieldcodigoTipoMensajeCorreoInven, this.gridBagConstraintsTipoMensajeCorreoInven);


	this.gridBagConstraintsTipoMensajeCorreoInven = new GridBagConstraints();
	this.gridBagConstraintsTipoMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoMensajeCorreoInven.gridy = 0;
	this.gridBagConstraintsTipoMensajeCorreoInven.gridx = 0;
	this.gridBagConstraintsTipoMensajeCorreoInven.ipadx = 0;
	this.gridBagConstraintsTipoMensajeCorreoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoMensajeCorreoInven.add(jLabelnombreTipoMensajeCorreoInven, this.gridBagConstraintsTipoMensajeCorreoInven);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoMensajeCorreoInven = new GridBagConstraints();
		//this.gridBagConstraintsTipoMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoMensajeCorreoInven.gridy = 0;
		this.gridBagConstraintsTipoMensajeCorreoInven.gridx = 2;
		this.gridBagConstraintsTipoMensajeCorreoInven.ipadx = 0;
		this.gridBagConstraintsTipoMensajeCorreoInven.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoMensajeCorreoInven.add(jButtonnombreTipoMensajeCorreoInvenBusqueda, this.gridBagConstraintsTipoMensajeCorreoInven);
	}

	this.gridBagConstraintsTipoMensajeCorreoInven = new GridBagConstraints();
	this.gridBagConstraintsTipoMensajeCorreoInven.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoMensajeCorreoInven.gridy = 0;
	this.gridBagConstraintsTipoMensajeCorreoInven.gridx = 1;
	this.gridBagConstraintsTipoMensajeCorreoInven.ipadx = 0;
	this.gridBagConstraintsTipoMensajeCorreoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoMensajeCorreoInven.add(jscrollPanenombreTipoMensajeCorreoInven, this.gridBagConstraintsTipoMensajeCorreoInven);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoMensajeCorreoInven = new GridBagConstraints();
	this.gridBagConstraintsTipoMensajeCorreoInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoMensajeCorreoInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoMensajeCorreoInven.gridy = iYPanelCamposTipoMensajeCorreoInven;
	this.gridBagConstraintsTipoMensajeCorreoInven.gridx = iXPanelCamposTipoMensajeCorreoInven++;
	this.gridBagConstraintsTipoMensajeCorreoInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoMensajeCorreoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoMensajeCorreoInven.add(this.jPanelidTipoMensajeCorreoInven, this.gridBagConstraintsTipoMensajeCorreoInven);



	if(iXPanelCamposTipoMensajeCorreoInven % 1==0) {
		iXPanelCamposTipoMensajeCorreoInven=0;
		iYPanelCamposTipoMensajeCorreoInven++;
	}
	this.gridBagConstraintsTipoMensajeCorreoInven = new GridBagConstraints();
	this.gridBagConstraintsTipoMensajeCorreoInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoMensajeCorreoInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoMensajeCorreoInven.gridy = iYPanelCamposTipoMensajeCorreoInven;
	this.gridBagConstraintsTipoMensajeCorreoInven.gridx = iXPanelCamposTipoMensajeCorreoInven++;
	this.gridBagConstraintsTipoMensajeCorreoInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoMensajeCorreoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoMensajeCorreoInven.add(this.jPanelcodigoTipoMensajeCorreoInven, this.gridBagConstraintsTipoMensajeCorreoInven);



	if(iXPanelCamposTipoMensajeCorreoInven % 1==0) {
		iXPanelCamposTipoMensajeCorreoInven=0;
		iYPanelCamposTipoMensajeCorreoInven++;
	}
	this.gridBagConstraintsTipoMensajeCorreoInven = new GridBagConstraints();
	this.gridBagConstraintsTipoMensajeCorreoInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoMensajeCorreoInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoMensajeCorreoInven.gridy = iYPanelCamposTipoMensajeCorreoInven;
	this.gridBagConstraintsTipoMensajeCorreoInven.gridx = iXPanelCamposTipoMensajeCorreoInven++;
	this.gridBagConstraintsTipoMensajeCorreoInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoMensajeCorreoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoMensajeCorreoInven.add(this.jPanelnombreTipoMensajeCorreoInven, this.gridBagConstraintsTipoMensajeCorreoInven);



	if(iXPanelCamposTipoMensajeCorreoInven % 1==0) {
		iXPanelCamposTipoMensajeCorreoInven=0;
		iYPanelCamposTipoMensajeCorreoInven++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTipoMensajeCorreoInven = new GridBagConstraints();
	this.gridBagConstraintsTipoMensajeCorreoInven.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoMensajeCorreoInven.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoMensajeCorreoInven.gridy = iYPanelCamposOcultosTipoMensajeCorreoInven;
	this.gridBagConstraintsTipoMensajeCorreoInven.gridx = iXPanelCamposOcultosTipoMensajeCorreoInven++;
	this.gridBagConstraintsTipoMensajeCorreoInven.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoMensajeCorreoInven.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTipoMensajeCorreoInven.add(this.jPanelid_moduloTipoMensajeCorreoInven, this.gridBagConstraintsTipoMensajeCorreoInven);



	if(iXPanelCamposOcultosTipoMensajeCorreoInven % 1==0) {
		iXPanelCamposOcultosTipoMensajeCorreoInven=0;
		iYPanelCamposOcultosTipoMensajeCorreoInven++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoMensajeCorreoInven= new GridBagLayout();
		this.jPanelAccionesTipoMensajeCorreoInven.setLayout(gridaBagLayoutAccionesTipoMensajeCorreoInven);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoMensajeCorreoInven= new GridBagLayout();
		this.jPanelAccionesFormularioTipoMensajeCorreoInven.setLayout(gridaBagLayoutAccionesFormularioTipoMensajeCorreoInven);
		
		this.gridBagConstraintsTipoMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoMensajeCorreoInven.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoMensajeCorreoInven.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoMensajeCorreoInven.add(this.jComboBoxTiposAccionesFormularioTipoMensajeCorreoInven, this.gridBagConstraintsTipoMensajeCorreoInven);

		this.gridBagConstraintsTipoMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoMensajeCorreoInven.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoMensajeCorreoInven.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoMensajeCorreoInven.add(this.jCheckBoxPostAccionNuevoTipoMensajeCorreoInven, this.gridBagConstraintsTipoMensajeCorreoInven);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipomensajecorreoinvenSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoMensajeCorreoInven.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoMensajeCorreoInven.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoMensajeCorreoInven.add(this.jCheckBoxPostAccionSinCerrarTipoMensajeCorreoInven, this.gridBagConstraintsTipoMensajeCorreoInven);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipomensajecorreoinvenSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipomensajecorreoinvenSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoMensajeCorreoInven.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoMensajeCorreoInven.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoMensajeCorreoInven.add(this.jCheckBoxPostAccionSinMensajeTipoMensajeCorreoInven, this.gridBagConstraintsTipoMensajeCorreoInven);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMensajeCorreoInven.gridy = 0;
		this.gridBagConstraintsTipoMensajeCorreoInven.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoMensajeCorreoInven.add(this.jButtonModificarTipoMensajeCorreoInven, this.gridBagConstraintsTipoMensajeCorreoInven);							

		this.gridBagConstraintsTipoMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoMensajeCorreoInven.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoMensajeCorreoInven.gridy = 0;
		this.gridBagConstraintsTipoMensajeCorreoInven.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoMensajeCorreoInven.add(this.jButtonEliminarTipoMensajeCorreoInven, this.gridBagConstraintsTipoMensajeCorreoInven);
		
			
		this.gridBagConstraintsTipoMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoMensajeCorreoInven.gridy = 0;		
		this.gridBagConstraintsTipoMensajeCorreoInven.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoMensajeCorreoInven.add(this.jButtonActualizarTipoMensajeCorreoInven, this.gridBagConstraintsTipoMensajeCorreoInven);


		this.gridBagConstraintsTipoMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoMensajeCorreoInven.gridy = 0;		
		this.gridBagConstraintsTipoMensajeCorreoInven.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoMensajeCorreoInven.add(this.jButtonGuardarCambiosTipoMensajeCorreoInven, this.gridBagConstraintsTipoMensajeCorreoInven);	
		
		this.gridBagConstraintsTipoMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoMensajeCorreoInven.gridy = 0;		
		this.gridBagConstraintsTipoMensajeCorreoInven.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoMensajeCorreoInven.add(this.jButtonCancelarTipoMensajeCorreoInven, this.gridBagConstraintsTipoMensajeCorreoInven);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoMensajeCorreoInven = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoMensajeCorreoInven);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipomensajecorreoinvenSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoMensajeCorreoInven = new GridBagConstraints();						
			this.gridBagConstraintsTipoMensajeCorreoInven.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoMensajeCorreoInven.gridx = 0;		
			//this.gridBagConstraintsTipoMensajeCorreoInven.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoMensajeCorreoInven.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoMensajeCorreoInven.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoMensajeCorreoInven.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoMensajeCorreoInven.gridx =0;
		this.gridBagConstraintsTipoMensajeCorreoInven.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoMensajeCorreoInven.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoMensajeCorreoInven, this.gridBagConstraintsTipoMensajeCorreoInven);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoMensajeCorreoInvenJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoMensajeCorreoInven = new TipoMensajeCorreoInvenBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Mensaje Correo DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Mensaje Correo DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Mensaje Correo Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoMensajeCorreoInvenModel tipomensajecorreoinvenModel=new TipoMensajeCorreoInvenModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoMensajeCorreoInvenModel.TipoMensajeCorreoInvenFocusTraversalPolicy tipomensajecorreoinvenFocusTraversalPolicy = tipomensajecorreoinvenModel.new TipoMensajeCorreoInvenFocusTraversalPolicy(this);
			
			//tipomensajecorreoinvenFocusTraversalPolicy.settipomensajecorreoinvenJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipomensajecorreoinvenModel);
			
			
			this.jContentPaneDetalleTipoMensajeCorreoInven = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoMensajeCorreoInven = new GridBagLayout();	
			this.jContentPaneDetalleTipoMensajeCorreoInven.setLayout(gridaBagLayoutDetalleTipoMensajeCorreoInven);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoMensajeCorreoInven = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoMensajeCorreoInven = new GridBagConstraints();
				this.gridBagConstraintsTipoMensajeCorreoInven.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoMensajeCorreoInven.gridx = 0;
					
				
				this.jContentPaneDetalleTipoMensajeCorreoInven.add(jTtoolBarDetalleTipoMensajeCorreoInven, gridBagConstraintsTipoMensajeCorreoInven);								
				
}
			
			this.jScrollPanelDatosEdicionTipoMensajeCorreoInven=   new JScrollPane(jContentPaneDetalleTipoMensajeCorreoInven,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoMensajeCorreoInven.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoMensajeCorreoInven.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoMensajeCorreoInven.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoMensajeCorreoInven=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoMensajeCorreoInven.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoMensajeCorreoInven.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoMensajeCorreoInven.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoMensajeCorreoInven = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoMensajeCorreoInven.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoMensajeCorreoInven.gridx = 0;
	        
			this.jContentPaneDetalleTipoMensajeCorreoInven.add(jPanelCamposTipoMensajeCorreoInven, gridBagConstraintsTipoMensajeCorreoInven);
			
			
			
			
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
						&& tipomensajecorreoinvenSessionBean.getConGuardarRelaciones()
						) {
					
					if(this.tipomensajecorreoinvenSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoMensajeCorreoInven= new GridBagConstraints();
						this.gridBagConstraintsTipoMensajeCorreoInven.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoMensajeCorreoInven.gridx = 0;
						this.jContentPaneDetalleTipoMensajeCorreoInven.add(this.jTabbedPaneRelacionesTipoMensajeCorreoInven, this.gridBagConstraintsTipoMensajeCorreoInven);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoMensajeCorreoInven.setVisible(false);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoMensajeCorreoInven.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoMensajeCorreoInven = new GridBagConstraints();
					this.gridBagConstraintsTipoMensajeCorreoInven.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoMensajeCorreoInven.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoMensajeCorreoInven.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoMensajeCorreoInven.gridx = 0;
					
				
					this.jContentPaneDetalleTipoMensajeCorreoInven.add(jPanelCamposOcultosTipoMensajeCorreoInven, gridBagConstraintsTipoMensajeCorreoInven);
				
					this.jPanelCamposOcultosTipoMensajeCorreoInven.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoMensajeCorreoInven.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTipoMensajeCorreoInven.gridx = 0;
	        this.gridBagConstraintsTipoMensajeCorreoInven.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoMensajeCorreoInven.add(this.jPanelAccionesFormularioTipoMensajeCorreoInven, this.gridBagConstraintsTipoMensajeCorreoInven);							
			
			
			
			this.gridBagConstraintsTipoMensajeCorreoInven = new GridBagConstraints();
	        this.gridBagConstraintsTipoMensajeCorreoInven.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTipoMensajeCorreoInven.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoMensajeCorreoInven.add(this.jPanelAccionesTipoMensajeCorreoInven, this.gridBagConstraintsTipoMensajeCorreoInven);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoMensajeCorreoInven);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoMensajeCorreoInven=   new JScrollPane(this.jPanelCamposTipoMensajeCorreoInven,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoMensajeCorreoInven.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoMensajeCorreoInven.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoMensajeCorreoInven.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoMensajeCorreoInven.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoMensajeCorreoInven.gridx = 0;
			this.gridBagConstraintsTipoMensajeCorreoInven.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoMensajeCorreoInven.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoMensajeCorreoInven.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoMensajeCorreoInven, this.gridBagConstraintsTipoMensajeCorreoInven);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoMensajeCorreoInven.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoMensajeCorreoInven.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoMensajeCorreoInven, this.gridBagConstraintsTipoMensajeCorreoInven);			
			
			this.gridBagConstraintsTipoMensajeCorreoInven = new GridBagConstraints();
			this.gridBagConstraintsTipoMensajeCorreoInven.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoMensajeCorreoInven.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoMensajeCorreoInven, this.gridBagConstraintsTipoMensajeCorreoInven);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoMensajeCorreoInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoMensajeCorreoInven.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoMensajeCorreoInven, this.gridBagConstraintsTipoMensajeCorreoInven);
			
			
		this.gridBagConstraintsTipoMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoMensajeCorreoInven.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoMensajeCorreoInven.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoMensajeCorreoInven, this.gridBagConstraintsTipoMensajeCorreoInven);
		
			
		this.gridBagConstraintsTipoMensajeCorreoInven = new GridBagConstraints();
		this.gridBagConstraintsTipoMensajeCorreoInven.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoMensajeCorreoInven.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoMensajeCorreoInven, this.gridBagConstraintsTipoMensajeCorreoInven);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoMensajeCorreoInven;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoMensajeCorreoInven;
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
