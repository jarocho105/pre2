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
import com.bydan.erp.facturacion.util.TipoParamFactuPlazoConstantesFunciones;

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
public class TipoParamFactuPlazoDetalleFormJInternalFrame extends TipoParamFactuPlazoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoParamFactuPlazo;
	
	protected JMenuBar jmenuBarDetalleTipoParamFactuPlazo;
	
	protected JMenu jmenuDetalleTipoParamFactuPlazo;
	protected JMenu jmenuDetalleArchivoTipoParamFactuPlazo;
	protected JMenu jmenuDetalleAccionesTipoParamFactuPlazo;
	protected JMenu jmenuDetalleDatosTipoParamFactuPlazo;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoParamFactuPlazo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoParamFactuPlazo;	
	protected GridBagConstraints gridBagConstraintsTipoParamFactuPlazo;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoParamFactuPlazoBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoParamFactuPlazo;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoParamFactuPlazoSessionBean tipoparamfactuplazoSessionBean;
	
	
	
		
	
	public TipoParamFactuPlazoLogic tipoparamfactuplazoLogic;
	
	public JScrollPane jScrollPanelDatosTipoParamFactuPlazo;
	public JScrollPane jScrollPanelDatosEdicionTipoParamFactuPlazo;
	public JScrollPane jScrollPanelDatosGeneralTipoParamFactuPlazo;
	
	protected JPanel jPanelCamposTipoParamFactuPlazo;    
	protected JPanel jPanelCamposOcultosTipoParamFactuPlazo;    	
	protected JPanel jPanelAccionesTipoParamFactuPlazo;
	protected JPanel jPanelAccionesFormularioTipoParamFactuPlazo;
    
	
	
	protected Integer iXPanelCamposTipoParamFactuPlazo=0;
	protected Integer iYPanelCamposTipoParamFactuPlazo=0;
	
	protected Integer iXPanelCamposOcultosTipoParamFactuPlazo=0;
	protected Integer iYPanelCamposOcultosTipoParamFactuPlazo=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoParamFactuPlazo;
	public JButton jButtonModificarTipoParamFactuPlazo;
	public JButton jButtonActualizarTipoParamFactuPlazo;
    public JButton jButtonEliminarTipoParamFactuPlazo;
	public JButton jButtonCancelarTipoParamFactuPlazo;
    public JButton jButtonGuardarCambiosTipoParamFactuPlazo;
	public JButton jButtonGuardarCambiosTablaTipoParamFactuPlazo;
	protected JButton jButtonCerrarTipoParamFactuPlazo;
	
	
	protected JButton jButtonProcesarInformacionTipoParamFactuPlazo;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoParamFactuPlazo;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoParamFactuPlazo;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoParamFactuPlazo;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoParamFactuPlazo;
	protected JButton jButtonModificarToolBarTipoParamFactuPlazo;
	protected JButton jButtonActualizarToolBarTipoParamFactuPlazo;
    protected JButton jButtonEliminarToolBarTipoParamFactuPlazo;
	protected JButton jButtonCancelarToolBarTipoParamFactuPlazo;
    protected JButton jButtonGuardarCambiosToolBarTipoParamFactuPlazo;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoParamFactuPlazo;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoParamFactuPlazo;
	protected JButton jButtonCerrarToolBarTipoParamFactuPlazo;
	
	protected JButton jButtonProcesarInformacionToolBarTipoParamFactuPlazo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoParamFactuPlazo;
	protected JMenuItem jMenuItemModificarTipoParamFactuPlazo;
	protected JMenuItem jMenuItemActualizarTipoParamFactuPlazo;
    protected JMenuItem jMenuItemEliminarTipoParamFactuPlazo;
	protected JMenuItem jMenuItemCancelarTipoParamFactuPlazo;
    protected JMenuItem jMenuItemGuardarCambiosTipoParamFactuPlazo;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoParamFactuPlazo;
	protected JMenuItem jMenuItemCerrarTipoParamFactuPlazo;
	protected JMenuItem jMenuItemDetalleCerrarTipoParamFactuPlazo;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoParamFactuPlazo;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoParamFactuPlazo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoParamFactuPlazo;
	protected JMenuItem jMenuItemMostrarOcultarTipoParamFactuPlazo;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoParamFactuPlazo;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoParamFactuPlazo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoParamFactuPlazo;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoParamFactuPlazo;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoParamFactuPlazo;
	public JLabel jLabelIdTipoParamFactuPlazo;
	public JTextFieldMe jTextFieldidTipoParamFactuPlazo;
	public JButton jButtonidTipoParamFactuPlazoBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoParamFactuPlazo;
	public JLabel jLabelnombreTipoParamFactuPlazo;
	public JTextArea jTextAreanombreTipoParamFactuPlazo;
	public JScrollPane jscrollPanenombreTipoParamFactuPlazo;
	public JButton jButtonnombreTipoParamFactuPlazoBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoParamFactuPlazo;
	
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
	
	public TipoParamFactuPlazoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoParamFactuPlazo=new JPanel();
				this.jPanelAccionesFormularioTipoParamFactuPlazo=new JPanel();
				this.jmenuBarDetalleTipoParamFactuPlazo=new JMenuBar();
				this.jTtoolBarDetalleTipoParamFactuPlazo=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoParamFactuPlazoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoParamFactuPlazo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoParamFactuPlazoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoParamFactuPlazo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoParamFactuPlazoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoParamFactuPlazo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoParamFactuPlazoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoParamFactuPlazo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoParamFactuPlazoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoParamFactuPlazo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoParamFactuPlazo() {
		return this.jButtonActualizarToolBarTipoParamFactuPlazo;
	}
	
	public JButton getjButtonEliminarToolBarTipoParamFactuPlazo() {
		return this.jButtonEliminarToolBarTipoParamFactuPlazo;
	}
	
	public JButton getjButtonCancelarToolBarTipoParamFactuPlazo() {
		return this.jButtonCancelarToolBarTipoParamFactuPlazo;
	}		
	
	public JButton getjButtonProcesarInformacionTipoParamFactuPlazo() {
		return this.jButtonProcesarInformacionTipoParamFactuPlazo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoParamFactuPlazo)	{
		this.jButtonProcesarInformacionTipoParamFactuPlazo = jButtonProcesarInformacionTipoParamFactuPlazo;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoParamFactuPlazo() {
		return this.jComboBoxTiposAccionesTipoParamFactuPlazo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoParamFactuPlazo(
			JComboBox jComboBoxTiposRelacionesTipoParamFactuPlazo) {
		this.jComboBoxTiposRelacionesTipoParamFactuPlazo = jComboBoxTiposRelacionesTipoParamFactuPlazo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoParamFactuPlazo(
			JComboBox jComboBoxTiposAccionesTipoParamFactuPlazo) {
		this.jComboBoxTiposAccionesTipoParamFactuPlazo = jComboBoxTiposAccionesTipoParamFactuPlazo;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoParamFactuPlazo() {
		return this.jComboBoxTiposAccionesFormularioTipoParamFactuPlazo;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoParamFactuPlazo(
			JComboBox jComboBoxTiposAccionesFormularioTipoParamFactuPlazo) {
		this.jComboBoxTiposAccionesFormularioTipoParamFactuPlazo = jComboBoxTiposAccionesFormularioTipoParamFactuPlazo;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipoparamfactuplazoSessionBean=new TipoParamFactuPlazoSessionBean();
		
		this.tipoparamfactuplazoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoparamfactuplazoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoparamfactuplazoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoParamFactuPlazoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoParamFactuPlazoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoParamFactuPlazoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Plazo MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipoparamfactuplazoSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoParamFactuPlazoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoParamFactuPlazo= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoParamFactuPlazo=new JButtonMe();
				this.jButtonModificarToolBarTipoParamFactuPlazo=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoParamFactuPlazo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoParamFactuPlazo,this.jTtoolBarDetalleTipoParamFactuPlazo,
							"actualizar","actualizar","Actualizar"+" "+TipoParamFactuPlazoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoParamFactuPlazo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoParamFactuPlazo,this.jTtoolBarDetalleTipoParamFactuPlazo,
							"eliminar","eliminar","Eliminar"+" "+TipoParamFactuPlazoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoParamFactuPlazo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoParamFactuPlazo,this.jTtoolBarDetalleTipoParamFactuPlazo,
							"cancelar","cancelar","Cancelar"+" "+TipoParamFactuPlazoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoParamFactuPlazo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoParamFactuPlazo,this.jTtoolBarDetalleTipoParamFactuPlazo,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoParamFactuPlazoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoParamFactuPlazo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoParamFactuPlazo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoParamFactuPlazo,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoParamFactuPlazo=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoParamFactuPlazo=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoParamFactuPlazo=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoParamFactuPlazo=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoParamFactuPlazo=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoParamFactuPlazo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoParamFactuPlazo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoParamFactuPlazo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoParamFactuPlazo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoParamFactuPlazo= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoParamFactuPlazo.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoParamFactuPlazo,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoParamFactuPlazo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoParamFactuPlazo= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoParamFactuPlazo.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoParamFactuPlazo,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoParamFactuPlazo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoParamFactuPlazo= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoParamFactuPlazo.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoParamFactuPlazo,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoParamFactuPlazo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoParamFactuPlazo= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoParamFactuPlazo.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoParamFactuPlazo,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoParamFactuPlazo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoParamFactuPlazo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoParamFactuPlazo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoParamFactuPlazo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoParamFactuPlazo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoParamFactuPlazo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoParamFactuPlazo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoParamFactuPlazo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoParamFactuPlazo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoParamFactuPlazo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoParamFactuPlazo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoParamFactuPlazo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoParamFactuPlazo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoParamFactuPlazo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoParamFactuPlazo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoParamFactuPlazo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoParamFactuPlazo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoParamFactuPlazo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoParamFactuPlazo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoParamFactuPlazo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoParamFactuPlazo, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoParamFactuPlazo.add(this.jMenuItemDetalleCerrarTipoParamFactuPlazo);
		
		this.jmenuDetalleAccionesTipoParamFactuPlazo.add(this.jMenuItemActualizarTipoParamFactuPlazo);
		this.jmenuDetalleAccionesTipoParamFactuPlazo.add(this.jMenuItemEliminarTipoParamFactuPlazo);
		this.jmenuDetalleAccionesTipoParamFactuPlazo.add(this.jMenuItemCancelarTipoParamFactuPlazo);		
		
		//this.jmenuDetalleDatosTipoParamFactuPlazo.add(this.jMenuItemDetalleAbrirOrderByTipoParamFactuPlazo);				
		this.jmenuDetalleDatosTipoParamFactuPlazo.add(this.jMenuItemDetalleMostarOcultarTipoParamFactuPlazo);				
				
		//this.jmenuDetalleAccionesTipoParamFactuPlazo.add(this.jMenuItemGuardarCambiosTipoParamFactuPlazo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoParamFactuPlazo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoParamFactuPlazo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoParamFactuPlazo, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoParamFactuPlazo.add(this.jmenuDetalleArchivoTipoParamFactuPlazo);		
		this.jmenuBarDetalleTipoParamFactuPlazo.add(this.jmenuDetalleAccionesTipoParamFactuPlazo);		
		this.jmenuBarDetalleTipoParamFactuPlazo.add(this.jmenuDetalleDatosTipoParamFactuPlazo);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoParamFactuPlazo);				
	}
	
	
	public void inicializarElementosCamposTipoParamFactuPlazo() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoParamFactuPlazo = new JLabelMe();
		jLabelIdTipoParamFactuPlazo.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoParamFactuPlazo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoParamFactuPlazo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoParamFactuPlazo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoParamFactuPlazo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoParamFactuPlazo = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoParamFactuPlazo.setToolTipText(TipoParamFactuPlazoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoParamFactuPlazo= new GridBagLayout();

		this.jPanelidTipoParamFactuPlazo.setLayout(this.gridaBagLayoutTipoParamFactuPlazo);

		jTextFieldidTipoParamFactuPlazo = new JTextFieldMe();
		jTextFieldidTipoParamFactuPlazo.setText("Id");

		jTextFieldidTipoParamFactuPlazo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoParamFactuPlazo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoParamFactuPlazo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreTipoParamFactuPlazo = new JLabelMe();
		this.jLabelnombreTipoParamFactuPlazo.setText(""+TipoParamFactuPlazoConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoParamFactuPlazo.setToolTipText("Nombre");
		this.jLabelnombreTipoParamFactuPlazo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoParamFactuPlazo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoParamFactuPlazo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoParamFactuPlazo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoParamFactuPlazo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoParamFactuPlazo.setToolTipText(TipoParamFactuPlazoConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoParamFactuPlazo = new GridBagLayout();
		this.jPanelnombreTipoParamFactuPlazo.setLayout(this.gridaBagLayoutTipoParamFactuPlazo);


		jTextAreanombreTipoParamFactuPlazo= new JTextAreaMe();
		jTextAreanombreTipoParamFactuPlazo.setEnabled(false);
		jTextAreanombreTipoParamFactuPlazo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoParamFactuPlazo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoParamFactuPlazo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoParamFactuPlazo.setLineWrap(true);
		jTextAreanombreTipoParamFactuPlazo.setWrapStyleWord(true);
		jTextAreanombreTipoParamFactuPlazo.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoParamFactuPlazo.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoParamFactuPlazo,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoParamFactuPlazo = new JScrollPane(jTextAreanombreTipoParamFactuPlazo);
		jscrollPanenombreTipoParamFactuPlazo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoParamFactuPlazo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoParamFactuPlazo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoParamFactuPlazoBusqueda= new JButtonMe();
		this.jButtonnombreTipoParamFactuPlazoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoParamFactuPlazoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoParamFactuPlazoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoParamFactuPlazoBusqueda.setText("U");
		this.jButtonnombreTipoParamFactuPlazoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoParamFactuPlazoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoParamFactuPlazoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoParamFactuPlazo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoParamFactuPlazo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoParamFactuPlazoBusqueda"));

		if(this.tipoparamfactuplazoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoParamFactuPlazoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoParamFactuPlazo() {
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
		//this.jInternalFrameDetalleTipoParamFactuPlazo = new TipoParamFactuPlazoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Plazo DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoParamFactuPlazo= new GridBagLayout();
		

		
		String sToolTipTipoParamFactuPlazo="";
		sToolTipTipoParamFactuPlazo=TipoParamFactuPlazoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoParamFactuPlazo+="(Facturacion.TipoParamFactuPlazo)";
		}
		
		if(!this.tipoparamfactuplazoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoParamFactuPlazo+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoParamFactuPlazo = new JButtonMe();
		this.jButtonModificarTipoParamFactuPlazo = new JButtonMe();
        this.jButtonActualizarTipoParamFactuPlazo = new JButtonMe();
        this.jButtonEliminarTipoParamFactuPlazo = new JButtonMe();
        this.jButtonCancelarTipoParamFactuPlazo = new JButtonMe();
        this.jButtonGuardarCambiosTipoParamFactuPlazo = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoParamFactuPlazo = new JButtonMe();
		this.jButtonCerrarTipoParamFactuPlazo = new JButtonMe();
		
		this.jScrollPanelDatosTipoParamFactuPlazo = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoParamFactuPlazo = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoParamFactuPlazo = new JScrollPane();
				
		
		
		this.jPanelCamposTipoParamFactuPlazo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoParamFactuPlazo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoParamFactuPlazo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoParamFactuPlazo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Plazo";
		
		if(!this.tipoparamfactuplazoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoParamFactuPlazo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Plazos" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoParamFactuPlazo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoParamFactuPlazo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoParamFactuPlazo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoParamFactuPlazo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoParamFactuPlazo.setName("jPanelCamposTipoParamFactuPlazo"); 

		this.jPanelCamposOcultosTipoParamFactuPlazo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoParamFactuPlazo.setName("jPanelCamposOcultosTipoParamFactuPlazo"); 

        this.jPanelAccionesTipoParamFactuPlazo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoParamFactuPlazo.setToolTipText("Acciones");
        this.jPanelAccionesTipoParamFactuPlazo.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoParamFactuPlazo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoParamFactuPlazo.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoParamFactuPlazo.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoParamFactuPlazo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoParamFactuPlazo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoParamFactuPlazo, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoParamFactuPlazo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoParamFactuPlazo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoParamFactuPlazo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoParamFactuPlazo.setText("Nuevo");
		this.jButtonModificarTipoParamFactuPlazo.setText("Editar");
        this.jButtonActualizarTipoParamFactuPlazo.setText("Actualizar");
        this.jButtonEliminarTipoParamFactuPlazo.setText("Eliminar");
        this.jButtonCancelarTipoParamFactuPlazo.setText("Cancelar");
        this.jButtonGuardarCambiosTipoParamFactuPlazo.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoParamFactuPlazo.setText("Guardar");
		this.jButtonCerrarTipoParamFactuPlazo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoParamFactuPlazo,"nuevo_button","Nuevo",this.tipoparamfactuplazoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoParamFactuPlazo,"modificar_button","Editar",this.tipoparamfactuplazoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoParamFactuPlazo,"actualizar_button","Actualizar",this.tipoparamfactuplazoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoParamFactuPlazo,"eliminar_button","Eliminar",this.tipoparamfactuplazoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoParamFactuPlazo,"cancelar_button","Cancelar",this.tipoparamfactuplazoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoParamFactuPlazo,"guardarcambios_button","Guardar",this.tipoparamfactuplazoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoParamFactuPlazo,"guardarcambiostabla_button","Guardar",this.tipoparamfactuplazoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoParamFactuPlazo,"cerrar_button","Salir",this.tipoparamfactuplazoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoParamFactuPlazo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoParamFactuPlazo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoParamFactuPlazo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoParamFactuPlazo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoParamFactuPlazo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoParamFactuPlazo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoParamFactuPlazo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoParamFactuPlazo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoParamFactuPlazo.setToolTipText("Nuevo"+" "+TipoParamFactuPlazoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoParamFactuPlazo.setToolTipText("Editar"+" "+TipoParamFactuPlazoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoParamFactuPlazo.setToolTipText("Actualizar"+" "+TipoParamFactuPlazoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoParamFactuPlazo.setToolTipText("Eliminar)"+" "+TipoParamFactuPlazoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoParamFactuPlazo.setToolTipText("Cancelar"+" "+TipoParamFactuPlazoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoParamFactuPlazo.setToolTipText("Guardar"+" "+TipoParamFactuPlazoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoParamFactuPlazo.setToolTipText("Guardar"+" "+TipoParamFactuPlazoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoParamFactuPlazo.setToolTipText("Salir"+" "+TipoParamFactuPlazoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoParamFactuPlazo";
		inputMap = this.jButtonNuevoTipoParamFactuPlazo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoParamFactuPlazo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoParamFactuPlazo"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoParamFactuPlazo";
		inputMap = this.jButtonActualizarTipoParamFactuPlazo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoParamFactuPlazo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoParamFactuPlazo"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoParamFactuPlazo";
		inputMap = this.jButtonEliminarTipoParamFactuPlazo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoParamFactuPlazo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoParamFactuPlazo"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoParamFactuPlazo";
		inputMap = this.jButtonCancelarTipoParamFactuPlazo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoParamFactuPlazo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoParamFactuPlazo"));
		
		//CERRAR		
		sMapKey = "CerrarTipoParamFactuPlazo";
		inputMap = this.jButtonCerrarTipoParamFactuPlazo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoParamFactuPlazo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoParamFactuPlazo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoParamFactuPlazo";
		inputMap = this.jButtonGuardarCambiosTablaTipoParamFactuPlazo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoParamFactuPlazo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoParamFactuPlazo"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoParamFactuPlazo = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoParamFactuPlazo.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoParamFactuPlazo.setToolTipText("Nuevo TipoParamFactuPlazo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoParamFactuPlazo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoParamFactuPlazo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoParamFactuPlazo.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoParamFactuPlazo.setToolTipText("Sin Cerrar Ventana TipoParamFactuPlazo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoParamFactuPlazo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoParamFactuPlazo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoParamFactuPlazo.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoParamFactuPlazo.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoParamFactuPlazo, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoParamFactuPlazo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoParamFactuPlazo.setText("Accion");
		this.jComboBoxTiposAccionesTipoParamFactuPlazo.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoParamFactuPlazo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoParamFactuPlazo.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoParamFactuPlazo.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoParamFactuPlazo = new JLabelMe();
		
		this.jLabelAccionesTipoParamFactuPlazo.setText("Acciones");		
		this.jLabelAccionesTipoParamFactuPlazo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoParamFactuPlazo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoParamFactuPlazo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoParamFactuPlazo();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoParamFactuPlazo();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoParamFactuPlazo=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoParamFactuPlazo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoParamFactuPlazo,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoParamFactuPlazo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoParamFactuPlazo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoParamFactuPlazo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoParamFactuPlazo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoParamFactuPlazo.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoParamFactuPlazo.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoParamFactuPlazo.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoParamFactuPlazo, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoParamFactuPlazo = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoParamFactuPlazo = new GridBagLayout();
		
		this.jPanelCamposTipoParamFactuPlazo.setLayout(gridaBagLayoutCamposTipoParamFactuPlazo);
		this.jPanelCamposOcultosTipoParamFactuPlazo.setLayout(gridaBagLayoutCamposOcultosTipoParamFactuPlazo);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoParamFactuPlazo = new GridBagConstraints();
	this.gridBagConstraintsTipoParamFactuPlazo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoParamFactuPlazo.gridy = 0;
	this.gridBagConstraintsTipoParamFactuPlazo.gridx = 0;
	this.gridBagConstraintsTipoParamFactuPlazo.ipadx = 0;
	this.gridBagConstraintsTipoParamFactuPlazo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoParamFactuPlazo.add(jLabelIdTipoParamFactuPlazo, this.gridBagConstraintsTipoParamFactuPlazo);



	this.gridBagConstraintsTipoParamFactuPlazo = new GridBagConstraints();
	this.gridBagConstraintsTipoParamFactuPlazo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoParamFactuPlazo.gridy = 0;
	this.gridBagConstraintsTipoParamFactuPlazo.gridx = 1;
	this.gridBagConstraintsTipoParamFactuPlazo.ipadx = 0;
	this.gridBagConstraintsTipoParamFactuPlazo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoParamFactuPlazo.add(jTextFieldidTipoParamFactuPlazo, this.gridBagConstraintsTipoParamFactuPlazo);


	this.gridBagConstraintsTipoParamFactuPlazo = new GridBagConstraints();
	this.gridBagConstraintsTipoParamFactuPlazo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoParamFactuPlazo.gridy = 0;
	this.gridBagConstraintsTipoParamFactuPlazo.gridx = 0;
	this.gridBagConstraintsTipoParamFactuPlazo.ipadx = 0;
	this.gridBagConstraintsTipoParamFactuPlazo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoParamFactuPlazo.add(jLabelnombreTipoParamFactuPlazo, this.gridBagConstraintsTipoParamFactuPlazo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoParamFactuPlazo = new GridBagConstraints();
		//this.gridBagConstraintsTipoParamFactuPlazo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoParamFactuPlazo.gridy = 0;
		this.gridBagConstraintsTipoParamFactuPlazo.gridx = 2;
		this.gridBagConstraintsTipoParamFactuPlazo.ipadx = 0;
		this.gridBagConstraintsTipoParamFactuPlazo.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoParamFactuPlazo.add(jButtonnombreTipoParamFactuPlazoBusqueda, this.gridBagConstraintsTipoParamFactuPlazo);
	}

	this.gridBagConstraintsTipoParamFactuPlazo = new GridBagConstraints();
	this.gridBagConstraintsTipoParamFactuPlazo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoParamFactuPlazo.gridy = 0;
	this.gridBagConstraintsTipoParamFactuPlazo.gridx = 1;
	this.gridBagConstraintsTipoParamFactuPlazo.ipadx = 0;
	this.gridBagConstraintsTipoParamFactuPlazo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoParamFactuPlazo.add(jscrollPanenombreTipoParamFactuPlazo, this.gridBagConstraintsTipoParamFactuPlazo);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoParamFactuPlazo = new GridBagConstraints();
	this.gridBagConstraintsTipoParamFactuPlazo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoParamFactuPlazo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoParamFactuPlazo.gridy = iYPanelCamposTipoParamFactuPlazo;
	this.gridBagConstraintsTipoParamFactuPlazo.gridx = iXPanelCamposTipoParamFactuPlazo++;
	this.gridBagConstraintsTipoParamFactuPlazo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoParamFactuPlazo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoParamFactuPlazo.add(this.jPanelidTipoParamFactuPlazo, this.gridBagConstraintsTipoParamFactuPlazo);



	if(iXPanelCamposTipoParamFactuPlazo % 1==0) {
		iXPanelCamposTipoParamFactuPlazo=0;
		iYPanelCamposTipoParamFactuPlazo++;
	}
	this.gridBagConstraintsTipoParamFactuPlazo = new GridBagConstraints();
	this.gridBagConstraintsTipoParamFactuPlazo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoParamFactuPlazo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoParamFactuPlazo.gridy = iYPanelCamposTipoParamFactuPlazo;
	this.gridBagConstraintsTipoParamFactuPlazo.gridx = iXPanelCamposTipoParamFactuPlazo++;
	this.gridBagConstraintsTipoParamFactuPlazo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoParamFactuPlazo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoParamFactuPlazo.add(this.jPanelnombreTipoParamFactuPlazo, this.gridBagConstraintsTipoParamFactuPlazo);



	if(iXPanelCamposTipoParamFactuPlazo % 1==0) {
		iXPanelCamposTipoParamFactuPlazo=0;
		iYPanelCamposTipoParamFactuPlazo++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoParamFactuPlazo= new GridBagLayout();
		this.jPanelAccionesTipoParamFactuPlazo.setLayout(gridaBagLayoutAccionesTipoParamFactuPlazo);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoParamFactuPlazo= new GridBagLayout();
		this.jPanelAccionesFormularioTipoParamFactuPlazo.setLayout(gridaBagLayoutAccionesFormularioTipoParamFactuPlazo);
		
		this.gridBagConstraintsTipoParamFactuPlazo = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuPlazo.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoParamFactuPlazo.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoParamFactuPlazo.add(this.jComboBoxTiposAccionesFormularioTipoParamFactuPlazo, this.gridBagConstraintsTipoParamFactuPlazo);

		this.gridBagConstraintsTipoParamFactuPlazo = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuPlazo.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoParamFactuPlazo.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoParamFactuPlazo.add(this.jCheckBoxPostAccionNuevoTipoParamFactuPlazo, this.gridBagConstraintsTipoParamFactuPlazo);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipoparamfactuplazoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoParamFactuPlazo = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuPlazo.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoParamFactuPlazo.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoParamFactuPlazo.add(this.jCheckBoxPostAccionSinCerrarTipoParamFactuPlazo, this.gridBagConstraintsTipoParamFactuPlazo);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipoparamfactuplazoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipoparamfactuplazoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoParamFactuPlazo = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuPlazo.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoParamFactuPlazo.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoParamFactuPlazo.add(this.jCheckBoxPostAccionSinMensajeTipoParamFactuPlazo, this.gridBagConstraintsTipoParamFactuPlazo);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoParamFactuPlazo = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuPlazo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoParamFactuPlazo.gridy = 0;
		this.gridBagConstraintsTipoParamFactuPlazo.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoParamFactuPlazo.add(this.jButtonModificarTipoParamFactuPlazo, this.gridBagConstraintsTipoParamFactuPlazo);							

		this.gridBagConstraintsTipoParamFactuPlazo = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuPlazo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoParamFactuPlazo.gridy = 0;
		this.gridBagConstraintsTipoParamFactuPlazo.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoParamFactuPlazo.add(this.jButtonEliminarTipoParamFactuPlazo, this.gridBagConstraintsTipoParamFactuPlazo);
		
			
		this.gridBagConstraintsTipoParamFactuPlazo = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuPlazo.gridy = 0;		
		this.gridBagConstraintsTipoParamFactuPlazo.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoParamFactuPlazo.add(this.jButtonActualizarTipoParamFactuPlazo, this.gridBagConstraintsTipoParamFactuPlazo);


		this.gridBagConstraintsTipoParamFactuPlazo = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuPlazo.gridy = 0;		
		this.gridBagConstraintsTipoParamFactuPlazo.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoParamFactuPlazo.add(this.jButtonGuardarCambiosTipoParamFactuPlazo, this.gridBagConstraintsTipoParamFactuPlazo);	
		
		this.gridBagConstraintsTipoParamFactuPlazo = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuPlazo.gridy = 0;		
		this.gridBagConstraintsTipoParamFactuPlazo.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoParamFactuPlazo.add(this.jButtonCancelarTipoParamFactuPlazo, this.gridBagConstraintsTipoParamFactuPlazo);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoParamFactuPlazo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoParamFactuPlazo);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoparamfactuplazoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoParamFactuPlazo = new GridBagConstraints();						
			this.gridBagConstraintsTipoParamFactuPlazo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoParamFactuPlazo.gridx = 0;		
			//this.gridBagConstraintsTipoParamFactuPlazo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoParamFactuPlazo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoParamFactuPlazo.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoParamFactuPlazo = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuPlazo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoParamFactuPlazo.gridx =0;
		this.gridBagConstraintsTipoParamFactuPlazo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoParamFactuPlazo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoParamFactuPlazo, this.gridBagConstraintsTipoParamFactuPlazo);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoParamFactuPlazoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoParamFactuPlazo = new TipoParamFactuPlazoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Plazo DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Plazo DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Plazo Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoParamFactuPlazoModel tipoparamfactuplazoModel=new TipoParamFactuPlazoModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoParamFactuPlazoModel.TipoParamFactuPlazoFocusTraversalPolicy tipoparamfactuplazoFocusTraversalPolicy = tipoparamfactuplazoModel.new TipoParamFactuPlazoFocusTraversalPolicy(this);
			
			//tipoparamfactuplazoFocusTraversalPolicy.settipoparamfactuplazoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipoparamfactuplazoModel);
			
			
			this.jContentPaneDetalleTipoParamFactuPlazo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoParamFactuPlazo = new GridBagLayout();	
			this.jContentPaneDetalleTipoParamFactuPlazo.setLayout(gridaBagLayoutDetalleTipoParamFactuPlazo);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoParamFactuPlazo = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoParamFactuPlazo = new GridBagConstraints();
				this.gridBagConstraintsTipoParamFactuPlazo.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoParamFactuPlazo.gridx = 0;
					
				
				this.jContentPaneDetalleTipoParamFactuPlazo.add(jTtoolBarDetalleTipoParamFactuPlazo, gridBagConstraintsTipoParamFactuPlazo);								
				
}
			
			this.jScrollPanelDatosEdicionTipoParamFactuPlazo=   new JScrollPane(jContentPaneDetalleTipoParamFactuPlazo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoParamFactuPlazo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoParamFactuPlazo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoParamFactuPlazo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoParamFactuPlazo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoParamFactuPlazo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoParamFactuPlazo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoParamFactuPlazo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoParamFactuPlazo = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoParamFactuPlazo.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoParamFactuPlazo.gridx = 0;
	        
			this.jContentPaneDetalleTipoParamFactuPlazo.add(jPanelCamposTipoParamFactuPlazo, gridBagConstraintsTipoParamFactuPlazo);
			
			
			
			
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
						&& tipoparamfactuplazoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.tipoparamfactuplazoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoParamFactuPlazo= new GridBagConstraints();
						this.gridBagConstraintsTipoParamFactuPlazo.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoParamFactuPlazo.gridx = 0;
						this.jContentPaneDetalleTipoParamFactuPlazo.add(this.jTabbedPaneRelacionesTipoParamFactuPlazo, this.gridBagConstraintsTipoParamFactuPlazo);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoParamFactuPlazo.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoParamFactuPlazo.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoParamFactuPlazo = new GridBagConstraints();
					this.gridBagConstraintsTipoParamFactuPlazo.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoParamFactuPlazo.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoParamFactuPlazo.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoParamFactuPlazo.gridx = 0;
					
				
					this.jContentPaneDetalleTipoParamFactuPlazo.add(jPanelCamposOcultosTipoParamFactuPlazo, gridBagConstraintsTipoParamFactuPlazo);
				
					this.jPanelCamposOcultosTipoParamFactuPlazo.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoParamFactuPlazo = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuPlazo.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTipoParamFactuPlazo.gridx = 0;
	        this.gridBagConstraintsTipoParamFactuPlazo.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoParamFactuPlazo.add(this.jPanelAccionesFormularioTipoParamFactuPlazo, this.gridBagConstraintsTipoParamFactuPlazo);							
			
			
			
			this.gridBagConstraintsTipoParamFactuPlazo = new GridBagConstraints();
	        this.gridBagConstraintsTipoParamFactuPlazo.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTipoParamFactuPlazo.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoParamFactuPlazo.add(this.jPanelAccionesTipoParamFactuPlazo, this.gridBagConstraintsTipoParamFactuPlazo);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoParamFactuPlazo);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoParamFactuPlazo=   new JScrollPane(this.jPanelCamposTipoParamFactuPlazo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoParamFactuPlazo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoParamFactuPlazo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoParamFactuPlazo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoParamFactuPlazo = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuPlazo.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoParamFactuPlazo.gridx = 0;
			this.gridBagConstraintsTipoParamFactuPlazo.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoParamFactuPlazo.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoParamFactuPlazo.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoParamFactuPlazo, this.gridBagConstraintsTipoParamFactuPlazo);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoParamFactuPlazo = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuPlazo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoParamFactuPlazo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoParamFactuPlazo, this.gridBagConstraintsTipoParamFactuPlazo);			
			
			this.gridBagConstraintsTipoParamFactuPlazo = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuPlazo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoParamFactuPlazo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoParamFactuPlazo, this.gridBagConstraintsTipoParamFactuPlazo);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoParamFactuPlazo = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuPlazo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoParamFactuPlazo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoParamFactuPlazo, this.gridBagConstraintsTipoParamFactuPlazo);
			
			
		this.gridBagConstraintsTipoParamFactuPlazo = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuPlazo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoParamFactuPlazo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoParamFactuPlazo, this.gridBagConstraintsTipoParamFactuPlazo);
		
			
		this.gridBagConstraintsTipoParamFactuPlazo = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuPlazo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoParamFactuPlazo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoParamFactuPlazo, this.gridBagConstraintsTipoParamFactuPlazo);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoParamFactuPlazo;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoParamFactuPlazo;
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
