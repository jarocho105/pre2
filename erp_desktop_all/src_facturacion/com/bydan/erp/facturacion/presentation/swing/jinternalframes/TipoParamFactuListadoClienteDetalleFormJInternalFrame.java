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
import com.bydan.erp.facturacion.util.TipoParamFactuListadoClienteConstantesFunciones;

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
public class TipoParamFactuListadoClienteDetalleFormJInternalFrame extends TipoParamFactuListadoClienteBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoParamFactuListadoCliente;
	
	protected JMenuBar jmenuBarDetalleTipoParamFactuListadoCliente;
	
	protected JMenu jmenuDetalleTipoParamFactuListadoCliente;
	protected JMenu jmenuDetalleArchivoTipoParamFactuListadoCliente;
	protected JMenu jmenuDetalleAccionesTipoParamFactuListadoCliente;
	protected JMenu jmenuDetalleDatosTipoParamFactuListadoCliente;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoParamFactuListadoCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoParamFactuListadoCliente;	
	protected GridBagConstraints gridBagConstraintsTipoParamFactuListadoCliente;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoParamFactuListadoClienteBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoParamFactuListadoCliente;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoParamFactuListadoClienteSessionBean tipoparamfactulistadoclienteSessionBean;
	
	
	
		
	
	public TipoParamFactuListadoClienteLogic tipoparamfactulistadoclienteLogic;
	
	public JScrollPane jScrollPanelDatosTipoParamFactuListadoCliente;
	public JScrollPane jScrollPanelDatosEdicionTipoParamFactuListadoCliente;
	public JScrollPane jScrollPanelDatosGeneralTipoParamFactuListadoCliente;
	
	protected JPanel jPanelCamposTipoParamFactuListadoCliente;    
	protected JPanel jPanelCamposOcultosTipoParamFactuListadoCliente;    	
	protected JPanel jPanelAccionesTipoParamFactuListadoCliente;
	protected JPanel jPanelAccionesFormularioTipoParamFactuListadoCliente;
    
	
	
	protected Integer iXPanelCamposTipoParamFactuListadoCliente=0;
	protected Integer iYPanelCamposTipoParamFactuListadoCliente=0;
	
	protected Integer iXPanelCamposOcultosTipoParamFactuListadoCliente=0;
	protected Integer iYPanelCamposOcultosTipoParamFactuListadoCliente=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoParamFactuListadoCliente;
	public JButton jButtonModificarTipoParamFactuListadoCliente;
	public JButton jButtonActualizarTipoParamFactuListadoCliente;
    public JButton jButtonEliminarTipoParamFactuListadoCliente;
	public JButton jButtonCancelarTipoParamFactuListadoCliente;
    public JButton jButtonGuardarCambiosTipoParamFactuListadoCliente;
	public JButton jButtonGuardarCambiosTablaTipoParamFactuListadoCliente;
	protected JButton jButtonCerrarTipoParamFactuListadoCliente;
	
	
	protected JButton jButtonProcesarInformacionTipoParamFactuListadoCliente;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoParamFactuListadoCliente;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoParamFactuListadoCliente;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoParamFactuListadoCliente;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoParamFactuListadoCliente;
	protected JButton jButtonModificarToolBarTipoParamFactuListadoCliente;
	protected JButton jButtonActualizarToolBarTipoParamFactuListadoCliente;
    protected JButton jButtonEliminarToolBarTipoParamFactuListadoCliente;
	protected JButton jButtonCancelarToolBarTipoParamFactuListadoCliente;
    protected JButton jButtonGuardarCambiosToolBarTipoParamFactuListadoCliente;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoParamFactuListadoCliente;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoParamFactuListadoCliente;
	protected JButton jButtonCerrarToolBarTipoParamFactuListadoCliente;
	
	protected JButton jButtonProcesarInformacionToolBarTipoParamFactuListadoCliente;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoParamFactuListadoCliente;
	protected JMenuItem jMenuItemModificarTipoParamFactuListadoCliente;
	protected JMenuItem jMenuItemActualizarTipoParamFactuListadoCliente;
    protected JMenuItem jMenuItemEliminarTipoParamFactuListadoCliente;
	protected JMenuItem jMenuItemCancelarTipoParamFactuListadoCliente;
    protected JMenuItem jMenuItemGuardarCambiosTipoParamFactuListadoCliente;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoParamFactuListadoCliente;
	protected JMenuItem jMenuItemCerrarTipoParamFactuListadoCliente;
	protected JMenuItem jMenuItemDetalleCerrarTipoParamFactuListadoCliente;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoParamFactuListadoCliente;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoParamFactuListadoCliente;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoParamFactuListadoCliente;
	protected JMenuItem jMenuItemMostrarOcultarTipoParamFactuListadoCliente;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoParamFactuListadoCliente;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoParamFactuListadoCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoParamFactuListadoCliente;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoParamFactuListadoCliente;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoParamFactuListadoCliente;
	public JLabel jLabelIdTipoParamFactuListadoCliente;
	public JTextFieldMe jTextFieldidTipoParamFactuListadoCliente;
	public JButton jButtonidTipoParamFactuListadoClienteBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoParamFactuListadoCliente;
	public JLabel jLabelnombreTipoParamFactuListadoCliente;
	public JTextArea jTextAreanombreTipoParamFactuListadoCliente;
	public JScrollPane jscrollPanenombreTipoParamFactuListadoCliente;
	public JButton jButtonnombreTipoParamFactuListadoClienteBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoParamFactuListadoCliente;
	
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
	
	public TipoParamFactuListadoClienteDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoParamFactuListadoCliente=new JPanel();
				this.jPanelAccionesFormularioTipoParamFactuListadoCliente=new JPanel();
				this.jmenuBarDetalleTipoParamFactuListadoCliente=new JMenuBar();
				this.jTtoolBarDetalleTipoParamFactuListadoCliente=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoParamFactuListadoClienteDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoParamFactuListadoCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoParamFactuListadoClienteDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoParamFactuListadoCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoParamFactuListadoClienteDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoParamFactuListadoCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoParamFactuListadoClienteDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoParamFactuListadoCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoParamFactuListadoClienteDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoParamFactuListadoCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoParamFactuListadoCliente() {
		return this.jButtonActualizarToolBarTipoParamFactuListadoCliente;
	}
	
	public JButton getjButtonEliminarToolBarTipoParamFactuListadoCliente() {
		return this.jButtonEliminarToolBarTipoParamFactuListadoCliente;
	}
	
	public JButton getjButtonCancelarToolBarTipoParamFactuListadoCliente() {
		return this.jButtonCancelarToolBarTipoParamFactuListadoCliente;
	}		
	
	public JButton getjButtonProcesarInformacionTipoParamFactuListadoCliente() {
		return this.jButtonProcesarInformacionTipoParamFactuListadoCliente;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoParamFactuListadoCliente)	{
		this.jButtonProcesarInformacionTipoParamFactuListadoCliente = jButtonProcesarInformacionTipoParamFactuListadoCliente;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoParamFactuListadoCliente() {
		return this.jComboBoxTiposAccionesTipoParamFactuListadoCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoParamFactuListadoCliente(
			JComboBox jComboBoxTiposRelacionesTipoParamFactuListadoCliente) {
		this.jComboBoxTiposRelacionesTipoParamFactuListadoCliente = jComboBoxTiposRelacionesTipoParamFactuListadoCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoParamFactuListadoCliente(
			JComboBox jComboBoxTiposAccionesTipoParamFactuListadoCliente) {
		this.jComboBoxTiposAccionesTipoParamFactuListadoCliente = jComboBoxTiposAccionesTipoParamFactuListadoCliente;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoParamFactuListadoCliente() {
		return this.jComboBoxTiposAccionesFormularioTipoParamFactuListadoCliente;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoParamFactuListadoCliente(
			JComboBox jComboBoxTiposAccionesFormularioTipoParamFactuListadoCliente) {
		this.jComboBoxTiposAccionesFormularioTipoParamFactuListadoCliente = jComboBoxTiposAccionesFormularioTipoParamFactuListadoCliente;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipoparamfactulistadoclienteSessionBean=new TipoParamFactuListadoClienteSessionBean();
		
		this.tipoparamfactulistadoclienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoparamfactulistadoclienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoparamfactulistadoclienteSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoParamFactuListadoClienteJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoParamFactuListadoClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoParamFactuListadoClienteJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Listado Cliente MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipoparamfactulistadoclienteSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoParamFactuListadoClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoParamFactuListadoCliente= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoParamFactuListadoCliente=new JButtonMe();
				this.jButtonModificarToolBarTipoParamFactuListadoCliente=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoParamFactuListadoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoParamFactuListadoCliente,this.jTtoolBarDetalleTipoParamFactuListadoCliente,
							"actualizar","actualizar","Actualizar"+" "+TipoParamFactuListadoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoParamFactuListadoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoParamFactuListadoCliente,this.jTtoolBarDetalleTipoParamFactuListadoCliente,
							"eliminar","eliminar","Eliminar"+" "+TipoParamFactuListadoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoParamFactuListadoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoParamFactuListadoCliente,this.jTtoolBarDetalleTipoParamFactuListadoCliente,
							"cancelar","cancelar","Cancelar"+" "+TipoParamFactuListadoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoParamFactuListadoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoParamFactuListadoCliente,this.jTtoolBarDetalleTipoParamFactuListadoCliente,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoParamFactuListadoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoParamFactuListadoCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoParamFactuListadoCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoParamFactuListadoCliente,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoParamFactuListadoCliente=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoParamFactuListadoCliente=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoParamFactuListadoCliente=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoParamFactuListadoCliente=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoParamFactuListadoCliente=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoParamFactuListadoCliente= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoParamFactuListadoCliente.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoParamFactuListadoCliente,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoParamFactuListadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoParamFactuListadoCliente= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoParamFactuListadoCliente.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoParamFactuListadoCliente,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoParamFactuListadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoParamFactuListadoCliente= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoParamFactuListadoCliente.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoParamFactuListadoCliente,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoParamFactuListadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoParamFactuListadoCliente= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoParamFactuListadoCliente.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoParamFactuListadoCliente,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoParamFactuListadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoParamFactuListadoCliente= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoParamFactuListadoCliente.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoParamFactuListadoCliente,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoParamFactuListadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoParamFactuListadoCliente= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoParamFactuListadoCliente.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoParamFactuListadoCliente,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoParamFactuListadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoParamFactuListadoCliente= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoParamFactuListadoCliente.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoParamFactuListadoCliente,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoParamFactuListadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoParamFactuListadoCliente= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoParamFactuListadoCliente.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoParamFactuListadoCliente,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoParamFactuListadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoParamFactuListadoCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoParamFactuListadoCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoParamFactuListadoCliente,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoParamFactuListadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoParamFactuListadoCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoParamFactuListadoCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoParamFactuListadoCliente,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoParamFactuListadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoParamFactuListadoCliente.add(this.jMenuItemDetalleCerrarTipoParamFactuListadoCliente);
		
		this.jmenuDetalleAccionesTipoParamFactuListadoCliente.add(this.jMenuItemActualizarTipoParamFactuListadoCliente);
		this.jmenuDetalleAccionesTipoParamFactuListadoCliente.add(this.jMenuItemEliminarTipoParamFactuListadoCliente);
		this.jmenuDetalleAccionesTipoParamFactuListadoCliente.add(this.jMenuItemCancelarTipoParamFactuListadoCliente);		
		
		//this.jmenuDetalleDatosTipoParamFactuListadoCliente.add(this.jMenuItemDetalleAbrirOrderByTipoParamFactuListadoCliente);				
		this.jmenuDetalleDatosTipoParamFactuListadoCliente.add(this.jMenuItemDetalleMostarOcultarTipoParamFactuListadoCliente);				
				
		//this.jmenuDetalleAccionesTipoParamFactuListadoCliente.add(this.jMenuItemGuardarCambiosTipoParamFactuListadoCliente);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoParamFactuListadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoParamFactuListadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoParamFactuListadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoParamFactuListadoCliente.add(this.jmenuDetalleArchivoTipoParamFactuListadoCliente);		
		this.jmenuBarDetalleTipoParamFactuListadoCliente.add(this.jmenuDetalleAccionesTipoParamFactuListadoCliente);		
		this.jmenuBarDetalleTipoParamFactuListadoCliente.add(this.jmenuDetalleDatosTipoParamFactuListadoCliente);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoParamFactuListadoCliente);				
	}
	
	
	public void inicializarElementosCamposTipoParamFactuListadoCliente() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoParamFactuListadoCliente = new JLabelMe();
		jLabelIdTipoParamFactuListadoCliente.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoParamFactuListadoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoParamFactuListadoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoParamFactuListadoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoParamFactuListadoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoParamFactuListadoCliente = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoParamFactuListadoCliente.setToolTipText(TipoParamFactuListadoClienteConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoParamFactuListadoCliente= new GridBagLayout();

		this.jPanelidTipoParamFactuListadoCliente.setLayout(this.gridaBagLayoutTipoParamFactuListadoCliente);

		jTextFieldidTipoParamFactuListadoCliente = new JTextFieldMe();
		jTextFieldidTipoParamFactuListadoCliente.setText("Id");

		jTextFieldidTipoParamFactuListadoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoParamFactuListadoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoParamFactuListadoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreTipoParamFactuListadoCliente = new JLabelMe();
		this.jLabelnombreTipoParamFactuListadoCliente.setText(""+TipoParamFactuListadoClienteConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoParamFactuListadoCliente.setToolTipText("Nombre");
		this.jLabelnombreTipoParamFactuListadoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoParamFactuListadoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoParamFactuListadoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoParamFactuListadoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoParamFactuListadoCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoParamFactuListadoCliente.setToolTipText(TipoParamFactuListadoClienteConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoParamFactuListadoCliente = new GridBagLayout();
		this.jPanelnombreTipoParamFactuListadoCliente.setLayout(this.gridaBagLayoutTipoParamFactuListadoCliente);


		jTextAreanombreTipoParamFactuListadoCliente= new JTextAreaMe();
		jTextAreanombreTipoParamFactuListadoCliente.setEnabled(false);
		jTextAreanombreTipoParamFactuListadoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoParamFactuListadoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoParamFactuListadoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoParamFactuListadoCliente.setLineWrap(true);
		jTextAreanombreTipoParamFactuListadoCliente.setWrapStyleWord(true);
		jTextAreanombreTipoParamFactuListadoCliente.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoParamFactuListadoCliente.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoParamFactuListadoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoParamFactuListadoCliente = new JScrollPane(jTextAreanombreTipoParamFactuListadoCliente);
		jscrollPanenombreTipoParamFactuListadoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),70));
		jscrollPanenombreTipoParamFactuListadoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),70));
		jscrollPanenombreTipoParamFactuListadoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),70));

		this.jButtonnombreTipoParamFactuListadoClienteBusqueda= new JButtonMe();
		this.jButtonnombreTipoParamFactuListadoClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoParamFactuListadoClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoParamFactuListadoClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoParamFactuListadoClienteBusqueda.setText("U");
		this.jButtonnombreTipoParamFactuListadoClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoParamFactuListadoClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoParamFactuListadoClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoParamFactuListadoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoParamFactuListadoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoParamFactuListadoClienteBusqueda"));

		if(this.tipoparamfactulistadoclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoParamFactuListadoClienteBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoParamFactuListadoCliente() {
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
		//this.jInternalFrameDetalleTipoParamFactuListadoCliente = new TipoParamFactuListadoClienteBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Listado Cliente DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoParamFactuListadoCliente= new GridBagLayout();
		

		
		String sToolTipTipoParamFactuListadoCliente="";
		sToolTipTipoParamFactuListadoCliente=TipoParamFactuListadoClienteConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoParamFactuListadoCliente+="(Facturacion.TipoParamFactuListadoCliente)";
		}
		
		if(!this.tipoparamfactulistadoclienteSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoParamFactuListadoCliente+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoParamFactuListadoCliente = new JButtonMe();
		this.jButtonModificarTipoParamFactuListadoCliente = new JButtonMe();
        this.jButtonActualizarTipoParamFactuListadoCliente = new JButtonMe();
        this.jButtonEliminarTipoParamFactuListadoCliente = new JButtonMe();
        this.jButtonCancelarTipoParamFactuListadoCliente = new JButtonMe();
        this.jButtonGuardarCambiosTipoParamFactuListadoCliente = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoParamFactuListadoCliente = new JButtonMe();
		this.jButtonCerrarTipoParamFactuListadoCliente = new JButtonMe();
		
		this.jScrollPanelDatosTipoParamFactuListadoCliente = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoParamFactuListadoCliente = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoParamFactuListadoCliente = new JScrollPane();
				
		
		
		this.jPanelCamposTipoParamFactuListadoCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoParamFactuListadoCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoParamFactuListadoCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoParamFactuListadoCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Listado Cliente";
		
		if(!this.tipoparamfactulistadoclienteSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoParamFactuListadoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Listado Clientes" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoParamFactuListadoCliente.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoParamFactuListadoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoParamFactuListadoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoParamFactuListadoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoParamFactuListadoCliente.setName("jPanelCamposTipoParamFactuListadoCliente"); 

		this.jPanelCamposOcultosTipoParamFactuListadoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoParamFactuListadoCliente.setName("jPanelCamposOcultosTipoParamFactuListadoCliente"); 

        this.jPanelAccionesTipoParamFactuListadoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoParamFactuListadoCliente.setToolTipText("Acciones");
        this.jPanelAccionesTipoParamFactuListadoCliente.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoParamFactuListadoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoParamFactuListadoCliente.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoParamFactuListadoCliente.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoParamFactuListadoCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoParamFactuListadoCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoParamFactuListadoCliente, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoParamFactuListadoCliente, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoParamFactuListadoCliente, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoParamFactuListadoCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoParamFactuListadoCliente.setText("Nuevo");
		this.jButtonModificarTipoParamFactuListadoCliente.setText("Editar");
        this.jButtonActualizarTipoParamFactuListadoCliente.setText("Actualizar");
        this.jButtonEliminarTipoParamFactuListadoCliente.setText("Eliminar");
        this.jButtonCancelarTipoParamFactuListadoCliente.setText("Cancelar");
        this.jButtonGuardarCambiosTipoParamFactuListadoCliente.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoParamFactuListadoCliente.setText("Guardar");
		this.jButtonCerrarTipoParamFactuListadoCliente.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoParamFactuListadoCliente,"nuevo_button","Nuevo",this.tipoparamfactulistadoclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoParamFactuListadoCliente,"modificar_button","Editar",this.tipoparamfactulistadoclienteSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoParamFactuListadoCliente,"actualizar_button","Actualizar",this.tipoparamfactulistadoclienteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoParamFactuListadoCliente,"eliminar_button","Eliminar",this.tipoparamfactulistadoclienteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoParamFactuListadoCliente,"cancelar_button","Cancelar",this.tipoparamfactulistadoclienteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoParamFactuListadoCliente,"guardarcambios_button","Guardar",this.tipoparamfactulistadoclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoParamFactuListadoCliente,"guardarcambiostabla_button","Guardar",this.tipoparamfactulistadoclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoParamFactuListadoCliente,"cerrar_button","Salir",this.tipoparamfactulistadoclienteSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoParamFactuListadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoParamFactuListadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoParamFactuListadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoParamFactuListadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoParamFactuListadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoParamFactuListadoCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoParamFactuListadoCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoParamFactuListadoCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoParamFactuListadoCliente.setToolTipText("Nuevo"+" "+TipoParamFactuListadoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoParamFactuListadoCliente.setToolTipText("Editar"+" "+TipoParamFactuListadoClienteConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoParamFactuListadoCliente.setToolTipText("Actualizar"+" "+TipoParamFactuListadoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoParamFactuListadoCliente.setToolTipText("Eliminar)"+" "+TipoParamFactuListadoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoParamFactuListadoCliente.setToolTipText("Cancelar"+" "+TipoParamFactuListadoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoParamFactuListadoCliente.setToolTipText("Guardar"+" "+TipoParamFactuListadoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoParamFactuListadoCliente.setToolTipText("Guardar"+" "+TipoParamFactuListadoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoParamFactuListadoCliente.setToolTipText("Salir"+" "+TipoParamFactuListadoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoParamFactuListadoCliente";
		inputMap = this.jButtonNuevoTipoParamFactuListadoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoParamFactuListadoCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoParamFactuListadoCliente"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoParamFactuListadoCliente";
		inputMap = this.jButtonActualizarTipoParamFactuListadoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoParamFactuListadoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoParamFactuListadoCliente"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoParamFactuListadoCliente";
		inputMap = this.jButtonEliminarTipoParamFactuListadoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoParamFactuListadoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoParamFactuListadoCliente"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoParamFactuListadoCliente";
		inputMap = this.jButtonCancelarTipoParamFactuListadoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoParamFactuListadoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoParamFactuListadoCliente"));
		
		//CERRAR		
		sMapKey = "CerrarTipoParamFactuListadoCliente";
		inputMap = this.jButtonCerrarTipoParamFactuListadoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoParamFactuListadoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoParamFactuListadoCliente"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoParamFactuListadoCliente";
		inputMap = this.jButtonGuardarCambiosTablaTipoParamFactuListadoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoParamFactuListadoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoParamFactuListadoCliente"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoParamFactuListadoCliente = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoParamFactuListadoCliente.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoParamFactuListadoCliente.setToolTipText("Nuevo TipoParamFactuListadoCliente");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoParamFactuListadoCliente, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoParamFactuListadoCliente = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoParamFactuListadoCliente.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoParamFactuListadoCliente.setToolTipText("Sin Cerrar Ventana TipoParamFactuListadoCliente");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoParamFactuListadoCliente, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoParamFactuListadoCliente = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoParamFactuListadoCliente.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoParamFactuListadoCliente.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoParamFactuListadoCliente, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoParamFactuListadoCliente = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoParamFactuListadoCliente.setText("Accion");
		this.jComboBoxTiposAccionesTipoParamFactuListadoCliente.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoParamFactuListadoCliente = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoParamFactuListadoCliente.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoParamFactuListadoCliente.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoParamFactuListadoCliente = new JLabelMe();
		
		this.jLabelAccionesTipoParamFactuListadoCliente.setText("Acciones");		
		this.jLabelAccionesTipoParamFactuListadoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoParamFactuListadoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoParamFactuListadoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoParamFactuListadoCliente();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoParamFactuListadoCliente();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoParamFactuListadoCliente=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoParamFactuListadoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoParamFactuListadoCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoParamFactuListadoCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoParamFactuListadoCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoParamFactuListadoCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoParamFactuListadoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoParamFactuListadoCliente.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoParamFactuListadoCliente.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoParamFactuListadoCliente.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoParamFactuListadoCliente, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoParamFactuListadoCliente = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoParamFactuListadoCliente = new GridBagLayout();
		
		this.jPanelCamposTipoParamFactuListadoCliente.setLayout(gridaBagLayoutCamposTipoParamFactuListadoCliente);
		this.jPanelCamposOcultosTipoParamFactuListadoCliente.setLayout(gridaBagLayoutCamposOcultosTipoParamFactuListadoCliente);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoParamFactuListadoCliente = new GridBagConstraints();
	this.gridBagConstraintsTipoParamFactuListadoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoParamFactuListadoCliente.gridy = 0;
	this.gridBagConstraintsTipoParamFactuListadoCliente.gridx = 0;
	this.gridBagConstraintsTipoParamFactuListadoCliente.ipadx = 0;
	this.gridBagConstraintsTipoParamFactuListadoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoParamFactuListadoCliente.add(jLabelIdTipoParamFactuListadoCliente, this.gridBagConstraintsTipoParamFactuListadoCliente);



	this.gridBagConstraintsTipoParamFactuListadoCliente = new GridBagConstraints();
	this.gridBagConstraintsTipoParamFactuListadoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoParamFactuListadoCliente.gridy = 0;
	this.gridBagConstraintsTipoParamFactuListadoCliente.gridx = 1;
	this.gridBagConstraintsTipoParamFactuListadoCliente.ipadx = 0;
	this.gridBagConstraintsTipoParamFactuListadoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoParamFactuListadoCliente.add(jTextFieldidTipoParamFactuListadoCliente, this.gridBagConstraintsTipoParamFactuListadoCliente);


	this.gridBagConstraintsTipoParamFactuListadoCliente = new GridBagConstraints();
	this.gridBagConstraintsTipoParamFactuListadoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoParamFactuListadoCliente.gridy = 0;
	this.gridBagConstraintsTipoParamFactuListadoCliente.gridx = 0;
	this.gridBagConstraintsTipoParamFactuListadoCliente.ipadx = 0;
	this.gridBagConstraintsTipoParamFactuListadoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoParamFactuListadoCliente.add(jLabelnombreTipoParamFactuListadoCliente, this.gridBagConstraintsTipoParamFactuListadoCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoParamFactuListadoCliente = new GridBagConstraints();
		//this.gridBagConstraintsTipoParamFactuListadoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoParamFactuListadoCliente.gridy = 0;
		this.gridBagConstraintsTipoParamFactuListadoCliente.gridx = 2;
		this.gridBagConstraintsTipoParamFactuListadoCliente.ipadx = 0;
		this.gridBagConstraintsTipoParamFactuListadoCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoParamFactuListadoCliente.add(jButtonnombreTipoParamFactuListadoClienteBusqueda, this.gridBagConstraintsTipoParamFactuListadoCliente);
	}

	this.gridBagConstraintsTipoParamFactuListadoCliente = new GridBagConstraints();
	this.gridBagConstraintsTipoParamFactuListadoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoParamFactuListadoCliente.gridy = 0;
	this.gridBagConstraintsTipoParamFactuListadoCliente.gridx = 1;
	this.gridBagConstraintsTipoParamFactuListadoCliente.ipadx = 0;
	this.gridBagConstraintsTipoParamFactuListadoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoParamFactuListadoCliente.add(jscrollPanenombreTipoParamFactuListadoCliente, this.gridBagConstraintsTipoParamFactuListadoCliente);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoParamFactuListadoCliente = new GridBagConstraints();
	this.gridBagConstraintsTipoParamFactuListadoCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoParamFactuListadoCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoParamFactuListadoCliente.gridy = iYPanelCamposTipoParamFactuListadoCliente;
	this.gridBagConstraintsTipoParamFactuListadoCliente.gridx = iXPanelCamposTipoParamFactuListadoCliente++;
	this.gridBagConstraintsTipoParamFactuListadoCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoParamFactuListadoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoParamFactuListadoCliente.add(this.jPanelidTipoParamFactuListadoCliente, this.gridBagConstraintsTipoParamFactuListadoCliente);



	if(iXPanelCamposTipoParamFactuListadoCliente % 1==0) {
		iXPanelCamposTipoParamFactuListadoCliente=0;
		iYPanelCamposTipoParamFactuListadoCliente++;
	}
	this.gridBagConstraintsTipoParamFactuListadoCliente = new GridBagConstraints();
	this.gridBagConstraintsTipoParamFactuListadoCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoParamFactuListadoCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoParamFactuListadoCliente.gridy = iYPanelCamposTipoParamFactuListadoCliente;
	this.gridBagConstraintsTipoParamFactuListadoCliente.gridx = iXPanelCamposTipoParamFactuListadoCliente++;
	this.gridBagConstraintsTipoParamFactuListadoCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoParamFactuListadoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoParamFactuListadoCliente.add(this.jPanelnombreTipoParamFactuListadoCliente, this.gridBagConstraintsTipoParamFactuListadoCliente);



	if(iXPanelCamposTipoParamFactuListadoCliente % 1==0) {
		iXPanelCamposTipoParamFactuListadoCliente=0;
		iYPanelCamposTipoParamFactuListadoCliente++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoParamFactuListadoCliente= new GridBagLayout();
		this.jPanelAccionesTipoParamFactuListadoCliente.setLayout(gridaBagLayoutAccionesTipoParamFactuListadoCliente);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoParamFactuListadoCliente= new GridBagLayout();
		this.jPanelAccionesFormularioTipoParamFactuListadoCliente.setLayout(gridaBagLayoutAccionesFormularioTipoParamFactuListadoCliente);
		
		this.gridBagConstraintsTipoParamFactuListadoCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuListadoCliente.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoParamFactuListadoCliente.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoParamFactuListadoCliente.add(this.jComboBoxTiposAccionesFormularioTipoParamFactuListadoCliente, this.gridBagConstraintsTipoParamFactuListadoCliente);

		this.gridBagConstraintsTipoParamFactuListadoCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuListadoCliente.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoParamFactuListadoCliente.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoParamFactuListadoCliente.add(this.jCheckBoxPostAccionNuevoTipoParamFactuListadoCliente, this.gridBagConstraintsTipoParamFactuListadoCliente);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipoparamfactulistadoclienteSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoParamFactuListadoCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuListadoCliente.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoParamFactuListadoCliente.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoParamFactuListadoCliente.add(this.jCheckBoxPostAccionSinCerrarTipoParamFactuListadoCliente, this.gridBagConstraintsTipoParamFactuListadoCliente);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipoparamfactulistadoclienteSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipoparamfactulistadoclienteSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoParamFactuListadoCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuListadoCliente.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoParamFactuListadoCliente.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoParamFactuListadoCliente.add(this.jCheckBoxPostAccionSinMensajeTipoParamFactuListadoCliente, this.gridBagConstraintsTipoParamFactuListadoCliente);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoParamFactuListadoCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuListadoCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoParamFactuListadoCliente.gridy = 0;
		this.gridBagConstraintsTipoParamFactuListadoCliente.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoParamFactuListadoCliente.add(this.jButtonModificarTipoParamFactuListadoCliente, this.gridBagConstraintsTipoParamFactuListadoCliente);							

		this.gridBagConstraintsTipoParamFactuListadoCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuListadoCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoParamFactuListadoCliente.gridy = 0;
		this.gridBagConstraintsTipoParamFactuListadoCliente.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoParamFactuListadoCliente.add(this.jButtonEliminarTipoParamFactuListadoCliente, this.gridBagConstraintsTipoParamFactuListadoCliente);
		
			
		this.gridBagConstraintsTipoParamFactuListadoCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuListadoCliente.gridy = 0;		
		this.gridBagConstraintsTipoParamFactuListadoCliente.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoParamFactuListadoCliente.add(this.jButtonActualizarTipoParamFactuListadoCliente, this.gridBagConstraintsTipoParamFactuListadoCliente);


		this.gridBagConstraintsTipoParamFactuListadoCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuListadoCliente.gridy = 0;		
		this.gridBagConstraintsTipoParamFactuListadoCliente.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoParamFactuListadoCliente.add(this.jButtonGuardarCambiosTipoParamFactuListadoCliente, this.gridBagConstraintsTipoParamFactuListadoCliente);	
		
		this.gridBagConstraintsTipoParamFactuListadoCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuListadoCliente.gridy = 0;		
		this.gridBagConstraintsTipoParamFactuListadoCliente.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoParamFactuListadoCliente.add(this.jButtonCancelarTipoParamFactuListadoCliente, this.gridBagConstraintsTipoParamFactuListadoCliente);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoParamFactuListadoCliente = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoParamFactuListadoCliente);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoparamfactulistadoclienteSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoParamFactuListadoCliente = new GridBagConstraints();						
			this.gridBagConstraintsTipoParamFactuListadoCliente.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoParamFactuListadoCliente.gridx = 0;		
			//this.gridBagConstraintsTipoParamFactuListadoCliente.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoParamFactuListadoCliente.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoParamFactuListadoCliente.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoParamFactuListadoCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuListadoCliente.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoParamFactuListadoCliente.gridx =0;
		this.gridBagConstraintsTipoParamFactuListadoCliente.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoParamFactuListadoCliente.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoParamFactuListadoCliente, this.gridBagConstraintsTipoParamFactuListadoCliente);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoParamFactuListadoClienteJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoParamFactuListadoCliente = new TipoParamFactuListadoClienteBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Listado Cliente DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Listado Cliente DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Listado Cliente Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoParamFactuListadoClienteModel tipoparamfactulistadoclienteModel=new TipoParamFactuListadoClienteModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoParamFactuListadoClienteModel.TipoParamFactuListadoClienteFocusTraversalPolicy tipoparamfactulistadoclienteFocusTraversalPolicy = tipoparamfactulistadoclienteModel.new TipoParamFactuListadoClienteFocusTraversalPolicy(this);
			
			//tipoparamfactulistadoclienteFocusTraversalPolicy.settipoparamfactulistadoclienteJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipoparamfactulistadoclienteModel);
			
			
			this.jContentPaneDetalleTipoParamFactuListadoCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoParamFactuListadoCliente = new GridBagLayout();	
			this.jContentPaneDetalleTipoParamFactuListadoCliente.setLayout(gridaBagLayoutDetalleTipoParamFactuListadoCliente);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoParamFactuListadoCliente = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoParamFactuListadoCliente = new GridBagConstraints();
				this.gridBagConstraintsTipoParamFactuListadoCliente.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoParamFactuListadoCliente.gridx = 0;
					
				
				this.jContentPaneDetalleTipoParamFactuListadoCliente.add(jTtoolBarDetalleTipoParamFactuListadoCliente, gridBagConstraintsTipoParamFactuListadoCliente);								
				
}
			
			this.jScrollPanelDatosEdicionTipoParamFactuListadoCliente=   new JScrollPane(jContentPaneDetalleTipoParamFactuListadoCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoParamFactuListadoCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoParamFactuListadoCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoParamFactuListadoCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoParamFactuListadoCliente=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoParamFactuListadoCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoParamFactuListadoCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoParamFactuListadoCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoParamFactuListadoCliente = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoParamFactuListadoCliente.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoParamFactuListadoCliente.gridx = 0;
	        
			this.jContentPaneDetalleTipoParamFactuListadoCliente.add(jPanelCamposTipoParamFactuListadoCliente, gridBagConstraintsTipoParamFactuListadoCliente);
			
			
			
			
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
						&& tipoparamfactulistadoclienteSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.tipoparamfactulistadoclienteSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoParamFactuListadoCliente= new GridBagConstraints();
						this.gridBagConstraintsTipoParamFactuListadoCliente.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoParamFactuListadoCliente.gridx = 0;
						this.jContentPaneDetalleTipoParamFactuListadoCliente.add(this.jTabbedPaneRelacionesTipoParamFactuListadoCliente, this.gridBagConstraintsTipoParamFactuListadoCliente);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoParamFactuListadoCliente.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoParamFactuListadoCliente.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoParamFactuListadoCliente = new GridBagConstraints();
					this.gridBagConstraintsTipoParamFactuListadoCliente.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoParamFactuListadoCliente.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoParamFactuListadoCliente.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoParamFactuListadoCliente.gridx = 0;
					
				
					this.jContentPaneDetalleTipoParamFactuListadoCliente.add(jPanelCamposOcultosTipoParamFactuListadoCliente, gridBagConstraintsTipoParamFactuListadoCliente);
				
					this.jPanelCamposOcultosTipoParamFactuListadoCliente.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoParamFactuListadoCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuListadoCliente.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTipoParamFactuListadoCliente.gridx = 0;
	        this.gridBagConstraintsTipoParamFactuListadoCliente.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoParamFactuListadoCliente.add(this.jPanelAccionesFormularioTipoParamFactuListadoCliente, this.gridBagConstraintsTipoParamFactuListadoCliente);							
			
			
			
			this.gridBagConstraintsTipoParamFactuListadoCliente = new GridBagConstraints();
	        this.gridBagConstraintsTipoParamFactuListadoCliente.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTipoParamFactuListadoCliente.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoParamFactuListadoCliente.add(this.jPanelAccionesTipoParamFactuListadoCliente, this.gridBagConstraintsTipoParamFactuListadoCliente);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoParamFactuListadoCliente);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoParamFactuListadoCliente=   new JScrollPane(this.jPanelCamposTipoParamFactuListadoCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoParamFactuListadoCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoParamFactuListadoCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoParamFactuListadoCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoParamFactuListadoCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuListadoCliente.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoParamFactuListadoCliente.gridx = 0;
			this.gridBagConstraintsTipoParamFactuListadoCliente.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoParamFactuListadoCliente.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoParamFactuListadoCliente.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoParamFactuListadoCliente, this.gridBagConstraintsTipoParamFactuListadoCliente);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoParamFactuListadoCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuListadoCliente.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoParamFactuListadoCliente.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoParamFactuListadoCliente, this.gridBagConstraintsTipoParamFactuListadoCliente);			
			
			this.gridBagConstraintsTipoParamFactuListadoCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuListadoCliente.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoParamFactuListadoCliente.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoParamFactuListadoCliente, this.gridBagConstraintsTipoParamFactuListadoCliente);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoParamFactuListadoCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuListadoCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoParamFactuListadoCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoParamFactuListadoCliente, this.gridBagConstraintsTipoParamFactuListadoCliente);
			
			
		this.gridBagConstraintsTipoParamFactuListadoCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuListadoCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoParamFactuListadoCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoParamFactuListadoCliente, this.gridBagConstraintsTipoParamFactuListadoCliente);
		
			
		this.gridBagConstraintsTipoParamFactuListadoCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuListadoCliente.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoParamFactuListadoCliente.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoParamFactuListadoCliente, this.gridBagConstraintsTipoParamFactuListadoCliente);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoParamFactuListadoCliente;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoParamFactuListadoCliente;
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
