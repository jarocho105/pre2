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
import com.bydan.erp.seguridad.util.HistorialCambioClaveConstantesFunciones;

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
public class HistorialCambioClaveDetalleFormJInternalFrame extends HistorialCambioClaveBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleHistorialCambioClave;
	
	protected JMenuBar jmenuBarDetalleHistorialCambioClave;
	
	protected JMenu jmenuDetalleHistorialCambioClave;
	protected JMenu jmenuDetalleArchivoHistorialCambioClave;
	protected JMenu jmenuDetalleAccionesHistorialCambioClave;
	protected JMenu jmenuDetalleDatosHistorialCambioClave;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleHistorialCambioClave = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutHistorialCambioClave;	
	protected GridBagConstraints gridBagConstraintsHistorialCambioClave;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected HistorialCambioClaveBeanSwingJInternalFrameAdditional jInternalFrameDetalleHistorialCambioClave;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_usuario="";
	
	public HistorialCambioClaveSessionBean historialcambioclaveSessionBean;
	
	
	
	
	public UsuarioSessionBean usuarioSessionBean;	
	
	public HistorialCambioClaveLogic historialcambioclaveLogic;
	
	public JScrollPane jScrollPanelDatosHistorialCambioClave;
	public JScrollPane jScrollPanelDatosEdicionHistorialCambioClave;
	public JScrollPane jScrollPanelDatosGeneralHistorialCambioClave;
	
	protected JPanel jPanelCamposHistorialCambioClave;    
	protected JPanel jPanelCamposOcultosHistorialCambioClave;    	
	protected JPanel jPanelAccionesHistorialCambioClave;
	protected JPanel jPanelAccionesFormularioHistorialCambioClave;
    
	
	
	protected Integer iXPanelCamposHistorialCambioClave=0;
	protected Integer iYPanelCamposHistorialCambioClave=0;
	
	protected Integer iXPanelCamposOcultosHistorialCambioClave=0;
	protected Integer iYPanelCamposOcultosHistorialCambioClave=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoHistorialCambioClave;
	public JButton jButtonModificarHistorialCambioClave;
	public JButton jButtonActualizarHistorialCambioClave;
    public JButton jButtonEliminarHistorialCambioClave;
	public JButton jButtonCancelarHistorialCambioClave;
    public JButton jButtonGuardarCambiosHistorialCambioClave;
	public JButton jButtonGuardarCambiosTablaHistorialCambioClave;
	protected JButton jButtonCerrarHistorialCambioClave;
	
	
	protected JButton jButtonProcesarInformacionHistorialCambioClave;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoHistorialCambioClave;
	protected JCheckBox jCheckBoxPostAccionSinCerrarHistorialCambioClave;
	protected JCheckBox jCheckBoxPostAccionSinMensajeHistorialCambioClave;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarHistorialCambioClave;
	protected JButton jButtonModificarToolBarHistorialCambioClave;
	protected JButton jButtonActualizarToolBarHistorialCambioClave;
    protected JButton jButtonEliminarToolBarHistorialCambioClave;
	protected JButton jButtonCancelarToolBarHistorialCambioClave;
    protected JButton jButtonGuardarCambiosToolBarHistorialCambioClave;
	protected JButton jButtonGuardarCambiosTablaToolBarHistorialCambioClave;
	protected JButton jButtonMostrarOcultarTablaToolBarHistorialCambioClave;
	protected JButton jButtonCerrarToolBarHistorialCambioClave;
	
	protected JButton jButtonProcesarInformacionToolBarHistorialCambioClave;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoHistorialCambioClave;
	protected JMenuItem jMenuItemModificarHistorialCambioClave;
	protected JMenuItem jMenuItemActualizarHistorialCambioClave;
    protected JMenuItem jMenuItemEliminarHistorialCambioClave;
	protected JMenuItem jMenuItemCancelarHistorialCambioClave;
    protected JMenuItem jMenuItemGuardarCambiosHistorialCambioClave;
	protected JMenuItem jMenuItemGuardarCambiosTablaHistorialCambioClave;
	protected JMenuItem jMenuItemCerrarHistorialCambioClave;
	protected JMenuItem jMenuItemDetalleCerrarHistorialCambioClave;
	protected JMenuItem jMenuItemDetalleMostarOcultarHistorialCambioClave;
	
	protected JMenuItem jMenuItemProcesarInformacionHistorialCambioClave;
	protected JMenuItem jMenuItemNuevoGuardarCambiosHistorialCambioClave;
	protected JMenuItem jMenuItemMostrarOcultarHistorialCambioClave;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesHistorialCambioClave;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesHistorialCambioClave;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesHistorialCambioClave;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioHistorialCambioClave;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidHistorialCambioClave;
	public JLabel jLabelIdHistorialCambioClave;
	public JLabel jLabelidHistorialCambioClave;
	public JButton jButtonidHistorialCambioClaveBusqueda= new JButtonMe();

	public JPanel jPanelnombreHistorialCambioClave;
	public JLabel jLabelnombreHistorialCambioClave;
	public JTextField jTextFieldnombreHistorialCambioClave;
	public JButton jButtonnombreHistorialCambioClaveBusqueda= new JButtonMe();

	public JPanel jPanelfecha_horaHistorialCambioClave;
	public JLabel jLabelfecha_horaHistorialCambioClave;
	//public JFormattedTextField jDateChooserfecha_horaHistorialCambioClave;

	public JPanelDateTimeMe jDateChooserfecha_horaHistorialCambioClave;
	public JButton jButtonfecha_horaHistorialCambioClaveBusqueda= new JButtonMe();

	public JPanel jPanelobservacionHistorialCambioClave;
	public JLabel jLabelobservacionHistorialCambioClave;
	public JTextArea jTextAreaobservacionHistorialCambioClave;
	public JScrollPane jscrollPaneobservacionHistorialCambioClave;
	public JButton jButtonobservacionHistorialCambioClaveBusqueda= new JButtonMe();

	
	public JPanel jPanelid_usuarioHistorialCambioClave;
	public JLabel jLabelid_usuarioHistorialCambioClave;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_usuarioHistorialCambioClave;
	public JButton jButtonid_usuarioHistorialCambioClave= new JButtonMe();
	public JButton jButtonid_usuarioHistorialCambioClaveUpdate= new JButtonMe();
	public JButton jButtonid_usuarioHistorialCambioClaveBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesHistorialCambioClave;
	
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
	public int iHeightFormulario=462;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public HistorialCambioClaveDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposHistorialCambioClave=new JPanel();
				this.jPanelAccionesFormularioHistorialCambioClave=new JPanel();
				this.jmenuBarDetalleHistorialCambioClave=new JMenuBar();
				this.jTtoolBarDetalleHistorialCambioClave=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public HistorialCambioClaveDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("HistorialCambioClave No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public HistorialCambioClaveDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("HistorialCambioClave No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public HistorialCambioClaveDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("HistorialCambioClave No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public HistorialCambioClaveDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("HistorialCambioClave No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public HistorialCambioClaveDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("HistorialCambioClave No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarHistorialCambioClave() {
		return this.jButtonActualizarToolBarHistorialCambioClave;
	}
	
	public JButton getjButtonEliminarToolBarHistorialCambioClave() {
		return this.jButtonEliminarToolBarHistorialCambioClave;
	}
	
	public JButton getjButtonCancelarToolBarHistorialCambioClave() {
		return this.jButtonCancelarToolBarHistorialCambioClave;
	}		
	
	public JButton getjButtonProcesarInformacionHistorialCambioClave() {
		return this.jButtonProcesarInformacionHistorialCambioClave;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionHistorialCambioClave)	{
		this.jButtonProcesarInformacionHistorialCambioClave = jButtonProcesarInformacionHistorialCambioClave;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesHistorialCambioClave() {
		return this.jComboBoxTiposAccionesHistorialCambioClave;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesHistorialCambioClave(
			JComboBox jComboBoxTiposRelacionesHistorialCambioClave) {
		this.jComboBoxTiposRelacionesHistorialCambioClave = jComboBoxTiposRelacionesHistorialCambioClave;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesHistorialCambioClave(
			JComboBox jComboBoxTiposAccionesHistorialCambioClave) {
		this.jComboBoxTiposAccionesHistorialCambioClave = jComboBoxTiposAccionesHistorialCambioClave;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioHistorialCambioClave() {
		return this.jComboBoxTiposAccionesFormularioHistorialCambioClave;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioHistorialCambioClave(
			JComboBox jComboBoxTiposAccionesFormularioHistorialCambioClave) {
		this.jComboBoxTiposAccionesFormularioHistorialCambioClave = jComboBoxTiposAccionesFormularioHistorialCambioClave;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.historialcambioclaveSessionBean=new HistorialCambioClaveSessionBean();
		
		this.historialcambioclaveSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.historialcambioclaveSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.historialcambioclaveSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		HistorialCambioClaveJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		HistorialCambioClaveJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		HistorialCambioClaveJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Historial Cambio Clave MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.historialcambioclaveSessionBean.getEsGuardarRelacionado()) {
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
	
		HistorialCambioClaveJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleHistorialCambioClave= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarHistorialCambioClave=new JButtonMe();
				this.jButtonModificarToolBarHistorialCambioClave=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarHistorialCambioClave=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarHistorialCambioClave,this.jTtoolBarDetalleHistorialCambioClave,
							"actualizar","actualizar","Actualizar"+" "+HistorialCambioClaveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarHistorialCambioClave=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarHistorialCambioClave,this.jTtoolBarDetalleHistorialCambioClave,
							"eliminar","eliminar","Eliminar"+" "+HistorialCambioClaveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarHistorialCambioClave=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarHistorialCambioClave,this.jTtoolBarDetalleHistorialCambioClave,
							"cancelar","cancelar","Cancelar"+" "+HistorialCambioClaveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarHistorialCambioClave=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarHistorialCambioClave,this.jTtoolBarDetalleHistorialCambioClave,
							"guardarcambios","guardarcambios","Guardar"+" "+HistorialCambioClaveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarHistorialCambioClave,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarHistorialCambioClave,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarHistorialCambioClave,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleHistorialCambioClave=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleHistorialCambioClave=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoHistorialCambioClave=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesHistorialCambioClave=new JMenuMe("Acciones");
		this.jmenuDetalleDatosHistorialCambioClave=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoHistorialCambioClave= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoHistorialCambioClave.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoHistorialCambioClave,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoHistorialCambioClave, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarHistorialCambioClave= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarHistorialCambioClave.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarHistorialCambioClave,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarHistorialCambioClave, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarHistorialCambioClave= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarHistorialCambioClave.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarHistorialCambioClave,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarHistorialCambioClave, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarHistorialCambioClave= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarHistorialCambioClave.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarHistorialCambioClave,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarHistorialCambioClave, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarHistorialCambioClave= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarHistorialCambioClave.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarHistorialCambioClave,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarHistorialCambioClave, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosHistorialCambioClave= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosHistorialCambioClave.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosHistorialCambioClave,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosHistorialCambioClave, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarHistorialCambioClave= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarHistorialCambioClave.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarHistorialCambioClave,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarHistorialCambioClave, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarHistorialCambioClave= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarHistorialCambioClave.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarHistorialCambioClave,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarHistorialCambioClave, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarHistorialCambioClave= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarHistorialCambioClave.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarHistorialCambioClave,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarHistorialCambioClave, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarHistorialCambioClave= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarHistorialCambioClave.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarHistorialCambioClave,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarHistorialCambioClave, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoHistorialCambioClave.add(this.jMenuItemDetalleCerrarHistorialCambioClave);
		
		this.jmenuDetalleAccionesHistorialCambioClave.add(this.jMenuItemActualizarHistorialCambioClave);
		this.jmenuDetalleAccionesHistorialCambioClave.add(this.jMenuItemEliminarHistorialCambioClave);
		this.jmenuDetalleAccionesHistorialCambioClave.add(this.jMenuItemCancelarHistorialCambioClave);		
		
		//this.jmenuDetalleDatosHistorialCambioClave.add(this.jMenuItemDetalleAbrirOrderByHistorialCambioClave);				
		this.jmenuDetalleDatosHistorialCambioClave.add(this.jMenuItemDetalleMostarOcultarHistorialCambioClave);				
				
		//this.jmenuDetalleAccionesHistorialCambioClave.add(this.jMenuItemGuardarCambiosHistorialCambioClave);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoHistorialCambioClave, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesHistorialCambioClave, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosHistorialCambioClave, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleHistorialCambioClave.add(this.jmenuDetalleArchivoHistorialCambioClave);		
		this.jmenuBarDetalleHistorialCambioClave.add(this.jmenuDetalleAccionesHistorialCambioClave);		
		this.jmenuBarDetalleHistorialCambioClave.add(this.jmenuDetalleDatosHistorialCambioClave);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleHistorialCambioClave);				
	}
	
	
	public void inicializarElementosCamposHistorialCambioClave() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdHistorialCambioClave = new JLabelMe();
		jLabelIdHistorialCambioClave.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdHistorialCambioClave.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdHistorialCambioClave.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdHistorialCambioClave.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdHistorialCambioClave,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidHistorialCambioClave = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidHistorialCambioClave.setToolTipText(HistorialCambioClaveConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutHistorialCambioClave= new GridBagLayout();

		this.jPanelidHistorialCambioClave.setLayout(this.gridaBagLayoutHistorialCambioClave);

		jLabelidHistorialCambioClave = new JLabel();
		jLabelidHistorialCambioClave.setText("Id");

		jLabelidHistorialCambioClave.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidHistorialCambioClave.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidHistorialCambioClave.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreHistorialCambioClave = new JLabelMe();
		this.jLabelnombreHistorialCambioClave.setText(""+HistorialCambioClaveConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreHistorialCambioClave.setToolTipText("Nombre");
		this.jLabelnombreHistorialCambioClave.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreHistorialCambioClave.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreHistorialCambioClave.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreHistorialCambioClave,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreHistorialCambioClave=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreHistorialCambioClave.setToolTipText(HistorialCambioClaveConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutHistorialCambioClave = new GridBagLayout();
		this.jPanelnombreHistorialCambioClave.setLayout(this.gridaBagLayoutHistorialCambioClave);


		jTextFieldnombreHistorialCambioClave= new JTextFieldMe();

		jTextFieldnombreHistorialCambioClave.setEnabled(false);
		jTextFieldnombreHistorialCambioClave.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreHistorialCambioClave.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreHistorialCambioClave.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombreHistorialCambioClave,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombreHistorialCambioClaveBusqueda= new JButtonMe();
		this.jButtonnombreHistorialCambioClaveBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreHistorialCambioClaveBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreHistorialCambioClaveBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreHistorialCambioClaveBusqueda.setText("U");
		this.jButtonnombreHistorialCambioClaveBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreHistorialCambioClaveBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreHistorialCambioClaveBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombreHistorialCambioClave.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombreHistorialCambioClave.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreHistorialCambioClaveBusqueda"));

		if(this.historialcambioclaveSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreHistorialCambioClaveBusqueda.setVisible(false);		}


					
		this.jLabelfecha_horaHistorialCambioClave = new JLabelMe();
		this.jLabelfecha_horaHistorialCambioClave.setText(""+HistorialCambioClaveConstantesFunciones.LABEL_FECHAHORA+" : *");
		this.jLabelfecha_horaHistorialCambioClave.setToolTipText("Fecha Hora");
		this.jLabelfecha_horaHistorialCambioClave.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_horaHistorialCambioClave.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_horaHistorialCambioClave.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_horaHistorialCambioClave,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_horaHistorialCambioClave=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_horaHistorialCambioClave.setToolTipText(HistorialCambioClaveConstantesFunciones.LABEL_FECHAHORA);
		this.gridaBagLayoutHistorialCambioClave = new GridBagLayout();
		this.jPanelfecha_horaHistorialCambioClave.setLayout(this.gridaBagLayoutHistorialCambioClave);


		//jFormattedTextFieldfecha_horaHistorialCambioClave= new JFormattedTextFieldMe();

		jDateChooserfecha_horaHistorialCambioClave= new JPanelDateTimeMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		jDateChooserfecha_horaHistorialCambioClave.setEnabled(false);
		jDateChooserfecha_horaHistorialCambioClave.setMinimumSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL*2,85),Constantes.ISWING_ALTO_CONTROL+ Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		jDateChooserfecha_horaHistorialCambioClave.setMaximumSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL*2,85),Constantes.ISWING_ALTO_CONTROL+ Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		jDateChooserfecha_horaHistorialCambioClave.setPreferredSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL*2,85),Constantes.ISWING_ALTO_CONTROL+ Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		jDateChooserfecha_horaHistorialCambioClave.setDate(new Timestamp((new Date()).getTime()));
		jDateChooserfecha_horaHistorialCambioClave.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_horaHistorialCambioClave.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_horaHistorialCambioClaveBusqueda= new JButtonMe();
		this.jButtonfecha_horaHistorialCambioClaveBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_horaHistorialCambioClaveBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_horaHistorialCambioClaveBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_horaHistorialCambioClaveBusqueda.setText("U");
		this.jButtonfecha_horaHistorialCambioClaveBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_horaHistorialCambioClaveBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_horaHistorialCambioClaveBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_horaHistorialCambioClave.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_horaHistorialCambioClave.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_horaHistorialCambioClaveBusqueda"));

		if(this.historialcambioclaveSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_horaHistorialCambioClaveBusqueda.setVisible(false);		}


					
		this.jLabelobservacionHistorialCambioClave = new JLabelMe();
		this.jLabelobservacionHistorialCambioClave.setText(""+HistorialCambioClaveConstantesFunciones.LABEL_OBSERVACION+" : *");
		this.jLabelobservacionHistorialCambioClave.setToolTipText("Observacion");
		this.jLabelobservacionHistorialCambioClave.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelobservacionHistorialCambioClave.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelobservacionHistorialCambioClave.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelobservacionHistorialCambioClave,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelobservacionHistorialCambioClave=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelobservacionHistorialCambioClave.setToolTipText(HistorialCambioClaveConstantesFunciones.LABEL_OBSERVACION);
		this.gridaBagLayoutHistorialCambioClave = new GridBagLayout();
		this.jPanelobservacionHistorialCambioClave.setLayout(this.gridaBagLayoutHistorialCambioClave);


		jTextAreaobservacionHistorialCambioClave= new JTextAreaMe();
		jTextAreaobservacionHistorialCambioClave.setEnabled(false);
		jTextAreaobservacionHistorialCambioClave.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaobservacionHistorialCambioClave.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaobservacionHistorialCambioClave.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaobservacionHistorialCambioClave.setLineWrap(true);
		jTextAreaobservacionHistorialCambioClave.setWrapStyleWord(true);
		jTextAreaobservacionHistorialCambioClave.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaobservacionHistorialCambioClave.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreaobservacionHistorialCambioClave,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneobservacionHistorialCambioClave = new JScrollPane(jTextAreaobservacionHistorialCambioClave);
		jscrollPaneobservacionHistorialCambioClave.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneobservacionHistorialCambioClave.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneobservacionHistorialCambioClave.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonobservacionHistorialCambioClaveBusqueda= new JButtonMe();
		this.jButtonobservacionHistorialCambioClaveBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonobservacionHistorialCambioClaveBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonobservacionHistorialCambioClaveBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonobservacionHistorialCambioClaveBusqueda.setText("U");
		this.jButtonobservacionHistorialCambioClaveBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonobservacionHistorialCambioClaveBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonobservacionHistorialCambioClaveBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaobservacionHistorialCambioClave.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaobservacionHistorialCambioClave.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"observacionHistorialCambioClaveBusqueda"));

		if(this.historialcambioclaveSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonobservacionHistorialCambioClaveBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysHistorialCambioClave() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_usuarioHistorialCambioClave = new JLabelMe();
		this.jLabelid_usuarioHistorialCambioClave.setText(""+HistorialCambioClaveConstantesFunciones.LABEL_IDUSUARIO+" : *");
		this.jLabelid_usuarioHistorialCambioClave.setToolTipText("Usuario");
		this.jLabelid_usuarioHistorialCambioClave.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioHistorialCambioClave.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioHistorialCambioClave.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_usuarioHistorialCambioClave,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_usuarioHistorialCambioClave=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_usuarioHistorialCambioClave.setToolTipText(HistorialCambioClaveConstantesFunciones.LABEL_IDUSUARIO);
		this.gridaBagLayoutHistorialCambioClave = new GridBagLayout();
		this.jPanelid_usuarioHistorialCambioClave.setLayout(this.gridaBagLayoutHistorialCambioClave);


		jComboBoxid_usuarioHistorialCambioClave= new JComboBoxMe();
		jComboBoxid_usuarioHistorialCambioClave.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioHistorialCambioClave.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioHistorialCambioClave.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_usuarioHistorialCambioClave,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_usuarioHistorialCambioClave.setEnabled(false);

		this.jButtonid_usuarioHistorialCambioClave= new JButtonMe();
		this.jButtonid_usuarioHistorialCambioClave.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioHistorialCambioClave.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioHistorialCambioClave.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioHistorialCambioClave.setText("Buscar");
		this.jButtonid_usuarioHistorialCambioClave.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_usuarioHistorialCambioClave.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioHistorialCambioClave,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_usuarioHistorialCambioClave.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioHistorialCambioClave.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioHistorialCambioClave"));

		this.jButtonid_usuarioHistorialCambioClaveBusqueda= new JButtonMe();
		this.jButtonid_usuarioHistorialCambioClaveBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioHistorialCambioClaveBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioHistorialCambioClaveBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioHistorialCambioClaveBusqueda.setText("U");
		this.jButtonid_usuarioHistorialCambioClaveBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_usuarioHistorialCambioClaveBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioHistorialCambioClaveBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_usuarioHistorialCambioClave.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioHistorialCambioClave.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioHistorialCambioClaveBusqueda"));

		if(this.historialcambioclaveSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_usuarioHistorialCambioClaveBusqueda.setVisible(false);		}

		this.jButtonid_usuarioHistorialCambioClaveUpdate= new JButtonMe();
		this.jButtonid_usuarioHistorialCambioClaveUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioHistorialCambioClaveUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioHistorialCambioClaveUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioHistorialCambioClaveUpdate.setText("U");
		this.jButtonid_usuarioHistorialCambioClaveUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_usuarioHistorialCambioClaveUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioHistorialCambioClaveUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_usuarioHistorialCambioClave.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioHistorialCambioClave.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioHistorialCambioClaveUpdate"));



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
		//this.jInternalFrameDetalleHistorialCambioClave = new HistorialCambioClaveBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Historial Cambio Clave DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutHistorialCambioClave= new GridBagLayout();
		

		
		String sToolTipHistorialCambioClave="";
		sToolTipHistorialCambioClave=HistorialCambioClaveConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipHistorialCambioClave+="(Seguridad.HistorialCambioClave)";
		}
		
		if(!this.historialcambioclaveSessionBean.getEsGuardarRelacionado()) {
			sToolTipHistorialCambioClave+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoHistorialCambioClave = new JButtonMe();
		this.jButtonModificarHistorialCambioClave = new JButtonMe();
        this.jButtonActualizarHistorialCambioClave = new JButtonMe();
        this.jButtonEliminarHistorialCambioClave = new JButtonMe();
        this.jButtonCancelarHistorialCambioClave = new JButtonMe();
        this.jButtonGuardarCambiosHistorialCambioClave = new JButtonMe();
		this.jButtonGuardarCambiosTablaHistorialCambioClave = new JButtonMe();
		this.jButtonCerrarHistorialCambioClave = new JButtonMe();
		
		this.jScrollPanelDatosHistorialCambioClave = new JScrollPane();   
        this.jScrollPanelDatosEdicionHistorialCambioClave = new JScrollPane();
		this.jScrollPanelDatosGeneralHistorialCambioClave = new JScrollPane();
				
		
		
		this.jPanelCamposHistorialCambioClave = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosHistorialCambioClave = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesHistorialCambioClave = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioHistorialCambioClave = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Historial Cambio Clave";
		
		if(!this.historialcambioclaveSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosHistorialCambioClave.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Historial Cambio Claves" + this.sPath));
		} else {
			this.jScrollPanelDatosHistorialCambioClave.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionHistorialCambioClave.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralHistorialCambioClave.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposHistorialCambioClave.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposHistorialCambioClave.setName("jPanelCamposHistorialCambioClave"); 

		this.jPanelCamposOcultosHistorialCambioClave.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosHistorialCambioClave.setName("jPanelCamposOcultosHistorialCambioClave"); 

        this.jPanelAccionesHistorialCambioClave.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesHistorialCambioClave.setToolTipText("Acciones");
        this.jPanelAccionesHistorialCambioClave.setName("Acciones"); 

		this.jPanelAccionesFormularioHistorialCambioClave.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioHistorialCambioClave.setToolTipText("Acciones");
        this.jPanelAccionesFormularioHistorialCambioClave.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionHistorialCambioClave, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralHistorialCambioClave, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosHistorialCambioClave, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposHistorialCambioClave, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosHistorialCambioClave, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioHistorialCambioClave, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoHistorialCambioClave.setText("Nuevo");
		this.jButtonModificarHistorialCambioClave.setText("Editar");
        this.jButtonActualizarHistorialCambioClave.setText("Actualizar");
        this.jButtonEliminarHistorialCambioClave.setText("Eliminar");
        this.jButtonCancelarHistorialCambioClave.setText("Cancelar");
        this.jButtonGuardarCambiosHistorialCambioClave.setText("Guardar");
		this.jButtonGuardarCambiosTablaHistorialCambioClave.setText("Guardar");
		this.jButtonCerrarHistorialCambioClave.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoHistorialCambioClave,"nuevo_button","Nuevo",this.historialcambioclaveSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarHistorialCambioClave,"modificar_button","Editar",this.historialcambioclaveSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarHistorialCambioClave,"actualizar_button","Actualizar",this.historialcambioclaveSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarHistorialCambioClave,"eliminar_button","Eliminar",this.historialcambioclaveSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarHistorialCambioClave,"cancelar_button","Cancelar",this.historialcambioclaveSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosHistorialCambioClave,"guardarcambios_button","Guardar",this.historialcambioclaveSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaHistorialCambioClave,"guardarcambiostabla_button","Guardar",this.historialcambioclaveSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarHistorialCambioClave,"cerrar_button","Salir",this.historialcambioclaveSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoHistorialCambioClave, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarHistorialCambioClave, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosHistorialCambioClave, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaHistorialCambioClave, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarHistorialCambioClave, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarHistorialCambioClave, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarHistorialCambioClave, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarHistorialCambioClave, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoHistorialCambioClave.setToolTipText("Nuevo"+" "+HistorialCambioClaveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarHistorialCambioClave.setToolTipText("Editar"+" "+HistorialCambioClaveConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarHistorialCambioClave.setToolTipText("Actualizar"+" "+HistorialCambioClaveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarHistorialCambioClave.setToolTipText("Eliminar)"+" "+HistorialCambioClaveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarHistorialCambioClave.setToolTipText("Cancelar"+" "+HistorialCambioClaveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosHistorialCambioClave.setToolTipText("Guardar"+" "+HistorialCambioClaveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaHistorialCambioClave.setToolTipText("Guardar"+" "+HistorialCambioClaveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarHistorialCambioClave.setToolTipText("Salir"+" "+HistorialCambioClaveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoHistorialCambioClave";
		inputMap = this.jButtonNuevoHistorialCambioClave.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoHistorialCambioClave.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoHistorialCambioClave"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarHistorialCambioClave";
		inputMap = this.jButtonActualizarHistorialCambioClave.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarHistorialCambioClave.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarHistorialCambioClave"));
		
		//ELIMINAR
		sMapKey = "EliminarHistorialCambioClave";
		inputMap = this.jButtonEliminarHistorialCambioClave.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarHistorialCambioClave.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarHistorialCambioClave"));
		
		//CANCELAR	
		sMapKey = "CancelarHistorialCambioClave";
		inputMap = this.jButtonCancelarHistorialCambioClave.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarHistorialCambioClave.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarHistorialCambioClave"));
		
		//CERRAR		
		sMapKey = "CerrarHistorialCambioClave";
		inputMap = this.jButtonCerrarHistorialCambioClave.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarHistorialCambioClave.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarHistorialCambioClave"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaHistorialCambioClave";
		inputMap = this.jButtonGuardarCambiosTablaHistorialCambioClave.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaHistorialCambioClave.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaHistorialCambioClave"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoHistorialCambioClave = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoHistorialCambioClave.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoHistorialCambioClave.setToolTipText("Nuevo HistorialCambioClave");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoHistorialCambioClave, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarHistorialCambioClave = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarHistorialCambioClave.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarHistorialCambioClave.setToolTipText("Sin Cerrar Ventana HistorialCambioClave");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarHistorialCambioClave, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeHistorialCambioClave = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeHistorialCambioClave.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeHistorialCambioClave.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeHistorialCambioClave, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesHistorialCambioClave = new JComboBoxMe();
		//this.jComboBoxTiposAccionesHistorialCambioClave.setText("Accion");
		this.jComboBoxTiposAccionesHistorialCambioClave.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioHistorialCambioClave = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioHistorialCambioClave.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioHistorialCambioClave.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesHistorialCambioClave = new JLabelMe();
		
		this.jLabelAccionesHistorialCambioClave.setText("Acciones");		
		this.jLabelAccionesHistorialCambioClave.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesHistorialCambioClave.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesHistorialCambioClave.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposHistorialCambioClave();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysHistorialCambioClave();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesHistorialCambioClave=new JTabbedPane();
		this.jTabbedPaneRelacionesHistorialCambioClave.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesHistorialCambioClave,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesHistorialCambioClave.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesHistorialCambioClave.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesHistorialCambioClave.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesHistorialCambioClave, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioHistorialCambioClave.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioHistorialCambioClave.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioHistorialCambioClave.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioHistorialCambioClave, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposHistorialCambioClave = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosHistorialCambioClave = new GridBagLayout();
		
		this.jPanelCamposHistorialCambioClave.setLayout(gridaBagLayoutCamposHistorialCambioClave);
		this.jPanelCamposOcultosHistorialCambioClave.setLayout(gridaBagLayoutCamposOcultosHistorialCambioClave);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
	this.gridBagConstraintsHistorialCambioClave.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialCambioClave.gridy = 0;
	this.gridBagConstraintsHistorialCambioClave.gridx = 0;
	this.gridBagConstraintsHistorialCambioClave.ipadx = 0;
	this.gridBagConstraintsHistorialCambioClave.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidHistorialCambioClave.add(jLabelIdHistorialCambioClave, this.gridBagConstraintsHistorialCambioClave);



	this.gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
	this.gridBagConstraintsHistorialCambioClave.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialCambioClave.gridy = 0;
	this.gridBagConstraintsHistorialCambioClave.gridx = 1;
	this.gridBagConstraintsHistorialCambioClave.ipadx = 0;
	this.gridBagConstraintsHistorialCambioClave.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidHistorialCambioClave.add(jLabelidHistorialCambioClave, this.gridBagConstraintsHistorialCambioClave);


	this.gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
	this.gridBagConstraintsHistorialCambioClave.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialCambioClave.gridy = 0;
	this.gridBagConstraintsHistorialCambioClave.gridx = 0;
	this.gridBagConstraintsHistorialCambioClave.ipadx = 0;
	this.gridBagConstraintsHistorialCambioClave.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_usuarioHistorialCambioClave.add(jLabelid_usuarioHistorialCambioClave, this.gridBagConstraintsHistorialCambioClave);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
		//this.gridBagConstraintsHistorialCambioClave.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialCambioClave.gridy = 0;
		this.gridBagConstraintsHistorialCambioClave.gridx = 2;
		this.gridBagConstraintsHistorialCambioClave.ipadx = 0;
		this.gridBagConstraintsHistorialCambioClave.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioHistorialCambioClave.add(jButtonid_usuarioHistorialCambioClaveBusqueda, this.gridBagConstraintsHistorialCambioClave);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
		//this.gridBagConstraintsHistorialCambioClave.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialCambioClave.gridy = 0;
		this.gridBagConstraintsHistorialCambioClave.gridx = 3;
		this.gridBagConstraintsHistorialCambioClave.ipadx = 0;
		this.gridBagConstraintsHistorialCambioClave.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioHistorialCambioClave.add(jButtonid_usuarioHistorialCambioClaveUpdate, this.gridBagConstraintsHistorialCambioClave);
	}

	this.gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
	this.gridBagConstraintsHistorialCambioClave.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialCambioClave.gridy = 0;
	this.gridBagConstraintsHistorialCambioClave.gridx = 1;
	this.gridBagConstraintsHistorialCambioClave.ipadx = 0;
	this.gridBagConstraintsHistorialCambioClave.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_usuarioHistorialCambioClave.add(jComboBoxid_usuarioHistorialCambioClave, this.gridBagConstraintsHistorialCambioClave);


	this.gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
	this.gridBagConstraintsHistorialCambioClave.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialCambioClave.gridy = 0;
	this.gridBagConstraintsHistorialCambioClave.gridx = 0;
	this.gridBagConstraintsHistorialCambioClave.ipadx = 0;
	this.gridBagConstraintsHistorialCambioClave.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreHistorialCambioClave.add(jLabelnombreHistorialCambioClave, this.gridBagConstraintsHistorialCambioClave);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
		//this.gridBagConstraintsHistorialCambioClave.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialCambioClave.gridy = 0;
		this.gridBagConstraintsHistorialCambioClave.gridx = 2;
		this.gridBagConstraintsHistorialCambioClave.ipadx = 0;
		this.gridBagConstraintsHistorialCambioClave.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreHistorialCambioClave.add(jButtonnombreHistorialCambioClaveBusqueda, this.gridBagConstraintsHistorialCambioClave);
	}

	this.gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
	this.gridBagConstraintsHistorialCambioClave.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialCambioClave.gridy = 0;
	this.gridBagConstraintsHistorialCambioClave.gridx = 1;
	this.gridBagConstraintsHistorialCambioClave.ipadx = 0;
	this.gridBagConstraintsHistorialCambioClave.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreHistorialCambioClave.add(jTextFieldnombreHistorialCambioClave, this.gridBagConstraintsHistorialCambioClave);


	this.gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
	this.gridBagConstraintsHistorialCambioClave.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialCambioClave.gridy = 0;
	this.gridBagConstraintsHistorialCambioClave.gridx = 0;
	this.gridBagConstraintsHistorialCambioClave.ipadx = 0;
	this.gridBagConstraintsHistorialCambioClave.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_horaHistorialCambioClave.add(jLabelfecha_horaHistorialCambioClave, this.gridBagConstraintsHistorialCambioClave);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
		//this.gridBagConstraintsHistorialCambioClave.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialCambioClave.gridy = 0;
		this.gridBagConstraintsHistorialCambioClave.gridx = 2;
		this.gridBagConstraintsHistorialCambioClave.ipadx = 0;
		this.gridBagConstraintsHistorialCambioClave.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_horaHistorialCambioClave.add(jButtonfecha_horaHistorialCambioClaveBusqueda, this.gridBagConstraintsHistorialCambioClave);
	}

	this.gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
	this.gridBagConstraintsHistorialCambioClave.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialCambioClave.gridy = 0;
	this.gridBagConstraintsHistorialCambioClave.gridx = 1;
	this.gridBagConstraintsHistorialCambioClave.ipadx = 0;
	this.gridBagConstraintsHistorialCambioClave.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_horaHistorialCambioClave.add(jDateChooserfecha_horaHistorialCambioClave, this.gridBagConstraintsHistorialCambioClave);


	this.gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
	this.gridBagConstraintsHistorialCambioClave.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialCambioClave.gridy = 0;
	this.gridBagConstraintsHistorialCambioClave.gridx = 0;
	this.gridBagConstraintsHistorialCambioClave.ipadx = 0;
	this.gridBagConstraintsHistorialCambioClave.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelobservacionHistorialCambioClave.add(jLabelobservacionHistorialCambioClave, this.gridBagConstraintsHistorialCambioClave);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
		//this.gridBagConstraintsHistorialCambioClave.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsHistorialCambioClave.gridy = 0;
		this.gridBagConstraintsHistorialCambioClave.gridx = 2;
		this.gridBagConstraintsHistorialCambioClave.ipadx = 0;
		this.gridBagConstraintsHistorialCambioClave.insets = new Insets(0, 0, 0, 0);
		this.jPanelobservacionHistorialCambioClave.add(jButtonobservacionHistorialCambioClaveBusqueda, this.gridBagConstraintsHistorialCambioClave);
	}

	this.gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
	this.gridBagConstraintsHistorialCambioClave.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsHistorialCambioClave.gridy = 0;
	this.gridBagConstraintsHistorialCambioClave.gridx = 1;
	this.gridBagConstraintsHistorialCambioClave.ipadx = 0;
	this.gridBagConstraintsHistorialCambioClave.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelobservacionHistorialCambioClave.add(jscrollPaneobservacionHistorialCambioClave, this.gridBagConstraintsHistorialCambioClave);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
	this.gridBagConstraintsHistorialCambioClave.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsHistorialCambioClave.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsHistorialCambioClave.gridy = iYPanelCamposHistorialCambioClave;
	this.gridBagConstraintsHistorialCambioClave.gridx = iXPanelCamposHistorialCambioClave++;
	this.gridBagConstraintsHistorialCambioClave.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsHistorialCambioClave.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposHistorialCambioClave.add(this.jPanelidHistorialCambioClave, this.gridBagConstraintsHistorialCambioClave);



	if(iXPanelCamposHistorialCambioClave % 1==0) {
		iXPanelCamposHistorialCambioClave=0;
		iYPanelCamposHistorialCambioClave++;
	}
	this.gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
	this.gridBagConstraintsHistorialCambioClave.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsHistorialCambioClave.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsHistorialCambioClave.gridy = iYPanelCamposHistorialCambioClave;
	this.gridBagConstraintsHistorialCambioClave.gridx = iXPanelCamposHistorialCambioClave++;
	this.gridBagConstraintsHistorialCambioClave.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsHistorialCambioClave.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposHistorialCambioClave.add(this.jPanelnombreHistorialCambioClave, this.gridBagConstraintsHistorialCambioClave);



	if(iXPanelCamposHistorialCambioClave % 1==0) {
		iXPanelCamposHistorialCambioClave=0;
		iYPanelCamposHistorialCambioClave++;
	}
	this.gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
	this.gridBagConstraintsHistorialCambioClave.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsHistorialCambioClave.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsHistorialCambioClave.gridy = iYPanelCamposHistorialCambioClave;
	this.gridBagConstraintsHistorialCambioClave.gridx = iXPanelCamposHistorialCambioClave++;
	this.gridBagConstraintsHistorialCambioClave.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsHistorialCambioClave.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposHistorialCambioClave.add(this.jPanelfecha_horaHistorialCambioClave, this.gridBagConstraintsHistorialCambioClave);



	if(iXPanelCamposHistorialCambioClave % 1==0) {
		iXPanelCamposHistorialCambioClave=0;
		iYPanelCamposHistorialCambioClave++;
	}
	this.gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
	this.gridBagConstraintsHistorialCambioClave.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsHistorialCambioClave.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsHistorialCambioClave.gridy = iYPanelCamposHistorialCambioClave;
	this.gridBagConstraintsHistorialCambioClave.gridx = iXPanelCamposHistorialCambioClave++;
	this.gridBagConstraintsHistorialCambioClave.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsHistorialCambioClave.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposHistorialCambioClave.add(this.jPanelobservacionHistorialCambioClave, this.gridBagConstraintsHistorialCambioClave);



	if(iXPanelCamposHistorialCambioClave % 1==0) {
		iXPanelCamposHistorialCambioClave=0;
		iYPanelCamposHistorialCambioClave++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
	this.gridBagConstraintsHistorialCambioClave.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsHistorialCambioClave.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsHistorialCambioClave.gridy = iYPanelCamposOcultosHistorialCambioClave;
	this.gridBagConstraintsHistorialCambioClave.gridx = iXPanelCamposOcultosHistorialCambioClave++;
	this.gridBagConstraintsHistorialCambioClave.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsHistorialCambioClave.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosHistorialCambioClave.add(this.jPanelid_usuarioHistorialCambioClave, this.gridBagConstraintsHistorialCambioClave);



	if(iXPanelCamposOcultosHistorialCambioClave % 1==0) {
		iXPanelCamposOcultosHistorialCambioClave=0;
		iYPanelCamposOcultosHistorialCambioClave++;
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
			
		GridBagLayout gridaBagLayoutAccionesHistorialCambioClave= new GridBagLayout();
		this.jPanelAccionesHistorialCambioClave.setLayout(gridaBagLayoutAccionesHistorialCambioClave);
		
		GridBagLayout gridaBagLayoutAccionesFormularioHistorialCambioClave= new GridBagLayout();
		this.jPanelAccionesFormularioHistorialCambioClave.setLayout(gridaBagLayoutAccionesFormularioHistorialCambioClave);
		
		this.gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
		this.gridBagConstraintsHistorialCambioClave.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsHistorialCambioClave.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioHistorialCambioClave.add(this.jComboBoxTiposAccionesFormularioHistorialCambioClave, this.gridBagConstraintsHistorialCambioClave);

		this.gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
		this.gridBagConstraintsHistorialCambioClave.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsHistorialCambioClave.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioHistorialCambioClave.add(this.jCheckBoxPostAccionNuevoHistorialCambioClave, this.gridBagConstraintsHistorialCambioClave);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.historialcambioclaveSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
			this.gridBagConstraintsHistorialCambioClave.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsHistorialCambioClave.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioHistorialCambioClave.add(this.jCheckBoxPostAccionSinCerrarHistorialCambioClave, this.gridBagConstraintsHistorialCambioClave);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.historialcambioclaveSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.historialcambioclaveSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
			this.gridBagConstraintsHistorialCambioClave.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsHistorialCambioClave.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioHistorialCambioClave.add(this.jCheckBoxPostAccionSinMensajeHistorialCambioClave, this.gridBagConstraintsHistorialCambioClave);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
		this.gridBagConstraintsHistorialCambioClave.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHistorialCambioClave.gridy = 0;
		this.gridBagConstraintsHistorialCambioClave.gridx = iPosXAccion++;
			
		this.jPanelAccionesHistorialCambioClave.add(this.jButtonModificarHistorialCambioClave, this.gridBagConstraintsHistorialCambioClave);							

		this.gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
		this.gridBagConstraintsHistorialCambioClave.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsHistorialCambioClave.gridy = 0;
		this.gridBagConstraintsHistorialCambioClave.gridx =iPosXAccion++;
			
		this.jPanelAccionesHistorialCambioClave.add(this.jButtonEliminarHistorialCambioClave, this.gridBagConstraintsHistorialCambioClave);
		
			
		this.gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
		this.gridBagConstraintsHistorialCambioClave.gridy = 0;		
		this.gridBagConstraintsHistorialCambioClave.gridx = iPosXAccion++;
		
		this.jPanelAccionesHistorialCambioClave.add(this.jButtonActualizarHistorialCambioClave, this.gridBagConstraintsHistorialCambioClave);


		this.gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
		this.gridBagConstraintsHistorialCambioClave.gridy = 0;		
		this.gridBagConstraintsHistorialCambioClave.gridx = iPosXAccion++;
		
		this.jPanelAccionesHistorialCambioClave.add(this.jButtonGuardarCambiosHistorialCambioClave, this.gridBagConstraintsHistorialCambioClave);	
		
		this.gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
		this.gridBagConstraintsHistorialCambioClave.gridy = 0;		
		this.gridBagConstraintsHistorialCambioClave.gridx =iPosXAccion++;
		
		this.jPanelAccionesHistorialCambioClave.add(this.jButtonCancelarHistorialCambioClave, this.gridBagConstraintsHistorialCambioClave);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutHistorialCambioClave = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutHistorialCambioClave);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.historialcambioclaveSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsHistorialCambioClave = new GridBagConstraints();						
			this.gridBagConstraintsHistorialCambioClave.gridy = iGridyPrincipal++;
			this.gridBagConstraintsHistorialCambioClave.gridx = 0;		
			//this.gridBagConstraintsHistorialCambioClave.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsHistorialCambioClave.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsHistorialCambioClave.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
		this.gridBagConstraintsHistorialCambioClave.gridy =iGridyPrincipal++;
		this.gridBagConstraintsHistorialCambioClave.gridx =0;
		this.gridBagConstraintsHistorialCambioClave.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsHistorialCambioClave.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosHistorialCambioClave, this.gridBagConstraintsHistorialCambioClave);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(HistorialCambioClaveJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleHistorialCambioClave = new HistorialCambioClaveBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Historial Cambio Clave DATOS");
			
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
			
	        //this.setTitle("[FOR] - Historial Cambio Clave DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Historial Cambio Clave Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			HistorialCambioClaveModel historialcambioclaveModel=new HistorialCambioClaveModel(this);
			
			//SI USARA CLASE INTERNA
			//HistorialCambioClaveModel.HistorialCambioClaveFocusTraversalPolicy historialcambioclaveFocusTraversalPolicy = historialcambioclaveModel.new HistorialCambioClaveFocusTraversalPolicy(this);
			
			//historialcambioclaveFocusTraversalPolicy.sethistorialcambioclaveJInternalFrame(this);
			
			this.setFocusTraversalPolicy(historialcambioclaveModel);
			
			
			this.jContentPaneDetalleHistorialCambioClave = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleHistorialCambioClave = new GridBagLayout();	
			this.jContentPaneDetalleHistorialCambioClave.setLayout(gridaBagLayoutDetalleHistorialCambioClave);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosHistorialCambioClave = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
				this.gridBagConstraintsHistorialCambioClave.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsHistorialCambioClave.gridx = 0;
					
				
				this.jContentPaneDetalleHistorialCambioClave.add(jTtoolBarDetalleHistorialCambioClave, gridBagConstraintsHistorialCambioClave);								
				
}
			
			this.jScrollPanelDatosEdicionHistorialCambioClave=   new JScrollPane(jContentPaneDetalleHistorialCambioClave,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionHistorialCambioClave.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionHistorialCambioClave.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionHistorialCambioClave.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralHistorialCambioClave=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralHistorialCambioClave.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralHistorialCambioClave.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralHistorialCambioClave.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
			
			
	        this.gridBagConstraintsHistorialCambioClave.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsHistorialCambioClave.gridx = 0;
	        
			this.jContentPaneDetalleHistorialCambioClave.add(jPanelCamposHistorialCambioClave, gridBagConstraintsHistorialCambioClave);
			
			
			
			
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
						&& historialcambioclaveSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.historialcambioclaveSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsHistorialCambioClave= new GridBagConstraints();
						this.gridBagConstraintsHistorialCambioClave.gridy = iGridyRelaciones++;
						this.gridBagConstraintsHistorialCambioClave.gridx = 0;
						this.jContentPaneDetalleHistorialCambioClave.add(this.jTabbedPaneRelacionesHistorialCambioClave, this.gridBagConstraintsHistorialCambioClave);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesHistorialCambioClave.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosHistorialCambioClave.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
					this.gridBagConstraintsHistorialCambioClave.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsHistorialCambioClave.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsHistorialCambioClave.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsHistorialCambioClave.gridx = 0;
					
				
					this.jContentPaneDetalleHistorialCambioClave.add(jPanelCamposOcultosHistorialCambioClave, gridBagConstraintsHistorialCambioClave);
				
					this.jPanelCamposOcultosHistorialCambioClave.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
			this.gridBagConstraintsHistorialCambioClave.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsHistorialCambioClave.gridx = 0;
	        this.gridBagConstraintsHistorialCambioClave.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleHistorialCambioClave.add(this.jPanelAccionesFormularioHistorialCambioClave, this.gridBagConstraintsHistorialCambioClave);							
			
			
			
			this.gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
	        this.gridBagConstraintsHistorialCambioClave.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsHistorialCambioClave.gridx = 0;
	        
			
			this.jContentPaneDetalleHistorialCambioClave.add(this.jPanelAccionesHistorialCambioClave, this.gridBagConstraintsHistorialCambioClave);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionHistorialCambioClave);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionHistorialCambioClave=   new JScrollPane(this.jPanelCamposHistorialCambioClave,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionHistorialCambioClave.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionHistorialCambioClave.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionHistorialCambioClave.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
			this.gridBagConstraintsHistorialCambioClave.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsHistorialCambioClave.gridx = 0;
			this.gridBagConstraintsHistorialCambioClave.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsHistorialCambioClave.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsHistorialCambioClave.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionHistorialCambioClave, this.gridBagConstraintsHistorialCambioClave);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
			this.gridBagConstraintsHistorialCambioClave.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsHistorialCambioClave.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioHistorialCambioClave, this.gridBagConstraintsHistorialCambioClave);			
			
			this.gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
			this.gridBagConstraintsHistorialCambioClave.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsHistorialCambioClave.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesHistorialCambioClave, this.gridBagConstraintsHistorialCambioClave);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
		this.gridBagConstraintsHistorialCambioClave.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsHistorialCambioClave.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposHistorialCambioClave, this.gridBagConstraintsHistorialCambioClave);
			
			
		this.gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
		this.gridBagConstraintsHistorialCambioClave.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsHistorialCambioClave.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosHistorialCambioClave, this.gridBagConstraintsHistorialCambioClave);
		
			
		this.gridBagConstraintsHistorialCambioClave = new GridBagConstraints();
		this.gridBagConstraintsHistorialCambioClave.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsHistorialCambioClave.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesHistorialCambioClave, this.gridBagConstraintsHistorialCambioClave);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralHistorialCambioClave;//jContentPane;
		
		return jScrollPanelDatosEdicionHistorialCambioClave;
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
