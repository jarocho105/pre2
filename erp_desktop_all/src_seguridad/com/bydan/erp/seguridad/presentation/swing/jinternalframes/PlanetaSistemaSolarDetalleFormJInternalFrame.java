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



import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;



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
import com.bydan.erp.seguridad.util.PlanetaSistemaSolarConstantesFunciones;

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
public class PlanetaSistemaSolarDetalleFormJInternalFrame extends PlanetaSistemaSolarBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetallePlanetaSistemaSolar;
	
	protected JMenuBar jmenuBarDetallePlanetaSistemaSolar;
	
	protected JMenu jmenuDetallePlanetaSistemaSolar;
	protected JMenu jmenuDetalleArchivoPlanetaSistemaSolar;
	protected JMenu jmenuDetalleAccionesPlanetaSistemaSolar;
	protected JMenu jmenuDetalleDatosPlanetaSistemaSolar;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetallePlanetaSistemaSolar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPlanetaSistemaSolar;	
	protected GridBagConstraints gridBagConstraintsPlanetaSistemaSolar;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected PlanetaSistemaSolarBeanSwingJInternalFrameAdditional jInternalFrameDetallePlanetaSistemaSolar;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected TipoValoracionBeanSwingJInternalFrame tipovaloracionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipovaloracion="";
	
	public PlanetaSistemaSolarSessionBean planetasistemasolarSessionBean;
	
	
	
	
	public TipoValoracionSessionBean tipovaloracionSessionBean;	
	
	public PlanetaSistemaSolarLogic planetasistemasolarLogic;
	
	public JScrollPane jScrollPanelDatosPlanetaSistemaSolar;
	public JScrollPane jScrollPanelDatosEdicionPlanetaSistemaSolar;
	public JScrollPane jScrollPanelDatosGeneralPlanetaSistemaSolar;
	
	protected JPanel jPanelCamposPlanetaSistemaSolar;    
	protected JPanel jPanelCamposOcultosPlanetaSistemaSolar;    	
	protected JPanel jPanelAccionesPlanetaSistemaSolar;
	protected JPanel jPanelAccionesFormularioPlanetaSistemaSolar;
    
	
	
	protected Integer iXPanelCamposPlanetaSistemaSolar=0;
	protected Integer iYPanelCamposPlanetaSistemaSolar=0;
	
	protected Integer iXPanelCamposOcultosPlanetaSistemaSolar=0;
	protected Integer iYPanelCamposOcultosPlanetaSistemaSolar=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoPlanetaSistemaSolar;
	public JButton jButtonModificarPlanetaSistemaSolar;
	public JButton jButtonActualizarPlanetaSistemaSolar;
    public JButton jButtonEliminarPlanetaSistemaSolar;
	public JButton jButtonCancelarPlanetaSistemaSolar;
    public JButton jButtonGuardarCambiosPlanetaSistemaSolar;
	public JButton jButtonGuardarCambiosTablaPlanetaSistemaSolar;
	protected JButton jButtonCerrarPlanetaSistemaSolar;
	
	
	protected JButton jButtonProcesarInformacionPlanetaSistemaSolar;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoPlanetaSistemaSolar;
	protected JCheckBox jCheckBoxPostAccionSinCerrarPlanetaSistemaSolar;
	protected JCheckBox jCheckBoxPostAccionSinMensajePlanetaSistemaSolar;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPlanetaSistemaSolar;
	protected JButton jButtonModificarToolBarPlanetaSistemaSolar;
	protected JButton jButtonActualizarToolBarPlanetaSistemaSolar;
    protected JButton jButtonEliminarToolBarPlanetaSistemaSolar;
	protected JButton jButtonCancelarToolBarPlanetaSistemaSolar;
    protected JButton jButtonGuardarCambiosToolBarPlanetaSistemaSolar;
	protected JButton jButtonGuardarCambiosTablaToolBarPlanetaSistemaSolar;
	protected JButton jButtonMostrarOcultarTablaToolBarPlanetaSistemaSolar;
	protected JButton jButtonCerrarToolBarPlanetaSistemaSolar;
	
	protected JButton jButtonProcesarInformacionToolBarPlanetaSistemaSolar;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPlanetaSistemaSolar;
	protected JMenuItem jMenuItemModificarPlanetaSistemaSolar;
	protected JMenuItem jMenuItemActualizarPlanetaSistemaSolar;
    protected JMenuItem jMenuItemEliminarPlanetaSistemaSolar;
	protected JMenuItem jMenuItemCancelarPlanetaSistemaSolar;
    protected JMenuItem jMenuItemGuardarCambiosPlanetaSistemaSolar;
	protected JMenuItem jMenuItemGuardarCambiosTablaPlanetaSistemaSolar;
	protected JMenuItem jMenuItemCerrarPlanetaSistemaSolar;
	protected JMenuItem jMenuItemDetalleCerrarPlanetaSistemaSolar;
	protected JMenuItem jMenuItemDetalleMostarOcultarPlanetaSistemaSolar;
	
	protected JMenuItem jMenuItemProcesarInformacionPlanetaSistemaSolar;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPlanetaSistemaSolar;
	protected JMenuItem jMenuItemMostrarOcultarPlanetaSistemaSolar;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPlanetaSistemaSolar;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPlanetaSistemaSolar;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPlanetaSistemaSolar;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioPlanetaSistemaSolar;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidPlanetaSistemaSolar;
	public JLabel jLabelIdPlanetaSistemaSolar;
	public JTextFieldMe jTextFieldidPlanetaSistemaSolar;
	public JButton jButtonidPlanetaSistemaSolarBusqueda= new JButtonMe();

	public JPanel jPanelcodigoPlanetaSistemaSolar;
	public JLabel jLabelcodigoPlanetaSistemaSolar;
	public JTextField jTextFieldcodigoPlanetaSistemaSolar;
	public JButton jButtoncodigoPlanetaSistemaSolarBusqueda= new JButtonMe();

	public JPanel jPanelnombrePlanetaSistemaSolar;
	public JLabel jLabelnombrePlanetaSistemaSolar;
	public JTextArea jTextAreanombrePlanetaSistemaSolar;
	public JScrollPane jscrollPanenombrePlanetaSistemaSolar;
	public JButton jButtonnombrePlanetaSistemaSolarBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionPlanetaSistemaSolar;
	public JLabel jLabeldescripcionPlanetaSistemaSolar;
	public JTextArea jTextAreadescripcionPlanetaSistemaSolar;
	public JScrollPane jscrollPanedescripcionPlanetaSistemaSolar;
	public JButton jButtondescripcionPlanetaSistemaSolarBusqueda= new JButtonMe();

	
	public JPanel jPanelid_tipo_valoracionPlanetaSistemaSolar;
	public JLabel jLabelid_tipo_valoracionPlanetaSistemaSolar;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_valoracionPlanetaSistemaSolar;
	public JButton jButtonid_tipo_valoracionPlanetaSistemaSolar= new JButtonMe();
	public JButton jButtonid_tipo_valoracionPlanetaSistemaSolarUpdate= new JButtonMe();
	public JButton jButtonid_tipo_valoracionPlanetaSistemaSolarBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesPlanetaSistemaSolar;
	
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
	public int iHeightFormulario=594;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public PlanetaSistemaSolarDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposPlanetaSistemaSolar=new JPanel();
				this.jPanelAccionesFormularioPlanetaSistemaSolar=new JPanel();
				this.jmenuBarDetallePlanetaSistemaSolar=new JMenuBar();
				this.jTtoolBarDetallePlanetaSistemaSolar=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PlanetaSistemaSolarDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("PlanetaSistemaSolar No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public PlanetaSistemaSolarDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("PlanetaSistemaSolar No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PlanetaSistemaSolarDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PlanetaSistemaSolar No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PlanetaSistemaSolarDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PlanetaSistemaSolar No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PlanetaSistemaSolarDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PlanetaSistemaSolar No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarPlanetaSistemaSolar() {
		return this.jButtonActualizarToolBarPlanetaSistemaSolar;
	}
	
	public JButton getjButtonEliminarToolBarPlanetaSistemaSolar() {
		return this.jButtonEliminarToolBarPlanetaSistemaSolar;
	}
	
	public JButton getjButtonCancelarToolBarPlanetaSistemaSolar() {
		return this.jButtonCancelarToolBarPlanetaSistemaSolar;
	}		
	
	public JButton getjButtonProcesarInformacionPlanetaSistemaSolar() {
		return this.jButtonProcesarInformacionPlanetaSistemaSolar;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPlanetaSistemaSolar)	{
		this.jButtonProcesarInformacionPlanetaSistemaSolar = jButtonProcesarInformacionPlanetaSistemaSolar;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPlanetaSistemaSolar() {
		return this.jComboBoxTiposAccionesPlanetaSistemaSolar;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPlanetaSistemaSolar(
			JComboBox jComboBoxTiposRelacionesPlanetaSistemaSolar) {
		this.jComboBoxTiposRelacionesPlanetaSistemaSolar = jComboBoxTiposRelacionesPlanetaSistemaSolar;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPlanetaSistemaSolar(
			JComboBox jComboBoxTiposAccionesPlanetaSistemaSolar) {
		this.jComboBoxTiposAccionesPlanetaSistemaSolar = jComboBoxTiposAccionesPlanetaSistemaSolar;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioPlanetaSistemaSolar() {
		return this.jComboBoxTiposAccionesFormularioPlanetaSistemaSolar;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioPlanetaSistemaSolar(
			JComboBox jComboBoxTiposAccionesFormularioPlanetaSistemaSolar) {
		this.jComboBoxTiposAccionesFormularioPlanetaSistemaSolar = jComboBoxTiposAccionesFormularioPlanetaSistemaSolar;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.planetasistemasolarSessionBean=new PlanetaSistemaSolarSessionBean();
		
		this.planetasistemasolarSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.planetasistemasolarSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.planetasistemasolarSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PlanetaSistemaSolarJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PlanetaSistemaSolarJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PlanetaSistemaSolarJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Planeta Sistema Solar MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.planetasistemasolarSessionBean.getEsGuardarRelacionado()) {
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
	
		PlanetaSistemaSolarJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetallePlanetaSistemaSolar= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarPlanetaSistemaSolar=new JButtonMe();
				this.jButtonModificarToolBarPlanetaSistemaSolar=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarPlanetaSistemaSolar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarPlanetaSistemaSolar,this.jTtoolBarDetallePlanetaSistemaSolar,
							"actualizar","actualizar","Actualizar"+" "+PlanetaSistemaSolarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarPlanetaSistemaSolar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarPlanetaSistemaSolar,this.jTtoolBarDetallePlanetaSistemaSolar,
							"eliminar","eliminar","Eliminar"+" "+PlanetaSistemaSolarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarPlanetaSistemaSolar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarPlanetaSistemaSolar,this.jTtoolBarDetallePlanetaSistemaSolar,
							"cancelar","cancelar","Cancelar"+" "+PlanetaSistemaSolarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarPlanetaSistemaSolar=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarPlanetaSistemaSolar,this.jTtoolBarDetallePlanetaSistemaSolar,
							"guardarcambios","guardarcambios","Guardar"+" "+PlanetaSistemaSolarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarPlanetaSistemaSolar,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarPlanetaSistemaSolar,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarPlanetaSistemaSolar,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetallePlanetaSistemaSolar=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetallePlanetaSistemaSolar=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoPlanetaSistemaSolar=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesPlanetaSistemaSolar=new JMenuMe("Acciones");
		this.jmenuDetalleDatosPlanetaSistemaSolar=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPlanetaSistemaSolar= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPlanetaSistemaSolar.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPlanetaSistemaSolar,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPlanetaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarPlanetaSistemaSolar= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarPlanetaSistemaSolar.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarPlanetaSistemaSolar,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarPlanetaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarPlanetaSistemaSolar= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarPlanetaSistemaSolar.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarPlanetaSistemaSolar,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarPlanetaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarPlanetaSistemaSolar= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarPlanetaSistemaSolar.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarPlanetaSistemaSolar,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarPlanetaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarPlanetaSistemaSolar= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarPlanetaSistemaSolar.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarPlanetaSistemaSolar,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarPlanetaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosPlanetaSistemaSolar= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPlanetaSistemaSolar.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPlanetaSistemaSolar,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPlanetaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPlanetaSistemaSolar= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPlanetaSistemaSolar.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPlanetaSistemaSolar,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPlanetaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarPlanetaSistemaSolar= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarPlanetaSistemaSolar.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarPlanetaSistemaSolar,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarPlanetaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPlanetaSistemaSolar= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPlanetaSistemaSolar.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPlanetaSistemaSolar,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPlanetaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPlanetaSistemaSolar= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPlanetaSistemaSolar.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPlanetaSistemaSolar,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPlanetaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoPlanetaSistemaSolar.add(this.jMenuItemDetalleCerrarPlanetaSistemaSolar);
		
		this.jmenuDetalleAccionesPlanetaSistemaSolar.add(this.jMenuItemActualizarPlanetaSistemaSolar);
		this.jmenuDetalleAccionesPlanetaSistemaSolar.add(this.jMenuItemEliminarPlanetaSistemaSolar);
		this.jmenuDetalleAccionesPlanetaSistemaSolar.add(this.jMenuItemCancelarPlanetaSistemaSolar);		
		
		//this.jmenuDetalleDatosPlanetaSistemaSolar.add(this.jMenuItemDetalleAbrirOrderByPlanetaSistemaSolar);				
		this.jmenuDetalleDatosPlanetaSistemaSolar.add(this.jMenuItemDetalleMostarOcultarPlanetaSistemaSolar);				
				
		//this.jmenuDetalleAccionesPlanetaSistemaSolar.add(this.jMenuItemGuardarCambiosPlanetaSistemaSolar);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoPlanetaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesPlanetaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosPlanetaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetallePlanetaSistemaSolar.add(this.jmenuDetalleArchivoPlanetaSistemaSolar);		
		this.jmenuBarDetallePlanetaSistemaSolar.add(this.jmenuDetalleAccionesPlanetaSistemaSolar);		
		this.jmenuBarDetallePlanetaSistemaSolar.add(this.jmenuDetalleDatosPlanetaSistemaSolar);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetallePlanetaSistemaSolar);				
	}
	
	
	public void inicializarElementosCamposPlanetaSistemaSolar() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdPlanetaSistemaSolar = new JLabelMe();
		jLabelIdPlanetaSistemaSolar.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdPlanetaSistemaSolar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPlanetaSistemaSolar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPlanetaSistemaSolar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdPlanetaSistemaSolar,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidPlanetaSistemaSolar = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidPlanetaSistemaSolar.setToolTipText(PlanetaSistemaSolarConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutPlanetaSistemaSolar= new GridBagLayout();

		this.jPanelidPlanetaSistemaSolar.setLayout(this.gridaBagLayoutPlanetaSistemaSolar);

		jTextFieldidPlanetaSistemaSolar = new JTextFieldMe();
		jTextFieldidPlanetaSistemaSolar.setText("Id");

		jTextFieldidPlanetaSistemaSolar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidPlanetaSistemaSolar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidPlanetaSistemaSolar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoPlanetaSistemaSolar = new JLabelMe();
		this.jLabelcodigoPlanetaSistemaSolar.setText(""+PlanetaSistemaSolarConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoPlanetaSistemaSolar.setToolTipText("Codigo");
		this.jLabelcodigoPlanetaSistemaSolar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoPlanetaSistemaSolar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoPlanetaSistemaSolar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoPlanetaSistemaSolar,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoPlanetaSistemaSolar=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoPlanetaSistemaSolar.setToolTipText(PlanetaSistemaSolarConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutPlanetaSistemaSolar = new GridBagLayout();
		this.jPanelcodigoPlanetaSistemaSolar.setLayout(this.gridaBagLayoutPlanetaSistemaSolar);


		jTextFieldcodigoPlanetaSistemaSolar= new JTextFieldMe();

		jTextFieldcodigoPlanetaSistemaSolar.setEnabled(false);
		jTextFieldcodigoPlanetaSistemaSolar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoPlanetaSistemaSolar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoPlanetaSistemaSolar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoPlanetaSistemaSolar,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoPlanetaSistemaSolarBusqueda= new JButtonMe();
		this.jButtoncodigoPlanetaSistemaSolarBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoPlanetaSistemaSolarBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoPlanetaSistemaSolarBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoPlanetaSistemaSolarBusqueda.setText("U");
		this.jButtoncodigoPlanetaSistemaSolarBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoPlanetaSistemaSolarBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoPlanetaSistemaSolarBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoPlanetaSistemaSolar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoPlanetaSistemaSolar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoPlanetaSistemaSolarBusqueda"));

		if(this.planetasistemasolarSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoPlanetaSistemaSolarBusqueda.setVisible(false);		}


					
		this.jLabelnombrePlanetaSistemaSolar = new JLabelMe();
		this.jLabelnombrePlanetaSistemaSolar.setText(""+PlanetaSistemaSolarConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombrePlanetaSistemaSolar.setToolTipText("Nombre");
		this.jLabelnombrePlanetaSistemaSolar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombrePlanetaSistemaSolar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombrePlanetaSistemaSolar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombrePlanetaSistemaSolar,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombrePlanetaSistemaSolar=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombrePlanetaSistemaSolar.setToolTipText(PlanetaSistemaSolarConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutPlanetaSistemaSolar = new GridBagLayout();
		this.jPanelnombrePlanetaSistemaSolar.setLayout(this.gridaBagLayoutPlanetaSistemaSolar);


		jTextAreanombrePlanetaSistemaSolar= new JTextAreaMe();
		jTextAreanombrePlanetaSistemaSolar.setEnabled(false);
		jTextAreanombrePlanetaSistemaSolar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombrePlanetaSistemaSolar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombrePlanetaSistemaSolar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombrePlanetaSistemaSolar.setLineWrap(true);
		jTextAreanombrePlanetaSistemaSolar.setWrapStyleWord(true);
		jTextAreanombrePlanetaSistemaSolar.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombrePlanetaSistemaSolar.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombrePlanetaSistemaSolar,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombrePlanetaSistemaSolar = new JScrollPane(jTextAreanombrePlanetaSistemaSolar);
		jscrollPanenombrePlanetaSistemaSolar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombrePlanetaSistemaSolar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombrePlanetaSistemaSolar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombrePlanetaSistemaSolarBusqueda= new JButtonMe();
		this.jButtonnombrePlanetaSistemaSolarBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombrePlanetaSistemaSolarBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombrePlanetaSistemaSolarBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombrePlanetaSistemaSolarBusqueda.setText("U");
		this.jButtonnombrePlanetaSistemaSolarBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombrePlanetaSistemaSolarBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombrePlanetaSistemaSolarBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombrePlanetaSistemaSolar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombrePlanetaSistemaSolar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombrePlanetaSistemaSolarBusqueda"));

		if(this.planetasistemasolarSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombrePlanetaSistemaSolarBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionPlanetaSistemaSolar = new JLabelMe();
		this.jLabeldescripcionPlanetaSistemaSolar.setText(""+PlanetaSistemaSolarConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionPlanetaSistemaSolar.setToolTipText("Descripcion");
		this.jLabeldescripcionPlanetaSistemaSolar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionPlanetaSistemaSolar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionPlanetaSistemaSolar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionPlanetaSistemaSolar,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionPlanetaSistemaSolar=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionPlanetaSistemaSolar.setToolTipText(PlanetaSistemaSolarConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutPlanetaSistemaSolar = new GridBagLayout();
		this.jPaneldescripcionPlanetaSistemaSolar.setLayout(this.gridaBagLayoutPlanetaSistemaSolar);


		jTextAreadescripcionPlanetaSistemaSolar= new JTextAreaMe();
		jTextAreadescripcionPlanetaSistemaSolar.setEnabled(false);
		jTextAreadescripcionPlanetaSistemaSolar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionPlanetaSistemaSolar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionPlanetaSistemaSolar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionPlanetaSistemaSolar.setLineWrap(true);
		jTextAreadescripcionPlanetaSistemaSolar.setWrapStyleWord(true);
		jTextAreadescripcionPlanetaSistemaSolar.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionPlanetaSistemaSolar.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionPlanetaSistemaSolar,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionPlanetaSistemaSolar = new JScrollPane(jTextAreadescripcionPlanetaSistemaSolar);
		jscrollPanedescripcionPlanetaSistemaSolar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionPlanetaSistemaSolar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionPlanetaSistemaSolar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionPlanetaSistemaSolarBusqueda= new JButtonMe();
		this.jButtondescripcionPlanetaSistemaSolarBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionPlanetaSistemaSolarBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionPlanetaSistemaSolarBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionPlanetaSistemaSolarBusqueda.setText("U");
		this.jButtondescripcionPlanetaSistemaSolarBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionPlanetaSistemaSolarBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionPlanetaSistemaSolarBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionPlanetaSistemaSolar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionPlanetaSistemaSolar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionPlanetaSistemaSolarBusqueda"));

		if(this.planetasistemasolarSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionPlanetaSistemaSolarBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysPlanetaSistemaSolar() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_tipo_valoracionPlanetaSistemaSolar = new JLabelMe();
		this.jLabelid_tipo_valoracionPlanetaSistemaSolar.setText(""+PlanetaSistemaSolarConstantesFunciones.LABEL_IDTIPOVALORACION+" : *");
		this.jLabelid_tipo_valoracionPlanetaSistemaSolar.setToolTipText("Tipo Valoracion");
		this.jLabelid_tipo_valoracionPlanetaSistemaSolar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_valoracionPlanetaSistemaSolar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_valoracionPlanetaSistemaSolar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-26),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_valoracionPlanetaSistemaSolar,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_valoracionPlanetaSistemaSolar=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_valoracionPlanetaSistemaSolar.setToolTipText(PlanetaSistemaSolarConstantesFunciones.LABEL_IDTIPOVALORACION);
		this.gridaBagLayoutPlanetaSistemaSolar = new GridBagLayout();
		this.jPanelid_tipo_valoracionPlanetaSistemaSolar.setLayout(this.gridaBagLayoutPlanetaSistemaSolar);


		jComboBoxid_tipo_valoracionPlanetaSistemaSolar= new JComboBoxMe();
		jComboBoxid_tipo_valoracionPlanetaSistemaSolar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_valoracionPlanetaSistemaSolar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_valoracionPlanetaSistemaSolar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_valoracionPlanetaSistemaSolar,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_valoracionPlanetaSistemaSolar= new JButtonMe();
		this.jButtonid_tipo_valoracionPlanetaSistemaSolar.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_valoracionPlanetaSistemaSolar.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_valoracionPlanetaSistemaSolar.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_valoracionPlanetaSistemaSolar.setText("Buscar");
		this.jButtonid_tipo_valoracionPlanetaSistemaSolar.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_valoracionPlanetaSistemaSolar.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_valoracionPlanetaSistemaSolar,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_valoracionPlanetaSistemaSolar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_valoracionPlanetaSistemaSolar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_valoracionPlanetaSistemaSolar"));

		this.jButtonid_tipo_valoracionPlanetaSistemaSolarBusqueda= new JButtonMe();
		this.jButtonid_tipo_valoracionPlanetaSistemaSolarBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_valoracionPlanetaSistemaSolarBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_valoracionPlanetaSistemaSolarBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_valoracionPlanetaSistemaSolarBusqueda.setText("U");
		this.jButtonid_tipo_valoracionPlanetaSistemaSolarBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_valoracionPlanetaSistemaSolarBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_valoracionPlanetaSistemaSolarBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_valoracionPlanetaSistemaSolar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_valoracionPlanetaSistemaSolar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_valoracionPlanetaSistemaSolarBusqueda"));

		if(this.planetasistemasolarSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_valoracionPlanetaSistemaSolarBusqueda.setVisible(false);		}

		this.jButtonid_tipo_valoracionPlanetaSistemaSolarUpdate= new JButtonMe();
		this.jButtonid_tipo_valoracionPlanetaSistemaSolarUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_valoracionPlanetaSistemaSolarUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_valoracionPlanetaSistemaSolarUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_valoracionPlanetaSistemaSolarUpdate.setText("U");
		this.jButtonid_tipo_valoracionPlanetaSistemaSolarUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_valoracionPlanetaSistemaSolarUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_valoracionPlanetaSistemaSolarUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_valoracionPlanetaSistemaSolar.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_valoracionPlanetaSistemaSolar.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_valoracionPlanetaSistemaSolarUpdate"));



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
		//this.jInternalFrameDetallePlanetaSistemaSolar = new PlanetaSistemaSolarBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Planeta Sistema Solar DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPlanetaSistemaSolar= new GridBagLayout();
		

		
		String sToolTipPlanetaSistemaSolar="";
		sToolTipPlanetaSistemaSolar=PlanetaSistemaSolarConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPlanetaSistemaSolar+="(Seguridad.PlanetaSistemaSolar)";
		}
		
		if(!this.planetasistemasolarSessionBean.getEsGuardarRelacionado()) {
			sToolTipPlanetaSistemaSolar+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoPlanetaSistemaSolar = new JButtonMe();
		this.jButtonModificarPlanetaSistemaSolar = new JButtonMe();
        this.jButtonActualizarPlanetaSistemaSolar = new JButtonMe();
        this.jButtonEliminarPlanetaSistemaSolar = new JButtonMe();
        this.jButtonCancelarPlanetaSistemaSolar = new JButtonMe();
        this.jButtonGuardarCambiosPlanetaSistemaSolar = new JButtonMe();
		this.jButtonGuardarCambiosTablaPlanetaSistemaSolar = new JButtonMe();
		this.jButtonCerrarPlanetaSistemaSolar = new JButtonMe();
		
		this.jScrollPanelDatosPlanetaSistemaSolar = new JScrollPane();   
        this.jScrollPanelDatosEdicionPlanetaSistemaSolar = new JScrollPane();
		this.jScrollPanelDatosGeneralPlanetaSistemaSolar = new JScrollPane();
				
		
		
		this.jPanelCamposPlanetaSistemaSolar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosPlanetaSistemaSolar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesPlanetaSistemaSolar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioPlanetaSistemaSolar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Planeta Sistema Solar";
		
		if(!this.planetasistemasolarSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPlanetaSistemaSolar.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Planeta Sistema Solares" + this.sPath));
		} else {
			this.jScrollPanelDatosPlanetaSistemaSolar.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionPlanetaSistemaSolar.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralPlanetaSistemaSolar.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposPlanetaSistemaSolar.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposPlanetaSistemaSolar.setName("jPanelCamposPlanetaSistemaSolar"); 

		this.jPanelCamposOcultosPlanetaSistemaSolar.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosPlanetaSistemaSolar.setName("jPanelCamposOcultosPlanetaSistemaSolar"); 

        this.jPanelAccionesPlanetaSistemaSolar.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPlanetaSistemaSolar.setToolTipText("Acciones");
        this.jPanelAccionesPlanetaSistemaSolar.setName("Acciones"); 

		this.jPanelAccionesFormularioPlanetaSistemaSolar.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioPlanetaSistemaSolar.setToolTipText("Acciones");
        this.jPanelAccionesFormularioPlanetaSistemaSolar.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionPlanetaSistemaSolar, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPlanetaSistemaSolar, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPlanetaSistemaSolar, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposPlanetaSistemaSolar, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosPlanetaSistemaSolar, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioPlanetaSistemaSolar, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoPlanetaSistemaSolar.setText("Nuevo");
		this.jButtonModificarPlanetaSistemaSolar.setText("Editar");
        this.jButtonActualizarPlanetaSistemaSolar.setText("Actualizar");
        this.jButtonEliminarPlanetaSistemaSolar.setText("Eliminar");
        this.jButtonCancelarPlanetaSistemaSolar.setText("Cancelar");
        this.jButtonGuardarCambiosPlanetaSistemaSolar.setText("Guardar");
		this.jButtonGuardarCambiosTablaPlanetaSistemaSolar.setText("Guardar");
		this.jButtonCerrarPlanetaSistemaSolar.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPlanetaSistemaSolar,"nuevo_button","Nuevo",this.planetasistemasolarSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarPlanetaSistemaSolar,"modificar_button","Editar",this.planetasistemasolarSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarPlanetaSistemaSolar,"actualizar_button","Actualizar",this.planetasistemasolarSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarPlanetaSistemaSolar,"eliminar_button","Eliminar",this.planetasistemasolarSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarPlanetaSistemaSolar,"cancelar_button","Cancelar",this.planetasistemasolarSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosPlanetaSistemaSolar,"guardarcambios_button","Guardar",this.planetasistemasolarSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPlanetaSistemaSolar,"guardarcambiostabla_button","Guardar",this.planetasistemasolarSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPlanetaSistemaSolar,"cerrar_button","Salir",this.planetasistemasolarSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPlanetaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarPlanetaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosPlanetaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPlanetaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPlanetaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarPlanetaSistemaSolar, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarPlanetaSistemaSolar, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarPlanetaSistemaSolar, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoPlanetaSistemaSolar.setToolTipText("Nuevo"+" "+PlanetaSistemaSolarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarPlanetaSistemaSolar.setToolTipText("Editar"+" "+PlanetaSistemaSolarConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarPlanetaSistemaSolar.setToolTipText("Actualizar"+" "+PlanetaSistemaSolarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarPlanetaSistemaSolar.setToolTipText("Eliminar)"+" "+PlanetaSistemaSolarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarPlanetaSistemaSolar.setToolTipText("Cancelar"+" "+PlanetaSistemaSolarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosPlanetaSistemaSolar.setToolTipText("Guardar"+" "+PlanetaSistemaSolarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaPlanetaSistemaSolar.setToolTipText("Guardar"+" "+PlanetaSistemaSolarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPlanetaSistemaSolar.setToolTipText("Salir"+" "+PlanetaSistemaSolarConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPlanetaSistemaSolar";
		inputMap = this.jButtonNuevoPlanetaSistemaSolar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPlanetaSistemaSolar.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPlanetaSistemaSolar"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarPlanetaSistemaSolar";
		inputMap = this.jButtonActualizarPlanetaSistemaSolar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarPlanetaSistemaSolar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarPlanetaSistemaSolar"));
		
		//ELIMINAR
		sMapKey = "EliminarPlanetaSistemaSolar";
		inputMap = this.jButtonEliminarPlanetaSistemaSolar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarPlanetaSistemaSolar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarPlanetaSistemaSolar"));
		
		//CANCELAR	
		sMapKey = "CancelarPlanetaSistemaSolar";
		inputMap = this.jButtonCancelarPlanetaSistemaSolar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarPlanetaSistemaSolar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarPlanetaSistemaSolar"));
		
		//CERRAR		
		sMapKey = "CerrarPlanetaSistemaSolar";
		inputMap = this.jButtonCerrarPlanetaSistemaSolar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPlanetaSistemaSolar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPlanetaSistemaSolar"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPlanetaSistemaSolar";
		inputMap = this.jButtonGuardarCambiosTablaPlanetaSistemaSolar.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPlanetaSistemaSolar.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPlanetaSistemaSolar"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoPlanetaSistemaSolar = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoPlanetaSistemaSolar.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoPlanetaSistemaSolar.setToolTipText("Nuevo PlanetaSistemaSolar");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoPlanetaSistemaSolar, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarPlanetaSistemaSolar = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarPlanetaSistemaSolar.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarPlanetaSistemaSolar.setToolTipText("Sin Cerrar Ventana PlanetaSistemaSolar");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarPlanetaSistemaSolar, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajePlanetaSistemaSolar = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajePlanetaSistemaSolar.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajePlanetaSistemaSolar.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajePlanetaSistemaSolar, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesPlanetaSistemaSolar = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPlanetaSistemaSolar.setText("Accion");
		this.jComboBoxTiposAccionesPlanetaSistemaSolar.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioPlanetaSistemaSolar = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioPlanetaSistemaSolar.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioPlanetaSistemaSolar.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesPlanetaSistemaSolar = new JLabelMe();
		
		this.jLabelAccionesPlanetaSistemaSolar.setText("Acciones");		
		this.jLabelAccionesPlanetaSistemaSolar.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPlanetaSistemaSolar.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPlanetaSistemaSolar.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposPlanetaSistemaSolar();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysPlanetaSistemaSolar();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesPlanetaSistemaSolar=new JTabbedPane();
		this.jTabbedPaneRelacionesPlanetaSistemaSolar.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesPlanetaSistemaSolar,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesPlanetaSistemaSolar.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPlanetaSistemaSolar.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPlanetaSistemaSolar.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPlanetaSistemaSolar, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioPlanetaSistemaSolar.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPlanetaSistemaSolar.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPlanetaSistemaSolar.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioPlanetaSistemaSolar, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposPlanetaSistemaSolar = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosPlanetaSistemaSolar = new GridBagLayout();
		
		this.jPanelCamposPlanetaSistemaSolar.setLayout(gridaBagLayoutCamposPlanetaSistemaSolar);
		this.jPanelCamposOcultosPlanetaSistemaSolar.setLayout(gridaBagLayoutCamposOcultosPlanetaSistemaSolar);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
	this.gridBagConstraintsPlanetaSistemaSolar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlanetaSistemaSolar.gridy = 0;
	this.gridBagConstraintsPlanetaSistemaSolar.gridx = 0;
	this.gridBagConstraintsPlanetaSistemaSolar.ipadx = 0;
	this.gridBagConstraintsPlanetaSistemaSolar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidPlanetaSistemaSolar.add(jLabelIdPlanetaSistemaSolar, this.gridBagConstraintsPlanetaSistemaSolar);



	this.gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
	this.gridBagConstraintsPlanetaSistemaSolar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlanetaSistemaSolar.gridy = 0;
	this.gridBagConstraintsPlanetaSistemaSolar.gridx = 1;
	this.gridBagConstraintsPlanetaSistemaSolar.ipadx = 0;
	this.gridBagConstraintsPlanetaSistemaSolar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidPlanetaSistemaSolar.add(jTextFieldidPlanetaSistemaSolar, this.gridBagConstraintsPlanetaSistemaSolar);


	this.gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
	this.gridBagConstraintsPlanetaSistemaSolar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlanetaSistemaSolar.gridy = 0;
	this.gridBagConstraintsPlanetaSistemaSolar.gridx = 0;
	this.gridBagConstraintsPlanetaSistemaSolar.ipadx = 0;
	this.gridBagConstraintsPlanetaSistemaSolar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_valoracionPlanetaSistemaSolar.add(jLabelid_tipo_valoracionPlanetaSistemaSolar, this.gridBagConstraintsPlanetaSistemaSolar);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
		//this.gridBagConstraintsPlanetaSistemaSolar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlanetaSistemaSolar.gridy = 0;
		this.gridBagConstraintsPlanetaSistemaSolar.gridx = 2;
		this.gridBagConstraintsPlanetaSistemaSolar.ipadx = 0;
		this.gridBagConstraintsPlanetaSistemaSolar.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_valoracionPlanetaSistemaSolar.add(jButtonid_tipo_valoracionPlanetaSistemaSolarBusqueda, this.gridBagConstraintsPlanetaSistemaSolar);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
		//this.gridBagConstraintsPlanetaSistemaSolar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlanetaSistemaSolar.gridy = 0;
		this.gridBagConstraintsPlanetaSistemaSolar.gridx = 3;
		this.gridBagConstraintsPlanetaSistemaSolar.ipadx = 0;
		this.gridBagConstraintsPlanetaSistemaSolar.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_valoracionPlanetaSistemaSolar.add(jButtonid_tipo_valoracionPlanetaSistemaSolarUpdate, this.gridBagConstraintsPlanetaSistemaSolar);
	}

	this.gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
	this.gridBagConstraintsPlanetaSistemaSolar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlanetaSistemaSolar.gridy = 0;
	this.gridBagConstraintsPlanetaSistemaSolar.gridx = 1;
	this.gridBagConstraintsPlanetaSistemaSolar.ipadx = 0;
	this.gridBagConstraintsPlanetaSistemaSolar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_valoracionPlanetaSistemaSolar.add(jComboBoxid_tipo_valoracionPlanetaSistemaSolar, this.gridBagConstraintsPlanetaSistemaSolar);


	this.gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
	this.gridBagConstraintsPlanetaSistemaSolar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlanetaSistemaSolar.gridy = 0;
	this.gridBagConstraintsPlanetaSistemaSolar.gridx = 0;
	this.gridBagConstraintsPlanetaSistemaSolar.ipadx = 0;
	this.gridBagConstraintsPlanetaSistemaSolar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoPlanetaSistemaSolar.add(jLabelcodigoPlanetaSistemaSolar, this.gridBagConstraintsPlanetaSistemaSolar);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
		//this.gridBagConstraintsPlanetaSistemaSolar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlanetaSistemaSolar.gridy = 0;
		this.gridBagConstraintsPlanetaSistemaSolar.gridx = 2;
		this.gridBagConstraintsPlanetaSistemaSolar.ipadx = 0;
		this.gridBagConstraintsPlanetaSistemaSolar.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoPlanetaSistemaSolar.add(jButtoncodigoPlanetaSistemaSolarBusqueda, this.gridBagConstraintsPlanetaSistemaSolar);
	}

	this.gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
	this.gridBagConstraintsPlanetaSistemaSolar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlanetaSistemaSolar.gridy = 0;
	this.gridBagConstraintsPlanetaSistemaSolar.gridx = 1;
	this.gridBagConstraintsPlanetaSistemaSolar.ipadx = 0;
	this.gridBagConstraintsPlanetaSistemaSolar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoPlanetaSistemaSolar.add(jTextFieldcodigoPlanetaSistemaSolar, this.gridBagConstraintsPlanetaSistemaSolar);


	this.gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
	this.gridBagConstraintsPlanetaSistemaSolar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlanetaSistemaSolar.gridy = 0;
	this.gridBagConstraintsPlanetaSistemaSolar.gridx = 0;
	this.gridBagConstraintsPlanetaSistemaSolar.ipadx = 0;
	this.gridBagConstraintsPlanetaSistemaSolar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombrePlanetaSistemaSolar.add(jLabelnombrePlanetaSistemaSolar, this.gridBagConstraintsPlanetaSistemaSolar);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
		//this.gridBagConstraintsPlanetaSistemaSolar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlanetaSistemaSolar.gridy = 0;
		this.gridBagConstraintsPlanetaSistemaSolar.gridx = 2;
		this.gridBagConstraintsPlanetaSistemaSolar.ipadx = 0;
		this.gridBagConstraintsPlanetaSistemaSolar.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombrePlanetaSistemaSolar.add(jButtonnombrePlanetaSistemaSolarBusqueda, this.gridBagConstraintsPlanetaSistemaSolar);
	}

	this.gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
	this.gridBagConstraintsPlanetaSistemaSolar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlanetaSistemaSolar.gridy = 0;
	this.gridBagConstraintsPlanetaSistemaSolar.gridx = 1;
	this.gridBagConstraintsPlanetaSistemaSolar.ipadx = 0;
	this.gridBagConstraintsPlanetaSistemaSolar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombrePlanetaSistemaSolar.add(jscrollPanenombrePlanetaSistemaSolar, this.gridBagConstraintsPlanetaSistemaSolar);


	this.gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
	this.gridBagConstraintsPlanetaSistemaSolar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlanetaSistemaSolar.gridy = 0;
	this.gridBagConstraintsPlanetaSistemaSolar.gridx = 0;
	this.gridBagConstraintsPlanetaSistemaSolar.ipadx = 0;
	this.gridBagConstraintsPlanetaSistemaSolar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionPlanetaSistemaSolar.add(jLabeldescripcionPlanetaSistemaSolar, this.gridBagConstraintsPlanetaSistemaSolar);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
		//this.gridBagConstraintsPlanetaSistemaSolar.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPlanetaSistemaSolar.gridy = 0;
		this.gridBagConstraintsPlanetaSistemaSolar.gridx = 2;
		this.gridBagConstraintsPlanetaSistemaSolar.ipadx = 0;
		this.gridBagConstraintsPlanetaSistemaSolar.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionPlanetaSistemaSolar.add(jButtondescripcionPlanetaSistemaSolarBusqueda, this.gridBagConstraintsPlanetaSistemaSolar);
	}

	this.gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
	this.gridBagConstraintsPlanetaSistemaSolar.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPlanetaSistemaSolar.gridy = 0;
	this.gridBagConstraintsPlanetaSistemaSolar.gridx = 1;
	this.gridBagConstraintsPlanetaSistemaSolar.ipadx = 0;
	this.gridBagConstraintsPlanetaSistemaSolar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionPlanetaSistemaSolar.add(jscrollPanedescripcionPlanetaSistemaSolar, this.gridBagConstraintsPlanetaSistemaSolar);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
	this.gridBagConstraintsPlanetaSistemaSolar.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPlanetaSistemaSolar.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPlanetaSistemaSolar.gridy = iYPanelCamposPlanetaSistemaSolar;
	this.gridBagConstraintsPlanetaSistemaSolar.gridx = iXPanelCamposPlanetaSistemaSolar++;
	this.gridBagConstraintsPlanetaSistemaSolar.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPlanetaSistemaSolar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPlanetaSistemaSolar.add(this.jPanelidPlanetaSistemaSolar, this.gridBagConstraintsPlanetaSistemaSolar);



	if(iXPanelCamposPlanetaSistemaSolar % 1==0) {
		iXPanelCamposPlanetaSistemaSolar=0;
		iYPanelCamposPlanetaSistemaSolar++;
	}
	this.gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
	this.gridBagConstraintsPlanetaSistemaSolar.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPlanetaSistemaSolar.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPlanetaSistemaSolar.gridy = iYPanelCamposPlanetaSistemaSolar;
	this.gridBagConstraintsPlanetaSistemaSolar.gridx = iXPanelCamposPlanetaSistemaSolar++;
	this.gridBagConstraintsPlanetaSistemaSolar.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPlanetaSistemaSolar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPlanetaSistemaSolar.add(this.jPanelid_tipo_valoracionPlanetaSistemaSolar, this.gridBagConstraintsPlanetaSistemaSolar);



	if(iXPanelCamposPlanetaSistemaSolar % 1==0) {
		iXPanelCamposPlanetaSistemaSolar=0;
		iYPanelCamposPlanetaSistemaSolar++;
	}
	this.gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
	this.gridBagConstraintsPlanetaSistemaSolar.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPlanetaSistemaSolar.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPlanetaSistemaSolar.gridy = iYPanelCamposPlanetaSistemaSolar;
	this.gridBagConstraintsPlanetaSistemaSolar.gridx = iXPanelCamposPlanetaSistemaSolar++;
	this.gridBagConstraintsPlanetaSistemaSolar.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPlanetaSistemaSolar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPlanetaSistemaSolar.add(this.jPanelcodigoPlanetaSistemaSolar, this.gridBagConstraintsPlanetaSistemaSolar);



	if(iXPanelCamposPlanetaSistemaSolar % 1==0) {
		iXPanelCamposPlanetaSistemaSolar=0;
		iYPanelCamposPlanetaSistemaSolar++;
	}
	this.gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
	this.gridBagConstraintsPlanetaSistemaSolar.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPlanetaSistemaSolar.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPlanetaSistemaSolar.gridy = iYPanelCamposPlanetaSistemaSolar;
	this.gridBagConstraintsPlanetaSistemaSolar.gridx = iXPanelCamposPlanetaSistemaSolar++;
	this.gridBagConstraintsPlanetaSistemaSolar.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPlanetaSistemaSolar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPlanetaSistemaSolar.add(this.jPanelnombrePlanetaSistemaSolar, this.gridBagConstraintsPlanetaSistemaSolar);



	if(iXPanelCamposPlanetaSistemaSolar % 1==0) {
		iXPanelCamposPlanetaSistemaSolar=0;
		iYPanelCamposPlanetaSistemaSolar++;
	}
	this.gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
	this.gridBagConstraintsPlanetaSistemaSolar.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPlanetaSistemaSolar.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPlanetaSistemaSolar.gridy = iYPanelCamposPlanetaSistemaSolar;
	this.gridBagConstraintsPlanetaSistemaSolar.gridx = iXPanelCamposPlanetaSistemaSolar++;
	this.gridBagConstraintsPlanetaSistemaSolar.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPlanetaSistemaSolar.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPlanetaSistemaSolar.add(this.jPaneldescripcionPlanetaSistemaSolar, this.gridBagConstraintsPlanetaSistemaSolar);



	if(iXPanelCamposPlanetaSistemaSolar % 1==0) {
		iXPanelCamposPlanetaSistemaSolar=0;
		iYPanelCamposPlanetaSistemaSolar++;
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
			
		GridBagLayout gridaBagLayoutAccionesPlanetaSistemaSolar= new GridBagLayout();
		this.jPanelAccionesPlanetaSistemaSolar.setLayout(gridaBagLayoutAccionesPlanetaSistemaSolar);
		
		GridBagLayout gridaBagLayoutAccionesFormularioPlanetaSistemaSolar= new GridBagLayout();
		this.jPanelAccionesFormularioPlanetaSistemaSolar.setLayout(gridaBagLayoutAccionesFormularioPlanetaSistemaSolar);
		
		this.gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
		this.gridBagConstraintsPlanetaSistemaSolar.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPlanetaSistemaSolar.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPlanetaSistemaSolar.add(this.jComboBoxTiposAccionesFormularioPlanetaSistemaSolar, this.gridBagConstraintsPlanetaSistemaSolar);

		this.gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
		this.gridBagConstraintsPlanetaSistemaSolar.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPlanetaSistemaSolar.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPlanetaSistemaSolar.add(this.jCheckBoxPostAccionNuevoPlanetaSistemaSolar, this.gridBagConstraintsPlanetaSistemaSolar);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.planetasistemasolarSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
			this.gridBagConstraintsPlanetaSistemaSolar.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsPlanetaSistemaSolar.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioPlanetaSistemaSolar.add(this.jCheckBoxPostAccionSinCerrarPlanetaSistemaSolar, this.gridBagConstraintsPlanetaSistemaSolar);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.planetasistemasolarSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.planetasistemasolarSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
			this.gridBagConstraintsPlanetaSistemaSolar.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsPlanetaSistemaSolar.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioPlanetaSistemaSolar.add(this.jCheckBoxPostAccionSinMensajePlanetaSistemaSolar, this.gridBagConstraintsPlanetaSistemaSolar);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
		this.gridBagConstraintsPlanetaSistemaSolar.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPlanetaSistemaSolar.gridy = 0;
		this.gridBagConstraintsPlanetaSistemaSolar.gridx = iPosXAccion++;
			
		this.jPanelAccionesPlanetaSistemaSolar.add(this.jButtonModificarPlanetaSistemaSolar, this.gridBagConstraintsPlanetaSistemaSolar);							

		this.gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
		this.gridBagConstraintsPlanetaSistemaSolar.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPlanetaSistemaSolar.gridy = 0;
		this.gridBagConstraintsPlanetaSistemaSolar.gridx =iPosXAccion++;
			
		this.jPanelAccionesPlanetaSistemaSolar.add(this.jButtonEliminarPlanetaSistemaSolar, this.gridBagConstraintsPlanetaSistemaSolar);
		
			
		this.gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
		this.gridBagConstraintsPlanetaSistemaSolar.gridy = 0;		
		this.gridBagConstraintsPlanetaSistemaSolar.gridx = iPosXAccion++;
		
		this.jPanelAccionesPlanetaSistemaSolar.add(this.jButtonActualizarPlanetaSistemaSolar, this.gridBagConstraintsPlanetaSistemaSolar);


		this.gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
		this.gridBagConstraintsPlanetaSistemaSolar.gridy = 0;		
		this.gridBagConstraintsPlanetaSistemaSolar.gridx = iPosXAccion++;
		
		this.jPanelAccionesPlanetaSistemaSolar.add(this.jButtonGuardarCambiosPlanetaSistemaSolar, this.gridBagConstraintsPlanetaSistemaSolar);	
		
		this.gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
		this.gridBagConstraintsPlanetaSistemaSolar.gridy = 0;		
		this.gridBagConstraintsPlanetaSistemaSolar.gridx =iPosXAccion++;
		
		this.jPanelAccionesPlanetaSistemaSolar.add(this.jButtonCancelarPlanetaSistemaSolar, this.gridBagConstraintsPlanetaSistemaSolar);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPlanetaSistemaSolar = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPlanetaSistemaSolar);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.planetasistemasolarSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();						
			this.gridBagConstraintsPlanetaSistemaSolar.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPlanetaSistemaSolar.gridx = 0;		
			//this.gridBagConstraintsPlanetaSistemaSolar.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPlanetaSistemaSolar.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPlanetaSistemaSolar.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
		this.gridBagConstraintsPlanetaSistemaSolar.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPlanetaSistemaSolar.gridx =0;
		this.gridBagConstraintsPlanetaSistemaSolar.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPlanetaSistemaSolar.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPlanetaSistemaSolar, this.gridBagConstraintsPlanetaSistemaSolar);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(PlanetaSistemaSolarJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetallePlanetaSistemaSolar = new PlanetaSistemaSolarBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Planeta Sistema Solar DATOS");
			
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
			
	        //this.setTitle("[FOR] - Planeta Sistema Solar DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Planeta Sistema Solar Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			PlanetaSistemaSolarModel planetasistemasolarModel=new PlanetaSistemaSolarModel(this);
			
			//SI USARA CLASE INTERNA
			//PlanetaSistemaSolarModel.PlanetaSistemaSolarFocusTraversalPolicy planetasistemasolarFocusTraversalPolicy = planetasistemasolarModel.new PlanetaSistemaSolarFocusTraversalPolicy(this);
			
			//planetasistemasolarFocusTraversalPolicy.setplanetasistemasolarJInternalFrame(this);
			
			this.setFocusTraversalPolicy(planetasistemasolarModel);
			
			
			this.jContentPaneDetallePlanetaSistemaSolar = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetallePlanetaSistemaSolar = new GridBagLayout();	
			this.jContentPaneDetallePlanetaSistemaSolar.setLayout(gridaBagLayoutDetallePlanetaSistemaSolar);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPlanetaSistemaSolar = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
				this.gridBagConstraintsPlanetaSistemaSolar.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsPlanetaSistemaSolar.gridx = 0;
					
				
				this.jContentPaneDetallePlanetaSistemaSolar.add(jTtoolBarDetallePlanetaSistemaSolar, gridBagConstraintsPlanetaSistemaSolar);								
				
}
			
			this.jScrollPanelDatosEdicionPlanetaSistemaSolar=   new JScrollPane(jContentPaneDetallePlanetaSistemaSolar,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPlanetaSistemaSolar.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPlanetaSistemaSolar.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPlanetaSistemaSolar.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralPlanetaSistemaSolar=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPlanetaSistemaSolar.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPlanetaSistemaSolar.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPlanetaSistemaSolar.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
			
			
	        this.gridBagConstraintsPlanetaSistemaSolar.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsPlanetaSistemaSolar.gridx = 0;
	        
			this.jContentPaneDetallePlanetaSistemaSolar.add(jPanelCamposPlanetaSistemaSolar, gridBagConstraintsPlanetaSistemaSolar);
			
			
			
			
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
						&& planetasistemasolarSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.planetasistemasolarSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsPlanetaSistemaSolar= new GridBagConstraints();
						this.gridBagConstraintsPlanetaSistemaSolar.gridy = iGridyRelaciones++;
						this.gridBagConstraintsPlanetaSistemaSolar.gridx = 0;
						this.jContentPaneDetallePlanetaSistemaSolar.add(this.jTabbedPaneRelacionesPlanetaSistemaSolar, this.gridBagConstraintsPlanetaSistemaSolar);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesPlanetaSistemaSolar.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosPlanetaSistemaSolar.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
					this.gridBagConstraintsPlanetaSistemaSolar.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsPlanetaSistemaSolar.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsPlanetaSistemaSolar.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsPlanetaSistemaSolar.gridx = 0;
					
				
					this.jContentPaneDetallePlanetaSistemaSolar.add(jPanelCamposOcultosPlanetaSistemaSolar, gridBagConstraintsPlanetaSistemaSolar);
				
					this.jPanelCamposOcultosPlanetaSistemaSolar.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
			this.gridBagConstraintsPlanetaSistemaSolar.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsPlanetaSistemaSolar.gridx = 0;
	        this.gridBagConstraintsPlanetaSistemaSolar.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetallePlanetaSistemaSolar.add(this.jPanelAccionesFormularioPlanetaSistemaSolar, this.gridBagConstraintsPlanetaSistemaSolar);							
			
			
			
			this.gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
	        this.gridBagConstraintsPlanetaSistemaSolar.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsPlanetaSistemaSolar.gridx = 0;
	        
			
			this.jContentPaneDetallePlanetaSistemaSolar.add(this.jPanelAccionesPlanetaSistemaSolar, this.gridBagConstraintsPlanetaSistemaSolar);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionPlanetaSistemaSolar);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionPlanetaSistemaSolar=   new JScrollPane(this.jPanelCamposPlanetaSistemaSolar,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPlanetaSistemaSolar.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPlanetaSistemaSolar.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPlanetaSistemaSolar.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
			this.gridBagConstraintsPlanetaSistemaSolar.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsPlanetaSistemaSolar.gridx = 0;
			this.gridBagConstraintsPlanetaSistemaSolar.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsPlanetaSistemaSolar.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsPlanetaSistemaSolar.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionPlanetaSistemaSolar, this.gridBagConstraintsPlanetaSistemaSolar);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
			this.gridBagConstraintsPlanetaSistemaSolar.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPlanetaSistemaSolar.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioPlanetaSistemaSolar, this.gridBagConstraintsPlanetaSistemaSolar);			
			
			this.gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
			this.gridBagConstraintsPlanetaSistemaSolar.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPlanetaSistemaSolar.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesPlanetaSistemaSolar, this.gridBagConstraintsPlanetaSistemaSolar);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
		this.gridBagConstraintsPlanetaSistemaSolar.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPlanetaSistemaSolar.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPlanetaSistemaSolar, this.gridBagConstraintsPlanetaSistemaSolar);
			
			
		this.gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
		this.gridBagConstraintsPlanetaSistemaSolar.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPlanetaSistemaSolar.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPlanetaSistemaSolar, this.gridBagConstraintsPlanetaSistemaSolar);
		
			
		this.gridBagConstraintsPlanetaSistemaSolar = new GridBagConstraints();
		this.gridBagConstraintsPlanetaSistemaSolar.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPlanetaSistemaSolar.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPlanetaSistemaSolar, this.gridBagConstraintsPlanetaSistemaSolar);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralPlanetaSistemaSolar;//jContentPane;
		
		return jScrollPanelDatosEdicionPlanetaSistemaSolar;
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
