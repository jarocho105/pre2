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
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.puntoventa.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.puntoventa.util.TipoRiesgoClienteConstantesFunciones;

import com.bydan.erp.puntoventa.business.logic.*;
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
public class TipoRiesgoClienteDetalleFormJInternalFrame extends TipoRiesgoClienteBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoRiesgoCliente;
	
	protected JMenuBar jmenuBarDetalleTipoRiesgoCliente;
	
	protected JMenu jmenuDetalleTipoRiesgoCliente;
	protected JMenu jmenuDetalleArchivoTipoRiesgoCliente;
	protected JMenu jmenuDetalleAccionesTipoRiesgoCliente;
	protected JMenu jmenuDetalleDatosTipoRiesgoCliente;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoRiesgoCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoRiesgoCliente;	
	protected GridBagConstraints gridBagConstraintsTipoRiesgoCliente;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoRiesgoClienteBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoRiesgoCliente;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoRiesgoClienteSessionBean tiporiesgoclienteSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public TipoRiesgoClienteLogic tiporiesgoclienteLogic;
	
	public JScrollPane jScrollPanelDatosTipoRiesgoCliente;
	public JScrollPane jScrollPanelDatosEdicionTipoRiesgoCliente;
	public JScrollPane jScrollPanelDatosGeneralTipoRiesgoCliente;
	
	protected JPanel jPanelCamposTipoRiesgoCliente;    
	protected JPanel jPanelCamposOcultosTipoRiesgoCliente;    	
	protected JPanel jPanelAccionesTipoRiesgoCliente;
	protected JPanel jPanelAccionesFormularioTipoRiesgoCliente;
    
	
	
	protected Integer iXPanelCamposTipoRiesgoCliente=0;
	protected Integer iYPanelCamposTipoRiesgoCliente=0;
	
	protected Integer iXPanelCamposOcultosTipoRiesgoCliente=0;
	protected Integer iYPanelCamposOcultosTipoRiesgoCliente=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoRiesgoCliente;
	public JButton jButtonModificarTipoRiesgoCliente;
	public JButton jButtonActualizarTipoRiesgoCliente;
    public JButton jButtonEliminarTipoRiesgoCliente;
	public JButton jButtonCancelarTipoRiesgoCliente;
    public JButton jButtonGuardarCambiosTipoRiesgoCliente;
	public JButton jButtonGuardarCambiosTablaTipoRiesgoCliente;
	protected JButton jButtonCerrarTipoRiesgoCliente;
	
	
	protected JButton jButtonProcesarInformacionTipoRiesgoCliente;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoRiesgoCliente;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoRiesgoCliente;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoRiesgoCliente;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoRiesgoCliente;
	protected JButton jButtonModificarToolBarTipoRiesgoCliente;
	protected JButton jButtonActualizarToolBarTipoRiesgoCliente;
    protected JButton jButtonEliminarToolBarTipoRiesgoCliente;
	protected JButton jButtonCancelarToolBarTipoRiesgoCliente;
    protected JButton jButtonGuardarCambiosToolBarTipoRiesgoCliente;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoRiesgoCliente;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoRiesgoCliente;
	protected JButton jButtonCerrarToolBarTipoRiesgoCliente;
	
	protected JButton jButtonProcesarInformacionToolBarTipoRiesgoCliente;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoRiesgoCliente;
	protected JMenuItem jMenuItemModificarTipoRiesgoCliente;
	protected JMenuItem jMenuItemActualizarTipoRiesgoCliente;
    protected JMenuItem jMenuItemEliminarTipoRiesgoCliente;
	protected JMenuItem jMenuItemCancelarTipoRiesgoCliente;
    protected JMenuItem jMenuItemGuardarCambiosTipoRiesgoCliente;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoRiesgoCliente;
	protected JMenuItem jMenuItemCerrarTipoRiesgoCliente;
	protected JMenuItem jMenuItemDetalleCerrarTipoRiesgoCliente;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoRiesgoCliente;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoRiesgoCliente;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoRiesgoCliente;
	protected JMenuItem jMenuItemMostrarOcultarTipoRiesgoCliente;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoRiesgoCliente;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoRiesgoCliente;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoRiesgoCliente;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoRiesgoCliente;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoRiesgoCliente;
	public JLabel jLabelIdTipoRiesgoCliente;
	public JLabel jLabelidTipoRiesgoCliente;
	public JButton jButtonidTipoRiesgoClienteBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoRiesgoCliente;
	public JLabel jLabelnombreTipoRiesgoCliente;
	public JTextArea jTextAreanombreTipoRiesgoCliente;
	public JScrollPane jscrollPanenombreTipoRiesgoCliente;
	public JButton jButtonnombreTipoRiesgoClienteBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTipoRiesgoCliente;
	public JLabel jLabelid_empresaTipoRiesgoCliente;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTipoRiesgoCliente;
	public JButton jButtonid_empresaTipoRiesgoCliente= new JButtonMe();
	public JButton jButtonid_empresaTipoRiesgoClienteUpdate= new JButtonMe();
	public JButton jButtonid_empresaTipoRiesgoClienteBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoRiesgoCliente;
	
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
	
	public TipoRiesgoClienteDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoRiesgoCliente=new JPanel();
				this.jPanelAccionesFormularioTipoRiesgoCliente=new JPanel();
				this.jmenuBarDetalleTipoRiesgoCliente=new JMenuBar();
				this.jTtoolBarDetalleTipoRiesgoCliente=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoRiesgoClienteDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoRiesgoCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoRiesgoClienteDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoRiesgoCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoRiesgoClienteDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoRiesgoCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoRiesgoClienteDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoRiesgoCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoRiesgoClienteDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoRiesgoCliente No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoRiesgoCliente() {
		return this.jButtonActualizarToolBarTipoRiesgoCliente;
	}
	
	public JButton getjButtonEliminarToolBarTipoRiesgoCliente() {
		return this.jButtonEliminarToolBarTipoRiesgoCliente;
	}
	
	public JButton getjButtonCancelarToolBarTipoRiesgoCliente() {
		return this.jButtonCancelarToolBarTipoRiesgoCliente;
	}		
	
	public JButton getjButtonProcesarInformacionTipoRiesgoCliente() {
		return this.jButtonProcesarInformacionTipoRiesgoCliente;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoRiesgoCliente)	{
		this.jButtonProcesarInformacionTipoRiesgoCliente = jButtonProcesarInformacionTipoRiesgoCliente;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoRiesgoCliente() {
		return this.jComboBoxTiposAccionesTipoRiesgoCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoRiesgoCliente(
			JComboBox jComboBoxTiposRelacionesTipoRiesgoCliente) {
		this.jComboBoxTiposRelacionesTipoRiesgoCliente = jComboBoxTiposRelacionesTipoRiesgoCliente;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoRiesgoCliente(
			JComboBox jComboBoxTiposAccionesTipoRiesgoCliente) {
		this.jComboBoxTiposAccionesTipoRiesgoCliente = jComboBoxTiposAccionesTipoRiesgoCliente;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoRiesgoCliente() {
		return this.jComboBoxTiposAccionesFormularioTipoRiesgoCliente;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoRiesgoCliente(
			JComboBox jComboBoxTiposAccionesFormularioTipoRiesgoCliente) {
		this.jComboBoxTiposAccionesFormularioTipoRiesgoCliente = jComboBoxTiposAccionesFormularioTipoRiesgoCliente;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tiporiesgoclienteSessionBean=new TipoRiesgoClienteSessionBean();
		
		this.tiporiesgoclienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tiporiesgoclienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tiporiesgoclienteSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoRiesgoClienteJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoRiesgoClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoRiesgoClienteJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Riesgo Cliente MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tiporiesgoclienteSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoRiesgoClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoRiesgoCliente= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoRiesgoCliente=new JButtonMe();
				this.jButtonModificarToolBarTipoRiesgoCliente=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoRiesgoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoRiesgoCliente,this.jTtoolBarDetalleTipoRiesgoCliente,
							"actualizar","actualizar","Actualizar"+" "+TipoRiesgoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoRiesgoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoRiesgoCliente,this.jTtoolBarDetalleTipoRiesgoCliente,
							"eliminar","eliminar","Eliminar"+" "+TipoRiesgoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoRiesgoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoRiesgoCliente,this.jTtoolBarDetalleTipoRiesgoCliente,
							"cancelar","cancelar","Cancelar"+" "+TipoRiesgoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoRiesgoCliente=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoRiesgoCliente,this.jTtoolBarDetalleTipoRiesgoCliente,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoRiesgoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoRiesgoCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoRiesgoCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoRiesgoCliente,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoRiesgoCliente=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoRiesgoCliente=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoRiesgoCliente=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoRiesgoCliente=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoRiesgoCliente=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoRiesgoCliente= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoRiesgoCliente.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoRiesgoCliente,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoRiesgoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoRiesgoCliente= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoRiesgoCliente.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoRiesgoCliente,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoRiesgoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoRiesgoCliente= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoRiesgoCliente.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoRiesgoCliente,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoRiesgoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoRiesgoCliente= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoRiesgoCliente.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoRiesgoCliente,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoRiesgoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoRiesgoCliente= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoRiesgoCliente.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoRiesgoCliente,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoRiesgoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoRiesgoCliente= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoRiesgoCliente.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoRiesgoCliente,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoRiesgoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoRiesgoCliente= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoRiesgoCliente.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoRiesgoCliente,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoRiesgoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoRiesgoCliente= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoRiesgoCliente.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoRiesgoCliente,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoRiesgoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoRiesgoCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoRiesgoCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoRiesgoCliente,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoRiesgoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoRiesgoCliente= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoRiesgoCliente.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoRiesgoCliente,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoRiesgoCliente, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoRiesgoCliente.add(this.jMenuItemDetalleCerrarTipoRiesgoCliente);
		
		this.jmenuDetalleAccionesTipoRiesgoCliente.add(this.jMenuItemActualizarTipoRiesgoCliente);
		this.jmenuDetalleAccionesTipoRiesgoCliente.add(this.jMenuItemEliminarTipoRiesgoCliente);
		this.jmenuDetalleAccionesTipoRiesgoCliente.add(this.jMenuItemCancelarTipoRiesgoCliente);		
		
		//this.jmenuDetalleDatosTipoRiesgoCliente.add(this.jMenuItemDetalleAbrirOrderByTipoRiesgoCliente);				
		this.jmenuDetalleDatosTipoRiesgoCliente.add(this.jMenuItemDetalleMostarOcultarTipoRiesgoCliente);				
				
		//this.jmenuDetalleAccionesTipoRiesgoCliente.add(this.jMenuItemGuardarCambiosTipoRiesgoCliente);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoRiesgoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoRiesgoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoRiesgoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoRiesgoCliente.add(this.jmenuDetalleArchivoTipoRiesgoCliente);		
		this.jmenuBarDetalleTipoRiesgoCliente.add(this.jmenuDetalleAccionesTipoRiesgoCliente);		
		this.jmenuBarDetalleTipoRiesgoCliente.add(this.jmenuDetalleDatosTipoRiesgoCliente);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoRiesgoCliente);				
	}
	
	
	public void inicializarElementosCamposTipoRiesgoCliente() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoRiesgoCliente = new JLabelMe();
		jLabelIdTipoRiesgoCliente.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoRiesgoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoRiesgoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoRiesgoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoRiesgoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoRiesgoCliente = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoRiesgoCliente.setToolTipText(TipoRiesgoClienteConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoRiesgoCliente= new GridBagLayout();

		this.jPanelidTipoRiesgoCliente.setLayout(this.gridaBagLayoutTipoRiesgoCliente);

		jLabelidTipoRiesgoCliente = new JLabel();
		jLabelidTipoRiesgoCliente.setText("Id");

		jLabelidTipoRiesgoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoRiesgoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoRiesgoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreTipoRiesgoCliente = new JLabelMe();
		this.jLabelnombreTipoRiesgoCliente.setText(""+TipoRiesgoClienteConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoRiesgoCliente.setToolTipText("Nombre");
		this.jLabelnombreTipoRiesgoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoRiesgoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoRiesgoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoRiesgoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoRiesgoCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoRiesgoCliente.setToolTipText(TipoRiesgoClienteConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoRiesgoCliente = new GridBagLayout();
		this.jPanelnombreTipoRiesgoCliente.setLayout(this.gridaBagLayoutTipoRiesgoCliente);


		jTextAreanombreTipoRiesgoCliente= new JTextAreaMe();
		jTextAreanombreTipoRiesgoCliente.setEnabled(false);
		jTextAreanombreTipoRiesgoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoRiesgoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoRiesgoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoRiesgoCliente.setLineWrap(true);
		jTextAreanombreTipoRiesgoCliente.setWrapStyleWord(true);
		jTextAreanombreTipoRiesgoCliente.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoRiesgoCliente.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoRiesgoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoRiesgoCliente = new JScrollPane(jTextAreanombreTipoRiesgoCliente);
		jscrollPanenombreTipoRiesgoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoRiesgoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoRiesgoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoRiesgoClienteBusqueda= new JButtonMe();
		this.jButtonnombreTipoRiesgoClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoRiesgoClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoRiesgoClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoRiesgoClienteBusqueda.setText("U");
		this.jButtonnombreTipoRiesgoClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoRiesgoClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoRiesgoClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoRiesgoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoRiesgoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoRiesgoClienteBusqueda"));

		if(this.tiporiesgoclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoRiesgoClienteBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoRiesgoCliente() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTipoRiesgoCliente = new JLabelMe();
		this.jLabelid_empresaTipoRiesgoCliente.setText(""+TipoRiesgoClienteConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTipoRiesgoCliente.setToolTipText("Empresa");
		this.jLabelid_empresaTipoRiesgoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoRiesgoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoRiesgoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTipoRiesgoCliente,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTipoRiesgoCliente=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTipoRiesgoCliente.setToolTipText(TipoRiesgoClienteConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTipoRiesgoCliente = new GridBagLayout();
		this.jPanelid_empresaTipoRiesgoCliente.setLayout(this.gridaBagLayoutTipoRiesgoCliente);


		jComboBoxid_empresaTipoRiesgoCliente= new JComboBoxMe();
		jComboBoxid_empresaTipoRiesgoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoRiesgoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoRiesgoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTipoRiesgoCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTipoRiesgoCliente.setEnabled(false);

		this.jButtonid_empresaTipoRiesgoCliente= new JButtonMe();
		this.jButtonid_empresaTipoRiesgoCliente.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoRiesgoCliente.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoRiesgoCliente.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoRiesgoCliente.setText("Buscar");
		this.jButtonid_empresaTipoRiesgoCliente.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTipoRiesgoCliente.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoRiesgoCliente,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTipoRiesgoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoRiesgoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoRiesgoCliente"));

		this.jButtonid_empresaTipoRiesgoClienteBusqueda= new JButtonMe();
		this.jButtonid_empresaTipoRiesgoClienteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoRiesgoClienteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoRiesgoClienteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoRiesgoClienteBusqueda.setText("U");
		this.jButtonid_empresaTipoRiesgoClienteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTipoRiesgoClienteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoRiesgoClienteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTipoRiesgoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoRiesgoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoRiesgoClienteBusqueda"));

		if(this.tiporiesgoclienteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTipoRiesgoClienteBusqueda.setVisible(false);		}

		this.jButtonid_empresaTipoRiesgoClienteUpdate= new JButtonMe();
		this.jButtonid_empresaTipoRiesgoClienteUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoRiesgoClienteUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoRiesgoClienteUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoRiesgoClienteUpdate.setText("U");
		this.jButtonid_empresaTipoRiesgoClienteUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTipoRiesgoClienteUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoRiesgoClienteUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTipoRiesgoCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoRiesgoCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoRiesgoClienteUpdate"));



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
		//this.jInternalFrameDetalleTipoRiesgoCliente = new TipoRiesgoClienteBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Riesgo Cliente DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoRiesgoCliente= new GridBagLayout();
		

		
		String sToolTipTipoRiesgoCliente="";
		sToolTipTipoRiesgoCliente=TipoRiesgoClienteConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoRiesgoCliente+="(PuntoVenta.TipoRiesgoCliente)";
		}
		
		if(!this.tiporiesgoclienteSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoRiesgoCliente+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoRiesgoCliente = new JButtonMe();
		this.jButtonModificarTipoRiesgoCliente = new JButtonMe();
        this.jButtonActualizarTipoRiesgoCliente = new JButtonMe();
        this.jButtonEliminarTipoRiesgoCliente = new JButtonMe();
        this.jButtonCancelarTipoRiesgoCliente = new JButtonMe();
        this.jButtonGuardarCambiosTipoRiesgoCliente = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoRiesgoCliente = new JButtonMe();
		this.jButtonCerrarTipoRiesgoCliente = new JButtonMe();
		
		this.jScrollPanelDatosTipoRiesgoCliente = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoRiesgoCliente = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoRiesgoCliente = new JScrollPane();
				
		
		
		this.jPanelCamposTipoRiesgoCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoRiesgoCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoRiesgoCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoRiesgoCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Riesgo Cliente";
		
		if(!this.tiporiesgoclienteSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoRiesgoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Riesgo Clientes" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoRiesgoCliente.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoRiesgoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoRiesgoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoRiesgoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoRiesgoCliente.setName("jPanelCamposTipoRiesgoCliente"); 

		this.jPanelCamposOcultosTipoRiesgoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoRiesgoCliente.setName("jPanelCamposOcultosTipoRiesgoCliente"); 

        this.jPanelAccionesTipoRiesgoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoRiesgoCliente.setToolTipText("Acciones");
        this.jPanelAccionesTipoRiesgoCliente.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoRiesgoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoRiesgoCliente.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoRiesgoCliente.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoRiesgoCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoRiesgoCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoRiesgoCliente, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoRiesgoCliente, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoRiesgoCliente, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoRiesgoCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoRiesgoCliente.setText("Nuevo");
		this.jButtonModificarTipoRiesgoCliente.setText("Editar");
        this.jButtonActualizarTipoRiesgoCliente.setText("Actualizar");
        this.jButtonEliminarTipoRiesgoCliente.setText("Eliminar");
        this.jButtonCancelarTipoRiesgoCliente.setText("Cancelar");
        this.jButtonGuardarCambiosTipoRiesgoCliente.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoRiesgoCliente.setText("Guardar");
		this.jButtonCerrarTipoRiesgoCliente.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoRiesgoCliente,"nuevo_button","Nuevo",this.tiporiesgoclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoRiesgoCliente,"modificar_button","Editar",this.tiporiesgoclienteSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoRiesgoCliente,"actualizar_button","Actualizar",this.tiporiesgoclienteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoRiesgoCliente,"eliminar_button","Eliminar",this.tiporiesgoclienteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoRiesgoCliente,"cancelar_button","Cancelar",this.tiporiesgoclienteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoRiesgoCliente,"guardarcambios_button","Guardar",this.tiporiesgoclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoRiesgoCliente,"guardarcambiostabla_button","Guardar",this.tiporiesgoclienteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoRiesgoCliente,"cerrar_button","Salir",this.tiporiesgoclienteSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoRiesgoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoRiesgoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoRiesgoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoRiesgoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoRiesgoCliente, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoRiesgoCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoRiesgoCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoRiesgoCliente, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoRiesgoCliente.setToolTipText("Nuevo"+" "+TipoRiesgoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoRiesgoCliente.setToolTipText("Editar"+" "+TipoRiesgoClienteConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoRiesgoCliente.setToolTipText("Actualizar"+" "+TipoRiesgoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoRiesgoCliente.setToolTipText("Eliminar)"+" "+TipoRiesgoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoRiesgoCliente.setToolTipText("Cancelar"+" "+TipoRiesgoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoRiesgoCliente.setToolTipText("Guardar"+" "+TipoRiesgoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoRiesgoCliente.setToolTipText("Guardar"+" "+TipoRiesgoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoRiesgoCliente.setToolTipText("Salir"+" "+TipoRiesgoClienteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoRiesgoCliente";
		inputMap = this.jButtonNuevoTipoRiesgoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoRiesgoCliente.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoRiesgoCliente"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoRiesgoCliente";
		inputMap = this.jButtonActualizarTipoRiesgoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoRiesgoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoRiesgoCliente"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoRiesgoCliente";
		inputMap = this.jButtonEliminarTipoRiesgoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoRiesgoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoRiesgoCliente"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoRiesgoCliente";
		inputMap = this.jButtonCancelarTipoRiesgoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoRiesgoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoRiesgoCliente"));
		
		//CERRAR		
		sMapKey = "CerrarTipoRiesgoCliente";
		inputMap = this.jButtonCerrarTipoRiesgoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoRiesgoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoRiesgoCliente"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoRiesgoCliente";
		inputMap = this.jButtonGuardarCambiosTablaTipoRiesgoCliente.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoRiesgoCliente.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoRiesgoCliente"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoRiesgoCliente = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoRiesgoCliente.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoRiesgoCliente.setToolTipText("Nuevo TipoRiesgoCliente");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoRiesgoCliente, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoRiesgoCliente = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoRiesgoCliente.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoRiesgoCliente.setToolTipText("Sin Cerrar Ventana TipoRiesgoCliente");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoRiesgoCliente, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoRiesgoCliente = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoRiesgoCliente.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoRiesgoCliente.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoRiesgoCliente, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoRiesgoCliente = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoRiesgoCliente.setText("Accion");
		this.jComboBoxTiposAccionesTipoRiesgoCliente.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoRiesgoCliente = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoRiesgoCliente.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoRiesgoCliente.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoRiesgoCliente = new JLabelMe();
		
		this.jLabelAccionesTipoRiesgoCliente.setText("Acciones");		
		this.jLabelAccionesTipoRiesgoCliente.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoRiesgoCliente.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoRiesgoCliente.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoRiesgoCliente();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoRiesgoCliente();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoRiesgoCliente=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoRiesgoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoRiesgoCliente,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoRiesgoCliente.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoRiesgoCliente.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoRiesgoCliente.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoRiesgoCliente, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoRiesgoCliente.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoRiesgoCliente.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoRiesgoCliente.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoRiesgoCliente, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoRiesgoCliente = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoRiesgoCliente = new GridBagLayout();
		
		this.jPanelCamposTipoRiesgoCliente.setLayout(gridaBagLayoutCamposTipoRiesgoCliente);
		this.jPanelCamposOcultosTipoRiesgoCliente.setLayout(gridaBagLayoutCamposOcultosTipoRiesgoCliente);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoRiesgoCliente = new GridBagConstraints();
	this.gridBagConstraintsTipoRiesgoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRiesgoCliente.gridy = 0;
	this.gridBagConstraintsTipoRiesgoCliente.gridx = 0;
	this.gridBagConstraintsTipoRiesgoCliente.ipadx = 0;
	this.gridBagConstraintsTipoRiesgoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoRiesgoCliente.add(jLabelIdTipoRiesgoCliente, this.gridBagConstraintsTipoRiesgoCliente);



	this.gridBagConstraintsTipoRiesgoCliente = new GridBagConstraints();
	this.gridBagConstraintsTipoRiesgoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRiesgoCliente.gridy = 0;
	this.gridBagConstraintsTipoRiesgoCliente.gridx = 1;
	this.gridBagConstraintsTipoRiesgoCliente.ipadx = 0;
	this.gridBagConstraintsTipoRiesgoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoRiesgoCliente.add(jLabelidTipoRiesgoCliente, this.gridBagConstraintsTipoRiesgoCliente);


	this.gridBagConstraintsTipoRiesgoCliente = new GridBagConstraints();
	this.gridBagConstraintsTipoRiesgoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRiesgoCliente.gridy = 0;
	this.gridBagConstraintsTipoRiesgoCliente.gridx = 0;
	this.gridBagConstraintsTipoRiesgoCliente.ipadx = 0;
	this.gridBagConstraintsTipoRiesgoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTipoRiesgoCliente.add(jLabelid_empresaTipoRiesgoCliente, this.gridBagConstraintsTipoRiesgoCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoRiesgoCliente = new GridBagConstraints();
		//this.gridBagConstraintsTipoRiesgoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRiesgoCliente.gridy = 0;
		this.gridBagConstraintsTipoRiesgoCliente.gridx = 2;
		this.gridBagConstraintsTipoRiesgoCliente.ipadx = 0;
		this.gridBagConstraintsTipoRiesgoCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoRiesgoCliente.add(jButtonid_empresaTipoRiesgoClienteBusqueda, this.gridBagConstraintsTipoRiesgoCliente);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoRiesgoCliente = new GridBagConstraints();
		//this.gridBagConstraintsTipoRiesgoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRiesgoCliente.gridy = 0;
		this.gridBagConstraintsTipoRiesgoCliente.gridx = 3;
		this.gridBagConstraintsTipoRiesgoCliente.ipadx = 0;
		this.gridBagConstraintsTipoRiesgoCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoRiesgoCliente.add(jButtonid_empresaTipoRiesgoClienteUpdate, this.gridBagConstraintsTipoRiesgoCliente);
	}

	this.gridBagConstraintsTipoRiesgoCliente = new GridBagConstraints();
	this.gridBagConstraintsTipoRiesgoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRiesgoCliente.gridy = 0;
	this.gridBagConstraintsTipoRiesgoCliente.gridx = 1;
	this.gridBagConstraintsTipoRiesgoCliente.ipadx = 0;
	this.gridBagConstraintsTipoRiesgoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTipoRiesgoCliente.add(jComboBoxid_empresaTipoRiesgoCliente, this.gridBagConstraintsTipoRiesgoCliente);


	this.gridBagConstraintsTipoRiesgoCliente = new GridBagConstraints();
	this.gridBagConstraintsTipoRiesgoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRiesgoCliente.gridy = 0;
	this.gridBagConstraintsTipoRiesgoCliente.gridx = 0;
	this.gridBagConstraintsTipoRiesgoCliente.ipadx = 0;
	this.gridBagConstraintsTipoRiesgoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoRiesgoCliente.add(jLabelnombreTipoRiesgoCliente, this.gridBagConstraintsTipoRiesgoCliente);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoRiesgoCliente = new GridBagConstraints();
		//this.gridBagConstraintsTipoRiesgoCliente.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRiesgoCliente.gridy = 0;
		this.gridBagConstraintsTipoRiesgoCliente.gridx = 2;
		this.gridBagConstraintsTipoRiesgoCliente.ipadx = 0;
		this.gridBagConstraintsTipoRiesgoCliente.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoRiesgoCliente.add(jButtonnombreTipoRiesgoClienteBusqueda, this.gridBagConstraintsTipoRiesgoCliente);
	}

	this.gridBagConstraintsTipoRiesgoCliente = new GridBagConstraints();
	this.gridBagConstraintsTipoRiesgoCliente.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRiesgoCliente.gridy = 0;
	this.gridBagConstraintsTipoRiesgoCliente.gridx = 1;
	this.gridBagConstraintsTipoRiesgoCliente.ipadx = 0;
	this.gridBagConstraintsTipoRiesgoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoRiesgoCliente.add(jscrollPanenombreTipoRiesgoCliente, this.gridBagConstraintsTipoRiesgoCliente);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoRiesgoCliente = new GridBagConstraints();
	this.gridBagConstraintsTipoRiesgoCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoRiesgoCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoRiesgoCliente.gridy = iYPanelCamposTipoRiesgoCliente;
	this.gridBagConstraintsTipoRiesgoCliente.gridx = iXPanelCamposTipoRiesgoCliente++;
	this.gridBagConstraintsTipoRiesgoCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoRiesgoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoRiesgoCliente.add(this.jPanelidTipoRiesgoCliente, this.gridBagConstraintsTipoRiesgoCliente);



	if(iXPanelCamposTipoRiesgoCliente % 1==0) {
		iXPanelCamposTipoRiesgoCliente=0;
		iYPanelCamposTipoRiesgoCliente++;
	}
	this.gridBagConstraintsTipoRiesgoCliente = new GridBagConstraints();
	this.gridBagConstraintsTipoRiesgoCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoRiesgoCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoRiesgoCliente.gridy = iYPanelCamposTipoRiesgoCliente;
	this.gridBagConstraintsTipoRiesgoCliente.gridx = iXPanelCamposTipoRiesgoCliente++;
	this.gridBagConstraintsTipoRiesgoCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoRiesgoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoRiesgoCliente.add(this.jPanelnombreTipoRiesgoCliente, this.gridBagConstraintsTipoRiesgoCliente);



	if(iXPanelCamposTipoRiesgoCliente % 1==0) {
		iXPanelCamposTipoRiesgoCliente=0;
		iYPanelCamposTipoRiesgoCliente++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTipoRiesgoCliente = new GridBagConstraints();
	this.gridBagConstraintsTipoRiesgoCliente.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoRiesgoCliente.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoRiesgoCliente.gridy = iYPanelCamposOcultosTipoRiesgoCliente;
	this.gridBagConstraintsTipoRiesgoCliente.gridx = iXPanelCamposOcultosTipoRiesgoCliente++;
	this.gridBagConstraintsTipoRiesgoCliente.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoRiesgoCliente.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTipoRiesgoCliente.add(this.jPanelid_empresaTipoRiesgoCliente, this.gridBagConstraintsTipoRiesgoCliente);



	if(iXPanelCamposOcultosTipoRiesgoCliente % 1==0) {
		iXPanelCamposOcultosTipoRiesgoCliente=0;
		iYPanelCamposOcultosTipoRiesgoCliente++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoRiesgoCliente= new GridBagLayout();
		this.jPanelAccionesTipoRiesgoCliente.setLayout(gridaBagLayoutAccionesTipoRiesgoCliente);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoRiesgoCliente= new GridBagLayout();
		this.jPanelAccionesFormularioTipoRiesgoCliente.setLayout(gridaBagLayoutAccionesFormularioTipoRiesgoCliente);
		
		this.gridBagConstraintsTipoRiesgoCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoRiesgoCliente.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoRiesgoCliente.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoRiesgoCliente.add(this.jComboBoxTiposAccionesFormularioTipoRiesgoCliente, this.gridBagConstraintsTipoRiesgoCliente);

		this.gridBagConstraintsTipoRiesgoCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoRiesgoCliente.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoRiesgoCliente.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoRiesgoCliente.add(this.jCheckBoxPostAccionNuevoTipoRiesgoCliente, this.gridBagConstraintsTipoRiesgoCliente);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tiporiesgoclienteSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoRiesgoCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoRiesgoCliente.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoRiesgoCliente.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoRiesgoCliente.add(this.jCheckBoxPostAccionSinCerrarTipoRiesgoCliente, this.gridBagConstraintsTipoRiesgoCliente);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tiporiesgoclienteSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tiporiesgoclienteSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoRiesgoCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoRiesgoCliente.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoRiesgoCliente.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoRiesgoCliente.add(this.jCheckBoxPostAccionSinMensajeTipoRiesgoCliente, this.gridBagConstraintsTipoRiesgoCliente);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoRiesgoCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoRiesgoCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRiesgoCliente.gridy = 0;
		this.gridBagConstraintsTipoRiesgoCliente.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoRiesgoCliente.add(this.jButtonModificarTipoRiesgoCliente, this.gridBagConstraintsTipoRiesgoCliente);							

		this.gridBagConstraintsTipoRiesgoCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoRiesgoCliente.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRiesgoCliente.gridy = 0;
		this.gridBagConstraintsTipoRiesgoCliente.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoRiesgoCliente.add(this.jButtonEliminarTipoRiesgoCliente, this.gridBagConstraintsTipoRiesgoCliente);
		
			
		this.gridBagConstraintsTipoRiesgoCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoRiesgoCliente.gridy = 0;		
		this.gridBagConstraintsTipoRiesgoCliente.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoRiesgoCliente.add(this.jButtonActualizarTipoRiesgoCliente, this.gridBagConstraintsTipoRiesgoCliente);


		this.gridBagConstraintsTipoRiesgoCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoRiesgoCliente.gridy = 0;		
		this.gridBagConstraintsTipoRiesgoCliente.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoRiesgoCliente.add(this.jButtonGuardarCambiosTipoRiesgoCliente, this.gridBagConstraintsTipoRiesgoCliente);	
		
		this.gridBagConstraintsTipoRiesgoCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoRiesgoCliente.gridy = 0;		
		this.gridBagConstraintsTipoRiesgoCliente.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoRiesgoCliente.add(this.jButtonCancelarTipoRiesgoCliente, this.gridBagConstraintsTipoRiesgoCliente);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoRiesgoCliente = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoRiesgoCliente);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tiporiesgoclienteSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoRiesgoCliente = new GridBagConstraints();						
			this.gridBagConstraintsTipoRiesgoCliente.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoRiesgoCliente.gridx = 0;		
			//this.gridBagConstraintsTipoRiesgoCliente.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRiesgoCliente.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoRiesgoCliente.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoRiesgoCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoRiesgoCliente.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoRiesgoCliente.gridx =0;
		this.gridBagConstraintsTipoRiesgoCliente.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoRiesgoCliente.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoRiesgoCliente, this.gridBagConstraintsTipoRiesgoCliente);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoRiesgoClienteJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoRiesgoCliente = new TipoRiesgoClienteBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Riesgo Cliente DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Riesgo Cliente DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Riesgo Cliente Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoRiesgoClienteModel tiporiesgoclienteModel=new TipoRiesgoClienteModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoRiesgoClienteModel.TipoRiesgoClienteFocusTraversalPolicy tiporiesgoclienteFocusTraversalPolicy = tiporiesgoclienteModel.new TipoRiesgoClienteFocusTraversalPolicy(this);
			
			//tiporiesgoclienteFocusTraversalPolicy.settiporiesgoclienteJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tiporiesgoclienteModel);
			
			
			this.jContentPaneDetalleTipoRiesgoCliente = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoRiesgoCliente = new GridBagLayout();	
			this.jContentPaneDetalleTipoRiesgoCliente.setLayout(gridaBagLayoutDetalleTipoRiesgoCliente);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoRiesgoCliente = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoRiesgoCliente = new GridBagConstraints();
				this.gridBagConstraintsTipoRiesgoCliente.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoRiesgoCliente.gridx = 0;
					
				
				this.jContentPaneDetalleTipoRiesgoCliente.add(jTtoolBarDetalleTipoRiesgoCliente, gridBagConstraintsTipoRiesgoCliente);								
				
}
			
			this.jScrollPanelDatosEdicionTipoRiesgoCliente=   new JScrollPane(jContentPaneDetalleTipoRiesgoCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoRiesgoCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoRiesgoCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoRiesgoCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoRiesgoCliente=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoRiesgoCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoRiesgoCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoRiesgoCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoRiesgoCliente = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoRiesgoCliente.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoRiesgoCliente.gridx = 0;
	        
			this.jContentPaneDetalleTipoRiesgoCliente.add(jPanelCamposTipoRiesgoCliente, gridBagConstraintsTipoRiesgoCliente);
			
			
			
			
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
						&& tiporiesgoclienteSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.tiporiesgoclienteSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoRiesgoCliente= new GridBagConstraints();
						this.gridBagConstraintsTipoRiesgoCliente.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoRiesgoCliente.gridx = 0;
						this.jContentPaneDetalleTipoRiesgoCliente.add(this.jTabbedPaneRelacionesTipoRiesgoCliente, this.gridBagConstraintsTipoRiesgoCliente);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoRiesgoCliente.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoRiesgoCliente.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoRiesgoCliente = new GridBagConstraints();
					this.gridBagConstraintsTipoRiesgoCliente.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoRiesgoCliente.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoRiesgoCliente.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoRiesgoCliente.gridx = 0;
					
				
					this.jContentPaneDetalleTipoRiesgoCliente.add(jPanelCamposOcultosTipoRiesgoCliente, gridBagConstraintsTipoRiesgoCliente);
				
					this.jPanelCamposOcultosTipoRiesgoCliente.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoRiesgoCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoRiesgoCliente.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTipoRiesgoCliente.gridx = 0;
	        this.gridBagConstraintsTipoRiesgoCliente.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoRiesgoCliente.add(this.jPanelAccionesFormularioTipoRiesgoCliente, this.gridBagConstraintsTipoRiesgoCliente);							
			
			
			
			this.gridBagConstraintsTipoRiesgoCliente = new GridBagConstraints();
	        this.gridBagConstraintsTipoRiesgoCliente.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTipoRiesgoCliente.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoRiesgoCliente.add(this.jPanelAccionesTipoRiesgoCliente, this.gridBagConstraintsTipoRiesgoCliente);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoRiesgoCliente);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoRiesgoCliente=   new JScrollPane(this.jPanelCamposTipoRiesgoCliente,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoRiesgoCliente.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoRiesgoCliente.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoRiesgoCliente.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoRiesgoCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoRiesgoCliente.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoRiesgoCliente.gridx = 0;
			this.gridBagConstraintsTipoRiesgoCliente.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoRiesgoCliente.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoRiesgoCliente.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoRiesgoCliente, this.gridBagConstraintsTipoRiesgoCliente);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoRiesgoCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoRiesgoCliente.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoRiesgoCliente.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoRiesgoCliente, this.gridBagConstraintsTipoRiesgoCliente);			
			
			this.gridBagConstraintsTipoRiesgoCliente = new GridBagConstraints();
			this.gridBagConstraintsTipoRiesgoCliente.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoRiesgoCliente.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoRiesgoCliente, this.gridBagConstraintsTipoRiesgoCliente);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoRiesgoCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoRiesgoCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoRiesgoCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoRiesgoCliente, this.gridBagConstraintsTipoRiesgoCliente);
			
			
		this.gridBagConstraintsTipoRiesgoCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoRiesgoCliente.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoRiesgoCliente.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoRiesgoCliente, this.gridBagConstraintsTipoRiesgoCliente);
		
			
		this.gridBagConstraintsTipoRiesgoCliente = new GridBagConstraints();
		this.gridBagConstraintsTipoRiesgoCliente.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoRiesgoCliente.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoRiesgoCliente, this.gridBagConstraintsTipoRiesgoCliente);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoRiesgoCliente;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoRiesgoCliente;
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
