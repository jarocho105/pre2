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
import com.bydan.erp.cartera.util.TipoUbicacionNegocioConstantesFunciones;

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
public class TipoUbicacionNegocioDetalleFormJInternalFrame extends TipoUbicacionNegocioBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoUbicacionNegocio;
	
	protected JMenuBar jmenuBarDetalleTipoUbicacionNegocio;
	
	protected JMenu jmenuDetalleTipoUbicacionNegocio;
	protected JMenu jmenuDetalleArchivoTipoUbicacionNegocio;
	protected JMenu jmenuDetalleAccionesTipoUbicacionNegocio;
	protected JMenu jmenuDetalleDatosTipoUbicacionNegocio;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoUbicacionNegocio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoUbicacionNegocio;	
	protected GridBagConstraints gridBagConstraintsTipoUbicacionNegocio;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoUbicacionNegocioBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoUbicacionNegocio;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoUbicacionNegocioSessionBean tipoubicacionnegocioSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public TipoUbicacionNegocioLogic tipoubicacionnegocioLogic;
	
	public JScrollPane jScrollPanelDatosTipoUbicacionNegocio;
	public JScrollPane jScrollPanelDatosEdicionTipoUbicacionNegocio;
	public JScrollPane jScrollPanelDatosGeneralTipoUbicacionNegocio;
	
	protected JPanel jPanelCamposTipoUbicacionNegocio;    
	protected JPanel jPanelCamposOcultosTipoUbicacionNegocio;    	
	protected JPanel jPanelAccionesTipoUbicacionNegocio;
	protected JPanel jPanelAccionesFormularioTipoUbicacionNegocio;
    
	
	
	protected Integer iXPanelCamposTipoUbicacionNegocio=0;
	protected Integer iYPanelCamposTipoUbicacionNegocio=0;
	
	protected Integer iXPanelCamposOcultosTipoUbicacionNegocio=0;
	protected Integer iYPanelCamposOcultosTipoUbicacionNegocio=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoUbicacionNegocio;
	public JButton jButtonModificarTipoUbicacionNegocio;
	public JButton jButtonActualizarTipoUbicacionNegocio;
    public JButton jButtonEliminarTipoUbicacionNegocio;
	public JButton jButtonCancelarTipoUbicacionNegocio;
    public JButton jButtonGuardarCambiosTipoUbicacionNegocio;
	public JButton jButtonGuardarCambiosTablaTipoUbicacionNegocio;
	protected JButton jButtonCerrarTipoUbicacionNegocio;
	
	
	protected JButton jButtonProcesarInformacionTipoUbicacionNegocio;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoUbicacionNegocio;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoUbicacionNegocio;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoUbicacionNegocio;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoUbicacionNegocio;
	protected JButton jButtonModificarToolBarTipoUbicacionNegocio;
	protected JButton jButtonActualizarToolBarTipoUbicacionNegocio;
    protected JButton jButtonEliminarToolBarTipoUbicacionNegocio;
	protected JButton jButtonCancelarToolBarTipoUbicacionNegocio;
    protected JButton jButtonGuardarCambiosToolBarTipoUbicacionNegocio;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoUbicacionNegocio;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoUbicacionNegocio;
	protected JButton jButtonCerrarToolBarTipoUbicacionNegocio;
	
	protected JButton jButtonProcesarInformacionToolBarTipoUbicacionNegocio;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoUbicacionNegocio;
	protected JMenuItem jMenuItemModificarTipoUbicacionNegocio;
	protected JMenuItem jMenuItemActualizarTipoUbicacionNegocio;
    protected JMenuItem jMenuItemEliminarTipoUbicacionNegocio;
	protected JMenuItem jMenuItemCancelarTipoUbicacionNegocio;
    protected JMenuItem jMenuItemGuardarCambiosTipoUbicacionNegocio;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoUbicacionNegocio;
	protected JMenuItem jMenuItemCerrarTipoUbicacionNegocio;
	protected JMenuItem jMenuItemDetalleCerrarTipoUbicacionNegocio;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoUbicacionNegocio;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoUbicacionNegocio;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoUbicacionNegocio;
	protected JMenuItem jMenuItemMostrarOcultarTipoUbicacionNegocio;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoUbicacionNegocio;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoUbicacionNegocio;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoUbicacionNegocio;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoUbicacionNegocio;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoUbicacionNegocio;
	public JLabel jLabelIdTipoUbicacionNegocio;
	public JLabel jLabelidTipoUbicacionNegocio;
	public JButton jButtonidTipoUbicacionNegocioBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoUbicacionNegocio;
	public JLabel jLabelcodigoTipoUbicacionNegocio;
	public JTextField jTextFieldcodigoTipoUbicacionNegocio;
	public JButton jButtoncodigoTipoUbicacionNegocioBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoUbicacionNegocio;
	public JLabel jLabelnombreTipoUbicacionNegocio;
	public JTextArea jTextAreanombreTipoUbicacionNegocio;
	public JScrollPane jscrollPanenombreTipoUbicacionNegocio;
	public JButton jButtonnombreTipoUbicacionNegocioBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTipoUbicacionNegocio;
	public JLabel jLabelid_empresaTipoUbicacionNegocio;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTipoUbicacionNegocio;
	public JButton jButtonid_empresaTipoUbicacionNegocio= new JButtonMe();
	public JButton jButtonid_empresaTipoUbicacionNegocioUpdate= new JButtonMe();
	public JButton jButtonid_empresaTipoUbicacionNegocioBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoUbicacionNegocio;
	
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
	
	public TipoUbicacionNegocioDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoUbicacionNegocio=new JPanel();
				this.jPanelAccionesFormularioTipoUbicacionNegocio=new JPanel();
				this.jmenuBarDetalleTipoUbicacionNegocio=new JMenuBar();
				this.jTtoolBarDetalleTipoUbicacionNegocio=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoUbicacionNegocioDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoUbicacionNegocio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoUbicacionNegocioDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoUbicacionNegocio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoUbicacionNegocioDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoUbicacionNegocio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoUbicacionNegocioDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoUbicacionNegocio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoUbicacionNegocioDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoUbicacionNegocio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoUbicacionNegocio() {
		return this.jButtonActualizarToolBarTipoUbicacionNegocio;
	}
	
	public JButton getjButtonEliminarToolBarTipoUbicacionNegocio() {
		return this.jButtonEliminarToolBarTipoUbicacionNegocio;
	}
	
	public JButton getjButtonCancelarToolBarTipoUbicacionNegocio() {
		return this.jButtonCancelarToolBarTipoUbicacionNegocio;
	}		
	
	public JButton getjButtonProcesarInformacionTipoUbicacionNegocio() {
		return this.jButtonProcesarInformacionTipoUbicacionNegocio;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoUbicacionNegocio)	{
		this.jButtonProcesarInformacionTipoUbicacionNegocio = jButtonProcesarInformacionTipoUbicacionNegocio;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoUbicacionNegocio() {
		return this.jComboBoxTiposAccionesTipoUbicacionNegocio;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoUbicacionNegocio(
			JComboBox jComboBoxTiposRelacionesTipoUbicacionNegocio) {
		this.jComboBoxTiposRelacionesTipoUbicacionNegocio = jComboBoxTiposRelacionesTipoUbicacionNegocio;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoUbicacionNegocio(
			JComboBox jComboBoxTiposAccionesTipoUbicacionNegocio) {
		this.jComboBoxTiposAccionesTipoUbicacionNegocio = jComboBoxTiposAccionesTipoUbicacionNegocio;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoUbicacionNegocio() {
		return this.jComboBoxTiposAccionesFormularioTipoUbicacionNegocio;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoUbicacionNegocio(
			JComboBox jComboBoxTiposAccionesFormularioTipoUbicacionNegocio) {
		this.jComboBoxTiposAccionesFormularioTipoUbicacionNegocio = jComboBoxTiposAccionesFormularioTipoUbicacionNegocio;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipoubicacionnegocioSessionBean=new TipoUbicacionNegocioSessionBean();
		
		this.tipoubicacionnegocioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoubicacionnegocioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoubicacionnegocioSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoUbicacionNegocioJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoUbicacionNegocioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoUbicacionNegocioJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Ubicacion Negocio MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipoubicacionnegocioSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoUbicacionNegocioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoUbicacionNegocio= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoUbicacionNegocio=new JButtonMe();
				this.jButtonModificarToolBarTipoUbicacionNegocio=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoUbicacionNegocio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoUbicacionNegocio,this.jTtoolBarDetalleTipoUbicacionNegocio,
							"actualizar","actualizar","Actualizar"+" "+TipoUbicacionNegocioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoUbicacionNegocio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoUbicacionNegocio,this.jTtoolBarDetalleTipoUbicacionNegocio,
							"eliminar","eliminar","Eliminar"+" "+TipoUbicacionNegocioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoUbicacionNegocio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoUbicacionNegocio,this.jTtoolBarDetalleTipoUbicacionNegocio,
							"cancelar","cancelar","Cancelar"+" "+TipoUbicacionNegocioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoUbicacionNegocio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoUbicacionNegocio,this.jTtoolBarDetalleTipoUbicacionNegocio,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoUbicacionNegocioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoUbicacionNegocio,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoUbicacionNegocio,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoUbicacionNegocio,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoUbicacionNegocio=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoUbicacionNegocio=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoUbicacionNegocio=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoUbicacionNegocio=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoUbicacionNegocio=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoUbicacionNegocio= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoUbicacionNegocio.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoUbicacionNegocio,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoUbicacionNegocio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoUbicacionNegocio= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoUbicacionNegocio.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoUbicacionNegocio,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoUbicacionNegocio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoUbicacionNegocio= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoUbicacionNegocio.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoUbicacionNegocio,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoUbicacionNegocio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoUbicacionNegocio= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoUbicacionNegocio.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoUbicacionNegocio,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoUbicacionNegocio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoUbicacionNegocio= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoUbicacionNegocio.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoUbicacionNegocio,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoUbicacionNegocio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoUbicacionNegocio= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoUbicacionNegocio.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoUbicacionNegocio,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoUbicacionNegocio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoUbicacionNegocio= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoUbicacionNegocio.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoUbicacionNegocio,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoUbicacionNegocio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoUbicacionNegocio= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoUbicacionNegocio.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoUbicacionNegocio,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoUbicacionNegocio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoUbicacionNegocio= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoUbicacionNegocio.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoUbicacionNegocio,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoUbicacionNegocio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoUbicacionNegocio= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoUbicacionNegocio.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoUbicacionNegocio,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoUbicacionNegocio, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoUbicacionNegocio.add(this.jMenuItemDetalleCerrarTipoUbicacionNegocio);
		
		this.jmenuDetalleAccionesTipoUbicacionNegocio.add(this.jMenuItemActualizarTipoUbicacionNegocio);
		this.jmenuDetalleAccionesTipoUbicacionNegocio.add(this.jMenuItemEliminarTipoUbicacionNegocio);
		this.jmenuDetalleAccionesTipoUbicacionNegocio.add(this.jMenuItemCancelarTipoUbicacionNegocio);		
		
		//this.jmenuDetalleDatosTipoUbicacionNegocio.add(this.jMenuItemDetalleAbrirOrderByTipoUbicacionNegocio);				
		this.jmenuDetalleDatosTipoUbicacionNegocio.add(this.jMenuItemDetalleMostarOcultarTipoUbicacionNegocio);				
				
		//this.jmenuDetalleAccionesTipoUbicacionNegocio.add(this.jMenuItemGuardarCambiosTipoUbicacionNegocio);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoUbicacionNegocio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoUbicacionNegocio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoUbicacionNegocio, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoUbicacionNegocio.add(this.jmenuDetalleArchivoTipoUbicacionNegocio);		
		this.jmenuBarDetalleTipoUbicacionNegocio.add(this.jmenuDetalleAccionesTipoUbicacionNegocio);		
		this.jmenuBarDetalleTipoUbicacionNegocio.add(this.jmenuDetalleDatosTipoUbicacionNegocio);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoUbicacionNegocio);				
	}
	
	
	public void inicializarElementosCamposTipoUbicacionNegocio() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoUbicacionNegocio = new JLabelMe();
		jLabelIdTipoUbicacionNegocio.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoUbicacionNegocio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoUbicacionNegocio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoUbicacionNegocio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoUbicacionNegocio,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoUbicacionNegocio = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoUbicacionNegocio.setToolTipText(TipoUbicacionNegocioConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoUbicacionNegocio= new GridBagLayout();

		this.jPanelidTipoUbicacionNegocio.setLayout(this.gridaBagLayoutTipoUbicacionNegocio);

		jLabelidTipoUbicacionNegocio = new JLabel();
		jLabelidTipoUbicacionNegocio.setText("Id");

		jLabelidTipoUbicacionNegocio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoUbicacionNegocio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoUbicacionNegocio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoUbicacionNegocio = new JLabelMe();
		this.jLabelcodigoTipoUbicacionNegocio.setText(""+TipoUbicacionNegocioConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoUbicacionNegocio.setToolTipText("Codigo");
		this.jLabelcodigoTipoUbicacionNegocio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoUbicacionNegocio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoUbicacionNegocio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoUbicacionNegocio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoUbicacionNegocio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoUbicacionNegocio.setToolTipText(TipoUbicacionNegocioConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoUbicacionNegocio = new GridBagLayout();
		this.jPanelcodigoTipoUbicacionNegocio.setLayout(this.gridaBagLayoutTipoUbicacionNegocio);


		jTextFieldcodigoTipoUbicacionNegocio= new JTextFieldMe();

		jTextFieldcodigoTipoUbicacionNegocio.setEnabled(false);
		jTextFieldcodigoTipoUbicacionNegocio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoUbicacionNegocio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoUbicacionNegocio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoUbicacionNegocio,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoUbicacionNegocioBusqueda= new JButtonMe();
		this.jButtoncodigoTipoUbicacionNegocioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoUbicacionNegocioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoUbicacionNegocioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoUbicacionNegocioBusqueda.setText("U");
		this.jButtoncodigoTipoUbicacionNegocioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoUbicacionNegocioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoUbicacionNegocioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoUbicacionNegocio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoUbicacionNegocio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoUbicacionNegocioBusqueda"));

		if(this.tipoubicacionnegocioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoUbicacionNegocioBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoUbicacionNegocio = new JLabelMe();
		this.jLabelnombreTipoUbicacionNegocio.setText(""+TipoUbicacionNegocioConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoUbicacionNegocio.setToolTipText("Nombre");
		this.jLabelnombreTipoUbicacionNegocio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoUbicacionNegocio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoUbicacionNegocio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoUbicacionNegocio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoUbicacionNegocio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoUbicacionNegocio.setToolTipText(TipoUbicacionNegocioConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoUbicacionNegocio = new GridBagLayout();
		this.jPanelnombreTipoUbicacionNegocio.setLayout(this.gridaBagLayoutTipoUbicacionNegocio);


		jTextAreanombreTipoUbicacionNegocio= new JTextAreaMe();
		jTextAreanombreTipoUbicacionNegocio.setEnabled(false);
		jTextAreanombreTipoUbicacionNegocio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoUbicacionNegocio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoUbicacionNegocio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoUbicacionNegocio.setLineWrap(true);
		jTextAreanombreTipoUbicacionNegocio.setWrapStyleWord(true);
		jTextAreanombreTipoUbicacionNegocio.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoUbicacionNegocio.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoUbicacionNegocio,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoUbicacionNegocio = new JScrollPane(jTextAreanombreTipoUbicacionNegocio);
		jscrollPanenombreTipoUbicacionNegocio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),70));
		jscrollPanenombreTipoUbicacionNegocio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),70));
		jscrollPanenombreTipoUbicacionNegocio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),70));

		this.jButtonnombreTipoUbicacionNegocioBusqueda= new JButtonMe();
		this.jButtonnombreTipoUbicacionNegocioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoUbicacionNegocioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoUbicacionNegocioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoUbicacionNegocioBusqueda.setText("U");
		this.jButtonnombreTipoUbicacionNegocioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoUbicacionNegocioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoUbicacionNegocioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoUbicacionNegocio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoUbicacionNegocio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoUbicacionNegocioBusqueda"));

		if(this.tipoubicacionnegocioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoUbicacionNegocioBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoUbicacionNegocio() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTipoUbicacionNegocio = new JLabelMe();
		this.jLabelid_empresaTipoUbicacionNegocio.setText(""+TipoUbicacionNegocioConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTipoUbicacionNegocio.setToolTipText("Empresa");
		this.jLabelid_empresaTipoUbicacionNegocio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoUbicacionNegocio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoUbicacionNegocio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTipoUbicacionNegocio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTipoUbicacionNegocio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTipoUbicacionNegocio.setToolTipText(TipoUbicacionNegocioConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTipoUbicacionNegocio = new GridBagLayout();
		this.jPanelid_empresaTipoUbicacionNegocio.setLayout(this.gridaBagLayoutTipoUbicacionNegocio);


		jComboBoxid_empresaTipoUbicacionNegocio= new JComboBoxMe();
		jComboBoxid_empresaTipoUbicacionNegocio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoUbicacionNegocio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoUbicacionNegocio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTipoUbicacionNegocio,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTipoUbicacionNegocio.setEnabled(false);

		this.jButtonid_empresaTipoUbicacionNegocio= new JButtonMe();
		this.jButtonid_empresaTipoUbicacionNegocio.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoUbicacionNegocio.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoUbicacionNegocio.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoUbicacionNegocio.setText("Buscar");
		this.jButtonid_empresaTipoUbicacionNegocio.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTipoUbicacionNegocio.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoUbicacionNegocio,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTipoUbicacionNegocio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoUbicacionNegocio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoUbicacionNegocio"));

		this.jButtonid_empresaTipoUbicacionNegocioBusqueda= new JButtonMe();
		this.jButtonid_empresaTipoUbicacionNegocioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoUbicacionNegocioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoUbicacionNegocioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoUbicacionNegocioBusqueda.setText("U");
		this.jButtonid_empresaTipoUbicacionNegocioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTipoUbicacionNegocioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoUbicacionNegocioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTipoUbicacionNegocio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoUbicacionNegocio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoUbicacionNegocioBusqueda"));

		if(this.tipoubicacionnegocioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTipoUbicacionNegocioBusqueda.setVisible(false);		}

		this.jButtonid_empresaTipoUbicacionNegocioUpdate= new JButtonMe();
		this.jButtonid_empresaTipoUbicacionNegocioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoUbicacionNegocioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoUbicacionNegocioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoUbicacionNegocioUpdate.setText("U");
		this.jButtonid_empresaTipoUbicacionNegocioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTipoUbicacionNegocioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoUbicacionNegocioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTipoUbicacionNegocio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoUbicacionNegocio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoUbicacionNegocioUpdate"));



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
		//this.jInternalFrameDetalleTipoUbicacionNegocio = new TipoUbicacionNegocioBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Ubicacion Negocio DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoUbicacionNegocio= new GridBagLayout();
		

		
		String sToolTipTipoUbicacionNegocio="";
		sToolTipTipoUbicacionNegocio=TipoUbicacionNegocioConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoUbicacionNegocio+="(Cartera.TipoUbicacionNegocio)";
		}
		
		if(!this.tipoubicacionnegocioSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoUbicacionNegocio+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoUbicacionNegocio = new JButtonMe();
		this.jButtonModificarTipoUbicacionNegocio = new JButtonMe();
        this.jButtonActualizarTipoUbicacionNegocio = new JButtonMe();
        this.jButtonEliminarTipoUbicacionNegocio = new JButtonMe();
        this.jButtonCancelarTipoUbicacionNegocio = new JButtonMe();
        this.jButtonGuardarCambiosTipoUbicacionNegocio = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoUbicacionNegocio = new JButtonMe();
		this.jButtonCerrarTipoUbicacionNegocio = new JButtonMe();
		
		this.jScrollPanelDatosTipoUbicacionNegocio = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoUbicacionNegocio = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoUbicacionNegocio = new JScrollPane();
				
		
		
		this.jPanelCamposTipoUbicacionNegocio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoUbicacionNegocio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoUbicacionNegocio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoUbicacionNegocio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Ubicacion Negocio";
		
		if(!this.tipoubicacionnegocioSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoUbicacionNegocio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Ubicacion Negocios" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoUbicacionNegocio.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoUbicacionNegocio.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoUbicacionNegocio.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoUbicacionNegocio.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoUbicacionNegocio.setName("jPanelCamposTipoUbicacionNegocio"); 

		this.jPanelCamposOcultosTipoUbicacionNegocio.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoUbicacionNegocio.setName("jPanelCamposOcultosTipoUbicacionNegocio"); 

        this.jPanelAccionesTipoUbicacionNegocio.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoUbicacionNegocio.setToolTipText("Acciones");
        this.jPanelAccionesTipoUbicacionNegocio.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoUbicacionNegocio.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoUbicacionNegocio.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoUbicacionNegocio.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoUbicacionNegocio, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoUbicacionNegocio, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoUbicacionNegocio, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoUbicacionNegocio, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoUbicacionNegocio, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoUbicacionNegocio, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoUbicacionNegocio.setText("Nuevo");
		this.jButtonModificarTipoUbicacionNegocio.setText("Editar");
        this.jButtonActualizarTipoUbicacionNegocio.setText("Actualizar");
        this.jButtonEliminarTipoUbicacionNegocio.setText("Eliminar");
        this.jButtonCancelarTipoUbicacionNegocio.setText("Cancelar");
        this.jButtonGuardarCambiosTipoUbicacionNegocio.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoUbicacionNegocio.setText("Guardar");
		this.jButtonCerrarTipoUbicacionNegocio.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoUbicacionNegocio,"nuevo_button","Nuevo",this.tipoubicacionnegocioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoUbicacionNegocio,"modificar_button","Editar",this.tipoubicacionnegocioSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoUbicacionNegocio,"actualizar_button","Actualizar",this.tipoubicacionnegocioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoUbicacionNegocio,"eliminar_button","Eliminar",this.tipoubicacionnegocioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoUbicacionNegocio,"cancelar_button","Cancelar",this.tipoubicacionnegocioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoUbicacionNegocio,"guardarcambios_button","Guardar",this.tipoubicacionnegocioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoUbicacionNegocio,"guardarcambiostabla_button","Guardar",this.tipoubicacionnegocioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoUbicacionNegocio,"cerrar_button","Salir",this.tipoubicacionnegocioSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoUbicacionNegocio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoUbicacionNegocio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoUbicacionNegocio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoUbicacionNegocio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoUbicacionNegocio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoUbicacionNegocio, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoUbicacionNegocio, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoUbicacionNegocio, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoUbicacionNegocio.setToolTipText("Nuevo"+" "+TipoUbicacionNegocioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoUbicacionNegocio.setToolTipText("Editar"+" "+TipoUbicacionNegocioConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoUbicacionNegocio.setToolTipText("Actualizar"+" "+TipoUbicacionNegocioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoUbicacionNegocio.setToolTipText("Eliminar)"+" "+TipoUbicacionNegocioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoUbicacionNegocio.setToolTipText("Cancelar"+" "+TipoUbicacionNegocioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoUbicacionNegocio.setToolTipText("Guardar"+" "+TipoUbicacionNegocioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoUbicacionNegocio.setToolTipText("Guardar"+" "+TipoUbicacionNegocioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoUbicacionNegocio.setToolTipText("Salir"+" "+TipoUbicacionNegocioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoUbicacionNegocio";
		inputMap = this.jButtonNuevoTipoUbicacionNegocio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoUbicacionNegocio.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoUbicacionNegocio"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoUbicacionNegocio";
		inputMap = this.jButtonActualizarTipoUbicacionNegocio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoUbicacionNegocio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoUbicacionNegocio"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoUbicacionNegocio";
		inputMap = this.jButtonEliminarTipoUbicacionNegocio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoUbicacionNegocio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoUbicacionNegocio"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoUbicacionNegocio";
		inputMap = this.jButtonCancelarTipoUbicacionNegocio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoUbicacionNegocio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoUbicacionNegocio"));
		
		//CERRAR		
		sMapKey = "CerrarTipoUbicacionNegocio";
		inputMap = this.jButtonCerrarTipoUbicacionNegocio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoUbicacionNegocio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoUbicacionNegocio"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoUbicacionNegocio";
		inputMap = this.jButtonGuardarCambiosTablaTipoUbicacionNegocio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoUbicacionNegocio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoUbicacionNegocio"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoUbicacionNegocio = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoUbicacionNegocio.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoUbicacionNegocio.setToolTipText("Nuevo TipoUbicacionNegocio");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoUbicacionNegocio, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoUbicacionNegocio = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoUbicacionNegocio.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoUbicacionNegocio.setToolTipText("Sin Cerrar Ventana TipoUbicacionNegocio");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoUbicacionNegocio, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoUbicacionNegocio = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoUbicacionNegocio.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoUbicacionNegocio.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoUbicacionNegocio, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoUbicacionNegocio = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoUbicacionNegocio.setText("Accion");
		this.jComboBoxTiposAccionesTipoUbicacionNegocio.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoUbicacionNegocio = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoUbicacionNegocio.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoUbicacionNegocio.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoUbicacionNegocio = new JLabelMe();
		
		this.jLabelAccionesTipoUbicacionNegocio.setText("Acciones");		
		this.jLabelAccionesTipoUbicacionNegocio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoUbicacionNegocio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoUbicacionNegocio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoUbicacionNegocio();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoUbicacionNegocio();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoUbicacionNegocio=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoUbicacionNegocio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoUbicacionNegocio,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoUbicacionNegocio.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoUbicacionNegocio.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoUbicacionNegocio.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoUbicacionNegocio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoUbicacionNegocio.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoUbicacionNegocio.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoUbicacionNegocio.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoUbicacionNegocio, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoUbicacionNegocio = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoUbicacionNegocio = new GridBagLayout();
		
		this.jPanelCamposTipoUbicacionNegocio.setLayout(gridaBagLayoutCamposTipoUbicacionNegocio);
		this.jPanelCamposOcultosTipoUbicacionNegocio.setLayout(gridaBagLayoutCamposOcultosTipoUbicacionNegocio);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoUbicacionNegocio = new GridBagConstraints();
	this.gridBagConstraintsTipoUbicacionNegocio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoUbicacionNegocio.gridy = 0;
	this.gridBagConstraintsTipoUbicacionNegocio.gridx = 0;
	this.gridBagConstraintsTipoUbicacionNegocio.ipadx = 0;
	this.gridBagConstraintsTipoUbicacionNegocio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoUbicacionNegocio.add(jLabelIdTipoUbicacionNegocio, this.gridBagConstraintsTipoUbicacionNegocio);



	this.gridBagConstraintsTipoUbicacionNegocio = new GridBagConstraints();
	this.gridBagConstraintsTipoUbicacionNegocio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoUbicacionNegocio.gridy = 0;
	this.gridBagConstraintsTipoUbicacionNegocio.gridx = 1;
	this.gridBagConstraintsTipoUbicacionNegocio.ipadx = 0;
	this.gridBagConstraintsTipoUbicacionNegocio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoUbicacionNegocio.add(jLabelidTipoUbicacionNegocio, this.gridBagConstraintsTipoUbicacionNegocio);


	this.gridBagConstraintsTipoUbicacionNegocio = new GridBagConstraints();
	this.gridBagConstraintsTipoUbicacionNegocio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoUbicacionNegocio.gridy = 0;
	this.gridBagConstraintsTipoUbicacionNegocio.gridx = 0;
	this.gridBagConstraintsTipoUbicacionNegocio.ipadx = 0;
	this.gridBagConstraintsTipoUbicacionNegocio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTipoUbicacionNegocio.add(jLabelid_empresaTipoUbicacionNegocio, this.gridBagConstraintsTipoUbicacionNegocio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoUbicacionNegocio = new GridBagConstraints();
		//this.gridBagConstraintsTipoUbicacionNegocio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoUbicacionNegocio.gridy = 0;
		this.gridBagConstraintsTipoUbicacionNegocio.gridx = 2;
		this.gridBagConstraintsTipoUbicacionNegocio.ipadx = 0;
		this.gridBagConstraintsTipoUbicacionNegocio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoUbicacionNegocio.add(jButtonid_empresaTipoUbicacionNegocioBusqueda, this.gridBagConstraintsTipoUbicacionNegocio);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoUbicacionNegocio = new GridBagConstraints();
		//this.gridBagConstraintsTipoUbicacionNegocio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoUbicacionNegocio.gridy = 0;
		this.gridBagConstraintsTipoUbicacionNegocio.gridx = 3;
		this.gridBagConstraintsTipoUbicacionNegocio.ipadx = 0;
		this.gridBagConstraintsTipoUbicacionNegocio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoUbicacionNegocio.add(jButtonid_empresaTipoUbicacionNegocioUpdate, this.gridBagConstraintsTipoUbicacionNegocio);
	}

	this.gridBagConstraintsTipoUbicacionNegocio = new GridBagConstraints();
	this.gridBagConstraintsTipoUbicacionNegocio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoUbicacionNegocio.gridy = 0;
	this.gridBagConstraintsTipoUbicacionNegocio.gridx = 1;
	this.gridBagConstraintsTipoUbicacionNegocio.ipadx = 0;
	this.gridBagConstraintsTipoUbicacionNegocio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTipoUbicacionNegocio.add(jComboBoxid_empresaTipoUbicacionNegocio, this.gridBagConstraintsTipoUbicacionNegocio);


	this.gridBagConstraintsTipoUbicacionNegocio = new GridBagConstraints();
	this.gridBagConstraintsTipoUbicacionNegocio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoUbicacionNegocio.gridy = 0;
	this.gridBagConstraintsTipoUbicacionNegocio.gridx = 0;
	this.gridBagConstraintsTipoUbicacionNegocio.ipadx = 0;
	this.gridBagConstraintsTipoUbicacionNegocio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoUbicacionNegocio.add(jLabelcodigoTipoUbicacionNegocio, this.gridBagConstraintsTipoUbicacionNegocio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoUbicacionNegocio = new GridBagConstraints();
		//this.gridBagConstraintsTipoUbicacionNegocio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoUbicacionNegocio.gridy = 0;
		this.gridBagConstraintsTipoUbicacionNegocio.gridx = 2;
		this.gridBagConstraintsTipoUbicacionNegocio.ipadx = 0;
		this.gridBagConstraintsTipoUbicacionNegocio.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoUbicacionNegocio.add(jButtoncodigoTipoUbicacionNegocioBusqueda, this.gridBagConstraintsTipoUbicacionNegocio);
	}

	this.gridBagConstraintsTipoUbicacionNegocio = new GridBagConstraints();
	this.gridBagConstraintsTipoUbicacionNegocio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoUbicacionNegocio.gridy = 0;
	this.gridBagConstraintsTipoUbicacionNegocio.gridx = 1;
	this.gridBagConstraintsTipoUbicacionNegocio.ipadx = 0;
	this.gridBagConstraintsTipoUbicacionNegocio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoUbicacionNegocio.add(jTextFieldcodigoTipoUbicacionNegocio, this.gridBagConstraintsTipoUbicacionNegocio);


	this.gridBagConstraintsTipoUbicacionNegocio = new GridBagConstraints();
	this.gridBagConstraintsTipoUbicacionNegocio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoUbicacionNegocio.gridy = 0;
	this.gridBagConstraintsTipoUbicacionNegocio.gridx = 0;
	this.gridBagConstraintsTipoUbicacionNegocio.ipadx = 0;
	this.gridBagConstraintsTipoUbicacionNegocio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoUbicacionNegocio.add(jLabelnombreTipoUbicacionNegocio, this.gridBagConstraintsTipoUbicacionNegocio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoUbicacionNegocio = new GridBagConstraints();
		//this.gridBagConstraintsTipoUbicacionNegocio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoUbicacionNegocio.gridy = 0;
		this.gridBagConstraintsTipoUbicacionNegocio.gridx = 2;
		this.gridBagConstraintsTipoUbicacionNegocio.ipadx = 0;
		this.gridBagConstraintsTipoUbicacionNegocio.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoUbicacionNegocio.add(jButtonnombreTipoUbicacionNegocioBusqueda, this.gridBagConstraintsTipoUbicacionNegocio);
	}

	this.gridBagConstraintsTipoUbicacionNegocio = new GridBagConstraints();
	this.gridBagConstraintsTipoUbicacionNegocio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoUbicacionNegocio.gridy = 0;
	this.gridBagConstraintsTipoUbicacionNegocio.gridx = 1;
	this.gridBagConstraintsTipoUbicacionNegocio.ipadx = 0;
	this.gridBagConstraintsTipoUbicacionNegocio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoUbicacionNegocio.add(jscrollPanenombreTipoUbicacionNegocio, this.gridBagConstraintsTipoUbicacionNegocio);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoUbicacionNegocio = new GridBagConstraints();
	this.gridBagConstraintsTipoUbicacionNegocio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoUbicacionNegocio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoUbicacionNegocio.gridy = iYPanelCamposTipoUbicacionNegocio;
	this.gridBagConstraintsTipoUbicacionNegocio.gridx = iXPanelCamposTipoUbicacionNegocio++;
	this.gridBagConstraintsTipoUbicacionNegocio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoUbicacionNegocio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoUbicacionNegocio.add(this.jPanelidTipoUbicacionNegocio, this.gridBagConstraintsTipoUbicacionNegocio);



	if(iXPanelCamposTipoUbicacionNegocio % 1==0) {
		iXPanelCamposTipoUbicacionNegocio=0;
		iYPanelCamposTipoUbicacionNegocio++;
	}
	this.gridBagConstraintsTipoUbicacionNegocio = new GridBagConstraints();
	this.gridBagConstraintsTipoUbicacionNegocio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoUbicacionNegocio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoUbicacionNegocio.gridy = iYPanelCamposTipoUbicacionNegocio;
	this.gridBagConstraintsTipoUbicacionNegocio.gridx = iXPanelCamposTipoUbicacionNegocio++;
	this.gridBagConstraintsTipoUbicacionNegocio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoUbicacionNegocio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoUbicacionNegocio.add(this.jPanelcodigoTipoUbicacionNegocio, this.gridBagConstraintsTipoUbicacionNegocio);



	if(iXPanelCamposTipoUbicacionNegocio % 1==0) {
		iXPanelCamposTipoUbicacionNegocio=0;
		iYPanelCamposTipoUbicacionNegocio++;
	}
	this.gridBagConstraintsTipoUbicacionNegocio = new GridBagConstraints();
	this.gridBagConstraintsTipoUbicacionNegocio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoUbicacionNegocio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoUbicacionNegocio.gridy = iYPanelCamposTipoUbicacionNegocio;
	this.gridBagConstraintsTipoUbicacionNegocio.gridx = iXPanelCamposTipoUbicacionNegocio++;
	this.gridBagConstraintsTipoUbicacionNegocio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoUbicacionNegocio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoUbicacionNegocio.add(this.jPanelnombreTipoUbicacionNegocio, this.gridBagConstraintsTipoUbicacionNegocio);



	if(iXPanelCamposTipoUbicacionNegocio % 1==0) {
		iXPanelCamposTipoUbicacionNegocio=0;
		iYPanelCamposTipoUbicacionNegocio++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTipoUbicacionNegocio = new GridBagConstraints();
	this.gridBagConstraintsTipoUbicacionNegocio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoUbicacionNegocio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoUbicacionNegocio.gridy = iYPanelCamposOcultosTipoUbicacionNegocio;
	this.gridBagConstraintsTipoUbicacionNegocio.gridx = iXPanelCamposOcultosTipoUbicacionNegocio++;
	this.gridBagConstraintsTipoUbicacionNegocio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoUbicacionNegocio.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTipoUbicacionNegocio.add(this.jPanelid_empresaTipoUbicacionNegocio, this.gridBagConstraintsTipoUbicacionNegocio);



	if(iXPanelCamposOcultosTipoUbicacionNegocio % 1==0) {
		iXPanelCamposOcultosTipoUbicacionNegocio=0;
		iYPanelCamposOcultosTipoUbicacionNegocio++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoUbicacionNegocio= new GridBagLayout();
		this.jPanelAccionesTipoUbicacionNegocio.setLayout(gridaBagLayoutAccionesTipoUbicacionNegocio);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoUbicacionNegocio= new GridBagLayout();
		this.jPanelAccionesFormularioTipoUbicacionNegocio.setLayout(gridaBagLayoutAccionesFormularioTipoUbicacionNegocio);
		
		this.gridBagConstraintsTipoUbicacionNegocio = new GridBagConstraints();
		this.gridBagConstraintsTipoUbicacionNegocio.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoUbicacionNegocio.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoUbicacionNegocio.add(this.jComboBoxTiposAccionesFormularioTipoUbicacionNegocio, this.gridBagConstraintsTipoUbicacionNegocio);

		this.gridBagConstraintsTipoUbicacionNegocio = new GridBagConstraints();
		this.gridBagConstraintsTipoUbicacionNegocio.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoUbicacionNegocio.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoUbicacionNegocio.add(this.jCheckBoxPostAccionNuevoTipoUbicacionNegocio, this.gridBagConstraintsTipoUbicacionNegocio);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipoubicacionnegocioSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoUbicacionNegocio = new GridBagConstraints();
			this.gridBagConstraintsTipoUbicacionNegocio.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoUbicacionNegocio.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoUbicacionNegocio.add(this.jCheckBoxPostAccionSinCerrarTipoUbicacionNegocio, this.gridBagConstraintsTipoUbicacionNegocio);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipoubicacionnegocioSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipoubicacionnegocioSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoUbicacionNegocio = new GridBagConstraints();
			this.gridBagConstraintsTipoUbicacionNegocio.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoUbicacionNegocio.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoUbicacionNegocio.add(this.jCheckBoxPostAccionSinMensajeTipoUbicacionNegocio, this.gridBagConstraintsTipoUbicacionNegocio);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoUbicacionNegocio = new GridBagConstraints();
		this.gridBagConstraintsTipoUbicacionNegocio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoUbicacionNegocio.gridy = 0;
		this.gridBagConstraintsTipoUbicacionNegocio.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoUbicacionNegocio.add(this.jButtonModificarTipoUbicacionNegocio, this.gridBagConstraintsTipoUbicacionNegocio);							

		this.gridBagConstraintsTipoUbicacionNegocio = new GridBagConstraints();
		this.gridBagConstraintsTipoUbicacionNegocio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoUbicacionNegocio.gridy = 0;
		this.gridBagConstraintsTipoUbicacionNegocio.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoUbicacionNegocio.add(this.jButtonEliminarTipoUbicacionNegocio, this.gridBagConstraintsTipoUbicacionNegocio);
		
			
		this.gridBagConstraintsTipoUbicacionNegocio = new GridBagConstraints();
		this.gridBagConstraintsTipoUbicacionNegocio.gridy = 0;		
		this.gridBagConstraintsTipoUbicacionNegocio.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoUbicacionNegocio.add(this.jButtonActualizarTipoUbicacionNegocio, this.gridBagConstraintsTipoUbicacionNegocio);


		this.gridBagConstraintsTipoUbicacionNegocio = new GridBagConstraints();
		this.gridBagConstraintsTipoUbicacionNegocio.gridy = 0;		
		this.gridBagConstraintsTipoUbicacionNegocio.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoUbicacionNegocio.add(this.jButtonGuardarCambiosTipoUbicacionNegocio, this.gridBagConstraintsTipoUbicacionNegocio);	
		
		this.gridBagConstraintsTipoUbicacionNegocio = new GridBagConstraints();
		this.gridBagConstraintsTipoUbicacionNegocio.gridy = 0;		
		this.gridBagConstraintsTipoUbicacionNegocio.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoUbicacionNegocio.add(this.jButtonCancelarTipoUbicacionNegocio, this.gridBagConstraintsTipoUbicacionNegocio);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoUbicacionNegocio = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoUbicacionNegocio);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoubicacionnegocioSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoUbicacionNegocio = new GridBagConstraints();						
			this.gridBagConstraintsTipoUbicacionNegocio.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoUbicacionNegocio.gridx = 0;		
			//this.gridBagConstraintsTipoUbicacionNegocio.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoUbicacionNegocio.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoUbicacionNegocio.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoUbicacionNegocio = new GridBagConstraints();
		this.gridBagConstraintsTipoUbicacionNegocio.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoUbicacionNegocio.gridx =0;
		this.gridBagConstraintsTipoUbicacionNegocio.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoUbicacionNegocio.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoUbicacionNegocio, this.gridBagConstraintsTipoUbicacionNegocio);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoUbicacionNegocioJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoUbicacionNegocio = new TipoUbicacionNegocioBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Ubicacion Negocio DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Ubicacion Negocio DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Ubicacion Negocio Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoUbicacionNegocioModel tipoubicacionnegocioModel=new TipoUbicacionNegocioModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoUbicacionNegocioModel.TipoUbicacionNegocioFocusTraversalPolicy tipoubicacionnegocioFocusTraversalPolicy = tipoubicacionnegocioModel.new TipoUbicacionNegocioFocusTraversalPolicy(this);
			
			//tipoubicacionnegocioFocusTraversalPolicy.settipoubicacionnegocioJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipoubicacionnegocioModel);
			
			
			this.jContentPaneDetalleTipoUbicacionNegocio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoUbicacionNegocio = new GridBagLayout();	
			this.jContentPaneDetalleTipoUbicacionNegocio.setLayout(gridaBagLayoutDetalleTipoUbicacionNegocio);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoUbicacionNegocio = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoUbicacionNegocio = new GridBagConstraints();
				this.gridBagConstraintsTipoUbicacionNegocio.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoUbicacionNegocio.gridx = 0;
					
				
				this.jContentPaneDetalleTipoUbicacionNegocio.add(jTtoolBarDetalleTipoUbicacionNegocio, gridBagConstraintsTipoUbicacionNegocio);								
				
}
			
			this.jScrollPanelDatosEdicionTipoUbicacionNegocio=   new JScrollPane(jContentPaneDetalleTipoUbicacionNegocio,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoUbicacionNegocio.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoUbicacionNegocio.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoUbicacionNegocio.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoUbicacionNegocio=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoUbicacionNegocio.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoUbicacionNegocio.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoUbicacionNegocio.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoUbicacionNegocio = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoUbicacionNegocio.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoUbicacionNegocio.gridx = 0;
	        
			this.jContentPaneDetalleTipoUbicacionNegocio.add(jPanelCamposTipoUbicacionNegocio, gridBagConstraintsTipoUbicacionNegocio);
			
			
			
			
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
						&& tipoubicacionnegocioSessionBean.getConGuardarRelaciones()
						) {
					
					if(this.tipoubicacionnegocioSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoUbicacionNegocio= new GridBagConstraints();
						this.gridBagConstraintsTipoUbicacionNegocio.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoUbicacionNegocio.gridx = 0;
						this.jContentPaneDetalleTipoUbicacionNegocio.add(this.jTabbedPaneRelacionesTipoUbicacionNegocio, this.gridBagConstraintsTipoUbicacionNegocio);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoUbicacionNegocio.setVisible(false);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoUbicacionNegocio.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoUbicacionNegocio = new GridBagConstraints();
					this.gridBagConstraintsTipoUbicacionNegocio.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoUbicacionNegocio.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoUbicacionNegocio.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoUbicacionNegocio.gridx = 0;
					
				
					this.jContentPaneDetalleTipoUbicacionNegocio.add(jPanelCamposOcultosTipoUbicacionNegocio, gridBagConstraintsTipoUbicacionNegocio);
				
					this.jPanelCamposOcultosTipoUbicacionNegocio.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoUbicacionNegocio = new GridBagConstraints();
			this.gridBagConstraintsTipoUbicacionNegocio.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTipoUbicacionNegocio.gridx = 0;
	        this.gridBagConstraintsTipoUbicacionNegocio.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoUbicacionNegocio.add(this.jPanelAccionesFormularioTipoUbicacionNegocio, this.gridBagConstraintsTipoUbicacionNegocio);							
			
			
			
			this.gridBagConstraintsTipoUbicacionNegocio = new GridBagConstraints();
	        this.gridBagConstraintsTipoUbicacionNegocio.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTipoUbicacionNegocio.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoUbicacionNegocio.add(this.jPanelAccionesTipoUbicacionNegocio, this.gridBagConstraintsTipoUbicacionNegocio);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoUbicacionNegocio);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoUbicacionNegocio=   new JScrollPane(this.jPanelCamposTipoUbicacionNegocio,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoUbicacionNegocio.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoUbicacionNegocio.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoUbicacionNegocio.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoUbicacionNegocio = new GridBagConstraints();
			this.gridBagConstraintsTipoUbicacionNegocio.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoUbicacionNegocio.gridx = 0;
			this.gridBagConstraintsTipoUbicacionNegocio.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoUbicacionNegocio.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoUbicacionNegocio.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoUbicacionNegocio, this.gridBagConstraintsTipoUbicacionNegocio);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoUbicacionNegocio = new GridBagConstraints();
			this.gridBagConstraintsTipoUbicacionNegocio.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoUbicacionNegocio.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoUbicacionNegocio, this.gridBagConstraintsTipoUbicacionNegocio);			
			
			this.gridBagConstraintsTipoUbicacionNegocio = new GridBagConstraints();
			this.gridBagConstraintsTipoUbicacionNegocio.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoUbicacionNegocio.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoUbicacionNegocio, this.gridBagConstraintsTipoUbicacionNegocio);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoUbicacionNegocio = new GridBagConstraints();
		this.gridBagConstraintsTipoUbicacionNegocio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoUbicacionNegocio.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoUbicacionNegocio, this.gridBagConstraintsTipoUbicacionNegocio);
			
			
		this.gridBagConstraintsTipoUbicacionNegocio = new GridBagConstraints();
		this.gridBagConstraintsTipoUbicacionNegocio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoUbicacionNegocio.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoUbicacionNegocio, this.gridBagConstraintsTipoUbicacionNegocio);
		
			
		this.gridBagConstraintsTipoUbicacionNegocio = new GridBagConstraints();
		this.gridBagConstraintsTipoUbicacionNegocio.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoUbicacionNegocio.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoUbicacionNegocio, this.gridBagConstraintsTipoUbicacionNegocio);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoUbicacionNegocio;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoUbicacionNegocio;
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
